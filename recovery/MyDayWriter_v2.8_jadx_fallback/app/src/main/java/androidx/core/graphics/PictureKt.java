package androidx.core.graphics;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\b¨\u0006\n"}, d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PictureKt {
    public static final android.graphics.Picture record(android.graphics.Picture r3, int r4, int r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            android.graphics.Canvas r1 = r3.beginRecording(r4, r5)
            r6.invoke(r1)     // Catch: java.lang.Throwable -> Le
            r3.endRecording()
            return r3
        Le:
            r2 = move-exception
            r3.endRecording()
            throw r2
    }
}
