package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class Person {
    private static final java.lang.String ICON_KEY = "icon";
    private static final java.lang.String IS_BOT_KEY = "isBot";
    private static final java.lang.String IS_IMPORTANT_KEY = "isImportant";
    private static final java.lang.String KEY_KEY = "key";
    private static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String URI_KEY = "uri";
    androidx.core.graphics.drawable.IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    java.lang.String mKey;
    java.lang.CharSequence mName;
    java.lang.String mUri;

    static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle r2) {
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.String r1 = "name"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                java.lang.String r1 = "uri"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = "key"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setKey(r1)
                java.lang.String r1 = "isBot"
                boolean r1 = r2.getBoolean(r1)
                androidx.core.app.Person$Builder r0 = r0.setBot(r1)
                java.lang.String r1 = "isImportant"
                boolean r1 = r2.getBoolean(r1)
                androidx.core.app.Person$Builder r0 = r0.setImportant(r1)
                androidx.core.app.Person r0 = r0.build()
                return r0
        }

        static android.os.PersistableBundle toPersistableBundle(androidx.core.app.Person r3) {
                android.os.PersistableBundle r0 = new android.os.PersistableBundle
                r0.<init>()
                java.lang.CharSequence r1 = r3.mName
                if (r1 == 0) goto L10
                java.lang.CharSequence r1 = r3.mName
                java.lang.String r1 = r1.toString()
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.String r2 = "name"
                r0.putString(r2, r1)
                java.lang.String r1 = "uri"
                java.lang.String r2 = r3.mUri
                r0.putString(r1, r2)
                java.lang.String r1 = "key"
                java.lang.String r2 = r3.mKey
                r0.putString(r1, r2)
                java.lang.String r1 = "isBot"
                boolean r2 = r3.mIsBot
                r0.putBoolean(r1, r2)
                java.lang.String r1 = "isImportant"
                boolean r2 = r3.mIsImportant
                r0.putBoolean(r1, r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.app.Person fromAndroidPerson(android.app.Person r2) {
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.CharSequence r1 = r2.getName()
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                android.graphics.drawable.Icon r1 = r2.getIcon()
                if (r1 == 0) goto L1c
                android.graphics.drawable.Icon r1 = r2.getIcon()
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r1)
                goto L1d
            L1c:
                r1 = 0
            L1d:
                androidx.core.app.Person$Builder r0 = r0.setIcon(r1)
                java.lang.String r1 = r2.getUri()
                androidx.core.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = r2.getKey()
                androidx.core.app.Person$Builder r0 = r0.setKey(r1)
                boolean r1 = r2.isBot()
                androidx.core.app.Person$Builder r0 = r0.setBot(r1)
                boolean r1 = r2.isImportant()
                androidx.core.app.Person$Builder r0 = r0.setImportant(r1)
                androidx.core.app.Person r0 = r0.build()
                return r0
        }

        static android.app.Person toAndroidPerson(androidx.core.app.Person r2) {
                android.app.Person$Builder r0 = new android.app.Person$Builder
                r0.<init>()
                java.lang.CharSequence r1 = r2.getName()
                android.app.Person$Builder r0 = r0.setName(r1)
                androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                if (r1 == 0) goto L1c
                androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                android.graphics.drawable.Icon r1 = r1.toIcon()
                goto L1d
            L1c:
                r1 = 0
            L1d:
                android.app.Person$Builder r0 = r0.setIcon(r1)
                java.lang.String r1 = r2.getUri()
                android.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = r2.getKey()
                android.app.Person$Builder r0 = r0.setKey(r1)
                boolean r1 = r2.isBot()
                android.app.Person$Builder r0 = r0.setBot(r1)
                boolean r1 = r2.isImportant()
                android.app.Person$Builder r0 = r0.setImportant(r1)
                android.app.Person r0 = r0.build()
                return r0
        }
    }

    public static class Builder {
        androidx.core.graphics.drawable.IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        java.lang.String mKey;
        java.lang.CharSequence mName;
        java.lang.String mUri;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        Builder(androidx.core.app.Person r2) {
                r1 = this;
                r1.<init>()
                java.lang.CharSequence r0 = r2.mName
                r1.mName = r0
                androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
                r1.mIcon = r0
                java.lang.String r0 = r2.mUri
                r1.mUri = r0
                java.lang.String r0 = r2.mKey
                r1.mKey = r0
                boolean r0 = r2.mIsBot
                r1.mIsBot = r0
                boolean r0 = r2.mIsImportant
                r1.mIsImportant = r0
                return
        }

        public androidx.core.app.Person build() {
                r1 = this;
                androidx.core.app.Person r0 = new androidx.core.app.Person
                r0.<init>(r1)
                return r0
        }

        public androidx.core.app.Person.Builder setBot(boolean r1) {
                r0 = this;
                r0.mIsBot = r1
                return r0
        }

        public androidx.core.app.Person.Builder setIcon(androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.mIcon = r1
                return r0
        }

        public androidx.core.app.Person.Builder setImportant(boolean r1) {
                r0 = this;
                r0.mIsImportant = r1
                return r0
        }

        public androidx.core.app.Person.Builder setKey(java.lang.String r1) {
                r0 = this;
                r0.mKey = r1
                return r0
        }

        public androidx.core.app.Person.Builder setName(java.lang.CharSequence r1) {
                r0 = this;
                r0.mName = r1
                return r0
        }

        public androidx.core.app.Person.Builder setUri(java.lang.String r1) {
                r0 = this;
                r0.mUri = r1
                return r0
        }
    }

    Person(androidx.core.app.Person.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.CharSequence r0 = r2.mName
            r1.mName = r0
            androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
            r1.mIcon = r0
            java.lang.String r0 = r2.mUri
            r1.mUri = r0
            java.lang.String r0 = r2.mKey
            r1.mKey = r0
            boolean r0 = r2.mIsBot
            r1.mIsBot = r0
            boolean r0 = r2.mIsImportant
            r1.mIsImportant = r0
            return
    }

    public static androidx.core.app.Person fromAndroidPerson(android.app.Person r1) {
            androidx.core.app.Person r0 = androidx.core.app.Person.Api28Impl.fromAndroidPerson(r1)
            return r0
    }

    public static androidx.core.app.Person fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = "icon"
            android.os.Bundle r0 = r3.getBundle(r0)
            androidx.core.app.Person$Builder r1 = new androidx.core.app.Person$Builder
            r1.<init>()
            java.lang.String r2 = "name"
            java.lang.CharSequence r2 = r3.getCharSequence(r2)
            androidx.core.app.Person$Builder r1 = r1.setName(r2)
            if (r0 == 0) goto L1c
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createFromBundle(r0)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            androidx.core.app.Person$Builder r1 = r1.setIcon(r2)
            java.lang.String r2 = "uri"
            java.lang.String r2 = r3.getString(r2)
            androidx.core.app.Person$Builder r1 = r1.setUri(r2)
            java.lang.String r2 = "key"
            java.lang.String r2 = r3.getString(r2)
            androidx.core.app.Person$Builder r1 = r1.setKey(r2)
            java.lang.String r2 = "isBot"
            boolean r2 = r3.getBoolean(r2)
            androidx.core.app.Person$Builder r1 = r1.setBot(r2)
            java.lang.String r2 = "isImportant"
            boolean r2 = r3.getBoolean(r2)
            androidx.core.app.Person$Builder r1 = r1.setImportant(r2)
            androidx.core.app.Person r1 = r1.build()
            return r1
    }

    public static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle r1) {
            androidx.core.app.Person r0 = androidx.core.app.Person.Api22Impl.fromPersistableBundle(r1)
            return r0
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof androidx.core.app.Person
            if (r1 != 0) goto L9
            return r0
        L9:
            r1 = r9
            androidx.core.app.Person r1 = (androidx.core.app.Person) r1
            java.lang.String r2 = r8.getKey()
            java.lang.String r3 = r1.getKey()
            if (r2 != 0) goto L6e
            if (r3 == 0) goto L19
            goto L6e
        L19:
            java.lang.CharSequence r4 = r8.getName()
            java.lang.String r4 = java.util.Objects.toString(r4)
            java.lang.CharSequence r5 = r1.getName()
            java.lang.String r5 = java.util.Objects.toString(r5)
            boolean r6 = java.util.Objects.equals(r4, r5)
            if (r6 == 0) goto L6c
            java.lang.String r6 = r8.getUri()
            java.lang.String r7 = r1.getUri()
            boolean r6 = java.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L6c
            boolean r6 = r8.isBot()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r1.isBot()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r6 = java.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L6c
            boolean r6 = r8.isImportant()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r1.isImportant()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r6 = java.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L6c
            r0 = 1
            goto L6d
        L6c:
        L6d:
            return r0
        L6e:
            boolean r0 = java.util.Objects.equals(r2, r3)
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.mKey
            return r0
    }

    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    public java.lang.String getUri() {
            r1 = this;
            java.lang.String r0 = r1.mUri
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.getKey()
            if (r0 == 0) goto Lb
            int r1 = r0.hashCode()
            return r1
        Lb:
            java.lang.CharSequence r1 = r5.getName()
            java.lang.String r2 = r5.getUri()
            boolean r3 = r5.isBot()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r5.isImportant()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4}
            int r1 = java.util.Objects.hash(r1)
            return r1
    }

    public boolean isBot() {
            r1 = this;
            boolean r0 = r1.mIsBot
            return r0
    }

    public boolean isImportant() {
            r1 = this;
            boolean r0 = r1.mIsImportant
            return r0
    }

    public java.lang.String resolveToLegacyUri() {
            r2 = this;
            java.lang.String r0 = r2.mUri
            if (r0 == 0) goto L7
            java.lang.String r0 = r2.mUri
            return r0
        L7:
            java.lang.CharSequence r0 = r2.mName
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "name:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.CharSequence r1 = r2.mName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L21:
            java.lang.String r0 = ""
            return r0
    }

    public android.app.Person toAndroidPerson() {
            r1 = this;
            android.app.Person r0 = androidx.core.app.Person.Api28Impl.toAndroidPerson(r1)
            return r0
    }

    public androidx.core.app.Person.Builder toBuilder() {
            r1 = this;
            androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
            r0.<init>(r1)
            return r0
    }

    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.CharSequence r2 = r3.mName
            r0.putCharSequence(r1, r2)
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            if (r1 == 0) goto L17
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            android.os.Bundle r1 = r1.toBundle()
            goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r2 = "icon"
            r0.putBundle(r2, r1)
            java.lang.String r1 = "uri"
            java.lang.String r2 = r3.mUri
            r0.putString(r1, r2)
            java.lang.String r1 = "key"
            java.lang.String r2 = r3.mKey
            r0.putString(r1, r2)
            java.lang.String r1 = "isBot"
            boolean r2 = r3.mIsBot
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "isImportant"
            boolean r2 = r3.mIsImportant
            r0.putBoolean(r1, r2)
            return r0
    }

    public android.os.PersistableBundle toPersistableBundle() {
            r1 = this;
            android.os.PersistableBundle r0 = androidx.core.app.Person.Api22Impl.toPersistableBundle(r1)
            return r0
    }
}
