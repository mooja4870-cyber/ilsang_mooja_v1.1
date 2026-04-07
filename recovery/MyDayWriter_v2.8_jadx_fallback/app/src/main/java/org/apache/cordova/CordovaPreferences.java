package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaPreferences {
    private android.os.Bundle preferencesBundleExtras;
    private java.util.HashMap<java.lang.String, java.lang.String> prefs;

    public CordovaPreferences() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 20
            r0.<init>(r1)
            r2.prefs = r0
            return
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getAll() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.prefs
            return r0
    }

    public boolean getBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.prefs
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L15
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            return r1
        L15:
            return r4
    }

    public double getDouble(java.lang.String r4, double r5) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.prefs
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L19
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            double r1 = r1.doubleValue()
            return r1
        L19:
            return r5
    }

    public int getInteger(java.lang.String r4, int r5) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.prefs
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1a
            java.lang.Long r1 = java.lang.Long.decode(r0)
            long r1 = r1.longValue()
            int r1 = (int) r1
            return r1
        L1a:
            return r5
    }

    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.prefs
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            return r3
    }

    public void set(java.lang.String r3, double r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.set(r3, r0)
            return
    }

    public void set(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.set(r3, r0)
            return
    }

    public void set(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.prefs
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r3.toLowerCase(r1)
            r0.put(r1, r4)
            return
    }

    public void set(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.set(r3, r0)
            return
    }

    public void setPreferencesBundle(android.os.Bundle r1) {
            r0 = this;
            r0.preferencesBundleExtras = r1
            return
    }
}
