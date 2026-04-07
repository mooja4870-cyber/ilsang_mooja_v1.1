package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
class GeneratedMessageInfoFactory implements com.google.crypto.tink.shaded.protobuf.MessageInfoFactory {
    private static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory instance = null;

    static {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory.instance = r0
            return
    }

    private GeneratedMessageInfoFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory getInstance() {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageInfoFactory.instance
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public com.google.crypto.tink.shaded.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L37
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch: java.lang.Exception -> L19
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.getDefaultInstance(r0)     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r0.buildMessageInfo()     // Catch: java.lang.Exception -> L19
            com.google.crypto.tink.shaded.protobuf.MessageInfo r0 = (com.google.crypto.tink.shaded.protobuf.MessageInfo) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get message info for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported message type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
