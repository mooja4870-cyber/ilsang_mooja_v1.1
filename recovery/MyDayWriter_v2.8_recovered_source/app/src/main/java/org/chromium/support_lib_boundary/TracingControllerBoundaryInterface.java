package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int r1, java.util.Collection<java.lang.String> r2, int r3) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException;

    boolean stop(java.io.OutputStream r1, java.util.concurrent.Executor r2);
}
