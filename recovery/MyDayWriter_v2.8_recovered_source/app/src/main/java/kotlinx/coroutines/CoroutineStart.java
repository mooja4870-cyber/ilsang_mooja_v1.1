package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JY\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u0002H\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0087\u0002¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "R", "T", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CoroutineStart extends java.lang.Enum<kotlinx.coroutines.CoroutineStart> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $VALUES = null;
    public static final kotlinx.coroutines.CoroutineStart ATOMIC = null;
    public static final kotlinx.coroutines.CoroutineStart DEFAULT = null;
    public static final kotlinx.coroutines.CoroutineStart LAZY = null;
    public static final kotlinx.coroutines.CoroutineStart UNDISPATCHED = null;

    /* JADX INFO: compiled from: CoroutineStart.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                goto L33
            L32:
                r1 = move-exception
            L33:
                kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $values() {
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.DEFAULT
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.ATOMIC
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.CoroutineStart[] r0 = new kotlinx.coroutines.CoroutineStart[]{r0, r1, r2, r3}
            return r0
    }

    static {
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.DEFAULT = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "LAZY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.LAZY = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "ATOMIC"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.ATOMIC = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "UNDISPATCHED"
            r2 = 3
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.UNDISPATCHED = r0
            kotlinx.coroutines.CoroutineStart[] r0 = $values()
            kotlinx.coroutines.CoroutineStart.$VALUES = r0
            kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlinx.coroutines.CoroutineStart.$ENTRIES = r0
            return
    }

    CoroutineStart(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.CoroutineStart> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlinx.coroutines.CoroutineStart.$ENTRIES
            return r0
    }

    public static /* synthetic */ void isLazy$annotations() {
            return
    }

    public static kotlinx.coroutines.CoroutineStart valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.CoroutineStart> r0 = kotlinx.coroutines.CoroutineStart.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.CoroutineStart r0 = (kotlinx.coroutines.CoroutineStart) r0
            return r0
    }

    public static kotlinx.coroutines.CoroutineStart[] values() {
            kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.CoroutineStart[] r0 = (kotlinx.coroutines.CoroutineStart[]) r0
            return r0
    }

    public final <R, T> void invoke(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, R r9, kotlin.coroutines.Continuation<? super T> r10) {
            r7 = this;
            int[] r0 = kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0
            int r1 = r7.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L1d;
                case 3: goto L16;
                case 4: goto L12;
                default: goto Lb;
            }
        Lb:
            r1 = r8
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L12:
            r1 = r8
            r2 = r9
            r3 = r10
            goto L2d
        L16:
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUndispatched(r8, r9, r10)
            r1 = r8
            r2 = r9
            r3 = r10
            goto L2d
        L1d:
            kotlin.coroutines.ContinuationKt.startCoroutine(r8, r9, r10)
            r1 = r8
            r2 = r9
            r3 = r10
            goto L2d
        L24:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r1, r2, r3, r4, r5, r6)
        L2d:
            return
    }

    public final boolean isLazy() {
            r1 = this;
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.LAZY
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
