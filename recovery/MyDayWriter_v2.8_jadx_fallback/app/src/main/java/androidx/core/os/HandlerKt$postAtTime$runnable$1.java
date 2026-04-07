package androidx.core.os;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class HandlerKt$postAtTime$runnable$1 implements java.lang.Runnable {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $action;

    public HandlerKt$postAtTime$runnable$1(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = this;
            r0.$action = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.$action
            r0.invoke()
            return
    }
}
