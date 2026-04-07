package androidx.activity;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(androidx.activity.ComponentActivity r1) {
            r0 = this;
            r0.$this_viewModels = r1
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.$this_viewModels
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r1.invoke()
            return r0
    }
}
