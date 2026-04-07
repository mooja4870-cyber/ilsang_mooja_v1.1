package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class AtomicFile {
    private static final java.lang.String LOG_TAG = "AtomicFile";
    private final java.io.File mBaseName;
    private final java.io.File mLegacyBackupName;
    private final java.io.File mNewName;

    public AtomicFile(java.io.File r4) {
            r3 = this;
            r3.<init>()
            r3.mBaseName = r4
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".new"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.mNewName = r0
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".bak"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.mLegacyBackupName = r0
            return
    }

    private static void rename(java.io.File r3, java.io.File r4) {
            boolean r0 = r4.isDirectory()
            java.lang.String r1 = "AtomicFile"
            if (r0 == 0) goto L24
            boolean r0 = r4.delete()
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to delete file which is a directory "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L24:
            boolean r0 = r3.renameTo(r4)
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to rename "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r2 = " to "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L4a:
            return
    }

    private static boolean sync(java.io.FileOutputStream r1) {
            java.io.FileDescriptor r0 = r1.getFD()     // Catch: java.io.IOException -> L9
            r0.sync()     // Catch: java.io.IOException -> L9
            r0 = 1
            return r0
        L9:
            r0 = move-exception
            r0 = 0
            return r0
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.mBaseName
            r0.delete()
            java.io.File r0 = r1.mNewName
            r0.delete()
            java.io.File r0 = r1.mLegacyBackupName
            r0.delete()
            return
    }

    public void failWrite(java.io.FileOutputStream r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = sync(r4)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r4.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r0 = move-exception
            java.lang.String r2 = "Failed to close file output stream"
            android.util.Log.e(r1, r2, r0)
        L1a:
            java.io.File r0 = r3.mNewName
            boolean r0 = r0.delete()
            if (r0 != 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to delete new file "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.io.File r2 = r3.mNewName
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L3a:
            return
    }

    public void finishWrite(java.io.FileOutputStream r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = sync(r4)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r4.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r0 = move-exception
            java.lang.String r2 = "Failed to close file output stream"
            android.util.Log.e(r1, r2, r0)
        L1a:
            java.io.File r0 = r3.mNewName
            java.io.File r1 = r3.mBaseName
            rename(r0, r1)
            return
    }

    public java.io.File getBaseFile() {
            r1 = this;
            java.io.File r0 = r1.mBaseName
            return r0
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.mLegacyBackupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r2.mLegacyBackupName
            java.io.File r1 = r2.mBaseName
            rename(r0, r1)
        Lf:
            java.io.File r0 = r2.mNewName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            java.io.File r0 = r2.mBaseName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            java.io.File r0 = r2.mNewName
            boolean r0 = r0.delete()
            if (r0 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to delete outdated new file "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.File r1 = r2.mNewName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AtomicFile"
            android.util.Log.e(r1, r0)
        L41:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.mBaseName
            r0.<init>(r1)
            return r0
    }

    public byte[] readFully() throws java.io.IOException {
            r7 = this;
            java.io.FileInputStream r0 = r7.openRead()
            r1 = 0
            int r2 = r0.available()     // Catch: java.lang.Throwable -> L2c
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L2c
        Lb:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 - r1
            int r4 = r0.read(r3, r1, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 > 0) goto L18
        L14:
            r0.close()
            return r3
        L18:
            int r1 = r1 + r4
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L2c
            r2 = r5
            int r5 = r3.length     // Catch: java.lang.Throwable -> L2c
            int r5 = r5 - r1
            if (r2 <= r5) goto L2b
            int r5 = r1 + r2
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            java.lang.System.arraycopy(r3, r6, r5, r6, r1)     // Catch: java.lang.Throwable -> L2c
            r3 = r5
        L2b:
            goto Lb
        L2c:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
            r6 = this;
            java.io.File r0 = r6.mLegacyBackupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r6.mLegacyBackupName
            java.io.File r1 = r6.mBaseName
            rename(r0, r1)
        Lf:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L17
            java.io.File r1 = r6.mNewName     // Catch: java.io.FileNotFoundException -> L17
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L17
            return r0
        L17:
            r0 = move-exception
            java.io.File r1 = r6.mNewName
            java.io.File r1 = r1.getParentFile()
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L48
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L2c
            java.io.File r3 = r6.mNewName     // Catch: java.io.FileNotFoundException -> L2c
            r2.<init>(r3)     // Catch: java.io.FileNotFoundException -> L2c
            return r2
        L2c:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to create new file "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.io.File r5 = r6.mNewName
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r2)
            throw r3
        L48:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to create directory for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.io.File r4 = r6.mNewName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
