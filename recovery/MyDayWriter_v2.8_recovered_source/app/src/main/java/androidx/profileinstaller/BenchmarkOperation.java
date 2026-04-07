package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class BenchmarkOperation {

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getCodeCacheDir(android.content.Context r1) {
                java.io.File r0 = r1.getCodeCacheDir()
                return r0
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Context createDeviceProtectedStorageContext(android.content.Context r1) {
                android.content.Context r0 = r1.createDeviceProtectedStorageContext()
                return r0
        }
    }

    private BenchmarkOperation() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean deleteFilesRecursively(java.io.File r8) {
            boolean r0 = r8.isDirectory()
            r1 = 1
            if (r0 == 0) goto L26
            java.io.File[] r0 = r8.listFiles()
            r2 = 0
            if (r0 != 0) goto Lf
            return r2
        Lf:
            r3 = 1
            int r4 = r0.length
            r5 = r2
        L12:
            if (r5 >= r4) goto L25
            r6 = r0[r5]
            boolean r7 = deleteFilesRecursively(r6)
            if (r7 == 0) goto L20
            if (r3 == 0) goto L20
            r7 = r1
            goto L21
        L20:
            r7 = r2
        L21:
            r3 = r7
            int r5 = r5 + 1
            goto L12
        L25:
            return r3
        L26:
            r8.delete()
            return r1
    }

    static void dropShaderCache(android.content.Context r3, androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lf
            android.content.Context r0 = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.createDeviceProtectedStorageContext(r3)
            java.io.File r0 = r0.getCacheDir()
            goto L19
        Lf:
            android.content.Context r0 = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.createDeviceProtectedStorageContext(r3)
            java.io.File r0 = androidx.profileinstaller.BenchmarkOperation.Api21ContextHelper.getCodeCacheDir(r0)
        L19:
            boolean r1 = deleteFilesRecursively(r0)
            r2 = 0
            if (r1 == 0) goto L26
            r1 = 14
            r4.onResultReceived(r1, r2)
            goto L2b
        L26:
            r1 = 15
            r4.onResultReceived(r1, r2)
        L2b:
            return
    }
}
