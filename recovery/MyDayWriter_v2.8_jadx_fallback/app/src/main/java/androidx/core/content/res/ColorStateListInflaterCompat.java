package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ColorStateListInflaterCompat {
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue = r0
            return
    }

    private ColorStateListInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            android.content.res.ColorStateList r1 = createFromXmlInner(r4, r5, r0, r6)
            return r1
        L17:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "No start tag found"
            r1.<init>(r3)
            throw r1
    }

    public static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            android.content.res.ColorStateList r1 = inflate(r4, r5, r6, r7)
            return r1
        L11:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L15
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = r1
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue
            r1.set(r0)
        L15:
            return r0
    }

    public static android.content.res.ColorStateList inflate(android.content.res.Resources r3, int r4, android.content.res.Resources.Theme r5) {
            android.content.res.XmlResourceParser r0 = r3.getXml(r4)     // Catch: java.lang.Exception -> L9
            android.content.res.ColorStateList r1 = createFromXml(r3, r0, r5)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r0 = move-exception
            java.lang.String r1 = "CSLCompat"
            java.lang.String r2 = "Failed to inflate ColorStateList."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private static android.content.res.ColorStateList inflate(android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = r20
            r2 = r22
            r3 = r23
            int r0 = r21.getDepth()
            r4 = 1
            int r5 = r0 + 1
            r0 = 20
            int[][] r0 = new int[r0][]
            int r6 = r0.length
            int[] r6 = new int[r6]
            r7 = 0
            r8 = r7
            r7 = r6
            r6 = r0
        L18:
            int r0 = r21.next()
            r9 = r0
            if (r0 == r4) goto L127
            int r0 = r21.getDepth()
            r11 = r0
            if (r0 >= r5) goto L30
            r0 = 3
            if (r9 == r0) goto L2a
            goto L30
        L2a:
            r16 = r5
            r17 = r9
            goto L12b
        L30:
            r0 = 2
            if (r9 != r0) goto L11a
            if (r11 > r5) goto L11a
            java.lang.String r0 = r21.getName()
            java.lang.String r12 = "item"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L45
            r16 = r5
            goto L11e
        L45:
            int[] r0 = androidx.core.R.styleable.ColorStateListItem
            android.content.res.TypedArray r12 = obtainAttributes(r1, r3, r2, r0)
            int r0 = androidx.core.R.styleable.ColorStateListItem_android_color
            r13 = -1
            int r14 = r12.getResourceId(r0, r13)
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r14 == r13) goto L72
            boolean r0 = isColorInt(r1, r14)
            if (r0 != 0) goto L72
            android.content.res.XmlResourceParser r0 = r1.getXml(r14)     // Catch: java.lang.Exception -> L6a
            android.content.res.ColorStateList r0 = createFromXml(r1, r0, r3)     // Catch: java.lang.Exception -> L6a
            int r0 = r0.getDefaultColor()     // Catch: java.lang.Exception -> L6a
            goto L71
        L6a:
            r0 = move-exception
            int r13 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r0 = r12.getColor(r13, r15)
        L71:
            goto L78
        L72:
            int r0 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r0 = r12.getColor(r0, r15)
        L78:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r15 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            boolean r15 = r12.hasValue(r15)
            if (r15 == 0) goto L89
            int r15 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            float r13 = r12.getFloat(r15, r13)
            goto L97
        L89:
            int r15 = androidx.core.R.styleable.ColorStateListItem_alpha
            boolean r15 = r12.hasValue(r15)
            if (r15 == 0) goto L97
            int r15 = androidx.core.R.styleable.ColorStateListItem_alpha
            float r13 = r12.getFloat(r15, r13)
        L97:
            int r15 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r15 < r4) goto Lae
            int r4 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            boolean r4 = r12.hasValue(r4)
            if (r4 == 0) goto Lae
            int r4 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            float r4 = r12.getFloat(r4, r10)
            goto Lb4
        Lae:
            int r4 = androidx.core.R.styleable.ColorStateListItem_lStar
            float r4 = r12.getFloat(r4, r10)
        Lb4:
            r12.recycle()
            r10 = 0
            int r15 = r2.getAttributeCount()
            int[] r1 = new int[r15]
            r16 = 0
            r3 = r16
        Lc2:
            if (r3 >= r15) goto Lf7
            r16 = r5
            int r5 = r2.getAttributeNameResource(r3)
            r17 = r9
            r9 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r5 == r9) goto Lf0
            r9 = 16843551(0x101031f, float:2.3695797E-38)
            if (r5 == r9) goto Lf0
            int r9 = androidx.core.R.attr.alpha
            if (r5 == r9) goto Lf0
            int r9 = androidx.core.R.attr.lStar
            if (r5 == r9) goto Lf0
            int r9 = r10 + 1
            r18 = r9
            r9 = 0
            boolean r19 = r2.getAttributeBooleanValue(r3, r9)
            if (r19 == 0) goto Leb
            r9 = r5
            goto Lec
        Leb:
            int r9 = -r5
        Lec:
            r1[r10] = r9
            r10 = r18
        Lf0:
            int r3 = r3 + 1
            r5 = r16
            r9 = r17
            goto Lc2
        Lf7:
            r16 = r5
            r17 = r9
            int[] r1 = android.util.StateSet.trimStateSet(r1, r10)
            int r3 = modulateColorAlpha(r0, r13, r4)
            int[] r7 = androidx.core.content.res.GrowingArrayUtils.append(r7, r8, r3)
            java.lang.Object[] r5 = androidx.core.content.res.GrowingArrayUtils.append(r6, r8, r1)
            r6 = r5
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
            r1 = r20
            r3 = r23
            r5 = r16
            r4 = 1
            goto L18
        L11a:
            r16 = r5
            r17 = r9
        L11e:
            r1 = r20
            r3 = r23
            r5 = r16
            r4 = 1
            goto L18
        L127:
            r16 = r5
            r17 = r9
        L12b:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r9 = 0
            java.lang.System.arraycopy(r7, r9, r0, r9, r8)
            java.lang.System.arraycopy(r6, r9, r1, r9, r8)
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r3.<init>(r1, r0)
            return r3
    }

    private static boolean isColorInt(android.content.res.Resources r4, int r5) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r4.getValue(r5, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L15
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private static int modulateColorAlpha(int r6, float r7, float r8) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto Le
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            if (r0 != 0) goto L18
            return r6
        L18:
            int r2 = android.graphics.Color.alpha(r6)
            float r3 = (float) r2
            float r3 = r3 * r7
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            r4 = 255(0xff, float:3.57E-43)
            int r1 = androidx.core.math.MathUtils.clamp(r3, r1, r4)
            if (r0 == 0) goto L3a
            androidx.core.content.res.CamColor r3 = androidx.core.content.res.CamColor.fromColor(r6)
            float r4 = r3.getHue()
            float r5 = r3.getChroma()
            int r6 = androidx.core.content.res.CamColor.toColor(r4, r5, r8)
        L3a:
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r6
            int r4 = r1 << 24
            r3 = r3 | r4
            return r3
    }

    private static android.content.res.TypedArray obtainAttributes(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, int[] r4) {
            if (r2 != 0) goto L7
            android.content.res.TypedArray r0 = r1.obtainAttributes(r3, r4)
            goto Lc
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r3, r4, r0, r0)
        Lc:
            return r0
    }
}
