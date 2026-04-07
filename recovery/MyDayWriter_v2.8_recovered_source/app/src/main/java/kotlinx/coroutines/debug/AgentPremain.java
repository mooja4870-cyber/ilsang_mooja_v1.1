package kotlinx.coroutines.debug;

/* JADX INFO: compiled from: AgentPremain.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "()V", "enableCreationStackTraces", "", "installSignalHandler", "", "premain", "args", "", "instrumentation", "Ljava/lang/instrument/Instrumentation;", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AgentPremain {
    public static final kotlinx.coroutines.debug.AgentPremain INSTANCE = null;
    private static final boolean enableCreationStackTraces = false;

    /* JADX INFO: compiled from: AgentPremain.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DebugProbesTransformer implements java.lang.instrument.ClassFileTransformer {
        public static final kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer INSTANCE = null;

        static {
                kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer r0 = new kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer
                r0.<init>()
                kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer.INSTANCE = r0
                return
        }

        private DebugProbesTransformer() {
                r0 = this;
                r0.<init>()
                return
        }

        public byte[] transform(java.lang.ClassLoader r3, java.lang.String r4, java.lang.Class<?> r5, java.security.ProtectionDomain r6, byte[] r7) {
                r2 = this;
                if (r3 == 0) goto L1c
                java.lang.String r0 = "kotlin/coroutines/jvm/internal/DebugProbesKt"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                if (r0 != 0) goto Lb
                goto L1c
            Lb:
                kotlinx.coroutines.debug.internal.AgentInstallationType r0 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
                r1 = 1
                r0.setInstalledStatically$kotlinx_coroutines_core(r1)
                java.lang.String r0 = "DebugProbesKt.bin"
                java.io.InputStream r0 = r3.getResourceAsStream(r0)
                byte[] r0 = kotlin.io.ByteStreamsKt.readBytes(r0)
                return r0
            L1c:
                r0 = 0
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$qtwhjy3HAlNEjQH7oAL6W8vp2zY(sun.misc.Signal r0) {
            installSignalHandler$lambda$1(r0)
            return
    }

    static {
            kotlinx.coroutines.debug.AgentPremain r0 = new kotlinx.coroutines.debug.AgentPremain
            r0.<init>()
            kotlinx.coroutines.debug.AgentPremain.INSTANCE = r0
            kotlinx.coroutines.debug.AgentPremain r0 = kotlinx.coroutines.debug.AgentPremain.INSTANCE
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L24
            r2 = 0
            java.lang.String r3 = "kotlinx.coroutines.debug.enable.creation.stack.trace"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L1e
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            goto L1f
        L1e:
            r3 = r1
        L1f:
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L24
            goto L2f
        L24:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L2f:
            boolean r2 = kotlin.Result.m159isFailureimpl(r0)
            if (r2 == 0) goto L36
            goto L37
        L36:
            r1 = r0
        L37:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L40
            boolean r0 = r1.booleanValue()
            goto L46
        L40:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r0 = r0.getEnableCreationStackTraces$kotlinx_coroutines_core()
        L46:
            kotlinx.coroutines.debug.AgentPremain.enableCreationStackTraces = r0
            return
    }

    private AgentPremain() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void installSignalHandler() {
            r2 = this;
            sun.misc.Signal r0 = new sun.misc.Signal     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "TRAP"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            kotlinx.coroutines.debug.AgentPremain$$ExternalSyntheticLambda0 r1 = new kotlinx.coroutines.debug.AgentPremain$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            sun.misc.Signal.handle(r0, r1)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r0 = move-exception
        L12:
            return
    }

    private static final void installSignalHandler$lambda$1(sun.misc.Signal r2) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r0 = r0.isInstalled$kotlinx_coroutines_debug()
            if (r0 == 0) goto L10
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            java.io.PrintStream r1 = java.lang.System.out
            r0.dumpCoroutines(r1)
            goto L17
        L10:
            java.lang.String r0 = "Cannot perform coroutines dump, debug probes are disabled"
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L17:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void premain(java.lang.String r2, java.lang.instrument.Instrumentation r3) {
            kotlinx.coroutines.debug.internal.AgentInstallationType r0 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
            r1 = 1
            r0.setInstalledStatically$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.debug.AgentPremain$DebugProbesTransformer r0 = kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer.INSTANCE
            java.lang.instrument.ClassFileTransformer r0 = (java.lang.instrument.ClassFileTransformer) r0
            r3.addTransformer(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            boolean r1 = kotlinx.coroutines.debug.AgentPremain.enableCreationStackTraces
            r0.setEnableCreationStackTraces$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            r0.install$kotlinx_coroutines_core()
            kotlinx.coroutines.debug.AgentPremain r0 = kotlinx.coroutines.debug.AgentPremain.INSTANCE
            r0.installSignalHandler()
            return
    }
}
