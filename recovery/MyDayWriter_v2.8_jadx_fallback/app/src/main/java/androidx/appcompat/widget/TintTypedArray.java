package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TintTypedArray {
    private final android.content.Context mContext;
    private android.util.TypedValue mTypedValue;
    private final android.content.res.TypedArray mWrapped;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getChangingConfigurations(android.content.res.TypedArray r1) {
                int r0 = r1.getChangingConfigurations()
                return r0
        }

        static int getType(android.content.res.TypedArray r1, int r2) {
                int r0 = r1.getType(r2)
                return r0
        }
    }

    private TintTypedArray(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mWrapped = r2
            return
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r2, int r3, int[] r4) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r4)
            r0.<init>(r2, r1)
            return r0
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r2, android.util.AttributeSet r3, int[] r4) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r4)
            r0.<init>(r2, r1)
            return r0
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5, int r6) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r4, r5, r6)
            r0.<init>(r2, r1)
            return r0
    }

    public boolean getBoolean(int r2, boolean r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r0 = r0.getBoolean(r2, r3)
            return r0
    }

    public int getChangingConfigurations() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = androidx.appcompat.widget.TintTypedArray.Api21Impl.getChangingConfigurations(r0)
            return r0
    }

    public int getColor(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getColor(r2, r3)
            return r0
    }

    public android.content.res.ColorStateList getColorStateList(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.mContext
            android.content.res.ColorStateList r1 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r1 == 0) goto L1a
            return r1
        L1a:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            return r0
    }

    public float getDimension(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r0 = r0.getDimension(r2, r3)
            return r0
    }

    public int getDimensionPixelOffset(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getDimensionPixelOffset(r2, r3)
            return r0
    }

    public int getDimensionPixelSize(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getDimensionPixelSize(r2, r3)
            return r0
    }

    public android.graphics.drawable.Drawable getDrawable(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L18
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L18
            android.content.Context r1 = r2.mContext
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r0)
            return r1
        L18:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
            return r0
    }

    public android.graphics.drawable.Drawable getDrawableIfKnown(int r5) {
            r4 = this;
            android.content.res.TypedArray r0 = r4.mWrapped
            boolean r0 = r0.hasValue(r5)
            if (r0 == 0) goto L1d
            android.content.res.TypedArray r0 = r4.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r5, r1)
            if (r0 == 0) goto L1d
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            android.content.Context r2 = r4.mContext
            r3 = 1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r0, r3)
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public float getFloat(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r0 = r0.getFloat(r2, r3)
            return r0
    }

    public android.graphics.Typeface getFont(int r4, int r5, androidx.core.content.res.ResourcesCompat.FontCallback r6) {
            r3 = this;
            android.content.res.TypedArray r0 = r3.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            android.util.TypedValue r1 = r3.mTypedValue
            if (r1 != 0) goto L16
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r3.mTypedValue = r1
        L16:
            android.content.Context r1 = r3.mContext
            android.util.TypedValue r2 = r3.mTypedValue
            android.graphics.Typeface r1 = androidx.core.content.res.ResourcesCompat.getFont(r1, r0, r2, r5, r6)
            return r1
    }

    public float getFraction(int r2, int r3, int r4, float r5) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r0 = r0.getFraction(r2, r3, r4, r5)
            return r0
    }

    public int getIndex(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getIndex(r2)
            return r0
    }

    public int getIndexCount() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getIndexCount()
            return r0
    }

    public int getInt(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getInt(r2, r3)
            return r0
    }

    public int getInteger(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getInteger(r2, r3)
            return r0
    }

    public int getLayoutDimension(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getLayoutDimension(r2, r3)
            return r0
    }

    public int getLayoutDimension(int r2, java.lang.String r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getLayoutDimension(r2, r3)
            return r0
    }

    public java.lang.String getNonResourceString(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r0 = r0.getNonResourceString(r2)
            return r0
    }

    public java.lang.String getPositionDescription() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r0 = r0.getPositionDescription()
            return r0
    }

    public int getResourceId(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getResourceId(r2, r3)
            return r0
    }

    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    public java.lang.String getString(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r0 = r0.getString(r2)
            return r0
    }

    public java.lang.CharSequence getText(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.CharSequence r0 = r0.getText(r2)
            return r0
    }

    public java.lang.CharSequence[] getTextArray(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.CharSequence[] r0 = r0.getTextArray(r2)
            return r0
    }

    public int getType(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = androidx.appcompat.widget.TintTypedArray.Api21Impl.getType(r0, r2)
            return r0
    }

    public boolean getValue(int r2, android.util.TypedValue r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r0 = r0.getValue(r2, r3)
            return r0
    }

    public android.content.res.TypedArray getWrappedTypeArray() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            return r0
    }

    public boolean hasValue(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r0 = r0.hasValue(r2)
            return r0
    }

    public int length() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.length()
            return r0
    }

    public android.util.TypedValue peekValue(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            android.util.TypedValue r0 = r0.peekValue(r2)
            return r0
    }

    public void recycle() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            r0.recycle()
            return
    }
}
