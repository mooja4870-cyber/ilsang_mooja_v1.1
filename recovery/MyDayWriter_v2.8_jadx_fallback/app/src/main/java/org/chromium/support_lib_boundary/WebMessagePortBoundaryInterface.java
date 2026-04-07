package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(java.lang.reflect.InvocationHandler r1);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler r1);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler r1, android.os.Handler r2);
}
