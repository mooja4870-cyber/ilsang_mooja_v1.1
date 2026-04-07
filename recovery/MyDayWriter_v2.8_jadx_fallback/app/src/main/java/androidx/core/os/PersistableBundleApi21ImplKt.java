package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "<init>", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PersistableBundleApi21ImplKt {
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi21ImplKt r0 = new androidx.core.os.PersistableBundleApi21ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi21ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.PersistableBundle createPersistableBundle(int r1) {
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void putValue(android.os.PersistableBundle r9, java.lang.String r10, java.lang.Object r11) {
            r0 = r9
            r1 = 0
            if (r11 != 0) goto Lb
            r2 = 0
            r0.putString(r10, r2)
            goto Lb6
        Lb:
            boolean r2 = r11 instanceof java.lang.Boolean
            if (r2 == 0) goto L1c
        L10:
            r2 = r11
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            androidx.core.os.PersistableBundleApi22ImplKt.putBoolean(r0, r10, r2)
            goto Lb6
        L1c:
            boolean r2 = r11 instanceof java.lang.Double
            if (r2 == 0) goto L2c
            r2 = r11
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r0.putDouble(r10, r2)
            goto Lb6
        L2c:
            boolean r2 = r11 instanceof java.lang.Integer
            if (r2 == 0) goto L3c
            r2 = r11
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.putInt(r10, r2)
            goto Lb6
        L3c:
            boolean r2 = r11 instanceof java.lang.Long
            if (r2 == 0) goto L4c
            r2 = r11
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r0.putLong(r10, r2)
            goto Lb6
        L4c:
            boolean r2 = r11 instanceof java.lang.String
            if (r2 == 0) goto L57
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            r0.putString(r10, r2)
            goto Lb6
        L57:
            boolean r2 = r11 instanceof android.os.PersistableBundle
            if (r2 == 0) goto L62
            r2 = r11
            android.os.PersistableBundle r2 = (android.os.PersistableBundle) r2
            r0.putPersistableBundle(r10, r2)
            goto Lb6
        L62:
            boolean r2 = r11 instanceof boolean[]
            if (r2 == 0) goto L6e
        L67:
            r2 = r11
            boolean[] r2 = (boolean[]) r2
            androidx.core.os.PersistableBundleApi22ImplKt.putBooleanArray(r0, r10, r2)
            goto Lb6
        L6e:
            boolean r2 = r11 instanceof double[]
            if (r2 == 0) goto L79
            r2 = r11
            double[] r2 = (double[]) r2
            r0.putDoubleArray(r10, r2)
            goto Lb6
        L79:
            boolean r2 = r11 instanceof int[]
            if (r2 == 0) goto L84
            r2 = r11
            int[] r2 = (int[]) r2
            r0.putIntArray(r10, r2)
            goto Lb6
        L84:
            boolean r2 = r11 instanceof long[]
            if (r2 == 0) goto L8f
            r2 = r11
            long[] r2 = (long[]) r2
            r0.putLongArray(r10, r2)
            goto Lb6
        L8f:
            boolean r2 = r11 instanceof java.lang.Object[]
            r3 = 34
            java.lang.String r4 = " for key \""
            if (r2 == 0) goto Le2
            java.lang.Class r2 = r11.getClass()
            java.lang.Class r2 = r2.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = r5.isAssignableFrom(r2)
            if (r5 == 0) goto Lb9
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11, r3)
            r3 = r11
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.putStringArray(r10, r3)
        Lb6:
            return
        Lb9:
            java.lang.String r5 = r2.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unsupported value array type "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r6.<init>(r3)
            throw r6
        Le2:
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unsupported value type "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }
}
