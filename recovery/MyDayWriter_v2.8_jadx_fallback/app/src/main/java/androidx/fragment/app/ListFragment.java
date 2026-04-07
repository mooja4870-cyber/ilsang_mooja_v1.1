package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends androidx.fragment.app.Fragment {
    static final int INTERNAL_EMPTY_ID = 16711681;
    static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    android.widget.ListAdapter mAdapter;
    java.lang.CharSequence mEmptyText;
    android.view.View mEmptyView;
    private final android.os.Handler mHandler;
    android.widget.ListView mList;
    android.view.View mListContainer;
    boolean mListShown;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener;
    android.view.View mProgressContainer;
    private final java.lang.Runnable mRequestFocus;
    android.widget.TextView mStandardEmptyView;



    public ListFragment() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.mHandler = r0
            androidx.fragment.app.ListFragment$1 r0 = new androidx.fragment.app.ListFragment$1
            r0.<init>(r1)
            r1.mRequestFocus = r0
            androidx.fragment.app.ListFragment$2 r0 = new androidx.fragment.app.ListFragment$2
            r0.<init>(r1)
            r1.mOnClickListener = r0
            return
    }

    private void ensureList() {
            r4 = this;
            android.widget.ListView r0 = r4.mList
            if (r0 == 0) goto L5
            return
        L5:
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto Lae
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 == 0) goto L15
            r1 = r0
            android.widget.ListView r1 = (android.widget.ListView) r1
            r4.mList = r1
            goto L87
        L15:
            r1 = 16711681(0xff0001, float:2.3418053E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.mStandardEmptyView = r1
            android.widget.TextView r1 = r4.mStandardEmptyView
            if (r1 != 0) goto L2e
            r1 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r1 = r0.findViewById(r1)
            r4.mEmptyView = r1
            goto L35
        L2e:
            android.widget.TextView r1 = r4.mStandardEmptyView
            r2 = 8
            r1.setVisibility(r2)
        L35:
            r1 = 16711682(0xff0002, float:2.3418054E-38)
            android.view.View r1 = r0.findViewById(r1)
            r4.mProgressContainer = r1
            r1 = 16711683(0xff0003, float:2.3418056E-38)
            android.view.View r1 = r0.findViewById(r1)
            r4.mListContainer = r1
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r1 = r0.findViewById(r1)
            boolean r2 = r1 instanceof android.widget.ListView
            if (r2 != 0) goto L64
            if (r1 != 0) goto L5c
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Your content must have a ListView whose id attribute is 'android.R.id.list'"
            r2.<init>(r3)
            throw r2
        L5c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Content has view with id attribute 'android.R.id.list' that is not a ListView class"
            r2.<init>(r3)
            throw r2
        L64:
            r2 = r1
            android.widget.ListView r2 = (android.widget.ListView) r2
            r4.mList = r2
            android.view.View r2 = r4.mEmptyView
            if (r2 == 0) goto L75
            android.widget.ListView r2 = r4.mList
            android.view.View r3 = r4.mEmptyView
            r2.setEmptyView(r3)
            goto L87
        L75:
            java.lang.CharSequence r2 = r4.mEmptyText
            if (r2 == 0) goto L87
            android.widget.TextView r2 = r4.mStandardEmptyView
            java.lang.CharSequence r3 = r4.mEmptyText
            r2.setText(r3)
            android.widget.ListView r2 = r4.mList
            android.widget.TextView r3 = r4.mStandardEmptyView
            r2.setEmptyView(r3)
        L87:
            r1 = 1
            r4.mListShown = r1
            android.widget.ListView r1 = r4.mList
            android.widget.AdapterView$OnItemClickListener r2 = r4.mOnClickListener
            r1.setOnItemClickListener(r2)
            android.widget.ListAdapter r1 = r4.mAdapter
            if (r1 == 0) goto L9e
            android.widget.ListAdapter r1 = r4.mAdapter
            r2 = 0
            r4.mAdapter = r2
            r4.setListAdapter(r1)
            goto La6
        L9e:
            android.view.View r1 = r4.mProgressContainer
            if (r1 == 0) goto La6
            r1 = 0
            r4.setListShown(r1, r1)
        La6:
            android.os.Handler r1 = r4.mHandler
            java.lang.Runnable r2 = r4.mRequestFocus
            r1.post(r2)
            return
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Content view not yet created"
            r1.<init>(r2)
            throw r1
    }

    private void setListShown(boolean r7, boolean r8) {
            r6 = this;
            r6.ensureList()
            android.view.View r0 = r6.mProgressContainer
            if (r0 == 0) goto L7c
            boolean r0 = r6.mListShown
            if (r0 != r7) goto Lc
            return
        Lc:
            r6.mListShown = r7
            r0 = 8
            r1 = 0
            r2 = 17432577(0x10a0001, float:2.53466E-38)
            r3 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r7 == 0) goto L4a
            if (r8 == 0) goto L35
            android.view.View r4 = r6.mProgressContainer
            android.content.Context r5 = r6.getContext()
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r5, r2)
            r4.startAnimation(r2)
            android.view.View r2 = r6.mListContainer
            android.content.Context r4 = r6.getContext()
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r4, r3)
            r2.startAnimation(r3)
            goto L3f
        L35:
            android.view.View r2 = r6.mProgressContainer
            r2.clearAnimation()
            android.view.View r2 = r6.mListContainer
            r2.clearAnimation()
        L3f:
            android.view.View r2 = r6.mProgressContainer
            r2.setVisibility(r0)
            android.view.View r0 = r6.mListContainer
            r0.setVisibility(r1)
            goto L7b
        L4a:
            if (r8 == 0) goto L67
            android.view.View r4 = r6.mProgressContainer
            android.content.Context r5 = r6.getContext()
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r5, r3)
            r4.startAnimation(r3)
            android.view.View r3 = r6.mListContainer
            android.content.Context r4 = r6.getContext()
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r4, r2)
            r3.startAnimation(r2)
            goto L71
        L67:
            android.view.View r2 = r6.mProgressContainer
            r2.clearAnimation()
            android.view.View r2 = r6.mListContainer
            r2.clearAnimation()
        L71:
            android.view.View r2 = r6.mProgressContainer
            r2.setVisibility(r1)
            android.view.View r1 = r6.mListContainer
            r1.setVisibility(r0)
        L7b:
            return
        L7c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't be used with a custom content view"
            r0.<init>(r1)
            throw r0
    }

    public android.widget.ListAdapter getListAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = r1.mAdapter
            return r0
    }

    public android.widget.ListView getListView() {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            return r0
    }

    public long getSelectedItemId() {
            r2 = this;
            r2.ensureList()
            android.widget.ListView r0 = r2.mList
            long r0 = r0.getSelectedItemId()
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
            r9 = this;
            android.content.Context r0 = r9.requireContext()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r3 = 16711682(0xff0002, float:2.3418054E-38)
            r2.setId(r3)
            r3 = 1
            r2.setOrientation(r3)
            r3 = 8
            r2.setVisibility(r3)
            r3 = 17
            r2.setGravity(r3)
            android.widget.ProgressBar r4 = new android.widget.ProgressBar
            r5 = 0
            r6 = 16842874(0x101007a, float:2.36939E-38)
            r4.<init>(r0, r5, r6)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r5.<init>(r6, r6)
            r2.addView(r4, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r1.addView(r2, r5)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r0)
            r7 = 16711683(0xff0003, float:2.3418056E-38)
            r5.setId(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            r8 = 16711681(0xff0001, float:2.3418053E-38)
            r7.setId(r8)
            r7.setGravity(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r6, r6)
            r5.addView(r7, r3)
            android.widget.ListView r3 = new android.widget.ListView
            r3.<init>(r0)
            r8 = 16908298(0x102000a, float:2.3877257E-38)
            r3.setId(r8)
            r8 = 0
            r3.setDrawSelectorOnTop(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r6)
            r5.addView(r3, r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r6)
            r1.addView(r5, r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r6)
            r1.setLayoutParams(r8)
            return r1
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mRequestFocus
            r0.removeCallbacks(r1)
            r0 = 0
            r2.mList = r0
            r1 = 0
            r2.mListShown = r1
            r2.mListContainer = r0
            r2.mProgressContainer = r0
            r2.mEmptyView = r0
            r2.mStandardEmptyView = r0
            super.onDestroyView()
            return
    }

    public void onListItemClick(android.widget.ListView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r0.ensureList()
            return
    }

    public final android.widget.ListAdapter requireListAdapter() {
            r4 = this;
            android.widget.ListAdapter r0 = r4.getListAdapter()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ListFragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " does not have a ListAdapter."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void setEmptyText(java.lang.CharSequence r3) {
            r2 = this;
            r2.ensureList()
            android.widget.TextView r0 = r2.mStandardEmptyView
            if (r0 == 0) goto L1a
            android.widget.TextView r0 = r2.mStandardEmptyView
            r0.setText(r3)
            java.lang.CharSequence r0 = r2.mEmptyText
            if (r0 != 0) goto L17
            android.widget.ListView r0 = r2.mList
            android.widget.TextView r1 = r2.mStandardEmptyView
            r0.setEmptyView(r1)
        L17:
            r2.mEmptyText = r3
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't be used with a custom content view"
            r0.<init>(r1)
            throw r0
    }

    public void setListAdapter(android.widget.ListAdapter r5) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.mAdapter
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r4.mAdapter = r5
            android.widget.ListView r3 = r4.mList
            if (r3 == 0) goto L28
            android.widget.ListView r3 = r4.mList
            r3.setAdapter(r5)
            boolean r3 = r4.mListShown
            if (r3 != 0) goto L28
            if (r0 != 0) goto L28
            android.view.View r3 = r4.requireView()
            android.os.IBinder r3 = r3.getWindowToken()
            if (r3 == 0) goto L25
            r1 = r2
        L25:
            r4.setListShown(r2, r1)
        L28:
            return
    }

    public void setListShown(boolean r2) {
            r1 = this;
            r0 = 1
            r1.setListShown(r2, r0)
            return
    }

    public void setListShownNoAnimation(boolean r2) {
            r1 = this;
            r0 = 0
            r1.setListShown(r2, r0)
            return
    }

    public void setSelection(int r2) {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            r0.setSelection(r2)
            return
    }
}
