package androidx.core.flagging;

/* JADX INFO: compiled from: AconfigPackageCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat;", "", "getBooleanFlagValue", "", "flagName", "", "defaultValue", "Companion", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AconfigPackageCompat {
    public static final androidx.core.flagging.AconfigPackageCompat.Companion Companion = null;

    /* JADX INFO: compiled from: AconfigPackageCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat$Companion;", "", "<init>", "()V", "load", "Landroidx/core/flagging/AconfigPackageCompat;", "packageName", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.core.flagging.AconfigPackageCompat.Companion $$INSTANCE = null;

        static {
                androidx.core.flagging.AconfigPackageCompat$Companion r0 = new androidx.core.flagging.AconfigPackageCompat$Companion
                r0.<init>()
                androidx.core.flagging.AconfigPackageCompat.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final androidx.core.flagging.AconfigPackageCompat load(java.lang.String r4) throws android.os.flagging.AconfigStorageReadException {
                r3 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 36
                if (r0 < r1) goto L2f
            Lc:
                androidx.core.flagging.AconfigPackageCompatApi36Impl r0 = new androidx.core.flagging.AconfigPackageCompatApi36Impl     // Catch: android.os.flagging.AconfigStorageReadException -> L1d
                android.os.flagging.AconfigPackage r1 = android.os.flagging.AconfigPackage.load(r4)     // Catch: android.os.flagging.AconfigStorageReadException -> L1d
                java.lang.String r2 = "load(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: android.os.flagging.AconfigStorageReadException -> L1d
                r0.<init>(r1)     // Catch: android.os.flagging.AconfigStorageReadException -> L1d
                androidx.core.flagging.AconfigPackageCompat r0 = (androidx.core.flagging.AconfigPackageCompat) r0     // Catch: android.os.flagging.AconfigStorageReadException -> L1d
                goto L2d
            L1d:
                r0 = move-exception
                int r1 = r0.getErrorCode()
                r2 = 2
                if (r1 != r2) goto L2e
                androidx.core.flagging.AconfigPackageCompatNoopImpl r1 = new androidx.core.flagging.AconfigPackageCompatNoopImpl
                r1.<init>()
                androidx.core.flagging.AconfigPackageCompat r1 = (androidx.core.flagging.AconfigPackageCompat) r1
                r0 = r1
            L2d:
                goto L36
            L2e:
                throw r0
            L2f:
                androidx.core.flagging.AconfigPackageCompatNoopImpl r0 = new androidx.core.flagging.AconfigPackageCompatNoopImpl
                r0.<init>()
                androidx.core.flagging.AconfigPackageCompat r0 = (androidx.core.flagging.AconfigPackageCompat) r0
            L36:
                return r0
        }
    }

    static {
            androidx.core.flagging.AconfigPackageCompat$Companion r0 = androidx.core.flagging.AconfigPackageCompat.Companion.$$INSTANCE
            androidx.core.flagging.AconfigPackageCompat.Companion = r0
            return
    }

    @kotlin.jvm.JvmStatic
    static androidx.core.flagging.AconfigPackageCompat load(java.lang.String r1) throws android.os.flagging.AconfigStorageReadException {
            androidx.core.flagging.AconfigPackageCompat$Companion r0 = androidx.core.flagging.AconfigPackageCompat.Companion
            androidx.core.flagging.AconfigPackageCompat r0 = r0.load(r1)
            return r0
    }

    boolean getBooleanFlagValue(java.lang.String r1, boolean r2);
}
