package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.ViewParent, android.view.ViewParent> {
    public static final androidx.core.view.ViewKt$ancestors$1 INSTANCE = null;

    static {
            androidx.core.view.ViewKt$ancestors$1 r0 = new androidx.core.view.ViewKt$ancestors$1
            r0.<init>()
            androidx.core.view.ViewKt$ancestors$1.INSTANCE = r0
            return
    }

    ViewKt$ancestors$1() {
            r6 = this;
            java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
            java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
            r5 = 0
            r1 = 1
            java.lang.String r3 = "getParent"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final android.view.ViewParent invoke2(android.view.ViewParent r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ android.view.ViewParent invoke(android.view.ViewParent r2) {
            r1 = this;
            r0 = r2
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            android.view.ViewParent r0 = r1.invoke2(r0)
            return r0
    }
}
