package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final java.lang.String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final java.lang.String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_DATA_SENSITIVE = 64;
    private static final int BOOLEAN_PROPERTY_HAS_REQUEST_INITIAL_ACCESSIBILITY_FOCUS = 32;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
    private static final java.lang.String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
    private static final int BOOLEAN_PROPERTY_SUPPORTS_GRANULAR_SCROLLING = 67108864;
    private static final int BOOLEAN_PROPERTY_TEXT_SELECTABLE = 8388608;
    private static final java.lang.String BOUNDS_IN_WINDOW_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
    private static final java.lang.String CHECKED_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY";
    private static final java.lang.String CONTAINER_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
    private static final java.lang.String EXPANDED_STATE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final java.lang.String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    private static final java.lang.String IS_REQUIRED_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY";
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    private static final java.lang.String MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private static final java.lang.String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    private static final java.lang.String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private static final java.lang.String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final java.lang.String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final java.lang.String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final java.lang.String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final java.lang.String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final java.lang.String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final java.lang.String SUPPLEMENTAL_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY";
    private static final java.lang.String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private static final java.lang.String UNIQUE_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    private static int sClickableSpanId;
    private final android.view.accessibility.AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId;
    private int mVirtualDescendantId;

    public static class AccessibilityActionCompat {
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_SELECTION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COLLAPSE = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CONTEXT_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COPY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CUT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DISMISS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_CANCEL = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_DROP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_START = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_EXPAND = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_FOCUS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_HIDE_TOOLTIP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_IME_ENTER = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_LONG_CLICK = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_MOVE_WINDOW = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_DOWN = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_LEFT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_RIGHT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_UP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PASTE = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PRESS_AND_HOLD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_BACKWARD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_DOWN = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_FORWARD = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_LEFT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_RIGHT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_TO_POSITION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_UP = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SELECT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_PROGRESS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_SELECTION = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_TEXT = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_ON_SCREEN = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS = null;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TOOLTIP = null;
        private static final java.lang.String TAG = "A11yActionCompat";
        final java.lang.Object mAction;
        protected final androidx.core.view.accessibility.AccessibilityViewCommand mCommand;
        private final int mId;
        private final java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;

        static {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 1
                r2 = 0
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 2
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 4
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SELECT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 8
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_SELECTION = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 16
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1 = 32
                r0.<init>(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 64
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 128(0x80, float:1.8E-43)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 256(0x100, float:3.59E-43)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveAtGranularityArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 512(0x200, float:7.17E-43)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveAtGranularityArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 1024(0x400, float:1.435E-42)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveHtmlArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveHtmlArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_NEXT_HTML_ELEMENT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 2048(0x800, float:2.87E-42)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveHtmlArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveHtmlArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PREVIOUS_HTML_ELEMENT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 4096(0x1000, float:5.74E-42)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 8192(0x2000, float:1.148E-41)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 16384(0x4000, float:2.2959E-41)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COPY = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 32768(0x8000, float:4.5918E-41)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PASTE = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 65536(0x10000, float:9.1835E-41)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CUT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 131072(0x20000, float:1.83671E-40)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetSelectionArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.SetSelectionArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_SELECTION = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 262144(0x40000, float:3.67342E-40)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 524288(0x80000, float:7.34684E-40)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 1048576(0x100000, float:1.469368E-39)
                r0.<init>(r3, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r3 = 2097152(0x200000, float:2.938736E-39)
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetTextArguments> r4 = androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments.class
                r0.<init>(r3, r2, r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_TEXT = r0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r6 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN
                r9 = 0
                r10 = 0
                r7 = 16908342(0x1020036, float:2.387738E-38)
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_ON_SCREEN = r5
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r7 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION
                r10 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$ScrollToPositionArguments> r11 = androidx.core.view.accessibility.AccessibilityViewCommand.ScrollToPositionArguments.class
                r8 = 16908343(0x1020037, float:2.3877383E-38)
                r9 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION = r6
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r7 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r8 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP
                r11 = 0
                r12 = 0
                r9 = 16908344(0x1020038, float:2.3877386E-38)
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP = r7
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r9 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT
                r12 = 0
                r13 = 0
                r10 = 16908345(0x1020039, float:2.387739E-38)
                r11 = 0
                r8.<init>(r9, r10, r11, r12, r13)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT = r8
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r9 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r10 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN
                r13 = 0
                r14 = 0
                r11 = 16908346(0x102003a, float:2.3877392E-38)
                r12 = 0
                r9.<init>(r10, r11, r12, r13, r14)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN = r9
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT
                r7 = 0
                r8 = 0
                r5 = 16908347(0x102003b, float:2.3877394E-38)
                r6 = 0
                r3.<init>(r4, r5, r6, r7, r8)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT = r3
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 29
                if (r0 < r3) goto L13e
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP
                r5 = r0
                goto L13f
            L13e:
                r5 = r2
            L13f:
                r8 = 0
                r9 = 0
                r6 = 16908358(0x1020046, float:2.3877425E-38)
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_UP = r4
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L154
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN
                r6 = r0
                goto L155
            L154:
                r6 = r2
            L155:
                r9 = 0
                r10 = 0
                r7 = 16908359(0x1020047, float:2.3877428E-38)
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_DOWN = r5
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L16a
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT
                r7 = r0
                goto L16b
            L16a:
                r7 = r2
            L16b:
                r10 = 0
                r11 = 0
                r8 = 16908360(0x1020048, float:2.387743E-38)
                r9 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_LEFT = r6
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r7 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L180
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT
                r8 = r0
                goto L181
            L180:
                r8 = r2
            L181:
                r11 = 0
                r12 = 0
                r9 = 16908361(0x1020049, float:2.3877434E-38)
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PAGE_RIGHT = r7
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r9 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK
                r12 = 0
                r13 = 0
                r10 = 16908348(0x102003c, float:2.3877397E-38)
                r11 = 0
                r8.<init>(r9, r10, r11, r12, r13)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CONTEXT_CLICK = r8
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r9 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r10 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS
                r13 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$SetProgressArguments> r14 = androidx.core.view.accessibility.AccessibilityViewCommand.SetProgressArguments.class
                r11 = 16908349(0x102003d, float:2.38774E-38)
                r12 = 0
                r9.<init>(r10, r11, r12, r13, r14)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS = r9
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r4 = 26
                if (r0 < r4) goto L1b9
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW
                r4 = r0
                goto L1ba
            L1b9:
                r4 = r2
            L1ba:
                r7 = 0
                java.lang.Class<androidx.core.view.accessibility.AccessibilityViewCommand$MoveWindowArguments> r8 = androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments.class
                r5 = 16908354(0x1020042, float:2.3877414E-38)
                r6 = 0
                r3.<init>(r4, r5, r6, r7, r8)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_MOVE_WINDOW = r3
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 28
                if (r0 < r3) goto L1d2
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP
                r5 = r0
                goto L1d3
            L1d2:
                r5 = r2
            L1d3:
                r8 = 0
                r9 = 0
                r6 = 16908356(0x1020044, float:2.387742E-38)
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_TOOLTIP = r4
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L1e8
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP
                r6 = r0
                goto L1e9
            L1e8:
                r6 = r2
            L1e9:
                r9 = 0
                r10 = 0
                r7 = 16908357(0x1020045, float:2.3877422E-38)
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_HIDE_TOOLTIP = r5
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L200
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD
                r7 = r0
                goto L201
            L200:
                r7 = r2
            L201:
                r10 = 0
                r11 = 0
                r8 = 16908362(0x102004a, float:2.3877436E-38)
                r9 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_PRESS_AND_HOLD = r6
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r7 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L216
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER
                r8 = r0
                goto L217
            L216:
                r8 = r2
            L217:
                r11 = 0
                r12 = 0
                r9 = 16908372(0x1020054, float:2.3877464E-38)
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_IME_ENTER = r7
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r1) goto L22c
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START
                r9 = r0
                goto L22d
            L22c:
                r9 = r2
            L22d:
                r12 = 0
                r13 = 0
                r10 = 16908373(0x1020055, float:2.3877467E-38)
                r11 = 0
                r8.<init>(r9, r10, r11, r12, r13)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_START = r8
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r9 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r1) goto L242
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP
                r10 = r0
                goto L243
            L242:
                r10 = r2
            L243:
                r13 = 0
                r14 = 0
                r11 = 16908374(0x1020056, float:2.387747E-38)
                r12 = 0
                r9.<init>(r10, r11, r12, r13, r14)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_DROP = r9
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r1) goto L258
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL
                r4 = r0
                goto L259
            L258:
                r4 = r2
            L259:
                r7 = 0
                r8 = 0
                r5 = 16908375(0x1020057, float:2.3877473E-38)
                r6 = 0
                r3.<init>(r4, r5, r6, r7, r8)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DRAG_CANCEL = r3
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 < r1) goto L270
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS
                r5 = r0
                goto L271
            L270:
                r5 = r2
            L271:
                r8 = 0
                r9 = 0
                r6 = 16908376(0x1020058, float:2.3877476E-38)
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SHOW_TEXT_SUGGESTIONS = r4
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 < r1) goto L288
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getActionScrollInDirection()
            L288:
                r6 = r2
                r9 = 0
                r10 = 0
                r7 = 16908382(0x102005e, float:2.3877492E-38)
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION = r5
                return
        }

        public AccessibilityActionCompat(int r7, java.lang.CharSequence r8) {
                r6 = this;
                r4 = 0
                r5 = 0
                r1 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public AccessibilityActionCompat(int r7, java.lang.CharSequence r8, androidx.core.view.accessibility.AccessibilityViewCommand r9) {
                r6 = this;
                r1 = 0
                r5 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private AccessibilityActionCompat(int r7, java.lang.CharSequence r8, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> r9) {
                r6 = this;
                r1 = 0
                r4 = 0
                r0 = r6
                r2 = r7
                r3 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        AccessibilityActionCompat(java.lang.Object r7) {
                r6 = this;
                r4 = 0
                r5 = 0
                r2 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        AccessibilityActionCompat(java.lang.Object r2, int r3, java.lang.CharSequence r4, androidx.core.view.accessibility.AccessibilityViewCommand r5, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> r6) {
                r1 = this;
                r1.<init>()
                r1.mId = r3
                r1.mCommand = r5
                if (r2 != 0) goto L11
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
                r0.<init>(r3, r4)
                r1.mAction = r0
                goto L13
            L11:
                r1.mAction = r2
            L13:
                r1.mViewCommandArgumentClass = r6
                return
        }

        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat createReplacementAction(java.lang.CharSequence r7, androidx.core.view.accessibility.AccessibilityViewCommand r8) {
                r6 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                int r2 = r6.mId
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r5 = r6.mViewCommandArgumentClass
                r1 = 0
                r3 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat
                if (r1 != 0) goto L9
                return r0
            L9:
                r1 = r5
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r1
                java.lang.Object r2 = r4.mAction
                if (r2 != 0) goto L15
                java.lang.Object r2 = r1.mAction
                if (r2 == 0) goto L20
                return r0
            L15:
                java.lang.Object r2 = r4.mAction
                java.lang.Object r3 = r1.mAction
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r0
            L20:
                r0 = 1
                return r0
        }

        public int getId() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
                int r0 = r0.getId()
                return r0
        }

        public java.lang.CharSequence getLabel() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
                java.lang.CharSequence r0 = r0.getLabel()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.mAction
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r1.mAction
                int r0 = r0.hashCode()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        public boolean perform(android.view.View r6, android.os.Bundle r7) {
                r5 = this;
                androidx.core.view.accessibility.AccessibilityViewCommand r0 = r5.mCommand
                r1 = 0
                if (r0 == 0) goto L4c
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r5.mViewCommandArgumentClass
                if (r2 == 0) goto L45
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r5.mViewCommandArgumentClass     // Catch: java.lang.Exception -> L1f
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L1f
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L1f
                androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments r1 = (androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments) r1     // Catch: java.lang.Exception -> L1f
                r0 = r1
                r0.setBundle(r7)     // Catch: java.lang.Exception -> L1f
                goto L45
            L1f:
                r1 = move-exception
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r5.mViewCommandArgumentClass
                if (r2 != 0) goto L27
                java.lang.String r2 = "null"
                goto L2d
            L27:
                java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r5.mViewCommandArgumentClass
                java.lang.String r2 = r2.getName()
            L2d:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to execute command with argument class ViewCommandArgument: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "A11yActionCompat"
                android.util.Log.e(r4, r3, r1)
            L45:
                androidx.core.view.accessibility.AccessibilityViewCommand r1 = r5.mCommand
                boolean r1 = r1.perform(r6, r0)
                return r1
            L4c:
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AccessibilityActionCompat: "
                r0.append(r1)
                int r1 = r3.mId
                java.lang.String r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getActionSymbolicName(r1)
                java.lang.String r2 = "ACTION_UNKNOWN"
                boolean r2 = r1.equals(r2)
                if (r2 == 0) goto L26
                java.lang.CharSequence r2 = r3.getLabel()
                if (r2 == 0) goto L26
                java.lang.CharSequence r2 = r3.getLabel()
                java.lang.String r1 = r2.toString()
            L26:
                r0.append(r1)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object createRangeInfo(int r1, float r2, float r3, float r4) {
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = new android.view.accessibility.AccessibilityNodeInfo$RangeInfo
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public static java.lang.CharSequence getStateDescription(android.view.accessibility.AccessibilityNodeInfo r1) {
                java.lang.CharSequence r0 = r1.getStateDescription()
                return r0
        }

        public static void setStateDescription(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat buildCollectionItemInfoCompat(boolean r2, int r3, int r4, int r5, int r6, boolean r7, java.lang.String r8, java.lang.String r9) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = new android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder
                r1.<init>()
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setHeading(r2)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setColumnIndex(r3)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setRowIndex(r4)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setColumnSpan(r5)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setRowSpan(r6)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setSelected(r7)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setRowTitle(r8)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder r1 = r1.setColumnTitle(r9)
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(android.view.accessibility.AccessibilityNodeInfo r1, int r2, int r3) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r1.getChild(r2, r3)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
                return r0
        }

        public static java.lang.String getCollectionItemColumnTitle(java.lang.Object r1) {
                r0 = r1
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                java.lang.String r0 = r0.getColumnTitle()
                return r0
        }

        public static java.lang.String getCollectionItemRowTitle(java.lang.Object r1) {
                r0 = r1
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                java.lang.String r0 = r0.getRowTitle()
                return r0
        }

        public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
                android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo r0 = r1.getExtraRenderingInfo()
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent(android.view.accessibility.AccessibilityNodeInfo r1, int r2) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
                return r0
        }

        public static java.lang.String getUniqueId(android.view.accessibility.AccessibilityNodeInfo r1) {
                java.lang.String r0 = r1.getUniqueId()
                return r0
        }

        public static boolean isTextSelectable(android.view.accessibility.AccessibilityNodeInfo r1) {
                boolean r0 = r1.isTextSelectable()
                return r0
        }

        public static void setTextSelectable(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
                r0.setTextSelectable(r1)
                return
        }

        public static void setUniqueId(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.String r1) {
                r0.setUniqueId(r1)
                return
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
                android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION
                return r0
        }

        public static void getBoundsInWindow(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
                r0.getBoundsInWindow(r1)
                return
        }

        public static java.lang.CharSequence getContainerTitle(android.view.accessibility.AccessibilityNodeInfo r1) {
                java.lang.CharSequence r0 = r1.getContainerTitle()
                return r0
        }

        public static long getMinDurationBetweenContentChangeMillis(android.view.accessibility.AccessibilityNodeInfo r2) {
                java.time.Duration r0 = r2.getMinDurationBetweenContentChanges()
                long r0 = r0.toMillis()
                return r0
        }

        public static boolean hasRequestInitialAccessibilityFocus(android.view.accessibility.AccessibilityNodeInfo r1) {
                boolean r0 = r1.hasRequestInitialAccessibilityFocus()
                return r0
        }

        public static boolean isAccessibilityDataSensitive(android.view.accessibility.AccessibilityNodeInfo r1) {
                boolean r0 = r1.isAccessibilityDataSensitive()
                return r0
        }

        public static void setAccessibilityDataSensitive(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
                r0.setAccessibilityDataSensitive(r1)
                return
        }

        public static void setBoundsInWindow(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
                r0.setBoundsInWindow(r1)
                return
        }

        public static void setContainerTitle(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
                r0.setContainerTitle(r1)
                return
        }

        public static void setMinDurationBetweenContentChangeMillis(android.view.accessibility.AccessibilityNodeInfo r1, long r2) {
                java.time.Duration r0 = java.time.Duration.ofMillis(r2)
                r1.setMinDurationBetweenContentChanges(r0)
                return
        }

        public static void setQueryFromAppProcessEnabled(android.view.accessibility.AccessibilityNodeInfo r0, android.view.View r1, boolean r2) {
                r0.setQueryFromAppProcessEnabled(r1, r2)
                return
        }

        public static void setRequestInitialAccessibilityFocus(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
                r0.setRequestInitialAccessibilityFocus(r1)
                return
        }
    }

    private static class Api35Impl {
        private Api35Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat buildCollectionInfoCompat(int r2, int r3, boolean r4, int r5, int r6, int r7) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = new android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder
                r1.<init>()
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setRowCount(r2)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setColumnCount(r3)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setHierarchical(r4)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setSelectionMode(r5)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setItemCount(r6)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo$Builder r1 = r1.setImportantForAccessibilityItemCount(r7)
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        public static int getImportantForAccessibilityItemCount(java.lang.Object r1) {
                r0 = r1
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getImportantForAccessibilityItemCount()
                return r0
        }

        public static int getItemCount(java.lang.Object r1) {
                r0 = r1
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getItemCount()
                return r0
        }
    }

    private static class Api36Impl {
        private Api36Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int access$000(android.view.accessibility.AccessibilityNodeInfo r1) {
                int r0 = getChecked(r1)
                return r0
        }

        static /* synthetic */ void access$100(android.view.accessibility.AccessibilityNodeInfo r0, int r1) {
                setChecked(r0, r1)
                return
        }

        static /* synthetic */ void access$200(android.view.accessibility.AccessibilityNodeInfo r0, android.view.View r1, int r2) {
                addLabeledBy(r0, r1, r2)
                return
        }

        static /* synthetic */ java.util.List access$300(android.view.accessibility.AccessibilityNodeInfo r1) {
                java.util.List r0 = getLabeledByList(r1)
                return r0
        }

        static /* synthetic */ boolean access$400(android.view.accessibility.AccessibilityNodeInfo r1, android.view.View r2, int r3) {
                boolean r0 = removeLabeledBy(r1, r2, r3)
                return r0
        }

        private static void addLabeledBy(android.view.accessibility.AccessibilityNodeInfo r0, android.view.View r1, int r2) {
                r0.addLabeledBy(r1, r2)
                return
        }

        private static int getChecked(android.view.accessibility.AccessibilityNodeInfo r1) {
                int r0 = r1.getChecked()
                return r0
        }

        public static int getExpandedState(android.view.accessibility.AccessibilityNodeInfo r1) {
                int r0 = r1.getExpandedState()
                return r0
        }

        private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getLabeledByList(android.view.accessibility.AccessibilityNodeInfo r5) {
                java.util.List r0 = r5.getLabeledByList()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r2 = r0.iterator()
            L11:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L25
                java.lang.Object r3 = r2.next()
                android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r3)
                r1.add(r4)
                goto L11
            L25:
                return r1
        }

        public static java.lang.CharSequence getSupplementalDescription(android.view.accessibility.AccessibilityNodeInfo r1) {
                java.lang.CharSequence r0 = r1.getSupplementalDescription()
                return r0
        }

        public static boolean isFieldRequired(android.view.accessibility.AccessibilityNodeInfo r1) {
                boolean r0 = r1.isFieldRequired()
                return r0
        }

        private static boolean removeLabeledBy(android.view.accessibility.AccessibilityNodeInfo r1, android.view.View r2, int r3) {
                boolean r0 = r1.removeLabeledBy(r2, r3)
                return r0
        }

        private static void setChecked(android.view.accessibility.AccessibilityNodeInfo r0, int r1) {
                r0.setChecked(r1)
                return
        }

        public static void setExpandedState(android.view.accessibility.AccessibilityNodeInfo r0, int r1) {
                r0.setExpandedState(r1)
                return
        }

        public static void setFieldRequired(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
                r0.setFieldRequired(r1)
                return
        }

        public static void setSupplementalDescription(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
                r0.setSupplementalDescription(r1)
                return
        }
    }

    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int UNDEFINED = -1;
        final java.lang.Object mInfo;

        public static final class Builder {
            private int mColumnCount;
            private boolean mHierarchical;
            private int mImportantForAccessibilityItemCount;
            private int mItemCount;
            private int mRowCount;
            private int mSelectionMode;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.mRowCount = r0
                    r1.mColumnCount = r0
                    r1.mHierarchical = r0
                    r0 = -1
                    r1.mItemCount = r0
                    r1.mImportantForAccessibilityItemCount = r0
                    return
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat build() {
                    r8 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 35
                    if (r0 < r1) goto L17
                    int r2 = r8.mRowCount
                    int r3 = r8.mColumnCount
                    boolean r4 = r8.mHierarchical
                    int r5 = r8.mSelectionMode
                    int r6 = r8.mItemCount
                    int r7 = r8.mImportantForAccessibilityItemCount
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.buildCollectionInfoCompat(r2, r3, r4, r5, r6, r7)
                    return r0
                L17:
                    int r0 = r8.mRowCount
                    int r1 = r8.mColumnCount
                    boolean r2 = r8.mHierarchical
                    int r3 = r8.mSelectionMode
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r1, r2, r3)
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setColumnCount(int r1) {
                    r0 = this;
                    r0.mColumnCount = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setHierarchical(boolean r1) {
                    r0 = this;
                    r0.mHierarchical = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setImportantForAccessibilityItemCount(int r1) {
                    r0 = this;
                    r0.mImportantForAccessibilityItemCount = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setItemCount(int r1) {
                    r0 = this;
                    r0.mItemCount = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setRowCount(int r1) {
                    r0 = this;
                    r0.mRowCount = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setSelectionMode(int r1) {
                    r0 = this;
                    r0.mSelectionMode = r1
                    return r0
            }
        }

        CollectionInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int r2, int r3, boolean r4) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, r4)
                r0.<init>(r1)
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int r2, int r3, boolean r4, int r5) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r3, r4, r5)
                r0.<init>(r1)
                return r0
        }

        public int getColumnCount() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getColumnCount()
                return r0
        }

        public int getImportantForAccessibilityItemCount() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 35
                if (r0 < r1) goto Ld
                java.lang.Object r0 = r2.mInfo
                int r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.getImportantForAccessibilityItemCount(r0)
                return r0
            Ld:
                r0 = -1
                return r0
        }

        public int getItemCount() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 35
                if (r0 < r1) goto Ld
                java.lang.Object r0 = r2.mInfo
                int r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.getItemCount(r0)
                return r0
            Ld:
                r0 = -1
                return r0
        }

        public int getRowCount() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getRowCount()
                return r0
        }

        public int getSelectionMode() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                int r0 = r0.getSelectionMode()
                return r0
        }

        public boolean isHierarchical() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
                boolean r0 = r0.isHierarchical()
                return r0
        }
    }

    public static class CollectionItemInfoCompat {
        final java.lang.Object mInfo;

        public static final class Builder {
            private int mColumnIndex;
            private int mColumnSpan;
            private java.lang.String mColumnTitle;
            private boolean mHeading;
            private int mRowIndex;
            private int mRowSpan;
            private java.lang.String mRowTitle;
            private boolean mSelected;

            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat build() {
                    r10 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 33
                    if (r0 < r1) goto L1b
                    boolean r2 = r10.mHeading
                    int r3 = r10.mColumnIndex
                    int r4 = r10.mRowIndex
                    int r5 = r10.mColumnSpan
                    int r6 = r10.mRowSpan
                    boolean r7 = r10.mSelected
                    java.lang.String r8 = r10.mRowTitle
                    java.lang.String r9 = r10.mColumnTitle
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.buildCollectionItemInfoCompat(r2, r3, r4, r5, r6, r7, r8, r9)
                    return r0
                L1b:
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                    int r1 = r10.mRowIndex
                    int r2 = r10.mRowSpan
                    int r3 = r10.mColumnIndex
                    int r4 = r10.mColumnSpan
                    boolean r5 = r10.mHeading
                    boolean r6 = r10.mSelected
                    android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
                    r0.<init>(r1)
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnIndex(int r1) {
                    r0 = this;
                    r0.mColumnIndex = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnSpan(int r1) {
                    r0 = this;
                    r0.mColumnSpan = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnTitle(java.lang.String r1) {
                    r0 = this;
                    r0.mColumnTitle = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setHeading(boolean r1) {
                    r0 = this;
                    r0.mHeading = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowIndex(int r1) {
                    r0 = this;
                    r0.mRowIndex = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowSpan(int r1) {
                    r0 = this;
                    r0.mRowSpan = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowTitle(java.lang.String r1) {
                    r0 = this;
                    r0.mRowTitle = r1
                    return r0
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setSelected(boolean r1) {
                    r0 = this;
                    r0.mSelected = r1
                    return r0
            }
        }

        CollectionItemInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int r2, int r3, int r4, int r5, boolean r6) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6)
                r0.<init>(r1)
                return r0
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int r2, int r3, int r4, int r5, boolean r6, boolean r7) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
                r0.<init>(r1)
                return r0
        }

        public int getColumnIndex() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getColumnIndex()
                return r0
        }

        public int getColumnSpan() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getColumnSpan()
                return r0
        }

        public java.lang.String getColumnTitle() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 < r1) goto Ld
                java.lang.Object r0 = r2.mInfo
                java.lang.String r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getCollectionItemColumnTitle(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public int getRowIndex() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getRowIndex()
                return r0
        }

        public int getRowSpan() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                int r0 = r0.getRowSpan()
                return r0
        }

        public java.lang.String getRowTitle() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 < r1) goto Ld
                java.lang.Object r0 = r2.mInfo
                java.lang.String r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getCollectionItemRowTitle(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @java.lang.Deprecated
        public boolean isHeading() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                boolean r0 = r0.isHeading()
                return r0
        }

        public boolean isSelected() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
                boolean r0 = r0.isSelected()
                return r0
        }
    }

    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        final java.lang.Object mInfo;

        public RangeInfoCompat(int r3, float r4, float r5, float r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L10
                java.lang.Object r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.createRangeInfo(r3, r4, r5, r6)
                r2.mInfo = r0
                goto L16
            L10:
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r3, r4, r5, r6)
                r2.mInfo = r0
            L16:
                return
        }

        RangeInfoCompat(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat obtain(int r2, float r3, float r4, float r5) {
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r2, r3, r4, r5)
                r0.<init>(r1)
                return r0
        }

        public float getCurrent() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getCurrent()
                return r0
        }

        public float getMax() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getMax()
                return r0
        }

        public float getMin() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                float r0 = r0.getMin()
                return r0
        }

        public int getType() {
                r1 = this;
                java.lang.Object r0 = r1.mInfo
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r0
                int r0 = r0.getType()
                return r0
        }
    }

    public static final class TouchDelegateInfoCompat {
        final android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo mInfo;

        TouchDelegateInfoCompat(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo r1) {
                r0 = this;
                r0.<init>()
                r0.mInfo = r1
                return
        }

        public TouchDelegateInfoCompat(java.util.Map<android.graphics.Region, android.view.View> r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L11
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = new android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo
                r0.<init>(r3)
                r2.mInfo = r0
                goto L14
            L11:
                r0 = 0
                r2.mInfo = r0
            L14:
                return
        }

        public android.graphics.Region getRegionAt(int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto Ld
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                android.graphics.Region r0 = r0.getRegionAt(r3)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public int getRegionCount() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto Ld
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                int r0 = r0.getRegionCount()
                return r0
            Ld:
                r0 = 0
                return r0
        }

        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTargetForRegion(android.graphics.Region r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.mInfo
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getTargetForRegion(r3)
                if (r0 == 0) goto L13
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r0)
                return r1
            L13:
                r0 = 0
                return r0
        }
    }

    static {
            r0 = 0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.sClickableSpanId = r0
            return
    }

    private AccessibilityNodeInfoCompat(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            r1.mVirtualDescendantId = r0
            r1.mInfo = r2
            return
    }

    @java.lang.Deprecated
    public AccessibilityNodeInfoCompat(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            r1.mVirtualDescendantId = r0
            r0 = r2
            android.view.accessibility.AccessibilityNodeInfo r0 = (android.view.accessibility.AccessibilityNodeInfo) r0
            r1.mInfo = r0
            return
    }

    private void addSpanLocationToExtras(android.text.style.ClickableSpan r3, android.text.Spanned r4, int r5) {
            r2 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r1 = r4.getSpanStart(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r1 = r4.getSpanEnd(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            int r1 = r4.getSpanFlags(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.List r0 = r2.extrasIntList(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            return
    }

    private void clearExtrasSpans() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            r0.remove(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            r0.remove(r1)
            return
    }

    private java.util.List<java.lang.Integer> extrasIntList(java.lang.String r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.util.ArrayList r0 = r0.getIntegerArrayList(r3)
            if (r0 != 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.mInfo
            android.os.Bundle r1 = r1.getExtras()
            r1.putIntegerArrayList(r3, r0)
        L1b:
            return r0
    }

    static java.lang.String getActionSymbolicName(int r1) {
            switch(r1) {
                case 1: goto L81;
                case 2: goto L7e;
                case 4: goto L7b;
                case 8: goto L78;
                case 16: goto L75;
                case 32: goto L72;
                case 64: goto L6f;
                case 128: goto L6c;
                case 256: goto L69;
                case 512: goto L66;
                case 1024: goto L63;
                case 2048: goto L60;
                case 4096: goto L5d;
                case 8192: goto L5a;
                case 16384: goto L57;
                case 32768: goto L54;
                case 65536: goto L51;
                case 131072: goto L4e;
                case 262144: goto L4b;
                case 524288: goto L48;
                case 2097152: goto L45;
                case 16908342: goto L42;
                case 16908343: goto L3f;
                case 16908344: goto L3c;
                case 16908345: goto L39;
                case 16908346: goto L36;
                case 16908347: goto L33;
                case 16908348: goto L30;
                case 16908349: goto L2d;
                case 16908354: goto L2a;
                case 16908356: goto L27;
                case 16908357: goto L24;
                case 16908358: goto L21;
                case 16908359: goto L1e;
                case 16908360: goto L1b;
                case 16908361: goto L18;
                case 16908362: goto L15;
                case 16908372: goto L12;
                case 16908373: goto Lf;
                case 16908374: goto Lc;
                case 16908375: goto L9;
                case 16908382: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "ACTION_UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "ACTION_SCROLL_IN_DIRECTION"
            return r0
        L9:
            java.lang.String r0 = "ACTION_DRAG_CANCEL"
            return r0
        Lc:
            java.lang.String r0 = "ACTION_DRAG_DROP"
            return r0
        Lf:
            java.lang.String r0 = "ACTION_DRAG_START"
            return r0
        L12:
            java.lang.String r0 = "ACTION_IME_ENTER"
            return r0
        L15:
            java.lang.String r0 = "ACTION_PRESS_AND_HOLD"
            return r0
        L18:
            java.lang.String r0 = "ACTION_PAGE_RIGHT"
            return r0
        L1b:
            java.lang.String r0 = "ACTION_PAGE_LEFT"
            return r0
        L1e:
            java.lang.String r0 = "ACTION_PAGE_DOWN"
            return r0
        L21:
            java.lang.String r0 = "ACTION_PAGE_UP"
            return r0
        L24:
            java.lang.String r0 = "ACTION_HIDE_TOOLTIP"
            return r0
        L27:
            java.lang.String r0 = "ACTION_SHOW_TOOLTIP"
            return r0
        L2a:
            java.lang.String r0 = "ACTION_MOVE_WINDOW"
            return r0
        L2d:
            java.lang.String r0 = "ACTION_SET_PROGRESS"
            return r0
        L30:
            java.lang.String r0 = "ACTION_CONTEXT_CLICK"
            return r0
        L33:
            java.lang.String r0 = "ACTION_SCROLL_RIGHT"
            return r0
        L36:
            java.lang.String r0 = "ACTION_SCROLL_DOWN"
            return r0
        L39:
            java.lang.String r0 = "ACTION_SCROLL_LEFT"
            return r0
        L3c:
            java.lang.String r0 = "ACTION_SCROLL_UP"
            return r0
        L3f:
            java.lang.String r0 = "ACTION_SCROLL_TO_POSITION"
            return r0
        L42:
            java.lang.String r0 = "ACTION_SHOW_ON_SCREEN"
            return r0
        L45:
            java.lang.String r0 = "ACTION_SET_TEXT"
            return r0
        L48:
            java.lang.String r0 = "ACTION_COLLAPSE"
            return r0
        L4b:
            java.lang.String r0 = "ACTION_EXPAND"
            return r0
        L4e:
            java.lang.String r0 = "ACTION_SET_SELECTION"
            return r0
        L51:
            java.lang.String r0 = "ACTION_CUT"
            return r0
        L54:
            java.lang.String r0 = "ACTION_PASTE"
            return r0
        L57:
            java.lang.String r0 = "ACTION_COPY"
            return r0
        L5a:
            java.lang.String r0 = "ACTION_SCROLL_BACKWARD"
            return r0
        L5d:
            java.lang.String r0 = "ACTION_SCROLL_FORWARD"
            return r0
        L60:
            java.lang.String r0 = "ACTION_PREVIOUS_HTML_ELEMENT"
            return r0
        L63:
            java.lang.String r0 = "ACTION_NEXT_HTML_ELEMENT"
            return r0
        L66:
            java.lang.String r0 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            return r0
        L69:
            java.lang.String r0 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            return r0
        L6c:
            java.lang.String r0 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            return r0
        L6f:
            java.lang.String r0 = "ACTION_ACCESSIBILITY_FOCUS"
            return r0
        L72:
            java.lang.String r0 = "ACTION_LONG_CLICK"
            return r0
        L75:
            java.lang.String r0 = "ACTION_CLICK"
            return r0
        L78:
            java.lang.String r0 = "ACTION_CLEAR_SELECTION"
            return r0
        L7b:
            java.lang.String r0 = "ACTION_SELECT"
            return r0
        L7e:
            java.lang.String r0 = "ACTION_CLEAR_FOCUS"
            return r0
        L81:
            java.lang.String r0 = "ACTION_FOCUS"
            return r0
    }

    private boolean getBooleanProperty(int r4) {
            r3 = this;
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            int r2 = r0.getInt(r2, r1)
            r2 = r2 & r4
            if (r2 != r4) goto L12
            r1 = 1
        L12:
            return r1
    }

    private java.lang.String getCheckedString() {
            r2 = this;
            int r0 = r2.getChecked()
            r1 = 1
            if (r0 != r1) goto La
            java.lang.String r1 = "TRUE"
            return r1
        La:
            r1 = 2
            if (r0 != r1) goto L10
            java.lang.String r1 = "PARTIAL"
            return r1
        L10:
            java.lang.String r1 = "FALSE"
            return r1
    }

    public static android.text.style.ClickableSpan[] getClickableSpans(java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L15
            r0 = r4
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r4.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            r3 = 0
            java.lang.Object[] r1 = r0.getSpans(r3, r1, r2)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            return r1
        L15:
            r0 = 0
            return r0
    }

    static java.lang.String getExpandedStateSymbolicName(int r1) {
            switch(r1) {
                case 0: goto Lf;
                case 1: goto Lc;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "FULL"
            return r0
        L9:
            java.lang.String r0 = "PARTIAL"
            return r0
        Lc:
            java.lang.String r0 = "COLLAPSED"
            return r0
        Lf:
            java.lang.String r0 = "UNDEFINED"
            return r0
    }

    private android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> getOrCreateSpansFromViewTags(android.view.View r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.getSpansFromViewTags(r3)
            if (r0 != 0) goto L11
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0 = r1
            int r1 = androidx.core.R.id.tag_accessibility_clickable_spans
            r3.setTag(r1, r0)
        L11:
            return r0
    }

    private android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> getSpansFromViewTags(android.view.View r2) {
            r1 = this;
            int r0 = androidx.core.R.id.tag_accessibility_clickable_spans
            java.lang.Object r0 = r2.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            return r0
    }

    private boolean hasSpans() {
            r1 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r1.extrasIntList(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    private int idForClickableSpan(android.text.style.ClickableSpan r4, android.util.SparseArray<java.lang.ref.WeakReference<android.text.style.ClickableSpan>> r5) {
            r3 = this;
            if (r5 == 0) goto L23
            r0 = 0
        L3:
            int r1 = r5.size()
            if (r0 >= r1) goto L23
            java.lang.Object r1 = r5.valueAt(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.text.style.ClickableSpan r1 = (android.text.style.ClickableSpan) r1
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L20
            int r2 = r5.keyAt(r0)
            return r2
        L20:
            int r0 = r0 + 1
            goto L3
        L23:
            int r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.sClickableSpanId
            int r1 = r0 + 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.sClickableSpanId = r1
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain() {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View r1) {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View r1, int r2) {
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r1, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrap(r0)
            return r0
    }

    private void removeCollectedSpans(android.view.View r5) {
            r4 = this;
            android.util.SparseArray r0 = r4.getSpansFromViewTags(r5)
            if (r0 == 0) goto L3f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Lc:
            int r3 = r0.size()
            if (r2 >= r3) goto L28
            java.lang.Object r3 = r0.valueAt(r2)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            r2 = 0
        L29:
            int r3 = r1.size()
            if (r2 >= r3) goto L3f
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.remove(r3)
            int r2 = r2 + 1
            goto L29
        L3f:
            return
    }

    private void setBooleanProperty(int r6, boolean r7) {
            r5 = this;
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L16
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            r2 = 0
            int r3 = r0.getInt(r1, r2)
            int r4 = ~r6
            r3 = r3 & r4
            if (r7 == 0) goto L12
            r2 = r6
        L12:
            r2 = r2 | r3
            r0.putInt(r1, r2)
        L16:
            return
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrap(android.view.accessibility.AccessibilityNodeInfo r1) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r0.<init>(r1)
            return r0
    }

    static androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrapNonNullInstance(java.lang.Object r1) {
            if (r1 == 0) goto L8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r0.<init>(r1)
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void addAction(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addAction(r2)
            return
    }

    public void addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.Object r1 = r3.mAction
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            r0.addAction(r1)
            return
    }

    public void addChild(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addChild(r2)
            return
    }

    public void addChild(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.addChild(r2, r3)
            return
    }

    public void addLabeledBy(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.addLabeledBy(r2, r0)
            return
    }

    public void addLabeledBy(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.access$200(r0, r3, r4)
            goto Lf
        Lc:
            r2.setLabeledBy(r3, r4)
        Lf:
            return
    }

    public void addSpansToExtras(java.lang.CharSequence r7, android.view.View r8) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L46
            r6.clearExtrasSpans()
            r6.removeCollectedSpans(r8)
            android.text.style.ClickableSpan[] r0 = getClickableSpans(r7)
            if (r0 == 0) goto L46
            int r1 = r0.length
            if (r1 <= 0) goto L46
            android.os.Bundle r1 = r6.getExtras()
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            int r3 = androidx.core.R.id.accessibility_action_clickable_span
            r1.putInt(r2, r3)
            android.util.SparseArray r1 = r6.getOrCreateSpansFromViewTags(r8)
            r2 = 0
        L26:
            if (r0 == 0) goto L46
            int r3 = r0.length
            if (r2 >= r3) goto L46
            r3 = r0[r2]
            int r3 = r6.idForClickableSpan(r3, r1)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r5 = r0[r2]
            r4.<init>(r5)
            r1.put(r3, r4)
            r4 = r0[r2]
            r5 = r7
            android.text.Spanned r5 = (android.text.Spanned) r5
            r6.addSpanLocationToExtras(r4, r5, r3)
            int r2 = r2 + 1
            goto L26
        L46:
            return
    }

    public boolean canOpenPopup() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.canOpenPopup()
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 != 0) goto L8
            return r1
        L8:
            boolean r2 = r6 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r2 = r6
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r2
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.mInfo
            if (r3 != 0) goto L19
            android.view.accessibility.AccessibilityNodeInfo r3 = r2.mInfo
            if (r3 == 0) goto L24
            return r1
        L19:
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.mInfo
            android.view.accessibility.AccessibilityNodeInfo r4 = r2.mInfo
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L24
            return r1
        L24:
            int r3 = r5.mVirtualDescendantId
            int r4 = r2.mVirtualDescendantId
            if (r3 == r4) goto L2b
            return r1
        L2b:
            int r3 = r5.mParentVirtualDescendantId
            int r4 = r2.mParentVirtualDescendantId
            if (r3 == r4) goto L32
            return r1
        L32:
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.mInfo
            java.util.List r1 = r1.findAccessibilityNodeInfosByText(r7)
            int r2 = r1.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r1.get(r3)
            android.view.accessibility.AccessibilityNodeInfo r4 = (android.view.accessibility.AccessibilityNodeInfo) r4
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = wrap(r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L10
        L22:
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(java.lang.String r6) {
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            java.util.List r0 = r0.findAccessibilityNodeInfosByViewId(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            android.view.accessibility.AccessibilityNodeInfo r3 = (android.view.accessibility.AccessibilityNodeInfo) r3
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = wrap(r3)
            r1.add(r4)
            goto Lf
        L23:
            return r1
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.findFocus(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat focusSearch(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.focusSearch(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList() {
            r6 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.mInfo
            java.util.List r0 = r0.getActionList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L21
            java.lang.Object r4 = r0.get(r3)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L10
        L21:
            return r1
    }

    @java.lang.Deprecated
    public int getActions() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getActions()
            return r0
    }

    public java.util.List<java.lang.String> getAvailableExtraData() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.util.List r0 = r0.getAvailableExtraData()
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @java.lang.Deprecated
    public void getBoundsInParent(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.getBoundsInParent(r2)
            return
    }

    public void getBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.getBoundsInScreen(r2)
            return
    }

    public void getBoundsInWindow(android.graphics.Rect r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getBoundsInWindow(r0, r6)
            goto L27
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L27
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r4 = r0.bottom
            r6.set(r1, r2, r3, r4)
        L27:
            return
    }

    public int getChecked() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            int r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.access$000(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            android.os.Bundle r0 = r0.getExtras()
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.mInfo
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY"
            int r0 = r0.getInt(r2, r1)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(int r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getChild(r0, r3, r4)
            return r0
        Ld:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r2.getChild(r3)
            return r0
    }

    public int getChildCount() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getChildCount()
            return r0
    }

    public java.lang.CharSequence getClassName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getClassName()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat getCollectionInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = r0.getCollectionInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat getCollectionItemInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = r0.getCollectionItemInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public java.lang.CharSequence getContainerTitle() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getContainerTitle(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public int getDrawingOrder() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getDrawingOrder()
            return r0
    }

    public java.lang.CharSequence getError() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getError()
            return r0
    }

    public int getExpandedState() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            int r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getExpandedState(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getExtraRenderingInfo(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public java.lang.CharSequence getHintText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getHintText()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getInfo() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            return r0
    }

    public int getInputType() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getInputType()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabelFor() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getLabelFor()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabeledBy() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getLabeledBy()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getLabeledByList() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.util.List r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.access$300(r0)
            return r0
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r2.getLabeledBy()
            if (r1 == 0) goto L1c
            r0.add(r1)
        L1c:
            return r0
    }

    public int getLiveRegion() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getLiveRegion()
            return r0
    }

    public int getMaxTextLength() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getMaxTextLength()
            return r0
    }

    public long getMinDurationBetweenContentChangesMillis() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            long r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getMinDurationBetweenContentChangeMillis(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY"
            long r0 = r0.getLong(r1)
            return r0
    }

    public int getMovementGranularities() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getMovementGranularities()
            return r0
    }

    public java.lang.CharSequence getPackageName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.CharSequence r0 = r0.getPackageName()
            return r0
    }

    public java.lang.CharSequence getPaneTitle() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getPaneTitle()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getParent(r0, r3)
            return r0
        Ld:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r2.getParent()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat getRangeInfo() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = r0.getRangeInfo()
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat
            r1.<init>(r0)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public java.lang.CharSequence getRoleDescription() {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.lang.CharSequence getStateDescription() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.getStateDescription(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.lang.CharSequence getSupplementalDescription() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getSupplementalDescription(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.lang.CharSequence getText() {
            r10 = this;
            boolean r0 = r10.hasSpans()
            if (r0 == 0) goto L7d
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.List r0 = r10.extrasIntList(r0)
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.List r1 = r10.extrasIntList(r1)
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.List r2 = r10.extrasIntList(r2)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.List r3 = r10.extrasIntList(r3)
            android.text.SpannableString r4 = new android.text.SpannableString
            android.view.accessibility.AccessibilityNodeInfo r5 = r10.mInfo
            java.lang.CharSequence r5 = r5.getText()
            android.view.accessibility.AccessibilityNodeInfo r6 = r10.mInfo
            java.lang.CharSequence r6 = r6.getText()
            int r6 = r6.length()
            r7 = 0
            java.lang.String r5 = android.text.TextUtils.substring(r5, r7, r6)
            r4.<init>(r5)
            r5 = 0
        L39:
            int r6 = r0.size()
            if (r5 >= r6) goto L7c
            androidx.core.view.accessibility.AccessibilityClickableSpanCompat r6 = new androidx.core.view.accessibility.AccessibilityClickableSpanCompat
            java.lang.Object r7 = r3.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.os.Bundle r8 = r10.getExtras()
            java.lang.String r9 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            int r8 = r8.getInt(r9)
            r6.<init>(r7, r10, r8)
            java.lang.Object r7 = r0.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r1.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r2.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r4.setSpan(r6, r7, r8, r9)
            int r5 = r5 + 1
            goto L39
        L7c:
            return r4
        L7d:
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public int getTextSelectionEnd() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getTextSelectionEnd()
            return r0
    }

    public int getTextSelectionStart() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getTextSelectionStart()
            return r0
    }

    public java.lang.CharSequence getTooltipText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat getTouchDelegateInfo() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r0.getTouchDelegateInfo()
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalAfter() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getTraversalAfter()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalBefore() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getTraversalBefore()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public java.lang.String getUniqueId() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.String r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getUniqueId(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public java.lang.String getViewIdResourceName() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            java.lang.String r0 = r0.getViewIdResourceName()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getWindow() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = r0.getWindow()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public int getWindowId() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.getWindowId()
            return r0
    }

    public boolean hasRequestInitialAccessibilityFocus() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.hasRequestInitialAccessibilityFocus(r0)
            return r0
        Ld:
            r0 = 32
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public boolean isAccessibilityDataSensitive() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.isAccessibilityDataSensitive(r0)
            return r0
        Ld:
            r0 = 64
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isAccessibilityFocused() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isAccessibilityFocused()
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isCheckable()
            return r0
    }

    @java.lang.Deprecated
    public boolean isChecked() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isChecked()
            return r0
    }

    public boolean isClickable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isClickable()
            return r0
    }

    public boolean isContentInvalid() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isContentInvalid()
            return r0
    }

    public boolean isContextClickable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isContextClickable()
            return r0
    }

    public boolean isDismissable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isDismissable()
            return r0
    }

    public boolean isEditable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isEditable()
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isEnabled()
            return r0
    }

    public boolean isFieldRequired() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.isFieldRequired(r0)
            return r0
        Ld:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    public boolean isFocusable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isFocusable()
            return r0
    }

    public boolean isFocused() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isFocused()
            return r0
    }

    public boolean isGranularScrollingSupported() {
            r1 = this;
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r0 = r1.getBooleanProperty(r0)
            return r0
    }

    public boolean isHeading() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            boolean r0 = r0.isHeading()
            return r0
        Ld:
            r0 = 2
            boolean r0 = r3.getBooleanProperty(r0)
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = r3.getCollectionItemInfo()
            if (r0 == 0) goto L23
            boolean r2 = r0.isHeading()
            if (r2 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    public boolean isImportantForAccessibility() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isImportantForAccessibility()
            return r0
    }

    public boolean isLongClickable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isLongClickable()
            return r0
    }

    public boolean isMultiLine() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isMultiLine()
            return r0
    }

    public boolean isPassword() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isPassword()
            return r0
    }

    public boolean isScreenReaderFocusable() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isScreenReaderFocusable()
            return r0
        Ld:
            r0 = 1
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isScrollable() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isScrollable()
            return r0
    }

    public boolean isSelected() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isSelected()
            return r0
    }

    public boolean isShowingHintText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isShowingHintText()
            return r0
        Ld:
            r0 = 4
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isTextEntryKey() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = r0.isTextEntryKey()
            return r0
        Ld:
            r0 = 8
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isTextSelectable() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.isTextSelectable(r0)
            return r0
        Ld:
            r0 = 8388608(0x800000, float:1.1754944E-38)
            boolean r0 = r2.getBooleanProperty(r0)
            return r0
    }

    public boolean isVisibleToUser() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.isVisibleToUser()
            return r0
    }

    public boolean performAction(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.performAction(r2)
            return r0
    }

    public boolean performAction(int r2, android.os.Bundle r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.performAction(r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public void recycle() {
            r0 = this;
            return
    }

    public boolean refresh() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.refresh()
            return r0
    }

    public boolean removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.Object r1 = r3.mAction
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            boolean r0 = r0.removeAction(r1)
            return r0
    }

    public boolean removeChild(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.removeChild(r2)
            return r0
    }

    public boolean removeChild(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            boolean r0 = r0.removeChild(r2, r3)
            return r0
    }

    public boolean removeLabeledBy(android.view.View r2) {
            r1 = this;
            r0 = -1
            boolean r0 = r1.removeLabeledBy(r2, r0)
            return r0
    }

    public boolean removeLabeledBy(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            boolean r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.access$400(r0, r3, r4)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public void setAccessibilityDataSensitive(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setAccessibilityDataSensitive(r0, r3)
            goto L11
        Lc:
            r0 = 64
            r2.setBooleanProperty(r0, r3)
        L11:
            return
    }

    public void setAccessibilityFocused(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setAccessibilityFocused(r2)
            return
    }

    public void setAvailableExtraData(java.util.List<java.lang.String> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setAvailableExtraData(r3)
        Lb:
            return
    }

    @java.lang.Deprecated
    public void setBoundsInParent(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setBoundsInParent(r2)
            return
    }

    public void setBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setBoundsInScreen(r2)
            return
    }

    public void setBoundsInWindow(android.graphics.Rect r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setBoundsInWindow(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"
            r0.putParcelable(r1, r3)
        L17:
            return
    }

    public void setCanOpenPopup(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setCanOpenPopup(r2)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setCheckable(r2)
            return
    }

    public void setChecked(int r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.access$100(r0, r4)
            return
        Lc:
            r0 = 1
            if (r4 == r0) goto L2e
            r1 = 2
            if (r4 == r1) goto L2e
            if (r4 != 0) goto L15
            goto L2e
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown checked argument: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.mInfo
            if (r4 != r0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r1.setChecked(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY"
            r0.putInt(r1, r4)
            return
    }

    @java.lang.Deprecated
    public void setChecked(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setChecked(r2)
            return
    }

    public void setClassName(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setClassName(r2)
            return
    }

    public void setClickable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setClickable(r2)
            return
    }

    public void setCollectionInfo(java.lang.Object r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            if (r3 != 0) goto L6
            r1 = 0
            goto Ld
        L6:
            r1 = r3
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat) r1
            java.lang.Object r1 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
        Ld:
            r0.setCollectionInfo(r1)
            return
    }

    public void setCollectionItemInfo(java.lang.Object r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            if (r3 != 0) goto L6
            r1 = 0
            goto Ld
        L6:
            r1 = r3
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat) r1
            java.lang.Object r1 = r1.mInfo
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r1
        Ld:
            r0.setCollectionItemInfo(r1)
            return
    }

    public void setContainerTitle(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setContainerTitle(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setContentDescription(r2)
            return
    }

    public void setContentInvalid(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setContentInvalid(r2)
            return
    }

    public void setContextClickable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setContextClickable(r2)
            return
    }

    public void setDismissable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setDismissable(r2)
            return
    }

    public void setDrawingOrder(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setDrawingOrder(r2)
            return
    }

    public void setEditable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setEditable(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setEnabled(r2)
            return
    }

    public void setError(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setError(r2)
            return
    }

    public void setExpandedState(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.setExpandedState(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY"
            r0.putInt(r1, r3)
        L17:
            return
    }

    public void setFieldRequired(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.setFieldRequired(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"
            r0.putBoolean(r1, r3)
        L17:
            return
    }

    public void setFocusable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setFocusable(r2)
            return
    }

    public void setFocused(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setFocused(r2)
            return
    }

    public void setGranularScrollingSupported(boolean r2) {
            r1 = this;
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.setBooleanProperty(r0, r2)
            return
    }

    public void setHeading(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setHeading(r3)
            goto L10
        Lc:
            r0 = 2
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setHintText(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setHintText(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setImportantForAccessibility(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setImportantForAccessibility(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setInputType(r2)
            return
    }

    public void setLabelFor(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabelFor(r2)
            return
    }

    public void setLabelFor(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabelFor(r2, r3)
            return
    }

    @java.lang.Deprecated
    public void setLabeledBy(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabeledBy(r2)
            return
    }

    @java.lang.Deprecated
    public void setLabeledBy(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLabeledBy(r2, r3)
            return
    }

    public void setLiveRegion(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLiveRegion(r2)
            return
    }

    public void setLongClickable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setLongClickable(r2)
            return
    }

    public void setMaxTextLength(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMaxTextLength(r2)
            return
    }

    public void setMinDurationBetweenContentChangesMillis(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setMinDurationBetweenContentChangeMillis(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY"
            r0.putLong(r1, r3)
        L17:
            return
    }

    public void setMovementGranularities(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMovementGranularities(r2)
            return
    }

    public void setMultiLine(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setMultiLine(r2)
            return
    }

    public void setPackageName(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setPackageName(r2)
            return
    }

    public void setPaneTitle(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setPaneTitle(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setParent(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.mParentVirtualDescendantId = r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setParent(r2)
            return
    }

    public void setParent(android.view.View r2, int r3) {
            r1 = this;
            r1.mParentVirtualDescendantId = r3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setParent(r2, r3)
            return
    }

    public void setPassword(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setPassword(r2)
            return
    }

    public void setQueryFromAppProcessEnabled(android.view.View r3, boolean r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setQueryFromAppProcessEnabled(r0, r3, r4)
        Lb:
            return
    }

    public void setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            java.lang.Object r1 = r3.mInfo
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r1
            r0.setRangeInfo(r1)
            return
    }

    public void setRequestInitialAccessibilityFocus(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.setRequestInitialAccessibilityFocus(r0, r3)
            goto L11
        Lc:
            r0 = 32
            r2.setBooleanProperty(r0, r3)
        L11:
            return
    }

    public void setRoleDescription(java.lang.CharSequence r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r0.putCharSequence(r1, r3)
            return
    }

    public void setScreenReaderFocusable(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setScreenReaderFocusable(r3)
            goto L10
        Lc:
            r0 = 1
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setScrollable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setScrollable(r2)
            return
    }

    public void setSelected(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSelected(r2)
            return
    }

    public void setShowingHintText(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setShowingHintText(r3)
            goto L10
        Lc:
            r0 = 4
            r2.setBooleanProperty(r0, r3)
        L10:
            return
    }

    public void setSource(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.mVirtualDescendantId = r0
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSource(r2)
            return
    }

    public void setSource(android.view.View r2, int r3) {
            r1 = this;
            r1.mVirtualDescendantId = r3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setSource(r2, r3)
            return
    }

    public void setStateDescription(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.setStateDescription(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setSupplementalDescription(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.setSupplementalDescription(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setText(r2)
            return
    }

    public void setTextEntryKey(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTextEntryKey(r3)
            goto L11
        Lc:
            r0 = 8
            r2.setBooleanProperty(r0, r3)
        L11:
            return
    }

    public void setTextSelectable(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.setTextSelectable(r0, r3)
            goto L11
        Lc:
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r2.setBooleanProperty(r0, r3)
        L11:
            return
    }

    public void setTextSelection(int r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTextSelection(r2, r3)
            return
    }

    public void setTooltipText(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            r0.setTooltipText(r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"
            r0.putCharSequence(r1, r3)
        L17:
            return
    }

    public void setTouchDelegateInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r1 = r3.mInfo
            r0.setTouchDelegateInfo(r1)
        Ld:
            return
    }

    public void setTraversalAfter(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTraversalAfter(r2)
            return
    }

    public void setTraversalAfter(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTraversalAfter(r2, r3)
            return
    }

    public void setTraversalBefore(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTraversalBefore(r2)
            return
    }

    public void setTraversalBefore(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setTraversalBefore(r2, r3)
            return
    }

    public void setUniqueId(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.setUniqueId(r0, r3)
            goto L17
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.mInfo
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            r0.putString(r1, r3)
        L17:
            return
    }

    public void setViewIdResourceName(java.lang.String r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setViewIdResourceName(r2)
            return
    }

    public void setVisibleToUser(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            r0.setVisibleToUser(r2)
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.getBoundsInParent(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInParent: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r7.getBoundsInScreen(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInScreen: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r7.getBoundsInWindow(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; boundsInWindow: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "; packageName: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getPackageName()
            r2.append(r3)
            java.lang.String r2 = "; className: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getClassName()
            r2.append(r3)
            java.lang.String r2 = "; text: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getText()
            r2.append(r3)
            java.lang.String r2 = "; error: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getError()
            r2.append(r3)
            java.lang.String r2 = "; maxTextLength: "
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r7.getMaxTextLength()
            r2.append(r3)
            java.lang.String r2 = "; stateDescription: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getStateDescription()
            r2.append(r3)
            java.lang.String r2 = "; contentDescription: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getContentDescription()
            r2.append(r3)
            java.lang.String r2 = "; supplementalDescription: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getSupplementalDescription()
            r2.append(r3)
            java.lang.String r2 = "; tooltipText: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getTooltipText()
            r2.append(r3)
            java.lang.String r2 = "; viewIdResName: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = r7.getViewIdResourceName()
            r2.append(r3)
            java.lang.String r2 = "; uniqueId: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = r7.getUniqueId()
            r2.append(r3)
            java.lang.String r2 = "; checkable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isCheckable()
            r2.append(r3)
            java.lang.String r2 = "; checked: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = r7.getCheckedString()
            r2.append(r3)
            java.lang.String r2 = "; fieldRequired: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isFieldRequired()
            r2.append(r3)
            java.lang.String r2 = "; focusable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isFocusable()
            r2.append(r3)
            java.lang.String r2 = "; focused: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isFocused()
            r2.append(r3)
            java.lang.String r2 = "; selected: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isSelected()
            r2.append(r3)
            java.lang.String r2 = "; clickable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isClickable()
            r2.append(r3)
            java.lang.String r2 = "; longClickable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isLongClickable()
            r2.append(r3)
            java.lang.String r2 = "; contextClickable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isContextClickable()
            r2.append(r3)
            java.lang.String r2 = "; expandedState: "
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r7.getExpandedState()
            java.lang.String r3 = getExpandedStateSymbolicName(r3)
            r2.append(r3)
            java.lang.String r2 = "; enabled: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isEnabled()
            r2.append(r3)
            java.lang.String r2 = "; password: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isPassword()
            r2.append(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "; scrollable: "
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r7.isScrollable()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "; containerTitle: "
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.CharSequence r3 = r7.getContainerTitle()
            r2.append(r3)
            java.lang.String r2 = "; granularScrollingSupported: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isGranularScrollingSupported()
            r2.append(r3)
            java.lang.String r2 = "; importantForAccessibility: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isImportantForAccessibility()
            r2.append(r3)
            java.lang.String r2 = "; visible: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isVisibleToUser()
            r2.append(r3)
            java.lang.String r2 = "; isTextSelectable: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isTextSelectable()
            r2.append(r3)
            java.lang.String r2 = "; accessibilityDataSensitive: "
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r7.isAccessibilityDataSensitive()
            r2.append(r3)
            java.lang.String r2 = "; ["
            r0.append(r2)
            java.util.List r2 = r7.getActionList()
            r3 = 0
        L1fd:
            int r4 = r2.size()
            if (r3 >= r4) goto L23a
            java.lang.Object r4 = r2.get(r3)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r4
            int r5 = r4.getId()
            java.lang.String r5 = getActionSymbolicName(r5)
            java.lang.String r6 = "ACTION_UNKNOWN"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L227
            java.lang.CharSequence r6 = r4.getLabel()
            if (r6 == 0) goto L227
            java.lang.CharSequence r6 = r4.getLabel()
            java.lang.String r5 = r6.toString()
        L227:
            r0.append(r5)
            int r6 = r2.size()
            int r6 = r6 + (-1)
            if (r3 == r6) goto L237
            java.lang.String r6 = ", "
            r0.append(r6)
        L237:
            int r3 = r3 + 1
            goto L1fd
        L23a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public android.view.accessibility.AccessibilityNodeInfo unwrap() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo
            return r0
    }
}
