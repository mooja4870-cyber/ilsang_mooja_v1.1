package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FragmentManagerNonConfig {
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> mChildNonConfigs;
    private final java.util.Collection<androidx.fragment.app.Fragment> mFragments;
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;

    FragmentManagerNonConfig(java.util.Collection<androidx.fragment.app.Fragment> r1, java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r2, java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r3) {
            r0 = this;
            r0.<init>()
            r0.mFragments = r1
            r0.mChildNonConfigs = r2
            r0.mViewModelStores = r3
            return
    }

    java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> getChildNonConfigs() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r0 = r1.mChildNonConfigs
            return r0
    }

    java.util.Collection<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            return r0
    }

    java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> getViewModelStores() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.mViewModelStores
            return r0
    }

    boolean isRetaining(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            boolean r0 = r0.contains(r2)
            return r0
    }
}
