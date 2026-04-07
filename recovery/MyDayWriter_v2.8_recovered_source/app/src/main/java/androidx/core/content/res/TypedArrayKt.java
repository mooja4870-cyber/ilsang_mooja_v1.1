package androidx.core.content.res;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0015\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u001c\u001a,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u001e0 H\u0086\b¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"checkAttribute", "", "Landroid/content/res/TypedArray;", "index", "", "getBooleanOrThrow", "", "getColorOrThrow", "getColorStateListOrThrow", "Landroid/content/res/ColorStateList;", "getDimensionOrThrow", "", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "getDrawableOrThrow", "Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "getFontOrThrow", "Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "getStringOrThrow", "", "getTextOrThrow", "", "getTextArrayOrThrow", "", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "use", "R", "block", "Lkotlin/Function1;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TypedArrayKt {
    private static final void checkAttribute(android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attribute not defined in set."
            r0.<init>(r1)
            throw r0
    }

    public static final boolean getBooleanOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            return r0
    }

    public static final int getColorOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getColor(r2, r0)
            return r0
    }

    public static final android.content.res.ColorStateList getColorStateListOrThrow(android.content.res.TypedArray r2, int r3) {
            checkAttribute(r2, r3)
            android.content.res.ColorStateList r0 = r2.getColorStateList(r3)
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value was not a color or color state list."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final float getDimensionOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            float r0 = r1.getDimension(r2, r0)
            return r0
    }

    public static final int getDimensionPixelOffsetOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            return r0
    }

    public static final int getDimensionPixelSizeOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getDimensionPixelSize(r2, r0)
            return r0
    }

    public static final android.graphics.drawable.Drawable getDrawableOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public static final float getFloatOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            float r0 = r1.getFloat(r2, r0)
            return r0
    }

    public static final android.graphics.Typeface getFontOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            android.graphics.Typeface r0 = androidx.core.content.res.TypedArrayApi26ImplKt.getFont(r1, r2)
            return r0
    }

    public static final int getIntOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            return r0
    }

    public static final int getIntegerOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getInteger(r2, r0)
            return r0
    }

    public static final int getResourceIdOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r0 = r1.getResourceId(r2, r0)
            return r0
    }

    public static final java.lang.String getStringOrThrow(android.content.res.TypedArray r2, int r3) {
            checkAttribute(r2, r3)
            java.lang.String r0 = r2.getString(r3)
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to String."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.CharSequence[] getTextArrayOrThrow(android.content.res.TypedArray r1, int r2) {
            checkAttribute(r1, r2)
            java.lang.CharSequence[] r0 = r1.getTextArray(r2)
            return r0
    }

    public static final java.lang.CharSequence getTextOrThrow(android.content.res.TypedArray r2, int r3) {
            checkAttribute(r2, r3)
            java.lang.CharSequence r0 = r2.getText(r3)
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to CharSequence."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final <R> R use(android.content.res.TypedArray r4, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, ? extends R> r5) {
            r0 = 0
            java.lang.Object r1 = r5.invoke(r4)
            r2 = r1
            r3 = 0
            r4.recycle()
            return r1
    }
}
