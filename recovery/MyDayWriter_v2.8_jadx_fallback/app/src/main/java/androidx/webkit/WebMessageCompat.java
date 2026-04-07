package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageCompat {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final byte[] mArrayBuffer;
    private final androidx.webkit.WebMessagePortCompat[] mPorts;
    private final java.lang.String mString;
    private final int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public WebMessageCompat(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WebMessageCompat(java.lang.String r2, androidx.webkit.WebMessagePortCompat[] r3) {
            r1 = this;
            r1.<init>()
            r1.mString = r2
            r0 = 0
            r1.mArrayBuffer = r0
            r1.mPorts = r3
            r0 = 0
            r1.mType = r0
            return
    }

    public WebMessageCompat(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WebMessageCompat(byte[] r2, androidx.webkit.WebMessagePortCompat[] r3) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            r1.mArrayBuffer = r2
            r0 = 0
            r1.mString = r0
            r1.mPorts = r3
            r0 = 1
            r1.mType = r0
            return
    }

    private void checkType(int r4) {
            r3 = this;
            int r0 = r3.mType
            if (r4 != r0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong data accessor type detected. "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.mType
            java.lang.String r2 = r3.typeToString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " expected, but got "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.typeToString(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String typeToString(int r2) {
            r1 = this;
            switch(r2) {
                case 0: goto L9;
                case 1: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Unknown"
            return r0
        L6:
            java.lang.String r0 = "ArrayBuffer"
            return r0
        L9:
            java.lang.String r0 = "String"
            return r0
    }

    public byte[] getArrayBuffer() {
            r1 = this;
            r0 = 1
            r1.checkType(r0)
            byte[] r0 = r1.mArrayBuffer
            java.util.Objects.requireNonNull(r0)
            byte[] r0 = r1.mArrayBuffer
            return r0
    }

    public java.lang.String getData() {
            r1 = this;
            r0 = 0
            r1.checkType(r0)
            java.lang.String r0 = r1.mString
            return r0
    }

    public androidx.webkit.WebMessagePortCompat[] getPorts() {
            r1 = this;
            androidx.webkit.WebMessagePortCompat[] r0 = r1.mPorts
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.mType
            return r0
    }
}
