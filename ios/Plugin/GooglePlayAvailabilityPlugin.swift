import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(GooglePlayAvailabilityPlugin)
public class GooglePlayAvailabilityPlugin: CAPPlugin {

    @objc func isGooglePlayServicesAvailable(_ call: CAPPluginCall) {
        call.unimplemented()
    }

    @objc func makeGooglePlayServicesAvailable(_ call: CAPPluginCall) {
        call.unimplemented()
    }
}
