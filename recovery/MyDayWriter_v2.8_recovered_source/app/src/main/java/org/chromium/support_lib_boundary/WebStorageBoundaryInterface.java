package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(java.util.concurrent.Executor r1, java.lang.Runnable r2);

    java.lang.String deleteBrowsingDataForSite(java.lang.String r1, java.util.concurrent.Executor r2, java.lang.Runnable r3);
}
