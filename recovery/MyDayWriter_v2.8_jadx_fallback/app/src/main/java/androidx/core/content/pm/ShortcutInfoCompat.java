package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoCompat {
    private static final java.lang.String EXTRA_LOCUS_ID = "extraLocusId";
    private static final java.lang.String EXTRA_LONG_LIVED = "extraLongLived";
    private static final java.lang.String EXTRA_PERSON_ = "extraPerson_";
    private static final java.lang.String EXTRA_PERSON_COUNT = "extraPersonCount";
    private static final java.lang.String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    android.content.ComponentName mActivity;
    java.util.Set<java.lang.String> mCategories;
    android.content.Context mContext;
    java.lang.CharSequence mDisabledMessage;
    int mDisabledReason;
    int mExcludedSurfaces;
    android.os.PersistableBundle mExtras;
    boolean mHasKeyFieldsOnly;
    androidx.core.graphics.drawable.IconCompat mIcon;
    java.lang.String mId;
    android.content.Intent[] mIntents;
    boolean mIsAlwaysBadged;
    boolean mIsCached;
    boolean mIsDeclaredInManifest;
    boolean mIsDynamic;
    boolean mIsEnabled;
    boolean mIsImmutable;
    boolean mIsLongLived;
    boolean mIsPinned;
    java.lang.CharSequence mLabel;
    long mLastChangedTimestamp;
    androidx.core.content.LocusIdCompat mLocusId;
    java.lang.CharSequence mLongLabel;
    java.lang.String mPackageName;
    androidx.core.app.Person[] mPersons;
    int mRank;
    android.os.Bundle mTransientExtras;
    android.os.UserHandle mUser;

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setExcludedFromSurfaces(android.content.pm.ShortcutInfo.Builder r0, int r1) {
                r0.setExcludedFromSurfaces(r1)
                return
        }
    }

    public static class Builder {
        private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> mCapabilityBindingParams;
        private java.util.Set<java.lang.String> mCapabilityBindings;
        private final androidx.core.content.pm.ShortcutInfoCompat mInfo;
        private boolean mIsConversation;
        private android.net.Uri mSliceUri;

        public Builder(android.content.Context r5, android.content.pm.ShortcutInfo r6) {
                r4 = this;
                r4.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r4.mInfo = r0
                androidx.core.content.pm.ShortcutInfoCompat r0 = r4.mInfo
                r0.mContext = r5
                androidx.core.content.pm.ShortcutInfoCompat r0 = r4.mInfo
                java.lang.String r1 = r6.getId()
                r0.mId = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r4.mInfo
                java.lang.String r1 = r6.getPackage()
                r0.mPackageName = r1
                android.content.Intent[] r0 = r6.getIntents()
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                int r2 = r0.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
                android.content.Intent[] r2 = (android.content.Intent[]) r2
                r1.mIntents = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                android.content.ComponentName r2 = r6.getActivity()
                r1.mActivity = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                java.lang.CharSequence r2 = r6.getShortLabel()
                r1.mLabel = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                java.lang.CharSequence r2 = r6.getLongLabel()
                r1.mLongLabel = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                java.lang.CharSequence r2 = r6.getDisabledMessage()
                r1.mDisabledMessage = r2
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                if (r1 < r2) goto L5c
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                int r2 = r6.getDisabledReason()
                r1.mDisabledReason = r2
                goto L69
            L5c:
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isEnabled()
                if (r2 == 0) goto L66
                r2 = 0
                goto L67
            L66:
                r2 = 3
            L67:
                r1.mDisabledReason = r2
            L69:
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                java.util.Set r2 = r6.getCategories()
                r1.mCategories = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                android.os.PersistableBundle r2 = r6.getExtras()
                androidx.core.app.Person[] r2 = androidx.core.content.pm.ShortcutInfoCompat.getPersonsFromExtra(r2)
                r1.mPersons = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                android.os.UserHandle r2 = r6.getUserHandle()
                r1.mUser = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                long r2 = r6.getLastChangedTimestamp()
                r1.mLastChangedTimestamp = r2
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto L9b
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isCached()
                r1.mIsCached = r2
            L9b:
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isDynamic()
                r1.mIsDynamic = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isPinned()
                r1.mIsPinned = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isDeclaredInManifest()
                r1.mIsDeclaredInManifest = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isImmutable()
                r1.mIsImmutable = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.isEnabled()
                r1.mIsEnabled = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                boolean r2 = r6.hasKeyFieldsOnly()
                r1.mHasKeyFieldsOnly = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                androidx.core.content.LocusIdCompat r2 = androidx.core.content.pm.ShortcutInfoCompat.getLocusId(r6)
                r1.mLocusId = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                int r2 = r6.getRank()
                r1.mRank = r2
                androidx.core.content.pm.ShortcutInfoCompat r1 = r4.mInfo
                android.os.PersistableBundle r2 = r6.getExtras()
                r1.mExtras = r2
                return
        }

        public Builder(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r1.mInfo = r0
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mContext = r2
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mId = r3
                return
        }

        public Builder(androidx.core.content.pm.ShortcutInfoCompat r4) {
                r3 = this;
                r3.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r3.mInfo = r0
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.content.Context r1 = r4.mContext
                r0.mContext = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.String r1 = r4.mId
                r0.mId = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.String r1 = r4.mPackageName
                r0.mPackageName = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.content.Intent[] r1 = r4.mIntents
                android.content.Intent[] r2 = r4.mIntents
                int r2 = r2.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                android.content.Intent[] r1 = (android.content.Intent[]) r1
                r0.mIntents = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.content.ComponentName r1 = r4.mActivity
                r0.mActivity = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.CharSequence r1 = r4.mLabel
                r0.mLabel = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.CharSequence r1 = r4.mLongLabel
                r0.mLongLabel = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.CharSequence r1 = r4.mDisabledMessage
                r0.mDisabledMessage = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                int r1 = r4.mDisabledReason
                r0.mDisabledReason = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                androidx.core.graphics.drawable.IconCompat r1 = r4.mIcon
                r0.mIcon = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsAlwaysBadged
                r0.mIsAlwaysBadged = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.os.UserHandle r1 = r4.mUser
                r0.mUser = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                long r1 = r4.mLastChangedTimestamp
                r0.mLastChangedTimestamp = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsCached
                r0.mIsCached = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsDynamic
                r0.mIsDynamic = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsPinned
                r0.mIsPinned = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsDeclaredInManifest
                r0.mIsDeclaredInManifest = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsImmutable
                r0.mIsImmutable = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsEnabled
                r0.mIsEnabled = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                androidx.core.content.LocusIdCompat r1 = r4.mLocusId
                r0.mLocusId = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mIsLongLived
                r0.mIsLongLived = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                boolean r1 = r4.mHasKeyFieldsOnly
                r0.mHasKeyFieldsOnly = r1
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                int r1 = r4.mRank
                r0.mRank = r1
                androidx.core.app.Person[] r0 = r4.mPersons
                if (r0 == 0) goto Lb0
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                androidx.core.app.Person[] r1 = r4.mPersons
                androidx.core.app.Person[] r2 = r4.mPersons
                int r2 = r2.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                androidx.core.app.Person[] r1 = (androidx.core.app.Person[]) r1
                r0.mPersons = r1
            Lb0:
                java.util.Set<java.lang.String> r0 = r4.mCategories
                if (r0 == 0) goto Lbf
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.util.HashSet r1 = new java.util.HashSet
                java.util.Set<java.lang.String> r2 = r4.mCategories
                r1.<init>(r2)
                r0.mCategories = r1
            Lbf:
                android.os.PersistableBundle r0 = r4.mExtras
                if (r0 == 0) goto Lc9
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.os.PersistableBundle r1 = r4.mExtras
                r0.mExtras = r1
            Lc9:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                int r1 = r4.mExcludedSurfaces
                r0.mExcludedSurfaces = r1
                return
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.mCapabilityBindings
                if (r0 != 0) goto Lb
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mCapabilityBindings = r0
            Lb:
                java.util.Set<java.lang.String> r0 = r1.mCapabilityBindings
                r0.add(r2)
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5) {
                r2 = this;
                r2.addCapabilityBinding(r3)
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L31
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                if (r0 != 0) goto L14
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.mCapabilityBindingParams = r0
            L14:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L26
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.put(r3, r1)
            L26:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.lang.Object r0 = r0.get(r3)
                java.util.Map r0 = (java.util.Map) r0
                r0.put(r4, r5)
            L31:
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat build() {
                r11 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                java.lang.CharSequence r0 = r0.mLabel
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L107
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.content.Intent[] r0 = r0.mIntents
                if (r0 == 0) goto Lff
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.content.Intent[] r0 = r0.mIntents
                int r0 = r0.length
                if (r0 == 0) goto Lff
                boolean r0 = r11.mIsConversation
                if (r0 == 0) goto L33
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                androidx.core.content.LocusIdCompat r0 = r0.mLocusId
                if (r0 != 0) goto L2e
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                androidx.core.content.LocusIdCompat r1 = new androidx.core.content.LocusIdCompat
                androidx.core.content.pm.ShortcutInfoCompat r2 = r11.mInfo
                java.lang.String r2 = r2.mId
                r1.<init>(r2)
                r0.mLocusId = r1
            L2e:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                r1 = 1
                r0.mIsLongLived = r1
            L33:
                java.util.Set<java.lang.String> r0 = r11.mCapabilityBindings
                if (r0 == 0) goto L4f
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                java.util.Set<java.lang.String> r0 = r0.mCategories
                if (r0 != 0) goto L46
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.mCategories = r1
            L46:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                java.util.Set<java.lang.String> r0 = r0.mCategories
                java.util.Set<java.lang.String> r1 = r11.mCapabilityBindings
                r0.addAll(r1)
            L4f:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r11.mCapabilityBindingParams
                if (r0 == 0) goto Lda
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.os.PersistableBundle r0 = r0.mExtras
                if (r0 != 0) goto L63
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.os.PersistableBundle r1 = new android.os.PersistableBundle
                r1.<init>()
                r0.mExtras = r1
            L63:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r11.mCapabilityBindingParams
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L6d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lda
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r2 = r11.mCapabilityBindingParams
                java.lang.Object r2 = r2.get(r1)
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r2.keySet()
                androidx.core.content.pm.ShortcutInfoCompat r4 = r11.mInfo
                android.os.PersistableBundle r4 = r4.mExtras
                r5 = 0
                java.lang.String[] r6 = new java.lang.String[r5]
                java.lang.Object[] r6 = r3.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                r4.putStringArray(r1, r6)
                java.util.Set r4 = r2.keySet()
                java.util.Iterator r4 = r4.iterator()
            L9d:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto Ld9
                java.lang.Object r6 = r4.next()
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r2.get(r6)
                java.util.List r7 = (java.util.List) r7
                androidx.core.content.pm.ShortcutInfoCompat r8 = r11.mInfo
                android.os.PersistableBundle r8 = r8.mExtras
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.StringBuilder r9 = r9.append(r1)
                java.lang.String r10 = "/"
                java.lang.StringBuilder r9 = r9.append(r10)
                java.lang.StringBuilder r9 = r9.append(r6)
                java.lang.String r9 = r9.toString()
                java.lang.String[] r10 = new java.lang.String[r5]
                if (r7 != 0) goto Lcf
                goto Ld5
            Lcf:
                java.lang.Object[] r10 = r7.toArray(r10)
                java.lang.String[] r10 = (java.lang.String[]) r10
            Ld5:
                r8.putStringArray(r9, r10)
                goto L9d
            Ld9:
                goto L6d
            Lda:
                android.net.Uri r0 = r11.mSliceUri
                if (r0 == 0) goto Lfc
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.os.PersistableBundle r0 = r0.mExtras
                if (r0 != 0) goto Led
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.os.PersistableBundle r1 = new android.os.PersistableBundle
                r1.<init>()
                r0.mExtras = r1
            Led:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                android.os.PersistableBundle r0 = r0.mExtras
                android.net.Uri r1 = r11.mSliceUri
                java.lang.String r1 = androidx.core.net.UriCompat.toSafeString(r1)
                java.lang.String r2 = "extraSliceUri"
                r0.putString(r2, r1)
            Lfc:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r11.mInfo
                return r0
            Lff:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have an intent"
                r0.<init>(r1)
                throw r0
            L107:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have a non-empty label"
                r0.<init>(r1)
                throw r0
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(android.content.ComponentName r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mActivity = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsAlwaysBadged = r1
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(java.util.Set<java.lang.String> r3) {
                r2 = this;
                androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
                r0.<init>()
                r0.addAll(r3)
                androidx.core.content.pm.ShortcutInfoCompat r1 = r2.mInfo
                r1.mCategories = r0
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mDisabledMessage = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExcludedFromSurfaces(int r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mExcludedSurfaces = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExtras(android.os.PersistableBundle r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mExtras = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIcon = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(android.content.Intent r3) {
                r2 = this;
                r0 = 1
                android.content.Intent[] r0 = new android.content.Intent[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r0 = r2.setIntents(r0)
                return r0
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(android.content.Intent[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIntents = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIsConversation() {
                r1 = this;
                r0 = 1
                r1.mIsConversation = r0
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLocusId(androidx.core.content.LocusIdCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLocusId = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLongLabel = r2
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsLongLived = r1
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived(boolean r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIsLongLived = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(androidx.core.app.Person r3) {
                r2 = this;
                r0 = 1
                androidx.core.app.Person[] r0 = new androidx.core.app.Person[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r0 = r2.setPersons(r0)
                return r0
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(androidx.core.app.Person[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mPersons = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setRank(int r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mRank = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLabel = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setSliceUri(android.net.Uri r1) {
                r0 = this;
                r0.mSliceUri = r1
                return r0
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setTransientExtras(android.os.Bundle r3) {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r3)
                android.os.Bundle r1 = (android.os.Bundle) r1
                r0.mTransientExtras = r1
                return r2
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Surface {
    }

    ShortcutInfoCompat() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsEnabled = r0
            return
    }

    private android.os.PersistableBundle buildLegacyExtrasBundle() {
            r4 = this;
            android.os.PersistableBundle r0 = r4.mExtras
            if (r0 != 0) goto Lb
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            r4.mExtras = r0
        Lb:
            androidx.core.app.Person[] r0 = r4.mPersons
            if (r0 == 0) goto L49
            androidx.core.app.Person[] r0 = r4.mPersons
            int r0 = r0.length
            if (r0 <= 0) goto L49
            android.os.PersistableBundle r0 = r4.mExtras
            androidx.core.app.Person[] r1 = r4.mPersons
            int r1 = r1.length
            java.lang.String r2 = "extraPersonCount"
            r0.putInt(r2, r1)
            r0 = 0
        L1f:
            androidx.core.app.Person[] r1 = r4.mPersons
            int r1 = r1.length
            if (r0 >= r1) goto L49
            android.os.PersistableBundle r1 = r4.mExtras
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "extraPerson_"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0 + 1
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.core.app.Person[] r3 = r4.mPersons
            r3 = r3[r0]
            android.os.PersistableBundle r3 = r3.toPersistableBundle()
            r1.putPersistableBundle(r2, r3)
            int r0 = r0 + 1
            goto L1f
        L49:
            androidx.core.content.LocusIdCompat r0 = r4.mLocusId
            if (r0 == 0) goto L5a
            android.os.PersistableBundle r0 = r4.mExtras
            androidx.core.content.LocusIdCompat r1 = r4.mLocusId
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = "extraLocusId"
            r0.putString(r2, r1)
        L5a:
            android.os.PersistableBundle r0 = r4.mExtras
            java.lang.String r1 = "extraLongLived"
            boolean r2 = r4.mIsLongLived
            r0.putBoolean(r1, r2)
            android.os.PersistableBundle r0 = r4.mExtras
            return r0
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> fromShortcuts(android.content.Context r4, java.util.List<android.content.pm.ShortcutInfo> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
            androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r3.<init>(r4, r2)
            androidx.core.content.pm.ShortcutInfoCompat r3 = r3.build()
            r0.add(r3)
            goto Ld
        L26:
            return r0
    }

    static androidx.core.content.LocusIdCompat getLocusId(android.content.pm.ShortcutInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.content.LocusId r0 = r2.getLocusId()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            android.content.LocusId r0 = r2.getLocusId()
            androidx.core.content.LocusIdCompat r0 = androidx.core.content.LocusIdCompat.toLocusIdCompat(r0)
            return r0
        L17:
            android.os.PersistableBundle r0 = r2.getExtras()
            androidx.core.content.LocusIdCompat r0 = getLocusIdFromExtra(r0)
            return r0
    }

    private static androidx.core.content.LocusIdCompat getLocusIdFromExtra(android.os.PersistableBundle r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "extraLocusId"
            java.lang.String r1 = r2.getString(r1)
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
            r0.<init>(r1)
        L12:
            return r0
    }

    static boolean getLongLivedFromExtra(android.os.PersistableBundle r2) {
            if (r2 == 0) goto L10
            java.lang.String r0 = "extraLongLived"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto Lb
            goto L10
        Lb:
            boolean r0 = r2.getBoolean(r0)
            return r0
        L10:
            r0 = 0
            return r0
    }

    static androidx.core.app.Person[] getPersonsFromExtra(android.os.PersistableBundle r5) {
            if (r5 == 0) goto L37
            java.lang.String r0 = "extraPersonCount"
            boolean r1 = r5.containsKey(r0)
            if (r1 != 0) goto Lb
            goto L37
        Lb:
            int r0 = r5.getInt(r0)
            androidx.core.app.Person[] r1 = new androidx.core.app.Person[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "extraPerson_"
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r2 + 1
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.os.PersistableBundle r3 = r5.getPersistableBundle(r3)
            androidx.core.app.Person r3 = androidx.core.app.Person.fromPersistableBundle(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L36:
            return r1
        L37:
            r0 = 0
            return r0
    }

    android.content.Intent addToIntent(android.content.Intent r4) {
            r3 = this;
            android.content.Intent[] r0 = r3.mIntents
            android.content.Intent[] r1 = r3.mIntents
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r0 = r4.putExtra(r1, r0)
            java.lang.CharSequence r1 = r3.mLabel
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.extra.shortcut.NAME"
            r0.putExtra(r2, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
            if (r0 == 0) goto L49
            r0 = 0
            boolean r1 = r3.mIsAlwaysBadged
            if (r1 == 0) goto L42
            android.content.Context r1 = r3.mContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r2 = r3.mActivity
            if (r2 == 0) goto L36
            android.content.ComponentName r2 = r3.mActivity     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            android.graphics.drawable.Drawable r2 = r1.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r0 = r2
            goto L36
        L35:
            r2 = move-exception
        L36:
            if (r0 != 0) goto L42
            android.content.Context r2 = r3.mContext
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            android.graphics.drawable.Drawable r0 = r2.loadIcon(r1)
        L42:
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            android.content.Context r2 = r3.mContext
            r1.addToShortcutIntent(r4, r0, r2)
        L49:
            return r4
    }

    public android.content.ComponentName getActivity() {
            r1 = this;
            android.content.ComponentName r0 = r1.mActivity
            return r0
    }

    public java.util.Set<java.lang.String> getCategories() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mCategories
            return r0
    }

    public java.lang.CharSequence getDisabledMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDisabledMessage
            return r0
    }

    public int getDisabledReason() {
            r1 = this;
            int r0 = r1.mDisabledReason
            return r0
    }

    public int getExcludedFromSurfaces() {
            r1 = this;
            int r0 = r1.mExcludedSurfaces
            return r0
    }

    public android.os.PersistableBundle getExtras() {
            r1 = this;
            android.os.PersistableBundle r0 = r1.mExtras
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            android.content.Intent[] r1 = r2.mIntents
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    public android.content.Intent[] getIntents() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            android.content.Intent[] r1 = r2.mIntents
            int r1 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            return r0
    }

    public long getLastChangedTimestamp() {
            r2 = this;
            long r0 = r2.mLastChangedTimestamp
            return r0
    }

    public androidx.core.content.LocusIdCompat getLocusId() {
            r1 = this;
            androidx.core.content.LocusIdCompat r0 = r1.mLocusId
            return r0
    }

    public java.lang.CharSequence getLongLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLongLabel
            return r0
    }

    public java.lang.String getPackage() {
            r1 = this;
            java.lang.String r0 = r1.mPackageName
            return r0
    }

    public int getRank() {
            r1 = this;
            int r0 = r1.mRank
            return r0
    }

    public java.lang.CharSequence getShortLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    public android.os.Bundle getTransientExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mTransientExtras
            return r0
    }

    public android.os.UserHandle getUserHandle() {
            r1 = this;
            android.os.UserHandle r0 = r1.mUser
            return r0
    }

    public boolean hasKeyFieldsOnly() {
            r1 = this;
            boolean r0 = r1.mHasKeyFieldsOnly
            return r0
    }

    public boolean isCached() {
            r1 = this;
            boolean r0 = r1.mIsCached
            return r0
    }

    public boolean isDeclaredInManifest() {
            r1 = this;
            boolean r0 = r1.mIsDeclaredInManifest
            return r0
    }

    public boolean isDynamic() {
            r1 = this;
            boolean r0 = r1.mIsDynamic
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mIsEnabled
            return r0
    }

    public boolean isExcludedFromSurfaces(int r2) {
            r1 = this;
            int r0 = r1.mExcludedSurfaces
            r0 = r0 & r2
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.mIsImmutable
            return r0
    }

    public boolean isPinned() {
            r1 = this;
            boolean r0 = r1.mIsPinned
            return r0
    }

    public android.content.pm.ShortcutInfo toShortcutInfo() {
            r4 = this;
            android.content.pm.ShortcutInfo$Builder r0 = new android.content.pm.ShortcutInfo$Builder
            android.content.Context r1 = r4.mContext
            java.lang.String r2 = r4.mId
            r0.<init>(r1, r2)
            java.lang.CharSequence r1 = r4.mLabel
            android.content.pm.ShortcutInfo$Builder r0 = r0.setShortLabel(r1)
            android.content.Intent[] r1 = r4.mIntents
            android.content.pm.ShortcutInfo$Builder r0 = r0.setIntents(r1)
            androidx.core.graphics.drawable.IconCompat r1 = r4.mIcon
            if (r1 == 0) goto L24
            androidx.core.graphics.drawable.IconCompat r1 = r4.mIcon
            android.content.Context r2 = r4.mContext
            android.graphics.drawable.Icon r1 = r1.toIcon(r2)
            r0.setIcon(r1)
        L24:
            java.lang.CharSequence r1 = r4.mLongLabel
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L31
            java.lang.CharSequence r1 = r4.mLongLabel
            r0.setLongLabel(r1)
        L31:
            java.lang.CharSequence r1 = r4.mDisabledMessage
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3e
            java.lang.CharSequence r1 = r4.mDisabledMessage
            r0.setDisabledMessage(r1)
        L3e:
            android.content.ComponentName r1 = r4.mActivity
            if (r1 == 0) goto L47
            android.content.ComponentName r1 = r4.mActivity
            r0.setActivity(r1)
        L47:
            java.util.Set<java.lang.String> r1 = r4.mCategories
            if (r1 == 0) goto L50
            java.util.Set<java.lang.String> r1 = r4.mCategories
            r0.setCategories(r1)
        L50:
            int r1 = r4.mRank
            r0.setRank(r1)
            android.os.PersistableBundle r1 = r4.mExtras
            if (r1 == 0) goto L5e
            android.os.PersistableBundle r1 = r4.mExtras
            r0.setExtras(r1)
        L5e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L99
            androidx.core.app.Person[] r1 = r4.mPersons
            if (r1 == 0) goto L86
            androidx.core.app.Person[] r1 = r4.mPersons
            int r1 = r1.length
            if (r1 <= 0) goto L86
            androidx.core.app.Person[] r1 = r4.mPersons
            int r1 = r1.length
            android.app.Person[] r1 = new android.app.Person[r1]
            r2 = 0
        L73:
            int r3 = r1.length
            if (r2 >= r3) goto L83
            androidx.core.app.Person[] r3 = r4.mPersons
            r3 = r3[r2]
            android.app.Person r3 = r3.toAndroidPerson()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L73
        L83:
            r0.setPersons(r1)
        L86:
            androidx.core.content.LocusIdCompat r1 = r4.mLocusId
            if (r1 == 0) goto L93
            androidx.core.content.LocusIdCompat r1 = r4.mLocusId
            android.content.LocusId r1 = r1.toLocusId()
            r0.setLocusId(r1)
        L93:
            boolean r1 = r4.mIsLongLived
            r0.setLongLived(r1)
            goto La0
        L99:
            android.os.PersistableBundle r1 = r4.buildLegacyExtrasBundle()
            r0.setExtras(r1)
        La0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto Lab
            int r1 = r4.mExcludedSurfaces
            androidx.core.content.pm.ShortcutInfoCompat.Api33Impl.setExcludedFromSurfaces(r0, r1)
        Lab:
            android.content.pm.ShortcutInfo r1 = r0.build()
            return r1
    }
}
