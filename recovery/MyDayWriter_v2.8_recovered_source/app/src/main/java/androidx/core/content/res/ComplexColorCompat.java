package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ComplexColorCompat {
    private static final java.lang.String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final android.content.res.ColorStateList mColorStateList;
    private final android.graphics.Shader mShader;

    private ComplexColorCompat(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mShader = r1
            r0.mColorStateList = r2
            r0.mColor = r3
            return
    }

    private static androidx.core.content.res.ComplexColorCompat createFromXml(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            android.content.res.XmlResourceParser r0 = r7.getXml(r8)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)
        L8:
            int r2 = r0.next()
            r3 = r2
            r4 = 1
            r5 = 2
            if (r2 == r5) goto L14
            if (r3 == r4) goto L14
            goto L8
        L14:
            if (r3 != r5) goto L6c
            java.lang.String r2 = r0.getName()
            int r5 = r2.hashCode()
            switch(r5) {
                case 89650992: goto L2c;
                case 1191572447: goto L22;
                default: goto L21;
            }
        L21:
            goto L35
        L22:
            java.lang.String r4 = "selector"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L21
            r4 = 0
            goto L36
        L2c:
            java.lang.String r5 = "gradient"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L21
            goto L36
        L35:
            r4 = -1
        L36:
            switch(r4) {
                case 0: goto L63;
                case 1: goto L5a;
                default: goto L39;
            }
        L39:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ": unsupported complex color tag "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5a:
            android.graphics.Shader r4 = androidx.core.content.res.GradientColorInflaterCompat.createFromXmlInner(r7, r0, r1, r9)
            androidx.core.content.res.ComplexColorCompat r4 = from(r4)
            return r4
        L63:
            android.content.res.ColorStateList r4 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXmlInner(r7, r0, r1, r9)
            androidx.core.content.res.ComplexColorCompat r4 = from(r4)
            return r4
        L6c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r2.<init>(r4)
            throw r2
    }

    static androidx.core.content.res.ComplexColorCompat from(int r2) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            r0.<init>(r1, r1, r2)
            return r0
    }

    static androidx.core.content.res.ComplexColorCompat from(android.content.res.ColorStateList r3) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            int r2 = r3.getDefaultColor()
            r0.<init>(r1, r3, r2)
            return r0
    }

    static androidx.core.content.res.ComplexColorCompat from(android.graphics.Shader r3) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static androidx.core.content.res.ComplexColorCompat inflate(android.content.res.Resources r3, int r4, android.content.res.Resources.Theme r5) {
            androidx.core.content.res.ComplexColorCompat r0 = createFromXml(r3, r4, r5)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    public int getColor() {
            r1 = this;
            int r0 = r1.mColor
            return r0
    }

    public android.graphics.Shader getShader() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            return r0
    }

    public boolean isGradient() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStateful() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            if (r0 != 0) goto L12
            android.content.res.ColorStateList r0 = r1.mColorStateList
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = r1.mColorStateList
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean onStateChanged(int[] r4) {
            r3 = this;
            r0 = 0
            boolean r1 = r3.isStateful()
            if (r1 == 0) goto L1a
            android.content.res.ColorStateList r1 = r3.mColorStateList
            android.content.res.ColorStateList r2 = r3.mColorStateList
            int r2 = r2.getDefaultColor()
            int r1 = r1.getColorForState(r4, r2)
            int r2 = r3.mColor
            if (r1 == r2) goto L1a
            r0 = 1
            r3.mColor = r1
        L1a:
            return r0
    }

    public void setColor(int r1) {
            r0 = this;
            r0.mColor = r1
            return
    }

    public boolean willDraw() {
            r1 = this;
            boolean r0 = r1.isGradient()
            if (r0 != 0) goto Ld
            int r0 = r1.mColor
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }
}
