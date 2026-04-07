package androidx.fragment.app.strictmode;

/* JADX INFO: compiled from: FragmentStrictMode.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003123B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010'\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\"H\u0007J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010+\u001a\u00020,H\u0002J0\u0010-\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u00062\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0/2\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u00064"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "()V", "TAG", "", "defaultPolicy", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "getNearestPolicy", "fragment", "Landroidx/fragment/app/Fragment;", "handlePolicyViolation", "", "policy", "violation", "Landroidx/fragment/app/strictmode/Violation;", "logIfDebuggingEnabled", "onFragmentReuse", "previousFragmentId", "onFragmentTagUsage", "container", "Landroid/view/ViewGroup;", "onGetRetainInstanceUsage", "onGetTargetFragmentRequestCodeUsage", "onGetTargetFragmentUsage", "onPolicyViolation", "onSetRetainInstanceUsage", "onSetTargetFragmentUsage", "violatingFragment", "targetFragment", "requestCode", "", "onSetUserVisibleHint", "isVisibleToUser", "", "onWrongFragmentContainer", "onWrongNestedHierarchy", "expectedParentFragment", "containerId", "runOnHostThread", "runnable", "Ljava/lang/Runnable;", "shouldHandlePolicyViolation", "fragmentClass", "Ljava/lang/Class;", "violationClass", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentStrictMode {
    public static final androidx.fragment.app.strictmode.FragmentStrictMode INSTANCE = null;
    private static final java.lang.String TAG = "FragmentStrictMode";
    private static androidx.fragment.app.strictmode.FragmentStrictMode.Policy defaultPolicy;

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_WRONG_NESTED_HIERARCHY", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Flag extends java.lang.Enum<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> {
        private static final /* synthetic */ androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] $VALUES = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_FRAGMENT_REUSE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_FRAGMENT_TAG_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_RETAIN_INSTANCE_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_SET_USER_VISIBLE_HINT = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_TARGET_FRAGMENT_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_WRONG_FRAGMENT_CONTAINER = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_WRONG_NESTED_HIERARCHY = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag PENALTY_DEATH = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag PENALTY_LOG = null;

        private static final /* synthetic */ androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] $values() {
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r2 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r4 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r5 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r6 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r7 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r8 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = new androidx.fragment.app.strictmode.FragmentStrictMode.Flag[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                return r0
        }

        static {
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "PENALTY_LOG"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "PENALTY_DEATH"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_FRAGMENT_REUSE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_FRAGMENT_TAG_USAGE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_WRONG_NESTED_HIERARCHY"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_RETAIN_INSTANCE_USAGE"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_SET_USER_VISIBLE_HINT"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_TARGET_FRAGMENT_USAGE"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_WRONG_FRAGMENT_CONTAINER"
                r2 = 8
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = $values()
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.$VALUES = r0
                return
        }

        Flag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.fragment.app.strictmode.FragmentStrictMode.Flag valueOf(java.lang.String r1) {
                java.lang.Class<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = (androidx.fragment.app.strictmode.FragmentStrictMode.Flag) r0
                return r0
        }

        public static androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] values() {
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = (androidx.fragment.app.strictmode.FragmentStrictMode.Flag[]) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "onViolation", "", "violation", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnViolationListener {
        void onViolation(androidx.fragment.app.strictmode.Violation r1);
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\b¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00030\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "listener", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "allowedViolations", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", "getFlags$fragment_release", "()Ljava/util/Set;", "getListener$fragment_release", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "getMAllowedViolations$fragment_release", "()Ljava/util/Map;", "Builder", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Policy {
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Companion Companion = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Policy LAX = null;
        private final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags;
        private final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener;
        private final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> mAllowedViolations;

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0007J\b\u0010\u0014\u001a\u00020\u0000H\u0007J\b\u0010\u0015\u001a\u00020\u0000H\u0007J\b\u0010\u0016\u001a\u00020\u0000H\u0007J\b\u0010\u0017\u001a\u00020\u0000H\u0007J\b\u0010\u0018\u001a\u00020\u0000H\u0007J\b\u0010\u0019\u001a\u00020\u0000H\u0007J\b\u0010\u001a\u001a\u00020\u0000H\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u001c\u001a\u00020\u0000H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "()V", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "listener", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowViolation", "fragmentClass", "Landroidx/fragment/app/Fragment;", "violationClass", "build", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "detectFragmentReuse", "detectFragmentTagUsage", "detectRetainInstanceUsage", "detectSetUserVisibleHint", "detectTargetFragmentUsage", "detectWrongFragmentContainer", "detectWrongNestedHierarchy", "penaltyDeath", "penaltyListener", "penaltyLog", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            private final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags;
            private androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener;
            private final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> mAllowedViolations;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                    r0.<init>()
                    java.util.Set r0 = (java.util.Set) r0
                    r1.flags = r0
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    java.util.Map r0 = (java.util.Map) r0
                    r1.mAllowedViolations = r0
                    return
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder allowViolation(java.lang.Class<? extends androidx.fragment.app.Fragment> r3, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> r4) {
                    r2 = this;
                    java.lang.String r0 = "fragmentClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "violationClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = r3.getName()
                    java.lang.String r1 = "fragmentClassString"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    androidx.fragment.app.strictmode.FragmentStrictMode$Policy$Builder r1 = r2.allowViolation(r0, r4)
                    return r1
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder allowViolation(java.lang.String r3, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> r4) {
                    r2 = this;
                    java.lang.String r0 = "fragmentClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "violationClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r0 = r2.mAllowedViolations
                    java.lang.Object r0 = r0.get(r3)
                    java.util.Set r0 = (java.util.Set) r0
                    if (r0 != 0) goto L1c
                    java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                    r1.<init>()
                    r0 = r1
                    java.util.Set r0 = (java.util.Set) r0
                L1c:
                    r0.add(r4)
                    java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r1 = r2.mAllowedViolations
                    r1.put(r3, r0)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy build() {
                    r4 = this;
                    androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r0 = r4.listener
                    if (r0 != 0) goto L11
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r4.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L11
                    r4.penaltyLog()
                L11:
                    androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Policy
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r1 = r4.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r2 = r4.listener
                    java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r3 = r4.mAllowedViolations
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectFragmentReuse() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectFragmentTagUsage() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectRetainInstanceUsage() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectSetUserVisibleHint() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectTargetFragmentUsage() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectWrongFragmentContainer() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectWrongNestedHierarchy() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyDeath() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
                    r0.add(r1)
                    return r2
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyListener(androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener r2) {
                    r1 = this;
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.listener = r2
                    return r1
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyLog() {
                    r2 = this;
                    java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r2.flags
                    androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG
                    r0.add(r1)
                    return r2
            }
        }

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "()V", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        static {
                androidx.fragment.app.strictmode.FragmentStrictMode$Policy$Companion r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Policy$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Companion = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Policy
                java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
                r0.<init>(r2, r1, r3)
                androidx.fragment.app.strictmode.FragmentStrictMode.Policy.LAX = r0
                return
        }

        public Policy(java.util.Set<? extends androidx.fragment.app.strictmode.FragmentStrictMode.Flag> r5, androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener r6, java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r7) {
                r4 = this;
                java.lang.String r0 = "flags"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "allowedViolations"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r4.<init>()
                r4.flags = r5
                r4.listener = r6
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r1 = r7.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L22:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.util.Set r2 = (java.util.Set) r2
                r0.put(r3, r2)
                goto L22
            L3e:
                r4.mAllowedViolations = r0
                return
        }

        public final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> getFlags$fragment_release() {
                r1 = this;
                java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r1.flags
                return r0
        }

        public final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener getListener$fragment_release() {
                r1 = this;
                androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r0 = r1.listener
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> getMAllowedViolations$fragment_release() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r0 = r1.mAllowedViolations
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$PDCNFUghAteLvNvpDrl3sNFUfNE(java.lang.String r0, androidx.fragment.app.strictmode.Violation r1) {
            handlePolicyViolation$lambda$1(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$euel0xqBXq2AV6jcWsq0SrkGBrs(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r0, androidx.fragment.app.strictmode.Violation r1) {
            handlePolicyViolation$lambda$0(r0, r1)
            return
    }

    static {
            androidx.fragment.app.strictmode.FragmentStrictMode r0 = new androidx.fragment.app.strictmode.FragmentStrictMode
            r0.<init>()
            androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE = r0
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Policy.LAX
            androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy = r0
            return
    }

    private FragmentStrictMode() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.fragment.app.strictmode.FragmentStrictMode.Policy getNearestPolicy(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = r4
        L1:
            if (r0 == 0) goto L25
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L20
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "declaringFragment.parentFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getStrictModePolicy()
            if (r2 == 0) goto L20
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getStrictModePolicy()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
        L20:
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            goto L1
        L25:
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy
            return r1
    }

    private final void handlePolicyViolation(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r6, androidx.fragment.app.strictmode.Violation r7) {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r7.getFragment()
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.util.Set r2 = r6.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Policy violation in "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = r7
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r4 = "FragmentStrictMode"
            android.util.Log.d(r4, r2, r3)
        L33:
            androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r2 = r6.getListener$fragment_release()
            if (r2 == 0) goto L41
            androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0 r2 = new androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0
            r2.<init>(r6, r7)
            r5.runOnHostThread(r0, r2)
        L41:
            java.util.Set r2 = r6.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L55
            androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1 r2 = new androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1
            r2.<init>(r1, r7)
            r5.runOnHostThread(r0, r2)
        L55:
            return
    }

    private static final void handlePolicyViolation$lambda$0(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r1, androidx.fragment.app.strictmode.Violation r2) {
            java.lang.String r0 = "$policy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$violation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r0 = r1.getListener$fragment_release()
            r0.onViolation(r2)
            return
    }

    private static final void handlePolicyViolation$lambda$1(java.lang.String r3, androidx.fragment.app.strictmode.Violation r4) {
            java.lang.String r0 = "$violation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Policy violation with PENALTY_DEATH in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = r4
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r2 = "FragmentStrictMode"
            android.util.Log.e(r2, r0, r1)
            throw r4
    }

    private final void logIfDebuggingEnabled(androidx.fragment.app.strictmode.Violation r4) {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L2f
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StrictMode violation in "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0, r1)
        L2f:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onFragmentReuse(androidx.fragment.app.Fragment r5, java.lang.String r6) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "previousFragmentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.strictmode.FragmentReuseViolation r0 = new androidx.fragment.app.strictmode.FragmentReuseViolation
            r0.<init>(r5, r6)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L3d
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L3d
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L3d:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onFragmentTagUsage(androidx.fragment.app.Fragment r5, android.view.ViewGroup r6) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.FragmentTagUsageViolation r0 = new androidx.fragment.app.strictmode.FragmentTagUsageViolation
            r0.<init>(r5, r6)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onGetRetainInstanceUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation r0 = new androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onGetTargetFragmentRequestCodeUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation r0 = new androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onGetTargetFragmentUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation r0 = new androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onSetRetainInstanceUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation r0 = new androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onSetTargetFragmentUsage(androidx.fragment.app.Fragment r5, androidx.fragment.app.Fragment r6, int r7) {
            java.lang.String r0 = "violatingFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "targetFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation r0 = new androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation
            r0.<init>(r5, r6, r7)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L3e
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L3e
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L3e:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onSetUserVisibleHint(androidx.fragment.app.Fragment r5, boolean r6) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.SetUserVisibleHintViolation r0 = new androidx.fragment.app.strictmode.SetUserVisibleHintViolation
            r0.<init>(r5, r6)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L38
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L38:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onWrongFragmentContainer(androidx.fragment.app.Fragment r5, android.view.ViewGroup r6) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.strictmode.WrongFragmentContainerViolation r0 = new androidx.fragment.app.strictmode.WrongFragmentContainerViolation
            r0.<init>(r5, r6)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L3d
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L3d
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L3d:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void onWrongNestedHierarchy(androidx.fragment.app.Fragment r5, androidx.fragment.app.Fragment r6, int r7) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "expectedParentFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.strictmode.WrongNestedHierarchyViolation r0 = new androidx.fragment.app.strictmode.WrongNestedHierarchyViolation
            r0.<init>(r5, r6, r7)
            androidx.fragment.app.strictmode.Violation r0 = (androidx.fragment.app.strictmode.Violation) r0
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r1.getNearestPolicy(r5)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L3e
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r0.getClass()
            boolean r2 = r2.shouldHandlePolicyViolation(r1, r3, r4)
            if (r2 == 0) goto L3e
            androidx.fragment.app.strictmode.FragmentStrictMode r2 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r2.handlePolicyViolation(r1, r0)
        L3e:
            return
    }

    private final void runOnHostThread(androidx.fragment.app.Fragment r4, java.lang.Runnable r5) {
            r3 = this;
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L28
            androidx.fragment.app.FragmentManager r0 = r4.getParentFragmentManager()
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.os.Handler r0 = r0.getHandler()
            android.os.Looper r1 = r0.getLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L24
            r5.run()
            goto L2b
        L24:
            r0.post(r5)
            goto L2b
        L28:
            r5.run()
        L2b:
            return
    }

    private final boolean shouldHandlePolicyViolation(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r6, java.lang.Class<? extends androidx.fragment.app.Fragment> r7, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> r8) {
            r5 = this;
            java.lang.String r0 = r7.getName()
            java.util.Map r1 = r6.getMAllowedViolations$fragment_release()
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = (java.util.Set) r1
            r2 = 1
            if (r1 != 0) goto L12
            return r2
        L12:
            java.lang.Class r3 = r8.getSuperclass()
            java.lang.Class<androidx.fragment.app.strictmode.Violation> r4 = androidx.fragment.app.strictmode.Violation.class
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2d
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Class r4 = r8.getSuperclass()
            boolean r3 = kotlin.collections.CollectionsKt.contains(r3, r4)
            if (r3 == 0) goto L2d
            r2 = 0
            return r2
        L2d:
            boolean r3 = r1.contains(r8)
            r2 = r2 ^ r3
            return r2
    }

    public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy getDefaultPolicy() {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy
            return r0
    }

    public final void onPolicyViolation(androidx.fragment.app.strictmode.Violation r5) {
            r4 = this;
            java.lang.String r0 = "violation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.logIfDebuggingEnabled(r5)
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r4.getNearestPolicy(r0)
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r5.getClass()
            boolean r2 = r4.shouldHandlePolicyViolation(r1, r2, r3)
            if (r2 == 0) goto L21
            r4.handlePolicyViolation(r1, r5)
        L21:
            return
    }

    public final void setDefaultPolicy(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy = r2
            return
    }
}
