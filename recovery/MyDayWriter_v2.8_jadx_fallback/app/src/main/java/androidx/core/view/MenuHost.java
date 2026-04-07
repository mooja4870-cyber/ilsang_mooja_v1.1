package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(androidx.core.view.MenuProvider r1);

    void addMenuProvider(androidx.core.view.MenuProvider r1, androidx.lifecycle.LifecycleOwner r2);

    void addMenuProvider(androidx.core.view.MenuProvider r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.State r3);

    void invalidateMenu();

    void removeMenuProvider(androidx.core.view.MenuProvider r1);
}
