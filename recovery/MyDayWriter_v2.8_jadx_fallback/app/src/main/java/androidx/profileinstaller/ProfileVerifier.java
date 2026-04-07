package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {
    private static final java.lang.String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final java.lang.String PROFILE_FILE_NAME = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final java.lang.String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final java.lang.Object SYNC_OBJ = null;
    private static final java.lang.String TAG = "ProfileVerifier";
    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus sCompilationStatus;
    private static final androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> sFuture = null;

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r3, android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
                java.lang.String r0 = r4.getPackageName()
                r1 = 0
                android.content.pm.PackageManager$PackageInfoFlags r1 = android.content.pm.PackageManager.PackageInfoFlags.of(r1)
                android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r1)
                return r0
        }
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int r1, int r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.mSchema = r1
                r0.mResultCode = r2
                r0.mPackageLastUpdateTime = r3
                r0.mInstalledCurrentProfileSize = r5
                return
        }

        static androidx.profileinstaller.ProfileVerifier.Cache readFromFile(java.io.File r9) throws java.io.IOException {
                java.io.DataInputStream r0 = new java.io.DataInputStream
                java.io.FileInputStream r1 = new java.io.FileInputStream
                r1.<init>(r9)
                r0.<init>(r1)
                r1 = r0
                androidx.profileinstaller.ProfileVerifier$Cache r2 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> L24
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L24
                int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L24
                long r5 = r1.readLong()     // Catch: java.lang.Throwable -> L24
                long r7 = r1.readLong()     // Catch: java.lang.Throwable -> L24
                r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L24
                r1.close()
                return r2
            L24:
                r0 = move-exception
                r2 = r0
                r1.close()     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r0 = move-exception
                r2.addSuppressed(r0)
            L2e:
                throw r2
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L2e
                boolean r2 = r8 instanceof androidx.profileinstaller.ProfileVerifier.Cache
                if (r2 != 0) goto Lc
                goto L2e
            Lc:
                r2 = r8
                androidx.profileinstaller.ProfileVerifier$Cache r2 = (androidx.profileinstaller.ProfileVerifier.Cache) r2
                int r3 = r7.mResultCode
                int r4 = r2.mResultCode
                if (r3 != r4) goto L2c
                long r3 = r7.mPackageLastUpdateTime
                long r5 = r2.mPackageLastUpdateTime
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L2c
                int r3 = r7.mSchema
                int r4 = r2.mSchema
                if (r3 != r4) goto L2c
                long r3 = r7.mInstalledCurrentProfileSize
                long r5 = r2.mInstalledCurrentProfileSize
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L2c
                goto L2d
            L2c:
                r0 = r1
            L2d:
                return r0
            L2e:
                return r1
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.mResultCode
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                long r1 = r5.mPackageLastUpdateTime
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                int r2 = r5.mSchema
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = r5.mInstalledCurrentProfileSize
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        void writeOnFile(java.io.File r4) throws java.io.IOException {
                r3 = this;
                r4.delete()
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r4)
                r0.<init>(r1)
                int r1 = r3.mSchema     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r1)     // Catch: java.lang.Throwable -> L25
                int r1 = r3.mResultCode     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                r0.close()
                return
            L25:
                r1 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r2 = move-exception
                r1.addSuppressed(r2)
            L2e:
                throw r1
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @java.lang.Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int r1, boolean r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.mResultCode = r1
                r0.mHasCurrentProfile = r3
                r0.mHasReferenceProfile = r2
                r0.mHasEmbeddedProfile = r4
                return
        }

        public boolean appApkHasEmbeddedProfile() {
                r1 = this;
                boolean r0 = r1.mHasEmbeddedProfile
                return r0
        }

        public int getProfileInstallResultCode() {
                r1 = this;
                int r0 = r1.mResultCode
                return r0
        }

        public boolean hasProfileEnqueuedForCompilation() {
                r1 = this;
                boolean r0 = r1.mHasCurrentProfile
                return r0
        }

        public boolean isCompiledWithProfile() {
                r1 = this;
                boolean r0 = r1.mHasReferenceProfile
                return r0
        }
    }

    static {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            androidx.profileinstaller.ProfileVerifier.sFuture = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.profileinstaller.ProfileVerifier.SYNC_OBJ = r0
            r0 = 0
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            return
    }

    private ProfileVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.ProfileVerifier.CompilationStatus> getCompilationStatusAsync() {
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r0 = androidx.profileinstaller.ProfileVerifier.sFuture
            return r0
    }

    private static long getPackageLastUpdateTime(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r1 = androidx.profileinstaller.ProfileVerifier.Api33Impl.getPackageInfo(r0, r3)
            long r1 = r1.lastUpdateTime
            return r1
        L15:
            java.lang.String r1 = r3.getPackageName()
            r2 = 0
            android.content.pm.PackageInfo r1 = r0.getPackageInfo(r1, r2)
            long r1 = r1.lastUpdateTime
            return r1
    }

    private static androidx.profileinstaller.ProfileVerifier.CompilationStatus setCompilationStatus(int r2, boolean r3, boolean r4, boolean r5) {
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = new androidx.profileinstaller.ProfileVerifier$CompilationStatus
            r0.<init>(r2, r3, r4, r5)
            androidx.profileinstaller.ProfileVerifier.sCompilationStatus = r0
            androidx.concurrent.futures.ResolvableFuture<androidx.profileinstaller.ProfileVerifier$CompilationStatus> r0 = androidx.profileinstaller.ProfileVerifier.sFuture
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r1 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            r0.set(r1)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            return r0
    }

    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context r1) {
            r0 = 0
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = writeProfileVerification(r1, r0)
            return r0
    }

    static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(android.content.Context r21, boolean r22) {
            if (r22 != 0) goto L9
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            if (r0 == 0) goto L9
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus
            return r0
        L9:
            java.lang.Object r1 = androidx.profileinstaller.ProfileVerifier.SYNC_OBJ
            monitor-enter(r1)
            if (r22 != 0) goto L16
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L16
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = androidx.profileinstaller.ProfileVerifier.sCompilationStatus     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return r0
        L16:
            r2 = 0
            r4 = 1
            r5 = 0
            android.content.res.AssetManager r0 = r21.getAssets()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            java.lang.String r6 = "dexopt/baseline.prof"
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r6)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r6 = r0
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L37
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = r4
            goto L30
        L2f:
            r0 = r5
        L30:
            if (r6 == 0) goto L35
            r6.close()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
        L35:
            r6 = r0
            goto L4a
        L37:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L43
            r6.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
        L43:
            throw r7     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
        L44:
            r0 = move-exception
            goto L135
        L47:
            r0 = move-exception
            r6 = 0
            r0 = r6
        L4a:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L44
            r7 = 28
            if (r0 < r7) goto L12d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L44
            r7 = 30
            if (r0 != r7) goto L58
            goto L12d
        L58:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.lang.String r8 = "/data/misc/profiles/ref/"
            java.lang.String r9 = r21.getPackageName()     // Catch: java.lang.Throwable -> L44
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r8 = "primary.prof"
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L44
            r7 = r0
            long r8 = r7.length()     // Catch: java.lang.Throwable -> L44
            boolean r0 = r7.exists()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7c
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7c
            r0 = r4
            goto L7d
        L7c:
            r0 = r5
        L7d:
            r10 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.lang.String r12 = "/data/misc/profiles/cur/0/"
            java.lang.String r13 = r21.getPackageName()     // Catch: java.lang.Throwable -> L44
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L44
            java.lang.String r12 = "primary.prof"
            r0.<init>(r11, r12)     // Catch: java.lang.Throwable -> L44
            r11 = r0
            long r12 = r11.length()     // Catch: java.lang.Throwable -> L44
            r19 = r12
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto La3
            int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r0 <= 0) goto La3
            r5 = r4
        La3:
            long r17 = getPackageLastUpdateTime(r21)     // Catch: java.lang.Throwable -> L44 android.content.pm.PackageManager.NameNotFoundException -> L124
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L44
            java.io.File r2 = r21.getFilesDir()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "profileInstalled"
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L44
            r2 = r0
            r3 = 0
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lca
            androidx.profileinstaller.ProfileVerifier$Cache r0 = androidx.profileinstaller.ProfileVerifier.Cache.readFromFile(r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> Lc1
            r3 = r0
            goto Lca
        Lc1:
            r0 = move-exception
            r4 = 131072(0x20000, float:1.83671E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r4 = setCompilationStatus(r4, r10, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return r4
        Lca:
            r0 = 2
            if (r3 == 0) goto Ldb
            long r12 = r3.mPackageLastUpdateTime     // Catch: java.lang.Throwable -> L44
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 != 0) goto Ldb
            int r12 = r3.mResultCode     // Catch: java.lang.Throwable -> L44
            if (r12 != r0) goto Ld8
            goto Ldb
        Ld8:
            int r12 = r3.mResultCode     // Catch: java.lang.Throwable -> L44
            goto Le9
        Ldb:
            if (r6 != 0) goto Le0
            r12 = 327680(0x50000, float:4.59177E-40)
            goto Le9
        Le0:
            if (r10 == 0) goto Le4
            r12 = 1
            goto Le9
        Le4:
            if (r5 == 0) goto Le8
            r12 = 2
            goto Le9
        Le8:
            r12 = 0
        Le9:
            if (r22 == 0) goto Lf0
            if (r5 == 0) goto Lf0
            if (r12 == r4) goto Lf0
            r12 = 2
        Lf0:
            if (r3 == 0) goto L102
            int r13 = r3.mResultCode     // Catch: java.lang.Throwable -> L44
            if (r13 != r0) goto L102
            if (r12 != r4) goto L102
            long r13 = r3.mInstalledCurrentProfileSize     // Catch: java.lang.Throwable -> L44
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 >= 0) goto L102
            r12 = 3
            r16 = r12
            goto L104
        L102:
            r16 = r12
        L104:
            androidx.profileinstaller.ProfileVerifier$Cache r14 = new androidx.profileinstaller.ProfileVerifier$Cache     // Catch: java.lang.Throwable -> L44
            r15 = 1
            r14.<init>(r15, r16, r17, r19)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L112
            boolean r0 = r3.equals(r14)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L116
        L112:
            r14.writeOnFile(r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L119
        L116:
            r0 = r16
            goto L11e
        L119:
            r0 = move-exception
            r16 = 196608(0x30000, float:2.75506E-40)
            r0 = r16
        L11e:
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r4 = setCompilationStatus(r0, r10, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return r4
        L124:
            r0 = move-exception
            r2 = 65536(0x10000, float:9.1835E-41)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r2 = setCompilationStatus(r2, r10, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return r2
        L12d:
            r0 = 262144(0x40000, float:3.67342E-40)
            androidx.profileinstaller.ProfileVerifier$CompilationStatus r0 = setCompilationStatus(r0, r5, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return r0
        L135:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r0
    }
}
