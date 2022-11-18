# capacitor-google-play-availability

A capacitor plugin which is a wrapper for google play availability api that allows to check for google play services availability and enabling it if it's available

## Install

```bash
npm install capacitor-google-play-availability
npx cap sync
```

## API

<docgen-index>

* [`isGooglePlayServicesAvailable()`](#isgoogleplayservicesavailable)
* [`makeGooglePlayServicesAvailable()`](#makegoogleplayservicesavailable)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isGooglePlayServicesAvailable()

```typescript
isGooglePlayServicesAvailable() => Promise<{ available: boolean; }>
```

Retrieve google play services availability status

**Returns:** <code>Promise&lt;{ available: boolean; }&gt;</code>

--------------------


### makeGooglePlayServicesAvailable()

```typescript
makeGooglePlayServicesAvailable() => Promise<{ enabled: boolean; }>
```

Retrieve enabling google play services available request result

**Returns:** <code>Promise&lt;{ enabled: boolean; }&gt;</code>

--------------------

</docgen-api>
