package com.cartona.plugins.googleplayavailability;

import android.app.Activity;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class GooglePlayAvailability {

    private final GoogleApiAvailability googleApiAvailability;
    private Activity activity;

    public GooglePlayAvailability(AppCompatActivity activity) {
        this.activity = activity;
        this.googleApiAvailability = GoogleApiAvailability.getInstance();
    }

    public boolean isGooglePlayServicesAvailable() {
        int status = googleApiAvailability.isGooglePlayServicesAvailable(activity);
        if (status != ConnectionResult.SUCCESS) {
            return false;
        }
        return true;
    }

    public void makeGooglePlayServicesAvailable(final GetMakeGooglePlayAvailableResultCallback resultCallback) {
        activity.runOnUiThread(
                new Runnable() {
                    @Override
                    public void run() {
                        googleApiAvailability
                                .makeGooglePlayServicesAvailable(activity)
                                .addOnSuccessListener(
                                        avoid -> {
                                            resultCallback.success(true);
                                        }
                                )
                                .addOnFailureListener(
                                        exception -> {
                                            /* Google play services settings opens inside the app, so if the user goes back to the app without
                                            enabling google play services we should return false not raise exception */
                                            Log.w(GooglePlayAvailabilityPlugin.TAG, "Make google play available failed.", exception);
                                            resultCallback.failed(false, exception.getLocalizedMessage());
                                        }
                                );
                    }
                }
        );
    }
}
