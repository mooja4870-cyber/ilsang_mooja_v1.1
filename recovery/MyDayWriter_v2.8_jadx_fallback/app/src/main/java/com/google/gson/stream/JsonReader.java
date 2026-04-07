package com.google.gson.stream;

/* JADX INFO: loaded from: classes.dex */
public class JsonReader implements java.io.Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer;
    private final java.io.Reader in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private java.lang.String peekedString;
    private int pos;
    private int[] stack;
    private int stackSize;


    static {
            com.google.gson.stream.JsonReader$1 r0 = new com.google.gson.stream.JsonReader$1
            r0.<init>()
            com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = r0
            return
    }

    public JsonReader(java.io.Reader r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.lenient = r0
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]
            r4.buffer = r1
            r4.pos = r0
            r4.limit = r0
            r4.lineNumber = r0
            r4.lineStart = r0
            r4.peeked = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.stack = r2
            r4.stackSize = r0
            int[] r0 = r4.stack
            int r2 = r4.stackSize
            int r3 = r2 + 1
            r4.stackSize = r3
            r3 = 6
            r0[r2] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.pathNames = r0
            int[] r0 = new int[r1]
            r4.pathIndices = r0
            if (r5 == 0) goto L36
            r4.in = r5
            return
        L36:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "in == null"
            r0.<init>(r1)
            throw r0
    }

    private void checkLenient() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.lenient
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r1.syntaxError(r0)
            throw r0
    }

    private void consumeNonExecutePrefix() throws java.io.IOException {
            r5 = this;
            r0 = 1
            r5.nextNonWhitespace(r0)
            int r1 = r5.pos
            int r1 = r1 - r0
            r5.pos = r1
            int r0 = r5.pos
            int r1 = r0 + 5
            int r2 = r5.limit
            r3 = 5
            if (r1 <= r2) goto L19
            boolean r1 = r5.fillBuffer(r3)
            if (r1 != 0) goto L19
            return
        L19:
            char[] r1 = r5.buffer
            char r2 = r1[r0]
            r4 = 41
            if (r2 != r4) goto L48
            int r2 = r0 + 1
            char r2 = r1[r2]
            r4 = 93
            if (r2 != r4) goto L48
            int r2 = r0 + 2
            char r2 = r1[r2]
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L48
            int r2 = r0 + 3
            char r2 = r1[r2]
            r4 = 39
            if (r2 != r4) goto L48
            int r2 = r0 + 4
            char r2 = r1[r2]
            r4 = 10
            if (r2 == r4) goto L42
            goto L48
        L42:
            int r2 = r5.pos
            int r2 = r2 + r3
            r5.pos = r2
            return
        L48:
            return
    }

    private boolean fillBuffer(int r7) throws java.io.IOException {
            r6 = this;
            char[] r0 = r6.buffer
            int r1 = r6.lineStart
            int r2 = r6.pos
            int r1 = r1 - r2
            r6.lineStart = r1
            int r1 = r6.limit
            int r2 = r6.pos
            r3 = 0
            if (r1 == r2) goto L1f
            int r1 = r6.limit
            int r2 = r6.pos
            int r1 = r1 - r2
            r6.limit = r1
            int r1 = r6.pos
            int r2 = r6.limit
            java.lang.System.arraycopy(r0, r1, r0, r3, r2)
            goto L21
        L1f:
            r6.limit = r3
        L21:
            r6.pos = r3
        L23:
            java.io.Reader r1 = r6.in
            int r2 = r6.limit
            int r4 = r0.length
            int r5 = r6.limit
            int r4 = r4 - r5
            int r1 = r1.read(r0, r2, r4)
            r2 = r1
            r4 = -1
            if (r1 == r4) goto L5d
            int r1 = r6.limit
            int r1 = r1 + r2
            r6.limit = r1
            int r1 = r6.lineNumber
            r4 = 1
            if (r1 != 0) goto L58
            int r1 = r6.lineStart
            if (r1 != 0) goto L58
            int r1 = r6.limit
            if (r1 <= 0) goto L58
            char r1 = r0[r3]
            r5 = 65279(0xfeff, float:9.1475E-41)
            if (r1 != r5) goto L58
            int r1 = r6.pos
            int r1 = r1 + r4
            r6.pos = r1
            int r1 = r6.lineStart
            int r1 = r1 + r4
            r6.lineStart = r1
            int r7 = r7 + 1
        L58:
            int r1 = r6.limit
            if (r1 < r7) goto L23
            return r4
        L5d:
            return r3
    }

    private boolean isLiteral(char r2) throws java.io.IOException {
            r1 = this;
            switch(r2) {
                case 9: goto L8;
                case 10: goto L8;
                case 12: goto L8;
                case 13: goto L8;
                case 32: goto L8;
                case 35: goto L5;
                case 44: goto L8;
                case 47: goto L5;
                case 58: goto L8;
                case 59: goto L5;
                case 61: goto L5;
                case 91: goto L8;
                case 92: goto L5;
                case 93: goto L8;
                case 123: goto L8;
                case 125: goto L8;
                default: goto L3;
            }
        L3:
            r0 = 1
            return r0
        L5:
            r1.checkLenient()
        L8:
            r0 = 0
            return r0
    }

    private int nextNonWhitespace(boolean r9) throws java.io.IOException {
            r8 = this;
            char[] r0 = r8.buffer
            int r1 = r8.pos
            int r2 = r8.limit
        L6:
            r3 = 1
            if (r1 != r2) goto L37
            r8.pos = r1
            boolean r4 = r8.fillBuffer(r3)
            if (r4 != 0) goto L33
        L12:
            if (r9 != 0) goto L16
            r3 = -1
            return r3
        L16:
            java.io.EOFException r3 = new java.io.EOFException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "End of input"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r8.locationString()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L33:
            int r1 = r8.pos
            int r2 = r8.limit
        L37:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L48
            int r5 = r8.lineNumber
            int r5 = r5 + r3
            r8.lineNumber = r5
            r8.lineStart = r4
            goto Lbb
        L48:
            r5 = 32
            if (r1 == r5) goto Lbb
            r5 = 13
            if (r1 == r5) goto Lbb
            r5 = 9
            if (r1 != r5) goto L55
            goto Lbb
        L55:
            r5 = 47
            if (r1 != r5) goto La5
            r8.pos = r4
            r5 = 2
            if (r4 != r2) goto L6f
            int r6 = r8.pos
            int r6 = r6 - r3
            r8.pos = r6
            boolean r6 = r8.fillBuffer(r5)
            int r7 = r8.pos
            int r7 = r7 + r3
            r8.pos = r7
            if (r6 != 0) goto L6f
            return r1
        L6f:
            r8.checkLenient()
            int r6 = r8.pos
            char r6 = r0[r6]
            switch(r6) {
                case 42: goto L89;
                case 47: goto L7a;
                default: goto L79;
            }
        L79:
            return r1
        L7a:
            int r5 = r8.pos
            int r5 = r5 + r3
            r8.pos = r5
            r8.skipToEndOfLine()
            int r3 = r8.pos
            int r2 = r8.limit
            r1 = r3
            goto L6
        L89:
            int r7 = r8.pos
            int r7 = r7 + r3
            r8.pos = r7
            java.lang.String r3 = "*/"
            boolean r3 = r8.skipTo(r3)
            if (r3 == 0) goto L9e
            int r3 = r8.pos
            int r3 = r3 + r5
            int r2 = r8.limit
            r1 = r3
            goto L6
        L9e:
            java.lang.String r3 = "Unterminated comment"
            java.io.IOException r3 = r8.syntaxError(r3)
            throw r3
        La5:
            r3 = 35
            if (r1 != r3) goto Lb8
            r8.pos = r4
            r8.checkLenient()
            r8.skipToEndOfLine()
            int r3 = r8.pos
            int r2 = r8.limit
            r1 = r3
            goto L6
        Lb8:
            r8.pos = r4
            return r1
        Lbb:
            r1 = r4
            goto L6
    }

    private java.lang.String nextQuotedValue(char r11) throws java.io.IOException {
            r10 = this;
            char[] r0 = r10.buffer
            r1 = 0
        L3:
            int r2 = r10.pos
            int r3 = r10.limit
            r4 = r2
        L8:
            r5 = 16
            r6 = 1
            if (r2 >= r3) goto L5f
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r11) goto L28
            r10.pos = r7
            int r5 = r7 - r4
            int r5 = r5 - r6
            if (r1 != 0) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r4, r5)
            return r6
        L20:
            r1.append(r0, r4, r5)
            java.lang.String r6 = r1.toString()
            return r6
        L28:
            r8 = 92
            if (r2 != r8) goto L52
            r10.pos = r7
            int r8 = r7 - r4
            int r8 = r8 - r6
            if (r1 != 0) goto L41
            int r6 = r8 + 1
            int r6 = r6 * 2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r5 = java.lang.Math.max(r6, r5)
            r9.<init>(r5)
            r1 = r9
        L41:
            r1.append(r0, r4, r8)
            char r5 = r10.readEscapeCharacter()
            r1.append(r5)
            int r5 = r10.pos
            int r3 = r10.limit
            r4 = r5
            r2 = r5
            goto L5e
        L52:
            r5 = 10
            if (r2 != r5) goto L5d
            int r5 = r10.lineNumber
            int r5 = r5 + r6
            r10.lineNumber = r5
            r10.lineStart = r7
        L5d:
            r2 = r7
        L5e:
            goto L8
        L5f:
            if (r1 != 0) goto L6f
            int r7 = r2 - r4
            int r7 = r7 * 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r5 = java.lang.Math.max(r7, r5)
            r8.<init>(r5)
            r1 = r8
        L6f:
            int r5 = r2 - r4
            r1.append(r0, r4, r5)
            r10.pos = r2
            boolean r5 = r10.fillBuffer(r6)
            if (r5 == 0) goto L7d
            goto L3
        L7d:
            java.lang.String r5 = "Unterminated string"
            java.io.IOException r5 = r10.syntaxError(r5)
            throw r5
    }

    private java.lang.String nextUnquotedValue() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.pos
            int r2 = r2 + r1
            int r3 = r5.limit
            if (r2 >= r3) goto L1a
            char[] r2 = r5.buffer
            int r3 = r5.pos
            int r3 = r3 + r1
            char r2 = r2[r3]
            switch(r2) {
                case 9: goto L19;
                case 10: goto L19;
                case 12: goto L19;
                case 13: goto L19;
                case 32: goto L19;
                case 35: goto L16;
                case 44: goto L19;
                case 47: goto L16;
                case 58: goto L19;
                case 59: goto L16;
                case 61: goto L16;
                case 91: goto L19;
                case 92: goto L16;
                case 93: goto L19;
                case 123: goto L19;
                case 125: goto L19;
                default: goto L13;
            }
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            r5.checkLenient()
        L19:
            goto L4b
        L1a:
            char[] r2 = r5.buffer
            int r2 = r2.length
            if (r1 >= r2) goto L28
            int r2 = r1 + 1
            boolean r2 = r5.fillBuffer(r2)
            if (r2 == 0) goto L4b
            goto L2
        L28:
            if (r0 != 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
            r0 = r2
        L36:
            char[] r2 = r5.buffer
            int r3 = r5.pos
            r0.append(r2, r3, r1)
            int r2 = r5.pos
            int r2 = r2 + r1
            r5.pos = r2
            r1 = 0
            r2 = 1
            boolean r2 = r5.fillBuffer(r2)
            if (r2 != 0) goto L2
        L4b:
            if (r0 != 0) goto L57
            java.lang.String r2 = new java.lang.String
            char[] r3 = r5.buffer
            int r4 = r5.pos
            r2.<init>(r3, r4, r1)
            goto L63
        L57:
            char[] r2 = r5.buffer
            int r3 = r5.pos
            java.lang.StringBuilder r2 = r0.append(r2, r3, r1)
            java.lang.String r2 = r2.toString()
        L63:
            int r3 = r5.pos
            int r3 = r3 + r1
            r5.pos = r3
            return r2
    }

    private int peekKeyword() throws java.io.IOException {
            r9 = this;
            char[] r0 = r9.buffer
            int r1 = r9.pos
            char r0 = r0[r1]
            r1 = 116(0x74, float:1.63E-43)
            r2 = 0
            if (r0 == r1) goto L2f
            r1 = 84
            if (r0 != r1) goto L10
            goto L2f
        L10:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L29
            r1 = 70
            if (r0 != r1) goto L19
            goto L29
        L19:
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L23
            r1 = 78
            if (r0 != r1) goto L22
            goto L23
        L22:
            return r2
        L23:
            java.lang.String r1 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L34
        L29:
            java.lang.String r1 = "false"
            java.lang.String r3 = "FALSE"
            r4 = 6
            goto L34
        L2f:
            java.lang.String r1 = "true"
            java.lang.String r3 = "TRUE"
            r4 = 5
        L34:
            int r5 = r1.length()
            r6 = 1
        L39:
            if (r6 >= r5) goto L62
            int r7 = r9.pos
            int r7 = r7 + r6
            int r8 = r9.limit
            if (r7 < r8) goto L4b
            int r7 = r6 + 1
            boolean r7 = r9.fillBuffer(r7)
            if (r7 != 0) goto L4b
            return r2
        L4b:
            char[] r7 = r9.buffer
            int r8 = r9.pos
            int r8 = r8 + r6
            char r0 = r7[r8]
            char r7 = r1.charAt(r6)
            if (r0 == r7) goto L5f
            char r7 = r3.charAt(r6)
            if (r0 == r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + 1
            goto L39
        L62:
            int r6 = r9.pos
            int r6 = r6 + r5
            int r7 = r9.limit
            if (r6 < r7) goto L71
            int r6 = r5 + 1
            boolean r6 = r9.fillBuffer(r6)
            if (r6 == 0) goto L7f
        L71:
            char[] r6 = r9.buffer
            int r7 = r9.pos
            int r7 = r7 + r5
            char r6 = r6[r7]
            boolean r6 = r9.isLiteral(r6)
            if (r6 == 0) goto L7f
            return r2
        L7f:
            int r2 = r9.pos
            int r2 = r2 + r5
            r9.pos = r2
            r9.peeked = r4
            return r4
    }

    private int peekNumber() throws java.io.IOException {
            r18 = this;
            r0 = r18
            char[] r1 = r0.buffer
            int r2 = r0.pos
            int r3 = r0.limit
            r4 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
        Le:
            int r10 = r2 + r9
            r13 = 4
            r14 = 2
            r15 = 0
            if (r10 != r3) goto L29
            int r10 = r1.length
            if (r9 != r10) goto L19
            return r15
        L19:
            int r10 = r9 + 1
            boolean r10 = r0.fillBuffer(r10)
            if (r10 != 0) goto L25
            r16 = 0
            goto La2
        L25:
            int r2 = r0.pos
            int r3 = r0.limit
        L29:
            int r10 = r2 + r9
            char r10 = r1[r10]
            r16 = 0
            r11 = 5
            switch(r10) {
                case 43: goto L54;
                case 45: goto L4a;
                case 46: goto L45;
                case 69: goto L3d;
                case 101: goto L3d;
                default: goto L33;
            }
        L33:
            r12 = 48
            if (r10 < r12) goto L9b
            r12 = 57
            if (r10 <= r12) goto L59
            goto L9b
        L3d:
            if (r8 == r14) goto L43
            if (r8 != r13) goto L42
            goto L43
        L42:
            return r15
        L43:
            r8 = 5
            goto L97
        L45:
            if (r8 != r14) goto L49
            r8 = 3
            goto L97
        L49:
            return r15
        L4a:
            if (r8 != 0) goto L4f
            r6 = 1
            r8 = 1
            goto L97
        L4f:
            if (r8 != r11) goto L53
            r8 = 6
            goto L97
        L53:
            return r15
        L54:
            if (r8 != r11) goto L58
            r8 = 6
            goto L97
        L58:
            return r15
        L59:
            r12 = 1
            if (r8 == r12) goto L92
            if (r8 != 0) goto L5f
            goto L92
        L5f:
            if (r8 != r14) goto L86
            int r11 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r11 != 0) goto L66
            return r15
        L66:
            r13 = 10
            long r13 = r13 * r4
            int r11 = r10 + (-48)
            r16 = r13
            long r12 = (long) r11
            long r13 = r16 - r12
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r16 > 0) goto L81
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 != 0) goto L82
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L82
        L81:
            r15 = 1
        L82:
            r7 = r7 & r15
            r4 = r13
            goto L97
        L86:
            r12 = 3
            if (r8 != r12) goto L8b
            r8 = 4
            goto L97
        L8b:
            if (r8 == r11) goto L90
            r11 = 6
            if (r8 != r11) goto L97
        L90:
            r8 = 7
            goto L97
        L92:
            int r11 = r10 + (-48)
            int r11 = -r11
            long r4 = (long) r11
            r8 = 2
        L97:
            int r9 = r9 + 1
            goto Le
        L9b:
            boolean r11 = r0.isLiteral(r10)
            if (r11 != 0) goto Ld5
        La2:
            if (r8 != r14) goto Lc5
            if (r7 == 0) goto Lc5
            r10 = -9223372036854775808
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 != 0) goto Lae
            if (r6 == 0) goto Lc5
        Lae:
            int r10 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r10 != 0) goto Lb4
            if (r6 != 0) goto Lc5
        Lb4:
            if (r6 == 0) goto Lb8
            r10 = r4
            goto Lb9
        Lb8:
            long r10 = -r4
        Lb9:
            r0.peekedLong = r10
            int r10 = r0.pos
            int r10 = r10 + r9
            r0.pos = r10
            r10 = 15
            r0.peeked = r10
            return r10
        Lc5:
            if (r8 == r14) goto Lce
            if (r8 == r13) goto Lce
            r10 = 7
            if (r8 != r10) goto Lcd
            goto Lce
        Lcd:
            return r15
        Lce:
            r0.peekedNumberLength = r9
            r10 = 16
            r0.peeked = r10
            return r10
        Ld5:
            return r15
    }

    private void push(int r4) {
            r3 = this;
            int r0 = r3.stackSize
            int[] r1 = r3.stack
            int r1 = r1.length
            if (r0 != r1) goto L25
            int r0 = r3.stackSize
            int r0 = r0 * 2
            int[] r1 = r3.stack
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.stack = r1
            int[] r1 = r3.pathIndices
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.pathIndices = r1
            java.lang.String[] r1 = r3.pathNames
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r3.pathNames = r1
        L25:
            int[] r0 = r3.stack
            int r1 = r3.stackSize
            int r2 = r1 + 1
            r3.stackSize = r2
            r0[r1] = r4
            return
    }

    private char readEscapeCharacter() throws java.io.IOException {
            r11 = this;
            int r0 = r11.pos
            int r1 = r11.limit
            java.lang.String r2 = "Unterminated escape sequence"
            r3 = 1
            if (r0 != r1) goto L15
            boolean r0 = r11.fillBuffer(r3)
            if (r0 == 0) goto L10
            goto L15
        L10:
            java.io.IOException r0 = r11.syntaxError(r2)
            throw r0
        L15:
            char[] r0 = r11.buffer
            int r1 = r11.pos
            int r4 = r1 + 1
            r11.pos = r4
            char r0 = r0[r1]
            r1 = 10
            switch(r0) {
                case 10: goto Lad;
                case 34: goto Lb6;
                case 39: goto Lb6;
                case 47: goto Lb6;
                case 92: goto Lb6;
                case 98: goto Laa;
                case 102: goto La7;
                case 110: goto La6;
                case 114: goto La3;
                case 116: goto La0;
                case 117: goto L2b;
                default: goto L24;
            }
        L24:
            java.lang.String r1 = "Invalid escape sequence"
            java.io.IOException r1 = r11.syntaxError(r1)
            throw r1
        L2b:
            int r3 = r11.pos
            r4 = 4
            int r3 = r3 + r4
            int r5 = r11.limit
            if (r3 <= r5) goto L3f
            boolean r3 = r11.fillBuffer(r4)
            if (r3 == 0) goto L3a
            goto L3f
        L3a:
            java.io.IOException r1 = r11.syntaxError(r2)
            throw r1
        L3f:
            r2 = 0
            int r3 = r11.pos
            int r5 = r3 + 4
        L44:
            if (r3 >= r5) goto L9a
            char[] r6 = r11.buffer
            char r6 = r6[r3]
            int r7 = r2 << 4
            char r2 = (char) r7
            r7 = 48
            if (r6 < r7) goto L5a
            r7 = 57
            if (r6 > r7) goto L5a
            int r7 = r6 + (-48)
            int r7 = r7 + r2
            char r2 = (char) r7
            goto L75
        L5a:
            r7 = 97
            if (r6 < r7) goto L68
            r7 = 102(0x66, float:1.43E-43)
            if (r6 > r7) goto L68
            int r7 = r6 + (-97)
            int r7 = r7 + r1
            int r7 = r7 + r2
            char r2 = (char) r7
            goto L75
        L68:
            r7 = 65
            if (r6 < r7) goto L78
            r7 = 70
            if (r6 > r7) goto L78
            int r7 = r6 + (-65)
            int r7 = r7 + r1
            int r7 = r7 + r2
            char r2 = (char) r7
        L75:
            int r3 = r3 + 1
            goto L44
        L78:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "\\u"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = new java.lang.String
            char[] r9 = r11.buffer
            int r10 = r11.pos
            r8.<init>(r9, r10, r4)
            java.lang.StringBuilder r4 = r7.append(r8)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L9a:
            int r1 = r11.pos
            int r1 = r1 + r4
            r11.pos = r1
            return r2
        La0:
            r1 = 9
            return r1
        La3:
            r1 = 13
            return r1
        La6:
            return r1
        La7:
            r1 = 12
            return r1
        Laa:
            r1 = 8
            return r1
        Lad:
            int r1 = r11.lineNumber
            int r1 = r1 + r3
            r11.lineNumber = r1
            int r1 = r11.pos
            r11.lineStart = r1
        Lb6:
            return r0
    }

    private void skipQuotedValue(char r7) throws java.io.IOException {
            r6 = this;
            char[] r0 = r6.buffer
        L2:
            int r1 = r6.pos
            int r2 = r6.limit
        L6:
            r3 = 1
            if (r1 >= r2) goto L2e
            int r4 = r1 + 1
            char r1 = r0[r1]
            if (r1 != r7) goto L12
            r6.pos = r4
            return
        L12:
            r5 = 92
            if (r1 != r5) goto L21
            r6.pos = r4
            r6.readEscapeCharacter()
            int r3 = r6.pos
            int r2 = r6.limit
            r1 = r3
            goto L2d
        L21:
            r5 = 10
            if (r1 != r5) goto L2c
            int r5 = r6.lineNumber
            int r5 = r5 + r3
            r6.lineNumber = r5
            r6.lineStart = r4
        L2c:
            r1 = r4
        L2d:
            goto L6
        L2e:
            r6.pos = r1
            boolean r1 = r6.fillBuffer(r3)
            if (r1 == 0) goto L37
            goto L2
        L37:
            java.lang.String r1 = "Unterminated string"
            java.io.IOException r1 = r6.syntaxError(r1)
            throw r1
    }

    private boolean skipTo(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.length()
        L4:
            int r1 = r5.pos
            int r1 = r1 + r0
            int r2 = r5.limit
            if (r1 <= r2) goto L14
            boolean r1 = r5.fillBuffer(r0)
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            char[] r1 = r5.buffer
            int r2 = r5.pos
            char r1 = r1[r2]
            r2 = 10
            r3 = 1
            if (r1 != r2) goto L2a
            int r1 = r5.lineNumber
            int r1 = r1 + r3
            r5.lineNumber = r1
            int r1 = r5.pos
            int r1 = r1 + r3
            r5.lineStart = r1
            goto L3b
        L2a:
            r1 = 0
        L2b:
            if (r1 >= r0) goto L44
            char[] r2 = r5.buffer
            int r4 = r5.pos
            int r4 = r4 + r1
            char r2 = r2[r4]
            char r4 = r6.charAt(r1)
            if (r2 == r4) goto L41
        L3b:
            int r1 = r5.pos
            int r1 = r1 + r3
            r5.pos = r1
            goto L4
        L41:
            int r1 = r1 + 1
            goto L2b
        L44:
            return r3
    }

    private void skipToEndOfLine() throws java.io.IOException {
            r4 = this;
        L1:
            int r0 = r4.pos
            int r1 = r4.limit
            r2 = 1
            if (r0 < r1) goto Le
            boolean r0 = r4.fillBuffer(r2)
            if (r0 == 0) goto L2b
        Le:
            char[] r0 = r4.buffer
            int r1 = r4.pos
            int r3 = r1 + 1
            r4.pos = r3
            char r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L26
            int r1 = r4.lineNumber
            int r1 = r1 + r2
            r4.lineNumber = r1
            int r1 = r4.pos
            r4.lineStart = r1
            goto L2b
        L26:
            r1 = 13
            if (r0 != r1) goto L2c
        L2b:
            return
        L2c:
            goto L1
    }

    private void skipUnquotedValue() throws java.io.IOException {
            r3 = this;
        L1:
            r0 = 0
        L2:
            int r1 = r3.pos
            int r1 = r1 + r0
            int r2 = r3.limit
            if (r1 >= r2) goto L1f
            char[] r1 = r3.buffer
            int r2 = r3.pos
            int r2 = r2 + r0
            char r1 = r1[r2]
            switch(r1) {
                case 9: goto L19;
                case 10: goto L19;
                case 12: goto L19;
                case 13: goto L19;
                case 32: goto L19;
                case 35: goto L16;
                case 44: goto L19;
                case 47: goto L16;
                case 58: goto L19;
                case 59: goto L16;
                case 61: goto L16;
                case 91: goto L19;
                case 92: goto L16;
                case 93: goto L19;
                case 123: goto L19;
                case 125: goto L19;
                default: goto L13;
            }
        L13:
            int r0 = r0 + 1
            goto L2
        L16:
            r3.checkLenient()
        L19:
            int r1 = r3.pos
            int r1 = r1 + r0
            r3.pos = r1
            return
        L1f:
            int r1 = r3.pos
            int r1 = r1 + r0
            r3.pos = r1
            r0 = 1
            boolean r0 = r3.fillBuffer(r0)
            if (r0 != 0) goto L1
            return
    }

    private java.io.IOException syntaxError(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.MalformedJsonException r0 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void beginArray() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 3
            if (r0 != r1) goto L1a
            r1 = 1
            r4.push(r1)
            int[] r2 = r4.pathIndices
            int r3 = r4.stackSize
            int r3 = r3 - r1
            r1 = 0
            r2[r3] = r1
            r4.peeked = r1
            return
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected BEGIN_ARRAY but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void beginObject() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r1 = 3
            r4.push(r1)
            r1 = 0
            r4.peeked = r1
            return
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected BEGIN_OBJECT but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.peeked = r0
            int[] r1 = r3.stack
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.stackSize = r0
            java.io.Reader r0 = r3.in
            r0.close()
            return
    }

    int doPeek() throws java.io.IOException {
            r10 = this;
            int[] r0 = r10.stack
            int r1 = r10.stackSize
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 8
            r3 = 3
            r4 = 7
            r5 = 4
            r6 = 2
            if (r0 != r2) goto L19
            int[] r7 = r10.stack
            int r8 = r10.stackSize
            int r8 = r8 - r2
            r7[r8] = r6
            goto L9e
        L19:
            if (r0 != r6) goto L32
            int r7 = r10.nextNonWhitespace(r2)
            switch(r7) {
                case 44: goto L2f;
                case 59: goto L2c;
                case 93: goto L29;
                default: goto L22;
            }
        L22:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r10.syntaxError(r1)
            throw r1
        L29:
            r10.peeked = r5
            return r5
        L2c:
            r10.checkLenient()
        L2f:
            goto L9e
        L32:
            r7 = 5
            if (r0 == r3) goto L108
            if (r0 != r7) goto L39
            goto L108
        L39:
            if (r0 != r5) goto L71
            int[] r8 = r10.stack
            int r9 = r10.stackSize
            int r9 = r9 - r2
            r8[r9] = r7
            int r7 = r10.nextNonWhitespace(r2)
            switch(r7) {
                case 58: goto L6f;
                case 61: goto L50;
                default: goto L49;
            }
        L49:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r10.syntaxError(r1)
            throw r1
        L50:
            r10.checkLenient()
            int r8 = r10.pos
            int r9 = r10.limit
            if (r8 < r9) goto L5f
            boolean r8 = r10.fillBuffer(r2)
            if (r8 == 0) goto L70
        L5f:
            char[] r8 = r10.buffer
            int r9 = r10.pos
            char r8 = r8[r9]
            r9 = 62
            if (r8 != r9) goto L70
            int r8 = r10.pos
            int r8 = r8 + r2
            r10.pos = r8
            goto L70
        L6f:
        L70:
            goto L9e
        L71:
            r7 = 6
            if (r0 != r7) goto L83
            boolean r7 = r10.lenient
            if (r7 == 0) goto L7b
            r10.consumeNonExecutePrefix()
        L7b:
            int[] r7 = r10.stack
            int r8 = r10.stackSize
            int r8 = r8 - r2
            r7[r8] = r4
            goto L9e
        L83:
            if (r0 != r4) goto L9b
            r7 = 0
            int r7 = r10.nextNonWhitespace(r7)
            r8 = -1
            if (r7 != r8) goto L92
            r1 = 17
            r10.peeked = r1
            return r1
        L92:
            r10.checkLenient()
            int r8 = r10.pos
            int r8 = r8 - r2
            r10.pos = r8
            goto L9d
        L9b:
            if (r0 == r1) goto L100
        L9d:
        L9e:
            int r7 = r10.nextNonWhitespace(r2)
            switch(r7) {
                case 34: goto Ld9;
                case 39: goto Ld3;
                case 44: goto Lbc;
                case 59: goto Lbc;
                case 91: goto Lb9;
                case 93: goto Lb4;
                case 123: goto Lb1;
                default: goto La5;
            }
        La5:
            int r1 = r10.pos
            int r1 = r1 - r2
            r10.pos = r1
            int r1 = r10.peekKeyword()
            if (r1 == 0) goto Lde
            return r1
        Lb1:
            r10.peeked = r2
            return r2
        Lb4:
            if (r0 != r2) goto Lbc
            r10.peeked = r5
            return r5
        Lb9:
            r10.peeked = r3
            return r3
        Lbc:
            if (r0 == r2) goto Lc8
            if (r0 != r6) goto Lc1
            goto Lc8
        Lc1:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r10.syntaxError(r1)
            throw r1
        Lc8:
            r10.checkLenient()
            int r1 = r10.pos
            int r1 = r1 - r2
            r10.pos = r1
            r10.peeked = r4
            return r4
        Ld3:
            r10.checkLenient()
            r10.peeked = r1
            return r1
        Ld9:
            r1 = 9
            r10.peeked = r1
            return r1
        Lde:
            int r1 = r10.peekNumber()
            if (r1 == 0) goto Le5
            return r1
        Le5:
            char[] r2 = r10.buffer
            int r3 = r10.pos
            char r2 = r2[r3]
            boolean r2 = r10.isLiteral(r2)
            if (r2 == 0) goto Lf9
            r10.checkLenient()
            r2 = 10
            r10.peeked = r2
            return r2
        Lf9:
            java.lang.String r2 = "Expected value"
            java.io.IOException r2 = r10.syntaxError(r2)
            throw r2
        L100:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L108:
            int[] r1 = r10.stack
            int r3 = r10.stackSize
            int r3 = r3 - r2
            r1[r3] = r5
            if (r0 != r7) goto L126
            int r1 = r10.nextNonWhitespace(r2)
            switch(r1) {
                case 44: goto L125;
                case 59: goto L122;
                case 125: goto L11f;
                default: goto L118;
            }
        L118:
            java.lang.String r2 = "Unterminated object"
            java.io.IOException r2 = r10.syntaxError(r2)
            throw r2
        L11f:
            r10.peeked = r6
            return r6
        L122:
            r10.checkLenient()
        L125:
        L126:
            int r1 = r10.nextNonWhitespace(r2)
            java.lang.String r3 = "Expected name"
            switch(r1) {
                case 34: goto L155;
                case 39: goto L14d;
                case 125: goto L143;
                default: goto L12f;
            }
        L12f:
            r10.checkLenient()
            int r4 = r10.pos
            int r4 = r4 - r2
            r10.pos = r4
            char r2 = (char) r1
            boolean r2 = r10.isLiteral(r2)
            if (r2 == 0) goto L15a
            r2 = 14
            r10.peeked = r2
            return r2
        L143:
            if (r0 == r7) goto L148
            r10.peeked = r6
            return r6
        L148:
            java.io.IOException r2 = r10.syntaxError(r3)
            throw r2
        L14d:
            r10.checkLenient()
            r2 = 12
            r10.peeked = r2
            return r2
        L155:
            r2 = 13
            r10.peeked = r2
            return r2
        L15a:
            java.io.IOException r2 = r10.syntaxError(r3)
            throw r2
    }

    public void endArray() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 4
            if (r0 != r1) goto L21
            int r1 = r4.stackSize
            int r1 = r1 + (-1)
            r4.stackSize = r1
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            r1 = 0
            r4.peeked = r1
            return
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected END_ARRAY but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void endObject() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 2
            if (r0 != r1) goto L28
            int r1 = r4.stackSize
            int r1 = r1 + (-1)
            r4.stackSize = r1
            java.lang.String[] r1 = r4.pathNames
            int r2 = r4.stackSize
            r3 = 0
            r1[r2] = r3
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            r1 = 0
            r4.peeked = r1
            return
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected END_OBJECT but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String getPath() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 36
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 0
            int r2 = r5.stackSize
        Le:
            if (r1 >= r2) goto L42
            int[] r3 = r5.stack
            r3 = r3[r1]
            switch(r3) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                default: goto L17;
            }
        L17:
            goto L3f
        L18:
            r3 = 46
            r0.append(r3)
            java.lang.String[] r3 = r5.pathNames
            r3 = r3[r1]
            if (r3 == 0) goto L3f
            java.lang.String[] r3 = r5.pathNames
            r3 = r3[r1]
            r0.append(r3)
            goto L3f
        L2b:
            r3 = 91
            java.lang.StringBuilder r3 = r0.append(r3)
            int[] r4 = r5.pathIndices
            r4 = r4[r1]
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 93
            r3.append(r4)
        L3f:
            int r1 = r1 + 1
            goto Le
        L42:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public boolean hasNext() throws java.io.IOException {
            r2 = this;
            int r0 = r2.peeked
            if (r0 != 0) goto L8
            int r0 = r2.doPeek()
        L8:
            r1 = 2
            if (r0 == r1) goto L10
            r1 = 4
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean isLenient() {
            r1 = this;
            boolean r0 = r1.lenient
            return r0
    }

    java.lang.String locationString() {
            r4 = this;
            int r0 = r4.lineNumber
            int r0 = r0 + 1
            int r1 = r4.pos
            int r2 = r4.lineStart
            int r1 = r1 - r2
            int r1 = r1 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " at line "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " column "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = " path "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.getPath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public boolean nextBoolean() throws java.io.IOException {
            r6 = this;
            int r0 = r6.peeked
            if (r0 != 0) goto L8
            int r0 = r6.doPeek()
        L8:
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            r6.peeked = r2
            int[] r1 = r6.pathIndices
            int r2 = r6.stackSize
            int r2 = r2 - r3
            r4 = r1[r2]
            int r4 = r4 + r3
            r1[r2] = r4
            return r3
        L1a:
            r1 = 6
            if (r0 != r1) goto L2a
            r6.peeked = r2
            int[] r1 = r6.pathIndices
            int r4 = r6.stackSize
            int r4 = r4 - r3
            r5 = r1[r4]
            int r5 = r5 + r3
            r1[r4] = r5
            return r2
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a boolean but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r6.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public double nextDouble() throws java.io.IOException {
            r7 = this;
            int r0 = r7.peeked
            if (r0 != 0) goto L8
            int r0 = r7.doPeek()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1f
            r7.peeked = r2
            int[] r1 = r7.pathIndices
            int r2 = r7.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            long r1 = r7.peekedLong
            double r1 = (double) r1
            return r1
        L1f:
            r1 = 16
            r3 = 11
            if (r0 != r1) goto L3a
            java.lang.String r1 = new java.lang.String
            char[] r4 = r7.buffer
            int r5 = r7.pos
            int r6 = r7.peekedNumberLength
            r1.<init>(r4, r5, r6)
            r7.peekedString = r1
            int r1 = r7.pos
            int r4 = r7.peekedNumberLength
            int r1 = r1 + r4
            r7.pos = r1
            goto L83
        L3a:
            r1 = 8
            if (r0 == r1) goto L76
            r4 = 9
            if (r0 != r4) goto L43
            goto L76
        L43:
            r1 = 10
            if (r0 != r1) goto L4e
            java.lang.String r1 = r7.nextUnquotedValue()
            r7.peekedString = r1
            goto L83
        L4e:
            if (r0 != r3) goto L51
            goto L83
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a double but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r7.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r7.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L76:
            if (r0 != r1) goto L7b
            r1 = 39
            goto L7d
        L7b:
            r1 = 34
        L7d:
            java.lang.String r1 = r7.nextQuotedValue(r1)
            r7.peekedString = r1
        L83:
            r7.peeked = r3
            java.lang.String r1 = r7.peekedString
            double r3 = java.lang.Double.parseDouble(r1)
            boolean r1 = r7.lenient
            if (r1 != 0) goto Lbd
            boolean r1 = java.lang.Double.isNaN(r3)
            if (r1 != 0) goto L9c
            boolean r1 = java.lang.Double.isInfinite(r3)
            if (r1 != 0) goto L9c
            goto Lbd
        L9c:
            com.google.gson.stream.MalformedJsonException r1 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "JSON forbids NaN and infinities: "
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r5 = r7.locationString()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lbd:
            r1 = 0
            r7.peekedString = r1
            r7.peeked = r2
            int[] r1 = r7.pathIndices
            int r2 = r7.stackSize
            int r2 = r2 + (-1)
            r5 = r1[r2]
            int r5 = r5 + 1
            r1[r2] = r5
            return r3
    }

    public int nextInt() throws java.io.IOException {
            r8 = this;
            int r0 = r8.peeked
            if (r0 != 0) goto L8
            int r0 = r8.doPeek()
        L8:
            r1 = 15
            java.lang.String r2 = "Expected an int but was "
            r3 = 0
            if (r0 != r1) goto L49
            long r4 = r8.peekedLong
            int r1 = (int) r4
            long r4 = r8.peekedLong
            long r6 = (long) r1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L28
            r8.peeked = r3
            int[] r2 = r8.pathIndices
            int r3 = r8.stackSize
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r1
        L28:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            long r4 = r8.peekedLong
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = r8.locationString()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L49:
            r1 = 16
            if (r0 != r1) goto L62
            java.lang.String r1 = new java.lang.String
            char[] r4 = r8.buffer
            int r5 = r8.pos
            int r6 = r8.peekedNumberLength
            r1.<init>(r4, r5, r6)
            r8.peekedString = r1
            int r1 = r8.pos
            int r4 = r8.peekedNumberLength
            int r1 = r1 + r4
            r8.pos = r1
            goto Lbf
        L62:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L92
            r5 = 9
            if (r0 == r5) goto L92
            if (r0 != r1) goto L6f
            goto L92
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            com.google.gson.stream.JsonToken r3 = r8.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r8.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L92:
            if (r0 != r1) goto L9b
            java.lang.String r1 = r8.nextUnquotedValue()
            r8.peekedString = r1
            goto La8
        L9b:
            if (r0 != r4) goto La0
            r1 = 39
            goto La2
        La0:
            r1 = 34
        La2:
            java.lang.String r1 = r8.nextQuotedValue(r1)
            r8.peekedString = r1
        La8:
            java.lang.String r1 = r8.peekedString     // Catch: java.lang.NumberFormatException -> Lbd
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lbd
            r8.peeked = r3     // Catch: java.lang.NumberFormatException -> Lbd
            int[] r4 = r8.pathIndices     // Catch: java.lang.NumberFormatException -> Lbd
            int r5 = r8.stackSize     // Catch: java.lang.NumberFormatException -> Lbd
            int r5 = r5 + (-1)
            r6 = r4[r5]     // Catch: java.lang.NumberFormatException -> Lbd
            int r6 = r6 + 1
            r4[r5] = r6     // Catch: java.lang.NumberFormatException -> Lbd
            return r1
        Lbd:
            r1 = move-exception
        Lbf:
            r1 = 11
            r8.peeked = r1
            java.lang.String r1 = r8.peekedString
            double r4 = java.lang.Double.parseDouble(r1)
            int r1 = (int) r4
            double r6 = (double) r1
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto Le1
            r2 = 0
            r8.peekedString = r2
            r8.peeked = r3
            int[] r2 = r8.pathIndices
            int r3 = r8.stackSize
            int r3 = r3 + (-1)
            r6 = r2[r3]
            int r6 = r6 + 1
            r2[r3] = r6
            return r1
        Le1:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r6 = r8.peekedString
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r6 = r8.locationString()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public long nextLong() throws java.io.IOException {
            r10 = this;
            int r0 = r10.peeked
            if (r0 != 0) goto L8
            int r0 = r10.doPeek()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1e
            r10.peeked = r2
            int[] r1 = r10.pathIndices
            int r2 = r10.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            long r1 = r10.peekedLong
            return r1
        L1e:
            r1 = 16
            java.lang.String r3 = "Expected a long but was "
            if (r0 != r1) goto L39
            java.lang.String r1 = new java.lang.String
            char[] r4 = r10.buffer
            int r5 = r10.pos
            int r6 = r10.peekedNumberLength
            r1.<init>(r4, r5, r6)
            r10.peekedString = r1
            int r1 = r10.pos
            int r4 = r10.peekedNumberLength
            int r1 = r1 + r4
            r10.pos = r1
            goto L96
        L39:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L69
            r5 = 9
            if (r0 == r5) goto L69
            if (r0 != r1) goto L46
            goto L69
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r10.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r10.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L69:
            if (r0 != r1) goto L72
            java.lang.String r1 = r10.nextUnquotedValue()
            r10.peekedString = r1
            goto L7f
        L72:
            if (r0 != r4) goto L77
            r1 = 39
            goto L79
        L77:
            r1 = 34
        L79:
            java.lang.String r1 = r10.nextQuotedValue(r1)
            r10.peekedString = r1
        L7f:
            java.lang.String r1 = r10.peekedString     // Catch: java.lang.NumberFormatException -> L94
            long r4 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L94
            r10.peeked = r2     // Catch: java.lang.NumberFormatException -> L94
            int[] r1 = r10.pathIndices     // Catch: java.lang.NumberFormatException -> L94
            int r6 = r10.stackSize     // Catch: java.lang.NumberFormatException -> L94
            int r6 = r6 + (-1)
            r7 = r1[r6]     // Catch: java.lang.NumberFormatException -> L94
            int r7 = r7 + 1
            r1[r6] = r7     // Catch: java.lang.NumberFormatException -> L94
            return r4
        L94:
            r1 = move-exception
        L96:
            r1 = 11
            r10.peeked = r1
            java.lang.String r1 = r10.peekedString
            double r4 = java.lang.Double.parseDouble(r1)
            long r6 = (long) r4
            double r8 = (double) r6
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto Lb8
            r1 = 0
            r10.peekedString = r1
            r10.peeked = r2
            int[] r1 = r10.pathIndices
            int r2 = r10.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            return r6
        Lb8:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r10.peekedString
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r10.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String nextName() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r1 = r4.nextUnquotedValue()
            goto L26
        L11:
            r1 = 12
            if (r0 != r1) goto L1c
            r1 = 39
            java.lang.String r1 = r4.nextQuotedValue(r1)
            goto L26
        L1c:
            r1 = 13
            if (r0 != r1) goto L32
            r1 = 34
            java.lang.String r1 = r4.nextQuotedValue(r1)
        L26:
            r2 = 0
            r4.peeked = r2
            java.lang.String[] r2 = r4.pathNames
            int r3 = r4.stackSize
            int r3 = r3 + (-1)
            r2[r3] = r1
            return r1
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a name but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void nextNull() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r1 = 0
            r4.peeked = r1
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            return
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected null but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String nextString() throws java.io.IOException {
            r5 = this;
            int r0 = r5.peeked
            if (r0 != 0) goto L8
            int r0 = r5.doPeek()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r1 = r5.nextUnquotedValue()
            goto L52
        L11:
            r1 = 8
            if (r0 != r1) goto L1c
            r1 = 39
            java.lang.String r1 = r5.nextQuotedValue(r1)
            goto L52
        L1c:
            r1 = 9
            if (r0 != r1) goto L27
            r1 = 34
            java.lang.String r1 = r5.nextQuotedValue(r1)
            goto L52
        L27:
            r1 = 11
            if (r0 != r1) goto L31
            java.lang.String r1 = r5.peekedString
            r2 = 0
            r5.peekedString = r2
            goto L52
        L31:
            r1 = 15
            if (r0 != r1) goto L3c
            long r1 = r5.peekedLong
            java.lang.String r1 = java.lang.Long.toString(r1)
            goto L52
        L3c:
            r1 = 16
            if (r0 != r1) goto L62
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.buffer
            int r3 = r5.pos
            int r4 = r5.peekedNumberLength
            r1.<init>(r2, r3, r4)
            int r2 = r5.pos
            int r3 = r5.peekedNumberLength
            int r2 = r2 + r3
            r5.pos = r2
        L52:
            r2 = 0
            r5.peeked = r2
            int[] r2 = r5.pathIndices
            int r3 = r5.stackSize
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r1
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a string but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = r5.peek()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
            r2 = this;
            int r0 = r2.peeked
            if (r0 != 0) goto L8
            int r0 = r2.doPeek()
        L8:
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L1a;
                case 12: goto L17;
                case 13: goto L17;
                case 14: goto L17;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L11:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT
            return r1
        L14:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            return r1
        L17:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME
            return r1
        L1a:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            return r1
        L1d:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            return r1
        L20:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN
            return r1
        L23:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY
            return r1
        L26:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            return r1
        L29:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT
            return r1
        L2c:
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            return r1
    }

    public final void setLenient(boolean r1) {
            r0 = this;
            r0.lenient = r1
            return
    }

    public void skipValue() throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.peeked
            if (r1 != 0) goto L9
            int r1 = r5.doPeek()
        L9:
            r2 = 3
            r3 = 1
            if (r1 != r2) goto L13
            r5.push(r3)
            int r0 = r0 + 1
            goto L67
        L13:
            if (r1 != r3) goto L1b
            r5.push(r2)
            int r0 = r0 + 1
            goto L67
        L1b:
            r2 = 4
            if (r1 != r2) goto L26
            int r2 = r5.stackSize
            int r2 = r2 - r3
            r5.stackSize = r2
            int r0 = r0 + (-1)
            goto L67
        L26:
            r2 = 2
            if (r1 != r2) goto L31
            int r2 = r5.stackSize
            int r2 = r2 - r3
            r5.stackSize = r2
            int r0 = r0 + (-1)
            goto L67
        L31:
            r2 = 14
            if (r1 == r2) goto L64
            r2 = 10
            if (r1 != r2) goto L3a
            goto L64
        L3a:
            r2 = 8
            if (r1 == r2) goto L5e
            r2 = 12
            if (r1 != r2) goto L43
            goto L5e
        L43:
            r2 = 9
            if (r1 == r2) goto L58
            r2 = 13
            if (r1 != r2) goto L4c
            goto L58
        L4c:
            r2 = 16
            if (r1 != r2) goto L67
            int r2 = r5.pos
            int r4 = r5.peekedNumberLength
            int r2 = r2 + r4
            r5.pos = r2
            goto L67
        L58:
            r2 = 34
            r5.skipQuotedValue(r2)
            goto L67
        L5e:
            r2 = 39
            r5.skipQuotedValue(r2)
            goto L67
        L64:
            r5.skipUnquotedValue()
        L67:
            r2 = 0
            r5.peeked = r2
            if (r0 != 0) goto L1
            int[] r1 = r5.pathIndices
            int r2 = r5.stackSize
            int r2 = r2 - r3
            r4 = r1[r2]
            int r4 = r4 + r3
            r1[r2] = r4
            java.lang.String[] r1 = r5.pathNames
            int r2 = r5.stackSize
            int r2 = r2 - r3
            java.lang.String r3 = "null"
            r1[r2] = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.locationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
