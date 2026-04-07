package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HapticFeedbackFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HapticFeedbackType {
    }

    private HapticFeedbackConstantsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getFeedbackConstantOrFallback(int r2) {
            r0 = -1
            if (r2 != r0) goto L4
            return r0
        L4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L14
            switch(r2) {
                case 21: goto L12;
                case 22: goto L10;
                case 23: goto L12;
                case 24: goto L10;
                case 25: goto Le;
                case 26: goto L12;
                case 27: goto L10;
                default: goto Ld;
            }
        Ld:
            goto L14
        Le:
            r2 = 0
            goto L14
        L10:
            r2 = 4
            goto L14
        L12:
            r2 = 6
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L24
            switch(r2) {
                case 12: goto L22;
                case 13: goto L20;
                case 14: goto L1d;
                case 15: goto L1d;
                case 16: goto L22;
                case 17: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L24
        L1e:
            r2 = 0
            goto L24
        L20:
            r2 = 6
            goto L24
        L22:
            r2 = 1
        L24:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 >= r1) goto L2f
            switch(r2) {
                case 7: goto L2e;
                case 8: goto L2e;
                case 9: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L2f
        L2e:
            r2 = -1
        L2f:
            return r2
    }
}
