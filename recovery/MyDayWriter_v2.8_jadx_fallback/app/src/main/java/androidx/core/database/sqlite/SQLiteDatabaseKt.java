package androidx.core.database.sqlite;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(android.database.sqlite.SQLiteDatabase r3, boolean r4, kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> r5) {
            r0 = 0
            if (r4 == 0) goto L7
            r3.beginTransaction()
            goto La
        L7:
            r3.beginTransactionNonExclusive()
        La:
            java.lang.Object r1 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L18
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L18
            r3.endTransaction()
            r2 = r1
            return r1
        L18:
            r1 = move-exception
            r3.endTransaction()
            throw r1
    }

    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r2 = 1
        L5:
            r4 = 0
            if (r2 == 0) goto Lc
            r1.beginTransaction()
            goto Lf
        Lc:
            r1.beginTransactionNonExclusive()
        Lf:
            java.lang.Object r5 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L1d
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1d
            r1.endTransaction()
            r0 = r5
            return r5
        L1d:
            r5 = move-exception
            r1.endTransaction()
            throw r5
    }
}
