package androidx.core.location;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LocationManagerCompat$$ExternalSyntheticLambda2 implements java.util.concurrent.Callable {
    public final /* synthetic */ android.location.LocationManager f$0;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.GpsStatusTransport f$1;

    public /* synthetic */ LocationManagerCompat$$ExternalSyntheticLambda2(android.location.LocationManager r1, androidx.core.location.LocationManagerCompat.GpsStatusTransport r2) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            r0.f$1 = r2
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r2 = this;
            android.location.LocationManager r0 = r2.f$0
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r1 = r2.f$1
            java.lang.Boolean r0 = androidx.core.location.LocationManagerCompat.lambda$registerGnssStatusCallback$1(r0, r1)
            return r0
    }
}
