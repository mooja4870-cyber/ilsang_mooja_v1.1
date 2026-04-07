package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements java.lang.Iterable<android.content.Intent> {
    private static final java.lang.String TAG = "TaskStackBuilder";
    private final java.util.ArrayList<android.content.Intent> mIntents;
    private final android.content.Context mSourceContext;

    public interface SupportParentable {
        android.content.Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mIntents = r0
            r1.mSourceContext = r2
            return
    }

    public static androidx.core.app.TaskStackBuilder create(android.content.Context r1) {
            androidx.core.app.TaskStackBuilder r0 = new androidx.core.app.TaskStackBuilder
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.app.TaskStackBuilder from(android.content.Context r1) {
            androidx.core.app.TaskStackBuilder r0 = create(r1)
            return r0
    }

    public androidx.core.app.TaskStackBuilder addNextIntent(android.content.Intent r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            r0.add(r2)
            return r1
    }

    public androidx.core.app.TaskStackBuilder addNextIntentWithParentStack(android.content.Intent r3) {
            r2 = this;
            android.content.ComponentName r0 = r3.getComponent()
            if (r0 != 0) goto L10
            android.content.Context r1 = r2.mSourceContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r0 = r3.resolveActivity(r1)
        L10:
            if (r0 == 0) goto L15
            r2.addParentStack(r0)
        L15:
            r2.addNextIntent(r3)
            return r2
    }

    public androidx.core.app.TaskStackBuilder addParentStack(android.app.Activity r4) {
            r3 = this;
            r0 = 0
            boolean r1 = r4 instanceof androidx.core.app.TaskStackBuilder.SupportParentable
            if (r1 == 0) goto Lc
            r1 = r4
            androidx.core.app.TaskStackBuilder$SupportParentable r1 = (androidx.core.app.TaskStackBuilder.SupportParentable) r1
            android.content.Intent r0 = r1.getSupportParentActivityIntent()
        Lc:
            if (r0 != 0) goto L12
            android.content.Intent r0 = androidx.core.app.NavUtils.getParentActivityIntent(r4)
        L12:
            if (r0 == 0) goto L2a
            android.content.ComponentName r1 = r0.getComponent()
            if (r1 != 0) goto L24
            android.content.Context r2 = r3.mSourceContext
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r2)
        L24:
            r3.addParentStack(r1)
            r3.addNextIntent(r0)
        L2a:
            return r3
    }

    public androidx.core.app.TaskStackBuilder addParentStack(android.content.ComponentName r5) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            int r0 = r0.size()
            android.content.Context r1 = r4.mSourceContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.Intent r1 = androidx.core.app.NavUtils.getParentActivityIntent(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
        Lc:
            if (r1 == 0) goto L1f
            java.util.ArrayList<android.content.Intent> r2 = r4.mIntents     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            r2.add(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.Context r2 = r4.mSourceContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.ComponentName r3 = r1.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.Intent r2 = androidx.core.app.NavUtils.getParentActivityIntent(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            r1 = r2
            goto Lc
        L1f:
            return r4
        L21:
            r1 = move-exception
            java.lang.String r2 = "TaskStackBuilder"
            java.lang.String r3 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public androidx.core.app.TaskStackBuilder addParentStack(java.lang.Class<?> r3) {
            r2 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r2.mSourceContext
            r0.<init>(r1, r3)
            androidx.core.app.TaskStackBuilder r0 = r2.addParentStack(r0)
            return r0
    }

    public android.content.Intent editIntentAt(int r2) {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            java.lang.Object r0 = r0.get(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            return r0
    }

    @java.lang.Deprecated
    public android.content.Intent getIntent(int r2) {
            r1 = this;
            android.content.Intent r0 = r1.editIntentAt(r2)
            return r0
    }

    public int getIntentCount() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            int r0 = r0.size()
            return r0
    }

    public android.content.Intent[] getIntents() {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            int r0 = r0.size()
            android.content.Intent[] r0 = new android.content.Intent[r0]
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return r0
        Lc:
            android.content.Intent r1 = new android.content.Intent
            java.util.ArrayList<android.content.Intent> r2 = r4.mIntents
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.Intent r2 = (android.content.Intent) r2
            r1.<init>(r2)
            r2 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r1 = r1.addFlags(r2)
            r0[r3] = r1
            r1 = 1
        L24:
            int r2 = r0.length
            if (r1 >= r2) goto L39
            android.content.Intent r2 = new android.content.Intent
            java.util.ArrayList<android.content.Intent> r3 = r4.mIntents
            java.lang.Object r3 = r3.get(r1)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L24
        L39:
            return r0
    }

    public android.app.PendingIntent getPendingIntent(int r2, int r3) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r0 = r1.getPendingIntent(r2, r3, r0)
            return r0
    }

    public android.app.PendingIntent getPendingIntent(int r5, int r6, android.os.Bundle r7) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            r1 = 0
            android.content.Intent[] r2 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r2 = new android.content.Intent
            r3 = r0[r1]
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r0[r1] = r2
            android.content.Context r1 = r4.mSourceContext
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivities(r1, r5, r0, r6, r7)
            return r1
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No intents added to TaskStackBuilder; cannot getPendingIntent"
            r0.<init>(r1)
            throw r0
    }

    public android.app.PendingIntent getPendingIntent(int r2, int r3, android.os.Bundle r4, boolean r5) {
            r1 = this;
            int r0 = androidx.core.app.PendingIntentCompat.addMutabilityFlags(r5, r3)
            android.app.PendingIntent r0 = r1.getPendingIntent(r2, r0, r4)
            return r0
    }

    public android.app.PendingIntent getPendingIntent(int r2, int r3, boolean r4) {
            r1 = this;
            int r0 = androidx.core.app.PendingIntentCompat.addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = r1.getPendingIntent(r2, r0)
            return r0
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public java.util.Iterator<android.content.Intent> iterator() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.mIntents
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void startActivities() {
            r1 = this;
            r0 = 0
            r1.startActivities(r0)
            return
    }

    public void startActivities(android.os.Bundle r5) {
            r4 = this;
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.ArrayList<android.content.Intent> r0 = r4.mIntents
            r1 = 0
            android.content.Intent[] r2 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            android.content.Intent r2 = new android.content.Intent
            r3 = r0[r1]
            r2.<init>(r3)
            r3 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r2 = r2.addFlags(r3)
            r0[r1] = r2
            android.content.Context r1 = r4.mSourceContext
            boolean r1 = androidx.core.content.ContextCompat.startActivities(r1, r0, r5)
            if (r1 != 0) goto L3f
            android.content.Intent r1 = new android.content.Intent
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            r1.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r2)
            android.content.Context r2 = r4.mSourceContext
            r2.startActivity(r1)
        L3f:
            return
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No intents added to TaskStackBuilder; cannot startActivities"
            r0.<init>(r1)
            throw r0
    }
}
