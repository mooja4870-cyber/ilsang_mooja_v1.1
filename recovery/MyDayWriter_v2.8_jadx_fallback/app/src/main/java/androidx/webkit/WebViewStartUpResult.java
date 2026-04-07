package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public interface WebViewStartUpResult {
    java.util.List<androidx.webkit.BlockingStartUpLocation> getBlockingStartUpLocations();

    java.lang.Long getMaxTimePerTaskInUiThreadMillis();

    java.lang.Long getTotalTimeInUiThreadMillis();
}
