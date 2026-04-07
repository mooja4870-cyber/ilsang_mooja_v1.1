package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class ProfileTranscoder {
    private static final int FIRST_FLAG = 1;
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    private static final int LAST_FLAG = 4;
    static final byte[] MAGIC_PROF = null;
    static final byte[] MAGIC_PROFM = null;
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0010: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF = r1
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM = r0
            return
    }

    private ProfileTranscoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int computeMethodFlags(androidx.profileinstaller.DexProfileData r4) {
            r0 = 0
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r4.methods
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0 = r0 | r3
            goto Lb
        L23:
            return r0
    }

    private static byte[] createCompressibleBody(androidx.profileinstaller.DexProfileData[] r9, byte[] r10) throws java.io.IOException {
            r0 = 0
            int r1 = r9.length
            r2 = 0
            r3 = r2
        L4:
            if (r3 >= r1) goto L2b
            r4 = r9[r3]
            r5 = 16
            java.lang.String r6 = r4.apkName
            java.lang.String r7 = r4.dexName
            java.lang.String r6 = generateDexKey(r6, r7, r10)
            int r7 = androidx.profileinstaller.Encoding.utf8Length(r6)
            int r7 = r7 + r5
            int r8 = r4.classSetSize
            int r8 = r8 * 2
            int r7 = r7 + r8
            int r8 = r4.hotMethodRegionSize
            int r7 = r7 + r8
            int r8 = r4.numMethodIds
            int r8 = getMethodBitmapStorageSize(r8)
            int r7 = r7 + r8
            int r0 = r0 + r7
            int r3 = r3 + 1
            goto L4
        L2b:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            byte[] r3 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            boolean r3 = java.util.Arrays.equals(r10, r3)
            if (r3 == 0) goto L4e
            int r3 = r9.length
        L39:
            if (r2 >= r3) goto L6d
            r4 = r9[r2]
            java.lang.String r5 = r4.apkName
            java.lang.String r6 = r4.dexName
            java.lang.String r5 = generateDexKey(r5, r6, r10)
            writeLineHeader(r1, r4, r5)
            writeLineData(r1, r4)
            int r2 = r2 + 1
            goto L39
        L4e:
            int r3 = r9.length
            r4 = r2
        L50:
            if (r4 >= r3) goto L62
            r5 = r9[r4]
            java.lang.String r6 = r5.apkName
            java.lang.String r7 = r5.dexName
            java.lang.String r6 = generateDexKey(r6, r7, r10)
            writeLineHeader(r1, r5, r6)
            int r4 = r4 + 1
            goto L50
        L62:
            int r3 = r9.length
        L63:
            if (r2 >= r3) goto L6d
            r4 = r9[r2]
            writeLineData(r1, r4)
            int r2 = r2 + 1
            goto L63
        L6d:
            int r2 = r1.size()
            if (r2 != r0) goto L78
            byte[] r2 = r1.toByteArray()
            return r2
        L78:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The bytes saved do not match expectation. actual="
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r1.size()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " expected="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.RuntimeException r2 = androidx.profileinstaller.Encoding.error(r2)
            throw r2
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleClassSection(androidx.profileinstaller.DexProfileData[] r6) throws java.io.IOException {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
        L7:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L59
            if (r2 >= r3) goto L23
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + 2
            androidx.profileinstaller.Encoding.writeUInt16(r1, r2)     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + 2
            int r4 = r3.classSetSize     // Catch: java.lang.Throwable -> L59
            androidx.profileinstaller.Encoding.writeUInt16(r1, r4)     // Catch: java.lang.Throwable -> L59
            int r4 = r3.classSetSize     // Catch: java.lang.Throwable -> L59
            int r4 = r4 * 2
            int r0 = r0 + r4
            writeClasses(r1, r3)     // Catch: java.lang.Throwable -> L59
            int r2 = r2 + 1
            goto L7
        L23:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L59
            int r3 = r2.length     // Catch: java.lang.Throwable -> L59
            if (r0 != r3) goto L36
            androidx.profileinstaller.WritableFileSection r3 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L59
            androidx.profileinstaller.FileSectionType r4 = androidx.profileinstaller.FileSectionType.CLASSES     // Catch: java.lang.Throwable -> L59
            r5 = 1
            r3.<init>(r4, r0, r2, r5)     // Catch: java.lang.Throwable -> L59
            r1.close()
            return r3
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Expected size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = ", does not match actual size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L59
            int r4 = r2.length     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.RuntimeException r3 = androidx.profileinstaller.Encoding.error(r3)     // Catch: java.lang.Throwable -> L59
            throw r3     // Catch: java.lang.Throwable -> L59
        L59:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r3 = move-exception
            r2.addSuppressed(r3)
        L62:
            throw r2
    }

    private static androidx.profileinstaller.WritableFileSection createCompressibleMethodsSection(androidx.profileinstaller.DexProfileData[] r10) throws java.io.IOException {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
        L7:
            int r3 = r10.length     // Catch: java.lang.Throwable -> L6b
            if (r2 >= r3) goto L35
            r3 = r10[r2]     // Catch: java.lang.Throwable -> L6b
            int r4 = computeMethodFlags(r3)     // Catch: java.lang.Throwable -> L6b
            byte[] r5 = createMethodBitmapRegionForS(r4, r3)     // Catch: java.lang.Throwable -> L6b
            byte[] r6 = createMethodsWithInlineCaches(r3)     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + 2
            androidx.profileinstaller.Encoding.writeUInt16(r1, r2)     // Catch: java.lang.Throwable -> L6b
            int r7 = r5.length     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + 2
            int r8 = r6.length     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 + r8
            int r0 = r0 + 4
            long r8 = (long) r7     // Catch: java.lang.Throwable -> L6b
            androidx.profileinstaller.Encoding.writeUInt32(r1, r8)     // Catch: java.lang.Throwable -> L6b
            androidx.profileinstaller.Encoding.writeUInt16(r1, r4)     // Catch: java.lang.Throwable -> L6b
            r1.write(r5)     // Catch: java.lang.Throwable -> L6b
            r1.write(r6)     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + r7
            int r2 = r2 + 1
            goto L7
        L35:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L6b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6b
            if (r0 != r3) goto L48
            androidx.profileinstaller.WritableFileSection r3 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L6b
            androidx.profileinstaller.FileSectionType r4 = androidx.profileinstaller.FileSectionType.METHODS     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            r3.<init>(r4, r0, r2, r5)     // Catch: java.lang.Throwable -> L6b
            r1.close()
            return r3
        L48:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Expected size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = ", does not match actual size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6b
            int r4 = r2.length     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6b
            java.lang.RuntimeException r3 = androidx.profileinstaller.Encoding.error(r3)     // Catch: java.lang.Throwable -> L6b
            throw r3     // Catch: java.lang.Throwable -> L6b
        L6b:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r3 = move-exception
            r2.addSuppressed(r3)
        L74:
            throw r2
    }

    private static byte[] createMethodBitmapRegionForS(int r3, androidx.profileinstaller.DexProfileData r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            writeMethodBitmapForS(r0, r3, r4)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    private static byte[] createMethodsWithInlineCaches(androidx.profileinstaller.DexProfileData r3) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            writeMethodsWithInlineCaches(r0, r3)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    private static java.lang.String enforceSeparator(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "!"
            boolean r1 = r0.equals(r4)
            java.lang.String r2 = ":"
            if (r1 == 0) goto Lf
            java.lang.String r0 = r3.replace(r2, r0)
            return r0
        Lf:
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L1a
            java.lang.String r0 = r3.replace(r0, r2)
            return r0
        L1a:
            return r3
    }

    private static java.lang.String extractKey(java.lang.String r2) {
            java.lang.String r0 = "!"
            int r0 = r2.indexOf(r0)
            if (r0 >= 0) goto Le
            java.lang.String r1 = ":"
            int r0 = r2.indexOf(r1)
        Le:
            if (r0 <= 0) goto L17
            int r1 = r0 + 1
            java.lang.String r1 = r2.substring(r1)
            return r1
        L17:
            return r2
    }

    private static androidx.profileinstaller.DexProfileData findByDexName(androidx.profileinstaller.DexProfileData[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.lang.String r0 = extractKey(r5)
            r2 = 0
        La:
            int r3 = r4.length
            if (r2 >= r3) goto L1d
            r3 = r4[r2]
            java.lang.String r3 = r3.dexName
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1a
            r1 = r4[r2]
            return r1
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            return r1
    }

    private static java.lang.String generateDexKey(java.lang.String r3, java.lang.String r4, byte[] r5) {
            java.lang.String r0 = androidx.profileinstaller.ProfileVersion.dexKeySeparator(r5)
            int r1 = r3.length()
            if (r1 > 0) goto Lf
            java.lang.String r1 = enforceSeparator(r4, r0)
            return r1
        Lf:
            java.lang.String r1 = "classes.dex"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L18
            return r3
        L18:
            java.lang.String r1 = "!"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L4c
            java.lang.String r1 = ":"
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L29
            goto L4c
        L29:
            java.lang.String r1 = ".apk"
            boolean r1 = r4.endsWith(r1)
            if (r1 == 0) goto L32
            return r4
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = androidx.profileinstaller.ProfileVersion.dexKeySeparator(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            return r1
        L4c:
            java.lang.String r1 = enforceSeparator(r4, r0)
            return r1
    }

    private static int getMethodBitmapStorageSize(int r2) {
            int r0 = r2 * 2
            int r1 = roundUpToByte(r0)
            int r1 = r1 / 8
            return r1
    }

    private static int getMethodBitmapStorageSizeForS(int r3, int r4) {
            r0 = r3 & (-2)
            int r0 = java.lang.Integer.bitCount(r0)
            int r1 = r0 * r4
            int r2 = roundUpToByte(r1)
            int r2 = r2 / 8
            return r2
    }

    private static int methodFlagBitmapIndex(int r2, int r3, int r4) {
            switch(r2) {
                case 1: goto L1f;
                case 2: goto L1e;
                case 3: goto L3;
                case 4: goto L1b;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected flag: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
        L1b:
            int r0 = r3 + r4
            return r0
        L1e:
            return r3
        L1f:
            java.lang.String r0 = "HOT methods are not stored in the bitmap"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    private static int[] readClasses(java.io.InputStream r5, int r6) throws java.io.IOException {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r6) goto L12
            int r3 = androidx.profileinstaller.Encoding.readUInt16(r5)
            int r4 = r1 + r3
            r0[r2] = r4
            r1 = r4
            int r2 = r2 + 1
            goto L4
        L12:
            return r0
    }

    private static int readFlagsFromBitmap(java.util.BitSet r2, int r3, int r4) {
            r0 = 0
            r1 = 2
            int r1 = methodFlagBitmapIndex(r1, r3, r4)
            boolean r1 = r2.get(r1)
            if (r1 == 0) goto Le
            r0 = r0 | 2
        Le:
            r1 = 4
            int r1 = methodFlagBitmapIndex(r1, r3, r4)
            boolean r1 = r2.get(r1)
            if (r1 == 0) goto L1b
            r0 = r0 | 4
        L1b:
            return r0
    }

    static byte[] readHeader(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            int r0 = r3.length
            byte[] r0 = androidx.profileinstaller.Encoding.read(r2, r0)
            boolean r1 = java.util.Arrays.equals(r3, r0)
            if (r1 == 0) goto L13
            byte[] r1 = androidx.profileinstaller.ProfileVersion.V010_P
            int r1 = r1.length
            byte[] r1 = androidx.profileinstaller.Encoding.read(r2, r1)
            return r1
        L13:
            java.lang.String r1 = "Invalid magic"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
    }

    private static void readHotMethodRegion(java.io.InputStream r7, androidx.profileinstaller.DexProfileData r8) throws java.io.IOException {
            int r0 = r7.available()
            int r1 = r8.hotMethodRegionSize
            int r0 = r0 - r1
            r1 = 0
        L8:
            int r2 = r7.available()
            if (r2 <= r0) goto L30
            int r2 = androidx.profileinstaller.Encoding.readUInt16(r7)
            int r3 = r1 + r2
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r8.methods
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            int r4 = androidx.profileinstaller.Encoding.readUInt16(r7)
        L26:
            if (r4 <= 0) goto L2e
            skipInlineCache(r7)
            int r4 = r4 + (-1)
            goto L26
        L2e:
            r1 = r3
            goto L8
        L30:
            int r2 = r7.available()
            if (r2 != r0) goto L37
            return
        L37:
            java.lang.String r2 = "Read too much data during profile line parse"
            java.lang.RuntimeException r2 = androidx.profileinstaller.Encoding.error(r2)
            throw r2
    }

    static androidx.profileinstaller.DexProfileData[] readMeta(java.io.InputStream r2, byte[] r3, byte[] r4, androidx.profileinstaller.DexProfileData[] r5) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V001_N
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L1c
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 != 0) goto L15
            androidx.profileinstaller.DexProfileData[] r1 = readMetadata001(r2, r3, r5)
            return r1
        L15:
            java.lang.String r1 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            java.lang.RuntimeException r1 = androidx.profileinstaller.Encoding.error(r1)
            throw r1
        L1c:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V002
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L29
            androidx.profileinstaller.DexProfileData[] r0 = readMetadataV002(r2, r4, r5)
            return r0
        L29:
            java.lang.String r0 = "Unsupported meta version"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    static androidx.profileinstaller.DexProfileData[] readMetadata001(java.io.InputStream r9, byte[] r10, androidx.profileinstaller.DexProfileData[] r11) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.METADATA_V001_N
            boolean r0 = java.util.Arrays.equals(r10, r0)
            if (r0 == 0) goto L3e
            int r0 = androidx.profileinstaller.Encoding.readUInt8(r9)
            long r1 = androidx.profileinstaller.Encoding.readUInt32(r9)
            long r3 = androidx.profileinstaller.Encoding.readUInt32(r9)
            int r5 = (int) r3
            int r6 = (int) r1
            byte[] r5 = androidx.profileinstaller.Encoding.readCompressed(r9, r5, r6)
            int r6 = r9.read()
            if (r6 > 0) goto L37
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r5)
            androidx.profileinstaller.DexProfileData[] r7 = readMetadataForNBody(r6, r0, r11)     // Catch: java.lang.Throwable -> L2d
            r6.close()
            return r7
        L2d:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r8 = move-exception
            r7.addSuppressed(r8)
        L36:
            throw r7
        L37:
            java.lang.String r6 = "Content found after the end of file"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
        L3e:
            java.lang.String r0 = "Unsupported meta version"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataForNBody(java.io.InputStream r6, int r7, androidx.profileinstaller.DexProfileData[] r8) throws java.io.IOException {
            int r0 = r6.available()
            if (r0 != 0) goto La
            r0 = 0
            androidx.profileinstaller.DexProfileData[] r0 = new androidx.profileinstaller.DexProfileData[r0]
            return r0
        La:
            int r0 = r8.length
            if (r7 != r0) goto L4d
            java.lang.String[] r0 = new java.lang.String[r7]
            int[] r1 = new int[r7]
            r2 = 0
        L12:
            if (r2 >= r7) goto L27
            int r3 = androidx.profileinstaller.Encoding.readUInt16(r6)
            int r4 = androidx.profileinstaller.Encoding.readUInt16(r6)
            r1[r2] = r4
            java.lang.String r4 = androidx.profileinstaller.Encoding.readString(r6, r3)
            r0[r2] = r4
            int r2 = r2 + 1
            goto L12
        L27:
            r2 = 0
        L28:
            if (r2 >= r7) goto L4c
            r3 = r8[r2]
            java.lang.String r4 = r3.dexName
            r5 = r0[r2]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L45
            r4 = r1[r2]
            r3.classSetSize = r4
            int r4 = r3.classSetSize
            int[] r4 = readClasses(r6, r4)
            r3.classes = r4
            int r2 = r2 + 1
            goto L28
        L45:
            java.lang.String r4 = "Order of dexfiles in metadata did not match baseline"
            java.lang.RuntimeException r4 = androidx.profileinstaller.Encoding.error(r4)
            throw r4
        L4c:
            return r8
        L4d:
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    static androidx.profileinstaller.DexProfileData[] readMetadataV002(java.io.InputStream r9, byte[] r10, androidx.profileinstaller.DexProfileData[] r11) throws java.io.IOException {
            int r0 = androidx.profileinstaller.Encoding.readUInt16(r9)
            long r1 = androidx.profileinstaller.Encoding.readUInt32(r9)
            long r3 = androidx.profileinstaller.Encoding.readUInt32(r9)
            int r5 = (int) r3
            int r6 = (int) r1
            byte[] r5 = androidx.profileinstaller.Encoding.readCompressed(r9, r5, r6)
            int r6 = r9.read()
            if (r6 > 0) goto L2f
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r5)
            androidx.profileinstaller.DexProfileData[] r7 = readMetadataV002Body(r6, r10, r0, r11)     // Catch: java.lang.Throwable -> L25
            r6.close()
            return r7
        L25:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r8 = move-exception
            r7.addSuppressed(r8)
        L2e:
            throw r7
        L2f:
            java.lang.String r6 = "Content found after the end of file"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
    }

    private static androidx.profileinstaller.DexProfileData[] readMetadataV002Body(java.io.InputStream r9, byte[] r10, int r11, androidx.profileinstaller.DexProfileData[] r12) throws java.io.IOException {
            int r0 = r9.available()
            if (r0 != 0) goto La
            r0 = 0
            androidx.profileinstaller.DexProfileData[] r0 = new androidx.profileinstaller.DexProfileData[r0]
            return r0
        La:
            int r0 = r12.length
            if (r11 != r0) goto L57
            r0 = 0
        Le:
            if (r0 >= r11) goto L56
            androidx.profileinstaller.Encoding.readUInt16(r9)
            int r1 = androidx.profileinstaller.Encoding.readUInt16(r9)
            java.lang.String r2 = androidx.profileinstaller.Encoding.readString(r9, r1)
            long r3 = androidx.profileinstaller.Encoding.readUInt32(r9)
            int r5 = androidx.profileinstaller.Encoding.readUInt16(r9)
            androidx.profileinstaller.DexProfileData r6 = findByDexName(r12, r2)
            if (r6 == 0) goto L3e
            r6.mTypeIdCount = r3
            int[] r7 = readClasses(r9, r5)
            byte[] r8 = androidx.profileinstaller.ProfileVersion.V001_N
            boolean r8 = java.util.Arrays.equals(r10, r8)
            if (r8 == 0) goto L3b
            r6.classSetSize = r5
            r6.classes = r7
        L3b:
            int r0 = r0 + 1
            goto Le
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Missing profile key: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.RuntimeException r7 = androidx.profileinstaller.Encoding.error(r7)
            throw r7
        L56:
            return r12
        L57:
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    private static void readMethodBitmap(java.io.InputStream r9, androidx.profileinstaller.DexProfileData r10) throws java.io.IOException {
            int r0 = r10.numMethodIds
            int r0 = r0 * 2
            int r0 = androidx.profileinstaller.Encoding.bitsToBytes(r0)
            byte[] r1 = androidx.profileinstaller.Encoding.read(r9, r0)
            java.util.BitSet r2 = java.util.BitSet.valueOf(r1)
            r3 = 0
        L11:
            int r4 = r10.numMethodIds
            if (r3 >= r4) goto L45
            int r4 = r10.numMethodIds
            int r4 = readFlagsFromBitmap(r2, r3, r4)
            if (r4 == 0) goto L42
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r10.methods
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L30
            r6 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
        L30:
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r6 = r10.methods
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r8 = r5.intValue()
            r8 = r8 | r4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.put(r7, r8)
        L42:
            int r3 = r3 + 1
            goto L11
        L45:
            return
    }

    static androidx.profileinstaller.DexProfileData[] readProfile(java.io.InputStream r9, byte[] r10, java.lang.String r11) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            boolean r0 = java.util.Arrays.equals(r10, r0)
            if (r0 == 0) goto L3e
            int r0 = androidx.profileinstaller.Encoding.readUInt8(r9)
            long r1 = androidx.profileinstaller.Encoding.readUInt32(r9)
            long r3 = androidx.profileinstaller.Encoding.readUInt32(r9)
            int r5 = (int) r3
            int r6 = (int) r1
            byte[] r5 = androidx.profileinstaller.Encoding.readCompressed(r9, r5, r6)
            int r6 = r9.read()
            if (r6 > 0) goto L37
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r5)
            androidx.profileinstaller.DexProfileData[] r7 = readUncompressedBody(r6, r11, r0)     // Catch: java.lang.Throwable -> L2d
            r6.close()
            return r7
        L2d:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r8 = move-exception
            r7.addSuppressed(r8)
        L36:
            throw r7
        L37:
            java.lang.String r6 = "Content found after the end of file"
            java.lang.RuntimeException r6 = androidx.profileinstaller.Encoding.error(r6)
            throw r6
        L3e:
            java.lang.String r0 = "Unsupported version"
            java.lang.RuntimeException r0 = androidx.profileinstaller.Encoding.error(r0)
            throw r0
    }

    private static androidx.profileinstaller.DexProfileData[] readUncompressedBody(java.io.InputStream r22, java.lang.String r23, int r24) throws java.io.IOException {
            r0 = r22
            r1 = r24
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            androidx.profileinstaller.DexProfileData[] r2 = new androidx.profileinstaller.DexProfileData[r3]
            return r2
        Le:
            androidx.profileinstaller.DexProfileData[] r2 = new androidx.profileinstaller.DexProfileData[r1]
            r4 = 0
        L11:
            if (r4 >= r1) goto L4d
            int r5 = androidx.profileinstaller.Encoding.readUInt16(r0)
            int r13 = androidx.profileinstaller.Encoding.readUInt16(r0)
            long r6 = androidx.profileinstaller.Encoding.readUInt32(r0)
            long r9 = androidx.profileinstaller.Encoding.readUInt32(r0)
            long r11 = androidx.profileinstaller.Encoding.readUInt32(r0)
            androidx.profileinstaller.DexProfileData r8 = new androidx.profileinstaller.DexProfileData
            r14 = r8
            java.lang.String r8 = androidx.profileinstaller.Encoding.readString(r0, r5)
            r15 = r14
            int r14 = (int) r6
            r16 = r6
            r6 = r15
            int r15 = (int) r11
            int[] r7 = new int[r13]
            r18 = r16
            java.util.TreeMap r17 = new java.util.TreeMap
            r17.<init>()
            r20 = r11
            r11 = 0
            r16 = r7
            r7 = r23
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17)
            r2[r4] = r6
            int r4 = r4 + 1
            goto L11
        L4d:
            int r4 = r2.length
        L4e:
            if (r3 >= r4) goto L63
            r5 = r2[r3]
            readHotMethodRegion(r0, r5)
            int r6 = r5.classSetSize
            int[] r6 = readClasses(r0, r6)
            r5.classes = r6
            readMethodBitmap(r0, r5)
            int r3 = r3 + 1
            goto L4e
        L63:
            return r2
    }

    private static int roundUpToByte(int r1) {
            int r0 = r1 + 8
            int r0 = r0 + (-1)
            r0 = r0 & (-8)
            return r0
    }

    private static void setMethodBitmapBit(byte[] r5, int r6, int r7, androidx.profileinstaller.DexProfileData r8) {
            int r0 = r8.numMethodIds
            int r0 = methodFlagBitmapIndex(r6, r7, r0)
            int r1 = r0 / 8
            r2 = r5[r1]
            r3 = 1
            int r4 = r0 % 8
            int r3 = r3 << r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r5[r1] = r2
            return
    }

    private static void skipInlineCache(java.io.InputStream r2) throws java.io.IOException {
            androidx.profileinstaller.Encoding.readUInt16(r2)
            int r0 = androidx.profileinstaller.Encoding.readUInt8(r2)
            r1 = 6
            if (r0 != r1) goto Lb
            return
        Lb:
            r1 = 7
            if (r0 != r1) goto Lf
            return
        Lf:
            if (r0 <= 0) goto L24
            androidx.profileinstaller.Encoding.readUInt8(r2)
            int r1 = androidx.profileinstaller.Encoding.readUInt8(r2)
        L18:
            if (r1 <= 0) goto L20
            androidx.profileinstaller.Encoding.readUInt16(r2)
            int r1 = r1 + (-1)
            goto L18
        L20:
            int r0 = r0 + (-1)
            goto Lf
        L24:
            return
    }

    static boolean transcodeAndWriteBody(java.io.OutputStream r2, byte[] r3, androidx.profileinstaller.DexProfileData[] r4) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V015_S
            boolean r0 = java.util.Arrays.equals(r3, r0)
            r1 = 1
            if (r0 == 0) goto Ld
            writeProfileForS(r2, r4)
            return r1
        Ld:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L19
            writeProfileForP(r2, r4)
            return r1
        L19:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V005_O
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L25
            writeProfileForO(r2, r4)
            return r1
        L25:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L31
            writeProfileForO_MR1(r2, r4)
            return r1
        L31:
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V001_N
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L3d
            writeProfileForN(r2, r4)
            return r1
        L3d:
            r0 = 0
            return r0
    }

    private static void writeClasses(java.io.OutputStream r6, androidx.profileinstaller.DexProfileData r7) throws java.io.IOException {
            r0 = 0
            int[] r1 = r7.classes
            int r2 = r1.length
            r3 = 0
        L5:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r4.intValue()
            int r5 = r5 - r0
            androidx.profileinstaller.Encoding.writeUInt16(r6, r5)
            int r0 = r4.intValue()
            int r3 = r3 + 1
            goto L5
        L1c:
            return
    }

    private static androidx.profileinstaller.WritableFileSection writeDexFileSection(androidx.profileinstaller.DexProfileData[] r7) throws java.io.IOException {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            int r0 = r0 + 2
            int r2 = r7.length     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.Encoding.writeUInt16(r1, r2)     // Catch: java.lang.Throwable -> L7a
            r2 = 0
        Ld:
            int r3 = r7.length     // Catch: java.lang.Throwable -> L7a
            if (r2 >= r3) goto L44
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + 4
            long r4 = r3.dexChecksum     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.Encoding.writeUInt32(r1, r4)     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + 4
            long r4 = r3.mTypeIdCount     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.Encoding.writeUInt32(r1, r4)     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + 4
            int r4 = r3.numMethodIds     // Catch: java.lang.Throwable -> L7a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.Encoding.writeUInt32(r1, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r3.apkName     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r3.dexName     // Catch: java.lang.Throwable -> L7a
            byte[] r6 = androidx.profileinstaller.ProfileVersion.V015_S     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = generateDexKey(r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + 2
            int r5 = androidx.profileinstaller.Encoding.utf8Length(r4)     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.Encoding.writeUInt16(r1, r5)     // Catch: java.lang.Throwable -> L7a
            int r6 = r5 * 1
            int r0 = r0 + r6
            androidx.profileinstaller.Encoding.writeString(r1, r4)     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + 1
            goto Ld
        L44:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L7a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L7a
            if (r0 != r3) goto L57
            androidx.profileinstaller.WritableFileSection r3 = new androidx.profileinstaller.WritableFileSection     // Catch: java.lang.Throwable -> L7a
            androidx.profileinstaller.FileSectionType r4 = androidx.profileinstaller.FileSectionType.DEX_FILES     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            r3.<init>(r4, r0, r2, r5)     // Catch: java.lang.Throwable -> L7a
            r1.close()
            return r3
        L57:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "Expected size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = ", does not match actual size "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            int r4 = r2.length     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.RuntimeException r3 = androidx.profileinstaller.Encoding.error(r3)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L7a:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r3 = move-exception
            r2.addSuppressed(r3)
        L83:
            throw r2
    }

    static void writeHeader(java.io.OutputStream r1, byte[] r2) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF
            r1.write(r0)
            r1.write(r2)
            return
    }

    private static void writeLineData(java.io.OutputStream r0, androidx.profileinstaller.DexProfileData r1) throws java.io.IOException {
            writeMethodsWithInlineCaches(r0, r1)
            writeClasses(r0, r1)
            writeMethodBitmap(r0, r1)
            return
    }

    private static void writeLineHeader(java.io.OutputStream r2, androidx.profileinstaller.DexProfileData r3, java.lang.String r4) throws java.io.IOException {
            int r0 = androidx.profileinstaller.Encoding.utf8Length(r4)
            androidx.profileinstaller.Encoding.writeUInt16(r2, r0)
            int r0 = r3.classSetSize
            androidx.profileinstaller.Encoding.writeUInt16(r2, r0)
            int r0 = r3.hotMethodRegionSize
            long r0 = (long) r0
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            long r0 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            int r0 = r3.numMethodIds
            long r0 = (long) r0
            androidx.profileinstaller.Encoding.writeUInt32(r2, r0)
            androidx.profileinstaller.Encoding.writeString(r2, r4)
            return
    }

    private static void writeMethodBitmap(java.io.OutputStream r6, androidx.profileinstaller.DexProfileData r7) throws java.io.IOException {
            int r0 = r7.numMethodIds
            int r0 = getMethodBitmapStorageSize(r0)
            byte[] r0 = new byte[r0]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r7.methods
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r2.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 2
            if (r5 == 0) goto L3a
            r5 = 2
            setMethodBitmapBit(r0, r5, r3, r7)
        L3a:
            r5 = r4 & 4
            if (r5 == 0) goto L42
            r5 = 4
            setMethodBitmapBit(r0, r5, r3, r7)
        L42:
            goto L12
        L43:
            r6.write(r0)
            return
    }

    private static void writeMethodBitmapForS(java.io.OutputStream r13, int r14, androidx.profileinstaller.DexProfileData r15) throws java.io.IOException {
            int r0 = r15.numMethodIds
            int r0 = getMethodBitmapStorageSizeForS(r14, r0)
            byte[] r1 = new byte[r0]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r2 = r15.methods
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r5 = r3.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            r7 = 1
        L34:
            r8 = 4
            if (r7 > r8) goto L5c
            r8 = 1
            if (r7 != r8) goto L3d
            int r7 = r7 << 1
            goto L34
        L3d:
            r9 = r7 & r14
            if (r9 != 0) goto L44
            int r7 = r7 << 1
            goto L34
        L44:
            r9 = r7 & r5
            if (r9 != r7) goto L57
            int r9 = r15.numMethodIds
            int r9 = r9 * r6
            int r9 = r9 + r4
            int r10 = r9 / 8
            r11 = r1[r10]
            int r12 = r9 % 8
            int r8 = r8 << r12
            r8 = r8 | r11
            byte r8 = (byte) r8
            r1[r10] = r8
        L57:
            int r6 = r6 + 1
            int r7 = r7 << 1
            goto L34
        L5c:
            goto L12
        L5d:
            r13.write(r1)
            return
    }

    private static void writeMethodsWithInlineCaches(java.io.OutputStream r7, androidx.profileinstaller.DexProfileData r8) throws java.io.IOException {
            r0 = 0
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r8.methods
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r2.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 1
            if (r5 != 0) goto L30
            goto Lb
        L30:
            int r5 = r3 - r0
            androidx.profileinstaller.Encoding.writeUInt16(r7, r5)
            r6 = 0
            androidx.profileinstaller.Encoding.writeUInt16(r7, r6)
            r0 = r3
            goto Lb
        L3b:
            return
    }

    private static void writeProfileForN(java.io.OutputStream r9, androidx.profileinstaller.DexProfileData[] r10) throws java.io.IOException {
            int r0 = r10.length
            androidx.profileinstaller.Encoding.writeUInt16(r9, r0)
            int r0 = r10.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L62
            r3 = r10[r2]
            java.lang.String r4 = r3.apkName
            java.lang.String r5 = r3.dexName
            byte[] r6 = androidx.profileinstaller.ProfileVersion.V001_N
            java.lang.String r4 = generateDexKey(r4, r5, r6)
            int r5 = androidx.profileinstaller.Encoding.utf8Length(r4)
            androidx.profileinstaller.Encoding.writeUInt16(r9, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r3.methods
            int r5 = r5.size()
            androidx.profileinstaller.Encoding.writeUInt16(r9, r5)
            int[] r5 = r3.classes
            int r5 = r5.length
            androidx.profileinstaller.Encoding.writeUInt16(r9, r5)
            long r5 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r9, r5)
            androidx.profileinstaller.Encoding.writeString(r9, r4)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r3.methods
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            androidx.profileinstaller.Encoding.writeUInt16(r9, r6)
            goto L3d
        L51:
            int[] r5 = r3.classes
            int r6 = r5.length
            r7 = r1
        L55:
            if (r7 >= r6) goto L5f
            r8 = r5[r7]
            androidx.profileinstaller.Encoding.writeUInt16(r9, r8)
            int r7 = r7 + 1
            goto L55
        L5f:
            int r2 = r2 + 1
            goto L7
        L62:
            return
    }

    private static void writeProfileForO(java.io.OutputStream r10, androidx.profileinstaller.DexProfileData[] r11) throws java.io.IOException {
            int r0 = r11.length
            androidx.profileinstaller.Encoding.writeUInt8(r10, r0)
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L68
            r3 = r11[r2]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.methods
            int r4 = r4.size()
            int r4 = r4 * 4
            java.lang.String r5 = r3.apkName
            java.lang.String r6 = r3.dexName
            byte[] r7 = androidx.profileinstaller.ProfileVersion.V005_O
            java.lang.String r5 = generateDexKey(r5, r6, r7)
            int r6 = androidx.profileinstaller.Encoding.utf8Length(r5)
            androidx.profileinstaller.Encoding.writeUInt16(r10, r6)
            int[] r6 = r3.classes
            int r6 = r6.length
            androidx.profileinstaller.Encoding.writeUInt16(r10, r6)
            long r6 = (long) r4
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            long r6 = r3.dexChecksum
            androidx.profileinstaller.Encoding.writeUInt32(r10, r6)
            androidx.profileinstaller.Encoding.writeString(r10, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r6 = r3.methods
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L57
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            androidx.profileinstaller.Encoding.writeUInt16(r10, r7)
            androidx.profileinstaller.Encoding.writeUInt16(r10, r1)
            goto L40
        L57:
            int[] r6 = r3.classes
            int r7 = r6.length
            r8 = r1
        L5b:
            if (r8 >= r7) goto L65
            r9 = r6[r8]
            androidx.profileinstaller.Encoding.writeUInt16(r10, r9)
            int r8 = r8 + 1
            goto L5b
        L65:
            int r2 = r2 + 1
            goto L7
        L68:
            return
    }

    private static void writeProfileForO_MR1(java.io.OutputStream r2, androidx.profileinstaller.DexProfileData[] r3) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V009_O_MR1
            byte[] r0 = createCompressibleBody(r3, r0)
            int r1 = r3.length
            androidx.profileinstaller.Encoding.writeUInt8(r2, r1)
            androidx.profileinstaller.Encoding.writeCompressed(r2, r0)
            return
    }

    private static void writeProfileForP(java.io.OutputStream r2, androidx.profileinstaller.DexProfileData[] r3) throws java.io.IOException {
            byte[] r0 = androidx.profileinstaller.ProfileVersion.V010_P
            byte[] r0 = createCompressibleBody(r3, r0)
            int r1 = r3.length
            androidx.profileinstaller.Encoding.writeUInt8(r2, r1)
            androidx.profileinstaller.Encoding.writeCompressed(r2, r0)
            return
    }

    private static void writeProfileForS(java.io.OutputStream r0, androidx.profileinstaller.DexProfileData[] r1) throws java.io.IOException {
            writeProfileSections(r0, r1)
            return
    }

    private static void writeProfileSections(java.io.OutputStream r11, androidx.profileinstaller.DexProfileData[] r12) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            androidx.profileinstaller.WritableFileSection r1 = writeDexFileSection(r12)
            r0.add(r1)
            androidx.profileinstaller.WritableFileSection r1 = createCompressibleClassSection(r12)
            r0.add(r1)
            androidx.profileinstaller.WritableFileSection r1 = createCompressibleMethodsSection(r12)
            r0.add(r1)
            byte[] r1 = androidx.profileinstaller.ProfileVersion.V015_S
            int r1 = r1.length
            long r3 = (long) r1
            byte[] r1 = androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF
            int r1 = r1.length
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 4
            long r3 = r3 + r5
            int r1 = r0.size()
            int r1 = r1 * 16
            long r5 = (long) r1
            long r3 = r3 + r5
            int r1 = r0.size()
            long r5 = (long) r1
            androidx.profileinstaller.Encoding.writeUInt32(r11, r5)
            r1 = 0
        L3d:
            int r5 = r0.size()
            if (r1 >= r5) goto L8b
            java.lang.Object r5 = r0.get(r1)
            androidx.profileinstaller.WritableFileSection r5 = (androidx.profileinstaller.WritableFileSection) r5
            androidx.profileinstaller.FileSectionType r6 = r5.mType
            long r6 = r6.getValue()
            androidx.profileinstaller.Encoding.writeUInt32(r11, r6)
            androidx.profileinstaller.Encoding.writeUInt32(r11, r3)
            boolean r6 = r5.mNeedsCompression
            if (r6 == 0) goto L72
            byte[] r6 = r5.mContents
            int r6 = r6.length
            long r6 = (long) r6
            byte[] r8 = r5.mContents
            byte[] r8 = androidx.profileinstaller.Encoding.compress(r8)
            r2.add(r8)
            int r9 = r8.length
            long r9 = (long) r9
            androidx.profileinstaller.Encoding.writeUInt32(r11, r9)
            androidx.profileinstaller.Encoding.writeUInt32(r11, r6)
            int r9 = r8.length
            long r9 = (long) r9
            long r3 = r3 + r9
            goto L88
        L72:
            byte[] r6 = r5.mContents
            r2.add(r6)
            byte[] r6 = r5.mContents
            int r6 = r6.length
            long r6 = (long) r6
            androidx.profileinstaller.Encoding.writeUInt32(r11, r6)
            r6 = 0
            androidx.profileinstaller.Encoding.writeUInt32(r11, r6)
            byte[] r6 = r5.mContents
            int r6 = r6.length
            long r6 = (long) r6
            long r3 = r3 + r6
        L88:
            int r1 = r1 + 1
            goto L3d
        L8b:
            r1 = 0
        L8c:
            int r5 = r2.size()
            if (r1 >= r5) goto L9e
            java.lang.Object r5 = r2.get(r1)
            byte[] r5 = (byte[]) r5
            r11.write(r5)
            int r1 = r1 + 1
            goto L8c
        L9e:
            return
    }
}
