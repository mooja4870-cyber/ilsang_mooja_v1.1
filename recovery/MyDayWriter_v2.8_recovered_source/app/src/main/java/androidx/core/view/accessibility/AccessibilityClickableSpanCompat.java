package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityClickableSpanCompat extends android.text.style.ClickableSpan {
    public static final java.lang.String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int mClickableSpanActionId;
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat mNodeInfoCompat;
    private final int mOriginalClickableSpanId;

    public AccessibilityClickableSpanCompat(int r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mOriginalClickableSpanId = r1
            r0.mNodeInfoCompat = r2
            r0.mClickableSpanActionId = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View r4) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r2 = r3.mOriginalClickableSpanId
            r0.putInt(r1, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r3.mNodeInfoCompat
            int r2 = r3.mClickableSpanActionId
            r1.performAction(r2, r0)
            return
    }
}
