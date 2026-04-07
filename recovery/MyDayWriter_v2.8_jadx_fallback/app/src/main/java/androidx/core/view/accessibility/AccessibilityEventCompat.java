package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityEventCompat {
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 1024;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 4096;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 2048;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;

    @java.lang.Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;

    @java.lang.Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 67108864;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;

    @java.lang.Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAccessibilityDataSensitive(android.view.accessibility.AccessibilityEvent r1) {
                boolean r0 = r1.isAccessibilityDataSensitive()
                return r0
        }

        static void setAccessibilityDataSensitive(android.view.accessibility.AccessibilityEvent r0, boolean r1) {
                r0.setAccessibilityDataSensitive(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }

    private AccessibilityEventCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "event.appendRecord(record)")
    @java.lang.Deprecated
    public static void appendRecord(android.view.accessibility.AccessibilityEvent r1, androidx.core.view.accessibility.AccessibilityRecordCompat r2) {
            java.lang.Object r0 = r2.getImpl()
            android.view.accessibility.AccessibilityRecord r0 = (android.view.accessibility.AccessibilityRecord) r0
            r1.appendRecord(r0)
            return
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat asRecord(android.view.accessibility.AccessibilityEvent r1) {
            androidx.core.view.accessibility.AccessibilityRecordCompat r0 = new androidx.core.view.accessibility.AccessibilityRecordCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "event.getAction()")
    @java.lang.Deprecated
    public static int getAction(android.view.accessibility.AccessibilityEvent r1) {
            int r0 = r1.getAction()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "event.getContentChangeTypes()")
    @java.lang.Deprecated
    public static int getContentChangeTypes(android.view.accessibility.AccessibilityEvent r1) {
            int r0 = r1.getContentChangeTypes()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "event.getMovementGranularity()")
    @java.lang.Deprecated
    public static int getMovementGranularity(android.view.accessibility.AccessibilityEvent r1) {
            int r0 = r1.getMovementGranularity()
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat getRecord(android.view.accessibility.AccessibilityEvent r2, int r3) {
            androidx.core.view.accessibility.AccessibilityRecordCompat r0 = new androidx.core.view.accessibility.AccessibilityRecordCompat
            android.view.accessibility.AccessibilityRecord r1 = r2.getRecord(r3)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "event.getRecordCount()")
    @java.lang.Deprecated
    public static int getRecordCount(android.view.accessibility.AccessibilityEvent r1) {
            int r0 = r1.getRecordCount()
            return r0
    }

    public static boolean isAccessibilityDataSensitive(android.view.accessibility.AccessibilityEvent r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.accessibility.AccessibilityEventCompat.Api34Impl.isAccessibilityDataSensitive(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void setAccessibilityDataSensitive(android.view.accessibility.AccessibilityEvent r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            androidx.core.view.accessibility.AccessibilityEventCompat.Api34Impl.setAccessibilityDataSensitive(r2, r3)
        L9:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "event.setAction(action)")
    @java.lang.Deprecated
    public static void setAction(android.view.accessibility.AccessibilityEvent r0, int r1) {
            r0.setAction(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "event.setContentChangeTypes(changeTypes)")
    @java.lang.Deprecated
    public static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent r0, int r1) {
            r0.setContentChangeTypes(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "event.setMovementGranularity(granularity)")
    @java.lang.Deprecated
    public static void setMovementGranularity(android.view.accessibility.AccessibilityEvent r0, int r1) {
            r0.setMovementGranularity(r1)
            return
    }
}
