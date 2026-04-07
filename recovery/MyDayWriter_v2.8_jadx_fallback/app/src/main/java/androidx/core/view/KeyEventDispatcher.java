package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class KeyEventDispatcher {
    private static boolean sActionBarFieldsFetched;
    private static java.lang.reflect.Method sActionBarOnMenuKeyMethod;
    private static boolean sDialogFieldsFetched;
    private static java.lang.reflect.Field sDialogKeyListenerField;

    public interface Component {
        boolean superDispatchKeyEvent(android.view.KeyEvent r1);
    }

    static {
            r0 = 0
            androidx.core.view.KeyEventDispatcher.sActionBarFieldsFetched = r0
            r1 = 0
            androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod = r1
            androidx.core.view.KeyEventDispatcher.sDialogFieldsFetched = r0
            androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField = r1
            return
    }

    private KeyEventDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean actionBarOnMenuKeyEventPre28(android.app.ActionBar r6, android.view.KeyEvent r7) {
            boolean r0 = androidx.core.view.KeyEventDispatcher.sActionBarFieldsFetched
            r1 = 0
            if (r0 != 0) goto L1d
        L6:
            r0 = 1
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.String r3 = "onMenuKeyEvent"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod = r2     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L1b
        L1a:
            r2 = move-exception
        L1b:
            androidx.core.view.KeyEventDispatcher.sActionBarFieldsFetched = r0
        L1d:
            java.lang.reflect.Method r0 = androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod
            if (r0 == 0) goto L3a
            java.lang.reflect.Method r0 = androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L38
            java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L38
            java.lang.Object r0 = r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L38
            if (r0 != 0) goto L2e
            return r1
        L2e:
            r2 = r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L38
            boolean r1 = r2.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L38
            return r1
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
        L3a:
            return r1
    }

    private static boolean activitySuperDispatchKeyEventPre28(android.app.Activity r5, android.view.KeyEvent r6) {
            r5.onUserInteraction()
            android.view.Window r0 = r5.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L25
            android.app.ActionBar r1 = r5.getActionBar()
            int r3 = r6.getKeyCode()
            r4 = 82
            if (r3 != r4) goto L25
            if (r1 == 0) goto L25
            boolean r4 = actionBarOnMenuKeyEventPre28(r1, r6)
            if (r4 == 0) goto L25
            return r2
        L25:
            boolean r1 = r0.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L2c
            return r2
        L2c:
            android.view.View r1 = r0.getDecorView()
            boolean r3 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r1, r6)
            if (r3 == 0) goto L37
            return r2
        L37:
            if (r1 == 0) goto L3e
            android.view.KeyEvent$DispatcherState r2 = r1.getKeyDispatcherState()
            goto L3f
        L3e:
            r2 = 0
        L3f:
            boolean r2 = r6.dispatch(r5, r2, r5)
            return r2
    }

    private static boolean dialogSuperDispatchKeyEventPre28(android.app.Dialog r5, android.view.KeyEvent r6) {
            android.content.DialogInterface$OnKeyListener r0 = getDialogKeyListenerPre28(r5)
            r1 = 1
            if (r0 == 0) goto L12
            int r2 = r6.getKeyCode()
            boolean r2 = r0.onKey(r5, r2, r6)
            if (r2 == 0) goto L12
            return r1
        L12:
            android.view.Window r2 = r5.getWindow()
            boolean r3 = r2.superDispatchKeyEvent(r6)
            if (r3 == 0) goto L1d
            return r1
        L1d:
            android.view.View r3 = r2.getDecorView()
            boolean r4 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r3, r6)
            if (r4 == 0) goto L28
            return r1
        L28:
            if (r3 == 0) goto L2f
            android.view.KeyEvent$DispatcherState r1 = r3.getKeyDispatcherState()
            goto L30
        L2f:
            r1 = 0
        L30:
            boolean r1 = r6.dispatch(r5, r1, r5)
            return r1
    }

    public static boolean dispatchBeforeHierarchy(android.view.View r1, android.view.KeyEvent r2) {
            boolean r0 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(r1, r2)
            return r0
    }

    public static boolean dispatchKeyEvent(androidx.core.view.KeyEventDispatcher.Component r3, android.view.View r4, android.view.Window.Callback r5, android.view.KeyEvent r6) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r0 = r3.superDispatchKeyEvent(r6)
            return r0
        Lf:
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L1b
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = activitySuperDispatchKeyEventPre28(r0, r6)
            return r0
        L1b:
            boolean r1 = r5 instanceof android.app.Dialog
            if (r1 == 0) goto L27
            r0 = r5
            android.app.Dialog r0 = (android.app.Dialog) r0
            boolean r0 = dialogSuperDispatchKeyEventPre28(r0, r6)
            return r0
        L27:
            if (r4 == 0) goto L2f
            boolean r1 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r4, r6)
            if (r1 != 0) goto L35
        L2f:
            boolean r1 = r3.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L36
        L35:
            r0 = 1
        L36:
            return r0
    }

    private static android.content.DialogInterface.OnKeyListener getDialogKeyListenerPre28(android.app.Dialog r3) {
            boolean r0 = androidx.core.view.KeyEventDispatcher.sDialogFieldsFetched
            if (r0 != 0) goto L18
            r0 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mOnKeyListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField = r1     // Catch: java.lang.NoSuchFieldException -> L15
            java.lang.reflect.Field r1 = androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField     // Catch: java.lang.NoSuchFieldException -> L15
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L16
        L15:
            r1 = move-exception
        L16:
            androidx.core.view.KeyEventDispatcher.sDialogFieldsFetched = r0
        L18:
            java.lang.reflect.Field r0 = androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField
            if (r0 == 0) goto L26
            java.lang.reflect.Field r0 = androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField     // Catch: java.lang.IllegalAccessException -> L25
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L25
            android.content.DialogInterface$OnKeyListener r0 = (android.content.DialogInterface.OnKeyListener) r0     // Catch: java.lang.IllegalAccessException -> L25
            return r0
        L25:
            r0 = move-exception
        L26:
            r0 = 0
            return r0
    }
}
