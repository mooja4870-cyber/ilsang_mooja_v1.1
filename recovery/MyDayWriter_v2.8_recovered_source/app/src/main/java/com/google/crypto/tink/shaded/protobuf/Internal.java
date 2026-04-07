package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final com.google.crypto.tink.shaded.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    static final java.nio.charset.Charset ISO_8859_1 = null;
    static final java.nio.charset.Charset US_ASCII = null;
    static final java.nio.charset.Charset UTF_8 = null;

    public interface BooleanList extends com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Boolean> {
        void addBoolean(boolean r1);

        boolean getBoolean(int r1);

        @Override // 
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$BooleanList r1 = r0.mutableCopyWithCapacity(r1)
                return r1
        }

        boolean setBoolean(int r1, boolean r2);
    }

    public interface DoubleList extends com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Double> {
        void addDouble(double r1);

        double getDouble(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$DoubleList r1 = r0.mutableCopyWithCapacity(r1)
                return r1
        }

        double setDouble(int r1, double r2);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends com.google.crypto.tink.shaded.protobuf.Internal.EnumLite> {
        T findValueByNumber(int r1);
    }

    public interface EnumVerifier {
        boolean isInRange(int r1);
    }

    public interface FloatList extends com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Float> {
        void addFloat(float r1);

        float getFloat(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$FloatList r1 = r0.mutableCopyWithCapacity(r1)
                return r1
        }

        float setFloat(int r1, float r2);
    }

    public interface IntList extends com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Integer> {
        void addInt(int r1);

        int getInt(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$IntList r1 = r0.mutableCopyWithCapacity(r1)
                return r1
        }

        int setInt(int r1, int r2);
    }

    public static class ListAdapter<F, T> extends java.util.AbstractList<T> {
        private final com.google.crypto.tink.shaded.protobuf.Internal.ListAdapter.Converter<F, T> converter;
        private final java.util.List<F> fromList;

        public interface Converter<F, T> {
            T convert(F r1);
        }

        public ListAdapter(java.util.List<F> r1, com.google.crypto.tink.shaded.protobuf.Internal.ListAdapter.Converter<F, T> r2) {
                r0 = this;
                r0.<init>()
                r0.fromList = r1
                r0.converter = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$ListAdapter$Converter<F, T> r0 = r2.converter
                java.util.List<F> r1 = r2.fromList
                java.lang.Object r1 = r1.get(r3)
                java.lang.Object r0 = r0.convert(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                int r0 = r0.size()
                return r0
        }
    }

    public interface LongList extends com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> {
        void addLong(long r1);

        long getLong(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity(int r1);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$LongList r1 = r0.mutableCopyWithCapacity(r1)
                return r1
        }

        long setLong(int r1, long r2);
    }

    public static class MapAdapter<K, V, RealValue> extends java.util.AbstractMap<K, V> {
        private final java.util.Map<K, RealValue> realMap;
        private final com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter;


        public interface Converter<A, B> {
            A doBackward(B r1);

            B doForward(A r1);
        }

        private class EntryAdapter implements java.util.Map.Entry<K, V> {
            private final java.util.Map.Entry<K, RealValue> realEntry;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter this$0;

            public EntryAdapter(com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter r1, java.util.Map.Entry<K, RealValue> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.realEntry = r2
                    return
            }

            @Override // java.util.Map.Entry
            public boolean equals(java.lang.Object r6) {
                    r5 = this;
                    r0 = 1
                    if (r6 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r6 instanceof java.util.Map.Entry
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    r1 = r6
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r3 = r5.getKey()
                    java.lang.Object r4 = r1.getKey()
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L2a
                    java.lang.Object r3 = r5.getValue()
                    java.lang.Object r4 = r5.getValue()
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L2a
                    goto L2b
                L2a:
                    r0 = r2
                L2b:
                    return r0
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                    r1 = this;
                    java.util.Map$Entry<K, RealValue> r0 = r1.realEntry
                    java.lang.Object r0 = r0.getKey()
                    return r0
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                    r2 = this;
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter r0 = r2.this$0
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter r0 = com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.access$000(r0)
                    java.util.Map$Entry<K, RealValue> r1 = r2.realEntry
                    java.lang.Object r1 = r1.getValue()
                    java.lang.Object r0 = r0.doForward(r1)
                    return r0
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                    r1 = this;
                    java.util.Map$Entry<K, RealValue> r0 = r1.realEntry
                    int r0 = r0.hashCode()
                    return r0
            }

            @Override // java.util.Map.Entry
            public V setValue(V r3) {
                    r2 = this;
                    java.util.Map$Entry<K, RealValue> r0 = r2.realEntry
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter r1 = r2.this$0
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter r1 = com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.access$000(r1)
                    java.lang.Object r1 = r1.doBackward(r3)
                    java.lang.Object r0 = r0.setValue(r1)
                    if (r0 != 0) goto L14
                    r1 = 0
                    return r1
                L14:
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter r1 = r2.this$0
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter r1 = com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.access$000(r1)
                    java.lang.Object r1 = r1.doForward(r0)
                    return r1
            }
        }

        private class IteratorAdapter implements java.util.Iterator<java.util.Map.Entry<K, V>> {
            private final java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter this$0;

            public IteratorAdapter(com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter r1, java.util.Iterator<java.util.Map.Entry<K, RealValue>> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.realIterator = r2
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, RealValue>> r0 = r1.realIterator
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    java.util.Map$Entry r0 = r1.next()
                    return r0
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                    r3 = this;
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$EntryAdapter r0 = new com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$EntryAdapter
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter r1 = r3.this$0
                    java.util.Iterator<java.util.Map$Entry<K, RealValue>> r2 = r3.realIterator
                    java.lang.Object r2 = r2.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, RealValue>> r0 = r1.realIterator
                    r0.remove()
                    return
            }
        }

        private class SetAdapter extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
            private final java.util.Set<java.util.Map.Entry<K, RealValue>> realSet;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter this$0;

            public SetAdapter(com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter r1, java.util.Set<java.util.Map.Entry<K, RealValue>> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.realSet = r2
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    r3 = this;
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$IteratorAdapter r0 = new com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$IteratorAdapter
                    com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter r1 = r3.this$0
                    java.util.Set<java.util.Map$Entry<K, RealValue>> r2 = r3.realSet
                    java.util.Iterator r2 = r2.iterator()
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r1 = this;
                    java.util.Set<java.util.Map$Entry<K, RealValue>> r0 = r1.realSet
                    int r0 = r0.size()
                    return r0
            }
        }

        public MapAdapter(java.util.Map<K, RealValue> r1, com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter<RealValue, V> r2) {
                r0 = this;
                r0.<init>()
                r0.realMap = r1
                r0.valueConverter = r2
                return
        }

        static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter access$000(com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter r1) {
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter<RealValue, V> r0 = r1.valueConverter
                return r0
        }

        public static <T extends com.google.crypto.tink.shaded.protobuf.Internal.EnumLite> com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T> newEnumConverter(com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<T> r1, T r2) {
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$1 r0 = new com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$SetAdapter r0 = new com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$SetAdapter
                java.util.Map<K, RealValue> r1 = r2.realMap
                java.util.Set r1 = r1.entrySet()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object r3) {
                r2 = this;
                java.util.Map<K, RealValue> r0 = r2.realMap
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto La
                r1 = 0
                return r1
            La:
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter<RealValue, V> r1 = r2.valueConverter
                java.lang.Object r1 = r1.doForward(r0)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K r3, V r4) {
                r2 = this;
                java.util.Map<K, RealValue> r0 = r2.realMap
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter<RealValue, V> r1 = r2.valueConverter
                java.lang.Object r1 = r1.doBackward(r4)
                java.lang.Object r0 = r0.put(r3, r1)
                if (r0 != 0) goto L10
                r1 = 0
                return r1
            L10:
                com.google.crypto.tink.shaded.protobuf.Internal$MapAdapter$Converter<RealValue, V> r1 = r2.valueConverter
                java.lang.Object r1 = r1.doForward(r0)
                return r1
        }
    }

    public interface ProtobufList<E> extends java.util.List<E>, java.util.RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity(int r1);
    }

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.shaded.protobuf.Internal.US_ASCII = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.shaded.protobuf.Internal.UTF_8 = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.shaded.protobuf.Internal.ISO_8859_1 = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY = r0
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER = r0
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0)
            com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_CODED_INPUT_STREAM = r0
            return
    }

    private Internal() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] byteArrayDefaultValue(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.ISO_8859_1
            byte[] r0 = r1.getBytes(r0)
            return r0
    }

    public static java.nio.ByteBuffer byteBufferDefaultValue(java.lang.String r1) {
            byte[] r0 = byteArrayDefaultValue(r1)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString bytesDefaultValue(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.ISO_8859_1
            byte[] r0 = r1.getBytes(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            return r0
    }

    static <T> T checkNotNull(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    static <T> T checkNotNull(T r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
    }

    public static java.nio.ByteBuffer copyByteBuffer(java.nio.ByteBuffer r2) {
            java.nio.ByteBuffer r0 = r2.duplicate()
            r0.clear()
            int r1 = r0.capacity()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r1.put(r0)
            r1.clear()
            return r1
    }

    public static boolean equals(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r0 = 1
            return r0
    }

    public static boolean equalsByteBuffer(java.nio.ByteBuffer r2, java.nio.ByteBuffer r3) {
            int r0 = r2.capacity()
            int r1 = r3.capacity()
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.nio.ByteBuffer r0 = r2.duplicate()
            java.nio.Buffer r0 = r0.clear()
            java.nio.ByteBuffer r1 = r3.duplicate()
            java.nio.Buffer r1 = r1.clear()
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean equalsByteBuffer(java.util.List<java.nio.ByteBuffer> r4, java.util.List<java.nio.ByteBuffer> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.lang.Object r3 = r5.get(r0)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            boolean r1 = equalsByteBuffer(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r0 = 1
            return r0
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T getDefaultInstance(java.lang.Class<T> r4) {
            java.lang.String r0 = "getDefaultInstance"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L12
            java.lang.reflect.Method r0 = r4.getMethod(r0, r2)     // Catch: java.lang.Exception -> L12
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L12
            java.lang.Object r1 = r0.invoke(r0, r1)     // Catch: java.lang.Exception -> L12
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: java.lang.Exception -> L12
            return r1
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to get default instance for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    public static int hashBoolean(boolean r1) {
            if (r1 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L7
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
        L7:
            return r0
    }

    public static int hashCode(java.util.List<byte[]> r5) {
            r0 = 1
            java.util.Iterator r1 = r5.iterator()
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            int r3 = r0 * 31
            int r4 = hashCode(r2)
            int r0 = r3 + r4
            goto L5
        L1a:
            return r0
    }

    public static int hashCode(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            int r0 = hashCode(r2, r0, r1)
            return r0
    }

    static int hashCode(byte[] r2, int r3, int r4) {
            int r0 = partialHash(r4, r2, r3, r4)
            if (r0 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = r0
        L9:
            return r1
    }

    public static int hashCodeByteBuffer(java.nio.ByteBuffer r7) {
            boolean r0 = r7.hasArray()
            r1 = 1
            if (r0 == 0) goto L20
            int r0 = r7.capacity()
            byte[] r2 = r7.array()
            int r3 = r7.arrayOffset()
            int r4 = r7.capacity()
            int r0 = partialHash(r0, r2, r3, r4)
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            return r1
        L20:
            int r0 = r7.capacity()
            r2 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r2) goto L29
            goto L2d
        L29:
            int r2 = r7.capacity()
        L2d:
            byte[] r0 = new byte[r2]
            java.nio.ByteBuffer r3 = r7.duplicate()
            r3.clear()
            int r4 = r7.capacity()
        L3a:
            int r5 = r3.remaining()
            if (r5 <= 0) goto L55
            int r5 = r3.remaining()
            if (r5 > r2) goto L4b
            int r5 = r3.remaining()
            goto L4c
        L4b:
            r5 = r2
        L4c:
            r6 = 0
            r3.get(r0, r6, r5)
            int r4 = partialHash(r4, r0, r6, r5)
            goto L3a
        L55:
            if (r4 != 0) goto L58
            goto L59
        L58:
            r1 = r4
        L59:
            return r1
    }

    public static int hashCodeByteBuffer(java.util.List<java.nio.ByteBuffer> r5) {
            r0 = 1
            java.util.Iterator r1 = r5.iterator()
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r3 = r0 * 31
            int r4 = hashCodeByteBuffer(r2)
            int r0 = r3 + r4
            goto L5
        L1a:
            return r0
    }

    public static int hashEnum(com.google.crypto.tink.shaded.protobuf.Internal.EnumLite r1) {
            int r0 = r1.getNumber()
            return r0
    }

    public static int hashEnumList(java.util.List<? extends com.google.crypto.tink.shaded.protobuf.Internal.EnumLite> r5) {
            r0 = 1
            java.util.Iterator r1 = r5.iterator()
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r2 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r2
            int r3 = r0 * 31
            int r4 = hashEnum(r2)
            int r0 = r3 + r4
            goto L5
        L1a:
            return r0
    }

    public static int hashLong(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r0 = r0 ^ r2
            int r0 = (int) r0
            return r0
    }

    public static boolean isValidUtf8(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            boolean r0 = r1.isValidUtf8()
            return r0
    }

    public static boolean isValidUtf8(byte[] r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r1)
            return r0
    }

    static java.lang.Object mergeMessage(java.lang.Object r2, java.lang.Object r3) {
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()
            r1 = r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.buildPartial()
            return r0
    }

    static int partialHash(int r3, byte[] r4, int r5, int r6) {
            r0 = r5
        L1:
            int r1 = r5 + r6
            if (r0 >= r1) goto Le
            int r1 = r3 * 31
            r2 = r4[r0]
            int r3 = r1 + r2
            int r0 = r0 + 1
            goto L1
        Le:
            return r3
    }

    public static java.lang.String stringDefaultValue(java.lang.String r3) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.ISO_8859_1
            byte[] r1 = r3.getBytes(r1)
            java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] toByteArray(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            byte[] r0 = r1.getBytes(r0)
            return r0
    }

    public static java.lang.String toStringUtf8(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            r0.<init>(r2, r1)
            return r0
    }
}
