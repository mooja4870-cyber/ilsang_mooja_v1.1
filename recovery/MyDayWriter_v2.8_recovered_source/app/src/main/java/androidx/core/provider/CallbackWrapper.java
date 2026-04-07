package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class CallbackWrapper {
    private final androidx.core.provider.FontsContractCompat.FontRequestCallback mCallback;
    private final java.util.concurrent.Executor mExecutor;



    CallbackWrapper(androidx.core.provider.FontsContractCompat.FontRequestCallback r2) {
            r1 = this;
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            java.util.concurrent.Executor r0 = androidx.core.provider.RequestExecutor.createHandlerExecutor(r0)
            r1.<init>(r2, r0)
            return
    }

    CallbackWrapper(androidx.core.provider.FontsContractCompat.FontRequestCallback r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            r0.mExecutor = r2
            return
    }

    private void onTypefaceRequestFailed(int r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            java.util.concurrent.Executor r1 = r3.mExecutor
            androidx.core.provider.CallbackWrapper$2 r2 = new androidx.core.provider.CallbackWrapper$2
            r2.<init>(r3, r0, r4)
            r1.execute(r2)
            return
    }

    private void onTypefaceRetrieved(android.graphics.Typeface r4) {
            r3 = this;
            androidx.core.provider.FontsContractCompat$FontRequestCallback r0 = r3.mCallback
            java.util.concurrent.Executor r1 = r3.mExecutor
            androidx.core.provider.CallbackWrapper$1 r2 = new androidx.core.provider.CallbackWrapper$1
            r2.<init>(r3, r0, r4)
            r1.execute(r2)
            return
    }

    void onTypefaceResult(androidx.core.provider.FontRequestWorker.TypefaceResult r2) {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto Lc
            android.graphics.Typeface r0 = r2.mTypeface
            r1.onTypefaceRetrieved(r0)
            goto L11
        Lc:
            int r0 = r2.mResult
            r1.onTypefaceRequestFailed(r0)
        L11:
            return
    }
}
