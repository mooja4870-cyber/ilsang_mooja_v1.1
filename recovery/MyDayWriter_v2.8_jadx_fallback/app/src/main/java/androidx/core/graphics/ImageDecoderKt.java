package androidx.core.graphics;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u00020\u0001*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\b\u001aR\u0010\r\u001a\u00020\u000e*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\b¨\u0006\u000f"}, d2 = {"decodeBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/ImageDecoder$Source;", "action", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "name", "info", "source", "", "Lkotlin/ExtensionFunctionType;", "decodeDrawable", "Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImageDecoderKt {



    public static final android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source r2, kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> r3) {
            r0 = 0
            androidx.core.graphics.ImageDecoderKt$decodeBitmap$1 r1 = new androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            r1.<init>(r3)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r1 = (android.graphics.ImageDecoder.OnHeaderDecodedListener) r1
            android.graphics.Bitmap r1 = android.graphics.ImageDecoder.decodeBitmap(r2, r1)
            return r1
    }

    public static final android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source r2, kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> r3) {
            r0 = 0
            androidx.core.graphics.ImageDecoderKt$decodeDrawable$1 r1 = new androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            r1.<init>(r3)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r1 = (android.graphics.ImageDecoder.OnHeaderDecodedListener) r1
            android.graphics.drawable.Drawable r1 = android.graphics.ImageDecoder.decodeDrawable(r2, r1)
            return r1
    }
}
