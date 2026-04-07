package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    private static final java.lang.String TAG = "FragmentManager";
    final androidx.fragment.app.FragmentManager mFragmentManager;


    FragmentLayoutInflaterFactory(androidx.fragment.app.FragmentManager r1) {
            r0 = this;
            r0.<init>()
            r0.mFragmentManager = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r17, java.lang.String r18, android.content.Context r19, android.util.AttributeSet r20) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r4 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L1c
            androidx.fragment.app.FragmentContainerView r4 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r5 = r0.mFragmentManager
            r4.<init>(r2, r3, r5)
            return r4
        L1c:
            java.lang.String r4 = "fragment"
            boolean r4 = r4.equals(r1)
            r5 = 0
            if (r4 != 0) goto L26
            return r5
        L26:
            java.lang.String r4 = "class"
            java.lang.String r4 = r3.getAttributeValue(r5, r4)
            int[] r6 = androidx.fragment.R.styleable.Fragment
            android.content.res.TypedArray r6 = r2.obtainStyledAttributes(r3, r6)
            if (r4 != 0) goto L3a
            int r7 = androidx.fragment.R.styleable.Fragment_android_name
            java.lang.String r4 = r6.getString(r7)
        L3a:
            int r7 = androidx.fragment.R.styleable.Fragment_android_id
            r8 = -1
            int r7 = r6.getResourceId(r7, r8)
            int r9 = androidx.fragment.R.styleable.Fragment_android_tag
            java.lang.String r9 = r6.getString(r9)
            r6.recycle()
            if (r4 == 0) goto L200
            java.lang.ClassLoader r10 = r2.getClassLoader()
            boolean r10 = androidx.fragment.app.FragmentFactory.isFragmentClass(r10, r4)
            if (r10 != 0) goto L58
            goto L200
        L58:
            if (r17 == 0) goto L5f
            int r10 = r17.getId()
            goto L60
        L5f:
            r10 = 0
        L60:
            if (r10 != r8) goto L88
            if (r7 != r8) goto L88
            if (r9 == 0) goto L67
            goto L88
        L67:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = r3.getPositionDescription()
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r11 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r8 = r8.toString()
            r5.<init>(r8)
            throw r5
        L88:
            if (r7 == r8) goto L90
            androidx.fragment.app.FragmentManager r5 = r0.mFragmentManager
            androidx.fragment.app.Fragment r5 = r5.findFragmentById(r7)
        L90:
            if (r5 != 0) goto L9a
            if (r9 == 0) goto L9a
            androidx.fragment.app.FragmentManager r11 = r0.mFragmentManager
            androidx.fragment.app.Fragment r5 = r11.findFragmentByTag(r9)
        L9a:
            if (r5 != 0) goto La4
            if (r10 == r8) goto La4
            androidx.fragment.app.FragmentManager r8 = r0.mFragmentManager
            androidx.fragment.app.Fragment r5 = r8.findFragmentById(r10)
        La4:
            java.lang.String r8 = "Fragment "
            java.lang.String r11 = "FragmentManager"
            r12 = 2
            r13 = 1
            if (r5 != 0) goto L113
            androidx.fragment.app.FragmentManager r14 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r14 = r14.getFragmentFactory()
            java.lang.ClassLoader r15 = r2.getClassLoader()
            androidx.fragment.app.Fragment r5 = r14.instantiate(r15, r4)
            r5.mFromLayout = r13
            if (r7 == 0) goto Lc0
            r14 = r7
            goto Lc1
        Lc0:
            r14 = r10
        Lc1:
            r5.mFragmentId = r14
            r5.mContainerId = r10
            r5.mTag = r9
            r5.mInLayout = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            r5.mFragmentManager = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r13 = r13.getHost()
            r5.mHost = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r13 = r13.getHost()
            android.content.Context r13 = r13.getContext()
            android.os.Bundle r14 = r5.mSavedFragmentState
            r5.onInflate(r13, r3, r14)
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentStateManager r13 = r13.addFragment(r5)
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r12)
            if (r12 == 0) goto L164
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r8)
            java.lang.StringBuilder r12 = r12.append(r5)
            java.lang.String r14 = " has been inflated via the <fragment> tag: id=0x"
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r11, r12)
            goto L164
        L113:
            boolean r14 = r5.mInLayout
            if (r14 != 0) goto L1b9
            r5.mInLayout = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            r5.mFragmentManager = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r13 = r13.getHost()
            r5.mHost = r13
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r13 = r13.getHost()
            android.content.Context r13 = r13.getContext()
            android.os.Bundle r14 = r5.mSavedFragmentState
            r5.onInflate(r13, r3, r14)
            androidx.fragment.app.FragmentManager r13 = r0.mFragmentManager
            androidx.fragment.app.FragmentStateManager r13 = r13.createOrGetFragmentStateManager(r5)
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r12)
            if (r12 == 0) goto L164
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "Retained Fragment "
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.StringBuilder r12 = r12.append(r5)
            java.lang.String r14 = " has been re-attached via the <fragment> tag: id=0x"
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r11, r12)
        L164:
            r11 = r17
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentTagUsage(r5, r11)
            r11 = r17
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r5.mContainer = r11
            r13.moveToExpectedState()
            r13.ensureInflatedView()
            android.view.View r11 = r5.mView
            if (r11 == 0) goto L19c
            if (r7 == 0) goto L182
            android.view.View r8 = r5.mView
            r8.setId(r7)
        L182:
            android.view.View r8 = r5.mView
            java.lang.Object r8 = r8.getTag()
            if (r8 != 0) goto L18f
            android.view.View r8 = r5.mView
            r8.setTag(r9)
        L18f:
            android.view.View r8 = r5.mView
            androidx.fragment.app.FragmentLayoutInflaterFactory$1 r11 = new androidx.fragment.app.FragmentLayoutInflaterFactory$1
            r11.<init>(r0, r13)
            r8.addOnAttachStateChangeListener(r11)
            android.view.View r8 = r5.mView
            return r8
        L19c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r8 = r12.append(r8)
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r12 = " did not create a view."
            java.lang.StringBuilder r8 = r8.append(r12)
            java.lang.String r8 = r8.toString()
            r11.<init>(r8)
            throw r11
        L1b9:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r3.getPositionDescription()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ", tag "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r9)
            java.lang.String r12 = ", or parent id 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r10)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r11 = r11.toString()
            r8.<init>(r11)
            throw r8
        L200:
            return r5
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.onCreateView(r0, r2, r3, r4)
            return r0
    }
}
