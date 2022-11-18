package com.cartona.plugins.googleplayavailability;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "GooglePlayAvailability")
public class GooglePlayAvailabilityPlugin extends Plugin {

    public static final String TAG = "GooglePlayAvailability";

    private GooglePlayAvailability implementation;

    @Override
    public void load() {
        this.implementation = new GooglePlayAvailability(getActivity());
    }

    @PluginMethod()
    public void isGooglePlayServicesAvailable(PluginCall call) {
        try {
            boolean isAvailable = implementation.isGooglePlayServicesAvailable();
            JSObject data = new JSObject();
            data.put("available", isAvailable);
            call.resolve(data);
        } catch (Exception exception) {
            call.reject(exception.getLocalizedMessage());
        }
    }

    @PluginMethod()
    public void makeGooglePlayServicesAvailable(PluginCall call) {
        implementation.makeGooglePlayServicesAvailable(new GetMakeGooglePlayAvailableResultCallback() {
            @Override
            public void success(boolean enabled) {
                JSObject data = new JSObject();
                data.put("enabled", true);
                call.resolve(data);
            }

            @Override
            public void failed(boolean enabled, String message) {
                JSObject data = new JSObject();
                data.put("enabled", false);
                call.resolve(data);
            }
        });
    }
}
