package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewBuilderBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements java.util.function.Consumer<java.util.function.BiConsumer<java.lang.Integer, java.lang.Object>> {
        public int baseline;
        java.util.List<java.lang.String> mJavascriptInterfaceNames;
        java.util.List<java.lang.Object> mJavascriptInterfaceObjects;
        java.util.List<java.util.List<java.lang.String>> mJavascriptInterfaceSitePatterns;

        public Config() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.baseline = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mJavascriptInterfaceObjects = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mJavascriptInterfaceNames = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mJavascriptInterfaceSitePatterns = r0
                return
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(java.util.function.BiConsumer<java.lang.Integer, java.lang.Object> r1) {
                r0 = this;
                java.util.function.BiConsumer r1 = (java.util.function.BiConsumer) r1
                r0.accept2(r1)
                return
        }

        /* JADX INFO: renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.util.function.BiConsumer<java.lang.Integer, java.lang.Object> r5) {
                r4 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r1 = r4.baseline
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.accept(r0, r1)
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.util.List<java.lang.Object> r1 = r4.mJavascriptInterfaceObjects
                java.util.List<java.lang.String> r2 = r4.mJavascriptInterfaceNames
                java.util.List<java.util.List<java.lang.String>> r3 = r4.mJavascriptInterfaceSitePatterns
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                r5.accept(r0, r1)
                return
        }

        public void addJavascriptInterface(java.lang.Object r2, java.lang.String r3, java.util.List<java.lang.String> r4) {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mJavascriptInterfaceObjects
                r0.add(r2)
                java.util.List<java.lang.String> r0 = r1.mJavascriptInterfaceNames
                r0.add(r3)
                java.util.List<java.util.List<java.lang.String>> r0 = r1.mJavascriptInterfaceSitePatterns
                r0.add(r4)
                return
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    android.webkit.WebView build(android.content.Context r1, java.util.function.Consumer<java.util.function.BiConsumer<java.lang.Integer, java.lang.Object>> r2);
}
