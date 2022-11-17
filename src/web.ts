import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesPlugin } from './definitions';

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

  async isGooglePlayServicesAvailable(): Promise<{ available: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }

  async makeGooglePlayServicesAvailable(): Promise<{ enabled: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }
}

const GooglePlayServices = new GooglePlayServicesWeb();

export { GooglePlayServices };
