package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionHandler.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/InternalCompletionHandler;", "", "invoke", "", "cause", "", "UserSupplied", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InternalCompletionHandler {

    /* JADX INFO: compiled from: CompletionHandler.common.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B*\u0012#\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R+\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/InternalCompletionHandler$UserSupplied;", "Lkotlinx/coroutines/InternalCompletionHandler;", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserSupplied implements kotlinx.coroutines.InternalCompletionHandler {
        private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> handler;

        public UserSupplied(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                return
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(java.lang.Throwable r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.handler
                r0.invoke(r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "InternalCompletionHandler.UserSupplied["
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.handler
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 64
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    void invoke(java.lang.Throwable r1);
}
