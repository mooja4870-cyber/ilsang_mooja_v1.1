package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum ProtoSyntax extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.ProtoSyntax> {
    private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.ProtoSyntax[] $VALUES = null;
    public static final com.google.crypto.tink.shaded.protobuf.ProtoSyntax PROTO2 = null;
    public static final com.google.crypto.tink.shaded.protobuf.ProtoSyntax PROTO3 = null;

    static {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = new com.google.crypto.tink.shaded.protobuf.ProtoSyntax
            java.lang.String r1 = "PROTO2"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO2 = r0
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = new com.google.crypto.tink.shaded.protobuf.ProtoSyntax
            java.lang.String r1 = "PROTO3"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3 = r0
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO2
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax[] r0 = new com.google.crypto.tink.shaded.protobuf.ProtoSyntax[]{r0, r1}
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax.$VALUES = r0
            return
    }

    ProtoSyntax(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ProtoSyntax valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ProtoSyntax> r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = (com.google.crypto.tink.shaded.protobuf.ProtoSyntax) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ProtoSyntax[] values() {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax[] r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax[] r0 = (com.google.crypto.tink.shaded.protobuf.ProtoSyntax[]) r0
            return r0
    }
}
