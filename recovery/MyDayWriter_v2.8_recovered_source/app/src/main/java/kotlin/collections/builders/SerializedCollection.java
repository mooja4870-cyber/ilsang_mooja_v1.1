package kotlin.collections.builders;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "()V", "collection", "", "tag", "", "(Ljava/util/Collection;I)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SerializedCollection implements java.io.Externalizable {
    public static final kotlin.collections.builders.SerializedCollection.Companion Companion = null;
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private java.util.Collection<?> collection;
    private final int tag;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "()V", "serialVersionUID", "", "tagList", "", "tagSet", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.collections.builders.SerializedCollection$Companion r0 = new kotlin.collections.builders.SerializedCollection$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SerializedCollection.Companion = r0
            return
    }

    public SerializedCollection() {
            r2 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public SerializedCollection(java.util.Collection<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.collection = r2
            r1.tag = r3
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Collection<?> r0 = r1.collection
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(java.io.ObjectInput r12) {
            r11 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            byte r0 = r12.readByte()
            r1 = r0 & 1
            r2 = r0 & (-2)
            r3 = 46
            if (r2 != 0) goto L91
            int r4 = r12.readInt()
            if (r4 < 0) goto L74
            r5 = 0
            switch(r1) {
                case 0: goto L55;
                case 1: goto L38;
                default: goto L1b;
            }
        L1b:
            java.io.InvalidObjectException r5 = new java.io.InvalidObjectException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unsupported collection type tag: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
        L38:
            java.util.Set r3 = kotlin.collections.SetsKt.createSetBuilder(r4)
            r6 = r3
            r7 = 0
        L3f:
            if (r5 >= r4) goto L4d
            r8 = r5
            r9 = 0
            java.lang.Object r10 = r12.readObject()
            r6.add(r10)
            int r5 = r5 + 1
            goto L3f
        L4d:
            java.util.Set r3 = kotlin.collections.SetsKt.build(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            goto L71
        L55:
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder(r4)
            r6 = r3
            r7 = 0
        L5c:
            if (r5 >= r4) goto L6a
            r8 = r5
            r9 = 0
            java.lang.Object r10 = r12.readObject()
            r6.add(r10)
            int r5 = r5 + 1
            goto L5c
        L6a:
            java.util.List r3 = kotlin.collections.CollectionsKt.build(r3)
            java.util.Collection r3 = (java.util.Collection) r3
        L71:
            r11.collection = r3
            return
        L74:
            java.io.InvalidObjectException r5 = new java.io.InvalidObjectException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Illegal size value: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
        L91:
            java.io.InvalidObjectException r4 = new java.io.InvalidObjectException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unsupported flags value: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // java.io.Externalizable
    public void writeExternal(java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.tag
            r3.writeByte(r0)
            java.util.Collection<?> r0 = r2.collection
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Collection<?> r0 = r2.collection
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto L19
        L27:
            return
    }
}
