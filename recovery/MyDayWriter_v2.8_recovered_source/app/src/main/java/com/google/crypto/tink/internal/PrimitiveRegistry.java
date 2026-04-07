package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public class PrimitiveRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
    private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.PrimitiveRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
        private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.primitiveConstructorMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.primitiveWrapperMap = r0
                return
        }

        public Builder(com.google.crypto.tink.internal.PrimitiveRegistry r3) {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.access$000(r3)
                r0.<init>(r1)
                r2.primitiveConstructorMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.access$100(r3)
                r0.<init>(r1)
                r2.primitiveWrapperMap = r0
                return
        }

        static /* synthetic */ java.util.Map access$400(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r1) {
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r0 = r1.primitiveConstructorMap
                return r0
        }

        static /* synthetic */ java.util.Map access$500(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r1) {
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r1.primitiveWrapperMap
                return r0
        }

        com.google.crypto.tink.internal.PrimitiveRegistry build() {
                r2 = this;
                com.google.crypto.tink.internal.PrimitiveRegistry r0 = new com.google.crypto.tink.internal.PrimitiveRegistry
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                if (r6 == 0) goto L4c
                com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex
                java.lang.Class r1 = r6.getKeyClass()
                java.lang.Class r2 = r6.getPrimitiveClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r5.primitiveConstructorMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L46
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r5.primitiveConstructorMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.PrimitiveConstructor r1 = (com.google.crypto.tink.internal.PrimitiveConstructor) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L2d
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L2d
                goto L4b
            L2d:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L46:
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r5.primitiveConstructorMap
                r1.put(r0, r6)
            L4b:
                return r5
            L4c:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "primitive constructor must be non-null"
                r0.<init>(r1)
                throw r0
        }

        public <InputPrimitiveT, WrapperPrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveWrapper(com.google.crypto.tink.PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                if (r6 == 0) goto L42
                java.lang.Class r0 = r6.getPrimitiveClass()
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r5.primitiveWrapperMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L3c
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r5.primitiveWrapperMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.PrimitiveWrapper r1 = (com.google.crypto.tink.PrimitiveWrapper) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L23
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L23
                goto L41
            L23:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L3c:
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r5.primitiveWrapperMap
                r1.put(r0, r6)
            L41:
                return r5
            L42:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "wrapper must be non-null"
                r0.<init>(r1)
                throw r0
        }
    }

    private static final class PrimitiveConstructorIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<?> primitiveClass;

        private PrimitiveConstructorIndex(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.keyClass = r1
                r0.primitiveClass = r2
                return
        }

        /* synthetic */ PrimitiveConstructorIndex(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.PrimitiveRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r5
                com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r0 = (com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex) r0
                java.lang.Class<?> r2 = r0.keyClass
                java.lang.Class<?> r3 = r4.keyClass
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1e
                java.lang.Class<?> r2 = r0.primitiveClass
                java.lang.Class<?> r3 = r4.primitiveClass
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.keyClass
                java.lang.Class<?> r1 = r2.primitiveClass
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<?> r1 = r2.keyClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " with primitive type: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Class<?> r1 = r2.primitiveClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private PrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.Builder.access$400(r3)
            r0.<init>(r1)
            r2.primitiveConstructorMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.Builder.access$500(r3)
            r0.<init>(r1)
            r2.primitiveWrapperMap = r0
            return
    }

    /* synthetic */ PrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r1, com.google.crypto.tink.internal.PrimitiveRegistry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.crypto.tink.internal.PrimitiveRegistry r1) {
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r0 = r1.primitiveConstructorMap
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.google.crypto.tink.internal.PrimitiveRegistry r1) {
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r1.primitiveWrapperMap
            return r0
    }

    public java.lang.Class<?> getInputPrimitiveClass(java.lang.Class<?> r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            java.lang.Object r0 = r0.get(r4)
            com.google.crypto.tink.PrimitiveWrapper r0 = (com.google.crypto.tink.PrimitiveWrapper) r0
            java.lang.Class r0 = r0.getInputPrimitiveClass()
            return r0
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No input primitive class for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " available"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> PrimitiveT getPrimitive(KeyT r5, java.lang.Class<PrimitiveT> r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex
            java.lang.Class r1 = r5.getClass()
            r2 = 0
            r0.<init>(r1, r6, r2)
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r4.primitiveConstructorMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r4.primitiveConstructorMap
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.internal.PrimitiveConstructor r1 = (com.google.crypto.tink.internal.PrimitiveConstructor) r1
            java.lang.Object r2 = r1.constructPrimitive(r5)
            return r2
        L1f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No PrimitiveConstructor for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " available"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(com.google.crypto.tink.PrimitiveSet<InputPrimitiveT> r4, java.lang.Class<WrapperPrimitiveT> r5) throws java.security.GeneralSecurityException {
            r3 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L3a
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            java.lang.Object r0 = r0.get(r5)
            com.google.crypto.tink.PrimitiveWrapper r0 = (com.google.crypto.tink.PrimitiveWrapper) r0
            java.lang.Class r1 = r4.getPrimitiveClass()
            java.lang.Class r2 = r0.getInputPrimitiveClass()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            java.lang.Class r1 = r0.getInputPrimitiveClass()
            java.lang.Class r2 = r4.getPrimitiveClass()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            r1 = r0
            java.lang.Object r2 = r1.wrap(r4)
            return r2
        L32:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r1.<init>(r2)
            throw r1
        L3a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No wrapper found for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
