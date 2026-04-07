package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final java.lang.String TAG = "TwilightManager";
    private static androidx.appcompat.app.TwilightManager sInstance;
    private final android.content.Context mContext;
    private final android.location.LocationManager mLocationManager;
    private final androidx.appcompat.app.TwilightManager.TwilightState mTwilightState;

    private static class TwilightState {
        boolean isNight;
        long nextUpdate;

        TwilightState() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    TwilightManager(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.app.TwilightManager$TwilightState r0 = new androidx.appcompat.app.TwilightManager$TwilightState
            r0.<init>()
            r1.mTwilightState = r0
            r1.mContext = r2
            r1.mLocationManager = r3
            return
    }

    static androidx.appcompat.app.TwilightManager getInstance(android.content.Context r2) {
            androidx.appcompat.app.TwilightManager r0 = androidx.appcompat.app.TwilightManager.sInstance
            if (r0 != 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()
            androidx.appcompat.app.TwilightManager r0 = new androidx.appcompat.app.TwilightManager
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            androidx.appcompat.app.TwilightManager.sInstance = r0
        L17:
            androidx.appcompat.app.TwilightManager r0 = androidx.appcompat.app.TwilightManager.sInstance
            return r0
    }

    private android.location.Location getLastKnownLocation() {
            r7 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r7.mContext
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = androidx.core.content.PermissionChecker.checkSelfPermission(r2, r3)
            if (r2 != 0) goto L12
            java.lang.String r3 = "network"
            android.location.Location r0 = r7.getLastKnownLocationForProvider(r3)
        L12:
            android.content.Context r3 = r7.mContext
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = androidx.core.content.PermissionChecker.checkSelfPermission(r3, r4)
            if (r2 != 0) goto L22
            java.lang.String r3 = "gps"
            android.location.Location r1 = r7.getLastKnownLocationForProvider(r3)
        L22:
            if (r1 == 0) goto L36
            if (r0 == 0) goto L36
            long r3 = r1.getTime()
            long r5 = r0.getTime()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L34
            r3 = r1
            goto L35
        L34:
            r3 = r0
        L35:
            return r3
        L36:
            if (r1 == 0) goto L3a
            r3 = r1
            goto L3b
        L3a:
            r3 = r0
        L3b:
            return r3
    }

    private android.location.Location getLastKnownLocationForProvider(java.lang.String r4) {
            r3 = this;
            android.location.LocationManager r0 = r3.mLocationManager     // Catch: java.lang.Exception -> L10
            boolean r0 = r0.isProviderEnabled(r4)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto Lf
            android.location.LocationManager r0 = r3.mLocationManager     // Catch: java.lang.Exception -> L10
            android.location.Location r0 = r0.getLastKnownLocation(r4)     // Catch: java.lang.Exception -> L10
            return r0
        Lf:
            goto L18
        L10:
            r0 = move-exception
            java.lang.String r1 = "TwilightManager"
            java.lang.String r2 = "Failed to get last known location"
            android.util.Log.d(r1, r2, r0)
        L18:
            r0 = 0
            return r0
    }

    private boolean isStateValid() {
            r4 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r4.mTwilightState
            long r0 = r0.nextUpdate
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static void setInstance(androidx.appcompat.app.TwilightManager r0) {
            androidx.appcompat.app.TwilightManager.sInstance = r0
            return
    }

    private void updateState(android.location.Location r18) {
            r17 = this;
            r0 = r17
            androidx.appcompat.app.TwilightManager$TwilightState r1 = r0.mTwilightState
            long r3 = java.lang.System.currentTimeMillis()
            androidx.appcompat.app.TwilightCalculator r5 = androidx.appcompat.app.TwilightCalculator.getInstance()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r3 - r12
            double r8 = r18.getLatitude()
            double r10 = r18.getLongitude()
            r5.calculateTwilight(r6, r8, r10)
            r2 = r5
            double r5 = r18.getLatitude()
            double r7 = r18.getLongitude()
            r2.calculateTwilight(r3, r5, r7)
            r5 = r2
            int r2 = r5.state
            r6 = 1
            if (r2 != r6) goto L2f
            goto L30
        L2f:
            r6 = 0
        L30:
            r2 = r6
            long r14 = r5.sunrise
            long r6 = r5.sunset
            long r8 = r3 + r12
            r10 = r6
            r6 = r8
            double r8 = r18.getLatitude()
            r12 = r10
            double r10 = r18.getLongitude()
            r5.calculateTwilight(r6, r8, r10)
            long r6 = r5.sunrise
            r8 = 0
            r10 = -1
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 == 0) goto L66
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L54
            goto L66
        L54:
            int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r10 <= 0) goto L5a
            long r8 = r8 + r6
            goto L61
        L5a:
            int r10 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r10 <= 0) goto L60
            long r8 = r8 + r12
            goto L61
        L60:
            long r8 = r8 + r14
        L61:
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 + r10
            goto L6b
        L66:
            r10 = 43200000(0x2932e00, double:2.1343636E-316)
            long r8 = r3 + r10
        L6b:
            r1.isNight = r2
            r1.nextUpdate = r8
            return
    }

    boolean isNight() {
            r5 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r5.mTwilightState
            boolean r1 = r5.isStateValid()
            if (r1 == 0) goto Lb
            boolean r1 = r0.isNight
            return r1
        Lb:
            android.location.Location r1 = r5.getLastKnownLocation()
            if (r1 == 0) goto L17
            r5.updateState(r1)
            boolean r2 = r0.isNight
            return r2
        L17:
            java.lang.String r2 = "TwilightManager"
            java.lang.String r3 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r2, r3)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r3 = 11
            int r3 = r2.get(r3)
            r4 = 6
            if (r3 < r4) goto L32
            r4 = 22
            if (r3 < r4) goto L30
            goto L32
        L30:
            r4 = 0
            goto L33
        L32:
            r4 = 1
        L33:
            return r4
    }
}
