package androidx.collection;

/* JADX INFO: compiled from: CollectionPlatformUtils.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0080\b¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/collection/CollectionPlatformUtils;", "", "()V", "createIndexOutOfBoundsException", "Ljava/lang/IndexOutOfBoundsException;", "Lkotlin/IndexOutOfBoundsException;", "createIndexOutOfBoundsException$collection", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CollectionPlatformUtils {
    public static final androidx.collection.CollectionPlatformUtils INSTANCE = null;

    static {
            androidx.collection.CollectionPlatformUtils r0 = new androidx.collection.CollectionPlatformUtils
            r0.<init>()
            androidx.collection.CollectionPlatformUtils.INSTANCE = r0
            return
    }

    private CollectionPlatformUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.IndexOutOfBoundsException createIndexOutOfBoundsException$collection() {
            r2 = this;
            r0 = 0
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>()
            java.lang.IndexOutOfBoundsException r1 = (java.lang.IndexOutOfBoundsException) r1
            return r1
    }
}
