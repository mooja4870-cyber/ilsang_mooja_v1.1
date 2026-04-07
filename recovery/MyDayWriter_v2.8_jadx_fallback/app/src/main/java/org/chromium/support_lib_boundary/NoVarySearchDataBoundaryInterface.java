package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface NoVarySearchDataBoundaryInterface {
    java.util.List<java.lang.String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    java.util.List<java.lang.String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
