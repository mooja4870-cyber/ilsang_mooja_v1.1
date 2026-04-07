package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    final java.util.List<java.lang.String> mFragments;
    final java.util.List<androidx.fragment.app.BackStackRecordState> mTransactions;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    BackStackState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragments = r0
            android.os.Parcelable$Creator<androidx.fragment.app.BackStackRecordState> r0 = androidx.fragment.app.BackStackRecordState.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.mTransactions = r0
            return
    }

    BackStackState(java.util.List<java.lang.String> r1, java.util.List<androidx.fragment.app.BackStackRecordState> r2) {
            r0 = this;
            r0.<init>()
            r0.mFragments = r1
            r0.mTransactions = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    java.util.List<androidx.fragment.app.BackStackRecord> instantiate(androidx.fragment.app.FragmentManager r12, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r13) {
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.List<java.lang.String> r1 = r11.mFragments
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r11.mFragments
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r13.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L2b
            java.lang.String r4 = r3.mWho
            r0.put(r4, r3)
            goto L11
        L2b:
            androidx.fragment.app.FragmentStore r4 = r12.getFragmentStore()
            r5 = 0
            android.os.Bundle r4 = r4.setSavedState(r2, r5)
            if (r4 == 0) goto L7b
            androidx.fragment.app.FragmentHostCallback r5 = r12.getHost()
            android.content.Context r5 = r5.getContext()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            java.lang.String r6 = "state"
            android.os.Parcelable r6 = r4.getParcelable(r6)
            androidx.fragment.app.FragmentState r6 = (androidx.fragment.app.FragmentState) r6
            androidx.fragment.app.FragmentFactory r7 = r12.getFragmentFactory()
            androidx.fragment.app.Fragment r7 = r6.instantiate(r7, r5)
            r7.mSavedFragmentState = r4
            android.os.Bundle r8 = r7.mSavedFragmentState
            java.lang.String r9 = "savedInstanceState"
            android.os.Bundle r8 = r8.getBundle(r9)
            if (r8 != 0) goto L68
            android.os.Bundle r8 = r7.mSavedFragmentState
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r8.putBundle(r9, r10)
        L68:
            java.lang.String r8 = "arguments"
            android.os.Bundle r8 = r4.getBundle(r8)
            if (r8 == 0) goto L73
            r8.setClassLoader(r5)
        L73:
            r7.setArguments(r8)
            java.lang.String r9 = r7.mWho
            r0.put(r9, r7)
        L7b:
            goto L11
        L7c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<androidx.fragment.app.BackStackRecordState> r2 = r11.mTransactions
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.BackStackRecordState r3 = (androidx.fragment.app.BackStackRecordState) r3
            androidx.fragment.app.BackStackRecord r4 = r3.instantiate(r12, r0)
            r1.add(r4)
            goto L87
        L9b:
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mFragments
            r2.writeStringList(r0)
            java.util.List<androidx.fragment.app.BackStackRecordState> r0 = r1.mTransactions
            r2.writeTypedList(r0)
            return
    }
}
