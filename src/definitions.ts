export interface GooglePlayServicesPlugin {
  /**
   * Retrieve google play services availability status
   */
  checkGooglePlayServicesAvailability(): Promise<{ enabled: boolean }>;
  /**
   * Retrieve enabling google play services request result
   */
  requestEnableGooglePlayServices(): Promise<{ success: boolean }>;
  /**
   * Display a dialog with a message before enabling google play services request and retrieve the result
   */
  requestEnableGooglePlayServicesWithMessage(
    requestDialog: RequestDialog,
  ): Promise<{ success: boolean }>;
}

export interface RequestDialog {
  /**
   * Message displayed in the dialog before displaying requesting enabling google play services
   */
  message: string;
  /**
   * Label of the button in the dialog
   */
  btnLabel: string;
}
