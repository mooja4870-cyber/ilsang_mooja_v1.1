package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    private static final java.lang.String ABORT_CREATION_METHOD = "abortCreation";
    private static final java.lang.String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final java.lang.String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String TAG = "TypefaceCompatApi26Impl";
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    public TypefaceCompatApi26Impl() {
            r8 = this;
            r8.<init>()
            java.lang.Class r0 = r8.obtainFontFamily()     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Constructor r1 = r8.obtainFontFamilyCtor(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r2 = r8.obtainAddFontFromAssetManagerMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r3 = r8.obtainAddFontFromBufferMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r4 = r8.obtainFreezeMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r5 = r8.obtainAbortCreationMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r6 = r8.obtainCreateFromFamiliesWithDefaultMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            goto L51
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to collect necessary methods for class "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
        L51:
            r8.mFontFamily = r0
            r8.mFontFamilyCtor = r1
            r8.mAddFontFromAssetManager = r2
            r8.mAddFontFromBuffer = r3
            r8.mFreeze = r4
            r8.mAbortCreation = r5
            r8.mCreateFromFamiliesWithDefault = r6
            return
    }

    private void abortCreation(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAbortCreation     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L9 java.lang.IllegalAccessException -> Lb
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            return
    }

    private boolean addFontFromAssetManager(android.content.Context r11, java.lang.Object r12, java.lang.String r13, int r14, int r15, int r16, android.graphics.fonts.FontVariationAxis[] r17) {
            r10 = this;
            r1 = 0
            java.lang.reflect.Method r0 = r10.mAddFontFromAssetManager     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            android.content.res.AssetManager r2 = r11.getAssets()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            r3 = r13
            r9 = r17
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9}     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Object r0 = r0.invoke(r12, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            return r0
        L2d:
            r0 = move-exception
            goto L30
        L2f:
            r0 = move-exception
        L30:
            return r1
    }

    private boolean addFontFromBuffer(java.lang.Object r6, java.nio.ByteBuffer r7, int r8, int r9, int r10) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.mAddFontFromBuffer     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r4, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Object r0 = r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            return r0
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r1 = 0
            return r1
    }

    private boolean freeze(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mFreeze     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            boolean r0 = r1.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            return r0
        L10:
            r1 = move-exception
            goto L13
        L12:
            r1 = move-exception
        L13:
            return r0
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private java.lang.Object newFamily() {
            r2 = this;
            java.lang.reflect.Constructor<?> r0 = r2.mFontFamilyCtor     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.InstantiationException -> Lc java.lang.IllegalAccessException -> Le
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = move-exception
            goto Lf
        Le:
            r0 = move-exception
        Lf:
            r1 = 0
            return r1
    }

    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.Class<?> r1 = r5.mFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.reflect.Method r2 = r5.mCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r4, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L24
            return r2
        L22:
            r1 = move-exception
            goto L25
        L24:
            r1 = move-exception
        L25:
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r14, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r15, android.content.res.Resources r16, int r17) {
            r13 = this;
            boolean r0 = r13.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r0 = super.createFromFontFamilyFilesResourceEntry(r14, r15, r16, r17)
            return r0
        Lb:
            java.lang.Object r3 = r13.newFamily()
            r0 = 0
            if (r3 != 0) goto L13
            return r0
        L13:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r9 = r15.getEntries()
            int r10 = r9.length
            r1 = 0
            r11 = r1
        L1a:
            if (r11 >= r10) goto L45
            r12 = r9[r11]
            java.lang.String r4 = r12.getFileName()
            int r5 = r12.getTtcIndex()
            int r6 = r12.getWeight()
            boolean r7 = r12.isItalic()
            java.lang.String r1 = r12.getVariationSettings()
            android.graphics.fonts.FontVariationAxis[] r8 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r1)
            r1 = r13
            r2 = r14
            boolean r4 = r1.addFontFromAssetManager(r2, r3, r4, r5, r6, r7, r8)
            if (r4 != 0) goto L42
            r13.abortCreation(r3)
            return r0
        L42:
            int r11 = r11 + 1
            goto L1a
        L45:
            boolean r2 = r13.freeze(r3)
            if (r2 != 0) goto L4c
            return r0
        L4c:
            android.graphics.Typeface r0 = r13.createFromFamiliesWithDefault(r3)
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r17, android.os.CancellationSignal r18, androidx.core.provider.FontsContractCompat.FontInfo[] r19, int r20) {
            r16 = this;
            r1 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            int r0 = r8.length
            r2 = 1
            r10 = 0
            if (r0 >= r2) goto Le
            return r10
        Le:
            boolean r0 = r1.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto L63
            androidx.core.provider.FontsContractCompat$FontInfo r2 = r1.findBestInfo(r8, r9)
            android.content.ContentResolver r3 = r17.getContentResolver()
            android.net.Uri r0 = r2.getUri()     // Catch: java.io.IOException -> L61
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r0 = r3.openFileDescriptor(r0, r4, r7)     // Catch: java.io.IOException -> L61
            r4 = r0
            if (r4 != 0) goto L31
        L2b:
            if (r4 == 0) goto L30
            r4.close()     // Catch: java.io.IOException -> L61
        L30:
            return r10
        L31:
            android.graphics.Typeface$Builder r0 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L54
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L54
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L54
            int r5 = r2.getWeight()     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface$Builder r0 = r0.setWeight(r5)     // Catch: java.lang.Throwable -> L54
            boolean r5 = r2.isItalic()     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface$Builder r0 = r0.setItalic(r5)     // Catch: java.lang.Throwable -> L54
            android.graphics.Typeface r0 = r0.build()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L53
            r4.close()     // Catch: java.io.IOException -> L61
        L53:
            return r0
        L54:
            r0 = move-exception
            r5 = r0
            if (r4 == 0) goto L60
            r4.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.io.IOException -> L61
        L60:
            throw r5     // Catch: java.io.IOException -> L61
        L61:
            r0 = move-exception
            return r10
        L63:
            r11 = r17
            java.util.Map r0 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r11, r8, r7)
            java.lang.Object r2 = r1.newFamily()
            if (r2 != 0) goto L70
            return r10
        L70:
            r3 = 0
            int r12 = r8.length
            r4 = 0
            r13 = r3
            r14 = r4
        L75:
            if (r14 >= r12) goto La2
            r15 = r8[r14]
            android.net.Uri r3 = r15.getUri()
            java.lang.Object r3 = r0.get(r3)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 != 0) goto L86
            goto L9f
        L86:
            int r4 = r15.getTtcIndex()
            int r5 = r15.getWeight()
            boolean r6 = r15.isItalic()
            boolean r4 = r1.addFontFromBuffer(r2, r3, r4, r5, r6)
            if (r4 != 0) goto L9d
            r1.abortCreation(r2)
            return r10
        L9d:
            r5 = 1
            r13 = r5
        L9f:
            int r14 = r14 + 1
            goto L75
        La2:
            if (r13 != 0) goto La8
            r1.abortCreation(r2)
            return r10
        La8:
            boolean r3 = r1.freeze(r2)
            if (r3 != 0) goto Laf
            return r10
        Laf:
            android.graphics.Typeface r3 = r1.createFromFamiliesWithDefault(r2)
            if (r3 != 0) goto Lb6
            return r10
        Lb6:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r3, r9)
            return r4
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public /* bridge */ /* synthetic */ android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context r1, android.os.CancellationSignal r2, java.util.List r3, int r4) {
            r0 = this;
            android.graphics.Typeface r1 = super.createFromFontInfoWithFallback(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
            r9 = this;
            boolean r0 = r9.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r0 = super.createFromResourcesFontFile(r10, r11, r12, r13, r14)
            return r0
        Lb:
            java.lang.Object r3 = r9.newFamily()
            r0 = 0
            if (r3 != 0) goto L13
            return r0
        L13:
            r7 = -1
            r8 = 0
            r5 = 0
            r6 = -1
            r1 = r9
            r2 = r10
            r4 = r13
            boolean r10 = r1.addFontFromAssetManager(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L24
            r9.abortCreation(r3)
            return r0
        L24:
            boolean r10 = r9.freeze(r3)
            if (r10 != 0) goto L2b
            return r0
        L2b:
            android.graphics.Typeface r10 = r9.createFromFamiliesWithDefault(r3)
            return r10
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            r2 = this;
            r0 = 0
            android.graphics.Typeface r1 = androidx.core.graphics.WeightTypefaceApi26.createWeightStyle(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L7
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

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "abortCreation"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 8
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 3
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r1] = r2
            r1 = 4
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 5
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 6
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r0[r1] = r2
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r0 = r4.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r0[r1] = r2
            r1 = 3
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 4
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r0 = r4.getMethod(r1, r0)
            return r0
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r7) throws java.lang.NoSuchMethodException {
            r6 = this;
            r0 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r7, r0)
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Class r4 = r1.getClass()
            r5 = 0
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r0] = r4
            r4 = 2
            java.lang.Class r5 = java.lang.Integer.TYPE
            r3[r4] = r5
            java.lang.String r4 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)
            r2.setAccessible(r0)
            return r2
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)
            return r0
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "freeze"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            return r0
    }
}
