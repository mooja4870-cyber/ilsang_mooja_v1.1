package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class TypedArrayUtils {
    private static final java.lang.String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAttr(android.content.Context r3, int r4, int r5) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r2 = 1
            r1.resolveAttribute(r4, r0, r2)
            int r1 = r0.resourceId
            if (r1 == 0) goto L12
            return r4
        L12:
            return r5
    }

    public static boolean getBoolean(android.content.res.TypedArray r2, int r3, int r4, boolean r5) {
            boolean r0 = r2.getBoolean(r4, r5)
            boolean r1 = r2.getBoolean(r3, r0)
            return r1
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.TypedArray r1, int r2, int r3) {
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2)
            if (r0 != 0) goto La
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r3)
        La:
            return r0
    }

    public static int getInt(android.content.res.TypedArray r2, int r3, int r4, int r5) {
            int r0 = r2.getInt(r4, r5)
            int r1 = r2.getInt(r3, r0)
            return r1
    }

    public static boolean getNamedBoolean(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5, boolean r6) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L7
            return r6
        L7:
            boolean r1 = r2.getBoolean(r5, r6)
            return r1
    }

    public static int getNamedColor(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5, int r6) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L7
            return r6
        L7:
            int r1 = r2.getColor(r5, r6)
            return r1
    }

    public static android.content.res.ColorStateList getNamedColorStateList(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6, java.lang.String r7, int r8) {
            boolean r0 = hasAttribute(r5, r7)
            if (r0 == 0) goto L55
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r4.getValue(r8, r0)
            int r1 = r0.type
            r2 = 2
            if (r1 == r2) goto L32
            int r1 = r0.type
            r2 = 28
            if (r1 < r2) goto L24
            int r1 = r0.type
            r2 = 31
            if (r1 > r2) goto L24
            android.content.res.ColorStateList r1 = getNamedColorStateListFromInt(r0)
            return r1
        L24:
            android.content.res.Resources r1 = r4.getResources()
            r2 = 0
            int r2 = r4.getResourceId(r8, r2)
            android.content.res.ColorStateList r1 = androidx.core.content.res.ColorStateListInflaterCompat.inflate(r1, r2, r6)
            return r1
        L32:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to resolve attribute at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L55:
            r0 = 0
            return r0
    }

    private static android.content.res.ColorStateList getNamedColorStateListFromInt(android.util.TypedValue r1) {
            int r0 = r1.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            return r0
    }

    public static androidx.core.content.res.ComplexColorCompat getNamedComplexColor(android.content.res.TypedArray r3, org.xmlpull.v1.XmlPullParser r4, android.content.res.Resources.Theme r5, java.lang.String r6, int r7, int r8) {
            boolean r0 = hasAttribute(r4, r6)
            if (r0 == 0) goto L31
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r7, r0)
            int r1 = r0.type
            r2 = 28
            if (r1 < r2) goto L21
            int r1 = r0.type
            r2 = 31
            if (r1 > r2) goto L21
            int r1 = r0.data
            androidx.core.content.res.ComplexColorCompat r1 = androidx.core.content.res.ComplexColorCompat.from(r1)
            return r1
        L21:
            android.content.res.Resources r1 = r3.getResources()
            r2 = 0
            int r2 = r3.getResourceId(r7, r2)
            androidx.core.content.res.ComplexColorCompat r1 = androidx.core.content.res.ComplexColorCompat.inflate(r1, r2, r5)
            if (r1 == 0) goto L31
            return r1
        L31:
            androidx.core.content.res.ComplexColorCompat r0 = androidx.core.content.res.ComplexColorCompat.from(r8)
            return r0
    }

    public static float getNamedFloat(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5, float r6) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L7
            return r6
        L7:
            float r1 = r2.getFloat(r5, r6)
            return r1
    }

    public static int getNamedInt(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5, int r6) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L7
            return r6
        L7:
            int r1 = r2.getInt(r5, r6)
            return r1
    }

    public static int getNamedResourceId(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5, int r6) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L7
            return r6
        L7:
            int r1 = r2.getResourceId(r5, r6)
            return r1
    }

    public static java.lang.String getNamedString(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r2.getString(r5)
            return r1
    }

    public static int getResourceId(android.content.res.TypedArray r2, int r3, int r4, int r5) {
            int r0 = r2.getResourceId(r4, r5)
            int r1 = r2.getResourceId(r3, r0)
            return r1
    }

    public static java.lang.String getString(android.content.res.TypedArray r1, int r2, int r3) {
            java.lang.String r0 = r1.getString(r2)
            if (r0 != 0) goto La
            java.lang.String r0 = r1.getString(r3)
        La:
            return r0
    }

    public static java.lang.CharSequence getText(android.content.res.TypedArray r1, int r2, int r3) {
            java.lang.CharSequence r0 = r1.getText(r2)
            if (r0 != 0) goto La
            java.lang.CharSequence r0 = r1.getText(r3)
        La:
            return r0
    }

    public static java.lang.CharSequence[] getTextArray(android.content.res.TypedArray r1, int r2, int r3) {
            java.lang.CharSequence[] r0 = r1.getTextArray(r2)
            if (r0 != 0) goto La
            java.lang.CharSequence[] r0 = r1.getTextArray(r3)
        La:
            return r0
    }

    public static boolean hasAttribute(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static android.content.res.TypedArray obtainAttributes(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, int[] r4) {
            if (r2 != 0) goto L7
            android.content.res.TypedArray r0 = r1.obtainAttributes(r3, r4)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r3, r4, r0, r0)
            return r0
    }

    public static android.util.TypedValue peekNamedValue(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, java.lang.String r4, int r5) {
            boolean r0 = hasAttribute(r3, r4)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.util.TypedValue r1 = r2.peekValue(r5)
            return r1
    }
}
