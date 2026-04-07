package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutXmlParser {
    private static final java.lang.String ATTR_SHORTCUT_ID = "shortcutId";
    private static final java.lang.Object GET_INSTANCE_LOCK = null;
    private static final java.lang.String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final java.lang.String TAG = "ShortcutXmlParser";
    private static final java.lang.String TAG_SHORTCUT = "shortcut";
    private static volatile java.util.ArrayList<java.lang.String> sShortcutIds;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK = r0
            return
    }

    private ShortcutXmlParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r2.getAttributeValue(r0, r3)
            if (r0 != 0) goto Ld
            r1 = 0
            java.lang.String r0 = r2.getAttributeValue(r1, r3)
        Ld:
            return r0
    }

    public static java.util.List<java.lang.String> getShortcutIds(android.content.Context r3) {
            java.util.ArrayList<java.lang.String> r0 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            if (r0 != 0) goto L20
            java.lang.Object r0 = androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            androidx.core.content.pm.ShortcutXmlParser.sShortcutIds = r1     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1d
            java.util.Set r2 = parseShortcutIds(r3)     // Catch: java.lang.Throwable -> L1d
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
        L20:
            java.util.ArrayList<java.lang.String> r0 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            return r0
    }

    private static android.content.res.XmlResourceParser getXmlResourceParser(android.content.Context r4, android.content.pm.ActivityInfo r5) {
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "android.app.shortcuts"
            android.content.res.XmlResourceParser r0 = r5.loadXmlMetaData(r0, r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to open android.app.shortcuts meta-data resource of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static java.util.List<java.lang.String> parseShortcutIds(org.xmlpull.v1.XmlPullParser r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
        L6:
            int r2 = r6.next()
            r3 = r2
            if (r2 == r1) goto L38
            r2 = 3
            if (r3 != r2) goto L16
            int r2 = r6.getDepth()
            if (r2 <= 0) goto L38
        L16:
            int r2 = r6.getDepth()
            java.lang.String r4 = r6.getName()
            r5 = 2
            if (r3 != r5) goto L37
            if (r2 != r5) goto L37
            java.lang.String r5 = "shortcut"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L37
            java.lang.String r5 = "shortcutId"
            java.lang.String r5 = getAttributeValue(r6, r5)
            if (r5 != 0) goto L34
            goto L6
        L34:
            r0.add(r5)
        L37:
            goto L6
        L38:
            return r0
    }

    private static java.util.Set<java.lang.String> parseShortcutIds(android.content.Context r9) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            r1.addCategory(r2)
            java.lang.String r2 = r9.getPackageName()
            r1.setPackage(r2)
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r2 = r2.queryIntentActivities(r1, r3)
            if (r2 == 0) goto L71
            int r3 = r2.size()
            if (r3 != 0) goto L2b
            goto L71
        L2b:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Exception -> L68
        L2f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L68
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L68
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch: java.lang.Exception -> L68
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch: java.lang.Exception -> L68
            android.os.Bundle r6 = r5.metaData     // Catch: java.lang.Exception -> L68
            if (r6 == 0) goto L66
            java.lang.String r7 = "android.app.shortcuts"
            boolean r7 = r6.containsKey(r7)     // Catch: java.lang.Exception -> L68
            if (r7 == 0) goto L66
            android.content.res.XmlResourceParser r7 = getXmlResourceParser(r9, r5)     // Catch: java.lang.Exception -> L68
            java.util.List r8 = parseShortcutIds(r7)     // Catch: java.lang.Throwable -> L5a
            r0.addAll(r8)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L66
            r7.close()     // Catch: java.lang.Exception -> L68
            goto L66
        L5a:
            r3 = move-exception
            if (r7 == 0) goto L65
            r7.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r8 = move-exception
            r3.addSuppressed(r8)     // Catch: java.lang.Exception -> L68
        L65:
            throw r3     // Catch: java.lang.Exception -> L68
        L66:
            goto L2f
        L67:
            goto L70
        L68:
            r3 = move-exception
            java.lang.String r4 = "ShortcutXmlParser"
            java.lang.String r5 = "Failed to parse the Xml resource: "
            android.util.Log.e(r4, r5, r3)
        L70:
            return r0
        L71:
            return r0
    }
}
