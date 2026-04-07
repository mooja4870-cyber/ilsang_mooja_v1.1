package kotlin.io;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, d2 = {"constructMessage", "", "file", "Ljava/io/File;", "other", "reason", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExceptionsKt {
    public static final /* synthetic */ java.lang.String access$constructMessage(java.io.File r1, java.io.File r2, java.lang.String r3) {
            java.lang.String r0 = constructMessage(r1, r2, r3)
            return r0
    }

    private static final java.lang.String constructMessage(java.io.File r3, java.io.File r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            if (r4 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " -> "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L21:
            if (r5 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L39:
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }
}
