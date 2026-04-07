package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-7apg3OU", "(B)Z", "get", "index", "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "isEmpty", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$3 extends kotlin.collections.AbstractList<kotlin.UByte> implements java.util.RandomAccess {
    final /* synthetic */ byte[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$3(byte[] r1) {
            r0 = this;
            r0.$this_asList = r1
            r0.<init>()
            return
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UByte
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m221unboximpl()
            boolean r0 = r1.m669contains7apg3OU(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m669contains7apg3OU(byte r2) {
            r1 = this;
            byte[] r0 = r1.$this_asList
            boolean r0 = kotlin.UByteArray.m225contains7apg3OU(r0, r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            byte r0 = r1.m670getw2LRezQ(r2)
            kotlin.UByte r0 = kotlin.UByte.m165boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m670getw2LRezQ(int r2) {
            r1 = this;
            byte[] r0 = r1.$this_asList
            byte r0 = kotlin.UByteArray.m229getw2LRezQ(r0, r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            byte[] r0 = r1.$this_asList
            int r0 = kotlin.UByteArray.m230getSizeimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UByte
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m221unboximpl()
            int r0 = r1.m671indexOf7apg3OU(r0)
            return r0
    }

    /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m671indexOf7apg3OU(byte r2) {
            r1 = this;
            byte[] r0 = r1.$this_asList
            int r0 = kotlin.collections.ArraysKt.indexOf(r0, r2)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            byte[] r0 = r1.$this_asList
            boolean r0 = kotlin.UByteArray.m232isEmptyimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UByte
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m221unboximpl()
            int r0 = r1.m672lastIndexOf7apg3OU(r0)
            return r0
    }

    /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m672lastIndexOf7apg3OU(byte r2) {
            r1 = this;
            byte[] r0 = r1.$this_asList
            int r0 = kotlin.collections.ArraysKt.lastIndexOf(r0, r2)
            return r0
    }
}
