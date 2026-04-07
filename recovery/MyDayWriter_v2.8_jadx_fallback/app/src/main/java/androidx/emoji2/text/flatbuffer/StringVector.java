package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class StringVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    private androidx.emoji2.text.flatbuffer.Utf8 utf8;

    public StringVector() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    public androidx.emoji2.text.flatbuffer.StringVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public java.lang.String get(int r4) {
            r3 = this;
            int r0 = r3.__element(r4)
            java.nio.ByteBuffer r1 = r3.bb
            androidx.emoji2.text.flatbuffer.Utf8 r2 = r3.utf8
            java.lang.String r0 = androidx.emoji2.text.flatbuffer.Table.__string(r0, r1, r2)
            return r0
    }
}
