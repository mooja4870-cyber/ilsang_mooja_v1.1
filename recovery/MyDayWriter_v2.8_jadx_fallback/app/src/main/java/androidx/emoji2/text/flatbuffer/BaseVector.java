package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class BaseVector {
    protected java.nio.ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public BaseVector() {
            r0 = this;
            r0.<init>()
            return
    }

    protected int __element(int r3) {
            r2 = this;
            int r0 = r2.vector
            int r1 = r2.element_size
            int r1 = r1 * r3
            int r0 = r0 + r1
            return r0
    }

    protected void __reset(int r3, int r4, java.nio.ByteBuffer r5) {
            r2 = this;
            r2.bb = r5
            java.nio.ByteBuffer r0 = r2.bb
            if (r0 == 0) goto L15
            r2.vector = r3
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r3 + (-4)
            int r0 = r0.getInt(r1)
            r2.length = r0
            r2.element_size = r4
            goto L1c
        L15:
            r0 = 0
            r2.vector = r0
            r2.length = r0
            r2.element_size = r0
        L1c:
            return
    }

    protected int __vector() {
            r1 = this;
            int r0 = r1.vector
            return r0
    }

    public int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r0, r1)
            return
    }
}
