package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.crypto.tink.shaded.protobuf.MessageLite {
    protected int memoizedHashCode;

    public static abstract class Builder<MessageType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.crypto.tink.shaded.protobuf.MessageLite.Builder {

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream r1, int r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.limit = r2
                    return
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                    r2 = this;
                    int r0 = super.available()
                    int r1 = r2.limit
                    int r0 = java.lang.Math.min(r0, r1)
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                    r2 = this;
                    int r0 = r2.limit
                    if (r0 > 0) goto L6
                    r0 = -1
                    return r0
                L6:
                    int r0 = super.read()
                    if (r0 < 0) goto L12
                    int r1 = r2.limit
                    int r1 = r1 + (-1)
                    r2.limit = r1
                L12:
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
                    r2 = this;
                    int r0 = r2.limit
                    if (r0 > 0) goto L6
                    r0 = -1
                    return r0
                L6:
                    int r0 = r2.limit
                    int r5 = java.lang.Math.min(r5, r0)
                    int r0 = super.read(r3, r4, r5)
                    if (r0 < 0) goto L17
                    int r1 = r2.limit
                    int r1 = r1 - r0
                    r2.limit = r1
                L17:
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long r4) throws java.io.IOException {
                    r3 = this;
                    int r0 = r3.limit
                    long r0 = (long) r0
                    long r0 = java.lang.Math.min(r4, r0)
                    long r0 = super.skip(r0)
                    int r0 = (int) r0
                    if (r0 < 0) goto L13
                    int r1 = r3.limit
                    int r1 = r1 - r0
                    r3.limit = r1
                L13:
                    long r1 = (long) r0
                    return r1
            }
        }

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        protected static <T> void addAll(java.lang.Iterable<T> r1, java.util.Collection<? super T> r2) {
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                addAll(r1, r0)
                return
        }

        protected static <T> void addAll(java.lang.Iterable<T> r6, java.util.List<? super T> r7) {
                com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r6)
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
                if (r0 == 0) goto L6a
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
                java.util.List r0 = r0.getUnderlyingElements()
                r1 = r7
                com.google.crypto.tink.shaded.protobuf.LazyStringList r1 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r1
                int r2 = r7.size()
                java.util.Iterator r3 = r0.iterator()
            L19:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L69
                java.lang.Object r4 = r3.next()
                if (r4 != 0) goto L57
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Element at index "
                java.lang.StringBuilder r3 = r3.append(r5)
                int r5 = r1.size()
                int r5 = r5 - r2
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r5 = " is null."
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r3 = r3.toString()
                int r5 = r1.size()
                int r5 = r5 + (-1)
            L49:
                if (r5 < r2) goto L51
                r1.remove(r5)
                int r5 = r5 + (-1)
                goto L49
            L51:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                r5.<init>(r3)
                throw r5
            L57:
                boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
                if (r5 == 0) goto L62
                r5 = r4
                com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
                r1.add(r5)
                goto L68
            L62:
                r5 = r4
                java.lang.String r5 = (java.lang.String) r5
                r1.add(r5)
            L68:
                goto L19
            L69:
                goto L78
            L6a:
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection
                if (r0 == 0) goto L75
                r0 = r6
                java.util.Collection r0 = (java.util.Collection) r0
                r7.addAll(r0)
                goto L78
            L75:
                addAllCheckingNulls(r6, r7)
            L78:
                return
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> r4, java.util.List<? super T> r5) {
                boolean r0 = r5 instanceof java.util.ArrayList
                if (r0 == 0) goto L1a
                boolean r0 = r4 instanceof java.util.Collection
                if (r0 == 0) goto L1a
                r0 = r5
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r1 = r5.size()
                r2 = r4
                java.util.Collection r2 = (java.util.Collection) r2
                int r2 = r2.size()
                int r1 = r1 + r2
                r0.ensureCapacity(r1)
            L1a:
                int r0 = r5.size()
                java.util.Iterator r1 = r4.iterator()
            L22:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L64
                java.lang.Object r2 = r1.next()
                if (r2 != 0) goto L60
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Element at index "
                java.lang.StringBuilder r1 = r1.append(r3)
                int r3 = r5.size()
                int r3 = r3 - r0
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r3 = " is null."
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                int r3 = r5.size()
                int r3 = r3 + (-1)
            L52:
                if (r3 < r0) goto L5a
                r5.remove(r3)
                int r3 = r3 + (-1)
                goto L52
            L5a:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                r3.<init>(r1)
                throw r3
            L60:
                r5.add(r2)
                goto L22
            L64:
                return
        }

        private java.lang.String getReadingExceptionMessage(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Reading "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " from a "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = " threw an IOException (should never happen)."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        protected static com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public abstract BuilderType clone();

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r1.clone()
                return r0
        }

        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo145clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r1.clone()
                return r0
        }

        protected abstract BuilderType internalMergeFrom(MessageType r1);

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                boolean r0 = r1.mergeDelimitedFrom(r2, r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r4 = this;
                int r0 = r5.read()
                r1 = -1
                if (r0 != r1) goto L9
                r1 = 0
                return r1
            L9:
                int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r5)
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r2 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
                r2.<init>(r5, r1)
                r4.mergeFrom(r2, r6)
                r3 = 1
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.newCodedInput()     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r3.mergeFrom(r0)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r1 = 0
                r0.checkLastTagWas(r1)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r3
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "ByteString"
                java.lang.String r2 = r3.getReadingExceptionMessage(r2)
                r1.<init>(r2, r0)
                throw r1
            L19:
                r0 = move-exception
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.newCodedInput()     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r3.mergeFrom(r0, r5)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r1 = 0
                r0.checkLastTagWas(r1)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r3
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "ByteString"
                java.lang.String r2 = r3.getReadingExceptionMessage(r2)
                r1.<init>(r2, r0)
                throw r1
            L19:
                r0 = move-exception
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r1.mergeFrom(r2, r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.getDefaultInstanceForType()
                java.lang.Class r0 = r0.getClass()
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L16
                r0 = r3
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r2.internalMergeFrom(r0)
                return r0
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "mergeFrom(MessageLite) can only merge messages of the same type."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream r3) throws java.io.IOException {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r3)
                r2.mergeFrom(r0)
                r1 = 0
                r0.checkLastTagWas(r1)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r3)
                r2.mergeFrom(r0, r4)
                r1 = 0
                r0.checkLastTagWas(r1)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r2.mergeFrom(r3, r0, r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r4, int r5, int r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r4, r5, r6)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r3.mergeFrom(r0)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r1 = 0
                r0.checkLastTagWas(r1)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r3
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "byte array"
                java.lang.String r2 = r3.getReadingExceptionMessage(r2)
                r1.<init>(r2, r0)
                throw r1
            L19:
                r0 = move-exception
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r4, int r5, int r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r4, r5, r6)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r3.mergeFrom(r0, r7)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r1 = 0
                r0.checkLastTagWas(r1)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r3
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "byte array"
                java.lang.String r2 = r3.getReadingExceptionMessage(r2)
                r1.<init>(r2, r0)
                throw r1
            L19:
                r0 = move-exception
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r2.mergeFrom(r3, r0, r1, r4)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }
    }

    protected interface InternalOneOfEnum {
        int getNumber();
    }

    public AbstractMessageLite() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    @java.lang.Deprecated
    protected static <T> void addAll(java.lang.Iterable<T> r1, java.util.Collection<? super T> r2) {
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.addAll(r1, r0)
            return
    }

    protected static <T> void addAll(java.lang.Iterable<T> r0, java.util.List<? super T> r1) {
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.addAll(r0, r1)
            return
    }

    protected static void checkByteStringIsUtf8(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.lang.IllegalArgumentException {
            boolean r0 = r2.isValidUtf8()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Byte string is not UTF-8."
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String getSerializingExceptionMessage(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Serializing "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to a "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " threw an IOException (should never happen)."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    int getMemoizedSerializedSize() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int getSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema r3) {
            r2 = this;
            int r0 = r2.getMemoizedSerializedSize()
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = r3.getSerializedSize(r2)
            r2.setMemoizedSerializedSize(r0)
        Le:
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
            r0.<init>(r1)
            return r0
    }

    void setMemoizedSerializedSize(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public byte[] toByteArray() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L11
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L11
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r0)     // Catch: java.io.IOException -> L11
            r3.writeTo(r1)     // Catch: java.io.IOException -> L11
            r1.checkNoSpaceLeft()     // Catch: java.io.IOException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "byte array"
            java.lang.String r2 = r3.getSerializingExceptionMessage(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public com.google.crypto.tink.shaded.protobuf.ByteString toByteString() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder r0 = com.google.crypto.tink.shaded.protobuf.ByteString.newCodedBuilder(r0)     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r0.getCodedOutput()     // Catch: java.io.IOException -> L14
            r3.writeTo(r1)     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.build()     // Catch: java.io.IOException -> L14
            return r1
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.String r2 = r3.getSerializingExceptionMessage(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeDelimitedTo(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.getSerializedSize()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r0)
            int r1 = r1 + r0
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computePreferredBufferSize(r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r4, r1)
            r2.writeUInt32NoTag(r0)
            r3.writeTo(r2)
            r2.flush()
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.getSerializedSize()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computePreferredBufferSize(r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r3, r0)
            r2.writeTo(r1)
            r1.flush()
            return
    }
}
