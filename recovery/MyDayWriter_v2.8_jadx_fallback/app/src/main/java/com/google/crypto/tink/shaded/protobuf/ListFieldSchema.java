package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class ListFieldSchema {
    private static final com.google.crypto.tink.shaded.protobuf.ListFieldSchema FULL_INSTANCE = null;
    private static final com.google.crypto.tink.shaded.protobuf.ListFieldSchema LITE_INSTANCE = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ListFieldSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ListFieldSchemaFull extends com.google.crypto.tink.shaded.protobuf.ListFieldSchema {
        private static final java.lang.Class<?> UNMODIFIABLE_LIST_CLASS = null;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.Class r0 = r0.getClass()
                com.google.crypto.tink.shaded.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS = r0
                return
        }

        private ListFieldSchemaFull() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ ListFieldSchemaFull(com.google.crypto.tink.shaded.protobuf.ListFieldSchema.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static <E> java.util.List<E> getList(java.lang.Object r1, long r2) {
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private static <L> java.util.List<L> mutableListAt(java.lang.Object r3, long r4, int r6) {
                java.util.List r0 = getList(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2f
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
                if (r1 == 0) goto L15
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
                r1.<init>(r6)
                r0 = r1
                goto L2b
            L15:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L25
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L25
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r1
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r1.mutableCopyWithCapacity(r6)
                goto L2b
            L25:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                r0 = r1
            L2b:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r4, r0)
                goto L86
            L2f:
                java.lang.Class<?> r1 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L4d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                r0 = r1
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r4, r0)
                goto L86
            L4d:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList
                if (r1 == 0) goto L66
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r2 = r0
                com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList r2 = (com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList) r2
                r1.addAll(r2)
                r0 = r1
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r4, r0)
            L65:
                goto L86
            L66:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L65
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L65
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r1
                boolean r1 = r1.isModifiable()
                if (r1 != 0) goto L86
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r1
                int r2 = r0.size()
                int r2 = r2 + r6
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r1.mutableCopyWithCapacity(r2)
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r4, r0)
            L86:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        void makeImmutableListAt(java.lang.Object r5, long r6) {
                r4 = this;
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r5, r6)
                java.util.List r0 = (java.util.List) r0
                r1 = 0
                boolean r2 = r0 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
                if (r2 == 0) goto L13
                r2 = r0
                com.google.crypto.tink.shaded.protobuf.LazyStringList r2 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r2
                com.google.crypto.tink.shaded.protobuf.LazyStringList r1 = r2.getUnmodifiableView()
                goto L3c
            L13:
                java.lang.Class<?> r2 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS
                java.lang.Class r3 = r0.getClass()
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 == 0) goto L20
                return
            L20:
                boolean r2 = r0 instanceof com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection
                if (r2 == 0) goto L38
                boolean r2 = r0 instanceof com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
                if (r2 == 0) goto L38
                r2 = r0
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r2 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r2
                boolean r2 = r2.isModifiable()
                if (r2 == 0) goto L37
                r2 = r0
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r2 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r2
                r2.makeImmutable()
            L37:
                return
            L38:
                java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            L3c:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r5, r6, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        <E> void mergeListsAt(java.lang.Object r6, java.lang.Object r7, long r8) {
                r5 = this;
                java.util.List r0 = getList(r7, r8)
                int r1 = r0.size()
                java.util.List r1 = mutableListAt(r6, r8, r1)
                int r2 = r1.size()
                int r3 = r0.size()
                if (r2 <= 0) goto L1b
                if (r3 <= 0) goto L1b
                r1.addAll(r0)
            L1b:
                if (r2 <= 0) goto L1f
                r4 = r1
                goto L20
            L1f:
                r4 = r0
            L20:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r8, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        <L> java.util.List<L> mutableListAt(java.lang.Object r2, long r3) {
                r1 = this;
                r0 = 10
                java.util.List r0 = mutableListAt(r2, r3, r0)
                return r0
        }
    }

    private static final class ListFieldSchemaLite extends com.google.crypto.tink.shaded.protobuf.ListFieldSchema {
        private ListFieldSchemaLite() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ ListFieldSchemaLite(com.google.crypto.tink.shaded.protobuf.ListFieldSchema.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> getProtobufList(java.lang.Object r1, long r2) {
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        void makeImmutableListAt(java.lang.Object r2, long r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = getProtobufList(r2, r3)
                r0.makeImmutable()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        <E> void mergeListsAt(java.lang.Object r6, java.lang.Object r7, long r8) {
                r5 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = getProtobufList(r6, r8)
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = getProtobufList(r7, r8)
                int r2 = r0.size()
                int r3 = r1.size()
                if (r2 <= 0) goto L23
                if (r3 <= 0) goto L23
                boolean r4 = r0.isModifiable()
                if (r4 != 0) goto L20
                int r4 = r2 + r3
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r4)
            L20:
                r0.addAll(r1)
            L23:
                if (r2 <= 0) goto L27
                r4 = r0
                goto L28
            L27:
                r4 = r1
            L28:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r8, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        <L> java.util.List<L> mutableListAt(java.lang.Object r4, long r5) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = getProtobufList(r4, r5)
                boolean r1 = r0.isModifiable()
                if (r1 != 0) goto L1d
                int r1 = r0.size()
                if (r1 != 0) goto L14
                r2 = 10
                goto L16
            L14:
                int r2 = r1 * 2
            L16:
                com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = r0.mutableCopyWithCapacity(r2)
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r4, r5, r0)
            L1d:
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema$ListFieldSchemaFull r0 = new com.google.crypto.tink.shaded.protobuf.ListFieldSchema$ListFieldSchemaFull
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema.FULL_INSTANCE = r0
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema$ListFieldSchemaLite r0 = new com.google.crypto.tink.shaded.protobuf.ListFieldSchema$ListFieldSchemaLite
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema.LITE_INSTANCE = r0
            return
    }

    private ListFieldSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ ListFieldSchema(com.google.crypto.tink.shaded.protobuf.ListFieldSchema.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.shaded.protobuf.ListFieldSchema full() {
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.FULL_INSTANCE
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ListFieldSchema lite() {
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = com.google.crypto.tink.shaded.protobuf.ListFieldSchema.LITE_INSTANCE
            return r0
    }

    abstract void makeImmutableListAt(java.lang.Object r1, long r2);

    abstract <L> void mergeListsAt(java.lang.Object r1, java.lang.Object r2, long r3);

    abstract <L> java.util.List<L> mutableListAt(java.lang.Object r1, long r2);
}
