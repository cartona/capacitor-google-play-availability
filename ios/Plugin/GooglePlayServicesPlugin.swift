import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(GooglePlayServicesPlugin)
public class GooglePlayServicesPlugin: CAPPlugin {

    @objc func isGooglePlayServicesAvailable(_ call: CAPPluginCall) {
        call.unimplemented()
    }

    @objc func makeGooglePlayServicesAvailable(_ call: CAPPluginCall) {
        call.unimplemented()
    }
}
