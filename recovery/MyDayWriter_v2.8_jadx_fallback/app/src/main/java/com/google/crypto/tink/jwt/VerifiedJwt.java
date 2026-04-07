package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class VerifiedJwt {
    private final com.google.crypto.tink.jwt.RawJwt rawJwt;

    VerifiedJwt(com.google.crypto.tink.jwt.RawJwt r1) {
            r0 = this;
            r0.<init>()
            r0.rawJwt = r1
            return
    }

    public java.util.Set<java.lang.String> customClaimNames() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.util.Set r0 = r0.customClaimNames()
            return r0
    }

    public java.util.List<java.lang.String> getAudiences() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.util.List r0 = r0.getAudiences()
            return r0
    }

    public java.lang.Boolean getBooleanClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.Boolean r0 = r0.getBooleanClaim(r2)
            return r0
    }

    public java.time.Instant getExpiration() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.time.Instant r0 = r0.getExpiration()
            return r0
    }

    public java.time.Instant getIssuedAt() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.time.Instant r0 = r0.getIssuedAt()
            return r0
    }

    public java.lang.String getIssuer() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getIssuer()
            return r0
    }

    public java.lang.String getJsonArrayClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getJsonArrayClaim(r2)
            return r0
    }

    public java.lang.String getJsonObjectClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getJsonObjectClaim(r2)
            return r0
    }

    public java.lang.String getJwtId() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getJwtId()
            return r0
    }

    public java.time.Instant getNotBefore() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.time.Instant r0 = r0.getNotBefore()
            return r0
    }

    public java.lang.Double getNumberClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.Double r0 = r0.getNumberClaim(r2)
            return r0
    }

    public java.lang.String getStringClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getStringClaim(r2)
            return r0
    }

    public java.lang.String getSubject() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getSubject()
            return r0
    }

    public java.lang.String getTypeHeader() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            java.lang.String r0 = r0.getTypeHeader()
            return r0
    }

    public boolean hasAudiences() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasAudiences()
            return r0
    }

    public boolean hasBooleanClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasBooleanClaim(r2)
            return r0
    }

    public boolean hasExpiration() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasExpiration()
            return r0
    }

    public boolean hasIssuedAt() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasIssuedAt()
            return r0
    }

    public boolean hasIssuer() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasIssuer()
            return r0
    }

    public boolean hasJsonArrayClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasJsonArrayClaim(r2)
            return r0
    }

    public boolean hasJsonObjectClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasJsonObjectClaim(r2)
            return r0
    }

    public boolean hasJwtId() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasJwtId()
            return r0
    }

    public boolean hasNotBefore() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasNotBefore()
            return r0
    }

    public boolean hasNumberClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasNumberClaim(r2)
            return r0
    }

    public boolean hasStringClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasStringClaim(r2)
            return r0
    }

    public boolean hasSubject() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasSubject()
            return r0
    }

    public boolean hasTypeHeader() {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.hasTypeHeader()
            return r0
    }

    public boolean isNullClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.RawJwt r0 = r1.rawJwt
            boolean r0 = r0.isNullClaim(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "verified{"
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.jwt.RawJwt r1 = r2.rawJwt
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
