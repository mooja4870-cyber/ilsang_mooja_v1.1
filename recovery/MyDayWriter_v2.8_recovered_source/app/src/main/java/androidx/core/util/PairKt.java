package androidx.core.util;

/* JADX INFO: compiled from: Pair.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001a*\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001a1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0087\n¢\u0006\u0002\u0010\n\u001a*\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0087\n¢\u0006\u0002\u0010\n\u001a1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001a1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b¨\u0006\f"}, d2 = {"component1", "F", "S", "Landroidx/core/util/Pair;", "(Landroidx/core/util/Pair;)Ljava/lang/Object;", "component2", "toKotlinPair", "Lkotlin/Pair;", "toAndroidXPair", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "toAndroidPair", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PairKt {
    public static final <F, S> F component1(android.util.Pair<F, S> r2) {
            r0 = 0
            java.lang.Object r1 = r2.first
            return r1
    }

    public static final <F, S> F component1(androidx.core.util.Pair<F, S> r2) {
            r0 = 0
            F r1 = r2.first
            return r1
    }

    public static final <F, S> S component2(android.util.Pair<F, S> r2) {
            r0 = 0
            java.lang.Object r1 = r2.second
            return r1
    }

    public static final <F, S> S component2(androidx.core.util.Pair<F, S> r2) {
            r0 = 0
            S r1 = r2.second
            return r1
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(kotlin.Pair<? extends F, ? extends S> r4) {
            r0 = 0
            android.util.Pair r1 = new android.util.Pair
            java.lang.Object r2 = r4.getFirst()
            java.lang.Object r3 = r4.getSecond()
            r1.<init>(r2, r3)
            return r1
    }

    public static final <F, S> androidx.core.util.Pair<F, S> toAndroidXPair(kotlin.Pair<? extends F, ? extends S> r4) {
            r0 = 0
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            java.lang.Object r2 = r4.getFirst()
            java.lang.Object r3 = r4.getSecond()
            r1.<init>(r2, r3)
            return r1
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(android.util.Pair<F, S> r4) {
            r0 = 0
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Object r2 = r4.first
            java.lang.Object r3 = r4.second
            r1.<init>(r2, r3)
            return r1
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(androidx.core.util.Pair<F, S> r4) {
            r0 = 0
            kotlin.Pair r1 = new kotlin.Pair
            F r2 = r4.first
            S r3 = r4.second
            r1.<init>(r2, r3)
            return r1
    }
}
