import { WebPlugin } from '@capacitor/core';

import type { GooglePlayAvailabilityPlugin } from './definitions';

export class GooglePlayAvailabilityWeb
  extends WebPlugin
  implements GooglePlayAvailabilityPlugin
{
  constructor() {
    super({
      name: 'GooglePlayAvailability',
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

const GooglePlayAvailability = new GooglePlayAvailabilityWeb();

export { GooglePlayAvailability };
