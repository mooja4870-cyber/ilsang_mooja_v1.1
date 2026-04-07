package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "resultCode", "", "data", "Landroid/content/Intent;", "<init>", "(ILandroid/content/Intent;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getResultCode", "()I", "getData", "()Landroid/content/Intent;", "toString", "", "writeToParcel", "", "dest", "flags", "describeContents", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = null;
    public static final androidx.activity.result.ActivityResult.Companion Companion = null;
    private final android.content.Intent data;
    private final int resultCode;

    /* JADX INFO: compiled from: ActivityResult.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResult$Companion;", "", "<init>", "()V", "resultCodeToString", "", "resultCode", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/ActivityResult;", "getCREATOR$annotations", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void getCREATOR$annotations() {
                return
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String resultCodeToString(int r2) {
                r1 = this;
                switch(r2) {
                    case -1: goto Lb;
                    case 0: goto L8;
                    default: goto L3;
                }
            L3:
                java.lang.String r0 = java.lang.String.valueOf(r2)
                goto Ld
            L8:
                java.lang.String r0 = "RESULT_CANCELED"
                goto Ld
            Lb:
                java.lang.String r0 = "RESULT_OK"
            Ld:
                return r0
        }
    }

    static {
            androidx.activity.result.ActivityResult$Companion r0 = new androidx.activity.result.ActivityResult$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.result.ActivityResult.Companion = r0
            androidx.activity.result.ActivityResult$Companion$CREATOR$1 r0 = new androidx.activity.result.ActivityResult$Companion$CREATOR$1
            r0.<init>()
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            androidx.activity.result.ActivityResult.CREATOR = r0
            return
    }

    public ActivityResult(int r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.resultCode = r1
            r0.data = r2
            return
    }

    public ActivityResult(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.readInt()
            int r1 = r3.readInt()
            if (r1 != 0) goto L12
            r1 = 0
            goto L1a
        L12:
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r3)
            android.content.Intent r1 = (android.content.Intent) r1
        L1a:
            r2.<init>(r0, r1)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String resultCodeToString(int r1) {
            androidx.activity.result.ActivityResult$Companion r0 = androidx.activity.result.ActivityResult.Companion
            java.lang.String r0 = r0.resultCodeToString(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.content.Intent getData() {
            r1 = this;
            android.content.Intent r0 = r1.data
            return r0
    }

    public final int getResultCode() {
            r1 = this;
            int r0 = r1.resultCode
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ActivityResult{resultCode="
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.activity.result.ActivityResult$Companion r1 = androidx.activity.result.ActivityResult.Companion
            int r2 = r3.resultCode
            java.lang.String r1 = r1.resultCodeToString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.content.Intent r1 = r3.data
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.resultCode
            r2.writeInt(r0)
            android.content.Intent r0 = r1.data
            if (r0 != 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            r2.writeInt(r0)
            android.content.Intent r0 = r1.data
            if (r0 == 0) goto L1b
            r0.writeToParcel(r2, r3)
        L1b:
            return
    }
}
