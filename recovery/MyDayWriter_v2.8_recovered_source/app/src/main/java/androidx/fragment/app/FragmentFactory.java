package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = null;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.fragment.app.FragmentFactory.sClassCacheMap = r0
            return
    }

    public FragmentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isFragmentClass(java.lang.ClassLoader r2, java.lang.String r3) {
            java.lang.Class r0 = loadClass(r2, r3)     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.Class<androidx.fragment.app.Fragment> r1 = androidx.fragment.app.Fragment.class
            boolean r1 = r1.isAssignableFrom(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            return r1
        Lb:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.Class<?> loadClass(java.lang.ClassLoader r3, java.lang.String r4) throws java.lang.ClassNotFoundException {
            androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.FragmentFactory.sClassCacheMap
            java.lang.Object r0 = r0.get(r3)
            androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
            if (r0 != 0) goto L15
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r0 = r1
            androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> r1 = androidx.fragment.app.FragmentFactory.sClassCacheMap
            r1.put(r3, r0)
        L15:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L25
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r4, r2, r3)
            r0.put(r4, r1)
        L25:
            return r1
    }

    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(java.lang.ClassLoader r4, java.lang.String r5) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r0 = loadClass(r4, r5)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L25
            return r0
        L7:
            r1 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r3 = ": make sure class is a valid subclass of Fragment"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r1)
            throw r2
        L25:
            r1 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r3 = ": make sure class name exists"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r1)
            throw r2
    }

    public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.Class r2 = loadFragmentClass(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            java.lang.Object r3 = r4.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L36 java.lang.IllegalAccessException -> L54 java.lang.InstantiationException -> L70
            return r3
        L18:
            r0 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r3 = ": calling Fragment constructor caused an exception"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        L36:
            r0 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r3 = ": could not find Fragment constructor"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        L54:
            r2 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r3 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            throw r3
        L70:
            r2 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r3 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            throw r3
    }
}
