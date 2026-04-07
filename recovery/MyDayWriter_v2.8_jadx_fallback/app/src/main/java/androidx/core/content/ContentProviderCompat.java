package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class ContentProviderCompat {
    private ContentProviderCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context requireContext(android.content.ContentProvider r3) {
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot find context from the provider."
            r1.<init>(r2)
            throw r1
    }
}
