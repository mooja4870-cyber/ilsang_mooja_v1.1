package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
class VersionedParcelStream extends androidx.versionedparcelable.VersionedParcel {
    private static final int TYPE_BOOLEAN = 5;
    private static final int TYPE_BOOLEAN_ARRAY = 6;
    private static final int TYPE_DOUBLE = 7;
    private static final int TYPE_DOUBLE_ARRAY = 8;
    private static final int TYPE_FLOAT = 13;
    private static final int TYPE_FLOAT_ARRAY = 14;
    private static final int TYPE_INT = 9;
    private static final int TYPE_INT_ARRAY = 10;
    private static final int TYPE_LONG = 11;
    private static final int TYPE_LONG_ARRAY = 12;
    private static final int TYPE_NULL = 0;
    private static final int TYPE_STRING = 3;
    private static final int TYPE_STRING_ARRAY = 4;
    private static final int TYPE_SUB_BUNDLE = 1;
    private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
    private static final java.nio.charset.Charset UTF_16 = null;
    int mCount;
    private java.io.DataInputStream mCurrentInput;
    private java.io.DataOutputStream mCurrentOutput;
    private androidx.versionedparcelable.VersionedParcelStream.FieldBuffer mFieldBuffer;
    private int mFieldId;
    int mFieldSize;
    private boolean mIgnoreParcelables;
    private final java.io.DataInputStream mMasterInput;
    private final java.io.DataOutputStream mMasterOutput;


    private static class FieldBuffer {
        final java.io.DataOutputStream mDataStream;
        private final int mFieldId;
        final java.io.ByteArrayOutputStream mOutput;
        private final java.io.DataOutputStream mTarget;

        FieldBuffer(int r3, java.io.DataOutputStream r4) {
                r2 = this;
                r2.<init>()
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                r2.mOutput = r0
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.ByteArrayOutputStream r1 = r2.mOutput
                r0.<init>(r1)
                r2.mDataStream = r0
                r2.mFieldId = r3
                r2.mTarget = r4
                return
        }

        void flushField() throws java.io.IOException {
                r4 = this;
                java.io.DataOutputStream r0 = r4.mDataStream
                r0.flush()
                java.io.ByteArrayOutputStream r0 = r4.mOutput
                int r0 = r0.size()
                int r1 = r4.mFieldId
                int r1 = r1 << 16
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r0 < r2) goto L16
                r3 = r2
                goto L17
            L16:
                r3 = r0
            L17:
                r1 = r1 | r3
                java.io.DataOutputStream r3 = r4.mTarget
                r3.writeInt(r1)
                if (r0 < r2) goto L24
                java.io.DataOutputStream r2 = r4.mTarget
                r2.writeInt(r0)
            L24:
                java.io.ByteArrayOutputStream r2 = r4.mOutput
                java.io.DataOutputStream r3 = r4.mTarget
                r2.writeTo(r3)
                return
        }
    }

    static {
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.versionedparcelable.VersionedParcelStream.UTF_16 = r0
            return
    }

    public VersionedParcelStream(java.io.InputStream r7, java.io.OutputStream r8) {
            r6 = this;
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private VersionedParcelStream(java.io.InputStream r4, java.io.OutputStream r5, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r6, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r7, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r8) {
            r3 = this;
            r3.<init>(r6, r7, r8)
            r0 = 0
            r3.mCount = r0
            r0 = -1
            r3.mFieldId = r0
            r3.mFieldSize = r0
            r0 = 0
            if (r4 == 0) goto L19
            java.io.DataInputStream r1 = new java.io.DataInputStream
            androidx.versionedparcelable.VersionedParcelStream$1 r2 = new androidx.versionedparcelable.VersionedParcelStream$1
            r2.<init>(r3, r4)
            r1.<init>(r2)
            goto L1a
        L19:
            r1 = r0
        L1a:
            r3.mMasterInput = r1
            if (r5 == 0) goto L23
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r5)
        L23:
            r3.mMasterOutput = r0
            java.io.DataInputStream r0 = r3.mMasterInput
            r3.mCurrentInput = r0
            java.io.DataOutputStream r0 = r3.mMasterOutput
            r3.mCurrentOutput = r0
            return
    }

    private void readObject(int r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            switch(r4) {
                case 0: goto L93;
                case 1: goto L8b;
                case 2: goto L83;
                case 3: goto L7b;
                case 4: goto L6e;
                case 5: goto L66;
                case 6: goto L5e;
                case 7: goto L56;
                case 8: goto L4e;
                case 9: goto L46;
                case 10: goto L3e;
                case 11: goto L36;
                case 12: goto L2e;
                case 13: goto L25;
                case 14: goto L1c;
                default: goto L3;
            }
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            float[] r0 = r3.readFloatArray()
            r6.putFloatArray(r5, r0)
            goto L98
        L25:
            float r0 = r3.readFloat()
            r6.putFloat(r5, r0)
            goto L98
        L2e:
            long[] r0 = r3.readLongArray()
            r6.putLongArray(r5, r0)
            goto L98
        L36:
            long r0 = r3.readLong()
            r6.putLong(r5, r0)
            goto L98
        L3e:
            int[] r0 = r3.readIntArray()
            r6.putIntArray(r5, r0)
            goto L98
        L46:
            int r0 = r3.readInt()
            r6.putInt(r5, r0)
            goto L98
        L4e:
            double[] r0 = r3.readDoubleArray()
            r6.putDoubleArray(r5, r0)
            goto L98
        L56:
            double r0 = r3.readDouble()
            r6.putDouble(r5, r0)
            goto L98
        L5e:
            boolean[] r0 = r3.readBooleanArray()
            r6.putBooleanArray(r5, r0)
            goto L98
        L66:
            boolean r0 = r3.readBoolean()
            r6.putBoolean(r5, r0)
            goto L98
        L6e:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r3.readArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r6.putStringArray(r5, r0)
            goto L98
        L7b:
            java.lang.String r0 = r3.readString()
            r6.putString(r5, r0)
            goto L98
        L83:
            android.os.Bundle r0 = r3.readBundle()
            r6.putBundle(r5, r0)
            goto L98
        L8b:
            android.os.Bundle r0 = r3.readBundle()
            r6.putBundle(r5, r0)
            goto L98
        L93:
            r0 = 0
            r6.putParcelable(r5, r0)
        L98:
            return
    }

    private void writeObject(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L8
            r0 = 0
            r3.writeInt(r0)
            goto Lf8
        L8:
            boolean r0 = r4 instanceof android.os.Bundle
            if (r0 == 0) goto L18
            r0 = 1
            r3.writeInt(r0)
            r0 = r4
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.writeBundle(r0)
            goto Lf8
        L18:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L28
            r0 = 3
            r3.writeInt(r0)
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            r3.writeString(r0)
            goto Lf8
        L28:
            boolean r0 = r4 instanceof java.lang.String[]
            if (r0 == 0) goto L3a
            r0 = 4
            r3.writeInt(r0)
            r0 = r4
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.writeArray(r0)
            goto Lf8
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L4e
            r0 = 5
            r3.writeInt(r0)
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.writeBoolean(r0)
            goto Lf8
        L4e:
            boolean r0 = r4 instanceof boolean[]
            if (r0 == 0) goto L60
            r0 = 6
            r3.writeInt(r0)
            r0 = r4
            boolean[] r0 = (boolean[]) r0
            boolean[] r0 = (boolean[]) r0
            r3.writeBooleanArray(r0)
            goto Lf8
        L60:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L74
            r0 = 7
            r3.writeInt(r0)
            r0 = r4
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r3.writeDouble(r0)
            goto Lf8
        L74:
            boolean r0 = r4 instanceof double[]
            if (r0 == 0) goto L87
            r0 = 8
            r3.writeInt(r0)
            r0 = r4
            double[] r0 = (double[]) r0
            double[] r0 = (double[]) r0
            r3.writeDoubleArray(r0)
            goto Lf8
        L87:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L9b
            r0 = 9
            r3.writeInt(r0)
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeInt(r0)
            goto Lf8
        L9b:
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto Lad
            r0 = 10
            r3.writeInt(r0)
            r0 = r4
            int[] r0 = (int[]) r0
            int[] r0 = (int[]) r0
            r3.writeIntArray(r0)
            goto Lf8
        Lad:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto Lc1
            r0 = 11
            r3.writeInt(r0)
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeLong(r0)
            goto Lf8
        Lc1:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto Ld3
            r0 = 12
            r3.writeInt(r0)
            r0 = r4
            long[] r0 = (long[]) r0
            long[] r0 = (long[]) r0
            r3.writeLongArray(r0)
            goto Lf8
        Ld3:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto Le7
            r0 = 13
            r3.writeInt(r0)
            r0 = r4
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r3.writeFloat(r0)
            goto Lf8
        Le7:
            boolean r0 = r4 instanceof float[]
            if (r0 == 0) goto Lf9
            r0 = 14
            r3.writeInt(r0)
            r0 = r4
            float[] r0 = (float[]) r0
            float[] r0 = (float[]) r0
            r3.writeFloatArray(r0)
        Lf8:
            return
        Lf9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
            r2 = this;
            androidx.versionedparcelable.VersionedParcelStream$FieldBuffer r0 = r2.mFieldBuffer
            if (r0 == 0) goto L1f
            androidx.versionedparcelable.VersionedParcelStream$FieldBuffer r0 = r2.mFieldBuffer     // Catch: java.io.IOException -> L18
            java.io.ByteArrayOutputStream r0 = r0.mOutput     // Catch: java.io.IOException -> L18
            int r0 = r0.size()     // Catch: java.io.IOException -> L18
            if (r0 == 0) goto L13
            androidx.versionedparcelable.VersionedParcelStream$FieldBuffer r0 = r2.mFieldBuffer     // Catch: java.io.IOException -> L18
            r0.flushField()     // Catch: java.io.IOException -> L18
        L13:
            r0 = 0
            r2.mFieldBuffer = r0
            goto L1f
        L18:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
        L1f:
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected androidx.versionedparcelable.VersionedParcel createSubParcel() {
            r6 = this;
            androidx.versionedparcelable.VersionedParcelStream r0 = new androidx.versionedparcelable.VersionedParcelStream
            java.io.DataInputStream r1 = r6.mCurrentInput
            java.io.DataOutputStream r2 = r6.mCurrentOutput
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r3 = r6.mReadCache
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r4 = r6.mWriteCache
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r5 = r6.mParcelizerCache
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
            r2 = this;
            java.io.DataInputStream r0 = r2.mCurrentInput     // Catch: java.io.IOException -> L7
            boolean r0 = r0.readBoolean()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.Bundle readBundle() {
            r5 = this;
            int r0 = r5.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
        Le:
            if (r2 >= r0) goto L1e
            java.lang.String r3 = r5.readString()
            int r4 = r5.readInt()
            r5.readObject(r4, r3, r1)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
            r3 = this;
            java.io.DataInputStream r0 = r3.mCurrentInput     // Catch: java.io.IOException -> L12
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L12
            if (r0 <= 0) goto L10
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L12
            java.io.DataInputStream r2 = r3.mCurrentInput     // Catch: java.io.IOException -> L12
            r2.readFully(r1)     // Catch: java.io.IOException -> L12
            return r1
        L10:
            r1 = 0
            return r1
        L12:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected java.lang.CharSequence readCharSequence() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
            r2 = this;
            java.io.DataInputStream r0 = r2.mCurrentInput     // Catch: java.io.IOException -> L7
            double r0 = r0.readDouble()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int r6) {
            r5 = this;
        L1:
            r0 = 0
            int r1 = r5.mFieldId     // Catch: java.io.IOException -> L4b
            if (r1 != r6) goto L8
            r0 = 1
            return r0
        L8:
            int r1 = r5.mFieldId     // Catch: java.io.IOException -> L4b
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> L4b
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> L4b
            int r1 = r1.compareTo(r2)     // Catch: java.io.IOException -> L4b
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r1 = r5.mCount     // Catch: java.io.IOException -> L4b
            int r2 = r5.mFieldSize     // Catch: java.io.IOException -> L4b
            if (r1 >= r2) goto L2a
            java.io.DataInputStream r1 = r5.mMasterInput     // Catch: java.io.IOException -> L4b
            int r2 = r5.mFieldSize     // Catch: java.io.IOException -> L4b
            int r3 = r5.mCount     // Catch: java.io.IOException -> L4b
            int r2 = r2 - r3
            long r2 = (long) r2     // Catch: java.io.IOException -> L4b
            r1.skip(r2)     // Catch: java.io.IOException -> L4b
        L2a:
            r1 = -1
            r5.mFieldSize = r1     // Catch: java.io.IOException -> L4b
            java.io.DataInputStream r1 = r5.mMasterInput     // Catch: java.io.IOException -> L4b
            int r1 = r1.readInt()     // Catch: java.io.IOException -> L4b
            r5.mCount = r0     // Catch: java.io.IOException -> L4b
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = r1 & r2
            if (r3 != r2) goto L43
            java.io.DataInputStream r4 = r5.mMasterInput     // Catch: java.io.IOException -> L4b
            int r4 = r4.readInt()     // Catch: java.io.IOException -> L4b
            r3 = r4
        L43:
            int r4 = r1 >> 16
            r2 = r2 & r4
            r5.mFieldId = r2     // Catch: java.io.IOException -> L4b
            r5.mFieldSize = r3     // Catch: java.io.IOException -> L4b
            goto L1
        L4b:
            r1 = move-exception
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
            r2 = this;
            java.io.DataInputStream r0 = r2.mCurrentInput     // Catch: java.io.IOException -> L7
            float r0 = r0.readFloat()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
            r2 = this;
            java.io.DataInputStream r0 = r2.mCurrentInput     // Catch: java.io.IOException -> L7
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
            r2 = this;
            java.io.DataInputStream r0 = r2.mCurrentInput     // Catch: java.io.IOException -> L7
            long r0 = r0.readLong()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends android.os.Parcelable> T readParcelable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public java.lang.String readString() {
            r4 = this;
            java.io.DataInputStream r0 = r4.mCurrentInput     // Catch: java.io.IOException -> L19
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L19
            if (r0 <= 0) goto L17
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L19
            java.io.DataInputStream r2 = r4.mCurrentInput     // Catch: java.io.IOException -> L19
            r2.readFully(r1)     // Catch: java.io.IOException -> L19
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L19
            java.nio.charset.Charset r3 = androidx.versionedparcelable.VersionedParcelStream.UTF_16     // Catch: java.io.IOException -> L19
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L19
            return r2
        L17:
            r1 = 0
            return r1
        L19:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.IBinder readStrongBinder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int r3) {
            r2 = this;
            r2.closeField()
            androidx.versionedparcelable.VersionedParcelStream$FieldBuffer r0 = new androidx.versionedparcelable.VersionedParcelStream$FieldBuffer
            java.io.DataOutputStream r1 = r2.mMasterOutput
            r0.<init>(r3, r1)
            r2.mFieldBuffer = r0
            androidx.versionedparcelable.VersionedParcelStream$FieldBuffer r0 = r2.mFieldBuffer
            java.io.DataOutputStream r0 = r0.mDataStream
            r2.mCurrentOutput = r0
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L5
            r2.mIgnoreParcelables = r4
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Serialization of this object is not allowed"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L7
            r0.writeBoolean(r3)     // Catch: java.io.IOException -> L7
            return
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(android.os.Bundle r5) {
            r4 = this;
            if (r5 == 0) goto L2b
            java.util.Set r0 = r5.keySet()     // Catch: java.io.IOException -> L33
            java.io.DataOutputStream r1 = r4.mCurrentOutput     // Catch: java.io.IOException -> L33
            int r2 = r0.size()     // Catch: java.io.IOException -> L33
            r1.writeInt(r2)     // Catch: java.io.IOException -> L33
            java.util.Iterator r1 = r0.iterator()     // Catch: java.io.IOException -> L33
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L33
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L33
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> L33
            r4.writeString(r2)     // Catch: java.io.IOException -> L33
            java.lang.Object r3 = r5.get(r2)     // Catch: java.io.IOException -> L33
            r4.writeObject(r3)     // Catch: java.io.IOException -> L33
            goto L13
        L2a:
            goto L31
        L2b:
            java.io.DataOutputStream r0 = r4.mCurrentOutput     // Catch: java.io.IOException -> L33
            r1 = -1
            r0.writeInt(r1)     // Catch: java.io.IOException -> L33
        L31:
            return
        L33:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Le
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L16
            int r1 = r3.length     // Catch: java.io.IOException -> L16
            r0.writeInt(r1)     // Catch: java.io.IOException -> L16
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L16
            r0.write(r3)     // Catch: java.io.IOException -> L16
            goto L14
        Le:
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L16
            r1 = -1
            r0.writeInt(r1)     // Catch: java.io.IOException -> L16
        L14:
            return
        L16:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto Ld
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L15
            r0.writeInt(r5)     // Catch: java.io.IOException -> L15
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L15
            r0.write(r3, r4, r5)     // Catch: java.io.IOException -> L15
            goto L13
        Ld:
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L15
            r1 = -1
            r0.writeInt(r1)     // Catch: java.io.IOException -> L15
        L13:
            return
        L15:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r2.mIgnoreParcelables
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "CharSequence cannot be written to an OutputStream"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L7
            r0.writeDouble(r3)     // Catch: java.io.IOException -> L7
            return
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L7
            r0.writeFloat(r3)     // Catch: java.io.IOException -> L7
            return
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L7
            r0.writeInt(r3)     // Catch: java.io.IOException -> L7
            return
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.mCurrentOutput     // Catch: java.io.IOException -> L7
            r0.writeLong(r3)     // Catch: java.io.IOException -> L7
            return
        L7:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r2.mIgnoreParcelables
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Parcelables cannot be written to an OutputStream"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L14
            java.nio.charset.Charset r0 = androidx.versionedparcelable.VersionedParcelStream.UTF_16     // Catch: java.io.IOException -> L1c
            byte[] r0 = r4.getBytes(r0)     // Catch: java.io.IOException -> L1c
            java.io.DataOutputStream r1 = r3.mCurrentOutput     // Catch: java.io.IOException -> L1c
            int r2 = r0.length     // Catch: java.io.IOException -> L1c
            r1.writeInt(r2)     // Catch: java.io.IOException -> L1c
            java.io.DataOutputStream r1 = r3.mCurrentOutput     // Catch: java.io.IOException -> L1c
            r1.write(r0)     // Catch: java.io.IOException -> L1c
            goto L1a
        L14:
            java.io.DataOutputStream r0 = r3.mCurrentOutput     // Catch: java.io.IOException -> L1c
            r1 = -1
            r0.writeInt(r1)     // Catch: java.io.IOException -> L1c
        L1a:
            return
        L1c:
            r0 = move-exception
            androidx.versionedparcelable.VersionedParcel$ParcelException r1 = new androidx.versionedparcelable.VersionedParcel$ParcelException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(android.os.IBinder r3) {
            r2 = this;
            boolean r0 = r2.mIgnoreParcelables
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Binders cannot be written to an OutputStream"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(android.os.IInterface r3) {
            r2 = this;
            boolean r0 = r2.mIgnoreParcelables
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Binders cannot be written to an OutputStream"
            r0.<init>(r1)
            throw r0
    }
}
