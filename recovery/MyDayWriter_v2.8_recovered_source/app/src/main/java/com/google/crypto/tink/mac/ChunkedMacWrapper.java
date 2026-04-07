package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public class ChunkedMacWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.mac.ChunkedMac, com.google.crypto.tink.mac.ChunkedMac> {
    private static final com.google.crypto.tink.mac.ChunkedMacWrapper WRAPPER = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.ChunkedMacWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @com.google.errorprone.annotations.Immutable
    private static class WrappedChunkedMac implements com.google.crypto.tink.mac.ChunkedMac {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> primitives;

        private WrappedChunkedMac(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        /* synthetic */ WrappedChunkedMac(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.mac.ChunkedMacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.mac.ChunkedMac getChunkedMac(com.google.crypto.tink.PrimitiveSet.Entry<com.google.crypto.tink.mac.ChunkedMac> r2) {
                r1 = this;
                java.lang.Object r0 = r2.getFullPrimitive()
                com.google.crypto.tink.mac.ChunkedMac r0 = (com.google.crypto.tink.mac.ChunkedMac) r0
                return r0
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
                r1 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r0 = r1.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                com.google.crypto.tink.mac.ChunkedMac r0 = r1.getChunkedMac(r0)
                com.google.crypto.tink.mac.ChunkedMacComputation r0 = r0.createComputation()
                return r0
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] r6) throws java.security.GeneralSecurityException {
                r5 = this;
                r0 = 5
                byte[] r0 = java.util.Arrays.copyOf(r6, r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r2 = r5.primitives
                java.util.List r2 = r2.getPrimitive(r0)
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2c
                java.lang.Object r3 = r2.next()
                com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
                com.google.crypto.tink.mac.ChunkedMac r4 = r5.getChunkedMac(r3)
                com.google.crypto.tink.mac.ChunkedMacVerification r4 = r4.createVerification(r6)
                r1.add(r4)
                goto L14
            L2c:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r2 = r5.primitives
                java.util.List r2 = r2.getRawPrimitives()
                java.util.Iterator r2 = r2.iterator()
            L36:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4e
                java.lang.Object r3 = r2.next()
                com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
                com.google.crypto.tink.mac.ChunkedMac r4 = r5.getChunkedMac(r3)
                com.google.crypto.tink.mac.ChunkedMacVerification r4 = r4.createVerification(r6)
                r1.add(r4)
                goto L36
            L4e:
                com.google.crypto.tink.mac.ChunkedMacWrapper$WrappedChunkedMacVerification r2 = new com.google.crypto.tink.mac.ChunkedMacWrapper$WrappedChunkedMacVerification
                r3 = 0
                r2.<init>(r1, r3)
                return r2
        }
    }

    private static class WrappedChunkedMacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
        private final java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> verifications;

        private WrappedChunkedMacVerification(java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> r1) {
                r0 = this;
                r0.<init>()
                r0.verifications = r1
                return
        }

        /* synthetic */ WrappedChunkedMacVerification(java.util.List r1, com.google.crypto.tink.mac.ChunkedMacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void update(java.nio.ByteBuffer r4) throws java.security.GeneralSecurityException {
                r3 = this;
                java.nio.ByteBuffer r0 = r4.duplicate()
                r0.mark()
                java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> r1 = r3.verifications
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L20
                java.lang.Object r2 = r1.next()
                com.google.crypto.tink.mac.ChunkedMacVerification r2 = (com.google.crypto.tink.mac.ChunkedMacVerification) r2
                r0.reset()
                r2.update(r0)
                goto Ld
            L20:
                int r1 = r4.limit()
                r4.position(r1)
                return
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public void verifyMac() throws java.security.GeneralSecurityException {
                r4 = this;
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "MAC verification failed for all suitable keys in keyset"
                r0.<init>(r1)
                java.util.List<com.google.crypto.tink.mac.ChunkedMacVerification> r1 = r4.verifications
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L22
                java.lang.Object r2 = r1.next()
                com.google.crypto.tink.mac.ChunkedMacVerification r2 = (com.google.crypto.tink.mac.ChunkedMacVerification) r2
                r2.verifyMac()     // Catch: java.security.GeneralSecurityException -> L1d
                return
            L1d:
                r3 = move-exception
                r0.addSuppressed(r3)
                goto Ld
            L22:
                throw r0
        }
    }

    static {
            com.google.crypto.tink.mac.ChunkedMacWrapper r0 = new com.google.crypto.tink.mac.ChunkedMacWrapper
            r0.<init>()
            com.google.crypto.tink.mac.ChunkedMacWrapper.WRAPPER = r0
            return
    }

    private ChunkedMacWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.ChunkedMacWrapper r0 = com.google.crypto.tink.mac.ChunkedMacWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> r0 = com.google.crypto.tink.mac.ChunkedMac.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> r0 = com.google.crypto.tink.mac.ChunkedMac.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.mac.ChunkedMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r6) throws java.security.GeneralSecurityException {
            r5 = this;
            if (r6 == 0) goto L43
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r6.getPrimary()
            if (r0 == 0) goto L3b
            java.util.Collection r0 = r6.getAll()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
            java.lang.Object r4 = r3.getFullPrimitive()
            com.google.crypto.tink.mac.ChunkedMac r4 = (com.google.crypto.tink.mac.ChunkedMac) r4
            goto L20
        L33:
            goto L10
        L34:
            com.google.crypto.tink.mac.ChunkedMacWrapper$WrappedChunkedMac r0 = new com.google.crypto.tink.mac.ChunkedMacWrapper$WrappedChunkedMac
            r1 = 0
            r0.<init>(r6, r1)
            return r0
        L3b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "no primary in primitive set"
            r0.<init>(r1)
            throw r0
        L43:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "primitive set must be non-null"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.mac.ChunkedMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.mac.ChunkedMac> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.mac.ChunkedMac r1 = r0.wrap(r1)
            return r1
    }
}
