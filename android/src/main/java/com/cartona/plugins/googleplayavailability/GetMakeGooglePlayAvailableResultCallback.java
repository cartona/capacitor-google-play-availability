package com.cartona.plugins.googleplayavailability;

public interface GetMakeGooglePlayAvailableResultCallback {
    void success(boolean enabled);
    void failed(boolean enabled, String message);
}
