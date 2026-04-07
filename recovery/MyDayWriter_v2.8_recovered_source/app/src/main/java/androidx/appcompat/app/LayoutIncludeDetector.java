package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class LayoutIncludeDetector {
    private final java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> mXmlParserStack;

    LayoutIncludeDetector() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mXmlParserStack = r0
            return
    }

    private static boolean isParserOutdated(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
            if (r3 == 0) goto L15
            int r1 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L13
            r2 = 3
            if (r1 == r2) goto L15
            int r1 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L13
            if (r1 != r0) goto L11
            goto L15
        L11:
            r0 = 0
            goto L16
        L13:
            r1 = move-exception
            return r0
        L15:
        L16:
            return r0
    }

    private static org.xmlpull.v1.XmlPullParser popOutdatedAttrHolders(java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r2) {
        L1:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r2.peek()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            boolean r1 = isParserOutdated(r0)
            if (r1 == 0) goto L1d
            r2.pop()
            goto L1
        L1d:
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private static boolean shouldInheritContext(org.xmlpull.v1.XmlPullParser r2, org.xmlpull.v1.XmlPullParser r3) {
            if (r3 == 0) goto L18
            if (r2 == r3) goto L18
            int r0 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L17
            r1 = 2
            if (r0 != r1) goto L16
            java.lang.String r0 = "include"
            java.lang.String r1 = r3.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> L17
            boolean r0 = r0.equals(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> L17
            return r0
        L16:
            goto L18
        L17:
            r0 = move-exception
        L18:
            r0 = 0
            return r0
    }

    boolean detect(android.util.AttributeSet r6) {
            r5 = this;
            boolean r0 = r6 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L25
            r0 = r6
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r1 = r0.getDepth()
            r2 = 1
            if (r1 != r2) goto L25
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r5.mXmlParserStack
            org.xmlpull.v1.XmlPullParser r1 = popOutdatedAttrHolders(r1)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r5.mXmlParserStack
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.push(r4)
            boolean r3 = shouldInheritContext(r0, r1)
            if (r3 == 0) goto L25
            return r2
        L25:
            r0 = 0
            return r0
    }
}
