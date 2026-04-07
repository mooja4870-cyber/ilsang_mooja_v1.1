package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class GrammaticalInflectionManagerCompat {
    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = 0;

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getApplicationGrammaticalGender(android.content.Context r1) {
                android.app.GrammaticalInflectionManager r0 = getGrammaticalInflectionManager(r1)
                int r0 = r0.getApplicationGrammaticalGender()
                return r0
        }

        private static android.app.GrammaticalInflectionManager getGrammaticalInflectionManager(android.content.Context r1) {
                java.lang.Class<android.app.GrammaticalInflectionManager> r0 = android.app.GrammaticalInflectionManager.class
                java.lang.Object r0 = r1.getSystemService(r0)
                android.app.GrammaticalInflectionManager r0 = (android.app.GrammaticalInflectionManager) r0
                return r0
        }

        static void setRequestedApplicationGrammaticalGender(android.content.Context r1, int r2) {
                android.app.GrammaticalInflectionManager r0 = getGrammaticalInflectionManager(r1)
                r0.setRequestedApplicationGrammaticalGender(r2)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }

    private GrammaticalInflectionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getApplicationGrammaticalGender(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r0 = androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.getApplicationGrammaticalGender(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void setRequestedApplicationGrammaticalGender(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.setRequestedApplicationGrammaticalGender(r2, r3)
        L9:
            return
    }
}
