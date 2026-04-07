package com.google.crypto.tink.config;

/* JADX INFO: loaded from: classes.dex */
public final class TinkFips {
    private TinkFips() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void restrictToFips() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.Registry.restrictToFipsIfEmpty()
            return
    }

    public static boolean useOnlyFips() {
            boolean r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()
            return r0
    }
}
