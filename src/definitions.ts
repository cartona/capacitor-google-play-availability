export interface GooglePlayServicesPlugin {
  /**
   * Retrieve google play services availability status
   */
   isGooglePlayServicesAvailable(): Promise<{ available: boolean }>;
  /**
   * Retrieve enabling google play services available request result
   */
   makeGooglePlayServicesAvailable(): Promise<{ enabled: boolean }>;
}
