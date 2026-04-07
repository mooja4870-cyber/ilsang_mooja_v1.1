package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {

    private class NotificationSideChannelStub extends android.support.v4.app.INotificationSideChannel.Stub {
        final /* synthetic */ androidx.core.app.NotificationCompatSideChannelService this$0;

        NotificationSideChannelStub(androidx.core.app.NotificationCompatSideChannelService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String r4, int r5, java.lang.String r6) throws android.os.RemoteException {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L17
                r2.cancel(r4, r5, r6)     // Catch: java.lang.Throwable -> L17
                restoreCallingIdentity(r0)
                return
            L17:
                r2 = move-exception
                restoreCallingIdentity(r0)
                throw r2
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String r4) {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L17
                r2.cancelAll(r4)     // Catch: java.lang.Throwable -> L17
                restoreCallingIdentity(r0)
                return
            L17:
                r2 = move-exception
                restoreCallingIdentity(r0)
                throw r2
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String r4, int r5, java.lang.String r6, android.app.Notification r7) throws android.os.RemoteException {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L17
                r2.notify(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L17
                restoreCallingIdentity(r0)
                return
            L17:
                r2 = move-exception
                restoreCallingIdentity(r0)
                throw r2
        }
    }

    public NotificationCompatSideChannelService() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void cancel(java.lang.String r1, int r2, java.lang.String r3);

    public abstract void cancelAll(java.lang.String r1);

    void checkPermission(int r6, java.lang.String r7) {
            r5 = this;
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String[] r0 = r0.getPackagesForUid(r6)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            boolean r4 = r3.equals(r7)
            if (r4 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto La
        L18:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NotificationSideChannelService: Uid "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " is not authorized for package "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public abstract void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = r3.getAction()
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto Lf
        Le:
            return r1
        Lf:
            return r1
    }
}
