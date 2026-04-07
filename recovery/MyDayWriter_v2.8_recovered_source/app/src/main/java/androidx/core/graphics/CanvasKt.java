package androidx.core.graphics;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a:\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001aD\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001aN\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a:\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a0\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a.\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a.\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001aF\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001aF\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b\u001a.\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b¨\u0006\u001e"}, d2 = {"withSave", "", "Landroid/graphics/Canvas;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withTranslation", "x", "", "y", "withRotation", "degrees", "pivotX", "pivotY", "withScale", "withSkew", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withClip", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "clipPath", "Landroid/graphics/Path;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CanvasKt {
    public static final void withClip(android.graphics.Canvas r3, float r4, float r5, float r6, float r7, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r8) {
            r0 = 0
            int r1 = r3.save()
            r3.clipRect(r4, r5, r6, r7)
            r8.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withClip(android.graphics.Canvas r3, int r4, int r5, int r6, int r7, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r8) {
            r0 = 0
            int r1 = r3.save()
            r3.clipRect(r4, r5, r6, r7)
            r8.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withClip(android.graphics.Canvas r3, android.graphics.Path r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            r0 = 0
            int r1 = r3.save()
            r3.clipPath(r4)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withClip(android.graphics.Canvas r3, android.graphics.Rect r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            r0 = 0
            int r1 = r3.save()
            r3.clipRect(r4)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withClip(android.graphics.Canvas r3, android.graphics.RectF r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            r0 = 0
            int r1 = r3.save()
            r3.clipRect(r4)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withMatrix(android.graphics.Canvas r3, android.graphics.Matrix r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            r0 = 0
            int r1 = r3.save()
            r3.concat(r4)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas r1, android.graphics.Matrix r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto La
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2 = r4
        La:
            r4 = 0
            int r5 = r1.save()
            r1.concat(r2)
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L1b
            r1.restoreToCount(r5)
            return
        L1b:
            r0 = move-exception
            r1.restoreToCount(r5)
            throw r0
    }

    public static final void withRotation(android.graphics.Canvas r3, float r4, float r5, float r6, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r7) {
            r0 = 0
            int r1 = r3.save()
            r3.rotate(r4, r5, r6)
            r7.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas r1, float r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r7 = r6 & 2
            if (r7 == 0) goto La
            r3 = 0
        La:
            r6 = r6 & 4
            if (r6 == 0) goto Lf
            r4 = 0
        Lf:
            r6 = 0
            int r7 = r1.save()
            r1.rotate(r2, r3, r4)
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L20
            r1.restoreToCount(r7)
            return
        L20:
            r0 = move-exception
            r1.restoreToCount(r7)
            throw r0
    }

    public static final void withSave(android.graphics.Canvas r3, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r4) {
            r0 = 0
            int r1 = r3.save()
            r4.invoke(r3)     // Catch: java.lang.Throwable -> Le
            r3.restoreToCount(r1)
            return
        Le:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static final void withScale(android.graphics.Canvas r3, float r4, float r5, float r6, float r7, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r8) {
            r0 = 0
            int r1 = r3.save()
            r3.scale(r4, r5, r6, r7)
            r8.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            r2 = 1065353216(0x3f800000, float:1.0)
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            r3 = 1065353216(0x3f800000, float:1.0)
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 0
        L11:
            r7 = r7 & 8
            if (r7 == 0) goto L16
            r5 = 0
        L16:
            r7 = 0
            int r8 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L27
            r1.restoreToCount(r8)
            return
        L27:
            r0 = move-exception
            r1.restoreToCount(r8)
            throw r0
    }

    public static final void withSkew(android.graphics.Canvas r3, float r4, float r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r3.save()
            r3.skew(r4, r5)
            r6.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 2
            if (r5 == 0) goto La
            r3 = 0
        La:
            r5 = 0
            int r6 = r1.save()
            r1.skew(r2, r3)
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L1b
            r1.restoreToCount(r6)
            return
        L1b:
            r0 = move-exception
            r1.restoreToCount(r6)
            throw r0
    }

    public static final void withTranslation(android.graphics.Canvas r3, float r4, float r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r3.save()
            r3.translate(r4, r5)
            r6.invoke(r3)     // Catch: java.lang.Throwable -> L11
            r3.restoreToCount(r1)
            return
        L11:
            r2 = move-exception
            r3.restoreToCount(r1)
            throw r2
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 2
            if (r5 == 0) goto La
            r3 = 0
        La:
            r5 = 0
            int r6 = r1.save()
            r1.translate(r2, r3)
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L1b
            r1.restoreToCount(r6)
            return
        L1b:
            r0 = move-exception
            r1.restoreToCount(r6)
            throw r0
    }
}
