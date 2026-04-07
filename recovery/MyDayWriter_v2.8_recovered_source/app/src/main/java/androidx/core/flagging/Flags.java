package androidx.core.flagging;

/* JADX INFO: compiled from: Flags.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/core/flagging/Flags;", "", "<init>", "()V", "Companion", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Flags {
    public static final androidx.core.flagging.Flags.Companion Companion = null;
    private static final java.util.Map<java.lang.String, android.os.flagging.AconfigPackage> aconfigCache = null;
    private static final java.util.Set<java.lang.String> missingPackageCache = null;

    /* JADX INFO: compiled from: Flags.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007R\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8CX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/core/flagging/Flags$Companion;", "", "<init>", "()V", "aconfigCache", "", "", "Landroid/os/flagging/AconfigPackage;", "missingPackageCache", "", "getBooleanFlagValue", "", "packageName", "flagName", "defaultValue", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean getBooleanFlagValue$default(androidx.core.flagging.Flags.Companion r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                boolean r0 = r0.getBooleanFlagValue(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final boolean getBooleanFlagValue(java.lang.String r8, java.lang.String r9) {
                r7 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "flagName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                boolean r8 = getBooleanFlagValue$default(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @kotlin.jvm.JvmStatic
        public final boolean getBooleanFlagValue(java.lang.String r6, java.lang.String r7, boolean r8) {
                r5 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "flagName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 36
                if (r0 >= r1) goto L11
                return r8
            L11:
                java.util.Map r0 = androidx.core.flagging.Flags.access$getAconfigCache$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.util.Set r1 = androidx.core.flagging.Flags.access$getMissingPackageCache$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r2 = 0
                boolean r3 = r0.containsKey(r6)
                if (r3 == 0) goto L2e
                java.lang.Object r3 = r0.get(r6)
                r2 = r3
                android.os.flagging.AconfigPackage r2 = (android.os.flagging.AconfigPackage) r2
                goto L4b
            L2e:
                boolean r3 = r1.contains(r6)
                if (r3 == 0) goto L36
                r2 = 0
                goto L4b
            L36:
                android.os.flagging.AconfigPackage r3 = android.os.flagging.AconfigPackage.load(r6)     // Catch: android.os.flagging.AconfigStorageReadException -> L42
                r2 = r3
                r0.put(r6, r2)     // Catch: android.os.flagging.AconfigStorageReadException -> L42
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: android.os.flagging.AconfigStorageReadException -> L42
                goto L4b
            L42:
                r3 = move-exception
                r2 = 0
                boolean r4 = r1.add(r6)
                java.lang.Boolean.valueOf(r4)
            L4b:
                if (r2 == 0) goto L52
                boolean r3 = r2.getBooleanFlagValue(r7, r8)
                goto L53
            L52:
                r3 = r8
            L53:
                return r3
        }
    }

    static {
            androidx.core.flagging.Flags$Companion r0 = new androidx.core.flagging.Flags$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.core.flagging.Flags.Companion = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 36
            if (r0 < r2) goto L16
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            goto L17
        L16:
            r0 = r1
        L17:
            androidx.core.flagging.Flags.aconfigCache = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L25
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
        L25:
            androidx.core.flagging.Flags.missingPackageCache = r1
            return
    }

    public Flags() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.Map access$getAconfigCache$cp() {
            java.util.Map<java.lang.String, android.os.flagging.AconfigPackage> r0 = androidx.core.flagging.Flags.aconfigCache
            return r0
    }

    public static final /* synthetic */ java.util.Set access$getMissingPackageCache$cp() {
            java.util.Set<java.lang.String> r0 = androidx.core.flagging.Flags.missingPackageCache
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getBooleanFlagValue(java.lang.String r1, java.lang.String r2) {
            androidx.core.flagging.Flags$Companion r0 = androidx.core.flagging.Flags.Companion
            boolean r0 = r0.getBooleanFlagValue(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getBooleanFlagValue(java.lang.String r1, java.lang.String r2, boolean r3) {
            androidx.core.flagging.Flags$Companion r0 = androidx.core.flagging.Flags.Companion
            boolean r0 = r0.getBooleanFlagValue(r1, r2, r3)
            return r0
    }
}
