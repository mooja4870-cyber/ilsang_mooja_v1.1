package kotlin.enums;

import java.lang.Enum;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \f*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\fB\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "E", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "([Ljava/lang/Enum;)V", "c", "Ljava/lang/Class;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EnumEntriesSerializationProxy<E extends java.lang.Enum<E>> implements java.io.Serializable {
    private static final kotlin.enums.EnumEntriesSerializationProxy.Companion Companion = null;
    private static final long serialVersionUID = 0;
    private final java.lang.Class<E> c;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.enums.EnumEntriesSerializationProxy$Companion r0 = new kotlin.enums.EnumEntriesSerializationProxy$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.enums.EnumEntriesSerializationProxy.Companion = r0
            return
    }

    public EnumEntriesSerializationProxy(E[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.c = r0
            return
    }

    private final java.lang.Object readResolve() {
            r2 = this;
            java.lang.Class<E extends java.lang.Enum<E>> r0 = r2.c
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.String r1 = "getEnumConstants(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            return r0
    }
}
