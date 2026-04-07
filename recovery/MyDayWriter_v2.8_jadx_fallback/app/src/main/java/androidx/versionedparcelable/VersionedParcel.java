package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final java.lang.String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.Class> mParcelizerCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mReadCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mWriteCache;


    public static class ParcelException extends java.lang.RuntimeException {
        public ParcelException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public VersionedParcel(androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r1, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r3) {
            r0 = this;
            r0.<init>()
            r0.mReadCache = r1
            r0.mWriteCache = r2
            r0.mParcelizerCache = r3
            return
    }

    private java.lang.Exception createException(int r4, java.lang.String r5) {
            r3 = this;
            switch(r4) {
                case -9: goto L50;
                case -8: goto L3;
                case -7: goto L4a;
                case -6: goto L44;
                case -5: goto L3e;
                case -4: goto L38;
                case -3: goto L32;
                case -2: goto L2c;
                case -1: goto L26;
                default: goto L3;
            }
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown exception code: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " msg "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
        L26:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r5)
            return r0
        L2c:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            r0.<init>(r5)
            return r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            return r0
        L38:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            return r0
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            return r0
        L44:
            android.os.NetworkOnMainThreadException r0 = new android.os.NetworkOnMainThreadException
            r0.<init>()
            return r0
        L4a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r5)
            return r0
        L50:
            android.os.Parcelable r0 = r3.readParcelable()
            java.lang.Exception r0 = (java.lang.Exception) r0
            return r0
    }

    private java.lang.Class findParcelClass(java.lang.Class<? extends androidx.versionedparcelable.VersionedParcelable> r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r0 = r5.mParcelizerCache
            java.lang.String r1 = r6.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L36
            java.lang.Package r1 = r6.getPackage()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r6.getSimpleName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "%s.%sParcelizer"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r3 = 0
            java.lang.ClassLoader r4 = r6.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r2, r3, r4)
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r3 = r5.mParcelizerCache
            java.lang.String r4 = r6.getName()
            r3.put(r4, r0)
        L36:
            return r0
    }

    private java.lang.reflect.Method getReadMethod(java.lang.String r8) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r7 = this;
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r0 = r7.mReadCache
            java.lang.Object r0 = r0.get(r8)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Class<androidx.versionedparcelable.VersionedParcel> r3 = androidx.versionedparcelable.VersionedParcel.class
            java.lang.ClassLoader r4 = r3.getClassLoader()
            r5 = 1
            java.lang.Class r4 = java.lang.Class.forName(r8, r5, r4)
            java.lang.Class[] r5 = new java.lang.Class[r5]
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = "read"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r3, r5)
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r3 = r7.mReadCache
            r3.put(r8, r0)
        L29:
            return r0
    }

    protected static java.lang.Throwable getRootCause(java.lang.Throwable r1) {
        L1:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto Lc
            java.lang.Throwable r1 = r1.getCause()
            goto L1
        Lc:
            return r1
    }

    private <T> int getType(T r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L6
            r0 = 4
            return r0
        L6:
            boolean r0 = r4 instanceof android.os.Parcelable
            if (r0 == 0) goto Lc
            r0 = 2
            return r0
        Lc:
            boolean r0 = r4 instanceof androidx.versionedparcelable.VersionedParcelable
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            boolean r0 = r4 instanceof java.io.Serializable
            if (r0 == 0) goto L18
            r0 = 3
            return r0
        L18:
            boolean r0 = r4 instanceof android.os.IBinder
            if (r0 == 0) goto L1e
            r0 = 5
            return r0
        L1e:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L24
            r0 = 7
            return r0
        L24:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L2b
            r0 = 8
            return r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " cannot be VersionedParcelled"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.reflect.Method getWriteMethod(java.lang.Class r8) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r7 = this;
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r0 = r7.mWriteCache
            java.lang.String r1 = r8.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L30
            java.lang.Class r1 = r7.findParcelClass(r8)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]
            r5 = 0
            r4[r5] = r8
            r5 = 1
            java.lang.Class<androidx.versionedparcelable.VersionedParcel> r6 = androidx.versionedparcelable.VersionedParcel.class
            r4[r5] = r6
            java.lang.String r5 = "write"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r5, r4)
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r4 = r7.mWriteCache
            java.lang.String r5 = r8.getName()
            r4.put(r5, r0)
        L30:
            return r0
    }

    private <T, S extends java.util.Collection<T>> S readCollection(S r4) {
            r3 = this;
            int r0 = r3.readInt()
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L51
            int r2 = r3.readInt()
            if (r0 >= 0) goto L11
            return r1
        L11:
            switch(r2) {
                case 1: goto L45;
                case 2: goto L39;
                case 3: goto L2d;
                case 4: goto L21;
                case 5: goto L15;
                default: goto L14;
            }
        L14:
            goto L51
        L15:
            if (r0 <= 0) goto L51
            android.os.IBinder r1 = r3.readStrongBinder()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L15
        L21:
            if (r0 <= 0) goto L51
            java.lang.String r1 = r3.readString()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L21
        L2d:
            if (r0 <= 0) goto L51
            java.io.Serializable r1 = r3.readSerializable()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L2d
        L39:
            if (r0 <= 0) goto L51
            android.os.Parcelable r1 = r3.readParcelable()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L39
        L45:
            if (r0 <= 0) goto L51
            androidx.versionedparcelable.VersionedParcelable r1 = r3.readVersionedParcelable()
            r4.add(r1)
            int r0 = r0 + (-1)
            goto L45
        L51:
            return r4
    }

    private java.lang.Exception readException(int r2, java.lang.String r3) {
            r1 = this;
            java.lang.Exception r0 = r1.createException(r2, r3)
            return r0
    }

    private int readExceptionCode() {
            r1 = this;
            int r0 = r1.readInt()
            return r0
    }

    private <T> void writeCollection(java.util.Collection<T> r6) {
            r5 = this;
            if (r6 != 0) goto L7
            r0 = -1
            r5.writeInt(r0)
            return
        L7:
            int r0 = r6.size()
            r5.writeInt(r0)
            if (r0 <= 0) goto Lc6
            java.util.Iterator r1 = r6.iterator()
            java.lang.Object r1 = r1.next()
            int r1 = r5.getType(r1)
            r5.writeInt(r1)
            switch(r1) {
                case 1: goto Lb0;
                case 2: goto L9a;
                case 3: goto L84;
                case 4: goto L6e;
                case 5: goto L58;
                case 6: goto L22;
                case 7: goto L3d;
                case 8: goto L24;
                default: goto L22;
            }
        L22:
            goto Lc6
        L24:
            java.util.Iterator r2 = r6.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5.writeFloat(r4)
            goto L28
        L3d:
            java.util.Iterator r2 = r6.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.writeInt(r4)
            goto L41
        L56:
            goto Lc6
        L58:
            java.util.Iterator r2 = r6.iterator()
        L5c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()
            r4 = r3
            android.os.IBinder r4 = (android.os.IBinder) r4
            r5.writeStrongBinder(r4)
            goto L5c
        L6d:
            goto Lc6
        L6e:
            java.util.Iterator r2 = r6.iterator()
        L72:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r5.writeString(r4)
            goto L72
        L83:
            goto Lc6
        L84:
            java.util.Iterator r2 = r6.iterator()
        L88:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L99
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.io.Serializable r4 = (java.io.Serializable) r4
            r5.writeSerializable(r4)
            goto L88
        L99:
            goto Lc6
        L9a:
            java.util.Iterator r2 = r6.iterator()
        L9e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r2.next()
            r4 = r3
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r5.writeParcelable(r4)
            goto L9e
        Laf:
            goto Lc6
        Lb0:
            java.util.Iterator r2 = r6.iterator()
        Lb4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.versionedparcelable.VersionedParcelable r4 = (androidx.versionedparcelable.VersionedParcelable) r4
            r5.writeVersionedParcelable(r4)
            goto Lb4
        Lc5:
        Lc6:
            return
    }

    private <T> void writeCollection(java.util.Collection<T> r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeCollection(r1)
            return
    }

    private void writeSerializable(java.io.Serializable r7) {
            r6 = this;
            if (r7 != 0) goto L7
            r0 = 0
            r6.writeString(r0)
            return
        L7:
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            r6.writeString(r0)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L2b
            r2.<init>(r1)     // Catch: java.io.IOException -> L2b
            r2.writeObject(r7)     // Catch: java.io.IOException -> L2b
            r2.close()     // Catch: java.io.IOException -> L2b
            byte[] r3 = r1.toByteArray()     // Catch: java.io.IOException -> L2b
            r6.writeByteArray(r3)     // Catch: java.io.IOException -> L2b
            return
        L2b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "VersionedParcelable encountered IOException writing serializable object (name = "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = ")"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    private void writeVersionedParcelableCreator(androidx.versionedparcelable.VersionedParcelable r6) {
            r5 = this;
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.ClassNotFoundException -> L12
            java.lang.Class r1 = r5.findParcelClass(r1)     // Catch: java.lang.ClassNotFoundException -> L12
            java.lang.String r0 = r1.getName()
            r5.writeString(r0)
            return
        L12:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " does not have a Parcelizer"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
    }

    protected abstract void closeField();

    protected abstract androidx.versionedparcelable.VersionedParcel createSubParcel();

    public boolean isStream() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected <T> T[] readArray(T[] r5) {
            r4 = this;
            int r0 = r4.readInt()
            r1 = 0
            if (r0 >= 0) goto L8
            return r1
        L8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            if (r0 == 0) goto L56
            int r3 = r4.readInt()
            if (r0 >= 0) goto L16
            return r1
        L16:
            switch(r3) {
                case 1: goto L4a;
                case 2: goto L3e;
                case 3: goto L32;
                case 4: goto L26;
                case 5: goto L1a;
                default: goto L19;
            }
        L19:
            goto L56
        L1a:
            if (r0 <= 0) goto L56
            android.os.IBinder r1 = r4.readStrongBinder()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L1a
        L26:
            if (r0 <= 0) goto L56
            java.lang.String r1 = r4.readString()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L26
        L32:
            if (r0 <= 0) goto L56
            java.io.Serializable r1 = r4.readSerializable()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L32
        L3e:
            if (r0 <= 0) goto L56
            android.os.Parcelable r1 = r4.readParcelable()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L3e
        L4a:
            if (r0 <= 0) goto L56
            androidx.versionedparcelable.VersionedParcelable r1 = r4.readVersionedParcelable()
            r2.add(r1)
            int r0 = r0 + (-1)
            goto L4a
        L56:
            java.lang.Object[] r1 = r2.toArray(r5)
            return r1
    }

    public <T> T[] readArray(T[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Object[] r0 = r1.readArray(r2)
            return r0
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            boolean r0 = r1.readBoolean()
            return r0
    }

    protected boolean[] readBooleanArray() {
            r4 = this;
            int r0 = r4.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean[] r1 = new boolean[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1b
            int r3 = r4.readInt()
            if (r3 == 0) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L1b:
            return r1
    }

    public boolean[] readBooleanArray(boolean[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            boolean[] r0 = r1.readBooleanArray()
            return r0
    }

    protected abstract android.os.Bundle readBundle();

    public android.os.Bundle readBundle(android.os.Bundle r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            android.os.Bundle r0 = r1.readBundle()
            return r0
    }

    public byte readByte(byte r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            int r0 = r1.readInt()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            return r0
    }

    protected abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            byte[] r0 = r1.readByteArray()
            return r0
    }

    public char[] readCharArray(char[] r5, int r6) {
            r4 = this;
            boolean r0 = r4.readField(r6)
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r4.readInt()
            if (r0 >= 0) goto Lf
            r1 = 0
            return r1
        Lf:
            char[] r1 = new char[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L1e
            int r3 = r4.readInt()
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L1e:
            return r1
    }

    protected abstract java.lang.CharSequence readCharSequence();

    public java.lang.CharSequence readCharSequence(java.lang.CharSequence r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.CharSequence r0 = r1.readCharSequence()
            return r0
    }

    protected abstract double readDouble();

    public double readDouble(double r3, int r5) {
            r2 = this;
            boolean r0 = r2.readField(r5)
            if (r0 != 0) goto L7
            return r3
        L7:
            double r0 = r2.readDouble()
            return r0
    }

    protected double[] readDoubleArray() {
            r5 = this;
            int r0 = r5.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            double[] r1 = new double[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            double r3 = r5.readDouble()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    public double[] readDoubleArray(double[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            double[] r0 = r1.readDoubleArray()
            return r0
    }

    public java.lang.Exception readException(java.lang.Exception r4, int r5) {
            r3 = this;
            boolean r0 = r3.readField(r5)
            if (r0 != 0) goto L7
            return r4
        L7:
            int r0 = r3.readExceptionCode()
            if (r0 == 0) goto L16
            java.lang.String r1 = r3.readString()
            java.lang.Exception r2 = r3.readException(r0, r1)
            return r2
        L16:
            return r4
    }

    protected abstract boolean readField(int r1);

    protected abstract float readFloat();

    public float readFloat(float r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            float r0 = r1.readFloat()
            return r0
    }

    protected float[] readFloatArray() {
            r4 = this;
            int r0 = r4.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            float[] r1 = new float[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            float r3 = r4.readFloat()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    public float[] readFloatArray(float[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            float[] r0 = r1.readFloatArray()
            return r0
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readFromParcel(java.lang.String r4, androidx.versionedparcelable.VersionedParcel r5) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.getReadMethod(r4)     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L19 java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L3a
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L19 java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L3a
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L19 java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L3a
            androidx.versionedparcelable.VersionedParcelable r1 = (androidx.versionedparcelable.VersionedParcelable) r1     // Catch: java.lang.ClassNotFoundException -> L10 java.lang.NoSuchMethodException -> L19 java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L3a
            return r1
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered ClassNotFoundException"
            r1.<init>(r2, r0)
            throw r1
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered NoSuchMethodException"
            r1.<init>(r2, r0)
            throw r1
        L22:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L32
            java.lang.Throwable r1 = r0.getCause()
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L32:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered InvocationTargetException"
            r1.<init>(r2, r0)
            throw r1
        L3a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r1.<init>(r2, r0)
            throw r1
    }

    protected abstract int readInt();

    public int readInt(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            int r0 = r1.readInt()
            return r0
    }

    protected int[] readIntArray() {
            r4 = this;
            int r0 = r4.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            int[] r1 = new int[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            int r3 = r4.readInt()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    public int[] readIntArray(int[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            int[] r0 = r1.readIntArray()
            return r0
    }

    public <T> java.util.List<T> readList(java.util.List<T> r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = r1.readCollection(r0)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    protected abstract long readLong();

    public long readLong(long r3, int r5) {
            r2 = this;
            boolean r0 = r2.readField(r5)
            if (r0 != 0) goto L7
            return r3
        L7:
            long r0 = r2.readLong()
            return r0
    }

    protected long[] readLongArray() {
            r5 = this;
            int r0 = r5.readInt()
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            long[] r1 = new long[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L16
            long r3 = r5.readLong()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L16:
            return r1
    }

    public long[] readLongArray(long[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            long[] r0 = r1.readLongArray()
            return r0
    }

    public <K, V> java.util.Map<K, V> readMap(java.util.Map<K, V> r8, int r9) {
            r7 = this;
            boolean r0 = r7.readField(r9)
            if (r0 != 0) goto L7
            return r8
        L7:
            int r0 = r7.readInt()
            if (r0 >= 0) goto Lf
            r1 = 0
            return r1
        Lf:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            if (r0 != 0) goto L17
            return r1
        L17:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7.readCollection(r2)
            r7.readCollection(r3)
            r4 = 0
        L28:
            if (r4 >= r0) goto L38
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r6 = r3.get(r4)
            r1.put(r5, r6)
            int r4 = r4 + 1
            goto L28
        L38:
            return r1
    }

    protected abstract <T extends android.os.Parcelable> T readParcelable();

    public <T extends android.os.Parcelable> T readParcelable(T r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            android.os.Parcelable r0 = r1.readParcelable()
            return r0
    }

    protected java.io.Serializable readSerializable() {
            r8 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = r8.readString()
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            byte[] r2 = r8.readByteArray()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r2)
            androidx.versionedparcelable.VersionedParcel$1 r4 = new androidx.versionedparcelable.VersionedParcel$1     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L3d
            r4.<init>(r8, r3)     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L3d
            java.lang.Object r5 = r4.readObject()     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L3d
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch: java.lang.ClassNotFoundException -> L1f java.io.IOException -> L3d
            return r5
        L1f:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r4)
            throw r5
        L3d:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "VersionedParcelable encountered IOException reading a Serializable object (name = "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r4)
            throw r5
    }

    public <T> java.util.Set<T> readSet(java.util.Set<T> r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            java.util.Collection r0 = r1.readCollection(r0)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public android.util.Size readSize(android.util.Size r4, int r5) {
            r3 = this;
            boolean r0 = r3.readField(r5)
            if (r0 != 0) goto L7
            return r4
        L7:
            boolean r0 = r3.readBoolean()
            if (r0 == 0) goto L1b
            int r0 = r3.readInt()
            int r1 = r3.readInt()
            android.util.Size r2 = new android.util.Size
            r2.<init>(r0, r1)
            return r2
        L1b:
            r0 = 0
            return r0
    }

    public android.util.SizeF readSizeF(android.util.SizeF r4, int r5) {
            r3 = this;
            boolean r0 = r3.readField(r5)
            if (r0 != 0) goto L7
            return r4
        L7:
            boolean r0 = r3.readBoolean()
            if (r0 == 0) goto L1b
            float r0 = r3.readFloat()
            float r1 = r3.readFloat()
            android.util.SizeF r2 = new android.util.SizeF
            r2.<init>(r0, r1)
            return r2
        L1b:
            r0 = 0
            return r0
    }

    public android.util.SparseBooleanArray readSparseBooleanArray(android.util.SparseBooleanArray r6, int r7) {
            r5 = this;
            boolean r0 = r5.readField(r7)
            if (r0 != 0) goto L7
            return r6
        L7:
            int r0 = r5.readInt()
            if (r0 >= 0) goto Lf
            r1 = 0
            return r1
        Lf:
            android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
            r1.<init>(r0)
            r2 = 0
        L15:
            if (r2 >= r0) goto L25
            int r3 = r5.readInt()
            boolean r4 = r5.readBoolean()
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L15
        L25:
            return r1
    }

    protected abstract java.lang.String readString();

    public java.lang.String readString(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.String r0 = r1.readString()
            return r0
    }

    protected abstract android.os.IBinder readStrongBinder();

    public android.os.IBinder readStrongBinder(android.os.IBinder r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            android.os.IBinder r0 = r1.readStrongBinder()
            return r0
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable() {
            r2 = this;
            java.lang.String r0 = r2.readString()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.versionedparcelable.VersionedParcel r1 = r2.createSubParcel()
            androidx.versionedparcelable.VersionedParcelable r1 = r2.readFromParcel(r0, r1)
            return r1
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable(T r2, int r3) {
            r1 = this;
            boolean r0 = r1.readField(r3)
            if (r0 != 0) goto L7
            return r2
        L7:
            androidx.versionedparcelable.VersionedParcelable r0 = r1.readVersionedParcelable()
            return r0
    }

    protected abstract void setOutputField(int r1);

    public void setSerializationFlags(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    protected <T> void writeArray(T[] r5) {
            r4 = this;
            if (r5 != 0) goto L7
            r0 = -1
            r4.writeInt(r0)
            return
        L7:
            int r0 = r5.length
            r1 = 0
            r4.writeInt(r0)
            if (r0 <= 0) goto L58
            r2 = 0
            r2 = r5[r2]
            int r2 = r4.getType(r2)
            r4.writeInt(r2)
            switch(r2) {
                case 1: goto L4c;
                case 2: goto L40;
                case 3: goto L34;
                case 4: goto L28;
                case 5: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L58
        L1c:
            if (r1 >= r0) goto L58
            r3 = r5[r1]
            android.os.IBinder r3 = (android.os.IBinder) r3
            r4.writeStrongBinder(r3)
            int r1 = r1 + 1
            goto L1c
        L28:
            if (r1 >= r0) goto L58
            r3 = r5[r1]
            java.lang.String r3 = (java.lang.String) r3
            r4.writeString(r3)
            int r1 = r1 + 1
            goto L28
        L34:
            if (r1 >= r0) goto L58
            r3 = r5[r1]
            java.io.Serializable r3 = (java.io.Serializable) r3
            r4.writeSerializable(r3)
            int r1 = r1 + 1
            goto L34
        L40:
            if (r1 >= r0) goto L58
            r3 = r5[r1]
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r4.writeParcelable(r3)
            int r1 = r1 + 1
            goto L40
        L4c:
            if (r1 >= r0) goto L58
            r3 = r5[r1]
            androidx.versionedparcelable.VersionedParcelable r3 = (androidx.versionedparcelable.VersionedParcelable) r3
            r4.writeVersionedParcelable(r3)
            int r1 = r1 + 1
            goto L4c
        L58:
            return
    }

    public <T> void writeArray(T[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeArray(r1)
            return
    }

    protected abstract void writeBoolean(boolean r1);

    public void writeBoolean(boolean r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeBoolean(r1)
            return
    }

    protected void writeBooleanArray(boolean[] r4) {
            r3 = this;
            if (r4 == 0) goto L12
            int r0 = r4.length
            r3.writeInt(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            boolean r2 = r4[r1]
            r3.writeInt(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            goto L16
        L12:
            r0 = -1
            r3.writeInt(r0)
        L16:
            return
    }

    public void writeBooleanArray(boolean[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeBooleanArray(r1)
            return
    }

    protected abstract void writeBundle(android.os.Bundle r1);

    public void writeBundle(android.os.Bundle r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeBundle(r1)
            return
    }

    public void writeByte(byte r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeInt(r1)
            return
    }

    protected abstract void writeByteArray(byte[] r1);

    public void writeByteArray(byte[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeByteArray(r1)
            return
    }

    protected abstract void writeByteArray(byte[] r1, int r2, int r3);

    public void writeByteArray(byte[] r1, int r2, int r3, int r4) {
            r0 = this;
            r0.setOutputField(r4)
            r0.writeByteArray(r1, r2, r3)
            return
    }

    public void writeCharArray(char[] r4, int r5) {
            r3 = this;
            r3.setOutputField(r5)
            if (r4 == 0) goto L15
            int r0 = r4.length
            r3.writeInt(r0)
            r1 = 0
        La:
            if (r1 >= r0) goto L14
            char r2 = r4[r1]
            r3.writeInt(r2)
            int r1 = r1 + 1
            goto La
        L14:
            goto L19
        L15:
            r0 = -1
            r3.writeInt(r0)
        L19:
            return
    }

    protected abstract void writeCharSequence(java.lang.CharSequence r1);

    public void writeCharSequence(java.lang.CharSequence r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeCharSequence(r1)
            return
    }

    protected abstract void writeDouble(double r1);

    public void writeDouble(double r1, int r3) {
            r0 = this;
            r0.setOutputField(r3)
            r0.writeDouble(r1)
            return
    }

    protected void writeDoubleArray(double[] r5) {
            r4 = this;
            if (r5 == 0) goto L12
            int r0 = r5.length
            r4.writeInt(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            r4.writeDouble(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            goto L16
        L12:
            r0 = -1
            r4.writeInt(r0)
        L16:
            return
    }

    public void writeDoubleArray(double[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeDoubleArray(r1)
            return
    }

    public void writeException(java.lang.Exception r4, int r5) {
            r3 = this;
            r3.setOutputField(r5)
            if (r4 != 0) goto L9
            r3.writeNoException()
            return
        L9:
            r0 = 0
            boolean r1 = r4 instanceof android.os.Parcelable
            if (r1 == 0) goto L21
            java.lang.Class r1 = r4.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r1 != r2) goto L21
            r0 = -9
            goto L4a
        L21:
            boolean r1 = r4 instanceof java.lang.SecurityException
            if (r1 == 0) goto L27
            r0 = -1
            goto L4a
        L27:
            boolean r1 = r4 instanceof android.os.BadParcelableException
            if (r1 == 0) goto L2d
            r0 = -2
            goto L4a
        L2d:
            boolean r1 = r4 instanceof java.lang.IllegalArgumentException
            if (r1 == 0) goto L33
            r0 = -3
            goto L4a
        L33:
            boolean r1 = r4 instanceof java.lang.NullPointerException
            if (r1 == 0) goto L39
            r0 = -4
            goto L4a
        L39:
            boolean r1 = r4 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto L3f
            r0 = -5
            goto L4a
        L3f:
            boolean r1 = r4 instanceof android.os.NetworkOnMainThreadException
            if (r1 == 0) goto L45
            r0 = -6
            goto L4a
        L45:
            boolean r1 = r4 instanceof java.lang.UnsupportedOperationException
            if (r1 == 0) goto L4a
            r0 = -7
        L4a:
            r3.writeInt(r0)
            if (r0 != 0) goto L5d
            boolean r1 = r4 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L57
            r1 = r4
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L57:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r4)
            throw r1
        L5d:
            java.lang.String r1 = r4.getMessage()
            r3.writeString(r1)
            switch(r0) {
                case -9: goto L68;
                default: goto L67;
            }
        L67:
            goto L6e
        L68:
            r1 = r4
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r3.writeParcelable(r1)
        L6e:
            return
    }

    protected abstract void writeFloat(float r1);

    public void writeFloat(float r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeFloat(r1)
            return
    }

    protected void writeFloatArray(float[] r4) {
            r3 = this;
            if (r4 == 0) goto L12
            int r0 = r4.length
            r3.writeInt(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r4[r1]
            r3.writeFloat(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            goto L16
        L12:
            r0 = -1
            r3.writeInt(r0)
        L16:
            return
    }

    public void writeFloatArray(float[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeFloatArray(r1)
            return
    }

    protected abstract void writeInt(int r1);

    public void writeInt(int r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeInt(r1)
            return
    }

    protected void writeIntArray(int[] r4) {
            r3 = this;
            if (r4 == 0) goto L12
            int r0 = r4.length
            r3.writeInt(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r4[r1]
            r3.writeInt(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            goto L16
        L12:
            r0 = -1
            r3.writeInt(r0)
        L16:
            return
    }

    public void writeIntArray(int[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeIntArray(r1)
            return
    }

    public <T> void writeList(java.util.List<T> r1, int r2) {
            r0 = this;
            r0.writeCollection(r1, r2)
            return
    }

    protected abstract void writeLong(long r1);

    public void writeLong(long r1, int r3) {
            r0 = this;
            r0.setOutputField(r3)
            r0.writeLong(r1)
            return
    }

    protected void writeLongArray(long[] r5) {
            r4 = this;
            if (r5 == 0) goto L12
            int r0 = r5.length
            r4.writeInt(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            r4.writeLong(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            goto L16
        L12:
            r0 = -1
            r4.writeInt(r0)
        L16:
            return
    }

    public void writeLongArray(long[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeLongArray(r1)
            return
    }

    public <K, V> void writeMap(java.util.Map<K, V> r7, int r8) {
            r6 = this;
            r6.setOutputField(r8)
            if (r7 != 0) goto La
            r0 = -1
            r6.writeInt(r0)
            return
        La:
            int r0 = r7.size()
            r6.writeInt(r0)
            if (r0 != 0) goto L14
            return
        L14:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            r1.add(r5)
            java.lang.Object r5 = r4.getValue()
            r2.add(r5)
            goto L26
        L41:
            r6.writeCollection(r1)
            r6.writeCollection(r2)
            return
    }

    protected void writeNoException() {
            r1 = this;
            r0 = 0
            r1.writeInt(r0)
            return
    }

    protected abstract void writeParcelable(android.os.Parcelable r1);

    public void writeParcelable(android.os.Parcelable r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeParcelable(r1)
            return
    }

    public void writeSerializable(java.io.Serializable r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeSerializable(r1)
            return
    }

    public <T> void writeSet(java.util.Set<T> r1, int r2) {
            r0 = this;
            r0.writeCollection(r1, r2)
            return
    }

    public void writeSize(android.util.Size r2, int r3) {
            r1 = this;
            r1.setOutputField(r3)
            if (r2 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1.writeBoolean(r0)
            if (r2 == 0) goto L1b
            int r0 = r2.getWidth()
            r1.writeInt(r0)
            int r0 = r2.getHeight()
            r1.writeInt(r0)
        L1b:
            return
    }

    public void writeSizeF(android.util.SizeF r2, int r3) {
            r1 = this;
            r1.setOutputField(r3)
            if (r2 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1.writeBoolean(r0)
            if (r2 == 0) goto L1b
            float r0 = r2.getWidth()
            r1.writeFloat(r0)
            float r0 = r2.getHeight()
            r1.writeFloat(r0)
        L1b:
            return
    }

    public void writeSparseBooleanArray(android.util.SparseBooleanArray r4, int r5) {
            r3 = this;
            r3.setOutputField(r5)
            if (r4 != 0) goto La
            r0 = -1
            r3.writeInt(r0)
            return
        La:
            int r0 = r4.size()
            r3.writeInt(r0)
            r1 = 0
        L12:
            if (r1 >= r0) goto L25
            int r2 = r4.keyAt(r1)
            r3.writeInt(r2)
            boolean r2 = r4.valueAt(r1)
            r3.writeBoolean(r2)
            int r1 = r1 + 1
            goto L12
        L25:
            return
    }

    protected abstract void writeString(java.lang.String r1);

    public void writeString(java.lang.String r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeString(r1)
            return
    }

    protected abstract void writeStrongBinder(android.os.IBinder r1);

    public void writeStrongBinder(android.os.IBinder r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeStrongBinder(r1)
            return
    }

    protected abstract void writeStrongInterface(android.os.IInterface r1);

    public void writeStrongInterface(android.os.IInterface r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeStrongInterface(r1)
            return
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> void writeToParcel(T r4, androidx.versionedparcelable.VersionedParcel r5) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            java.lang.reflect.Method r0 = r3.getWriteMethod(r0)     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            return
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered ClassNotFoundException"
            r1.<init>(r2, r0)
            throw r1
        L1b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered NoSuchMethodException"
            r1.<init>(r2, r0)
            throw r1
        L24:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L34
            java.lang.Throwable r1 = r0.getCause()
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L34:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered InvocationTargetException"
            r1.<init>(r2, r0)
            throw r1
        L3c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r1.<init>(r2, r0)
            throw r1
    }

    protected void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 0
            r1.writeString(r0)
            return
        L7:
            r1.writeVersionedParcelableCreator(r2)
            androidx.versionedparcelable.VersionedParcel r0 = r1.createSubParcel()
            r1.writeToParcel(r2, r0)
            r0.closeField()
            return
    }

    public void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeVersionedParcelable(r1)
            return
    }
}
