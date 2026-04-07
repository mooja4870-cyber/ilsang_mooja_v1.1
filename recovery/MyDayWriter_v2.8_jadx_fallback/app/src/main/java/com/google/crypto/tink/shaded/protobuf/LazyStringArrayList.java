package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyStringArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.String> implements com.google.crypto.tink.shaded.protobuf.LazyStringList, java.util.RandomAccess {
    public static final com.google.crypto.tink.shaded.protobuf.LazyStringList EMPTY = null;
    private static final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList EMPTY_LIST = null;
    private final java.util.List<java.lang.Object> list;

    private static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteArrayListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
                r0 = this;
                byte[] r2 = (byte[]) r2
                r0.add(r1, r2)
                return
        }

        public void add(int r2, byte[] r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$200(r0, r2, r3)
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                byte[] r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                byte[] r0 = r0.getByteArray(r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
                r0 = this;
                byte[] r1 = r0.remove(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r2.list
                java.lang.String r0 = r0.remove(r3)
                int r1 = r2.modCount
                int r1 = r1 + 1
                r2.modCount = r1
                byte[] r1 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$100(r0)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                byte[] r2 = (byte[]) r2
                byte[] r1 = r0.set(r1, r2)
                return r1
        }

        public byte[] set(int r3, byte[] r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r2.list
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$000(r0, r3, r4)
                int r1 = r2.modCount
                int r1 = r1 + 1
                r2.modCount = r1
                byte[] r1 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$100(r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                int r0 = r0.size()
                return r0
        }
    }

    private static class ByteStringListView extends java.util.AbstractList<com.google.crypto.tink.shaded.protobuf.ByteString> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteStringListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        public void add(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$500(r0, r2, r3)
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                r0.add(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString get(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getByteString(r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString remove(int r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r2.list
                java.lang.String r0 = r0.remove(r3)
                int r1 = r2.modCount
                int r1 = r1 + 1
                r2.modCount = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$400(r0)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.remove(r1)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ByteString set(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r2.list
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$300(r0, r3, r4)
                int r1 = r2.modCount
                int r1 = r1 + 1
                r2.modCount = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$400(r0)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.set(r1, r2)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST = r0
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST
            r0.makeImmutable()
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY = r0
            return
    }

    public LazyStringArrayList() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public LazyStringArrayList(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public LazyStringArrayList(com.google.crypto.tink.shaded.protobuf.LazyStringList r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r2.list = r0
            r2.addAll(r3)
            return
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    public LazyStringArrayList(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    static /* synthetic */ java.lang.Object access$000(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1, int r2, byte[] r3) {
            java.lang.Object r0 = r1.setAndReturn(r2, r3)
            return r0
    }

    static /* synthetic */ byte[] access$100(java.lang.Object r1) {
            byte[] r0 = asByteArray(r1)
            return r0
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, byte[] r2) {
            r0.add(r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object access$300(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1, int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            java.lang.Object r0 = r1.setAndReturn(r2, r3)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$400(java.lang.Object r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = asByteString(r1)
            return r0
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0.add(r1, r2)
            return
    }

    private void add(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private void add(int r2, byte[] r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private static byte[] asByteArray(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L8
            r0 = r1
            byte[] r0 = (byte[]) r0
            return r0
        L8:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.toByteArray(r0)
            return r0
        L14:
            r0 = r1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            byte[] r0 = r0.toByteArray()
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString asByteString(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L8
            r0 = r1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            return r0
        L8:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
        L14:
            r0 = r1
            byte[] r0 = (byte[]) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            return r0
    }

    private static java.lang.String asString(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L8
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L8:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L14
            r0 = r1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            java.lang.String r0 = r0.toStringUtf8()
            return r0
        L14:
            r0 = r1
            byte[] r0 = (byte[]) r0
            java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8(r0)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.LazyStringArrayList emptyList() {
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST
            return r0
    }

    private java.lang.Object setAndReturn(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r0 = r0.set(r2, r3)
            return r0
    }

    private java.lang.Object setAndReturn(int r2, byte[] r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r0 = r0.set(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r1, r2)
            return
    }

    public void add(int r2, java.lang.String r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int r4, java.util.Collection<? extends java.lang.String> r5) {
            r3 = this;
            r3.ensureIsMutable()
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto Lf
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
            java.util.List r0 = r0.getUnderlyingElements()
            goto L10
        Lf:
            r0 = r5
        L10:
            java.util.List<java.lang.Object> r1 = r3.list
            boolean r1 = r1.addAll(r4, r0)
            int r2 = r3.modCount
            int r2 = r2 + 1
            r3.modCount = r2
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r0 = r1.addAll(r0, r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> r3) {
            r2 = this;
            r2.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r2.list
            boolean r0 = r0.addAll(r3)
            int r1 = r2.modCount
            int r1 = r1 + 1
            r2.modCount = r1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> r3) {
            r2 = this;
            r2.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r2.list
            boolean r0 = r0.addAll(r3)
            int r1 = r2.modCount
            int r1 = r1 + 1
            r2.modCount = r1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteArrayListView r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteArrayListView
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> asByteStringList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteStringListView r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteStringListView
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int r5) {
            r4 = this;
            java.util.List<java.lang.Object> r0 = r4.list
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Le
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            return r1
        Le:
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r1 == 0) goto L25
            r1 = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            java.lang.String r2 = r1.toStringUtf8()
            boolean r3 = r1.isValidUtf8()
            if (r3 == 0) goto L24
            java.util.List<java.lang.Object> r3 = r4.list
            r3.set(r5, r2)
        L24:
            return r2
        L25:
            r1 = r0
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8(r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.Internal.isValidUtf8(r1)
            if (r3 == 0) goto L37
            java.util.List<java.lang.Object> r3 = r4.list
            r3.set(r5, r2)
        L37:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int r4) {
            r3 = this;
            java.util.List<java.lang.Object> r0 = r3.list
            java.lang.Object r0 = r0.get(r4)
            byte[] r1 = asByteArray(r0)
            if (r1 == r0) goto L11
            java.util.List<java.lang.Object> r2 = r3.list
            r2.set(r4, r1)
        L11:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int r4) {
            r3 = this;
            java.util.List<java.lang.Object> r0 = r3.list
            java.lang.Object r0 = r0.get(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = asByteString(r0)
            if (r1 == r0) goto L11
            java.util.List<java.lang.Object> r2 = r3.list
            r2.set(r4, r1)
        L11:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.lang.Object getRaw(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView() {
            r1 = this;
            boolean r0 = r1.isModifiable()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList r0 = new com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
            r1 = this;
            boolean r0 = super.isModifiable()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList r6) {
            r5 = this;
            r5.ensureIsMutable()
            java.util.List r0 = r6.getUnderlyingElements()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L27
            r2 = r1
            byte[] r2 = (byte[]) r2
            java.util.List<java.lang.Object> r3 = r5.list
            int r4 = r2.length
            byte[] r4 = java.util.Arrays.copyOf(r2, r4)
            r3.add(r4)
            goto L2c
        L27:
            java.util.List<java.lang.Object> r2 = r5.list
            r2.add(r1)
        L2c:
            goto Lb
        L2d:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList mutableCopyWithCapacity(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.LazyStringArrayList mutableCopyWithCapacity(int r3) {
            r2 = this;
            int r0 = r2.size()
            if (r3 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.List<java.lang.Object> r1 = r2.list
            r0.addAll(r1)
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
            r1.<init>(r0)
            return r1
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.String r1 = r0.remove(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int r3) {
            r2 = this;
            r2.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.remove(r3)
            int r1 = r2.modCount
            int r1 = r1 + 1
            r2.modCount = r1
            java.lang.String r1 = asString(r0)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r0.set(r1, r2)
            return r1
    }

    public java.lang.String set(int r3, java.lang.String r4) {
            r2 = this;
            r2.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.set(r3, r4)
            java.lang.String r1 = asString(r0)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0 = this;
            r0.setAndReturn(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r1, byte[] r2) {
            r0 = this;
            r0.setAndReturn(r1, r2)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
