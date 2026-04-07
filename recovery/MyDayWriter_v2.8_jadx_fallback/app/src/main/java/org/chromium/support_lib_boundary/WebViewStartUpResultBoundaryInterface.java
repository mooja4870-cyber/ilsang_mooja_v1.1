package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewStartUpResultBoundaryInterface {
    java.util.List<java.lang.Throwable> getBlockingStartUpLocations();

    java.lang.Long getMaxTimePerTaskInUiThreadMillis();

    java.lang.Long getTotalTimeInUiThreadMillis();
}
