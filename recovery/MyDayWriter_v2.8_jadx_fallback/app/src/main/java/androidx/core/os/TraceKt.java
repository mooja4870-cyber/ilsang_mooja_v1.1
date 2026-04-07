package androidx.core.os;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TraceKt {
    @kotlin.Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @kotlin.ReplaceWith(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(java.lang.String r2, kotlin.jvm.functions.Function0<? extends T> r3) {
            r0 = 0
            android.os.Trace.beginSection(r2)
            java.lang.Object r1 = r3.invoke()     // Catch: java.lang.Throwable -> Ld
            android.os.Trace.endSection()
            return r1
        Ld:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }
}
