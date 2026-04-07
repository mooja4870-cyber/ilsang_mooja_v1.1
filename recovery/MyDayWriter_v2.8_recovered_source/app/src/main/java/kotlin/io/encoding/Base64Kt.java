package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"base64DecodeMap", "", "getBase64DecodeMap$annotations", "()V", "base64EncodeMap", "", "base64UrlDecodeMap", "getBase64UrlDecodeMap$annotations", "base64UrlEncodeMap", "isInMimeAlphabet", "", "symbol", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64Kt {
    private static final int[] base64DecodeMap = null;
    private static final byte[] base64EncodeMap = null;
    private static final int[] base64UrlDecodeMap = null;
    private static final byte[] base64UrlEncodeMap = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0130: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            kotlin.io.encoding.Base64Kt.base64EncodeMap = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1 = r0
            r7 = 0
            r5 = 6
            r6 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            kotlin.collections.ArraysKt.fill$default(r1, r2, r3, r4, r5, r6)
            r2 = 61
            r3 = -2
            r1[r2] = r3
            byte[] r2 = kotlin.io.encoding.Base64Kt.base64EncodeMap
            r3 = 0
            r4 = 0
            int r5 = r2.length
            r6 = 0
        L83:
            if (r6 >= r5) goto L93
            r8 = r2[r6]
            int r9 = r4 + 1
            r10 = r8
            r11 = 0
            r1[r10] = r4
            int r6 = r6 + 1
            r4 = r9
            goto L83
        L93:
            kotlin.io.encoding.Base64Kt.base64DecodeMap = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0154: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            kotlin.io.encoding.Base64Kt.base64UrlEncodeMap = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1 = r0
            r7 = 0
            r5 = 6
            r6 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            kotlin.collections.ArraysKt.fill$default(r1, r2, r3, r4, r5, r6)
            r2 = 61
            r3 = -2
            r1[r2] = r3
            byte[] r2 = kotlin.io.encoding.Base64Kt.base64UrlEncodeMap
            r3 = 0
            r4 = 0
            int r5 = r2.length
            r6 = 0
        L11a:
            if (r6 >= r5) goto L12a
            r8 = r2[r6]
            int r9 = r4 + 1
            r10 = r8
            r11 = 0
            r1[r10] = r4
            int r6 = r6 + 1
            r4 = r9
            goto L11a
        L12a:
            kotlin.io.encoding.Base64Kt.base64UrlDecodeMap = r0
            return
    }

    public static final /* synthetic */ int[] access$getBase64DecodeMap$p() {
            int[] r0 = kotlin.io.encoding.Base64Kt.base64DecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64EncodeMap$p() {
            byte[] r0 = kotlin.io.encoding.Base64Kt.base64EncodeMap
            return r0
    }

    public static final /* synthetic */ int[] access$getBase64UrlDecodeMap$p() {
            int[] r0 = kotlin.io.encoding.Base64Kt.base64UrlDecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64UrlEncodeMap$p() {
            byte[] r0 = kotlin.io.encoding.Base64Kt.base64UrlEncodeMap
            return r0
    }

    private static /* synthetic */ void getBase64DecodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64UrlDecodeMap$annotations() {
            return
    }

    public static final boolean isInMimeAlphabet(int r4) {
            r0 = 1
            r1 = 0
            if (r4 < 0) goto Lb
            int[] r2 = kotlin.io.encoding.Base64Kt.base64DecodeMap
            int r2 = r2.length
            if (r4 >= r2) goto Lb
            r2 = r0
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L16
            int[] r2 = kotlin.io.encoding.Base64Kt.base64DecodeMap
            r2 = r2[r4]
            r3 = -1
            if (r2 == r3) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            return r0
    }
}
