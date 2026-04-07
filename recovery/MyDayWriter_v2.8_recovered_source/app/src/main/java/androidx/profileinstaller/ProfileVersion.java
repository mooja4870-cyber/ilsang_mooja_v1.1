package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileVersion {
    static final byte[] METADATA_V001_N = null;
    static final byte[] METADATA_V002 = null;
    public static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] V001_N = null;
    static final byte[] V005_O = null;
    static final byte[] V009_O_MR1 = null;
    static final byte[] V010_P = null;
    static final byte[] V015_S = null;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0034: FILL_ARRAY_DATA , data: [48, 49, 53, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.V015_S = r1
            byte[] r1 = new byte[r0]
            r1 = {x003a: FILL_ARRAY_DATA , data: [48, 49, 48, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.V010_P = r1
            byte[] r1 = new byte[r0]
            r1 = {x0040: FILL_ARRAY_DATA , data: [48, 48, 57, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.V009_O_MR1 = r1
            byte[] r1 = new byte[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [48, 48, 53, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.V005_O = r1
            byte[] r1 = new byte[r0]
            r1 = {x004c: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.V001_N = r1
            byte[] r1 = new byte[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.METADATA_V001_N = r1
            byte[] r0 = new byte[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [48, 48, 50, 0} // fill-array
            androidx.profileinstaller.ProfileVersion.METADATA_V002 = r0
            return
    }

    private ProfileVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String dexKeySeparator(byte[] r2) {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V001_N
            boolean r0 = java.util.Arrays.equals(r2, r0)
            java.lang.String r1 = ":"
            if (r0 == 0) goto Lb
            return r1
        Lb:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.String r0 = "!"
            return r0
    }
}
