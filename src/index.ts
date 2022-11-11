import { registerPlugin } from '@capacitor/core';

import type { GooglePlayServicesPlugin } from './definitions';

const GooglePlayServices = registerPlugin<GooglePlayServicesPlugin>(
  'GooglePlayServices',
  {
    web: () => import('./web').then(m => new m.GooglePlayServicesWeb()),
  },
);

export * from './definitions';
export { GooglePlayServices };
