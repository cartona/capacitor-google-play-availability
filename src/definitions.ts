export interface GooglePlayServicesPlugin {
  checkGooglePlayServicesAvailability(): Promise<{ enabled: boolean }>;
  requestEnableGooglePlayServices(): Promise<{ success: boolean }>;
  requestEnableGooglePlayServicesWithMessage(
    requestAlert: RequestAlert,
  ): Promise<{ success: boolean }>;
}

export interface RequestAlert {
  message: string;
  btnLabel: string;
}
