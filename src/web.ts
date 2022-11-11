import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesPlugin, RequestDialog } from './definitions';

export class GooglePlayServicesWeb
  extends WebPlugin
  implements GooglePlayServicesPlugin
{
  constructor() {
    super({
      name: 'GooglePlayServices',
      platforms: ['web'],
    });
  }

  async checkGooglePlayServicesAvailability(): Promise<{ enabled: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }

  async requestEnableGooglePlayServicesWithMessage(
    _requestAlert: RequestDialog,
  ): Promise<{ success: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }

  async requestEnableGooglePlayServices(): Promise<{ success: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }
}

const GooglePlayServices = new GooglePlayServicesWeb();

export { GooglePlayServices };
