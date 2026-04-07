package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class SuggestionsAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter implements android.view.View.OnClickListener {
    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final java.lang.String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache;
    private final android.content.Context mProviderContext;
    private int mQueryRefinement;
    private final androidx.appcompat.widget.SearchView mSearchView;
    private final android.app.SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private android.content.res.ColorStateList mUrlColor;

    private static final class ChildViewCache {
        public final android.widget.ImageView mIcon1;
        public final android.widget.ImageView mIcon2;
        public final android.widget.ImageView mIconRefine;
        public final android.widget.TextView mText1;
        public final android.widget.TextView mText2;

        public ChildViewCache(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.mText1 = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.mText2 = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIcon1 = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIcon2 = r0
                int r0 = androidx.appcompat.R.id.edit_query
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIconRefine = r0
                return
        }
    }

    public SuggestionsAdapter(android.content.Context r4, androidx.appcompat.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 0
            r2 = 1
            r3.<init>(r4, r0, r1, r2)
            r0 = 0
            r3.mClosed = r0
            r3.mQueryRefinement = r2
            r0 = -1
            r3.mText1Col = r0
            r3.mText2Col = r0
            r3.mText2UrlCol = r0
            r3.mIconName1Col = r0
            r3.mIconName2Col = r0
            r3.mFlagsCol = r0
            r3.mSearchView = r5
            r3.mSearchable = r6
            int r0 = r5.getSuggestionCommitIconResId()
            r3.mCommitIconResId = r0
            r3.mProviderContext = r4
            r3.mOutsideDrawablesCache = r7
            return
    }

    private android.graphics.drawable.Drawable checkIconCache(java.lang.String r3) {
            r2 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r2.mOutsideDrawablesCache
            java.lang.Object r0 = r0.get(r3)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            android.graphics.drawable.Drawable r1 = r0.newDrawable()
            return r1
    }

    private java.lang.CharSequence formatUrl(java.lang.CharSequence r8) {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.mUrlColor
            if (r0 != 0) goto L23
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r7.mProviderContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.R.attr.textColorSearchUrl
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.Context r1 = r7.mProviderContext
            android.content.res.Resources r1 = r1.getResources()
            int r2 = r0.resourceId
            android.content.res.ColorStateList r1 = r1.getColorStateList(r2)
            r7.mUrlColor = r1
        L23:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r8)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r5 = r7.mUrlColor
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            int r2 = r8.length()
            r4 = 33
            r0.setSpan(r1, r3, r2, r4)
            return r0
    }

    private android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName r10) {
            r9 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            android.content.Context r1 = r9.mProviderContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            android.content.pm.ActivityInfo r2 = r1.getActivityInfo(r10, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            int r4 = r2.getIconResource()
            if (r4 != 0) goto L17
            return r3
        L17:
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            android.graphics.drawable.Drawable r6 = r1.getDrawable(r5, r4, r6)
            if (r6 != 0) goto L48
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid icon resource "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = " for "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r10.flattenToShortString()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r0, r7)
            return r3
        L48:
            return r6
        L49:
            r2 = move-exception
            java.lang.String r4 = r2.toString()
            android.util.Log.w(r0, r4)
            return r3
    }

    private android.graphics.drawable.Drawable getActivityIconWithCache(android.content.ComponentName r5) {
            r4 = this;
            java.lang.String r0 = r5.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r4.mOutsideDrawablesCache
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L23
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r4.mOutsideDrawablesCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L18
            goto L22
        L18:
            android.content.Context r2 = r4.mProviderContext
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r2 = r1.newDrawable(r2)
        L22:
            return r2
        L23:
            android.graphics.drawable.Drawable r1 = r4.getActivityIcon(r5)
            if (r1 != 0) goto L2a
            goto L2e
        L2a:
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
        L2e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r4.mOutsideDrawablesCache
            r3.put(r0, r2)
            return r1
    }

    public static java.lang.String getColumnString(android.database.Cursor r2, java.lang.String r3) {
            int r0 = r2.getColumnIndex(r3)
            java.lang.String r1 = getStringOrNull(r2, r0)
            return r1
    }

    private android.graphics.drawable.Drawable getDefaultIcon1() {
            r2 = this;
            android.app.SearchableInfo r0 = r2.mSearchable
            android.content.ComponentName r0 = r0.getSearchActivity()
            android.graphics.drawable.Drawable r0 = r2.getActivityIconWithCache(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            android.content.Context r1 = r2.mProviderContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.graphics.drawable.Drawable r1 = r1.getDefaultActivityIcon()
            return r1
    }

    private android.graphics.drawable.Drawable getDrawable(android.net.Uri r9) {
            r8 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r9.getScheme()     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r4 = "android.resource"
            boolean r4 = r4.equals(r3)     // Catch: java.io.FileNotFoundException -> L8f
            if (r4 == 0) goto L30
            android.graphics.drawable.Drawable r0 = r8.getDrawableFromResourceUri(r9)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.io.FileNotFoundException -> L8f
            return r0
        L16:
            r0 = move-exception
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8f
            r5.<init>()     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r6 = "Resource does not exist: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r5 = r5.toString()     // Catch: java.io.FileNotFoundException -> L8f
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L8f
            throw r4     // Catch: java.io.FileNotFoundException -> L8f
        L30:
            android.content.Context r4 = r8.mProviderContext     // Catch: java.io.FileNotFoundException -> L8f
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.io.FileNotFoundException -> L8f
            java.io.InputStream r4 = r4.openInputStream(r9)     // Catch: java.io.FileNotFoundException -> L8f
            if (r4 == 0) goto L76
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r2)     // Catch: java.lang.Throwable -> L5a
            r4.close()     // Catch: java.io.IOException -> L44 java.io.FileNotFoundException -> L8f
            goto L59
        L44:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8f
            r7.<init>()     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r0 = r7.append(r0)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L8f
            android.util.Log.e(r1, r0, r6)     // Catch: java.io.FileNotFoundException -> L8f
        L59:
            return r5
        L5a:
            r5 = move-exception
            r4.close()     // Catch: java.io.IOException -> L5f java.io.FileNotFoundException -> L8f
            goto L74
        L5f:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8f
            r7.<init>()     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r0 = r7.append(r0)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L8f
            android.util.Log.e(r1, r0, r6)     // Catch: java.io.FileNotFoundException -> L8f
        L74:
            throw r5     // Catch: java.io.FileNotFoundException -> L8f
        L76:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8f
            r5.<init>()     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r6 = "Failed to open "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.io.FileNotFoundException -> L8f
            java.lang.String r5 = r5.toString()     // Catch: java.io.FileNotFoundException -> L8f
            r0.<init>(r5)     // Catch: java.io.FileNotFoundException -> L8f
            throw r0     // Catch: java.io.FileNotFoundException -> L8f
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r4 = ", "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r1, r3)
            return r2
    }

    private android.graphics.drawable.Drawable getDrawableFromResourceValue(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L78
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L78
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L12
            goto L78
        L12:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            r2.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.String r3 = "android.resource://"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            android.content.Context r3 = r5.mProviderContext     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            java.lang.String r2 = r2.toString()     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            android.graphics.drawable.Drawable r3 = r5.checkIconCache(r2)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            if (r3 == 0) goto L40
            return r3
        L40:
            android.content.Context r4 = r5.mProviderContext     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r1)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            r5.storeInIconCache(r2, r4)     // Catch: android.content.res.Resources.NotFoundException -> L4a java.lang.NumberFormatException -> L64
            return r4
        L4a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SuggestionsAdapter"
            android.util.Log.w(r3, r2)
            return r0
        L64:
            r0 = move-exception
            android.graphics.drawable.Drawable r1 = r5.checkIconCache(r6)
            if (r1 == 0) goto L6c
            return r1
        L6c:
            android.net.Uri r2 = android.net.Uri.parse(r6)
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r2)
            r5.storeInIconCache(r6, r1)
            return r1
        L78:
            return r0
    }

    private android.graphics.drawable.Drawable getIcon1(android.database.Cursor r4) {
            r3 = this;
            int r0 = r3.mIconName1Col
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            int r0 = r3.mIconName1Col
            java.lang.String r0 = r4.getString(r0)
            android.graphics.drawable.Drawable r1 = r3.getDrawableFromResourceValue(r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r2 = r3.getDefaultIcon1()
            return r2
    }

    private android.graphics.drawable.Drawable getIcon2(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.mIconName2Col
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            int r0 = r2.mIconName2Col
            java.lang.String r0 = r3.getString(r0)
            android.graphics.drawable.Drawable r1 = r2.getDrawableFromResourceValue(r0)
            return r1
    }

    private static java.lang.String getStringOrNull(android.database.Cursor r4, int r5) {
            r0 = -1
            r1 = 0
            if (r5 != r0) goto L5
            return r1
        L5:
            java.lang.String r0 = r4.getString(r5)     // Catch: java.lang.Exception -> La
            return r0
        La:
            r0 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.String r3 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r2, r3, r0)
            return r1
    }

    private void setViewDrawable(android.widget.ImageView r3, android.graphics.drawable.Drawable r4, int r5) {
            r2 = this;
            r3.setImageDrawable(r4)
            if (r4 != 0) goto L9
            r3.setVisibility(r5)
            goto L14
        L9:
            r0 = 0
            r3.setVisibility(r0)
            r4.setVisible(r0, r0)
            r1 = 1
            r4.setVisible(r1, r0)
        L14:
            return
    }

    private void setViewText(android.widget.TextView r2, java.lang.CharSequence r3) {
            r1 = this;
            r2.setText(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf
            r0 = 8
            r2.setVisibility(r0)
            goto L13
        Lf:
            r0 = 0
            r2.setVisibility(r0)
        L13:
            return
    }

    private void storeInIconCache(java.lang.String r3, android.graphics.drawable.Drawable r4) {
            r2 = this;
            if (r4 == 0) goto Lb
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r2.mOutsideDrawablesCache
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r3, r1)
        Lb:
            return
    }

    private void updateSpinnerState(android.database.Cursor r3) {
            r2 = this;
            if (r3 == 0) goto L7
            android.os.Bundle r0 = r3.getExtras()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            java.lang.String r1 = "in_progress"
            boolean r1 = r0.getBoolean(r1)
            if (r1 == 0) goto L13
            return
        L13:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View r9, android.content.Context r10, android.database.Cursor r11) {
            r8 = this;
            java.lang.Object r0 = r9.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r0 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r0
            r1 = 0
            int r2 = r8.mFlagsCol
            r3 = -1
            if (r2 == r3) goto L12
            int r2 = r8.mFlagsCol
            int r1 = r11.getInt(r2)
        L12:
            android.widget.TextView r2 = r0.mText1
            if (r2 == 0) goto L21
            int r2 = r8.mText1Col
            java.lang.String r2 = getStringOrNull(r11, r2)
            android.widget.TextView r3 = r0.mText1
            r8.setViewText(r3, r2)
        L21:
            android.widget.TextView r2 = r0.mText2
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L63
            int r2 = r8.mText2UrlCol
            java.lang.String r2 = getStringOrNull(r11, r2)
            if (r2 == 0) goto L35
            java.lang.CharSequence r2 = r8.formatUrl(r2)
            goto L3b
        L35:
            int r6 = r8.mText2Col
            java.lang.String r2 = getStringOrNull(r11, r6)
        L3b:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L50
            android.widget.TextView r6 = r0.mText1
            if (r6 == 0) goto L5e
            android.widget.TextView r6 = r0.mText1
            r6.setSingleLine(r3)
            android.widget.TextView r6 = r0.mText1
            r6.setMaxLines(r4)
            goto L5e
        L50:
            android.widget.TextView r6 = r0.mText1
            if (r6 == 0) goto L5e
            android.widget.TextView r6 = r0.mText1
            r6.setSingleLine(r5)
            android.widget.TextView r6 = r0.mText1
            r6.setMaxLines(r5)
        L5e:
            android.widget.TextView r6 = r0.mText2
            r8.setViewText(r6, r2)
        L63:
            android.widget.ImageView r2 = r0.mIcon1
            if (r2 == 0) goto L71
            android.widget.ImageView r2 = r0.mIcon1
            android.graphics.drawable.Drawable r6 = r8.getIcon1(r11)
            r7 = 4
            r8.setViewDrawable(r2, r6, r7)
        L71:
            android.widget.ImageView r2 = r0.mIcon2
            r6 = 8
            if (r2 == 0) goto L80
            android.widget.ImageView r2 = r0.mIcon2
            android.graphics.drawable.Drawable r7 = r8.getIcon2(r11)
            r8.setViewDrawable(r2, r7, r6)
        L80:
            int r2 = r8.mQueryRefinement
            if (r2 == r4) goto L93
            int r2 = r8.mQueryRefinement
            if (r2 != r5) goto L8d
            r2 = r1 & 1
            if (r2 == 0) goto L8d
            goto L93
        L8d:
            android.widget.ImageView r2 = r0.mIconRefine
            r2.setVisibility(r6)
            goto La8
        L93:
            android.widget.ImageView r2 = r0.mIconRefine
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r0.mIconRefine
            android.widget.TextView r3 = r0.mText1
            java.lang.CharSequence r3 = r3.getText()
            r2.setTag(r3)
            android.widget.ImageView r2 = r0.mIconRefine
            r2.setOnClickListener(r8)
        La8:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(android.database.Cursor r4) {
            r3 = this;
            boolean r0 = r3.mClosed
            java.lang.String r1 = "SuggestionsAdapter"
            if (r0 == 0) goto L11
            java.lang.String r0 = "Tried to change cursor after adapter was closed."
            android.util.Log.w(r1, r0)
            if (r4 == 0) goto L10
            r4.close()
        L10:
            return
        L11:
            super.changeCursor(r4)     // Catch: java.lang.Exception -> L47
            if (r4 == 0) goto L46
            java.lang.String r0 = "suggest_text_1"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mText1Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mText2Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mText2UrlCol = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mIconName1Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mIconName2Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_flags"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r3.mFlagsCol = r0     // Catch: java.lang.Exception -> L47
        L46:
            goto L4d
        L47:
            r0 = move-exception
            java.lang.String r2 = "error changing cursor and caching columns"
            android.util.Log.e(r1, r2, r0)
        L4d:
            return
    }

    public void close() {
            r1 = this;
            r0 = 0
            r1.changeCursor(r0)
            r0 = 1
            r1.mClosed = r0
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r1 = getColumnString(r4, r1)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.app.SearchableInfo r2 = r3.mSearchable
            boolean r2 = r2.shouldRewriteQueryFromData()
            if (r2 == 0) goto L1e
            java.lang.String r2 = "suggest_intent_data"
            java.lang.String r2 = getColumnString(r4, r2)
            if (r2 == 0) goto L1e
            return r2
        L1e:
            android.app.SearchableInfo r2 = r3.mSearchable
            boolean r2 = r2.shouldRewriteQueryFromText()
            if (r2 == 0) goto L2f
            java.lang.String r2 = "suggest_text_1"
            java.lang.String r2 = getColumnString(r4, r2)
            if (r2 == 0) goto L2f
            return r2
        L2f:
            return r0
    }

    android.graphics.drawable.Drawable getDrawableFromResourceUri(android.net.Uri r9) throws java.io.FileNotFoundException {
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lc7
            android.content.Context r1 = r8.mProviderContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad
            java.util.List r2 = r9.getPathSegments()
            if (r2 == 0) goto L94
            int r3 = r2.size()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L48
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L2e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L2e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L2e
            goto L5b
        L2e:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Single path segment is not a resource ID: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L48:
            r6 = 2
            if (r3 != r6) goto L7b
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r1.getIdentifier(r5, r4, r0)
        L5b:
            if (r4 == 0) goto L62
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r4)
            return r5
        L62:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No resource found for: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7b:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "More than two path segments: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L94:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "No path: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Lad:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No package found for authority: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Lc7:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No authority: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            android.view.View r0 = super.getDropDownView(r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions cursor threw exception."
            android.util.Log.w(r1, r2, r0)
            android.content.Context r1 = r5.mProviderContext
            android.database.Cursor r2 = r5.getCursor()
            android.view.View r1 = r5.newDropDownView(r1, r2, r8)
            if (r1 == 0) goto L28
            java.lang.Object r2 = r1.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r2 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r2
            android.widget.TextView r3 = r2.mText1
            java.lang.String r4 = r0.toString()
            r3.setText(r4)
        L28:
            return r1
    }

    public int getQueryRefinement() {
            r1 = this;
            int r0 = r1.mQueryRefinement
            return r0
    }

    android.database.Cursor getSearchManagerSuggestions(android.app.SearchableInfo r11, java.lang.String r12, int r13) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r11.getSuggestAuthority()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r2 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r2)
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r0 = r0.query(r2)
            android.net.Uri$Builder r0 = r0.fragment(r2)
            java.lang.String r2 = r11.getSuggestPath()
            if (r2 == 0) goto L2d
            r0.appendEncodedPath(r2)
        L2d:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)
            java.lang.String r7 = r11.getSuggestSelection()
            r3 = 0
            if (r7 == 0) goto L42
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            r4[r5] = r12
            r3 = r4
            r8 = r3
            goto L46
        L42:
            r0.appendPath(r12)
            r8 = r3
        L46:
            if (r13 <= 0) goto L51
            java.lang.String r3 = "limit"
            java.lang.String r4 = java.lang.String.valueOf(r13)
            r0.appendQueryParameter(r3, r4)
        L51:
            android.net.Uri r5 = r0.build()
            android.content.Context r3 = r10.mProviderContext
            android.content.ContentResolver r4 = r3.getContentResolver()
            r6 = 0
            r9 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)
            return r3
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            android.view.View r0 = super.getView(r6, r7, r8)     // Catch: java.lang.RuntimeException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions cursor threw exception."
            android.util.Log.w(r1, r2, r0)
            android.content.Context r1 = r5.mProviderContext
            android.database.Cursor r2 = r5.getCursor()
            android.view.View r1 = r5.newView(r1, r2, r8)
            if (r1 == 0) goto L28
            java.lang.Object r2 = r1.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r2 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r2
            android.widget.TextView r3 = r2.mText1
            java.lang.String r4 = r0.toString()
            r3.setText(r4)
        L28:
            return r1
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context r4, android.database.Cursor r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = super.newView(r4, r5, r6)
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r1 = new androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache
            r1.<init>(r0)
            r0.setTag(r1)
            int r1 = androidx.appcompat.R.id.edit_query
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = r3.mCommitIconResId
            r1.setImageResource(r2)
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r1.getCursor()
            r1.updateSpinnerState(r0)
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r1.getCursor()
            r1.updateSpinnerState(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r4.getTag()
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L10
            androidx.appcompat.widget.SearchView r1 = r3.mSearchView
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.onQueryRefine(r2)
        L10:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r7) {
            r6 = this;
            if (r7 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r7.toString()
        L9:
            r1 = 0
            androidx.appcompat.widget.SearchView r2 = r6.mSearchView
            int r2 = r2.getVisibility()
            r3 = 0
            if (r2 != 0) goto L35
            androidx.appcompat.widget.SearchView r2 = r6.mSearchView
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L1c
            goto L35
        L1c:
            android.app.SearchableInfo r2 = r6.mSearchable     // Catch: java.lang.RuntimeException -> L2c
            r4 = 50
            android.database.Cursor r2 = r6.getSearchManagerSuggestions(r2, r0, r4)     // Catch: java.lang.RuntimeException -> L2c
            r1 = r2
            if (r1 == 0) goto L2b
            r1.getCount()     // Catch: java.lang.RuntimeException -> L2c
            return r1
        L2b:
            goto L34
        L2c:
            r2 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r5 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r5, r2)
        L34:
            return r3
        L35:
            return r3
    }

    public void setQueryRefinement(int r1) {
            r0 = this;
            r0.mQueryRefinement = r1
            return
    }
}
