package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class BridgeWebViewClient extends android.webkit.WebViewClient {
    private com.getcapacitor.Bridge bridge;

    public BridgeWebViewClient(com.getcapacitor.Bridge r1) {
            r0 = this;
            r0.<init>()
            r0.bridge = r1
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView r4, java.lang.String r5) {
            r3 = this;
            super.onPageCommitVisible(r4, r5)
            com.getcapacitor.Bridge r0 = r3.bridge
            java.util.List r0 = r0.getWebViewListeners()
            if (r0 == 0) goto L25
            com.getcapacitor.Bridge r1 = r3.bridge
            java.util.List r1 = r1.getWebViewListeners()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.getcapacitor.WebViewListener r2 = (com.getcapacitor.WebViewListener) r2
            r2.onPageCommitVisible(r4, r5)
            goto L15
        L25:
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView r4, java.lang.String r5) {
            r3 = this;
            super.onPageFinished(r4, r5)
            com.getcapacitor.Bridge r0 = r3.bridge
            java.util.List r0 = r0.getWebViewListeners()
            if (r0 == 0) goto L2d
            int r1 = r4.getProgress()
            r2 = 100
            if (r1 != r2) goto L2d
            com.getcapacitor.Bridge r1 = r3.bridge
            java.util.List r1 = r1.getWebViewListeners()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            com.getcapacitor.WebViewListener r2 = (com.getcapacitor.WebViewListener) r2
            r2.onPageLoaded(r4)
            goto L1d
        L2d:
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
            r3 = this;
            super.onPageStarted(r4, r5, r6)
            com.getcapacitor.Bridge r0 = r3.bridge
            r0.reset()
            com.getcapacitor.Bridge r0 = r3.bridge
            java.util.List r0 = r0.getWebViewListeners()
            if (r0 == 0) goto L2a
            com.getcapacitor.Bridge r1 = r3.bridge
            java.util.List r1 = r1.getWebViewListeners()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            com.getcapacitor.WebViewListener r2 = (com.getcapacitor.WebViewListener) r2
            r2.onPageStarted(r4)
            goto L1a
        L2a:
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, android.webkit.WebResourceError r6) {
            r3 = this;
            super.onReceivedError(r4, r5, r6)
            com.getcapacitor.Bridge r0 = r3.bridge
            java.util.List r0 = r0.getWebViewListeners()
            if (r0 == 0) goto L25
            com.getcapacitor.Bridge r1 = r3.bridge
            java.util.List r1 = r1.getWebViewListeners()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.getcapacitor.WebViewListener r2 = (com.getcapacitor.WebViewListener) r2
            r2.onReceivedError(r4)
            goto L15
        L25:
            com.getcapacitor.Bridge r1 = r3.bridge
            java.lang.String r1 = r1.getErrorUrl()
            if (r1 == 0) goto L36
            boolean r2 = r5.isForMainFrame()
            if (r2 == 0) goto L36
            r4.loadUrl(r1)
        L36:
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, android.webkit.WebResourceResponse r6) {
            r3 = this;
            super.onReceivedHttpError(r4, r5, r6)
            com.getcapacitor.Bridge r0 = r3.bridge
            java.util.List r0 = r0.getWebViewListeners()
            if (r0 == 0) goto L25
            com.getcapacitor.Bridge r1 = r3.bridge
            java.util.List r1 = r1.getWebViewListeners()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.getcapacitor.WebViewListener r2 = (com.getcapacitor.WebViewListener) r2
            r2.onReceivedHttpError(r4)
            goto L15
        L25:
            com.getcapacitor.Bridge r1 = r3.bridge
            java.lang.String r1 = r1.getErrorUrl()
            if (r1 == 0) goto L36
            boolean r2 = r5.isForMainFrame()
            if (r2 == 0) goto L36
            r4.loadUrl(r1)
        L36:
            return
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView r6, android.webkit.RenderProcessGoneDetail r7) {
            r5 = this;
            super.onRenderProcessGone(r6, r7)
            r0 = 0
            com.getcapacitor.Bridge r1 = r5.bridge
            java.util.List r1 = r1.getWebViewListeners()
            if (r1 == 0) goto L30
            com.getcapacitor.Bridge r2 = r5.bridge
            java.util.List r2 = r2.getWebViewListeners()
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            com.getcapacitor.WebViewListener r3 = (com.getcapacitor.WebViewListener) r3
            boolean r4 = r3.onRenderProcessGone(r6, r7)
            if (r4 != 0) goto L2d
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r4 = 0
            goto L2e
        L2d:
            r4 = 1
        L2e:
            r0 = r4
            goto L16
        L30:
            return r0
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            com.getcapacitor.WebViewLocalServer r0 = r0.getLocalServer()
            android.webkit.WebResourceResponse r0 = r0.shouldInterceptRequest(r3)
            return r0
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
            r2 = this;
            android.net.Uri r0 = r4.getUrl()
            com.getcapacitor.Bridge r1 = r2.bridge
            boolean r1 = r1.launchIntent(r0)
            return r1
    }
}
