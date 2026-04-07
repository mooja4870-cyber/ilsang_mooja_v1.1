package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class KeyTemplates {
    private KeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeyTemplate get(java.lang.String r4) throws java.security.GeneralSecurityException {
            java.util.Map r0 = com.google.crypto.tink.Registry.keyTemplateMap()
            java.lang.Object r0 = r0.get(r4)
            com.google.crypto.tink.KeyTemplate r0 = (com.google.crypto.tink.KeyTemplate) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cannot find key template: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
