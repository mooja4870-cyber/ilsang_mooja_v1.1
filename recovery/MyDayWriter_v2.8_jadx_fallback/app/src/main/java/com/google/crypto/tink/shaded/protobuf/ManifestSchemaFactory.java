package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class ManifestSchemaFactory implements com.google.crypto.tink.shaded.protobuf.SchemaFactory {
    private static final com.google.crypto.tink.shaded.protobuf.MessageInfoFactory EMPTY_FACTORY = null;
    private final com.google.crypto.tink.shaded.protobuf.MessageInfoFactory messageInfoFactory;


    private static class CompositeMessageInfoFactory implements com.google.crypto.tink.shaded.protobuf.MessageInfoFactory {
        private com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(com.google.crypto.tink.shaded.protobuf.MessageInfoFactory... r1) {
                r0 = this;
                r0.<init>()
                r0.factories = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> r7) {
                r6 = this;
                com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[] r0 = r6.factories
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r5 = r4.isSupported(r7)
                if (r5 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> r6) {
                r5 = this;
                com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[] r0 = r5.factories
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                boolean r4 = r3.isSupported(r6)
                if (r4 == 0) goto L13
                com.google.crypto.tink.shaded.protobuf.MessageInfo r0 = r3.messageInfoFor(r6)
                return r0
            L13:
                int r2 = r2 + 1
                goto L4
            L16:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No factory is available for message type: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r6.getName()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$1 r0 = new com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$1
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.EMPTY_FACTORY = r0
            return
    }

    public ManifestSchemaFactory() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r0 = getDefaultMessageInfoFactory()
            r1.<init>(r0)
            return
    }

    private ManifestSchemaFactory(com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "messageInfoFactory"
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r0 = (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory) r0
            r1.messageInfoFactory = r0
            return
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
            com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory r0 = new com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory
            r1 = 2
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[] r1 = new com.google.crypto.tink.shaded.protobuf.MessageInfoFactory[r1]
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory.getInstance()
            r3 = 0
            r1[r3] = r2
            r2 = 1
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r3 = getDescriptorMessageInfoFactory()
            r1[r2] = r3
            r0.<init>(r1)
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L19
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L19
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r1 = (com.google.crypto.tink.shaded.protobuf.MessageInfoFactory) r1     // Catch: java.lang.Exception -> L19
            return r1
        L19:
            r0 = move-exception
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r1 = com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.EMPTY_FACTORY
            return r1
    }

    private static boolean isProto2(com.google.crypto.tink.shaded.protobuf.MessageInfo r2) {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r2.getSyntax()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO2
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static <T> com.google.crypto.tink.shaded.protobuf.Schema<T> newSchema(java.lang.Class<T> r8, com.google.crypto.tink.shaded.protobuf.MessageInfo r9) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L44
            boolean r0 = isProto2(r9)
            if (r0 == 0) goto L2c
        Lf:
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r3 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.lite()
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r4 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.lite()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r5 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r6 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.lite()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r7 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.lite()
            r1 = r8
            r2 = r9
            com.google.crypto.tink.shaded.protobuf.MessageSchema r8 = com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(r1, r2, r3, r4, r5, r6, r7)
            r0 = r1
            r1 = r2
            goto L43
        L2c:
            r0 = r8
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r2 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.lite()
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r3 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.lite()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r4 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.lite()
            r5 = 0
            com.google.crypto.tink.shaded.protobuf.MessageSchema r8 = com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(r0, r1, r2, r3, r4, r5, r6)
        L43:
            return r8
        L44:
            r0 = r8
            r1 = r9
            boolean r8 = isProto2(r1)
            if (r8 == 0) goto L66
        L4d:
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r2 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.full()
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r3 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.full()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r4 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.proto2UnknownFieldSetSchema()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r5 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.full()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.full()
            com.google.crypto.tink.shaded.protobuf.MessageSchema r8 = com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(r0, r1, r2, r3, r4, r5, r6)
            goto L7c
        L66:
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r2 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.full()
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r3 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.full()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r4 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.proto3UnknownFieldSetSchema()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r6 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.full()
            r5 = 0
            com.google.crypto.tink.shaded.protobuf.MessageSchema r8 = com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchema(r0, r1, r2, r3, r4, r5, r6)
        L7c:
            return r8
    }

    @Override // com.google.crypto.tink.shaded.protobuf.SchemaFactory
    public <T> com.google.crypto.tink.shaded.protobuf.Schema<T> createSchema(java.lang.Class<T> r5) {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.requireGeneratedMessage(r5)
            com.google.crypto.tink.shaded.protobuf.MessageInfoFactory r0 = r4.messageInfoFactory
            com.google.crypto.tink.shaded.protobuf.MessageInfo r0 = r0.messageInfoFor(r5)
            boolean r1 = r0.isMessageSetWireFormat()
            if (r1 == 0) goto L39
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L28
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r1 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r2 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.lite()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.MessageSetSchema r1 = com.google.crypto.tink.shaded.protobuf.MessageSetSchema.newSchema(r1, r2, r3)
            return r1
        L28:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r1 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.proto2UnknownFieldSetSchema()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r2 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.full()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.MessageSetSchema r1 = com.google.crypto.tink.shaded.protobuf.MessageSetSchema.newSchema(r1, r2, r3)
            return r1
        L39:
            com.google.crypto.tink.shaded.protobuf.Schema r1 = newSchema(r5, r0)
            return r1
    }
}
