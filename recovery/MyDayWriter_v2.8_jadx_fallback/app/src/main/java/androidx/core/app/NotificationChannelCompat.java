package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelCompat {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    android.media.AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    java.lang.String mConversationId;
    java.lang.String mDescription;
    java.lang.String mGroupId;
    final java.lang.String mId;
    int mImportance;
    private boolean mImportantConversation;
    int mLightColor;
    boolean mLights;
    private int mLockscreenVisibility;
    java.lang.CharSequence mName;
    java.lang.String mParentId;
    boolean mShowBadge;
    android.net.Uri mSound;
    boolean mVibrationEnabled;
    long[] mVibrationPattern;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canBypassDnd(android.app.NotificationChannel r1) {
                boolean r0 = r1.canBypassDnd()
                return r0
        }

        static boolean canShowBadge(android.app.NotificationChannel r1) {
                boolean r0 = r1.canShowBadge()
                return r0
        }

        static android.app.NotificationChannel createNotificationChannel(java.lang.String r1, java.lang.CharSequence r2, int r3) {
                android.app.NotificationChannel r0 = new android.app.NotificationChannel
                r0.<init>(r1, r2, r3)
                return r0
        }

        static void enableLights(android.app.NotificationChannel r0, boolean r1) {
                r0.enableLights(r1)
                return
        }

        static void enableVibration(android.app.NotificationChannel r0, boolean r1) {
                r0.enableVibration(r1)
                return
        }

        static android.media.AudioAttributes getAudioAttributes(android.app.NotificationChannel r1) {
                android.media.AudioAttributes r0 = r1.getAudioAttributes()
                return r0
        }

        static java.lang.String getDescription(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getDescription()
                return r0
        }

        static java.lang.String getGroup(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getGroup()
                return r0
        }

        static java.lang.String getId(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getId()
                return r0
        }

        static int getImportance(android.app.NotificationChannel r1) {
                int r0 = r1.getImportance()
                return r0
        }

        static int getLightColor(android.app.NotificationChannel r1) {
                int r0 = r1.getLightColor()
                return r0
        }

        static int getLockscreenVisibility(android.app.NotificationChannel r1) {
                int r0 = r1.getLockscreenVisibility()
                return r0
        }

        static java.lang.CharSequence getName(android.app.NotificationChannel r1) {
                java.lang.CharSequence r0 = r1.getName()
                return r0
        }

        static android.net.Uri getSound(android.app.NotificationChannel r1) {
                android.net.Uri r0 = r1.getSound()
                return r0
        }

        static long[] getVibrationPattern(android.app.NotificationChannel r1) {
                long[] r0 = r1.getVibrationPattern()
                return r0
        }

        static void setDescription(android.app.NotificationChannel r0, java.lang.String r1) {
                r0.setDescription(r1)
                return
        }

        static void setGroup(android.app.NotificationChannel r0, java.lang.String r1) {
                r0.setGroup(r1)
                return
        }

        static void setLightColor(android.app.NotificationChannel r0, int r1) {
                r0.setLightColor(r1)
                return
        }

        static void setShowBadge(android.app.NotificationChannel r0, boolean r1) {
                r0.setShowBadge(r1)
                return
        }

        static void setSound(android.app.NotificationChannel r0, android.net.Uri r1, android.media.AudioAttributes r2) {
                r0.setSound(r1, r2)
                return
        }

        static void setVibrationPattern(android.app.NotificationChannel r0, long[] r1) {
                r0.setVibrationPattern(r1)
                return
        }

        static boolean shouldShowLights(android.app.NotificationChannel r1) {
                boolean r0 = r1.shouldShowLights()
                return r0
        }

        static boolean shouldVibrate(android.app.NotificationChannel r1) {
                boolean r0 = r1.shouldVibrate()
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canBubble(android.app.NotificationChannel r1) {
                boolean r0 = r1.canBubble()
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getConversationId(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getConversationId()
                return r0
        }

        static java.lang.String getParentChannelId(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getParentChannelId()
                return r0
        }

        static boolean isImportantConversation(android.app.NotificationChannel r1) {
                boolean r0 = r1.isImportantConversation()
                return r0
        }

        static void setConversationId(android.app.NotificationChannel r0, java.lang.String r1, java.lang.String r2) {
                r0.setConversationId(r1, r2)
                return
        }
    }

    public static class Builder {
        private final androidx.core.app.NotificationChannelCompat mChannel;

        public Builder(java.lang.String r2, int r3) {
                r1 = this;
                r1.<init>()
                androidx.core.app.NotificationChannelCompat r0 = new androidx.core.app.NotificationChannelCompat
                r0.<init>(r2, r3)
                r1.mChannel = r0
                return
        }

        public androidx.core.app.NotificationChannelCompat build() {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                return r0
        }

        public androidx.core.app.NotificationChannelCompat.Builder setConversationId(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto Le
                androidx.core.app.NotificationChannelCompat r0 = r2.mChannel
                r0.mParentId = r3
                androidx.core.app.NotificationChannelCompat r0 = r2.mChannel
                r0.mConversationId = r4
            Le:
                return r2
        }

        public androidx.core.app.NotificationChannelCompat.Builder setDescription(java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mDescription = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setGroup(java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mGroupId = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setImportance(int r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mImportance = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightColor(int r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mLightColor = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightsEnabled(boolean r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mLights = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setName(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mName = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setShowBadge(boolean r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mShowBadge = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setSound(android.net.Uri r2, android.media.AudioAttributes r3) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mSound = r2
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mAudioAttributes = r3
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationEnabled(boolean r2) {
                r1 = this;
                androidx.core.app.NotificationChannelCompat r0 = r1.mChannel
                r0.mVibrationEnabled = r2
                return r1
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationPattern(long[] r3) {
                r2 = this;
                androidx.core.app.NotificationChannelCompat r0 = r2.mChannel
                if (r3 == 0) goto L9
                int r1 = r3.length
                if (r1 <= 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                r0.mVibrationEnabled = r1
                androidx.core.app.NotificationChannelCompat r0 = r2.mChannel
                r0.mVibrationPattern = r3
                return r2
        }
    }

    NotificationChannelCompat(android.app.NotificationChannel r4) {
            r3 = this;
            java.lang.String r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getId(r4)
            int r1 = androidx.core.app.NotificationChannelCompat.Api26Impl.getImportance(r4)
            r3.<init>(r0, r1)
            java.lang.CharSequence r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getName(r4)
            r3.mName = r0
            java.lang.String r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getDescription(r4)
            r3.mDescription = r0
            java.lang.String r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getGroup(r4)
            r3.mGroupId = r0
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.canShowBadge(r4)
            r3.mShowBadge = r0
            android.net.Uri r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getSound(r4)
            r3.mSound = r0
            android.media.AudioAttributes r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getAudioAttributes(r4)
            r3.mAudioAttributes = r0
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.shouldShowLights(r4)
            r3.mLights = r0
            int r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getLightColor(r4)
            r3.mLightColor = r0
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.shouldVibrate(r4)
            r3.mVibrationEnabled = r0
            long[] r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getVibrationPattern(r4)
            r3.mVibrationPattern = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L59
            java.lang.String r0 = androidx.core.app.NotificationChannelCompat.Api30Impl.getParentChannelId(r4)
            r3.mParentId = r0
            java.lang.String r0 = androidx.core.app.NotificationChannelCompat.Api30Impl.getConversationId(r4)
            r3.mConversationId = r0
        L59:
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.canBypassDnd(r4)
            r3.mBypassDnd = r0
            int r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.getLockscreenVisibility(r4)
            r3.mLockscreenVisibility = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L71
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api29Impl.canBubble(r4)
            r3.mCanBubble = r0
        L71:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L7b
            boolean r0 = androidx.core.app.NotificationChannelCompat.Api30Impl.isImportantConversation(r4)
            r3.mImportantConversation = r0
        L7b:
            return
    }

    NotificationChannelCompat(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShowBadge = r0
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r1.mSound = r0
            r0 = 0
            r1.mLightColor = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.mId = r0
            r1.mImportance = r3
            android.media.AudioAttributes r0 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            r1.mAudioAttributes = r0
            return
    }

    public boolean canBubble() {
            r1 = this;
            boolean r0 = r1.mCanBubble
            return r0
    }

    public boolean canBypassDnd() {
            r1 = this;
            boolean r0 = r1.mBypassDnd
            return r0
    }

    public boolean canShowBadge() {
            r1 = this;
            boolean r0 = r1.mShowBadge
            return r0
    }

    public android.media.AudioAttributes getAudioAttributes() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            return r0
    }

    public java.lang.String getConversationId() {
            r1 = this;
            java.lang.String r0 = r1.mConversationId
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.mDescription
            return r0
    }

    public java.lang.String getGroup() {
            r1 = this;
            java.lang.String r0 = r1.mGroupId
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public int getImportance() {
            r1 = this;
            int r0 = r1.mImportance
            return r0
    }

    public int getLightColor() {
            r1 = this;
            int r0 = r1.mLightColor
            return r0
    }

    public int getLockscreenVisibility() {
            r1 = this;
            int r0 = r1.mLockscreenVisibility
            return r0
    }

    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    android.app.NotificationChannel getNotificationChannel() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r3.mId
            java.lang.CharSequence r1 = r3.mName
            int r2 = r3.mImportance
            android.app.NotificationChannel r0 = androidx.core.app.NotificationChannelCompat.Api26Impl.createNotificationChannel(r0, r1, r2)
            java.lang.String r1 = r3.mDescription
            androidx.core.app.NotificationChannelCompat.Api26Impl.setDescription(r0, r1)
            java.lang.String r1 = r3.mGroupId
            androidx.core.app.NotificationChannelCompat.Api26Impl.setGroup(r0, r1)
            boolean r1 = r3.mShowBadge
            androidx.core.app.NotificationChannelCompat.Api26Impl.setShowBadge(r0, r1)
            android.net.Uri r1 = r3.mSound
            android.media.AudioAttributes r2 = r3.mAudioAttributes
            androidx.core.app.NotificationChannelCompat.Api26Impl.setSound(r0, r1, r2)
            boolean r1 = r3.mLights
            androidx.core.app.NotificationChannelCompat.Api26Impl.enableLights(r0, r1)
            int r1 = r3.mLightColor
            androidx.core.app.NotificationChannelCompat.Api26Impl.setLightColor(r0, r1)
            long[] r1 = r3.mVibrationPattern
            androidx.core.app.NotificationChannelCompat.Api26Impl.setVibrationPattern(r0, r1)
            boolean r1 = r3.mVibrationEnabled
            androidx.core.app.NotificationChannelCompat.Api26Impl.enableVibration(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L51
            java.lang.String r1 = r3.mParentId
            if (r1 == 0) goto L51
            java.lang.String r1 = r3.mConversationId
            if (r1 == 0) goto L51
            java.lang.String r1 = r3.mParentId
            java.lang.String r2 = r3.mConversationId
            androidx.core.app.NotificationChannelCompat.Api30Impl.setConversationId(r0, r1, r2)
        L51:
            return r0
    }

    public java.lang.String getParentChannelId() {
            r1 = this;
            java.lang.String r0 = r1.mParentId
            return r0
    }

    public android.net.Uri getSound() {
            r1 = this;
            android.net.Uri r0 = r1.mSound
            return r0
    }

    public long[] getVibrationPattern() {
            r1 = this;
            long[] r0 = r1.mVibrationPattern
            return r0
    }

    public boolean isImportantConversation() {
            r1 = this;
            boolean r0 = r1.mImportantConversation
            return r0
    }

    public boolean shouldShowLights() {
            r1 = this;
            boolean r0 = r1.mLights
            return r0
    }

    public boolean shouldVibrate() {
            r1 = this;
            boolean r0 = r1.mVibrationEnabled
            return r0
    }

    public androidx.core.app.NotificationChannelCompat.Builder toBuilder() {
            r3 = this;
            androidx.core.app.NotificationChannelCompat$Builder r0 = new androidx.core.app.NotificationChannelCompat$Builder
            java.lang.String r1 = r3.mId
            int r2 = r3.mImportance
            r0.<init>(r1, r2)
            java.lang.CharSequence r1 = r3.mName
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setName(r1)
            java.lang.String r1 = r3.mDescription
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setDescription(r1)
            java.lang.String r1 = r3.mGroupId
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setGroup(r1)
            boolean r1 = r3.mShowBadge
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setShowBadge(r1)
            android.net.Uri r1 = r3.mSound
            android.media.AudioAttributes r2 = r3.mAudioAttributes
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setSound(r1, r2)
            boolean r1 = r3.mLights
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setLightsEnabled(r1)
            int r1 = r3.mLightColor
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setLightColor(r1)
            boolean r1 = r3.mVibrationEnabled
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setVibrationEnabled(r1)
            long[] r1 = r3.mVibrationPattern
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setVibrationPattern(r1)
            java.lang.String r1 = r3.mParentId
            java.lang.String r2 = r3.mConversationId
            androidx.core.app.NotificationChannelCompat$Builder r0 = r0.setConversationId(r1, r2)
            return r0
    }
}
