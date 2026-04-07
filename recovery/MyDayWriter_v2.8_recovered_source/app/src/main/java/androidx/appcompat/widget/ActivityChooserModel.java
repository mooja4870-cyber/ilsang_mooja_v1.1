package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ActivityChooserModel extends android.database.DataSetObservable {
    static final java.lang.String ATTRIBUTE_ACTIVITY = "activity";
    static final java.lang.String ATTRIBUTE_TIME = "time";
    static final java.lang.String ATTRIBUTE_WEIGHT = "weight";
    static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final java.lang.String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    static final java.lang.String LOG_TAG = null;
    static final java.lang.String TAG_HISTORICAL_RECORD = "historical-record";
    static final java.lang.String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> sDataModelRegistry = null;
    private static final java.lang.Object sRegistryLock = null;
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mActivities;
    private androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
    private androidx.appcompat.widget.ActivityChooserModel.ActivitySorter mActivitySorter;
    boolean mCanReadHistoricalData;
    final android.content.Context mContext;
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    final java.lang.String mHistoryFileName;
    private int mHistoryMaxSize;
    private final java.lang.Object mInstanceLock;
    private android.content.Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel r1);
    }

    public static final class ActivityResolveInfo implements java.lang.Comparable<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> {
        public final android.content.pm.ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(android.content.pm.ResolveInfo r1) {
                r0 = this;
                r0.<init>()
                r0.resolveInfo = r1
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo r3) {
                r2 = this;
                float r0 = r3.weight
                int r0 = java.lang.Float.floatToIntBits(r0)
                float r1 = r2.weight
                int r1 = java.lang.Float.floatToIntBits(r1)
                int r0 = r0 - r1
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo r1) {
                r0 = this;
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                r1 = 0
                if (r6 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r5.getClass()
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                r2 = r6
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r2 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r2
                float r3 = r5.weight
                int r3 = java.lang.Float.floatToIntBits(r3)
                float r4 = r2.weight
                int r4 = java.lang.Float.floatToIntBits(r4)
                if (r3 == r4) goto L25
                return r1
            L25:
                return r0
        }

        public int hashCode() {
                r1 = this;
                float r0 = r1.weight
                int r0 = java.lang.Float.floatToIntBits(r0)
                int r0 = r0 + 31
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "resolveInfo:"
                java.lang.StringBuilder r1 = r0.append(r1)
                android.content.pm.ResolveInfo r2 = r5.resolveInfo
                java.lang.String r2 = r2.toString()
                r1.append(r2)
                java.lang.String r1 = "; weight:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                float r3 = r5.weight
                double r3 = (double) r3
                r2.<init>(r3)
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    public interface ActivitySorter {
        void sort(android.content.Intent r1, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> r2, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> r3);
    }

    private static final class DefaultSorter implements androidx.appcompat.widget.ActivityChooserModel.ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap;

        DefaultSorter() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mPackageNameToActivityMap = r0
                return
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(android.content.Intent r11, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> r12, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> r13) {
                r10 = this;
                java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r0 = r10.mPackageNameToActivityMap
                r0.clear()
                int r1 = r12.size()
                r2 = 0
            La:
                if (r2 >= r1) goto L2c
                java.lang.Object r3 = r12.get(r2)
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r3 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r3
                r4 = 0
                r3.weight = r4
                android.content.ComponentName r4 = new android.content.ComponentName
                android.content.pm.ResolveInfo r5 = r3.resolveInfo
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                java.lang.String r5 = r5.packageName
                android.content.pm.ResolveInfo r6 = r3.resolveInfo
                android.content.pm.ActivityInfo r6 = r6.activityInfo
                java.lang.String r6 = r6.name
                r4.<init>(r5, r6)
                r0.put(r4, r3)
                int r2 = r2 + 1
                goto La
            L2c:
                int r2 = r13.size()
                int r2 = r2 + (-1)
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = r2
            L35:
                if (r4 < 0) goto L56
                java.lang.Object r5 = r13.get(r4)
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r5 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r5
                android.content.ComponentName r6 = r5.activity
                java.lang.Object r7 = r0.get(r6)
                androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r7 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r7
                if (r7 == 0) goto L53
                float r8 = r7.weight
                float r9 = r5.weight
                float r9 = r9 * r3
                float r8 = r8 + r9
                r7.weight = r8
                r8 = 1064514355(0x3f733333, float:0.95)
                float r3 = r3 * r8
            L53:
                int r4 = r4 + (-1)
                goto L35
            L56:
                java.util.Collections.sort(r12)
                return
        }
    }

    public static final class HistoricalRecord {
        public final android.content.ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(android.content.ComponentName r1, long r2, float r4) {
                r0 = this;
                r0.<init>()
                r0.activity = r1
                r0.time = r2
                r0.weight = r4
                return
        }

        public HistoricalRecord(java.lang.String r2, long r3, float r5) {
                r1 = this;
                android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r2)
                r1.<init>(r0, r3, r5)
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                r2 = r8
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r2 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r2
                android.content.ComponentName r3 = r7.activity
                if (r3 != 0) goto L1f
                android.content.ComponentName r3 = r2.activity
                if (r3 == 0) goto L2a
                return r1
            L1f:
                android.content.ComponentName r3 = r7.activity
                android.content.ComponentName r4 = r2.activity
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L2a
                return r1
            L2a:
                long r3 = r7.time
                long r5 = r2.time
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L33
                return r1
            L33:
                float r3 = r7.weight
                int r3 = java.lang.Float.floatToIntBits(r3)
                float r4 = r2.weight
                int r4 = java.lang.Float.floatToIntBits(r4)
                if (r3 == r4) goto L42
                return r1
            L42:
                return r0
        }

        public int hashCode() {
                r8 = this;
                r0 = 31
                r1 = 1
                int r2 = r1 * 31
                android.content.ComponentName r3 = r8.activity
                if (r3 != 0) goto Lb
                r3 = 0
                goto L11
            Lb:
                android.content.ComponentName r3 = r8.activity
                int r3 = r3.hashCode()
            L11:
                int r2 = r2 + r3
                int r1 = r2 * 31
                long r3 = r8.time
                long r5 = r8.time
                r7 = 32
                long r5 = r5 >>> r7
                long r3 = r3 ^ r5
                int r3 = (int) r3
                int r1 = r1 + r3
                int r2 = r1 * 31
                float r3 = r8.weight
                int r3 = java.lang.Float.floatToIntBits(r3)
                int r2 = r2 + r3
                return r2
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "; activity:"
                java.lang.StringBuilder r1 = r0.append(r1)
                android.content.ComponentName r2 = r5.activity
                r1.append(r2)
                java.lang.String r1 = "; time:"
                java.lang.StringBuilder r1 = r0.append(r1)
                long r2 = r5.time
                r1.append(r2)
                java.lang.String r1 = "; weight:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                float r3 = r5.weight
                double r3 = (double) r3
                r2.<init>(r3)
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel r1, android.content.Intent r2);
    }

    private final class PersistHistoryAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserModel this$0;

        PersistHistoryAsyncTask(androidx.appcompat.widget.ActivityChooserModel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.doInBackground2(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public java.lang.Void doInBackground2(java.lang.Object... r18) {
                r17 = this;
                r1 = r17
                java.lang.String r0 = "historical-record"
                java.lang.String r2 = "historical-records"
                java.lang.String r3 = "Error writing historical record file: "
                r4 = 0
                r5 = r18[r4]
                java.util.List r5 = (java.util.List) r5
                r6 = 1
                r7 = r18[r6]
                java.lang.String r7 = (java.lang.String) r7
                r8 = 0
                r9 = 0
                androidx.appcompat.widget.ActivityChooserModel r10 = r1.this$0     // Catch: java.io.FileNotFoundException -> L10d
                android.content.Context r10 = r10.mContext     // Catch: java.io.FileNotFoundException -> L10d
                java.io.FileOutputStream r10 = r10.openFileOutput(r7, r4)     // Catch: java.io.FileNotFoundException -> L10d
                org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()
                r8.setOutput(r10, r9)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                java.lang.String r11 = "UTF-8"
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                r8.startDocument(r11, r12)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                r8.startTag(r9, r2)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                int r11 = r5.size()     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                r12 = 0
            L35:
                if (r12 >= r11) goto L6d
                java.lang.Object r13 = r5.remove(r4)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r13 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r13     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                r8.startTag(r9, r0)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                java.lang.String r14 = "activity"
                android.content.ComponentName r15 = r13.activity     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                java.lang.String r15 = r15.flattenToString()     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                r8.attribute(r9, r14, r15)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L89 java.lang.IllegalStateException -> Lb1 java.lang.IllegalArgumentException -> Ld6
                java.lang.String r14 = "time"
                r16 = r5
                long r4 = r13.time     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                r8.attribute(r9, r14, r4)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                java.lang.String r4 = "weight"
                float r5 = r13.weight     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                r8.attribute(r9, r4, r5)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                r8.endTag(r9, r0)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                int r12 = r12 + 1
                r5 = r16
                r4 = 0
                goto L35
            L6d:
                r16 = r5
                r8.endTag(r9, r2)     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                r8.endDocument()     // Catch: java.io.IOException -> L7d java.lang.IllegalStateException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.this$0
                r0.mCanReadHistoricalData = r6
                if (r10 == 0) goto Lfe
            L7b:
                goto Lfa
            L7d:
                r0 = move-exception
                goto L8c
            L7f:
                r0 = move-exception
                goto Lb4
            L81:
                r0 = move-exception
                goto Ld9
            L83:
                r0 = move-exception
                r16 = r5
                r2 = r0
                goto L101
            L89:
                r0 = move-exception
                r16 = r5
            L8c:
                java.lang.String r2 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
                r4.<init>()     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r4 = r1.this$0     // Catch: java.lang.Throwable -> Lff
                java.lang.String r4 = r4.mHistoryFileName     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lff
                android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.this$0
                r0.mCanReadHistoricalData = r6
                if (r10 == 0) goto Lfe
            Lad:
                r10.close()     // Catch: java.io.IOException -> Lfc
                goto Lfb
            Lb1:
                r0 = move-exception
                r16 = r5
            Lb4:
                java.lang.String r2 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
                r4.<init>()     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r4 = r1.this$0     // Catch: java.lang.Throwable -> Lff
                java.lang.String r4 = r4.mHistoryFileName     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lff
                android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.this$0
                r0.mCanReadHistoricalData = r6
                if (r10 == 0) goto Lfe
                goto L7b
            Ld6:
                r0 = move-exception
                r16 = r5
            Ld9:
                java.lang.String r2 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
                r4.<init>()     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r4 = r1.this$0     // Catch: java.lang.Throwable -> Lff
                java.lang.String r4 = r4.mHistoryFileName     // Catch: java.lang.Throwable -> Lff
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lff
                android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> Lff
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.this$0
                r0.mCanReadHistoricalData = r6
                if (r10 == 0) goto Lfe
            Lfa:
                goto Lad
            Lfb:
                goto Lfe
            Lfc:
                r0 = move-exception
                goto Lfb
            Lfe:
                return r9
            Lff:
                r0 = move-exception
                r2 = r0
            L101:
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.this$0
                r0.mCanReadHistoricalData = r6
                if (r10 == 0) goto L10c
                r10.close()     // Catch: java.io.IOException -> L10b
                goto L10c
            L10b:
                r0 = move-exception
            L10c:
                throw r2
            L10d:
                r0 = move-exception
                r16 = r5
                java.lang.String r2 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r2, r3, r0)
                return r9
        }
    }

    static {
            java.lang.Class<androidx.appcompat.widget.ActivityChooserModel> r0 = androidx.appcompat.widget.ActivityChooserModel.class
            java.lang.String r0 = r0.getSimpleName()
            androidx.appcompat.widget.ActivityChooserModel.LOG_TAG = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.ActivityChooserModel.sRegistryLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.appcompat.widget.ActivityChooserModel.sDataModelRegistry = r0
            return
    }

    private ActivityChooserModel(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mInstanceLock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mActivities = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mHistoricalRecords = r0
            androidx.appcompat.widget.ActivityChooserModel$DefaultSorter r0 = new androidx.appcompat.widget.ActivityChooserModel$DefaultSorter
            r0.<init>()
            r2.mActivitySorter = r0
            r0 = 50
            r2.mHistoryMaxSize = r0
            r0 = 1
            r2.mCanReadHistoricalData = r0
            r1 = 0
            r2.mReadShareHistoryCalled = r1
            r2.mHistoricalRecordsChanged = r0
            r2.mReloadActivities = r1
            android.content.Context r0 = r3.getApplicationContext()
            r2.mContext = r0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L55
            java.lang.String r0 = ".xml"
            boolean r1 = r4.endsWith(r0)
            if (r1 != 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.mHistoryFileName = r0
            goto L57
        L55:
            r2.mHistoryFileName = r4
        L57:
            return
    }

    private boolean addHistoricalRecord(androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord r3) {
            r2 = this;
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r2.mHistoricalRecords
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L17
            r1 = 1
            r2.mHistoricalRecordsChanged = r1
            r2.pruneExcessiveHistoricalRecordsIfNeeded()
            r2.persistHistoricalDataIfNeeded()
            r2.sortActivitiesIfNeeded()
            r2.notifyChanged()
        L17:
            return r0
    }

    private void ensureConsistentState() {
            r2 = this;
            boolean r0 = r2.loadActivitiesIfNeeded()
            boolean r1 = r2.readHistoricalDataIfNeeded()
            r0 = r0 | r1
            r2.pruneExcessiveHistoricalRecordsIfNeeded()
            if (r0 == 0) goto L14
            r2.sortActivitiesIfNeeded()
            r2.notifyChanged()
        L14:
            return
    }

    public static androidx.appcompat.widget.ActivityChooserModel get(android.content.Context r3, java.lang.String r4) {
            java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.sRegistryLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> r1 = androidx.appcompat.widget.ActivityChooserModel.sDataModelRegistry     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1a
            androidx.appcompat.widget.ActivityChooserModel r1 = (androidx.appcompat.widget.ActivityChooserModel) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L18
            androidx.appcompat.widget.ActivityChooserModel r2 = new androidx.appcompat.widget.ActivityChooserModel     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1a
            r1 = r2
            java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> r2 = androidx.appcompat.widget.ActivityChooserModel.sDataModelRegistry     // Catch: java.lang.Throwable -> L1a
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    private boolean loadActivitiesIfNeeded() {
            r6 = this;
            boolean r0 = r6.mReloadActivities
            r1 = 0
            if (r0 == 0) goto L38
            android.content.Intent r0 = r6.mIntent
            if (r0 == 0) goto L38
            r6.mReloadActivities = r1
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r0 = r6.mActivities
            r0.clear()
            android.content.Context r0 = r6.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = r6.mIntent
            java.util.List r0 = r0.queryIntentActivities(r2, r1)
            int r1 = r0.size()
            r2 = 0
        L21:
            if (r2 >= r1) goto L36
            java.lang.Object r3 = r0.get(r2)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r4 = r6.mActivities
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r5 = new androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo
            r5.<init>(r3)
            r4.add(r5)
            int r2 = r2 + 1
            goto L21
        L36:
            r2 = 1
            return r2
        L38:
            return r1
    }

    private void persistHistoricalDataIfNeeded() {
            r4 = this;
            boolean r0 = r4.mReadShareHistoryCalled
            if (r0 == 0) goto L2c
            boolean r0 = r4.mHistoricalRecordsChanged
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            r4.mHistoricalRecordsChanged = r0
            java.lang.String r0 = r4.mHistoryFileName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2b
            androidx.appcompat.widget.ActivityChooserModel$PersistHistoryAsyncTask r0 = new androidx.appcompat.widget.ActivityChooserModel$PersistHistoryAsyncTask
            r0.<init>(r4)
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r3 = r4.mHistoricalRecords
            r2.<init>(r3)
            java.lang.String r3 = r4.mHistoryFileName
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r0.executeOnExecutor(r1, r2)
        L2b:
            return
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No preceding call to #readHistoricalData"
            r0.<init>(r1)
            throw r0
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
            r4 = this;
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r4.mHistoricalRecords
            int r0 = r0.size()
            int r1 = r4.mHistoryMaxSize
            int r0 = r0 - r1
            if (r0 > 0) goto Lc
            return
        Lc:
            r1 = 1
            r4.mHistoricalRecordsChanged = r1
            r1 = 0
        L10:
            if (r1 >= r0) goto L1e
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r2 = r4.mHistoricalRecords
            r3 = 0
            java.lang.Object r2 = r2.remove(r3)
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r2 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r2
            int r1 = r1 + 1
            goto L10
        L1e:
            return
    }

    private boolean readHistoricalDataIfNeeded() {
            r2 = this;
            boolean r0 = r2.mCanReadHistoricalData
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r2.mHistoricalRecordsChanged
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.mHistoryFileName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            r2.mCanReadHistoricalData = r1
            r0 = 1
            r2.mReadShareHistoryCalled = r0
            r2.readHistoricalDataImpl()
            return r0
        L1a:
            return r1
    }

    private void readHistoricalDataImpl() {
            r12 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            r1 = 0
            android.content.Context r2 = r12.mContext     // Catch: java.io.FileNotFoundException -> Ld3
            java.lang.String r3 = r12.mHistoryFileName     // Catch: java.io.FileNotFoundException -> Ld3
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: java.io.FileNotFoundException -> Ld3
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r3 = "UTF-8"
            r1.setInput(r2, r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r3 = 0
        L16:
            r4 = 1
            if (r3 == r4) goto L22
            r5 = 2
            if (r3 == r5) goto L22
            int r4 = r1.next()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r3 = r4
            goto L16
        L22:
            java.lang.String r5 = "historical-records"
            java.lang.String r6 = r1.getName()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            if (r5 == 0) goto L82
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r5 = r12.mHistoricalRecords     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r5.clear()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
        L33:
            int r6 = r1.next()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r3 = r6
            if (r3 != r4) goto L42
        L3b:
            if (r2 == 0) goto Lca
        L3d:
            r2.close()     // Catch: java.io.IOException -> Lc8
            goto Lc7
        L42:
            r6 = 3
            if (r3 == r6) goto L33
            r6 = 4
            if (r3 != r6) goto L49
            goto L33
        L49:
            java.lang.String r6 = r1.getName()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r7 = "historical-record"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            if (r7 == 0) goto L7a
            java.lang.String r7 = "activity"
            r8 = 0
            java.lang.String r7 = r1.getAttributeValue(r8, r7)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r9 = "time"
            java.lang.String r9 = r1.getAttributeValue(r8, r9)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            long r9 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r11 = "weight"
            java.lang.String r8 = r1.getAttributeValue(r8, r11)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r11 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r11.<init>(r7, r9, r8)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            r5.add(r11)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            goto L33
        L7a:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r7 = "Share records file not well-formed."
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            throw r4     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
        L82:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            java.lang.String r5 = "Share records file does not start with historical-records tag."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
            throw r4     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> La9
        L8a:
            r0 = move-exception
            goto Lcb
        L8c:
            r1 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r12.mHistoryFileName     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            android.util.Log.e(r3, r0, r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lca
            goto L3d
        La9:
            r1 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r12.mHistoryFileName     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            android.util.Log.e(r3, r0, r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lca
            goto L3d
        Lc7:
            goto Lca
        Lc8:
            r0 = move-exception
            goto Lc7
        Lca:
            return
        Lcb:
            if (r2 == 0) goto Ld2
            r2.close()     // Catch: java.io.IOException -> Ld1
            goto Ld2
        Ld1:
            r1 = move-exception
        Ld2:
            throw r0
        Ld3:
            r0 = move-exception
            return
    }

    private boolean sortActivitiesIfNeeded() {
            r4 = this;
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r0 = r4.mActivitySorter
            if (r0 == 0) goto L29
            android.content.Intent r0 = r4.mIntent
            if (r0 == 0) goto L29
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r0 = r4.mActivities
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r0 = r4.mHistoricalRecords
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r0 = r4.mActivitySorter
            android.content.Intent r1 = r4.mIntent
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r2 = r4.mActivities
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r3 = r4.mHistoricalRecords
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r0.sort(r1, r2, r3)
            r0 = 1
            return r0
        L29:
            r0 = 0
            return r0
    }

    public android.content.Intent chooseActivity(int r9) {
            r8 = this;
            java.lang.Object r0 = r8.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r8.mIntent     // Catch: java.lang.Throwable -> L53
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r2
        La:
            r8.ensureConsistentState()     // Catch: java.lang.Throwable -> L53
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r8.mActivities     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L53
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L53
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L53
            android.content.pm.ResolveInfo r4 = r1.resolveInfo     // Catch: java.lang.Throwable -> L53
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Throwable -> L53
            android.content.pm.ResolveInfo r5 = r1.resolveInfo     // Catch: java.lang.Throwable -> L53
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = r5.name     // Catch: java.lang.Throwable -> L53
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L53
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L53
            android.content.Intent r5 = r8.mIntent     // Catch: java.lang.Throwable -> L53
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L53
            r4.setComponent(r3)     // Catch: java.lang.Throwable -> L53
            androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener r5 = r8.mActivityChoserModelPolicy     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L43
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L53
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L53
            androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener r6 = r8.mActivityChoserModelPolicy     // Catch: java.lang.Throwable -> L53
            boolean r6 = r6.onChooseActivity(r8, r5)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r2
        L43:
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r2 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L53
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> L53
            r8.addHistoricalRecord(r2)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return r4
        L53:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r1
    }

    public android.content.pm.ResolveInfo getActivity(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> L12
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r2.mActivities     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L12
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L12
            android.content.pm.ResolveInfo r1 = r1.resolveInfo     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public int getActivityCount() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r2.mActivities     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public int getActivityIndex(android.content.pm.ResolveInfo r7) {
            r6 = this;
            java.lang.Object r0 = r6.mInstanceLock
            monitor-enter(r0)
            r6.ensureConsistentState()     // Catch: java.lang.Throwable -> L21
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r6.mActivities     // Catch: java.lang.Throwable -> L21
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L21
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1e
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r4 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r4     // Catch: java.lang.Throwable -> L21
            android.content.pm.ResolveInfo r5 = r4.resolveInfo     // Catch: java.lang.Throwable -> L21
            if (r5 != r7) goto L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r3
        L1b:
            int r3 = r3 + 1
            goto Ld
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            r0 = -1
            return r0
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public android.content.pm.ResolveInfo getDefaultActivity() {
            r3 = this;
            java.lang.Object r0 = r3.mInstanceLock
            monitor-enter(r0)
            r3.ensureConsistentState()     // Catch: java.lang.Throwable -> L1e
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r3.mActivities     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1b
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r3.mActivities     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1e
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L1e
            android.content.pm.ResolveInfo r1 = r1.resolveInfo     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            return r0
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public int getHistoryMaxSize() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public int getHistorySize() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r1 = r2.mHistoricalRecords     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public android.content.Intent getIntent() {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r2.mIntent     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void setActivitySorter(androidx.appcompat.widget.ActivityChooserModel.ActivitySorter r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r1 = r2.mActivitySorter     // Catch: java.lang.Throwable -> L16
            if (r1 != r3) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L9:
            r2.mActivitySorter = r3     // Catch: java.lang.Throwable -> L16
            boolean r1 = r2.sortActivitiesIfNeeded()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public void setDefaultActivity(int r9) {
            r8 = this;
            java.lang.Object r0 = r8.mInstanceLock
            monitor-enter(r0)
            r8.ensureConsistentState()     // Catch: java.lang.Throwable -> L44
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r1 = r8.mActivities     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L44
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r1 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r1     // Catch: java.lang.Throwable -> L44
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo> r2 = r8.mActivities     // Catch: java.lang.Throwable -> L44
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L44
            androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo r2 = (androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) r2     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L22
            float r3 = r2.weight     // Catch: java.lang.Throwable -> L44
            float r4 = r1.weight     // Catch: java.lang.Throwable -> L44
            float r3 = r3 - r4
            r4 = 1084227584(0x40a00000, float:5.0)
            float r3 = r3 + r4
            goto L24
        L22:
            r3 = 1065353216(0x3f800000, float:1.0)
        L24:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L44
            android.content.pm.ResolveInfo r5 = r1.resolveInfo     // Catch: java.lang.Throwable -> L44
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Throwable -> L44
            android.content.pm.ResolveInfo r6 = r1.resolveInfo     // Catch: java.lang.Throwable -> L44
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r6.name     // Catch: java.lang.Throwable -> L44
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L44
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r5 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L44
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            r5.<init>(r4, r6, r3)     // Catch: java.lang.Throwable -> L44
            r8.addHistoricalRecord(r5)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }

    public void setHistoryMaxSize(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch: java.lang.Throwable -> L19
            if (r1 != r3) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L9:
            r2.mHistoryMaxSize = r3     // Catch: java.lang.Throwable -> L19
            r2.pruneExcessiveHistoricalRecordsIfNeeded()     // Catch: java.lang.Throwable -> L19
            boolean r1 = r2.sortActivitiesIfNeeded()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L17
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public void setIntent(android.content.Intent r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            android.content.Intent r1 = r2.mIntent     // Catch: java.lang.Throwable -> L13
            if (r1 != r3) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L9:
            r2.mIntent = r3     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r2.mReloadActivities = r1     // Catch: java.lang.Throwable -> L13
            r2.ensureConsistentState()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public void setOnChooseActivityListener(androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            r2.mActivityChoserModelPolicy = r3     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
