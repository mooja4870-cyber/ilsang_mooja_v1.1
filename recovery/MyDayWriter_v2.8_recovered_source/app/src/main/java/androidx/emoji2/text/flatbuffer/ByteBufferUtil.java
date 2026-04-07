package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferUtil {
    public ByteBufferUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSizePrefix(java.nio.ByteBuffer r1) {
            int r0 = r1.position()
            int r0 = r1.getInt(r0)
            return r0
    }

    public static java.nio.ByteBuffer removeSizePrefix(java.nio.ByteBuffer r2) {
            java.nio.ByteBuffer r0 = r2.duplicate()
            int r1 = r0.position()
            int r1 = r1 + 4
            r0.position(r1)
            return r0
    }
}
