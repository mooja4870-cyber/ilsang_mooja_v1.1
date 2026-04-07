package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class LazilyParsedNumber extends java.lang.Number {
    private final java.lang.String value;

    public LazilyParsedNumber(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = "Deserialization is unsupported"
            r0.<init>(r1)
            throw r0
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r2 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.value
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.value
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.gson.internal.LazilyParsedNumber
            r2 = 0
            if (r1 == 0) goto L1f
            r1 = r6
            com.google.gson.internal.LazilyParsedNumber r1 = (com.google.gson.internal.LazilyParsedNumber) r1
            java.lang.String r3 = r5.value
            java.lang.String r4 = r1.value
            if (r3 == r4) goto L1e
            java.lang.String r3 = r5.value
            java.lang.String r4 = r1.value
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            return r0
        L1f:
            return r2
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r4 = this;
            java.lang.String r0 = r4.value     // Catch: java.lang.NumberFormatException -> L7
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = r4.value     // Catch: java.lang.NumberFormatException -> L10
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L10
            int r1 = (int) r1
            return r1
        L10:
            r1 = move-exception
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r3 = r4.value
            r2.<init>(r3)
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.lang.Number
    public long longValue() {
            r3 = this;
            java.lang.String r0 = r3.value     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            r0 = move-exception
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r2 = r3.value
            r1.<init>(r2)
            long r1 = r1.longValue()
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
