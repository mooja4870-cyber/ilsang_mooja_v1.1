package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback EMPTY_DIAGNOSTICS = null;
    static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback LOG_DIAGNOSTICS = null;
    private static final java.lang.String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final java.lang.String PROFILE_FILE = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLER_SKIP_FILE_NAME = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final java.lang.String PROFILE_META_LOCATION = "dexopt/baseline.profm";
    static final java.lang.String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final java.lang.String TAG = "ProfileInstaller";



    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int r1, java.lang.Object r2);

        void onResultReceived(int r1, java.lang.Object r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    static {
            androidx.profileinstaller.ProfileInstaller$1 r0 = new androidx.profileinstaller.ProfileInstaller$1
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller.EMPTY_DIAGNOSTICS = r0
            androidx.profileinstaller.ProfileInstaller$2 r0 = new androidx.profileinstaller.ProfileInstaller$2
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS = r0
            return
    }

    private ProfileInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean deleteProfileWrittenFor(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r2, r1)
            boolean r1 = r0.delete()
            return r1
    }

    static void deleteSkipFile(android.content.Context r3, java.util.concurrent.Executor r4, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r5) {
            java.io.File r0 = r3.getFilesDir()
            deleteProfileWrittenFor(r0)
            r1 = 11
            r2 = 0
            result(r4, r5, r1, r2)
            return
    }

    static void diagnostic(java.util.concurrent.Executor r1, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r2, int r3, java.lang.Object r4) {
            androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1 r0 = new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
    }

    static boolean hasAlreadyWrittenProfileForThisInstall(android.content.pm.PackageInfo r7, java.io.File r8, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r9) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r8, r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3a
            r3.<init>(r0)     // Catch: java.io.IOException -> L3a
            r1.<init>(r3)     // Catch: java.io.IOException -> L3a
            long r3 = r1.readLong()     // Catch: java.lang.Throwable -> L30
            r1.close()     // Catch: java.io.IOException -> L3a
            long r5 = r7.lastUpdateTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L28
            r2 = 1
        L28:
            if (r2 == 0) goto L2f
            r1 = 2
            r5 = 0
            r9.onResultReceived(r1, r5)
        L2f:
            return r2
        L30:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.io.IOException -> L3a
        L39:
            throw r3     // Catch: java.io.IOException -> L3a
        L3a:
            r1 = move-exception
            return r2
    }

    static /* synthetic */ void lambda$diagnostic$1(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r0, int r1, java.lang.Object r2) {
            r0.onDiagnosticReceived(r1, r2)
            return
    }

    static /* synthetic */ void lambda$result$0(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r0, int r1, java.lang.Object r2) {
            r0.onResultReceived(r1, r2)
            return
    }

    static void noteProfileWrittenFor(android.content.pm.PackageInfo r4, java.io.File r5) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r5, r1)
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r2.<init>(r0)     // Catch: java.io.IOException -> L24
            r1.<init>(r2)     // Catch: java.io.IOException -> L24
            long r2 = r4.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r1.writeLong(r2)     // Catch: java.lang.Throwable -> L1a
            r1.close()     // Catch: java.io.IOException -> L24
            goto L25
        L1a:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            r1 = move-exception
        L25:
            return
    }

    static void result(java.util.concurrent.Executor r1, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r2, int r3, java.lang.Object r4) {
            androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0 r0 = new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
    }

    private static boolean transcodeAndWrite(android.content.res.AssetManager r11, java.lang.String r12, android.content.pm.PackageInfo r13, java.io.File r14, java.lang.String r15, java.util.concurrent.Executor r16, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r17) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/data/misc/profiles/cur/0"
            r1.<init>(r2, r12)
            java.lang.String r2 = "primary.prof"
            r0.<init>(r1, r2)
            r10 = r0
            androidx.profileinstaller.DeviceProfileWriter r3 = new androidx.profileinstaller.DeviceProfileWriter
            java.lang.String r8 = "dexopt/baseline.prof"
            java.lang.String r9 = "dexopt/baseline.profm"
            r4 = r11
            r7 = r15
            r5 = r16
            r6 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r3.deviceAllowsProfileInstallerAotWrites()
            if (r0 != 0) goto L26
            r0 = 0
            return r0
        L26:
            androidx.profileinstaller.DeviceProfileWriter r0 = r3.read()
            androidx.profileinstaller.DeviceProfileWriter r0 = r0.transcodeIfNeeded()
            boolean r0 = r0.write()
            if (r0 == 0) goto L37
            noteProfileWrittenFor(r13, r14)
        L37:
            return r0
    }

    public static void writeProfile(android.content.Context r2) {
            androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0 r0 = new androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r1 = androidx.profileinstaller.ProfileInstaller.EMPTY_DIAGNOSTICS
            writeProfile(r2, r0, r1)
            return
    }

    public static void writeProfile(android.content.Context r1, java.util.concurrent.Executor r2, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r3) {
            r0 = 0
            writeProfile(r1, r2, r3, r0)
            return
    }

    static void writeProfile(android.content.Context r12, java.util.concurrent.Executor r13, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r14, boolean r15) {
            android.content.Context r1 = r12.getApplicationContext()
            java.lang.String r3 = r1.getPackageName()
            android.content.pm.ApplicationInfo r9 = r1.getApplicationInfo()
            android.content.res.AssetManager r2 = r1.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r9.sourceDir
            r0.<init>(r4)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r10 = r12.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r4 = r10.getPackageInfo(r3, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7e
            java.io.File r5 = r12.getFilesDir()
            java.lang.String r0 = "ProfileInstaller"
            if (r15 != 0) goto L54
            boolean r7 = hasAlreadyWrittenProfileForThisInstall(r4, r5, r14)
            if (r7 != 0) goto L34
            goto L54
        L34:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skipping profile installation for "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r12.getPackageName()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r0, r7)
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r12, r11)
            r7 = r13
            r8 = r14
            goto L7d
        L54:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Installing profile for "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r12.getPackageName()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r0, r7)
            r7 = r13
            r8 = r14
            boolean r13 = transcodeAndWrite(r2, r3, r4, r5, r6, r7, r8)
            if (r13 == 0) goto L79
            if (r15 == 0) goto L79
            r11 = 1
        L79:
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r12, r11)
        L7d:
            return
        L7e:
            r0 = move-exception
            r7 = r13
            r8 = r14
            r13 = r0
            r14 = 7
            r8.onResultReceived(r14, r13)
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(r12, r11)
            return
    }

    static void writeSkipFile(android.content.Context r7, java.util.concurrent.Executor r8, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r9) {
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r3 = r2.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.io.File r4 = r7.getFilesDir()
            noteProfileWrittenFor(r3, r4)
            r5 = 10
            r6 = 0
            result(r8, r9, r5, r6)
            return
        L20:
            r3 = move-exception
            r4 = 7
            result(r8, r9, r4, r3)
            return
    }
}
