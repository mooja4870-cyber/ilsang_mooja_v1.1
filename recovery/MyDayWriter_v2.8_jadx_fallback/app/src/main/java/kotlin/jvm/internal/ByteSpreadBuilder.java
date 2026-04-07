package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/ByteSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "size", "", "(I)V", "values", "add", "", "value", "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ByteSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<byte[]> {
    private final byte[] values;

    public ByteSpreadBuilder(int r2) {
            r1 = this;
            r1.<init>(r2)
            byte[] r0 = new byte[r2]
            r1.values = r0
            return
    }

    public final void add(byte r4) {
            r3 = this;
            byte[] r0 = r3.values
            int r1 = r3.getPosition()
            int r2 = r1 + 1
            r3.setPosition(r2)
            r0[r1] = r4
            return
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public /* bridge */ /* synthetic */ int getSize(byte[] r2) {
            r1 = this;
            r0 = r2
            byte[] r0 = (byte[]) r0
            int r0 = r1.getSize2(r0)
            return r0
    }

    /* JADX INFO: renamed from: getSize, reason: avoid collision after fix types in other method */
    protected int getSize2(byte[] r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            return r0
    }

    public final byte[] toArray() {
            r2 = this;
            byte[] r0 = r2.values
            int r1 = r2.size()
            byte[] r1 = new byte[r1]
            java.lang.Object r0 = r2.toArray(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }
}
