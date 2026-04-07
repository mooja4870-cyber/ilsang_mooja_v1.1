package androidx.core.view.autofill;

/* JADX INFO: loaded from: classes.dex */
public class AutofillIdCompat {
    private final java.lang.Object mWrappedObj;

    private AutofillIdCompat(android.view.autofill.AutofillId r1) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            return
    }

    public static androidx.core.view.autofill.AutofillIdCompat toAutofillIdCompat(android.view.autofill.AutofillId r1) {
            androidx.core.view.autofill.AutofillIdCompat r0 = new androidx.core.view.autofill.AutofillIdCompat
            r0.<init>(r1)
            return r0
    }

    public android.view.autofill.AutofillId toAutofillId() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.autofill.AutofillId r0 = (android.view.autofill.AutofillId) r0
            return r0
    }
}
