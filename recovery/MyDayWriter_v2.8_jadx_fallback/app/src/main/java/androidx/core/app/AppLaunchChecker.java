package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class AppLaunchChecker {
    private static final java.lang.String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final java.lang.String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    @java.lang.Deprecated
    public AppLaunchChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasStartedFromLauncher(android.content.Context r3) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            java.lang.String r2 = "startedFromLauncher"
            boolean r0 = r0.getBoolean(r2, r1)
            return r0
    }

    public static void onActivityCreate(android.app.Activity r5) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r0, r1)
            java.lang.String r2 = "startedFromLauncher"
            boolean r1 = r0.getBoolean(r2, r1)
            if (r1 == 0) goto L10
            return
        L10:
            android.content.Intent r1 = r5.getIntent()
            if (r1 != 0) goto L17
            return
        L17:
            java.lang.String r3 = "android.intent.action.MAIN"
            java.lang.String r4 = r1.getAction()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3f
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            boolean r3 = r1.hasCategory(r3)
            if (r3 != 0) goto L33
            java.lang.String r3 = "android.intent.category.LEANBACK_LAUNCHER"
            boolean r3 = r1.hasCategory(r3)
            if (r3 == 0) goto L3f
        L33:
            android.content.SharedPreferences$Editor r3 = r0.edit()
            r4 = 1
            android.content.SharedPreferences$Editor r2 = r3.putBoolean(r2, r4)
            r2.apply()
        L3f:
            return
    }
}
