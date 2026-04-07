package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class AdaptedFunctionReference implements kotlin.jvm.internal.FunctionBase, java.io.Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private final java.lang.String signature;

    public AdaptedFunctionReference(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public AdaptedFunctionReference(int r3, java.lang.Object r4, java.lang.Class r5, java.lang.String r6, java.lang.String r7, int r8) {
            r2 = this;
            r2.<init>()
            r2.receiver = r4
            r2.owner = r5
            r2.name = r6
            r2.signature = r7
            r0 = r8 & 1
            r1 = 1
            if (r0 != r1) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            r2.isTopLevel = r1
            r2.arity = r3
            int r0 = r8 >> 1
            r2.flags = r0
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlin.jvm.internal.AdaptedFunctionReference
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            kotlin.jvm.internal.AdaptedFunctionReference r1 = (kotlin.jvm.internal.AdaptedFunctionReference) r1
            boolean r3 = r5.isTopLevel
            boolean r4 = r1.isTopLevel
            if (r3 != r4) goto L48
            int r3 = r5.arity
            int r4 = r1.arity
            if (r3 != r4) goto L48
            int r3 = r5.flags
            int r4 = r1.flags
            if (r3 != r4) goto L48
            java.lang.Object r3 = r5.receiver
            java.lang.Object r4 = r1.receiver
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L48
            java.lang.Class r3 = r5.owner
            java.lang.Class r4 = r1.owner
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L48
            java.lang.String r3 = r5.name
            java.lang.String r4 = r1.name
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L48
            java.lang.String r3 = r5.signature
            java.lang.String r4 = r1.signature
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L48
            goto L49
        L48:
            r0 = r2
        L49:
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    public kotlin.reflect.KDeclarationContainer getOwner() {
            r1 = this;
            java.lang.Class r0 = r1.owner
            if (r0 != 0) goto L6
            r0 = 0
            goto L17
        L6:
            boolean r0 = r1.isTopLevel
            if (r0 == 0) goto L11
            java.lang.Class r0 = r1.owner
            kotlin.reflect.KDeclarationContainer r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(r0)
            goto L17
        L11:
            java.lang.Class r0 = r1.owner
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
        L17:
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.receiver
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r4.receiver
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            int r2 = r0 * 31
            java.lang.Class r3 = r4.owner
            if (r3 == 0) goto L19
            java.lang.Class r1 = r4.owner
            int r1 = r1.hashCode()
        L19:
            int r2 = r2 + r1
            int r0 = r2 * 31
            java.lang.String r1 = r4.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r1 = r0 * 31
            java.lang.String r2 = r4.signature
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            boolean r2 = r4.isTopLevel
            if (r2 == 0) goto L35
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L37
        L35:
            r2 = 1237(0x4d5, float:1.733E-42)
        L37:
            int r0 = r0 + r2
            int r1 = r0 * 31
            int r2 = r4.arity
            int r1 = r1 + r2
            int r0 = r1 * 31
            int r2 = r4.flags
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = kotlin.jvm.internal.Reflection.renderLambdaToString(r1)
            return r0
    }
}
