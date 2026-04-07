package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public interface LocationListenerCompat extends android.location.LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int r1) {
            r0 = this;
            return
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(java.util.List<android.location.Location> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            android.location.Location r2 = (android.location.Location) r2
            r3.onLocationChanged(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            return
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
            r0 = this;
            return
    }
}
