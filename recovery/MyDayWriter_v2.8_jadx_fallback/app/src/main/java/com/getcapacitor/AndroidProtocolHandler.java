package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidProtocolHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private android.content.Context context;

    static {
            return
    }

    public AndroidProtocolHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private static int getFieldId(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException, java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.ClassLoader r0 = r3.getClassLoader()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPackageName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".R$"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Class r0 = r0.loadClass(r1)
            java.lang.reflect.Field r1 = r0.getField(r5)
            r2 = 0
            int r2 = r1.getInt(r2)
            return r2
    }

    private static int getValueType(android.content.Context r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources r1 = r3.getResources()
            r2 = 1
            r1.getValue(r4, r0, r2)
            int r1 = r0.type
            return r1
    }

    public java.io.InputStream openAsset(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.res.AssetManager r0 = r0.getAssets()
            r1 = 2
            java.io.InputStream r0 = r0.open(r3, r1)
            return r0
    }

    public java.io.InputStream openContentUrl(android.net.Uri r8) throws java.io.IOException {
            r7 = this;
            int r0 = r8.getPort()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getScheme()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "://"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r8.getHost()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r0.intValue()
            r3 = -1
            if (r2 == r3) goto L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r1 = r2.toString()
        L45:
            java.lang.String r2 = r8.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "/_capacitor_content_"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "content:/"
            java.lang.String r2 = r2.replace(r3, r4)
            r3 = 0
            android.content.Context r4 = r7.context     // Catch: java.lang.SecurityException -> L73
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.SecurityException -> L73
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch: java.lang.SecurityException -> L73
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch: java.lang.SecurityException -> L73
            r3 = r4
            goto L8a
        L73:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unable to open content URL: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.getcapacitor.Logger.error(r5, r4)
        L8a:
            return r3
    }

    public java.io.InputStream openFile(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "/_capacitor_file_"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.replace(r0, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            return r2
    }

    public java.io.InputStream openResource(android.net.Uri r8) {
            r7 = this;
            java.lang.String r0 = r8.getPath()
            if (r0 == 0) goto L89
            java.util.List r0 = r8.getPathSegments()
            int r1 = r0.size()
            int r1 = r1 + (-2)
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "\\."
            java.lang.String[] r3 = r2.split(r3)
            r4 = 0
            r2 = r3[r4]
            android.content.Context r3 = r7.context     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            if (r3 == 0) goto L3b
            android.content.Context r3 = r7.context     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            r7.context = r3     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
        L3b:
            android.content.Context r3 = r7.context     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            int r3 = getFieldId(r3, r1, r2)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            android.content.Context r4 = r7.context     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            int r4 = getValueType(r4, r3)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            r5 = 3
            if (r4 != r5) goto L55
            android.content.Context r5 = r7.context     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            java.io.InputStream r5 = r5.openRawResource(r3)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            return r5
        L55:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            r5.<init>()     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            java.lang.String r6 = "Asset not of type string: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            java.lang.String r5 = r5.toString()     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            com.getcapacitor.Logger.error(r5)     // Catch: java.lang.NoSuchFieldException -> L6c java.lang.IllegalAccessException -> L6e java.lang.ClassNotFoundException -> L70
            goto L87
        L6c:
            r3 = move-exception
            goto L71
        L6e:
            r3 = move-exception
            goto L71
        L70:
            r3 = move-exception
        L71:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to open resource URL: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.getcapacitor.Logger.error(r4, r3)
        L87:
            r3 = 0
            return r3
        L89:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
