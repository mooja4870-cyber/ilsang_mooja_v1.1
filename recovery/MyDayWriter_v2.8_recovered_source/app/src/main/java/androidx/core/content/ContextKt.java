package androidx.core.content;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001aN\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\b\u001a8\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\b¨\u0006\u0013"}, d2 = {"getSystemService", "T", "", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "withStyledAttributes", "", "set", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "defStyleRes", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "resourceId", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context r3) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r3, r1)
            return r1
    }

    public static final void withStyledAttributes(android.content.Context r2, int r3, int[] r4, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r5) {
            r0 = 0
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r4)
            r5.invoke(r1)
            r1.recycle()
            return
    }

    public static final void withStyledAttributes(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5, int r6, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r7) {
            r0 = 0
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r4, r5, r6)
            r7.invoke(r1)
            r1.recycle()
            return
    }

    public static /* synthetic */ void withStyledAttributes$default(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r1 = 0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto La
            r3 = 0
        La:
            r6 = r6 & 8
            if (r6 == 0) goto Lf
            r4 = 0
        Lf:
            r6 = 0
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r5.invoke(r7)
            r7.recycle()
            return
    }
}
