package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteOutput {
    public ByteOutput() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void write(byte r1) throws java.io.IOException;

    public abstract void write(java.nio.ByteBuffer r1) throws java.io.IOException;

    public abstract void write(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException;

    public abstract void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException;
}
