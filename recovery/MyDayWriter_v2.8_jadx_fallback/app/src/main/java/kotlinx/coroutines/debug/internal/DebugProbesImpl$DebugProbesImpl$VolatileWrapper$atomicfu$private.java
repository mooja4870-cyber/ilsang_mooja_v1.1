package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater installations$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater sequenceNumber$volatile$FU = null;
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
            java.lang.String r0 = "installations$volatile"
            java.lang.Class<kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU = r0
            java.lang.String r0 = "sequenceNumber$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.sequenceNumber$volatile$FU = r0
            return
    }

    private DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$getInstallations$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getInstallations$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getSequenceNumber$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSequenceNumber$volatile$FU()
            return r0
    }

    private final /* synthetic */ int getInstallations$volatile() {
            r1 = this;
            int r0 = r1.installations$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getInstallations$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU
            return r0
    }

    private final /* synthetic */ long getSequenceNumber$volatile() {
            r2 = this;
            long r0 = r2.sequenceNumber$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getSequenceNumber$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.sequenceNumber$volatile$FU
            return r0
    }

    private final /* synthetic */ void setInstallations$volatile(int r1) {
            r0 = this;
            r0.installations$volatile = r1
            return
    }

    private final /* synthetic */ void setSequenceNumber$volatile(long r1) {
            r0 = this;
            r0.sequenceNumber$volatile = r1
            return
    }
}
