package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";
    private static final java.lang.Object sAppLocaleStorageSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync = r0
            return
    }

    private AppLocalesStorageHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void persistLocales(android.content.Context r6, java.lang.String r7) {
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L12
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r6.deleteFile(r1)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return
        L12:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r1 = r6.openFileOutput(r1, r2)     // Catch: java.io.FileNotFoundException -> L5f java.lang.Throwable -> L73
            org.xmlpull.v1.XmlSerializer r2 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r2.setOutput(r1, r3)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r4 = "UTF-8"
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r2.startDocument(r4, r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r4 = "locales"
            r2.startTag(r3, r4)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r4 = "application_locales"
            r2.attribute(r3, r4, r7)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r4 = "locales"
            r2.endTag(r3, r4)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r2.endDocument()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r1 == 0) goto L54
            goto L4e
        L41:
            r3 = move-exception
            goto L56
        L43:
            r3 = move-exception
            java.lang.String r4 = "AppLocalesStorageHelper"
            java.lang.String r5 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r4, r5, r3)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L54
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L73
        L51:
            goto L54
        L52:
            r3 = move-exception
            goto L51
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return
        L56:
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L73
            goto L5d
        L5c:
            r4 = move-exception
        L5d:
            throw r3     // Catch: java.lang.Throwable -> L73
        L5f:
            r1 = move-exception
            java.lang.String r2 = "AppLocalesStorageHelper"
            java.lang.String r3 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r4 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L73
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return
        L73:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r1
    }

    public static java.lang.String readLocales(android.content.Context r9) {
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r9.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L75 java.lang.Throwable -> L78
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
        L19:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            r6 = r5
            r7 = 1
            if (r5 == r7) goto L46
            r5 = 3
            if (r6 != r5) goto L2a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 <= r4) goto L46
        L2a:
            if (r6 == r5) goto L19
            r5 = 4
            if (r6 != r5) goto L30
            goto L19
        L30:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r7 = "locales"
            boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 == 0) goto L45
            java.lang.String r7 = "application_locales"
            r8 = 0
            java.lang.String r7 = r3.getAttributeValue(r8, r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 org.xmlpull.v1.XmlPullParserException -> L52
            r1 = r7
            goto L46
        L45:
            goto L19
        L46:
            if (r2 == 0) goto L5e
        L48:
            r2.close()     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L78
        L4b:
            goto L5e
        L4c:
            r3 = move-exception
            goto L4b
        L4e:
            r3 = move-exception
            goto L6c
        L50:
            r3 = move-exception
            goto L53
        L52:
            r3 = move-exception
        L53:
            java.lang.String r4 = "AppLocalesStorageHelper"
            java.lang.String r5 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r4, r5)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L5e
            goto L48
        L5e:
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L65
            goto L6a
        L65:
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r9.deleteFile(r3)     // Catch: java.lang.Throwable -> L78
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            return r1
        L6c:
            if (r2 == 0) goto L73
            r2.close()     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L78
            goto L73
        L72:
            r4 = move-exception
        L73:
            throw r3     // Catch: java.lang.Throwable -> L78
        L75:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            return r1
        L78:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r1
    }
}
