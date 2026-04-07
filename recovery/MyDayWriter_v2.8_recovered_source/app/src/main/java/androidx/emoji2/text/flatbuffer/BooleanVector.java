package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public BooleanVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.BooleanVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 1
            r1.__reset(r2, r0, r3)
            return r1
    }

    public boolean get(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.__element(r3)
            byte r0 = r0.get(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
