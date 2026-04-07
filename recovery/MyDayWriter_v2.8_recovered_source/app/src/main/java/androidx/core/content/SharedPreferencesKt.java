package androidx.core.content;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\b¨\u0006\t"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SharedPreferencesKt {
    public static final void edit(android.content.SharedPreferences r2, boolean r3, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> r4) {
            r0 = 0
            android.content.SharedPreferences$Editor r1 = r2.edit()
            r4.invoke(r1)
            if (r3 == 0) goto Le
            r1.commit()
            goto L11
        Le:
            r1.apply()
        L11:
            return
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            r3 = 0
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r2.invoke(r4)
            if (r1 == 0) goto L13
            r4.commit()
            goto L16
        L13:
            r4.apply()
        L16:
            return
    }
}
