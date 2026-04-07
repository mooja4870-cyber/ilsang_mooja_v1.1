package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewAssetLoader {
    public static final java.lang.String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    private static final java.lang.String TAG = "WebViewAssetLoader";
    private final java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> mMatchers;

    public static final class AssetsPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private final androidx.webkit.internal.AssetHelper mAssetHelper;

        public AssetsPathHandler(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                androidx.webkit.internal.AssetHelper r0 = new androidx.webkit.internal.AssetHelper
                r0.<init>(r2)
                r1.mAssetHelper = r0
                return
        }

        AssetsPathHandler(androidx.webkit.internal.AssetHelper r1) {
                r0 = this;
                r0.<init>()
                r0.mAssetHelper = r1
                return
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String r5) {
                r4 = this;
                r0 = 0
                androidx.webkit.internal.AssetHelper r1 = r4.mAssetHelper     // Catch: java.io.IOException -> L11
                java.io.InputStream r1 = r1.openAsset(r5)     // Catch: java.io.IOException -> L11
                java.lang.String r2 = androidx.webkit.internal.AssetHelper.guessMimeType(r5)     // Catch: java.io.IOException -> L11
                android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse     // Catch: java.io.IOException -> L11
                r3.<init>(r2, r0, r1)     // Catch: java.io.IOException -> L11
                return r3
            L11:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error opening asset path: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WebViewAssetLoader"
                android.util.Log.e(r3, r2, r1)
                android.webkit.WebResourceResponse r2 = new android.webkit.WebResourceResponse
                r2.<init>(r0, r0, r0)
                return r2
        }
    }

    public static final class Builder {
        private java.lang.String mDomain;
        private final java.util.List<androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader.PathHandler>> mHandlerList;
        private boolean mHttpAllowed;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "appassets.androidplatform.net"
                r1.mDomain = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHandlerList = r0
                return
        }

        public androidx.webkit.WebViewAssetLoader.Builder addPathHandler(java.lang.String r3, androidx.webkit.WebViewAssetLoader.PathHandler r4) {
                r2 = this;
                java.util.List<androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader$PathHandler>> r0 = r2.mHandlerList
                androidx.core.util.Pair r1 = androidx.core.util.Pair.create(r3, r4)
                r0.add(r1)
                return r2
        }

        public androidx.webkit.WebViewAssetLoader build() {
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader$PathHandler>> r1 = r8.mHandlerList
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2c
                java.lang.Object r2 = r1.next()
                androidx.core.util.Pair r2 = (androidx.core.util.Pair) r2
                F r3 = r2.first
                java.lang.String r3 = (java.lang.String) r3
                S r4 = r2.second
                androidx.webkit.WebViewAssetLoader$PathHandler r4 = (androidx.webkit.WebViewAssetLoader.PathHandler) r4
                androidx.webkit.WebViewAssetLoader$PathMatcher r5 = new androidx.webkit.WebViewAssetLoader$PathMatcher
                java.lang.String r6 = r8.mDomain
                boolean r7 = r8.mHttpAllowed
                r5.<init>(r6, r3, r7, r4)
                r0.add(r5)
                goto Lb
            L2c:
                androidx.webkit.WebViewAssetLoader r1 = new androidx.webkit.WebViewAssetLoader
                r1.<init>(r0)
                return r1
        }

        public androidx.webkit.WebViewAssetLoader.Builder setDomain(java.lang.String r1) {
                r0 = this;
                r0.mDomain = r1
                return r0
        }

        public androidx.webkit.WebViewAssetLoader.Builder setHttpAllowed(boolean r1) {
                r0 = this;
                r0.mHttpAllowed = r1
                return r0
        }
    }

    public static final class InternalStoragePathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private static final java.lang.String[] FORBIDDEN_DATA_DIRS = null;
        private final java.io.File mDirectory;

        static {
                r0 = 5
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.lang.String r2 = "app_webview/"
                r0[r1] = r2
                r1 = 1
                java.lang.String r2 = "databases/"
                r0[r1] = r2
                r1 = 2
                java.lang.String r2 = "lib/"
                r0[r1] = r2
                r1 = 3
                java.lang.String r2 = "shared_prefs/"
                r0[r1] = r2
                r1 = 4
                java.lang.String r2 = "code_cache/"
                r0[r1] = r2
                androidx.webkit.WebViewAssetLoader.InternalStoragePathHandler.FORBIDDEN_DATA_DIRS = r0
                return
        }

        public InternalStoragePathHandler(android.content.Context r5, java.io.File r6) {
                r4 = this;
                r4.<init>()
                java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L35
                java.lang.String r1 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(r6)     // Catch: java.io.IOException -> L35
                r0.<init>(r1)     // Catch: java.io.IOException -> L35
                r4.mDirectory = r0     // Catch: java.io.IOException -> L35
                boolean r0 = r4.isAllowedInternalStorageDir(r5)     // Catch: java.io.IOException -> L35
                if (r0 == 0) goto L16
            L15:
                return
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.io.IOException -> L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
                r1.<init>()     // Catch: java.io.IOException -> L35
                java.lang.String r2 = "The given directory \""
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L35
                java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.io.IOException -> L35
                java.lang.String r2 = "\" doesn't exist under an allowed app internal storage directory"
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L35
                java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L35
                r0.<init>(r1)     // Catch: java.io.IOException -> L35
                throw r0     // Catch: java.io.IOException -> L35
            L35:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to resolve the canonical path for the given directory: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r6.getPath()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
        }

        private boolean isAllowedInternalStorageDir(android.content.Context r10) throws java.io.IOException {
                r9 = this;
                java.io.File r0 = r9.mDirectory
                java.lang.String r0 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(r0)
                java.io.File r1 = r10.getCacheDir()
                java.lang.String r1 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(r1)
                java.io.File r2 = androidx.webkit.internal.AssetHelper.getDataDir(r10)
                java.lang.String r2 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(r2)
                boolean r3 = r0.startsWith(r1)
                r4 = 0
                if (r3 != 0) goto L24
                boolean r3 = r0.startsWith(r2)
                if (r3 != 0) goto L24
                return r4
            L24:
                boolean r3 = r0.equals(r1)
                if (r3 != 0) goto L56
                boolean r3 = r0.equals(r2)
                if (r3 == 0) goto L31
                goto L56
            L31:
                java.lang.String[] r3 = androidx.webkit.WebViewAssetLoader.InternalStoragePathHandler.FORBIDDEN_DATA_DIRS
                int r5 = r3.length
                r6 = r4
            L35:
                if (r6 >= r5) goto L54
                r7 = r3[r6]
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r8 = r8.append(r2)
                java.lang.StringBuilder r8 = r8.append(r7)
                java.lang.String r8 = r8.toString()
                boolean r8 = r0.startsWith(r8)
                if (r8 == 0) goto L51
                return r4
            L51:
                int r6 = r6 + 1
                goto L35
            L54:
                r3 = 1
                return r3
            L56:
                return r4
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "WebViewAssetLoader"
                r1 = 0
                java.io.File r2 = r6.mDirectory     // Catch: java.io.IOException -> L2a
                java.io.File r2 = androidx.webkit.internal.AssetHelper.getCanonicalFileIfChild(r2, r7)     // Catch: java.io.IOException -> L2a
                if (r2 == 0) goto L19
                java.io.InputStream r3 = androidx.webkit.internal.AssetHelper.openFile(r2)     // Catch: java.io.IOException -> L2a
                java.lang.String r4 = androidx.webkit.internal.AssetHelper.guessMimeType(r7)     // Catch: java.io.IOException -> L2a
                android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch: java.io.IOException -> L2a
                r5.<init>(r4, r1, r3)     // Catch: java.io.IOException -> L2a
                return r5
            L19:
                java.lang.String r3 = "The requested file: %s is outside the mounted directory: %s"
                java.io.File r4 = r6.mDirectory     // Catch: java.io.IOException -> L2a
                java.lang.Object[] r4 = new java.lang.Object[]{r7, r4}     // Catch: java.io.IOException -> L2a
                java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.io.IOException -> L2a
                android.util.Log.e(r0, r3)     // Catch: java.io.IOException -> L2a
                goto L41
            L2a:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error opening the requested path: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r0, r3, r2)
            L41:
                android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
                r0.<init>(r1, r1, r1)
                return r0
        }
    }

    public interface PathHandler {
        android.webkit.WebResourceResponse handle(java.lang.String r1);
    }

    static class PathMatcher {
        static final java.lang.String HTTPS_SCHEME = "https";
        static final java.lang.String HTTP_SCHEME = "http";
        final java.lang.String mAuthority;
        final androidx.webkit.WebViewAssetLoader.PathHandler mHandler;
        final boolean mHttpEnabled;
        final java.lang.String mPath;

        PathMatcher(java.lang.String r3, java.lang.String r4, boolean r5, androidx.webkit.WebViewAssetLoader.PathHandler r6) {
                r2 = this;
                r2.<init>()
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L2b
                r0 = 0
                char r0 = r4.charAt(r0)
                r1 = 47
                if (r0 != r1) goto L2b
                java.lang.String r0 = "/"
                boolean r0 = r4.endsWith(r0)
                if (r0 == 0) goto L23
                r2.mAuthority = r3
                r2.mPath = r4
                r2.mHttpEnabled = r5
                r2.mHandler = r6
                return
            L23:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Path should end with a slash '/'"
                r0.<init>(r1)
                throw r0
            L2b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Path should start with a slash '/'."
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String getSuffixPath(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.mPath
                java.lang.String r1 = ""
                java.lang.String r0 = r3.replaceFirst(r0, r1)
                return r0
        }

        public androidx.webkit.WebViewAssetLoader.PathHandler match(android.net.Uri r4) {
                r3 = this;
                java.lang.String r0 = r4.getScheme()
                java.lang.String r1 = "http"
                boolean r0 = r0.equals(r1)
                r2 = 0
                if (r0 == 0) goto L12
                boolean r0 = r3.mHttpEnabled
                if (r0 != 0) goto L12
                return r2
            L12:
                java.lang.String r0 = r4.getScheme()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L29
                java.lang.String r0 = r4.getScheme()
                java.lang.String r1 = "https"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L29
                return r2
            L29:
                java.lang.String r0 = r4.getAuthority()
                java.lang.String r1 = r3.mAuthority
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L36
                return r2
            L36:
                java.lang.String r0 = r4.getPath()
                java.lang.String r1 = r3.mPath
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L43
                return r2
            L43:
                androidx.webkit.WebViewAssetLoader$PathHandler r0 = r3.mHandler
                return r0
        }
    }

    public static final class ResourcesPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private final androidx.webkit.internal.AssetHelper mAssetHelper;

        public ResourcesPathHandler(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                androidx.webkit.internal.AssetHelper r0 = new androidx.webkit.internal.AssetHelper
                r0.<init>(r2)
                r1.mAssetHelper = r0
                return
        }

        ResourcesPathHandler(androidx.webkit.internal.AssetHelper r1) {
                r0 = this;
                r0.<init>()
                r0.mAssetHelper = r1
                return
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "WebViewAssetLoader"
                r1 = 0
                androidx.webkit.internal.AssetHelper r2 = r5.mAssetHelper     // Catch: java.io.IOException -> L13 android.content.res.Resources.NotFoundException -> L2b
                java.io.InputStream r2 = r2.openResource(r6)     // Catch: java.io.IOException -> L13 android.content.res.Resources.NotFoundException -> L2b
                java.lang.String r3 = androidx.webkit.internal.AssetHelper.guessMimeType(r6)     // Catch: java.io.IOException -> L13 android.content.res.Resources.NotFoundException -> L2b
                android.webkit.WebResourceResponse r4 = new android.webkit.WebResourceResponse     // Catch: java.io.IOException -> L13 android.content.res.Resources.NotFoundException -> L2b
                r4.<init>(r3, r1, r2)     // Catch: java.io.IOException -> L13 android.content.res.Resources.NotFoundException -> L2b
                return r4
            L13:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error opening resource from the path: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r0, r3, r2)
                goto L43
            L2b:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Resource not found from the path: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r0, r3, r2)
            L43:
                android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
                r0.<init>(r1, r1, r1)
                return r0
        }
    }

    WebViewAssetLoader(java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> r1) {
            r0 = this;
            r0.<init>()
            r0.mMatchers = r1
            return
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(android.net.Uri r6) {
            r5 = this;
            java.util.List<androidx.webkit.WebViewAssetLoader$PathMatcher> r0 = r5.mMatchers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            androidx.webkit.WebViewAssetLoader$PathMatcher r1 = (androidx.webkit.WebViewAssetLoader.PathMatcher) r1
            androidx.webkit.WebViewAssetLoader$PathHandler r2 = r1.match(r6)
            if (r2 != 0) goto L19
            goto L6
        L19:
            java.lang.String r3 = r6.getPath()
            java.lang.String r3 = r1.getSuffixPath(r3)
            android.webkit.WebResourceResponse r4 = r2.handle(r3)
            if (r4 != 0) goto L28
            goto L6
        L28:
            return r4
        L29:
            r0 = 0
            return r0
    }
}
