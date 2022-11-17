import { registerPlugin } from '@capacitor/core';

import type { GooglePlayAvailabilityPlugin } from './definitions';

const GooglePlayAvailability = registerPlugin<GooglePlayAvailabilityPlugin>(
  'GooglePlayAvailability',
  {
    web: () => import('./web').then(m => new m.GooglePlayAvailabilityWeb()),
  },
);

export * from './definitions';
export { GooglePlayAvailability };
