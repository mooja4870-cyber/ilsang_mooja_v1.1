package androidx.core.os;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Landroidx/core/os/BufferFillPolicy;", "", "value", "", "<init>", "(I)V", "getValue$core_release", "()I", "Companion", "Discard", "RingBuffer", "Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy$RingBuffer;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BufferFillPolicy {
    public static final androidx.core.os.BufferFillPolicy.Companion Companion = null;
    public static final androidx.core.os.BufferFillPolicy DISCARD = null;
    public static final androidx.core.os.BufferFillPolicy RING_BUFFER = null;
    private final int value;

    /* JADX INFO: compiled from: Profiling.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/core/os/BufferFillPolicy$Companion;", "", "<init>", "()V", "DISCARD", "Landroidx/core/os/BufferFillPolicy;", "RING_BUFFER", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Discard extends androidx.core.os.BufferFillPolicy {
        public Discard() {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r1)
                return
        }
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/BufferFillPolicy$RingBuffer;", "Landroidx/core/os/BufferFillPolicy;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RingBuffer extends androidx.core.os.BufferFillPolicy {
        public RingBuffer() {
                r2 = this;
                r0 = 2
                r1 = 0
                r2.<init>(r0, r1)
                return
        }
    }

    static {
            androidx.core.os.BufferFillPolicy$Companion r0 = new androidx.core.os.BufferFillPolicy$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.core.os.BufferFillPolicy.Companion = r0
            androidx.core.os.BufferFillPolicy$Discard r0 = new androidx.core.os.BufferFillPolicy$Discard
            r0.<init>()
            androidx.core.os.BufferFillPolicy r0 = (androidx.core.os.BufferFillPolicy) r0
            androidx.core.os.BufferFillPolicy.DISCARD = r0
            androidx.core.os.BufferFillPolicy$RingBuffer r0 = new androidx.core.os.BufferFillPolicy$RingBuffer
            r0.<init>()
            androidx.core.os.BufferFillPolicy r0 = (androidx.core.os.BufferFillPolicy) r0
            androidx.core.os.BufferFillPolicy.RING_BUFFER = r0
            return
    }

    private BufferFillPolicy(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public /* synthetic */ BufferFillPolicy(int r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final int getValue$core_release() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
