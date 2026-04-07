package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ShortVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public ShortVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.ShortVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 2
            r1.__reset(r2, r0, r3)
            return r1
    }

    public short get(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.__element(r3)
            short r0 = r0.getShort(r1)
            return r0
    }

    public int getAsUnsigned(int r3) {
            r2 = this;
            short r0 = r2.get(r3)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }
}
