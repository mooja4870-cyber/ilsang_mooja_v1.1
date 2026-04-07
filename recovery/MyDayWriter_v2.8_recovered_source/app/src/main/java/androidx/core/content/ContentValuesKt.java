package androidx.core.content;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContentValuesKt {
    public static final android.content.ContentValues contentValuesOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r8) {
            android.content.ContentValues r0 = new android.content.ContentValues
            int r1 = r8.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            int r3 = r8.length
            r4 = 0
        La:
            if (r4 >= r3) goto Lb5
            r5 = r8[r4]
            java.lang.Object r6 = r5.component1()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.component2()
            if (r5 != 0) goto L1f
            r1.putNull(r6)
            goto L81
        L1f:
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L2a
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r1.put(r6, r7)
            goto L81
        L2a:
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L35
            r7 = r5
            java.lang.Integer r7 = (java.lang.Integer) r7
            r1.put(r6, r7)
            goto L81
        L35:
            boolean r7 = r5 instanceof java.lang.Long
            if (r7 == 0) goto L40
            r7 = r5
            java.lang.Long r7 = (java.lang.Long) r7
            r1.put(r6, r7)
            goto L81
        L40:
            boolean r7 = r5 instanceof java.lang.Boolean
            if (r7 == 0) goto L4b
            r7 = r5
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r1.put(r6, r7)
            goto L81
        L4b:
            boolean r7 = r5 instanceof java.lang.Float
            if (r7 == 0) goto L56
            r7 = r5
            java.lang.Float r7 = (java.lang.Float) r7
            r1.put(r6, r7)
            goto L81
        L56:
            boolean r7 = r5 instanceof java.lang.Double
            if (r7 == 0) goto L61
            r7 = r5
            java.lang.Double r7 = (java.lang.Double) r7
            r1.put(r6, r7)
            goto L81
        L61:
            boolean r7 = r5 instanceof byte[]
            if (r7 == 0) goto L6c
            r7 = r5
            byte[] r7 = (byte[]) r7
            r1.put(r6, r7)
            goto L81
        L6c:
            boolean r7 = r5 instanceof java.lang.Byte
            if (r7 == 0) goto L77
            r7 = r5
            java.lang.Byte r7 = (java.lang.Byte) r7
            r1.put(r6, r7)
            goto L81
        L77:
            boolean r7 = r5 instanceof java.lang.Short
            if (r7 == 0) goto L84
            r7 = r5
            java.lang.Short r7 = (java.lang.Short) r7
            r1.put(r6, r7)
        L81:
            int r4 = r4 + 1
            goto La
        L84:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Illegal value type "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r7 = " for key \""
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r6)
            r7 = 34
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        Lb5:
            return r0
    }
}
