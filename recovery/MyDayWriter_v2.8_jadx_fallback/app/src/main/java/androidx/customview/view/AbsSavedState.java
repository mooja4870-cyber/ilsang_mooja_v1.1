package androidx.customview.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = null;
    public static final androidx.customview.view.AbsSavedState EMPTY_STATE = null;
    private final android.os.Parcelable mSuperState;



    static {
            androidx.customview.view.AbsSavedState$1 r0 = new androidx.customview.view.AbsSavedState$1
            r0.<init>()
            androidx.customview.view.AbsSavedState.EMPTY_STATE = r0
            androidx.customview.view.AbsSavedState$2 r0 = new androidx.customview.view.AbsSavedState$2
            r0.<init>()
            androidx.customview.view.AbsSavedState.CREATOR = r0
            return
    }

    private AbsSavedState() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSuperState = r0
            return
    }

    protected AbsSavedState(android.os.Parcel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    protected AbsSavedState(android.os.Parcel r3, java.lang.ClassLoader r4) {
            r2 = this;
            r2.<init>()
            android.os.Parcelable r0 = r3.readParcelable(r4)
            if (r0 == 0) goto Lb
            r1 = r0
            goto Ld
        Lb:
            androidx.customview.view.AbsSavedState r1 = androidx.customview.view.AbsSavedState.EMPTY_STATE
        Ld:
            r2.mSuperState = r1
            return
    }

    protected AbsSavedState(android.os.Parcelable r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto Lf
            androidx.customview.view.AbsSavedState r0 = androidx.customview.view.AbsSavedState.EMPTY_STATE
            if (r3 == r0) goto Lb
            r0 = r3
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.mSuperState = r0
            return
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "superState must not be null"
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ AbsSavedState(androidx.customview.view.AbsSavedState.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.os.Parcelable getSuperState() {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            r2.writeParcelable(r0, r3)
            return
    }
}
