package com.cartona.plugins.googleplayservices;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

@CapacitorPlugin(name = "GooglePlayServices")
public class GooglePlayServicesPlugin extends Plugin {

    Activity activity;
    Context context;
    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();

    @Override
    public void load() {
        activity = getActivity();
        context = getContext();
    }

    @PluginMethod
    public void checkGooglePlayServicesAvailability(PluginCall call) {
        int status = googleApiAvailability.isGooglePlayServicesAvailable(activity);
        JSObject data = new JSObject();
        if (status != ConnectionResult.SUCCESS) {
            data.put("enabled", false);
            call.resolve(data);
        }
        data.put("enabled", true);
        call.resolve(data);
    }

    @PluginMethod
    public void requestEnableGooglePlayServicesWithMessage(PluginCall call) {
        String message = call.getString("message");
        String btnLabel = call.getString("btnLabel");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton(
            btnLabel,
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                    activity.runOnUiThread(
                        new Runnable() {
                            @Override
                            public void run() {
                                JSObject data = new JSObject();
                                googleApiAvailability
                                    .makeGooglePlayServicesAvailable(activity)
                                    .addOnSuccessListener(
                                        avoid -> {
                                            data.put("success", true);
                                            call.resolve(data);
                                        }
                                    )
                                    .addOnFailureListener(
                                        avoid -> {
                                            data.put("success", false);
                                            call.resolve(data);
                                        }
                                    );
                            }
                        }
                    );
                }
            }
        );

        AlertDialog alert11 = builder.create();
        alert11.show();
    }

    @PluginMethod
    public void requestEnableGooglePlayServices(PluginCall call) {
        JSObject data = new JSObject();
        googleApiAvailability
            .makeGooglePlayServicesAvailable(activity)
            .addOnSuccessListener(
                avoid -> {
                    data.put("success", true);
                    call.resolve(data);
                }
            )
            .addOnFailureListener(
                avoid -> {
                    data.put("success", false);
                    call.resolve(data);
                }
            );
    }
}
