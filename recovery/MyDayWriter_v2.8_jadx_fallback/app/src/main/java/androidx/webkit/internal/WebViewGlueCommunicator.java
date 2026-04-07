package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewGlueCommunicator {
    private static final java.lang.String GLUE_FACTORY_PROVIDER_FETCHER_CLASS = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    private static final java.lang.String GLUE_FACTORY_PROVIDER_FETCHER_METHOD = "createWebViewProviderFactory";

    private static class LAZY_COMPAT_CONVERTER_HOLDER {
        static final androidx.webkit.internal.WebkitToCompatConverter INSTANCE = null;

        static {
                androidx.webkit.internal.WebkitToCompatConverter r0 = new androidx.webkit.internal.WebkitToCompatConverter
                androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
                org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r1 = r1.getWebkitToCompatConverter()
                r0.<init>(r1)
                androidx.webkit.internal.WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE = r0
                return
        }

        private LAZY_COMPAT_CONVERTER_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class LAZY_FACTORY_HOLDER {
        static final androidx.webkit.internal.WebViewProviderFactory INSTANCE = null;

        static {
                androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.createGlueProviderFactory()
                androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE = r0
                return
        }

        private LAZY_FACTORY_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private WebViewGlueCommunicator() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.webkit.internal.WebViewProviderFactory createGlueProviderFactory() {
            java.lang.reflect.InvocationHandler r0 = fetchGlueProviderFactoryImpl()     // Catch: java.lang.ClassNotFoundException -> L13 java.lang.Throwable -> L1a
            androidx.webkit.internal.WebViewProviderFactoryAdapter r1 = new androidx.webkit.internal.WebViewProviderFactoryAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface> r2 = org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class
            java.lang.Object r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r2, r0)
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r2 = (org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) r2
            r1.<init>(r2)
            return r1
        L13:
            r0 = move-exception
            androidx.webkit.internal.IncompatibleApkWebViewProviderFactory r1 = new androidx.webkit.internal.IncompatibleApkWebViewProviderFactory
            r1.<init>()
            return r1
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static java.lang.reflect.InvocationHandler fetchGlueProviderFactoryImpl() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.ClassLoader r0 = getWebViewClassLoader()
            java.lang.String r1 = "org.chromium.support_lib_glue.SupportLibReflectionUtil"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)
            java.lang.String r1 = "createWebViewProviderFactory"
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r1.invoke(r3, r2)
            java.lang.reflect.InvocationHandler r2 = (java.lang.reflect.InvocationHandler) r2
            return r2
    }

    public static androidx.webkit.internal.WebkitToCompatConverter getCompatConverter() {
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE
            return r0
    }

    public static androidx.webkit.internal.WebViewProviderFactory getFactory() {
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE
            return r0
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.ClassLoader r0 = androidx.webkit.internal.ApiHelperForP.getWebViewClassLoader()
            return r0
        Lb:
            java.lang.Object r0 = getWebViewProviderFactory()
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    private static java.lang.Object getWebViewProviderFactory() {
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r1 = "getFactory"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L17
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
