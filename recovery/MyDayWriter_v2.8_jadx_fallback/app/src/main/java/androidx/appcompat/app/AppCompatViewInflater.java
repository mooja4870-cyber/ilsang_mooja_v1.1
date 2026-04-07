package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading = null;
    private static final int[] sAccessibilityPaneTitle = null;
    private static final java.lang.String[] sClassPrefixList = null;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private static final java.lang.Class<?>[] sConstructorSignature = null;
    private static final int[] sOnClickAttrs = null;
    private static final int[] sScreenReaderFocusable = null;
    private final java.lang.Object[] mConstructorArgs;

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView;
        private final java.lang.String mMethodName;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;

        public DeclaredOnClickListener(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mHostView = r1
                r0.mMethodName = r2
                return
        }

        private void resolveMethod(android.content.Context r6) {
                r5 = this;
            L1:
                if (r6 == 0) goto L32
                boolean r0 = r6.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L23
                if (r0 != 0) goto L22
                java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L23
                java.lang.String r1 = r5.mMethodName     // Catch: java.lang.NoSuchMethodException -> L23
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L23
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L23
                if (r0 == 0) goto L22
                r5.mResolvedMethod = r0     // Catch: java.lang.NoSuchMethodException -> L23
                r5.mResolvedContext = r6     // Catch: java.lang.NoSuchMethodException -> L23
                return
            L22:
                goto L24
            L23:
                r0 = move-exception
            L24:
                boolean r0 = r6 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L30
                r0 = r6
                android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
                android.content.Context r6 = r0.getBaseContext()
                goto L1
            L30:
                r6 = 0
                goto L1
            L32:
                android.view.View r0 = r5.mHostView
                int r0 = r0.getId()
                r1 = -1
                if (r0 != r1) goto L3e
                java.lang.String r1 = ""
                goto L65
            L3e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = " with id '"
                java.lang.StringBuilder r1 = r1.append(r2)
                android.view.View r2 = r5.mHostView
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getResourceEntryName(r0)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "'"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
            L65:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Could not find method "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = r5.mMethodName
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
                java.lang.StringBuilder r3 = r3.append(r4)
                android.view.View r4 = r5.mHostView
                java.lang.Class r4 = r4.getClass()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                java.lang.reflect.Method r0 = r3.mResolvedMethod
                if (r0 != 0) goto Ld
                android.view.View r0 = r3.mHostView
                android.content.Context r0 = r0.getContext()
                r3.resolveMethod(r0)
            Ld:
                java.lang.reflect.Method r0 = r3.mResolvedMethod     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L23
                android.content.Context r1 = r3.mResolvedContext     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L23
                java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L23
                r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L23
                return
            L1a:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Could not execute method for android:onClick"
                r1.<init>(r2, r0)
                throw r1
            L23:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Could not execute non-public method for android:onClick"
                r1.<init>(r2, r0)
                throw r1
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r4 = 1
            r1[r4] = r2
            androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature = r1
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r1 = new int[]{r1}
            androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs = r1
            r1 = 16844160(0x1010580, float:2.3697504E-38)
            int[] r1 = new int[]{r1}
            androidx.appcompat.app.AppCompatViewInflater.sAccessibilityHeading = r1
            r1 = 16844156(0x101057c, float:2.3697493E-38)
            int[] r1 = new int[]{r1}
            androidx.appcompat.app.AppCompatViewInflater.sAccessibilityPaneTitle = r1
            r1 = 16844148(0x1010574, float:2.369747E-38)
            int[] r1 = new int[]{r1}
            androidx.appcompat.app.AppCompatViewInflater.sScreenReaderFocusable = r1
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "android.widget."
            r1[r3] = r2
            java.lang.String r2 = "android.view."
            r1[r4] = r2
            java.lang.String r2 = "android.webkit."
            r1[r0] = r2
            androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList = r1
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.appcompat.app.AppCompatViewInflater.sConstructorMap = r0
            return
    }

    public AppCompatViewInflater() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mConstructorArgs = r0
            return
    }

    private void backportAccessibilityAttributes(android.content.Context r4, android.view.View r5, android.util.AttributeSet r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 <= r1) goto L7
            return
        L7:
            int[] r0 = androidx.appcompat.app.AppCompatViewInflater.sAccessibilityHeading
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r0)
            r1 = 0
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L1b
            boolean r2 = r0.getBoolean(r1, r1)
            androidx.core.view.ViewCompat.setAccessibilityHeading(r5, r2)
        L1b:
            r0.recycle()
            int[] r2 = androidx.appcompat.app.AppCompatViewInflater.sAccessibilityPaneTitle
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r2)
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r0.getString(r1)
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r5, r2)
        L31:
            r0.recycle()
            int[] r2 = androidx.appcompat.app.AppCompatViewInflater.sScreenReaderFocusable
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r2)
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L47
            boolean r1 = r0.getBoolean(r1, r1)
            androidx.core.view.ViewCompat.setScreenReaderFocusable(r5, r1)
        L47:
            r0.recycle()
            return
    }

    private void checkOnClickListener(android.view.View r5, android.util.AttributeSet r6) {
            r4 = this;
            android.content.Context r0 = r5.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L28
            boolean r1 = r5.hasOnClickListeners()
            if (r1 != 0) goto Lf
            goto L28
        Lf:
            int[] r1 = androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r6, r1)
            r2 = 0
            java.lang.String r2 = r1.getString(r2)
            if (r2 == 0) goto L24
            androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener r3 = new androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener
            r3.<init>(r5, r2)
            r5.setOnClickListener(r3)
        L24:
            r1.recycle()
            return
        L28:
            return
    }

    private android.view.View createViewByPrefix(android.content.Context r5, java.lang.String r6, java.lang.String r7) throws java.lang.ClassNotFoundException, android.view.InflateException {
            r4 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap
            java.lang.Object r0 = r0.get(r6)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 != 0) goto L3a
            if (r7 == 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r1.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Exception -> L47
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L47
            goto L1f
        L1e:
            r1 = r6
        L1f:
            java.lang.ClassLoader r2 = r5.getClassLoader()     // Catch: java.lang.Exception -> L47
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Exception -> L47
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.Exception -> L47
            java.lang.Class<?>[] r2 = androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Constructor r2 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L47
            r0 = r2
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r2 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap     // Catch: java.lang.Exception -> L47
            r2.put(r6, r0)     // Catch: java.lang.Exception -> L47
        L3a:
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r1 = r4.mConstructorArgs     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L47
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L47
            return r1
        L47:
            r1 = move-exception
            r2 = 0
            return r2
    }

    private android.view.View createViewFromTag(android.content.Context r7, java.lang.String r8, android.util.AttributeSet r9) {
            r6 = this;
            java.lang.String r0 = "view"
            boolean r0 = r8.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r0 = "class"
            java.lang.String r8 = r9.getAttributeValue(r1, r0)
        Lf:
            r0 = 0
            r2 = 1
            java.lang.Object[] r3 = r6.mConstructorArgs     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            r3[r0] = r7     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            java.lang.Object[] r3 = r6.mConstructorArgs     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            r3[r2] = r9     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            r3 = 46
            int r3 = r8.indexOf(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            r4 = -1
            if (r4 != r3) goto L49
            r3 = 0
        L23:
            java.lang.String[] r4 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            int r4 = r4.length     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            if (r3 >= r4) goto L3f
            java.lang.String[] r4 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            android.view.View r4 = r6.createViewByPrefix(r7, r8, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            if (r4 == 0) goto L3c
        L33:
            java.lang.Object[] r5 = r6.mConstructorArgs
            r5[r0] = r1
            java.lang.Object[] r0 = r6.mConstructorArgs
            r0[r2] = r1
            return r4
        L3c:
            int r3 = r3 + 1
            goto L23
        L3f:
            java.lang.Object[] r3 = r6.mConstructorArgs
            r3[r0] = r1
            java.lang.Object[] r0 = r6.mConstructorArgs
            r0[r2] = r1
            return r1
        L49:
            android.view.View r3 = r6.createViewByPrefix(r7, r8, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L60
            java.lang.Object[] r4 = r6.mConstructorArgs
            r4[r0] = r1
            java.lang.Object[] r0 = r6.mConstructorArgs
            r0[r2] = r1
            return r3
        L56:
            r3 = move-exception
            java.lang.Object[] r4 = r6.mConstructorArgs
            r4[r0] = r1
            java.lang.Object[] r0 = r6.mConstructorArgs
            r0[r2] = r1
            throw r3
        L60:
            r3 = move-exception
            java.lang.Object[] r4 = r6.mConstructorArgs
            r4[r0] = r1
            java.lang.Object[] r0 = r6.mConstructorArgs
            r0[r2] = r1
            return r1
    }

    private static android.content.Context themifyContext(android.content.Context r4, android.util.AttributeSet r5, boolean r6, boolean r7) {
            int[] r0 = androidx.appcompat.R.styleable.View
            r1 = 0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r1, r1)
            r2 = 0
            if (r6 == 0) goto L10
            int r3 = androidx.appcompat.R.styleable.View_android_theme
            int r2 = r0.getResourceId(r3, r1)
        L10:
            if (r7 == 0) goto L23
            if (r2 != 0) goto L23
            int r3 = androidx.appcompat.R.styleable.View_theme
            int r2 = r0.getResourceId(r3, r1)
            if (r2 == 0) goto L23
            java.lang.String r1 = "AppCompatViewInflater"
            java.lang.String r3 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r1, r3)
        L23:
            r0.recycle()
            if (r2 == 0) goto L3b
            boolean r1 = r4 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r1 == 0) goto L35
            r1 = r4
            androidx.appcompat.view.ContextThemeWrapper r1 = (androidx.appcompat.view.ContextThemeWrapper) r1
            int r1 = r1.getThemeResId()
            if (r1 == r2) goto L3b
        L35:
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            r1.<init>(r4, r2)
            r4 = r1
        L3b:
            return r4
    }

    private void verifyNotNull(android.view.View r4, java.lang.String r5) {
            r3 = this;
            if (r4 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " asked to inflate view for <"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ">, but returned null"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r0 = new androidx.appcompat.widget.AppCompatAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatButton r0 = new androidx.appcompat.widget.AppCompatButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCheckBox r0 = new androidx.appcompat.widget.AppCompatCheckBox
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatCheckedTextView createCheckedTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCheckedTextView r0 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatEditText createEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEditText r0 = new androidx.appcompat.widget.AppCompatEditText
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatImageButton createImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatImageView createImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r0 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatRadioButton r0 = new androidx.appcompat.widget.AppCompatRadioButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatRatingBar createRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatRatingBar r0 = new androidx.appcompat.widget.AppCompatRatingBar
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatSeekBar createSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSeekBar r0 = new androidx.appcompat.widget.AppCompatSeekBar
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatSpinner createSpinner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatToggleButton createToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatToggleButton r0 = new androidx.appcompat.widget.AppCompatToggleButton
            r0.<init>(r2, r3)
            return r0
    }

    protected android.view.View createView(android.content.Context r2, java.lang.String r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.view.View createView(android.view.View r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            r3 = this;
            r0 = r6
            if (r8 == 0) goto L9
            if (r4 == 0) goto L9
            android.content.Context r6 = r4.getContext()
        L9:
            if (r9 != 0) goto Ld
            if (r10 == 0) goto L11
        Ld:
            android.content.Context r6 = themifyContext(r6, r7, r9, r10)
        L11:
            if (r11 == 0) goto L17
            android.content.Context r6 = androidx.appcompat.widget.TintContextWrapper.wrap(r6)
        L17:
            r1 = 0
            int r2 = r5.hashCode()
            switch(r2) {
                case -1946472170: goto Lac;
                case -1455429095: goto La1;
                case -1346021293: goto L96;
                case -938935918: goto L8c;
                case -937446323: goto L82;
                case -658531749: goto L77;
                case -339785223: goto L6d;
                case 776382189: goto L63;
                case 799298502: goto L58;
                case 1125864064: goto L4e;
                case 1413872058: goto L42;
                case 1601505219: goto L37;
                case 1666676343: goto L2c;
                case 2001146706: goto L21;
                default: goto L1f;
            }
        L1f:
            goto Lb7
        L21:
            java.lang.String r2 = "Button"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 2
            goto Lb8
        L2c:
            java.lang.String r2 = "EditText"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 3
            goto Lb8
        L37:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 6
            goto Lb8
        L42:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 9
            goto Lb8
        L4e:
            java.lang.String r2 = "ImageView"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 1
            goto Lb8
        L58:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 13
            goto Lb8
        L63:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 7
            goto Lb8
        L6d:
            java.lang.String r2 = "Spinner"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 4
            goto Lb8
        L77:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 12
            goto Lb8
        L82:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 5
            goto Lb8
        L8c:
            java.lang.String r2 = "TextView"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 0
            goto Lb8
        L96:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 10
            goto Lb8
        La1:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 8
            goto Lb8
        Lac:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 11
            goto Lb8
        Lb7:
            r2 = -1
        Lb8:
            switch(r2) {
                case 0: goto L12a;
                case 1: goto L122;
                case 2: goto L11a;
                case 3: goto L112;
                case 4: goto L10a;
                case 5: goto L102;
                case 6: goto Lfa;
                case 7: goto Lf2;
                case 8: goto Lea;
                case 9: goto Le2;
                case 10: goto Lda;
                case 11: goto Ld2;
                case 12: goto Lca;
                case 13: goto Lc1;
                default: goto Lbb;
            }
        Lbb:
            android.view.View r1 = r3.createView(r6, r5, r7)
            goto L132
        Lc1:
            androidx.appcompat.widget.AppCompatToggleButton r1 = r3.createToggleButton(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Lca:
            androidx.appcompat.widget.AppCompatSeekBar r1 = r3.createSeekBar(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Ld2:
            androidx.appcompat.widget.AppCompatRatingBar r1 = r3.createRatingBar(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Lda:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r1 = r3.createMultiAutoCompleteTextView(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Le2:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r1 = r3.createAutoCompleteTextView(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Lea:
            androidx.appcompat.widget.AppCompatCheckedTextView r1 = r3.createCheckedTextView(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Lf2:
            androidx.appcompat.widget.AppCompatRadioButton r1 = r3.createRadioButton(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        Lfa:
            androidx.appcompat.widget.AppCompatCheckBox r1 = r3.createCheckBox(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L102:
            androidx.appcompat.widget.AppCompatImageButton r1 = r3.createImageButton(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L10a:
            androidx.appcompat.widget.AppCompatSpinner r1 = r3.createSpinner(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L112:
            androidx.appcompat.widget.AppCompatEditText r1 = r3.createEditText(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L11a:
            androidx.appcompat.widget.AppCompatButton r1 = r3.createButton(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L122:
            androidx.appcompat.widget.AppCompatImageView r1 = r3.createImageView(r6, r7)
            r3.verifyNotNull(r1, r5)
            goto L132
        L12a:
            androidx.appcompat.widget.AppCompatTextView r1 = r3.createTextView(r6, r7)
            r3.verifyNotNull(r1, r5)
        L132:
            if (r1 != 0) goto L13a
            if (r0 == r6) goto L13a
            android.view.View r1 = r3.createViewFromTag(r6, r5, r7)
        L13a:
            if (r1 == 0) goto L142
            r3.checkOnClickListener(r1, r7)
            r3.backportAccessibilityAttributes(r6, r1, r7)
        L142:
            return r1
    }
}
