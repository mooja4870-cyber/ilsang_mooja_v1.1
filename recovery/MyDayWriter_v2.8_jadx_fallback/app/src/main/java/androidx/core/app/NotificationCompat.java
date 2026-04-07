package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_CALL = "call";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_VOICEMAIL = "voicemail";
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final java.lang.String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final java.lang.String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    public static final java.lang.String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final java.lang.String EXTRA_CALL_PERSON = "android.callPerson";
    public static final java.lang.String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final java.lang.String EXTRA_CALL_TYPE = "android.callType";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final java.lang.String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final java.lang.String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final java.lang.String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final java.lang.String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final java.lang.String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final java.lang.String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final java.lang.String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    public static final java.lang.String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final java.lang.String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final java.lang.String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final java.lang.String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final java.lang.String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* JADX INFO: renamed from: androidx.core.app.NotificationCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Action {
        static final java.lang.String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final java.lang.String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public android.app.PendingIntent actionIntent;

        @java.lang.Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final androidx.core.app.RemoteInput[] mDataOnlyRemoteInputs;
        final android.os.Bundle mExtras;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private final boolean mIsContextual;
        private final androidx.core.app.RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public java.lang.CharSequence title;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final android.os.Bundle mExtras;
            private final androidx.core.graphics.drawable.IconCompat mIcon;
            private final android.app.PendingIntent mIntent;
            private boolean mIsContextual;
            private java.util.ArrayList<androidx.core.app.RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final java.lang.CharSequence mTitle;

            static class Api20Impl {
                private Api20Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static android.os.Bundle getExtras(android.app.Notification.Action r1) {
                        android.os.Bundle r0 = r1.getExtras()
                        return r0
                }

                static android.app.RemoteInput[] getRemoteInputs(android.app.Notification.Action r1) {
                        android.app.RemoteInput[] r0 = r1.getRemoteInputs()
                        return r0
                }
            }

            static class Api23Impl {
                private Api23Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static android.graphics.drawable.Icon getIcon(android.app.Notification.Action r1) {
                        android.graphics.drawable.Icon r0 = r1.getIcon()
                        return r0
                }
            }

            static class Api24Impl {
                private Api24Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static boolean getAllowGeneratedReplies(android.app.Notification.Action r1) {
                        boolean r0 = r1.getAllowGeneratedReplies()
                        return r0
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static int getSemanticAction(android.app.Notification.Action r1) {
                        int r0 = r1.getSemanticAction()
                        return r0
                }
            }

            static class Api29Impl {
                private Api29Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static boolean isContextual(android.app.Notification.Action r1) {
                        boolean r0 = r1.isContextual()
                        return r0
                }
            }

            static class Api31Impl {
                private Api31Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static boolean isAuthenticationRequired(android.app.Notification.Action r1) {
                        boolean r0 = r1.isAuthenticationRequired()
                        return r0
                }
            }

            public Builder(int r13, java.lang.CharSequence r14, android.app.PendingIntent r15) {
                    r12 = this;
                    r0 = 0
                    if (r13 != 0) goto L4
                    goto La
                L4:
                    java.lang.String r1 = ""
                    androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r13)
                La:
                    r2 = r0
                    android.os.Bundle r5 = new android.os.Bundle
                    r5.<init>()
                    r10 = 0
                    r11 = 0
                    r6 = 0
                    r7 = 1
                    r8 = 0
                    r9 = 1
                    r1 = r12
                    r3 = r14
                    r4 = r15
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    return
            }

            public Builder(androidx.core.app.NotificationCompat.Action r12) {
                    r11 = this;
                    androidx.core.graphics.drawable.IconCompat r1 = r12.getIconCompat()
                    java.lang.CharSequence r2 = r12.title
                    android.app.PendingIntent r3 = r12.actionIntent
                    android.os.Bundle r4 = new android.os.Bundle
                    android.os.Bundle r0 = r12.mExtras
                    r4.<init>(r0)
                    androidx.core.app.RemoteInput[] r5 = r12.getRemoteInputs()
                    boolean r6 = r12.getAllowGeneratedReplies()
                    int r7 = r12.getSemanticAction()
                    boolean r8 = r12.mShowsUserInterface
                    boolean r9 = r12.isContextual()
                    boolean r10 = r12.isAuthenticationRequired()
                    r0 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    return
            }

            public Builder(androidx.core.graphics.drawable.IconCompat r12, java.lang.CharSequence r13, android.app.PendingIntent r14) {
                    r11 = this;
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    r9 = 0
                    r10 = 0
                    r5 = 0
                    r6 = 1
                    r7 = 0
                    r8 = 1
                    r0 = r11
                    r1 = r12
                    r2 = r13
                    r3 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    return
            }

            private Builder(androidx.core.graphics.drawable.IconCompat r3, java.lang.CharSequence r4, android.app.PendingIntent r5, android.os.Bundle r6, androidx.core.app.RemoteInput[] r7, boolean r8, int r9, boolean r10, boolean r11, boolean r12) {
                    r2 = this;
                    r2.<init>()
                    r0 = 1
                    r2.mAllowGeneratedReplies = r0
                    r2.mShowsUserInterface = r0
                    r2.mIcon = r3
                    java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r4)
                    r2.mTitle = r0
                    r2.mIntent = r5
                    r2.mExtras = r6
                    if (r7 != 0) goto L18
                    r0 = 0
                    goto L21
                L18:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.List r1 = java.util.Arrays.asList(r7)
                    r0.<init>(r1)
                L21:
                    r2.mRemoteInputs = r0
                    r2.mAllowGeneratedReplies = r8
                    r2.mSemanticAction = r9
                    r2.mShowsUserInterface = r10
                    r2.mIsContextual = r11
                    r2.mAuthenticationRequired = r12
                    return
            }

            private void checkContextualActionNullFields() {
                    r2 = this;
                    boolean r0 = r2.mIsContextual
                    if (r0 != 0) goto L5
                    return
                L5:
                    android.app.PendingIntent r0 = r2.mIntent
                    if (r0 == 0) goto La
                    return
                La:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Contextual Actions must contain a valid PendingIntent"
                    r0.<init>(r1)
                    throw r0
            }

            public static androidx.core.app.NotificationCompat.Action.Builder fromAndroidAction(android.app.Notification.Action r6) {
                    android.graphics.drawable.Icon r0 = androidx.core.app.NotificationCompat.Action.Builder.Api23Impl.getIcon(r6)
                    if (r0 == 0) goto L19
                L7:
                    android.graphics.drawable.Icon r0 = androidx.core.app.NotificationCompat.Action.Builder.Api23Impl.getIcon(r6)
                    androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(r0)
                    androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
                    java.lang.CharSequence r2 = r6.title
                    android.app.PendingIntent r3 = r6.actionIntent
                    r1.<init>(r0, r2, r3)
                    goto L25
                L19:
                    androidx.core.app.NotificationCompat$Action$Builder r0 = new androidx.core.app.NotificationCompat$Action$Builder
                    int r1 = r6.icon
                    java.lang.CharSequence r2 = r6.title
                    android.app.PendingIntent r3 = r6.actionIntent
                    r0.<init>(r1, r2, r3)
                    r1 = r0
                L25:
                    android.app.RemoteInput[] r0 = androidx.core.app.NotificationCompat.Action.Builder.Api20Impl.getRemoteInputs(r6)
                    if (r0 == 0) goto L3f
                    int r2 = r0.length
                    if (r2 == 0) goto L3f
                    int r2 = r0.length
                    r3 = 0
                L31:
                    if (r3 >= r2) goto L3f
                    r4 = r0[r3]
                    androidx.core.app.RemoteInput r5 = androidx.core.app.RemoteInput.fromPlatform(r4)
                    r1.addRemoteInput(r5)
                    int r3 = r3 + 1
                    goto L31
                L3f:
                    boolean r0 = androidx.core.app.NotificationCompat.Action.Builder.Api24Impl.getAllowGeneratedReplies(r6)
                    r1.mAllowGeneratedReplies = r0
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    if (r0 < r2) goto L53
                    int r0 = androidx.core.app.NotificationCompat.Action.Builder.Api28Impl.getSemanticAction(r6)
                    r1.setSemanticAction(r0)
                L53:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 29
                    if (r0 < r2) goto L60
                    boolean r0 = androidx.core.app.NotificationCompat.Action.Builder.Api29Impl.isContextual(r6)
                    r1.setContextual(r0)
                L60:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 31
                    if (r0 < r2) goto L6d
                    boolean r0 = androidx.core.app.NotificationCompat.Action.Builder.Api31Impl.isAuthenticationRequired(r6)
                    r1.setAuthenticationRequired(r0)
                L6d:
                    android.os.Bundle r0 = androidx.core.app.NotificationCompat.Action.Builder.Api20Impl.getExtras(r6)
                    r1.addExtras(r0)
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.Builder addExtras(android.os.Bundle r2) {
                    r1 = this;
                    if (r2 == 0) goto L7
                    android.os.Bundle r0 = r1.mExtras
                    r0.putAll(r2)
                L7:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.Builder addRemoteInput(androidx.core.app.RemoteInput r2) {
                    r1 = this;
                    java.util.ArrayList<androidx.core.app.RemoteInput> r0 = r1.mRemoteInputs
                    if (r0 != 0) goto Lb
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r1.mRemoteInputs = r0
                Lb:
                    if (r2 == 0) goto L12
                    java.util.ArrayList<androidx.core.app.RemoteInput> r0 = r1.mRemoteInputs
                    r0.add(r2)
                L12:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action build() {
                    r17 = this;
                    r0 = r17
                    r0.checkContextualActionNullFields()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.RemoteInput> r3 = r0.mRemoteInputs
                    if (r3 == 0) goto L33
                    java.util.ArrayList<androidx.core.app.RemoteInput> r3 = r0.mRemoteInputs
                    java.util.Iterator r3 = r3.iterator()
                L19:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L33
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.RemoteInput r4 = (androidx.core.app.RemoteInput) r4
                    boolean r5 = r4.isDataOnly()
                    if (r5 == 0) goto L2f
                    r1.add(r4)
                    goto L32
                L2f:
                    r2.add(r4)
                L32:
                    goto L19
                L33:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L3c
                    r3 = r4
                    goto L48
                L3c:
                    int r3 = r1.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r3 = r1.toArray(r3)
                    androidx.core.app.RemoteInput[] r3 = (androidx.core.app.RemoteInput[]) r3
                L48:
                    r11 = r3
                    boolean r3 = r2.isEmpty()
                    if (r3 == 0) goto L50
                    goto L5d
                L50:
                    int r3 = r2.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r3 = r2.toArray(r3)
                    r4 = r3
                    androidx.core.app.RemoteInput[] r4 = (androidx.core.app.RemoteInput[]) r4
                L5d:
                    r10 = r4
                    androidx.core.app.NotificationCompat$Action r5 = new androidx.core.app.NotificationCompat$Action
                    androidx.core.graphics.drawable.IconCompat r6 = r0.mIcon
                    java.lang.CharSequence r7 = r0.mTitle
                    android.app.PendingIntent r8 = r0.mIntent
                    android.os.Bundle r9 = r0.mExtras
                    boolean r12 = r0.mAllowGeneratedReplies
                    int r13 = r0.mSemanticAction
                    boolean r14 = r0.mShowsUserInterface
                    boolean r15 = r0.mIsContextual
                    boolean r3 = r0.mAuthenticationRequired
                    r16 = r3
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r5
            }

            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Extender r1) {
                    r0 = this;
                    r1.extend(r0)
                    return r0
            }

            public android.os.Bundle getExtras() {
                    r1 = this;
                    android.os.Bundle r0 = r1.mExtras
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setAllowGeneratedReplies(boolean r1) {
                    r0 = this;
                    r0.mAllowGeneratedReplies = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setAuthenticationRequired(boolean r1) {
                    r0 = this;
                    r0.mAuthenticationRequired = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setContextual(boolean r1) {
                    r0 = this;
                    r0.mIsContextual = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setSemanticAction(int r1) {
                    r0 = this;
                    r0.mSemanticAction = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setShowsUserInterface(boolean r1) {
                    r0 = this;
                    r0.mShowsUserInterface = r1
                    return r0
            }
        }

        public interface Extender {
            androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder r1);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements androidx.core.app.NotificationCompat.Action.Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final java.lang.String KEY_CANCEL_LABEL = "cancelLabel";
            private static final java.lang.String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final java.lang.String KEY_FLAGS = "flags";
            private static final java.lang.String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private java.lang.CharSequence mCancelLabel;
            private java.lang.CharSequence mConfirmLabel;
            private int mFlags;
            private java.lang.CharSequence mInProgressLabel;

            public WearableExtender() {
                    r1 = this;
                    r1.<init>()
                    r0 = 1
                    r1.mFlags = r0
                    return
            }

            public WearableExtender(androidx.core.app.NotificationCompat.Action r4) {
                    r3 = this;
                    r3.<init>()
                    r0 = 1
                    r3.mFlags = r0
                    android.os.Bundle r1 = r4.getExtras()
                    java.lang.String r2 = "android.wearable.EXTENSIONS"
                    android.os.Bundle r1 = r1.getBundle(r2)
                    if (r1 == 0) goto L32
                    java.lang.String r2 = "flags"
                    int r0 = r1.getInt(r2, r0)
                    r3.mFlags = r0
                    java.lang.String r0 = "inProgressLabel"
                    java.lang.CharSequence r0 = r1.getCharSequence(r0)
                    r3.mInProgressLabel = r0
                    java.lang.String r0 = "confirmLabel"
                    java.lang.CharSequence r0 = r1.getCharSequence(r0)
                    r3.mConfirmLabel = r0
                    java.lang.String r0 = "cancelLabel"
                    java.lang.CharSequence r0 = r1.getCharSequence(r0)
                    r3.mCancelLabel = r0
                L32:
                    return
            }

            private void setFlag(int r3, boolean r4) {
                    r2 = this;
                    if (r4 == 0) goto L8
                    int r0 = r2.mFlags
                    r0 = r0 | r3
                    r2.mFlags = r0
                    goto Le
                L8:
                    int r0 = r2.mFlags
                    int r1 = ~r3
                    r0 = r0 & r1
                    r2.mFlags = r0
                Le:
                    return
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender clone() {
                    r2 = this;
                    androidx.core.app.NotificationCompat$Action$WearableExtender r0 = new androidx.core.app.NotificationCompat$Action$WearableExtender
                    r0.<init>()
                    int r1 = r2.mFlags
                    r0.mFlags = r1
                    java.lang.CharSequence r1 = r2.mInProgressLabel
                    r0.mInProgressLabel = r1
                    java.lang.CharSequence r1 = r2.mConfirmLabel
                    r0.mConfirmLabel = r1
                    java.lang.CharSequence r1 = r2.mCancelLabel
                    r0.mCancelLabel = r1
                    return r0
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ java.lang.Object m45clone() throws java.lang.CloneNotSupportedException {
                    r1 = this;
                    androidx.core.app.NotificationCompat$Action$WearableExtender r0 = r1.clone()
                    return r0
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder r4) {
                    r3 = this;
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    int r1 = r3.mFlags
                    r2 = 1
                    if (r1 == r2) goto L11
                    java.lang.String r1 = "flags"
                    int r2 = r3.mFlags
                    r0.putInt(r1, r2)
                L11:
                    java.lang.CharSequence r1 = r3.mInProgressLabel
                    if (r1 == 0) goto L1c
                    java.lang.String r1 = "inProgressLabel"
                    java.lang.CharSequence r2 = r3.mInProgressLabel
                    r0.putCharSequence(r1, r2)
                L1c:
                    java.lang.CharSequence r1 = r3.mConfirmLabel
                    if (r1 == 0) goto L27
                    java.lang.String r1 = "confirmLabel"
                    java.lang.CharSequence r2 = r3.mConfirmLabel
                    r0.putCharSequence(r1, r2)
                L27:
                    java.lang.CharSequence r1 = r3.mCancelLabel
                    if (r1 == 0) goto L32
                    java.lang.String r1 = "cancelLabel"
                    java.lang.CharSequence r2 = r3.mCancelLabel
                    r0.putCharSequence(r1, r2)
                L32:
                    android.os.Bundle r1 = r4.getExtras()
                    java.lang.String r2 = "android.wearable.EXTENSIONS"
                    r1.putBundle(r2, r0)
                    return r4
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getCancelLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mCancelLabel
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getConfirmLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mConfirmLabel
                    return r0
            }

            public boolean getHintDisplayActionInline() {
                    r1 = this;
                    int r0 = r1.mFlags
                    r0 = r0 & 4
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }

            public boolean getHintLaunchesActivity() {
                    r1 = this;
                    int r0 = r1.mFlags
                    r0 = r0 & 2
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getInProgressLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mInProgressLabel
                    return r0
            }

            public boolean isAvailableOffline() {
                    r2 = this;
                    int r0 = r2.mFlags
                    r1 = 1
                    r0 = r0 & r1
                    if (r0 == 0) goto L7
                    goto L8
                L7:
                    r1 = 0
                L8:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setAvailableOffline(boolean r2) {
                    r1 = this;
                    r0 = 1
                    r1.setFlag(r0, r2)
                    return r1
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setCancelLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mCancelLabel = r1
                    return r0
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setConfirmLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mConfirmLabel = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintDisplayActionInline(boolean r2) {
                    r1 = this;
                    r0 = 4
                    r1.setFlag(r0, r2)
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintLaunchesActivity(boolean r2) {
                    r1 = this;
                    r0 = 2
                    r1.setFlag(r0, r2)
                    return r1
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setInProgressLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mInProgressLabel = r1
                    return r0
            }
        }

        public Action(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                goto La
            L4:
                java.lang.String r1 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r3)
            La:
                r2.<init>(r0, r4, r5)
                return
        }

        Action(int r14, java.lang.CharSequence r15, android.app.PendingIntent r16, android.os.Bundle r17, androidx.core.app.RemoteInput[] r18, androidx.core.app.RemoteInput[] r19, boolean r20, int r21, boolean r22, boolean r23, boolean r24) {
                r13 = this;
                r0 = 0
                if (r14 != 0) goto L4
                goto La
            L4:
                java.lang.String r1 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r14)
            La:
                r2 = r0
                r1 = r13
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r11 = r23
                r12 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
        }

        public Action(androidx.core.graphics.drawable.IconCompat r13, java.lang.CharSequence r14, android.app.PendingIntent r15) {
                r12 = this;
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r10 = 0
                r11 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 1
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
        }

        Action(androidx.core.graphics.drawable.IconCompat r3, java.lang.CharSequence r4, android.app.PendingIntent r5, android.os.Bundle r6, androidx.core.app.RemoteInput[] r7, androidx.core.app.RemoteInput[] r8, boolean r9, int r10, boolean r11, boolean r12, boolean r13) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mShowsUserInterface = r0
                r2.mIcon = r3
                if (r3 == 0) goto L17
                int r0 = r3.getType()
                r1 = 2
                if (r0 != r1) goto L17
                int r0 = r3.getResId()
                r2.icon = r0
            L17:
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r4)
                r2.title = r0
                r2.actionIntent = r5
                if (r6 == 0) goto L23
                r0 = r6
                goto L28
            L23:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
            L28:
                r2.mExtras = r0
                r2.mRemoteInputs = r7
                r2.mDataOnlyRemoteInputs = r8
                r2.mAllowGeneratedReplies = r9
                r2.mSemanticAction = r10
                r2.mShowsUserInterface = r11
                r2.mIsContextual = r12
                r2.mAuthenticationRequired = r13
                return
        }

        public android.app.PendingIntent getActionIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.actionIntent
                return r0
        }

        public boolean getAllowGeneratedReplies() {
                r1 = this;
                boolean r0 = r1.mAllowGeneratedReplies
                return r0
        }

        public androidx.core.app.RemoteInput[] getDataOnlyRemoteInputs() {
                r1 = this;
                androidx.core.app.RemoteInput[] r0 = r1.mDataOnlyRemoteInputs
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        @java.lang.Deprecated
        public int getIcon() {
                r1 = this;
                int r0 = r1.icon
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getIconCompat() {
                r3 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                if (r0 != 0) goto L13
                int r0 = r3.icon
                if (r0 == 0) goto L13
                java.lang.String r0 = ""
                int r1 = r3.icon
                r2 = 0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r2, r0, r1)
                r3.mIcon = r0
            L13:
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                return r0
        }

        public androidx.core.app.RemoteInput[] getRemoteInputs() {
                r1 = this;
                androidx.core.app.RemoteInput[] r0 = r1.mRemoteInputs
                return r0
        }

        public int getSemanticAction() {
                r1 = this;
                int r0 = r1.mSemanticAction
                return r0
        }

        public boolean getShowsUserInterface() {
                r1 = this;
                boolean r0 = r1.mShowsUserInterface
                return r0
        }

        public java.lang.CharSequence getTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.title
                return r0
        }

        public boolean isAuthenticationRequired() {
                r1 = this;
                boolean r0 = r1.mAuthenticationRequired
                return r0
        }

        public boolean isContextual() {
                r1 = this;
                boolean r0 = r1.mIsContextual
                return r0
        }
    }

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean getAllowFreeFormInput(android.app.RemoteInput r1) {
                boolean r0 = r1.getAllowFreeFormInput()
                return r0
        }

        static java.lang.CharSequence[] getChoices(android.app.RemoteInput r1) {
                java.lang.CharSequence[] r0 = r1.getChoices()
                return r0
        }

        static android.os.Bundle getExtras(android.app.Notification.Action r1) {
                android.os.Bundle r0 = r1.getExtras()
                return r0
        }

        static android.os.Bundle getExtras(android.app.RemoteInput r1) {
                android.os.Bundle r0 = r1.getExtras()
                return r0
        }

        static java.lang.String getGroup(android.app.Notification r1) {
                java.lang.String r0 = r1.getGroup()
                return r0
        }

        static java.lang.CharSequence getLabel(android.app.RemoteInput r1) {
                java.lang.CharSequence r0 = r1.getLabel()
                return r0
        }

        static android.app.RemoteInput[] getRemoteInputs(android.app.Notification.Action r1) {
                android.app.RemoteInput[] r0 = r1.getRemoteInputs()
                return r0
        }

        static java.lang.String getResultKey(android.app.RemoteInput r1) {
                java.lang.String r0 = r1.getResultKey()
                return r0
        }

        static java.lang.String getSortKey(android.app.Notification r1) {
                java.lang.String r0 = r1.getSortKey()
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Icon getIcon(android.app.Notification.Action r1) {
                android.graphics.drawable.Icon r0 = r1.getIcon()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean getAllowGeneratedReplies(android.app.Notification.Action r1) {
                boolean r0 = r1.getAllowGeneratedReplies()
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getBadgeIconType(android.app.Notification r1) {
                int r0 = r1.getBadgeIconType()
                return r0
        }

        static java.lang.String getChannelId(android.app.Notification r1) {
                java.lang.String r0 = r1.getChannelId()
                return r0
        }

        static int getGroupAlertBehavior(android.app.Notification r1) {
                int r0 = r1.getGroupAlertBehavior()
                return r0
        }

        static java.lang.CharSequence getSettingsText(android.app.Notification r1) {
                java.lang.CharSequence r0 = r1.getSettingsText()
                return r0
        }

        static java.lang.String getShortcutId(android.app.Notification r1) {
                java.lang.String r0 = r1.getShortcutId()
                return r0
        }

        static long getTimeoutAfter(android.app.Notification r2) {
                long r0 = r2.getTimeoutAfter()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSemanticAction(android.app.Notification.Action r1) {
                int r0 = r1.getSemanticAction()
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean getAllowSystemGeneratedContextualActions(android.app.Notification r1) {
                boolean r0 = r1.getAllowSystemGeneratedContextualActions()
                return r0
        }

        static android.app.Notification.BubbleMetadata getBubbleMetadata(android.app.Notification r1) {
                android.app.Notification$BubbleMetadata r0 = r1.getBubbleMetadata()
                return r0
        }

        static int getEditChoicesBeforeSending(android.app.RemoteInput r1) {
                int r0 = r1.getEditChoicesBeforeSending()
                return r0
        }

        static android.content.LocusId getLocusId(android.app.Notification r1) {
                android.content.LocusId r0 = r1.getLocusId()
                return r0
        }

        static boolean isContextual(android.app.Notification.Action r1) {
                boolean r0 = r1.isContextual()
                return r0
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAuthenticationRequired(android.app.Notification.Action r1) {
                boolean r0 = r1.isAuthenticationRequired()
                return r0
        }
    }

    static class Api36Impl {
        private Api36Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean hasPromotableCharacteristics(android.app.Notification r1) {
                boolean r0 = r1.hasPromotableCharacteristics()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private androidx.core.graphics.drawable.IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private java.lang.CharSequence mPictureContentDescription;
        private androidx.core.graphics.drawable.IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        private static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setBigLargeIcon(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                    r0.bigLargeIcon(r1)
                    return
            }
        }

        private static class Api31Impl {
            private Api31Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setBigPicture(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                    r0.bigPicture(r1)
                    return
            }

            static void setContentDescription(android.app.Notification.BigPictureStyle r0, java.lang.CharSequence r1) {
                    r0.setContentDescription(r1)
                    return
            }

            static void showBigPictureWhenCollapsed(android.app.Notification.BigPictureStyle r0, boolean r1) {
                    r0.showBigPictureWhenCollapsed(r1)
                    return
            }
        }

        public BigPictureStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = this;
                r0.<init>()
                r0.setBuilder(r1)
                return
        }

        private static androidx.core.graphics.drawable.IconCompat asIconCompat(android.os.Parcelable r1) {
                if (r1 == 0) goto L1b
            L3:
                boolean r0 = r1 instanceof android.graphics.drawable.Icon
                if (r0 == 0) goto Lf
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r0)
                return r0
            Lf:
                boolean r0 = r1 instanceof android.graphics.Bitmap
                if (r0 == 0) goto L1b
                r0 = r1
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }

        public static androidx.core.graphics.drawable.IconCompat getPictureIcon(android.os.Bundle r2) {
                if (r2 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.lang.String r0 = "android.picture"
                android.os.Parcelable r0 = r2.getParcelable(r0)
                if (r0 == 0) goto L11
                androidx.core.graphics.drawable.IconCompat r1 = asIconCompat(r0)
                return r1
            L11:
                java.lang.String r1 = "android.pictureIcon"
                android.os.Parcelable r1 = r2.getParcelable(r1)
                androidx.core.graphics.drawable.IconCompat r1 = asIconCompat(r1)
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r7) {
                r6 = this;
                android.app.Notification$Builder r0 = r7.getBuilder()
                android.app.Notification$BigPictureStyle r1 = new android.app.Notification$BigPictureStyle
                r1.<init>(r0)
                java.lang.CharSequence r2 = r6.mBigContentTitle
                android.app.Notification$BigPictureStyle r2 = r1.setBigContentTitle(r2)
                androidx.core.graphics.drawable.IconCompat r3 = r6.mPictureIcon
                r4 = 31
                if (r3 == 0) goto L44
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r4) goto L2f
                r3 = 0
                boolean r5 = r7 instanceof androidx.core.app.NotificationCompatBuilder
                if (r5 == 0) goto L25
                r5 = r7
                androidx.core.app.NotificationCompatBuilder r5 = (androidx.core.app.NotificationCompatBuilder) r5
                android.content.Context r3 = r5.getContext()
            L25:
                androidx.core.graphics.drawable.IconCompat r5 = r6.mPictureIcon
                android.graphics.drawable.Icon r5 = r5.toIcon(r3)
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setBigPicture(r2, r5)
                goto L43
            L2f:
                androidx.core.graphics.drawable.IconCompat r3 = r6.mPictureIcon
                int r3 = r3.getType()
                r5 = 1
                if (r3 != r5) goto L43
                androidx.core.graphics.drawable.IconCompat r3 = r6.mPictureIcon
                android.graphics.Bitmap r3 = r3.getBitmap()
                android.app.Notification$BigPictureStyle r2 = r2.bigPicture(r3)
                goto L44
            L43:
            L44:
                boolean r3 = r6.mBigLargeIconSet
                if (r3 == 0) goto L6b
                androidx.core.graphics.drawable.IconCompat r3 = r6.mBigLargeIcon
                if (r3 != 0) goto L54
                r3 = 0
                r5 = r3
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                r2.bigLargeIcon(r3)
                goto L6b
            L54:
                r3 = 0
                boolean r5 = r7 instanceof androidx.core.app.NotificationCompatBuilder
                if (r5 == 0) goto L61
                r5 = r7
                androidx.core.app.NotificationCompatBuilder r5 = (androidx.core.app.NotificationCompatBuilder) r5
                android.content.Context r3 = r5.getContext()
            L61:
                androidx.core.graphics.drawable.IconCompat r5 = r6.mBigLargeIcon
                android.graphics.drawable.Icon r5 = r5.toIcon(r3)
                androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl.setBigLargeIcon(r2, r5)
            L6b:
                boolean r3 = r6.mSummaryTextSet
                if (r3 == 0) goto L74
                java.lang.CharSequence r3 = r6.mSummaryText
                r2.setSummaryText(r3)
            L74:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r4) goto L82
                boolean r3 = r6.mShowBigPictureWhenCollapsed
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.showBigPictureWhenCollapsed(r2, r3)
                java.lang.CharSequence r3 = r6.mPictureContentDescription
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setContentDescription(r2, r3)
            L82:
                return
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.Bitmap r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r2)
            L8:
                r1.mBigLargeIcon = r0
                r0 = 1
                r1.mBigLargeIconSet = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.drawable.Icon r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
            L8:
                r1.mBigLargeIcon = r0
                r0 = 1
                r1.mBigLargeIconSet = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.Bitmap r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r2)
            L8:
                r1.mPictureIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.drawable.Icon r2) {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
                r1.mPictureIcon = r0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.largeIcon.big"
                r2.remove(r0)
                java.lang.String r0 = "android.picture"
                r2.remove(r0)
                java.lang.String r0 = "android.pictureIcon"
                r2.remove(r0)
                java.lang.String r0 = "android.showBigPictureWhenCollapsed"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.lang.String r0 = "android.largeIcon.big"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L18
                android.os.Parcelable r0 = r3.getParcelable(r0)
                androidx.core.graphics.drawable.IconCompat r0 = asIconCompat(r0)
                r2.mBigLargeIcon = r0
                r0 = 1
                r2.mBigLargeIconSet = r0
            L18:
                androidx.core.graphics.drawable.IconCompat r0 = getPictureIcon(r3)
                r2.mPictureIcon = r0
                java.lang.String r0 = "android.showBigPictureWhenCollapsed"
                boolean r0 = r3.getBoolean(r0)
                r2.mShowBigPictureWhenCollapsed = r0
                return
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setBigContentTitle(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mBigContentTitle = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setContentDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.mPictureContentDescription = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setSummaryText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mSummaryText = r0
                r0 = 1
                r1.mSummaryTextSet = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle showBigPictureWhenCollapsed(boolean r1) {
                r0 = this;
                r0.mShowBigPictureWhenCollapsed = r1
                return r0
        }
    }

    public static class BigTextStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private java.lang.CharSequence mBigText;

        public BigTextStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public BigTextStyle(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = this;
                r0.<init>()
                r0.setBuilder(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r1) {
                r0 = this;
                super.addCompatExtras(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r4) {
                r3 = this;
                android.app.Notification$Builder r0 = r4.getBuilder()
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                r1.<init>(r0)
                java.lang.CharSequence r2 = r3.mBigContentTitle
                android.app.Notification$BigTextStyle r1 = r1.setBigContentTitle(r2)
                java.lang.CharSequence r2 = r3.mBigText
                android.app.Notification$BigTextStyle r1 = r1.bigText(r2)
                boolean r2 = r3.mSummaryTextSet
                if (r2 == 0) goto L1e
                java.lang.CharSequence r2 = r3.mSummaryText
                r1.setSummaryText(r2)
            L1e:
                return
        }

        public androidx.core.app.NotificationCompat.BigTextStyle bigText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mBigText = r0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.bigText"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r2) {
                r1 = this;
                super.restoreFromCompatExtras(r2)
                java.lang.String r0 = "android.bigText"
                java.lang.CharSequence r0 = r2.getCharSequence(r0)
                r1.mBigText = r0
                return
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setBigContentTitle(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mBigContentTitle = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setSummaryText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mSummaryText = r0
                r0 = 1
                r1.mSummaryTextSet = r0
                return r1
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private android.app.PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private android.app.PendingIntent mPendingIntent;
        private java.lang.String mShortcutId;

        private static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r3) {
                    r0 = 0
                    if (r3 != 0) goto L4
                    return r0
                L4:
                    android.app.PendingIntent r1 = r3.getIntent()
                    if (r1 != 0) goto Lb
                    return r0
                Lb:
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    android.app.PendingIntent r1 = r3.getIntent()
                    android.graphics.drawable.Icon r2 = r3.getIcon()
                    androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
                    r0.<init>(r1, r2)
                    boolean r1 = r3.getAutoExpandBubble()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setAutoExpandBubble(r1)
                    android.app.PendingIntent r1 = r3.getDeleteIntent()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setDeleteIntent(r1)
                    boolean r1 = r3.isNotificationSuppressed()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setSuppressNotification(r1)
                    int r1 = r3.getDesiredHeight()
                    if (r1 == 0) goto L41
                    int r1 = r3.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L41:
                    int r1 = r3.getDesiredHeightResId()
                    if (r1 == 0) goto L4e
                    int r1 = r3.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r1)
                L4e:
                    androidx.core.app.NotificationCompat$BubbleMetadata r1 = r0.build()
                    return r1
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r2) {
                    r0 = 0
                    if (r2 != 0) goto L4
                    return r0
                L4:
                    android.app.PendingIntent r1 = r2.getIntent()
                    if (r1 != 0) goto Lb
                    return r0
                Lb:
                    android.app.Notification$BubbleMetadata$Builder r0 = new android.app.Notification$BubbleMetadata$Builder
                    r0.<init>()
                    androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                    android.graphics.drawable.Icon r1 = r1.toIcon()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setIcon(r1)
                    android.app.PendingIntent r1 = r2.getIntent()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setIntent(r1)
                    android.app.PendingIntent r1 = r2.getDeleteIntent()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setDeleteIntent(r1)
                    boolean r1 = r2.getAutoExpandBubble()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setAutoExpandBubble(r1)
                    boolean r1 = r2.isNotificationSuppressed()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setSuppressNotification(r1)
                    int r1 = r2.getDesiredHeight()
                    if (r1 == 0) goto L49
                    int r1 = r2.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L49:
                    int r1 = r2.getDesiredHeightResId()
                    if (r1 == 0) goto L57
                L50:
                    int r1 = r2.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r1)
                L57:
                    android.app.Notification$BubbleMetadata r1 = r0.build()
                    return r1
            }
        }

        private static class Api30Impl {
            private Api30Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r4) {
                    if (r4 != 0) goto L4
                    r0 = 0
                    return r0
                L4:
                    r0 = 0
                    java.lang.String r1 = r4.getShortcutId()
                    if (r1 == 0) goto L15
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r1 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    java.lang.String r2 = r4.getShortcutId()
                    r1.<init>(r2)
                    goto L26
                L15:
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r1 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    android.app.PendingIntent r2 = r4.getIntent()
                    android.graphics.drawable.Icon r3 = r4.getIcon()
                    androidx.core.graphics.drawable.IconCompat r3 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r3)
                    r1.<init>(r2, r3)
                L26:
                    boolean r0 = r4.getAutoExpandBubble()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r1.setAutoExpandBubble(r0)
                    android.app.PendingIntent r2 = r4.getDeleteIntent()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setDeleteIntent(r2)
                    boolean r2 = r4.isNotificationSuppressed()
                    r0.setSuppressNotification(r2)
                    int r0 = r4.getDesiredHeight()
                    if (r0 == 0) goto L4b
                    int r0 = r4.getDesiredHeight()
                    r1.setDesiredHeight(r0)
                L4b:
                    int r0 = r4.getDesiredHeightResId()
                    if (r0 == 0) goto L58
                    int r0 = r4.getDesiredHeightResId()
                    r1.setDesiredHeightResId(r0)
                L58:
                    androidx.core.app.NotificationCompat$BubbleMetadata r0 = r1.build()
                    return r0
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r4) {
                    if (r4 != 0) goto L4
                    r0 = 0
                    return r0
                L4:
                    r0 = 0
                    java.lang.String r1 = r4.getShortcutId()
                    if (r1 == 0) goto L15
                    android.app.Notification$BubbleMetadata$Builder r1 = new android.app.Notification$BubbleMetadata$Builder
                    java.lang.String r2 = r4.getShortcutId()
                    r1.<init>(r2)
                    goto L26
                L15:
                    android.app.Notification$BubbleMetadata$Builder r1 = new android.app.Notification$BubbleMetadata$Builder
                    android.app.PendingIntent r2 = r4.getIntent()
                    androidx.core.graphics.drawable.IconCompat r3 = r4.getIcon()
                    android.graphics.drawable.Icon r3 = r3.toIcon()
                    r1.<init>(r2, r3)
                L26:
                    android.app.PendingIntent r0 = r4.getDeleteIntent()
                    android.app.Notification$BubbleMetadata$Builder r0 = r1.setDeleteIntent(r0)
                    boolean r2 = r4.getAutoExpandBubble()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setAutoExpandBubble(r2)
                    boolean r2 = r4.isNotificationSuppressed()
                    r0.setSuppressNotification(r2)
                    int r0 = r4.getDesiredHeight()
                    if (r0 == 0) goto L4b
                    int r0 = r4.getDesiredHeight()
                    r1.setDesiredHeight(r0)
                L4b:
                    int r0 = r4.getDesiredHeightResId()
                    if (r0 == 0) goto L59
                L52:
                    int r0 = r4.getDesiredHeightResId()
                    r1.setDesiredHeightResId(r0)
                L59:
                    android.app.Notification$BubbleMetadata r0 = r1.build()
                    return r0
            }
        }

        public static final class Builder {
            private android.app.PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private androidx.core.graphics.drawable.IconCompat mIcon;
            private android.app.PendingIntent mPendingIntent;
            private java.lang.String mShortcutId;

            @java.lang.Deprecated
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public Builder(android.app.PendingIntent r3, androidx.core.graphics.drawable.IconCompat r4) {
                    r2 = this;
                    r2.<init>()
                    if (r3 == 0) goto L14
                    if (r4 == 0) goto Lc
                    r2.mPendingIntent = r3
                    r2.mIcon = r4
                    return
                Lc:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Bubbles require non-null icon"
                    r0.<init>(r1)
                    throw r0
                L14:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Bubble requires non-null pending intent"
                    r0.<init>(r1)
                    throw r0
            }

            public Builder(java.lang.String r3) {
                    r2 = this;
                    r2.<init>()
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    if (r0 != 0) goto Lc
                    r2.mShortcutId = r3
                    return
                Lc:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Bubble requires a non-null shortcut id"
                    r0.<init>(r1)
                    throw r0
            }

            private androidx.core.app.NotificationCompat.BubbleMetadata.Builder setFlag(int r3, boolean r4) {
                    r2 = this;
                    if (r4 == 0) goto L8
                    int r0 = r2.mFlags
                    r0 = r0 | r3
                    r2.mFlags = r0
                    goto Le
                L8:
                    int r0 = r2.mFlags
                    int r1 = ~r3
                    r0 = r0 & r1
                    r2.mFlags = r0
                Le:
                    return r2
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata build() {
                    r11 = this;
                    java.lang.String r0 = r11.mShortcutId
                    if (r0 != 0) goto L11
                    android.app.PendingIntent r0 = r11.mPendingIntent
                    if (r0 == 0) goto L9
                    goto L11
                L9:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Must supply pending intent or shortcut to bubble"
                    r0.<init>(r1)
                    throw r0
                L11:
                    java.lang.String r0 = r11.mShortcutId
                    if (r0 != 0) goto L22
                    androidx.core.graphics.drawable.IconCompat r0 = r11.mIcon
                    if (r0 == 0) goto L1a
                    goto L22
                L1a:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Must supply an icon or shortcut for the bubble"
                    r0.<init>(r1)
                    throw r0
                L22:
                    androidx.core.app.NotificationCompat$BubbleMetadata r2 = new androidx.core.app.NotificationCompat$BubbleMetadata
                    android.app.PendingIntent r3 = r11.mPendingIntent
                    android.app.PendingIntent r4 = r11.mDeleteIntent
                    androidx.core.graphics.drawable.IconCompat r5 = r11.mIcon
                    int r6 = r11.mDesiredHeight
                    int r7 = r11.mDesiredHeightResId
                    int r8 = r11.mFlags
                    java.lang.String r9 = r11.mShortcutId
                    r10 = 0
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    int r0 = r11.mFlags
                    r2.setFlags(r0)
                    return r2
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setAutoExpandBubble(boolean r2) {
                    r1 = this;
                    r0 = 1
                    r1.setFlag(r0, r2)
                    return r1
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent r1) {
                    r0 = this;
                    r0.mDeleteIntent = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeight(int r3) {
                    r2 = this;
                    r0 = 0
                    int r1 = java.lang.Math.max(r3, r0)
                    r2.mDesiredHeight = r1
                    r2.mDesiredHeightResId = r0
                    return r2
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeightResId(int r2) {
                    r1 = this;
                    r1.mDesiredHeightResId = r2
                    r0 = 0
                    r1.mDesiredHeight = r0
                    return r1
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIcon(androidx.core.graphics.drawable.IconCompat r3) {
                    r2 = this;
                    java.lang.String r0 = r2.mShortcutId
                    if (r0 != 0) goto L11
                    if (r3 == 0) goto L9
                    r2.mIcon = r3
                    return r2
                L9:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Bubbles require non-null icon"
                    r0.<init>(r1)
                    throw r0
                L11:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIntent(android.app.PendingIntent r3) {
                    r2 = this;
                    java.lang.String r0 = r2.mShortcutId
                    if (r0 != 0) goto L11
                    if (r3 == 0) goto L9
                    r2.mPendingIntent = r3
                    return r2
                L9:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Bubble requires non-null pending intent"
                    r0.<init>(r1)
                    throw r0
                L11:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setSuppressNotification(boolean r2) {
                    r1 = this;
                    r0 = 2
                    r1.setFlag(r0, r2)
                    return r1
            }
        }

        private BubbleMetadata(android.app.PendingIntent r1, android.app.PendingIntent r2, androidx.core.graphics.drawable.IconCompat r3, int r4, int r5, int r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.mPendingIntent = r1
                r0.mIcon = r3
                r0.mDesiredHeight = r4
                r0.mDesiredHeightResId = r5
                r0.mDeleteIntent = r2
                r0.mFlags = r6
                r0.mShortcutId = r7
                return
        }

        /* synthetic */ BubbleMetadata(android.app.PendingIntent r1, android.app.PendingIntent r2, androidx.core.graphics.drawable.IconCompat r3, int r4, int r5, int r6, java.lang.String r7, androidx.core.app.NotificationCompat.AnonymousClass1 r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto Lf
                androidx.core.app.NotificationCompat$BubbleMetadata r0 = androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.fromPlatform(r3)
                return r0
            Lf:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 != r2) goto L1a
                androidx.core.app.NotificationCompat$BubbleMetadata r0 = androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.fromPlatform(r3)
                return r0
            L1a:
                return r0
        }

        public static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto Lf
                android.app.Notification$BubbleMetadata r0 = androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.toPlatform(r3)
                return r0
            Lf:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 != r2) goto L1a
                android.app.Notification$BubbleMetadata r0 = androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.toPlatform(r3)
                return r0
            L1a:
                return r0
        }

        public boolean getAutoExpandBubble() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public android.app.PendingIntent getDeleteIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mDeleteIntent
                return r0
        }

        public int getDesiredHeight() {
                r1 = this;
                int r0 = r1.mDesiredHeight
                return r0
        }

        public int getDesiredHeightResId() {
                r1 = this;
                int r0 = r1.mDesiredHeightResId
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getIcon() {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
                return r0
        }

        public android.app.PendingIntent getIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mPendingIntent
                return r0
        }

        public java.lang.String getShortcutId() {
                r1 = this;
                java.lang.String r0 = r1.mShortcutId
                return r0
        }

        public boolean isNotificationSuppressed() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public void setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        android.widget.RemoteViews mBigContentView;
        androidx.core.app.NotificationCompat.BubbleMetadata mBubbleMetadata;
        java.lang.String mCategory;
        java.lang.String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        java.lang.CharSequence mContentInfo;
        android.app.PendingIntent mContentIntent;
        java.lang.CharSequence mContentText;
        java.lang.CharSequence mContentTitle;
        android.widget.RemoteViews mContentView;
        public android.content.Context mContext;
        android.os.Bundle mExtras;
        int mFgsDeferBehavior;
        android.app.PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        java.lang.String mGroupKey;
        boolean mGroupSummary;
        android.widget.RemoteViews mHeadsUpContentView;
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mInvisibleActions;
        androidx.core.graphics.drawable.IconCompat mLargeIcon;
        boolean mLocalOnly;
        androidx.core.content.LocusIdCompat mLocusId;
        android.app.Notification mNotification;
        int mNumber;

        @java.lang.Deprecated
        public java.util.ArrayList<java.lang.String> mPeople;
        public java.util.ArrayList<androidx.core.app.Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        android.app.Notification mPublicVersion;
        java.lang.CharSequence[] mRemoteInputHistory;
        java.lang.CharSequence mSettingsText;
        java.lang.String mShortCriticalText;
        java.lang.String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        java.lang.Object mSmallIcon;
        java.lang.String mSortKey;
        androidx.core.app.NotificationCompat.Style mStyle;
        java.lang.CharSequence mSubText;
        android.widget.RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        static class Api21Impl {
            private Api21Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.media.AudioAttributes build(android.media.AudioAttributes.Builder r1) {
                    android.media.AudioAttributes r0 = r1.build()
                    return r0
            }

            static android.media.AudioAttributes.Builder createBuilder() {
                    android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                    r0.<init>()
                    return r0
            }

            static android.media.AudioAttributes.Builder setContentType(android.media.AudioAttributes.Builder r1, int r2) {
                    android.media.AudioAttributes$Builder r0 = r1.setContentType(r2)
                    return r0
            }

            static android.media.AudioAttributes.Builder setLegacyStreamType(android.media.AudioAttributes.Builder r1, int r2) {
                    android.media.AudioAttributes$Builder r0 = r1.setLegacyStreamType(r2)
                    return r0
            }

            static android.media.AudioAttributes.Builder setUsage(android.media.AudioAttributes.Builder r1, int r2) {
                    android.media.AudioAttributes$Builder r0 = r1.setUsage(r2)
                    return r0
            }
        }

        static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.graphics.drawable.Icon getLargeIcon(android.app.Notification r1) {
                    android.graphics.drawable.Icon r0 = r1.getLargeIcon()
                    return r0
            }

            static android.graphics.drawable.Icon getSmallIcon(android.app.Notification r1) {
                    android.graphics.drawable.Icon r0 = r1.getSmallIcon()
                    return r0
            }
        }

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.widget.RemoteViews createBigContentView(android.app.Notification.Builder r1) {
                    android.widget.RemoteViews r0 = r1.createHeadsUpContentView()
                    return r0
            }

            static android.widget.RemoteViews createContentView(android.app.Notification.Builder r1) {
                    android.widget.RemoteViews r0 = r1.createContentView()
                    return r0
            }

            static android.widget.RemoteViews createHeadsUpContentView(android.app.Notification.Builder r1) {
                    android.widget.RemoteViews r0 = r1.createHeadsUpContentView()
                    return r0
            }

            static android.app.Notification.Builder recoverBuilder(android.content.Context r1, android.app.Notification r2) {
                    android.app.Notification$Builder r0 = android.app.Notification.Builder.recoverBuilder(r1, r2)
                    return r0
            }
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r3) {
                r2 = this;
                r0 = 0
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                r2.<init>(r3, r0)
                return
        }

        public Builder(android.content.Context r9, android.app.Notification r10) {
                r8 = this;
                java.lang.String r0 = androidx.core.app.NotificationCompat.getChannelId(r10)
                r8.<init>(r9, r0)
                android.os.Bundle r0 = r10.extras
                androidx.core.app.NotificationCompat$Style r1 = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(r10)
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.getContentTitle(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r8.setContentTitle(r2)
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.getContentText(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setContentText(r3)
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.getContentInfo(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setContentInfo(r3)
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.getSubText(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setSubText(r3)
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.getSettingsText(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setSettingsText(r3)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setStyle(r1)
                java.lang.String r3 = androidx.core.app.NotificationCompat.getGroup(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setGroup(r3)
                boolean r3 = androidx.core.app.NotificationCompat.isGroupSummary(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setGroupSummary(r3)
                androidx.core.content.LocusIdCompat r3 = androidx.core.app.NotificationCompat.getLocusId(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setLocusId(r3)
                long r3 = r10.when
                androidx.core.app.NotificationCompat$Builder r2 = r2.setWhen(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getShowWhen(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setShowWhen(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getUsesChronometer(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setUsesChronometer(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getAutoCancel(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setAutoCancel(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getOnlyAlertOnce(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setOnlyAlertOnce(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getOngoing(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setOngoing(r3)
                boolean r3 = androidx.core.app.NotificationCompat.getLocalOnly(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setLocalOnly(r3)
                android.graphics.Bitmap r3 = r10.largeIcon
                androidx.core.app.NotificationCompat$Builder r2 = r2.setLargeIcon(r3)
                int r3 = androidx.core.app.NotificationCompat.getBadgeIconType(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setBadgeIconType(r3)
                java.lang.String r3 = androidx.core.app.NotificationCompat.getCategory(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setCategory(r3)
                androidx.core.app.NotificationCompat$BubbleMetadata r3 = androidx.core.app.NotificationCompat.getBubbleMetadata(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setBubbleMetadata(r3)
                int r3 = r10.number
                androidx.core.app.NotificationCompat$Builder r2 = r2.setNumber(r3)
                java.lang.CharSequence r3 = r10.tickerText
                androidx.core.app.NotificationCompat$Builder r2 = r2.setTicker(r3)
                android.app.PendingIntent r3 = r10.contentIntent
                androidx.core.app.NotificationCompat$Builder r2 = r2.setContentIntent(r3)
                android.app.PendingIntent r3 = r10.deleteIntent
                androidx.core.app.NotificationCompat$Builder r2 = r2.setDeleteIntent(r3)
                android.app.PendingIntent r3 = r10.fullScreenIntent
                boolean r4 = androidx.core.app.NotificationCompat.getHighPriority(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setFullScreenIntent(r3, r4)
                android.net.Uri r3 = r10.sound
                int r4 = r10.audioStreamType
                androidx.core.app.NotificationCompat$Builder r2 = r2.setSound(r3, r4)
                long[] r3 = r10.vibrate
                androidx.core.app.NotificationCompat$Builder r2 = r2.setVibrate(r3)
                int r3 = r10.ledARGB
                int r4 = r10.ledOnMS
                int r5 = r10.ledOffMS
                androidx.core.app.NotificationCompat$Builder r2 = r2.setLights(r3, r4, r5)
                int r3 = r10.defaults
                androidx.core.app.NotificationCompat$Builder r2 = r2.setDefaults(r3)
                int r3 = r10.priority
                androidx.core.app.NotificationCompat$Builder r2 = r2.setPriority(r3)
                int r3 = androidx.core.app.NotificationCompat.getColor(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setColor(r3)
                int r3 = androidx.core.app.NotificationCompat.getVisibility(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setVisibility(r3)
                android.app.Notification r3 = androidx.core.app.NotificationCompat.getPublicVersion(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setPublicVersion(r3)
                java.lang.String r3 = androidx.core.app.NotificationCompat.getSortKey(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setSortKey(r3)
                long r3 = androidx.core.app.NotificationCompat.getTimeoutAfter(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setTimeoutAfter(r3)
                java.lang.String r3 = androidx.core.app.NotificationCompat.getShortcutId(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setShortcutId(r3)
                java.lang.String r3 = "android.progressMax"
                int r3 = r0.getInt(r3)
                java.lang.String r4 = "android.progress"
                int r4 = r0.getInt(r4)
                java.lang.String r5 = "android.progressIndeterminate"
                boolean r5 = r0.getBoolean(r5)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setProgress(r3, r4, r5)
                boolean r3 = androidx.core.app.NotificationCompat.getAllowSystemGeneratedContextualActions(r10)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setAllowSystemGeneratedContextualActions(r3)
                int r3 = r10.icon
                int r4 = r10.iconLevel
                androidx.core.app.NotificationCompat$Builder r2 = r2.setSmallIcon(r3, r4)
                android.os.Bundle r3 = getExtrasWithoutDuplicateData(r10, r1)
                r2.addExtras(r3)
                android.graphics.drawable.Icon r2 = androidx.core.app.NotificationCompat.Builder.Api23Impl.getSmallIcon(r10)
                r8.mSmallIcon = r2
                android.graphics.drawable.Icon r2 = androidx.core.app.NotificationCompat.Builder.Api23Impl.getLargeIcon(r10)
                if (r2 == 0) goto L15b
                androidx.core.graphics.drawable.IconCompat r3 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
                r8.mLargeIcon = r3
            L15b:
                android.app.Notification$Action[] r2 = r10.actions
                r3 = 0
                if (r2 == 0) goto L17b
                android.app.Notification$Action[] r2 = r10.actions
                int r2 = r2.length
                if (r2 == 0) goto L17b
                android.app.Notification$Action[] r2 = r10.actions
                int r4 = r2.length
                r5 = r3
            L169:
                if (r5 >= r4) goto L17b
                r6 = r2[r5]
                androidx.core.app.NotificationCompat$Action$Builder r7 = androidx.core.app.NotificationCompat.Action.Builder.fromAndroidAction(r6)
                androidx.core.app.NotificationCompat$Action r7 = r7.build()
                r8.addAction(r7)
                int r5 = r5 + 1
                goto L169
            L17b:
                java.util.List r2 = androidx.core.app.NotificationCompat.getInvisibleActions(r10)
                boolean r4 = r2.isEmpty()
                if (r4 != 0) goto L19b
                java.util.Iterator r4 = r2.iterator()
            L18b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L19b
                java.lang.Object r5 = r4.next()
                androidx.core.app.NotificationCompat$Action r5 = (androidx.core.app.NotificationCompat.Action) r5
                r8.addInvisibleAction(r5)
                goto L18b
            L19b:
                android.os.Bundle r2 = r10.extras
                java.lang.String r4 = "android.people"
                java.lang.String[] r2 = r2.getStringArray(r4)
                if (r2 == 0) goto L1b3
                int r4 = r2.length
                if (r4 == 0) goto L1b3
                int r4 = r2.length
            L1a9:
                if (r3 >= r4) goto L1b3
                r5 = r2[r3]
                r8.addPerson(r5)
                int r3 = r3 + 1
                goto L1a9
            L1b3:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 28
                if (r3 < r4) goto L1e1
                android.os.Bundle r3 = r10.extras
                java.lang.String r4 = "android.people.list"
                java.util.ArrayList r3 = r3.getParcelableArrayList(r4)
                if (r3 == 0) goto L1e1
                boolean r4 = r3.isEmpty()
                if (r4 != 0) goto L1e1
                java.util.Iterator r4 = r3.iterator()
            L1cd:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L1e1
                java.lang.Object r5 = r4.next()
                android.app.Person r5 = (android.app.Person) r5
                androidx.core.app.Person r6 = androidx.core.app.Person.fromAndroidPerson(r5)
                r8.addPerson(r6)
                goto L1cd
            L1e1:
                java.lang.String r3 = "android.chronometerCountDown"
                boolean r4 = r0.containsKey(r3)
                if (r4 == 0) goto L1f2
            L1eb:
                boolean r3 = r0.getBoolean(r3)
                r8.setChronometerCountDown(r3)
            L1f2:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 26
                if (r3 < r4) goto L207
                java.lang.String r3 = "android.colorized"
                boolean r4 = r0.containsKey(r3)
                if (r4 == 0) goto L207
                boolean r3 = r0.getBoolean(r3)
                r8.setColorized(r3)
            L207:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 36
                if (r3 < r4) goto L21c
                java.lang.String r3 = "android.shortCriticalText"
                boolean r4 = r0.containsKey(r3)
                if (r4 == 0) goto L21c
                java.lang.String r3 = r0.getString(r3)
                r8.setShortCriticalText(r3)
            L21c:
                return
        }

        public Builder(android.content.Context r6, java.lang.String r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mActions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mPersonList = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mInvisibleActions = r0
                r0 = 1
                r5.mShowWhen = r0
                r1 = 0
                r5.mLocalOnly = r1
                r5.mColor = r1
                r5.mVisibility = r1
                r5.mBadgeIcon = r1
                r5.mGroupAlertBehavior = r1
                r5.mFgsDeferBehavior = r1
                android.app.Notification r2 = new android.app.Notification
                r2.<init>()
                r5.mNotification = r2
                r5.mContext = r6
                r5.mChannelId = r7
                android.app.Notification r2 = r5.mNotification
                long r3 = java.lang.System.currentTimeMillis()
                r2.when = r3
                android.app.Notification r2 = r5.mNotification
                r3 = -1
                r2.audioStreamType = r3
                r5.mPriority = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5.mPeople = r1
                r5.mAllowSystemGeneratedContextualActions = r0
                return
        }

        private static android.os.Bundle getExtrasWithoutDuplicateData(android.app.Notification r4, androidx.core.app.NotificationCompat.Style r5) {
                android.os.Bundle r0 = r4.extras
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                android.os.Bundle r0 = new android.os.Bundle
                android.os.Bundle r1 = r4.extras
                r0.<init>(r1)
                java.lang.String r1 = "android.title"
                r0.remove(r1)
                java.lang.String r1 = "android.text"
                r0.remove(r1)
                java.lang.String r1 = "android.infoText"
                r0.remove(r1)
                java.lang.String r1 = "android.subText"
                r0.remove(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 36
                if (r1 < r2) goto L2c
                java.lang.String r1 = "android.shortCriticalText"
                r0.remove(r1)
            L2c:
                java.lang.String r1 = "android.intent.extra.CHANNEL_ID"
                r0.remove(r1)
                java.lang.String r1 = "android.intent.extra.CHANNEL_GROUP_ID"
                r0.remove(r1)
                java.lang.String r1 = "android.showWhen"
                r0.remove(r1)
                java.lang.String r1 = "android.progress"
                r0.remove(r1)
                java.lang.String r1 = "android.progressMax"
                r0.remove(r1)
                java.lang.String r1 = "android.progressIndeterminate"
                r0.remove(r1)
                java.lang.String r1 = "android.chronometerCountDown"
                r0.remove(r1)
                java.lang.String r1 = "android.colorized"
                r0.remove(r1)
                java.lang.String r1 = "android.people.list"
                r0.remove(r1)
                java.lang.String r1 = "android.people"
                r0.remove(r1)
                java.lang.String r1 = "android.support.sortKey"
                r0.remove(r1)
                java.lang.String r1 = "android.support.groupKey"
                r0.remove(r1)
                java.lang.String r1 = "android.support.isGroupSummary"
                r0.remove(r1)
                java.lang.String r1 = "android.support.localOnly"
                r0.remove(r1)
                java.lang.String r1 = "android.support.actionExtras"
                r0.remove(r1)
                java.lang.String r1 = "android.car.EXTENSIONS"
                android.os.Bundle r2 = r0.getBundle(r1)
                if (r2 == 0) goto L8d
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>(r2)
                r2 = r3
                java.lang.String r3 = "invisible_actions"
                r2.remove(r3)
                r0.putBundle(r1, r2)
            L8d:
                if (r5 == 0) goto L92
                r5.clearCompatExtraKeys(r0)
            L92:
                return r0
        }

        protected static java.lang.CharSequence limitCharSequenceLength(java.lang.CharSequence r2) {
                if (r2 != 0) goto L3
                return r2
            L3:
                int r0 = r2.length()
                r1 = 5120(0x1400, float:7.175E-42)
                if (r0 <= r1) goto L10
                r0 = 0
                java.lang.CharSequence r2 = r2.subSequence(r0, r1)
            L10:
                return r2
        }

        private void setFlag(int r4, boolean r5) {
                r3 = this;
                if (r5 == 0) goto La
                android.app.Notification r0 = r3.mNotification
                int r1 = r0.flags
                r1 = r1 | r4
                r0.flags = r1
                goto L12
            La:
                android.app.Notification r0 = r3.mNotification
                int r1 = r0.flags
                int r2 = ~r4
                r1 = r1 & r2
                r0.flags = r1
            L12:
                return
        }

        private boolean useExistingRemoteView() {
                r1 = this;
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == 0) goto Lf
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                boolean r0 = r0.displayCustomViewInline()
                if (r0 != 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder addAction(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r2.mActions
                androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder addAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.add(r2)
            L7:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addExtras(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L13
                android.os.Bundle r0 = r1.mExtras
                if (r0 != 0) goto Le
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>(r2)
                r1.mExtras = r0
                goto L13
            Le:
                android.os.Bundle r0 = r1.mExtras
                r0.putAll(r2)
            L13:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r2.mInvisibleActions
                androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mInvisibleActions
                r0.add(r2)
            L7:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addPerson(androidx.core.app.Person r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.Person> r0 = r1.mPersonList
                r0.add(r2)
            L7:
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder addPerson(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto Ld
                java.util.ArrayList<java.lang.String> r0 = r1.mPeople
                r0.add(r2)
            Ld:
                return r1
        }

        public android.app.Notification build() {
                r1 = this;
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r1)
                android.app.Notification r0 = r0.build()
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder clearActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.clear()
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder clearInvisibleActions() {
                r3 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r3.mInvisibleActions
                r0.clear()
                android.os.Bundle r0 = r3.mExtras
                java.lang.String r1 = "android.car.EXTENSIONS"
                android.os.Bundle r0 = r0.getBundle(r1)
                if (r0 == 0) goto L1f
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r0)
                r0 = r2
                java.lang.String r2 = "invisible_actions"
                r0.remove(r2)
                android.os.Bundle r2 = r3.mExtras
                r2.putBundle(r1, r0)
            L1f:
                return r3
        }

        public androidx.core.app.NotificationCompat.Builder clearPeople() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.Person> r0 = r1.mPersonList
                r0.clear()
                java.util.ArrayList<java.lang.String> r0 = r1.mPeople
                r0.clear()
                return r1
        }

        public android.widget.RemoteViews createBigContentView() {
                r3 = this;
                android.widget.RemoteViews r0 = r3.mBigContentView
                if (r0 == 0) goto Ld
                boolean r0 = r3.useExistingRemoteView()
                if (r0 == 0) goto Ld
                android.widget.RemoteViews r0 = r3.mBigContentView
                return r0
            Ld:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r3)
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                if (r1 == 0) goto L1f
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                android.widget.RemoteViews r1 = r1.makeBigContentView(r0)
                if (r1 == 0) goto L1f
                return r1
            L1f:
                android.app.Notification r1 = r0.build()
                android.content.Context r2 = r3.mContext
                android.app.Notification$Builder r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.recoverBuilder(r2, r1)
                android.widget.RemoteViews r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.createBigContentView(r2)
                return r2
        }

        public android.widget.RemoteViews createContentView() {
                r3 = this;
                android.widget.RemoteViews r0 = r3.mContentView
                if (r0 == 0) goto Ld
                boolean r0 = r3.useExistingRemoteView()
                if (r0 == 0) goto Ld
                android.widget.RemoteViews r0 = r3.mContentView
                return r0
            Ld:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r3)
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                if (r1 == 0) goto L1f
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                android.widget.RemoteViews r1 = r1.makeContentView(r0)
                if (r1 == 0) goto L1f
                return r1
            L1f:
                android.app.Notification r1 = r0.build()
                android.content.Context r2 = r3.mContext
                android.app.Notification$Builder r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.recoverBuilder(r2, r1)
                android.widget.RemoteViews r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.createContentView(r2)
                return r2
        }

        public android.widget.RemoteViews createHeadsUpContentView() {
                r3 = this;
                android.widget.RemoteViews r0 = r3.mHeadsUpContentView
                if (r0 == 0) goto Le
                boolean r0 = r3.useExistingRemoteView()
                if (r0 == 0) goto Le
                android.widget.RemoteViews r0 = r3.mHeadsUpContentView
                return r0
            Le:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r3)
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                if (r1 == 0) goto L20
                androidx.core.app.NotificationCompat$Style r1 = r3.mStyle
                android.widget.RemoteViews r1 = r1.makeHeadsUpContentView(r0)
                if (r1 == 0) goto L20
                return r1
            L20:
                android.app.Notification r1 = r0.build()
                android.content.Context r2 = r3.mContext
                android.app.Notification$Builder r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.recoverBuilder(r2, r1)
                android.widget.RemoteViews r2 = androidx.core.app.NotificationCompat.Builder.Api24Impl.createHeadsUpContentView(r2)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Extender r1) {
                r0 = this;
                r1.extend(r0)
                return r0
        }

        public android.widget.RemoteViews getBigContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mBigContentView
                return r0
        }

        public androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata() {
                r1 = this;
                androidx.core.app.NotificationCompat$BubbleMetadata r0 = r1.mBubbleMetadata
                return r0
        }

        public int getColor() {
                r1 = this;
                int r0 = r1.mColor
                return r0
        }

        public android.widget.RemoteViews getContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mContentView
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                if (r0 != 0) goto Lb
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mExtras = r0
            Lb:
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public int getForegroundServiceBehavior() {
                r1 = this;
                int r0 = r1.mFgsDeferBehavior
                return r0
        }

        public android.widget.RemoteViews getHeadsUpContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mHeadsUpContentView
                return r0
        }

        @java.lang.Deprecated
        public android.app.Notification getNotification() {
                r1 = this;
                android.app.Notification r0 = r1.build()
                return r0
        }

        public int getPriority() {
                r1 = this;
                int r0 = r1.mPriority
                return r0
        }

        public long getWhenIfShowing() {
                r2 = this;
                boolean r0 = r2.mShowWhen
                if (r0 == 0) goto L9
                android.app.Notification r0 = r2.mNotification
                long r0 = r0.when
                goto Lb
            L9:
                r0 = 0
            Lb:
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setAllowSystemGeneratedContextualActions(boolean r1) {
                r0 = this;
                r0.mAllowSystemGeneratedContextualActions = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean r2) {
                r1 = this;
                r0 = 16
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setBadgeIconType(int r1) {
                r0 = this;
                r0.mBadgeIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata r1) {
                r0 = this;
                r0.mBubbleMetadata = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCategory(java.lang.String r1) {
                r0 = this;
                r0.mCategory = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setChannelId(java.lang.String r1) {
                r0 = this;
                r0.mChannelId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setChronometerCountDown(boolean r3) {
                r2 = this;
                r2.mChronometerCountDown = r3
                android.os.Bundle r0 = r2.getExtras()
                java.lang.String r1 = "android.chronometerCountDown"
                r0.putBoolean(r1, r3)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setColor(int r1) {
                r0 = this;
                r0.mColor = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setColorized(boolean r2) {
                r1 = this;
                r1.mColorized = r2
                r0 = 1
                r1.mColorizedSet = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setContent(android.widget.RemoteViews r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.contentView = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setContentInfo(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = limitCharSequenceLength(r2)
                r1.mContentInfo = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setContentIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mContentIntent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = limitCharSequenceLength(r2)
                r1.mContentText = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setContentTitle(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = limitCharSequenceLength(r2)
                r1.mContentTitle = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setCustomBigContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mBigContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCustomContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCustomHeadsUpContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mHeadsUpContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setDefaults(int r3) {
                r2 = this;
                android.app.Notification r0 = r2.mNotification
                r0.defaults = r3
                r0 = r3 & 4
                if (r0 == 0) goto L10
                android.app.Notification r0 = r2.mNotification
                int r1 = r0.flags
                r1 = r1 | 1
                r0.flags = r1
            L10:
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(android.app.PendingIntent r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.deleteIntent = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setForegroundServiceBehavior(int r1) {
                r0 = this;
                r0.mFgsDeferBehavior = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setFullScreenIntent(android.app.PendingIntent r2, boolean r3) {
                r1 = this;
                r1.mFullScreenIntent = r2
                r0 = 128(0x80, float:1.8E-43)
                r1.setFlag(r0, r3)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setGroup(java.lang.String r1) {
                r0 = this;
                r0.mGroupKey = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setGroupAlertBehavior(int r1) {
                r0 = this;
                r0.mGroupAlertBehavior = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setGroupSummary(boolean r1) {
                r0 = this;
                r0.mGroupSummary = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.Bitmap r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto Le
            L4:
                android.content.Context r0 = r1.mContext
                android.graphics.Bitmap r0 = androidx.core.app.NotificationCompat.reduceLargeIconSize(r0, r2)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r0)
            Le:
                r1.mLargeIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.drawable.Icon r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
            L8:
                r1.mLargeIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setLights(int r6, int r7, int r8) {
                r5 = this;
                android.app.Notification r0 = r5.mNotification
                r0.ledARGB = r6
                android.app.Notification r0 = r5.mNotification
                r0.ledOnMS = r7
                android.app.Notification r0 = r5.mNotification
                r0.ledOffMS = r8
                android.app.Notification r0 = r5.mNotification
                int r0 = r0.ledOnMS
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                android.app.Notification r0 = r5.mNotification
                int r0 = r0.ledOffMS
                if (r0 == 0) goto L1c
                r0 = r1
                goto L1d
            L1c:
                r0 = r2
            L1d:
                android.app.Notification r3 = r5.mNotification
                android.app.Notification r4 = r5.mNotification
                int r4 = r4.flags
                r4 = r4 & (-2)
                if (r0 == 0) goto L28
                goto L29
            L28:
                r1 = r2
            L29:
                r1 = r1 | r4
                r3.flags = r1
                return r5
        }

        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean r1) {
                r0 = this;
                r0.mLocalOnly = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLocusId(androidx.core.content.LocusIdCompat r1) {
                r0 = this;
                r0.mLocusId = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setNotificationSilent() {
                r1 = this;
                r0 = 1
                r1.mSilent = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setNumber(int r1) {
                r0 = this;
                r0.mNumber = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setOngoing(boolean r2) {
                r1 = this;
                r0 = 2
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setOnlyAlertOnce(boolean r2) {
                r1 = this;
                r0 = 8
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setPriority(int r1) {
                r0 = this;
                r0.mPriority = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setProgress(int r1, int r2, boolean r3) {
                r0 = this;
                r0.mProgressMax = r1
                r0.mProgress = r2
                r0.mProgressIndeterminate = r3
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setPublicVersion(android.app.Notification r1) {
                r0 = this;
                r0.mPublicVersion = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setRemoteInputHistory(java.lang.CharSequence[] r1) {
                r0 = this;
                r0.mRemoteInputHistory = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setRequestPromotedOngoing(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.getExtras()
                java.lang.String r1 = "android.requestPromotedOngoing"
                r0.putBoolean(r1, r3)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setSettingsText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = limitCharSequenceLength(r2)
                r1.mSettingsText = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setShortCriticalText(java.lang.String r3) {
                r2 = this;
                r2.mShortCriticalText = r3
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 36
                if (r0 >= r1) goto L11
                android.os.Bundle r0 = r2.getExtras()
                java.lang.String r1 = "android.shortCriticalText"
                r0.putString(r1, r3)
            L11:
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutId(java.lang.String r1) {
                r0 = this;
                r0.mShortcutId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutInfo(androidx.core.content.pm.ShortcutInfoCompat r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return r2
            L3:
                java.lang.String r0 = r3.getId()
                r2.mShortcutId = r0
                androidx.core.content.LocusIdCompat r0 = r2.mLocusId
                if (r0 != 0) goto L2b
                androidx.core.content.LocusIdCompat r0 = r3.getLocusId()
                if (r0 == 0) goto L1a
                androidx.core.content.LocusIdCompat r0 = r3.getLocusId()
                r2.mLocusId = r0
                goto L2b
            L1a:
                java.lang.String r0 = r3.getId()
                if (r0 == 0) goto L2b
                androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
                java.lang.String r1 = r3.getId()
                r0.<init>(r1)
                r2.mLocusId = r0
            L2b:
                java.lang.CharSequence r0 = r2.mContentTitle
                if (r0 != 0) goto L36
                java.lang.CharSequence r0 = r3.getShortLabel()
                r2.setContentTitle(r0)
            L36:
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setShowWhen(boolean r1) {
                r0 = this;
                r0.mShowWhen = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSilent(boolean r1) {
                r0 = this;
                r0.mSilent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.icon = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int r2, int r3) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.icon = r2
                android.app.Notification r0 = r1.mNotification
                r0.iconLevel = r3
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(androidx.core.graphics.drawable.IconCompat r2) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                android.graphics.drawable.Icon r0 = r2.toIcon(r0)
                r1.mSmallIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSortKey(java.lang.String r1) {
                r0 = this;
                r0.mSortKey = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri r4) {
                r3 = this;
                android.app.Notification r0 = r3.mNotification
                r0.sound = r4
                android.app.Notification r0 = r3.mNotification
                r1 = -1
                r0.audioStreamType = r1
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.createBuilder()
                r1 = 4
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.setContentType(r0, r1)
                r1 = 5
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.setUsage(r0, r1)
                android.app.Notification r1 = r3.mNotification
                android.media.AudioAttributes r2 = androidx.core.app.NotificationCompat.Builder.Api21Impl.build(r0)
                r1.audioAttributes = r2
                return r3
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri r4, int r5) {
                r3 = this;
                android.app.Notification r0 = r3.mNotification
                r0.sound = r4
                android.app.Notification r0 = r3.mNotification
                r0.audioStreamType = r5
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.createBuilder()
                r1 = 4
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.setContentType(r0, r1)
                android.media.AudioAttributes$Builder r0 = androidx.core.app.NotificationCompat.Builder.Api21Impl.setLegacyStreamType(r0, r5)
                android.app.Notification r1 = r3.mNotification
                android.media.AudioAttributes r2 = androidx.core.app.NotificationCompat.Builder.Api21Impl.build(r0)
                r1.audioAttributes = r2
                return r3
        }

        public androidx.core.app.NotificationCompat.Builder setStyle(androidx.core.app.NotificationCompat.Style r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == r2) goto Lf
                r1.mStyle = r2
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == 0) goto Lf
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                r0.setBuilder(r1)
            Lf:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSubText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = limitCharSequenceLength(r2)
                r1.mSubText = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence r3) {
                r2 = this;
                android.app.Notification r0 = r2.mNotification
                java.lang.CharSequence r1 = limitCharSequenceLength(r3)
                r0.tickerText = r1
                return r2
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence r3, android.widget.RemoteViews r4) {
                r2 = this;
                android.app.Notification r0 = r2.mNotification
                java.lang.CharSequence r1 = limitCharSequenceLength(r3)
                r0.tickerText = r1
                r2.mTickerView = r4
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setTimeoutAfter(long r1) {
                r0 = this;
                r0.mTimeout = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setUsesChronometer(boolean r1) {
                r0 = this;
                r0.mUseChronometer = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setVibrate(long[] r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.vibrate = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setVisibility(int r1) {
                r0 = this;
                r0.mVisibility = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setWhen(long r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.when = r2
                return r1
        }
    }

    public static class CallStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final java.lang.String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private java.lang.Integer mAnswerButtonColor;
        private android.app.PendingIntent mAnswerIntent;
        private int mCallType;
        private java.lang.Integer mDeclineButtonColor;
        private android.app.PendingIntent mDeclineIntent;
        private android.app.PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private androidx.core.app.Person mPerson;
        private androidx.core.graphics.drawable.IconCompat mVerificationIcon;
        private java.lang.CharSequence mVerificationText;

        static class Api20Impl {
            private Api20Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder r1, android.os.Bundle r2) {
                    android.app.Notification$Action$Builder r0 = r1.addExtras(r2)
                    return r0
            }

            static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder r1, android.app.RemoteInput r2) {
                    android.app.Notification$Action$Builder r0 = r1.addRemoteInput(r2)
                    return r0
            }

            static android.app.Notification.Action build(android.app.Notification.Action.Builder r1) {
                    android.app.Notification$Action r0 = r1.build()
                    return r0
            }

            static android.app.Notification.Action.Builder createActionBuilder(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                    android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                    r0.<init>(r1, r2, r3)
                    return r0
            }
        }

        static class Api21Impl {
            private Api21Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Builder addPerson(android.app.Notification.Builder r1, java.lang.String r2) {
                    android.app.Notification$Builder r0 = r1.addPerson(r2)
                    return r0
            }

            static android.app.Notification.Builder setCategory(android.app.Notification.Builder r1, java.lang.String r2) {
                    android.app.Notification$Builder r0 = r1.setCategory(r2)
                    return r0
            }
        }

        static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.os.Parcelable castToParcelable(android.graphics.drawable.Icon r0) {
                    return r0
            }

            static android.app.Notification.Action.Builder createActionBuilder(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                    android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            static void setLargeIcon(android.app.Notification.Builder r0, android.graphics.drawable.Icon r1) {
                    r0.setLargeIcon(r1)
                    return
            }
        }

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder r1, boolean r2) {
                    android.app.Notification$Action$Builder r0 = r1.setAllowGeneratedReplies(r2)
                    return r0
            }
        }

        static class Api28Impl {
            private Api28Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Builder addPerson(android.app.Notification.Builder r1, android.app.Person r2) {
                    android.app.Notification$Builder r0 = r1.addPerson(r2)
                    return r0
            }

            static android.os.Parcelable castToParcelable(android.app.Person r0) {
                    return r0
            }
        }

        static class Api31Impl {
            private Api31Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.CallStyle forIncomingCall(android.app.Person r1, android.app.PendingIntent r2, android.app.PendingIntent r3) {
                    android.app.Notification$CallStyle r0 = android.app.Notification.CallStyle.forIncomingCall(r1, r2, r3)
                    return r0
            }

            static android.app.Notification.CallStyle forOngoingCall(android.app.Person r1, android.app.PendingIntent r2) {
                    android.app.Notification$CallStyle r0 = android.app.Notification.CallStyle.forOngoingCall(r1, r2)
                    return r0
            }

            static android.app.Notification.CallStyle forScreeningCall(android.app.Person r1, android.app.PendingIntent r2, android.app.PendingIntent r3) {
                    android.app.Notification$CallStyle r0 = android.app.Notification.CallStyle.forScreeningCall(r1, r2, r3)
                    return r0
            }

            static android.app.Notification.CallStyle setAnswerButtonColorHint(android.app.Notification.CallStyle r1, int r2) {
                    android.app.Notification$CallStyle r0 = r1.setAnswerButtonColorHint(r2)
                    return r0
            }

            static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder r1, boolean r2) {
                    android.app.Notification$Action$Builder r0 = r1.setAuthenticationRequired(r2)
                    return r0
            }

            static android.app.Notification.CallStyle setDeclineButtonColorHint(android.app.Notification.CallStyle r1, int r2) {
                    android.app.Notification$CallStyle r0 = r1.setDeclineButtonColorHint(r2)
                    return r0
            }

            static android.app.Notification.CallStyle setIsVideo(android.app.Notification.CallStyle r1, boolean r2) {
                    android.app.Notification$CallStyle r0 = r1.setIsVideo(r2)
                    return r0
            }

            static android.app.Notification.CallStyle setVerificationIcon(android.app.Notification.CallStyle r1, android.graphics.drawable.Icon r2) {
                    android.app.Notification$CallStyle r0 = r1.setVerificationIcon(r2)
                    return r0
            }

            static android.app.Notification.CallStyle setVerificationText(android.app.Notification.CallStyle r1, java.lang.CharSequence r2) {
                    android.app.Notification$CallStyle r0 = r1.setVerificationText(r2)
                    return r0
            }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        public CallStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private CallStyle(int r3, androidx.core.app.Person r4, android.app.PendingIntent r5, android.app.PendingIntent r6, android.app.PendingIntent r7) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L1a
                java.lang.CharSequence r0 = r4.getName()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1a
                r2.mCallType = r3
                r2.mPerson = r4
                r2.mAnswerIntent = r7
                r2.mDeclineIntent = r6
                r2.mHangUpIntent = r5
                return
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "person must have a non-empty a name"
                r0.<init>(r1)
                throw r0
        }

        public CallStyle(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = this;
                r0.<init>()
                r0.setBuilder(r1)
                return
        }

        public static androidx.core.app.NotificationCompat.CallStyle forIncomingCall(androidx.core.app.Person r6, android.app.PendingIntent r7, android.app.PendingIntent r8) {
                androidx.core.app.NotificationCompat$CallStyle r0 = new androidx.core.app.NotificationCompat$CallStyle
                java.lang.String r1 = "declineIntent is required"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r7, r1)
                r4 = r1
                android.app.PendingIntent r4 = (android.app.PendingIntent) r4
                java.lang.String r1 = "answerIntent is required"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r8, r1)
                r5 = r1
                android.app.PendingIntent r5 = (android.app.PendingIntent) r5
                r1 = 1
                r3 = 0
                r2 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public static androidx.core.app.NotificationCompat.CallStyle forOngoingCall(androidx.core.app.Person r6, android.app.PendingIntent r7) {
                androidx.core.app.NotificationCompat$CallStyle r0 = new androidx.core.app.NotificationCompat$CallStyle
                java.lang.String r1 = "hangUpIntent is required"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r7, r1)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
                r4 = 0
                r5 = 0
                r1 = 2
                r2 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public static androidx.core.app.NotificationCompat.CallStyle forScreeningCall(androidx.core.app.Person r6, android.app.PendingIntent r7, android.app.PendingIntent r8) {
                androidx.core.app.NotificationCompat$CallStyle r0 = new androidx.core.app.NotificationCompat$CallStyle
                java.lang.String r1 = "hangUpIntent is required"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r7, r1)
                r3 = r1
                android.app.PendingIntent r3 = (android.app.PendingIntent) r3
                java.lang.String r1 = "answerIntent is required"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r8, r1)
                r5 = r1
                android.app.PendingIntent r5 = (android.app.PendingIntent) r5
                r1 = 3
                r4 = 0
                r2 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        private java.lang.String getDefaultText() {
                r2 = this;
                int r0 = r2.mCallType
                switch(r0) {
                    case 1: goto L25;
                    case 2: goto L16;
                    case 3: goto L7;
                    default: goto L5;
                }
            L5:
                r0 = 0
                return r0
            L7:
                androidx.core.app.NotificationCompat$Builder r0 = r2.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.R.string.call_notification_screening_text
                java.lang.String r0 = r0.getString(r1)
                return r0
            L16:
                androidx.core.app.NotificationCompat$Builder r0 = r2.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.R.string.call_notification_ongoing_text
                java.lang.String r0 = r0.getString(r1)
                return r0
            L25:
                androidx.core.app.NotificationCompat$Builder r0 = r2.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.R.string.call_notification_incoming_text
                java.lang.String r0 = r0.getString(r1)
                return r0
        }

        private boolean isActionAddedByCallStyle(androidx.core.app.NotificationCompat.Action r3) {
                r2 = this;
                if (r3 == 0) goto L10
                android.os.Bundle r0 = r3.getExtras()
                java.lang.String r1 = "key_action_priority"
                boolean r0 = r0.getBoolean(r1)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        private androidx.core.app.NotificationCompat.Action makeAction(int r6, int r7, java.lang.Integer r8, int r9, android.app.PendingIntent r10) {
                r5 = this;
                if (r8 != 0) goto Le
                androidx.core.app.NotificationCompat$Builder r0 = r5.mBuilder
                android.content.Context r0 = r0.mContext
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            Le:
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                androidx.core.app.NotificationCompat$Builder r1 = r5.mBuilder
                android.content.Context r1 = r1.mContext
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r1 = r1.getString(r7)
                r0.append(r1)
                android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
                int r2 = r8.intValue()
                r1.<init>(r2)
                int r2 = r0.length()
                r3 = 18
                r4 = 0
                r0.setSpan(r1, r4, r2, r3)
                androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
                androidx.core.app.NotificationCompat$Builder r2 = r5.mBuilder
                android.content.Context r2 = r2.mContext
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithResource(r2, r6)
                r1.<init>(r2, r0, r10)
                androidx.core.app.NotificationCompat$Action r1 = r1.build()
                android.os.Bundle r2 = r1.getExtras()
                java.lang.String r3 = "key_action_priority"
                r4 = 1
                r2.putBoolean(r3, r4)
                return r1
        }

        private androidx.core.app.NotificationCompat.Action makeAnswerAction() {
                r9 = this;
                int r0 = androidx.core.R.drawable.ic_call_answer_video_low
                int r1 = androidx.core.R.drawable.ic_call_answer_low
                int r0 = androidx.core.R.drawable.ic_call_answer_video
                int r1 = androidx.core.R.drawable.ic_call_answer
                android.app.PendingIntent r2 = r9.mAnswerIntent
                if (r2 != 0) goto Lf
                r2 = 0
                goto L2c
            Lf:
                boolean r2 = r9.mIsVideo
                if (r2 == 0) goto L15
                r4 = r0
                goto L16
            L15:
                r4 = r1
            L16:
                boolean r2 = r9.mIsVideo
                if (r2 == 0) goto L1e
                int r2 = androidx.core.R.string.call_notification_answer_video_action
                r5 = r2
                goto L21
            L1e:
                int r2 = androidx.core.R.string.call_notification_answer_action
                r5 = r2
            L21:
                java.lang.Integer r6 = r9.mAnswerButtonColor
                int r7 = androidx.core.R.color.call_notification_answer_color
                android.app.PendingIntent r8 = r9.mAnswerIntent
                r3 = r9
                androidx.core.app.NotificationCompat$Action r2 = r3.makeAction(r4, r5, r6, r7, r8)
            L2c:
                return r2
        }

        private androidx.core.app.NotificationCompat.Action makeNegativeAction() {
                r7 = this;
                int r0 = androidx.core.R.drawable.ic_call_decline_low
                int r2 = androidx.core.R.drawable.ic_call_decline
                android.app.PendingIntent r0 = r7.mDeclineIntent
                if (r0 != 0) goto L17
                int r3 = androidx.core.R.string.call_notification_hang_up_action
                java.lang.Integer r4 = r7.mDeclineButtonColor
                int r5 = androidx.core.R.color.call_notification_decline_color
                android.app.PendingIntent r6 = r7.mHangUpIntent
                r1 = r7
                androidx.core.app.NotificationCompat$Action r0 = r1.makeAction(r2, r3, r4, r5, r6)
                return r0
            L17:
                r1 = r7
                int r3 = androidx.core.R.string.call_notification_decline_action
                java.lang.Integer r4 = r1.mDeclineButtonColor
                int r5 = androidx.core.R.color.call_notification_decline_color
                android.app.PendingIntent r6 = r1.mDeclineIntent
                androidx.core.app.NotificationCompat$Action r0 = r1.makeAction(r2, r3, r4, r5, r6)
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.addCompatExtras(r3)
                java.lang.String r0 = "android.callType"
                int r1 = r2.mCallType
                r3.putInt(r0, r1)
                java.lang.String r0 = "android.callIsVideo"
                boolean r1 = r2.mIsVideo
                r3.putBoolean(r0, r1)
                androidx.core.app.Person r0 = r2.mPerson
                if (r0 == 0) goto L36
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L2b
                androidx.core.app.Person r0 = r2.mPerson
                android.app.Person r0 = r0.toAndroidPerson()
                android.os.Parcelable r0 = androidx.core.app.NotificationCompat.CallStyle.Api28Impl.castToParcelable(r0)
                java.lang.String r1 = "android.callPerson"
                r3.putParcelable(r1, r0)
                goto L36
            L2b:
                androidx.core.app.Person r0 = r2.mPerson
                android.os.Bundle r0 = r0.toBundle()
                java.lang.String r1 = "android.callPersonCompat"
                r3.putParcelable(r1, r0)
            L36:
                androidx.core.graphics.drawable.IconCompat r0 = r2.mVerificationIcon
                if (r0 == 0) goto L4e
            L3b:
                androidx.core.graphics.drawable.IconCompat r0 = r2.mVerificationIcon
                androidx.core.app.NotificationCompat$Builder r1 = r2.mBuilder
                android.content.Context r1 = r1.mContext
                android.graphics.drawable.Icon r0 = r0.toIcon(r1)
                android.os.Parcelable r0 = androidx.core.app.NotificationCompat.CallStyle.Api23Impl.castToParcelable(r0)
                java.lang.String r1 = "android.verificationIcon"
                r3.putParcelable(r1, r0)
            L4e:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r1 = r2.mVerificationText
                r3.putCharSequence(r0, r1)
                java.lang.String r0 = "android.answerIntent"
                android.app.PendingIntent r1 = r2.mAnswerIntent
                r3.putParcelable(r0, r1)
                java.lang.String r0 = "android.declineIntent"
                android.app.PendingIntent r1 = r2.mDeclineIntent
                r3.putParcelable(r0, r1)
                java.lang.String r0 = "android.hangUpIntent"
                android.app.PendingIntent r1 = r2.mHangUpIntent
                r3.putParcelable(r0, r1)
                java.lang.Integer r0 = r2.mAnswerButtonColor
                if (r0 == 0) goto L79
                java.lang.Integer r0 = r2.mAnswerButtonColor
                int r0 = r0.intValue()
                java.lang.String r1 = "android.answerColor"
                r3.putInt(r1, r0)
            L79:
                java.lang.Integer r0 = r2.mDeclineButtonColor
                if (r0 == 0) goto L88
                java.lang.Integer r0 = r2.mDeclineButtonColor
                int r0 = r0.intValue()
                java.lang.String r1 = "android.declineColor"
                r3.putInt(r1, r0)
            L88:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r6) {
                r5 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L9d
                r0 = 0
                int r1 = r5.mCallType
                switch(r1) {
                    case 1: goto L4e;
                    case 2: goto L41;
                    case 3: goto L32;
                    default: goto Lc;
                }
            Lc:
                r1 = 3
                java.lang.String r2 = "NotifCompat"
                boolean r1 = android.util.Log.isLoggable(r2, r1)
                if (r1 == 0) goto L5d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unrecognized call type in CallStyle: "
                java.lang.StringBuilder r1 = r1.append(r3)
                int r3 = r5.mCallType
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r2, r1)
                goto L5d
            L32:
                androidx.core.app.Person r1 = r5.mPerson
                android.app.Person r1 = r1.toAndroidPerson()
                android.app.PendingIntent r2 = r5.mHangUpIntent
                android.app.PendingIntent r3 = r5.mAnswerIntent
                android.app.Notification$CallStyle r0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.forScreeningCall(r1, r2, r3)
                goto L5d
            L41:
                androidx.core.app.Person r1 = r5.mPerson
                android.app.Person r1 = r1.toAndroidPerson()
                android.app.PendingIntent r2 = r5.mHangUpIntent
                android.app.Notification$CallStyle r0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.forOngoingCall(r1, r2)
                goto L5d
            L4e:
                androidx.core.app.Person r1 = r5.mPerson
                android.app.Person r1 = r1.toAndroidPerson()
                android.app.PendingIntent r2 = r5.mDeclineIntent
                android.app.PendingIntent r3 = r5.mAnswerIntent
                android.app.Notification$CallStyle r0 = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.forIncomingCall(r1, r2, r3)
            L5d:
                if (r0 == 0) goto L9b
                android.app.Notification$Builder r1 = r6.getBuilder()
                r0.setBuilder(r1)
                java.lang.Integer r1 = r5.mAnswerButtonColor
                if (r1 == 0) goto L73
                java.lang.Integer r1 = r5.mAnswerButtonColor
                int r1 = r1.intValue()
                androidx.core.app.NotificationCompat.CallStyle.Api31Impl.setAnswerButtonColorHint(r0, r1)
            L73:
                java.lang.Integer r1 = r5.mDeclineButtonColor
                if (r1 == 0) goto L80
                java.lang.Integer r1 = r5.mDeclineButtonColor
                int r1 = r1.intValue()
                androidx.core.app.NotificationCompat.CallStyle.Api31Impl.setDeclineButtonColorHint(r0, r1)
            L80:
                java.lang.CharSequence r1 = r5.mVerificationText
                androidx.core.app.NotificationCompat.CallStyle.Api31Impl.setVerificationText(r0, r1)
                androidx.core.graphics.drawable.IconCompat r1 = r5.mVerificationIcon
                if (r1 == 0) goto L96
                androidx.core.graphics.drawable.IconCompat r1 = r5.mVerificationIcon
                androidx.core.app.NotificationCompat$Builder r2 = r5.mBuilder
                android.content.Context r2 = r2.mContext
                android.graphics.drawable.Icon r1 = r1.toIcon(r2)
                androidx.core.app.NotificationCompat.CallStyle.Api31Impl.setVerificationIcon(r0, r1)
            L96:
                boolean r1 = r5.mIsVideo
                androidx.core.app.NotificationCompat.CallStyle.Api31Impl.setIsVideo(r0, r1)
            L9b:
                goto L113
            L9d:
                android.app.Notification$Builder r0 = r6.getBuilder()
                androidx.core.app.Person r1 = r5.mPerson
                r2 = 0
                if (r1 == 0) goto Lad
                androidx.core.app.Person r1 = r5.mPerson
                java.lang.CharSequence r1 = r1.getName()
                goto Lae
            Lad:
                r1 = r2
            Lae:
                r0.setContentTitle(r1)
                androidx.core.app.NotificationCompat$Builder r3 = r5.mBuilder
                android.os.Bundle r3 = r3.mExtras
                if (r3 == 0) goto Lcc
                androidx.core.app.NotificationCompat$Builder r3 = r5.mBuilder
                android.os.Bundle r3 = r3.mExtras
                java.lang.String r4 = "android.text"
                boolean r3 = r3.containsKey(r4)
                if (r3 == 0) goto Lcc
                androidx.core.app.NotificationCompat$Builder r2 = r5.mBuilder
                android.os.Bundle r2 = r2.mExtras
                java.lang.CharSequence r2 = r2.getCharSequence(r4)
                goto Lcd
            Lcc:
            Lcd:
                if (r2 != 0) goto Ld3
                java.lang.String r2 = r5.getDefaultText()
            Ld3:
                r0.setContentText(r2)
                androidx.core.app.Person r3 = r5.mPerson
                if (r3 == 0) goto L10d
                androidx.core.app.Person r3 = r5.mPerson
                androidx.core.graphics.drawable.IconCompat r3 = r3.getIcon()
                if (r3 == 0) goto Lf3
                androidx.core.app.Person r3 = r5.mPerson
                androidx.core.graphics.drawable.IconCompat r3 = r3.getIcon()
                androidx.core.app.NotificationCompat$Builder r4 = r5.mBuilder
                android.content.Context r4 = r4.mContext
                android.graphics.drawable.Icon r3 = r3.toIcon(r4)
                androidx.core.app.NotificationCompat.CallStyle.Api23Impl.setLargeIcon(r0, r3)
            Lf3:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 28
                if (r3 < r4) goto L103
                androidx.core.app.Person r3 = r5.mPerson
                android.app.Person r3 = r3.toAndroidPerson()
                androidx.core.app.NotificationCompat.CallStyle.Api28Impl.addPerson(r0, r3)
                goto L10d
            L103:
                androidx.core.app.Person r3 = r5.mPerson
                java.lang.String r3 = r3.getUri()
                androidx.core.app.NotificationCompat.CallStyle.Api21Impl.addPerson(r0, r3)
            L10d:
                java.lang.String r3 = "call"
                androidx.core.app.NotificationCompat.CallStyle.Api21Impl.setCategory(r0, r3)
            L113:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 1
                return r0
        }

        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> getActionsListWithSystemActions() {
                r9 = this;
                androidx.core.app.NotificationCompat$Action r0 = r9.makeNegativeAction()
                androidx.core.app.NotificationCompat$Action r1 = r9.makeAnswerAction()
                r2 = 3
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 3
                r3.<init>(r4)
                if (r2 <= 0) goto L16
                r3.add(r0)
                int r2 = r2 + (-1)
            L16:
                androidx.core.app.NotificationCompat$Builder r4 = r9.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r4 = r4.mActions
                r5 = 1
                if (r4 == 0) goto L4d
                java.util.Iterator r6 = r4.iterator()
            L21:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L4d
                java.lang.Object r7 = r6.next()
                androidx.core.app.NotificationCompat$Action r7 = (androidx.core.app.NotificationCompat.Action) r7
                boolean r8 = r7.isContextual()
                if (r8 == 0) goto L37
                r3.add(r7)
                goto L43
            L37:
                boolean r8 = r9.isActionAddedByCallStyle(r7)
                if (r8 == 0) goto L3e
                goto L43
            L3e:
                r3.add(r7)
                int r2 = r2 + (-1)
            L43:
                if (r1 == 0) goto L4c
                if (r2 != r5) goto L4c
                r3.add(r1)
                int r2 = r2 + (-1)
            L4c:
                goto L21
            L4d:
                if (r1 == 0) goto L54
                if (r2 < r5) goto L54
                r3.add(r1)
            L54:
                return r3
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r4) {
                r3 = this;
                super.restoreFromCompatExtras(r4)
                java.lang.String r0 = "android.callType"
                int r0 = r4.getInt(r0)
                r3.mCallType = r0
                java.lang.String r0 = "android.callIsVideo"
                boolean r0 = r4.getBoolean(r0)
                r3.mIsVideo = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L2f
                java.lang.String r0 = "android.callPerson"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L2f
            L22:
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.Person r0 = (android.app.Person) r0
                androidx.core.app.Person r0 = androidx.core.app.Person.fromAndroidPerson(r0)
                r3.mPerson = r0
                goto L41
            L2f:
                java.lang.String r0 = "android.callPersonCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L41
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.app.Person r0 = androidx.core.app.Person.fromBundle(r0)
                r3.mPerson = r0
            L41:
                java.lang.String r0 = "android.verificationIcon"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L56
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r0)
                r3.mVerificationIcon = r0
                goto L69
            L56:
                java.lang.String r0 = "android.verificationIconCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L69
            L5f:
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromBundle(r0)
                r3.mVerificationIcon = r0
            L69:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r0 = r4.getCharSequence(r0)
                r3.mVerificationText = r0
                java.lang.String r0 = "android.answerIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.mAnswerIntent = r0
                java.lang.String r0 = "android.declineIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.mDeclineIntent = r0
                java.lang.String r0 = "android.hangUpIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.mHangUpIntent = r0
                java.lang.String r0 = "android.answerColor"
                boolean r1 = r4.containsKey(r0)
                r2 = 0
                if (r1 == 0) goto La1
                int r0 = r4.getInt(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto La2
            La1:
                r0 = r2
            La2:
                r3.mAnswerButtonColor = r0
                java.lang.String r0 = "android.declineColor"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto Lb5
                int r0 = r4.getInt(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                goto Lb6
            Lb5:
            Lb6:
                r3.mDeclineButtonColor = r2
                return
        }

        public androidx.core.app.NotificationCompat.CallStyle setAnswerButtonColorHint(int r2) {
                r1 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1.mAnswerButtonColor = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.CallStyle setDeclineButtonColorHint(int r2) {
                r1 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1.mDeclineButtonColor = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.CallStyle setIsVideo(boolean r1) {
                r0 = this;
                r0.mIsVideo = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationIcon(android.graphics.Bitmap r2) {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r2)
                r1.mVerificationIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationIcon(android.graphics.drawable.Icon r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
            L8:
                r1.mVerificationIcon = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mVerificationText = r1
                return r0
        }
    }

    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        static final java.lang.String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final java.lang.String EXTRA_COLOR = "app_color";
        private static final java.lang.String EXTRA_CONVERSATION = "car_conversation";
        static final java.lang.String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final java.lang.String EXTRA_LARGE_ICON = "large_icon";
        private static final java.lang.String KEY_AUTHOR = "author";
        private static final java.lang.String KEY_MESSAGES = "messages";
        private static final java.lang.String KEY_ON_READ = "on_read";
        private static final java.lang.String KEY_ON_REPLY = "on_reply";
        private static final java.lang.String KEY_PARTICIPANTS = "participants";
        private static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
        private static final java.lang.String KEY_TEXT = "text";
        private static final java.lang.String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private android.graphics.Bitmap mLargeIcon;
        private androidx.core.app.NotificationCompat.CarExtender.UnreadConversation mUnreadConversation;

        static class Api20Impl {
            private Api20Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.RemoteInput.Builder addExtras(android.app.RemoteInput.Builder r1, android.os.Bundle r2) {
                    android.app.RemoteInput$Builder r0 = r1.addExtras(r2)
                    return r0
            }

            static android.app.RemoteInput build(android.app.RemoteInput.Builder r1) {
                    android.app.RemoteInput r0 = r1.build()
                    return r0
            }

            static android.os.Parcelable castToParcelable(android.app.RemoteInput r0) {
                    return r0
            }

            static android.app.RemoteInput.Builder createBuilder(java.lang.String r1) {
                    android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
                    r0.<init>(r1)
                    return r0
            }

            static boolean getAllowFreeFormInput(android.app.RemoteInput r1) {
                    boolean r0 = r1.getAllowFreeFormInput()
                    return r0
            }

            static java.lang.CharSequence[] getChoices(android.app.RemoteInput r1) {
                    java.lang.CharSequence[] r0 = r1.getChoices()
                    return r0
            }

            static android.os.Bundle getExtras(android.app.RemoteInput r1) {
                    android.os.Bundle r0 = r1.getExtras()
                    return r0
            }

            static java.lang.CharSequence getLabel(android.app.RemoteInput r1) {
                    java.lang.CharSequence r0 = r1.getLabel()
                    return r0
            }

            static java.lang.String getResultKey(android.app.RemoteInput r1) {
                    java.lang.String r0 = r1.getResultKey()
                    return r0
            }

            static android.app.RemoteInput.Builder setAllowFreeFormInput(android.app.RemoteInput.Builder r1, boolean r2) {
                    android.app.RemoteInput$Builder r0 = r1.setAllowFreeFormInput(r2)
                    return r0
            }

            static android.app.RemoteInput.Builder setChoices(android.app.RemoteInput.Builder r1, java.lang.CharSequence[] r2) {
                    android.app.RemoteInput$Builder r0 = r1.setChoices(r2)
                    return r0
            }

            static android.app.RemoteInput.Builder setLabel(android.app.RemoteInput.Builder r1, java.lang.CharSequence r2) {
                    android.app.RemoteInput$Builder r0 = r1.setLabel(r2)
                    return r0
            }
        }

        static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static int getEditChoicesBeforeSending(android.app.RemoteInput r1) {
                    int r0 = r1.getEditChoicesBeforeSending()
                    return r0
            }
        }

        @java.lang.Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final java.lang.String[] mMessages;
            private final java.lang.String[] mParticipants;
            private final android.app.PendingIntent mReadPendingIntent;
            private final androidx.core.app.RemoteInput mRemoteInput;
            private final android.app.PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final java.util.List<java.lang.String> mMessages;
                private final java.lang.String mParticipant;
                private android.app.PendingIntent mReadPendingIntent;
                private androidx.core.app.RemoteInput mRemoteInput;
                private android.app.PendingIntent mReplyPendingIntent;

                public Builder(java.lang.String r2) {
                        r1 = this;
                        r1.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r1.mMessages = r0
                        r1.mParticipant = r2
                        return
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder addMessage(java.lang.String r2) {
                        r1 = this;
                        if (r2 == 0) goto L7
                        java.util.List<java.lang.String> r0 = r1.mMessages
                        r0.add(r2)
                    L7:
                        return r1
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation build() {
                        r9 = this;
                        java.util.List<java.lang.String> r0 = r9.mMessages
                        java.util.List<java.lang.String> r1 = r9.mMessages
                        int r1 = r1.size()
                        java.lang.String[] r1 = new java.lang.String[r1]
                        java.lang.Object[] r0 = r0.toArray(r1)
                        r2 = r0
                        java.lang.String[] r2 = (java.lang.String[]) r2
                        r0 = 1
                        java.lang.String[] r6 = new java.lang.String[r0]
                        r0 = 0
                        java.lang.String r1 = r9.mParticipant
                        r6[r0] = r1
                        androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r1 = new androidx.core.app.NotificationCompat$CarExtender$UnreadConversation
                        androidx.core.app.RemoteInput r3 = r9.mRemoteInput
                        android.app.PendingIntent r4 = r9.mReplyPendingIntent
                        android.app.PendingIntent r5 = r9.mReadPendingIntent
                        long r7 = r9.mLatestTimestamp
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        return r1
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setLatestTimestamp(long r1) {
                        r0 = this;
                        r0.mLatestTimestamp = r1
                        return r0
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReadPendingIntent(android.app.PendingIntent r1) {
                        r0 = this;
                        r0.mReadPendingIntent = r1
                        return r0
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReplyAction(android.app.PendingIntent r1, androidx.core.app.RemoteInput r2) {
                        r0 = this;
                        r0.mRemoteInput = r2
                        r0.mReplyPendingIntent = r1
                        return r0
                }
            }

            UnreadConversation(java.lang.String[] r1, androidx.core.app.RemoteInput r2, android.app.PendingIntent r3, android.app.PendingIntent r4, java.lang.String[] r5, long r6) {
                    r0 = this;
                    r0.<init>()
                    r0.mMessages = r1
                    r0.mRemoteInput = r2
                    r0.mReadPendingIntent = r4
                    r0.mReplyPendingIntent = r3
                    r0.mParticipants = r5
                    r0.mLatestTimestamp = r6
                    return
            }

            public long getLatestTimestamp() {
                    r2 = this;
                    long r0 = r2.mLatestTimestamp
                    return r0
            }

            public java.lang.String[] getMessages() {
                    r1 = this;
                    java.lang.String[] r0 = r1.mMessages
                    return r0
            }

            public java.lang.String getParticipant() {
                    r2 = this;
                    java.lang.String[] r0 = r2.mParticipants
                    int r0 = r0.length
                    if (r0 <= 0) goto Lb
                    java.lang.String[] r0 = r2.mParticipants
                    r1 = 0
                    r0 = r0[r1]
                    goto Lc
                Lb:
                    r0 = 0
                Lc:
                    return r0
            }

            public java.lang.String[] getParticipants() {
                    r1 = this;
                    java.lang.String[] r0 = r1.mParticipants
                    return r0
            }

            public android.app.PendingIntent getReadPendingIntent() {
                    r1 = this;
                    android.app.PendingIntent r0 = r1.mReadPendingIntent
                    return r0
            }

            public androidx.core.app.RemoteInput getRemoteInput() {
                    r1 = this;
                    androidx.core.app.RemoteInput r0 = r1.mRemoteInput
                    return r0
            }

            public android.app.PendingIntent getReplyPendingIntent() {
                    r1 = this;
                    android.app.PendingIntent r0 = r1.mReplyPendingIntent
                    return r0
            }
        }

        public CarExtender() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mColor = r0
                return
        }

        public CarExtender(android.app.Notification r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mColor = r0
                android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r4)
                if (r1 != 0) goto Lf
                r1 = 0
                goto L19
            Lf:
                android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r4)
                java.lang.String r2 = "android.car.EXTENSIONS"
                android.os.Bundle r1 = r1.getBundle(r2)
            L19:
                if (r1 == 0) goto L39
                java.lang.String r2 = "large_icon"
                android.os.Parcelable r2 = r1.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                r3.mLargeIcon = r2
                java.lang.String r2 = "app_color"
                int r0 = r1.getInt(r2, r0)
                r3.mColor = r0
                java.lang.String r0 = "car_conversation"
                android.os.Bundle r0 = r1.getBundle(r0)
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r2 = getUnreadConversationFromBundle(r0)
                r3.mUnreadConversation = r2
            L39:
                return
        }

        private static android.os.Bundle getBundleForUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation r8) {
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1 = 0
                java.lang.String[] r2 = r8.getParticipants()
                if (r2 == 0) goto L1b
                java.lang.String[] r2 = r8.getParticipants()
                int r2 = r2.length
                r3 = 1
                if (r2 <= r3) goto L1b
                java.lang.String[] r2 = r8.getParticipants()
                r3 = 0
                r1 = r2[r3]
            L1b:
                java.lang.String[] r2 = r8.getMessages()
                int r2 = r2.length
                android.os.Parcelable[] r2 = new android.os.Parcelable[r2]
                r3 = 0
            L23:
                int r4 = r2.length
                if (r3 >= r4) goto L40
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                java.lang.String[] r5 = r8.getMessages()
                r5 = r5[r3]
                java.lang.String r6 = "text"
                r4.putString(r6, r5)
                java.lang.String r5 = "author"
                r4.putString(r5, r1)
                r2[r3] = r4
                int r3 = r3 + 1
                goto L23
            L40:
                java.lang.String r3 = "messages"
                r0.putParcelableArray(r3, r2)
                androidx.core.app.RemoteInput r3 = r8.getRemoteInput()
                if (r3 == 0) goto L7d
            L4c:
                java.lang.String r4 = r3.getResultKey()
                android.app.RemoteInput$Builder r4 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.createBuilder(r4)
                java.lang.CharSequence r5 = r3.getLabel()
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.setLabel(r4, r5)
                java.lang.CharSequence[] r5 = r3.getChoices()
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.setChoices(r4, r5)
                boolean r5 = r3.getAllowFreeFormInput()
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.setAllowFreeFormInput(r4, r5)
                android.os.Bundle r5 = r3.getExtras()
                androidx.core.app.NotificationCompat.CarExtender.Api20Impl.addExtras(r4, r5)
                android.app.RemoteInput r5 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.build(r4)
                java.lang.String r6 = "remote_input"
                android.os.Parcelable r7 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.castToParcelable(r5)
                r0.putParcelable(r6, r7)
            L7d:
                java.lang.String r4 = "on_reply"
                android.app.PendingIntent r5 = r8.getReplyPendingIntent()
                r0.putParcelable(r4, r5)
                java.lang.String r4 = "on_read"
                android.app.PendingIntent r5 = r8.getReadPendingIntent()
                r0.putParcelable(r4, r5)
                java.lang.String r4 = "participants"
                java.lang.String[] r5 = r8.getParticipants()
                r0.putStringArray(r4, r5)
                java.lang.String r4 = "timestamp"
                long r5 = r8.getLatestTimestamp()
                r0.putLong(r4, r5)
                return r0
        }

        private static androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversationFromBundle(android.os.Bundle r20) {
                r0 = r20
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.String r2 = "messages"
                android.os.Parcelable[] r2 = r0.getParcelableArray(r2)
                r3 = 0
                if (r2 == 0) goto L3a
                int r4 = r2.length
                java.lang.String[] r4 = new java.lang.String[r4]
                r5 = 1
                r6 = 0
            L14:
                int r7 = r4.length
                if (r6 >= r7) goto L34
                r7 = r2[r6]
                boolean r7 = r7 instanceof android.os.Bundle
                if (r7 != 0) goto L1f
                r5 = 0
                goto L34
            L1f:
                r7 = r2[r6]
                android.os.Bundle r7 = (android.os.Bundle) r7
                java.lang.String r8 = "text"
                java.lang.String r7 = r7.getString(r8)
                r4[r6] = r7
                r7 = r4[r6]
                if (r7 != 0) goto L31
                r5 = 0
                goto L34
            L31:
                int r6 = r6 + 1
                goto L14
            L34:
                if (r5 == 0) goto L39
                r3 = r4
                r7 = r3
                goto L3b
            L39:
                return r1
            L3a:
                r7 = r3
            L3b:
                java.lang.String r3 = "on_read"
                android.os.Parcelable r3 = r0.getParcelable(r3)
                r10 = r3
                android.app.PendingIntent r10 = (android.app.PendingIntent) r10
                java.lang.String r3 = "on_reply"
                android.os.Parcelable r3 = r0.getParcelable(r3)
                r9 = r3
                android.app.PendingIntent r9 = (android.app.PendingIntent) r9
                java.lang.String r3 = "remote_input"
                android.os.Parcelable r3 = r0.getParcelable(r3)
                android.app.RemoteInput r3 = (android.app.RemoteInput) r3
                java.lang.String r4 = "participants"
                java.lang.String[] r11 = r0.getStringArray(r4)
                if (r11 == 0) goto L9f
                int r4 = r11.length
                r5 = 1
                if (r4 == r5) goto L62
                goto L9f
            L62:
                if (r3 == 0) goto L91
                androidx.core.app.RemoteInput r12 = new androidx.core.app.RemoteInput
                java.lang.String r13 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.getResultKey(r3)
                java.lang.CharSequence r14 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.getLabel(r3)
                java.lang.CharSequence[] r15 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.getChoices(r3)
                boolean r16 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.getAllowFreeFormInput(r3)
                int r1 = android.os.Build.VERSION.SDK_INT
                r4 = 29
                if (r1 < r4) goto L83
                int r1 = androidx.core.app.NotificationCompat.CarExtender.Api29Impl.getEditChoicesBeforeSending(r3)
                r17 = r1
                goto L86
            L83:
                r1 = 0
                r17 = r1
            L86:
                android.os.Bundle r18 = androidx.core.app.NotificationCompat.CarExtender.Api20Impl.getExtras(r3)
                r19 = 0
                r12.<init>(r13, r14, r15, r16, r17, r18, r19)
                r8 = r12
                goto L92
            L91:
                r8 = r1
            L92:
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r6 = new androidx.core.app.NotificationCompat$CarExtender$UnreadConversation
                java.lang.String r1 = "timestamp"
                long r12 = r0.getLong(r1)
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return r6
            L9f:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r4) {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                android.graphics.Bitmap r1 = r3.mLargeIcon
                if (r1 == 0) goto L11
                java.lang.String r1 = "large_icon"
                android.graphics.Bitmap r2 = r3.mLargeIcon
                r0.putParcelable(r1, r2)
            L11:
                int r1 = r3.mColor
                if (r1 == 0) goto L1c
                java.lang.String r1 = "app_color"
                int r2 = r3.mColor
                r0.putInt(r1, r2)
            L1c:
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r1 = r3.mUnreadConversation
                if (r1 == 0) goto L2b
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r1 = r3.mUnreadConversation
                android.os.Bundle r1 = getBundleForUnreadConversation(r1)
                java.lang.String r2 = "car_conversation"
                r0.putBundle(r2, r1)
            L2b:
                android.os.Bundle r1 = r4.getExtras()
                java.lang.String r2 = "android.car.EXTENSIONS"
                r1.putBundle(r2, r0)
                return r4
        }

        public int getColor() {
                r1 = this;
                int r0 = r1.mColor
                return r0
        }

        public android.graphics.Bitmap getLargeIcon() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mLargeIcon
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversation() {
                r1 = this;
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r0 = r1.mUnreadConversation
                return r0
        }

        public androidx.core.app.NotificationCompat.CarExtender setColor(int r1) {
                r0 = this;
                r0.mColor = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.CarExtender setLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                r0.mLargeIcon = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender setUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation r1) {
                r0 = this;
                r0.mUnreadConversation = r1
                return r0
        }
    }

    public static class DecoratedCustomViewStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Style createDecoratedCustomViewStyle() {
                    android.app.Notification$DecoratedCustomViewStyle r0 = new android.app.Notification$DecoratedCustomViewStyle
                    r0.<init>()
                    return r0
            }
        }

        public DecoratedCustomViewStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private android.widget.RemoteViews createRemoteViews(android.widget.RemoteViews r9, boolean r10) {
                r8 = this;
                int r0 = androidx.core.R.layout.notification_template_custom_big
                r1 = 1
                r2 = 0
                android.widget.RemoteViews r0 = r8.applyStandardTemplate(r1, r0, r2)
                int r1 = androidx.core.R.id.actions
                r0.removeAllViews(r1)
                r1 = 0
                androidx.core.app.NotificationCompat$Builder r3 = r8.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r3.mActions
                java.util.List r3 = getNonContextualActions(r3)
                if (r10 == 0) goto L3c
                if (r3 == 0) goto L3c
                int r4 = r3.size()
                r5 = 3
                int r4 = java.lang.Math.min(r4, r5)
                if (r4 <= 0) goto L3c
                r1 = 1
                r5 = 0
            L27:
                if (r5 >= r4) goto L3c
            L2a:
                java.lang.Object r6 = r3.get(r5)
                androidx.core.app.NotificationCompat$Action r6 = (androidx.core.app.NotificationCompat.Action) r6
                android.widget.RemoteViews r6 = r8.generateActionButton(r6)
                int r7 = androidx.core.R.id.actions
                r0.addView(r7, r6)
                int r5 = r5 + 1
                goto L27
            L3c:
                if (r1 == 0) goto L3f
                goto L41
            L3f:
                r2 = 8
            L41:
                int r4 = androidx.core.R.id.actions
                r0.setViewVisibility(r4, r2)
                int r4 = androidx.core.R.id.action_divider
                r0.setViewVisibility(r4, r2)
                r8.buildIntoRemoteViews(r0, r9)
                return r0
        }

        private android.widget.RemoteViews generateActionButton(androidx.core.app.NotificationCompat.Action r6) {
                r5 = this;
                android.app.PendingIntent r0 = r6.actionIntent
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                android.widget.RemoteViews r1 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r2 = r5.mBuilder
                android.content.Context r2 = r2.mContext
                java.lang.String r2 = r2.getPackageName()
                if (r0 == 0) goto L16
                int r3 = androidx.core.R.layout.notification_action_tombstone
                goto L18
            L16:
                int r3 = androidx.core.R.layout.notification_action
            L18:
                r1.<init>(r2, r3)
                androidx.core.graphics.drawable.IconCompat r2 = r6.getIconCompat()
                if (r2 == 0) goto L2c
                int r3 = androidx.core.R.id.action_image
                int r4 = androidx.core.R.color.notification_action_color_filter
                android.graphics.Bitmap r4 = r5.createColoredBitmap(r2, r4)
                r1.setImageViewBitmap(r3, r4)
            L2c:
                int r3 = androidx.core.R.id.action_text
                java.lang.CharSequence r4 = r6.title
                r1.setTextViewText(r3, r4)
                if (r0 != 0) goto L3c
                int r3 = androidx.core.R.id.action_container
                android.app.PendingIntent r4 = r6.actionIntent
                r1.setOnClickPendingIntent(r3, r4)
            L3c:
                int r3 = androidx.core.R.id.action_container
                java.lang.CharSequence r4 = r6.title
                r1.setContentDescription(r3, r4)
                return r1
        }

        private static java.util.List<androidx.core.app.NotificationCompat.Action> getNonContextualActions(java.util.List<androidx.core.app.NotificationCompat.Action> r4) {
                if (r4 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r1 = r4.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L23
                java.lang.Object r2 = r1.next()
                androidx.core.app.NotificationCompat$Action r2 = (androidx.core.app.NotificationCompat.Action) r2
                boolean r3 = r2.isContextual()
                if (r3 != 0) goto L22
                r0.add(r2)
            L22:
                goto Ld
            L23:
                return r0
        }

        public static java.util.List<java.lang.CharSequence> getTextsFromContentView(android.content.Context r7, android.app.Notification r8) {
                android.os.Bundle r0 = r8.extras
                java.lang.String r1 = "android.template"
                java.lang.String r0 = r0.getString(r1)
                java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r1 = android.app.Notification.DecoratedCustomViewStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L19
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
            L19:
                android.widget.RemoteViews r1 = r8.contentView
                if (r1 != 0) goto L2a
                android.widget.RemoteViews r1 = r8.bigContentView
                if (r1 != 0) goto L2a
                android.widget.RemoteViews r1 = r8.headsUpContentView
                if (r1 != 0) goto L2a
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
            L2a:
                android.widget.RemoteViews r1 = r8.bigContentView
                if (r1 == 0) goto L31
                android.widget.RemoteViews r1 = r8.bigContentView
                goto L3a
            L31:
                android.widget.RemoteViews r1 = r8.contentView
                if (r1 == 0) goto L38
                android.widget.RemoteViews r1 = r8.contentView
                goto L3a
            L38:
                android.widget.RemoteViews r1 = r8.headsUpContentView
            L3a:
                java.lang.String r2 = r1.getPackage()
                r3 = 0
                android.content.Context r4 = r7.createPackageContext(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
                android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
                android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
                int r5 = r3.theme
                r4.setTheme(r5)
                r5 = 0
                android.view.View r5 = r1.apply(r4, r5)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                getTextsFromViewTraversal(r5, r6)
                return r6
            L60:
                r3 = move-exception
                java.lang.RuntimeException r4 = new java.lang.RuntimeException
                r4.<init>(r3)
                throw r4
        }

        private static void getTextsFromViewTraversal(android.view.View r4, java.util.ArrayList<java.lang.CharSequence> r5) {
                boolean r0 = r4 instanceof android.view.ViewGroup
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
            L6:
                r1 = r4
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                int r1 = r1.getChildCount()
                if (r0 >= r1) goto L36
                r1 = r4
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                android.view.View r1 = r1.getChildAt(r0)
                boolean r2 = r1 instanceof android.widget.TextView
                if (r2 == 0) goto L2c
                r2 = r1
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.CharSequence r2 = r2.getText()
                if (r2 == 0) goto L2c
                int r3 = r2.length()
                if (r3 <= 0) goto L2c
                r5.add(r2)
            L2c:
                boolean r2 = r1 instanceof android.view.ViewGroup
                if (r2 == 0) goto L33
                getTextsFromViewTraversal(r1, r5)
            L33:
                int r0 = r0 + 1
                goto L6
            L36:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                android.app.Notification$Builder r0 = r3.getBuilder()
                android.app.Notification$Style r1 = androidx.core.app.NotificationCompat.DecoratedCustomViewStyle.Api24Impl.createDecoratedCustomViewStyle()
                r0.setStyle(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public interface Extender {
        androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private java.util.ArrayList<java.lang.CharSequence> mTexts;

        public InboxStyle() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mTexts = r0
                return
        }

        public InboxStyle(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mTexts = r0
                r1.setBuilder(r2)
                return
        }

        public androidx.core.app.NotificationCompat.InboxStyle addLine(java.lang.CharSequence r3) {
                r2 = this;
                if (r3 == 0) goto Lb
                java.util.ArrayList<java.lang.CharSequence> r0 = r2.mTexts
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r3)
                r0.add(r1)
            Lb:
                return r2
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r5) {
                r4 = this;
                android.app.Notification$Builder r0 = r5.getBuilder()
                android.app.Notification$InboxStyle r1 = new android.app.Notification$InboxStyle
                r1.<init>(r0)
                java.lang.CharSequence r2 = r4.mBigContentTitle
                android.app.Notification$InboxStyle r1 = r1.setBigContentTitle(r2)
                boolean r2 = r4.mSummaryTextSet
                if (r2 == 0) goto L18
                java.lang.CharSequence r2 = r4.mSummaryText
                r1.setSummaryText(r2)
            L18:
                java.util.ArrayList<java.lang.CharSequence> r2 = r4.mTexts
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2e
                java.lang.Object r3 = r2.next()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.addLine(r3)
                goto L1e
            L2e:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.textLines"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.util.ArrayList<java.lang.CharSequence> r0 = r2.mTexts
                r0.clear()
                java.lang.String r0 = "android.textLines"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L19
                java.util.ArrayList<java.lang.CharSequence> r1 = r2.mTexts
                java.lang.CharSequence[] r0 = r3.getCharSequenceArray(r0)
                java.util.Collections.addAll(r1, r0)
            L19:
                return
        }

        public androidx.core.app.NotificationCompat.InboxStyle setBigContentTitle(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mBigContentTitle = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.InboxStyle setSummaryText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r1.mSummaryText = r0
                r0 = 1
                r1.mSummaryTextSet = r0
                return r1
        }
    }

    public static class MessagingStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private java.lang.CharSequence mConversationTitle;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mHistoricMessages;
        private java.lang.Boolean mIsGroupConversation;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mMessages;
        private androidx.core.app.Person mUser;

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.MessagingStyle addMessage(android.app.Notification.MessagingStyle r1, android.app.Notification.MessagingStyle.Message r2) {
                    android.app.Notification$MessagingStyle r0 = r1.addMessage(r2)
                    return r0
            }

            static android.app.Notification.MessagingStyle createMessagingStyle(java.lang.CharSequence r1) {
                    android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                    r0.<init>(r1)
                    return r0
            }

            static android.app.Notification.MessagingStyle setConversationTitle(android.app.Notification.MessagingStyle r1, java.lang.CharSequence r2) {
                    android.app.Notification$MessagingStyle r0 = r1.setConversationTitle(r2)
                    return r0
            }
        }

        static class Api26Impl {
            private Api26Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.MessagingStyle addHistoricMessage(android.app.Notification.MessagingStyle r1, android.app.Notification.MessagingStyle.Message r2) {
                    android.app.Notification$MessagingStyle r0 = r1.addHistoricMessage(r2)
                    return r0
            }
        }

        static class Api28Impl {
            private Api28Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.MessagingStyle createMessagingStyle(android.app.Person r1) {
                    android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                    r0.<init>(r1)
                    return r0
            }

            static android.app.Notification.MessagingStyle setGroupConversation(android.app.Notification.MessagingStyle r1, boolean r2) {
                    android.app.Notification$MessagingStyle r0 = r1.setGroupConversation(r2)
                    return r0
            }
        }

        public static final class Message {
            static final java.lang.String KEY_DATA_MIME_TYPE = "type";
            static final java.lang.String KEY_DATA_URI = "uri";
            static final java.lang.String KEY_EXTRAS_BUNDLE = "extras";
            static final java.lang.String KEY_NOTIFICATION_PERSON = "sender_person";
            static final java.lang.String KEY_PERSON = "person";
            static final java.lang.String KEY_SENDER = "sender";
            static final java.lang.String KEY_TEXT = "text";
            static final java.lang.String KEY_TIMESTAMP = "time";
            private java.lang.String mDataMimeType;
            private android.net.Uri mDataUri;
            private android.os.Bundle mExtras;
            private final androidx.core.app.Person mPerson;
            private final java.lang.CharSequence mText;
            private final long mTimestamp;

            static class Api24Impl {
                private Api24Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static android.app.Notification.MessagingStyle.Message createMessage(java.lang.CharSequence r1, long r2, java.lang.CharSequence r4) {
                        android.app.Notification$MessagingStyle$Message r0 = new android.app.Notification$MessagingStyle$Message
                        r0.<init>(r1, r2, r4)
                        return r0
                }

                static android.app.Notification.MessagingStyle.Message setData(android.app.Notification.MessagingStyle.Message r1, java.lang.String r2, android.net.Uri r3) {
                        android.app.Notification$MessagingStyle$Message r0 = r1.setData(r2, r3)
                        return r0
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static android.os.Parcelable castToParcelable(android.app.Person r0) {
                        return r0
                }

                static android.app.Notification.MessagingStyle.Message createMessage(java.lang.CharSequence r1, long r2, android.app.Person r4) {
                        android.app.Notification$MessagingStyle$Message r0 = new android.app.Notification$MessagingStyle$Message
                        r0.<init>(r1, r2, r4)
                        return r0
                }
            }

            public Message(java.lang.CharSequence r2, long r3, androidx.core.app.Person r5) {
                    r1 = this;
                    r1.<init>()
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    r1.mExtras = r0
                    r1.mText = r2
                    r1.mTimestamp = r3
                    r1.mPerson = r5
                    return
            }

            @java.lang.Deprecated
            public Message(java.lang.CharSequence r2, long r3, java.lang.CharSequence r5) {
                    r1 = this;
                    androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                    r0.<init>()
                    androidx.core.app.Person$Builder r0 = r0.setName(r5)
                    androidx.core.app.Person r0 = r0.build()
                    r1.<init>(r2, r3, r0)
                    return
            }

            static android.os.Bundle[] getBundleArrayForMessages(java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> r4) {
                    int r0 = r4.size()
                    android.os.Bundle[] r0 = new android.os.Bundle[r0]
                    int r1 = r4.size()
                    r2 = 0
                Lb:
                    if (r2 >= r1) goto L1c
                    java.lang.Object r3 = r4.get(r2)
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                    android.os.Bundle r3 = r3.toBundle()
                    r0[r2] = r3
                    int r2 = r2 + 1
                    goto Lb
                L1c:
                    return r0
            }

            static androidx.core.app.NotificationCompat.MessagingStyle.Message getMessageFromBundle(android.os.Bundle r11) {
                    java.lang.String r0 = "uri"
                    java.lang.String r1 = "extras"
                    java.lang.String r2 = "type"
                    java.lang.String r3 = "sender"
                    java.lang.String r4 = "sender_person"
                    java.lang.String r5 = "person"
                    java.lang.String r6 = "time"
                    java.lang.String r7 = "text"
                    r8 = 0
                    boolean r9 = r11.containsKey(r7)     // Catch: java.lang.ClassCastException -> L9a
                    if (r9 == 0) goto L99
                    boolean r9 = r11.containsKey(r6)     // Catch: java.lang.ClassCastException -> L9a
                    if (r9 != 0) goto L1f
                    goto L99
                L1f:
                    r9 = 0
                    boolean r10 = r11.containsKey(r5)     // Catch: java.lang.ClassCastException -> L9a
                    if (r10 == 0) goto L30
                    android.os.Bundle r3 = r11.getBundle(r5)     // Catch: java.lang.ClassCastException -> L9a
                    androidx.core.app.Person r3 = androidx.core.app.Person.fromBundle(r3)     // Catch: java.lang.ClassCastException -> L9a
                    r9 = r3
                    goto L61
                L30:
                    boolean r5 = r11.containsKey(r4)     // Catch: java.lang.ClassCastException -> L9a
                    if (r5 == 0) goto L49
                    int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> L9a
                    r10 = 28
                    if (r5 < r10) goto L49
                L3d:
                    android.os.Parcelable r3 = r11.getParcelable(r4)     // Catch: java.lang.ClassCastException -> L9a
                    android.app.Person r3 = (android.app.Person) r3     // Catch: java.lang.ClassCastException -> L9a
                    androidx.core.app.Person r3 = androidx.core.app.Person.fromAndroidPerson(r3)     // Catch: java.lang.ClassCastException -> L9a
                    r9 = r3
                    goto L61
                L49:
                    boolean r4 = r11.containsKey(r3)     // Catch: java.lang.ClassCastException -> L9a
                    if (r4 == 0) goto L61
                    androidx.core.app.Person$Builder r4 = new androidx.core.app.Person$Builder     // Catch: java.lang.ClassCastException -> L9a
                    r4.<init>()     // Catch: java.lang.ClassCastException -> L9a
                    java.lang.CharSequence r3 = r11.getCharSequence(r3)     // Catch: java.lang.ClassCastException -> L9a
                    androidx.core.app.Person$Builder r3 = r4.setName(r3)     // Catch: java.lang.ClassCastException -> L9a
                    androidx.core.app.Person r3 = r3.build()     // Catch: java.lang.ClassCastException -> L9a
                    r9 = r3
                L61:
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = new androidx.core.app.NotificationCompat$MessagingStyle$Message     // Catch: java.lang.ClassCastException -> L9a
                    java.lang.CharSequence r4 = r11.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> L9a
                    long r5 = r11.getLong(r6)     // Catch: java.lang.ClassCastException -> L9a
                    r3.<init>(r4, r5, r9)     // Catch: java.lang.ClassCastException -> L9a
                    boolean r4 = r11.containsKey(r2)     // Catch: java.lang.ClassCastException -> L9a
                    if (r4 == 0) goto L87
                    boolean r4 = r11.containsKey(r0)     // Catch: java.lang.ClassCastException -> L9a
                    if (r4 == 0) goto L87
                    java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.ClassCastException -> L9a
                    android.os.Parcelable r0 = r11.getParcelable(r0)     // Catch: java.lang.ClassCastException -> L9a
                    android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.ClassCastException -> L9a
                    r3.setData(r2, r0)     // Catch: java.lang.ClassCastException -> L9a
                L87:
                    boolean r0 = r11.containsKey(r1)     // Catch: java.lang.ClassCastException -> L9a
                    if (r0 == 0) goto L98
                    android.os.Bundle r0 = r3.getExtras()     // Catch: java.lang.ClassCastException -> L9a
                    android.os.Bundle r1 = r11.getBundle(r1)     // Catch: java.lang.ClassCastException -> L9a
                    r0.putAll(r1)     // Catch: java.lang.ClassCastException -> L9a
                L98:
                    return r3
                L99:
                    return r8
                L9a:
                    r0 = move-exception
                    return r8
            }

            static java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] r3) {
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.length
                    r0.<init>(r1)
                    r1 = 0
                L7:
                    int r2 = r3.length
                    if (r1 >= r2) goto L20
                    r2 = r3[r1]
                    boolean r2 = r2 instanceof android.os.Bundle
                    if (r2 == 0) goto L1d
                    r2 = r3[r1]
                    android.os.Bundle r2 = (android.os.Bundle) r2
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r2 = getMessageFromBundle(r2)
                    if (r2 == 0) goto L1d
                    r0.add(r2)
                L1d:
                    int r1 = r1 + 1
                    goto L7
                L20:
                    return r0
            }

            private android.os.Bundle toBundle() {
                    r4 = this;
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    java.lang.CharSequence r1 = r4.mText
                    if (r1 == 0) goto L10
                    java.lang.String r1 = "text"
                    java.lang.CharSequence r2 = r4.mText
                    r0.putCharSequence(r1, r2)
                L10:
                    java.lang.String r1 = "time"
                    long r2 = r4.mTimestamp
                    r0.putLong(r1, r2)
                    androidx.core.app.Person r1 = r4.mPerson
                    if (r1 == 0) goto L47
                    androidx.core.app.Person r1 = r4.mPerson
                    java.lang.CharSequence r1 = r1.getName()
                    java.lang.String r2 = "sender"
                    r0.putCharSequence(r2, r1)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    if (r1 < r2) goto L3c
                    androidx.core.app.Person r1 = r4.mPerson
                    android.app.Person r1 = r1.toAndroidPerson()
                    android.os.Parcelable r1 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.castToParcelable(r1)
                    java.lang.String r2 = "sender_person"
                    r0.putParcelable(r2, r1)
                    goto L47
                L3c:
                    androidx.core.app.Person r1 = r4.mPerson
                    android.os.Bundle r1 = r1.toBundle()
                    java.lang.String r2 = "person"
                    r0.putBundle(r2, r1)
                L47:
                    java.lang.String r1 = r4.mDataMimeType
                    if (r1 == 0) goto L52
                    java.lang.String r1 = "type"
                    java.lang.String r2 = r4.mDataMimeType
                    r0.putString(r1, r2)
                L52:
                    android.net.Uri r1 = r4.mDataUri
                    if (r1 == 0) goto L5d
                    java.lang.String r1 = "uri"
                    android.net.Uri r2 = r4.mDataUri
                    r0.putParcelable(r1, r2)
                L5d:
                    android.os.Bundle r1 = r4.mExtras
                    if (r1 == 0) goto L68
                    java.lang.String r1 = "extras"
                    android.os.Bundle r2 = r4.mExtras
                    r0.putBundle(r1, r2)
                L68:
                    return r0
            }

            public java.lang.String getDataMimeType() {
                    r1 = this;
                    java.lang.String r0 = r1.mDataMimeType
                    return r0
            }

            public android.net.Uri getDataUri() {
                    r1 = this;
                    android.net.Uri r0 = r1.mDataUri
                    return r0
            }

            public android.os.Bundle getExtras() {
                    r1 = this;
                    android.os.Bundle r0 = r1.mExtras
                    return r0
            }

            public androidx.core.app.Person getPerson() {
                    r1 = this;
                    androidx.core.app.Person r0 = r1.mPerson
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getSender() {
                    r1 = this;
                    androidx.core.app.Person r0 = r1.mPerson
                    if (r0 != 0) goto L6
                    r0 = 0
                    goto Lc
                L6:
                    androidx.core.app.Person r0 = r1.mPerson
                    java.lang.CharSequence r0 = r0.getName()
                Lc:
                    return r0
            }

            public java.lang.CharSequence getText() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mText
                    return r0
            }

            public long getTimestamp() {
                    r2 = this;
                    long r0 = r2.mTimestamp
                    return r0
            }

            public androidx.core.app.NotificationCompat.MessagingStyle.Message setData(java.lang.String r1, android.net.Uri r2) {
                    r0 = this;
                    r0.mDataMimeType = r1
                    r0.mDataUri = r2
                    return r0
            }

            android.app.Notification.MessagingStyle.Message toAndroidMessage() {
                    r6 = this;
                    androidx.core.app.Person r0 = r6.getPerson()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L1f
                    java.lang.CharSequence r1 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L16
                    goto L1a
                L16:
                    android.app.Person r3 = r0.toAndroidPerson()
                L1a:
                    android.app.Notification$MessagingStyle$Message r1 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.createMessage(r1, r4, r3)
                    goto L32
                L1f:
                    java.lang.CharSequence r1 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L2a
                    goto L2e
                L2a:
                    java.lang.CharSequence r3 = r0.getName()
                L2e:
                    android.app.Notification$MessagingStyle$Message r1 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.createMessage(r1, r4, r3)
                L32:
                    java.lang.String r2 = r6.getDataMimeType()
                    if (r2 == 0) goto L43
                    java.lang.String r2 = r6.getDataMimeType()
                    android.net.Uri r3 = r6.getDataUri()
                    androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.setData(r1, r2, r3)
                L43:
                    return r1
            }
        }

        MessagingStyle() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHistoricMessages = r0
                return
        }

        public MessagingStyle(androidx.core.app.Person r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mHistoricMessages = r0
                java.lang.CharSequence r0 = r3.getName()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1e
                r2.mUser = r3
                return
            L1e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "User's name must not be empty."
                r0.<init>(r1)
                throw r0
        }

        @java.lang.Deprecated
        public MessagingStyle(java.lang.CharSequence r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHistoricMessages = r0
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                androidx.core.app.Person$Builder r0 = r0.setName(r2)
                androidx.core.app.Person r0 = r0.build()
                r1.mUser = r0
                return
        }

        public static androidx.core.app.NotificationCompat.MessagingStyle extractMessagingStyleFromNotification(android.app.Notification r2) {
                androidx.core.app.NotificationCompat$Style r0 = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(r2)
                boolean r1 = r0 instanceof androidx.core.app.NotificationCompat.MessagingStyle
                if (r1 == 0) goto Lc
                r1 = r0
                androidx.core.app.NotificationCompat$MessagingStyle r1 = (androidx.core.app.NotificationCompat.MessagingStyle) r1
                return r1
            Lc:
                r1 = 0
                return r1
        }

        private androidx.core.app.NotificationCompat.MessagingStyle.Message findLatestIncomingMessage() {
                r3 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L2a
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r3.mMessages
                java.lang.Object r1 = r1.get(r0)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r1 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r1
                androidx.core.app.Person r2 = r1.getPerson()
                if (r2 == 0) goto L27
                androidx.core.app.Person r2 = r1.getPerson()
                java.lang.CharSequence r2 = r2.getName()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r0 = r0 + (-1)
                goto L8
            L2a:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L43
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r3.mMessages
                int r1 = r1.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r0 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r0
                return r0
            L43:
                r0 = 0
                return r0
        }

        private boolean hasMessagesWithoutSender() {
                r4 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r4.mMessages
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L26
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r4.mMessages
                java.lang.Object r2 = r2.get(r0)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r2 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r2
                androidx.core.app.Person r3 = r2.getPerson()
                if (r3 == 0) goto L23
                androidx.core.app.Person r3 = r2.getPerson()
                java.lang.CharSequence r3 = r3.getName()
                if (r3 != 0) goto L23
                return r1
            L23:
                int r0 = r0 + (-1)
                goto L8
            L26:
                r0 = 0
                return r0
        }

        private android.text.style.TextAppearanceSpan makeFontColorSpan(int r7) {
                r6 = this;
                android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
                android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r7)
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        private java.lang.CharSequence makeMessageLine(androidx.core.app.NotificationCompat.MessagingStyle.Message r12) {
                r11 = this;
                androidx.core.text.BidiFormatter r0 = androidx.core.text.BidiFormatter.getInstance()
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                r2 = 1
                if (r2 == 0) goto Lf
                r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L10
            Lf:
                r3 = -1
            L10:
                androidx.core.app.Person r4 = r12.getPerson()
                java.lang.String r5 = ""
                if (r4 != 0) goto L1a
                r4 = r5
                goto L22
            L1a:
                androidx.core.app.Person r4 = r12.getPerson()
                java.lang.CharSequence r4 = r4.getName()
            L22:
                boolean r6 = android.text.TextUtils.isEmpty(r4)
                if (r6 == 0) goto L41
                androidx.core.app.Person r6 = r11.mUser
                java.lang.CharSequence r4 = r6.getName()
                if (r2 == 0) goto L3f
                androidx.core.app.NotificationCompat$Builder r6 = r11.mBuilder
                int r6 = r6.getColor()
                if (r6 == 0) goto L3f
                androidx.core.app.NotificationCompat$Builder r6 = r11.mBuilder
                int r6 = r6.getColor()
                goto L40
            L3f:
                r6 = r3
            L40:
                r3 = r6
            L41:
                java.lang.CharSequence r6 = r0.unicodeWrap(r4)
                r1.append(r6)
                android.text.style.TextAppearanceSpan r7 = r11.makeFontColorSpan(r3)
                int r8 = r1.length()
                int r9 = r6.length()
                int r8 = r8 - r9
                int r9 = r1.length()
                r10 = 33
                r1.setSpan(r7, r8, r9, r10)
                java.lang.CharSequence r7 = r12.getText()
                if (r7 != 0) goto L65
                goto L69
            L65:
                java.lang.CharSequence r5 = r12.getText()
            L69:
                java.lang.String r7 = "  "
                android.text.SpannableStringBuilder r7 = r1.append(r7)
                java.lang.CharSequence r8 = r0.unicodeWrap(r5)
                r7.append(r8)
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.addCompatExtras(r3)
                androidx.core.app.Person r0 = r2.mUser
                java.lang.CharSequence r0 = r0.getName()
                java.lang.String r1 = "android.selfDisplayName"
                r3.putCharSequence(r1, r0)
                androidx.core.app.Person r0 = r2.mUser
                android.os.Bundle r0 = r0.toBundle()
                java.lang.String r1 = "android.messagingStyleUser"
                r3.putBundle(r1, r0)
                java.lang.String r0 = "android.hiddenConversationTitle"
                java.lang.CharSequence r1 = r2.mConversationTitle
                r3.putCharSequence(r0, r1)
                java.lang.CharSequence r0 = r2.mConversationTitle
                if (r0 == 0) goto L33
                java.lang.Boolean r0 = r2.mIsGroupConversation
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L33
                java.lang.String r0 = "android.conversationTitle"
                java.lang.CharSequence r1 = r2.mConversationTitle
                r3.putCharSequence(r0, r1)
            L33:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L46
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                android.os.Bundle[] r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(r0)
                java.lang.String r1 = "android.messages"
                r3.putParcelableArray(r1, r0)
            L46:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L59
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                android.os.Bundle[] r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(r0)
                java.lang.String r1 = "android.messages.historic"
                r3.putParcelableArray(r1, r0)
            L59:
                java.lang.Boolean r0 = r2.mIsGroupConversation
                if (r0 == 0) goto L68
                java.lang.Boolean r0 = r2.mIsGroupConversation
                boolean r0 = r0.booleanValue()
                java.lang.String r1 = "android.isGroupConversation"
                r3.putBoolean(r1, r0)
            L68:
                return
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addHistoricMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message r3) {
                r2 = this;
                if (r3 == 0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                r0.add(r3)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                int r0 = r0.size()
                r1 = 25
                if (r0 <= r1) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                r1 = 0
                r0.remove(r1)
            L17:
                return r2
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message r3) {
                r2 = this;
                if (r3 == 0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                r0.add(r3)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                int r0 = r0.size()
                r1 = 25
                if (r0 <= r1) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                r1 = 0
                r0.remove(r1)
            L17:
                return r2
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence r2, long r3, androidx.core.app.Person r5) {
                r1 = this;
                androidx.core.app.NotificationCompat$MessagingStyle$Message r0 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
                r0.<init>(r2, r3, r5)
                r1.addMessage(r0)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence r4, long r5, java.lang.CharSequence r7) {
                r3 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                androidx.core.app.NotificationCompat$MessagingStyle$Message r1 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
                androidx.core.app.Person$Builder r2 = new androidx.core.app.Person$Builder
                r2.<init>()
                androidx.core.app.Person$Builder r2 = r2.setName(r7)
                androidx.core.app.Person r2 = r2.build()
                r1.<init>(r4, r5, r2)
                r0.add(r1)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                int r0 = r0.size()
                r1 = 25
                if (r0 <= r1) goto L27
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                r1 = 0
                r0.remove(r1)
            L27:
                return r3
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r7) {
                r6 = this;
                boolean r0 = r6.isGroupConversation()
                r6.setGroupConversation(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L19
                androidx.core.app.Person r0 = r6.mUser
                android.app.Person r0 = r0.toAndroidPerson()
                android.app.Notification$MessagingStyle r0 = androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.createMessagingStyle(r0)
                goto L23
            L19:
                androidx.core.app.Person r0 = r6.mUser
                java.lang.CharSequence r0 = r0.getName()
                android.app.Notification$MessagingStyle r0 = androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.createMessagingStyle(r0)
            L23:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r6.mMessages
                java.util.Iterator r2 = r2.iterator()
            L29:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L40
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                r4 = r0
                android.app.Notification$MessagingStyle r4 = (android.app.Notification.MessagingStyle) r4
                android.app.Notification$MessagingStyle$Message r5 = r3.toAndroidMessage()
                androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.addMessage(r4, r5)
                goto L29
            L40:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L63
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r6.mHistoricMessages
                java.util.Iterator r2 = r2.iterator()
            L4c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L63
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                r4 = r0
                android.app.Notification$MessagingStyle r4 = (android.app.Notification.MessagingStyle) r4
                android.app.Notification$MessagingStyle$Message r5 = r3.toAndroidMessage()
                androidx.core.app.NotificationCompat.MessagingStyle.Api26Impl.addHistoricMessage(r4, r5)
                goto L4c
            L63:
                java.lang.Boolean r2 = r6.mIsGroupConversation
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L6f
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L77
            L6f:
                r2 = r0
                android.app.Notification$MessagingStyle r2 = (android.app.Notification.MessagingStyle) r2
                java.lang.CharSequence r3 = r6.mConversationTitle
                androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.setConversationTitle(r2, r3)
            L77:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L87
                r1 = r0
                android.app.Notification$MessagingStyle r1 = (android.app.Notification.MessagingStyle) r1
                java.lang.Boolean r2 = r6.mIsGroupConversation
                boolean r2 = r2.booleanValue()
                androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.setGroupConversation(r1, r2)
            L87:
                android.app.Notification$Builder r1 = r7.getBuilder()
                r2 = r0
                android.app.Notification$Style r2 = (android.app.Notification.Style) r2
                r2.setBuilder(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.messagingStyleUser"
                r2.remove(r0)
                java.lang.String r0 = "android.selfDisplayName"
                r2.remove(r0)
                java.lang.String r0 = "android.conversationTitle"
                r2.remove(r0)
                java.lang.String r0 = "android.hiddenConversationTitle"
                r2.remove(r0)
                java.lang.String r0 = "android.messages"
                r2.remove(r0)
                java.lang.String r0 = "android.messages.historic"
                r2.remove(r0)
                java.lang.String r0 = "android.isGroupConversation"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                return r0
        }

        public java.lang.CharSequence getConversationTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mConversationTitle
                return r0
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getHistoricMessages() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mHistoricMessages
                return r0
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessages() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mMessages
                return r0
        }

        public androidx.core.app.Person getUser() {
                r1 = this;
                androidx.core.app.Person r0 = r1.mUser
                return r0
        }

        @java.lang.Deprecated
        public java.lang.CharSequence getUserDisplayName() {
                r1 = this;
                androidx.core.app.Person r0 = r1.mUser
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }

        public boolean isGroupConversation() {
                r3 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                r1 = 0
                if (r0 == 0) goto L1d
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
                int r0 = r0.targetSdkVersion
                r2 = 28
                if (r0 >= r2) goto L1d
                java.lang.Boolean r0 = r3.mIsGroupConversation
                if (r0 != 0) goto L1d
                java.lang.CharSequence r0 = r3.mConversationTitle
                if (r0 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
            L1d:
                java.lang.Boolean r0 = r3.mIsGroupConversation
                if (r0 == 0) goto L27
                java.lang.Boolean r0 = r3.mIsGroupConversation
                boolean r1 = r0.booleanValue()
            L27:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r5) {
                r4 = this;
                super.restoreFromCompatExtras(r5)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r4.mMessages
                r0.clear()
                java.lang.String r0 = "android.messagingStyleUser"
                boolean r1 = r5.containsKey(r0)
                if (r1 == 0) goto L1b
                android.os.Bundle r0 = r5.getBundle(r0)
                androidx.core.app.Person r0 = androidx.core.app.Person.fromBundle(r0)
                r4.mUser = r0
                goto L30
            L1b:
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.String r1 = "android.selfDisplayName"
                java.lang.String r1 = r5.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                androidx.core.app.Person r0 = r0.build()
                r4.mUser = r0
            L30:
                java.lang.String r0 = "android.conversationTitle"
                java.lang.CharSequence r0 = r5.getCharSequence(r0)
                r4.mConversationTitle = r0
                java.lang.CharSequence r0 = r4.mConversationTitle
                if (r0 != 0) goto L44
                java.lang.String r0 = "android.hiddenConversationTitle"
                java.lang.CharSequence r0 = r5.getCharSequence(r0)
                r4.mConversationTitle = r0
            L44:
                java.lang.String r0 = "android.messages"
                android.os.Parcelable[] r0 = r5.getParcelableArray(r0)
                if (r0 == 0) goto L55
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r4.mMessages
                java.util.List r2 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(r0)
                r1.addAll(r2)
            L55:
                java.lang.String r1 = "android.messages.historic"
                android.os.Parcelable[] r1 = r5.getParcelableArray(r1)
                if (r1 == 0) goto L66
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r4.mHistoricMessages
                java.util.List r3 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(r1)
                r2.addAll(r3)
            L66:
                java.lang.String r2 = "android.isGroupConversation"
                boolean r3 = r5.containsKey(r2)
                if (r3 == 0) goto L78
                boolean r2 = r5.getBoolean(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r4.mIsGroupConversation = r2
            L78:
                return
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setConversationTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mConversationTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setGroupConversation(boolean r2) {
                r1 = this;
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r1.mIsGroupConversation = r0
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    public static class ProgressStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int DEFAULT_PROGRESS_MAX = 100;
        private static final java.lang.String KEY_ELEMENT_COLOR = "colorInt";
        private static final java.lang.String KEY_ELEMENT_ID = "id";
        private static final java.lang.String KEY_POINT_POSITION = "position";
        private static final java.lang.String KEY_SEGMENT_LENGTH = "length";
        private static final int MAX_PROGRESS_POINT_LIMIT = 4;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$ProgressStyle";
        private androidx.core.graphics.drawable.IconCompat mEndIcon;
        private boolean mIndeterminate;
        private boolean mIsStyledByProgress;
        private int mProgress;
        private java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> mProgressPoints;
        private java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> mProgressSegments;
        private androidx.core.graphics.drawable.IconCompat mStartIcon;
        private androidx.core.graphics.drawable.IconCompat mTrackerIcon;

        private static final class Api36Impl {
            private Api36Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setProgress(android.app.Notification.ProgressStyle r0, int r1) {
                    r0.setProgress(r1)
                    return
            }

            static void setProgressEndIcon(android.app.Notification.ProgressStyle r0, android.graphics.drawable.Icon r1) {
                    r0.setProgressEndIcon(r1)
                    return
            }

            static void setProgressIndeterminate(android.app.Notification.ProgressStyle r0, boolean r1) {
                    r0.setProgressIndeterminate(r1)
                    return
            }

            static void setProgressPoints(android.app.Notification.ProgressStyle r4, java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> r5) {
                    java.util.Iterator r0 = r5.iterator()
                L4:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2d
                    java.lang.Object r1 = r0.next()
                    androidx.core.app.NotificationCompat$ProgressStyle$Point r1 = (androidx.core.app.NotificationCompat.ProgressStyle.Point) r1
                    android.app.Notification$ProgressStyle$Point r2 = new android.app.Notification$ProgressStyle$Point
                    int r3 = r1.getPosition()
                    r2.<init>(r3)
                    int r3 = r1.getColor()
                    android.app.Notification$ProgressStyle$Point r2 = r2.setColor(r3)
                    int r3 = r1.getId()
                    android.app.Notification$ProgressStyle$Point r2 = r2.setId(r3)
                    r4.addProgressPoint(r2)
                    goto L4
                L2d:
                    return
            }

            static void setProgressSegments(android.app.Notification.ProgressStyle r4, java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> r5) {
                    java.util.Iterator r0 = r5.iterator()
                L4:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2d
                    java.lang.Object r1 = r0.next()
                    androidx.core.app.NotificationCompat$ProgressStyle$Segment r1 = (androidx.core.app.NotificationCompat.ProgressStyle.Segment) r1
                    android.app.Notification$ProgressStyle$Segment r2 = new android.app.Notification$ProgressStyle$Segment
                    int r3 = r1.getLength()
                    r2.<init>(r3)
                    int r3 = r1.getColor()
                    android.app.Notification$ProgressStyle$Segment r2 = r2.setColor(r3)
                    int r3 = r1.getId()
                    android.app.Notification$ProgressStyle$Segment r2 = r2.setId(r3)
                    r4.addProgressSegment(r2)
                    goto L4
                L2d:
                    return
            }

            static void setProgressStartIcon(android.app.Notification.ProgressStyle r0, android.graphics.drawable.Icon r1) {
                    r0.setProgressStartIcon(r1)
                    return
            }

            static void setProgressTrackerIcon(android.app.Notification.ProgressStyle r0, android.graphics.drawable.Icon r1) {
                    r0.setProgressTrackerIcon(r1)
                    return
            }

            static void setStyledByProgress(android.app.Notification.ProgressStyle r0, boolean r1) {
                    r0.setStyledByProgress(r1)
                    return
            }
        }

        public static final class Point {
            private int mColor;
            private int mId;
            private int mPosition;

            public Point(int r2) {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.mId = r0
                    r1.mColor = r0
                    r1.mPosition = r2
                    return
            }

            public int getColor() {
                    r1 = this;
                    int r0 = r1.mColor
                    return r0
            }

            public int getId() {
                    r1 = this;
                    int r0 = r1.mId
                    return r0
            }

            public int getPosition() {
                    r1 = this;
                    int r0 = r1.mPosition
                    return r0
            }

            public androidx.core.app.NotificationCompat.ProgressStyle.Point setColor(int r1) {
                    r0 = this;
                    r0.mColor = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.ProgressStyle.Point setId(int r1) {
                    r0 = this;
                    r0.mId = r1
                    return r0
            }
        }

        public static final class Segment {
            private int mColor;
            private int mId;
            private int mLength;

            public Segment(int r2) {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.mId = r0
                    r1.mColor = r0
                    r1.mLength = r2
                    return
            }

            public int getColor() {
                    r1 = this;
                    int r0 = r1.mColor
                    return r0
            }

            public int getId() {
                    r1 = this;
                    int r0 = r1.mId
                    return r0
            }

            public int getLength() {
                    r1 = this;
                    int r0 = r1.mLength
                    return r0
            }

            public androidx.core.app.NotificationCompat.ProgressStyle.Segment setColor(int r1) {
                    r0 = this;
                    r0.mColor = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.ProgressStyle.Segment setId(int r1) {
                    r0 = this;
                    r0.mId = r1
                    return r0
            }
        }

        public ProgressStyle() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mProgressSegments = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mProgressPoints = r0
                r0 = 0
                r1.mProgress = r0
                r0 = 1
                r1.mIsStyledByProgress = r0
                return
        }

        private static androidx.core.graphics.drawable.IconCompat asIconCompat(android.os.Parcelable r1) {
                if (r1 == 0) goto L1b
            L3:
                boolean r0 = r1 instanceof android.graphics.drawable.Icon
                if (r0 == 0) goto Lf
                r0 = r1
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r0)
                return r0
            Lf:
                boolean r0 = r1 instanceof android.graphics.Bitmap
                if (r0 == 0) goto L1b
                r0 = r1
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }

        private static java.util.ArrayList<android.os.Bundle> getProgressPointsAsBundleList(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r6 == 0) goto L47
                boolean r1 = r6.isEmpty()
                if (r1 != 0) goto L47
                r1 = 0
            Le:
                int r2 = r6.size()
                if (r1 >= r2) goto L47
                java.lang.Object r2 = r6.get(r1)
                androidx.core.app.NotificationCompat$ProgressStyle$Point r2 = (androidx.core.app.NotificationCompat.ProgressStyle.Point) r2
                int r3 = r2.getPosition()
                if (r3 >= 0) goto L21
                goto L44
            L21:
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r4 = "position"
                int r5 = r2.getPosition()
                r3.putInt(r4, r5)
                java.lang.String r4 = "id"
                int r5 = r2.getId()
                r3.putInt(r4, r5)
                java.lang.String r4 = "colorInt"
                int r5 = r2.getColor()
                r3.putInt(r4, r5)
                r0.add(r3)
            L44:
                int r1 = r1 + 1
                goto Le
            L47:
                return r0
        }

        private static java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> getProgressPointsFromBundleList(java.util.List<android.os.Bundle> r7) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r7 == 0) goto L43
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto L43
                r1 = 0
            Le:
                int r2 = r7.size()
                if (r1 >= r2) goto L43
                java.lang.Object r2 = r7.get(r1)
                android.os.Bundle r2 = (android.os.Bundle) r2
                java.lang.String r3 = "position"
                int r3 = r2.getInt(r3)
                if (r3 >= 0) goto L23
                goto L40
            L23:
                java.lang.String r4 = "id"
                int r4 = r2.getInt(r4)
                java.lang.String r5 = "colorInt"
                r6 = 0
                int r5 = r2.getInt(r5, r6)
                androidx.core.app.NotificationCompat$ProgressStyle$Point r6 = new androidx.core.app.NotificationCompat$ProgressStyle$Point
                r6.<init>(r3)
                androidx.core.app.NotificationCompat$ProgressStyle$Point r6 = r6.setId(r4)
                androidx.core.app.NotificationCompat$ProgressStyle$Point r6 = r6.setColor(r5)
                r0.add(r6)
            L40:
                int r1 = r1 + 1
                goto Le
            L43:
                return r0
        }

        private static java.util.ArrayList<android.os.Bundle> getProgressSegmentsAsBundleList(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r6 == 0) goto L47
                boolean r1 = r6.isEmpty()
                if (r1 != 0) goto L47
                r1 = 0
            Le:
                int r2 = r6.size()
                if (r1 >= r2) goto L47
                java.lang.Object r2 = r6.get(r1)
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r2 = (androidx.core.app.NotificationCompat.ProgressStyle.Segment) r2
                int r3 = r2.getLength()
                if (r3 > 0) goto L21
                goto L44
            L21:
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r4 = "length"
                int r5 = r2.getLength()
                r3.putInt(r4, r5)
                java.lang.String r4 = "id"
                int r5 = r2.getId()
                r3.putInt(r4, r5)
                java.lang.String r4 = "colorInt"
                int r5 = r2.getColor()
                r3.putInt(r4, r5)
                r0.add(r3)
            L44:
                int r1 = r1 + 1
                goto Le
            L47:
                return r0
        }

        private static java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> getProgressSegmentsFromBundleList(java.util.List<android.os.Bundle> r7) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r7 == 0) goto L43
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto L43
                r1 = 0
            Le:
                int r2 = r7.size()
                if (r1 >= r2) goto L43
                java.lang.Object r2 = r7.get(r1)
                android.os.Bundle r2 = (android.os.Bundle) r2
                java.lang.String r3 = "length"
                int r3 = r2.getInt(r3)
                if (r3 > 0) goto L23
                goto L40
            L23:
                java.lang.String r4 = "id"
                int r4 = r2.getInt(r4)
                java.lang.String r5 = "colorInt"
                r6 = 0
                int r5 = r2.getInt(r5, r6)
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r6 = new androidx.core.app.NotificationCompat$ProgressStyle$Segment
                r6.<init>(r3)
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r6 = r6.setId(r4)
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r6 = r6.setColor(r5)
                r0.add(r6)
            L40:
                int r1 = r1 + 1
                goto Le
            L43:
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r4) {
                r3 = this;
                super.addCompatExtras(r4)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 36
                if (r0 >= r1) goto L83
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r3.mProgressSegments
                java.util.ArrayList r0 = getProgressSegmentsAsBundleList(r0)
                java.lang.String r1 = "android.progressSegments"
                r4.putParcelableArrayList(r1, r0)
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r3.mProgressPoints
                java.util.ArrayList r0 = getProgressPointsAsBundleList(r0)
                java.lang.String r1 = "android.progressPoints"
                r4.putParcelableArrayList(r1, r0)
                java.lang.String r0 = "android.progress"
                int r1 = r3.mProgress
                r4.putInt(r0, r1)
                java.lang.String r0 = "android.progressIndeterminate"
                boolean r1 = r3.mIndeterminate
                r4.putBoolean(r0, r1)
                java.lang.String r0 = "android.progressMax"
                int r1 = r3.getProgressMax()
                r4.putInt(r0, r1)
                java.lang.String r0 = "android.styledByProgress"
                boolean r1 = r3.mIsStyledByProgress
                r4.putBoolean(r0, r1)
                r0 = 0
                androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilder
                if (r1 == 0) goto L46
                androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilder
                android.content.Context r0 = r1.mContext
            L46:
                if (r0 == 0) goto L82
                androidx.core.graphics.drawable.IconCompat r1 = r3.mTrackerIcon
                java.lang.String r2 = "android.progressTrackerIcon"
                if (r1 == 0) goto L58
                androidx.core.graphics.drawable.IconCompat r1 = r3.mTrackerIcon
                android.graphics.drawable.Icon r1 = r1.toIcon(r0)
                r4.putParcelable(r2, r1)
                goto L5b
            L58:
                r4.remove(r2)
            L5b:
                androidx.core.graphics.drawable.IconCompat r1 = r3.mStartIcon
                java.lang.String r2 = "android.progressStartIcon"
                if (r1 == 0) goto L6b
                androidx.core.graphics.drawable.IconCompat r1 = r3.mStartIcon
                android.graphics.drawable.Icon r1 = r1.toIcon(r0)
                r4.putParcelable(r2, r1)
                goto L6e
            L6b:
                r4.remove(r2)
            L6e:
                androidx.core.graphics.drawable.IconCompat r1 = r3.mEndIcon
                java.lang.String r2 = "android.progressEndIcon"
                if (r1 == 0) goto L7e
                androidx.core.graphics.drawable.IconCompat r1 = r3.mEndIcon
                android.graphics.drawable.Icon r1 = r1.toIcon(r0)
                r4.putParcelable(r2, r1)
                goto L83
            L7e:
                r4.remove(r2)
                goto L83
            L82:
                return
            L83:
                return
        }

        public androidx.core.app.NotificationCompat.ProgressStyle addProgressPoint(androidx.core.app.NotificationCompat.ProgressStyle.Point r2) {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r1.mProgressPoints
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mProgressPoints = r0
            Lb:
                int r0 = r2.getPosition()
                if (r0 <= 0) goto L16
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r1.mProgressPoints
                r0.add(r2)
            L16:
                return r1
        }

        public androidx.core.app.NotificationCompat.ProgressStyle addProgressSegment(androidx.core.app.NotificationCompat.ProgressStyle.Segment r2) {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r1.mProgressSegments
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mProgressSegments = r0
            Lb:
                int r0 = r2.getLength()
                if (r0 <= 0) goto L16
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r1.mProgressSegments
                r0.add(r2)
            L16:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r8) {
                r7 = this;
                android.app.Notification$Builder r0 = r8.getBuilder()
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 36
                if (r1 < r2) goto L62
                r1 = 0
                boolean r2 = r8 instanceof androidx.core.app.NotificationCompatBuilder
                if (r2 == 0) goto L16
                r2 = r8
                androidx.core.app.NotificationCompatBuilder r2 = (androidx.core.app.NotificationCompatBuilder) r2
                android.content.Context r1 = r2.getContext()
            L16:
                android.app.Notification$ProgressStyle r2 = new android.app.Notification$ProgressStyle
                r2.<init>()
                boolean r3 = r7.mIsStyledByProgress
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setStyledByProgress(r2, r3)
                int r3 = r7.mProgress
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgress(r2, r3)
                boolean r3 = r7.mIndeterminate
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressIndeterminate(r2, r3)
                r3 = 0
                androidx.core.graphics.drawable.IconCompat r4 = r7.mStartIcon
                if (r4 == 0) goto L35
                androidx.core.graphics.drawable.IconCompat r4 = r7.mStartIcon
                android.graphics.drawable.Icon r3 = r4.toIcon(r1)
            L35:
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressStartIcon(r2, r3)
                r4 = 0
                androidx.core.graphics.drawable.IconCompat r5 = r7.mEndIcon
                if (r5 == 0) goto L43
                androidx.core.graphics.drawable.IconCompat r5 = r7.mEndIcon
                android.graphics.drawable.Icon r4 = r5.toIcon(r1)
            L43:
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressEndIcon(r2, r4)
                r5 = 0
                androidx.core.graphics.drawable.IconCompat r6 = r7.mTrackerIcon
                if (r6 == 0) goto L51
                androidx.core.graphics.drawable.IconCompat r6 = r7.mTrackerIcon
                android.graphics.drawable.Icon r5 = r6.toIcon(r1)
            L51:
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressTrackerIcon(r2, r5)
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r6 = r7.mProgressPoints
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressPoints(r2, r6)
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r6 = r7.mProgressSegments
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.setProgressSegments(r2, r6)
                r0.setStyle(r2)
                goto L71
            L62:
                int r1 = r7.getProgressMax()
                int r2 = r7.mProgress
                int r2 = java.lang.Math.min(r2, r1)
                boolean r3 = r7.mIndeterminate
                r0.setProgress(r1, r2, r3)
            L71:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.progressSegments"
                r2.remove(r0)
                java.lang.String r0 = "android.progress"
                r2.remove(r0)
                java.lang.String r0 = "android.styledByProgress"
                r2.remove(r0)
                java.lang.String r0 = "android.progressTrackerIcon"
                r2.remove(r0)
                java.lang.String r0 = "android.progressStartIcon"
                r2.remove(r0)
                java.lang.String r0 = "android.progressEndIcon"
                r2.remove(r0)
                java.lang.String r0 = "android.progressPoints"
                r2.remove(r0)
                java.lang.String r0 = "android.progressIndeterminate"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$ProgressStyle"
                return r0
        }

        public int getProgress() {
                r1 = this;
                int r0 = r1.mProgress
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getProgressEndIcon() {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r1.mEndIcon
                return r0
        }

        public int getProgressMax() {
                r7 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r7.mProgressSegments
                r1 = 100
                if (r0 == 0) goto L33
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto Ld
                goto L33
            Ld:
                r2 = 0
                r3 = 0
                r4 = 0
            L10:
                int r5 = r0.size()
                if (r4 >= r5) goto L2f
                java.lang.Object r5 = r0.get(r4)
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r5 = (androidx.core.app.NotificationCompat.ProgressStyle.Segment) r5
                int r5 = r5.getLength()
                if (r5 <= 0) goto L2c
                int r6 = java.lang.Math.addExact(r2, r5)     // Catch: java.lang.ArithmeticException -> L2a
                int r3 = r3 + 1
                r2 = r6
                goto L2c
            L2a:
                r6 = move-exception
                return r1
            L2c:
                int r4 = r4 + 1
                goto L10
            L2f:
                if (r3 != 0) goto L32
                return r1
            L32:
                return r2
            L33:
                return r1
        }

        public java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> getProgressPoints() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r1.mProgressPoints
                return r0
        }

        public java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> getProgressSegments() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r1.mProgressSegments
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getProgressStartIcon() {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r1.mStartIcon
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getProgressTrackerIcon() {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r1.mTrackerIcon
                return r0
        }

        public boolean isProgressIndeterminate() {
                r1 = this;
                boolean r0 = r1.mIndeterminate
                return r0
        }

        public boolean isStyledByProgress() {
                r1 = this;
                boolean r0 = r1.mIsStyledByProgress
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
                java.lang.String r1 = "android.progressSegments"
                java.util.ArrayList r0 = androidx.core.os.BundleCompat.getParcelableArrayList(r3, r1, r0)
                java.util.List r0 = getProgressSegmentsFromBundleList(r0)
                r2.mProgressSegments = r0
                java.lang.String r0 = "android.progress"
                r1 = 0
                int r0 = r3.getInt(r0, r1)
                r2.mProgress = r0
                java.lang.String r0 = "android.progressIndeterminate"
                boolean r0 = r3.getBoolean(r0, r1)
                r2.mIndeterminate = r0
                java.lang.String r0 = "android.styledByProgress"
                r1 = 1
                boolean r0 = r3.getBoolean(r0, r1)
                r2.mIsStyledByProgress = r0
                java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
                java.lang.String r1 = "android.progressPoints"
                java.util.ArrayList r0 = androidx.core.os.BundleCompat.getParcelableArrayList(r3, r1, r0)
                java.util.List r0 = getProgressPointsFromBundleList(r0)
                r2.mProgressPoints = r0
                java.lang.Class<android.graphics.drawable.Icon> r0 = android.graphics.drawable.Icon.class
                java.lang.String r1 = "android.progressTrackerIcon"
                java.lang.Object r0 = androidx.core.os.BundleCompat.getParcelable(r3, r1, r0)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                androidx.core.graphics.drawable.IconCompat r0 = asIconCompat(r0)
                r2.mTrackerIcon = r0
                java.lang.Class<android.graphics.drawable.Icon> r0 = android.graphics.drawable.Icon.class
                java.lang.String r1 = "android.progressStartIcon"
                java.lang.Object r0 = androidx.core.os.BundleCompat.getParcelable(r3, r1, r0)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                androidx.core.graphics.drawable.IconCompat r0 = asIconCompat(r0)
                r2.mStartIcon = r0
                java.lang.Class<android.graphics.drawable.Icon> r0 = android.graphics.drawable.Icon.class
                java.lang.String r1 = "android.progressEndIcon"
                java.lang.Object r0 = androidx.core.os.BundleCompat.getParcelable(r3, r1, r0)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                androidx.core.graphics.drawable.IconCompat r0 = asIconCompat(r0)
                r2.mEndIcon = r0
                return
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgress(int r1) {
                r0 = this;
                r0.mProgress = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressEndIcon(androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.mEndIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressIndeterminate(boolean r1) {
                r0 = this;
                r0.mIndeterminate = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressPoints(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> r3) {
                r2 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r2.mProgressPoints
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mProgressPoints = r0
            Lb:
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Point> r0 = r2.mProgressPoints
                r0.clear()
                java.util.Iterator r0 = r3.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                androidx.core.app.NotificationCompat$ProgressStyle$Point r1 = (androidx.core.app.NotificationCompat.ProgressStyle.Point) r1
                r2.addProgressPoint(r1)
                goto L14
            L24:
                return r2
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressSegments(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> r3) {
                r2 = this;
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r2.mProgressSegments
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mProgressSegments = r0
            Lb:
                java.util.List<androidx.core.app.NotificationCompat$ProgressStyle$Segment> r0 = r2.mProgressSegments
                r0.clear()
                java.util.Iterator r0 = r3.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                androidx.core.app.NotificationCompat$ProgressStyle$Segment r1 = (androidx.core.app.NotificationCompat.ProgressStyle.Segment) r1
                r2.addProgressSegment(r1)
                goto L14
            L24:
                return r2
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressStartIcon(androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.mStartIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressTrackerIcon(androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.mTrackerIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setStyledByProgress(boolean r1) {
                r0 = this;
                r0.mIsStyledByProgress = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        java.lang.CharSequence mBigContentTitle;
        protected androidx.core.app.NotificationCompat.Builder mBuilder;
        java.lang.CharSequence mSummaryText;
        boolean mSummaryTextSet;

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setChronometerCountDown(android.widget.RemoteViews r0, int r1, boolean r2) {
                    r0.setChronometerCountDown(r1, r2)
                    return
            }
        }

        public Style() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mSummaryTextSet = r0
                return
        }

        private int calculateTopPadding() {
                r7 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r7.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.R.dimen.notification_top_pad
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = androidx.core.R.dimen.notification_top_pad_large_text
                int r2 = r0.getDimensionPixelSize(r2)
                android.content.res.Configuration r3 = r0.getConfiguration()
                float r3 = r3.fontScale
                r4 = 1067869798(0x3fa66666, float:1.3)
                r5 = 1065353216(0x3f800000, float:1.0)
                float r4 = constrain(r3, r5, r4)
                float r4 = r4 - r5
                r6 = 1050253720(0x3e999998, float:0.29999995)
                float r4 = r4 / r6
                float r5 = r5 - r4
                float r6 = (float) r1
                float r5 = r5 * r6
                float r6 = (float) r2
                float r6 = r6 * r4
                float r5 = r5 + r6
                int r5 = java.lang.Math.round(r5)
                return r5
        }

        private static float constrain(float r1, float r2, float r3) {
                int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r0 >= 0) goto L6
                r0 = r2
                goto Ld
            L6:
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto Lc
                r0 = r3
                goto Ld
            Lc:
                r0 = r1
            Ld:
                return r0
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleByName(java.lang.String r1) {
                if (r1 == 0) goto L7f
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1915466044: goto L46;
                    case -716705180: goto L3c;
                    case -171946061: goto L32;
                    case 714386739: goto L28;
                    case 912942987: goto L1e;
                    case 919595044: goto L14;
                    case 2090799565: goto La;
                    default: goto L9;
                }
            L9:
                goto L50
            La:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 4
                goto L51
            L14:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 0
                goto L51
            L1e:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 2
                goto L51
            L28:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 5
                goto L51
            L32:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 1
                goto L51
            L3c:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 3
                goto L51
            L46:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$ProgressStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L9
                r0 = 6
                goto L51
            L50:
                r0 = -1
            L51:
                switch(r0) {
                    case 0: goto L79;
                    case 1: goto L73;
                    case 2: goto L6d;
                    case 3: goto L67;
                    case 4: goto L61;
                    case 5: goto L5b;
                    case 6: goto L55;
                    default: goto L54;
                }
            L54:
                goto L7f
            L55:
                androidx.core.app.NotificationCompat$ProgressStyle r0 = new androidx.core.app.NotificationCompat$ProgressStyle
                r0.<init>()
                return r0
            L5b:
                androidx.core.app.NotificationCompat$CallStyle r0 = new androidx.core.app.NotificationCompat$CallStyle
                r0.<init>()
                return r0
            L61:
                androidx.core.app.NotificationCompat$MessagingStyle r0 = new androidx.core.app.NotificationCompat$MessagingStyle
                r0.<init>()
                return r0
            L67:
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r0 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r0.<init>()
                return r0
            L6d:
                androidx.core.app.NotificationCompat$InboxStyle r0 = new androidx.core.app.NotificationCompat$InboxStyle
                r0.<init>()
                return r0
            L73:
                androidx.core.app.NotificationCompat$BigPictureStyle r0 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r0.<init>()
                return r0
            L79:
                androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
                r0.<init>()
                return r0
            L7f:
                r0 = 0
                return r0
        }

        private static androidx.core.app.NotificationCompat.Style constructCompatStyleByPlatformName(java.lang.String r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                java.lang.Class<android.app.Notification$BigPictureStyle> r1 = android.app.Notification.BigPictureStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L16
                androidx.core.app.NotificationCompat$BigPictureStyle r0 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r0.<init>()
                return r0
            L16:
                java.lang.Class<android.app.Notification$BigTextStyle> r1 = android.app.Notification.BigTextStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L28
                androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
                r0.<init>()
                return r0
            L28:
                java.lang.Class<android.app.Notification$InboxStyle> r1 = android.app.Notification.InboxStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L3a
                androidx.core.app.NotificationCompat$InboxStyle r0 = new androidx.core.app.NotificationCompat$InboxStyle
                r0.<init>()
                return r0
            L3a:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 36
                if (r1 < r2) goto L52
                java.lang.Class<android.app.Notification$ProgressStyle> r1 = android.app.Notification.ProgressStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L52
                androidx.core.app.NotificationCompat$ProgressStyle r0 = new androidx.core.app.NotificationCompat$ProgressStyle
                r0.<init>()
                return r0
            L52:
                java.lang.Class<android.app.Notification$MessagingStyle> r1 = android.app.Notification.MessagingStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L65
                androidx.core.app.NotificationCompat$MessagingStyle r0 = new androidx.core.app.NotificationCompat$MessagingStyle
                r0.<init>()
                return r0
            L65:
                java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r1 = android.app.Notification.DecoratedCustomViewStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L77
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r0 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r0.<init>()
                return r0
            L77:
                return r0
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleForBundle(android.os.Bundle r2) {
                java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                java.lang.String r0 = r2.getString(r0)
                androidx.core.app.NotificationCompat$Style r0 = constructCompatStyleByName(r0)
                if (r0 == 0) goto Ld
                return r0
            Ld:
                java.lang.String r1 = "android.selfDisplayName"
                boolean r1 = r2.containsKey(r1)
                if (r1 != 0) goto L81
                java.lang.String r1 = "android.messagingStyleUser"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L1e
                goto L81
            L1e:
                java.lang.String r1 = "android.picture"
                boolean r1 = r2.containsKey(r1)
                if (r1 != 0) goto L7b
                java.lang.String r1 = "android.pictureIcon"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L2f
                goto L7b
            L2f:
                java.lang.String r1 = "android.bigText"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L3d
                androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
                r1.<init>()
                return r1
            L3d:
                java.lang.String r1 = "android.textLines"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L4b
                androidx.core.app.NotificationCompat$InboxStyle r1 = new androidx.core.app.NotificationCompat$InboxStyle
                r1.<init>()
                return r1
            L4b:
                java.lang.String r1 = "android.callType"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L59
                androidx.core.app.NotificationCompat$CallStyle r1 = new androidx.core.app.NotificationCompat$CallStyle
                r1.<init>()
                return r1
            L59:
                java.lang.String r1 = "android.progressSegments"
                boolean r1 = r2.containsKey(r1)
                if (r1 != 0) goto L75
                java.lang.String r1 = "android.progressPoints"
                boolean r1 = r2.containsKey(r1)
                if (r1 == 0) goto L6a
                goto L75
            L6a:
                java.lang.String r1 = "android.template"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.NotificationCompat$Style r1 = constructCompatStyleByPlatformName(r1)
                return r1
            L75:
                androidx.core.app.NotificationCompat$ProgressStyle r1 = new androidx.core.app.NotificationCompat$ProgressStyle
                r1.<init>()
                return r1
            L7b:
                androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r1.<init>()
                return r1
            L81:
                androidx.core.app.NotificationCompat$MessagingStyle r1 = new androidx.core.app.NotificationCompat$MessagingStyle
                r1.<init>()
                return r1
        }

        static androidx.core.app.NotificationCompat.Style constructStyleForExtras(android.os.Bundle r3) {
                androidx.core.app.NotificationCompat$Style r0 = constructCompatStyleForBundle(r3)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0.restoreFromCompatExtras(r3)     // Catch: java.lang.ClassCastException -> Lc
                return r0
            Lc:
                r2 = move-exception
                return r1
        }

        private android.graphics.Bitmap createColoredBitmap(int r2, int r3, int r4) {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                android.content.Context r0 = r0.mContext
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r2)
                android.graphics.Bitmap r0 = r1.createColoredBitmap(r0, r3, r4)
                return r0
        }

        private android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat r8, int r9, int r10) {
                r7 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r7.mBuilder
                android.content.Context r0 = r0.mContext
                android.graphics.drawable.Drawable r0 = r8.loadDrawable(r0)
                if (r10 != 0) goto Lf
                int r1 = r0.getIntrinsicWidth()
                goto L10
            Lf:
                r1 = r10
            L10:
                if (r10 != 0) goto L17
                int r2 = r0.getIntrinsicHeight()
                goto L18
            L17:
                r2 = r10
            L18:
                android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
                r4 = 0
                r0.setBounds(r4, r4, r1, r2)
                if (r9 == 0) goto L32
                android.graphics.drawable.Drawable r4 = r0.mutate()
                android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
                android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
                r5.<init>(r9, r6)
                r4.setColorFilter(r5)
            L32:
                android.graphics.Canvas r4 = new android.graphics.Canvas
                r4.<init>(r3)
                r0.draw(r4)
                return r3
        }

        private android.graphics.Bitmap createIconWithBackground(int r8, int r9, int r10, int r11) {
                r7 = this;
                int r0 = androidx.core.R.drawable.notification_icon_background
                if (r11 != 0) goto L6
                r1 = 0
                goto L7
            L6:
                r1 = r11
            L7:
                android.graphics.Bitmap r0 = r7.createColoredBitmap(r0, r1, r9)
                android.graphics.Canvas r1 = new android.graphics.Canvas
                r1.<init>(r0)
                androidx.core.app.NotificationCompat$Builder r2 = r7.mBuilder
                android.content.Context r2 = r2.mContext
                android.content.res.Resources r2 = r2.getResources()
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r8)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                r3 = 1
                r2.setFilterBitmap(r3)
                int r3 = r9 - r10
                int r3 = r3 / 2
                int r4 = r10 + r3
                int r5 = r10 + r3
                r2.setBounds(r3, r3, r4, r5)
                android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
                r5 = -1
                android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r4.<init>(r5, r6)
                r2.setColorFilter(r4)
                r2.draw(r1)
                return r0
        }

        public static androidx.core.app.NotificationCompat.Style extractStyleFromNotification(android.app.Notification r2) {
                android.os.Bundle r0 = androidx.core.app.NotificationCompat.getExtras(r2)
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.app.NotificationCompat$Style r1 = constructStyleForExtras(r0)
                return r1
        }

        private void hideNormalContent(android.widget.RemoteViews r3) {
                r2 = this;
                int r0 = androidx.core.R.id.title
                r1 = 8
                r3.setViewVisibility(r0, r1)
                int r0 = androidx.core.R.id.text2
                r3.setViewVisibility(r0, r1)
                int r0 = androidx.core.R.id.text
                r3.setViewVisibility(r0, r1)
                return
        }

        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSummaryTextSet
                if (r0 == 0) goto Lb
                java.lang.String r0 = "android.summaryText"
                java.lang.CharSequence r1 = r2.mSummaryText
                r3.putCharSequence(r0, r1)
            Lb:
                java.lang.CharSequence r0 = r2.mBigContentTitle
                if (r0 == 0) goto L16
                java.lang.String r0 = "android.title.big"
                java.lang.CharSequence r1 = r2.mBigContentTitle
                r3.putCharSequence(r0, r1)
            L16:
                java.lang.String r0 = r2.getClassName()
                if (r0 == 0) goto L21
                java.lang.String r1 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                r3.putString(r1, r0)
            L21:
                return
        }

        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                return
        }

        public android.widget.RemoteViews applyStandardTemplate(boolean r19, int r20, boolean r21) {
                r18 = this;
                r0 = r18
                androidx.core.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.content.Context r1 = r1.mContext
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r2 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r3 = r0.mBuilder
                android.content.Context r3 = r3.mContext
                java.lang.String r3 = r3.getPackageName()
                r4 = r20
                r2.<init>(r3, r4)
                r5 = r2
                r2 = 0
                r3 = 0
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                int r6 = r6.getPriority()
                r7 = -1
                r11 = 1
                r12 = 0
                if (r6 >= r7) goto L29
                r6 = r11
                goto L2a
            L29:
                r6 = r12
            L2a:
                r13 = r6
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                androidx.core.graphics.drawable.IconCompat r6 = r6.mLargeIcon
                if (r6 == 0) goto L7b
                int r6 = androidx.core.R.id.icon
                r5.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.id.icon
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                androidx.core.graphics.drawable.IconCompat r7 = r7.mLargeIcon
                android.graphics.Bitmap r7 = r0.createColoredBitmap(r7, r12)
                r5.setImageViewBitmap(r6, r7)
                if (r19 == 0) goto Lb4
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                android.app.Notification r6 = r6.mNotification
                int r6 = r6.icon
                if (r6 == 0) goto Lb4
                int r6 = androidx.core.R.dimen.notification_right_icon_size
                int r6 = r1.getDimensionPixelSize(r6)
                int r7 = androidx.core.R.dimen.notification_small_icon_background_padding
                int r7 = r1.getDimensionPixelSize(r7)
                int r7 = r7 * 2
                int r7 = r6 - r7
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                android.app.Notification r8 = r8.mNotification
                int r8 = r8.icon
                androidx.core.app.NotificationCompat$Builder r9 = r0.mBuilder
                int r9 = r9.getColor()
                android.graphics.Bitmap r8 = r0.createIconWithBackground(r8, r6, r7, r9)
                int r9 = androidx.core.R.id.right_icon
                r5.setImageViewBitmap(r9, r8)
                int r8 = androidx.core.R.id.right_icon
                r5.setViewVisibility(r8, r12)
                goto Lb4
            L7b:
                if (r19 == 0) goto Lb4
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                android.app.Notification r6 = r6.mNotification
                int r6 = r6.icon
                if (r6 == 0) goto Lb4
                int r6 = androidx.core.R.id.icon
                r5.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.dimen.notification_large_icon_width
                int r6 = r1.getDimensionPixelSize(r6)
                int r7 = androidx.core.R.dimen.notification_big_circle_margin
                int r7 = r1.getDimensionPixelSize(r7)
                int r6 = r6 - r7
                int r7 = androidx.core.R.dimen.notification_small_icon_size_as_large
                int r7 = r1.getDimensionPixelSize(r7)
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                android.app.Notification r8 = r8.mNotification
                int r8 = r8.icon
                androidx.core.app.NotificationCompat$Builder r9 = r0.mBuilder
                int r9 = r9.getColor()
                android.graphics.Bitmap r8 = r0.createIconWithBackground(r8, r6, r7, r9)
                int r9 = androidx.core.R.id.icon
                r5.setImageViewBitmap(r9, r8)
            Lb4:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentTitle
                if (r6 == 0) goto Lc3
                int r6 = androidx.core.R.id.title
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentTitle
                r5.setTextViewText(r6, r7)
            Lc3:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentText
                if (r6 == 0) goto Ld3
                int r6 = androidx.core.R.id.text
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentText
                r5.setTextViewText(r6, r7)
                r2 = 1
            Ld3:
                r6 = r12
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentInfo
                if (r7 == 0) goto Lec
                int r7 = androidx.core.R.id.info
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                java.lang.CharSequence r8 = r8.mContentInfo
                r5.setTextViewText(r7, r8)
                int r7 = androidx.core.R.id.info
                r5.setViewVisibility(r7, r12)
                r2 = 1
                r6 = 1
                r14 = r6
                goto L12d
            Lec:
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                int r7 = r7.mNumber
                if (r7 <= 0) goto L125
                int r7 = androidx.core.R.integer.status_bar_notification_info_maxnum
                int r7 = r1.getInteger(r7)
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                int r8 = r8.mNumber
                if (r8 <= r7) goto L10a
                int r8 = androidx.core.R.id.info
                int r9 = androidx.core.R.string.status_bar_notification_info_overflow
                java.lang.String r9 = r1.getString(r9)
                r5.setTextViewText(r8, r9)
                goto L11c
            L10a:
                java.text.NumberFormat r8 = java.text.NumberFormat.getIntegerInstance()
                int r9 = androidx.core.R.id.info
                androidx.core.app.NotificationCompat$Builder r10 = r0.mBuilder
                int r10 = r10.mNumber
                long r14 = (long) r10
                java.lang.String r10 = r8.format(r14)
                r5.setTextViewText(r9, r10)
            L11c:
                int r8 = androidx.core.R.id.info
                r5.setViewVisibility(r8, r12)
                r2 = 1
                r6 = 1
                r14 = r6
                goto L12d
            L125:
                int r7 = androidx.core.R.id.info
                r8 = 8
                r5.setViewVisibility(r7, r8)
                r14 = r6
            L12d:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mSubText
                if (r6 == 0) goto L15c
                int r6 = androidx.core.R.id.text
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mSubText
                r5.setTextViewText(r6, r7)
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentText
                if (r6 == 0) goto L154
                int r6 = androidx.core.R.id.text2
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentText
                r5.setTextViewText(r6, r7)
                int r6 = androidx.core.R.id.text2
                r5.setViewVisibility(r6, r12)
                r3 = 1
                r15 = 8
                goto L15e
            L154:
                int r6 = androidx.core.R.id.text2
                r15 = 8
                r5.setViewVisibility(r6, r15)
                goto L15e
            L15c:
                r15 = 8
            L15e:
                if (r3 == 0) goto L177
                if (r21 == 0) goto L16e
                int r6 = androidx.core.R.dimen.notification_subtext_size
                int r6 = r1.getDimensionPixelSize(r6)
                float r6 = (float) r6
                int r7 = androidx.core.R.id.text
                r5.setTextViewTextSize(r7, r12, r6)
            L16e:
                int r6 = androidx.core.R.id.line1
                r9 = 0
                r10 = 0
                r7 = 0
                r8 = 0
                r5.setViewPadding(r6, r7, r8, r9, r10)
            L177:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                long r6 = r6.getWhenIfShowing()
                r8 = 0
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 == 0) goto L1d0
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                boolean r6 = r6.mUseChronometer
                if (r6 == 0) goto L1bd
                int r6 = androidx.core.R.id.chronometer
                r5.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                long r7 = r7.getWhenIfShowing()
                long r9 = android.os.SystemClock.elapsedRealtime()
                long r16 = java.lang.System.currentTimeMillis()
                long r9 = r9 - r16
                long r7 = r7 + r9
                java.lang.String r9 = "setBase"
                r5.setLong(r6, r9, r7)
                int r6 = androidx.core.R.id.chronometer
                java.lang.String r7 = "setStarted"
                r5.setBoolean(r6, r7, r11)
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                boolean r6 = r6.mChronometerCountDown
                if (r6 == 0) goto L1cf
                int r6 = androidx.core.R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                boolean r7 = r7.mChronometerCountDown
                androidx.core.app.NotificationCompat.Style.Api24Impl.setChronometerCountDown(r5, r6, r7)
                goto L1cf
            L1bd:
                int r6 = androidx.core.R.id.time
                r5.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.id.time
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                long r7 = r7.getWhenIfShowing()
                java.lang.String r9 = "setTime"
                r5.setLong(r6, r9, r7)
            L1cf:
                r14 = 1
            L1d0:
                int r6 = androidx.core.R.id.right_side
                if (r14 == 0) goto L1d6
                r8 = r12
                goto L1d7
            L1d6:
                r8 = r15
            L1d7:
                r5.setViewVisibility(r6, r8)
                int r6 = androidx.core.R.id.line3
                if (r2 == 0) goto L1df
                goto L1e0
            L1df:
                r12 = r15
            L1e0:
                r5.setViewVisibility(r6, r12)
                return r5
        }

        public android.app.Notification build() {
                r2 = this;
                r0 = 0
                androidx.core.app.NotificationCompat$Builder r1 = r2.mBuilder
                if (r1 == 0) goto Lb
                androidx.core.app.NotificationCompat$Builder r1 = r2.mBuilder
                android.app.Notification r0 = r1.build()
            Lb:
                return r0
        }

        public void buildIntoRemoteViews(android.widget.RemoteViews r9, android.widget.RemoteViews r10) {
                r8 = this;
                r8.hideNormalContent(r9)
                int r0 = androidx.core.R.id.notification_main_column
                r9.removeAllViews(r0)
                int r0 = androidx.core.R.id.notification_main_column
                android.widget.RemoteViews r1 = r10.clone()
                r9.addView(r0, r1)
                int r0 = androidx.core.R.id.notification_main_column
                r1 = 0
                r9.setViewVisibility(r0, r1)
                int r5 = r8.calculateTopPadding()
                int r3 = androidx.core.R.id.notification_main_column_container
                r6 = 0
                r7 = 0
                r4 = 0
                r2 = r9
                r2.setViewPadding(r3, r4, r5, r6, r7)
                return
        }

        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                java.lang.String r0 = "android.summaryText"
                r2.remove(r0)
                java.lang.String r0 = "android.title.big"
                r2.remove(r0)
                java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                r2.remove(r0)
                return
        }

        public android.graphics.Bitmap createColoredBitmap(int r2, int r3) {
                r1 = this;
                r0 = 0
                android.graphics.Bitmap r0 = r1.createColoredBitmap(r2, r3, r0)
                return r0
        }

        android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat r2, int r3) {
                r1 = this;
                r0 = 0
                android.graphics.Bitmap r0 = r1.createColoredBitmap(r2, r3, r0)
                return r0
        }

        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 0
                return r0
        }

        protected java.lang.String getClassName() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                java.lang.String r0 = "android.summaryText"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L11
                java.lang.CharSequence r0 = r3.getCharSequence(r0)
                r2.mSummaryText = r0
                r0 = 1
                r2.mSummaryTextSet = r0
            L11:
                java.lang.String r0 = "android.title.big"
                java.lang.CharSequence r0 = r3.getCharSequence(r0)
                r2.mBigContentTitle = r0
                return
        }

        public void setBuilder(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                if (r0 == r2) goto Lf
                r1.mBuilder = r2
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                if (r0 == 0) goto Lf
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                r0.setStyle(r1)
            Lf:
                return
        }
    }

    public static final class TvExtender implements androidx.core.app.NotificationCompat.Extender {
        static final java.lang.String EXTRA_CHANNEL_ID = "channel_id";
        static final java.lang.String EXTRA_CONTENT_INTENT = "content_intent";
        static final java.lang.String EXTRA_DELETE_INTENT = "delete_intent";
        private static final java.lang.String EXTRA_FLAGS = "flags";
        static final java.lang.String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        static final java.lang.String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final java.lang.String TAG = "TvExtender";
        private java.lang.String mChannelId;
        private android.app.PendingIntent mContentIntent;
        private android.app.PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mFlags = r0
                return
        }

        public TvExtender(android.app.Notification r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 >= r1) goto La
                return
            La:
                android.os.Bundle r0 = r3.extras
                if (r0 != 0) goto L10
                r0 = 0
                goto L18
            L10:
                android.os.Bundle r0 = r3.extras
                java.lang.String r1 = "android.tv.EXTENSIONS"
                android.os.Bundle r0 = r0.getBundle(r1)
            L18:
                if (r0 == 0) goto L46
                java.lang.String r1 = "flags"
                int r1 = r0.getInt(r1)
                r2.mFlags = r1
                java.lang.String r1 = "channel_id"
                java.lang.String r1 = r0.getString(r1)
                r2.mChannelId = r1
                java.lang.String r1 = "suppressShowOverApps"
                boolean r1 = r0.getBoolean(r1)
                r2.mSuppressShowOverApps = r1
                java.lang.String r1 = "content_intent"
                android.os.Parcelable r1 = r0.getParcelable(r1)
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
                r2.mContentIntent = r1
                java.lang.String r1 = "delete_intent"
                android.os.Parcelable r1 = r0.getParcelable(r1)
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
                r2.mDeleteIntent = r1
            L46:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r4) {
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 >= r1) goto L7
                return r4
            L7:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "flags"
                int r2 = r3.mFlags
                r0.putInt(r1, r2)
                java.lang.String r1 = "channel_id"
                java.lang.String r2 = r3.mChannelId
                r0.putString(r1, r2)
                java.lang.String r1 = "suppressShowOverApps"
                boolean r2 = r3.mSuppressShowOverApps
                r0.putBoolean(r1, r2)
                android.app.PendingIntent r1 = r3.mContentIntent
                if (r1 == 0) goto L2c
                java.lang.String r1 = "content_intent"
                android.app.PendingIntent r2 = r3.mContentIntent
                r0.putParcelable(r1, r2)
            L2c:
                android.app.PendingIntent r1 = r3.mDeleteIntent
                if (r1 == 0) goto L37
                java.lang.String r1 = "delete_intent"
                android.app.PendingIntent r2 = r3.mDeleteIntent
                r0.putParcelable(r1, r2)
            L37:
                android.os.Bundle r1 = r4.getExtras()
                java.lang.String r2 = "android.tv.EXTENSIONS"
                r1.putBundle(r2, r0)
                return r4
        }

        public java.lang.String getChannelId() {
                r1 = this;
                java.lang.String r0 = r1.mChannelId
                return r0
        }

        public android.app.PendingIntent getContentIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mContentIntent
                return r0
        }

        public android.app.PendingIntent getDeleteIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mDeleteIntent
                return r0
        }

        public boolean isAvailableOnTv() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public boolean isSuppressShowOverApps() {
                r1 = this;
                boolean r0 = r1.mSuppressShowOverApps
                return r0
        }

        public androidx.core.app.NotificationCompat.TvExtender setChannelId(java.lang.String r1) {
                r0 = this;
                r0.mChannelId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.TvExtender setContentIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mContentIntent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.TvExtender setDeleteIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mDeleteIntent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.TvExtender setSuppressShowOverApps(boolean r1) {
                r0 = this;
                r0.mSuppressShowOverApps = r1
                return r0
        }
    }

    public static final class WearableExtender implements androidx.core.app.NotificationCompat.Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final java.lang.String KEY_ACTIONS = "actions";
        private static final java.lang.String KEY_BACKGROUND = "background";
        private static final java.lang.String KEY_BRIDGE_TAG = "bridgeTag";
        private static final java.lang.String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final java.lang.String KEY_CONTENT_ICON = "contentIcon";
        private static final java.lang.String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final java.lang.String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final java.lang.String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final java.lang.String KEY_DISMISSAL_ID = "dismissalId";
        private static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        private static final java.lang.String KEY_FLAGS = "flags";
        private static final java.lang.String KEY_GRAVITY = "gravity";
        private static final java.lang.String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final java.lang.String KEY_PAGES = "pages";

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;

        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;

        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;

        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;

        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        private android.graphics.Bitmap mBackground;
        private java.lang.String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private java.lang.String mDismissalId;
        private android.app.PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private java.util.ArrayList<android.app.Notification> mPages;

        static class Api20Impl {
            private Api20Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder r1, android.os.Bundle r2) {
                    android.app.Notification$Action$Builder r0 = r1.addExtras(r2)
                    return r0
            }

            static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder r1, android.app.RemoteInput r2) {
                    android.app.Notification$Action$Builder r0 = r1.addRemoteInput(r2)
                    return r0
            }

            static android.app.Notification.Action build(android.app.Notification.Action.Builder r1) {
                    android.app.Notification$Action r0 = r1.build()
                    return r0
            }

            static android.app.Notification.Action.Builder createBuilder(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                    android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            public static androidx.core.app.NotificationCompat.Action getActionCompatFromAction(java.util.ArrayList<android.os.Parcelable> r1, int r2) {
                    java.lang.Object r0 = r1.get(r2)
                    android.app.Notification$Action r0 = (android.app.Notification.Action) r0
                    androidx.core.app.NotificationCompat$Action r0 = androidx.core.app.NotificationCompat.getActionCompatFromAction(r0)
                    return r0
            }
        }

        static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder createBuilder(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                    android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                    r0.<init>(r1, r2, r3)
                    return r0
            }
        }

        static class Api24Impl {
            private Api24Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder r1, boolean r2) {
                    android.app.Notification$Action$Builder r0 = r1.setAllowGeneratedReplies(r2)
                    return r0
            }
        }

        static class Api31Impl {
            private Api31Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder r1, boolean r2) {
                    android.app.Notification$Action$Builder r0 = r1.setAuthenticationRequired(r2)
                    return r0
            }
        }

        public WearableExtender() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mActions = r0
                r0 = 1
                r1.mFlags = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPages = r0
                r0 = 8388613(0x800005, float:1.175495E-38)
                r1.mContentIconGravity = r0
                r0 = -1
                r1.mContentActionIndex = r0
                r0 = 0
                r1.mCustomSizePreset = r0
                r0 = 80
                r1.mGravity = r0
                return
        }

        public WearableExtender(android.app.Notification r12) {
                r11 = this;
                r11.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r11.mActions = r0
                r0 = 1
                r11.mFlags = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r11.mPages = r1
                r1 = 8388613(0x800005, float:1.175495E-38)
                r11.mContentIconGravity = r1
                r2 = -1
                r11.mContentActionIndex = r2
                r3 = 0
                r11.mCustomSizePreset = r3
                r4 = 80
                r11.mGravity = r4
                android.os.Bundle r5 = androidx.core.app.NotificationCompat.getExtras(r12)
                if (r5 == 0) goto L30
                java.lang.String r6 = "android.wearable.EXTENSIONS"
                android.os.Bundle r6 = r5.getBundle(r6)
                goto L31
            L30:
                r6 = 0
            L31:
                if (r6 == 0) goto Lc7
            L35:
                java.lang.String r7 = "actions"
                java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
                if (r7 == 0) goto L56
                int r8 = r7.size()
                androidx.core.app.NotificationCompat$Action[] r8 = new androidx.core.app.NotificationCompat.Action[r8]
                r9 = 0
            L44:
                int r10 = r8.length
                if (r9 >= r10) goto L51
            L48:
                androidx.core.app.NotificationCompat$Action r10 = androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.getActionCompatFromAction(r7, r9)
                r8[r9] = r10
                int r9 = r9 + 1
                goto L44
            L51:
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r9 = r11.mActions
                java.util.Collections.addAll(r9, r8)
            L56:
                java.lang.String r8 = "flags"
                int r0 = r6.getInt(r8, r0)
                r11.mFlags = r0
                java.lang.String r0 = "displayIntent"
                android.os.Parcelable r0 = r6.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r11.mDisplayIntent = r0
                java.lang.String r0 = "pages"
                android.app.Notification[] r0 = androidx.core.app.NotificationCompat.getNotificationArrayFromBundle(r6, r0)
                if (r0 == 0) goto L75
                java.util.ArrayList<android.app.Notification> r8 = r11.mPages
                java.util.Collections.addAll(r8, r0)
            L75:
                java.lang.String r8 = "background"
                android.os.Parcelable r8 = r6.getParcelable(r8)
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r11.mBackground = r8
                java.lang.String r8 = "contentIcon"
                int r8 = r6.getInt(r8)
                r11.mContentIcon = r8
                java.lang.String r8 = "contentIconGravity"
                int r1 = r6.getInt(r8, r1)
                r11.mContentIconGravity = r1
                java.lang.String r1 = "contentActionIndex"
                int r1 = r6.getInt(r1, r2)
                r11.mContentActionIndex = r1
                java.lang.String r1 = "customSizePreset"
                int r1 = r6.getInt(r1, r3)
                r11.mCustomSizePreset = r1
                java.lang.String r1 = "customContentHeight"
                int r1 = r6.getInt(r1)
                r11.mCustomContentHeight = r1
                java.lang.String r1 = "gravity"
                int r1 = r6.getInt(r1, r4)
                r11.mGravity = r1
                java.lang.String r1 = "hintScreenTimeout"
                int r1 = r6.getInt(r1)
                r11.mHintScreenTimeout = r1
                java.lang.String r1 = "dismissalId"
                java.lang.String r1 = r6.getString(r1)
                r11.mDismissalId = r1
                java.lang.String r1 = "bridgeTag"
                java.lang.String r1 = r6.getString(r1)
                r11.mBridgeTag = r1
            Lc7:
                return
        }

        private static android.app.Notification.Action getActionFromActionCompat(androidx.core.app.NotificationCompat.Action r7) {
                androidx.core.graphics.drawable.IconCompat r0 = r7.getIconCompat()
                if (r0 != 0) goto L9
                r1 = 0
                goto Ld
            L9:
                android.graphics.drawable.Icon r1 = r0.toIcon()
            Ld:
                java.lang.CharSequence r2 = r7.getTitle()
                android.app.PendingIntent r3 = r7.getActionIntent()
                android.app.Notification$Action$Builder r0 = androidx.core.app.NotificationCompat.WearableExtender.Api23Impl.createBuilder(r1, r2, r3)
                android.os.Bundle r1 = r7.getExtras()
                if (r1 == 0) goto L2a
                android.os.Bundle r1 = new android.os.Bundle
                android.os.Bundle r2 = r7.getExtras()
                r1.<init>(r2)
                goto L2f
            L2a:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
            L2f:
                boolean r2 = r7.getAllowGeneratedReplies()
                java.lang.String r3 = "android.support.allowGeneratedReplies"
                r1.putBoolean(r3, r2)
                boolean r2 = r7.getAllowGeneratedReplies()
                androidx.core.app.NotificationCompat.WearableExtender.Api24Impl.setAllowGeneratedReplies(r0, r2)
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 31
                if (r2 < r3) goto L50
            L49:
                boolean r2 = r7.isAuthenticationRequired()
                androidx.core.app.NotificationCompat.WearableExtender.Api31Impl.setAuthenticationRequired(r0, r2)
            L50:
                androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.addExtras(r0, r1)
                androidx.core.app.RemoteInput[] r2 = r7.getRemoteInputs()
                if (r2 == 0) goto L69
                android.app.RemoteInput[] r3 = androidx.core.app.RemoteInput.fromCompat(r2)
                int r4 = r3.length
                r5 = 0
            L5f:
                if (r5 >= r4) goto L69
                r6 = r3[r5]
                androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.addRemoteInput(r0, r6)
                int r5 = r5 + 1
                goto L5f
            L69:
                android.app.Notification$Action r3 = androidx.core.app.NotificationCompat.WearableExtender.Api20Impl.build(r0)
                return r3
        }

        private void setFlag(int r3, boolean r4) {
                r2 = this;
                if (r4 == 0) goto L8
                int r0 = r2.mFlags
                r0 = r0 | r3
                r2.mFlags = r0
                goto Le
            L8:
                int r0 = r2.mFlags
                int r1 = ~r3
                r0 = r0 & r1
                r2.mFlags = r0
            Le:
                return
        }

        public androidx.core.app.NotificationCompat.WearableExtender addAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.add(r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender addActions(java.util.List<androidx.core.app.NotificationCompat.Action> r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.addAll(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPage(android.app.Notification r2) {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.add(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPages(java.util.List<android.app.Notification> r2) {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.addAll(r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender clearActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.clear()
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender clearPages() {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.clear()
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender clone() {
                r3 = this;
                androidx.core.app.NotificationCompat$WearableExtender r0 = new androidx.core.app.NotificationCompat$WearableExtender
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r3.mActions
                r1.<init>(r2)
                r0.mActions = r1
                int r1 = r3.mFlags
                r0.mFlags = r1
                android.app.PendingIntent r1 = r3.mDisplayIntent
                r0.mDisplayIntent = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<android.app.Notification> r2 = r3.mPages
                r1.<init>(r2)
                r0.mPages = r1
                android.graphics.Bitmap r1 = r3.mBackground
                r0.mBackground = r1
                int r1 = r3.mContentIcon
                r0.mContentIcon = r1
                int r1 = r3.mContentIconGravity
                r0.mContentIconGravity = r1
                int r1 = r3.mContentActionIndex
                r0.mContentActionIndex = r1
                int r1 = r3.mCustomSizePreset
                r0.mCustomSizePreset = r1
                int r1 = r3.mCustomContentHeight
                r0.mCustomContentHeight = r1
                int r1 = r3.mGravity
                r0.mGravity = r1
                int r1 = r3.mHintScreenTimeout
                r0.mHintScreenTimeout = r1
                java.lang.String r1 = r3.mDismissalId
                r0.mDismissalId = r1
                java.lang.String r1 = r3.mBridgeTag
                r0.mBridgeTag = r1
                return r0
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m46clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                androidx.core.app.NotificationCompat$WearableExtender r0 = r1.clone()
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r6) {
                r5 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r1 = r5.mActions
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L39
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r5.mActions
                int r2 = r2.size()
                r1.<init>(r2)
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r5.mActions
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L34
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
                android.app.Notification$Action r4 = getActionFromActionCompat(r3)
                r1.add(r4)
                goto L1e
            L34:
                java.lang.String r2 = "actions"
                r0.putParcelableArrayList(r2, r1)
            L39:
                int r1 = r5.mFlags
                r2 = 1
                if (r1 == r2) goto L45
                java.lang.String r1 = "flags"
                int r2 = r5.mFlags
                r0.putInt(r1, r2)
            L45:
                android.app.PendingIntent r1 = r5.mDisplayIntent
                if (r1 == 0) goto L50
                java.lang.String r1 = "displayIntent"
                android.app.PendingIntent r2 = r5.mDisplayIntent
                r0.putParcelable(r1, r2)
            L50:
                java.util.ArrayList<android.app.Notification> r1 = r5.mPages
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L6d
                java.util.ArrayList<android.app.Notification> r1 = r5.mPages
                java.util.ArrayList<android.app.Notification> r2 = r5.mPages
                int r2 = r2.size()
                android.app.Notification[] r2 = new android.app.Notification[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
                java.lang.String r2 = "pages"
                r0.putParcelableArray(r2, r1)
            L6d:
                android.graphics.Bitmap r1 = r5.mBackground
                if (r1 == 0) goto L78
                java.lang.String r1 = "background"
                android.graphics.Bitmap r2 = r5.mBackground
                r0.putParcelable(r1, r2)
            L78:
                int r1 = r5.mContentIcon
                if (r1 == 0) goto L83
                java.lang.String r1 = "contentIcon"
                int r2 = r5.mContentIcon
                r0.putInt(r1, r2)
            L83:
                int r1 = r5.mContentIconGravity
                r2 = 8388613(0x800005, float:1.175495E-38)
                if (r1 == r2) goto L91
                java.lang.String r1 = "contentIconGravity"
                int r2 = r5.mContentIconGravity
                r0.putInt(r1, r2)
            L91:
                int r1 = r5.mContentActionIndex
                r2 = -1
                if (r1 == r2) goto L9d
                java.lang.String r1 = "contentActionIndex"
                int r2 = r5.mContentActionIndex
                r0.putInt(r1, r2)
            L9d:
                int r1 = r5.mCustomSizePreset
                if (r1 == 0) goto La8
                java.lang.String r1 = "customSizePreset"
                int r2 = r5.mCustomSizePreset
                r0.putInt(r1, r2)
            La8:
                int r1 = r5.mCustomContentHeight
                if (r1 == 0) goto Lb3
                java.lang.String r1 = "customContentHeight"
                int r2 = r5.mCustomContentHeight
                r0.putInt(r1, r2)
            Lb3:
                int r1 = r5.mGravity
                r2 = 80
                if (r1 == r2) goto Lc0
                java.lang.String r1 = "gravity"
                int r2 = r5.mGravity
                r0.putInt(r1, r2)
            Lc0:
                int r1 = r5.mHintScreenTimeout
                if (r1 == 0) goto Lcb
                java.lang.String r1 = "hintScreenTimeout"
                int r2 = r5.mHintScreenTimeout
                r0.putInt(r1, r2)
            Lcb:
                java.lang.String r1 = r5.mDismissalId
                if (r1 == 0) goto Ld6
                java.lang.String r1 = "dismissalId"
                java.lang.String r2 = r5.mDismissalId
                r0.putString(r1, r2)
            Ld6:
                java.lang.String r1 = r5.mBridgeTag
                if (r1 == 0) goto Le1
                java.lang.String r1 = "bridgeTag"
                java.lang.String r2 = r5.mBridgeTag
                r0.putString(r1, r2)
            Le1:
                android.os.Bundle r1 = r6.getExtras()
                java.lang.String r2 = "android.wearable.EXTENSIONS"
                r1.putBundle(r2, r0)
                return r6
        }

        public java.util.List<androidx.core.app.NotificationCompat.Action> getActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                return r0
        }

        @java.lang.Deprecated
        public android.graphics.Bitmap getBackground() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBackground
                return r0
        }

        public java.lang.String getBridgeTag() {
                r1 = this;
                java.lang.String r0 = r1.mBridgeTag
                return r0
        }

        public int getContentAction() {
                r1 = this;
                int r0 = r1.mContentActionIndex
                return r0
        }

        @java.lang.Deprecated
        public int getContentIcon() {
                r1 = this;
                int r0 = r1.mContentIcon
                return r0
        }

        @java.lang.Deprecated
        public int getContentIconGravity() {
                r1 = this;
                int r0 = r1.mContentIconGravity
                return r0
        }

        public boolean getContentIntentAvailableOffline() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        @java.lang.Deprecated
        public int getCustomContentHeight() {
                r1 = this;
                int r0 = r1.mCustomContentHeight
                return r0
        }

        @java.lang.Deprecated
        public int getCustomSizePreset() {
                r1 = this;
                int r0 = r1.mCustomSizePreset
                return r0
        }

        public java.lang.String getDismissalId() {
                r1 = this;
                java.lang.String r0 = r1.mDismissalId
                return r0
        }

        @java.lang.Deprecated
        public android.app.PendingIntent getDisplayIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mDisplayIntent
                return r0
        }

        @java.lang.Deprecated
        public int getGravity() {
                r1 = this;
                int r0 = r1.mGravity
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintAmbientBigPicture() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintAvoidBackgroundClipping() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean getHintContentIntentLaunchesActivity() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 64
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintHideIcon() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public int getHintScreenTimeout() {
                r1 = this;
                int r0 = r1.mHintScreenTimeout
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintShowBackgroundOnly() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public java.util.List<android.app.Notification> getPages() {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                return r0
        }

        public boolean getStartScrollBottom() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setBackground(android.graphics.Bitmap r1) {
                r0 = this;
                r0.mBackground = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setBridgeTag(java.lang.String r1) {
                r0 = this;
                r0.mBridgeTag = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentAction(int r1) {
                r0 = this;
                r0.mContentActionIndex = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIcon(int r1) {
                r0 = this;
                r0.mContentIcon = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIconGravity(int r1) {
                r0 = this;
                r0.mContentIconGravity = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentIntentAvailableOffline(boolean r2) {
                r1 = this;
                r0 = 1
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomContentHeight(int r1) {
                r0 = this;
                r0.mCustomContentHeight = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomSizePreset(int r1) {
                r0 = this;
                r0.mCustomSizePreset = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setDismissalId(java.lang.String r1) {
                r0 = this;
                r0.mDismissalId = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setDisplayIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mDisplayIntent = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setGravity(int r1) {
                r0 = this;
                r0.mGravity = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAmbientBigPicture(boolean r2) {
                r1 = this;
                r0 = 32
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAvoidBackgroundClipping(boolean r2) {
                r1 = this;
                r0 = 16
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender setHintContentIntentLaunchesActivity(boolean r2) {
                r1 = this;
                r0 = 64
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintHideIcon(boolean r2) {
                r1 = this;
                r0 = 2
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintScreenTimeout(int r1) {
                r0 = this;
                r0.mHintScreenTimeout = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean r2) {
                r1 = this;
                r0 = 4
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean r2) {
                r1 = this;
                r0 = 8
                r1.setFlag(r0, r2)
                return r1
        }
    }

    @java.lang.Deprecated
    public NotificationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification r1, int r2) {
            android.app.Notification$Action[] r0 = r1.actions
            r0 = r0[r2]
            androidx.core.app.NotificationCompat$Action r0 = getActionCompatFromAction(r0)
            return r0
    }

    static androidx.core.app.NotificationCompat.Action getActionCompatFromAction(android.app.Notification.Action r18) {
            r0 = r18
            android.app.RemoteInput[] r1 = androidx.core.app.NotificationCompat.Api20Impl.getRemoteInputs(r0)
            r2 = 29
            r3 = 0
            if (r1 != 0) goto Le
            r4 = 0
            r11 = r4
            goto L41
        Le:
            int r4 = r1.length
            androidx.core.app.RemoteInput[] r4 = new androidx.core.app.RemoteInput[r4]
            r5 = 0
        L12:
            int r6 = r1.length
            if (r5 >= r6) goto L40
            r6 = r1[r5]
            androidx.core.app.RemoteInput r7 = new androidx.core.app.RemoteInput
            java.lang.String r8 = androidx.core.app.NotificationCompat.Api20Impl.getResultKey(r6)
            java.lang.CharSequence r9 = androidx.core.app.NotificationCompat.Api20Impl.getLabel(r6)
            java.lang.CharSequence[] r10 = androidx.core.app.NotificationCompat.Api20Impl.getChoices(r6)
            boolean r11 = androidx.core.app.NotificationCompat.Api20Impl.getAllowFreeFormInput(r6)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r2) goto L32
            int r12 = androidx.core.app.NotificationCompat.Api29Impl.getEditChoicesBeforeSending(r6)
            goto L33
        L32:
            r12 = r3
        L33:
            android.os.Bundle r13 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r6)
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L12
        L40:
            r11 = r4
        L41:
            android.os.Bundle r4 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r0)
            java.lang.String r5 = "android.support.allowGeneratedReplies"
            boolean r4 = r4.getBoolean(r5)
            r5 = 1
            if (r4 != 0) goto L58
            boolean r4 = androidx.core.app.NotificationCompat.Api24Impl.getAllowGeneratedReplies(r0)
            if (r4 == 0) goto L56
            goto L58
        L56:
            r13 = r3
            goto L59
        L58:
            r13 = r5
        L59:
            android.os.Bundle r4 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r0)
            java.lang.String r6 = "android.support.action.showsUserInterface"
            boolean r15 = r4.getBoolean(r6, r5)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L70
            int r4 = androidx.core.app.NotificationCompat.Api28Impl.getSemanticAction(r0)
            r14 = r4
            goto L7b
        L70:
            android.os.Bundle r4 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r0)
            java.lang.String r5 = "android.support.action.semanticAction"
            int r4 = r4.getInt(r5, r3)
            r14 = r4
        L7b:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L86
            boolean r2 = androidx.core.app.NotificationCompat.Api29Impl.isContextual(r0)
            r16 = r2
            goto L88
        L86:
            r16 = r3
        L88:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 < r4) goto L93
            boolean r3 = androidx.core.app.NotificationCompat.Api31Impl.isAuthenticationRequired(r0)
        L93:
            r17 = r3
            android.graphics.drawable.Icon r2 = androidx.core.app.NotificationCompat.Api23Impl.getIcon(r0)
            if (r2 != 0) goto Lb1
            int r2 = r0.icon
            if (r2 == 0) goto Lb1
            androidx.core.app.NotificationCompat$Action r6 = new androidx.core.app.NotificationCompat$Action
            int r7 = r0.icon
            java.lang.CharSequence r8 = r0.title
            android.app.PendingIntent r9 = r0.actionIntent
            android.os.Bundle r10 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r0)
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        Lb1:
            android.graphics.drawable.Icon r2 = androidx.core.app.NotificationCompat.Api23Impl.getIcon(r0)
            if (r2 != 0) goto Lb9
            r2 = 0
            goto Lc1
        Lb9:
            android.graphics.drawable.Icon r2 = androidx.core.app.NotificationCompat.Api23Impl.getIcon(r0)
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(r2)
        Lc1:
            r7 = r2
            androidx.core.app.NotificationCompat$Action r6 = new androidx.core.app.NotificationCompat$Action
            java.lang.CharSequence r8 = r0.title
            android.app.PendingIntent r9 = r0.actionIntent
            android.os.Bundle r10 = androidx.core.app.NotificationCompat.Api20Impl.getExtras(r0)
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
    }

    public static int getActionCount(android.app.Notification r1) {
            android.app.Notification$Action[] r0 = r1.actions
            if (r0 == 0) goto L8
            android.app.Notification$Action[] r0 = r1.actions
            int r0 = r0.length
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean getAllowSystemGeneratedContextualActions(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.app.NotificationCompat.Api29Impl.getAllowSystemGeneratedContextualActions(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean getAutoCancel(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static int getBadgeIconType(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r0 = androidx.core.app.NotificationCompat.Api26Impl.getBadgeIconType(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            android.app.Notification$BubbleMetadata r0 = androidx.core.app.NotificationCompat.Api29Impl.getBubbleMetadata(r2)
            androidx.core.app.NotificationCompat$BubbleMetadata r0 = androidx.core.app.NotificationCompat.BubbleMetadata.fromPlatform(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static java.lang.String getCategory(android.app.Notification r1) {
            java.lang.String r0 = r1.category
            return r0
    }

    public static java.lang.String getChannelId(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.core.app.NotificationCompat.Api26Impl.getChannelId(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static int getColor(android.app.Notification r1) {
            int r0 = r1.color
            return r0
    }

    public static java.lang.CharSequence getContentInfo(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.infoText"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public static java.lang.CharSequence getContentText(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.text"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public static java.lang.CharSequence getContentTitle(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.title"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "notification.extras")
    @java.lang.Deprecated
    public static android.os.Bundle getExtras(android.app.Notification r1) {
            android.os.Bundle r0 = r1.extras
            return r0
    }

    public static java.lang.String getGroup(android.app.Notification r1) {
            java.lang.String r0 = androidx.core.app.NotificationCompat.Api20Impl.getGroup(r1)
            return r0
    }

    public static int getGroupAlertBehavior(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r0 = androidx.core.app.NotificationCompat.Api26Impl.getGroupAlertBehavior(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    static boolean getHighPriority(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static java.util.List<androidx.core.app.NotificationCompat.Action> getInvisibleActions(android.app.Notification r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = r5.extras
            java.lang.String r2 = "android.car.EXTENSIONS"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L10
            return r0
        L10:
            java.lang.String r2 = "invisible_actions"
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L32
            r3 = 0
        L19:
            int r4 = r2.size()
            if (r3 >= r4) goto L32
        L20:
            java.lang.String r4 = java.lang.Integer.toString(r3)
            android.os.Bundle r4 = r2.getBundle(r4)
            androidx.core.app.NotificationCompat$Action r4 = androidx.core.app.NotificationCompatJellybean.getActionFromBundle(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L19
        L32:
            return r0
    }

    public static boolean getLocalOnly(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static androidx.core.content.LocusIdCompat getLocusId(android.app.Notification r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L13
            android.content.LocusId r0 = androidx.core.app.NotificationCompat.Api29Impl.getLocusId(r3)
            if (r0 != 0) goto Le
            goto L12
        Le:
            androidx.core.content.LocusIdCompat r2 = androidx.core.content.LocusIdCompat.toLocusIdCompat(r0)
        L12:
            return r2
        L13:
            return r2
    }

    static android.app.Notification[] getNotificationArrayFromBundle(android.os.Bundle r4, java.lang.String r5) {
            android.os.Parcelable[] r0 = r4.getParcelableArray(r5)
            boolean r1 = r0 instanceof android.app.Notification[]
            if (r1 != 0) goto L1f
            if (r0 != 0) goto Lb
            goto L1f
        Lb:
            int r1 = r0.length
            android.app.Notification[] r1 = new android.app.Notification[r1]
            r2 = 0
        Lf:
            int r3 = r0.length
            if (r2 >= r3) goto L1b
            r3 = r0[r2]
            android.app.Notification r3 = (android.app.Notification) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lf
        L1b:
            r4.putParcelableArray(r5, r1)
            return r1
        L1f:
            r1 = r0
            android.app.Notification[] r1 = (android.app.Notification[]) r1
            return r1
    }

    public static boolean getOngoing(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean getOnlyAlertOnce(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static java.util.List<androidx.core.app.Person> getPeople(android.app.Notification r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L34
            android.os.Bundle r1 = r6.extras
            java.lang.String r2 = "android.people.list"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r2)
            if (r1 == 0) goto L33
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L33
            java.util.Iterator r2 = r1.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            android.app.Person r3 = (android.app.Person) r3
            androidx.core.app.Person r4 = androidx.core.app.Person.fromAndroidPerson(r3)
            r0.add(r4)
            goto L1f
        L33:
            goto L5a
        L34:
            android.os.Bundle r1 = r6.extras
            java.lang.String r2 = "android.people"
            java.lang.String[] r1 = r1.getStringArray(r2)
            if (r1 == 0) goto L5a
            int r2 = r1.length
            if (r2 == 0) goto L5a
            int r2 = r1.length
            r3 = 0
        L43:
            if (r3 >= r2) goto L5a
            r4 = r1[r3]
            androidx.core.app.Person$Builder r5 = new androidx.core.app.Person$Builder
            r5.<init>()
            androidx.core.app.Person$Builder r5 = r5.setUri(r4)
            androidx.core.app.Person r5 = r5.build()
            r0.add(r5)
            int r3 = r3 + 1
            goto L43
        L5a:
            return r0
    }

    public static android.app.Notification getPublicVersion(android.app.Notification r1) {
            android.app.Notification r0 = r1.publicVersion
            return r0
    }

    public static java.lang.CharSequence getSettingsText(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.app.NotificationCompat.Api26Impl.getSettingsText(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.String getShortCriticalText(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.shortCriticalText"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public static java.lang.String getShortcutId(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.core.app.NotificationCompat.Api26Impl.getShortcutId(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean getShowWhen(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.showWhen"
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    public static java.lang.String getSortKey(android.app.Notification r1) {
            java.lang.String r0 = androidx.core.app.NotificationCompat.Api20Impl.getSortKey(r1)
            return r0
    }

    public static java.lang.CharSequence getSubText(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.subText"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public static long getTimeoutAfter(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            long r0 = androidx.core.app.NotificationCompat.Api26Impl.getTimeoutAfter(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean getUsesChronometer(android.app.Notification r2) {
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.showChronometer"
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    public static int getVisibility(android.app.Notification r1) {
            int r0 = r1.visibility
            return r0
    }

    public static boolean hasPromotableCharacteristics(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.app.NotificationCompat.Api36Impl.hasPromotableCharacteristics(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean isGroupSummary(android.app.Notification r1) {
            int r0 = r1.flags
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean isRequestPromotedOngoing(android.app.Notification r3) {
            android.os.Bundle r0 = r3.extras
            java.lang.String r1 = "android.requestPromotedOngoing"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static android.graphics.Bitmap reduceLargeIconSize(android.content.Context r11, android.graphics.Bitmap r12) {
            if (r12 == 0) goto L5d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L9
            goto L5d
        L9:
            android.content.res.Resources r0 = r11.getResources()
            int r1 = androidx.core.R.dimen.compat_notification_large_icon_max_width
            int r1 = r0.getDimensionPixelSize(r1)
            int r2 = androidx.core.R.dimen.compat_notification_large_icon_max_height
            int r2 = r0.getDimensionPixelSize(r2)
            int r3 = r12.getWidth()
            if (r3 > r1) goto L26
            int r3 = r12.getHeight()
            if (r3 > r2) goto L26
            return r12
        L26:
            double r3 = (double) r1
            int r5 = r12.getWidth()
            r6 = 1
            int r5 = java.lang.Math.max(r6, r5)
            double r7 = (double) r5
            double r3 = r3 / r7
            double r7 = (double) r2
            int r5 = r12.getHeight()
            int r5 = java.lang.Math.max(r6, r5)
            double r9 = (double) r5
            double r7 = r7 / r9
            double r3 = java.lang.Math.min(r3, r7)
            int r5 = r12.getWidth()
            double r7 = (double) r5
            double r7 = r7 * r3
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            int r7 = r12.getHeight()
            double r7 = (double) r7
            double r7 = r7 * r3
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r12, r5, r7, r6)
            return r5
        L5d:
            return r12
    }
}
