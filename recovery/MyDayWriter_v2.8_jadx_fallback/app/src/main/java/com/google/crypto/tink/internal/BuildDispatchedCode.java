package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
final class BuildDispatchedCode {
    private BuildDispatchedCode() {
            r0 = this;
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    public static java.lang.Integer getApiLevel() {
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
