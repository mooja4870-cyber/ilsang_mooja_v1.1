package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.util.Predicate<android.net.Uri> asPredicate(android.content.UriMatcher r1) {
            androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$asPredicate$0(android.content.UriMatcher r2, android.net.Uri r3) {
            int r0 = r2.match(r3)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
