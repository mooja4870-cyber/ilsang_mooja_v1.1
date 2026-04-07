package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.ClassesInfoCache.CallbackInfo mInfo;
    private final java.lang.Object mWrapped;

    ReflectiveGenericLifecycleObserver(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r2.mWrapped = r3
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            java.lang.Object r1 = r2.mWrapped
            java.lang.Class r1 = r1.getClass()
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r0.getInfo(r1)
            r2.mInfo = r0
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r2.mInfo
            java.lang.Object r1 = r2.mWrapped
            r0.invokeCallbacks(r3, r4, r1)
            return
    }
}
