package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public interface WebNavigationClient {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalNavigationCallback {
    }

    void onFirstContentfulPaint(androidx.webkit.Page r1);

    void onNavigationCompleted(androidx.webkit.Navigation r1);

    void onNavigationRedirected(androidx.webkit.Navigation r1);

    void onNavigationStarted(androidx.webkit.Navigation r1);

    void onPageDeleted(androidx.webkit.Page r1);

    void onPageDomContentLoadedEventFired(androidx.webkit.Page r1);

    void onPageLoadEventFired(androidx.webkit.Page r1);
}
