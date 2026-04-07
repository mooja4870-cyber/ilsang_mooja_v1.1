package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private final java.util.List<android.os.Bundle> mActionExtrasList;
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private final android.os.Bundle mExtras;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addAction(android.app.Notification.Builder r1, android.app.Notification.Action r2) {
                android.app.Notification$Builder r0 = r1.addAction(r2)
                return r0
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

        static java.lang.String getGroup(android.app.Notification r1) {
                java.lang.String r0 = r1.getGroup()
                return r0
        }

        static android.app.Notification.Builder setGroup(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setGroup(r2)
                return r0
        }

        static android.app.Notification.Builder setGroupSummary(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setGroupSummary(r2)
                return r0
        }

        static android.app.Notification.Builder setLocalOnly(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setLocalOnly(r2)
                return r0
        }

        static android.app.Notification.Builder setSortKey(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setSortKey(r2)
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

        static android.app.Notification.Builder setColor(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setColor(r2)
                return r0
        }

        static android.app.Notification.Builder setPublicVersion(android.app.Notification.Builder r1, android.app.Notification r2) {
                android.app.Notification$Builder r0 = r1.setPublicVersion(r2)
                return r0
        }

        static android.app.Notification.Builder setSound(android.app.Notification.Builder r1, android.net.Uri r2, java.lang.Object r3) {
                r0 = r3
                android.media.AudioAttributes r0 = (android.media.AudioAttributes) r0
                android.app.Notification$Builder r0 = r1.setSound(r2, r0)
                return r0
        }

        static android.app.Notification.Builder setVisibility(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setVisibility(r2)
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

        static android.app.Notification.Builder setLargeIcon(android.app.Notification.Builder r1, android.graphics.drawable.Icon r2) {
                android.app.Notification$Builder r0 = r1.setLargeIcon(r2)
                return r0
        }

        static android.app.Notification.Builder setSmallIcon(android.app.Notification.Builder r1, java.lang.Object r2) {
                r0 = r2
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.app.Notification$Builder r0 = r1.setSmallIcon(r0)
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

        static android.app.Notification.Builder setCustomBigContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomBigContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setCustomContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setCustomHeadsUpContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomHeadsUpContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setRemoteInputHistory(android.app.Notification.Builder r1, java.lang.CharSequence[] r2) {
                android.app.Notification$Builder r0 = r1.setRemoteInputHistory(r2)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder createBuilder(android.content.Context r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = new android.app.Notification$Builder
                r0.<init>(r1, r2)
                return r0
        }

        static android.app.Notification.Builder setBadgeIconType(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setBadgeIconType(r2)
                return r0
        }

        static android.app.Notification.Builder setColorized(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setColorized(r2)
                return r0
        }

        static android.app.Notification.Builder setGroupAlertBehavior(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setGroupAlertBehavior(r2)
                return r0
        }

        static android.app.Notification.Builder setSettingsText(android.app.Notification.Builder r1, java.lang.CharSequence r2) {
                android.app.Notification$Builder r0 = r1.setSettingsText(r2)
                return r0
        }

        static android.app.Notification.Builder setShortcutId(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setShortcutId(r2)
                return r0
        }

        static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder r1, long r2) {
                android.app.Notification$Builder r0 = r1.setTimeoutAfter(r2)
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

        static android.app.Notification.Action.Builder setSemanticAction(android.app.Notification.Action.Builder r1, int r2) {
                android.app.Notification$Action$Builder r0 = r1.setSemanticAction(r2)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setAllowSystemGeneratedContextualActions(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setAllowSystemGeneratedContextualActions(r2)
                return r0
        }

        static android.app.Notification.Builder setBubbleMetadata(android.app.Notification.Builder r1, android.app.Notification.BubbleMetadata r2) {
                android.app.Notification$Builder r0 = r1.setBubbleMetadata(r2)
                return r0
        }

        static android.app.Notification.Action.Builder setContextual(android.app.Notification.Action.Builder r1, boolean r2) {
                android.app.Notification$Action$Builder r0 = r1.setContextual(r2)
                return r0
        }

        static android.app.Notification.Builder setLocusId(android.app.Notification.Builder r1, java.lang.Object r2) {
                r0 = r2
                android.content.LocusId r0 = (android.content.LocusId) r0
                android.app.Notification$Builder r0 = r1.setLocusId(r0)
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

        static android.app.Notification.Builder setForegroundServiceBehavior(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setForegroundServiceBehavior(r2)
                return r0
        }
    }

    static final class Api36Impl {
        private Api36Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setShortCriticalText(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setShortCriticalText(r2)
                return r0
        }
    }

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mActionExtrasList = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.mExtras = r2
            r0.mBuilderCompat = r1
            android.content.Context r2 = r1.mContext
            r0.mContext = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L2c
            android.content.Context r2 = r1.mContext
            java.lang.String r4 = r1.mChannelId
            android.app.Notification$Builder r2 = androidx.core.app.NotificationCompatBuilder.Api26Impl.createBuilder(r2, r4)
            r0.mBuilder = r2
            goto L35
        L2c:
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r1.mContext
            r2.<init>(r4)
            r0.mBuilder = r2
        L35:
            android.app.Notification r2 = r1.mNotification
            android.app.Notification$Builder r4 = r0.mBuilder
            long r5 = r2.when
            android.app.Notification$Builder r4 = r4.setWhen(r5)
            int r5 = r2.icon
            int r6 = r2.iconLevel
            android.app.Notification$Builder r4 = r4.setSmallIcon(r5, r6)
            android.widget.RemoteViews r5 = r2.contentView
            android.app.Notification$Builder r4 = r4.setContent(r5)
            java.lang.CharSequence r5 = r2.tickerText
            android.widget.RemoteViews r6 = r1.mTickerView
            android.app.Notification$Builder r4 = r4.setTicker(r5, r6)
            long[] r5 = r2.vibrate
            android.app.Notification$Builder r4 = r4.setVibrate(r5)
            int r5 = r2.ledARGB
            int r6 = r2.ledOnMS
            int r7 = r2.ledOffMS
            android.app.Notification$Builder r4 = r4.setLights(r5, r6, r7)
            int r5 = r2.flags
            r6 = 2
            r5 = r5 & r6
            r8 = 0
            if (r5 == 0) goto L6e
            r5 = 1
            goto L6f
        L6e:
            r5 = r8
        L6f:
            android.app.Notification$Builder r4 = r4.setOngoing(r5)
            int r5 = r2.flags
            r5 = r5 & 8
            if (r5 == 0) goto L7b
            r5 = 1
            goto L7c
        L7b:
            r5 = r8
        L7c:
            android.app.Notification$Builder r4 = r4.setOnlyAlertOnce(r5)
            int r5 = r2.flags
            r5 = r5 & 16
            if (r5 == 0) goto L88
            r5 = 1
            goto L89
        L88:
            r5 = r8
        L89:
            android.app.Notification$Builder r4 = r4.setAutoCancel(r5)
            int r5 = r2.defaults
            android.app.Notification$Builder r4 = r4.setDefaults(r5)
            java.lang.CharSequence r5 = r1.mContentTitle
            android.app.Notification$Builder r4 = r4.setContentTitle(r5)
            java.lang.CharSequence r5 = r1.mContentText
            android.app.Notification$Builder r4 = r4.setContentText(r5)
            java.lang.CharSequence r5 = r1.mContentInfo
            android.app.Notification$Builder r4 = r4.setContentInfo(r5)
            android.app.PendingIntent r5 = r1.mContentIntent
            android.app.Notification$Builder r4 = r4.setContentIntent(r5)
            android.app.PendingIntent r5 = r2.deleteIntent
            android.app.Notification$Builder r4 = r4.setDeleteIntent(r5)
            android.app.PendingIntent r5 = r1.mFullScreenIntent
            int r9 = r2.flags
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto Lbb
            r9 = 1
            goto Lbc
        Lbb:
            r9 = r8
        Lbc:
            android.app.Notification$Builder r4 = r4.setFullScreenIntent(r5, r9)
            int r5 = r1.mNumber
            android.app.Notification$Builder r4 = r4.setNumber(r5)
            int r5 = r1.mProgressMax
            int r9 = r1.mProgress
            boolean r10 = r1.mProgressIndeterminate
            r4.setProgress(r5, r9, r10)
            android.app.Notification$Builder r4 = r0.mBuilder
            androidx.core.graphics.drawable.IconCompat r5 = r1.mLargeIcon
            r9 = 0
            if (r5 != 0) goto Ld9
            r5 = r9
            goto Le1
        Ld9:
            androidx.core.graphics.drawable.IconCompat r5 = r1.mLargeIcon
            android.content.Context r10 = r0.mContext
            android.graphics.drawable.Icon r5 = r5.toIcon(r10)
        Le1:
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setLargeIcon(r4, r5)
            android.app.Notification$Builder r4 = r0.mBuilder
            java.lang.CharSequence r5 = r1.mSubText
            android.app.Notification$Builder r4 = r4.setSubText(r5)
            boolean r5 = r1.mUseChronometer
            android.app.Notification$Builder r5 = r4.setUsesChronometer(r5)
            int r10 = r1.mPriority
            r5.setPriority(r10)
            androidx.core.app.NotificationCompat$Style r10 = r1.mStyle
            boolean r10 = r10 instanceof androidx.core.app.NotificationCompat.CallStyle
            if (r10 == 0) goto L11b
            androidx.core.app.NotificationCompat$Style r10 = r1.mStyle
            androidx.core.app.NotificationCompat$CallStyle r10 = (androidx.core.app.NotificationCompat.CallStyle) r10
            java.util.ArrayList r10 = r10.getActionsListWithSystemActions()
            java.util.Iterator r11 = r10.iterator()
        L10a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L11a
            java.lang.Object r12 = r11.next()
            androidx.core.app.NotificationCompat$Action r12 = (androidx.core.app.NotificationCompat.Action) r12
            r0.addAction(r12)
            goto L10a
        L11a:
            goto L131
        L11b:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r10 = r1.mActions
            java.util.Iterator r10 = r10.iterator()
        L121:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L131
            java.lang.Object r11 = r10.next()
            androidx.core.app.NotificationCompat$Action r11 = (androidx.core.app.NotificationCompat.Action) r11
            r0.addAction(r11)
            goto L121
        L131:
            android.os.Bundle r10 = r1.mExtras
            if (r10 == 0) goto L13c
            android.os.Bundle r10 = r0.mExtras
            android.os.Bundle r11 = r1.mExtras
            r10.putAll(r11)
        L13c:
            android.widget.RemoteViews r10 = r1.mContentView
            r0.mContentView = r10
            android.widget.RemoteViews r10 = r1.mBigContentView
            r0.mBigContentView = r10
            android.app.Notification$Builder r10 = r0.mBuilder
            boolean r11 = r1.mShowWhen
            r10.setShowWhen(r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            boolean r11 = r1.mLocalOnly
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setLocalOnly(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            java.lang.String r11 = r1.mGroupKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            java.lang.String r11 = r1.mSortKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setSortKey(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            boolean r11 = r1.mGroupSummary
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroupSummary(r10, r11)
            int r10 = r1.mGroupAlertBehavior
            r0.mGroupAlertBehavior = r10
            android.app.Notification$Builder r10 = r0.mBuilder
            java.lang.String r11 = r1.mCategory
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setCategory(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            int r11 = r1.mColor
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setColor(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            int r11 = r1.mVisibility
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setVisibility(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            android.app.Notification r11 = r1.mPublicVersion
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setPublicVersion(r10, r11)
            android.app.Notification$Builder r10 = r0.mBuilder
            android.net.Uri r11 = r2.sound
            android.media.AudioAttributes r12 = r2.audioAttributes
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setSound(r10, r11, r12)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 >= r11) goto L1a7
            java.util.ArrayList<androidx.core.app.Person> r10 = r1.mPersonList
            java.util.List r10 = getPeople(r10)
            java.util.ArrayList<java.lang.String> r12 = r1.mPeople
            java.util.List r10 = combineLists(r10, r12)
            goto L1a9
        L1a7:
            java.util.ArrayList<java.lang.String> r10 = r1.mPeople
        L1a9:
            if (r10 == 0) goto L1c7
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L1c7
            java.util.Iterator r12 = r10.iterator()
        L1b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1c7
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            android.app.Notification$Builder r14 = r0.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api21Impl.addPerson(r14, r13)
            goto L1b5
        L1c7:
            android.widget.RemoteViews r12 = r1.mHeadsUpContentView
            r0.mHeadsUpContentView = r12
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r12 = r1.mInvisibleActions
            int r12 = r12.size()
            if (r12 <= 0) goto L22a
        L1d4:
            android.os.Bundle r12 = r1.getExtras()
            java.lang.String r13 = "android.car.EXTENSIONS"
            android.os.Bundle r12 = r12.getBundle(r13)
            if (r12 != 0) goto L1e6
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            r12 = r14
        L1e6:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r12)
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r16 = 0
            r7 = r16
        L1f4:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r6 = r1.mInvisibleActions
            int r6 = r6.size()
            if (r7 >= r6) goto L216
        L1fd:
            java.lang.String r6 = java.lang.Integer.toString(r7)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r11 = r1.mInvisibleActions
            java.lang.Object r11 = r11.get(r7)
            androidx.core.app.NotificationCompat$Action r11 = (androidx.core.app.NotificationCompat.Action) r11
            android.os.Bundle r11 = androidx.core.app.NotificationCompatJellybean.getBundleForAction(r11)
            r15.putBundle(r6, r11)
            int r7 = r7 + 1
            r6 = 2
            r11 = 28
            goto L1f4
        L216:
            java.lang.String r6 = "invisible_actions"
            r12.putBundle(r6, r15)
            r14.putBundle(r6, r15)
            android.os.Bundle r6 = r1.getExtras()
            r6.putBundle(r13, r12)
            android.os.Bundle r6 = r0.mExtras
            r6.putBundle(r13, r14)
        L22a:
            java.lang.Object r6 = r1.mSmallIcon
            if (r6 == 0) goto L236
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.Object r7 = r1.mSmallIcon
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setSmallIcon(r6, r7)
        L236:
            android.app.Notification$Builder r6 = r0.mBuilder
            android.os.Bundle r7 = r1.mExtras
            r6.setExtras(r7)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.CharSequence[] r7 = r1.mRemoteInputHistory
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setRemoteInputHistory(r6, r7)
            android.widget.RemoteViews r6 = r1.mContentView
            if (r6 == 0) goto L250
            android.app.Notification$Builder r6 = r0.mBuilder
            android.widget.RemoteViews r7 = r1.mContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomContentView(r6, r7)
        L250:
            android.widget.RemoteViews r6 = r1.mBigContentView
            if (r6 == 0) goto L25b
            android.app.Notification$Builder r6 = r0.mBuilder
            android.widget.RemoteViews r7 = r1.mBigContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomBigContentView(r6, r7)
        L25b:
            android.widget.RemoteViews r6 = r1.mHeadsUpContentView
            if (r6 == 0) goto L266
            android.app.Notification$Builder r6 = r0.mBuilder
            android.widget.RemoteViews r7 = r1.mHeadsUpContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomHeadsUpContentView(r6, r7)
        L266:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L2b1
            android.app.Notification$Builder r6 = r0.mBuilder
            int r7 = r1.mBadgeIcon
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setBadgeIconType(r6, r7)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.CharSequence r7 = r1.mSettingsText
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setSettingsText(r6, r7)
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.String r7 = r1.mShortcutId
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setShortcutId(r6, r7)
            android.app.Notification$Builder r6 = r0.mBuilder
            long r10 = r1.mTimeout
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setTimeoutAfter(r6, r10)
            android.app.Notification$Builder r6 = r0.mBuilder
            int r7 = r1.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r6, r7)
            boolean r6 = r1.mColorizedSet
            if (r6 == 0) goto L298
            android.app.Notification$Builder r6 = r0.mBuilder
            boolean r7 = r1.mColorized
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setColorized(r6, r7)
        L298:
            java.lang.String r6 = r1.mChannelId
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L2b1
            android.app.Notification$Builder r6 = r0.mBuilder
            android.app.Notification$Builder r6 = r6.setSound(r9)
            android.app.Notification$Builder r6 = r6.setDefaults(r8)
            android.app.Notification$Builder r6 = r6.setLights(r8, r8, r8)
            r6.setVibrate(r9)
        L2b1:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 < r7) goto L2d3
            java.util.ArrayList<androidx.core.app.Person> r6 = r1.mPersonList
            java.util.Iterator r6 = r6.iterator()
        L2bd:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2d3
            java.lang.Object r7 = r6.next()
            androidx.core.app.Person r7 = (androidx.core.app.Person) r7
            android.app.Notification$Builder r8 = r0.mBuilder
            android.app.Person r10 = r7.toAndroidPerson()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.addPerson(r8, r10)
            goto L2bd
        L2d3:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r6 < r7) goto L2fa
            android.app.Notification$Builder r6 = r0.mBuilder
            boolean r7 = r1.mAllowSystemGeneratedContextualActions
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setAllowSystemGeneratedContextualActions(r6, r7)
            android.app.Notification$Builder r6 = r0.mBuilder
            androidx.core.app.NotificationCompat$BubbleMetadata r7 = r1.mBubbleMetadata
            android.app.Notification$BubbleMetadata r7 = androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(r7)
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setBubbleMetadata(r6, r7)
            androidx.core.content.LocusIdCompat r6 = r1.mLocusId
            if (r6 == 0) goto L2fa
            android.app.Notification$Builder r6 = r0.mBuilder
            androidx.core.content.LocusIdCompat r7 = r1.mLocusId
            android.content.LocusId r7 = r7.toLocusId()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setLocusId(r6, r7)
        L2fa:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r6 < r7) goto L30b
            int r6 = r1.mFgsDeferBehavior
            if (r6 == 0) goto L30b
            android.app.Notification$Builder r6 = r0.mBuilder
            int r7 = r1.mFgsDeferBehavior
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setForegroundServiceBehavior(r6, r7)
        L30b:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 36
            if (r6 < r7) goto L318
            android.app.Notification$Builder r6 = r0.mBuilder
            java.lang.String r7 = r1.mShortCriticalText
            androidx.core.app.NotificationCompatBuilder.Api36Impl.setShortCriticalText(r6, r7)
        L318:
            boolean r6 = r1.mSilent
            if (r6 == 0) goto L362
            androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilderCompat
            boolean r6 = r6.mGroupSummary
            if (r6 == 0) goto L326
            r6 = 2
            r0.mGroupAlertBehavior = r6
            goto L329
        L326:
            r6 = 1
            r0.mGroupAlertBehavior = r6
        L329:
            android.app.Notification$Builder r6 = r0.mBuilder
            r6.setVibrate(r9)
            android.app.Notification$Builder r6 = r0.mBuilder
            r6.setSound(r9)
            int r6 = r2.defaults
            r6 = r6 & (-2)
            r2.defaults = r6
            int r6 = r2.defaults
            r6 = r6 & (-3)
            r2.defaults = r6
            android.app.Notification$Builder r6 = r0.mBuilder
            int r7 = r2.defaults
            r6.setDefaults(r7)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L362
            androidx.core.app.NotificationCompat$Builder r3 = r0.mBuilderCompat
            java.lang.String r3 = r3.mGroupKey
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L35b
            android.app.Notification$Builder r3 = r0.mBuilder
            java.lang.String r6 = "silent"
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r3, r6)
        L35b:
            android.app.Notification$Builder r3 = r0.mBuilder
            int r6 = r0.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r3, r6)
        L362:
            return
    }

    private void addAction(androidx.core.app.NotificationCompat.Action r7) {
            r6 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r7.getIconCompat()
            if (r0 == 0) goto Ld
            android.graphics.drawable.Icon r1 = r0.toIcon()
            goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.CharSequence r2 = r7.getTitle()
            android.app.PendingIntent r3 = r7.getActionIntent()
            android.app.Notification$Action$Builder r1 = androidx.core.app.NotificationCompatBuilder.Api23Impl.createBuilder(r1, r2, r3)
            androidx.core.app.RemoteInput[] r2 = r7.getRemoteInputs()
            if (r2 == 0) goto L35
        L21:
            androidx.core.app.RemoteInput[] r2 = r7.getRemoteInputs()
            android.app.RemoteInput[] r2 = androidx.core.app.RemoteInput.fromCompat(r2)
            int r3 = r2.length
            r4 = 0
        L2b:
            if (r4 >= r3) goto L35
            r5 = r2[r4]
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addRemoteInput(r1, r5)
            int r4 = r4 + 1
            goto L2b
        L35:
            android.os.Bundle r2 = r7.getExtras()
            if (r2 == 0) goto L45
            android.os.Bundle r2 = new android.os.Bundle
            android.os.Bundle r3 = r7.getExtras()
            r2.<init>(r3)
            goto L4a
        L45:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L4a:
            boolean r3 = r7.getAllowGeneratedReplies()
            java.lang.String r4 = "android.support.allowGeneratedReplies"
            r2.putBoolean(r4, r3)
            boolean r3 = r7.getAllowGeneratedReplies()
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setAllowGeneratedReplies(r1, r3)
            int r3 = r7.getSemanticAction()
            java.lang.String r4 = "android.support.action.semanticAction"
            r2.putInt(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L74
            int r3 = r7.getSemanticAction()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.setSemanticAction(r1, r3)
        L74:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L81
            boolean r3 = r7.isContextual()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setContextual(r1, r3)
        L81:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L8f
        L88:
            boolean r3 = r7.isAuthenticationRequired()
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setAuthenticationRequired(r1, r3)
        L8f:
            boolean r3 = r7.getShowsUserInterface()
            java.lang.String r4 = "android.support.action.showsUserInterface"
            r2.putBoolean(r4, r3)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addExtras(r1, r2)
            android.app.Notification$Builder r3 = r6.mBuilder
            android.app.Notification$Action r4 = androidx.core.app.NotificationCompatBuilder.Api20Impl.build(r1)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addAction(r3, r4)
            return
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.core.app.Person r2 = (androidx.core.app.Person) r2
            java.lang.String r3 = r2.resolveToLegacyUri()
            r0.add(r3)
            goto L11
        L25:
            return r0
    }

    private void removeSoundAndVibration(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-2)
            r2.defaults = r0
            int r0 = r2.defaults
            r0 = r0 & (-3)
            r2.defaults = r0
            return
    }

    public android.app.Notification build() {
            r4 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r4.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            if (r0 == 0) goto L9
            r0.apply(r4)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.makeContentView(r4)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r4.buildInternal()
            if (r1 == 0) goto L1b
            r2.contentView = r1
            goto L27
        L1b:
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            android.widget.RemoteViews r3 = r3.mContentView
            if (r3 == 0) goto L27
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            android.widget.RemoteViews r3 = r3.mContentView
            r2.contentView = r3
        L27:
            if (r0 == 0) goto L31
            android.widget.RemoteViews r3 = r0.makeBigContentView(r4)
            if (r3 == 0) goto L31
            r2.bigContentView = r3
        L31:
            if (r0 == 0) goto L3f
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r3 = r3.mStyle
            android.widget.RemoteViews r3 = r3.makeHeadsUpContentView(r4)
            if (r3 == 0) goto L3f
            r2.headsUpContentView = r3
        L3f:
            if (r0 == 0) goto L4a
            android.os.Bundle r3 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r3 == 0) goto L4a
            r0.addCompatExtras(r3)
        L4a:
            return r2
    }

    protected android.app.Notification buildInternal() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.Notification$Builder r0 = r3.mBuilder
            android.app.Notification r0 = r0.build()
            return r0
        Ld:
            android.app.Notification$Builder r0 = r3.mBuilder
            android.app.Notification r0 = r0.build()
            int r1 = r3.mGroupAlertBehavior
            if (r1 == 0) goto L40
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L2c
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L2c
            int r1 = r3.mGroupAlertBehavior
            r2 = 2
            if (r1 != r2) goto L2c
            r3.removeSoundAndVibration(r0)
        L2c:
            java.lang.String r1 = androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(r0)
            if (r1 == 0) goto L40
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L40
            int r1 = r3.mGroupAlertBehavior
            r2 = 1
            if (r1 != r2) goto L40
            r3.removeSoundAndVibration(r0)
        L40:
            return r0
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }
}
