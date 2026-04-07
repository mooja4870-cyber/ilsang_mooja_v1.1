package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public enum DirectExecutor extends java.lang.Enum<androidx.concurrent.futures.DirectExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ androidx.concurrent.futures.DirectExecutor[] $VALUES = null;
    public static final androidx.concurrent.futures.DirectExecutor INSTANCE = null;

    static {
            androidx.concurrent.futures.DirectExecutor r0 = new androidx.concurrent.futures.DirectExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.concurrent.futures.DirectExecutor.INSTANCE = r0
            androidx.concurrent.futures.DirectExecutor r0 = androidx.concurrent.futures.DirectExecutor.INSTANCE
            androidx.concurrent.futures.DirectExecutor[] r0 = new androidx.concurrent.futures.DirectExecutor[]{r0}
            androidx.concurrent.futures.DirectExecutor.$VALUES = r0
            return
    }

    DirectExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.concurrent.futures.DirectExecutor valueOf(java.lang.String r1) {
            java.lang.Class<androidx.concurrent.futures.DirectExecutor> r0 = androidx.concurrent.futures.DirectExecutor.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            androidx.concurrent.futures.DirectExecutor r0 = (androidx.concurrent.futures.DirectExecutor) r0
            return r0
    }

    public static androidx.concurrent.futures.DirectExecutor[] values() {
            androidx.concurrent.futures.DirectExecutor[] r0 = androidx.concurrent.futures.DirectExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.concurrent.futures.DirectExecutor[] r0 = (androidx.concurrent.futures.DirectExecutor[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "DirectExecutor"
            return r0
    }
}
