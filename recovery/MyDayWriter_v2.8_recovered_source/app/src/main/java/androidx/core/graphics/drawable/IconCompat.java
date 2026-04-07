package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final java.lang.String EXTRA_INT1 = "int1";
    static final java.lang.String EXTRA_INT2 = "int2";
    static final java.lang.String EXTRA_OBJ = "obj";
    static final java.lang.String EXTRA_STRING1 = "string1";
    static final java.lang.String EXTRA_TINT_LIST = "tint_list";
    static final java.lang.String EXTRA_TINT_MODE = "tint_mode";
    static final java.lang.String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final java.lang.String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    java.lang.Object mObj1;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;
    public java.lang.String mTintModeStr;
    public int mType;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context r4, android.graphics.drawable.Icon r5) {
                int r0 = getType(r5)
                switch(r0) {
                    case 2: goto L22;
                    case 3: goto L7;
                    case 4: goto L19;
                    case 5: goto L7;
                    case 6: goto L10;
                    default: goto L7;
                }
            L7:
                androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
                r1 = -1
                r0.<init>(r1)
                r0.mObj1 = r5
                return r0
            L10:
                android.net.Uri r0 = getUri(r5)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(r0)
                return r0
            L19:
                android.net.Uri r0 = getUri(r5)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithContentUri(r0)
                return r0
            L22:
                java.lang.String r0 = getResPackage(r5)
                android.content.res.Resources r1 = androidx.core.graphics.drawable.IconCompat.getResources(r4, r0)     // Catch: android.content.res.Resources.NotFoundException -> L33
                int r2 = getResId(r5)     // Catch: android.content.res.Resources.NotFoundException -> L33
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithResource(r1, r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L33
                return r1
            L33:
                r1 = move-exception
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Icon resource cannot be found"
                r2.<init>(r3)
                throw r2
        }

        static androidx.core.graphics.drawable.IconCompat createFromIconInner(java.lang.Object r3) {
                androidx.core.util.Preconditions.checkNotNull(r3)
                int r0 = getType(r3)
                switch(r0) {
                    case 2: goto L25;
                    case 3: goto La;
                    case 4: goto L1c;
                    case 5: goto La;
                    case 6: goto L13;
                    default: goto La;
                }
            La:
                androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
                r1 = -1
                r0.<init>(r1)
                r0.mObj1 = r3
                return r0
            L13:
                android.net.Uri r0 = getUri(r3)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(r0)
                return r0
            L1c:
                android.net.Uri r0 = getUri(r3)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithContentUri(r0)
                return r0
            L25:
                java.lang.String r0 = getResPackage(r3)
                int r1 = getResId(r3)
                r2 = 0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r2, r0, r1)
                return r0
        }

        static int getResId(java.lang.Object r6) {
                java.lang.String r0 = "Unable to get icon resource"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                int r0 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResId(r6)
                return r0
            Lf:
                r2 = 0
                java.lang.Class r3 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.String r4 = "getResId"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Object r3 = r3.invoke(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                int r0 = r3.intValue()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
                return r0
            L29:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L2e:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L33:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
        }

        static java.lang.String getResPackage(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon package"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                java.lang.String r0 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getResPackage(r7)
                return r0
            Lf:
                r2 = 0
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r4 = "getResPackage"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object r3 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                return r3
            L26:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L2b:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L30:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
        }

        static int getType(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon type "
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                int r0 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getType(r7)
                return r0
            Lf:
                r2 = -1
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                java.lang.String r4 = "getType"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                java.lang.Object r3 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                int r0 = r3.intValue()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L40 java.lang.IllegalAccessException -> L56
                return r0
            L2a:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r0 = r4.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r1, r0, r3)
                return r2
            L40:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r0 = r4.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r1, r0, r3)
                return r2
            L56:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r0 = r4.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r1, r0, r3)
                return r2
        }

        static android.net.Uri getUri(java.lang.Object r7) {
                java.lang.String r0 = "Unable to get icon uri"
                java.lang.String r1 = "IconCompat"
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r2 < r3) goto Lf
                android.net.Uri r0 = androidx.core.graphics.drawable.IconCompat.Api28Impl.getUri(r7)
                return r0
            Lf:
                r2 = 0
                java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.String r4 = "getUri"
                r5 = 0
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                java.lang.Object r3 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
                return r3
            L26:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L2b:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
            L30:
                r3 = move-exception
                android.util.Log.e(r1, r0, r3)
                return r2
        }

        static android.graphics.drawable.Drawable loadDrawable(android.graphics.drawable.Icon r1, android.content.Context r2) {
                android.graphics.drawable.Drawable r0 = r1.loadDrawable(r2)
                return r0
        }

        static android.graphics.drawable.Icon toIcon(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
                int r0 = r4.mType
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lda;
                    case 0: goto L8;
                    case 1: goto Lbc;
                    case 2: goto Lb1;
                    case 3: goto La4;
                    case 4: goto L9b;
                    case 5: goto L81;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unknown type"
                r0.<init>(r1)
                throw r0
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r0 = r4.getUri()
                android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(r0)
                goto Lc5
            L20:
                if (r5 == 0) goto L64
                java.io.InputStream r0 = r4.getUriInputStream(r5)
                if (r0 == 0) goto L47
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto L37
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)
                android.graphics.drawable.Icon r1 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r1)
                r0 = r1
                goto Lc5
            L37:
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0)
                android.graphics.Bitmap r1 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r2, r1)
                android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithBitmap(r1)
                r0 = r1
                goto Lc5
            L47:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot load adaptive icon from uri: "
                java.lang.StringBuilder r2 = r2.append(r3)
                android.net.Uri r3 = r4.getUri()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L64:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Context is required to resolve the file uri of the icon: "
                java.lang.StringBuilder r1 = r1.append(r2)
                android.net.Uri r2 = r4.getUri()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L81:
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r2) goto L8e
                java.lang.Object r0 = r4.mObj1
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r0)
                goto Lc5
            L8e:
                java.lang.Object r0 = r4.mObj1
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                android.graphics.Bitmap r0 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r0, r1)
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
                goto Lc5
            L9b:
                java.lang.Object r0 = r4.mObj1
                java.lang.String r0 = (java.lang.String) r0
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
                goto Lc5
            La4:
                java.lang.Object r0 = r4.mObj1
                byte[] r0 = (byte[]) r0
                int r1 = r4.mInt1
                int r2 = r4.mInt2
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
                goto Lc5
            Lb1:
                java.lang.String r0 = r4.getResPackage()
                int r1 = r4.mInt1
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
                goto Lc5
            Lbc:
                java.lang.Object r0 = r4.mObj1
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
            Lc5:
                android.content.res.ColorStateList r1 = r4.mTintList
                if (r1 == 0) goto Lce
                android.content.res.ColorStateList r1 = r4.mTintList
                r0.setTintList(r1)
            Lce:
                android.graphics.PorterDuff$Mode r1 = r4.mTintMode
                android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
                if (r1 == r2) goto Ld9
                android.graphics.PorterDuff$Mode r1 = r4.mTintMode
                r0.setTintMode(r1)
            Ld9:
                return r0
            Lda:
                java.lang.Object r0 = r4.mObj1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable createAdaptiveIconDrawable(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2) {
                android.graphics.drawable.AdaptiveIconDrawable r0 = new android.graphics.drawable.AdaptiveIconDrawable
                r0.<init>(r1, r2)
                return r0
        }

        static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap r1) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r1)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getResId(java.lang.Object r1) {
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getResId()
                return r0
        }

        static java.lang.String getResPackage(java.lang.Object r1) {
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                java.lang.String r0 = r0.getResPackage()
                return r0
        }

        static int getType(java.lang.Object r1) {
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getType()
                return r0
        }

        static android.net.Uri getUri(java.lang.Object r1) {
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.net.Uri r0 = r0.getUri()
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri r1) {
                android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r1)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mType = r0
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            return
    }

    IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mType = r0
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            r2.mType = r3
            return
    }

    public static androidx.core.graphics.drawable.IconCompat createFromBundle(android.os.Bundle r4) {
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r0)
            java.lang.String r2 = "int1"
            int r2 = r4.getInt(r2)
            r1.mInt1 = r2
            java.lang.String r2 = "int2"
            int r2 = r4.getInt(r2)
            r1.mInt2 = r2
            java.lang.String r2 = "string1"
            java.lang.String r2 = r4.getString(r2)
            r1.mString1 = r2
            java.lang.String r2 = "tint_list"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L33
            android.os.Parcelable r2 = r4.getParcelable(r2)
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.mTintList = r2
        L33:
            java.lang.String r2 = "tint_mode"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L46
        L3c:
            java.lang.String r2 = r4.getString(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.valueOf(r2)
            r1.mTintMode = r2
        L46:
            java.lang.String r2 = "obj"
            switch(r0) {
                case -1: goto L73;
                case 0: goto L4b;
                case 1: goto L73;
                case 2: goto L6c;
                case 3: goto L65;
                case 4: goto L6c;
                case 5: goto L73;
                case 6: goto L6c;
                default: goto L4b;
            }
        L4b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "IconCompat"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L65:
            byte[] r2 = r4.getByteArray(r2)
            r1.mObj1 = r2
            goto L7a
        L6c:
            java.lang.String r2 = r4.getString(r2)
            r1.mObj1 = r2
            goto L7a
        L73:
            android.os.Parcelable r2 = r4.getParcelable(r2)
            r1.mObj1 = r2
        L7a:
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context r1, android.graphics.drawable.Icon r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIcon(r1, r2)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon r1) {
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(r1)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(android.graphics.drawable.Icon r2) {
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(r2)
            r1 = 2
            if (r0 != r1) goto Lf
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(r2)
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.createFromIconInner(r2)
            return r0
    }

    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap r11, boolean r12) {
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            r5 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r5 = r5 * r4
            if (r12 == 0) goto L4f
            r6 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r7 = (float) r0
            float r7 = r7 * r6
            r6 = 0
            r3.setColor(r6)
            r6 = 1017817771(0x3caaaaab, float:0.020833334)
            float r8 = (float) r0
            float r8 = r8 * r6
            r6 = 1023410176(0x3d000000, float:0.03125)
            r9 = 0
            r3.setShadowLayer(r7, r9, r8, r6)
            r2.drawCircle(r4, r4, r5, r3)
            r6 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r7, r9, r9, r6)
            r2.drawCircle(r4, r4, r5, r3)
            r3.clearShadowLayer()
        L4f:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r6)
            android.graphics.BitmapShader r6 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r6.<init>(r11, r7, r8)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            int r8 = r11.getWidth()
            int r8 = r8 - r0
            int r8 = -r8
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            int r10 = r11.getHeight()
            int r10 = r10 - r0
            int r10 = -r10
            float r10 = (float) r10
            float r10 = r10 / r9
            r7.setTranslate(r8, r10)
            r6.setLocalMatrix(r7)
            r3.setShader(r6)
            r2.drawCircle(r4, r4, r5, r3)
            r8 = 0
            r2.setBitmap(r8)
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(android.graphics.Bitmap r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 5
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri r1) {
            androidx.core.util.ObjectsCompat.requireNonNull(r1)
            java.lang.String r0 = r1.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithAdaptiveBitmapContentUri(r0)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 6
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 1
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri r1) {
            androidx.core.util.ObjectsCompat.requireNonNull(r1)
            java.lang.String r0 = r1.toString()
            androidx.core.graphics.drawable.IconCompat r0 = createWithContentUri(r0)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String r2) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 4
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithData(byte[] r2, int r3, int r4) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 3
            r0.<init>(r1)
            r0.mObj1 = r2
            r0.mInt1 = r3
            r0.mInt2 = r4
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.Context r2, int r3) {
            androidx.core.util.ObjectsCompat.requireNonNull(r2)
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r1 = r2.getPackageName()
            androidx.core.graphics.drawable.IconCompat r0 = createWithResource(r0, r1, r3)
            return r0
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources r4, java.lang.String r5, int r6) {
            androidx.core.util.ObjectsCompat.requireNonNull(r5)
            if (r6 == 0) goto L24
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 2
            r0.<init>(r1)
            r0.mInt1 = r6
            if (r4 == 0) goto L1f
            java.lang.String r1 = r4.getResourceName(r6)     // Catch: android.content.res.Resources.NotFoundException -> L16
            r0.mObj1 = r1     // Catch: android.content.res.Resources.NotFoundException -> L16
            goto L21
        L16:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
        L1f:
            r0.mObj1 = r5
        L21:
            r0.mString1 = r5
            return r0
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Drawable resource ID must not be 0"
            r0.<init>(r1)
            throw r0
    }

    static android.content.res.Resources getResources(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "android"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Ld
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            return r0
        Ld:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r1 == 0) goto L1f
            android.content.res.Resources r2 = r0.getResourcesForApplication(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            return r2
        L1f:
            return r2
        L20:
            r1 = move-exception
            java.lang.String r3 = "Unable to find pkg=%s for icon"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.String r4 = "IconCompat"
            android.util.Log.e(r4, r3, r1)
            return r2
    }

    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context r7) {
            r6 = this;
            int r0 = r6.mType
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto Lab;
                case 2: goto L75;
                case 3: goto L5f;
                case 4: goto L4b;
                case 5: goto L39;
                case 6: goto L9;
                default: goto L7;
            }
        L7:
            goto Lb9
        L9:
            java.io.InputStream r0 = r6.getUriInputStream(r7)
            if (r0 == 0) goto Lb9
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L27
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r3, r4)
            android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createAdaptiveIconDrawable(r2, r1)
            return r1
        L27:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r0)
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r4, r1)
            r2.<init>(r3, r1)
            return r2
        L39:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r7.getResources()
            java.lang.Object r3 = r6.mObj1
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r3, r1)
            r0.<init>(r2, r1)
            return r0
        L4b:
            java.io.InputStream r0 = r6.getUriInputStream(r7)
            if (r0 == 0) goto Lb9
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r7.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r2, r3)
            return r1
        L5f:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r7.getResources()
            java.lang.Object r2 = r6.mObj1
            byte[] r2 = (byte[]) r2
            int r3 = r6.mInt1
            int r4 = r6.mInt2
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r4)
            r0.<init>(r1, r2)
            return r0
        L75:
            java.lang.String r0 = r6.getResPackage()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L83
            java.lang.String r0 = r7.getPackageName()
        L83:
            android.content.res.Resources r1 = getResources(r7, r0)
            int r3 = r6.mInt1     // Catch: java.lang.RuntimeException -> L92
            android.content.res.Resources$Theme r4 = r7.getTheme()     // Catch: java.lang.RuntimeException -> L92
            android.graphics.drawable.Drawable r2 = androidx.core.content.res.ResourcesCompat.getDrawable(r1, r3, r4)     // Catch: java.lang.RuntimeException -> L92
            return r2
        L92:
            r3 = move-exception
            int r4 = r6.mInt1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r6.mObj1
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String r5 = "IconCompat"
            android.util.Log.e(r5, r4, r3)
            goto Lb9
        Lab:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r7.getResources()
            java.lang.Object r2 = r6.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r1, r2)
            return r0
        Lb9:
            return r2
    }

    private static java.lang.String typeToString(int r1) {
            switch(r1) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "URI_MASKABLE"
            return r0
        L9:
            java.lang.String r0 = "BITMAP_MASKABLE"
            return r0
        Lc:
            java.lang.String r0 = "URI"
            return r0
        Lf:
            java.lang.String r0 = "DATA"
            return r0
        L12:
            java.lang.String r0 = "RESOURCE"
            return r0
        L15:
            java.lang.String r0 = "BITMAP"
            return r0
    }

    public void addToShortcutIntent(android.content.Intent r7, android.graphics.drawable.Drawable r8, android.content.Context r9) {
            r6 = this;
            r6.checkResource(r9)
            int r0 = r6.mType
            r1 = 1
            switch(r0) {
                case 1: goto L98;
                case 2: goto L1b;
                case 3: goto L9;
                case 4: goto L9;
                case 5: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Icon type not supported for intent shortcuts"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r6.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            goto La6
        L1b:
            java.lang.String r0 = r6.getResPackage()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r1 = 0
            android.content.Context r0 = r9.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r8 != 0) goto L32
            java.lang.String r1 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r2 = r6.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.Intent$ShortcutIconResource r2 = android.content.Intent.ShortcutIconResource.fromContext(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r7.putExtra(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            return
        L32:
            int r2 = r6.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            int r3 = r2.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r3 <= 0) goto L54
            int r3 = r2.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r3 > 0) goto L45
            goto L54
        L45:
            int r3 = r2.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            int r4 = r2.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            goto L67
        L54:
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            int r3 = r3.getLauncherLargeIconSize()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r3 = r4
        L67:
            int r4 = r3.getWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            int r5 = r3.getHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r2.setBounds(r1, r1, r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r1.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r2.draw(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            r0 = r3
            goto La6
        L7c:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't find package "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r3 = r6.mObj1
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L98:
            java.lang.Object r0 = r6.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r8 == 0) goto La6
            android.graphics.Bitmap$Config r2 = r0.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r2, r1)
        La6:
            if (r8 == 0) goto Lbf
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r3 = r1 / 2
            int r4 = r2 / 2
            r8.setBounds(r3, r4, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r8.draw(r3)
        Lbf:
            java.lang.String r1 = "android.intent.extra.shortcut.ICON"
            r7.putExtra(r1, r0)
            return
    }

    public void checkResource(android.content.Context r11) {
            r10 = this;
            int r0 = r10.mType
            r1 = 2
            if (r0 != r1) goto L75
            java.lang.Object r0 = r10.mObj1
            if (r0 == 0) goto L75
            java.lang.Object r0 = r10.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L16
            return
        L16:
            r2 = -1
            java.lang.String[] r3 = r0.split(r1, r2)
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "/"
            java.lang.String[] r6 = r3.split(r5, r2)
            r7 = 0
            r6 = r6[r7]
            java.lang.String[] r5 = r3.split(r5, r2)
            r3 = r5[r4]
            java.lang.String[] r1 = r0.split(r1, r2)
            r1 = r1[r7]
            java.lang.String r2 = "0_resource_name_obfuscated"
            boolean r2 = r2.equals(r3)
            java.lang.String r4 = "IconCompat"
            if (r2 == 0) goto L43
            java.lang.String r2 = "Found obfuscated resource, not trying to update resource id for it"
            android.util.Log.i(r4, r2)
            return
        L43:
            java.lang.String r2 = r10.getResPackage()
            android.content.res.Resources r5 = getResources(r11, r2)
            int r7 = r5.getIdentifier(r3, r6, r1)
            int r8 = r10.mInt1
            if (r8 == r7) goto L75
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Id has changed for "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r9 = " "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r4, r8)
            r10.mInt1 = r7
        L75:
            return
    }

    public android.graphics.Bitmap getBitmap() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L12
            java.lang.Object r0 = r3.mObj1
            boolean r0 = r0 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L10
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L10:
            r0 = 0
            return r0
        L12:
            int r0 = r3.mType
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L1c:
            int r0 = r3.mType
            r2 = 5
            if (r0 != r2) goto L2a
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getBitmap() on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getResId() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r3.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResId(r0)
            return r0
        Lc:
            int r0 = r3.mType
            r1 = 2
            if (r0 != r1) goto L14
            int r0 = r3.mInt1
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getResPackage() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getResPackage(r0)
            return r0
        Lc:
            int r0 = r3.mType
            r2 = 2
            if (r0 != r2) goto L2f
            java.lang.String r0 = r3.mString1
            if (r0 == 0) goto L21
            java.lang.String r0 = r3.mString1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            goto L21
        L1e:
            java.lang.String r0 = r3.mString1
            return r0
        L21:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getType() {
            r2 = this;
            int r0 = r2.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r2.mObj1
            int r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getType(r0)
            return r0
        Lc:
            int r0 = r2.mType
            return r0
    }

    public android.net.Uri getUri() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r3.mObj1
            android.net.Uri r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.getUri(r0)
            return r0
        Lc:
            int r0 = r3.mType
            r1 = 4
            if (r0 == r1) goto L30
            int r0 = r3.mType
            r1 = 6
            if (r0 != r1) goto L17
            goto L30
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getUri() on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public java.io.InputStream getUriInputStream(android.content.Context r7) {
            r6 = this;
            android.net.Uri r0 = r6.getUri()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "IconCompat"
            if (r2 != 0) goto L42
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1b
            goto L42
        L1b:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L2a
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.Object r5 = r6.mObj1     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.FileNotFoundException -> L2a
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L2a
            r2.<init>(r4)     // Catch: java.io.FileNotFoundException -> L2a
            return r2
        L2a:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to load image from path: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r3, r4, r2)
            goto L63
        L42:
            android.content.ContentResolver r2 = r7.getContentResolver()     // Catch: java.lang.Exception -> L4b
            java.io.InputStream r2 = r2.openInputStream(r0)     // Catch: java.lang.Exception -> L4b
            return r2
        L4b:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to load image from URI: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r3, r4, r2)
        L63:
            r2 = 0
            return r2
    }

    public android.graphics.drawable.Drawable loadDrawable(android.content.Context r2) {
            r1 = this;
            r1.checkResource(r2)
            android.graphics.drawable.Icon r0 = r1.toIcon(r2)
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.loadDrawable(r0, r2)
            return r0
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
            r4 = this;
            java.lang.String r0 = r4.mTintModeStr
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r4.mTintMode = r0
            int r0 = r4.mType
            r1 = 0
            switch(r0) {
                case -1: goto L54;
                case 0: goto Le;
                case 1: goto L3c;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto L14;
                case 5: goto L3c;
                case 6: goto L14;
                default: goto Le;
            }
        Le:
            goto L65
        Lf:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            goto L65
        L14:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r4.mData
            java.lang.String r3 = "UTF-16"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r0.<init>(r2, r3)
            r4.mObj1 = r0
            int r0 = r4.mType
            r2 = 2
            if (r0 != r2) goto L65
            java.lang.String r0 = r4.mString1
            if (r0 != 0) goto L65
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r0 = r0.split(r2, r3)
            r0 = r0[r1]
            r4.mString1 = r0
            goto L65
        L3c:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L45
            android.os.Parcelable r0 = r4.mParcelable
            r4.mObj1 = r0
            goto L65
        L45:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            r0 = 3
            r4.mType = r0
            r4.mInt1 = r1
            byte[] r0 = r4.mData
            int r0 = r0.length
            r4.mInt2 = r0
            goto L65
        L54:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L5d
            android.os.Parcelable r0 = r4.mParcelable
            r4.mObj1 = r0
            goto L65
        L5d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L65:
            return
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean r5) {
            r4 = this;
            android.graphics.PorterDuff$Mode r0 = r4.mTintMode
            java.lang.String r0 = r0.name()
            r4.mTintModeStr = r0
            int r0 = r4.mType
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L57;
                case 0: goto Lf;
                case 1: goto L37;
                case 2: goto L28;
                case 3: goto L21;
                case 4: goto L10;
                case 5: goto L37;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L68
        L10:
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r4.mData = r0
            goto L68
        L21:
            java.lang.Object r0 = r4.mObj1
            byte[] r0 = (byte[]) r0
            r4.mData = r0
            goto L68
        L28:
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r4.mData = r0
            goto L68
        L37:
            if (r5 == 0) goto L50
            java.lang.Object r0 = r4.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            r3 = 90
            r0.compress(r2, r3, r1)
            byte[] r2 = r1.toByteArray()
            r4.mData = r2
            goto L68
        L50:
            java.lang.Object r0 = r4.mObj1
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r4.mParcelable = r0
            goto L68
        L57:
            if (r5 != 0) goto L60
            java.lang.Object r0 = r4.mObj1
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r4.mParcelable = r0
            goto L68
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r0.<init>(r1)
            throw r0
        L68:
            return
    }

    public androidx.core.graphics.drawable.IconCompat setTint(int r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            androidx.core.graphics.drawable.IconCompat r0 = r1.setTintList(r0)
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mTintList = r1
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mTintMode = r1
            return r0
    }

    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.mType
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L2c;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid icon"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.Object r1 = r3.mObj1
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L34
        L1c:
            java.lang.Object r1 = r3.mObj1
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L34
        L24:
            java.lang.Object r1 = r3.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.putParcelable(r2, r1)
            goto L34
        L2c:
            java.lang.Object r1 = r3.mObj1
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
        L34:
            java.lang.String r1 = "type"
            int r2 = r3.mType
            r0.putInt(r1, r2)
            java.lang.String r1 = "int1"
            int r2 = r3.mInt1
            r0.putInt(r1, r2)
            java.lang.String r1 = "int2"
            int r2 = r3.mInt2
            r0.putInt(r1, r2)
            java.lang.String r1 = "string1"
            java.lang.String r2 = r3.mString1
            r0.putString(r1, r2)
            android.content.res.ColorStateList r1 = r3.mTintList
            if (r1 == 0) goto L5b
            java.lang.String r1 = "tint_list"
            android.content.res.ColorStateList r2 = r3.mTintList
            r0.putParcelable(r1, r2)
        L5b:
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto L6c
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L6c:
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Icon r0 = r1.toIcon(r0)
            return r0
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context r2) {
            r1 = this;
            android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.IconCompat.Api23Impl.toIcon(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.mObj1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.mType
            java.lang.String r1 = typeToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.mType
            switch(r1) {
                case 1: goto L72;
                case 2: goto L4a;
                case 3: goto L2f;
                case 4: goto L23;
                case 5: goto L72;
                case 6: goto L23;
                default: goto L22;
            }
        L22:
            goto L96
        L23:
            java.lang.String r1 = " uri="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.Object r2 = r4.mObj1
            r1.append(r2)
            goto L96
        L2f:
            java.lang.String r1 = " len="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r4.mInt1
            r1.append(r2)
            int r1 = r4.mInt2
            if (r1 == 0) goto L96
            java.lang.String r1 = " off="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r4.mInt2
            r1.append(r2)
            goto L96
        L4a:
            java.lang.String r1 = " pkg="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r4.mString1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " id="
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.getResId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "0x%08x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.append(r2)
            goto L96
        L72:
            java.lang.String r1 = " size="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.Object r2 = r4.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r2 = r2.getWidth()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Object r2 = r4.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r2 = r2.getHeight()
            r1.append(r2)
        L96:
            android.content.res.ColorStateList r1 = r4.mTintList
            if (r1 == 0) goto La4
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.mTintList
            r0.append(r1)
        La4:
            android.graphics.PorterDuff$Mode r1 = r4.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            java.lang.StringBuilder r1 = r0.append(r1)
            android.graphics.PorterDuff$Mode r2 = r4.mTintMode
            r1.append(r2)
        Lb5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
