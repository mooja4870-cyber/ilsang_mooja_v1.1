package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptedSharedPreferences implements android.content.SharedPreferences {
    private static final java.lang.String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final java.lang.String NULL_VALUE = "__NULL__";
    private static final java.lang.String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final java.lang.String mFileName;
    final com.google.crypto.tink.DeterministicAead mKeyDeterministicAead;
    final java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    final java.lang.String mMasterKeyAlias;
    final android.content.SharedPreferences mSharedPreferences;
    final com.google.crypto.tink.Aead mValueAead;

    /* JADX INFO: renamed from: androidx.security.crypto.EncryptedSharedPreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = null;

        static {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = r0
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L3c
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L56
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                return
        }
    }

    private static final class Editor implements android.content.SharedPreferences.Editor {
        private final java.util.concurrent.atomic.AtomicBoolean mClearRequested;
        private final android.content.SharedPreferences.Editor mEditor;
        private final androidx.security.crypto.EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final java.util.List<java.lang.String> mKeysChanged;

        Editor(androidx.security.crypto.EncryptedSharedPreferences r3, android.content.SharedPreferences.Editor r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.mClearRequested = r0
                r2.mEncryptedSharedPreferences = r3
                r2.mEditor = r4
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r2.mKeysChanged = r0
                return
        }

        private void clearKeysIfNeeded() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.mClearRequested
                r1 = 0
                boolean r0 = r0.getAndSet(r1)
                if (r0 == 0) goto L3f
                androidx.security.crypto.EncryptedSharedPreferences r0 = r4.mEncryptedSharedPreferences
                java.util.Map r0 = r0.getAll()
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.List<java.lang.String> r2 = r4.mKeysChanged
                boolean r2 = r2.contains(r1)
                if (r2 != 0) goto L3e
                androidx.security.crypto.EncryptedSharedPreferences r2 = r4.mEncryptedSharedPreferences
                boolean r2 = r2.isReservedKey(r1)
                if (r2 != 0) goto L3e
                android.content.SharedPreferences$Editor r2 = r4.mEditor
                androidx.security.crypto.EncryptedSharedPreferences r3 = r4.mEncryptedSharedPreferences
                java.lang.String r3 = r3.encryptKey(r1)
                r2.remove(r3)
            L3e:
                goto L17
            L3f:
                return
        }

        private void notifyListeners() {
                r5 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r5.mEncryptedSharedPreferences
                java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r0.mListeners
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2d
                java.lang.Object r1 = r0.next()
                android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1
                java.util.List<java.lang.String> r2 = r5.mKeysChanged
                java.util.Iterator r2 = r2.iterator()
            L1a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2c
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.security.crypto.EncryptedSharedPreferences r4 = r5.mEncryptedSharedPreferences
                r1.onSharedPreferenceChanged(r4, r3)
                goto L1a
            L2c:
                goto L8
            L2d:
                return
        }

        private void putEncryptedObject(java.lang.String r5, byte[] r6) {
                r4 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r4.mEncryptedSharedPreferences
                boolean r0 = r0.isReservedKey(r5)
                if (r0 != 0) goto L44
                java.util.List<java.lang.String> r0 = r4.mKeysChanged
                r0.add(r5)
                if (r5 != 0) goto L11
                java.lang.String r5 = "__NULL__"
            L11:
                androidx.security.crypto.EncryptedSharedPreferences r0 = r4.mEncryptedSharedPreferences     // Catch: java.security.GeneralSecurityException -> L26
                android.util.Pair r0 = r0.encryptKeyValuePair(r5, r6)     // Catch: java.security.GeneralSecurityException -> L26
                android.content.SharedPreferences$Editor r1 = r4.mEditor     // Catch: java.security.GeneralSecurityException -> L26
                java.lang.Object r2 = r0.first     // Catch: java.security.GeneralSecurityException -> L26
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.security.GeneralSecurityException -> L26
                java.lang.Object r3 = r0.second     // Catch: java.security.GeneralSecurityException -> L26
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.security.GeneralSecurityException -> L26
                r1.putString(r2, r3)     // Catch: java.security.GeneralSecurityException -> L26
                return
            L26:
                r0 = move-exception
                java.lang.SecurityException r1 = new java.lang.SecurityException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Could not encrypt data: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r0.getMessage()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L44:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r2 = " is a reserved key for the encryption keyset."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
                r1 = this;
                r1.clearKeysIfNeeded()
                android.content.SharedPreferences$Editor r0 = r1.mEditor
                r0.apply()
                r1.notifyListeners()
                java.util.List<java.lang.String> r0 = r1.mKeysChanged
                r0.clear()
                return
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor clear() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mClearRequested
                r1 = 1
                r0.set(r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
                r2 = this;
                r2.clearKeysIfNeeded()
                android.content.SharedPreferences$Editor r0 = r2.mEditor     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L12
                r2.notifyListeners()
                java.util.List<java.lang.String> r1 = r2.mKeysChanged
                r1.clear()
                return r0
            L12:
                r0 = move-exception
                r2.notifyListeners()
                java.util.List<java.lang.String> r1 = r2.mKeysChanged
                r1.clear()
                throw r0
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
                r2 = this;
                r0 = 5
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.put(r4)
                byte[] r1 = r0.array()
                r2.putEncryptedObject(r3, r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putFloat(r4)
                byte[] r1 = r0.array()
                r2.putEncryptedObject(r3, r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putInt(r4)
                byte[] r1 = r0.array()
                r2.putEncryptedObject(r3, r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putLong(java.lang.String r3, long r4) {
                r2 = this;
                r0 = 12
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putLong(r4)
                byte[] r1 = r0.array()
                r2.putEncryptedObject(r3, r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putString(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                if (r6 != 0) goto L4
                java.lang.String r6 = "__NULL__"
            L4:
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r0 = r6.getBytes(r0)
                int r1 = r0.length
                int r2 = r1 + 8
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r3 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                int r3 = r3.getId()
                r2.putInt(r3)
                r2.putInt(r1)
                r2.put(r0)
                byte[] r3 = r2.array()
                r4.putEncryptedObject(r5, r3)
                return r4
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r7, java.util.Set<java.lang.String> r8) {
                r6 = this;
                if (r8 != 0) goto Ld
                androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
                r0.<init>()
                r8 = r0
                java.lang.String r0 = "__NULL__"
                r8.add(r0)
            Ld:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r8.size()
                r0.<init>(r1)
                int r1 = r8.size()
                int r1 = r1 * 4
                java.util.Iterator r2 = r8.iterator()
            L20:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L38
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r4 = r3.getBytes(r4)
                r0.add(r4)
                int r5 = r4.length
                int r1 = r1 + r5
                goto L20
            L38:
                int r1 = r1 + 4
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r3 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                int r3 = r3.getId()
                r2.putInt(r3)
                java.util.Iterator r3 = r0.iterator()
            L4b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L5f
                java.lang.Object r4 = r3.next()
                byte[] r4 = (byte[]) r4
                int r5 = r4.length
                r2.putInt(r5)
                r2.put(r4)
                goto L4b
            L5f:
                byte[] r3 = r2.array()
                r6.putEncryptedObject(r7, r3)
                return r6
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor remove(java.lang.String r4) {
                r3 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r3.mEncryptedSharedPreferences
                boolean r0 = r0.isReservedKey(r4)
                if (r0 != 0) goto L19
                android.content.SharedPreferences$Editor r0 = r3.mEditor
                androidx.security.crypto.EncryptedSharedPreferences r1 = r3.mEncryptedSharedPreferences
                java.lang.String r1 = r1.encryptKey(r4)
                r0.remove(r1)
                java.util.List<java.lang.String> r0 = r3.mKeysChanged
                r0.add(r4)
                return r3
            L19:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = " is a reserved key for the encryption keyset."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    private enum EncryptedType extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.EncryptedType> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType BOOLEAN = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType FLOAT = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType INT = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType LONG = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType STRING = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType STRING_SET = null;
        private final int mId;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r2 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r3 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r4 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r5 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "STRING"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "STRING_SET"
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "INT"
                r2 = 2
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "LONG"
                r2 = 3
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "FLOAT"
                r2 = 4
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "BOOLEAN"
                r2 = 5
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.$VALUES = r0
                return
        }

        EncryptedType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mId = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType fromId(int r1) {
                switch(r1) {
                    case 0: goto L14;
                    case 1: goto L11;
                    case 2: goto Le;
                    case 3: goto Lb;
                    case 4: goto L8;
                    case 5: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                return r0
            L8:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                return r0
            Lb:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                return r0
            Le:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                return r0
            L11:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                return r0
            L14:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                return r0
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$EncryptedType> r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = (androidx.security.crypto.EncryptedSharedPreferences.EncryptedType) r0
                return r0
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[]) r0
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }
    }

    public enum PrefKeyEncryptionScheme extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme AES256_SIV = null;
        private final java.lang.String mDeterministicAeadKeyTemplateName;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r0 = new androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme
                java.lang.String r1 = "AES256_SIV"
                r2 = 0
                r0.<init>(r1, r2, r1)
                androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV = r0
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.$VALUES = r0
                return
        }

        PrefKeyEncryptionScheme(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mDeterministicAeadKeyTemplateName = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme> r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme) r0
                return r0
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[]) r0
                return r0
        }

        com.google.crypto.tink.KeyTemplate getKeyTemplate() throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.String r0 = r1.mDeterministicAeadKeyTemplateName
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplates.get(r0)
                return r0
        }
    }

    public enum PrefValueEncryptionScheme extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme AES256_GCM = null;
        private final java.lang.String mAeadKeyTemplateName;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r0 = new androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme
                java.lang.String r1 = "AES256_GCM"
                r2 = 0
                r0.<init>(r1, r2, r1)
                androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM = r0
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.$VALUES = r0
                return
        }

        PrefValueEncryptionScheme(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mAeadKeyTemplateName = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme> r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme) r0
                return r0
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[]) r0
                return r0
        }

        com.google.crypto.tink.KeyTemplate getKeyTemplate() throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.String r0 = r1.mAeadKeyTemplateName
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplates.get(r0)
                return r0
        }
    }

    EncryptedSharedPreferences(java.lang.String r2, java.lang.String r3, android.content.SharedPreferences r4, com.google.crypto.tink.Aead r5, com.google.crypto.tink.DeterministicAead r6) {
            r1 = this;
            r1.<init>()
            r1.mFileName = r2
            r1.mSharedPreferences = r4
            r1.mMasterKeyAlias = r3
            r1.mValueAead = r5
            r1.mKeyDeterministicAead = r6
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mListeners = r0
            return
    }

    public static android.content.SharedPreferences create(android.content.Context r1, java.lang.String r2, androidx.security.crypto.MasterKey r3, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme r4, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme r5) throws java.security.GeneralSecurityException, java.io.IOException {
            java.lang.String r0 = r3.getKeyAlias()
            android.content.SharedPreferences r0 = create(r2, r0, r1, r4, r5)
            return r0
    }

    @java.lang.Deprecated
    public static android.content.SharedPreferences create(java.lang.String r10, java.lang.String r11, android.content.Context r12, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme r13, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme r14) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.daead.DeterministicAeadConfig.register()
            com.google.crypto.tink.aead.AeadConfig.register()
            android.content.Context r0 = r12.getApplicationContext()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r1 = new com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder
            r1.<init>()
            com.google.crypto.tink.KeyTemplate r2 = r13.getKeyTemplate()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r1 = r1.withKeyTemplate(r2)
            java.lang.String r2 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r1 = r1.withSharedPref(r0, r2, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "android-keystore://"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r1 = r1.withMasterKeyUri(r2)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r1 = r1.build()
            com.google.crypto.tink.KeysetHandle r1 = r1.getKeysetHandle()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r2 = new com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder
            r2.<init>()
            com.google.crypto.tink.KeyTemplate r4 = r14.getKeyTemplate()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r2 = r2.withKeyTemplate(r4)
            java.lang.String r4 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r2 = r2.withSharedPref(r0, r4, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r2 = r2.withMasterKeyUri(r3)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r2 = r2.build()
            com.google.crypto.tink.KeysetHandle r2 = r2.getKeysetHandle()
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r3 = com.google.crypto.tink.DeterministicAead.class
            java.lang.Object r3 = r1.getPrimitive(r3)
            r9 = r3
            com.google.crypto.tink.DeterministicAead r9 = (com.google.crypto.tink.DeterministicAead) r9
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            java.lang.Object r3 = r2.getPrimitive(r3)
            r8 = r3
            com.google.crypto.tink.Aead r8 = (com.google.crypto.tink.Aead) r8
            androidx.security.crypto.EncryptedSharedPreferences r4 = new androidx.security.crypto.EncryptedSharedPreferences
            r3 = 0
            android.content.SharedPreferences r7 = r0.getSharedPreferences(r10, r3)
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
    }

    private java.lang.Object getDecryptedObject(java.lang.String r18) throws java.lang.SecurityException {
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r17.isReservedKey(r18)
            if (r2 != 0) goto L12c
            if (r0 != 0) goto L10
            java.lang.String r0 = "__NULL__"
            r2 = r0
            goto L11
        L10:
            r2 = r0
        L11:
            java.lang.String r0 = r1.encryptKey(r2)     // Catch: java.security.GeneralSecurityException -> L10e
            android.content.SharedPreferences r3 = r1.mSharedPreferences     // Catch: java.security.GeneralSecurityException -> L10e
            r4 = 0
            java.lang.String r3 = r3.getString(r0, r4)     // Catch: java.security.GeneralSecurityException -> L10e
            if (r3 != 0) goto L1f
            return r4
        L1f:
            r5 = 0
            byte[] r6 = com.google.crypto.tink.subtle.Base64.decode(r3, r5)     // Catch: java.security.GeneralSecurityException -> L10e
            com.google.crypto.tink.Aead r7 = r1.mValueAead     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L10e
            byte[] r8 = r0.getBytes(r8)     // Catch: java.security.GeneralSecurityException -> L10e
            byte[] r7 = r7.decrypt(r6, r8)     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r7)     // Catch: java.security.GeneralSecurityException -> L10e
            r8.position(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            int r9 = r8.getInt()     // Catch: java.security.GeneralSecurityException -> L10e
            androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r10 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.fromId(r9)     // Catch: java.security.GeneralSecurityException -> L10e
            if (r10 == 0) goto Lf5
            int[] r11 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.security.GeneralSecurityException -> L10e
            int r12 = r10.ordinal()     // Catch: java.security.GeneralSecurityException -> L10e
            r11 = r11[r12]     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r12 = "__NULL__"
            r13 = 1
            switch(r11) {
                case 1: goto Lbf;
                case 2: goto Lb6;
                case 3: goto Lad;
                case 4: goto La4;
                case 5: goto L98;
                case 6: goto L53;
                default: goto L4f;
            }
        L4f:
            java.lang.SecurityException r4 = new java.lang.SecurityException     // Catch: java.security.GeneralSecurityException -> L10e
            goto Lde
        L53:
            androidx.collection.ArraySet r11 = new androidx.collection.ArraySet     // Catch: java.security.GeneralSecurityException -> L10e
            r11.<init>()     // Catch: java.security.GeneralSecurityException -> L10e
        L58:
            boolean r14 = r8.hasRemaining()     // Catch: java.security.GeneralSecurityException -> L10e
            if (r14 == 0) goto L84
            int r14 = r8.getInt()     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.ByteBuffer r15 = r8.slice()     // Catch: java.security.GeneralSecurityException -> L10e
            r15.limit(r14)     // Catch: java.security.GeneralSecurityException -> L10e
            int r16 = r8.position()     // Catch: java.security.GeneralSecurityException -> L10e
            r18 = r4
            int r4 = r16 + r14
            r8.position(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.CharBuffer r4 = r4.decode(r15)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r4 = r4.toString()     // Catch: java.security.GeneralSecurityException -> L10e
            r11.add(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            r4 = r18
            goto L58
        L84:
            r18 = r4
            int r4 = r11.size()     // Catch: java.security.GeneralSecurityException -> L10e
            if (r4 != r13) goto L97
            java.lang.Object r4 = r11.valueAt(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            boolean r4 = r12.equals(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            if (r4 == 0) goto L97
            return r18
        L97:
            return r11
        L98:
            byte r4 = r8.get()     // Catch: java.security.GeneralSecurityException -> L10e
            if (r4 == 0) goto L9f
            r5 = r13
        L9f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            return r4
        La4:
            float r4 = r8.getFloat()     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            return r4
        Lad:
            long r4 = r8.getLong()     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            return r4
        Lb6:
            int r4 = r8.getInt()     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            return r4
        Lbf:
            r18 = r4
            int r4 = r8.getInt()     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.ByteBuffer r5 = r8.slice()     // Catch: java.security.GeneralSecurityException -> L10e
            r8.limit(r4)     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L10e
            java.nio.CharBuffer r11 = r11.decode(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r11 = r11.toString()     // Catch: java.security.GeneralSecurityException -> L10e
            boolean r12 = r11.equals(r12)     // Catch: java.security.GeneralSecurityException -> L10e
            if (r12 == 0) goto Ldd
            return r18
        Ldd:
            return r11
        Lde:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L10e
            r5.<init>()     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r11 = "Unhandled type for encrypted pref value: "
            java.lang.StringBuilder r5 = r5.append(r11)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.StringBuilder r5 = r5.append(r10)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r5 = r5.toString()     // Catch: java.security.GeneralSecurityException -> L10e
            r4.<init>(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            throw r4     // Catch: java.security.GeneralSecurityException -> L10e
        Lf5:
            java.lang.SecurityException r4 = new java.lang.SecurityException     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L10e
            r5.<init>()     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r11 = "Unknown type ID for encrypted pref value: "
            java.lang.StringBuilder r5 = r5.append(r11)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.security.GeneralSecurityException -> L10e
            java.lang.String r5 = r5.toString()     // Catch: java.security.GeneralSecurityException -> L10e
            r4.<init>(r5)     // Catch: java.security.GeneralSecurityException -> L10e
            throw r4     // Catch: java.security.GeneralSecurityException -> L10e
        L10e:
            r0 = move-exception
            java.lang.SecurityException r3 = new java.lang.SecurityException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not decrypt value. "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0)
            throw r3
        L12c:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " is a reserved key for the encryption keyset."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.isReservedKey(r4)
            if (r0 != 0) goto L11
            java.lang.String r0 = r3.encryptKey(r4)
            android.content.SharedPreferences r1 = r3.mSharedPreferences
            boolean r1 = r1.contains(r0)
            return r1
        L11:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is a reserved key for the encryption keyset."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    java.lang.String decryptKey(java.lang.String r5) {
            r4 = this;
            com.google.crypto.tink.DeterministicAead r0 = r4.mKeyDeterministicAead     // Catch: java.security.GeneralSecurityException -> L22
            r1 = 0
            byte[] r1 = com.google.crypto.tink.subtle.Base64.decode(r5, r1)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r2 = r4.mFileName     // Catch: java.security.GeneralSecurityException -> L22
            byte[] r2 = r2.getBytes()     // Catch: java.security.GeneralSecurityException -> L22
            byte[] r0 = r0.decryptDeterministically(r1, r2)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r1 = new java.lang.String     // Catch: java.security.GeneralSecurityException -> L22
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L22
            r1.<init>(r0, r2)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r2 = "__NULL__"
            boolean r2 = r1.equals(r2)     // Catch: java.security.GeneralSecurityException -> L22
            if (r2 == 0) goto L21
            r1 = 0
        L21:
            return r1
        L22:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not decrypt key. "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r2 = this;
            androidx.security.crypto.EncryptedSharedPreferences$Editor r0 = new androidx.security.crypto.EncryptedSharedPreferences$Editor
            android.content.SharedPreferences r1 = r2.mSharedPreferences
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.<init>(r2, r1)
            return r0
    }

    java.lang.String encryptKey(java.lang.String r5) {
            r4 = this;
            if (r5 != 0) goto L4
            java.lang.String r5 = "__NULL__"
        L4:
            com.google.crypto.tink.DeterministicAead r0 = r4.mKeyDeterministicAead     // Catch: java.security.GeneralSecurityException -> L1b
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r1 = r5.getBytes(r1)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r2 = r4.mFileName     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r2 = r2.getBytes()     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r0 = r0.encryptDeterministically(r1, r2)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.encode(r0)     // Catch: java.security.GeneralSecurityException -> L1b
            return r1
        L1b:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not encrypt key. "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    android.util.Pair<java.lang.String, java.lang.String> encryptKeyValuePair(java.lang.String r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            java.lang.String r0 = r4.encryptKey(r5)
            com.google.crypto.tink.Aead r1 = r4.mValueAead
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r0.getBytes(r2)
            byte[] r1 = r1.encrypt(r6, r2)
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.encode(r1)
            r2.<init>(r0, r3)
            return r2
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r5.mSharedPreferences
            java.util.Map r1 = r1.getAll()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.isReservedKey(r3)
            if (r3 != 0) goto L3d
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r5.decryptKey(r3)
            java.lang.Object r4 = r5.getDecryptedObject(r3)
            r0.put(r3, r4)
        L3d:
            goto L13
        L3e:
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = r2.getDecryptedObject(r3)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L11
        L10:
            r1 = r4
        L11:
            return r1
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r3, float r4) {
            r2 = this;
            java.lang.Object r0 = r2.getDecryptedObject(r3)
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L11
        L10:
            r1 = r4
        L11:
            return r1
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.getDecryptedObject(r3)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L11
        L10:
            r1 = r4
        L11:
            return r1
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r4, long r5) {
            r3 = this;
            java.lang.Object r0 = r3.getDecryptedObject(r4)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L11
        L10:
            r1 = r5
        L11:
            return r1
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.Object r0 = r2.getDecryptedObject(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Lc
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto Ld
        Lc:
            r1 = r4
        Ld:
            return r1
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r4, java.util.Set<java.lang.String> r5) {
            r3 = this;
            java.lang.Object r0 = r3.getDecryptedObject(r4)
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto Lc
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            goto L11
        Lc:
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
        L11:
            int r2 = r1.size()
            if (r2 <= 0) goto L19
            r2 = r1
            goto L1a
        L19:
            r2 = r5
        L1a:
            return r2
    }

    boolean isReservedKey(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.mListeners
            r0.remove(r2)
            return
    }
}
