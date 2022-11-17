#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(GooglePlayAvailabilityPlugin, "GooglePlayAvailability",
           CAP_PLUGIN_METHOD(isGooglePlayServicesAvailable, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(makeGooglePlayServicesAvailable, CAPPluginReturnPromise);
)
