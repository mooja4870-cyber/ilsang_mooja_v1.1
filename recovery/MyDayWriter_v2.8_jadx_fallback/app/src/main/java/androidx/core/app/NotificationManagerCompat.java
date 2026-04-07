package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final java.lang.String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final java.lang.String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final java.lang.String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final java.lang.String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final java.lang.String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final java.lang.String TAG = "NotifManCompat";
    private static java.util.Set<java.lang.String> sEnabledNotificationListenerPackages;
    private static java.lang.String sEnabledNotificationListeners;
    private static final java.lang.Object sEnabledNotificationListenersLock = null;
    private static final java.lang.Object sLock = null;
    private static androidx.core.app.NotificationManagerCompat.SideChannelManager sSideChannelManager;
    private final android.content.Context mContext;
    private final android.app.NotificationManager mNotificationManager;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.List<android.service.notification.StatusBarNotification> getActiveNotifications(android.app.NotificationManager r2) {
                android.service.notification.StatusBarNotification[] r0 = r2.getActiveNotifications()
                if (r0 != 0) goto Lc
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                return r1
            Lc:
                java.util.List r1 = java.util.Arrays.asList(r0)
                return r1
        }

        static int getCurrentInterruptionFilter(android.app.NotificationManager r1) {
                int r0 = r1.getCurrentInterruptionFilter()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean areNotificationsEnabled(android.app.NotificationManager r1) {
                boolean r0 = r1.areNotificationsEnabled()
                return r0
        }

        static int getImportance(android.app.NotificationManager r1) {
                int r0 = r1.getImportance()
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void createNotificationChannel(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
                r0.createNotificationChannel(r1)
                return
        }

        static void createNotificationChannelGroup(android.app.NotificationManager r0, android.app.NotificationChannelGroup r1) {
                r0.createNotificationChannelGroup(r1)
                return
        }

        static void createNotificationChannelGroups(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannelGroup> r1) {
                r0.createNotificationChannelGroups(r1)
                return
        }

        static void createNotificationChannels(android.app.NotificationManager r0, java.util.List<android.app.NotificationChannel> r1) {
                r0.createNotificationChannels(r1)
                return
        }

        static void deleteNotificationChannel(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannel(r1)
                return
        }

        static void deleteNotificationChannelGroup(android.app.NotificationManager r0, java.lang.String r1) {
                r0.deleteNotificationChannelGroup(r1)
                return
        }

        static java.lang.String getId(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getId()
                return r0
        }

        static java.lang.String getId(android.app.NotificationChannelGroup r1) {
                java.lang.String r0 = r1.getId()
                return r0
        }

        static android.app.NotificationChannel getNotificationChannel(android.app.NotificationManager r1, java.lang.String r2) {
                android.app.NotificationChannel r0 = r1.getNotificationChannel(r2)
                return r0
        }

        static java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(android.app.NotificationManager r1) {
                java.util.List r0 = r1.getNotificationChannelGroups()
                return r0
        }

        static java.util.List<android.app.NotificationChannel> getNotificationChannels(android.app.NotificationManager r1) {
                java.util.List r0 = r1.getNotificationChannels()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.NotificationChannelGroup getNotificationChannelGroup(android.app.NotificationManager r1, java.lang.String r2) {
                android.app.NotificationChannelGroup r0 = r1.getNotificationChannelGroup(r2)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.NotificationChannel getNotificationChannel(android.app.NotificationManager r1, java.lang.String r2, java.lang.String r3) {
                android.app.NotificationChannel r0 = r1.getNotificationChannel(r2, r3)
                return r0
        }

        static java.lang.String getParentChannelId(android.app.NotificationChannel r1) {
                java.lang.String r0 = r1.getParentChannelId()
                return r0
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canUseFullScreenIntent(android.app.NotificationManager r1) {
                boolean r0 = r1.canUseFullScreenIntent()
                return r0
        }
    }

    static class Api36Impl {
        private Api36Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canPostPromotedNotifications(android.app.NotificationManager r1) {
                boolean r0 = r1.canPostPromotedNotifications()
                return r0
        }
    }

    private static class CancelTask implements androidx.core.app.NotificationManagerCompat.Task {
        final boolean all;
        final int id;
        final java.lang.String packageName;
        final java.lang.String tag;

        CancelTask(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r1.packageName = r2
                r0 = 0
                r1.id = r0
                r0 = 0
                r1.tag = r0
                r0 = 1
                r1.all = r0
                return
        }

        CancelTask(java.lang.String r2, int r3, java.lang.String r4) {
                r1 = this;
                r1.<init>()
                r1.packageName = r2
                r1.id = r3
                r1.tag = r4
                r0 = 0
                r1.all = r0
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r4) throws android.os.RemoteException {
                r3 = this;
                boolean r0 = r3.all
                if (r0 == 0) goto La
                java.lang.String r0 = r3.packageName
                r4.cancelAll(r0)
                goto L13
            La:
                java.lang.String r0 = r3.packageName
                int r1 = r3.id
                java.lang.String r2 = r3.tag
                r4.cancel(r0, r1, r2)
            L13:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CancelTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.packageName
                r1.append(r2)
                java.lang.String r1 = ", id:"
                java.lang.StringBuilder r1 = r0.append(r1)
                int r2 = r3.id
                r1.append(r2)
                java.lang.String r1 = ", tag:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.tag
                r1.append(r2)
                java.lang.String r1 = ", all:"
                java.lang.StringBuilder r1 = r0.append(r1)
                boolean r2 = r3.all
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
        final int mId;
        android.app.Notification mNotification;
        final java.lang.String mTag;

        public NotificationWithIdAndTag(int r2, android.app.Notification r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        public NotificationWithIdAndTag(java.lang.String r1, int r2, android.app.Notification r3) {
                r0 = this;
                r0.<init>()
                r0.mTag = r1
                r0.mId = r2
                r0.mNotification = r3
                return
        }
    }

    private static class NotifyTask implements androidx.core.app.NotificationManagerCompat.Task {
        final int id;
        final android.app.Notification notif;
        final java.lang.String packageName;
        final java.lang.String tag;

        NotifyTask(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.id = r2
                r0.tag = r3
                r0.notif = r4
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r5) throws android.os.RemoteException {
                r4 = this;
                java.lang.String r0 = r4.packageName
                int r1 = r4.id
                java.lang.String r2 = r4.tag
                android.app.Notification r3 = r4.notif
                r5.notify(r0, r1, r2, r3)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotifyTask["
                r0.<init>(r1)
                java.lang.String r1 = "packageName:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.packageName
                r1.append(r2)
                java.lang.String r1 = ", id:"
                java.lang.StringBuilder r1 = r0.append(r1)
                int r2 = r3.id
                r1.append(r2)
                java.lang.String r1 = ", tag:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.tag
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    private static class ServiceConnectedEvent {
        final android.content.ComponentName componentName;
        final android.os.IBinder iBinder;

        ServiceConnectedEvent(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.<init>()
                r0.componentName = r1
                r0.iBinder = r2
                return
        }
    }

    private static class SideChannelManager implements android.os.Handler.Callback, android.content.ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private java.util.Set<java.lang.String> mCachedEnabledPackages;
        private final android.content.Context mContext;
        private final android.os.Handler mHandler;
        private final android.os.HandlerThread mHandlerThread;
        private final java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> mRecordMap;

        private static class ListenerRecord {
            boolean bound;
            final android.content.ComponentName componentName;
            int retryCount;
            android.support.v4.app.INotificationSideChannel service;
            java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat.Task> taskQueue;

            ListenerRecord(android.content.ComponentName r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 0
                    r2.bound = r0
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r2.taskQueue = r1
                    r2.retryCount = r0
                    r2.componentName = r3
                    return
            }
        }

        SideChannelManager(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.mRecordMap = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.mCachedEnabledPackages = r0
                r2.mContext = r3
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "NotificationManagerCompat"
                r0.<init>(r1)
                r2.mHandlerThread = r0
                android.os.HandlerThread r0 = r2.mHandlerThread
                r0.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.HandlerThread r1 = r2.mHandlerThread
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r1, r2)
                r2.mHandler = r0
                return
        }

        private boolean ensureServiceBound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r4) {
                r3 = this;
                boolean r0 = r4.bound
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r0.<init>(r1)
                android.content.ComponentName r1 = r4.componentName
                android.content.Intent r0 = r0.setComponent(r1)
                android.content.Context r1 = r3.mContext
                r2 = 33
                boolean r1 = r1.bindService(r0, r3, r2)
                r4.bound = r1
                boolean r1 = r4.bound
                if (r1 == 0) goto L25
                r1 = 0
                r4.retryCount = r1
                goto L44
            L25:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to bind to listener "
                java.lang.StringBuilder r1 = r1.append(r2)
                android.content.ComponentName r2 = r4.componentName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "NotifManCompat"
                android.util.Log.w(r2, r1)
                android.content.Context r1 = r3.mContext
                r1.unbindService(r3)
            L44:
                boolean r1 = r4.bound
                return r1
        }

        private void ensureServiceUnbound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r2) {
                r1 = this;
                boolean r0 = r2.bound
                if (r0 == 0) goto Lc
                android.content.Context r0 = r1.mContext
                r0.unbindService(r1)
                r0 = 0
                r2.bound = r0
            Lc:
                r0 = 0
                r2.service = r0
                return
        }

        private void handleQueueTask(androidx.core.app.NotificationManagerCompat.Task r4) {
                r3 = this;
                r3.updateListenerMap()
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r3.mRecordMap
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r1 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r1
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r1.taskQueue
                r2.add(r4)
                r3.processListenerQueue(r1)
                goto Ld
            L22:
                return
        }

        private void handleRetryListenerQueue(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r0 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r0 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r0
                if (r0 == 0) goto Ld
                r1.processListenerQueue(r0)
            Ld:
                return
        }

        private void handleServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                r2 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r2.mRecordMap
                java.lang.Object r0 = r0.get(r3)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r0 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r0
                if (r0 == 0) goto L16
                android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.asInterface(r4)
                r0.service = r1
                r1 = 0
                r0.retryCount = r1
                r2.processListenerQueue(r0)
            L16:
                return
        }

        private void handleServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r0 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r0 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r0
                if (r0 == 0) goto Ld
                r1.ensureServiceUnbound(r0)
            Ld:
                return
        }

        private void processListenerQueue(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r6) {
                r5 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L37
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Processing component "
                java.lang.StringBuilder r2 = r2.append(r3)
                android.content.ComponentName r3 = r6.componentName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ", "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r3 = r6.taskQueue
                int r3 = r3.size()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " queued tasks"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r0, r2)
            L37:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L40
                return
            L40:
                boolean r2 = r5.ensureServiceBound(r6)
                if (r2 == 0) goto Lc5
                android.support.v4.app.INotificationSideChannel r2 = r6.service
                if (r2 != 0) goto L4c
                goto Lc5
            L4c:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                java.lang.Object r2 = r2.peek()
                androidx.core.app.NotificationManagerCompat$Task r2 = (androidx.core.app.NotificationManagerCompat.Task) r2
                if (r2 != 0) goto L57
                goto Lb9
            L57:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                if (r3 == 0) goto L73
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                r3.<init>()     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                java.lang.String r4 = "Sending task "
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                java.lang.StringBuilder r3 = r3.append(r2)     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                android.util.Log.d(r0, r3)     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
            L73:
                android.support.v4.app.INotificationSideChannel r3 = r6.service     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                r2.send(r3)     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r3 = r6.taskQueue     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                r3.remove()     // Catch: android.os.RemoteException -> L7f android.os.DeadObjectException -> L99
                goto L4c
            L7f:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "RemoteException communicating with "
                java.lang.StringBuilder r3 = r3.append(r4)
                android.content.ComponentName r4 = r6.componentName
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r0, r3, r1)
                goto Lb9
            L99:
                r3 = move-exception
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto Lb8
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Remote service has died: "
                java.lang.StringBuilder r1 = r1.append(r4)
                android.content.ComponentName r4 = r6.componentName
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            Lb8:
            Lb9:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r6.taskQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Lc4
                r5.scheduleListenerRetry(r6)
            Lc4:
                return
            Lc5:
                r5.scheduleListenerRetry(r6)
                return
        }

        private void scheduleListenerRetry(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r6) {
                r5 = this;
                android.os.Handler r0 = r5.mHandler
                android.content.ComponentName r1 = r6.componentName
                r2 = 3
                boolean r0 = r0.hasMessages(r2, r1)
                if (r0 == 0) goto Lc
                return
            Lc:
                int r0 = r6.retryCount
                r1 = 1
                int r0 = r0 + r1
                r6.retryCount = r0
                int r0 = r6.retryCount
                r3 = 6
                java.lang.String r4 = "NotifManCompat"
                if (r0 <= r3) goto L59
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Giving up on delivering "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r1 = r6.taskQueue
                int r1 = r1.size()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " tasks to "
                java.lang.StringBuilder r0 = r0.append(r1)
                android.content.ComponentName r1 = r6.componentName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " after "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r6.retryCount
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " retries"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r4, r0)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r6.taskQueue
                r0.clear()
                return
            L59:
                int r0 = r6.retryCount
                int r0 = r0 - r1
                int r0 = r1 << r0
                int r0 = r0 * 1000
                boolean r1 = android.util.Log.isLoggable(r4, r2)
                if (r1 == 0) goto L82
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Scheduling retry for "
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r3 = " ms"
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r4, r1)
            L82:
                android.os.Handler r1 = r5.mHandler
                android.content.ComponentName r3 = r6.componentName
                android.os.Message r1 = r1.obtainMessage(r2, r3)
                android.os.Handler r2 = r5.mHandler
                long r3 = (long) r0
                r2.sendMessageDelayed(r1, r3)
                return
        }

        private void updateListenerMap() {
                r9 = this;
                android.content.Context r0 = r9.mContext
                java.util.Set r0 = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(r0)
                java.util.Set<java.lang.String> r1 = r9.mCachedEnabledPackages
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto Lf
                return
            Lf:
                r9.mCachedEnabledPackages = r0
                android.content.Context r1 = r9.mContext
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                android.content.Intent r2 = r2.setAction(r3)
                r3 = 0
                java.util.List r1 = r1.queryIntentServices(r2, r3)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.Iterator r3 = r1.iterator()
            L30:
                boolean r4 = r3.hasNext()
                java.lang.String r5 = "NotifManCompat"
                if (r4 == 0) goto L7d
                java.lang.Object r4 = r3.next()
                android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                android.content.pm.ServiceInfo r6 = r4.serviceInfo
                java.lang.String r6 = r6.packageName
                boolean r6 = r0.contains(r6)
                if (r6 != 0) goto L49
                goto L30
            L49:
                android.content.ComponentName r6 = new android.content.ComponentName
                android.content.pm.ServiceInfo r7 = r4.serviceInfo
                java.lang.String r7 = r7.packageName
                android.content.pm.ServiceInfo r8 = r4.serviceInfo
                java.lang.String r8 = r8.name
                r6.<init>(r7, r8)
                android.content.pm.ServiceInfo r7 = r4.serviceInfo
                java.lang.String r7 = r7.permission
                if (r7 == 0) goto L79
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Permission present on component "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r6)
                java.lang.String r8 = ", not adding listener record."
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.util.Log.w(r5, r7)
                goto L30
            L79:
                r2.add(r6)
                goto L30
            L7d:
                java.util.Iterator r3 = r2.iterator()
            L81:
                boolean r4 = r3.hasNext()
                r6 = 3
                if (r4 == 0) goto Lbd
                java.lang.Object r4 = r3.next()
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r7 = r9.mRecordMap
                boolean r7 = r7.containsKey(r4)
                if (r7 != 0) goto Lbc
                boolean r6 = android.util.Log.isLoggable(r5, r6)
                if (r6 == 0) goto Lb2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Adding listener record for "
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r4)
                java.lang.String r6 = r6.toString()
                android.util.Log.d(r5, r6)
            Lb2:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r6 = r9.mRecordMap
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r7 = new androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord
                r7.<init>(r4)
                r6.put(r4, r7)
            Lbc:
                goto L81
            Lbd:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r3 = r9.mRecordMap
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc7:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L10a
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r7 = r4.getKey()
                boolean r7 = r2.contains(r7)
                if (r7 != 0) goto L109
                boolean r7 = android.util.Log.isLoggable(r5, r6)
                if (r7 == 0) goto Lfd
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Removing listener record for "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.Object r8 = r4.getKey()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.util.Log.d(r5, r7)
            Lfd:
                java.lang.Object r7 = r4.getValue()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r7 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r7
                r9.ensureServiceUnbound(r7)
                r3.remove()
            L109:
                goto Lc7
            L10a:
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r5) {
                r4 = this;
                int r0 = r5.what
                r1 = 1
                switch(r0) {
                    case 0: goto L24;
                    case 1: goto L18;
                    case 2: goto L10;
                    case 3: goto L8;
                    default: goto L6;
                }
            L6:
                r0 = 0
                return r0
            L8:
                java.lang.Object r0 = r5.obj
                android.content.ComponentName r0 = (android.content.ComponentName) r0
                r4.handleRetryListenerQueue(r0)
                return r1
            L10:
                java.lang.Object r0 = r5.obj
                android.content.ComponentName r0 = (android.content.ComponentName) r0
                r4.handleServiceDisconnected(r0)
                return r1
            L18:
                java.lang.Object r0 = r5.obj
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r0 = (androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent) r0
                android.content.ComponentName r2 = r0.componentName
                android.os.IBinder r3 = r0.iBinder
                r4.handleServiceConnected(r2, r3)
                return r1
            L24:
                java.lang.Object r0 = r5.obj
                androidx.core.app.NotificationManagerCompat$Task r0 = (androidx.core.app.NotificationManagerCompat.Task) r0
                r4.handleQueueTask(r0)
                return r1
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Connected to service "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1f:
                android.os.Handler r0 = r3.mHandler
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r1 = new androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent
                r1.<init>(r4, r5)
                r2 = 1
                android.os.Message r0 = r0.obtainMessage(r2, r1)
                r0.sendToTarget()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r4) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Disconnected from service "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1f:
                android.os.Handler r0 = r3.mHandler
                r1 = 2
                android.os.Message r0 = r0.obtainMessage(r1, r4)
                r0.sendToTarget()
                return
        }

        public void queueTask(androidx.core.app.NotificationManagerCompat.Task r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 0
                android.os.Message r0 = r0.obtainMessage(r1, r3)
                r0.sendToTarget()
                return
        }
    }

    private interface Task {
        void send(android.support.v4.app.INotificationSideChannel r1) throws android.os.RemoteException;
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sLock = r0
            return
    }

    NotificationManagerCompat(android.app.NotificationManager r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r2
            r0.mNotificationManager = r1
            return
    }

    private NotificationManagerCompat(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.mContext = r3
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r2.mNotificationManager = r0
            return
    }

    public static androidx.core.app.NotificationManagerCompat from(android.content.Context r1) {
            androidx.core.app.NotificationManagerCompat r0 = new androidx.core.app.NotificationManagerCompat
            r0.<init>(r1)
            return r0
    }

    public static java.util.Set<java.lang.String> getEnabledListenerPackages(android.content.Context r9) {
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r1 = "enabled_notification_listeners"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            java.lang.Object r1 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock
            monitor-enter(r1)
            if (r0 == 0) goto L3f
            java.lang.String r2 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners     // Catch: java.lang.Throwable -> L43
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L3f
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r2 = r0.split(r2, r3)     // Catch: java.lang.Throwable -> L43
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L43
            int r4 = r2.length     // Catch: java.lang.Throwable -> L43
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            int r4 = r2.length     // Catch: java.lang.Throwable -> L43
            r5 = 0
        L27:
            if (r5 >= r4) goto L3b
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L43
            android.content.ComponentName r7 = android.content.ComponentName.unflattenFromString(r6)     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L38
            java.lang.String r8 = r7.getPackageName()     // Catch: java.lang.Throwable -> L43
            r3.add(r8)     // Catch: java.lang.Throwable -> L43
        L38:
            int r5 = r5 + 1
            goto L27
        L3b:
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r3     // Catch: java.lang.Throwable -> L43
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners = r0     // Catch: java.lang.Throwable -> L43
        L3f:
            java.util.Set<java.lang.String> r2 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            return r2
        L43:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r2
    }

    private void pushSideChannelQueue(androidx.core.app.NotificationManagerCompat.Task r4) {
            r3 = this;
            java.lang.Object r0 = androidx.core.app.NotificationManagerCompat.sLock
            monitor-enter(r0)
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L14
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = new androidx.core.app.NotificationManagerCompat$SideChannelManager     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            androidx.core.app.NotificationManagerCompat.sSideChannelManager = r1     // Catch: java.lang.Throwable -> L1b
        L14:
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L1b
            r1.queueTask(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    private static boolean useSideChannelForNotification(android.app.Notification r2) {
            android.os.Bundle r0 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r0 == 0) goto L10
            java.lang.String r1 = "android.support.useSideChannel"
            boolean r1 = r0.getBoolean(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public boolean areNotificationsEnabled() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            boolean r0 = androidx.core.app.NotificationManagerCompat.Api24Impl.areNotificationsEnabled(r0)
            return r0
    }

    public boolean canPostPromotedNotifications() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            boolean r0 = androidx.core.app.NotificationManagerCompat.Api36Impl.canPostPromotedNotifications(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean canUseFullScreenIntent() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            if (r0 >= r1) goto L8
            return r2
        L8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L1b
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "android.permission.USE_FULL_SCREEN_INTENT"
            int r0 = r0.checkSelfPermission(r1)
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
        L1b:
            android.app.NotificationManager r0 = r3.mNotificationManager
            boolean r0 = androidx.core.app.NotificationManagerCompat.Api34Impl.canUseFullScreenIntent(r0)
            return r0
    }

    public void cancel(int r2) {
            r1 = this;
            r0 = 0
            r1.cancel(r0, r2)
            return
    }

    public void cancel(java.lang.String r2, int r3) {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancel(r2, r3)
            return
    }

    public void cancelAll() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancelAll()
            return
    }

    public void createNotificationChannel(android.app.NotificationChannel r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannel(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannel(androidx.core.app.NotificationChannelCompat r2) {
            r1 = this;
            android.app.NotificationChannel r0 = r2.getNotificationChannel()
            r1.createNotificationChannel(r0)
            return
    }

    public void createNotificationChannelGroup(android.app.NotificationChannelGroup r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroup(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelGroup(androidx.core.app.NotificationChannelGroupCompat r2) {
            r1 = this;
            android.app.NotificationChannelGroup r0 = r2.getNotificationChannelGroup()
            r1.createNotificationChannelGroup(r0)
            return
    }

    public void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroups(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelGroupsCompat(java.util.List<androidx.core.app.NotificationChannelGroupCompat> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            androidx.core.app.NotificationChannelGroupCompat r2 = (androidx.core.app.NotificationChannelGroupCompat) r2
            android.app.NotificationChannelGroup r3 = r2.getNotificationChannelGroup()
            r0.add(r3)
            goto L19
        L2d:
            android.app.NotificationManager r1 = r4.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannelGroups(r1, r0)
        L32:
            return
    }

    public void createNotificationChannels(java.util.List<android.app.NotificationChannel> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannels(r0, r3)
        Lb:
            return
    }

    public void createNotificationChannelsCompat(java.util.List<androidx.core.app.NotificationChannelCompat> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            androidx.core.app.NotificationChannelCompat r2 = (androidx.core.app.NotificationChannelCompat) r2
            android.app.NotificationChannel r3 = r2.getNotificationChannel()
            r0.add(r3)
            goto L19
        L2d:
            android.app.NotificationManager r1 = r4.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.createNotificationChannels(r1, r0)
        L32:
            return
    }

    public void deleteNotificationChannel(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannel(r0, r3)
        Lb:
            return
    }

    public void deleteNotificationChannelGroup(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannelGroup(r0, r3)
        Lb:
            return
    }

    public void deleteUnlistedNotificationChannels(java.util.Collection<java.lang.String> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L42
            android.app.NotificationManager r0 = r4.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannels(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L27
            goto L10
        L27:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L38
            java.lang.String r2 = androidx.core.app.NotificationManagerCompat.Api30Impl.getParentChannelId(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L38
            goto L10
        L38:
            android.app.NotificationManager r2 = r4.mNotificationManager
            java.lang.String r3 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            androidx.core.app.NotificationManagerCompat.Api26Impl.deleteNotificationChannel(r2, r3)
            goto L10
        L42:
            return
    }

    public java.util.List<android.service.notification.StatusBarNotification> getActiveNotifications() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api23Impl.getActiveNotifications(r0)
            return r0
    }

    public int getCurrentInterruptionFilter() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            int r0 = androidx.core.app.NotificationManagerCompat.Api23Impl.getCurrentInterruptionFilter(r0)
            return r0
    }

    public int getImportance() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            int r0 = androidx.core.app.NotificationManagerCompat.Api24Impl.getImportance(r0)
            return r0
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannel(r0, r3)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r0 = androidx.core.app.NotificationManagerCompat.Api30Impl.getNotificationChannel(r0, r3, r4)
            return r0
        Ld:
            android.app.NotificationChannel r0 = r2.getNotificationChannel(r3)
            return r0
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r0 = r2.getNotificationChannel(r3)
            if (r0 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r1 = new androidx.core.app.NotificationChannelCompat
            r1.<init>(r0)
            return r1
        L12:
            r0 = 0
            return r0
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r0 = r2.getNotificationChannel(r3, r4)
            if (r0 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r1 = new androidx.core.app.NotificationChannelCompat
            r1.<init>(r0)
            return r1
        L12:
            r0 = 0
            return r0
    }

    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r4.mNotificationManager
            android.app.NotificationChannelGroup r0 = androidx.core.app.NotificationManagerCompat.Api28Impl.getNotificationChannelGroup(r0, r5)
            return r0
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L35
            java.util.List r0 = r4.getNotificationChannelGroups()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannelGroup r1 = (android.app.NotificationChannelGroup) r1
            java.lang.String r3 = androidx.core.app.NotificationManagerCompat.Api26Impl.getId(r1)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L33
            return r1
        L33:
            goto L1c
        L34:
            return r2
        L35:
            return r2
    }

    public androidx.core.app.NotificationChannelGroupCompat getNotificationChannelGroupCompat(java.lang.String r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L13
            android.app.NotificationChannelGroup r0 = r3.getNotificationChannelGroup(r4)
            if (r0 == 0) goto L12
            androidx.core.app.NotificationChannelGroupCompat r1 = new androidx.core.app.NotificationChannelGroupCompat
            r1.<init>(r0)
            return r1
        L12:
            goto L29
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L29
            android.app.NotificationChannelGroup r0 = r3.getNotificationChannelGroup(r4)
            if (r0 == 0) goto L2a
            androidx.core.app.NotificationChannelGroupCompat r1 = new androidx.core.app.NotificationChannelGroupCompat
            java.util.List r2 = r3.getNotificationChannels()
            r1.<init>(r0, r2)
            return r1
        L29:
        L2a:
            r0 = 0
            return r0
    }

    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannelGroups(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L50
            java.util.List r0 = r7.getNotificationChannelGroups()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L50
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L1b
            java.util.List r1 = java.util.Collections.emptyList()
            goto L1f
        L1b:
            java.util.List r1 = r7.getNotificationChannels()
        L1f:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            android.app.NotificationChannelGroup r5 = (android.app.NotificationChannelGroup) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r2) goto L46
            androidx.core.app.NotificationChannelGroupCompat r6 = new androidx.core.app.NotificationChannelGroupCompat
            r6.<init>(r5)
            r3.add(r6)
            goto L4e
        L46:
            androidx.core.app.NotificationChannelGroupCompat r6 = new androidx.core.app.NotificationChannelGroupCompat
            r6.<init>(r5, r1)
            r3.add(r6)
        L4e:
            goto L2d
        L4f:
            return r3
        L50:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<android.app.NotificationChannel> getNotificationChannels() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = androidx.core.app.NotificationManagerCompat.Api26Impl.getNotificationChannels(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getNotificationChannelsCompat() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L33
            java.util.List r0 = r5.getNotificationChannels()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()
            android.app.NotificationChannel r3 = (android.app.NotificationChannel) r3
            androidx.core.app.NotificationChannelCompat r4 = new androidx.core.app.NotificationChannelCompat
            r4.<init>(r3)
            r1.add(r4)
            goto L1d
        L32:
            return r1
        L33:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public void notify(int r2, android.app.Notification r3) {
            r1 = this;
            r0 = 0
            r1.notify(r0, r2, r3)
            return
    }

    public void notify(java.lang.String r3, int r4, android.app.Notification r5) {
            r2 = this;
            boolean r0 = useSideChannelForNotification(r5)
            if (r0 == 0) goto L1a
            androidx.core.app.NotificationManagerCompat$NotifyTask r0 = new androidx.core.app.NotificationManagerCompat$NotifyTask
            android.content.Context r1 = r2.mContext
            java.lang.String r1 = r1.getPackageName()
            r0.<init>(r1, r4, r3, r5)
            r2.pushSideChannelQueue(r0)
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.cancel(r3, r4)
            goto L1f
        L1a:
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.notify(r3, r4, r5)
        L1f:
            return
    }

    public void notify(java.util.List<androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag> r7) {
            r6 = this;
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r7.get(r1)
            androidx.core.app.NotificationManagerCompat$NotificationWithIdAndTag r2 = (androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag) r2
            java.lang.String r3 = r2.mTag
            int r4 = r2.mId
            android.app.Notification r5 = r2.mNotification
            r6.notify(r3, r4, r5)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }
}
