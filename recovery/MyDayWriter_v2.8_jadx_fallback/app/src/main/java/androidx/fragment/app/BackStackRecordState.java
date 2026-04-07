package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState> CREATOR = null;
    private static final java.lang.String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;


    static {
            androidx.fragment.app.BackStackRecordState$1 r0 = new androidx.fragment.app.BackStackRecordState$1
            r0.<init>()
            androidx.fragment.app.BackStackRecordState.CREATOR = r0
            return
    }

    BackStackRecordState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.mOps = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragmentWhos = r0
            int[] r0 = r2.createIntArray()
            r1.mOldMaxLifecycleStates = r0
            int[] r0 = r2.createIntArray()
            r1.mCurrentMaxLifecycleStates = r0
            int r0 = r2.readInt()
            r1.mTransition = r0
            java.lang.String r0 = r2.readString()
            r1.mName = r0
            int r0 = r2.readInt()
            r1.mIndex = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbTitleText = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbShortTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementTargetNames = r0
            int r0 = r2.readInt()
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            r1.mReorderingAllowed = r0
            return
    }

    BackStackRecordState(androidx.fragment.app.BackStackRecord r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r7.mOps = r1
            boolean r1 = r8.mAddToBackStack
            if (r1 == 0) goto Lae
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r7.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r7.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = 0
        L24:
            if (r2 >= r0) goto L85
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r8.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            int[] r4 = r7.mOps
            int r5 = r1 + 1
            int r6 = r3.mCmd
            r4[r1] = r6
            java.util.ArrayList<java.lang.String> r1 = r7.mFragmentWhos
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L41
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r4 = r4.mWho
            goto L42
        L41:
            r4 = 0
        L42:
            r1.add(r4)
            int[] r1 = r7.mOps
            int r4 = r5 + 1
            boolean r6 = r3.mFromExpandedOp
            r1[r5] = r6
            int[] r1 = r7.mOps
            int r5 = r4 + 1
            int r6 = r3.mEnterAnim
            r1[r4] = r6
            int[] r1 = r7.mOps
            int r4 = r5 + 1
            int r6 = r3.mExitAnim
            r1[r5] = r6
            int[] r1 = r7.mOps
            int r5 = r4 + 1
            int r6 = r3.mPopEnterAnim
            r1[r4] = r6
            int[] r1 = r7.mOps
            int r4 = r5 + 1
            int r6 = r3.mPopExitAnim
            r1[r5] = r6
            int[] r1 = r7.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r5 = r3.mOldMaxState
            int r5 = r5.ordinal()
            r1[r2] = r5
            int[] r1 = r7.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r5 = r3.mCurrentMaxState
            int r5 = r5.ordinal()
            r1[r2] = r5
            int r2 = r2 + 1
            r1 = r4
            goto L24
        L85:
            int r2 = r8.mTransition
            r7.mTransition = r2
            java.lang.String r2 = r8.mName
            r7.mName = r2
            int r2 = r8.mIndex
            r7.mIndex = r2
            int r2 = r8.mBreadCrumbTitleRes
            r7.mBreadCrumbTitleRes = r2
            java.lang.CharSequence r2 = r8.mBreadCrumbTitleText
            r7.mBreadCrumbTitleText = r2
            int r2 = r8.mBreadCrumbShortTitleRes
            r7.mBreadCrumbShortTitleRes = r2
            java.lang.CharSequence r2 = r8.mBreadCrumbShortTitleText
            r7.mBreadCrumbShortTitleText = r2
            java.util.ArrayList<java.lang.String> r2 = r8.mSharedElementSourceNames
            r7.mSharedElementSourceNames = r2
            java.util.ArrayList<java.lang.String> r2 = r8.mSharedElementTargetNames
            r7.mSharedElementTargetNames = r2
            boolean r2 = r8.mReorderingAllowed
            r7.mReorderingAllowed = r2
            return
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not on back stack"
            r1.<init>(r2)
            throw r1
    }

    private void fillInBackStackRecord(androidx.fragment.app.BackStackRecord r7) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = r6.mOps
            int r2 = r2.length
            r3 = 1
            if (r0 >= r2) goto La9
            androidx.fragment.app.FragmentTransaction$Op r2 = new androidx.fragment.app.FragmentTransaction$Op
            r2.<init>()
            int[] r4 = r6.mOps
            int r5 = r0 + 1
            r0 = r4[r0]
            r2.mCmd = r0
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Instantiate "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r4 = " op #"
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = " base fragment #"
            java.lang.StringBuilder r0 = r0.append(r4)
            int[] r4 = r6.mOps
            r4 = r4[r5]
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r0)
        L4c:
            androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
            int[] r4 = r6.mOldMaxLifecycleStates
            r4 = r4[r1]
            r0 = r0[r4]
            r2.mOldMaxState = r0
            androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
            int[] r4 = r6.mCurrentMaxLifecycleStates
            r4 = r4[r1]
            r0 = r0[r4]
            r2.mCurrentMaxState = r0
            int[] r0 = r6.mOps
            int r4 = r5 + 1
            r0 = r0[r5]
            if (r0 == 0) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            r2.mFromExpandedOp = r3
            int[] r0 = r6.mOps
            int r3 = r4 + 1
            r0 = r0[r4]
            r2.mEnterAnim = r0
            int[] r0 = r6.mOps
            int r4 = r3 + 1
            r0 = r0[r3]
            r2.mExitAnim = r0
            int[] r0 = r6.mOps
            int r3 = r4 + 1
            r0 = r0[r4]
            r2.mPopEnterAnim = r0
            int[] r0 = r6.mOps
            int r4 = r3 + 1
            r0 = r0[r3]
            r2.mPopExitAnim = r0
            int r0 = r2.mEnterAnim
            r7.mEnterAnim = r0
            int r0 = r2.mExitAnim
            r7.mExitAnim = r0
            int r0 = r2.mPopEnterAnim
            r7.mPopEnterAnim = r0
            int r0 = r2.mPopExitAnim
            r7.mPopExitAnim = r0
            r7.addOp(r2)
            int r1 = r1 + 1
            r0 = r4
            goto L2
        La9:
            int r2 = r6.mTransition
            r7.mTransition = r2
            java.lang.String r2 = r6.mName
            r7.mName = r2
            r7.mAddToBackStack = r3
            int r2 = r6.mBreadCrumbTitleRes
            r7.mBreadCrumbTitleRes = r2
            java.lang.CharSequence r2 = r6.mBreadCrumbTitleText
            r7.mBreadCrumbTitleText = r2
            int r2 = r6.mBreadCrumbShortTitleRes
            r7.mBreadCrumbShortTitleRes = r2
            java.lang.CharSequence r2 = r6.mBreadCrumbShortTitleText
            r7.mBreadCrumbShortTitleText = r2
            java.util.ArrayList<java.lang.String> r2 = r6.mSharedElementSourceNames
            r7.mSharedElementSourceNames = r2
            java.util.ArrayList<java.lang.String> r2 = r6.mSharedElementTargetNames
            r7.mSharedElementTargetNames = r2
            boolean r2 = r6.mReorderingAllowed
            r7.mReorderingAllowed = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r6) {
            r5 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r6)
            r5.fillInBackStackRecord(r0)
            int r1 = r5.mIndex
            r0.mIndex = r1
            r1 = 0
        Ld:
            java.util.ArrayList<java.lang.String> r2 = r5.mFragmentWhos
            int r2 = r2.size()
            if (r1 >= r2) goto L30
            java.util.ArrayList<java.lang.String> r2 = r5.mFragmentWhos
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r4 = r6.findActiveFragment(r2)
            r3.mFragment = r4
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            r1 = 1
            r0.bumpBackStackNesting(r1)
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r8, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r9) {
            r7 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r8)
            r7.fillInBackStackRecord(r0)
            r1 = 0
        L9:
            java.util.ArrayList<java.lang.String> r2 = r7.mFragmentWhos
            int r2 = r2.size()
            if (r1 >= r2) goto L5c
            java.util.ArrayList<java.lang.String> r2 = r7.mFragmentWhos
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L59
            java.lang.Object r3 = r9.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L2e
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r0.mOps
            java.lang.Object r4 = r4.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            r4.mFragment = r3
            goto L59
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Restoring FragmentTransaction "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r7.mName
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " failed due to missing saved state for Fragment ("
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r6 = ")"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L59:
            int r1 = r1 + 1
            goto L9
        L5c:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int[] r0 = r2.mOps
            r3.writeIntArray(r0)
            java.util.ArrayList<java.lang.String> r0 = r2.mFragmentWhos
            r3.writeStringList(r0)
            int[] r0 = r2.mOldMaxLifecycleStates
            r3.writeIntArray(r0)
            int[] r0 = r2.mCurrentMaxLifecycleStates
            r3.writeIntArray(r0)
            int r0 = r2.mTransition
            r3.writeInt(r0)
            java.lang.String r0 = r2.mName
            r3.writeString(r0)
            int r0 = r2.mIndex
            r3.writeInt(r0)
            int r0 = r2.mBreadCrumbTitleRes
            r3.writeInt(r0)
            java.lang.CharSequence r0 = r2.mBreadCrumbTitleText
            r1 = 0
            android.text.TextUtils.writeToParcel(r0, r3, r1)
            int r0 = r2.mBreadCrumbShortTitleRes
            r3.writeInt(r0)
            java.lang.CharSequence r0 = r2.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r0, r3, r1)
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementSourceNames
            r3.writeStringList(r0)
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementTargetNames
            r3.writeStringList(r0)
            boolean r0 = r2.mReorderingAllowed
            r3.writeInt(r0)
            return
    }
}
