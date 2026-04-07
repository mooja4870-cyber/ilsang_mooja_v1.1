package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(java.lang.Runnable r1, java.util.concurrent.Executor r2);

    void setProxyOverride(java.lang.String[][] r1, java.lang.String[] r2, java.lang.Runnable r3, java.util.concurrent.Executor r4);

    void setProxyOverride(java.lang.String[][] r1, java.lang.String[] r2, java.lang.Runnable r3, java.util.concurrent.Executor r4, boolean r5);
}
