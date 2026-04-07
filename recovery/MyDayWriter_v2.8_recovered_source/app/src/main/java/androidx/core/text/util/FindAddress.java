package androidx.core.text.util;

/* JADX INFO: loaded from: classes.dex */
class FindAddress {
    private static final java.lang.String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final java.lang.String HOUSE_END = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final java.lang.String HOUSE_POST_DELIM = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String HOUSE_PRE_DELIM = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final java.lang.String NL = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String SP = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final java.lang.String WORD_DELIM = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String WORD_END = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final java.lang.String WS = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int kMaxAddressNameWordLength = 25;
    private static final java.util.regex.Pattern sHouseNumberRe = null;
    private static final java.util.regex.Pattern sLocationNameRe = null;
    private static final java.util.regex.Pattern sStateRe = null;
    private static final androidx.core.text.util.FindAddress.ZipRange[] sStateZipCodeRanges = null;
    private static final java.util.regex.Pattern sSuffixedNumberRe = null;
    private static final java.util.regex.Pattern sWordRe = null;
    private static final java.util.regex.Pattern sZipCodeRe = null;

    private static class ZipRange {
        int mException1;
        int mException2;
        int mHigh;
        int mLow;

        ZipRange(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mLow = r1
                r0.mHigh = r2
                r0.mException1 = r3
                r0.mException2 = r4
                return
        }

        boolean matches(java.lang.String r4) {
                r3 = this;
                r0 = 2
                r1 = 0
                java.lang.String r0 = r4.substring(r1, r0)
                int r0 = java.lang.Integer.parseInt(r0)
                int r2 = r3.mLow
                if (r2 > r0) goto L12
                int r2 = r3.mHigh
                if (r0 <= r2) goto L1a
            L12:
                int r2 = r3.mException1
                if (r0 == r2) goto L1a
                int r2 = r3.mException2
                if (r0 != r2) goto L1b
            L1a:
                r1 = 1
            L1b:
                return r1
        }
    }

    static {
            r0 = 59
            androidx.core.text.util.FindAddress$ZipRange[] r0 = new androidx.core.text.util.FindAddress.ZipRange[r0]
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 99
            r3 = -1
            r1.<init>(r2, r2, r3, r3)
            r4 = 0
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 35
            r6 = 36
            r1.<init>(r5, r6, r3, r3)
            r5 = 1
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r6 = 71
            r7 = 72
            r1.<init>(r6, r7, r3, r3)
            r6 = 2
            r0[r6] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r7 = 96
            r1.<init>(r7, r7, r3, r3)
            r8 = 3
            r0[r8] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r9 = 85
            r10 = 86
            r1.<init>(r9, r10, r3, r3)
            r9 = 4
            r0[r9] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r10 = 90
            r1.<init>(r10, r7, r3, r3)
            r10 = 5
            r0[r10] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r11 = 80
            r12 = 81
            r1.<init>(r11, r12, r3, r3)
            r11 = 6
            r0[r11] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r11, r11, r3, r3)
            r12 = 7
            r0[r12] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r12 = 20
            r1.<init>(r12, r12, r3, r3)
            r13 = 8
            r0[r13] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r13 = 19
            r1.<init>(r13, r13, r3, r3)
            r14 = 9
            r0[r14] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 32
            r2 = 34
            r1.<init>(r15, r2, r3, r3)
            r2 = 10
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r2 = 11
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 30
            r15 = 31
            r1.<init>(r2, r15, r3, r3)
            r2 = 12
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r2 = 13
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r2 = 14
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 50
            r15 = 52
            r1.<init>(r2, r15, r3, r3)
            r2 = 15
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 83
            r1.<init>(r2, r2, r3, r3)
            r15 = 16
            r0[r15] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 60
            r2 = 62
            r1.<init>(r15, r2, r3, r3)
            r2 = 17
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 46
            r15 = 47
            r1.<init>(r2, r15, r3, r3)
            r2 = 18
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 67
            r15 = 73
            r10 = 66
            r1.<init>(r10, r2, r15, r3)
            r0[r13] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 40
            r10 = 42
            r1.<init>(r2, r10, r3, r3)
            r0[r12] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 70
            r10 = 71
            r1.<init>(r2, r10, r3, r3)
            r2 = 21
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r5, r6, r3, r3)
            r2 = 22
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 21
            r1.<init>(r12, r2, r3, r3)
            r2 = 23
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r8, r9, r3, r3)
            r2 = 24
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r5 = 25
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 48
            r10 = 49
            r1.<init>(r5, r10, r3, r3)
            r5 = 26
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 55
            r10 = 56
            r1.<init>(r5, r10, r3, r3)
            r15 = 27
            r0[r15] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 63
            r2 = 65
            r1.<init>(r15, r2, r3, r3)
            r2 = 28
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r2 = 29
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 39
            r12 = 38
            r1.<init>(r12, r15, r3, r3)
            r15 = 30
            r0[r15] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r5, r10, r3, r3)
            r15 = 31
            r0[r15] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 27
            r16 = r5
            r5 = 28
            r1.<init>(r15, r5, r3, r3)
            r5 = 32
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 58
            r1.<init>(r5, r5, r3, r3)
            r15 = 33
            r0[r15] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 68
            r17 = r5
            r5 = 69
            r1.<init>(r15, r5, r3, r3)
            r5 = 34
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r8, r9, r3, r3)
            r5 = 35
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 7
            r8 = 8
            r1.<init>(r5, r8, r3, r3)
            r5 = 36
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 86
            r8 = 87
            r9 = 88
            r1.<init>(r8, r9, r5, r3)
            r5 = 37
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 89
            r1.<init>(r9, r5, r7, r3)
            r0[r12] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 10
            r8 = 14
            r1.<init>(r5, r8, r4, r11)
            r5 = 39
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 43
            r8 = 45
            r1.<init>(r5, r8, r3, r3)
            r5 = 40
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 73
            r8 = 74
            r1.<init>(r5, r8, r3, r3)
            r5 = 41
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 97
            r8 = 97
            r1.<init>(r5, r8, r3, r3)
            r5 = 42
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r5 = 15
            r1.<init>(r5, r13, r3, r3)
            r5 = 43
            r0[r5] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r11, r11, r4, r14)
            r4 = 44
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r7, r7, r3, r3)
            r4 = 45
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r6, r6, r3, r3)
            r4 = 46
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r2, r2, r3, r3)
            r2 = 47
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 57
            r1.<init>(r2, r2, r3, r3)
            r4 = 48
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 37
            r1.<init>(r4, r12, r3, r3)
            r4 = 49
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 79
            r5 = 87
            r7 = 75
            r1.<init>(r7, r4, r5, r9)
            r4 = 50
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 84
            r5 = 84
            r1.<init>(r4, r5, r3, r3)
            r4 = 51
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 22
            r5 = 20
            r7 = 24
            r1.<init>(r4, r7, r5, r3)
            r4 = 52
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r1.<init>(r11, r14, r3, r3)
            r4 = 53
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 5
            r1.<init>(r4, r4, r3, r3)
            r4 = 54
            r0[r4] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 98
            r5 = 99
            r1.<init>(r4, r5, r3, r3)
            r0[r16] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 53
            r5 = 54
            r1.<init>(r4, r5, r3, r3)
            r0[r10] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 26
            r7 = 24
            r1.<init>(r7, r4, r3, r3)
            r0[r2] = r1
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 82
            r4 = 83
            r1.<init>(r2, r4, r3, r3)
            r0[r17] = r1
            androidx.core.text.util.FindAddress.sStateZipCodeRanges = r0
            java.lang.String r0 = "[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sWordRe = r0
            java.lang.String r0 = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sHouseNumberRe = r0
            java.lang.String r0 = "(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sStateRe = r0
            java.lang.String r0 = "(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sLocationNameRe = r0
            java.lang.String r0 = "([0-9]+)(st|nd|rd|th)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sSuffixedNumberRe = r0
            java.lang.String r0 = "(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            androidx.core.text.util.FindAddress.sZipCodeRe = r0
            return
    }

    private FindAddress() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int attemptMatch(java.lang.String r13, java.util.regex.MatchResult r14) {
            r0 = -1
            r1 = -1
            int r2 = r14.end()
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 1
            java.lang.String r7 = ""
            java.util.regex.Pattern r8 = androidx.core.text.util.FindAddress.sWordRe
            java.util.regex.Matcher r8 = r8.matcher(r13)
        L12:
            int r9 = r13.length()
            if (r2 >= r9) goto Ld6
            boolean r9 = r8.find(r2)
            if (r9 != 0) goto L24
            int r9 = r13.length()
            int r9 = -r9
            return r9
        L24:
            int r9 = r8.end()
            int r10 = r8.start()
            int r9 = r9 - r10
            r10 = 25
            if (r9 <= r10) goto L37
            int r9 = r8.end()
            int r9 = -r9
            return r9
        L37:
            int r9 = r8.start()
            r10 = -1
            if (r2 >= r9) goto L50
            int r9 = r2 + 1
            char r2 = r13.charAt(r2)
            java.lang.String r11 = "\n\u000b\f\r\u0085\u2028\u2029"
            int r2 = r11.indexOf(r2)
            if (r2 == r10) goto L4e
            int r3 = r3 + 1
        L4e:
            r2 = r9
            goto L37
        L50:
            r9 = 5
            if (r3 <= r9) goto L55
            goto Ld6
        L55:
            int r6 = r6 + 1
            r11 = 14
            if (r6 <= r11) goto L5d
            goto Ld6
        L5d:
            java.util.regex.MatchResult r11 = matchHouseNumber(r13, r2)
            r12 = 0
            if (r11 == 0) goto L6f
            if (r4 == 0) goto L6b
            r9 = 1
            if (r3 <= r9) goto L6b
            int r9 = -r2
            return r9
        L6b:
            if (r0 != r10) goto Lcc
            r0 = r2
            goto Lcc
        L6f:
            r4 = 0
            java.lang.String r10 = r8.group(r12)
            boolean r10 = isValidLocationName(r10)
            if (r10 == 0) goto L7c
            r5 = 1
            goto Lcc
        L7c:
            if (r6 != r9) goto L85
            if (r5 != 0) goto L85
            int r2 = r8.end()
            goto Ld6
        L85:
            if (r5 == 0) goto Lcc
            r9 = 4
            if (r6 <= r9) goto Lcc
            java.util.regex.MatchResult r9 = matchState(r13, r2)
            if (r9 == 0) goto Lcc
            java.lang.String r10 = "et"
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto La9
            java.lang.String r10 = r9.group(r12)
            java.lang.String r11 = "al"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto La9
            int r2 = r9.end()
            goto Ld6
        La9:
            java.util.regex.Pattern r10 = androidx.core.text.util.FindAddress.sWordRe
            java.util.regex.Matcher r10 = r10.matcher(r13)
            int r11 = r9.end()
            boolean r11 = r10.find(r11)
            if (r11 == 0) goto Lc8
            java.lang.String r11 = r10.group(r12)
            boolean r11 = isValidZipCode(r11, r9)
            if (r11 == 0) goto Lcc
            int r11 = r10.end()
            return r11
        Lc8:
            int r1 = r9.end()
        Lcc:
            java.lang.String r7 = r8.group(r12)
            int r2 = r8.end()
            goto L12
        Ld6:
            if (r1 <= 0) goto Ld9
            return r1
        Ld9:
            if (r0 <= 0) goto Ldd
            r9 = r0
            goto Lde
        Ldd:
            r9 = r2
        Lde:
            int r9 = -r9
            return r9
    }

    private static boolean checkHouseNumber(java.lang.String r7) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r7.length()
            if (r1 >= r2) goto L17
            char r2 = r7.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 == 0) goto L14
            int r0 = r0 + 1
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            r1 = 5
            r2 = 0
            if (r0 <= r1) goto L1c
            return r2
        L1c:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sSuffixedNumberRe
            java.util.regex.Matcher r1 = r1.matcher(r7)
            boolean r3 = r1.find()
            r4 = 1
            if (r3 == 0) goto L77
            java.lang.String r3 = r1.group(r4)
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 != 0) goto L34
            return r2
        L34:
            r2 = 2
            java.lang.String r2 = r1.group(r2)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.toLowerCase(r4)
            int r4 = r3 % 10
            java.lang.String r5 = "th"
            switch(r4) {
                case 1: goto L69;
                case 2: goto L5b;
                case 3: goto L4d;
                default: goto L48;
            }
        L48:
            boolean r4 = r2.equals(r5)
            return r4
        L4d:
            int r4 = r3 % 100
            r6 = 13
            if (r4 != r6) goto L54
            goto L56
        L54:
            java.lang.String r5 = "rd"
        L56:
            boolean r4 = r2.equals(r5)
            return r4
        L5b:
            int r4 = r3 % 100
            r6 = 12
            if (r4 != r6) goto L62
            goto L64
        L62:
            java.lang.String r5 = "nd"
        L64:
            boolean r4 = r2.equals(r5)
            return r4
        L69:
            int r4 = r3 % 100
            r6 = 11
            if (r4 != r6) goto L70
            goto L72
        L70:
            java.lang.String r5 = "st"
        L72:
            boolean r4 = r2.equals(r5)
            return r4
        L77:
            return r4
    }

    static java.lang.String findAddress(java.lang.String r4) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sHouseNumberRe
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r1 = 0
        L7:
            boolean r2 = r0.find(r1)
            if (r2 == 0) goto L2e
            r2 = 0
            java.lang.String r2 = r0.group(r2)
            boolean r2 = checkHouseNumber(r2)
            if (r2 == 0) goto L29
            int r1 = r0.start()
            int r2 = attemptMatch(r4, r0)
            if (r2 <= 0) goto L27
            java.lang.String r3 = r4.substring(r1, r2)
            return r3
        L27:
            int r1 = -r2
            goto L7
        L29:
            int r1 = r0.end()
            goto L7
        L2e:
            r2 = 0
            return r2
    }

    public static boolean isValidLocationName(java.lang.String r1) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sLocationNameRe
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
    }

    public static boolean isValidZipCode(java.lang.String r1) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sZipCodeRe
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
    }

    public static boolean isValidZipCode(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            java.util.regex.MatchResult r0 = matchState(r2, r0)
            boolean r0 = isValidZipCode(r1, r0)
            return r0
    }

    private static boolean isValidZipCode(java.lang.String r3, java.util.regex.MatchResult r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.groupCount()
        L8:
            if (r1 <= 0) goto L16
            int r2 = r1 + (-1)
            java.lang.String r1 = r4.group(r1)
            if (r1 == 0) goto L14
            r1 = r2
            goto L16
        L14:
            r1 = r2
            goto L8
        L16:
            java.util.regex.Pattern r2 = androidx.core.text.util.FindAddress.sZipCodeRe
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L2e
            androidx.core.text.util.FindAddress$ZipRange[] r2 = androidx.core.text.util.FindAddress.sStateZipCodeRanges
            r2 = r2[r1]
            boolean r2 = r2.matches(r3)
            if (r2 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
        L2f:
            return r0
    }

    public static java.util.regex.MatchResult matchHouseNumber(java.lang.String r4, int r5) {
            r0 = 0
            if (r5 <= 0) goto L13
            int r1 = r5 + (-1)
            char r1 = r4.charAt(r1)
            java.lang.String r2 = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029"
            int r1 = r2.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            return r0
        L13:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sHouseNumberRe
            java.util.regex.Matcher r1 = r1.matcher(r4)
            int r2 = r4.length()
            java.util.regex.Matcher r1 = r1.region(r5, r2)
            boolean r2 = r1.lookingAt()
            if (r2 == 0) goto L37
            java.util.regex.MatchResult r2 = r1.toMatchResult()
            r3 = 0
            java.lang.String r3 = r2.group(r3)
            boolean r3 = checkHouseNumber(r3)
            if (r3 == 0) goto L37
            return r2
        L37:
            return r0
    }

    public static java.util.regex.MatchResult matchState(java.lang.String r3, int r4) {
            r0 = 0
            if (r4 <= 0) goto L13
            int r1 = r4 + (-1)
            char r1 = r3.charAt(r1)
            java.lang.String r2 = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029"
            int r1 = r2.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            return r0
        L13:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sStateRe
            java.util.regex.Matcher r1 = r1.matcher(r3)
            int r2 = r3.length()
            java.util.regex.Matcher r1 = r1.region(r4, r2)
            boolean r2 = r1.lookingAt()
            if (r2 == 0) goto L2b
            java.util.regex.MatchResult r0 = r1.toMatchResult()
        L2b:
            return r0
    }
}
