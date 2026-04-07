package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> mMenuProviders;
    private final java.lang.Runnable mOnInvalidateMenuCallback;
    private final java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper.LifecycleContainer> mProviderToLifecycleContainers;

    private static class LifecycleContainer {
        final androidx.lifecycle.Lifecycle mLifecycle;
        private androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleContainer(androidx.lifecycle.Lifecycle r2, androidx.lifecycle.LifecycleEventObserver r3) {
                r1 = this;
                r1.<init>()
                r1.mLifecycle = r2
                r1.mObserver = r3
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.addObserver(r3)
                return
        }

        void clearObservers() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                r0 = 0
                r2.mObserver = r0
                return
        }
    }

    public MenuHostHelper(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mMenuProviders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mProviderToLifecycleContainers = r0
            r1.mOnInvalidateMenuCallback = r2
            return
    }

    public void addMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r1.mMenuProviders
            r0.add(r2)
            java.lang.Runnable r0 = r1.mOnInvalidateMenuCallback
            r0.run()
            return
    }

    public void addMenuProvider(androidx.core.view.MenuProvider r6, androidx.lifecycle.LifecycleOwner r7) {
            r5 = this;
            r5.addMenuProvider(r6)
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r1 = r5.mProviderToLifecycleContainers
            java.lang.Object r1 = r1.remove(r6)
            androidx.core.view.MenuHostHelper$LifecycleContainer r1 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r1
            if (r1 == 0) goto L14
            r1.clearObservers()
        L14:
            androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1 r2 = new androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1
            r2.<init>(r5, r6)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r3 = r5.mProviderToLifecycleContainers
            androidx.core.view.MenuHostHelper$LifecycleContainer r4 = new androidx.core.view.MenuHostHelper$LifecycleContainer
            r4.<init>(r0, r2)
            r3.put(r6, r4)
            return
    }

    public void addMenuProvider(androidx.core.view.MenuProvider r6, androidx.lifecycle.LifecycleOwner r7, androidx.lifecycle.Lifecycle.State r8) {
            r5 = this;
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r1 = r5.mProviderToLifecycleContainers
            java.lang.Object r1 = r1.remove(r6)
            androidx.core.view.MenuHostHelper$LifecycleContainer r1 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r1
            if (r1 == 0) goto L11
            r1.clearObservers()
        L11:
            androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0 r2 = new androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0
            r2.<init>(r5, r8, r6)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r3 = r5.mProviderToLifecycleContainers
            androidx.core.view.MenuHostHelper$LifecycleContainer r4 = new androidx.core.view.MenuHostHelper$LifecycleContainer
            r4.<init>(r0, r2)
            r3.put(r6, r4)
            return
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$0$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m67lambda$addMenuProvider$0$androidxcoreviewMenuHostHelper(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 != r0) goto L7
            r1.removeMenuProvider(r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$1$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m68lambda$addMenuProvider$1$androidxcoreviewMenuHostHelper(androidx.lifecycle.Lifecycle.State r2, androidx.core.view.MenuProvider r3, androidx.lifecycle.LifecycleOwner r4, androidx.lifecycle.Lifecycle.Event r5) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.upTo(r2)
            if (r5 != r0) goto La
            r1.addMenuProvider(r3)
            goto L22
        La:
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r5 != r0) goto L12
            r1.removeMenuProvider(r3)
            goto L22
        L12:
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.downFrom(r2)
            if (r5 != r0) goto L22
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r1.mMenuProviders
            r0.remove(r3)
            java.lang.Runnable r0 = r1.mOnInvalidateMenuCallback
            r0.run()
        L22:
            return
    }

    public void onCreateMenu(android.view.Menu r3, android.view.MenuInflater r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onCreateMenu(r3, r4)
            goto L6
        L16:
            return
    }

    public void onMenuClosed(android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onMenuClosed(r3)
            goto L6
        L16:
            return
    }

    public boolean onMenuItemSelected(android.view.MenuItem r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r3.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            boolean r2 = r1.onMenuItemSelected(r4)
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            goto L6
        L1b:
            r0 = 0
            return r0
    }

    public void onPrepareMenu(android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onPrepareMenu(r3)
            goto L6
        L16:
            return
    }

    public void removeMenuProvider(androidx.core.view.MenuProvider r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            r0.remove(r3)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r0 = r2.mProviderToLifecycleContainers
            java.lang.Object r0 = r0.remove(r3)
            androidx.core.view.MenuHostHelper$LifecycleContainer r0 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r0
            if (r0 == 0) goto L12
            r0.clearObservers()
        L12:
            java.lang.Runnable r1 = r2.mOnInvalidateMenuCallback
            r1.run()
            return
    }
}
