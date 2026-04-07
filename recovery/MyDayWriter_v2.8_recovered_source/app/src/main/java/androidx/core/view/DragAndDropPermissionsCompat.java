package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private final android.view.DragAndDropPermissions mDragAndDropPermissions;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void release(android.view.DragAndDropPermissions r0) {
                r0.release()
                return
        }

        static android.view.DragAndDropPermissions requestDragAndDropPermissions(android.app.Activity r1, android.view.DragEvent r2) {
                android.view.DragAndDropPermissions r0 = r1.requestDragAndDropPermissions(r2)
                return r0
        }
    }

    private DragAndDropPermissionsCompat(android.view.DragAndDropPermissions r1) {
            r0 = this;
            r0.<init>()
            r0.mDragAndDropPermissions = r1
            return
    }

    public static androidx.core.view.DragAndDropPermissionsCompat request(android.app.Activity r2, android.view.DragEvent r3) {
            android.view.DragAndDropPermissions r0 = androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.requestDragAndDropPermissions(r2, r3)
            if (r0 == 0) goto Le
            androidx.core.view.DragAndDropPermissionsCompat r1 = new androidx.core.view.DragAndDropPermissionsCompat
            r1.<init>(r0)
            return r1
        Le:
            r0 = 0
            return r0
    }

    public void release() {
            r1 = this;
            android.view.DragAndDropPermissions r0 = r1.mDragAndDropPermissions
            androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.release(r0)
            return
    }
}
