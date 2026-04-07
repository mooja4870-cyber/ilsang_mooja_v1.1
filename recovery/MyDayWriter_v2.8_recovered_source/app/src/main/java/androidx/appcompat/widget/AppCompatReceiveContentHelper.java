package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    private static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean onDropForTextView(android.view.DragEvent r4, android.widget.TextView r5, android.app.Activity r6) {
                r6.requestDragAndDropPermissions(r4)
                float r0 = r4.getX()
                float r1 = r4.getY()
                int r0 = r5.getOffsetForPosition(r0, r1)
                r5.beginBatchEdit()
                java.lang.CharSequence r1 = r5.getText()     // Catch: java.lang.Throwable -> L33
                android.text.Spannable r1 = (android.text.Spannable) r1     // Catch: java.lang.Throwable -> L33
                android.text.Selection.setSelection(r1, r0)     // Catch: java.lang.Throwable -> L33
                androidx.core.view.ContentInfoCompat$Builder r1 = new androidx.core.view.ContentInfoCompat$Builder     // Catch: java.lang.Throwable -> L33
                android.content.ClipData r2 = r4.getClipData()     // Catch: java.lang.Throwable -> L33
                r3 = 3
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L33
                androidx.core.view.ContentInfoCompat r1 = r1.build()     // Catch: java.lang.Throwable -> L33
                androidx.core.view.ViewCompat.performReceiveContent(r5, r1)     // Catch: java.lang.Throwable -> L33
                r5.endBatchEdit()
                r1 = 1
                return r1
            L33:
                r1 = move-exception
                r5.endBatchEdit()
                throw r1
        }

        static boolean onDropForView(android.view.DragEvent r3, android.view.View r4, android.app.Activity r5) {
                r5.requestDragAndDropPermissions(r3)
                androidx.core.view.ContentInfoCompat$Builder r0 = new androidx.core.view.ContentInfoCompat$Builder
                android.content.ClipData r1 = r3.getClipData()
                r2 = 3
                r0.<init>(r1, r2)
                androidx.core.view.ContentInfoCompat r0 = r0.build()
                androidx.core.view.ViewCompat.performReceiveContent(r4, r0)
                r1 = 1
                return r1
        }
    }

    private AppCompatReceiveContentHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(android.view.View r4, android.view.DragEvent r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L57
            java.lang.Object r0 = r5.getLocalState()
            if (r0 != 0) goto L57
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r4)
            if (r0 != 0) goto L14
            goto L57
        L14:
            android.app.Activity r0 = tryGetActivity(r4)
            if (r0 != 0) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Can't handle drop: no activity: view="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ReceiveContent"
            android.util.Log.i(r3, r1)
            return r2
        L33:
            int r1 = r5.getAction()
            r3 = 1
            if (r1 != r3) goto L3e
            boolean r1 = r4 instanceof android.widget.TextView
            r1 = r1 ^ r3
            return r1
        L3e:
            int r1 = r5.getAction()
            r3 = 3
            if (r1 != r3) goto L56
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L51
            r1 = r4
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r1 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForTextView(r5, r1, r0)
            goto L55
        L51:
            boolean r1 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForView(r5, r4, r0)
        L55:
            return r1
        L56:
            return r2
        L57:
            return r2
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(android.widget.TextView r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L4a
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r6)
            if (r0 == 0) goto L4a
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            if (r7 == r0) goto L18
            r1 = 16908337(0x1020031, float:2.3877366E-38)
            if (r7 == r1) goto L18
            goto L4a
        L18:
            android.content.Context r1 = r6.getContext()
            java.lang.String r3 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 != 0) goto L28
            r3 = 0
            goto L2c
        L28:
            android.content.ClipData r3 = r1.getPrimaryClip()
        L2c:
            r4 = 1
            if (r3 == 0) goto L49
            int r5 = r3.getItemCount()
            if (r5 <= 0) goto L49
            androidx.core.view.ContentInfoCompat$Builder r5 = new androidx.core.view.ContentInfoCompat$Builder
            r5.<init>(r3, r4)
            if (r7 != r0) goto L3d
            goto L3e
        L3d:
            r2 = r4
        L3e:
            androidx.core.view.ContentInfoCompat$Builder r0 = r5.setFlags(r2)
            androidx.core.view.ContentInfoCompat r0 = r0.build()
            androidx.core.view.ViewCompat.performReceiveContent(r6, r0)
        L49:
            return r4
        L4a:
            return r2
    }

    static android.app.Activity tryGetActivity(android.view.View r2) {
            android.content.Context r0 = r2.getContext()
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L18
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L10
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L10:
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r0 = r1.getBaseContext()
            goto L4
        L18:
            r1 = 0
            return r1
    }
}
