package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
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

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;

        private static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
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
                    java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L18
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L18
                    r0.writeStrongInterface(r5)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    r3 = 1
                    r1.transact(r3, r0, r2, r3)     // Catch: java.lang.Throwable -> L18
                    r0.recycle()
                    return
                L18:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
                if (r1 == 0) goto L14
                r1 = r0
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService r1 = (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService) r1
                return r1
            L14:
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$Proxy r1 = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$Proxy
                r1.<init>(r2)
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.DESCRIPTOR
                r1 = 1
                if (r4 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 != r2) goto L16
                r6.writeString(r0)
                return r1
            L16:
                switch(r4) {
                    case 1: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r1 = super.onTransact(r4, r5, r6, r7)
                return r1
            L1e:
                android.os.IBinder r2 = r5.readStrongBinder()
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r2 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(r2)
                r3.isPermissionRevocationEnabledForApp(r2)
                return r1
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService"
            java.lang.String r0 = r2.replace(r0, r1)
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR = r0
            return
    }

    void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) throws android.os.RemoteException;
}
