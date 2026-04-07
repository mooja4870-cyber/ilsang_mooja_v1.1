package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ModuleNameRetriever {
    public static final kotlin.coroutines.jvm.internal.ModuleNameRetriever INSTANCE = null;
    private static kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache;
    private static final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache notOnJava9 = null;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Cache {
        public final java.lang.reflect.Method getDescriptorMethod;
        public final java.lang.reflect.Method getModuleMethod;
        public final java.lang.reflect.Method nameMethod;

        public Cache(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
                r0 = this;
                r0.<init>()
                r0.getModuleMethod = r1
                r0.getDescriptorMethod = r2
                r0.nameMethod = r3
                return
        }
    }

    static {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever r0 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever
            r0.<init>()
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE = r0
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache
            r1 = 0
            r0.<init>(r1, r1, r1)
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9 = r0
            return
    }

    private ModuleNameRetriever() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache buildCache(kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
            r8 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L42
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Exception -> L42
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "java.lang.Module"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "getDescriptor"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r3 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L42
            java.lang.Class r4 = r9.getClass()     // Catch: java.lang.Exception -> L42
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r4 = r4.loadClass(r5)     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = "name"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r5, r2)     // Catch: java.lang.Exception -> L42
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r5 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache     // Catch: java.lang.Exception -> L42
            r5.<init>(r0, r3, r2)     // Catch: java.lang.Exception -> L42
            r6 = r5
            r7 = 0
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache = r6     // Catch: java.lang.Exception -> L42
            return r5
        L42:
            r0 = move-exception
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r1 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9
            r2 = r1
            r3 = 0
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache = r2
            return r1
    }

    public final java.lang.String getModuleName(kotlin.coroutines.jvm.internal.BaseContinuationImpl r7) {
            r6 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache
            if (r0 != 0) goto Ld
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = r6.buildCache(r7)
        Ld:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r1 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9
            r2 = 0
            if (r0 != r1) goto L13
            return r2
        L13:
            java.lang.reflect.Method r1 = r0.getModuleMethod
            r3 = 0
            if (r1 == 0) goto L23
            java.lang.Class r4 = r7.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object r1 = r1.invoke(r4, r5)
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 != 0) goto L27
            return r2
        L27:
            java.lang.reflect.Method r4 = r0.getDescriptorMethod
            if (r4 == 0) goto L32
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object r4 = r4.invoke(r1, r5)
            goto L33
        L32:
            r4 = r2
        L33:
            if (r4 != 0) goto L36
            return r2
        L36:
            java.lang.reflect.Method r5 = r0.nameMethod
            if (r5 == 0) goto L41
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r3 = r5.invoke(r4, r3)
            goto L42
        L41:
            r3 = r2
        L42:
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L49
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
        L49:
            return r2
    }
}
