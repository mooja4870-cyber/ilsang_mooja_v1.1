package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class StructuralMessageInfo implements com.google.crypto.tink.shaded.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final com.google.crypto.tink.shaded.protobuf.ProtoSyntax syntax;

    public static final class Builder {
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        private final java.util.List<com.google.crypto.tink.shaded.protobuf.FieldInfo> fields;
        private boolean messageSetWireFormat;
        private com.google.crypto.tink.shaded.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.checkInitialized = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.fields = r0
                return
        }

        public Builder(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.checkInitialized = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                r1.fields = r0
                return
        }

        public com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo build() {
                r7 = this;
                boolean r0 = r7.wasBuilt
                if (r0 != 0) goto L32
                com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r7.syntax
                if (r0 == 0) goto L2a
                r0 = 1
                r7.wasBuilt = r0
                java.util.List<com.google.crypto.tink.shaded.protobuf.FieldInfo> r0 = r7.fields
                java.util.Collections.sort(r0)
                com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo r1 = new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo
                com.google.crypto.tink.shaded.protobuf.ProtoSyntax r2 = r7.syntax
                boolean r3 = r7.messageSetWireFormat
                int[] r4 = r7.checkInitialized
                java.util.List<com.google.crypto.tink.shaded.protobuf.FieldInfo> r0 = r7.fields
                r5 = 0
                com.google.crypto.tink.shaded.protobuf.FieldInfo[] r5 = new com.google.crypto.tink.shaded.protobuf.FieldInfo[r5]
                java.lang.Object[] r0 = r0.toArray(r5)
                r5 = r0
                com.google.crypto.tink.shaded.protobuf.FieldInfo[] r5 = (com.google.crypto.tink.shaded.protobuf.FieldInfo[]) r5
                java.lang.Object r6 = r7.defaultInstance
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            L2a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Must specify a proto syntax"
                r0.<init>(r1)
                throw r0
            L32:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Builder can only build once"
                r0.<init>(r1)
                throw r0
        }

        public void withCheckInitialized(int[] r1) {
                r0 = this;
                r0.checkInitialized = r1
                return
        }

        public void withDefaultInstance(java.lang.Object r1) {
                r0 = this;
                r0.defaultInstance = r1
                return
        }

        public void withField(com.google.crypto.tink.shaded.protobuf.FieldInfo r3) {
                r2 = this;
                boolean r0 = r2.wasBuilt
                if (r0 != 0) goto La
                java.util.List<com.google.crypto.tink.shaded.protobuf.FieldInfo> r0 = r2.fields
                r0.add(r3)
                return
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Builder can only build once"
                r0.<init>(r1)
                throw r0
        }

        public void withMessageSetWireFormat(boolean r1) {
                r0 = this;
                r0.messageSetWireFormat = r1
                return
        }

        public void withSyntax(com.google.crypto.tink.shaded.protobuf.ProtoSyntax r2) {
                r1 = this;
                java.lang.String r0 = "syntax"
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
                com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = (com.google.crypto.tink.shaded.protobuf.ProtoSyntax) r0
                r1.syntax = r0
                return
        }
    }

    StructuralMessageInfo(com.google.crypto.tink.shaded.protobuf.ProtoSyntax r2, boolean r3, int[] r4, com.google.crypto.tink.shaded.protobuf.FieldInfo[] r5, java.lang.Object r6) {
            r1 = this;
            r1.<init>()
            r1.syntax = r2
            r1.messageSetWireFormat = r3
            r1.checkInitialized = r4
            r1.fields = r5
            java.lang.String r0 = "defaultInstance"
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r6, r0)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            r1.defaultInstance = r0
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo$Builder r0 = new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo$Builder
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder newBuilder(int r1) {
            com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo$Builder r0 = new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo$Builder
            r0.<init>(r1)
            return r0
    }

    public int[] getCheckInitialized() {
            r1 = this;
            int[] r0 = r1.checkInitialized
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.FieldInfo[] getFields() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.FieldInfo[] r0 = r1.fields
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.ProtoSyntax getSyntax() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r1.syntax
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
            r1 = this;
            boolean r0 = r1.messageSetWireFormat
            return r0
    }
}
