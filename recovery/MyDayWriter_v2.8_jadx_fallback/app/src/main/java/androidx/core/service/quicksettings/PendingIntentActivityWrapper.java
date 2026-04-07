package androidx.core.service.quicksettings;

/* JADX INFO: loaded from: classes.dex */
public class PendingIntentActivityWrapper {
    private final android.content.Context mContext;
    private final int mFlags;
    private final android.content.Intent mIntent;
    private final boolean mIsMutable;
    private final android.os.Bundle mOptions;
    private final android.app.PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(android.content.Context r2, int r3, android.content.Intent r4, int r5, android.os.Bundle r6, boolean r7) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
            r1.mRequestCode = r3
            r1.mIntent = r4
            r1.mFlags = r5
            r1.mOptions = r6
            r1.mIsMutable = r7
            android.app.PendingIntent r0 = r1.createPendingIntent()
            r1.mPendingIntent = r0
            return
    }

    public PendingIntentActivityWrapper(android.content.Context r8, int r9, android.content.Intent r10, int r11, boolean r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private android.app.PendingIntent createPendingIntent() {
            r7 = this;
            android.os.Bundle r0 = r7.mOptions
            if (r0 != 0) goto L13
            android.content.Context r0 = r7.mContext
            int r1 = r7.mRequestCode
            android.content.Intent r2 = r7.mIntent
            int r3 = r7.mFlags
            boolean r4 = r7.mIsMutable
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.getActivity(r0, r1, r2, r3, r4)
            return r0
        L13:
            android.content.Context r1 = r7.mContext
            int r2 = r7.mRequestCode
            android.content.Intent r3 = r7.mIntent
            int r4 = r7.mFlags
            android.os.Bundle r5 = r7.mOptions
            boolean r6 = r7.mIsMutable
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.getActivity(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }

    public android.os.Bundle getOptions() {
            r1 = this;
            android.os.Bundle r0 = r1.mOptions
            return r0
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mPendingIntent
            return r0
    }

    public int getRequestCode() {
            r1 = this;
            int r0 = r1.mRequestCode
            return r0
    }

    public boolean isMutable() {
            r1 = this;
            boolean r0 = r1.mIsMutable
            return r0
    }
}
