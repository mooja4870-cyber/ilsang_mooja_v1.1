package kotlin.internal;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformImplementationsKt {
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS = null;

    static {
            kotlin.internal.jdk8.JDK8PlatformImplementations r0 = new kotlin.internal.jdk8.JDK8PlatformImplementations
            r0.<init>()
            kotlin.internal.PlatformImplementations r0 = (kotlin.internal.PlatformImplementations) r0     // Catch: java.lang.ClassCastException -> La
            kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS = r0
            return
        La:
            r1 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class<kotlin.internal.PlatformImplementations> r2 = kotlin.internal.PlatformImplementations.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r3 != 0) goto L44
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Instance class was loaded from a different classloader: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = ", base type classloader: "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.<init>(r0, r1)
            throw r3
        L44:
            throw r1
    }

    public static final boolean apiVersionIsAtLeast(int r1, int r2, int r3) {
            kotlin.KotlinVersion r0 = kotlin.KotlinVersion.CURRENT
            boolean r0 = r0.isAtLeast(r1, r2, r3)
            return r0
    }

    private static final /* synthetic */ <T> T castToBaseType(java.lang.Object r6) {
            java.lang.String r0 = "T"
            r1 = 1
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r0)     // Catch: java.lang.ClassCastException -> La
            r1 = r6
            java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.ClassCastException -> La
            return r1
        La:
            r1 = move-exception
            java.lang.Class r2 = r6.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r3 = 4
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r3 != 0) goto L4c
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Instance class was loaded from a different classloader: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = ", base type classloader: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = r1
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r3.<init>(r4, r5)
            throw r3
        L4c:
            throw r1
    }
}
