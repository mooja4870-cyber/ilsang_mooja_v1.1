package com.google.crypto.tink.monitoring;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class MonitoringKeysetInfo {
    private final com.google.crypto.tink.monitoring.MonitoringAnnotations annotations;
    private final java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry> entries;

    @javax.annotation.Nullable
    private final java.lang.Integer primaryKeyId;

    /* JADX INFO: renamed from: com.google.crypto.tink.monitoring.MonitoringKeysetInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private com.google.crypto.tink.monitoring.MonitoringAnnotations builderAnnotations;

        @javax.annotation.Nullable
        private java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry> builderEntries;

        @javax.annotation.Nullable
        private java.lang.Integer builderPrimaryKeyId;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.builderEntries = r0
                com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = com.google.crypto.tink.monitoring.MonitoringAnnotations.EMPTY
                r1.builderAnnotations = r0
                r0 = 0
                r1.builderPrimaryKeyId = r0
                return
        }

        private boolean isKeyIdInEntries(int r4) {
                r3 = this;
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r3.builderEntries
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry r1 = (com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry) r1
                int r2 = r1.getKeyId()
                if (r2 != r4) goto L1a
                r0 = 1
                return r0
            L1a:
                goto L6
            L1b:
                r0 = 0
                return r0
        }

        public com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Builder addEntry(com.google.crypto.tink.KeyStatus r8, int r9, java.lang.String r10, java.lang.String r11) {
                r7 = this;
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r7.builderEntries
                if (r0 == 0) goto L14
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r7.builderEntries
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry r1 = new com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry
                r6 = 0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.add(r1)
                return r7
            L14:
                r2 = r8
                r3 = r9
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "addEntry cannot be called after build()"
                r8.<init>(r9)
                throw r8
        }

        public com.google.crypto.tink.monitoring.MonitoringKeysetInfo build() throws java.security.GeneralSecurityException {
                r5 = this;
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r5.builderEntries
                if (r0 == 0) goto L30
                java.lang.Integer r0 = r5.builderPrimaryKeyId
                if (r0 == 0) goto L1d
                java.lang.Integer r0 = r5.builderPrimaryKeyId
                int r0 = r0.intValue()
                boolean r0 = r5.isKeyIdInEntries(r0)
                if (r0 == 0) goto L15
                goto L1d
            L15:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "primary key ID is not present in entries"
                r0.<init>(r1)
                throw r0
            L1d:
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r0 = new com.google.crypto.tink.monitoring.MonitoringKeysetInfo
                com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = r5.builderAnnotations
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r2 = r5.builderEntries
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                java.lang.Integer r3 = r5.builderPrimaryKeyId
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                r5.builderEntries = r4
                return r0
            L30:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "cannot call build() twice"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Builder setAnnotations(com.google.crypto.tink.monitoring.MonitoringAnnotations r3) {
                r2 = this;
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r2.builderEntries
                if (r0 == 0) goto L7
                r2.builderAnnotations = r3
                return r2
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "setAnnotations cannot be called after build()"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Builder setPrimaryKeyId(int r3) {
                r2 = this;
                java.util.ArrayList<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r2.builderEntries
                if (r0 == 0) goto Lb
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                r2.builderPrimaryKeyId = r0
                return r2
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "setPrimaryKeyId cannot be called after build()"
                r0.<init>(r1)
                throw r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Entry {
        private final int keyId;
        private final java.lang.String keyPrefix;
        private final java.lang.String keyType;
        private final com.google.crypto.tink.KeyStatus status;

        private Entry(com.google.crypto.tink.KeyStatus r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.status = r1
                r0.keyId = r2
                r0.keyType = r3
                r0.keyPrefix = r4
                return
        }

        /* synthetic */ Entry(com.google.crypto.tink.KeyStatus r1, int r2, java.lang.String r3, java.lang.String r4, com.google.crypto.tink.monitoring.MonitoringKeysetInfo.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r5
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry r0 = (com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry) r0
                com.google.crypto.tink.KeyStatus r2 = r4.status
                com.google.crypto.tink.KeyStatus r3 = r0.status
                if (r2 != r3) goto L2b
                int r2 = r4.keyId
                int r3 = r0.keyId
                if (r2 != r3) goto L2b
                java.lang.String r2 = r4.keyType
                java.lang.String r3 = r0.keyType
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L2b
                java.lang.String r2 = r4.keyPrefix
                java.lang.String r3 = r0.keyPrefix
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L2b
                r1 = 1
                goto L2c
            L2b:
            L2c:
                return r1
        }

        public int getKeyId() {
                r1 = this;
                int r0 = r1.keyId
                return r0
        }

        public java.lang.String getKeyPrefix() {
                r1 = this;
                java.lang.String r0 = r1.keyPrefix
                return r0
        }

        public java.lang.String getKeyType() {
                r1 = this;
                java.lang.String r0 = r1.keyType
                return r0
        }

        public com.google.crypto.tink.KeyStatus getStatus() {
                r1 = this;
                com.google.crypto.tink.KeyStatus r0 = r1.status
                return r0
        }

        public int hashCode() {
                r4 = this;
                com.google.crypto.tink.KeyStatus r0 = r4.status
                int r1 = r4.keyId
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = r4.keyType
                java.lang.String r3 = r4.keyPrefix
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.crypto.tink.KeyStatus r0 = r4.status
                int r1 = r4.keyId
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = r4.keyType
                java.lang.String r3 = r4.keyPrefix
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                java.lang.String r1 = "(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    private MonitoringKeysetInfo(com.google.crypto.tink.monitoring.MonitoringAnnotations r1, java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry> r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.annotations = r1
            r0.entries = r2
            r0.primaryKeyId = r3
            return
    }

    /* synthetic */ MonitoringKeysetInfo(com.google.crypto.tink.monitoring.MonitoringAnnotations r1, java.util.List r2, java.lang.Integer r3, com.google.crypto.tink.monitoring.MonitoringKeysetInfo.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Builder newBuilder() {
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Builder r0 = new com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Builder
            r0.<init>()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.monitoring.MonitoringKeysetInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo r0 = (com.google.crypto.tink.monitoring.MonitoringKeysetInfo) r0
            com.google.crypto.tink.monitoring.MonitoringAnnotations r2 = r4.annotations
            com.google.crypto.tink.monitoring.MonitoringAnnotations r3 = r0.annotations
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r2 = r4.entries
            java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r3 = r0.entries
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.lang.Integer r2 = r4.primaryKeyId
            java.lang.Integer r3 = r0.primaryKeyId
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L29
            r1 = 1
            goto L2a
        L29:
        L2a:
            return r1
    }

    public com.google.crypto.tink.monitoring.MonitoringAnnotations getAnnotations() {
            r1 = this;
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r1.annotations
            return r0
    }

    public java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo.Entry> getEntries() {
            r1 = this;
            java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r0 = r1.entries
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.Integer getPrimaryKeyId() {
            r1 = this;
            java.lang.Integer r0 = r1.primaryKeyId
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r2.annotations
            java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r1 = r2.entries
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r3.annotations
            java.util.List<com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Entry> r1 = r3.entries
            java.lang.Integer r2 = r3.primaryKeyId
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "(annotations=%s, entries=%s, primaryKeyId=%s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
