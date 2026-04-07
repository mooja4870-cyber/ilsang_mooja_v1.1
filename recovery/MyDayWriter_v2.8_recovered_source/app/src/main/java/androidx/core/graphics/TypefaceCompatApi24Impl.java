package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatApi24Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi24Impl";
    private static final java.lang.reflect.Method sAddFontWeightStyle = null;
    private static final java.lang.reflect.Method sCreateFromFamiliesWithDefault = null;
    private static final java.lang.Class<?> sFontFamily = null;
    private static final java.lang.reflect.Constructor<?> sFontFamilyCtor = null;

    static {
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L43
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Constructor r2 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "addFontWeightStyle"
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L43
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r7 = 2
            r4[r7] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L43
            r7 = 3
            r4[r7] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L43
            r7 = 4
            r4[r7] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r3 = r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r0, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r7 = "createFromFamiliesWithDefault"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L43
            java.lang.Class r8 = r4.getClass()     // Catch: java.lang.Throwable -> L43
            r6[r1] = r8     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r1 = r5.getMethod(r7, r6)     // Catch: java.lang.Throwable -> L43
            goto L57
        L43:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r1
            r1 = r4
        L57:
            androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamilyCtor = r2
            androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamily = r0
            androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle = r3
            androidx.core.graphics.TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault = r1
            return
    }

    TypefaceCompatApi24Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean addFontWeightStyle(java.lang.Object r5, java.nio.ByteBuffer r6, int r7, int r8, boolean r9) {
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r4, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            boolean r1 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            return r1
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r1 = 0
            return r1
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r4) {
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            java.lang.reflect.Method r2 = androidx.core.graphics.TypefaceCompatApi24Impl.sCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            return r2
        L19:
            r1 = move-exception
            goto L1c
        L1b:
            r1 = move-exception
        L1c:
            return r0
    }

    public static boolean isUsable() {
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi24Impl"
            java.lang.String r1 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sAddFontWeightStyle
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private static java.lang.Object newFamily() {
            java.lang.reflect.Constructor<?> r0 = androidx.core.graphics.TypefaceCompatApi24Impl.sFontFamilyCtor     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            r1 = 0
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r11, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            java.lang.Object r0 = newFamily()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r2 = r12.getEntries()
            int r3 = r2.length
            r4 = 0
        Le:
            if (r4 >= r3) goto L34
            r5 = r2[r4]
            int r6 = r5.getResourceId()
            java.nio.ByteBuffer r6 = androidx.core.graphics.TypefaceCompatUtil.copyToDirectBuffer(r11, r13, r6)
            if (r6 != 0) goto L1e
            return r1
        L1e:
            int r7 = r5.getTtcIndex()
            int r8 = r5.getWeight()
            boolean r9 = r5.isItalic()
            boolean r7 = addFontWeightStyle(r0, r6, r7, r8, r9)
            if (r7 != 0) goto L31
            return r1
        L31:
            int r4 = r4 + 1
            goto Le
        L34:
            android.graphics.Typeface r1 = createFromFamiliesWithDefault(r0)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r12, android.os.CancellationSignal r13, androidx.core.provider.FontsContractCompat.FontInfo[] r14, int r15) {
            r11 = this;
            java.lang.Object r0 = newFamily()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.collection.SimpleArrayMap r2 = new androidx.collection.SimpleArrayMap
            r2.<init>()
            int r3 = r14.length
            r4 = 0
        Lf:
            if (r4 >= r3) goto L3f
            r5 = r14[r4]
            android.net.Uri r6 = r5.getUri()
            java.lang.Object r7 = r2.get(r6)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L26
            java.nio.ByteBuffer r7 = androidx.core.graphics.TypefaceCompatUtil.mmap(r12, r13, r6)
            r2.put(r6, r7)
        L26:
            if (r7 != 0) goto L29
            return r1
        L29:
            int r8 = r5.getTtcIndex()
            int r9 = r5.getWeight()
            boolean r10 = r5.isItalic()
            boolean r8 = addFontWeightStyle(r0, r7, r8, r9, r10)
            if (r8 != 0) goto L3c
            return r1
        L3c:
            int r4 = r4 + 1
            goto Lf
        L3f:
            android.graphics.Typeface r3 = createFromFamiliesWithDefault(r0)
            if (r3 != 0) goto L46
            return r1
        L46:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r15)
            return r1
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
