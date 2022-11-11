export interface GooglePlayServicesPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
