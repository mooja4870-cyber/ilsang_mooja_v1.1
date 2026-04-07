package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    private static final void checkDebugMetadataVersion(int r3, int r4) {
            if (r4 > r3) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Debug metadata version mismatch. Expected: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = ", got "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ". Please update the Kotlin standard library."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final kotlin.coroutines.jvm.internal.DebugMetadata getDebugMetadataAnnotation(kotlin.coroutines.jvm.internal.BaseContinuationImpl r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r1 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = (kotlin.coroutines.jvm.internal.DebugMetadata) r0
            return r0
    }

    private static final int getLabel(kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "label"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L25
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L25
            java.lang.Object r2 = r0.get(r4)     // Catch: java.lang.Exception -> L25
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L25
            if (r3 == 0) goto L1a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L25
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L22
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L25
            goto L23
        L22:
            r2 = 0
        L23:
            int r2 = r2 - r1
            goto L27
        L25:
            r0 = move-exception
            r2 = -1
        L27:
            return r2
    }

    public static final java.lang.String[] getSpilledVariableFieldMapping(kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = getDebugMetadataAnnotation(r10)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            int r1 = r0.v()
            r2 = 1
            checkDebugMetadataVersion(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = getLabel(r10)
            int[] r3 = r0.i()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L25:
            if (r6 >= r4) goto L41
            r7 = r6
            r8 = r3[r6]
            if (r8 != r2) goto L3e
            java.lang.String[] r9 = r0.s()
            r9 = r9[r7]
            r1.add(r9)
            java.lang.String[] r9 = r0.n()
            r9 = r9[r7]
            r1.add(r9)
        L3e:
            int r6 = r6 + 1
            goto L25
        L41:
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = 0
            r6 = r3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r3 = r6.toArray(r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
    }

    public static final java.lang.StackTraceElement getStackTraceElement(kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = getDebugMetadataAnnotation(r8)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r1 = 1
            int r2 = r0.v()
            checkDebugMetadataVersion(r1, r2)
            int r1 = getLabel(r8)
            if (r1 >= 0) goto L1d
            r2 = -1
            goto L23
        L1d:
            int[] r2 = r0.l()
            r2 = r2[r1]
        L23:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever r3 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE
            java.lang.String r3 = r3.getModuleName(r8)
            if (r3 != 0) goto L30
            java.lang.String r4 = r0.c()
            goto L4b
        L30:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r3)
            r5 = 47
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.c()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L4b:
            java.lang.StackTraceElement r5 = new java.lang.StackTraceElement
            java.lang.String r6 = r0.m()
            java.lang.String r7 = r0.f()
            r5.<init>(r4, r6, r7, r2)
            return r5
    }
}
