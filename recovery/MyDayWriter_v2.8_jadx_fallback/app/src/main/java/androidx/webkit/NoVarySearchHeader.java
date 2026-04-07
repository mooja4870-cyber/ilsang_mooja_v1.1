package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class NoVarySearchHeader {
    public final java.util.List<java.lang.String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final java.util.List<java.lang.String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean r1, boolean r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            r0 = this;
            r0.<init>()
            r0.varyOnKeyOrder = r1
            r0.ignoreDifferencesInParameters = r2
            r0.ignoredQueryParameters = r3
            r0.consideredQueryParameters = r4
            return
    }

    public static androidx.webkit.NoVarySearchHeader alwaysVaryHeader() {
            androidx.webkit.NoVarySearchHeader r0 = new androidx.webkit.NoVarySearchHeader
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static androidx.webkit.NoVarySearchHeader neverVaryExcept(boolean r3, java.util.List<java.lang.String> r4) {
            androidx.webkit.NoVarySearchHeader r0 = new androidx.webkit.NoVarySearchHeader
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    public static androidx.webkit.NoVarySearchHeader neverVaryHeader() {
            androidx.webkit.NoVarySearchHeader r0 = new androidx.webkit.NoVarySearchHeader
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 1
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static androidx.webkit.NoVarySearchHeader varyExcept(boolean r3, java.util.List<java.lang.String> r4) {
            androidx.webkit.NoVarySearchHeader r0 = new androidx.webkit.NoVarySearchHeader
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r0.<init>(r3, r2, r4, r1)
            return r0
    }
}
