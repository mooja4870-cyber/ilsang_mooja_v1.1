package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = null;
    private final android.view.View.AccessibilityDelegate mBridge;
    private final android.view.View.AccessibilityDelegate mOriginalDelegate;

    static final class AccessibilityDelegateAdapter extends android.view.View.AccessibilityDelegate {
        final androidx.core.view.AccessibilityDelegateCompat mCompat;

        AccessibilityDelegateAdapter(androidx.core.view.AccessibilityDelegateCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mCompat = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r0 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r3) {
                r2 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r2.mCompat
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r0.getAccessibilityNodeProvider(r3)
                if (r0 == 0) goto Lf
                java.lang.Object r1 = r0.getProvider()
                android.view.accessibility.AccessibilityNodeProvider r1 = (android.view.accessibility.AccessibilityNodeProvider) r1
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.onInitializeAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r5, android.view.accessibility.AccessibilityNodeInfo r6) {
                r4 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r6)
                boolean r1 = androidx.core.view.ViewCompat.isScreenReaderFocusable(r5)
                r0.setScreenReaderFocusable(r1)
                boolean r1 = androidx.core.view.ViewCompat.isAccessibilityHeading(r5)
                r0.setHeading(r1)
                java.lang.CharSequence r1 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r5)
                r0.setPaneTitle(r1)
                java.lang.CharSequence r1 = androidx.core.view.ViewCompat.getStateDescription(r5)
                r0.setStateDescription(r1)
                androidx.core.view.AccessibilityDelegateCompat r1 = r4.mCompat
                r1.onInitializeAccessibilityNodeInfo(r5, r0)
                java.lang.CharSequence r1 = r6.getText()
                r0.addSpansToExtras(r1, r5)
                java.util.List r1 = androidx.core.view.AccessibilityDelegateCompat.getActionList(r5)
                r2 = 0
            L31:
                int r3 = r1.size()
                if (r2 >= r3) goto L43
                java.lang.Object r3 = r1.get(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
                r0.addAction(r3)
                int r2 = r2 + 1
                goto L31
            L43:
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.onPopulateAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r0 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r0 = r0.performAccessibilityAction(r2, r3, r4)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.sendAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.sendAccessibilityEventUnchecked(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            androidx.core.view.AccessibilityDelegateCompat.DEFAULT_DELEGATE = r0
            return
    }

    public AccessibilityDelegateCompat() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = androidx.core.view.AccessibilityDelegateCompat.DEFAULT_DELEGATE
            r1.<init>(r0)
            return
    }

    public AccessibilityDelegateCompat(android.view.View.AccessibilityDelegate r2) {
            r1 = this;
            r1.<init>()
            r1.mOriginalDelegate = r2
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r0 = new androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter
            r0.<init>(r1)
            r1.mBridge = r0
            return
    }

    static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r2) {
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r0 = r2.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r1 = java.util.Collections.emptyList()
            goto L10
        Lf:
            r1 = r0
        L10:
            return r1
    }

    private boolean isSpanStillValid(android.text.style.ClickableSpan r5, android.view.View r6) {
            r4 = this;
            if (r5 == 0) goto L21
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            java.lang.CharSequence r1 = r0.getText()
            android.text.style.ClickableSpan[] r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getClickableSpans(r1)
            r2 = 0
        Lf:
            if (r1 == 0) goto L21
            int r3 = r1.length
            if (r2 >= r3) goto L21
            r3 = r1[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            int r2 = r2 + 1
            goto Lf
        L21:
            r0 = 0
            return r0
    }

    private boolean performClickableSpanAction(int r5, android.view.View r6) {
            r4 = this;
            int r0 = androidx.core.R.id.tag_accessibility_clickable_spans
            java.lang.Object r0 = r6.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L23
            java.lang.Object r1 = r0.get(r5)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L23
            java.lang.Object r2 = r1.get()
            android.text.style.ClickableSpan r2 = (android.text.style.ClickableSpan) r2
            boolean r3 = r4.isSpanStillValid(r2, r6)
            if (r3 == 0) goto L23
            r2.onClick(r6)
            r3 = 1
            return r3
        L23:
            r1 = 0
            return r1
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r3) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider(r3)
            if (r0 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r1.<init>(r0)
            return r1
        Le:
            r1 = 0
            return r1
    }

    android.view.View.AccessibilityDelegate getBridge() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mBridge
            return r0
    }

    public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.unwrap()
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            return
    }

    public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r0 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r0
    }

    public boolean performAccessibilityAction(android.view.View r6, int r7, android.os.Bundle r8) {
            r5 = this;
            r0 = 0
            java.util.List r1 = getActionList(r6)
            r2 = 0
        L6:
            int r3 = r1.size()
            if (r2 >= r3) goto L20
            java.lang.Object r3 = r1.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r4 = r3.getId()
            if (r4 != r7) goto L1d
            boolean r0 = r3.perform(r6, r8)
            goto L20
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            if (r0 != 0) goto L28
            android.view.View$AccessibilityDelegate r2 = r5.mOriginalDelegate
            boolean r0 = r2.performAccessibilityAction(r6, r7, r8)
        L28:
            if (r0 != 0) goto L3c
            int r2 = androidx.core.R.id.accessibility_action_clickable_span
            if (r7 != r2) goto L3c
            if (r8 == 0) goto L3c
        L31:
            java.lang.String r2 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r3 = -1
            int r2 = r8.getInt(r2, r3)
            boolean r0 = r5.performClickableSpanAction(r2, r6)
        L3c:
            return r0
    }

    public void sendAccessibilityEvent(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
