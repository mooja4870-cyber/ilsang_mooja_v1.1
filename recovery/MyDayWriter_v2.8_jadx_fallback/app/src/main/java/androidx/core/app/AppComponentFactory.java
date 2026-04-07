package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class AppComponentFactory extends android.app.AppComponentFactory {
    public AppComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Activity instantiateActivity(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Activity r0 = r1.instantiateActivityCompat(r2, r3, r4)
            java.lang.Object r0 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r0)
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public android.app.Activity instantiateActivityCompat(java.lang.ClassLoader r4, java.lang.String r5, android.content.Intent r6) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r0
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't call constructor"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Application instantiateApplication(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Application r0 = r1.instantiateApplicationCompat(r2, r3)
            java.lang.Object r0 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r0)
            android.app.Application r0 = (android.app.Application) r0
            return r0
    }

    public android.app.Application instantiateApplicationCompat(java.lang.ClassLoader r4, java.lang.String r5) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r0
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't call constructor"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // android.app.AppComponentFactory
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.content.ContentProvider r0 = r1.instantiateProviderCompat(r2, r3)
            java.lang.Object r0 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r0)
            android.content.ContentProvider r0 = (android.content.ContentProvider) r0
            return r0
    }

    public android.content.ContentProvider instantiateProviderCompat(java.lang.ClassLoader r4, java.lang.String r5) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.content.ContentProvider> r2 = android.content.ContentProvider.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.content.ContentProvider r0 = (android.content.ContentProvider) r0     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r0
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't call constructor"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // android.app.AppComponentFactory
    public final android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.content.BroadcastReceiver r0 = r1.instantiateReceiverCompat(r2, r3, r4)
            java.lang.Object r0 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r0)
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0
            return r0
    }

    public android.content.BroadcastReceiver instantiateReceiverCompat(java.lang.ClassLoader r4, java.lang.String r5, android.content.Intent r6) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r0
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't call constructor"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Service instantiateService(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Service r0 = r1.instantiateServiceCompat(r2, r3, r4)
            java.lang.Object r0 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r0)
            android.app.Service r0 = (android.app.Service) r0
            return r0
    }

    public android.app.Service instantiateServiceCompat(java.lang.ClassLoader r4, java.lang.String r5, android.content.Intent r6) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r4)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Service r0 = (android.app.Service) r0     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r0
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't call constructor"
            r1.<init>(r2, r0)
            throw r1
    }
}
