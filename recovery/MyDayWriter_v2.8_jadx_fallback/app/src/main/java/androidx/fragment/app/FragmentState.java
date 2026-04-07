package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentState> CREATOR = null;
    final java.lang.String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final boolean mHidden;
    final boolean mInDynamicContainer;
    final int mMaxLifecycleState;
    final boolean mRemoving;
    final boolean mRetainInstance;
    final java.lang.String mTag;
    final int mTargetRequestCode;
    final java.lang.String mTargetWho;
    final boolean mUserVisibleHint;
    final java.lang.String mWho;


    static {
            androidx.fragment.app.FragmentState$1 r0 = new androidx.fragment.app.FragmentState$1
            r0.<init>()
            androidx.fragment.app.FragmentState.CREATOR = r0
            return
    }

    FragmentState(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.mClassName = r0
            java.lang.String r0 = r4.readString()
            r3.mWho = r0
            int r0 = r4.readInt()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            r3.mFromLayout = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            r3.mInDynamicContainer = r0
            int r0 = r4.readInt()
            r3.mFragmentId = r0
            int r0 = r4.readInt()
            r3.mContainerId = r0
            java.lang.String r0 = r4.readString()
            r3.mTag = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r2
        L42:
            r3.mRetainInstance = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r1
            goto L4d
        L4c:
            r0 = r2
        L4d:
            r3.mRemoving = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L57
            r0 = r1
            goto L58
        L57:
            r0 = r2
        L58:
            r3.mDetached = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L62
            r0 = r1
            goto L63
        L62:
            r0 = r2
        L63:
            r3.mHidden = r0
            int r0 = r4.readInt()
            r3.mMaxLifecycleState = r0
            java.lang.String r0 = r4.readString()
            r3.mTargetWho = r0
            int r0 = r4.readInt()
            r3.mTargetRequestCode = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r1 = r2
        L7f:
            r3.mUserVisibleHint = r1
            return
    }

    FragmentState(androidx.fragment.app.Fragment r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.mClassName = r0
            java.lang.String r0 = r2.mWho
            r1.mWho = r0
            boolean r0 = r2.mFromLayout
            r1.mFromLayout = r0
            boolean r0 = r2.mInDynamicContainer
            r1.mInDynamicContainer = r0
            int r0 = r2.mFragmentId
            r1.mFragmentId = r0
            int r0 = r2.mContainerId
            r1.mContainerId = r0
            java.lang.String r0 = r2.mTag
            r1.mTag = r0
            boolean r0 = r2.mRetainInstance
            r1.mRetainInstance = r0
            boolean r0 = r2.mRemoving
            r1.mRemoving = r0
            boolean r0 = r2.mDetached
            r1.mDetached = r0
            boolean r0 = r2.mHidden
            r1.mHidden = r0
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            int r0 = r0.ordinal()
            r1.mMaxLifecycleState = r0
            java.lang.String r0 = r2.mTargetWho
            r1.mTargetWho = r0
            int r0 = r2.mTargetRequestCode
            r1.mTargetRequestCode = r0
            boolean r0 = r2.mUserVisibleHint
            r1.mUserVisibleHint = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    androidx.fragment.app.Fragment instantiate(androidx.fragment.app.FragmentFactory r4, java.lang.ClassLoader r5) {
            r3 = this;
            java.lang.String r0 = r3.mClassName
            androidx.fragment.app.Fragment r0 = r4.instantiate(r5, r0)
            java.lang.String r1 = r3.mWho
            r0.mWho = r1
            boolean r1 = r3.mFromLayout
            r0.mFromLayout = r1
            boolean r1 = r3.mInDynamicContainer
            r0.mInDynamicContainer = r1
            r1 = 1
            r0.mRestored = r1
            int r1 = r3.mFragmentId
            r0.mFragmentId = r1
            int r1 = r3.mContainerId
            r0.mContainerId = r1
            java.lang.String r1 = r3.mTag
            r0.mTag = r1
            boolean r1 = r3.mRetainInstance
            r0.mRetainInstance = r1
            boolean r1 = r3.mRemoving
            r0.mRemoving = r1
            boolean r1 = r3.mDetached
            r0.mDetached = r1
            boolean r1 = r3.mHidden
            r0.mHidden = r1
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int r2 = r3.mMaxLifecycleState
            r1 = r1[r2]
            r0.mMaxState = r1
            java.lang.String r1 = r3.mTargetWho
            r0.mTargetWho = r1
            int r1 = r3.mTargetRequestCode
            r0.mTargetRequestCode = r1
            boolean r1 = r3.mUserVisibleHint
            r0.mUserVisibleHint = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r2.mClassName
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r2.mFromLayout
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            boolean r1 = r2.mInDynamicContainer
            if (r1 == 0) goto L32
            java.lang.String r1 = " dynamicContainer"
            r0.append(r1)
        L32:
            int r1 = r2.mContainerId
            if (r1 == 0) goto L44
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.mContainerId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L44:
            java.lang.String r1 = r2.mTag
            if (r1 == 0) goto L5a
            java.lang.String r1 = r2.mTag
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.mTag
            r0.append(r1)
        L5a:
            boolean r1 = r2.mRetainInstance
            if (r1 == 0) goto L63
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L63:
            boolean r1 = r2.mRemoving
            if (r1 == 0) goto L6c
            java.lang.String r1 = " removing"
            r0.append(r1)
        L6c:
            boolean r1 = r2.mDetached
            if (r1 == 0) goto L75
            java.lang.String r1 = " detached"
            r0.append(r1)
        L75:
            boolean r1 = r2.mHidden
            if (r1 == 0) goto L7e
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L7e:
            java.lang.String r1 = r2.mTargetWho
            if (r1 == 0) goto L96
            java.lang.String r1 = " targetWho="
            r0.append(r1)
            java.lang.String r1 = r2.mTargetWho
            r0.append(r1)
            java.lang.String r1 = " targetRequestCode="
            r0.append(r1)
            int r1 = r2.mTargetRequestCode
            r0.append(r1)
        L96:
            boolean r1 = r2.mUserVisibleHint
            if (r1 == 0) goto L9f
            java.lang.String r1 = " userVisibleHint"
            r0.append(r1)
        L9f:
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.mClassName
            r2.writeString(r0)
            java.lang.String r0 = r1.mWho
            r2.writeString(r0)
            boolean r0 = r1.mFromLayout
            r2.writeInt(r0)
            boolean r0 = r1.mInDynamicContainer
            r2.writeInt(r0)
            int r0 = r1.mFragmentId
            r2.writeInt(r0)
            int r0 = r1.mContainerId
            r2.writeInt(r0)
            java.lang.String r0 = r1.mTag
            r2.writeString(r0)
            boolean r0 = r1.mRetainInstance
            r2.writeInt(r0)
            boolean r0 = r1.mRemoving
            r2.writeInt(r0)
            boolean r0 = r1.mDetached
            r2.writeInt(r0)
            boolean r0 = r1.mHidden
            r2.writeInt(r0)
            int r0 = r1.mMaxLifecycleState
            r2.writeInt(r0)
            java.lang.String r0 = r1.mTargetWho
            r2.writeString(r0)
            int r0 = r1.mTargetRequestCode
            r2.writeInt(r0)
            boolean r0 = r1.mUserVisibleHint
            r2.writeInt(r0)
            return
    }
}
