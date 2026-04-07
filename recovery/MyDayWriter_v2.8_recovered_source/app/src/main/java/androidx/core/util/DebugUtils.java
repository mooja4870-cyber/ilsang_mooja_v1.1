package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class DebugUtils {
    private DebugUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void buildShortClassTag(java.lang.Object r3, java.lang.StringBuilder r4) {
            if (r3 != 0) goto L8
            java.lang.String r0 = "null"
            r4.append(r0)
            goto L41
        L8:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L18
            int r1 = r0.length()
            if (r1 > 0) goto L2e
        L18:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r0 = r1.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L2e
            int r2 = r1 + 1
            java.lang.String r0 = r0.substring(r2)
        L2e:
            r4.append(r0)
            r1 = 123(0x7b, float:1.72E-43)
            r4.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r4.append(r1)
        L41:
            return
    }
}
