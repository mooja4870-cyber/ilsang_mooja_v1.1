package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
class GpsStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;
    private java.util.Iterator<android.location.GpsSatellite> mCachedIterator;
    private int mCachedIteratorPosition;
    private android.location.GpsSatellite mCachedSatellite;
    private int mCachedSatelliteCount;
    private final android.location.GpsStatus mWrapped;

    GpsStatusWrapper(android.location.GpsStatus r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.location.GpsStatus r0 = (android.location.GpsStatus) r0
            r2.mWrapped = r0
            r0 = -1
            r2.mCachedSatelliteCount = r0
            android.location.GpsStatus r1 = r2.mWrapped
            java.lang.Iterable r1 = r1.getSatellites()
            java.util.Iterator r1 = r1.iterator()
            r2.mCachedIterator = r1
            r2.mCachedIteratorPosition = r0
            r0 = 0
            r2.mCachedSatellite = r0
            return
    }

    private static int getConstellationFromPrn(int r2) {
            if (r2 <= 0) goto L8
            r0 = 32
            if (r2 > r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 33
            r1 = 64
            if (r2 < r0) goto L12
            if (r2 > r1) goto L12
            r0 = 2
            return r0
        L12:
            if (r2 <= r1) goto L1a
            r0 = 88
            if (r2 > r0) goto L1a
            r0 = 3
            return r0
        L1a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 <= r0) goto L24
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 > r1) goto L24
            r0 = 5
            return r0
        L24:
            r1 = 193(0xc1, float:2.7E-43)
            if (r2 < r1) goto L2c
            if (r2 > r0) goto L2c
            r0 = 4
            return r0
        L2c:
            r0 = 0
            return r0
    }

    private android.location.GpsSatellite getSatellite(int r3) {
            r2 = this;
            android.location.GpsStatus r0 = r2.mWrapped
            monitor-enter(r0)
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L41
            if (r3 >= r1) goto L16
            android.location.GpsStatus r1 = r2.mWrapped     // Catch: java.lang.Throwable -> L41
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L41
            r2.mCachedIterator = r1     // Catch: java.lang.Throwable -> L41
            r1 = -1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L41
        L16:
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L41
            if (r1 >= r3) goto L37
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + 1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L41
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L2c
            r1 = 0
            r2.mCachedSatellite = r1     // Catch: java.lang.Throwable -> L41
            goto L37
        L2c:
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L41
            android.location.GpsSatellite r1 = (android.location.GpsSatellite) r1     // Catch: java.lang.Throwable -> L41
            r2.mCachedSatellite = r1     // Catch: java.lang.Throwable -> L41
            goto L16
        L37:
            android.location.GpsSatellite r1 = r2.mCachedSatellite     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.location.GpsSatellite r0 = (android.location.GpsSatellite) r0
            return r0
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
    }

    private static int getSvidFromPrn(int r1) {
            int r0 = getConstellationFromPrn(r1)
            switch(r0) {
                case 2: goto Le;
                case 3: goto Lb;
                case 4: goto L7;
                case 5: goto L8;
                default: goto L7;
            }
        L7:
            goto L11
        L8:
            int r1 = r1 + (-200)
            goto L11
        Lb:
            int r1 = r1 + (-64)
            goto L11
        Le:
            int r1 = r1 + 87
        L11:
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof androidx.core.location.GpsStatusWrapper
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r4
            androidx.core.location.GpsStatusWrapper r0 = (androidx.core.location.GpsStatusWrapper) r0
            android.location.GpsStatus r1 = r3.mWrapped
            android.location.GpsStatus r2 = r0.mWrapped
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            float r0 = r0.getAzimuth()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            float r0 = r0.getSnr()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            int r0 = r0.getPrn()
            int r0 = getConstellationFromPrn(r0)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            float r0 = r0.getElevation()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
            r4 = this;
            android.location.GpsStatus r0 = r4.mWrapped
            monitor-enter(r0)
            int r1 = r4.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            r2 = -1
            if (r1 != r2) goto L2b
            android.location.GpsStatus r1 = r4.mWrapped     // Catch: java.lang.Throwable -> L2f
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2f
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2f
            android.location.GpsSatellite r2 = (android.location.GpsSatellite) r2     // Catch: java.lang.Throwable -> L2f
            int r3 = r4.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            r4.mCachedSatelliteCount = r3     // Catch: java.lang.Throwable -> L2f
            goto L12
        L25:
            int r1 = r4.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 1
            r4.mCachedSatelliteCount = r1     // Catch: java.lang.Throwable -> L2f
        L2b:
            int r1 = r4.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            int r0 = r0.getPrn()
            int r0 = getSvidFromPrn(r0)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            boolean r0 = r0.hasAlmanac()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            boolean r0 = r0.hasEphemeris()
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.location.GpsStatus r0 = r1.mWrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int r2) {
            r1 = this;
            android.location.GpsSatellite r0 = r1.getSatellite(r2)
            boolean r0 = r0.usedInFix()
            return r0
    }
}
