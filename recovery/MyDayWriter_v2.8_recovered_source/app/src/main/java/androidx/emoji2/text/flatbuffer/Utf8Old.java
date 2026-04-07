package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Utf8Old extends androidx.emoji2.text.flatbuffer.Utf8 {
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old.Cache> CACHE = null;

    private static class Cache {
        final java.nio.charset.CharsetDecoder decoder;
        final java.nio.charset.CharsetEncoder encoder;
        java.lang.CharSequence lastInput;
        java.nio.ByteBuffer lastOutput;

        Cache() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.lastInput = r0
                r1.lastOutput = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
                r1.encoder = r0
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
                r1.decoder = r0
                return
        }
    }

    static {
            androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0 r0 = new androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1 r1 = new androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1
            r1.<init>(r0)
            androidx.emoji2.text.flatbuffer.Utf8Old.CACHE = r1
            return
    }

    public Utf8Old() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.Utf8Old.Cache lambda$static$0() {
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = new androidx.emoji2.text.flatbuffer.Utf8Old$Cache
            r0.<init>()
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r5, int r6, int r7) {
            r4 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            java.nio.charset.CharsetDecoder r0 = r0.decoder
            r0.reset()
            java.nio.ByteBuffer r5 = r5.duplicate()
            r5.position(r6)
            int r1 = r6 + r7
            r5.limit(r1)
            java.nio.CharBuffer r1 = r0.decode(r5)     // Catch: java.nio.charset.CharacterCodingException -> L22
            java.lang.String r2 = r1.toString()     // Catch: java.nio.charset.CharacterCodingException -> L22
            return r2
        L22:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Bad encoding"
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence r3, java.nio.ByteBuffer r4) {
            r2 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            java.lang.CharSequence r1 = r0.lastInput
            if (r1 == r3) goto Lf
            r2.encodedLength(r3)
        Lf:
            java.nio.ByteBuffer r1 = r0.lastOutput
            r4.put(r1)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence r8) {
            r7 = this;
            java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old$Cache> r0 = androidx.emoji2.text.flatbuffer.Utf8Old.CACHE
            java.lang.Object r0 = r0.get()
            androidx.emoji2.text.flatbuffer.Utf8Old$Cache r0 = (androidx.emoji2.text.flatbuffer.Utf8Old.Cache) r0
            int r1 = r8.length()
            float r1 = (float) r1
            java.nio.charset.CharsetEncoder r2 = r0.encoder
            float r2 = r2.maxBytesPerChar()
            float r1 = r1 * r2
            int r1 = (int) r1
            java.nio.ByteBuffer r2 = r0.lastOutput
            if (r2 == 0) goto L21
            java.nio.ByteBuffer r2 = r0.lastOutput
            int r2 = r2.capacity()
            if (r2 >= r1) goto L2d
        L21:
            r2 = 128(0x80, float:1.8E-43)
            int r2 = java.lang.Math.max(r2, r1)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r0.lastOutput = r2
        L2d:
            java.nio.ByteBuffer r2 = r0.lastOutput
            r2.clear()
            r0.lastInput = r8
            boolean r2 = r8 instanceof java.nio.CharBuffer
            if (r2 == 0) goto L3c
            r2 = r8
            java.nio.CharBuffer r2 = (java.nio.CharBuffer) r2
            goto L40
        L3c:
            java.nio.CharBuffer r2 = java.nio.CharBuffer.wrap(r8)
        L40:
            java.nio.charset.CharsetEncoder r3 = r0.encoder
            java.nio.ByteBuffer r4 = r0.lastOutput
            r5 = 1
            java.nio.charset.CoderResult r3 = r3.encode(r2, r4, r5)
            boolean r4 = r3.isError()
            if (r4 == 0) goto L5d
            r3.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L54
            goto L5d
        L54:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bad character encoding"
            r5.<init>(r6, r4)
            throw r5
        L5d:
            java.nio.ByteBuffer r4 = r0.lastOutput
            r4.flip()
            java.nio.ByteBuffer r4 = r0.lastOutput
            int r4 = r4.remaining()
            return r4
    }
}
