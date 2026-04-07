package androidx.core.hardware.fingerprint;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FingerprintManagerCompat {
    private final android.content.Context mContext;


    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void authenticate(java.lang.Object r6, java.lang.Object r7, android.os.CancellationSignal r8, int r9, java.lang.Object r10, android.os.Handler r11) {
                r0 = r6
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                r1 = r7
                android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r1
                r4 = r10
                android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r4 = (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) r4
                r2 = r8
                r3 = r9
                r5 = r11
                r0.authenticate(r1, r2, r3, r4, r5)
                return
        }

        static android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject(java.lang.Object r1) {
                r0 = r1
                android.hardware.fingerprint.FingerprintManager$AuthenticationResult r0 = (android.hardware.fingerprint.FingerprintManager.AuthenticationResult) r0
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = r0.getCryptoObject()
                return r0
        }

        public static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context r2) {
                android.content.pm.PackageManager r0 = r2.getPackageManager()
                java.lang.String r1 = "android.hardware.fingerprint"
                boolean r0 = r0.hasSystemFeature(r1)
                if (r0 == 0) goto L16
                java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
                java.lang.Object r0 = r2.getSystemService(r0)
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                return r0
            L16:
                r0 = 0
                return r0
        }

        static boolean hasEnrolledFingerprints(java.lang.Object r1) {
                r0 = r1
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.hasEnrolledFingerprints()
                return r0
        }

        static boolean isHardwareDetected(java.lang.Object r1) {
                r0 = r1
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.isHardwareDetected()
                return r0
        }

        public static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(java.lang.Object r3) {
                r0 = r3
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r0
                r1 = 0
                if (r0 != 0) goto L7
                return r1
            L7:
                javax.crypto.Cipher r2 = r0.getCipher()
                if (r2 == 0) goto L17
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r1 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Cipher r2 = r0.getCipher()
                r1.<init>(r2)
                return r1
            L17:
                java.security.Signature r2 = r0.getSignature()
                if (r2 == 0) goto L27
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r1 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                java.security.Signature r2 = r0.getSignature()
                r1.<init>(r2)
                return r1
            L27:
                javax.crypto.Mac r2 = r0.getMac()
                if (r2 == 0) goto L37
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r1 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Mac r2 = r0.getMac()
                r1.<init>(r2)
                return r1
            L37:
                return r1
        }

        public static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L14
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Cipher r1 = r2.getCipher()
                r0.<init>(r1)
                return r0
            L14:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L24
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                java.security.Signature r1 = r2.getSignature()
                r0.<init>(r1)
                return r0
            L24:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L34
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Mac r1 = r2.getMac()
                r0.<init>(r1)
                return r0
            L34:
                return r0
        }
    }

    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAuthenticationError(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationFailed() {
                r0 = this;
                return
        }

        public void onAuthenticationHelp(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult r1) {
                r0 = this;
                return
        }
    }

    public static final class AuthenticationResult {
        private final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject mCryptoObject;

        public AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r1) {
                r0 = this;
                r0.<init>()
                r0.mCryptoObject = r1
                return
        }

        public androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getCryptoObject() {
                r1 = this;
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = r1.mCryptoObject
                return r0
        }
    }

    public static class CryptoObject {
        private final javax.crypto.Cipher mCipher;
        private final javax.crypto.Mac mMac;
        private final java.security.Signature mSignature;

        public CryptoObject(java.security.Signature r2) {
                r1 = this;
                r1.<init>()
                r1.mSignature = r2
                r0 = 0
                r1.mCipher = r0
                r1.mMac = r0
                return
        }

        public CryptoObject(javax.crypto.Cipher r2) {
                r1 = this;
                r1.<init>()
                r1.mCipher = r2
                r0 = 0
                r1.mSignature = r0
                r1.mMac = r0
                return
        }

        public CryptoObject(javax.crypto.Mac r2) {
                r1 = this;
                r1.<init>()
                r1.mMac = r2
                r0 = 0
                r1.mCipher = r0
                r1.mSignature = r0
                return
        }

        public javax.crypto.Cipher getCipher() {
                r1 = this;
                javax.crypto.Cipher r0 = r1.mCipher
                return r0
        }

        public javax.crypto.Mac getMac() {
                r1 = this;
                javax.crypto.Mac r0 = r1.mMac
                return r0
        }

        public java.security.Signature getSignature() {
                r1 = this;
                java.security.Signature r0 = r1.mSignature
                return r0
        }
    }

    private FingerprintManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static androidx.core.hardware.fingerprint.FingerprintManagerCompat from(android.content.Context r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat
            r0.<init>(r1)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context r1) {
            android.hardware.fingerprint.FingerprintManager r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.getFingerprintManagerOrNull(r1)
            return r0
    }

    static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.unwrapCryptoObject(r1)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat$1 r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$1
            r0.<init>(r1)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r1) {
            android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.wrapCryptoObject(r1)
            return r0
    }

    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r8, int r9, android.os.CancellationSignal r10, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r11, android.os.Handler r12) {
            r7 = this;
            android.content.Context r0 = r7.mContext
            android.hardware.fingerprint.FingerprintManager r1 = getFingerprintManagerOrNull(r0)
            if (r1 == 0) goto L18
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = wrapCryptoObject(r8)
            android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r5 = wrapCallback(r11)
            r4 = r9
            r3 = r10
            r6 = r12
            androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.authenticate(r1, r2, r3, r4, r5, r6)
            goto L1b
        L18:
            r4 = r9
            r3 = r10
            r6 = r12
        L1b:
            return
    }

    @java.lang.Deprecated
    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r8, int r9, androidx.core.os.CancellationSignal r10, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r11, android.os.Handler r12) {
            r7 = this;
            if (r10 == 0) goto La
            java.lang.Object r0 = r10.getCancellationSignalObject()
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            goto Lb
        La:
            r0 = 0
        Lb:
            r4 = r0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.authenticate(r2, r3, r4, r5, r6)
            return
    }

    public boolean hasEnrolledFingerprints() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L11
            boolean r1 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.hasEnrolledFingerprints(r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public boolean isHardwareDetected() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L11
            boolean r1 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.isHardwareDetected(r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }
}
