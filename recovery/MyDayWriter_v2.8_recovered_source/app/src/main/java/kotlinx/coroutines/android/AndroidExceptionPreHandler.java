package kotlinx.coroutines.android;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "_preHandler", "", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "preHandler", "Ljava/lang/reflect/Method;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidExceptionPreHandler extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
            r1 = this;
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    private final java.lang.reflect.Method preHandler() {
            r7 = this;
            java.lang.Object r0 = r7._preHandler
            if (r0 == r7) goto L8
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        L8:
            r1 = 0
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "getUncaughtExceptionPreHandler"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L2f
            r3 = r2
            r5 = 0
            int r6 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r6 = java.lang.reflect.Modifier.isPublic(r6)     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L2b
            int r6 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L2b
            r4 = 1
        L2b:
            if (r4 == 0) goto L31
            r1 = r2
            goto L31
        L2f:
            r2 = move-exception
        L31:
            r7._preHandler = r1
            return r1
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.CoroutineContext r4, java.lang.Throwable r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r1 > r0) goto Ld
            r1 = 28
            if (r0 >= r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L31
        L11:
            java.lang.reflect.Method r0 = r3.preHandler()
            r1 = 0
            if (r0 == 0) goto L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            goto L20
        L1f:
            r0 = r1
        L20:
            boolean r2 = r0 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r2 == 0) goto L27
            r1 = r0
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
        L27:
            if (r1 == 0) goto L31
        L2a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.uncaughtException(r0, r5)
        L31:
            return
    }
}
