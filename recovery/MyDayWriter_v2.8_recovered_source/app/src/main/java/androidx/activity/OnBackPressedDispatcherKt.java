package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"addCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedDispatcher;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "enabled", "", "onBackPressed", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OnBackPressedDispatcherKt {
    public static final androidx.activity.OnBackPressedCallback addCallback(androidx.activity.OnBackPressedDispatcher r2, androidx.lifecycle.LifecycleOwner r3, boolean r4, kotlin.jvm.functions.Function1<? super androidx.activity.OnBackPressedCallback, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1 r0 = new androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            r0.<init>(r4, r5)
            if (r3 == 0) goto L19
            r1 = r0
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r2.addCallback(r3, r1)
            goto L1f
        L19:
            r1 = r0
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r2.addCallback(r1)
        L1f:
            r1 = r0
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            return r1
    }

    public static /* synthetic */ androidx.activity.OnBackPressedCallback addCallback$default(androidx.activity.OnBackPressedDispatcher r0, androidx.lifecycle.LifecycleOwner r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 1
        La:
            androidx.activity.OnBackPressedCallback r0 = addCallback(r0, r1, r2, r3)
            return r0
    }
}
