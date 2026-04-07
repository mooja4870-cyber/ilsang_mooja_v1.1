package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class GradientColorInflaterCompat {
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    static final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(int r2, int r3) {
                r1 = this;
                r1.<init>()
                int[] r0 = new int[]{r2, r3}
                r1.mColors = r0
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r1.mOffsets = r0
                return
        }

        ColorStops(int r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                int[] r0 = new int[]{r2, r3, r4}
                r1.mColors = r0
                r0 = 3
                float[] r0 = new float[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
                r1.mOffsets = r0
                return
        }

        ColorStops(java.util.List<java.lang.Integer> r5, java.util.List<java.lang.Float> r6) {
                r4 = this;
                r4.<init>()
                int r0 = r5.size()
                int[] r1 = new int[r0]
                r4.mColors = r1
                float[] r1 = new float[r0]
                r4.mOffsets = r1
                r1 = 0
            L10:
                if (r1 >= r0) goto L31
                int[] r2 = r4.mColors
                java.lang.Object r3 = r5.get(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2[r1] = r3
                float[] r2 = r4.mOffsets
                java.lang.Object r3 = r6.get(r1)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2[r1] = r3
                int r1 = r1 + 1
                goto L10
            L31:
                return
        }
    }

    private GradientColorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops checkColors(androidx.core.content.res.GradientColorInflaterCompat.ColorStops r1, int r2, int r3, boolean r4, int r5) {
            if (r1 == 0) goto L3
            return r1
        L3:
            if (r4 == 0) goto Lb
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r2, r5, r3)
            return r0
        Lb:
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r2, r3)
            return r0
    }

    static android.graphics.Shader createFromXml(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = r1
            r3 = 2
            if (r1 == r3) goto L10
            r1 = 1
            if (r2 == r1) goto L10
            goto L4
        L10:
            if (r2 != r3) goto L17
            android.graphics.Shader r1 = createFromXmlInner(r4, r5, r0, r6)
            return r1
        L17:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "No start tag found"
            r1.<init>(r3)
            throw r1
    }

    static android.graphics.Shader createFromXmlInner(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r0 = r24
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld6
            int[] r2 = androidx.core.R.styleable.GradientColor
            r3 = r23
            r4 = r25
            r5 = r26
            android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r5, r4, r2)
            java.lang.String r6 = "startX"
            int r7 = androidx.core.R.styleable.GradientColor_android_startX
            r8 = 0
            float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r6 = "startY"
            int r7 = androidx.core.R.styleable.GradientColor_android_startY
            float r11 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r6 = "endX"
            int r7 = androidx.core.R.styleable.GradientColor_android_endX
            float r12 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r6 = "endY"
            int r7 = androidx.core.R.styleable.GradientColor_android_endY
            float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r6 = "centerX"
            int r7 = androidx.core.R.styleable.GradientColor_android_centerX
            float r15 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r6 = "centerY"
            int r7 = androidx.core.R.styleable.GradientColor_android_centerY
            float r6 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r7 = "type"
            int r9 = androidx.core.R.styleable.GradientColor_android_type
            r14 = 0
            int r7 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r2, r0, r7, r9, r14)
            java.lang.String r9 = "startColor"
            int r8 = androidx.core.R.styleable.GradientColor_android_startColor
            int r8 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r8, r14)
            java.lang.String r9 = "centerColor"
            boolean r14 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r0, r9)
            int r3 = androidx.core.R.styleable.GradientColor_android_centerColor
            r4 = 0
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r3, r4)
            java.lang.String r9 = "endColor"
            int r5 = androidx.core.R.styleable.GradientColor_android_endColor
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r5, r4)
            java.lang.String r9 = "tileMode"
            r21 = r7
            int r7 = androidx.core.R.styleable.GradientColor_android_tileMode
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r2, r0, r9, r7, r4)
            java.lang.String r7 = "gradientRadius"
            int r9 = androidx.core.R.styleable.GradientColor_android_gradientRadius
            r22 = r4
            r4 = 0
            float r17 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r7, r9, r4)
            r2.recycle()
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r4 = inflateChildElements(r23, r24, r25, r26)
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r4 = checkColors(r4, r8, r5, r14, r3)
            switch(r21) {
                case 1: goto Laf;
                case 2: goto La5;
                default: goto L94;
            }
        L94:
            r7 = r6
            r0 = r14
            r6 = r15
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient
            int[] r14 = r4.mColors
            float[] r15 = r4.mOffsets
            android.graphics.Shader$TileMode r16 = parseTileMode(r22)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        La5:
            android.graphics.SweepGradient r7 = new android.graphics.SweepGradient
            int[] r9 = r4.mColors
            float[] r0 = r4.mOffsets
            r7.<init>(r15, r6, r9, r0)
            return r7
        Laf:
            r16 = 0
            int r0 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r0 <= 0) goto Lcd
            r0 = r14
            android.graphics.RadialGradient r14 = new android.graphics.RadialGradient
            int[] r7 = r4.mColors
            float[] r9 = r4.mOffsets
            android.graphics.Shader$TileMode r20 = parseTileMode(r22)
            r16 = r6
            r18 = r7
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r6 = r15
            r7 = r16
            return r14
        Lcd:
            r0 = r14
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r14 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r9.<init>(r14)
            throw r9
        Ld6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r24.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": invalid gradient color tag "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops inflateChildElements(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r13.next()
            r5 = r3
            if (r3 == r1) goto L89
            int r3 = r13.getDepth()
            r6 = r3
            if (r3 >= r0) goto L23
            r3 = 3
            if (r5 == r3) goto L89
        L23:
            r3 = 2
            if (r5 == r3) goto L27
            goto L12
        L27:
            if (r6 > r0) goto L12
            java.lang.String r3 = r13.getName()
            java.lang.String r7 = "item"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L36
            goto L12
        L36:
            int[] r3 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r12, r15, r14, r3)
            int r7 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r7 = r3.hasValue(r7)
            int r8 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r8)
            if (r7 == 0) goto L6c
            if (r8 == 0) goto L6c
            int r9 = androidx.core.R.styleable.GradientColorItem_android_color
            r10 = 0
            int r9 = r3.getColor(r9, r10)
            int r10 = androidx.core.R.styleable.GradientColorItem_android_offset
            r11 = 0
            float r10 = r3.getFloat(r10, r11)
            r3.recycle()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r4.add(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            r2.add(r11)
            goto L12
        L6c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r13.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r1.<init>(r9)
            throw r1
        L89:
            int r1 = r4.size()
            if (r1 <= 0) goto L95
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r1 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r1.<init>(r4, r2)
            return r1
        L95:
            r1 = 0
            return r1
    }

    private static android.graphics.Shader.TileMode parseTileMode(int r1) {
            switch(r1) {
                case 1: goto L9;
                case 2: goto L6;
                default: goto L3;
            }
        L3:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            return r0
        L6:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            return r0
        L9:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            return r0
    }
}
