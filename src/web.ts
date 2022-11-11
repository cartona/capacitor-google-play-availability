import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesPlugin } from './definitions';

export class GooglePlayServicesWeb
  extends WebPlugin
  implements GooglePlayServicesPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
