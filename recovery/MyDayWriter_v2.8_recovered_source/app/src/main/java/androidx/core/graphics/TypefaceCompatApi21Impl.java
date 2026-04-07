package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatApi21Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi21Impl";
    private static java.lang.reflect.Method sAddFontWeightStyle;
    private static java.lang.reflect.Method sCreateFromFamiliesWithDefault;
    private static java.lang.Class<?> sFontFamily;
    private static java.lang.reflect.Constructor<?> sFontFamilyCtor;
    private static boolean sHasInitBeenCalled;

    static {
            r0 = 0
            androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled = r0
            return
    }

    TypefaceCompatApi21Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean addFontWeightStyle(java.lang.Object r3, java.lang.String r4, int r5, boolean r6) {
            init()
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object r0 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            boolean r1 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r1
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = move-exception
        L1f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r4) {
            init()
            java.lang.Class<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.reflect.Method r1 = androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r1
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = move-exception
        L1f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private java.io.File getFile(android.os.ParcelFileDescriptor r4) {
            r3 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L2f
            r1.<init>()     // Catch: android.system.ErrnoException -> L2f
            java.lang.String r2 = "/proc/self/fd/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: android.system.ErrnoException -> L2f
            int r2 = r4.getFd()     // Catch: android.system.ErrnoException -> L2f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: android.system.ErrnoException -> L2f
            java.lang.String r1 = r1.toString()     // Catch: android.system.ErrnoException -> L2f
            java.lang.String r1 = android.system.Os.readlink(r1)     // Catch: android.system.ErrnoException -> L2f
            android.system.StructStat r2 = android.system.Os.stat(r1)     // Catch: android.system.ErrnoException -> L2f
            int r2 = r2.st_mode     // Catch: android.system.ErrnoException -> L2f
            boolean r2 = android.system.OsConstants.S_ISREG(r2)     // Catch: android.system.ErrnoException -> L2f
            if (r2 == 0) goto L2e
            java.io.File r2 = new java.io.File     // Catch: android.system.ErrnoException -> L2f
            r2.<init>(r1)     // Catch: android.system.ErrnoException -> L2f
            return r2
        L2e:
            return r0
        L2f:
            r1 = move-exception
            return r0
    }

    private static void init() {
            boolean r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled = r0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L40
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L40
            r5[r0] = r6     // Catch: java.lang.Throwable -> L40
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L40
            r7 = 2
            r5[r7] = r6     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r7 = "createFromFamiliesWithDefault"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L40
            java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Throwable -> L40
            r0[r2] = r8     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.Throwable -> L40
            goto L53
        L40:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r3 = 0
            r4 = 0
            r2 = 0
            r0 = r2
        L53:
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor = r3
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily = r1
            androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle = r4
            androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault = r0
            return
    }

    private static java.lang.Object newFamily() {
            init()
            java.lang.reflect.Constructor<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r11, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            java.lang.Object r0 = newFamily()
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r1 = r12.getEntries()
            int r2 = r1.length
            r3 = 0
        La:
            if (r3 >= r2) goto L4e
            r4 = r1[r3]
            java.io.File r5 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r11)
            r6 = 0
            if (r5 != 0) goto L16
            return r6
        L16:
            int r7 = r4.getResourceId()     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            boolean r7 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r5, r13, r7)     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            if (r7 != 0) goto L25
        L21:
            r5.delete()
            return r6
        L25:
            java.lang.String r7 = r5.getPath()     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            int r8 = r4.getWeight()     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            boolean r9 = r4.isItalic()     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            boolean r7 = addFontWeightStyle(r0, r7, r8, r9)     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L48
            if (r7 != 0) goto L3c
        L38:
            r5.delete()
            return r6
        L3c:
            r5.delete()
            int r3 = r3 + 1
            goto La
        L43:
            r1 = move-exception
            r5.delete()
            throw r1
        L48:
            r1 = move-exception
            r5.delete()
            return r6
        L4e:
            android.graphics.Typeface r1 = createFromFamiliesWithDefault(r0)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r9, android.os.CancellationSignal r10, androidx.core.provider.FontsContractCompat.FontInfo[] r11, int r12) {
            r8 = this;
            int r0 = r11.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            androidx.core.provider.FontsContractCompat$FontInfo r0 = r8.findBestInfo(r11, r12)
            android.content.ContentResolver r1 = r9.getContentResolver()
            android.net.Uri r3 = r0.getUri()     // Catch: java.io.IOException -> L65
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r1.openFileDescriptor(r3, r4, r10)     // Catch: java.io.IOException -> L65
            if (r3 != 0) goto L22
        L1c:
            if (r3 == 0) goto L21
            r3.close()     // Catch: java.io.IOException -> L65
        L21:
            return r2
        L22:
            java.io.File r4 = r8.getFile(r3)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L39
            boolean r5 = r4.canRead()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L2f
            goto L39
        L2f:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.io.IOException -> L65
        L38:
            return r5
        L39:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L59
            java.io.FileDescriptor r6 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L59
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L59
            android.graphics.Typeface r6 = super.createFromInputStream(r9, r5)     // Catch: java.lang.Throwable -> L4f
            r5.close()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.io.IOException -> L65
        L4e:
            return r6
        L4f:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L59
        L58:
            throw r6     // Catch: java.lang.Throwable -> L59
        L59:
            r4 = move-exception
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L65
        L64:
            throw r4     // Catch: java.io.IOException -> L65
        L65:
            r3 = move-exception
            return r2
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            r2 = this;
            r0 = 0
            android.graphics.Typeface r1 = androidx.core.graphics.WeightTypefaceApi21.createWeightStyle(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L7
            r0 = r1
            goto L8
        L7:
            r1 = move-exception
        L8:
            if (r0 != 0) goto Le
            android.graphics.Typeface r0 = super.createWeightStyle(r3, r4, r5, r6)
        Le:
            return r0
    }
}
