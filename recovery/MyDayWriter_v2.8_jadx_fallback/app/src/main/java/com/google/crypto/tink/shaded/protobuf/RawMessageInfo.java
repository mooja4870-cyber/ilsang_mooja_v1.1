package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class RawMessageInfo implements com.google.crypto.tink.shaded.protobuf.MessageInfo {
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] objects;

    RawMessageInfo(com.google.crypto.tink.shaded.protobuf.MessageLite r7, java.lang.String r8, java.lang.Object[] r9) {
            r6 = this;
            r6.<init>()
            r6.defaultInstance = r7
            r6.info = r8
            r6.objects = r9
            r0 = 0
            int r1 = r0 + 1
            char r0 = r8.charAt(r0)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r0 >= r2) goto L18
            r6.flags = r0
            goto L33
        L18:
            r3 = r0 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L1c:
            int r5 = r1 + 1
            char r1 = r8.charAt(r1)
            r0 = r1
            if (r1 < r2) goto L2d
            r1 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r4
            r3 = r3 | r1
            int r4 = r4 + 13
            r1 = r5
            goto L1c
        L2d:
            int r1 = r0 << r4
            r1 = r1 | r3
            r6.flags = r1
            r1 = r5
        L33:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            return r0
    }

    java.lang.Object[] getObjects() {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            return r0
    }

    java.lang.String getStringInfo() {
            r1 = this;
            java.lang.String r0 = r1.info
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.ProtoSyntax getSyntax() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L9
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO2
            goto Lb
        L9:
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
        Lb:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
            r2 = this;
            int r0 = r2.flags
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
