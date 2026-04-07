package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class DeviceProfileWriter {
    private final java.lang.String mApkName;
    private final android.content.res.AssetManager mAssetManager;
    private final java.io.File mCurProfile;
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile;
    private final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback mDiagnostics;
    private final java.util.concurrent.Executor mExecutor;
    private androidx.profileinstaller.DexProfileData[] mProfile;
    private final java.lang.String mProfileMetaSourceLocation;
    private final java.lang.String mProfileSourceLocation;
    private byte[] mTranscodedProfile;

    public DeviceProfileWriter(android.content.res.AssetManager r2, java.util.concurrent.Executor r3, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.io.File r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDeviceSupportsAotProfile = r0
            r1.mAssetManager = r2
            r1.mExecutor = r3
            r1.mDiagnostics = r4
            r1.mApkName = r5
            r1.mProfileSourceLocation = r6
            r1.mProfileMetaSourceLocation = r7
            r1.mCurProfile = r8
            byte[] r0 = desiredVersion()
            r1.mDesiredVersion = r0
            return
    }

    private androidx.profileinstaller.DeviceProfileWriter addMetadata(androidx.profileinstaller.DexProfileData[] r5, byte[] r6) {
            r4 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r4.mAssetManager     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
            java.lang.String r2 = r4.mProfileMetaSourceLocation     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
            java.io.InputStream r1 = r4.openStreamFromAssets(r1, r2)     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
            if (r1 == 0) goto L2a
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM     // Catch: java.lang.Throwable -> L1e
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.readHeader(r1, r2)     // Catch: java.lang.Throwable -> L1e
            androidx.profileinstaller.DexProfileData[] r3 = androidx.profileinstaller.ProfileTranscoder.readMeta(r1, r2, r6, r5)     // Catch: java.lang.Throwable -> L1e
            r4.mProfile = r3     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1d
            r1.close()     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
        L1d:
            return r4
        L1e:
            r2 = move-exception
            if (r1 == 0) goto L29
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
        L29:
            throw r2     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
        L2a:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.lang.IllegalStateException -> L30 java.io.IOException -> L3b java.io.FileNotFoundException -> L43
            goto L4b
        L30:
            r1 = move-exception
            r4.mProfile = r0
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r3 = 8
            r2.onResultReceived(r3, r1)
            goto L4c
        L3b:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r3 = 7
            r2.onResultReceived(r3, r1)
            goto L4b
        L43:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r3 = 9
            r2.onResultReceived(r3, r1)
        L4b:
        L4c:
            return r0
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
            r2 = this;
            boolean r0 = r2.mDeviceSupportsAotProfile
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            r0.<init>(r1)
            throw r0
    }

    private static byte[] desiredVersion() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            return r0
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            switch(r0) {
                case 24: goto L1a;
                case 25: goto L1a;
                case 26: goto L17;
                case 27: goto L14;
                case 28: goto L11;
                case 29: goto L11;
                case 30: goto L11;
                default: goto Lf;
            }
        Lf:
            r0 = 0
            return r0
        L11:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            return r0
        L14:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            return r0
        L17:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            return r0
        L1a:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V001_N
            return r0
    }

    private java.io.InputStream getProfileInputStream(android.content.res.AssetManager r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.mProfileSourceLocation     // Catch: java.io.IOException -> L9 java.io.FileNotFoundException -> L11
            java.io.InputStream r1 = r4.openStreamFromAssets(r5, r1)     // Catch: java.io.IOException -> L9 java.io.FileNotFoundException -> L11
            r0 = r1
        L8:
            goto L19
        L9:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r3 = 7
            r2.onResultReceived(r3, r1)
            goto L19
        L11:
            r1 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r2 = r4.mDiagnostics
            r3 = 6
            r2.onResultReceived(r3, r1)
            goto L8
        L19:
            return r0
    }

    private java.io.InputStream openStreamFromAssets(android.content.res.AssetManager r7, java.lang.String r8) throws java.io.IOException {
            r6 = this;
            r0 = 0
            android.content.res.AssetFileDescriptor r1 = r7.openFd(r8)     // Catch: java.io.FileNotFoundException -> Lb
            java.io.FileInputStream r2 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> Lb
            r0 = r2
            goto L21
        Lb:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            if (r2 == 0) goto L21
            java.lang.String r3 = "compressed"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L21
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r3 = r6.mDiagnostics
            r4 = 5
            r5 = 0
            r3.onDiagnosticReceived(r4, r5)
        L21:
            return r0
    }

    private androidx.profileinstaller.DexProfileData[] readProfileInternal(java.io.InputStream r6) {
            r5 = this;
            r0 = 0
            r1 = 7
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF     // Catch: java.lang.Throwable -> L1a java.lang.IllegalStateException -> L1c java.io.IOException -> L28
            byte[] r2 = androidx.profileinstaller.ProfileTranscoder.readHeader(r6, r2)     // Catch: java.lang.Throwable -> L1a java.lang.IllegalStateException -> L1c java.io.IOException -> L28
            java.lang.String r3 = r5.mApkName     // Catch: java.lang.Throwable -> L1a java.lang.IllegalStateException -> L1c java.io.IOException -> L28
            androidx.profileinstaller.DexProfileData[] r3 = androidx.profileinstaller.ProfileTranscoder.readProfile(r6, r2, r3)     // Catch: java.lang.Throwable -> L1a java.lang.IllegalStateException -> L1c java.io.IOException -> L28
            r0 = r3
            r6.close()     // Catch: java.io.IOException -> L13
        L12:
            goto L32
        L13:
            r2 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r3 = r5.mDiagnostics
            r3.onResultReceived(r1, r2)
            goto L32
        L1a:
            r2 = move-exception
            goto L33
        L1c:
            r2 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r3 = r5.mDiagnostics     // Catch: java.lang.Throwable -> L1a
            r4 = 8
            r3.onResultReceived(r4, r2)     // Catch: java.lang.Throwable -> L1a
            r6.close()     // Catch: java.io.IOException -> L13
            goto L12
        L28:
            r2 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r3 = r5.mDiagnostics     // Catch: java.lang.Throwable -> L1a
            r3.onResultReceived(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r6.close()     // Catch: java.io.IOException -> L13
            goto L12
        L32:
            return r0
        L33:
            r6.close()     // Catch: java.io.IOException -> L37
            goto L3d
        L37:
            r3 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r4 = r5.mDiagnostics
            r4.onResultReceived(r1, r3)
        L3d:
            throw r2
    }

    private static boolean requiresMetadata() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            if (r0 < r1) goto L9
            return r2
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            switch(r0) {
                case 24: goto L11;
                case 25: goto L11;
                case 26: goto L10;
                case 27: goto L10;
                case 28: goto L10;
                case 29: goto L10;
                case 30: goto L10;
                default: goto Lf;
            }
        Lf:
            return r1
        L10:
            return r1
        L11:
            return r2
    }

    private void result(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0 r1 = new androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
            r4 = this;
            byte[] r0 = r4.mDesiredVersion
            r1 = 0
            if (r0 != 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r4.result(r2, r0)
            return r1
        L10:
            java.io.File r0 = r4.mCurProfile
            boolean r0 = r0.exists()
            r2 = 0
            r3 = 4
            if (r0 == 0) goto L26
            java.io.File r0 = r4.mCurProfile
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L33
            r4.result(r3, r2)
            return r1
        L26:
            java.io.File r0 = r4.mCurProfile     // Catch: java.io.IOException -> L37
            boolean r0 = r0.createNewFile()     // Catch: java.io.IOException -> L37
            if (r0 != 0) goto L32
            r4.result(r3, r2)     // Catch: java.io.IOException -> L37
            return r1
        L32:
        L33:
            r0 = 1
            r4.mDeviceSupportsAotProfile = r0
            return r0
        L37:
            r0 = move-exception
            r4.result(r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: lambda$result$0$androidx-profileinstaller-DeviceProfileWriter, reason: not valid java name */
    /* synthetic */ void m99lambda$result$0$androidxprofileinstallerDeviceProfileWriter(int r2, java.lang.Object r3) {
            r1 = this;
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = r1.mDiagnostics
            r0.onResultReceived(r2, r3)
            return
    }

    public androidx.profileinstaller.DeviceProfileWriter read() {
            r3 = this;
            r3.assertDeviceAllowsProfileInstallerAotWritesCalled()
            byte[] r0 = r3.mDesiredVersion
            if (r0 != 0) goto L8
            return r3
        L8:
            android.content.res.AssetManager r0 = r3.mAssetManager
            java.io.InputStream r0 = r3.getProfileInputStream(r0)
            if (r0 == 0) goto L16
            androidx.profileinstaller.DexProfileData[] r1 = r3.readProfileInternal(r0)
            r3.mProfile = r1
        L16:
            androidx.profileinstaller.DexProfileData[] r1 = r3.mProfile
            if (r1 == 0) goto L2b
            androidx.profileinstaller.DexProfileData[] r1 = r3.mProfile
            boolean r2 = requiresMetadata()
            if (r2 == 0) goto L2b
            byte[] r2 = r3.mDesiredVersion
            androidx.profileinstaller.DeviceProfileWriter r2 = r3.addMetadata(r1, r2)
            if (r2 == 0) goto L2b
            return r2
        L2b:
            return r3
    }

    public androidx.profileinstaller.DeviceProfileWriter transcodeIfNeeded() {
            r7 = this;
            androidx.profileinstaller.DexProfileData[] r0 = r7.mProfile
            byte[] r1 = r7.mDesiredVersion
            if (r0 == 0) goto L50
            if (r1 != 0) goto L9
            goto L50
        L9:
            r7.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
            androidx.profileinstaller.ProfileTranscoder.writeHeader(r3, r1)     // Catch: java.lang.Throwable -> L32
            boolean r4 = androidx.profileinstaller.ProfileTranscoder.transcodeAndWriteBody(r3, r1, r0)     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L28
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r5 = r7.mDiagnostics     // Catch: java.lang.Throwable -> L32
            r6 = 5
            r5.onResultReceived(r6, r2)     // Catch: java.lang.Throwable -> L32
            r7.mProfile = r2     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
            return r7
        L28:
            byte[] r5 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32
            r7.mTranscodedProfile = r5     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
            goto L4c
        L32:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
        L3b:
            throw r4     // Catch: java.lang.IllegalStateException -> L3c java.io.IOException -> L45
        L3c:
            r3 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r4 = r7.mDiagnostics
            r5 = 8
            r4.onResultReceived(r5, r3)
            goto L4d
        L45:
            r3 = move-exception
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r4 = r7.mDiagnostics
            r5 = 7
            r4.onResultReceived(r5, r3)
        L4c:
        L4d:
            r7.mProfile = r2
            return r7
        L50:
            return r7
    }

    public boolean write() {
            r9 = this;
            byte[] r0 = r9.mTranscodedProfile
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r9.assertDeviceAllowsProfileInstallerAotWritesCalled()
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L6f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L6f
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5d
            java.io.File r5 = r9.mCurProfile     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L53
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L47
            androidx.profileinstaller.Encoding.writeAll(r3, r4, r6)     // Catch: java.lang.Throwable -> L3b
            r7 = 1
            r9.result(r7, r2)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L2b
            r6.close()     // Catch: java.lang.Throwable -> L47
        L2b:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.lang.Throwable -> L53
        L30:
            r4.close()     // Catch: java.lang.Throwable -> L5d
            r3.close()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L6f
            r9.mTranscodedProfile = r2
            r9.mProfile = r2
            return r7
        L3b:
            r7 = move-exception
            if (r6 == 0) goto L46
            r6.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L47
        L46:
            throw r7     // Catch: java.lang.Throwable -> L47
        L47:
            r6 = move-exception
            if (r5 == 0) goto L52
            r5.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L53
        L52:
            throw r6     // Catch: java.lang.Throwable -> L53
        L53:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L5d
        L5c:
            throw r5     // Catch: java.lang.Throwable -> L5d
        L5d:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L6f
        L66:
            throw r4     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69 java.io.FileNotFoundException -> L6f
        L67:
            r1 = move-exception
            goto L7a
        L69:
            r3 = move-exception
            r4 = 7
            r9.result(r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L74
        L6f:
            r3 = move-exception
            r4 = 6
            r9.result(r4, r3)     // Catch: java.lang.Throwable -> L67
        L74:
            r9.mTranscodedProfile = r2
            r9.mProfile = r2
            return r1
        L7a:
            r9.mTranscodedProfile = r2
            r9.mProfile = r2
            throw r1
    }
}
