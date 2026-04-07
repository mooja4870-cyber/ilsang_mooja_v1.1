package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Struct {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;

    public Struct() {
            r0 = this;
            r0.<init>()
            return
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    protected void __reset(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r1.bb = r3
            java.nio.ByteBuffer r0 = r1.bb
            if (r0 == 0) goto L9
            r1.bb_pos = r2
            goto Lc
        L9:
            r0 = 0
            r1.bb_pos = r0
        Lc:
            return
    }
}
