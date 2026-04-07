package androidx.core.service.quicksettings;

/* JADX INFO: loaded from: classes.dex */
public class TileServiceCompat {
    private static androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper sTileServiceWrapper;

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void startActivityAndCollapse(android.service.quicksettings.TileService r0, android.content.Intent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void startActivityAndCollapse(android.service.quicksettings.TileService r0, android.app.PendingIntent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    interface TileServiceWrapper {
        void startActivityAndCollapse(android.app.PendingIntent r1);

        void startActivityAndCollapse(android.content.Intent r1);
    }

    private TileServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearTileServiceWrapper() {
            r0 = 0
            androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper = r0
            return
    }

    public static void setTileServiceWrapper(androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper r0) {
            androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper = r0
            return
    }

    public static void startActivityAndCollapse(android.service.quicksettings.TileService r2, androidx.core.service.quicksettings.PendingIntentActivityWrapper r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            if (r0 == 0) goto L14
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            android.app.PendingIntent r1 = r3.getPendingIntent()
            r0.startActivityAndCollapse(r1)
            goto L32
        L14:
            android.app.PendingIntent r0 = r3.getPendingIntent()
            androidx.core.service.quicksettings.TileServiceCompat.Api34Impl.startActivityAndCollapse(r2, r0)
            goto L32
        L1c:
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            if (r0 == 0) goto L2b
            androidx.core.service.quicksettings.TileServiceCompat$TileServiceWrapper r0 = androidx.core.service.quicksettings.TileServiceCompat.sTileServiceWrapper
            android.content.Intent r1 = r3.getIntent()
            r0.startActivityAndCollapse(r1)
            goto L32
        L2b:
            android.content.Intent r0 = r3.getIntent()
            androidx.core.service.quicksettings.TileServiceCompat.Api24Impl.startActivityAndCollapse(r2, r0)
        L32:
            return
    }
}
