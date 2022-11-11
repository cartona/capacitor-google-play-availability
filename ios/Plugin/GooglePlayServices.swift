import Foundation

@objc public class GooglePlayServices: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
