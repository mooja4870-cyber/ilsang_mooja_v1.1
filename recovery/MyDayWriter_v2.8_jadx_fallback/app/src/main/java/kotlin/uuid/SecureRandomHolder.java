package kotlin.uuid;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/uuid/SecureRandomHolder;", "", "()V", "instance", "Ljava/security/SecureRandom;", "getInstance", "()Ljava/security/SecureRandom;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SecureRandomHolder {
    public static final kotlin.uuid.SecureRandomHolder INSTANCE = null;
    private static final java.security.SecureRandom instance = null;

    static {
            kotlin.uuid.SecureRandomHolder r0 = new kotlin.uuid.SecureRandomHolder
            r0.<init>()
            kotlin.uuid.SecureRandomHolder.INSTANCE = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            kotlin.uuid.SecureRandomHolder.instance = r0
            return
    }

    private SecureRandomHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.security.SecureRandom getInstance() {
            r1 = this;
            java.security.SecureRandom r0 = kotlin.uuid.SecureRandomHolder.instance
            return r0
    }
}
