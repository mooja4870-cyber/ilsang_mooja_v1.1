package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u000b\u001a\u00020\f*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0011\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DefaultLightScrim", "", "getDefaultLightScrim$annotations", "()V", "getDefaultLightScrim", "()I", "DefaultDarkScrim", "getDefaultDarkScrim$annotations", "getDefaultDarkScrim", "Impl", "Landroidx/activity/EdgeToEdgeImpl;", "enableEdgeToEdge", "", "Landroidx/activity/ComponentActivity;", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "enable", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EdgeToEdge {
    private static final int DefaultDarkScrim = 0;
    private static final int DefaultLightScrim = 0;
    private static androidx.activity.EdgeToEdgeImpl Impl;

    static {
            r0 = 230(0xe6, float:3.22E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            androidx.activity.EdgeToEdge.DefaultLightScrim = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = 27
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            androidx.activity.EdgeToEdge.DefaultDarkScrim = r0
            return
    }

    public static final void enable(androidx.activity.ComponentActivity r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1 = 3
            enable$default(r2, r0, r0, r1, r0)
            return
    }

    public static final void enable(androidx.activity.ComponentActivity r2, androidx.activity.SystemBarStyle r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 2
            enable$default(r2, r3, r0, r1, r0)
            return
    }

    public static final void enable(androidx.activity.ComponentActivity r9, androidx.activity.SystemBarStyle r10, androidx.activity.SystemBarStyle r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.view.Window r0 = r9.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r6 = r0
            kotlin.jvm.functions.Function1 r0 = r10.getDetectDarkMode$activity_release()
            android.content.res.Resources r1 = r6.getResources()
            java.lang.String r2 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            kotlin.jvm.functions.Function1 r0 = r11.getDetectDarkMode$activity_release()
            android.content.res.Resources r1 = r6.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            androidx.activity.EdgeToEdgeImpl r0 = androidx.activity.EdgeToEdge.Impl
            if (r0 != 0) goto L91
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L5b
            androidx.activity.EdgeToEdgeApi30 r0 = new androidx.activity.EdgeToEdgeApi30
            r0.<init>()
            androidx.activity.EdgeToEdgeBase r0 = (androidx.activity.EdgeToEdgeBase) r0
            goto L8d
        L5b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L69
            androidx.activity.EdgeToEdgeApi29 r0 = new androidx.activity.EdgeToEdgeApi29
            r0.<init>()
            androidx.activity.EdgeToEdgeBase r0 = (androidx.activity.EdgeToEdgeBase) r0
            goto L8d
        L69:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L77
            androidx.activity.EdgeToEdgeApi28 r0 = new androidx.activity.EdgeToEdgeApi28
            r0.<init>()
            androidx.activity.EdgeToEdgeBase r0 = (androidx.activity.EdgeToEdgeBase) r0
            goto L8d
        L77:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L85
            androidx.activity.EdgeToEdgeApi26 r0 = new androidx.activity.EdgeToEdgeApi26
            r0.<init>()
            androidx.activity.EdgeToEdgeBase r0 = (androidx.activity.EdgeToEdgeBase) r0
            goto L8d
        L85:
            androidx.activity.EdgeToEdgeApi23 r0 = new androidx.activity.EdgeToEdgeApi23
            r0.<init>()
            androidx.activity.EdgeToEdgeBase r0 = (androidx.activity.EdgeToEdgeBase) r0
        L8d:
            androidx.activity.EdgeToEdgeImpl r0 = (androidx.activity.EdgeToEdgeImpl) r0
            r2 = r0
            goto L92
        L91:
            r2 = r0
        L92:
            android.view.Window r5 = r9.getWindow()
            java.lang.String r0 = "getWindow(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r3 = r10
            r4 = r11
            r2.setUp(r3, r4, r5, r6, r7, r8)
            android.view.Window r10 = r9.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r2.adjustLayoutInDisplayCutoutMode(r10)
            return
    }

    public static /* synthetic */ void enable$default(androidx.activity.ComponentActivity r6, androidx.activity.SystemBarStyle r7, androidx.activity.SystemBarStyle r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto Lf
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            r4 = 4
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            androidx.activity.SystemBarStyle r7 = androidx.activity.SystemBarStyle.Companion.auto$default(r0, r1, r2, r3, r4, r5)
        Lf:
            r9 = r9 & 2
            if (r9 == 0) goto L20
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            int r1 = androidx.activity.EdgeToEdge.DefaultLightScrim
            int r2 = androidx.activity.EdgeToEdge.DefaultDarkScrim
            r4 = 4
            r5 = 0
            r3 = 0
            androidx.activity.SystemBarStyle r8 = androidx.activity.SystemBarStyle.Companion.auto$default(r0, r1, r2, r3, r4, r5)
        L20:
            enable(r6, r7, r8)
            return
    }

    public static final int getDefaultDarkScrim() {
            int r0 = androidx.activity.EdgeToEdge.DefaultDarkScrim
            return r0
    }

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
            return
    }

    public static final int getDefaultLightScrim() {
            int r0 = androidx.activity.EdgeToEdge.DefaultLightScrim
            return r0
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
            return
    }
}
