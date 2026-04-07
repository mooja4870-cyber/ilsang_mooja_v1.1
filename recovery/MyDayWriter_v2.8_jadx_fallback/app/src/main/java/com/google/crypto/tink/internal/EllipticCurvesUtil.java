package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class EllipticCurvesUtil {
    private static final java.math.BigInteger EIGHT = null;
    private static final java.math.BigInteger FOUR = null;
    public static final java.security.spec.ECParameterSpec NIST_P256_PARAMS = null;
    public static final java.security.spec.ECParameterSpec NIST_P384_PARAMS = null;
    public static final java.security.spec.ECParameterSpec NIST_P521_PARAMS = null;
    private static final java.math.BigInteger THREE = null;
    private static final java.math.BigInteger TWO = null;

    static class JacobianEcPoint {
        static final com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint INFINITY = null;
        java.math.BigInteger x;
        java.math.BigInteger y;
        java.math.BigInteger z;

        static {
                com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r0 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
                java.math.BigInteger r1 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = java.math.BigInteger.ONE
                java.math.BigInteger r3 = java.math.BigInteger.ZERO
                r0.<init>(r1, r2, r3)
                com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY = r0
                return
        }

        JacobianEcPoint(java.math.BigInteger r1, java.math.BigInteger r2, java.math.BigInteger r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.z = r3
                return
        }

        boolean isInfinity() {
                r2 = this;
                java.math.BigInteger r0 = r2.z
                java.math.BigInteger r1 = java.math.BigInteger.ZERO
                boolean r0 = r0.equals(r1)
                return r0
        }

        java.security.spec.ECPoint toECPoint(java.math.BigInteger r6) {
                r5 = this;
                boolean r0 = r5.isInfinity()
                if (r0 == 0) goto L9
                java.security.spec.ECPoint r0 = java.security.spec.ECPoint.POINT_INFINITY
                return r0
            L9:
                java.math.BigInteger r0 = r5.z
                java.math.BigInteger r0 = r0.modInverse(r6)
                java.math.BigInteger r1 = r0.multiply(r0)
                java.math.BigInteger r1 = r1.mod(r6)
                java.security.spec.ECPoint r2 = new java.security.spec.ECPoint
                java.math.BigInteger r3 = r5.x
                java.math.BigInteger r3 = r3.multiply(r1)
                java.math.BigInteger r3 = r3.mod(r6)
                java.math.BigInteger r4 = r5.y
                java.math.BigInteger r4 = r4.multiply(r1)
                java.math.BigInteger r4 = r4.mod(r6)
                java.math.BigInteger r4 = r4.multiply(r0)
                java.math.BigInteger r4 = r4.mod(r6)
                r2.<init>(r3, r4)
                return r2
        }
    }

    static {
            java.security.spec.ECParameterSpec r0 = getNistP256Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS = r0
            java.security.spec.ECParameterSpec r0 = getNistP384Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS = r0
            java.security.spec.ECParameterSpec r0 = getNistP521Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS = r0
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.TWO = r0
            r0 = 3
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.THREE = r0
            r0 = 4
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.FOUR = r0
            r0 = 8
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.EIGHT = r0
            return
    }

    private EllipticCurvesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint addJacobianPoints(com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r19, com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r20, java.math.BigInteger r21, java.math.BigInteger r22) {
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = r0.isInfinity()
            if (r3 == 0) goto Ld
            return r1
        Ld:
            boolean r3 = r1.isInfinity()
            if (r3 == 0) goto L14
            return r0
        L14:
            java.math.BigInteger r3 = r0.z
            java.math.BigInteger r4 = r0.z
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r3 = r3.mod(r2)
            java.math.BigInteger r4 = r1.z
            java.math.BigInteger r5 = r1.z
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r4 = r4.mod(r2)
            java.math.BigInteger r5 = r0.x
            java.math.BigInteger r5 = r5.multiply(r4)
            java.math.BigInteger r5 = r5.mod(r2)
            java.math.BigInteger r6 = r1.x
            java.math.BigInteger r6 = r6.multiply(r3)
            java.math.BigInteger r6 = r6.mod(r2)
            java.math.BigInteger r7 = r0.y
            java.math.BigInteger r8 = r1.z
            java.math.BigInteger r7 = r7.multiply(r8)
            java.math.BigInteger r7 = r7.mod(r2)
            java.math.BigInteger r7 = r7.multiply(r4)
            java.math.BigInteger r7 = r7.mod(r2)
            java.math.BigInteger r8 = r1.y
            java.math.BigInteger r9 = r0.z
            java.math.BigInteger r8 = r8.multiply(r9)
            java.math.BigInteger r8 = r8.mod(r2)
            java.math.BigInteger r8 = r8.multiply(r3)
            java.math.BigInteger r8 = r8.mod(r2)
            boolean r9 = r5.equals(r6)
            if (r9 == 0) goto L7e
            boolean r9 = r7.equals(r8)
            if (r9 != 0) goto L77
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r9 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r9
        L77:
            r9 = r21
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r10 = doubleJacobianPoint(r0, r9, r2)
            return r10
        L7e:
            r9 = r21
            java.math.BigInteger r10 = r6.subtract(r5)
            java.math.BigInteger r10 = r10.mod(r2)
            java.math.BigInteger r11 = com.google.crypto.tink.internal.EllipticCurvesUtil.FOUR
            java.math.BigInteger r11 = r10.multiply(r11)
            java.math.BigInteger r11 = r11.multiply(r10)
            java.math.BigInteger r11 = r11.mod(r2)
            java.math.BigInteger r12 = r10.multiply(r11)
            java.math.BigInteger r12 = r12.mod(r2)
            java.math.BigInteger r13 = r8.subtract(r7)
            java.math.BigInteger r14 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r13 = r13.multiply(r14)
            java.math.BigInteger r13 = r13.mod(r2)
            java.math.BigInteger r14 = r5.multiply(r11)
            java.math.BigInteger r14 = r14.mod(r2)
            java.math.BigInteger r15 = r13.multiply(r13)
            java.math.BigInteger r15 = r15.mod(r2)
            java.math.BigInteger r15 = r15.subtract(r12)
            r16 = r5
            java.math.BigInteger r5 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r5 = r14.multiply(r5)
            java.math.BigInteger r5 = r15.subtract(r5)
            java.math.BigInteger r5 = r5.mod(r2)
            java.math.BigInteger r15 = r14.subtract(r5)
            java.math.BigInteger r15 = r13.multiply(r15)
            r17 = r6
            java.math.BigInteger r6 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r6 = r7.multiply(r6)
            java.math.BigInteger r6 = r6.multiply(r12)
            java.math.BigInteger r6 = r15.subtract(r6)
            java.math.BigInteger r6 = r6.mod(r2)
            java.math.BigInteger r15 = r0.z
            java.math.BigInteger r0 = r1.z
            java.math.BigInteger r0 = r15.add(r0)
            java.math.BigInteger r15 = r0.multiply(r0)
            java.math.BigInteger r15 = r15.mod(r2)
            java.math.BigInteger r15 = r15.subtract(r3)
            java.math.BigInteger r15 = r15.subtract(r4)
            java.math.BigInteger r15 = r15.multiply(r10)
            java.math.BigInteger r15 = r15.mod(r2)
            r18 = r0
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r0 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            r0.<init>(r5, r6, r15)
            return r0
    }

    public static void checkPointOnCurve(java.security.spec.ECPoint r7, java.security.spec.EllipticCurve r8) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = getModulus(r8)
            java.math.BigInteger r1 = r7.getAffineX()
            java.math.BigInteger r2 = r7.getAffineY()
            if (r1 == 0) goto L6c
            if (r2 == 0) goto L6c
            int r3 = r1.signum()
            r4 = -1
            if (r3 == r4) goto L64
            int r3 = r1.compareTo(r0)
            if (r3 >= 0) goto L64
            int r3 = r2.signum()
            if (r3 == r4) goto L5c
            int r3 = r2.compareTo(r0)
            if (r3 >= 0) goto L5c
            java.math.BigInteger r3 = r2.multiply(r2)
            java.math.BigInteger r3 = r3.mod(r0)
            java.math.BigInteger r4 = r1.multiply(r1)
            java.math.BigInteger r5 = r8.getA()
            java.math.BigInteger r4 = r4.add(r5)
            java.math.BigInteger r4 = r4.multiply(r1)
            java.math.BigInteger r5 = r8.getB()
            java.math.BigInteger r4 = r4.add(r5)
            java.math.BigInteger r4 = r4.mod(r0)
            boolean r5 = r3.equals(r4)
            if (r5 == 0) goto L54
            return
        L54:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "Point is not on curve"
            r5.<init>(r6)
            throw r5
        L5c:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "y is out of range"
            r3.<init>(r4)
            throw r3
        L64:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "x is out of range"
            r3.<init>(r4)
            throw r3
        L6c:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "point is at infinity"
            r3.<init>(r4)
            throw r3
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint doubleJacobianPoint(com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r13, java.math.BigInteger r14, java.math.BigInteger r15) {
            java.math.BigInteger r0 = r13.y
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r0
        Ld:
            java.math.BigInteger r0 = r13.x
            java.math.BigInteger r1 = r13.x
            java.math.BigInteger r0 = r0.multiply(r1)
            java.math.BigInteger r0 = r0.mod(r15)
            java.math.BigInteger r1 = r13.y
            java.math.BigInteger r2 = r13.y
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r1 = r1.mod(r15)
            java.math.BigInteger r2 = r1.multiply(r1)
            java.math.BigInteger r2 = r2.mod(r15)
            java.math.BigInteger r3 = r13.z
            java.math.BigInteger r4 = r13.z
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r3 = r3.mod(r15)
            java.math.BigInteger r4 = r13.x
            java.math.BigInteger r4 = r4.add(r1)
            java.math.BigInteger r5 = r4.multiply(r4)
            java.math.BigInteger r5 = r5.mod(r15)
            java.math.BigInteger r5 = r5.subtract(r0)
            java.math.BigInteger r5 = r5.subtract(r2)
            java.math.BigInteger r6 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r5 = r5.multiply(r6)
            java.math.BigInteger r6 = com.google.crypto.tink.internal.EllipticCurvesUtil.THREE
            java.math.BigInteger r6 = r0.multiply(r6)
            java.math.BigInteger r7 = r14.multiply(r3)
            java.math.BigInteger r7 = r7.multiply(r3)
            java.math.BigInteger r7 = r7.mod(r15)
            java.math.BigInteger r6 = r6.add(r7)
            java.math.BigInteger r7 = r6.multiply(r6)
            java.math.BigInteger r7 = r7.mod(r15)
            java.math.BigInteger r8 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r8 = r5.multiply(r8)
            java.math.BigInteger r7 = r7.subtract(r8)
            java.math.BigInteger r7 = r7.mod(r15)
            r8 = r7
            java.math.BigInteger r9 = r5.subtract(r7)
            java.math.BigInteger r9 = r6.multiply(r9)
            java.math.BigInteger r9 = r9.mod(r15)
            java.math.BigInteger r10 = com.google.crypto.tink.internal.EllipticCurvesUtil.EIGHT
            java.math.BigInteger r10 = r2.multiply(r10)
            java.math.BigInteger r9 = r9.subtract(r10)
            java.math.BigInteger r9 = r9.mod(r15)
            java.math.BigInteger r10 = r13.y
            java.math.BigInteger r11 = r13.z
            java.math.BigInteger r10 = r10.add(r11)
            java.math.BigInteger r11 = r10.multiply(r10)
            java.math.BigInteger r11 = r11.mod(r15)
            java.math.BigInteger r11 = r11.subtract(r1)
            java.math.BigInteger r11 = r11.subtract(r3)
            java.math.BigInteger r11 = r11.mod(r15)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r12 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            r12.<init>(r8, r9, r11)
            return r12
    }

    public static java.math.BigInteger getModulus(java.security.spec.EllipticCurve r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECField r0 = r3.getField()
            boolean r1 = r0 instanceof java.security.spec.ECFieldFp
            if (r1 == 0) goto L10
            r1 = r0
            java.security.spec.ECFieldFp r1 = (java.security.spec.ECFieldFp) r1
            java.math.BigInteger r1 = r1.getP()
            return r1
        L10:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Only curves over prime order fields are supported"
            r1.<init>(r2)
            throw r1
    }

    private static java.security.spec.ECParameterSpec getNistCurveSpec(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = r17
            r0.<init>(r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            r3 = r18
            r2.<init>(r3)
            java.math.BigInteger r4 = new java.math.BigInteger
            java.lang.String r5 = "3"
            r4.<init>(r5)
            java.math.BigInteger r5 = r0.subtract(r4)
            java.math.BigInteger r6 = new java.math.BigInteger
            r7 = 16
            r8 = r19
            r6.<init>(r8, r7)
            java.math.BigInteger r9 = new java.math.BigInteger
            r10 = r20
            r9.<init>(r10, r7)
            java.math.BigInteger r11 = new java.math.BigInteger
            r12 = r21
            r11.<init>(r12, r7)
            r7 = 1
            java.security.spec.ECFieldFp r13 = new java.security.spec.ECFieldFp
            r13.<init>(r0)
            java.security.spec.EllipticCurve r14 = new java.security.spec.EllipticCurve
            r14.<init>(r13, r5, r6)
            java.security.spec.ECPoint r15 = new java.security.spec.ECPoint
            r15.<init>(r9, r11)
            r16 = r0
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            r1 = 1
            r0.<init>(r14, r15, r2, r1)
            return r0
    }

    private static java.security.spec.ECParameterSpec getNistP256Params() {
            java.lang.String r0 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296"
            java.lang.String r1 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5"
            java.lang.String r2 = "115792089210356248762697446949407573530086143415290314195533631308867097853951"
            java.lang.String r3 = "115792089210356248762697446949407573529996955224135760342422259061068512044369"
            java.lang.String r4 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    private static java.security.spec.ECParameterSpec getNistP384Params() {
            java.lang.String r0 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7"
            java.lang.String r1 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f"
            java.lang.String r2 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319"
            java.lang.String r3 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643"
            java.lang.String r4 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    private static java.security.spec.ECParameterSpec getNistP521Params() {
            java.lang.String r0 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66"
            java.lang.String r1 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650"
            java.lang.String r2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151"
            java.lang.String r3 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449"
            java.lang.String r4 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    public static boolean isNistEcParameterSpec(java.security.spec.ECParameterSpec r1) {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS
            boolean r0 = isSameEcParameterSpec(r1, r0)
            if (r0 != 0) goto L1b
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS
            boolean r0 = isSameEcParameterSpec(r1, r0)
            if (r0 != 0) goto L1b
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS
            boolean r0 = isSameEcParameterSpec(r1, r0)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    public static boolean isSameEcParameterSpec(java.security.spec.ECParameterSpec r2, java.security.spec.ECParameterSpec r3) {
            java.security.spec.EllipticCurve r0 = r2.getCurve()
            java.security.spec.EllipticCurve r1 = r3.getCurve()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.security.spec.ECPoint r0 = r2.getGenerator()
            java.security.spec.ECPoint r1 = r3.getGenerator()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.math.BigInteger r0 = r2.getOrder()
            java.math.BigInteger r1 = r3.getOrder()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            int r0 = r2.getCofactor()
            int r1 = r3.getCofactor()
            if (r0 != r1) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    public static java.security.spec.ECPoint multiplyByGenerator(java.math.BigInteger r8, java.security.spec.ECParameterSpec r9) throws java.security.GeneralSecurityException {
            boolean r0 = isNistEcParameterSpec(r9)
            if (r0 == 0) goto L70
            int r0 = r8.signum()
            r1 = 1
            if (r0 != r1) goto L68
            java.math.BigInteger r0 = r9.getOrder()
            int r0 = r8.compareTo(r0)
            if (r0 >= 0) goto L60
            java.security.spec.EllipticCurve r0 = r9.getCurve()
            java.security.spec.ECPoint r1 = r9.getGenerator()
            checkPointOnCurve(r1, r0)
            java.security.spec.EllipticCurve r2 = r9.getCurve()
            java.math.BigInteger r2 = r2.getA()
            java.math.BigInteger r3 = getModulus(r0)
            java.security.spec.ECPoint r4 = java.security.spec.ECPoint.POINT_INFINITY
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r4 = toJacobianEcPoint(r4, r3)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r5 = toJacobianEcPoint(r1, r3)
            int r6 = r8.bitLength()
        L3c:
            if (r6 < 0) goto L58
            boolean r7 = r8.testBit(r6)
            if (r7 == 0) goto L4d
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r4 = addJacobianPoints(r4, r5, r2, r3)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r5 = doubleJacobianPoint(r5, r2, r3)
            goto L55
        L4d:
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r5 = addJacobianPoints(r4, r5, r2, r3)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r4 = doubleJacobianPoint(r4, r2, r3)
        L55:
            int r6 = r6 + (-1)
            goto L3c
        L58:
            java.security.spec.ECPoint r6 = r4.toECPoint(r3)
            checkPointOnCurve(r6, r0)
            return r6
        L60:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "k must be smaller than the order of the generator"
            r0.<init>(r1)
            throw r0
        L68:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "k must be positive"
            r0.<init>(r1)
            throw r0
        L70:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "spec must be NIST P256, P384 or P521"
            r0.<init>(r1)
            throw r0
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint toJacobianEcPoint(java.security.spec.ECPoint r6, java.math.BigInteger r7) {
            java.security.spec.ECPoint r0 = java.security.spec.ECPoint.POINT_INFINITY
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r0
        Lb:
            java.math.BigInteger r0 = new java.math.BigInteger
            int r1 = r7.bitLength()
            int r1 = r1 + 8
            int r1 = r1 / 8
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r2 = 1
            r0.<init>(r2, r1)
            java.math.BigInteger r0 = r0.mod(r7)
            java.math.BigInteger r1 = r0.multiply(r0)
            java.math.BigInteger r1 = r1.mod(r7)
            java.math.BigInteger r2 = r1.multiply(r0)
            java.math.BigInteger r2 = r2.mod(r7)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r3 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            java.math.BigInteger r4 = r6.getAffineX()
            java.math.BigInteger r4 = r4.multiply(r1)
            java.math.BigInteger r4 = r4.mod(r7)
            java.math.BigInteger r5 = r6.getAffineY()
            java.math.BigInteger r5 = r5.multiply(r2)
            java.math.BigInteger r5 = r5.mod(r7)
            r3.<init>(r4, r5, r0)
            return r3
    }
}
