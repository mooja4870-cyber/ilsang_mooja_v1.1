package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getBreakStrategy(android.widget.TextView r1) {
                int r0 = r1.getBreakStrategy()
                return r0
        }

        static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView r1) {
                android.content.res.ColorStateList r0 = r1.getCompoundDrawableTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getCompoundDrawableTintMode()
                return r0
        }

        static int getHyphenationFrequency(android.widget.TextView r1) {
                int r0 = r1.getHyphenationFrequency()
                return r0
        }

        static void setBreakStrategy(android.widget.TextView r0, int r1) {
                r0.setBreakStrategy(r1)
                return
        }

        static void setCompoundDrawableTintList(android.widget.TextView r0, android.content.res.ColorStateList r1) {
                r0.setCompoundDrawableTintList(r1)
                return
        }

        static void setCompoundDrawableTintMode(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setCompoundDrawableTintMode(r1)
                return
        }

        static void setHyphenationFrequency(android.widget.TextView r0, int r1) {
                r0.setHyphenationFrequency(r1)
                return
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.icu.text.DecimalFormatSymbols getInstance(java.util.Locale r1) {
                android.icu.text.DecimalFormatSymbols r0 = android.icu.text.DecimalFormatSymbols.getInstance(r1)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAutoSizeMaxTextSize(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeMaxTextSize()
                return r0
        }

        static int getAutoSizeMinTextSize(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeMinTextSize()
                return r0
        }

        static int getAutoSizeStepGranularity(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeStepGranularity()
                return r0
        }

        static int[] getAutoSizeTextAvailableSizes(android.widget.TextView r1) {
                int[] r0 = r1.getAutoSizeTextAvailableSizes()
                return r0
        }

        static int getAutoSizeTextType(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeTextType()
                return r0
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        static void setAutoSizeTextTypeWithDefaults(android.widget.TextView r0, int r1) {
                r0.setAutoSizeTextTypeWithDefaults(r1)
                return
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence castToCharSequence(android.text.PrecomputedText r0) {
                return r0
        }

        static java.lang.String[] getDigitStrings(android.icu.text.DecimalFormatSymbols r1) {
                java.lang.String[] r0 = r1.getDigitStrings()
                return r0
        }

        static android.text.PrecomputedText.Params getTextMetricsParams(android.widget.TextView r1) {
                android.text.PrecomputedText$Params r0 = r1.getTextMetricsParams()
                return r0
        }

        static void setFirstBaselineToTopHeight(android.widget.TextView r0, int r1) {
                r0.setFirstBaselineToTopHeight(r1)
                return
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void setLineHeight(android.widget.TextView r0, int r1, float r2) {
                r0.setLineHeight(r1, r2)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private static class OreoCallback implements android.view.ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final android.view.ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private java.lang.Class<?> mMenuBuilderClass;
        private java.lang.reflect.Method mMenuBuilderRemoveItemAtMethod;
        private final android.widget.TextView mTextView;

        OreoCallback(android.view.ActionMode.Callback r2, android.widget.TextView r3) {
                r1 = this;
                r1.<init>()
                r1.mCallback = r2
                r1.mTextView = r3
                r0 = 0
                r1.mInitializedMenuBuilderReferences = r0
                return
        }

        private android.content.Intent createProcessTextIntent() {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r0 = r0.setAction(r1)
                java.lang.String r1 = "text/plain"
                android.content.Intent r0 = r0.setType(r1)
                return r0
        }

        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo r4, android.widget.TextView r5) {
                r3 = this;
                android.content.Intent r0 = r3.createProcessTextIntent()
                boolean r1 = r3.isEditable(r5)
                r1 = r1 ^ 1
                java.lang.String r2 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r0 = r0.putExtra(r2, r1)
                android.content.pm.ActivityInfo r1 = r4.activityInfo
                java.lang.String r1 = r1.packageName
                android.content.pm.ActivityInfo r2 = r4.activityInfo
                java.lang.String r2 = r2.name
                android.content.Intent r0 = r0.setClassName(r1, r2)
                return r0
        }

        private java.util.List<android.content.pm.ResolveInfo> getSupportedActivities(android.content.Context r7, android.content.pm.PackageManager r8) {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                boolean r1 = r7 instanceof android.app.Activity
                if (r1 != 0) goto La
                return r0
            La:
                android.content.Intent r2 = r6.createProcessTextIntent()
                r3 = 0
                java.util.List r2 = r8.queryIntentActivities(r2, r3)
                java.util.Iterator r3 = r2.iterator()
            L18:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L2e
                java.lang.Object r4 = r3.next()
                android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                boolean r5 = r6.isSupportedActivity(r4, r7)
                if (r5 == 0) goto L2d
                r0.add(r4)
            L2d:
                goto L18
            L2e:
                return r0
        }

        private boolean isEditable(android.widget.TextView r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.Editable
                if (r0 == 0) goto L12
                boolean r0 = r2.onCheckIsTextEditor()
                if (r0 == 0) goto L12
                boolean r0 = r2.isEnabled()
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        private boolean isSupportedActivity(android.content.pm.ResolveInfo r4, android.content.Context r5) {
                r3 = this;
                java.lang.String r0 = r5.getPackageName()
                android.content.pm.ActivityInfo r1 = r4.activityInfo
                java.lang.String r1 = r1.packageName
                boolean r0 = r0.equals(r1)
                r1 = 1
                if (r0 == 0) goto L10
                return r1
            L10:
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                boolean r0 = r0.exported
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                java.lang.String r0 = r0.permission
                if (r0 == 0) goto L2b
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                java.lang.String r0 = r0.permission
                int r0 = r5.checkSelfPermission(r0)
                if (r0 != 0) goto L29
                goto L2b
            L29:
                r1 = r2
                goto L2c
            L2b:
            L2c:
                return r1
        }

        private void recomputeProcessTextMenuItems(android.view.Menu r10) {
                r9 = this;
                android.widget.TextView r0 = r9.mTextView
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r9.mInitializedMenuBuilderReferences
                java.lang.String r3 = "removeItemAt"
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L37
                r9.mInitializedMenuBuilderReferences = r5
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                r9.mMenuBuilderClass = r2     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                java.lang.Class<?> r2 = r9.mMenuBuilderClass     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                r6[r4] = r7     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                r9.mMenuBuilderRemoveItemAtMethod = r2     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                r9.mCanUseMenuBuilderReferences = r5     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.ClassNotFoundException -> L2f
                goto L37
            L2d:
                r2 = move-exception
                goto L30
            L2f:
                r2 = move-exception
            L30:
                r6 = 0
                r9.mMenuBuilderClass = r6
                r9.mMenuBuilderRemoveItemAtMethod = r6
                r9.mCanUseMenuBuilderReferences = r4
            L37:
                boolean r2 = r9.mCanUseMenuBuilderReferences     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                if (r2 == 0) goto L46
                java.lang.Class<?> r2 = r9.mMenuBuilderClass     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                boolean r2 = r2.isInstance(r10)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                if (r2 == 0) goto L46
                java.lang.reflect.Method r2 = r9.mMenuBuilderRemoveItemAtMethod     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                goto L55
            L46:
                java.lang.Class r2 = r10.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                r6[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
            L55:
                int r3 = r10.size()     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                int r3 = r3 - r5
            L5b:
                if (r3 < 0) goto L85
                android.view.MenuItem r6 = r10.getItem(r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                android.content.Intent r7 = r6.getIntent()     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                if (r7 == 0) goto L82
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r8 = r6.getIntent()     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                java.lang.String r8 = r8.getAction()     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                boolean r7 = r7.equals(r8)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                if (r7 == 0) goto L82
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
                r2.invoke(r10, r7)     // Catch: java.lang.reflect.InvocationTargetException -> Lb3 java.lang.IllegalAccessException -> Lb5 java.lang.NoSuchMethodException -> Lb7
            L82:
                int r3 = r3 + (-1)
                goto L5b
            L85:
                java.util.List r2 = r9.getSupportedActivities(r0, r1)
                r3 = 0
            L8c:
                int r6 = r2.size()
                if (r3 >= r6) goto Lb2
                java.lang.Object r6 = r2.get(r3)
                android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
                int r7 = r3 + 100
                java.lang.CharSequence r8 = r6.loadLabel(r1)
                android.view.MenuItem r7 = r10.add(r4, r4, r7, r8)
                android.widget.TextView r8 = r9.mTextView
                android.content.Intent r8 = r9.createProcessTextIntentForResolveInfo(r6, r8)
                android.view.MenuItem r7 = r7.setIntent(r8)
                r7.setShowAsAction(r5)
                int r3 = r3 + 1
                goto L8c
            Lb2:
                return
            Lb3:
                r2 = move-exception
                goto Lb8
            Lb5:
                r2 = move-exception
                goto Lb8
            Lb7:
                r2 = move-exception
            Lb8:
                return
        }

        android.view.ActionMode.Callback getWrappedCallback() {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r0 = r0.onActionItemClicked(r2, r3)
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r0 = r0.onCreateActionMode(r2, r3)
                return r0
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                r1.recomputeProcessTextMenuItems(r3)
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r0 = r0.onPrepareActionMode(r2, r3)
                return r0
        }
    }

    private TextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAutoSizeMaxTextSize(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r0 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMaxTextSize(r2)
            return r0
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L17
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        L17:
            r0 = -1
            return r0
    }

    public static int getAutoSizeMinTextSize(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r0 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeMinTextSize(r2)
            return r0
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L17
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        L17:
            r0 = -1
            return r0
    }

    public static int getAutoSizeStepGranularity(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r0 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeStepGranularity(r2)
            return r0
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L17
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        L17:
            r0 = -1
            return r0
    }

    public static int[] getAutoSizeTextAvailableSizes(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int[] r0 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextAvailableSizes(r2)
            return r0
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L17
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        L17:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    public static int getAutoSizeTextType(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r0 = androidx.core.widget.TextViewCompat.Api26Impl.getAutoSizeTextType(r2)
            return r0
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L17
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            int r0 = r0.getAutoSizeTextType()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            android.content.res.ColorStateList r0 = androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.TextViewCompat.Api23Impl.getCompoundDrawableTintMode(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getCompoundDrawablesRelative()")
    @java.lang.Deprecated
    public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView r1) {
            android.graphics.drawable.Drawable[] r0 = r1.getCompoundDrawablesRelative()
            return r0
    }

    public static int getFirstBaselineToTopHeight(android.widget.TextView r2) {
            int r0 = r2.getPaddingTop()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    public static int getLastBaselineToBottomHeight(android.widget.TextView r2) {
            int r0 = r2.getPaddingBottom()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getMaxLines()")
    @java.lang.Deprecated
    public static int getMaxLines(android.widget.TextView r1) {
            int r0 = r1.getMaxLines()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getMinLines()")
    @java.lang.Deprecated
    public static int getMinLines(android.widget.TextView r1) {
            int r0 = r1.getMinLines()
            return r0
    }

    private static int getTextDirection(android.text.TextDirectionHeuristic r2) {
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r1 = 1
            if (r2 != r0) goto L6
            return r1
        L6:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto Lb
            return r1
        Lb:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r2 != r0) goto L11
            r0 = 2
            return r0
        L11:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r2 != r0) goto L17
            r0 = 3
            return r0
        L17:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r2 != r0) goto L1d
            r0 = 4
            return r0
        L1d:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r2 != r0) goto L23
            r0 = 5
            return r0
        L23:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto L29
            r0 = 6
            return r0
        L29:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r2 != r0) goto L2f
            r0 = 7
            return r0
        L2f:
            return r1
    }

    private static android.text.TextDirectionHeuristic getTextDirectionHeuristic(android.widget.TextView r5) {
            android.text.method.TransformationMethod r0 = r5.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Lb
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L3f
            int r0 = r5.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L3f
        L1d:
            java.util.Locale r0 = r5.getTextLocale()
            android.icu.text.DecimalFormatSymbols r0 = androidx.core.widget.TextViewCompat.Api24Impl.getInstance(r0)
            java.lang.String[] r1 = androidx.core.widget.TextViewCompat.Api28Impl.getDigitStrings(r0)
            r1 = r1[r2]
            int r2 = r1.codePointAt(r2)
            byte r4 = java.lang.Character.getDirectionality(r2)
            if (r4 == r3) goto L3c
            r3 = 2
            if (r4 != r3) goto L39
            goto L3c
        L39:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            return r3
        L3c:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            return r3
        L3f:
            int r0 = r5.getLayoutDirection()
            if (r0 != r3) goto L47
            r2 = r3
        L47:
            int r0 = r5.getTextDirection()
            switch(r0) {
                case 2: goto L62;
                case 3: goto L5f;
                case 4: goto L5c;
                case 5: goto L59;
                case 6: goto L56;
                case 7: goto L53;
                default: goto L4e;
            }
        L4e:
            if (r2 == 0) goto L65
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L67
        L53:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r0
        L56:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r0
        L59:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            return r0
        L5c:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            return r0
        L5f:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            return r0
        L62:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r0
        L65:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L67:
            return r0
    }

    public static androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParams(android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
            android.text.PrecomputedText$Params r1 = androidx.core.widget.TextViewCompat.Api28Impl.getTextMetricsParams(r3)
            r0.<init>(r1)
            return r0
        L10:
            androidx.core.text.PrecomputedTextCompat$Params$Builder r0 = new androidx.core.text.PrecomputedTextCompat$Params$Builder
            android.text.TextPaint r1 = new android.text.TextPaint
            android.text.TextPaint r2 = r3.getPaint()
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = androidx.core.widget.TextViewCompat.Api23Impl.getBreakStrategy(r3)
            r0.setBreakStrategy(r1)
            int r1 = androidx.core.widget.TextViewCompat.Api23Impl.getHyphenationFrequency(r3)
            r0.setHyphenationFrequency(r1)
            android.text.TextDirectionHeuristic r1 = getTextDirectionHeuristic(r3)
            r0.setTextDirection(r1)
            androidx.core.text.PrecomputedTextCompat$Params r1 = r0.build()
            return r1
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r2, int r3, int r4, int r5, int r6) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5, r6)
            goto L14
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L14
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
        L14:
            return
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r2, int[] r3, int r4) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3, r4)
            goto L14
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L14
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r3, r4)
        L14:
            return
    }

    public static void setAutoSizeTextTypeWithDefaults(android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api26Impl.setAutoSizeTextTypeWithDefaults(r2, r3)
            goto L14
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L14
            r0 = r2
            androidx.core.widget.AutoSizeableTextView r0 = (androidx.core.widget.AutoSizeableTextView) r0
            r0.setAutoSizeTextTypeWithDefaults(r3)
        L14:
            return
    }

    public static void setCompoundDrawableTintList(android.widget.TextView r0, android.content.res.ColorStateList r1) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintList(r0, r1)
            return
    }

    public static void setCompoundDrawableTintMode(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.core.widget.TextViewCompat.Api23Impl.setCompoundDrawableTintMode(r0, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelative(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @java.lang.Deprecated
    public static void setCustomSelectionActionModeCallback(android.widget.TextView r1, android.view.ActionMode.Callback r2) {
            android.view.ActionMode$Callback r0 = wrapCustomSelectionActionModeCallback(r1, r2)
            r1.setCustomSelectionActionModeCallback(r0)
            return
    }

    public static void setFirstBaselineToTopHeight(android.widget.TextView r6, int r7) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            androidx.core.widget.TextViewCompat.Api28Impl.setFirstBaselineToTopHeight(r6, r7)
            return
        Ld:
            android.text.TextPaint r0 = r6.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r6.getIncludeFontPadding()
            if (r1 == 0) goto L1e
            int r1 = r0.top
            goto L20
        L1e:
            int r1 = r0.ascent
        L20:
            int r2 = java.lang.Math.abs(r1)
            if (r7 <= r2) goto L37
            int r2 = r7 + r1
            int r3 = r6.getPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r5 = r6.getPaddingBottom()
            r6.setPadding(r3, r2, r4, r5)
        L37:
            return
    }

    public static void setLastBaselineToBottomHeight(android.widget.TextView r6, int r7) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r7)
            android.text.TextPaint r0 = r6.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r6.getIncludeFontPadding()
            if (r1 == 0) goto L14
            int r1 = r0.bottom
            goto L16
        L14:
            int r1 = r0.descent
        L16:
            int r2 = java.lang.Math.abs(r1)
            if (r7 <= r2) goto L2d
            int r2 = r7 - r1
            int r3 = r6.getPaddingLeft()
            int r4 = r6.getPaddingTop()
            int r5 = r6.getPaddingRight()
            r6.setPadding(r3, r4, r5, r2)
        L2d:
            return
    }

    public static void setLineHeight(android.widget.TextView r3, int r4) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r4)
            android.text.TextPaint r0 = r3.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r4 == r0) goto L16
            int r1 = r4 - r0
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setLineSpacing(r1, r2)
        L16:
            return
    }

    public static void setLineHeight(android.widget.TextView r2, int r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.widget.TextViewCompat.Api34Impl.setLineHeight(r2, r3, r4)
            goto L1e
        La:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r1 = java.lang.Math.round(r0)
            setLineHeight(r2, r1)
        L1e:
            return
    }

    public static void setPrecomputedText(android.widget.TextView r3, androidx.core.text.PrecomputedTextCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            android.text.PrecomputedText r0 = r4.getPrecomputedText()
            java.lang.CharSequence r0 = androidx.core.widget.TextViewCompat.Api28Impl.castToCharSequence(r0)
            r3.setText(r0)
            goto L23
        L12:
            androidx.core.text.PrecomputedTextCompat$Params r0 = getTextMetricsParams(r3)
            androidx.core.text.PrecomputedTextCompat$Params r1 = r4.getParams()
            boolean r1 = r0.equalsWithoutTextDirection(r1)
            if (r1 == 0) goto L24
            r3.setText(r4)
        L23:
            return
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Given text can not be applied to TextView."
            r1.<init>(r2)
            throw r1
    }

    public static void setTextAppearance(android.widget.TextView r0, int r1) {
            r0.setTextAppearance(r1)
            return
    }

    public static void setTextMetricsParams(android.widget.TextView r2, androidx.core.text.PrecomputedTextCompat.Params r3) {
            android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
            int r0 = getTextDirection(r0)
            r2.setTextDirection(r0)
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.getTextPaint()
            r0.set(r1)
            int r0 = r3.getBreakStrategy()
            androidx.core.widget.TextViewCompat.Api23Impl.setBreakStrategy(r2, r0)
            int r0 = r3.getHyphenationFrequency()
            androidx.core.widget.TextViewCompat.Api23Impl.setHyphenationFrequency(r2, r0)
            return
    }

    public static android.view.ActionMode.Callback unwrapCustomSelectionActionModeCallback(android.view.ActionMode.Callback r2) {
            boolean r0 = r2 instanceof androidx.core.widget.TextViewCompat.OreoCallback
            if (r0 == 0) goto L12
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            r0 = r2
            androidx.core.widget.TextViewCompat$OreoCallback r0 = (androidx.core.widget.TextViewCompat.OreoCallback) r0
            android.view.ActionMode$Callback r0 = r0.getWrappedCallback()
            return r0
        L12:
            return r2
    }

    public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(android.widget.TextView r2, android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 > r1) goto L19
            boolean r0 = r3 instanceof androidx.core.widget.TextViewCompat.OreoCallback
            if (r0 != 0) goto L19
            if (r3 != 0) goto L13
            goto L19
        L13:
            androidx.core.widget.TextViewCompat$OreoCallback r0 = new androidx.core.widget.TextViewCompat$OreoCallback
            r0.<init>(r3, r2)
            return r0
        L19:
            return r3
    }
}
