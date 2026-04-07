package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    java.lang.String mDescription;
    final java.lang.String mId;
    java.lang.CharSequence mName;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.NotificationChannelGroup createNotificationChannelGroup(java.lang.String r1, java.lang.CharSequence r2) {
                android.app.NotificationChannelGroup r0 = new android.app.NotificationChannelGroup
                r0.<init>(r1, r2)
                return r0
        }

        static java.util.List<android.app.NotificationChannel> getChannels(android.app.NotificationChannelGroup r1) {
                java.util.List r0 = r1.getChannels()
                return r0
        }

        static java.lang.String getGroup(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getGroup()
                return r0
        }

        static java.lang.String getId(android.app.NotificationChannelGroup r1) {
                java.lang.String r0 = r1.getId()
                return r0
        }

        static java.lang.CharSequence getName(android.app.NotificationChannelGroup r1) {
                java.lang.CharSequence r0 = r1.getName()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getDescription(android.app.NotificationChannelGroup r1) {
                java.lang.String r0 = r1.getDescription()
                return r0
        }

        static boolean isBlocked(android.app.NotificationChannelGroup r1) {
                boolean r0 = r1.isBlocked()
                return r0
        }

        static void setDescription(android.app.NotificationChannelGroup r0, java.lang.String r1) {
                r0.setDescription(r1)
                return
        }
    }

    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
                r0.<init>(r2)
                r1.mGroup = r0
                return
        }

        public androidx.core.app.NotificationChannelGroupCompat build() {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                return r0
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mDescription = r2
                return r1
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mName = r2
                return r1
        }
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r0)
            return
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup r3, java.util.List<android.app.NotificationChannel> r4) {
            r2 = this;
            java.lang.String r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getId(r3)
            r2.<init>(r0)
            java.lang.CharSequence r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getName(r3)
            r2.mName = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r0 = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.getDescription(r3)
            r2.mDescription = r0
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L2e
            boolean r0 = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.isBlocked(r3)
            r2.mBlocked = r0
            java.util.List r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getChannels(r3)
            java.util.List r0 = r2.getChannelsCompat(r0)
            r2.mChannels = r0
            goto L34
        L2e:
            java.util.List r0 = r2.getChannelsCompat(r4)
            r2.mChannels = r0
        L34:
            return
    }

    NotificationChannelGroupCompat(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.mChannels = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.mId = r0
            return
    }

    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            android.app.NotificationChannel r2 = (android.app.NotificationChannel) r2
            java.lang.String r3 = r5.mId
            java.lang.String r4 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getGroup(r2)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L29
            androidx.core.app.NotificationChannelCompat r3 = new androidx.core.app.NotificationChannelCompat
            r3.<init>(r2)
            r0.add(r3)
        L29:
            goto L9
        L2a:
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
            r1 = this;
            java.util.List<androidx.core.app.NotificationChannelCompat> r0 = r1.mChannels
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.mDescription
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    android.app.NotificationChannelGroup getNotificationChannelGroup() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r3.mId
            java.lang.CharSequence r1 = r3.mName
            android.app.NotificationChannelGroup r0 = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.createNotificationChannelGroup(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L1b
            java.lang.String r1 = r3.mDescription
            androidx.core.app.NotificationChannelGroupCompat.Api28Impl.setDescription(r0, r1)
        L1b:
            return r0
    }

    public boolean isBlocked() {
            r1 = this;
            boolean r0 = r1.mBlocked
            return r0
    }

    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
            r2 = this;
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = new androidx.core.app.NotificationChannelGroupCompat$Builder
            java.lang.String r1 = r2.mId
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.mName
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setName(r1)
            java.lang.String r1 = r2.mDescription
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setDescription(r1)
            return r0
    }
}
