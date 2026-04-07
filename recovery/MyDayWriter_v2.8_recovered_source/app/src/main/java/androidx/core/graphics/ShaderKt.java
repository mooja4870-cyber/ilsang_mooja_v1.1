package androidx.core.graphics;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\u0086\b¨\u0006\u0007"}, d2 = {"transform", "", "Landroid/graphics/Shader;", "block", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ShaderKt {
    public static final void transform(android.graphics.Shader r2, kotlin.jvm.functions.Function1<? super android.graphics.Matrix, kotlin.Unit> r3) {
            r0 = 0
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.getLocalMatrix(r1)
            r3.invoke(r1)
            r2.setLocalMatrix(r1)
            return
    }
}
