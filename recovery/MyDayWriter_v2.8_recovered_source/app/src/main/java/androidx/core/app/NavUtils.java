package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final java.lang.String TAG = "NavUtils";

    private NavUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent getParentActivityIntent(android.app.Activity r7) {
            android.content.Intent r0 = r7.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r1 = getParentActivityName(r7)
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r7, r1)
            java.lang.String r4 = getParentActivityName(r7, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r4 != 0) goto L1f
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            goto L28
        L1f:
            android.content.Intent r5 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Intent r2 = r5.setComponent(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
        L28:
            return r2
        L29:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getParentActivityIntent: bad parentActivityName '"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = "' in manifest"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "NavUtils"
            android.util.Log.e(r6, r5)
            return r2
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r4, android.content.ComponentName r5) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = getParentActivityName(r4, r5)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = r5.getPackageName()
            r1.<init>(r2, r0)
            java.lang.String r2 = getParentActivityName(r4, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r1)
            goto L25
        L1c:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r1)
        L25:
            return r3
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r4, java.lang.Class<?> r5) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r4, r5)
            java.lang.String r0 = getParentActivityName(r4, r0)
            if (r0 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r4, r0)
            java.lang.String r2 = getParentActivityName(r4, r1)
            if (r2 != 0) goto L1d
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r1)
            goto L26
        L1d:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r1)
        L26:
            return r3
    }

    public static java.lang.String getParentActivityName(android.app.Activity r2) {
            android.content.ComponentName r0 = r2.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.lang.String r0 = getParentActivityName(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String getParentActivityName(android.content.Context r7, android.content.ComponentName r8) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r1 = 128(0x80, float:1.8E-43)
            r1 = r1 | 512(0x200, float:7.17E-43)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L13
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            r1 = r1 | r2
            goto L17
        L13:
            r2 = 786432(0xc0000, float:1.102026E-39)
            r1 = r1 | r2
        L17:
            android.content.pm.ActivityInfo r2 = r0.getActivityInfo(r8, r1)
            java.lang.String r3 = r2.parentActivityName
            if (r3 == 0) goto L20
            return r3
        L20:
            android.os.Bundle r4 = r2.metaData
            r5 = 0
            if (r4 != 0) goto L26
            return r5
        L26:
            android.os.Bundle r4 = r2.metaData
            java.lang.String r6 = "android.support.PARENT_ACTIVITY"
            java.lang.String r4 = r4.getString(r6)
            if (r4 != 0) goto L31
            return r5
        L31:
            r5 = 0
            char r5 = r4.charAt(r5)
            r6 = 46
            if (r5 != r6) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.getPackageName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r4 = r5.toString()
        L4f:
            return r4
    }

    public static void navigateUpFromSameTask(android.app.Activity r4) {
            android.content.Intent r0 = getParentActivityIntent(r4)
            if (r0 == 0) goto La
            navigateUpTo(r4, r0)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Activity "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.ReplaceWith(expression = "sourceActivity.navigateUpTo(upIntent)")
    @java.lang.Deprecated
    public static void navigateUpTo(android.app.Activity r0, android.content.Intent r1) {
            r0.navigateUpTo(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @java.lang.Deprecated
    public static boolean shouldUpRecreateTask(android.app.Activity r1, android.content.Intent r2) {
            boolean r0 = r1.shouldUpRecreateTask(r2)
            return r0
    }
}
