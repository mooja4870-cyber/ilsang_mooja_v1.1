package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessedRoute {
    private boolean ignoreAssetPath;
    private boolean isAsset;
    private java.lang.String path;

    public ProcessedRoute() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public boolean isAsset() {
            r1 = this;
            boolean r0 = r1.isAsset
            return r0
    }

    public boolean isIgnoreAssetPath() {
            r1 = this;
            boolean r0 = r1.ignoreAssetPath
            return r0
    }

    public void setAsset(boolean r1) {
            r0 = this;
            r0.isAsset = r1
            return
    }

    public void setIgnoreAssetPath(boolean r1) {
            r0 = this;
            r0.ignoreAssetPath = r1
            return
    }

    public void setPath(java.lang.String r1) {
            r0 = this;
            r0.path = r1
            return
    }
}
