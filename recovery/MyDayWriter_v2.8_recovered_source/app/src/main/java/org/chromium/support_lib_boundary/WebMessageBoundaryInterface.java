package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebMessageBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    @java.lang.Deprecated
    java.lang.String getData();

    java.lang.reflect.InvocationHandler getMessagePayload();

    java.lang.reflect.InvocationHandler[] getPorts();
}
