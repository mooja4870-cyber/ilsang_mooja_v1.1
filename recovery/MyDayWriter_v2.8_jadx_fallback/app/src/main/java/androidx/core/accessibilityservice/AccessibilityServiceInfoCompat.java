package androidx.core.accessibilityservice;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String capabilityToString(int r1) {
            switch(r1) {
                case 1: goto Lf;
                case 2: goto Lc;
                case 4: goto L9;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "CAPABILITY_CAN_FILTER_KEY_EVENTS"
            return r0
        L9:
            java.lang.String r0 = "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
            return r0
        Lc:
            java.lang.String r0 = "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION"
            return r0
        Lf:
            java.lang.String r0 = "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT"
            return r0
    }

    public static java.lang.String feedbackTypeToString(int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
        La:
            if (r4 <= 0) goto L43
            int r1 = java.lang.Integer.numberOfTrailingZeros(r4)
            r2 = 1
            int r1 = r2 << r1
            int r3 = ~r1
            r4 = r4 & r3
            int r3 = r0.length()
            if (r3 <= r2) goto L20
            java.lang.String r2 = ", "
            r0.append(r2)
        L20:
            switch(r1) {
                case 1: goto L3c;
                case 2: goto L36;
                case 4: goto L30;
                case 8: goto L2a;
                case 16: goto L24;
                default: goto L23;
            }
        L23:
            goto L42
        L24:
            java.lang.String r2 = "FEEDBACK_GENERIC"
            r0.append(r2)
            goto L42
        L2a:
            java.lang.String r2 = "FEEDBACK_VISUAL"
            r0.append(r2)
            goto L42
        L30:
            java.lang.String r2 = "FEEDBACK_AUDIBLE"
            r0.append(r2)
            goto L42
        L36:
            java.lang.String r2 = "FEEDBACK_HAPTIC"
            r0.append(r2)
            goto L42
        L3c:
            java.lang.String r2 = "FEEDBACK_SPOKEN"
            r0.append(r2)
        L42:
            goto La
        L43:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String flagToString(int r1) {
            switch(r1) {
                case 1: goto L14;
                case 2: goto L11;
                case 4: goto Le;
                case 8: goto Lb;
                case 16: goto L8;
                case 32: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            java.lang.String r0 = "FLAG_REQUEST_FILTER_KEY_EVENTS"
            return r0
        L8:
            java.lang.String r0 = "FLAG_REPORT_VIEW_IDS"
            return r0
        Lb:
            java.lang.String r0 = "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
            return r0
        Le:
            java.lang.String r0 = "FLAG_REQUEST_TOUCH_EXPLORATION_MODE"
            return r0
        L11:
            java.lang.String r0 = "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS"
            return r0
        L14:
            java.lang.String r0 = "DEFAULT"
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "info.getCapabilities()")
    @java.lang.Deprecated
    public static int getCapabilities(android.accessibilityservice.AccessibilityServiceInfo r1) {
            int r0 = r1.getCapabilities()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "info.loadDescription(packageManager)")
    @java.lang.Deprecated
    public static java.lang.String loadDescription(android.accessibilityservice.AccessibilityServiceInfo r1, android.content.pm.PackageManager r2) {
            java.lang.String r0 = r1.loadDescription(r2)
            return r0
    }
}
