package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", "service", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = null;
    private static final java.lang.String PREFIX = "META-INF/services/";

    static {
            kotlinx.coroutines.internal.FastServiceLoader r0 = new kotlinx.coroutines.internal.FastServiceLoader
            r0.<init>()
            kotlinx.coroutines.internal.FastServiceLoader.INSTANCE = r0
            return
    }

    private FastServiceLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.internal.MainDispatcherFactory createInstanceOf(java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            r2 = 1
            java.lang.Class r1 = java.lang.Class.forName(r6, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L1f
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.reflect.Constructor r3 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Object r2 = r3.newInstance(r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Object r2 = r5.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L1f
            goto L21
        L1f:
            r1 = move-exception
            r2 = 0
        L21:
            return r2
    }

    private final <S> S getProviderInstance(java.lang.String r5, java.lang.ClassLoader r6, java.lang.Class<S> r7) {
            r4 = this;
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r0, r6)
            boolean r2 = r7.isAssignableFrom(r1)
            if (r2 == 0) goto L1c
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r1.getDeclaredConstructor(r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = r2.newInstance(r0)
            java.lang.Object r0 = r7.cast(r0)
            return r0
        L1c:
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected service of class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = ", but found "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> r3, java.lang.ClassLoader r4) {
            r2 = this;
            java.util.List r0 = r2.loadProviders$kotlinx_coroutines_core(r3, r4)     // Catch: java.lang.Throwable -> L6
            goto L12
        L6:
            r0 = move-exception
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r3, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            r0 = r1
        L12:
            return r0
    }

    private final java.util.List<java.lang.String> parse(java.net.URL r15) {
            r14 = this;
            java.lang.String r0 = r15.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L6f
            java.lang.String r1 = "jar:file:"
            java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r1, r4, r3, r4)
            r5 = 33
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r1, r5, r4, r3, r4)
            java.lang.String r5 = "!/"
            java.lang.String r3 = kotlin.text.StringsKt.substringAfter$default(r0, r5, r4, r3, r4)
            java.util.jar.JarFile r5 = new java.util.jar.JarFile
            r5.<init>(r1, r2)
            r2 = r14
            r6 = 0
            r7 = 0
            r8 = r5
            r9 = 0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L60
            java.util.zip.ZipEntry r12 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L60
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L60
            java.io.InputStream r12 = r8.getInputStream(r12)     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = "UTF-8"
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L60
            java.io.Reader r11 = (java.io.Reader) r11     // Catch: java.lang.Throwable -> L60
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L60
            java.io.Closeable r10 = (java.io.Closeable) r10     // Catch: java.lang.Throwable -> L60
            r11 = r10
            java.io.BufferedReader r11 = (java.io.BufferedReader) r11     // Catch: java.lang.Throwable -> L59
            r12 = 0
            kotlinx.coroutines.internal.FastServiceLoader r13 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L59
            java.util.List r13 = r13.parseFile(r11)     // Catch: java.lang.Throwable -> L59
            kotlin.io.CloseableKt.closeFinally(r10, r4)     // Catch: java.lang.Throwable -> L60
            r5.close()     // Catch: java.lang.Throwable -> L57
            return r13
        L57:
            r2 = move-exception
            throw r2
        L59:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L5b
        L5b:
            r11 = move-exception
            kotlin.io.CloseableKt.closeFinally(r10, r4)     // Catch: java.lang.Throwable -> L60
            throw r11     // Catch: java.lang.Throwable -> L60
        L60:
            r4 = move-exception
            r7 = r4
            throw r4     // Catch: java.lang.Throwable -> L64
        L64:
            r4 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L69
            throw r4
        L69:
            r4 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r7, r4)
            throw r7
        L6f:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r15.openStream()
            r2.<init>(r3)
            java.io.Reader r2 = (java.io.Reader) r2
            r1.<init>(r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            kotlinx.coroutines.internal.FastServiceLoader r5 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L8f
            java.util.List r5 = r5.parseFile(r2)     // Catch: java.lang.Throwable -> L8f
            kotlin.io.CloseableKt.closeFinally(r1, r4)
            return r5
        L8f:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L91
        L91:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r3
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r13) {
            r12 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
        L7:
            java.lang.String r1 = r13.readLine()
            if (r1 != 0) goto L16
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            return r1
        L16:
            java.lang.String r2 = "#"
            r3 = 2
            r4 = 0
            java.lang.String r2 = kotlin.text.StringsKt.substringBefore$default(r1, r2, r4, r3, r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r2 = r2.toString()
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 0
            r6 = r5
        L2e:
            int r7 = r3.length()
            r8 = 1
            if (r6 >= r7) goto L50
            char r7 = r3.charAt(r6)
            r9 = r7
            r10 = 0
            r11 = 46
            if (r9 == r11) goto L48
            boolean r11 = java.lang.Character.isJavaIdentifierPart(r9)
            if (r11 == 0) goto L46
            goto L48
        L46:
            r9 = r5
            goto L49
        L48:
            r9 = r8
        L49:
            if (r9 != 0) goto L4d
            r3 = r5
            goto L51
        L4d:
            int r6 = r6 + 1
            goto L2e
        L50:
            r3 = r8
        L51:
            if (r3 == 0) goto L63
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L5d
            r5 = r8
        L5d:
            if (r5 == 0) goto L7
            r0.add(r2)
            goto L7
        L63:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Illegal service provider class name: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final <R> R use(java.util.jar.JarFile r4, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> r5) {
            r3 = this;
            r0 = 0
            r1 = 0
            java.lang.Object r2 = r5.invoke(r4)     // Catch: java.lang.Throwable -> Lf
            r4.close()     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            throw r2
        Lf:
            r2 = move-exception
            r1 = r2
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L18
            throw r2
        L18:
            r2 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r2)
            throw r1
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
            r11 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r1 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()
            if (r1 != 0) goto L12
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r1 = r11.load(r0, r1)
            return r1
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L73
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = r11
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.Class r8 = java.lang.Class.forName(r2, r6, r8)     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.reflect.Constructor r9 = r8.getDeclaredConstructor(r9)     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.Object r9 = r9.newInstance(r10)     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            java.lang.Object r9 = r0.cast(r9)     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            kotlinx.coroutines.internal.MainDispatcherFactory r9 = (kotlinx.coroutines.internal.MainDispatcherFactory) r9     // Catch: java.lang.ClassNotFoundException -> L3c java.lang.Throwable -> L73
            goto L3e
        L3c:
            r8 = move-exception
            r9 = r5
        L3e:
            if (r9 == 0) goto L45
            r2 = 0
            r1.add(r9)     // Catch: java.lang.Throwable -> L73
        L45:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            r3 = r11
            r4 = 0
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.Class r6 = java.lang.Class.forName(r2, r6, r8)     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.reflect.Constructor r8 = r6.getDeclaredConstructor(r8)     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.Object r7 = r8.newInstance(r7)     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            java.lang.Object r7 = r0.cast(r7)     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            kotlinx.coroutines.internal.MainDispatcherFactory r7 = (kotlinx.coroutines.internal.MainDispatcherFactory) r7     // Catch: java.lang.ClassNotFoundException -> L66 java.lang.Throwable -> L73
            r5 = r7
            goto L68
        L66:
            r6 = move-exception
        L68:
            if (r5 == 0) goto L6f
            r2 = 0
            r1.add(r5)     // Catch: java.lang.Throwable -> L73
        L6f:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L73
            goto L7d
        L73:
            r1 = move-exception
            java.lang.ClassLoader r2 = r0.getClassLoader()
            java.util.List r2 = r11.load(r0, r2)
            r1 = r2
        L7d:
            return r1
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> r14, java.lang.ClassLoader r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "META-INF/services/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r14.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Enumeration r1 = r15.getResources(r0)
            java.util.ArrayList r2 = java.util.Collections.list(r1)
            java.lang.String r3 = "list(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L36:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L50
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.net.URL r9 = (java.net.URL) r9
            r10 = 0
            kotlinx.coroutines.internal.FastServiceLoader r11 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.util.List r9 = r11.parse(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            kotlin.collections.CollectionsKt.addAll(r4, r9)
            goto L36
        L50:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r2 = kotlin.collections.CollectionsKt.toSet(r4)
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L97
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r6)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L7a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L92
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            kotlinx.coroutines.internal.FastServiceLoader r12 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.lang.Object r10 = r12.getProviderInstance(r10, r15, r14)
            r5.add(r10)
            goto L7a
        L92:
            java.util.List r5 = (java.util.List) r5
            return r5
        L97:
            r3 = 0
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "No providers were loaded with FastServiceLoader"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
