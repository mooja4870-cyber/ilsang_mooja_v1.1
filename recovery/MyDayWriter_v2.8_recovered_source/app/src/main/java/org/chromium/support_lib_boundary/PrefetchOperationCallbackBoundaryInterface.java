package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface PrefetchOperationCallbackBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int r1, java.lang.String r2, int r3);

    void onSuccess();
}
