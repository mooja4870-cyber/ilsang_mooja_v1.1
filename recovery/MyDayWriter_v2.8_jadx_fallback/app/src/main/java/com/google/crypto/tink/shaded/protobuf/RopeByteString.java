package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends com.google.crypto.tink.shaded.protobuf.ByteString {
    static final int[] minLengthByDepth = null;
    private static final long serialVersionUID = 1;
    private final com.google.crypto.tink.shaded.protobuf.ByteString left;
    private final int leftLength;
    private final com.google.crypto.tink.shaded.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;


    private static class Balancer {
        private final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> prefixesStack;

        private Balancer() {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.prefixesStack = r0
                return
        }

        /* synthetic */ Balancer(com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$100(com.google.crypto.tink.shaded.protobuf.RopeByteString.Balancer r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.balance(r2, r3)
                return r0
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString balance(com.google.crypto.tink.shaded.protobuf.ByteString r5, com.google.crypto.tink.shaded.protobuf.ByteString r6) {
                r4 = this;
                r4.doBalance(r5)
                r4.doBalance(r6)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r4.prefixesStack
                java.lang.Object r0 = r0.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            Le:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r4.prefixesStack
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L26
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r4.prefixesStack
                java.lang.Object r1 = r1.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
                com.google.crypto.tink.shaded.protobuf.RopeByteString r2 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r3 = 0
                r2.<init>(r1, r0, r3)
                r0 = r2
                goto Le
            L26:
                return r0
        }

        private void doBalance(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r3 = this;
                boolean r0 = r4.isBalanced()
                if (r0 == 0) goto La
                r3.insert(r4)
                goto L20
            La:
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r0 == 0) goto L21
                r0 = r4
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r0)
                r3.doBalance(r1)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$500(r0)
                r3.doBalance(r1)
            L20:
                return
            L21:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Has a new type of ByteString been created? Found "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Class r2 = r4.getClass()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private int getDepthBinForLength(int r3) {
                r2 = this;
                int[] r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth
                int r0 = java.util.Arrays.binarySearch(r0, r3)
                if (r0 >= 0) goto Ld
                int r1 = r0 + 1
                int r1 = -r1
                int r0 = r1 + (-1)
            Ld:
                return r0
        }

        private void insert(com.google.crypto.tink.shaded.protobuf.ByteString r8) {
                r7 = this;
                int r0 = r8.size()
                int r0 = r7.getDepthBinForLength(r0)
                int r1 = r0 + 1
                int r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r1)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r7.prefixesStack
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L96
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r7.prefixesStack
                java.lang.Object r2 = r2.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                int r2 = r2.size()
                if (r2 < r1) goto L26
                goto L96
            L26:
                int r2 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r0)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r7.prefixesStack
                java.lang.Object r3 = r3.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            L32:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = r7.prefixesStack
                boolean r4 = r4.isEmpty()
                r5 = 0
                if (r4 != 0) goto L58
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = r7.prefixesStack
                java.lang.Object r4 = r4.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
                int r4 = r4.size()
                if (r4 >= r2) goto L58
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = r7.prefixesStack
                java.lang.Object r4 = r4.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
                com.google.crypto.tink.shaded.protobuf.RopeByteString r6 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r6.<init>(r4, r3, r5)
                r3 = r6
                goto L32
            L58:
                com.google.crypto.tink.shaded.protobuf.RopeByteString r4 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r4.<init>(r3, r8, r5)
            L5d:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r7.prefixesStack
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L90
                int r3 = r4.size()
                int r0 = r7.getDepthBinForLength(r3)
                int r3 = r0 + 1
                int r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r3)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r7.prefixesStack
                java.lang.Object r3 = r3.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
                int r3 = r3.size()
                if (r3 >= r1) goto L90
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r7.prefixesStack
                java.lang.Object r3 = r3.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
                com.google.crypto.tink.shaded.protobuf.RopeByteString r6 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r6.<init>(r3, r4, r5)
                r4 = r6
                goto L5d
            L90:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r7.prefixesStack
                r3.push(r4)
                goto L9b
            L96:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r7.prefixesStack
                r2.push(r8)
            L9b:
                return
        }
    }

    private static final class PieceIterator implements java.util.Iterator<com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> breadCrumbs;
        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next;

        private PieceIterator(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r3 = this;
                r3.<init>()
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r0 == 0) goto L25
                r0 = r4
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r0
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                int r2 = r0.getTreeDepth()
                r1.<init>(r2)
                r3.breadCrumbs = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r1 = r3.breadCrumbs
                r1.push(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = r3.getLeafByLeft(r1)
                r3.next = r1
                goto L2d
            L25:
                r0 = 0
                r3.breadCrumbs = r0
                r0 = r4
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r0
                r3.next = r0
            L2d:
                return
        }

        /* synthetic */ PieceIterator(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString getLeafByLeft(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r3 = this;
                r0 = r4
            L1:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r1 == 0) goto L12
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r2 = r3.breadCrumbs
                r2.push(r1)
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r1)
                goto L1
            L12:
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r1
                return r1
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() {
                r2 = this;
            L1:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r2.breadCrumbs
                if (r0 == 0) goto L26
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r2.breadCrumbs
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Le
                goto L26
            Le:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r2.breadCrumbs
                java.lang.Object r0 = r0.pop()
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$500(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.getLeafByLeft(r0)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L25
                return r0
            L25:
                goto L1
            L26:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.next
                if (r0 == 0) goto Ld
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.next
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = r2.getNextNonEmptyLeaf()
                r2.next = r1
                return r0
            Ld:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private class RopeInputStream extends java.io.InputStream {
        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private com.google.crypto.tink.shaded.protobuf.RopeByteString.PieceIterator pieceIterator;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.RopeByteString this$0;

        public RopeInputStream(com.google.crypto.tink.shaded.protobuf.RopeByteString r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.initialize()
                return
        }

        private void advanceIfCurrentPieceFullyRead() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.currentPiece
                if (r0 == 0) goto L32
                int r0 = r2.currentPieceIndex
                int r1 = r2.currentPieceSize
                if (r0 != r1) goto L32
                int r0 = r2.currentPieceOffsetInRope
                int r1 = r2.currentPieceSize
                int r0 = r0 + r1
                r2.currentPieceOffsetInRope = r0
                r0 = 0
                r2.currentPieceIndex = r0
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r1 = r2.pieceIterator
                boolean r1 = r1.hasNext()
                if (r1 == 0) goto L2d
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = r2.pieceIterator
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r0.next()
                r2.currentPiece = r0
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.currentPiece
                int r0 = r0.size()
                r2.currentPieceSize = r0
                goto L32
            L2d:
                r1 = 0
                r2.currentPiece = r1
                r2.currentPieceSize = r0
            L32:
                return
        }

        private int availableInternal() {
                r2 = this;
                int r0 = r2.currentPieceOffsetInRope
                int r1 = r2.currentPieceIndex
                int r0 = r0 + r1
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = r2.this$0
                int r1 = r1.size()
                int r1 = r1 - r0
                return r1
        }

        private void initialize() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                r3.pieceIterator = r0
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = r3.pieceIterator
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r0.next()
                r3.currentPiece = r0
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r3.currentPiece
                int r0 = r0.size()
                r3.currentPieceSize = r0
                r0 = 0
                r3.currentPieceIndex = r0
                r3.currentPieceOffsetInRope = r0
                return
        }

        private int readSkipInternal(byte[] r6, int r7, int r8) {
                r5 = this;
                r0 = r8
            L1:
                if (r0 <= 0) goto L25
                r5.advanceIfCurrentPieceFullyRead()
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = r5.currentPiece
                if (r1 != 0) goto Lb
                goto L25
            Lb:
                int r1 = r5.currentPieceSize
                int r2 = r5.currentPieceIndex
                int r1 = r1 - r2
                int r2 = java.lang.Math.min(r1, r0)
                if (r6 == 0) goto L1e
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r3 = r5.currentPiece
                int r4 = r5.currentPieceIndex
                r3.copyTo(r6, r4, r7, r2)
                int r7 = r7 + r2
            L1e:
                int r3 = r5.currentPieceIndex
                int r3 = r3 + r2
                r5.currentPieceIndex = r3
                int r0 = r0 - r2
                goto L1
            L25:
                int r1 = r8 - r0
                return r1
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                int r0 = r1.availableInternal()
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r3) {
                r2 = this;
                int r0 = r2.currentPieceOffsetInRope
                int r1 = r2.currentPieceIndex
                int r0 = r0 + r1
                r2.mark = r0
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r3 = this;
                r3.advanceIfCurrentPieceFullyRead()
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r3.currentPiece
                if (r0 != 0) goto L9
                r0 = -1
                return r0
            L9:
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r3.currentPiece
                int r1 = r3.currentPieceIndex
                int r2 = r1 + 1
                r3.currentPieceIndex = r2
                byte r0 = r0.byteAt(r1)
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r3, int r4, int r5) {
                r2 = this;
                if (r3 == 0) goto L21
                if (r4 < 0) goto L1b
                if (r5 < 0) goto L1b
                int r0 = r3.length
                int r0 = r0 - r4
                if (r5 > r0) goto L1b
                int r0 = r2.readSkipInternal(r3, r4, r5)
                if (r0 != 0) goto L1a
                if (r5 > 0) goto L18
                int r1 = r2.availableInternal()
                if (r1 != 0) goto L1a
            L18:
                r1 = -1
                return r1
            L1a:
                return r0
            L1b:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
            L21:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>()
                throw r0
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
                r3 = this;
                monitor-enter(r3)
                r3.initialize()     // Catch: java.lang.Throwable -> Ld
                int r0 = r3.mark     // Catch: java.lang.Throwable -> Ld
                r1 = 0
                r2 = 0
                r3.readSkipInternal(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)
                return
            Ld:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L19
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L10
                r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            L10:
                r0 = 0
                int r1 = (int) r4
                r2 = 0
                int r0 = r3.readSkipInternal(r2, r0, r1)
                long r0 = (long) r0
                return r0
            L19:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    static {
            r0 = 47
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, 2147483647} // fill-array
            com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth = r0
            return
    }

    private RopeByteString(com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r2 = this;
            r2.<init>()
            r2.left = r3
            r2.right = r4
            int r0 = r3.size()
            r2.leftLength = r0
            int r0 = r2.leftLength
            int r1 = r4.size()
            int r0 = r0 + r1
            r2.totalLength = r0
            int r0 = r3.getTreeDepth()
            int r1 = r4.getTreeDepth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 + 1
            r2.treeDepth = r0
            return
    }

    /* synthetic */ RopeByteString(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$400(com.google.crypto.tink.shaded.protobuf.RopeByteString r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$500(com.google.crypto.tink.shaded.protobuf.RopeByteString r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString concatenate(com.google.crypto.tink.shaded.protobuf.ByteString r5, com.google.crypto.tink.shaded.protobuf.ByteString r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r5.size()
            if (r0 != 0) goto Le
            return r6
        Le:
            int r0 = r5.size()
            int r1 = r6.size()
            int r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L20
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = concatenateBytes(r5, r6)
            return r1
        L20:
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
            if (r2 == 0) goto L69
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.RopeByteString r2 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r2.right
            int r3 = r3.size()
            int r4 = r6.size()
            int r3 = r3 + r4
            if (r3 >= r1) goto L42
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.right
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = concatenateBytes(r1, r6)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r3 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.left
            r3.<init>(r4, r1)
            return r3
        L42:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.left
            int r1 = r1.getTreeDepth()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r2.right
            int r3 = r3.getTreeDepth()
            if (r1 <= r3) goto L69
            int r1 = r2.getTreeDepth()
            int r3 = r6.getTreeDepth()
            if (r1 <= r3) goto L69
            com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r2.right
            r1.<init>(r3, r6)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r3 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.left
            r3.<init>(r4, r1)
            return r3
        L69:
            int r1 = r5.getTreeDepth()
            int r2 = r6.getTreeDepth()
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = r1 + 1
            int r2 = minLength(r1)
            if (r0 < r2) goto L83
            com.google.crypto.tink.shaded.protobuf.RopeByteString r2 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r2.<init>(r5, r6)
            return r2
        L83:
            com.google.crypto.tink.shaded.protobuf.RopeByteString$Balancer r2 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$Balancer
            r3 = 0
            r2.<init>(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.RopeByteString.Balancer.access$100(r2, r5, r6)
            return r2
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString concatenateBytes(com.google.crypto.tink.shaded.protobuf.ByteString r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            int r2 = r0 + r1
            byte[] r2 = new byte[r2]
            r3 = 0
            r4.copyTo(r2, r3, r3, r0)
            r5.copyTo(r2, r3, r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r2)
            return r3
    }

    private boolean equalsFragments(com.google.crypto.tink.shaded.protobuf.ByteString r13) {
            r12 = this;
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r1 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r2 = 0
            r1.<init>(r12, r2)
            java.lang.Object r3 = r1.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r3
            r4 = 0
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r5 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r5.<init>(r13, r2)
            java.lang.Object r2 = r5.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r2
            r6 = 0
        L1a:
            int r7 = r3.size()
            int r7 = r7 - r0
            int r8 = r2.size()
            int r8 = r8 - r4
            int r9 = java.lang.Math.min(r7, r8)
            if (r0 != 0) goto L2f
            boolean r10 = r3.equalsRange(r2, r4, r9)
            goto L33
        L2f:
            boolean r10 = r2.equalsRange(r3, r0, r9)
        L33:
            if (r10 != 0) goto L38
            r11 = 0
            return r11
        L38:
            int r6 = r6 + r9
            int r11 = r12.totalLength
            if (r6 < r11) goto L49
            int r11 = r12.totalLength
            if (r6 != r11) goto L43
            r11 = 1
            return r11
        L43:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L49:
            if (r9 != r7) goto L54
            r0 = 0
            java.lang.Object r11 = r1.next()
            r3 = r11
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r3
            goto L55
        L54:
            int r0 = r0 + r9
        L55:
            if (r9 != r8) goto L60
            r4 = 0
            java.lang.Object r11 = r5.next()
            r2 = r11
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r2
            goto L61
        L60:
            int r4 = r4 + r9
        L61:
            goto L1a
    }

    static int minLength(int r1) {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth
            int r0 = r0.length
            if (r1 < r0) goto L9
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L9:
            int[] r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth
            r0 = r0[r1]
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.RopeByteString newInstanceForTest(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r0.<init>(r1, r2)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = "RopeByteStream instances are not to be serialized directly"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
            r2 = this;
            byte[] r0 = r2.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r1 = r0.asReadOnlyBuffer()
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r1 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r2 = 0
            r1.<init>(r4, r2)
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = r1.next()
            java.nio.ByteBuffer r3 = r2.asReadOnlyByteBuffer()
            r0.add(r3)
            goto Lb
        L1d:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int r2) {
            r1 = this;
            int r0 = r1.totalLength
            checkIndex(r2, r0)
            byte r0 = r1.internalByteAt(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.copyTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.copyTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected void copyToInternal(byte[] r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r7 + r9
            int r1 = r5.leftLength
            if (r0 > r1) goto Lc
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.left
            r0.copyToInternal(r6, r7, r8, r9)
            goto L2c
        Lc:
            int r0 = r5.leftLength
            if (r7 < r0) goto L1a
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.right
            int r1 = r5.leftLength
            int r1 = r7 - r1
            r0.copyToInternal(r6, r1, r8, r9)
            goto L2c
        L1a:
            int r0 = r5.leftLength
            int r0 = r0 - r7
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.left
            r1.copyToInternal(r6, r7, r8, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.right
            int r2 = r8 + r0
            int r3 = r9 - r0
            r4 = 0
            r1.copyToInternal(r6, r4, r2, r3)
        L2c:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            int r3 = r5.totalLength
            int r4 = r1.size()
            if (r3 == r4) goto L16
            return r2
        L16:
            int r3 = r5.totalLength
            if (r3 != 0) goto L1b
            return r0
        L1b:
            int r0 = r5.peekCachedHashCode()
            int r3 = r1.peekCachedHashCode()
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L2a
            if (r0 == r3) goto L2a
            return r2
        L2a:
            boolean r2 = r5.equalsFragments(r1)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int getTreeDepth() {
            r1 = this;
            int r0 = r1.treeDepth
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    byte internalByteAt(int r3) {
            r2 = this;
            int r0 = r2.leftLength
            if (r3 >= r0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            byte r0 = r0.internalByteAt(r3)
            return r0
        Lb:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r1 = r2.leftLength
            int r1 = r3 - r1
            byte r0 = r0.internalByteAt(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected boolean isBalanced() {
            r2 = this;
            int r0 = r2.totalLength
            int r1 = r2.treeDepth
            int r1 = minLength(r1)
            if (r0 < r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.left
            int r1 = r4.leftLength
            r2 = 0
            int r0 = r0.partialIsValidUtf8(r2, r2, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.right
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r4.right
            int r3 = r3.size()
            int r1 = r1.partialIsValidUtf8(r0, r2, r3)
            if (r1 != 0) goto L18
            r2 = 1
        L18:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.RopeByteString$1 r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator2() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput() {
            r2 = this;
            java.util.List r0 = r2.asReadOnlyByteBufferList()
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.io.InputStream newInput() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.RopeByteString$RopeInputStream r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$RopeInputStream
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialHash(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r8 + r9
            int r1 = r6.leftLength
            if (r0 > r1) goto Ld
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r6.left
            int r1 = r1.partialHash(r7, r8, r9)
            return r1
        Ld:
            int r1 = r6.leftLength
            if (r8 < r1) goto L1c
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r6.right
            int r2 = r6.leftLength
            int r2 = r8 - r2
            int r1 = r1.partialHash(r7, r2, r9)
            return r1
        L1c:
            int r1 = r6.leftLength
            int r1 = r1 - r8
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r6.left
            int r2 = r2.partialHash(r7, r8, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r6.right
            r4 = 0
            int r5 = r9 - r1
            int r3 = r3.partialHash(r2, r4, r5)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialIsValidUtf8(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r8 + r9
            int r1 = r6.leftLength
            if (r0 > r1) goto Ld
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r6.left
            int r1 = r1.partialIsValidUtf8(r7, r8, r9)
            return r1
        Ld:
            int r1 = r6.leftLength
            if (r8 < r1) goto L1c
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r6.right
            int r2 = r6.leftLength
            int r2 = r8 - r2
            int r1 = r1.partialIsValidUtf8(r7, r2, r9)
            return r1
        L1c:
            int r1 = r6.leftLength
            int r1 = r1 - r8
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r6.left
            int r2 = r2.partialIsValidUtf8(r7, r8, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r6.right
            r4 = 0
            int r5 = r9 - r1
            int r3 = r3.partialIsValidUtf8(r2, r4, r5)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
            r1 = this;
            int r0 = r1.totalLength
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.ByteString substring(int r6, int r7) {
            r5 = this;
            int r0 = r5.totalLength
            int r0 = checkRange(r6, r7, r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            return r1
        Lb:
            int r1 = r5.totalLength
            if (r0 != r1) goto L10
            return r5
        L10:
            int r1 = r5.leftLength
            if (r7 > r1) goto L1b
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.left
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.substring(r6, r7)
            return r1
        L1b:
            int r1 = r5.leftLength
            if (r6 < r1) goto L2e
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.right
            int r2 = r5.leftLength
            int r2 = r6 - r2
            int r3 = r5.leftLength
            int r3 = r7 - r3
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.substring(r2, r3)
            return r1
        L2e:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.left
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.substring(r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.right
            int r3 = r5.leftLength
            int r3 = r7 - r3
            r4 = 0
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.substring(r4, r3)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r3 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r3.<init>(r1, r2)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1, r3)
            return r0
    }

    java.lang.Object writeReplace() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeTo(com.google.crypto.tink.shaded.protobuf.ByteOutput r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeToInternal(java.io.OutputStream r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            int r0 = r6 + r7
            int r1 = r4.leftLength
            if (r0 > r1) goto Lc
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.left
            r0.writeToInternal(r5, r6, r7)
            goto L2a
        Lc:
            int r0 = r4.leftLength
            if (r6 < r0) goto L1a
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.right
            int r1 = r4.leftLength
            int r1 = r6 - r1
            r0.writeToInternal(r5, r1, r7)
            goto L2a
        L1a:
            int r0 = r4.leftLength
            int r0 = r0 - r6
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.left
            r1.writeToInternal(r5, r6, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.right
            r2 = 0
            int r3 = r7 - r0
            r1.writeToInternal(r5, r2, r3)
        L2a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeToReverse(com.google.crypto.tink.shaded.protobuf.ByteOutput r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeToReverse(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeToReverse(r2)
            return
    }
}
