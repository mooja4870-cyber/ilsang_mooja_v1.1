package androidx.core.provider;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FontRequestWorker$$ExternalSyntheticBackport1 {
    public static /* synthetic */ java.util.List m(java.lang.Object[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            return r4
    }
}
