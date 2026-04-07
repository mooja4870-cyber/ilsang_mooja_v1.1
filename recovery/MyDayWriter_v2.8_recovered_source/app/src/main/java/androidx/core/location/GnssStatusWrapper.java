package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
class GnssStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private final android.location.GnssStatus mWrapped;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getCarrierFrequencyHz(android.location.GnssStatus r1, int r2) {
                float r0 = r1.getCarrierFrequencyHz(r2)
                return r0
        }

        static boolean hasCarrierFrequencyHz(android.location.GnssStatus r1, int r2) {
                boolean r0 = r1.hasCarrierFrequencyHz(r2)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getBasebandCn0DbHz(android.location.GnssStatus r1, int r2) {
                float r0 = r1.getBasebandCn0DbHz(r2)
                return r0
        }

        static boolean hasBasebandCn0DbHz(android.location.GnssStatus r1, int r2) {
                boolean r0 = r1.hasBasebandCn0DbHz(r2)
                return r0
        }
    }

    GnssStatusWrapper(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = r2
            android.location.GnssStatus r0 = (android.location.GnssStatus) r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.location.GnssStatus r0 = (android.location.GnssStatus) r0
            r1.mWrapped = r0
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof androidx.core.location.GnssStatusWrapper
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r4
            androidx.core.location.GnssStatusWrapper r0 = (androidx.core.location.GnssStatusWrapper) r0
            android.location.GnssStatus r1 = r3.mWrapped
            android.location.GnssStatus r2 = r0.mWrapped
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r0 = r0.getAzimuthDegrees(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            float r0 = androidx.core.location.GnssStatusWrapper.Api30Impl.getBasebandCn0DbHz(r0, r3)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            float r0 = androidx.core.location.GnssStatusWrapper.Api26Impl.getCarrierFrequencyHz(r0, r3)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r0 = r0.getCn0DbHz(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.getConstellationType(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            float r0 = r0.getElevationDegrees(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.getSatelliteCount()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.getSvid(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r0 = r0.hasAlmanacData(r2)
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            boolean r0 = androidx.core.location.GnssStatusWrapper.Api30Impl.hasBasebandCn0DbHz(r0, r3)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.location.GnssStatus r0 = r2.mWrapped
            boolean r0 = androidx.core.location.GnssStatusWrapper.Api26Impl.hasCarrierFrequencyHz(r0, r3)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r0 = r0.hasEphemerisData(r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int r2) {
            r1 = this;
            android.location.GnssStatus r0 = r1.mWrapped
            boolean r0 = r0.usedInFix(r2)
            return r0
    }
}
