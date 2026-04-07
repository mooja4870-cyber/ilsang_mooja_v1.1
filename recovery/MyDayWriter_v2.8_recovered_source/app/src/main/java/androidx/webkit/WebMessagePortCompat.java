package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebMessagePortCompat {

    public static abstract class WebMessageCallbackCompat {
        public WebMessageCallbackCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onMessage(androidx.webkit.WebMessagePortCompat r1, androidx.webkit.WebMessageCompat r2) {
                r0 = this;
                return
        }
    }

    public WebMessagePortCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void close();

    public abstract android.webkit.WebMessagePort getFrameworkPort();

    public abstract java.lang.reflect.InvocationHandler getInvocationHandler();

    public abstract void postMessage(androidx.webkit.WebMessageCompat r1);

    public abstract void setWebMessageCallback(android.os.Handler r1, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r2);

    public abstract void setWebMessageCallback(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r1);
}
