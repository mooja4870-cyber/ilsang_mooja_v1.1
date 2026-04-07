package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BundleKt {
    public static final android.os.Bundle bundleOf() {
            android.os.Bundle r0 = new android.os.Bundle
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static final android.os.Bundle bundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r11) {
            android.os.Bundle r0 = new android.os.Bundle
            int r1 = r11.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            int r3 = r11.length
            r4 = 0
        La:
            if (r4 >= r3) goto L20b
            r5 = r11[r4]
            java.lang.Object r6 = r5.component1()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.component2()
            if (r5 != 0) goto L21
            r7 = 0
            r1.putString(r6, r7)
            goto L1da
        L21:
            boolean r7 = r5 instanceof java.lang.Boolean
            if (r7 == 0) goto L31
            r7 = r5
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.putBoolean(r6, r7)
            goto L1da
        L31:
            boolean r7 = r5 instanceof java.lang.Byte
            if (r7 == 0) goto L41
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            byte r7 = r7.byteValue()
            r1.putByte(r6, r7)
            goto L1da
        L41:
            boolean r7 = r5 instanceof java.lang.Character
            if (r7 == 0) goto L51
            r7 = r5
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            r1.putChar(r6, r7)
            goto L1da
        L51:
            boolean r7 = r5 instanceof java.lang.Double
            if (r7 == 0) goto L61
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            double r7 = r7.doubleValue()
            r1.putDouble(r6, r7)
            goto L1da
        L61:
            boolean r7 = r5 instanceof java.lang.Float
            if (r7 == 0) goto L71
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r1.putFloat(r6, r7)
            goto L1da
        L71:
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L81
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.putInt(r6, r7)
            goto L1da
        L81:
            boolean r7 = r5 instanceof java.lang.Long
            if (r7 == 0) goto L91
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            r1.putLong(r6, r7)
            goto L1da
        L91:
            boolean r7 = r5 instanceof java.lang.Short
            if (r7 == 0) goto La1
            r7 = r5
            java.lang.Number r7 = (java.lang.Number) r7
            short r7 = r7.shortValue()
            r1.putShort(r6, r7)
            goto L1da
        La1:
            boolean r7 = r5 instanceof android.os.Bundle
            if (r7 == 0) goto Lad
            r7 = r5
            android.os.Bundle r7 = (android.os.Bundle) r7
            r1.putBundle(r6, r7)
            goto L1da
        Lad:
            boolean r7 = r5 instanceof java.lang.CharSequence
            if (r7 == 0) goto Lb9
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.putCharSequence(r6, r7)
            goto L1da
        Lb9:
            boolean r7 = r5 instanceof android.os.Parcelable
            if (r7 == 0) goto Lc5
            r7 = r5
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            r1.putParcelable(r6, r7)
            goto L1da
        Lc5:
            boolean r7 = r5 instanceof boolean[]
            if (r7 == 0) goto Ld1
            r7 = r5
            boolean[] r7 = (boolean[]) r7
            r1.putBooleanArray(r6, r7)
            goto L1da
        Ld1:
            boolean r7 = r5 instanceof byte[]
            if (r7 == 0) goto Ldd
            r7 = r5
            byte[] r7 = (byte[]) r7
            r1.putByteArray(r6, r7)
            goto L1da
        Ldd:
            boolean r7 = r5 instanceof char[]
            if (r7 == 0) goto Le9
            r7 = r5
            char[] r7 = (char[]) r7
            r1.putCharArray(r6, r7)
            goto L1da
        Le9:
            boolean r7 = r5 instanceof double[]
            if (r7 == 0) goto Lf5
            r7 = r5
            double[] r7 = (double[]) r7
            r1.putDoubleArray(r6, r7)
            goto L1da
        Lf5:
            boolean r7 = r5 instanceof float[]
            if (r7 == 0) goto L101
            r7 = r5
            float[] r7 = (float[]) r7
            r1.putFloatArray(r6, r7)
            goto L1da
        L101:
            boolean r7 = r5 instanceof int[]
            if (r7 == 0) goto L10d
            r7 = r5
            int[] r7 = (int[]) r7
            r1.putIntArray(r6, r7)
            goto L1da
        L10d:
            boolean r7 = r5 instanceof long[]
            if (r7 == 0) goto L119
            r7 = r5
            long[] r7 = (long[]) r7
            r1.putLongArray(r6, r7)
            goto L1da
        L119:
            boolean r7 = r5 instanceof short[]
            if (r7 == 0) goto L125
            r7 = r5
            short[] r7 = (short[]) r7
            r1.putShortArray(r6, r7)
            goto L1da
        L125:
            boolean r7 = r5 instanceof java.lang.Object[]
            r8 = 34
            java.lang.String r9 = " for key \""
            if (r7 == 0) goto L1af
            java.lang.Class r7 = r5.getClass()
            java.lang.Class r7 = r7.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.lang.Class<android.os.Parcelable> r10 = android.os.Parcelable.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L14e
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r8)
            r8 = r5
            android.os.Parcelable[] r8 = (android.os.Parcelable[]) r8
            r1.putParcelableArray(r6, r8)
            goto L1da
        L14e:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L163
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r8)
            r8 = r5
            java.lang.String[] r8 = (java.lang.String[]) r8
            r1.putStringArray(r6, r8)
            goto L1da
        L163:
            java.lang.Class<java.lang.CharSequence> r10 = java.lang.CharSequence.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L177
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r8)
            r8 = r5
            java.lang.CharSequence[] r8 = (java.lang.CharSequence[]) r8
            r1.putCharSequenceArray(r6, r8)
            goto L1da
        L177:
            java.lang.Class<java.io.Serializable> r10 = java.io.Serializable.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L186
            r8 = r5
            java.io.Serializable r8 = (java.io.Serializable) r8
            r1.putSerializable(r6, r8)
            goto L1da
        L186:
            java.lang.String r0 = r7.getCanonicalName()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "Illegal value array type "
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L1af:
            boolean r7 = r5 instanceof java.io.Serializable
            if (r7 == 0) goto L1ba
            r7 = r5
            java.io.Serializable r7 = (java.io.Serializable) r7
            r1.putSerializable(r6, r7)
            goto L1da
        L1ba:
            boolean r7 = r5 instanceof android.os.IBinder
            if (r7 == 0) goto L1c5
            r7 = r5
            android.os.IBinder r7 = (android.os.IBinder) r7
            r1.putBinder(r6, r7)
            goto L1da
        L1c5:
            boolean r7 = r5 instanceof android.util.Size
            if (r7 == 0) goto L1d0
            r7 = r5
            android.util.Size r7 = (android.util.Size) r7
            androidx.core.os.BundleApi21ImplKt.putSize(r1, r6, r7)
            goto L1da
        L1d0:
            boolean r7 = r5 instanceof android.util.SizeF
            if (r7 == 0) goto L1de
            r7 = r5
            android.util.SizeF r7 = (android.util.SizeF) r7
            androidx.core.os.BundleApi21ImplKt.putSizeF(r1, r6, r7)
        L1da:
            int r4 = r4 + 1
            goto La
        L1de:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Illegal value type "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L20b:
            return r0
    }
}
