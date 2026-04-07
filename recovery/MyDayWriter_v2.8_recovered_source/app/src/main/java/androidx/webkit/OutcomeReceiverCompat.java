package androidx.webkit;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes.dex */
public interface OutcomeReceiverCompat<T, E extends java.lang.Throwable> {
    default void onError(E r1) {
            r0 = this;
            return
    }

    void onResult(T r1);
}
