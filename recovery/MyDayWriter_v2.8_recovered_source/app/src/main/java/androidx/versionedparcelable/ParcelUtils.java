package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelUtils {
    private static final java.lang.String INNER_BUNDLE_KEY = "a";

    private ParcelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T fromInputStream(java.io.InputStream r2) {
            androidx.versionedparcelable.VersionedParcelStream r0 = new androidx.versionedparcelable.VersionedParcelStream
            r1 = 0
            r0.<init>(r2, r1)
            androidx.versionedparcelable.VersionedParcelable r1 = r0.readVersionedParcelable()
            return r1
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T fromParcelable(android.os.Parcelable r2) {
            boolean r0 = r2 instanceof androidx.versionedparcelable.ParcelImpl
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.versionedparcelable.ParcelImpl r0 = (androidx.versionedparcelable.ParcelImpl) r0
            androidx.versionedparcelable.VersionedParcelable r0 = r0.getVersionedParcel()
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid parcel"
            r0.<init>(r1)
            throw r0
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T getVersionedParcelable(android.os.Bundle r3, java.lang.String r4) {
            r0 = 0
            android.os.Parcelable r1 = r3.getParcelable(r4)     // Catch: java.lang.RuntimeException -> L1e
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L1e
            if (r1 != 0) goto La
            return r0
        La:
            java.lang.Class<androidx.versionedparcelable.ParcelUtils> r2 = androidx.versionedparcelable.ParcelUtils.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L1e
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L1e
            java.lang.String r2 = "a"
            android.os.Parcelable r2 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            androidx.versionedparcelable.VersionedParcelable r0 = fromParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            return r0
        L1e:
            r1 = move-exception
            return r0
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> java.util.List<T> getVersionedParcelableList(android.os.Bundle r6, java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcelable r1 = r6.getParcelable(r7)     // Catch: java.lang.RuntimeException -> L34
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L34
            java.lang.Class<androidx.versionedparcelable.ParcelUtils> r2 = androidx.versionedparcelable.ParcelUtils.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L34
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L34
            java.lang.String r2 = "a"
            java.util.ArrayList r2 = r1.getParcelableArrayList(r2)     // Catch: java.lang.RuntimeException -> L34
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.RuntimeException -> L34
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.RuntimeException -> L34
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()     // Catch: java.lang.RuntimeException -> L34
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch: java.lang.RuntimeException -> L34
            androidx.versionedparcelable.VersionedParcelable r5 = fromParcelable(r4)     // Catch: java.lang.RuntimeException -> L34
            r0.add(r5)     // Catch: java.lang.RuntimeException -> L34
            goto L1e
        L33:
            return r0
        L34:
            r1 = move-exception
            r1 = 0
            return r1
    }

    public static void putVersionedParcelable(android.os.Bundle r3, java.lang.String r4, androidx.versionedparcelable.VersionedParcelable r5) {
            if (r5 != 0) goto L3
            return
        L3:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "a"
            android.os.Parcelable r2 = toParcelable(r5)
            r0.putParcelable(r1, r2)
            r3.putParcelable(r4, r0)
            return
    }

    public static void putVersionedParcelableList(android.os.Bundle r5, java.lang.String r6, java.util.List<? extends androidx.versionedparcelable.VersionedParcelable> r7) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()
            androidx.versionedparcelable.VersionedParcelable r3 = (androidx.versionedparcelable.VersionedParcelable) r3
            android.os.Parcelable r4 = toParcelable(r3)
            r1.add(r4)
            goto Le
        L22:
            java.lang.String r2 = "a"
            r0.putParcelableArrayList(r2, r1)
            r5.putParcelable(r6, r0)
            return
    }

    public static void toOutputStream(androidx.versionedparcelable.VersionedParcelable r2, java.io.OutputStream r3) {
            androidx.versionedparcelable.VersionedParcelStream r0 = new androidx.versionedparcelable.VersionedParcelStream
            r1 = 0
            r0.<init>(r1, r3)
            r0.writeVersionedParcelable(r2)
            r0.closeField()
            return
    }

    public static android.os.Parcelable toParcelable(androidx.versionedparcelable.VersionedParcelable r1) {
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r1)
            return r0
    }
}
