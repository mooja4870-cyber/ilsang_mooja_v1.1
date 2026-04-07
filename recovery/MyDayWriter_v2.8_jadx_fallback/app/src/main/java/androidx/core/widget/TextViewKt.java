package androidx.core.widget;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0003\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0004H\u0086\b\u001as\u0010\u000e\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0003\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u0004H\u0086\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00022%\b\u0004\u0010\u0003\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\b\u001a\u0080\u0002\u0010\u0013\u001a\u00020\u0001*\u00020\u00022d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00042d\b\u0006\u0010\u0015\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u00042%\b\u0006\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\b¨\u0006\u0017"}, d2 = {"doBeforeTextChanged", "Landroid/text/TextWatcher;", "Landroid/widget/TextView;", "action", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "text", "", "start", "count", "after", "", "doOnTextChanged", "before", "doAfterTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "addTextChangedListener", "beforeTextChanged", "onTextChanged", "afterTextChanged", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextViewKt {




    public static final android.text.TextWatcher addTextChangedListener(android.widget.TextView r3, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r4, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r5, kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> r6) {
            r0 = 0
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r1 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r1.<init>(r6, r4, r5)
            r2 = r1
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            r3.addTextChangedListener(r2)
            r2 = r1
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            return r2
    }

    public static /* synthetic */ android.text.TextWatcher addTextChangedListener$default(android.widget.TextView r1, kotlin.jvm.functions.Function4 r2, kotlin.jvm.functions.Function4 r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L9
            androidx.core.widget.TextViewKt$addTextChangedListener$1 r6 = androidx.core.widget.TextViewKt.AnonymousClass1.INSTANCE
            r2 = r6
            kotlin.jvm.functions.Function4 r2 = (kotlin.jvm.functions.Function4) r2
        L9:
            r6 = r5 & 2
            if (r6 == 0) goto L12
            androidx.core.widget.TextViewKt$addTextChangedListener$2 r6 = androidx.core.widget.TextViewKt.AnonymousClass2.INSTANCE
            r3 = r6
            kotlin.jvm.functions.Function4 r3 = (kotlin.jvm.functions.Function4) r3
        L12:
            r5 = r5 & 4
            if (r5 == 0) goto L1b
            androidx.core.widget.TextViewKt$addTextChangedListener$3 r5 = androidx.core.widget.TextViewKt.AnonymousClass3.INSTANCE
            r4 = r5
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
        L1b:
            r5 = 0
            androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 r6 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1
            r6.<init>(r4, r2, r3)
            r0 = r6
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r1.addTextChangedListener(r0)
            r0 = r6
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            return r0
    }

    public static final android.text.TextWatcher doAfterTextChanged(android.widget.TextView r5, kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 r3 = new androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.text.TextWatcher r4 = (android.text.TextWatcher) r4
            r1.addTextChangedListener(r4)
            r1 = r3
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            return r1
    }

    public static final android.text.TextWatcher doBeforeTextChanged(android.widget.TextView r5, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 r3 = new androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.text.TextWatcher r4 = (android.text.TextWatcher) r4
            r1.addTextChangedListener(r4)
            r1 = r3
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            return r1
    }

    public static final android.text.TextWatcher doOnTextChanged(android.widget.TextView r5, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 r3 = new androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.text.TextWatcher r4 = (android.text.TextWatcher) r4
            r1.addTextChangedListener(r4)
            r1 = r3
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            return r1
    }
}
