package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver2 extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.v4.os.IResultReceiver2 {
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

        @Override // android.support.v4.os.IResultReceiver2
        public void send(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.v4.os.IResultReceiver2 {
        static final int TRANSACTION_send = 1;

        private static class Proxy implements android.support.v4.os.IResultReceiver2 {
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

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = android.support.v4.os.IResultReceiver2.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.v4.os.IResultReceiver2
            public void send(int r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.v4.os.IResultReceiver2.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L1c
                    r1 = 0
                    android.support.v4.os.IResultReceiver2._Parcel.access$100(r0, r6, r1)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L1c
                    r2 = 0
                    r3 = 1
                    r1.transact(r3, r0, r2, r3)     // Catch: java.lang.Throwable -> L1c
                    r0.recycle()
                    return
                L1c:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.v4.os.IResultReceiver2.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.os.IResultReceiver2 asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.lang.String r0 = android.support.v4.os.IResultReceiver2.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof android.support.v4.os.IResultReceiver2
                if (r1 == 0) goto L14
                r1 = r0
                android.support.v4.os.IResultReceiver2 r1 = (android.support.v4.os.IResultReceiver2) r1
                return r1
            L14:
                android.support.v4.os.IResultReceiver2$Stub$Proxy r1 = new android.support.v4.os.IResultReceiver2$Stub$Proxy
                r1.<init>(r2)
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                java.lang.String r0 = android.support.v4.os.IResultReceiver2.Stub.DESCRIPTOR
                r1 = 1
                if (r5 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r5 > r2) goto Ld
                r6.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 != r2) goto L16
                r7.writeString(r0)
                return r1
            L16:
                switch(r5) {
                    case 1: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r1 = super.onTransact(r5, r6, r7, r8)
                return r1
            L1e:
                int r2 = r6.readInt()
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = android.support.v4.os.IResultReceiver2._Parcel.access$000(r6, r3)
                android.os.Bundle r3 = (android.os.Bundle) r3
                r4.send(r2, r3)
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
            java.lang.String r2 = "android$support$v4$os$IResultReceiver2"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.v4.os.IResultReceiver2.DESCRIPTOR = r0
            return
    }

    void send(int r1, android.os.Bundle r2) throws android.os.RemoteException;
}
