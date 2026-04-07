package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoroutineId extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.lang.String> {
    public static final kotlinx.coroutines.CoroutineId.Key Key = null;
    private final long id;

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineId> {
        private Key() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineId$Key r0 = new kotlinx.coroutines.CoroutineId$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineId.Key = r0
            return
    }

    public CoroutineId(long r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineId$Key r0 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            r1.<init>(r0)
            r1.id = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineId copy$default(kotlinx.coroutines.CoroutineId r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.id
        L6:
            kotlinx.coroutines.CoroutineId r0 = r0.copy(r1)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public final kotlinx.coroutines.CoroutineId copy(long r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineId r0 = new kotlinx.coroutines.CoroutineId
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlinx.coroutines.CoroutineId
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r8
            kotlinx.coroutines.CoroutineId r1 = (kotlinx.coroutines.CoroutineId) r1
            long r3 = r7.id
            long r5 = r1.id
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L16
            return r2
        L16:
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.id
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(kotlin.coroutines.CoroutineContext r2, java.lang.String r3) {
            r1 = this;
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            r1.restoreThreadContext2(r2, r0)
            return
    }

    /* JADX INFO: renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(kotlin.coroutines.CoroutineContext r2, java.lang.String r3) {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setName(r3)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CoroutineId("
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.id
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ java.lang.String updateThreadContext(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            java.lang.String r0 = r1.updateThreadContext2(r2)
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* JADX INFO: renamed from: updateThreadContext, reason: avoid collision after fix types in other method */
    public java.lang.String updateThreadContext2(kotlin.coroutines.CoroutineContext r11) {
            r10 = this;
            kotlinx.coroutines.CoroutineName$Key r0 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r11.get(r0)
            kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L14
        L12:
            java.lang.String r0 = "coroutine"
        L14:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = r1.getName()
            r3 = 0
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8 = 6
            r9 = 0
            java.lang.String r5 = " @"
            r6 = 0
            r7 = 0
            int r3 = kotlin.text.StringsKt.lastIndexOf$default(r4, r5, r6, r7, r8, r9)
            if (r3 >= 0) goto L30
            int r3 = r2.length()
        L30:
            int r4 = r0.length()
            int r4 = r4 + r3
            int r4 = r4 + 10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r4 = r5
            r6 = 0
            r7 = 0
            java.lang.String r7 = r2.substring(r7, r3)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r4.append(r7)
            java.lang.String r7 = " @"
            r4.append(r7)
            r4.append(r0)
            r7 = 35
            r4.append(r7)
            long r7 = r10.id
            r4.append(r7)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r1.setName(r4)
            return r2
    }
}
