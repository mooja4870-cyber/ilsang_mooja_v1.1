package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FloatVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public FloatVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public androidx.emoji2.text.flatbuffer.FloatVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 4
            r1.__reset(r2, r0, r3)
            return r1
    }

    public float get(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.__element(r3)
            float r0 = r0.getFloat(r1)
            return r0
    }
}
