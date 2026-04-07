package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface LifecycleRegistryOwner extends androidx.lifecycle.LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    /* bridge */ /* synthetic */ default androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.getLifecycle()
            return r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    androidx.lifecycle.LifecycleRegistry getLifecycle();
}
