package androidx.activity;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass1 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        public AnonymousClass1(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.$this_viewModels = r1
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.$this_viewModels
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.lifecycle.ViewModelStore invoke() {
                r1 = this;
                androidx.lifecycle.ViewModelStore r0 = r1.invoke()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2 implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        public AnonymousClass2(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.$this_viewModels = r1
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.$this_viewModels
                androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras invoke() {
                r1 = this;
                androidx.lifecycle.viewmodel.CreationExtras r0 = r1.invoke()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass3 implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        public AnonymousClass3(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.$this_viewModels = r1
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.$this_viewModels
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.lifecycle.ViewModelStore invoke() {
                r1 = this;
                androidx.lifecycle.ViewModelStore r0 = r1.invoke()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass4 implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> {
        final /* synthetic */ kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> $extrasProducer;
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        public AnonymousClass4(kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r1, androidx.activity.ComponentActivity r2) {
                r0 = this;
                r0.$extrasProducer = r1
                r0.$this_viewModels = r2
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                r1 = this;
                kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> r0 = r1.$extrasProducer
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.invoke()
                androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                if (r0 != 0) goto L12
            Lc:
                androidx.activity.ComponentActivity r0 = r1.$this_viewModels
                androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
            L12:
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras invoke() {
                r1 = this;
                androidx.lifecycle.viewmodel.CreationExtras r0 = r1.invoke()
                return r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity r6, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r7 != 0) goto L10
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1 r1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1
            r1.<init>(r6)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            goto L11
        L10:
            r1 = r7
        L11:
            androidx.lifecycle.ViewModelLazy r2 = new androidx.lifecycle.ViewModelLazy
            r3 = 4
            java.lang.String r4 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
            java.lang.Class<androidx.lifecycle.ViewModel> r3 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            androidx.activity.ActivityViewModelLazyKt$viewModels$1 r4 = new androidx.activity.ActivityViewModelLazyKt$viewModels$1
            r4.<init>(r6)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.activity.ActivityViewModelLazyKt$viewModels$2 r5 = new androidx.activity.ActivityViewModelLazyKt$viewModels$2
            r5.<init>(r6)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r2.<init>(r3, r4, r1, r5)
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            return r2
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity r6, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r7, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r8 != 0) goto L10
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2 r1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2
            r1.<init>(r6)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            goto L11
        L10:
            r1 = r8
        L11:
            androidx.lifecycle.ViewModelLazy r2 = new androidx.lifecycle.ViewModelLazy
            r3 = 4
            java.lang.String r4 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
            java.lang.Class<androidx.lifecycle.ViewModel> r3 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            androidx.activity.ActivityViewModelLazyKt$viewModels$3 r4 = new androidx.activity.ActivityViewModelLazyKt$viewModels$3
            r4.<init>(r6)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.activity.ActivityViewModelLazyKt$viewModels$4 r5 = new androidx.activity.ActivityViewModelLazyKt$viewModels$4
            r5.<init>(r7, r6)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r2.<init>(r3, r4, r1, r5)
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            return r2
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity r4, kotlin.jvm.functions.Function0 r5, int r6, java.lang.Object r7) {
            r6 = r6 & 1
            if (r6 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            r6 = 0
            if (r5 != 0) goto L15
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1 r7 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1
            r7.<init>(r4)
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            goto L16
        L15:
            r7 = r5
        L16:
            androidx.lifecycle.ViewModelLazy r0 = new androidx.lifecycle.ViewModelLazy
            r1 = 4
            java.lang.String r2 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<androidx.lifecycle.ViewModel> r1 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            androidx.activity.ActivityViewModelLazyKt$viewModels$1 r2 = new androidx.activity.ActivityViewModelLazyKt$viewModels$1
            r2.<init>(r4)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.activity.ActivityViewModelLazyKt$viewModels$2 r3 = new androidx.activity.ActivityViewModelLazyKt$viewModels$2
            r3.<init>(r4)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r0.<init>(r1, r2, r7, r3)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            return r0
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity r4, kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function0 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r5 = 0
        L5:
            r7 = r7 & 2
            if (r7 == 0) goto La
            r6 = 0
        La:
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            r7 = 0
            if (r6 != 0) goto L1a
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2 r8 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2
            r8.<init>(r4)
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            goto L1b
        L1a:
            r8 = r6
        L1b:
            androidx.lifecycle.ViewModelLazy r0 = new androidx.lifecycle.ViewModelLazy
            r1 = 4
            java.lang.String r2 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<androidx.lifecycle.ViewModel> r1 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            androidx.activity.ActivityViewModelLazyKt$viewModels$3 r2 = new androidx.activity.ActivityViewModelLazyKt$viewModels$3
            r2.<init>(r4)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.activity.ActivityViewModelLazyKt$viewModels$4 r3 = new androidx.activity.ActivityViewModelLazyKt$viewModels$4
            r3.<init>(r5, r4)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r0.<init>(r1, r2, r8, r3)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            return r0
    }
}
