package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public interface INotificationSideChannel extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.v4.app.INotificationSideChannel {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.v4.app.INotificationSideChannel {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        private static class Proxy implements android.support.v4.app.INotificationSideChannel {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(java.lang.String r6, int r7, java.lang.String r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1f
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L1f
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L1f
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r2 = 0
                    r3 = 1
                    r4 = 2
                    r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L1f
                    r0.recycle()
                    return
                L1f:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L19
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L19
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L19
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L19
                    r2 = 0
                    r3 = 1
                    r4 = 3
                    r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L19
                    r0.recycle()
                    return
                L19:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(java.lang.String r5, int r6, java.lang.String r7, android.app.Notification r8) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L22
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L22
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L22
                    r1 = 0
                    android.support.v4.app.INotificationSideChannel._Parcel.access$100(r0, r8, r1)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 0
                    r3 = 1
                    r1.transact(r3, r0, r2, r3)     // Catch: java.lang.Throwable -> L22
                    r0.recycle()
                    return
                L22:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.v4.app.INotificationSideChannel.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.app.INotificationSideChannel asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.lang.String r0 = android.support.v4.app.INotificationSideChannel.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof android.support.v4.app.INotificationSideChannel
                if (r1 == 0) goto L14
                r1 = r0
                android.support.v4.app.INotificationSideChannel r1 = (android.support.v4.app.INotificationSideChannel) r1
                return r1
            L14:
                android.support.v4.app.INotificationSideChannel$Stub$Proxy r1 = new android.support.v4.app.INotificationSideChannel$Stub$Proxy
                r1.<init>(r2)
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
                r6 = this;
                java.lang.String r0 = android.support.v4.app.INotificationSideChannel.Stub.DESCRIPTOR
                r1 = 1
                if (r7 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r7 > r2) goto Ld
                r8.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r7 != r2) goto L16
                r9.writeString(r0)
                return r1
            L16:
                switch(r7) {
                    case 1: goto L36;
                    case 2: goto L26;
                    case 3: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r1 = super.onTransact(r7, r8, r9, r10)
                return r1
            L1e:
                java.lang.String r2 = r8.readString()
                r6.cancelAll(r2)
                goto L4e
            L26:
                java.lang.String r2 = r8.readString()
                int r3 = r8.readInt()
                java.lang.String r4 = r8.readString()
                r6.cancel(r2, r3, r4)
                goto L4e
            L36:
                java.lang.String r2 = r8.readString()
                int r3 = r8.readInt()
                java.lang.String r4 = r8.readString()
                android.os.Parcelable$Creator r5 = android.app.Notification.CREATOR
                java.lang.Object r5 = android.support.v4.app.INotificationSideChannel._Parcel.access$000(r8, r5)
                android.app.Notification r5 = (android.app.Notification) r5
                r6.notify(r2, r3, r4, r5)
            L4e:
                return r1
        }
    }

    public static class _Parcel {
        public _Parcel() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.Object access$000(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
                java.lang.Object r0 = readTypedObject(r1, r2)
                return r0
        }

        static /* synthetic */ void access$100(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                writeTypedObject(r0, r1, r2)
                return
        }

        private static <T> T readTypedObject(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r2.createFromParcel(r1)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        private static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel r1, T r2, int r3) {
                if (r2 == 0) goto La
                r0 = 1
                r1.writeInt(r0)
                r2.writeToParcel(r1, r3)
                goto Le
            La:
                r0 = 0
                r1.writeInt(r0)
            Le:
                return
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "android$support$v4$app$INotificationSideChannel"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.v4.app.INotificationSideChannel.DESCRIPTOR = r0
            return
    }

    void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    void cancelAll(java.lang.String r1) throws android.os.RemoteException;

    void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException;
}
