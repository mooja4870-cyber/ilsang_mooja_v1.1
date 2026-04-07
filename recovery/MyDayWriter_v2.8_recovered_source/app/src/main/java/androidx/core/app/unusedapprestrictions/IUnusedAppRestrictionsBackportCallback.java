package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
        static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;

        private static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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
                    java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean r5, boolean r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L24
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L24
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto Lf
                    r3 = r2
                    goto L10
                Lf:
                    r3 = r1
                L10:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L24
                    if (r6 == 0) goto L16
                    r1 = r2
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L24
                    r3 = 0
                    r1.transact(r2, r0, r3, r2)     // Catch: java.lang.Throwable -> L24
                    r0.recycle()
                    return
                L24:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r0 = 0
                return r0
            L4:
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                if (r1 == 0) goto L14
                r1 = r0
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1 = (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback) r1
                return r1
            L14:
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy r1 = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy
                r1.<init>(r2)
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
                r5 = this;
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
                r1 = 1
                if (r6 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r6 > r2) goto Ld
                r7.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 != r2) goto L16
                r8.writeString(r0)
                return r1
            L16:
                switch(r6) {
                    case 1: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r1 = super.onTransact(r6, r7, r8, r9)
                return r1
            L1e:
                int r2 = r7.readInt()
                r3 = 0
                if (r2 == 0) goto L27
                r2 = r1
                goto L28
            L27:
                r2 = r3
            L28:
                int r4 = r7.readInt()
                if (r4 == 0) goto L2f
                r3 = r1
            L2f:
                r5.onIsPermissionRevocationEnabledForAppResult(r2, r3)
                return r1
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback"
            java.lang.String r0 = r2.replace(r0, r1)
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.DESCRIPTOR = r0
            return
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException;
}
