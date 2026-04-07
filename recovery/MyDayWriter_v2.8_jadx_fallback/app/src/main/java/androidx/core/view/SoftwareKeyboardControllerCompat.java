package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {
    private final androidx.core.view.SoftwareKeyboardControllerCompat.Impl mImpl;

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void hide() {
                r0 = this;
                return
        }

        void show() {
                r0 = this;
                return
        }
    }

    private static class Impl20 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl {
        private final android.view.View mView;

        Impl20(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        static /* synthetic */ void lambda$show$0(android.view.View r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r3 = this;
                android.view.View r0 = r3.mView
                if (r0 == 0) goto L1c
                android.view.View r0 = r3.mView
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                android.view.View r1 = r3.mView
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
            L1c:
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r3 = this;
                android.view.View r0 = r3.mView
                if (r0 != 0) goto L5
                return
            L5:
                boolean r1 = r0.isInEditMode()
                if (r1 != 0) goto L1b
                boolean r1 = r0.onCheckIsTextEditor()
                if (r1 == 0) goto L12
                goto L1b
            L12:
                android.view.View r1 = r0.getRootView()
                android.view.View r0 = r1.findFocus()
                goto L1e
            L1b:
                r0.requestFocus()
            L1e:
                if (r0 != 0) goto L2d
                android.view.View r1 = r3.mView
                android.view.View r1 = r1.getRootView()
                r2 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r1.findViewById(r2)
            L2d:
                if (r0 == 0) goto L3e
                boolean r1 = r0.hasWindowFocus()
                if (r1 == 0) goto L3e
                r1 = r0
                androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0 r2 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0
                r2.<init>(r1)
                r1.post(r2)
            L3e:
                return
        }
    }

    private static class Impl30 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl20 {
        private android.view.View mView;
        private android.view.WindowInsetsController mWindowInsetsController;

        Impl30(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mView = r1
                return
        }

        Impl30(android.view.WindowInsetsController r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mWindowInsetsController = r2
                return
        }

        static /* synthetic */ void lambda$hide$0(java.util.concurrent.atomic.AtomicBoolean r1, android.view.WindowInsetsController r2, int r3) {
                r0 = r3 & 8
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                r1.set(r0)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r6 = this;
                r0 = 0
                android.view.WindowInsetsController r1 = r6.mWindowInsetsController
                if (r1 == 0) goto L8
                android.view.WindowInsetsController r0 = r6.mWindowInsetsController
                goto L12
            L8:
                android.view.View r1 = r6.mView
                if (r1 == 0) goto L12
                android.view.View r1 = r6.mView
                android.view.WindowInsetsController r0 = r1.getWindowInsetsController()
            L12:
                if (r0 == 0) goto L4e
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0 r3 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0
                r3.<init>(r1)
                r0.addOnControllableInsetsChangedListener(r3)
                boolean r4 = r1.get()
                if (r4 != 0) goto L43
                android.view.View r4 = r6.mView
                if (r4 == 0) goto L43
                android.view.View r4 = r6.mView
                android.content.Context r4 = r4.getContext()
                java.lang.String r5 = "input_method"
                java.lang.Object r4 = r4.getSystemService(r5)
                android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
                android.view.View r5 = r6.mView
                android.os.IBinder r5 = r5.getWindowToken()
                r4.hideSoftInputFromWindow(r5, r2)
            L43:
                r0.removeOnControllableInsetsChangedListener(r3)
                int r2 = android.view.WindowInsets.Type.ime()
                r0.hide(r2)
                goto L51
            L4e:
                super.hide()
            L51:
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r2 = this;
                android.view.View r0 = r2.mView
                if (r0 == 0) goto L1b
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 >= r1) goto L1b
                android.view.View r0 = r2.mView
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r0.isActive()
            L1b:
                r0 = 0
                android.view.WindowInsetsController r1 = r2.mWindowInsetsController
                if (r1 == 0) goto L23
                android.view.WindowInsetsController r0 = r2.mWindowInsetsController
                goto L2d
            L23:
                android.view.View r1 = r2.mView
                if (r1 == 0) goto L2d
                android.view.View r1 = r2.mView
                android.view.WindowInsetsController r0 = r1.getWindowInsetsController()
            L2d:
                if (r0 == 0) goto L36
                int r1 = android.view.WindowInsets.Type.ime()
                r0.show(r1)
            L36:
                super.show()
                return
        }
    }

    public SoftwareKeyboardControllerCompat(android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r3)
            r2.mImpl = r0
            goto L19
        L11:
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl20 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl20
            r0.<init>(r3)
            r2.mImpl = r0
        L19:
            return
    }

    @java.lang.Deprecated
    SoftwareKeyboardControllerCompat(android.view.WindowInsetsController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r2)
            r1.mImpl = r0
            return
    }

    public void hide() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.hide()
            return
    }

    public void show() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.show()
            return
    }
}
