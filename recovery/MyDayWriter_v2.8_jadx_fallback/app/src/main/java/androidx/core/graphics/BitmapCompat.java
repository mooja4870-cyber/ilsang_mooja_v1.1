package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapCompat {

    static class Api27Impl {
        private Api27Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L1a
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r1 = r3.copy(r0, r1)
                return r1
            L1a:
                return r3
        }

        static android.graphics.Bitmap createBitmapWithSourceColorspace(int r5, int r6, android.graphics.Bitmap r7, boolean r8) {
                android.graphics.Bitmap$Config r0 = r7.getConfig()
                android.graphics.ColorSpace r1 = r7.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r8 == 0) goto L1e
                android.graphics.ColorSpace r3 = r7.getColorSpace()
                boolean r3 = r3.equals(r2)
                if (r3 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r3 = r7.getConfig()
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
                if (r3 != r4) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L32
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r7)
            L32:
                boolean r3 = r7.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r0, r3, r1)
                return r3
        }

        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r1 = r3.getColorSpace()
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L1a
                r1 = 1
                goto L1b
            L1a:
                r1 = 0
            L1b:
                return r1
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setPaintBlendMode(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap r2) {
                android.hardware.HardwareBuffer r0 = r2.getHardwareBuffer()
                int r0 = r0.getFormat()
                r1 = 22
                if (r0 != r1) goto Lf
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                return r0
            Lf:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                return r0
        }
    }

    private BitmapCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap r30, int r31, int r32, android.graphics.Rect r33, boolean r34) {
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            if (r1 <= 0) goto L24e
            if (r2 <= 0) goto L24e
            if (r3 == 0) goto L35
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r0.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r0.getHeight()
            if (r4 > r5) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "srcRect must be contained by srcBm!"
            r4.<init>(r5)
            throw r4
        L35:
            r4 = r30
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 27
            if (r5 < r6) goto L41
            android.graphics.Bitmap r4 = androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(r0)
        L41:
            if (r3 == 0) goto L48
            int r5 = r3.width()
            goto L4c
        L48:
            int r5 = r0.getWidth()
        L4c:
            if (r3 == 0) goto L53
            int r7 = r3.height()
            goto L57
        L53:
            int r7 = r0.getHeight()
        L57:
            float r8 = (float) r1
            float r9 = (float) r5
            float r8 = r8 / r9
            float r9 = (float) r2
            float r10 = (float) r7
            float r9 = r9 / r10
            if (r3 == 0) goto L62
            int r11 = r3.left
            goto L63
        L62:
            r11 = 0
        L63:
            if (r3 == 0) goto L68
            int r12 = r3.top
            goto L69
        L68:
            r12 = 0
        L69:
            r13 = 1
            if (r11 != 0) goto L8c
            if (r12 != 0) goto L8c
            int r14 = r0.getWidth()
            if (r1 != r14) goto L8c
            int r14 = r0.getHeight()
            if (r2 != r14) goto L8c
            boolean r6 = r0.isMutable()
            if (r6 == 0) goto L8b
            if (r0 != r4) goto L8b
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            android.graphics.Bitmap r6 = r0.copy(r6, r13)
            return r6
        L8b:
            return r4
        L8c:
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>(r13)
            r14.setFilterBitmap(r13)
            int r15 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r15 < r10) goto L9e
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(r14)
            goto La8
        L9e:
            android.graphics.PorterDuffXfermode r10 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.SRC
            r10.<init>(r15)
            r14.setXfermode(r10)
        La8:
            if (r5 != r1) goto Lc1
            if (r7 != r2) goto Lc1
            android.graphics.Bitmap$Config r6 = r4.getConfig()
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r1, r2, r6)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r6)
            int r13 = -r11
            float r13 = (float) r13
            int r15 = -r12
            float r15 = (float) r15
            r10.drawBitmap(r4, r13, r15, r14)
            return r6
        Lc1:
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r17 = java.lang.Math.log(r17)
            r10 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 <= 0) goto Ldd
            r19 = r10
            r15 = r11
            double r10 = (double) r8
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r17
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            goto Lec
        Ldd:
            r19 = r10
            r15 = r11
            double r10 = (double) r8
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r17
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
        Lec:
            int r11 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r11 <= 0) goto Lff
            r11 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r17
            double r13 = java.lang.Math.ceil(r13)
            int r13 = (int) r13
            goto L10c
        Lff:
            r11 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r17
            double r13 = java.lang.Math.floor(r13)
            int r13 = (int) r13
        L10c:
            r14 = r10
            r20 = r13
            r21 = 0
            r22 = 0
            if (r34 == 0) goto L16d
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L164
            boolean r3 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r0)
            if (r3 != 0) goto L164
            if (r10 <= 0) goto L128
            r3 = 1
            int r19 = sizeAtStep(r5, r1, r3, r14)
            goto L12b
        L128:
            r3 = 1
            r19 = r5
        L12b:
            r23 = r19
            if (r13 <= 0) goto L136
            r6 = r20
            int r20 = sizeAtStep(r7, r2, r3, r6)
            goto L13a
        L136:
            r6 = r20
            r20 = r7
        L13a:
            r24 = r20
            r20 = r8
            r8 = r23
            r23 = r9
            r9 = r24
            r24 = r10
            android.graphics.Bitmap r10 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r8, r9, r0, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r10)
            r25 = r8
            int r8 = -r15
            float r8 = (float) r8
            r26 = r9
            int r9 = -r12
            float r9 = (float) r9
            r3.drawBitmap(r4, r8, r9, r11)
            r8 = 0
            r12 = 0
            r9 = r10
            r21 = r4
            r4 = r9
            r22 = 1
            r15 = r8
            goto L175
        L164:
            r23 = r9
            r24 = r10
            r6 = r20
            r20 = r8
            goto L175
        L16d:
            r23 = r9
            r24 = r10
            r6 = r20
            r20 = r8
        L175:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r15, r12, r5, r7)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r9 = r21
            r10 = r24
        L183:
            if (r10 != 0) goto L190
            if (r13 == 0) goto L188
            goto L190
        L188:
            if (r9 == r0) goto L18f
            if (r9 == 0) goto L18f
            r9.recycle()
        L18f:
            return r4
        L190:
            if (r10 >= 0) goto L195
            int r10 = r10 + 1
            goto L199
        L195:
            if (r10 <= 0) goto L199
            int r10 = r10 + (-1)
        L199:
            if (r13 >= 0) goto L19e
            int r13 = r13 + 1
            goto L1a2
        L19e:
            if (r13 <= 0) goto L1a2
            int r13 = r13 + (-1)
        L1a2:
            r21 = r12
            int r12 = sizeAtStep(r5, r1, r10, r14)
            r24 = r10
            int r10 = sizeAtStep(r7, r2, r13, r6)
            r25 = r13
            r13 = 0
            r8.set(r13, r13, r12, r10)
            if (r24 != 0) goto L1bb
            if (r25 != 0) goto L1bb
            r16 = 1
            goto L1bd
        L1bb:
            r16 = r13
        L1bd:
            if (r9 == 0) goto L1cd
            int r13 = r9.getWidth()
            if (r13 != r1) goto L1cd
            int r13 = r9.getHeight()
            if (r13 != r2) goto L1cd
            r13 = 1
            goto L1ce
        L1cd:
            r13 = 0
        L1ce:
            if (r9 == 0) goto L1f5
            if (r9 == r0) goto L1f5
            if (r34 == 0) goto L1e5
            r27 = r10
            int r10 = android.os.Build.VERSION.SDK_INT
            r28 = r12
            r12 = 27
            if (r10 < r12) goto L1e9
            boolean r10 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r9)
            if (r10 == 0) goto L1ef
            goto L1e9
        L1e5:
            r27 = r10
            r28 = r12
        L1e9:
            if (r16 == 0) goto L1f0
            if (r13 == 0) goto L1ef
            if (r22 == 0) goto L1f0
        L1ef:
            goto L1f9
        L1f0:
            r29 = r5
            r5 = 27
            goto L232
        L1f5:
            r27 = r10
            r28 = r12
        L1f9:
            if (r9 == r0) goto L200
            if (r9 == 0) goto L200
            r9.recycle()
        L200:
            r10 = r22
            if (r24 <= 0) goto L206
            r12 = r10
            goto L208
        L206:
            r12 = r24
        L208:
            int r12 = sizeAtStep(r5, r1, r12, r14)
            if (r25 <= 0) goto L210
            r1 = r10
            goto L212
        L210:
            r1 = r25
        L212:
            int r1 = sizeAtStep(r7, r2, r1, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r29 = r5
            r5 = 27
            if (r2 < r5) goto L22a
            if (r34 == 0) goto L224
            if (r16 != 0) goto L224
            r2 = 1
            goto L225
        L224:
            r2 = 0
        L225:
            android.graphics.Bitmap r9 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r12, r1, r0, r2)
            goto L232
        L22a:
            android.graphics.Bitmap$Config r2 = r4.getConfig()
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r1, r2)
        L232:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            r1.drawBitmap(r4, r3, r8, r11)
            r2 = r4
            r4 = r9
            r9 = r2
            r3.set(r8)
            r1 = r31
            r2 = r32
            r12 = r21
            r13 = r25
            r5 = r29
            r10 = r24
            goto L183
        L24e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dstW and dstH must be > 0!"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.getAllocationByteCount()")
    @java.lang.Deprecated
    public static int getAllocationByteCount(android.graphics.Bitmap r1) {
            int r0 = r1.getAllocationByteCount()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.hasMipMap()")
    @java.lang.Deprecated
    public static boolean hasMipMap(android.graphics.Bitmap r1) {
            boolean r0 = r1.hasMipMap()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.setHasMipMap(hasMipMap)")
    @java.lang.Deprecated
    public static void setHasMipMap(android.graphics.Bitmap r0, boolean r1) {
            r0.setHasMipMap(r1)
            return
    }

    static int sizeAtStep(int r2, int r3, int r4, int r5) {
            if (r4 != 0) goto L3
            return r3
        L3:
            r0 = 1
            if (r4 <= 0) goto Lb
            int r1 = r5 - r4
            int r0 = r0 << r1
            int r0 = r0 * r2
            return r0
        Lb:
            int r1 = -r4
            int r1 = r1 - r0
            int r0 = r3 << r1
            return r0
    }
}
