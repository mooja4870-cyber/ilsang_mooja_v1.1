package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sSync = null;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getCodeCacheDir(android.content.Context r1) {
                java.io.File r0 = r1.getCodeCacheDir()
                return r0
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, int r2) {
                android.graphics.drawable.Drawable r0 = r1.getDrawable(r2)
                return r0
        }

        static java.io.File getNoBackupFilesDir(android.content.Context r1) {
                java.io.File r0 = r1.getNoBackupFilesDir()
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getColor(android.content.Context r1, int r2) {
                int r0 = r1.getColor(r2)
                return r0
        }

        static <T> T getSystemService(android.content.Context r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r1.getSystemService(r2)
                return r0
        }

        static java.lang.String getSystemServiceName(android.content.Context r1, java.lang.Class<?> r2) {
                java.lang.String r0 = r1.getSystemServiceName(r2)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Context createDeviceProtectedStorageContext(android.content.Context r1) {
                android.content.Context r0 = r1.createDeviceProtectedStorageContext()
                return r0
        }

        static java.io.File getDataDir(android.content.Context r1) {
                java.io.File r0 = r1.getDataDir()
                return r0
        }

        static boolean isDeviceProtectedStorage(android.content.Context r1) {
                boolean r0 = r1.isDeviceProtectedStorage()
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Intent registerReceiver(android.content.Context r2, android.content.BroadcastReceiver r3, android.content.IntentFilter r4, java.lang.String r5, android.os.Handler r6, int r7) {
                r0 = r7 & 4
                if (r0 == 0) goto Lf
                if (r5 != 0) goto Lf
                java.lang.String r0 = androidx.core.content.ContextCompat.obtainAndCheckReceiverPermission(r2)
                android.content.Intent r1 = r2.registerReceiver(r3, r4, r0, r6)
                return r1
            Lf:
                r7 = r7 & 1
                android.content.Intent r0 = r2.registerReceiver(r3, r4, r5, r6, r7)
                return r0
        }

        static android.content.ComponentName startForegroundService(android.content.Context r1, android.content.Intent r2) {
                android.content.ComponentName r0 = r1.startForegroundService(r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.concurrent.Executor getMainExecutor(android.content.Context r1) {
                java.util.concurrent.Executor r0 = r1.getMainExecutor()
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Context createAttributionContext(android.content.Context r1, java.lang.String r2) {
                android.content.Context r0 = r1.createAttributionContext(r2)
                return r0
        }

        static java.lang.String getAttributionTag(android.content.Context r1) {
                java.lang.String r0 = r1.getAttributionTag()
                return r0
        }

        static android.view.Display getDisplayOrDefault(android.content.Context r3) {
                android.view.Display r0 = r3.getDisplay()     // Catch: java.lang.UnsupportedOperationException -> L5
                return r0
            L5:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "The context:"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r2 = " is not associated with any display. Return a fallback display instead."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "ContextCompat"
                android.util.Log.w(r2, r1)
                java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
                java.lang.Object r1 = r3.getSystemService(r1)
                android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
                r2 = 0
                android.view.Display r1 = r1.getDisplay(r2)
                return r1
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Intent registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3, java.lang.String r4, android.os.Handler r5, int r6) {
                android.content.Intent r0 = r1.registerReceiver(r2, r3, r4, r5, r6)
                return r0
        }
    }

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES = r0
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
                java.lang.String r2 = "telephony_subscription_service"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.usage.UsageStatsManager> r1 = android.app.usage.UsageStatsManager.class
                java.lang.String r2 = "usagestats"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.appwidget.AppWidgetManager> r1 = android.appwidget.AppWidgetManager.class
                java.lang.String r2 = "appwidget"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.BatteryManager> r1 = android.os.BatteryManager.class
                java.lang.String r2 = "batterymanager"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.camera2.CameraManager> r1 = android.hardware.camera2.CameraManager.class
                java.lang.String r2 = "camera"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
                java.lang.String r2 = "jobscheduler"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
                java.lang.String r2 = "launcherapps"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.media.projection.MediaProjectionManager> r1 = android.media.projection.MediaProjectionManager.class
                java.lang.String r2 = "media_projection"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.media.session.MediaSessionManager> r1 = android.media.session.MediaSessionManager.class
                java.lang.String r2 = "media_session"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.content.RestrictionsManager> r1 = android.content.RestrictionsManager.class
                java.lang.String r2 = "restrictions"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.telecom.TelecomManager> r1 = android.telecom.TelecomManager.class
                java.lang.String r2 = "telecom"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.media.tv.TvInputManager> r1 = android.media.tv.TvInputManager.class
                java.lang.String r2 = "tv_input"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
                java.lang.String r2 = "appops"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.accessibility.CaptioningManager> r1 = android.view.accessibility.CaptioningManager.class
                java.lang.String r2 = "captioning"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.ConsumerIrManager> r1 = android.hardware.ConsumerIrManager.class
                java.lang.String r2 = "consumer_ir"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.print.PrintManager> r1 = android.print.PrintManager.class
                java.lang.String r2 = "print"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.bluetooth.BluetoothManager> r1 = android.bluetooth.BluetoothManager.class
                java.lang.String r2 = "bluetooth"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
                java.lang.String r2 = "display"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
                java.lang.String r2 = "user"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.input.InputManager> r1 = android.hardware.input.InputManager.class
                java.lang.String r2 = "input"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.media.MediaRouter> r1 = android.media.MediaRouter.class
                java.lang.String r2 = "media_router"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.net.nsd.NsdManager> r1 = android.net.nsd.NsdManager.class
                java.lang.String r2 = "servicediscovery"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
                java.lang.String r2 = "accessibility"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.accounts.AccountManager> r1 = android.accounts.AccountManager.class
                java.lang.String r2 = "account"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
                java.lang.String r2 = "activity"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.AlarmManager> r1 = android.app.AlarmManager.class
                java.lang.String r2 = "alarm"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
                java.lang.String r2 = "audio"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.content.ClipboardManager> r1 = android.content.ClipboardManager.class
                java.lang.String r2 = "clipboard"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
                java.lang.String r2 = "connectivity"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
                java.lang.String r2 = "device_policy"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.DownloadManager> r1 = android.app.DownloadManager.class
                java.lang.String r2 = "download"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.DropBoxManager> r1 = android.os.DropBoxManager.class
                java.lang.String r2 = "dropbox"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
                java.lang.String r2 = "input_method"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.KeyguardManager> r1 = android.app.KeyguardManager.class
                java.lang.String r2 = "keyguard"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
                java.lang.String r2 = "layout_inflater"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r2 = "location"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.nfc.NfcManager> r1 = android.nfc.NfcManager.class
                java.lang.String r2 = "nfc"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
                java.lang.String r2 = "notification"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
                java.lang.String r2 = "power"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.SearchManager> r1 = android.app.SearchManager.class
                java.lang.String r2 = "search"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.SensorManager> r1 = android.hardware.SensorManager.class
                java.lang.String r2 = "sensor"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.storage.StorageManager> r1 = android.os.storage.StorageManager.class
                java.lang.String r2 = "storage"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
                java.lang.String r2 = "phone"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.textservice.TextServicesManager> r1 = android.view.textservice.TextServicesManager.class
                java.lang.String r2 = "textservices"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.UiModeManager> r1 = android.app.UiModeManager.class
                java.lang.String r2 = "uimode"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.hardware.usb.UsbManager> r1 = android.hardware.usb.UsbManager.class
                java.lang.String r2 = "usb"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
                java.lang.String r2 = "vibrator"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.app.WallpaperManager> r1 = android.app.WallpaperManager.class
                java.lang.String r2 = "wallpaper"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r1 = android.net.wifi.p2p.WifiP2pManager.class
                java.lang.String r2 = "wifip2p"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.net.wifi.WifiManager> r1 = android.net.wifi.WifiManager.class
                java.lang.String r2 = "wifi"
                r0.put(r1, r2)
                java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
                java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
                java.lang.String r2 = "window"
                r0.put(r1, r2)
                return
        }

        private LegacyServiceMapHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.ContextCompat.sSync = r0
            return
    }

    protected ContextCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkSelfPermission(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "permission must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L21
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L21
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r2)
            boolean r0 = r0.areNotificationsEnabled()
            if (r0 == 0) goto L1f
            r0 = 0
            goto L20
        L1f:
            r0 = -1
        L20:
            return r0
        L21:
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r0 = r2.checkPermission(r3, r0, r1)
            return r0
    }

    public static android.content.Context createAttributionContext(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            android.content.Context r0 = androidx.core.content.ContextCompat.Api30Impl.createAttributionContext(r2, r3)
            return r0
        Lb:
            return r2
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context r1) {
            android.content.Context r0 = androidx.core.content.ContextCompat.Api24Impl.createDeviceProtectedStorageContext(r1)
            return r0
    }

    private static java.io.File createFilesDir(java.io.File r4) {
            java.lang.Object r0 = androidx.core.content.ContextCompat.sSync
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            boolean r1 = r4.mkdirs()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r4
        L11:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "Unable to create files subdir "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r4.getPath()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r4
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    public static java.lang.String getAttributionTag(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.core.content.ContextCompat.Api30Impl.getAttributionTag(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.io.File getCodeCacheDir(android.content.Context r1) {
            java.io.File r0 = androidx.core.content.ContextCompat.Api21Impl.getCodeCacheDir(r1)
            return r0
    }

    public static int getColor(android.content.Context r1, int r2) {
            int r0 = androidx.core.content.ContextCompat.Api23Impl.getColor(r1, r2)
            return r0
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r2, int r3) {
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r1 = r2.getTheme()
            android.content.res.ColorStateList r0 = androidx.core.content.res.ResourcesCompat.getColorStateList(r0, r3, r1)
            return r0
    }

    public static android.content.Context getContextForLanguage(android.content.Context r3) {
            androidx.core.os.LocaleListCompat r0 = androidx.core.app.LocaleManagerCompat.getApplicationLocales(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r1 > r2) goto L25
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L25
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Resources r2 = r3.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            androidx.core.os.ConfigurationCompat.setLocales(r1, r0)
            android.content.Context r2 = r3.createConfigurationContext(r1)
            return r2
        L25:
            return r3
    }

    public static java.io.File getDataDir(android.content.Context r1) {
            java.io.File r0 = androidx.core.content.ContextCompat.Api24Impl.getDataDir(r1)
            return r0
    }

    public static android.view.Display getDisplayOrDefault(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            android.view.Display r0 = androidx.core.content.ContextCompat.Api30Impl.getDisplayOrDefault(r2)
            return r0
        Lb:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r1 = r0.getDefaultDisplay()
            return r1
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, int r2) {
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.Api21Impl.getDrawable(r1, r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "context.getExternalCacheDirs()")
    @java.lang.Deprecated
    public static java.io.File[] getExternalCacheDirs(android.content.Context r1) {
            java.io.File[] r0 = r1.getExternalCacheDirs()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "context.getExternalFilesDirs(type)")
    @java.lang.Deprecated
    public static java.io.File[] getExternalFilesDirs(android.content.Context r1, java.lang.String r2) {
            java.io.File[] r0 = r1.getExternalFilesDirs(r2)
            return r0
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.util.concurrent.Executor r0 = androidx.core.content.ContextCompat.Api28Impl.getMainExecutor(r2)
            return r0
        Lb:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r2.getMainLooper()
            r0.<init>(r1)
            java.util.concurrent.Executor r0 = androidx.core.os.ExecutorCompat.create(r0)
            return r0
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context r1) {
            java.io.File r0 = androidx.core.content.ContextCompat.Api21Impl.getNoBackupFilesDir(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "context.getObbDirs()")
    @java.lang.Deprecated
    public static java.io.File[] getObbDirs(android.content.Context r1) {
            java.io.File[] r0 = r1.getObbDirs()
            return r0
    }

    public static java.lang.String getString(android.content.Context r1, int r2) {
            android.content.Context r0 = getContextForLanguage(r1)
            java.lang.String r0 = r0.getString(r2)
            return r0
    }

    public static <T> T getSystemService(android.content.Context r1, java.lang.Class<T> r2) {
            java.lang.Object r0 = androidx.core.content.ContextCompat.Api23Impl.getSystemService(r1, r2)
            return r0
    }

    public static java.lang.String getSystemServiceName(android.content.Context r1, java.lang.Class<?> r2) {
            java.lang.String r0 = androidx.core.content.ContextCompat.Api23Impl.getSystemServiceName(r1, r2)
            return r0
    }

    public static boolean isDeviceProtectedStorage(android.content.Context r1) {
            boolean r0 = androidx.core.content.ContextCompat.Api24Impl.isDeviceProtectedStorage(r1)
            return r0
    }

    static java.lang.String obtainAndCheckReceiverPermission(android.content.Context r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r2 = androidx.core.content.PermissionChecker.checkSelfPermission(r4, r0)
            if (r2 == 0) goto L62
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getOpPackageName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r0 = r1.toString()
            int r1 = androidx.core.content.PermissionChecker.checkSelfPermission(r4, r0)
            if (r1 != 0) goto L43
            return r0
        L43:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Permission "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L62:
            return r0
    }

    public static android.content.Intent registerReceiver(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, int r9) {
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            android.content.Intent r6 = registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static android.content.Intent registerReceiver(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
            r0 = r11 & 1
            if (r0 == 0) goto L11
            r0 = r11 & 4
            if (r0 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r0.<init>(r1)
            throw r0
        L11:
            r0 = r11 & 1
            if (r0 == 0) goto L19
            r11 = r11 | 2
            r5 = r11
            goto L1a
        L19:
            r5 = r11
        L1a:
            r11 = r5 & 2
            if (r11 != 0) goto L2b
            r11 = r5 & 4
            if (r11 == 0) goto L23
            goto L2b
        L23:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r11.<init>(r0)
            throw r11
        L2b:
            r11 = r5 & 2
            if (r11 == 0) goto L3c
            r11 = r5 & 4
            if (r11 != 0) goto L34
            goto L3c
        L34:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r11.<init>(r0)
            throw r11
        L3c:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r11 < r0) goto L4c
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = androidx.core.content.ContextCompat.Api33Impl.registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
        L4c:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L5c
            android.content.Intent r6 = androidx.core.content.ContextCompat.Api26Impl.registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
        L5c:
            r6 = r5 & 4
            if (r6 == 0) goto L6b
            if (r3 != 0) goto L6b
            java.lang.String r6 = obtainAndCheckReceiverPermission(r0)
            android.content.Intent r7 = r0.registerReceiver(r1, r2, r6, r4)
            return r7
        L6b:
            android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4)
            return r6
    }

    public static boolean startActivities(android.content.Context r1, android.content.Intent[] r2) {
            r0 = 0
            boolean r0 = startActivities(r1, r2, r0)
            return r0
    }

    public static boolean startActivities(android.content.Context r1, android.content.Intent[] r2, android.os.Bundle r3) {
            r1.startActivities(r2, r3)
            r0 = 1
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "context.startActivity(intent, options)")
    @java.lang.Deprecated
    public static void startActivity(android.content.Context r0, android.content.Intent r1, android.os.Bundle r2) {
            r0.startActivity(r1, r2)
            return
    }

    public static void startForegroundService(android.content.Context r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.content.ContextCompat.Api26Impl.startForegroundService(r2, r3)
            goto Ld
        La:
            r2.startService(r3)
        Ld:
            return
    }
}
