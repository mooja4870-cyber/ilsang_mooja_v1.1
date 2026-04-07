package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0012J.\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "store", "Landroidx/lifecycle/ViewModelStore;", "defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelProvider {
    private final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private final androidx.lifecycle.ViewModelStore store;

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0010J-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "unused", "", "(Landroid/app/Application;I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> APPLICATION_KEY = null;
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion Companion = null;
        public static final java.lang.String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;
        private final android.app.Application application;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "DEFAULT_KEY", "", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "defaultFactory$lifecycle_viewmodel_release", "getInstance", "application", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class ApplicationKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> {
                public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE = r0
                        return
                }

                private ApplicationKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public final androidx.lifecycle.ViewModelProvider.Factory defaultFactory$lifecycle_viewmodel_release(androidx.lifecycle.ViewModelStoreOwner r2) {
                    r1 = this;
                    java.lang.String r0 = "owner"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L11
                    r0 = r2
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    goto L19
                L11:
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = r0.getInstance()
                    androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
                L19:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application r2) {
                    r1 = this;
                    java.lang.String r0 = "application"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    if (r0 != 0) goto L13
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
                    r0.<init>(r2)
                    androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$setSInstance$cp(r0)
                L13:
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE
                androidx.lifecycle.viewmodel.CreationExtras$Key r0 = (androidx.lifecycle.viewmodel.CreationExtras.Key) r0
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY = r0
                return
        }

        public AndroidViewModelFactory() {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public AndroidViewModelFactory(android.app.Application r2) {
                r1 = this;
                java.lang.String r0 = "application"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        private AndroidViewModelFactory(android.app.Application r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.application = r1
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory r0) {
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance = r0
                return
        }

        private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r5, android.app.Application r6) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
                boolean r1 = r1.isAssignableFrom(r5)
                if (r1 == 0) goto L93
            Lb:
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                java.lang.Class<android.app.Application> r2 = android.app.Application.class
                r3 = 0
                r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                java.lang.reflect.Constructor r1 = r5.getConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.InstantiationException -> L42 java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L78
                java.lang.String r0 = "{\n                try {\n…          }\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                goto L97
            L27:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L42:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L5d:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L78:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L93:
                androidx.lifecycle.ViewModel r1 = super.create(r5)
            L97:
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application r1) {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = r0.getInstance(r1)
                return r0
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r3) {
                r2 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.app.Application r0 = r2.application
                if (r0 == 0) goto L10
                android.app.Application r0 = r2.application
                androidx.lifecycle.ViewModel r0 = r2.create(r3, r0)
                return r0
            L10:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r4, androidx.lifecycle.viewmodel.CreationExtras r5) {
                r3 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "extras"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.app.Application r0 = r3.application
                if (r0 == 0) goto L13
                androidx.lifecycle.ViewModel r0 = r3.create(r4)
                goto L30
            L13:
                androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
                java.lang.Object r0 = r5.get(r0)
                android.app.Application r0 = (android.app.Application) r0
                if (r0 == 0) goto L23
                androidx.lifecycle.ViewModel r1 = r3.create(r4, r0)
                r0 = r1
                goto L30
            L23:
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
                boolean r1 = r1.isAssignableFrom(r4)
                if (r1 != 0) goto L31
                androidx.lifecycle.ViewModel r1 = super.create(r4)
                r0 = r1
            L30:
                return r0
            L31:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "CreationExtras must have an application by `APPLICATION_KEY`"
                r1.<init>(r2)
                throw r1
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion Companion = null;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory.Companion $$INSTANCE = null;

            static {
                    androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = new androidx.lifecycle.ViewModelProvider$Factory$Companion
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE = r0
                    return
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.Factory from(androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r3) {
                    r2 = this;
                    java.lang.String r0 = "initializers"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
                    int r1 = r3.length
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
                    androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
                    r0.<init>(r1)
                    androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE
                androidx.lifecycle.ViewModelProvider.Factory.Companion = r0
                return
        }

        @kotlin.jvm.JvmStatic
        static androidx.lifecycle.ViewModelProvider.Factory from(androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r1) {
                androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion
                androidx.lifecycle.ViewModelProvider$Factory r0 = r0.from(r1)
                return r0
        }

        default <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r3) {
                r2 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
                r0.<init>(r1)
                throw r0
        }

        default <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2, androidx.lifecycle.viewmodel.CreationExtras r3) {
                r1 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "extras"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ViewModel r0 = r1.create(r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion Companion = null;
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY = null;
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class ViewModelKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> {
                public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE = r0
                        return
                }

                private ViewModelKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @kotlin.jvm.JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
                    return
            }

            public final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                    r1 = this;
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    if (r0 != 0) goto Le
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$setSInstance$cp(r0)
                Le:
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE
                androidx.lifecycle.viewmodel.CreationExtras$Key r0 = (androidx.lifecycle.viewmodel.CreationExtras.Key) r0
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY = r0
                return
        }

        public NewInstanceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.NewInstanceFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.NewInstanceFactory r0) {
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance = r0
                return
        }

        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = r0.getInstance()
                return r0
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r5) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.String r1 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r2)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                java.lang.String r2 = "{\n                modelC…wInstance()\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.IllegalAccessException -> L1d java.lang.InstantiationException -> L38 java.lang.NoSuchMethodException -> L53
                return r1
            L1d:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L38:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
            L53:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3 = r1
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r2.<init>(r0, r3)
                throw r2
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OnRequeryFactory {
        public OnRequeryFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onRequery(androidx.lifecycle.ViewModel r2) {
                r1 = this;
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore r8, androidx.lifecycle.ViewModelProvider.Factory r9) {
            r7 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore r2, androidx.lifecycle.ViewModelProvider.Factory r3, androidx.lifecycle.viewmodel.CreationExtras r4) {
            r1 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defaultCreationExtras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.store = r2
            r1.factory = r3
            r1.defaultCreationExtras = r4
            return
    }

    public /* synthetic */ ViewModelProvider(androidx.lifecycle.ViewModelStore r1, androidx.lifecycle.ViewModelProvider.Factory r2, androidx.lifecycle.viewmodel.CreationExtras r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L8
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            androidx.lifecycle.viewmodel.CreationExtras r3 = (androidx.lifecycle.viewmodel.CreationExtras) r3
        L8:
            r0.<init>(r1, r2, r3)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r4) {
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r4.getViewModelStore()
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.defaultFactory$lifecycle_viewmodel_release(r4)
            androidx.lifecycle.viewmodel.CreationExtras r2 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r4)
            r3.<init>(r0, r1, r2)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r3, androidx.lifecycle.ViewModelProvider.Factory r4) {
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            androidx.lifecycle.viewmodel.CreationExtras r1 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r3)
            r2.<init>(r0, r4, r1)
            return
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            androidx.lifecycle.ViewModel r1 = r3.get(r1, r4)
            return r1
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.String r7, java.lang.Class<T> r8) {
            r6 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.lifecycle.ViewModelStore r0 = r6.store
            androidx.lifecycle.ViewModel r0 = r0.get(r7)
            boolean r1 = r8.isInstance(r0)
            if (r1 == 0) goto L2e
            androidx.lifecycle.ViewModelProvider$Factory r1 = r6.factory
            boolean r2 = r1 instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory
            if (r2 == 0) goto L1f
            androidx.lifecycle.ViewModelProvider$OnRequeryFactory r1 = (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) r1
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L28
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.onRequery(r0)
        L28:
            java.lang.String r1 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
        L2e:
            androidx.lifecycle.viewmodel.MutableCreationExtras r1 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            androidx.lifecycle.viewmodel.CreationExtras r2 = r6.defaultCreationExtras
            r1.<init>(r2)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r2 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            r1.set(r2, r7)
            androidx.lifecycle.ViewModelProvider$Factory r2 = r6.factory     // Catch: java.lang.AbstractMethodError -> L46
            r3 = r1
            androidx.lifecycle.viewmodel.CreationExtras r3 = (androidx.lifecycle.viewmodel.CreationExtras) r3     // Catch: java.lang.AbstractMethodError -> L46
            androidx.lifecycle.ViewModel r2 = r2.create(r8, r3)     // Catch: java.lang.AbstractMethodError -> L46
            goto L4e
        L46:
            r2 = move-exception
            androidx.lifecycle.ViewModelProvider$Factory r3 = r6.factory
            androidx.lifecycle.ViewModel r3 = r3.create(r8)
            r2 = r3
        L4e:
            r3 = r2
            r4 = 0
            androidx.lifecycle.ViewModelStore r5 = r6.store
            r5.put(r7, r3)
            return r2
    }
}
