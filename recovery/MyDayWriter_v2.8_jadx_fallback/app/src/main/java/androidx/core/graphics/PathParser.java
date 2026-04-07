package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathParser {
    private static final java.lang.String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        PathDataNode(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.mType = r1
                r0.mParams = r2
                return
        }

        PathDataNode(androidx.core.graphics.PathParser.PathDataNode r4) {
                r3 = this;
                r3.<init>()
                char r0 = r4.mType
                r3.mType = r0
                float[] r0 = r4.mParams
                float[] r1 = r4.mParams
                int r1 = r1.length
                r2 = 0
                float[] r0 = androidx.core.graphics.PathParser.copyOfRange(r0, r2, r1)
                r3.mParams = r0
                return
        }

        static /* synthetic */ char access$000(androidx.core.graphics.PathParser.PathDataNode r1) {
                char r0 = r1.mType
                return r0
        }

        static /* synthetic */ char access$002(androidx.core.graphics.PathParser.PathDataNode r0, char r1) {
                r0.mType = r1
                return r1
        }

        static /* synthetic */ float[] access$100(androidx.core.graphics.PathParser.PathDataNode r1) {
                float[] r0 = r1.mParams
                return r0
        }

        static /* synthetic */ void access$200(android.graphics.Path r0, float[] r1, char r2, char r3, float[] r4) {
                addCommand(r0, r1, r2, r3, r4)
                return
        }

        private static void addCommand(android.graphics.Path r27, float[] r28, char r29, char r30, float[] r31) {
                r0 = r27
                r10 = r31
                r1 = 2
                r11 = 0
                r2 = r28[r11]
                r12 = 1
                r3 = r28[r12]
                r13 = 2
                r4 = r28[r13]
                r14 = 3
                r5 = r28[r14]
                r15 = 4
                r6 = r28[r15]
                r16 = 5
                r7 = r28[r16]
                switch(r30) {
                    case 65: goto L3b;
                    case 67: goto L37;
                    case 72: goto L33;
                    case 76: goto L2f;
                    case 77: goto L2f;
                    case 81: goto L2b;
                    case 83: goto L2b;
                    case 84: goto L2f;
                    case 86: goto L33;
                    case 90: goto L1e;
                    case 97: goto L3b;
                    case 99: goto L37;
                    case 104: goto L33;
                    case 108: goto L2f;
                    case 109: goto L2f;
                    case 113: goto L2b;
                    case 115: goto L2b;
                    case 116: goto L2f;
                    case 118: goto L33;
                    case 122: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r17 = r1
                goto L3e
            L1e:
                r0.close()
                r2 = r6
                r3 = r7
                r4 = r6
                r5 = r7
                r0.moveTo(r2, r3)
                r17 = r1
                goto L3e
            L2b:
                r1 = 4
                r17 = r1
                goto L3e
            L2f:
                r1 = 2
                r17 = r1
                goto L3e
            L33:
                r1 = 1
                r17 = r1
                goto L3e
            L37:
                r1 = 6
                r17 = r1
                goto L3e
            L3b:
                r1 = 7
                r17 = r1
            L3e:
                r1 = 0
                r8 = r1
                r9 = r2
                r18 = r3
                r19 = r4
                r20 = r5
                r21 = r6
                r22 = r7
                r7 = r29
            L4d:
                int r1 = r10.length
                if (r8 >= r1) goto L3fe
                r1 = 84
                r2 = 83
                r3 = 81
                r4 = 67
                r5 = 116(0x74, float:1.63E-43)
                r6 = 115(0x73, float:1.61E-43)
                r23 = r11
                r11 = 113(0x71, float:1.58E-43)
                r24 = r12
                r12 = 99
                r25 = 1073741824(0x40000000, float:2.0)
                r26 = r13
                r13 = 0
                switch(r30) {
                    case 65: goto L3a2;
                    case 67: goto L369;
                    case 72: goto L352;
                    case 76: goto L333;
                    case 77: goto L2fc;
                    case 81: goto L2c9;
                    case 83: goto L280;
                    case 84: goto L249;
                    case 86: goto L234;
                    case 97: goto L1da;
                    case 99: goto L19e;
                    case 104: goto L18b;
                    case 108: goto L16e;
                    case 109: goto L136;
                    case 113: goto L102;
                    case 115: goto Lbc;
                    case 116: goto L89;
                    case 118: goto L75;
                    default: goto L6c;
                }
            L6c:
                r11 = r7
                r1 = r9
                r2 = r18
                r18 = r8
                r1 = r2
                goto L3ee
            L75:
                int r1 = r8 + 0
                r1 = r10[r1]
                r0.rLineTo(r13, r1)
                int r1 = r8 + 0
                r1 = r10[r1]
                float r18 = r18 + r1
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L89:
                r2 = 0
                r4 = 0
                if (r7 == r11) goto L93
                if (r7 == r5) goto L93
                if (r7 == r3) goto L93
                if (r7 != r1) goto L97
            L93:
                float r2 = r9 - r19
                float r4 = r18 - r20
            L97:
                int r1 = r8 + 0
                r1 = r10[r1]
                int r3 = r8 + 1
                r3 = r10[r3]
                r0.rQuadTo(r2, r4, r1, r3)
                float r1 = r9 + r2
                float r3 = r18 + r4
                int r5 = r8 + 0
                r5 = r10[r5]
                float r9 = r9 + r5
                int r5 = r8 + 1
                r5 = r10[r5]
                float r18 = r18 + r5
                r19 = r1
                r20 = r3
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            Lbc:
                r1 = 0
                r3 = 0
                if (r7 == r12) goto Lc9
                if (r7 == r6) goto Lc9
                if (r7 == r4) goto Lc9
                if (r7 != r2) goto Lc7
                goto Lc9
            Lc7:
                r2 = r3
                goto Lce
            Lc9:
                float r1 = r9 - r19
                float r3 = r18 - r20
                r2 = r3
            Lce:
                int r3 = r8 + 0
                r3 = r10[r3]
                int r4 = r8 + 1
                r4 = r10[r4]
                int r5 = r8 + 2
                r5 = r10[r5]
                int r6 = r8 + 3
                r6 = r10[r6]
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                int r3 = r8 + 0
                r3 = r10[r3]
                float r3 = r3 + r9
                int r4 = r8 + 1
                r4 = r10[r4]
                float r4 = r18 + r4
                int r5 = r8 + 2
                r5 = r10[r5]
                float r9 = r9 + r5
                int r5 = r8 + 3
                r5 = r10[r5]
                float r18 = r18 + r5
                r19 = r3
                r20 = r4
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L102:
                int r1 = r8 + 0
                r1 = r10[r1]
                int r2 = r8 + 1
                r2 = r10[r2]
                int r3 = r8 + 2
                r3 = r10[r3]
                int r4 = r8 + 3
                r4 = r10[r4]
                r0.rQuadTo(r1, r2, r3, r4)
                int r1 = r8 + 0
                r1 = r10[r1]
                float r1 = r1 + r9
                int r2 = r8 + 1
                r2 = r10[r2]
                float r2 = r18 + r2
                int r3 = r8 + 2
                r3 = r10[r3]
                float r9 = r9 + r3
                int r3 = r8 + 3
                r3 = r10[r3]
                float r18 = r18 + r3
                r19 = r1
                r20 = r2
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L136:
                int r1 = r8 + 0
                r1 = r10[r1]
                float r9 = r9 + r1
                int r1 = r8 + 1
                r1 = r10[r1]
                float r18 = r18 + r1
                if (r8 <= 0) goto L155
                int r1 = r8 + 0
                r1 = r10[r1]
                int r2 = r8 + 1
                r2 = r10[r2]
                r0.rLineTo(r1, r2)
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L155:
                int r1 = r8 + 0
                r1 = r10[r1]
                int r2 = r8 + 1
                r2 = r10[r2]
                r0.rMoveTo(r1, r2)
                r1 = r9
                r2 = r18
                r21 = r1
                r22 = r2
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L16e:
                int r1 = r8 + 0
                r1 = r10[r1]
                int r2 = r8 + 1
                r2 = r10[r2]
                r0.rLineTo(r1, r2)
                int r1 = r8 + 0
                r1 = r10[r1]
                float r9 = r9 + r1
                int r1 = r8 + 1
                r1 = r10[r1]
                float r18 = r18 + r1
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L18b:
                int r1 = r8 + 0
                r1 = r10[r1]
                r0.rLineTo(r1, r13)
                int r1 = r8 + 0
                r1 = r10[r1]
                float r9 = r9 + r1
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L19e:
                int r1 = r8 + 0
                r1 = r10[r1]
                int r2 = r8 + 1
                r2 = r10[r2]
                int r3 = r8 + 2
                r3 = r10[r3]
                int r4 = r8 + 3
                r4 = r10[r4]
                int r5 = r8 + 4
                r5 = r10[r5]
                int r6 = r8 + 5
                r6 = r10[r6]
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                int r0 = r8 + 2
                r0 = r10[r0]
                float r0 = r0 + r9
                int r1 = r8 + 3
                r1 = r10[r1]
                float r1 = r18 + r1
                int r2 = r8 + 4
                r2 = r10[r2]
                float r9 = r9 + r2
                int r2 = r8 + 5
                r2 = r10[r2]
                float r18 = r18 + r2
                r19 = r0
                r20 = r1
                r11 = r7
                r1 = r18
                r18 = r8
                goto L3ee
            L1da:
                int r0 = r8 + 5
                r0 = r10[r0]
                float r3 = r0 + r9
                int r0 = r8 + 6
                r0 = r10[r0]
                float r4 = r0 + r18
                int r0 = r8 + 0
                r5 = r10[r0]
                int r0 = r8 + 1
                r6 = r10[r0]
                int r0 = r8 + 2
                r0 = r10[r0]
                int r1 = r8 + 3
                r1 = r10[r1]
                int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
                if (r1 == 0) goto L1fe
                r1 = r8
                r8 = r24
                goto L201
            L1fe:
                r1 = r8
                r8 = r23
            L201:
                int r2 = r1 + 4
                r2 = r10[r2]
                int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
                if (r2 == 0) goto L20e
                r2 = r1
                r1 = r9
                r9 = r24
                goto L212
            L20e:
                r2 = r1
                r1 = r9
                r9 = r23
            L212:
                r13 = r18
                r18 = r2
                r2 = r13
                r13 = r7
                r7 = r0
                r0 = r27
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r7 = r1
                r8 = r2
                int r1 = r18 + 5
                r1 = r10[r1]
                float r9 = r7 + r1
                int r1 = r18 + 6
                r1 = r10[r1]
                float r1 = r1 + r8
                r2 = r9
                r3 = r1
                r19 = r2
                r20 = r3
                r11 = r13
                goto L3ee
            L234:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                r0.lineTo(r7, r1)
                int r1 = r18 + 0
                r1 = r10[r1]
                r11 = r13
                goto L3ee
            L249:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                r2 = r7
                r4 = r8
                if (r13 == r11) goto L25a
                if (r13 == r5) goto L25a
                if (r13 == r3) goto L25a
                if (r13 != r1) goto L262
            L25a:
                float r9 = r7 * r25
                float r2 = r9 - r19
                float r1 = r8 * r25
                float r4 = r1 - r20
            L262:
                int r1 = r18 + 0
                r1 = r10[r1]
                int r3 = r18 + 1
                r3 = r10[r3]
                r0.quadTo(r2, r4, r1, r3)
                r1 = r2
                r3 = r4
                int r5 = r18 + 0
                r5 = r10[r5]
                int r6 = r18 + 1
                r6 = r10[r6]
                r19 = r1
                r20 = r3
                r9 = r5
                r1 = r6
                r11 = r13
                goto L3ee
            L280:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                r1 = r7
                r3 = r8
                if (r13 == r12) goto L294
                if (r13 == r6) goto L294
                if (r13 == r4) goto L294
                if (r13 != r2) goto L292
                goto L294
            L292:
                r2 = r3
                goto L29d
            L294:
                float r9 = r7 * r25
                float r1 = r9 - r19
                float r2 = r8 * r25
                float r3 = r2 - r20
                r2 = r3
            L29d:
                int r3 = r18 + 0
                r3 = r10[r3]
                int r4 = r18 + 1
                r4 = r10[r4]
                int r5 = r18 + 2
                r5 = r10[r5]
                int r6 = r18 + 3
                r6 = r10[r6]
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                int r3 = r18 + 0
                r3 = r10[r3]
                int r4 = r18 + 1
                r4 = r10[r4]
                int r5 = r18 + 2
                r5 = r10[r5]
                int r6 = r18 + 3
                r6 = r10[r6]
                r19 = r3
                r20 = r4
                r9 = r5
                r1 = r6
                r11 = r13
                goto L3ee
            L2c9:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                int r3 = r18 + 2
                r3 = r10[r3]
                int r4 = r18 + 3
                r4 = r10[r4]
                r0.quadTo(r1, r2, r3, r4)
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                int r3 = r18 + 2
                r3 = r10[r3]
                int r4 = r18 + 3
                r4 = r10[r4]
                r19 = r1
                r20 = r2
                r9 = r3
                r1 = r4
                r11 = r13
                goto L3ee
            L2fc:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                if (r18 <= 0) goto L31d
                int r8 = r18 + 0
                r3 = r10[r8]
                int r8 = r18 + 1
                r4 = r10[r8]
                r0.lineTo(r3, r4)
                r9 = r1
                r1 = r2
                r11 = r13
                goto L3ee
            L31d:
                int r8 = r18 + 0
                r3 = r10[r8]
                int r8 = r18 + 1
                r4 = r10[r8]
                r0.moveTo(r3, r4)
                r3 = r1
                r4 = r2
                r9 = r1
                r1 = r2
                r21 = r3
                r22 = r4
                r11 = r13
                goto L3ee
            L333:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                r0.lineTo(r1, r2)
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                r9 = r1
                r1 = r2
                r11 = r13
                goto L3ee
            L352:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                r0.lineTo(r1, r8)
                int r1 = r18 + 0
                r1 = r10[r1]
                r9 = r1
                r1 = r8
                r11 = r13
                goto L3ee
            L369:
                r13 = r18
                r18 = r8
                r8 = r13
                r13 = r7
                r7 = r9
                int r1 = r18 + 0
                r1 = r10[r1]
                int r2 = r18 + 1
                r2 = r10[r2]
                int r3 = r18 + 2
                r3 = r10[r3]
                int r4 = r18 + 3
                r4 = r10[r4]
                int r5 = r18 + 4
                r5 = r10[r5]
                int r6 = r18 + 5
                r6 = r10[r6]
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                int r0 = r18 + 4
                r0 = r10[r0]
                int r1 = r18 + 5
                r1 = r10[r1]
                int r8 = r18 + 2
                r2 = r10[r8]
                int r8 = r18 + 3
                r3 = r10[r8]
                r9 = r0
                r19 = r2
                r20 = r3
                r11 = r13
                goto L3ee
            L3a2:
                r11 = r18
                r18 = r8
                r8 = r11
                r11 = r7
                r7 = r9
                int r0 = r18 + 5
                r3 = r10[r0]
                int r0 = r18 + 6
                r4 = r10[r0]
                int r0 = r18 + 0
                r5 = r10[r0]
                int r0 = r18 + 1
                r6 = r10[r0]
                int r0 = r18 + 2
                r0 = r10[r0]
                int r1 = r18 + 3
                r1 = r10[r1]
                int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
                r2 = r8
                if (r1 == 0) goto L3c9
                r8 = r24
                goto L3cb
            L3c9:
                r8 = r23
            L3cb:
                int r1 = r18 + 4
                r1 = r10[r1]
                int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
                if (r1 == 0) goto L3d6
                r9 = r24
                goto L3d8
            L3d6:
                r9 = r23
            L3d8:
                r1 = r7
                r7 = r0
                r0 = r27
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                int r8 = r18 + 5
                r0 = r10[r8]
                int r8 = r18 + 6
                r1 = r10[r8]
                r2 = r0
                r3 = r1
                r9 = r0
                r19 = r2
                r20 = r3
            L3ee:
                r7 = r30
                int r8 = r18 + r17
                r0 = r27
                r18 = r1
                r11 = r23
                r12 = r24
                r13 = r26
                goto L4d
            L3fe:
                r1 = r9
                r23 = r11
                r24 = r12
                r26 = r13
                r2 = r18
                r28[r23] = r1
                r28[r24] = r2
                r28[r26] = r19
                r28[r14] = r20
                r28[r15] = r21
                r28[r16] = r22
                return
        }

        private static void arcToBezier(android.graphics.Path r58, double r59, double r61, double r63, double r65, double r67, double r69, double r71, double r73, double r75) {
                r0 = r63
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r75 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                r5 = r73
                double r7 = java.lang.Math.cos(r71)
                double r9 = java.lang.Math.sin(r71)
                double r11 = java.lang.Math.cos(r5)
                double r13 = java.lang.Math.sin(r5)
                r15 = r2
                double r2 = -r0
                double r2 = r2 * r7
                double r2 = r2 * r13
                double r17 = r65 * r9
                double r17 = r17 * r11
                double r2 = r2 - r17
                r17 = r2
                double r2 = -r0
                double r2 = r2 * r9
                double r2 = r2 * r13
                double r19 = r65 * r7
                double r19 = r19 * r11
                double r2 = r2 + r19
                r19 = r2
                double r2 = (double) r4
                double r2 = r75 / r2
                r21 = 0
                r23 = r5
                r25 = r15
                r15 = r21
                r5 = r67
                r21 = r17
                r17 = r69
            L4f:
                if (r15 >= r4) goto L109
                double r27 = r23 + r2
                double r29 = java.lang.Math.sin(r27)
                double r31 = java.lang.Math.cos(r27)
                double r33 = r0 * r7
                double r33 = r33 * r31
                double r33 = r59 + r33
                double r35 = r65 * r9
                double r35 = r35 * r29
                r37 = r2
                double r2 = r33 - r35
                double r33 = r0 * r9
                double r33 = r33 * r31
                double r33 = r61 + r33
                double r35 = r65 * r7
                double r35 = r35 * r29
                r16 = r4
                r67 = r5
                double r4 = r33 + r35
                r33 = r7
                double r6 = -r0
                double r6 = r6 * r33
                double r6 = r6 * r29
                double r35 = r65 * r9
                double r35 = r35 * r31
                double r6 = r6 - r35
                r69 = r6
                double r6 = -r0
                double r6 = r6 * r9
                double r6 = r6 * r29
                double r35 = r65 * r33
                double r35 = r35 * r31
                double r6 = r6 + r35
                double r35 = r27 - r23
                r39 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r35 / r39
                double r35 = java.lang.Math.tan(r35)
                double r39 = r27 - r23
                double r39 = java.lang.Math.sin(r39)
                r41 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r43 = r35 * r41
                double r43 = r43 * r35
                double r43 = r43 + r25
                double r43 = java.lang.Math.sqrt(r43)
                r45 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r43 = r43 - r45
                double r39 = r39 * r43
                double r39 = r39 / r41
                double r41 = r39 * r21
                double r0 = r67 + r41
                double r41 = r39 * r19
                r43 = r6
                double r6 = r17 + r41
                double r41 = r39 * r69
                r45 = r9
                double r8 = r2 - r41
                double r41 = r39 * r43
                r47 = r11
                double r10 = r4 - r41
                r12 = 0
                r41 = r13
                r13 = r58
                r13.rLineTo(r12, r12)
                float r12 = (float) r0
                float r14 = (float) r6
                r56 = r0
                float r0 = (float) r8
                float r1 = (float) r10
                r52 = r0
                float r0 = (float) r2
                r54 = r0
                float r0 = (float) r4
                r55 = r0
                r53 = r1
                r50 = r12
                r49 = r13
                r51 = r14
                r49.cubicTo(r50, r51, r52, r53, r54, r55)
                r23 = r27
                r0 = r2
                r17 = r4
                r21 = r69
                r19 = r43
                int r15 = r15 + 1
                r5 = r0
                r4 = r16
                r7 = r33
                r2 = r37
                r13 = r41
                r9 = r45
                r11 = r47
                r0 = r63
                goto L4f
            L109:
                return
        }

        private static void drawArc(android.graphics.Path r61, float r62, float r63, float r64, float r65, float r66, float r67, float r68, boolean r69, boolean r70) {
                r1 = r62
                r2 = r63
                r3 = r64
                r4 = r65
                r10 = r66
                r11 = r67
                r7 = r68
                double r5 = (double) r7
                double r25 = java.lang.Math.toRadians(r5)
                double r31 = java.lang.Math.cos(r25)
                double r33 = java.lang.Math.sin(r25)
                double r5 = (double) r1
                double r5 = r5 * r31
                double r8 = (double) r2
                double r8 = r8 * r33
                double r5 = r5 + r8
                double r8 = (double) r10
                double r35 = r5 / r8
                float r0 = -r1
                double r5 = (double) r0
                double r5 = r5 * r33
                double r8 = (double) r2
                double r8 = r8 * r31
                double r5 = r5 + r8
                double r8 = (double) r11
                double r37 = r5 / r8
                double r5 = (double) r3
                double r5 = r5 * r31
                double r8 = (double) r4
                double r8 = r8 * r33
                double r5 = r5 + r8
                double r8 = (double) r10
                double r39 = r5 / r8
                float r0 = -r3
                double r5 = (double) r0
                double r5 = r5 * r33
                double r8 = (double) r4
                double r8 = r8 * r31
                double r5 = r5 + r8
                double r8 = (double) r11
                double r41 = r5 / r8
                double r43 = r35 - r39
                double r45 = r37 - r41
                double r5 = r35 + r39
                r8 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r47 = r5 / r8
                double r5 = r37 + r41
                double r49 = r5 / r8
                double r5 = r43 * r43
                double r8 = r45 * r45
                double r12 = r5 + r8
                r5 = 0
                int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                java.lang.String r8 = "PathParser"
                if (r0 != 0) goto L67
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r8, r0)
                return
            L67:
                r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r14 = r14 / r12
                r16 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r51 = r14 - r16
                int r0 = (r51 > r5 ? 1 : (r51 == r5 ? 0 : -1))
                if (r0 >= 0) goto La1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "Points are too far apart "
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.StringBuilder r0 = r0.append(r12)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r8, r0)
                double r5 = java.lang.Math.sqrt(r12)
                r8 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r5 = r5 / r8
                float r14 = (float) r5
                float r5 = r10 * r14
                float r6 = r11 * r14
                r0 = r61
                r8 = r69
                r9 = r70
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            La1:
                r9 = r70
                double r3 = java.lang.Math.sqrt(r51)
                double r7 = r3 * r43
                double r53 = r3 * r45
                r0 = r69
                if (r0 != r9) goto Lb4
                double r14 = r47 - r53
                double r16 = r49 + r7
                goto Lb8
            Lb4:
                double r14 = r47 + r53
                double r16 = r49 - r7
            Lb8:
                r18 = r5
                double r5 = r37 - r16
                r55 = r3
                double r3 = r35 - r14
                double r27 = java.lang.Math.atan2(r5, r3)
                double r3 = r41 - r16
                double r5 = r39 - r14
                double r3 = java.lang.Math.atan2(r3, r5)
                double r5 = r3 - r27
                int r20 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r20 < 0) goto Ld5
                r20 = 1
                goto Ld7
            Ld5:
                r20 = 0
            Ld7:
                r0 = r20
                if (r9 == r0) goto Lee
                int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r0 <= 0) goto Le9
                double r5 = r5 - r18
                r29 = r5
                goto Lf0
            Le9:
                double r5 = r5 + r18
                r29 = r5
                goto Lf0
            Lee:
                r29 = r5
            Lf0:
                double r5 = (double) r10
                double r14 = r14 * r5
                double r5 = (double) r11
                double r16 = r16 * r5
                r5 = r14
                double r18 = r14 * r31
                double r20 = r16 * r33
                double r18 = r18 - r20
                double r14 = r5 * r33
                double r20 = r16 * r31
                double r15 = r14 + r20
                r57 = r3
                double r3 = (double) r10
                r20 = r3
                double r3 = (double) r11
                r22 = r3
                double r3 = (double) r1
                double r0 = (double) r2
                r59 = r12
                r12 = r61
                r13 = r18
                r17 = r20
                r19 = r22
                r23 = r0
                r21 = r3
                r0 = r59
                arcToBezier(r12, r13, r15, r17, r19, r21, r23, r25, r27, r29)
                return
        }

        @java.lang.Deprecated
        public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] r0, android.graphics.Path r1) {
                androidx.core.graphics.PathParser.nodesToPath(r0, r1)
                return
        }

        public float[] getParams() {
                r1 = this;
                float[] r0 = r1.mParams
                return r0
        }

        public char getType() {
                r1 = this;
                char r0 = r1.mType
                return r0
        }

        public void interpolatePathDataNode(androidx.core.graphics.PathParser.PathDataNode r5, androidx.core.graphics.PathParser.PathDataNode r6, float r7) {
                r4 = this;
                char r0 = r5.mType
                r4.mType = r0
                r0 = 0
            L5:
                float[] r1 = r5.mParams
                int r1 = r1.length
                if (r0 >= r1) goto L1f
                float[] r1 = r4.mParams
                float[] r2 = r5.mParams
                r2 = r2[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r2 = r2 * r3
                float[] r3 = r6.mParams
                r3 = r3[r0]
                float r3 = r3 * r7
                float r2 = r2 + r3
                r1[r0] = r2
                int r0 = r0 + 1
                goto L5
            L1f:
                return
        }
    }

    private PathParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addNode(java.util.ArrayList<androidx.core.graphics.PathParser.PathDataNode> r1, char r2, float[] r3) {
            androidx.core.graphics.PathParser$PathDataNode r0 = new androidx.core.graphics.PathParser$PathDataNode
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public static boolean canMorph(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            r0 = 0
            if (r4 == 0) goto L34
            if (r5 != 0) goto L6
            goto L34
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L32
            r2 = r4[r1]
            char r2 = androidx.core.graphics.PathParser.PathDataNode.access$000(r2)
            r3 = r5[r1]
            char r3 = androidx.core.graphics.PathParser.PathDataNode.access$000(r3)
            if (r2 != r3) goto L31
            r2 = r4[r1]
            float[] r2 = androidx.core.graphics.PathParser.PathDataNode.access$100(r2)
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = androidx.core.graphics.PathParser.PathDataNode.access$100(r3)
            int r3 = r3.length
            if (r2 == r3) goto L2e
            goto L31
        L2e:
            int r1 = r1 + 1
            goto Lc
        L31:
            return r0
        L32:
            r0 = 1
            return r0
        L34:
            return r0
    }

    static float[] copyOfRange(float[] r5, int r6, int r7) {
            if (r6 > r7) goto L1c
            int r0 = r5.length
            if (r6 < 0) goto L16
            if (r6 > r0) goto L16
            int r1 = r7 - r6
            int r2 = r0 - r6
            int r2 = java.lang.Math.min(r1, r2)
            float[] r3 = new float[r1]
            r4 = 0
            java.lang.System.arraycopy(r5, r6, r3, r4, r2)
            return r3
        L16:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>()
            throw r1
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData(java.lang.String r6) {
            r0 = 0
            r1 = 1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L7:
            int r3 = r6.length()
            r4 = 0
            if (r1 >= r3) goto L30
            int r1 = nextStart(r6, r1)
            java.lang.String r3 = r6.substring(r0, r1)
            java.lang.String r3 = r3.trim()
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L2b
            float[] r5 = getFloats(r3)
            char r4 = r3.charAt(r4)
            addNode(r2, r4, r5)
        L2b:
            r0 = r1
            int r1 = r1 + 1
            goto L7
        L30:
            int r3 = r1 - r0
            r5 = 1
            if (r3 != r5) goto L44
            int r3 = r6.length()
            if (r0 >= r3) goto L44
            char r3 = r6.charAt(r0)
            float[] r5 = new float[r4]
            addNode(r2, r3, r5)
        L44:
            androidx.core.graphics.PathParser$PathDataNode[] r3 = new androidx.core.graphics.PathParser.PathDataNode[r4]
            java.lang.Object[] r3 = r2.toArray(r3)
            androidx.core.graphics.PathParser$PathDataNode[] r3 = (androidx.core.graphics.PathParser.PathDataNode[]) r3
            return r3
    }

    public static android.graphics.Path createPathFromPathData(java.lang.String r6) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            androidx.core.graphics.PathParser$PathDataNode[] r1 = createNodesFromPathData(r6)
            androidx.core.graphics.PathParser.PathDataNode.nodesToPath(r1, r0)     // Catch: java.lang.RuntimeException -> Le
            return r0
        Le:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error in parsing "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] deepCopyNodes(androidx.core.graphics.PathParser.PathDataNode[] r4) {
            int r0 = r4.length
            androidx.core.graphics.PathParser$PathDataNode[] r0 = new androidx.core.graphics.PathParser.PathDataNode[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            androidx.core.graphics.PathParser$PathDataNode r2 = new androidx.core.graphics.PathParser$PathDataNode
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    private static void extract(java.lang.String r7, int r8, androidx.core.graphics.PathParser.ExtractFloatResult r9) {
            r0 = r8
            r1 = 0
            r2 = 0
            r9.mEndWithNegOrDot = r2
            r2 = 0
            r3 = 0
        L7:
            int r4 = r7.length()
            if (r0 >= r4) goto L32
            r4 = r3
            r3 = 0
            char r5 = r7.charAt(r0)
            r6 = 1
            switch(r5) {
                case 32: goto L2a;
                case 44: goto L2a;
                case 45: goto L22;
                case 46: goto L1a;
                case 69: goto L18;
                case 101: goto L18;
                default: goto L17;
            }
        L17:
            goto L2c
        L18:
            r3 = 1
            goto L2c
        L1a:
            if (r2 != 0) goto L1e
            r2 = 1
            goto L2c
        L1e:
            r1 = 1
            r9.mEndWithNegOrDot = r6
            goto L2c
        L22:
            if (r0 == r8) goto L2c
            if (r4 != 0) goto L2c
            r1 = 1
            r9.mEndWithNegOrDot = r6
            goto L2c
        L2a:
            r1 = 1
        L2c:
            if (r1 == 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + 1
            goto L7
        L32:
            r9.mEndPosition = r0
            return
    }

    private static float[] getFloats(java.lang.String r9) {
            r0 = 0
            char r1 = r9.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L69
            char r1 = r9.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L12
            goto L69
        L12:
            int r1 = r9.length()     // Catch: java.lang.NumberFormatException -> L49
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L49
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.core.graphics.PathParser$ExtractFloatResult r5 = new androidx.core.graphics.PathParser$ExtractFloatResult     // Catch: java.lang.NumberFormatException -> L49
            r5.<init>()     // Catch: java.lang.NumberFormatException -> L49
            int r6 = r9.length()     // Catch: java.lang.NumberFormatException -> L49
        L24:
            if (r3 >= r6) goto L44
            extract(r9, r3, r5)     // Catch: java.lang.NumberFormatException -> L49
            int r7 = r5.mEndPosition     // Catch: java.lang.NumberFormatException -> L49
            r4 = r7
            if (r3 >= r4) goto L3b
            int r7 = r2 + 1
            java.lang.String r8 = r9.substring(r3, r4)     // Catch: java.lang.NumberFormatException -> L49
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L49
            r1[r2] = r8     // Catch: java.lang.NumberFormatException -> L49
            r2 = r7
        L3b:
            boolean r7 = r5.mEndWithNegOrDot     // Catch: java.lang.NumberFormatException -> L49
            if (r7 == 0) goto L41
            r3 = r4
            goto L24
        L41:
            int r3 = r4 + 1
            goto L24
        L44:
            float[] r0 = copyOfRange(r1, r0, r2)     // Catch: java.lang.NumberFormatException -> L49
            return r0
        L49:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L69:
            float[] r0 = new float[r0]
            return r0
    }

    public static void interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] r2, float r3, androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            boolean r0 = interpolatePathDataNodes(r2, r4, r5, r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't interpolate between two incompatible pathData"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public static boolean interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5, androidx.core.graphics.PathParser.PathDataNode[] r6, float r7) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L22
            int r0 = r5.length
            int r1 = r6.length
            if (r0 != r1) goto L22
            boolean r0 = canMorph(r5, r6)
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = 0
        L11:
            int r1 = r4.length
            if (r0 >= r1) goto L20
            r1 = r4[r0]
            r2 = r5[r0]
            r3 = r6[r0]
            r1.interpolatePathDataNode(r2, r3, r7)
            int r0 = r0 + 1
            goto L11
        L20:
            r0 = 1
            return r0
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The nodes to be interpolated and resulting nodes must have the same length"
            r0.<init>(r1)
            throw r0
    }

    private static int nextStart(java.lang.String r3, int r4) {
        L1:
            int r0 = r3.length()
            if (r4 >= r0) goto L25
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L19
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L22
        L19:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L22
            r1 = 69
            if (r0 == r1) goto L22
            return r4
        L22:
            int r4 = r4 + 1
            goto L1
        L25:
            return r4
    }

    public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] r7, android.graphics.Path r8) {
            r0 = 6
            float[] r0 = new float[r0]
            r1 = 109(0x6d, float:1.53E-43)
            int r2 = r7.length
            r3 = 0
        L7:
            if (r3 >= r2) goto L1d
            r4 = r7[r3]
            char r5 = androidx.core.graphics.PathParser.PathDataNode.access$000(r4)
            float[] r6 = androidx.core.graphics.PathParser.PathDataNode.access$100(r4)
            androidx.core.graphics.PathParser.PathDataNode.access$200(r8, r0, r1, r5, r6)
            char r1 = androidx.core.graphics.PathParser.PathDataNode.access$000(r4)
            int r3 = r3 + 1
            goto L7
        L1d:
            return
    }

    public static void updateNodes(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L2f
            r1 = r4[r0]
            r2 = r5[r0]
            char r2 = androidx.core.graphics.PathParser.PathDataNode.access$000(r2)
            androidx.core.graphics.PathParser.PathDataNode.access$002(r1, r2)
            r1 = 0
        L10:
            r2 = r5[r0]
            float[] r2 = androidx.core.graphics.PathParser.PathDataNode.access$100(r2)
            int r2 = r2.length
            if (r1 >= r2) goto L2c
            r2 = r4[r0]
            float[] r2 = androidx.core.graphics.PathParser.PathDataNode.access$100(r2)
            r3 = r5[r0]
            float[] r3 = androidx.core.graphics.PathParser.PathDataNode.access$100(r3)
            r3 = r3[r1]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L2c:
            int r0 = r0 + 1
            goto L1
        L2f:
            return
    }
}
