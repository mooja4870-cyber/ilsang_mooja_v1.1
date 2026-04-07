package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyField extends com.google.crypto.tink.shaded.protobuf.LazyFieldLite {
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.LazyField$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static class LazyEntry<K> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> entry;

        private LazyEntry(java.util.Map.Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> r1) {
                r0 = this;
                r0.<init>()
                r0.entry = r1
                return
        }

        /* synthetic */ LazyEntry(java.util.Map.Entry r1, com.google.crypto.tink.shaded.protobuf.LazyField.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.crypto.tink.shaded.protobuf.LazyField getField() {
                r1 = this;
                java.util.Map$Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> r0 = r1.entry
                java.lang.Object r0 = r0.getValue()
                com.google.crypto.tink.shaded.protobuf.LazyField r0 = (com.google.crypto.tink.shaded.protobuf.LazyField) r0
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                java.util.Map$Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> r0 = r1.entry
                java.lang.Object r0 = r0.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
                r2 = this;
                java.util.Map$Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> r0 = r2.entry
                java.lang.Object r0 = r0.getValue()
                com.google.crypto.tink.shaded.protobuf.LazyField r0 = (com.google.crypto.tink.shaded.protobuf.LazyField) r0
                if (r0 != 0) goto Lc
                r1 = 0
                return r1
            Lc:
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.getValue()
                return r1
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
                if (r0 == 0) goto L14
                java.util.Map$Entry<K, com.google.crypto.tink.shaded.protobuf.LazyField> r0 = r2.entry
                java.lang.Object r0 = r0.getValue()
                com.google.crypto.tink.shaded.protobuf.LazyField r0 = (com.google.crypto.tink.shaded.protobuf.LazyField) r0
                r1 = r3
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.setValue(r1)
                return r0
            L14:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
                r0.<init>(r1)
                throw r0
        }
    }

    static class LazyIterator<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator;

        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> r1) {
                r0 = this;
                r0.<init>()
                r0.iterator = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.iterator
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
        public java.util.Map.Entry<K, java.lang.Object> next() {
                r3 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r3.iterator
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                boolean r1 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r1 == 0) goto L17
                com.google.crypto.tink.shaded.protobuf.LazyField$LazyEntry r1 = new com.google.crypto.tink.shaded.protobuf.LazyField$LazyEntry
                r2 = 0
                r1.<init>(r0, r2)
                return r1
            L17:
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.iterator
                r0.remove()
                return
        }
    }

    public LazyField(com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.defaultInstance = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
            r2 = this;
            boolean r0 = super.containsDefaultInstance()
            if (r0 != 0) goto Lf
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.defaultInstance
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.getValue()
            boolean r0 = r0.equals(r2)
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite getValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.getValue(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public int hashCode() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.getValue()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.getValue()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
