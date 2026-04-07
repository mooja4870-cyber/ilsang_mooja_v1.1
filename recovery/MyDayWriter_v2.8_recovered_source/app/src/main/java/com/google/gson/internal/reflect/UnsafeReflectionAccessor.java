package com.google.gson.internal.reflect;

/* JADX INFO: loaded from: classes.dex */
final class UnsafeReflectionAccessor extends com.google.gson.internal.reflect.ReflectionAccessor {
    private static java.lang.Class unsafeClass;
    private final java.lang.reflect.Field overrideField;
    private final java.lang.Object theUnsafe;

    UnsafeReflectionAccessor() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = getUnsafeInstance()
            r1.theUnsafe = r0
            java.lang.reflect.Field r0 = getOverrideField()
            r1.overrideField = r0
            return
    }

    private static java.lang.reflect.Field getOverrideField() {
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "override"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.Object getUnsafeInstance() {
            r0 = 0
            java.lang.String r1 = "sun.misc.Unsafe"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1a
            com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass = r1     // Catch: java.lang.Exception -> L1a
            java.lang.Class r1 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r1 = move-exception
            return r0
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(java.lang.reflect.AccessibleObject r6) {
            r5 = this;
            boolean r0 = r5.makeAccessibleWithUnsafe(r6)
            if (r0 != 0) goto L2b
            r1 = 1
            r6.setAccessible(r1)     // Catch: java.lang.SecurityException -> Lb
            goto L2b
        Lb:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Gson couldn't modify fields for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
        L2b:
            return
    }

    boolean makeAccessibleWithUnsafe(java.lang.reflect.AccessibleObject r11) {
            r10 = this;
            java.lang.Object r0 = r10.theUnsafe
            r1 = 0
            if (r0 == 0) goto L55
            java.lang.reflect.Field r0 = r10.overrideField
            if (r0 == 0) goto L55
            java.lang.Class r0 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = "objectFieldOffset"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L54
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r1] = r5     // Catch: java.lang.Exception -> L54
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Exception -> L54
            java.lang.Object r2 = r10.theUnsafe     // Catch: java.lang.Exception -> L54
            java.lang.reflect.Field r4 = r10.overrideField     // Catch: java.lang.Exception -> L54
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L54
            java.lang.Object r2 = r0.invoke(r2, r4)     // Catch: java.lang.Exception -> L54
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Exception -> L54
            long r4 = r2.longValue()     // Catch: java.lang.Exception -> L54
            java.lang.Class r2 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = "putBoolean"
            r7 = 3
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L54
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r7[r1] = r8     // Catch: java.lang.Exception -> L54
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L54
            r7[r3] = r8     // Catch: java.lang.Exception -> L54
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L54
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Exception -> L54
            java.lang.reflect.Method r2 = r2.getMethod(r6, r7)     // Catch: java.lang.Exception -> L54
            java.lang.Object r6 = r10.theUnsafe     // Catch: java.lang.Exception -> L54
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L54
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L54
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7, r8}     // Catch: java.lang.Exception -> L54
            r2.invoke(r6, r7)     // Catch: java.lang.Exception -> L54
            return r3
        L54:
            r0 = move-exception
        L55:
            return r1
    }
}
