package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JB\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082H¢\u0006\u0002\u0010\"R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "options", "", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "followLinks", "", "getFollowLinks", "()Z", "includeDirectories", "getIncludeDirectories", "isBFS", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "[Lkotlin/io/path/PathWalkOption;", "bfsIterator", "", "dfsIterator", "iterator", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathTreeWalk implements kotlin.sequences.Sequence<java.nio.file.Path> {
    private final kotlin.io.path.PathWalkOption[] options;
    private final java.nio.file.Path start;

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {192, 198}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

        AnonymousClass1(kotlin.io.path.PathTreeWalk r2, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.AnonymousClass1> r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlin.io.path.PathTreeWalk$bfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$bfsIterator$1
                kotlin.io.path.PathTreeWalk r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlin.io.path.PathTreeWalk$bfsIterator$1 r0 = (kotlin.io.path.PathTreeWalk.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 0
                switch(r1) {
                    case 0: goto L48;
                    case 1: goto L28;
                    case 2: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L12:
                r1 = 0
                java.lang.Object r3 = r13.L$2
                kotlin.io.path.DirectoryEntriesReader r3 = (kotlin.io.path.DirectoryEntriesReader) r3
                java.lang.Object r4 = r13.L$1
                kotlin.collections.ArrayDeque r4 = (kotlin.collections.ArrayDeque) r4
                java.lang.Object r5 = r13.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlin.ResultKt.throwOnFailure(r14)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r13
                goto L14e
            L28:
                r1 = 0
                java.lang.Object r3 = r13.L$5
                java.nio.file.Path r3 = (java.nio.file.Path) r3
                java.lang.Object r4 = r13.L$4
                kotlin.io.path.PathTreeWalk r4 = (kotlin.io.path.PathTreeWalk) r4
                java.lang.Object r5 = r13.L$3
                kotlin.io.path.PathNode r5 = (kotlin.io.path.PathNode) r5
                java.lang.Object r6 = r13.L$2
                kotlin.io.path.DirectoryEntriesReader r6 = (kotlin.io.path.DirectoryEntriesReader) r6
                java.lang.Object r7 = r13.L$1
                kotlin.collections.ArrayDeque r7 = (kotlin.collections.ArrayDeque) r7
                java.lang.Object r8 = r13.L$0
                kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
                kotlin.ResultKt.throwOnFailure(r14)
                r9 = r1
                r1 = r13
                goto Le6
            L48:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r1 = r13.L$0
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.collections.ArrayDeque r3 = new kotlin.collections.ArrayDeque
                r3.<init>()
                kotlin.io.path.DirectoryEntriesReader r4 = new kotlin.io.path.DirectoryEntriesReader
                kotlin.io.path.PathTreeWalk r5 = r13.this$0
                boolean r5 = kotlin.io.path.PathTreeWalk.access$getFollowLinks(r5)
                r4.<init>(r5)
                kotlin.io.path.PathNode r5 = new kotlin.io.path.PathNode
                kotlin.io.path.PathTreeWalk r6 = r13.this$0
                java.nio.file.Path r6 = kotlin.io.path.PathTreeWalk.access$getStart$p(r6)
                kotlin.io.path.PathTreeWalk r7 = r13.this$0
                java.nio.file.Path r7 = kotlin.io.path.PathTreeWalk.access$getStart$p(r7)
                kotlin.io.path.PathTreeWalk r8 = r13.this$0
                java.nio.file.LinkOption[] r8 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r8)
                java.lang.Object r7 = kotlin.io.path.PathTreeWalkKt.access$keyOf(r7, r8)
                r5.<init>(r6, r7, r2)
                r3.addLast(r5)
                r5 = r4
                r4 = r3
                r3 = r5
                r5 = r1
                r1 = r13
            L82:
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L154
                java.lang.Object r6 = r4.removeFirst()
                kotlin.io.path.PathNode r6 = (kotlin.io.path.PathNode) r6
                kotlin.io.path.PathTreeWalk r7 = r1.this$0
                r8 = r5
                r9 = 0
                java.nio.file.Path r10 = r6.getPath()
                kotlin.io.path.PathNode r11 = r6.getParent()
                if (r11 == 0) goto La2
                kotlin.io.path.PathsKt.checkFileName(r10)
            La2:
                java.nio.file.LinkOption[] r11 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r7)
                int r12 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                int r12 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.isDirectory(r10, r11)
                r12 = 1
                if (r11 == 0) goto L11d
                boolean r11 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r6)
                if (r11 != 0) goto L113
                boolean r11 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r7)
                if (r11 == 0) goto Led
                r11 = r1
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r1.L$0 = r5
                r1.L$1 = r4
                r1.L$2 = r3
                r1.L$3 = r6
                r1.L$4 = r7
                r1.L$5 = r10
                r1.label = r12
                java.lang.Object r8 = r8.yield(r10, r11)
                if (r8 != r0) goto Ldf
                return r0
            Ldf:
                r8 = r7
                r7 = r4
                r4 = r8
                r8 = r5
                r5 = r6
                r6 = r3
                r3 = r10
            Le6:
                r10 = r7
                r7 = r4
                r4 = r10
                r10 = r3
                r3 = r6
                r6 = r5
                r5 = r8
            Led:
                java.nio.file.LinkOption[] r8 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r7)
                int r7 = r8.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r7)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                int r8 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                boolean r7 = java.nio.file.Files.isDirectory(r10, r7)
                if (r7 == 0) goto L82
                java.util.List r6 = r3.readEntries(r6)
                r7 = 0
                r8 = r6
                java.util.Collection r8 = (java.util.Collection) r8
                r4.addAll(r8)
                goto L82
            L113:
                java.nio.file.FileSystemLoopException r0 = new java.nio.file.FileSystemLoopException
                java.lang.String r2 = r10.toString()
                r0.<init>(r2)
                throw r0
            L11d:
                java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r12]
                r7 = 0
                java.nio.file.LinkOption r11 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r6[r7] = r11
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                boolean r6 = java.nio.file.Files.exists(r10, r6)
                if (r6 == 0) goto L82
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r5
                r1.L$1 = r4
                r1.L$2 = r3
                r1.L$3 = r2
                r1.L$4 = r2
                r1.L$5 = r2
                r7 = 2
                r1.label = r7
                java.lang.Object r6 = r8.yield(r10, r6)
                if (r6 != r0) goto L149
                return r0
            L149:
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L14e:
                r1 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                goto L82
            L154:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {192, 198, 211, 217}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class C00351 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

        C00351(kotlin.io.path.PathTreeWalk r2, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.C00351> r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlin.io.path.PathTreeWalk$dfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$dfsIterator$1
                kotlin.io.path.PathTreeWalk r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlin.io.path.PathTreeWalk$dfsIterator$1 r0 = (kotlin.io.path.PathTreeWalk.C00351) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                r5 = 0
                switch(r2) {
                    case 0: goto L85;
                    case 1: goto L65;
                    case 2: goto L51;
                    case 3: goto L2d;
                    case 4: goto L16;
                    default: goto Le;
                }
            Le:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L16:
                r2 = r18
                r6 = 0
                java.lang.Object r7 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r7 = (kotlin.io.path.DirectoryEntriesReader) r7
                java.lang.Object r8 = r0.L$1
                kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
                java.lang.Object r9 = r0.L$0
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.ResultKt.throwOnFailure(r2)
                r16 = r3
                r3 = r0
                goto L25b
            L2d:
                r2 = r18
                r6 = 0
                java.lang.Object r7 = r0.L$5
                java.nio.file.Path r7 = (java.nio.file.Path) r7
                java.lang.Object r8 = r0.L$4
                kotlin.io.path.PathTreeWalk r8 = (kotlin.io.path.PathTreeWalk) r8
                java.lang.Object r9 = r0.L$3
                kotlin.io.path.PathNode r9 = (kotlin.io.path.PathNode) r9
                java.lang.Object r10 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r10 = (kotlin.io.path.DirectoryEntriesReader) r10
                java.lang.Object r11 = r0.L$1
                kotlin.collections.ArrayDeque r11 = (kotlin.collections.ArrayDeque) r11
                java.lang.Object r12 = r0.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.ResultKt.throwOnFailure(r2)
                r16 = r3
                r13 = r6
                r6 = r0
                goto L1f0
            L51:
                r2 = r18
                r6 = 0
                java.lang.Object r7 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r7 = (kotlin.io.path.DirectoryEntriesReader) r7
                java.lang.Object r8 = r0.L$1
                kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
                java.lang.Object r9 = r0.L$0
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.ResultKt.throwOnFailure(r2)
                goto L174
            L65:
                r2 = r18
                r6 = 0
                java.lang.Object r7 = r0.L$5
                java.nio.file.Path r7 = (java.nio.file.Path) r7
                java.lang.Object r8 = r0.L$4
                kotlin.io.path.PathTreeWalk r8 = (kotlin.io.path.PathTreeWalk) r8
                java.lang.Object r9 = r0.L$3
                kotlin.io.path.PathNode r9 = (kotlin.io.path.PathNode) r9
                java.lang.Object r10 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r10 = (kotlin.io.path.DirectoryEntriesReader) r10
                java.lang.Object r11 = r0.L$1
                kotlin.collections.ArrayDeque r11 = (kotlin.collections.ArrayDeque) r11
                java.lang.Object r12 = r0.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.ResultKt.throwOnFailure(r2)
                goto L111
            L85:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r18
                java.lang.Object r6 = r0.L$0
                r9 = r6
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.collections.ArrayDeque r6 = new kotlin.collections.ArrayDeque
                r6.<init>()
                r8 = r6
                kotlin.io.path.DirectoryEntriesReader r6 = new kotlin.io.path.DirectoryEntriesReader
                kotlin.io.path.PathTreeWalk r7 = r0.this$0
                boolean r7 = kotlin.io.path.PathTreeWalk.access$getFollowLinks(r7)
                r6.<init>(r7)
                r7 = r6
                kotlin.io.path.PathNode r6 = new kotlin.io.path.PathNode
                kotlin.io.path.PathTreeWalk r10 = r0.this$0
                java.nio.file.Path r10 = kotlin.io.path.PathTreeWalk.access$getStart$p(r10)
                kotlin.io.path.PathTreeWalk r11 = r0.this$0
                java.nio.file.Path r11 = kotlin.io.path.PathTreeWalk.access$getStart$p(r11)
                kotlin.io.path.PathTreeWalk r12 = r0.this$0
                java.nio.file.LinkOption[] r12 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r12)
                java.lang.Object r11 = kotlin.io.path.PathTreeWalkKt.access$keyOf(r11, r12)
                r6.<init>(r10, r11, r5)
                kotlin.io.path.PathTreeWalk r10 = r0.this$0
                r11 = r9
                r12 = 0
                java.nio.file.Path r13 = r6.getPath()
                kotlin.io.path.PathNode r14 = r6.getParent()
                if (r14 == 0) goto Lcd
                kotlin.io.path.PathsKt.checkFileName(r13)
            Lcd:
                java.nio.file.LinkOption[] r14 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r10)
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
                if (r14 == 0) goto L14e
                boolean r14 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r6)
                if (r14 != 0) goto L144
                boolean r14 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r10)
                if (r14 == 0) goto L119
                r14 = r0
                kotlin.coroutines.Continuation r14 = (kotlin.coroutines.Continuation) r14
                r0.L$0 = r9
                r0.L$1 = r8
                r0.L$2 = r7
                r0.L$3 = r6
                r0.L$4 = r10
                r0.L$5 = r13
                r0.label = r4
                java.lang.Object r11 = r11.yield(r13, r14)
                if (r11 != r1) goto L109
                return r1
            L109:
                r11 = r9
                r9 = r6
                r6 = r12
                r12 = r11
                r11 = r8
                r8 = r10
                r10 = r7
                r7 = r13
            L111:
                r13 = r12
                r12 = r6
                r6 = r9
                r9 = r13
                r13 = r7
                r7 = r10
                r10 = r8
                r8 = r11
            L119:
                java.nio.file.LinkOption[] r11 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r10)
                int r10 = r11.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r10)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                int r11 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                boolean r10 = java.nio.file.Files.isDirectory(r13, r10)
                if (r10 == 0) goto L142
                java.util.List r10 = r7.readEntries(r6)
                r11 = 0
                java.util.Iterator r13 = r10.iterator()
                r6.setContentIterator(r13)
                r8.addLast(r6)
            L142:
                r6 = r0
                goto L177
            L144:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r3 = r13.toString()
                r1.<init>(r3)
                throw r1
            L14e:
                java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r4]
                java.nio.file.LinkOption r10 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r6[r3] = r10
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r4)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                boolean r6 = java.nio.file.Files.exists(r13, r6)
                if (r6 == 0) goto L176
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.L$0 = r9
                r0.L$1 = r8
                r0.L$2 = r7
                r10 = 2
                r0.label = r10
                java.lang.Object r6 = r11.yield(r13, r6)
                if (r6 != r1) goto L173
                return r1
            L173:
                r6 = r12
            L174:
                r6 = r0
                goto L177
            L176:
                r6 = r0
            L177:
                r10 = r8
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L266
                java.lang.Object r10 = r8.last()
                kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
                java.util.Iterator r11 = r10.getContentIterator()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                boolean r10 = r11.hasNext()
                if (r10 == 0) goto L260
                java.lang.Object r10 = r11.next()
                kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
                kotlin.io.path.PathTreeWalk r11 = r6.this$0
                r12 = r9
                r13 = 0
                java.nio.file.Path r14 = r10.getPath()
                kotlin.io.path.PathNode r15 = r10.getParent()
                if (r15 == 0) goto L1aa
                kotlin.io.path.PathsKt.checkFileName(r14)
            L1aa:
                java.nio.file.LinkOption[] r15 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r11)
                r16 = r3
                int r3 = r15.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r15, r3)
                java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
                int r15 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r15)
                java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
                boolean r3 = java.nio.file.Files.isDirectory(r14, r3)
                if (r3 == 0) goto L22e
                boolean r3 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r10)
                if (r3 != 0) goto L224
                boolean r3 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r11)
                if (r3 == 0) goto L1f7
                r3 = r6
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r6.L$0 = r9
                r6.L$1 = r8
                r6.L$2 = r7
                r6.L$3 = r10
                r6.L$4 = r11
                r6.L$5 = r14
                r15 = 3
                r6.label = r15
                java.lang.Object r3 = r12.yield(r14, r3)
                if (r3 != r1) goto L1e9
                return r1
            L1e9:
                r12 = r11
                r11 = r8
                r8 = r12
                r12 = r9
                r9 = r10
                r10 = r7
                r7 = r14
            L1f0:
                r14 = r11
                r11 = r8
                r8 = r14
                r14 = r7
                r7 = r10
                r10 = r9
                r9 = r12
            L1f7:
                java.nio.file.LinkOption[] r3 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r11)
                int r11 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r11)
                java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
                int r11 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r11)
                java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
                boolean r3 = java.nio.file.Files.isDirectory(r14, r3)
                if (r3 == 0) goto L220
                java.util.List r3 = r7.readEntries(r10)
                r11 = 0
                java.util.Iterator r12 = r3.iterator()
                r10.setContentIterator(r12)
                r8.addLast(r10)
            L220:
                r3 = r16
                goto L177
            L224:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r3 = r14.toString()
                r1.<init>(r3)
                throw r1
            L22e:
                java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r4]
                java.nio.file.LinkOption r10 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r3[r16] = r10
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
                java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
                boolean r3 = java.nio.file.Files.exists(r14, r3)
                if (r3 == 0) goto L220
                r3 = r6
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r6.L$0 = r9
                r6.L$1 = r8
                r6.L$2 = r7
                r6.L$3 = r5
                r6.L$4 = r5
                r6.L$5 = r5
                r10 = 4
                r6.label = r10
                java.lang.Object r3 = r12.yield(r14, r3)
                if (r3 != r1) goto L259
                return r1
            L259:
                r3 = r6
                r6 = r13
            L25b:
                r6 = r3
                r3 = r16
                goto L177
            L260:
                r16 = r3
                r8.removeLast()
                goto L220
            L266:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public PathTreeWalk(java.nio.file.Path r2, kotlin.io.path.PathWalkOption[] r3) {
            r1 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.start = r2
            r1.options = r3
            return
    }

    public static final /* synthetic */ boolean access$getFollowLinks(kotlin.io.path.PathTreeWalk r1) {
            boolean r0 = r1.getFollowLinks()
            return r0
    }

    public static final /* synthetic */ boolean access$getIncludeDirectories(kotlin.io.path.PathTreeWalk r1) {
            boolean r0 = r1.getIncludeDirectories()
            return r0
    }

    public static final /* synthetic */ java.nio.file.LinkOption[] access$getLinkOptions(kotlin.io.path.PathTreeWalk r1) {
            java.nio.file.LinkOption[] r0 = r1.getLinkOptions()
            return r0
    }

    public static final /* synthetic */ java.nio.file.Path access$getStart$p(kotlin.io.path.PathTreeWalk r1) {
            java.nio.file.Path r0 = r1.start
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> bfsIterator() {
            r2 = this;
            kotlin.io.path.PathTreeWalk$bfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$bfsIterator$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> dfsIterator() {
            r2 = this;
            kotlin.io.path.PathTreeWalk$dfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$dfsIterator$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    private final boolean getFollowLinks() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.FOLLOW_LINKS
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final boolean getIncludeDirectories() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final java.nio.file.LinkOption[] getLinkOptions() {
            r2 = this;
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            boolean r1 = r2.getFollowLinks()
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r1)
            return r0
    }

    private final boolean isBFS() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.BREADTH_FIRST
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final java.lang.Object yieldIfNeeded(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r7, kotlin.io.path.PathNode r8, kotlin.io.path.DirectoryEntriesReader r9, kotlin.jvm.functions.Function1<? super java.util.List<kotlin.io.path.PathNode>, kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r6 = this;
            r0 = 0
            java.nio.file.Path r1 = r8.getPath()
            kotlin.io.path.PathNode r2 = r8.getParent()
            if (r2 == 0) goto Le
            kotlin.io.path.PathsKt.checkFileName(r1)
        Le:
            java.nio.file.LinkOption[] r2 = access$getLinkOptions(r6)
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = java.nio.file.Files.isDirectory(r1, r2)
            if (r2 == 0) goto L5f
            boolean r2 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r8)
            if (r2 != 0) goto L55
            boolean r2 = access$getIncludeDirectories(r6)
            if (r2 == 0) goto L35
            r7.yield(r1, r11)
        L35:
            java.nio.file.LinkOption[] r2 = access$getLinkOptions(r6)
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = java.nio.file.Files.isDirectory(r1, r2)
            if (r2 == 0) goto L54
            java.util.List r2 = r9.readEntries(r8)
            r10.invoke(r2)
        L54:
            goto L79
        L55:
            java.nio.file.FileSystemLoopException r2 = new java.nio.file.FileSystemLoopException
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
        L5f:
            r2 = 1
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]
            r4 = 0
            java.nio.file.LinkOption r5 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r3[r4] = r5
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = java.nio.file.Files.exists(r1, r2)
            if (r2 == 0) goto L79
            r7.yield(r1, r11)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L79:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.nio.file.Path> iterator() {
            r1 = this;
            boolean r0 = r1.isBFS()
            if (r0 == 0) goto Lb
            java.util.Iterator r0 = r1.bfsIterator()
            goto Lf
        Lb:
            java.util.Iterator r0 = r1.dfsIterator()
        Lf:
            return r0
    }
}
