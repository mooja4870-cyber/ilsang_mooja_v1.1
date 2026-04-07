package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends android.widget.SpinnerAdapter {

    public static final class Helper {
        private final android.content.Context mContext;
        private android.view.LayoutInflater mDropDownInflater;
        private final android.view.LayoutInflater mInflater;

        public Helper(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r1.mContext = r2
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
                r1.mInflater = r0
                return
        }

        public android.view.LayoutInflater getDropDownViewInflater() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                if (r0 == 0) goto L7
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                goto L9
            L7:
                android.view.LayoutInflater r0 = r1.mInflater
            L9:
                return r0
        }

        public android.content.res.Resources.Theme getDropDownViewTheme() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                if (r0 != 0) goto L6
                r0 = 0
                goto L10
            L6:
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources$Theme r0 = r0.getTheme()
            L10:
                return r0
        }

        public void setDropDownViewTheme(android.content.res.Resources.Theme r3) {
                r2 = this;
                if (r3 != 0) goto L6
                r0 = 0
                r2.mDropDownInflater = r0
                goto L24
            L6:
                android.content.Context r0 = r2.mContext
                android.content.res.Resources$Theme r0 = r0.getTheme()
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L17
                android.view.LayoutInflater r0 = r2.mInflater
                r2.mDropDownInflater = r0
                goto L24
            L17:
                androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
                android.content.Context r1 = r2.mContext
                r0.<init>(r1, r3)
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
                r2.mDropDownInflater = r1
            L24:
                return
        }
    }

    android.content.res.Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(android.content.res.Resources.Theme r1);
}
