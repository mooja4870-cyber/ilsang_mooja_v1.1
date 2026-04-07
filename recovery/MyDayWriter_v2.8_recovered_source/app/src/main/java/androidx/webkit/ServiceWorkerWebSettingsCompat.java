package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceWorkerWebSettingsCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }

    public ServiceWorkerWebSettingsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    public abstract java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    public abstract void setAllowContentAccess(boolean r1);

    public abstract void setAllowFileAccess(boolean r1);

    public abstract void setBlockNetworkLoads(boolean r1);

    public abstract void setCacheMode(int r1);

    public abstract void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r1);
}
