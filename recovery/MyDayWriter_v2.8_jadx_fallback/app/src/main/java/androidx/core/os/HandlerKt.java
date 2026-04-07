package androidx.core.os;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b\u001a1\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¨\u0006\f"}, d2 = {"postDelayed", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "delayInMillis", "", "token", "", "action", "Lkotlin/Function0;", "", "postAtTime", "uptimeMillis", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HandlerKt {
    public static final java.lang.Runnable postAtTime(android.os.Handler r2, long r3, java.lang.Object r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            r0 = 0
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r1 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r1.<init>(r6)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.postAtTime(r1, r5, r3)
            return r1
    }

    public static /* synthetic */ java.lang.Runnable postAtTime$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            r5 = 0
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r6 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r6.<init>(r4)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r0.postAtTime(r6, r3, r1)
            return r6
    }

    public static final java.lang.Runnable postDelayed(android.os.Handler r2, long r3, java.lang.Object r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            r0 = 0
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r1 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r1.<init>(r6)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r5 != 0) goto Le
            r2.postDelayed(r1, r3)
            goto L11
        Le:
            androidx.core.os.HandlerCompat.postDelayed(r2, r1, r5, r3)
        L11:
            return r1
    }

    public static /* synthetic */ java.lang.Runnable postDelayed$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            r5 = 0
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r6 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r6.<init>(r4)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            if (r3 != 0) goto L13
            r0.postDelayed(r6, r1)
            goto L16
        L13:
            androidx.core.os.HandlerCompat.postDelayed(r0, r6, r3, r1)
        L16:
            return r6
    }
}
