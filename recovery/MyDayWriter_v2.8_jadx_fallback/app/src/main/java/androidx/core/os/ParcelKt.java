package androidx.core.os;

/* JADX INFO: compiled from: Parcel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"use", "T", "Landroid/os/Parcel;", "block", "Lkotlin/Function1;", "(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ParcelKt {
    public static final <T> T use(android.os.Parcel r4, kotlin.jvm.functions.Function1<? super android.os.Parcel, ? extends T> r5) {
            r0 = 0
            java.lang.Object r1 = r5.invoke(r4)
            r2 = r1
            r3 = 0
            r4.recycle()
            return r1
    }
}
