package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
public class StreamingAeadWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.StreamingAead, com.google.crypto.tink.StreamingAead> {
    private static final com.google.crypto.tink.streamingaead.StreamingAeadWrapper WRAPPER = null;

    static {
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper r0 = new com.google.crypto.tink.streamingaead.StreamingAeadWrapper
            r0.<init>()
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper.WRAPPER = r0
            return
    }

    StreamingAeadWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper r0 = com.google.crypto.tink.streamingaead.StreamingAeadWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.StreamingAead> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.StreamingAead> r0 = com.google.crypto.tink.StreamingAead.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.StreamingAead> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.StreamingAead> r0 = com.google.crypto.tink.StreamingAead.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.StreamingAead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.streamingaead.StreamingAeadHelper r0 = new com.google.crypto.tink.streamingaead.StreamingAeadHelper
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.StreamingAead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.StreamingAead r1 = r0.wrap(r1)
            return r1
    }
}
