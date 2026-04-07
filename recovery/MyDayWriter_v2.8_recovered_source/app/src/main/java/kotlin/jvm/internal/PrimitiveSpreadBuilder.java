package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int r2) {
            r1 = this;
            r1.<init>()
            r1.size = r2
            int r0 = r1.size
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.spreads = r0
            return
    }

    private static /* synthetic */ void getSpreads$annotations() {
            return
    }

    public final void addSpread(T r4) {
            r3 = this;
            java.lang.String r0 = "spreadArgument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            T[] r0 = r3.spreads
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0[r1] = r4
            return
    }

    protected final int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    protected abstract int getSize(T r1);

    protected final void setPosition(int r1) {
            r0 = this;
            r0.position = r1
            return
    }

    protected final int size() {
            r5 = this;
            r0 = 0
            r1 = 0
            int r2 = r5.size
            r3 = 1
            int r2 = r2 - r3
            if (r1 > r2) goto L1a
        L8:
            T[] r4 = r5.spreads
            r4 = r4[r1]
            if (r4 == 0) goto L13
            int r4 = r5.getSize(r4)
            goto L14
        L13:
            r4 = r3
        L14:
            int r0 = r0 + r4
            if (r1 == r2) goto L1a
            int r1 = r1 + 1
            goto L8
        L1a:
            return r0
    }

    protected final T toArray(T r8, T r9) {
            r7 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
            r2 = 0
            int r3 = r7.size
            int r3 = r3 + (-1)
            if (r2 > r3) goto L33
        L13:
            T[] r4 = r7.spreads
            r4 = r4[r2]
            if (r4 == 0) goto L2e
            if (r1 >= r2) goto L23
            int r5 = r2 - r1
            java.lang.System.arraycopy(r8, r1, r9, r0, r5)
            int r5 = r2 - r1
            int r0 = r0 + r5
        L23:
            int r5 = r7.getSize(r4)
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r9, r0, r5)
            int r0 = r0 + r5
            int r1 = r2 + 1
        L2e:
            if (r2 == r3) goto L33
            int r2 = r2 + 1
            goto L13
        L33:
            int r2 = r7.size
            if (r1 >= r2) goto L3d
            int r2 = r7.size
            int r2 = r2 - r1
            java.lang.System.arraycopy(r8, r1, r9, r0, r2)
        L3d:
            return r9
    }
}
