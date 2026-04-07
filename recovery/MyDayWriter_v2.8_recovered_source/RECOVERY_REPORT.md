# MyDayWriter_v2.8 recovery report

## Inputs analyzed
- APK: `/Users/mooja/Downloads/MyDayWriter_v2.8.apk`
- Decompiled source folder from user: `/Users/mooja/Downloads/MyDayWriter_v2.8_source`
- Apktool decode folder: `/Users/mooja/Downloads/MyDayWriter_v2.8_resources`

## Output folders created
- Gradle recovery source:
  - `/Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_recovered_source`
- Smali recovery project copy:
  - `/Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_recovered_smali_project`
- Smali-level rebuilt APK:
  - `/Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_rebuilt_from_smali.apk`
  - `/Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_rebuilt_from_smali_localcopy.apk`

## What was recovered
- Full Java decompile + resources were regenerated from APK using:
  - `jadx --decompilation-mode fallback --export-gradle`
- Recovery project keeps:
  - `app/src/main/java` (all decompiled classes)
  - `app/src/main/res`
  - `app/src/main/assets`
  - `app/src/main/AndroidManifest.xml`
  - `app/src/main/META-INF`, `app/src/main/kotlin`, `app/src/main/org`, `app/src/main/DebugProbesKt.bin`

## Native app-specific code found
- `app/src/main/java/com/mooja/autopost/MainActivity.java`
- `app/src/main/java/com/mooja/autopost/SecurePrefsPlugin.java`

## Fixes applied for project hygiene
- Updated Android Gradle Plugin version to `8.13.0` to match APK metadata.
- Added `gradle.properties`.
- Added `app/proguard-rules.pro` placeholder.
- Normalized project name in `settings.gradle`.
- Removed decompiled `app/src/main/java/com/mooja/autopost/R.java` to avoid duplicate `R` class collision.

## Important limitation
- This is a reverse-engineered recovery, not original author source.
- Binary-identical APK reproduction is not guaranteed because packaging/signing/zip alignment metadata can differ.
- The smali rebuild is the closest functional reconstruction path from decoded APK.

## Rebuild notes
- Smali-level rebuild command:
  - `apktool b /Users/mooja/Downloads/MyDayWriter_v2.8_resources -o /Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_rebuilt_from_smali.apk`
- Same rebuild from local copied recovery project:
  - `apktool b /Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_recovered_smali_project -o /Users/mooja/AI_Study/PJT_02/ilsang_mooja_v3.0/recovery/MyDayWriter_v2.8_rebuilt_from_smali_localcopy.apk`
- The rebuilt smali APK was generated successfully in this session.
