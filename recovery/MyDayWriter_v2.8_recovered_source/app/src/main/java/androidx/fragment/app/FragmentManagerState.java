package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState> CREATOR = null;
    java.util.ArrayList<java.lang.String> mActive;
    java.util.ArrayList<java.lang.String> mAdded;
    androidx.fragment.app.BackStackRecordState[] mBackStack;
    int mBackStackIndex;
    java.util.ArrayList<java.lang.String> mBackStackStateKeys;
    java.util.ArrayList<androidx.fragment.app.BackStackState> mBackStackStates;
    java.util.ArrayList<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    java.lang.String mPrimaryNavActiveWho;


    static {
            androidx.fragment.app.FragmentManagerState$1 r0 = new androidx.fragment.app.FragmentManagerState$1
            r0.<init>()
            androidx.fragment.app.FragmentManagerState.CREATOR = r0
            return
    }

    public FragmentManagerState() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPrimaryNavActiveWho = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackStateKeys = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackStates = r0
            return
    }

    public FragmentManagerState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPrimaryNavActiveWho = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackStateKeys = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackStates = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mActive = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mAdded = r0
            android.os.Parcelable$Creator<androidx.fragment.app.BackStackRecordState> r0 = androidx.fragment.app.BackStackRecordState.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            androidx.fragment.app.BackStackRecordState[] r0 = (androidx.fragment.app.BackStackRecordState[]) r0
            r1.mBackStack = r0
            int r0 = r2.readInt()
            r1.mBackStackIndex = r0
            java.lang.String r0 = r2.readString()
            r1.mPrimaryNavActiveWho = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mBackStackStateKeys = r0
            android.os.Parcelable$Creator<androidx.fragment.app.BackStackState> r0 = androidx.fragment.app.BackStackState.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.mBackStackStates = r0
            android.os.Parcelable$Creator<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r0 = androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.mLaunchedFragments = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mActive
            r2.writeStringList(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.mAdded
            r2.writeStringList(r0)
            androidx.fragment.app.BackStackRecordState[] r0 = r1.mBackStack
            r2.writeTypedArray(r0, r3)
            int r0 = r1.mBackStackIndex
            r2.writeInt(r0)
            java.lang.String r0 = r1.mPrimaryNavActiveWho
            r2.writeString(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.mBackStackStateKeys
            r2.writeStringList(r0)
            java.util.ArrayList<androidx.fragment.app.BackStackState> r0 = r1.mBackStackStates
            r2.writeTypedList(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r0 = r1.mLaunchedFragments
            r2.writeTypedList(r0)
            return
    }
}
