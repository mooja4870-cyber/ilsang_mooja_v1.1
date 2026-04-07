package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class ContextAwareKt$withContextAvailable$2$1 implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    final /* synthetic */ androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 $listener;
    final /* synthetic */ androidx.activity.contextaware.ContextAware $this_withContextAvailable;

    public ContextAwareKt$withContextAvailable$2$1(androidx.activity.contextaware.ContextAware r1, androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r2) {
            r0 = this;
            r0.$this_withContextAvailable = r1
            r0.$listener = r2
            r0.<init>()
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r2) {
            r1 = this;
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.invoke2(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable r3) {
            r2 = this;
            androidx.activity.contextaware.ContextAware r0 = r2.$this_withContextAvailable
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r1 = r2.$listener
            androidx.activity.contextaware.OnContextAvailableListener r1 = (androidx.activity.contextaware.OnContextAvailableListener) r1
            r0.removeOnContextAvailableListener(r1)
            return
    }
}
