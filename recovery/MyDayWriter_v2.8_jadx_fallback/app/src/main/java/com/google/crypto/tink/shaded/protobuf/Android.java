package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC = false;
    private static final java.lang.Class<?> MEMORY_CLASS = null;

    static {
            java.lang.String r0 = "libcore.io.Memory"
            java.lang.Class r0 = getClassForName(r0)
            com.google.crypto.tink.shaded.protobuf.Android.MEMORY_CLASS = r0
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.ASSUME_ANDROID
            if (r0 != 0) goto L16
            java.lang.String r0 = "org.robolectric.Robolectric"
            java.lang.Class r0 = getClassForName(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            com.google.crypto.tink.shaded.protobuf.Android.IS_ROBOLECTRIC = r0
            return
    }

    private Android() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <T> java.lang.Class<T> getClassForName(java.lang.String r2) {
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            r1 = 0
            return r1
    }

    static java.lang.Class<?> getMemoryClass() {
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.Android.MEMORY_CLASS
            return r0
    }

    static boolean isOnAndroidDevice() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.ASSUME_ANDROID
            if (r0 != 0) goto Lf
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.Android.MEMORY_CLASS
            if (r0 == 0) goto Ld
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.IS_ROBOLECTRIC
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }
}
