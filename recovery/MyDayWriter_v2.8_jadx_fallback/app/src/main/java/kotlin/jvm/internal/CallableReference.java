package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class CallableReference implements kotlin.reflect.KCallable, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = null;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient kotlin.reflect.KCallable reflected;
    private final java.lang.String signature;

    private static class NoReceiver implements java.io.Serializable {
        private static final kotlin.jvm.internal.CallableReference.NoReceiver INSTANCE = null;

        static {
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = new kotlin.jvm.internal.CallableReference$NoReceiver
                r0.<init>()
                kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE = r0
                return
        }

        private NoReceiver() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ kotlin.jvm.internal.CallableReference.NoReceiver access$000() {
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r1 = this;
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE
                return r0
        }
    }

    static {
            kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.access$000()
            kotlin.jvm.internal.CallableReference.NO_RECEIVER = r0
            return
    }

    public CallableReference() {
            r1 = this;
            java.lang.Object r0 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1.<init>(r0)
            return
    }

    protected CallableReference(java.lang.Object r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected CallableReference(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.receiver = r1
            r0.owner = r2
            r0.name = r3
            r0.signature = r4
            r0.isTopLevel = r5
            return
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object call(java.lang.Object... r2) {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.lang.Object r0 = r0.call(r2)
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object callBy(java.util.Map r2) {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.lang.Object r0 = r0.callBy(r2)
            return r0
    }

    public kotlin.reflect.KCallable compute() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.reflected
            if (r0 != 0) goto La
            kotlin.reflect.KCallable r0 = r1.computeReflected()
            r1.reflected = r0
        La:
            return r0
    }

    protected abstract kotlin.reflect.KCallable computeReflected();

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    public java.lang.Object getBoundReceiver() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
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

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getParameters()
            return r0
    }

    protected kotlin.reflect.KCallable getReflected() {
            r2 = this;
            kotlin.reflect.KCallable r0 = r2.compute()
            if (r0 == r2) goto L7
            return r0
        L7:
            kotlin.jvm.KotlinReflectionNotSupportedError r1 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r1.<init>()
            throw r1
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KType getReturnType() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            kotlin.reflect.KType r0 = r0.getReturnType()
            return r0
    }

    public java.lang.String getSignature() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getTypeParameters()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KVisibility getVisibility() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            kotlin.reflect.KVisibility r0 = r0.getVisibility()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isAbstract()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isFinal()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }
}
