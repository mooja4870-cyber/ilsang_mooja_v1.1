package androidx.activity;

/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\b\u0010\u0017\u001a\u00020\rH\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "touchX", "", "touchY", "progress", "swipeEdge", "", "frameTimeMillis", "", "<init>", "(FFFIJ)V", "backEvent", "Landroid/window/BackEvent;", "(Landroid/window/BackEvent;)V", "getTouchX", "()F", "getTouchY", "getProgress", "getSwipeEdge", "()I", "getFrameTimeMillis", "()J", "toBackEvent", "toString", "", "SwipeEdge", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackEventCompat {
    public static final androidx.activity.BackEventCompat.Companion Companion = null;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 2;
    public static final int EDGE_RIGHT = 1;
    private final long frameTimeMillis;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    /* JADX INFO: compiled from: BackEventCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/activity/BackEventCompat$Companion;", "", "<init>", "()V", "EDGE_LEFT", "", "EDGE_RIGHT", "EDGE_NONE", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    }

    /* JADX INFO: compiled from: BackEventCompat.kt */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface SwipeEdge {
    }

    static {
            androidx.activity.BackEventCompat$Companion r0 = new androidx.activity.BackEventCompat$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.BackEventCompat.Companion = r0
            return
    }

    public BackEventCompat(float r10, float r11, float r12, int r13) {
            r9 = this;
            r7 = 16
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public BackEventCompat(float r1, float r2, float r3, int r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.touchX = r1
            r0.touchY = r2
            r0.progress = r3
            r0.swipeEdge = r4
            r0.frameTimeMillis = r5
            return
    }

    public /* synthetic */ BackEventCompat(float r8, float r9, float r10, int r11, long r12, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            r7 = this;
            r14 = r14 & 16
            if (r14 == 0) goto L8
            r12 = 0
            r5 = r12
            goto L9
        L8:
            r5 = r12
        L9:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public BackEventCompat(android.window.BackEvent r9) {
            r8 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r2 = r0.touchX(r9)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r3 = r0.touchY(r9)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r4 = r0.progress(r9)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            int r5 = r0.swipeEdge(r9)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto L2c
            androidx.activity.Api36Impl r0 = androidx.activity.Api36Impl.INSTANCE
            long r0 = r0.frameTimeMillis(r9)
            r6 = r0
            goto L2f
        L2c:
            r0 = 0
            r6 = r0
        L2f:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public final long getFrameTimeMillis() {
            r2 = this;
            long r0 = r2.frameTimeMillis
            return r0
    }

    public final float getProgress() {
            r1 = this;
            float r0 = r1.progress
            return r0
    }

    public final int getSwipeEdge() {
            r1 = this;
            int r0 = r1.swipeEdge
            return r0
    }

    public final float getTouchX() {
            r1 = this;
            float r0 = r1.touchX
            return r0
    }

    public final float getTouchY() {
            r1 = this;
            float r0 = r1.touchY
            return r0
    }

    public final android.window.BackEvent toBackEvent() {
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto L17
            androidx.activity.Api36Impl r2 = androidx.activity.Api36Impl.INSTANCE
            float r3 = r9.touchX
            float r4 = r9.touchY
            float r5 = r9.progress
            int r6 = r9.swipeEdge
            long r7 = r9.frameTimeMillis
            android.window.BackEvent r0 = r2.createOnBackEvent(r3, r4, r5, r6, r7)
            goto L25
        L17:
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r1 = r9.touchX
            float r2 = r9.touchY
            float r3 = r9.progress
            int r4 = r9.swipeEdge
            android.window.BackEvent r0 = r0.createOnBackEvent(r1, r2, r3, r4)
        L25:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BackEventCompat{touchX="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.touchX
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", touchY="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.touchY
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", progress="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.progress
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.swipeEdge
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", frameTimeMillis="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.frameTimeMillis
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
