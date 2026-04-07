package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r3, android.content.ContentValues r4) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L14
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.getInstance(r0)
            r2.discoverAndInitialize()
            goto L19
        L14:
            java.lang.String r2 = "Deferring initialization because `applicationContext` is null."
            androidx.startup.StartupLogger.w(r2)
        L19:
            r1 = 1
            return r1
        L1c:
            androidx.startup.StartupException r1 = new androidx.startup.StartupException
            java.lang.String r2 = "Context cannot be null"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r3, android.content.ContentValues r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not allowed."
            r0.<init>(r1)
            throw r0
    }
}
