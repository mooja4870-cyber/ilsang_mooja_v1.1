package androidx.core.graphics;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0086\b\u001a\u001a\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u001a\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"times", "Landroid/graphics/Matrix;", "m", "values", "", "translationMatrix", "tx", "", "ty", "scaleMatrix", "sx", "sy", "rotationMatrix", "degrees", "px", "py", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MatrixKt {
    public static final android.graphics.Matrix rotationMatrix(float r3, float r4, float r5) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = r0
            r2 = 0
            r1.setRotate(r3, r4, r5)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix rotationMatrix$default(float r1, float r2, float r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            android.graphics.Matrix r1 = rotationMatrix(r1, r2, r3)
            return r1
    }

    public static final android.graphics.Matrix scaleMatrix(float r3, float r4) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = r0
            r2 = 0
            r1.setScale(r3, r4)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix scaleMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L7
            r1 = r0
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = r0
        Lc:
            android.graphics.Matrix r1 = scaleMatrix(r1, r2)
            return r1
    }

    public static final android.graphics.Matrix times(android.graphics.Matrix r4, android.graphics.Matrix r5) {
            r0 = 0
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.preConcat(r5)
            return r1
    }

    public static final android.graphics.Matrix translationMatrix(float r3, float r4) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1 = r0
            r2 = 0
            r1.setTranslate(r3, r4)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix translationMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            android.graphics.Matrix r1 = translationMatrix(r1, r2)
            return r1
    }

    public static final float[] values(android.graphics.Matrix r4) {
            r0 = 0
            r1 = 9
            float[] r1 = new float[r1]
            r2 = r1
            r3 = 0
            r4.getValues(r2)
            return r1
    }
}
