# capacitor-google-play-services

a capacitor plugin which allows to check for google play services availability and making it enabled

## Install

```bash
npm install capacitor-google-play-services
npx cap sync
```

## API

<docgen-index>

* [`checkGooglePlayServicesAvailability()`](#checkgoogleplayservicesavailability)
* [`requestEnableGooglePlayServices()`](#requestenablegoogleplayservices)
* [`requestEnableGooglePlayServicesWithMessage(...)`](#requestenablegoogleplayserviceswithmessage)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### checkGooglePlayServicesAvailability()

```typescript
checkGooglePlayServicesAvailability() => Promise<{ enabled: boolean; }>
```

**Returns:** <code>Promise&lt;{ enabled: boolean; }&gt;</code>

--------------------


### requestEnableGooglePlayServices()

```typescript
requestEnableGooglePlayServices() => Promise<{ success: boolean; }>
```

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### requestEnableGooglePlayServicesWithMessage(...)

```typescript
requestEnableGooglePlayServicesWithMessage(requestAlert: RequestAlert) => Promise<{ success: boolean; }>
```

| Param              | Type                                                  |
| ------------------ | ----------------------------------------------------- |
| **`requestAlert`** | <code><a href="#requestalert">RequestAlert</a></code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### Interfaces


#### RequestAlert

| Prop           | Type                |
| -------------- | ------------------- |
| **`message`**  | <code>string</code> |
| **`btnLabel`** | <code>string</code> |

</docgen-api>
