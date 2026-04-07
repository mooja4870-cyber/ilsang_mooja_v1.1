package androidx.core.view.contentcapture;

/* JADX INFO: loaded from: classes.dex */
public class ContentCaptureSessionCompat {
    private static final java.lang.String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final java.lang.String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final android.view.View mView;
    private final java.lang.Object mWrappedObj;

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.Bundle getExtras(android.view.ViewStructure r1) {
                android.os.Bundle r0 = r1.getExtras()
                return r0
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.autofill.AutofillId newAutofillId(android.view.contentcapture.ContentCaptureSession r1, android.view.autofill.AutofillId r2, long r3) {
                android.view.autofill.AutofillId r0 = r1.newAutofillId(r2, r3)
                return r0
        }

        static android.view.ViewStructure newViewStructure(android.view.contentcapture.ContentCaptureSession r1, android.view.View r2) {
                android.view.ViewStructure r0 = r1.newViewStructure(r2)
                return r0
        }

        static android.view.ViewStructure newVirtualViewStructure(android.view.contentcapture.ContentCaptureSession r1, android.view.autofill.AutofillId r2, long r3) {
                android.view.ViewStructure r0 = r1.newVirtualViewStructure(r2, r3)
                return r0
        }

        static void notifyViewAppeared(android.view.contentcapture.ContentCaptureSession r0, android.view.ViewStructure r1) {
                r0.notifyViewAppeared(r1)
                return
        }

        public static void notifyViewTextChanged(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, java.lang.CharSequence r2) {
                r0.notifyViewTextChanged(r1, r2)
                return
        }

        static void notifyViewsDisappeared(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long[] r2) {
                r0.notifyViewsDisappeared(r1, r2)
                return
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void notifyViewsAppeared(android.view.contentcapture.ContentCaptureSession r0, java.util.List<android.view.ViewStructure> r1) {
                r0.notifyViewsAppeared(r1)
                return
        }
    }

    private ContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession r1, android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            r0.mView = r2
            return
    }

    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat toContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession r1, android.view.View r2) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat r0 = new androidx.core.view.contentcapture.ContentCaptureSessionCompat
            r0.<init>(r1, r2)
            return r0
    }

    public android.view.autofill.AutofillId newAutofillId(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1f
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            android.view.View r1 = r2.mView
            androidx.core.view.autofill.AutofillIdCompat r1 = androidx.core.view.ViewCompat.getAutofillId(r1)
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            androidx.core.view.autofill.AutofillIdCompat r1 = (androidx.core.view.autofill.AutofillIdCompat) r1
            android.view.autofill.AutofillId r1 = r1.toAutofillId()
            android.view.autofill.AutofillId r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newAutofillId(r0, r1, r3)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public androidx.core.view.ViewStructureCompat newVirtualViewStructure(android.view.autofill.AutofillId r3, long r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            android.view.ViewStructure r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newVirtualViewStructure(r0, r3, r4)
            androidx.core.view.ViewStructureCompat r0 = androidx.core.view.ViewStructureCompat.toViewStructureCompat(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public void notifyViewTextChanged(android.view.autofill.AutofillId r3, java.lang.CharSequence r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            java.lang.Object r0 = r2.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewTextChanged(r0, r3, r4)
        Ld:
            return
    }

    public void notifyViewsAppeared(java.util.List<android.view.ViewStructure> r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            java.lang.Object r0 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api34Impl.notifyViewsAppeared(r0, r6)
            goto L60
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L60
            java.lang.Object r0 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            android.view.View r1 = r5.mView
            android.view.ViewStructure r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r0, r1)
            android.os.Bundle r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r1, r0)
            r1 = 0
        L30:
            int r2 = r6.size()
            if (r1 >= r2) goto L46
            java.lang.Object r2 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r2 = (android.view.contentcapture.ContentCaptureSession) r2
            java.lang.Object r4 = r6.get(r1)
            android.view.ViewStructure r4 = (android.view.ViewStructure) r4
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r2, r4)
            int r1 = r1 + 1
            goto L30
        L46:
            java.lang.Object r1 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            android.view.View r2 = r5.mView
            android.view.ViewStructure r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r1, r2)
            android.os.Bundle r2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r1)
            java.lang.String r4 = "TREAT_AS_VIEW_TREE_APPEARED"
            r2.putBoolean(r4, r3)
            java.lang.Object r2 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r2 = (android.view.contentcapture.ContentCaptureSession) r2
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r2, r1)
        L60:
            return
    }

    public void notifyViewsDisappeared(long[] r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1e
            java.lang.Object r0 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            android.view.View r1 = r5.mView
            androidx.core.view.autofill.AutofillIdCompat r1 = androidx.core.view.ViewCompat.getAutofillId(r1)
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            androidx.core.view.autofill.AutofillIdCompat r1 = (androidx.core.view.autofill.AutofillIdCompat) r1
            android.view.autofill.AutofillId r1 = r1.toAutofillId()
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared(r0, r1, r6)
            goto L70
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L70
            java.lang.Object r0 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            android.view.View r1 = r5.mView
            android.view.ViewStructure r0 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r0, r1)
            android.os.Bundle r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r1, r0)
            java.lang.Object r1 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            android.view.View r2 = r5.mView
            androidx.core.view.autofill.AutofillIdCompat r2 = androidx.core.view.ViewCompat.getAutofillId(r2)
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            androidx.core.view.autofill.AutofillIdCompat r2 = (androidx.core.view.autofill.AutofillIdCompat) r2
            android.view.autofill.AutofillId r2 = r2.toAutofillId()
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared(r1, r2, r6)
            java.lang.Object r1 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            android.view.View r2 = r5.mView
            android.view.ViewStructure r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure(r1, r2)
            android.os.Bundle r2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(r1)
            java.lang.String r4 = "TREAT_AS_VIEW_TREE_APPEARED"
            r2.putBoolean(r4, r3)
            java.lang.Object r2 = r5.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r2 = (android.view.contentcapture.ContentCaptureSession) r2
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared(r2, r1)
        L70:
            return
    }

    public android.view.contentcapture.ContentCaptureSession toContentCaptureSession() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.contentcapture.ContentCaptureSession r0 = (android.view.contentcapture.ContentCaptureSession) r0
            return r0
    }
}
