package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class BuildHelper {
    private static java.lang.String TAG;

    static {
            java.lang.String r0 = "BuildHelper"
            org.apache.cordova.BuildHelper.TAG = r0
            return
    }

    public BuildHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object getBuildConfigValue(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo()     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.String r1 = r1.packageName     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            r2.<init>()     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.String r3 = ".BuildConfig"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.reflect.Field r3 = r2.getField(r6)     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.NullPointerException -> L27 java.lang.IllegalAccessException -> L33 java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L59
            return r0
        L27:
            r1 = move-exception
            java.lang.String r2 = org.apache.cordova.BuildHelper.TAG
            java.lang.String r3 = "Null Pointer Exception: Let's print a stack trace."
            org.apache.cordova.LOG.d(r2, r3)
            r1.printStackTrace()
            goto L65
        L33:
            r1 = move-exception
            java.lang.String r2 = org.apache.cordova.BuildHelper.TAG
            java.lang.String r3 = "Illegal Access Exception: Let's print a stack trace."
            org.apache.cordova.LOG.d(r2, r3)
            r1.printStackTrace()
            goto L64
        L3f:
            r1 = move-exception
            java.lang.String r2 = org.apache.cordova.BuildHelper.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " is not a valid field. Check your build.gradle"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            org.apache.cordova.LOG.d(r2, r3)
            goto L64
        L59:
            r1 = move-exception
            java.lang.String r2 = org.apache.cordova.BuildHelper.TAG
            java.lang.String r3 = "Unable to get the BuildConfig, is this built with ANT?"
            org.apache.cordova.LOG.d(r2, r3)
            r1.printStackTrace()
        L64:
        L65:
            return r0
    }
}
