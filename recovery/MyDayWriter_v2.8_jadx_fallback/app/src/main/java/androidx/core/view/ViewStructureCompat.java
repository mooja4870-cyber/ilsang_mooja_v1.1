package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class ViewStructureCompat {
    private final java.lang.Object mWrappedObj;

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setClassName(android.view.ViewStructure r0, java.lang.String r1) {
                r0.setClassName(r1)
                return
        }

        static void setContentDescription(android.view.ViewStructure r0, java.lang.CharSequence r1) {
                r0.setContentDescription(r1)
                return
        }

        static void setDimens(android.view.ViewStructure r0, int r1, int r2, int r3, int r4, int r5, int r6) {
                r0.setDimens(r1, r2, r3, r4, r5, r6)
                return
        }

        static void setText(android.view.ViewStructure r0, java.lang.CharSequence r1) {
                r0.setText(r1)
                return
        }
    }

    private ViewStructureCompat(android.view.ViewStructure r1) {
            r0 = this;
            r0.<init>()
            r0.mWrappedObj = r1
            return
    }

    public static androidx.core.view.ViewStructureCompat toViewStructureCompat(android.view.ViewStructure r1) {
            androidx.core.view.ViewStructureCompat r0 = new androidx.core.view.ViewStructureCompat
            r0.<init>(r1)
            return r0
    }

    public void setClassName(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            androidx.core.view.ViewStructureCompat.Api23Impl.setClassName(r0, r2)
            return
    }

    public void setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            androidx.core.view.ViewStructureCompat.Api23Impl.setContentDescription(r0, r2)
            return
    }

    public void setDimens(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            java.lang.Object r0 = r8.mWrappedObj
            r1 = r0
            android.view.ViewStructure r1 = (android.view.ViewStructure) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            androidx.core.view.ViewStructureCompat.Api23Impl.setDimens(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            androidx.core.view.ViewStructureCompat.Api23Impl.setText(r0, r2)
            return
    }

    public android.view.ViewStructure toViewStructure() {
            r1 = this;
            java.lang.Object r0 = r1.mWrappedObj
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            return r0
    }
}
