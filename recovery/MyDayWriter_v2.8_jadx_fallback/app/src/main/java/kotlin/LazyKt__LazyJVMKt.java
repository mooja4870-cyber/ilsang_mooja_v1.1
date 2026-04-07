package kotlin;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/LazyKt")
class LazyKt__LazyJVMKt {

    /* JADX INFO: compiled from: LazyJVM.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public LazyKt__LazyJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> kotlin.Lazy<T> lazy(java.lang.Object r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r0.<init>(r2, r1)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            return r0
    }

    public static final <T> kotlin.Lazy<T> lazy(kotlin.LazyThreadSafetyMode r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int[] r0 = kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L23;
                case 3: goto L1b;
                default: goto L15;
            }
        L15:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L1b:
            kotlin.UnsafeLazyImpl r0 = new kotlin.UnsafeLazyImpl
            r0.<init>(r4)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            goto L34
        L23:
            kotlin.SafePublicationLazyImpl r0 = new kotlin.SafePublicationLazyImpl
            r0.<init>(r4)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            goto L34
        L2b:
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r1 = 2
            r2 = 0
            r0.<init>(r4, r2, r1, r2)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
        L34:
            return r0
    }

    public static final <T> kotlin.Lazy<T> lazy(kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2, r1)
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            return r0
    }
}
