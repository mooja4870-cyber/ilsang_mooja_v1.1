package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebResourceErrorCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    public WebResourceErrorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.CharSequence getDescription();

    public abstract int getErrorCode();
}
