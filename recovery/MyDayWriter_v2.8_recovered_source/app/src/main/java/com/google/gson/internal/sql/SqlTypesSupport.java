package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes.dex */
public final class SqlTypesSupport {
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> DATE_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory DATE_FACTORY = null;
    public static final boolean SUPPORTS_SQL_TYPES = false;
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> TIMESTAMP_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory TIMESTAMP_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory TIME_FACTORY = null;



    static {
            java.lang.String r0 = "java.sql.Date"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            goto La
        L7:
            r0 = move-exception
            r1 = 0
            r0 = r1
        La:
            com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES = r0
            boolean r1 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            if (r1 == 0) goto L2f
            com.google.gson.internal.sql.SqlTypesSupport$1 r1 = new com.google.gson.internal.sql.SqlTypesSupport$1
            java.lang.Class<java.sql.Date> r2 = java.sql.Date.class
            r1.<init>(r2)
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r1
            com.google.gson.internal.sql.SqlTypesSupport$2 r1 = new com.google.gson.internal.sql.SqlTypesSupport$2
            java.lang.Class<java.sql.Timestamp> r2 = java.sql.Timestamp.class
            r1.<init>(r2)
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r1
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r1
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.sql.SqlTimeTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r1
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.sql.SqlTimestampTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r1
            goto L3a
        L2f:
            r1 = 0
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r1
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r1
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r1
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r1
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r1
        L3a:
            return
    }

    private SqlTypesSupport() {
            r0 = this;
            r0.<init>()
            return
    }
}
