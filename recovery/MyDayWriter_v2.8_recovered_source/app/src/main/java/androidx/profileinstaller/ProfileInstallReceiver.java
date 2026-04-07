package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final java.lang.String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final java.lang.String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final java.lang.String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final java.lang.String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";
    private static final java.lang.String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    class ResultDiagnostics implements androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback {
        final /* synthetic */ androidx.profileinstaller.ProfileInstallReceiver this$0;

        ResultDiagnostics(androidx.profileinstaller.ProfileInstallReceiver r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int r2, java.lang.Object r3) {
                r1 = this;
                androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS
                r0.onDiagnosticReceived(r2, r3)
                return
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int r2, java.lang.Object r3) {
                r1 = this;
                androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback r0 = androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS
                r0.onResultReceived(r2, r3)
                androidx.profileinstaller.ProfileInstallReceiver r0 = r1.this$0
                r0.setResultCode(r2)
                return
        }
    }

    public ProfileInstallReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    static void saveProfile(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback r2) {
            int r0 = android.os.Process.myPid()
            r1 = 10
            android.os.Process.sendSignal(r0, r1)
            r0 = 12
            r1 = 0
            r2.onResultReceived(r0, r1)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r8.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0 r1 = new androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0
            r1.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics r2 = new androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics
            r2.<init>(r6)
            r3 = 1
            androidx.profileinstaller.ProfileInstaller.writeProfile(r7, r1, r2, r3)
            goto L9b
        L1f:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5f
            android.os.Bundle r1 = r8.getExtras()
            if (r1 == 0) goto L5e
            java.lang.String r2 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "WRITE_SKIP_FILE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L49
            androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0 r3 = new androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0
            r3.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics r4 = new androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics
            r4.<init>(r6)
            androidx.profileinstaller.ProfileInstaller.writeSkipFile(r7, r3, r4)
            goto L5e
        L49:
            java.lang.String r3 = "DELETE_SKIP_FILE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5e
            androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0 r3 = new androidx.profileinstaller.ProfileInstallReceiver$$ExternalSyntheticLambda0
            r3.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics r4 = new androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics
            r4.<init>(r6)
            androidx.profileinstaller.ProfileInstaller.deleteSkipFile(r7, r3, r4)
        L5e:
            goto L9b
        L5f:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L70
            androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics r1 = new androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics
            r1.<init>(r6)
            saveProfile(r1)
            goto L9b
        L70:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L9b
            android.os.Bundle r1 = r8.getExtras()
            if (r1 == 0) goto L9b
            java.lang.String r2 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r2 = r1.getString(r2)
            androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics r3 = new androidx.profileinstaller.ProfileInstallReceiver$ResultDiagnostics
            r3.<init>(r6)
            java.lang.String r4 = "DROP_SHADER_CACHE"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L95
            androidx.profileinstaller.BenchmarkOperation.dropShaderCache(r7, r3)
            goto L9b
        L95:
            r4 = 16
            r5 = 0
            r3.onResultReceived(r4, r5)
        L9b:
            return
    }
}
