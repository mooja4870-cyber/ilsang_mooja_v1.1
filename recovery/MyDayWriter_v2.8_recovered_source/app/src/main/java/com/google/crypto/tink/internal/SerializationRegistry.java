package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SerializationRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.SerializationRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.keySerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.keyParserMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.parametersSerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.parametersParserMap = r0
                return
        }

        public Builder(com.google.crypto.tink.internal.SerializationRegistry r3) {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$000(r3)
                r0.<init>(r1)
                r2.keySerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$100(r3)
                r0.<init>(r1)
                r2.keyParserMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$200(r3)
                r0.<init>(r1)
                r2.parametersSerializerMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.access$300(r3)
                r0.<init>(r1)
                r2.parametersParserMap = r0
                return
        }

        static /* synthetic */ java.util.Map access$1000(com.google.crypto.tink.internal.SerializationRegistry.Builder r1) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r0 = r1.parametersParserMap
                return r0
        }

        static /* synthetic */ java.util.Map access$700(com.google.crypto.tink.internal.SerializationRegistry.Builder r1) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r0 = r1.keySerializerMap
                return r0
        }

        static /* synthetic */ java.util.Map access$800(com.google.crypto.tink.internal.SerializationRegistry.Builder r1) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r0 = r1.keyParserMap
                return r0
        }

        static /* synthetic */ java.util.Map access$900(com.google.crypto.tink.internal.SerializationRegistry.Builder r1) {
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r0 = r1.parametersSerializerMap
                return r0
        }

        com.google.crypto.tink.internal.SerializationRegistry build() {
                r2 = this;
                com.google.crypto.tink.internal.SerializationRegistry r0 = new com.google.crypto.tink.internal.SerializationRegistry
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeyParser(com.google.crypto.tink.internal.KeyParser<SerializationT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
                java.lang.Class r1 = r6.getSerializationClass()
                com.google.crypto.tink.util.Bytes r2 = r6.getObjectIdentifier()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r5.keyParserMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L44
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r5.keyParserMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.KeyParser r1 = (com.google.crypto.tink.internal.KeyParser) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L2b
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L2b
                goto L49
            L2b:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal parser for already existing object of type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L44:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r5.keyParserMap
                r1.put(r0, r6)
            L49:
                return r5
        }

        public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeySerializer(com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
                java.lang.Class r1 = r6.getKeyClass()
                java.lang.Class r2 = r6.getSerializationClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r5.keySerializerMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L44
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r5.keySerializerMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.KeySerializer r1 = (com.google.crypto.tink.internal.KeySerializer) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L2b
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L2b
                goto L49
            L2b:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal serializer for already existing object of type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L44:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r5.keySerializerMap
                r1.put(r0, r6)
            L49:
                return r5
        }

        public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersParser(com.google.crypto.tink.internal.ParametersParser<SerializationT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
                java.lang.Class r1 = r6.getSerializationClass()
                com.google.crypto.tink.util.Bytes r2 = r6.getObjectIdentifier()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r5.parametersParserMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L44
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r5.parametersParserMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.ParametersParser r1 = (com.google.crypto.tink.internal.ParametersParser) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L2b
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L2b
                goto L49
            L2b:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal parser for already existing object of type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L44:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r5.parametersParserMap
                r1.put(r0, r6)
            L49:
                return r5
        }

        public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersSerializer(com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
                java.lang.Class r1 = r6.getParametersClass()
                java.lang.Class r2 = r6.getSerializationClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r5.parametersSerializerMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L44
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r5.parametersSerializerMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.ParametersSerializer r1 = (com.google.crypto.tink.internal.ParametersSerializer) r1
                boolean r2 = r1.equals(r6)
                if (r2 == 0) goto L2b
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L2b
                goto L49
            L2b:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Attempt to register non-equal serializer for already existing object of type: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L44:
                java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r5.parametersSerializerMap
                r1.put(r0, r6)
            L49:
                return r5
        }
    }

    private static class ParserIndex {
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;
        private final com.google.crypto.tink.util.Bytes serializationIdentifier;

        private ParserIndex(java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1, com.google.crypto.tink.util.Bytes r2) {
                r0 = this;
                r0.<init>()
                r0.keySerializationClass = r1
                r0.serializationIdentifier = r2
                return
        }

        /* synthetic */ ParserIndex(java.lang.Class r1, com.google.crypto.tink.util.Bytes r2, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.internal.SerializationRegistry.ParserIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r5
                com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = (com.google.crypto.tink.internal.SerializationRegistry.ParserIndex) r0
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r2 = r0.keySerializationClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r3 = r4.keySerializationClass
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1f
                com.google.crypto.tink.util.Bytes r2 = r0.serializationIdentifier
                com.google.crypto.tink.util.Bytes r3 = r4.serializationIdentifier
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1f
                r1 = 1
                goto L20
            L1f:
            L20:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r0 = r2.keySerializationClass
                com.google.crypto.tink.util.Bytes r1 = r2.serializationIdentifier
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", object identifier: "
                java.lang.StringBuilder r0 = r0.append(r1)
                com.google.crypto.tink.util.Bytes r1 = r2.serializationIdentifier
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class SerializerIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;

        private SerializerIndex(java.lang.Class<?> r1, java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r2) {
                r0 = this;
                r0.<init>()
                r0.keyClass = r1
                r0.keySerializationClass = r2
                return
        }

        /* synthetic */ SerializerIndex(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r5
                com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = (com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex) r0
                java.lang.Class<?> r2 = r0.keyClass
                java.lang.Class<?> r3 = r4.keyClass
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1f
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r2 = r0.keySerializationClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r3 = r4.keySerializationClass
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1f
                r1 = 1
                goto L20
            L1f:
            L20:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.keyClass
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
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
                java.lang.String r1 = " with serialization type: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> r1 = r2.keySerializationClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private SerializationRegistry(com.google.crypto.tink.internal.SerializationRegistry.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$700(r3)
            r0.<init>(r1)
            r2.keySerializerMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$800(r3)
            r0.<init>(r1)
            r2.keyParserMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$900(r3)
            r0.<init>(r1)
            r2.parametersSerializerMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.SerializationRegistry.Builder.access$1000(r3)
            r0.<init>(r1)
            r2.parametersParserMap = r0
            return
    }

    /* synthetic */ SerializationRegistry(com.google.crypto.tink.internal.SerializationRegistry.Builder r1, com.google.crypto.tink.internal.SerializationRegistry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.crypto.tink.internal.SerializationRegistry r1) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r0 = r1.keySerializerMap
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.google.crypto.tink.internal.SerializationRegistry r1) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r0 = r1.keyParserMap
            return r0
    }

    static /* synthetic */ java.util.Map access$200(com.google.crypto.tink.internal.SerializationRegistry r1) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r0 = r1.parametersSerializerMap
            return r0
    }

    static /* synthetic */ java.util.Map access$300(com.google.crypto.tink.internal.SerializationRegistry r1) {
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r0 = r1.parametersParserMap
            return r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForKey(SerializationT r5) {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
            boolean r1 = r1.containsKey(r0)
            return r1
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForParameters(SerializationT r5) {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
            boolean r1 = r1.containsKey(r0)
            return r1
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForKey(KeyT r4, java.lang.Class<SerializationT> r5) {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r3.keySerializerMap
            boolean r1 = r1.containsKey(r0)
            return r1
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForParameters(ParametersT r4, java.lang.Class<SerializationT> r5) {
            r3 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r3.parametersSerializerMap
            boolean r1 = r1.containsKey(r0)
            return r1
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Key parseKey(SerializationT r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> r1 = r4.keyParserMap
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.internal.KeyParser r1 = (com.google.crypto.tink.internal.KeyParser) r1
            com.google.crypto.tink.Key r2 = r1.parseKey(r5, r6)
            return r2
        L23:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No Key Parser for requested key type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " available"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Parameters parseParameters(SerializationT r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$ParserIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$ParserIndex
            java.lang.Class r1 = r5.getClass()
            com.google.crypto.tink.util.Bytes r2 = r5.getObjectIdentifier()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> r1 = r4.parametersParserMap
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.internal.ParametersParser r1 = (com.google.crypto.tink.internal.ParametersParser) r1
            com.google.crypto.tink.Parameters r2 = r1.parseParameters(r5)
            return r2
        L23:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No Parameters Parser for requested key type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " available"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeKey(KeyT r5, java.lang.Class<SerializationT> r6, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r7) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r5.getClass()
            r2 = 0
            r0.<init>(r1, r6, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r4.keySerializerMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> r1 = r4.keySerializerMap
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.internal.KeySerializer r1 = (com.google.crypto.tink.internal.KeySerializer) r1
            com.google.crypto.tink.internal.Serialization r2 = r1.serializeKey(r5, r7)
            return r2
        L1f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No Key serializer for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " available"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeParameters(ParametersT r5, java.lang.Class<SerializationT> r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex r0 = new com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex
            java.lang.Class r1 = r5.getClass()
            r2 = 0
            r0.<init>(r1, r6, r2)
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r4.parametersSerializerMap
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.SerializationRegistry$SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> r1 = r4.parametersSerializerMap
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.internal.ParametersSerializer r1 = (com.google.crypto.tink.internal.ParametersSerializer) r1
            com.google.crypto.tink.internal.Serialization r2 = r1.serializeParameters(r5)
            return r2
        L1f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No Key Format serializer for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " available"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
