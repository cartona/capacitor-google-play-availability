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

Retrieve google play services availability status

**Returns:** <code>Promise&lt;{ enabled: boolean; }&gt;</code>

--------------------


### requestEnableGooglePlayServices()

```typescript
requestEnableGooglePlayServices() => Promise<{ success: boolean; }>
```

Retrieve enabling google play services request result

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### requestEnableGooglePlayServicesWithMessage(...)

```typescript
requestEnableGooglePlayServicesWithMessage(requestDialog: RequestDialog) => Promise<{ success: boolean; }>
```

Display a dialog with a message before displaying enabling google play services request and retrieve the result

| Param               | Type                                                    |
| ------------------- | ------------------------------------------------------- |
| **`requestDialog`** | <code><a href="#requestdialog">RequestDialog</a></code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### Interfaces


#### RequestDialog

| Prop           | Type                | Description                                                                             |
| -------------- | ------------------- | --------------------------------------------------------------------------------------- |
| **`message`**  | <code>string</code> | Message displayed in the dialog before displaying enabling google play services request |
| **`btnLabel`** | <code>string</code> | Label of the button in the dialog                                                       |

</docgen-api>
