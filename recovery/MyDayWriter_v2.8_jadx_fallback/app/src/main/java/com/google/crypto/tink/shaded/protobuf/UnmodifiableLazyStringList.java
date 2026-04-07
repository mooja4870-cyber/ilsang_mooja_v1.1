package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements com.google.crypto.tink.shaded.protobuf.LazyStringList, java.util.RandomAccess {
    private final com.google.crypto.tink.shaded.protobuf.LazyStringList list;



    public UnmodifiableLazyStringList(com.google.crypto.tink.shaded.protobuf.LazyStringList r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.LazyStringList access$000(com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList r1) {
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            java.util.List r0 = r0.asByteArrayList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> asByteStringList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            java.util.List r0 = r0.asByteStringList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            byte[] r0 = r0.getByteArray(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getByteString(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.lang.Object getRaw(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            java.lang.Object r0 = r0.getRaw(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            java.util.List r0 = r0.getUnderlyingElements()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView() {
            r0 = this;
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$2 r0 = new com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$2
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$1 r0 = new com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r2, byte[] r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
