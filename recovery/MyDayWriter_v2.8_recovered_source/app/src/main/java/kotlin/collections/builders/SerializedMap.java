package kotlin.collections.builders;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "()V", "map", "", "(Ljava/util/Map;)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SerializedMap implements java.io.Externalizable {
    public static final kotlin.collections.builders.SerializedMap.Companion Companion = null;
    private static final long serialVersionUID = 0;
    private java.util.Map<?, ?> map;

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            kotlin.collections.builders.SerializedMap$Companion r0 = new kotlin.collections.builders.SerializedMap$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SerializedMap.Companion = r0
            return
    }

    public SerializedMap() {
            r1 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r1.<init>(r0)
            return
    }

    public SerializedMap(java.util.Map<?, ?> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.map = r2
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Map<?, ?> r0 = r1.map
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(java.io.ObjectInput r11) {
            r10 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            byte r0 = r11.readByte()
            if (r0 != 0) goto L52
            int r1 = r11.readInt()
            if (r1 < 0) goto L33
            java.util.Map r2 = kotlin.collections.MapsKt.createMapBuilder(r1)
            r3 = r2
            r4 = 0
            r5 = 0
        L18:
            if (r5 >= r1) goto L2b
            r6 = r5
            r7 = 0
            java.lang.Object r8 = r11.readObject()
            java.lang.Object r9 = r11.readObject()
            r3.put(r8, r9)
            int r5 = r5 + 1
            goto L18
        L2b:
            java.util.Map r2 = kotlin.collections.MapsKt.build(r2)
            r10.map = r2
            return
        L33:
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Illegal size value: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            r4 = 46
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L52:
            java.io.InvalidObjectException r1 = new java.io.InvalidObjectException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported flags value: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.io.Externalizable
    public void writeExternal(java.io.ObjectOutput r4) {
            r3 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r4.writeByte(r0)
            java.util.Map<?, ?> r0 = r3.map
            int r0 = r0.size()
            r4.writeInt(r0)
            java.util.Map<?, ?> r0 = r3.map
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r2 = r1.getValue()
            r4.writeObject(r2)
            goto L1c
        L37:
            return
    }
}
