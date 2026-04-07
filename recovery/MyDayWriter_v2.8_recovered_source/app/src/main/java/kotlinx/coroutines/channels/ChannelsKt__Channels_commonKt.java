package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\u000b¢\u0006\u0002\b\fH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\r\u001a2\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\u000bH\u0086H¢\u0006\u0002\u0010\u0010\u001a$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0012\"\b\b\u0000\u0010\t*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a$\u0010\u0014\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@¢\u0006\u0002\u0010\u0015\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0017\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"DEFAULT_CLOSE_MESSAGE", "", "cancelConsumed", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", "", "consume", "R", "E", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {82}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Channels.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {112}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    static final class C00721<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C00721(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C00721> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toList(r0, r1)
                return r0
        }
    }

    public static final void cancelConsumed(kotlinx.coroutines.channels.ReceiveChannel<?> r4, java.lang.Throwable r5) {
            r0 = 0
            if (r5 == 0) goto L14
            r1 = r5
            r2 = 0
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto Lc
            r0 = r1
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        Lc:
            if (r0 != 0) goto L14
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.ExceptionsKt.CancellationException(r0, r1)
        L14:
            r4.cancel(r0)
            return
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r4) {
            r0 = 0
            r1 = 0
            java.lang.Object r2 = r4.invoke(r3)     // Catch: java.lang.Throwable -> Lc
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r1)
            return r2
        Lc:
            r2 = move-exception
            r1 = r2
            throw r2     // Catch: java.lang.Throwable -> L10
        L10:
            r2 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r1)
            throw r2
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            r9 = 0
            r10 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r11
            goto L7a
        L48:
            r1 = move-exception
            goto La8
        L4b:
            kotlin.ResultKt.throwOnFailure(r11)
            r2 = 0
            r5 = r9
            r9 = 0
            r4 = 0
            r3 = r5
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> La5
            r3 = r10
            r10 = r9
            r9 = r2
            r2 = r6
            r6 = r3
            r3 = r7
        L60:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L70
            return r1
        L70:
            r8 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L9d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r11 == 0) goto L92
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L9d
            r7.invoke(r11)     // Catch: java.lang.Throwable -> L9d
            r11 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L60
        L92:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L9d:
            r11 = move-exception
            r4 = r1
            r1 = r11
            r11 = r0
            r0 = r4
            r4 = r5
            r5 = r6
            goto La8
        La5:
            r1 = move-exception
            r10 = r9
            r9 = r2
        La8:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lab
        Lab:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r0 = 0
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = r1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4     // Catch: java.lang.Throwable -> L2e
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        Le:
            r7 = 0
            java.lang.Object r7 = r6.hasNext(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L2e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L23
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L2e
            r9.invoke(r7)     // Catch: java.lang.Throwable -> L2e
            goto Le
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L2e:
            r4 = move-exception
            r3 = r4
            throw r4     // Catch: java.lang.Throwable -> L32
        L32:
            r4 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            throw r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.SelectClause1 onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel r1) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            kotlinx.coroutines.selects.SelectClause1 r0 = r1.getOnReceiveOrNull()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.lang.Object r0 = r1.receiveOrNull(r2)
            return r0
    }

    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r14, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r15) {
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C00721
            if (r0 == 0) goto L14
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C00721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L53;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2c:
            r14 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            r6 = 0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$0
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L50
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r15
            goto L8f
        L50:
            r1 = move-exception
            goto Lca
        L53:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            r3 = r2
            r4 = 0
            r5 = 0
            r7 = r14
            r14 = 0
            r6 = 0
            r8 = r7
            r9 = 0
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
            r8 = r3
            r3 = r14
            r14 = r4
            r4 = r9
            r9 = r2
            r2 = r5
            r5 = r10
        L70:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L50
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L50
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L50
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L50
            r10 = 1
            r0.label = r10     // Catch: java.lang.Throwable -> L50
            java.lang.Object r10 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L50
            if (r10 != r1) goto L82
            return r1
        L82:
            r13 = r0
            r0 = r15
            r15 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r13
        L8f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> Lbc
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> Lbc
            if (r15 == 0) goto Lad
            java.lang.Object r15 = r6.next()     // Catch: java.lang.Throwable -> Lbc
            r11 = r15
            r12 = 0
            r9.add(r11)     // Catch: java.lang.Throwable -> Lbc
            r15 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            goto L70
        Lad:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbc
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            java.util.List r14 = kotlin.collections.CollectionsKt.build(r10)
            return r14
        Lbc:
            r15 = move-exception
            r2 = r1
            r1 = r15
            r15 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r7
            r7 = r8
            goto Lca
        Lc6:
            r1 = move-exception
            r3 = r14
            r14 = r4
            r2 = r5
        Lca:
            r4 = r1
            throw r1     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            throw r1
    }
}
