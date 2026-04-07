package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
class VersionedParcelParcel extends androidx.versionedparcelable.VersionedParcel {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final android.os.Parcel mParcel;
    private final android.util.SparseIntArray mPositionLookup;
    private final java.lang.String mPrefix;

    VersionedParcelParcel(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private VersionedParcelParcel(android.os.Parcel r3, int r4, int r5, java.lang.String r6, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r7, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r8, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r9) {
            r2 = this;
            r2.<init>(r7, r8, r9)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.mPositionLookup = r0
            r0 = -1
            r2.mCurrentField = r0
            r1 = 0
            r2.mNextRead = r1
            r2.mFieldId = r0
            r2.mParcel = r3
            r2.mOffset = r4
            r2.mEnd = r5
            int r0 = r2.mOffset
            r2.mNextRead = r0
            r2.mPrefix = r6
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
            r4 = this;
            int r0 = r4.mCurrentField
            if (r0 < 0) goto L23
            android.util.SparseIntArray r0 = r4.mPositionLookup
            int r1 = r4.mCurrentField
            int r0 = r0.get(r1)
            android.os.Parcel r1 = r4.mParcel
            int r1 = r1.dataPosition()
            int r2 = r1 - r0
            android.os.Parcel r3 = r4.mParcel
            r3.setDataPosition(r0)
            android.os.Parcel r3 = r4.mParcel
            r3.writeInt(r2)
            android.os.Parcel r3 = r4.mParcel
            r3.setDataPosition(r1)
        L23:
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected androidx.versionedparcelable.VersionedParcel createSubParcel() {
            r8 = this;
            androidx.versionedparcelable.VersionedParcelParcel r0 = new androidx.versionedparcelable.VersionedParcelParcel
            android.os.Parcel r1 = r8.mParcel
            android.os.Parcel r2 = r8.mParcel
            int r2 = r2.dataPosition()
            int r3 = r8.mNextRead
            int r4 = r8.mOffset
            if (r3 != r4) goto L13
            int r3 = r8.mEnd
            goto L15
        L13:
            int r3 = r8.mNextRead
        L15:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.mPrefix
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "  "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r5 = r8.mReadCache
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r6 = r8.mWriteCache
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r7 = r8.mParcelizerCache
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            int r0 = r0.readInt()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.Bundle readBundle() {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r0 = r0.readBundle(r1)
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
            r3 = this;
            android.os.Parcel r0 = r3.mParcel
            int r0 = r0.readInt()
            if (r0 >= 0) goto La
            r1 = 0
            return r1
        La:
            byte[] r1 = new byte[r0]
            android.os.Parcel r2 = r3.mParcel
            r2.readByteArray(r1)
            return r1
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected java.lang.CharSequence readCharSequence() {
            r2 = this;
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r2.mParcel
            java.lang.Object r0 = r0.createFromParcel(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            double r0 = r0.readDouble()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int r5) {
            r4 = this;
        L1:
            int r0 = r4.mNextRead
            int r1 = r4.mEnd
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L3a
            int r0 = r4.mFieldId
            if (r0 != r5) goto Le
            return r2
        Le:
            int r0 = r4.mFieldId
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1f
            return r3
        L1f:
            android.os.Parcel r0 = r4.mParcel
            int r1 = r4.mNextRead
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.mParcel
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.mParcel
            int r1 = r1.readInt()
            r4.mFieldId = r1
            int r1 = r4.mNextRead
            int r1 = r1 + r0
            r4.mNextRead = r1
            goto L1
        L3a:
            int r0 = r4.mFieldId
            if (r0 != r5) goto L3f
            goto L40
        L3f:
            r2 = r3
        L40:
            return r2
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            float r0 = r0.readFloat()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            int r0 = r0.readInt()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            long r0 = r0.readLong()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends android.os.Parcelable> T readParcelable() {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public java.lang.String readString() {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.IBinder readStrongBinder() {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            android.os.IBinder r0 = r0.readStrongBinder()
            return r0
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int r3) {
            r2 = this;
            r2.closeField()
            r2.mCurrentField = r3
            android.util.SparseIntArray r0 = r2.mPositionLookup
            android.os.Parcel r1 = r2.mParcel
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            r0 = 0
            r2.writeInt(r0)
            r2.writeInt(r3)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeInt(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(android.os.Bundle r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeBundle(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.mParcel
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.mParcel
            r0.writeByteArray(r3)
            goto L14
        Le:
            android.os.Parcel r0 = r2.mParcel
            r1 = -1
            r0.writeInt(r1)
        L14:
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.mParcel
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.mParcel
            r0.writeByteArray(r3, r4, r5)
            goto L14
        Le:
            android.os.Parcel r0 = r2.mParcel
            r1 = -1
            r0.writeInt(r1)
        L14:
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(java.lang.CharSequence r3) {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            r1 = 0
            android.text.TextUtils.writeToParcel(r3, r0, r1)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeDouble(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeFloat(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeInt(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeLong(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = r2.mParcel
            r1 = 0
            r0.writeParcelable(r3, r1)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(java.lang.String r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeString(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(android.os.IBinder r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeStrongBinder(r2)
            return
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(android.os.IInterface r2) {
            r1 = this;
            android.os.Parcel r0 = r1.mParcel
            r0.writeStrongInterface(r2)
            return
    }
}
