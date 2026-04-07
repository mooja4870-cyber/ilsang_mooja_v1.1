package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class JsonPrimitive extends com.google.gson.JsonElement {
    private final java.lang.Object value;

    public JsonPrimitive(java.lang.Boolean r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
            r1.value = r0
            return
    }

    public JsonPrimitive(java.lang.Character r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
            java.lang.Character r0 = (java.lang.Character) r0
            java.lang.String r0 = r0.toString()
            r1.value = r0
            return
    }

    public JsonPrimitive(java.lang.Number r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
            r1.value = r0
            return
    }

    public JsonPrimitive(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
            r1.value = r0
            return
    }

    private static boolean isIntegral(com.google.gson.JsonPrimitive r3) {
            java.lang.Object r0 = r3.value
            boolean r0 = r0 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.value
            java.lang.Number r0 = (java.lang.Number) r0
            boolean r2 = r0 instanceof java.math.BigInteger
            if (r2 != 0) goto L1f
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 != 0) goto L1f
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r0 instanceof java.lang.Short
            if (r2 != 0) goto L1f
            boolean r2 = r0 instanceof java.lang.Byte
            if (r2 == 0) goto L20
        L1f:
            r1 = 1
        L20:
            return r1
        L21:
            return r1
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement deepCopy() {
            r1 = this;
            com.google.gson.JsonPrimitive r0 = r1.deepCopy()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public com.google.gson.JsonPrimitive deepCopy() {
            r0 = this;
            return r0
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L7c
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r9.getClass()
            if (r2 == r3) goto L13
            goto L7c
        L13:
            r2 = r9
            com.google.gson.JsonPrimitive r2 = (com.google.gson.JsonPrimitive) r2
            java.lang.Object r3 = r8.value
            if (r3 != 0) goto L21
            java.lang.Object r3 = r2.value
            if (r3 != 0) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            return r0
        L21:
            boolean r3 = isIntegral(r8)
            if (r3 == 0) goto L44
            boolean r3 = isIntegral(r2)
            if (r3 == 0) goto L44
            java.lang.Number r3 = r8.getAsNumber()
            long r3 = r3.longValue()
            java.lang.Number r5 = r2.getAsNumber()
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            return r0
        L44:
            java.lang.Object r3 = r8.value
            boolean r3 = r3 instanceof java.lang.Number
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.value
            boolean r3 = r3 instanceof java.lang.Number
            if (r3 == 0) goto L73
            java.lang.Number r3 = r8.getAsNumber()
            double r3 = r3.doubleValue()
            java.lang.Number r5 = r2.getAsNumber()
            double r5 = r5.doubleValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L72
            boolean r7 = java.lang.Double.isNaN(r3)
            if (r7 == 0) goto L71
            boolean r7 = java.lang.Double.isNaN(r5)
            if (r7 == 0) goto L71
            goto L72
        L71:
            r0 = r1
        L72:
            return r0
        L73:
            java.lang.Object r0 = r8.value
            java.lang.Object r1 = r2.value
            boolean r0 = r0.equals(r1)
            return r0
        L7c:
            return r1
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigDecimal getAsBigDecimal() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof java.math.BigDecimal
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r2.value
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            goto L16
        Lb:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Object r1 = r2.value
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
        L16:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigInteger getAsBigInteger() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r2.value
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            goto L16
        Lb:
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.Object r1 = r2.value
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
        L16:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
            r1 = this;
            boolean r0 = r1.isBoolean()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.value
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            byte r0 = r0.byteValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.getAsString()
            byte r0 = java.lang.Byte.parseByte(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
            r2 = this;
            java.lang.String r0 = r2.getAsString()
            r1 = 0
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
            r2 = this;
            boolean r0 = r2.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.getAsNumber()
            double r0 = r0.doubleValue()
            goto L17
        Lf:
            java.lang.String r0 = r2.getAsString()
            double r0 = java.lang.Double.parseDouble(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            float r0 = r0.floatValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.getAsString()
            float r0 = java.lang.Float.parseFloat(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            int r0 = r0.intValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.getAsString()
            int r0 = java.lang.Integer.parseInt(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
            r2 = this;
            boolean r0 = r2.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.getAsNumber()
            long r0 = r0.longValue()
            goto L17
        Lf:
            java.lang.String r0 = r2.getAsString()
            long r0 = java.lang.Long.parseLong(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.Number getAsNumber() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L10
            com.google.gson.internal.LazilyParsedNumber r0 = new com.google.gson.internal.LazilyParsedNumber
            java.lang.Object r1 = r2.value
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            goto L14
        L10:
            java.lang.Object r0 = r2.value
            java.lang.Number r0 = (java.lang.Number) r0
        L14:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            short r0 = r0.shortValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.getAsString()
            short r0 = java.lang.Short.parseShort(r0)
        L17:
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.String getAsString() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            boolean r0 = r1.isBoolean()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.value
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r0 = r0.toString()
            return r0
        L1e:
            java.lang.Object r0 = r1.value
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L7
            r0 = 31
            return r0
        L7:
            boolean r0 = isIntegral(r4)
            r1 = 32
            if (r0 == 0) goto L1c
            java.lang.Number r0 = r4.getAsNumber()
            long r2 = r0.longValue()
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r0 = (int) r0
            return r0
        L1c:
            java.lang.Object r0 = r4.value
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L33
            java.lang.Number r0 = r4.getAsNumber()
            double r2 = r0.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r0 = (int) r0
            return r0
        L33:
            java.lang.Object r0 = r4.value
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isBoolean() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Boolean
            return r0
    }

    public boolean isNumber() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Number
            return r0
    }

    public boolean isString() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.String
            return r0
    }
}
