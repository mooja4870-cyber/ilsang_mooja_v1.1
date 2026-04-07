package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private com.google.crypto.tink.shaded.protobuf.MessageLite unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public static class InvalidWireTypeException extends com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public InvalidProtocolBufferException(java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            r0 = 0
            r1.unfinishedMessage = r0
            return
    }

    public InvalidProtocolBufferException(java.lang.Exception r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            r0 = 0
            r1.unfinishedMessage = r0
            return
    }

    public InvalidProtocolBufferException(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.unfinishedMessage = r0
            return
    }

    public InvalidProtocolBufferException(java.lang.String r2, java.io.IOException r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.unfinishedMessage = r0
            return
    }

    public InvalidProtocolBufferException(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.unfinishedMessage = r0
            return
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidEndTag() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidTag() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidUtf8() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException malformedVarint() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException negativeSize() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException parseFailure() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException recursionLimitExceeded() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException sizeLimitExceeded() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException truncatedMessage() {
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    boolean getThrownFromInputStream() {
            r1 = this;
            boolean r0 = r1.wasThrownFromInputStream
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite getUnfinishedMessage() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.unfinishedMessage
            return r0
    }

    void setThrownFromInputStream() {
            r1 = this;
            r0 = 1
            r1.wasThrownFromInputStream = r0
            return
    }

    public com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException setUnfinishedMessage(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            r0 = this;
            r0.unfinishedMessage = r1
            return r0
    }

    public java.io.IOException unwrapIOException() {
            r1 = this;
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r1.getCause()
            java.io.IOException r0 = (java.io.IOException) r0
            goto L10
        Lf:
            r0 = r1
        L10:
            return r0
    }
}
