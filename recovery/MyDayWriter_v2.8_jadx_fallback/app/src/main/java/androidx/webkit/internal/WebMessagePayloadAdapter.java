package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebMessagePayloadAdapter implements org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface {
    private final byte[] mArrayBuffer;
    private final java.lang.String mString;
    private final int mType;

    public WebMessagePayloadAdapter(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mType = r0
            r1.mString = r2
            r0 = 0
            r1.mArrayBuffer = r0
            return
    }

    public WebMessagePayloadAdapter(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mType = r0
            r0 = 0
            r1.mString = r0
            r1.mArrayBuffer = r2
            return
    }

    private void checkType(int r4) {
            r3 = this;
            int r0 = r3.mType
            if (r0 != r4) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", but type is "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.mType
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
            r1 = this;
            r0 = 1
            r1.checkType(r0)
            byte[] r0 = r1.mArrayBuffer
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            byte[] r0 = (byte[]) r0
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public java.lang.String getAsString() {
            r1 = this;
            r0 = 0
            r1.checkType(r0)
            java.lang.String r0 = r1.mString
            return r0
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
            r1 = this;
            int r0 = r1.mType
            return r0
    }
}
