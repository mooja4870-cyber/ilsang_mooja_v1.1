package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\b¢\u0006\u0002\u0010\n\u001ab\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u000b2*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\b¢\u0006\u0002\u0010\f\u001a·\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00012:\u0010\u0006\u001a6\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017¢\u0006\u0002\u0010\u0018\u001a\u009d\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000124\u0010\u0006\u001a0\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0019¢\u0006\u0002\u0010\u001a\u001a\u0085\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000120\b\u0001\u0010\u0006\u001a*\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001b¢\u0006\u0002\u0010\u001c\u001a\u0087\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\u0010\"\u001a\u007f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0086\b¢\u0006\u0002\u0010'\u001as\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u000b2;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0086\b¢\u0006\u0002\u0010(\u001aÊ\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00012M\b\u0001\u0010\u0006\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0)¢\u0006\u0002\b&¢\u0006\u0002\u0010*\u001a°\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012G\b\u0001\u0010\u0006\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017¢\u0006\u0002\b&¢\u0006\u0002\u0010+\u001a\u0096\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012A\b\u0001\u0010\u0006\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0019¢\u0006\u0002\b&¢\u0006\u0002\u0010,\u001a\u009a\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012Y\b\u0001\u0010\u0006\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001b¢\u0006\u0002\b&¢\u0006\u0002\u0010-\u001a\u0081\u0001\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0082\b¢\u0006\u0004\b/\u0010'\u001ap\u00100\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0082\b¢\u0006\u0004\b1\u0010\n\u001a!\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u000503\"\u0004\b\u0000\u0010\u0003H\u0002¢\u0006\u0002\b4\u001a\u0087\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001dH\u0007¢\u0006\u0004\b5\u0010\"\u001a\u009a\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012Y\b\u0001\u0010\u0006\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001b¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b6\u0010-\u001ae\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\u0010\"¨\u00069"}, d2 = {"combine", "Lkotlinx/coroutines/flow/Flow;", "R", "T", "flows", "", "transform", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "T1", "T2", "T3", "T4", "T5", "flow", "flow2", "flow3", "flow4", "flow5", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "b", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineTransform", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function7;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "combineTransformUnsafe", "combineTransformUnsafe$FlowKt__ZipKt", "combineUnsafe", "combineUnsafe$FlowKt__ZipKt", "nullArrayFactory", "Lkotlin/Function0;", "nullArrayFactory$FlowKt__ZipKt", "flowCombine", "flowCombineTransform", "zip", "other", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
        public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T[]> {
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;

            public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] r2) {
                    r1 = this;
                    r1.$flows = r2
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    r1 = this;
                    java.lang.Object[] r0 = r1.invoke()
                    return r0
            }

            @Override // kotlin.jvm.functions.Function0
            public final T[] invoke() {
                    r3 = this;
                    kotlinx.coroutines.flow.Flow<T>[] r0 = r3.$flows
                    int r0 = r0.length
                    r1 = 0
                    java.lang.String r2 = "T?"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    return r0
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
            private /* synthetic */ java.lang.Object L$0;
            /* synthetic */ java.lang.Object L$1;
            int label;

            public AnonymousClass2(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass6.AnonymousClass2> r3) {
                    r1 = this;
                    r1.$transform = r2
                    r0 = 3
                    r1.<init>(r0, r3)
                    return
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                    r1 = this;
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    java.lang.Object[] r3 = (java.lang.Object[]) r3
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    java.lang.Object r0 = r1.invoke(r2, r3, r4)
                    return r0
            }

            public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.needClassReification()
                    kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$transform
                    r0.<init>(r1, r5)
                    r0.L$0 = r3
                    r0.L$1 = r4
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    java.lang.Object r0 = r0.invokeSuspend(r1)
                    return r0
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    switch(r1) {
                        case 0: goto L16;
                        case 1: goto L11;
                        default: goto L9;
                    }
                L9:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L11:
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L32
                L16:
                    kotlin.ResultKt.throwOnFailure(r7)
                    r1 = r6
                    java.lang.Object r2 = r1.L$0
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    java.lang.Object r3 = r1.L$1
                    java.lang.Object[] r3 = (java.lang.Object[]) r3
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r1.$transform
                    r5 = 0
                    r1.L$0 = r5
                    r5 = 1
                    r1.label = r5
                    java.lang.Object r2 = r4.invoke(r2, r3, r1)
                    if (r2 != r0) goto L31
                    return r0
                L31:
                    r0 = r1
                L32:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
            }

            public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = r3.L$0
                    kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                    java.lang.Object r1 = r3.L$1
                    java.lang.Object[] r1 = (java.lang.Object[]) r1
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.$transform
                    r2.invoke(r0, r1, r3)
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    return r2
            }
        }

        public AnonymousClass6(kotlinx.coroutines.flow.Flow<? extends T>[] r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass6> r4) {
                r1 = this;
                r1.$flows = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6
                kotlinx.coroutines.flow.Flow<T>[] r1 = r3.$flows
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 r0 = (kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass6) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L47
            L16:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlinx.coroutines.flow.Flow<T>[] r3 = r1.$flows
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1
                kotlinx.coroutines.flow.Flow<T>[] r5 = r1.$flows
                r4.<init>(r5)
                kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 r5 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r1.$transform
                r7 = 0
                r5.<init>(r6, r7)
                kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r7 = 1
                r1.label = r7
                java.lang.Object r2 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r2, r3, r4, r5, r6)
                if (r2 != r0) goto L46
                return r0
            L46:
                r0 = r1
            L47:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flows
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1
                kotlinx.coroutines.flow.Flow<T>[] r3 = r6.$flows
                r2.<init>(r3)
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r6.$transform
                r5 = 0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r0, r1, r2, r3, r4)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flowArray;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
        public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T[]> {
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flowArray;

            public AnonymousClass1(kotlinx.coroutines.flow.Flow<T>[] r2) {
                    r1 = this;
                    r1.$flowArray = r2
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    r1 = this;
                    java.lang.Object[] r0 = r1.invoke()
                    return r0
            }

            @Override // kotlin.jvm.functions.Function0
            public final T[] invoke() {
                    r3 = this;
                    kotlinx.coroutines.flow.Flow<T>[] r0 = r3.$flowArray
                    int r0 = r0.length
                    r1 = 0
                    java.lang.String r2 = "T?"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    return r0
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
            private /* synthetic */ java.lang.Object L$0;
            /* synthetic */ java.lang.Object L$1;
            int label;

            public AnonymousClass2(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass7.AnonymousClass2> r3) {
                    r1 = this;
                    r1.$transform = r2
                    r0 = 3
                    r1.<init>(r0, r3)
                    return
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                    r1 = this;
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    java.lang.Object[] r3 = (java.lang.Object[]) r3
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    java.lang.Object r0 = r1.invoke(r2, r3, r4)
                    return r0
            }

            public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                    r2 = this;
                    kotlin.jvm.internal.Intrinsics.needClassReification()
                    kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$transform
                    r0.<init>(r1, r5)
                    r0.L$0 = r3
                    r0.L$1 = r4
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    java.lang.Object r0 = r0.invokeSuspend(r1)
                    return r0
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    switch(r1) {
                        case 0: goto L16;
                        case 1: goto L11;
                        default: goto L9;
                    }
                L9:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L11:
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L32
                L16:
                    kotlin.ResultKt.throwOnFailure(r7)
                    r1 = r6
                    java.lang.Object r2 = r1.L$0
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    java.lang.Object r3 = r1.L$1
                    java.lang.Object[] r3 = (java.lang.Object[]) r3
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r1.$transform
                    r5 = 0
                    r1.L$0 = r5
                    r5 = 1
                    r1.label = r5
                    java.lang.Object r2 = r4.invoke(r2, r3, r1)
                    if (r2 != r0) goto L31
                    return r0
                L31:
                    r0 = r1
                L32:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
            }

            public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = r3.L$0
                    kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                    java.lang.Object r1 = r3.L$1
                    java.lang.Object[] r1 = (java.lang.Object[]) r1
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.$transform
                    r2.invoke(r0, r1, r3)
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    return r2
            }
        }

        public AnonymousClass7(kotlinx.coroutines.flow.Flow<T>[] r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass7> r4) {
                r1 = this;
                r1.$flowArray = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7
                kotlinx.coroutines.flow.Flow<T>[] r1 = r3.$flowArray
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7 r0 = (kotlinx.coroutines.flow.FlowKt__ZipKt.AnonymousClass7) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L47
            L16:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlinx.coroutines.flow.Flow<T>[] r3 = r1.$flowArray
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1
                kotlinx.coroutines.flow.Flow<T>[] r5 = r1.$flowArray
                r4.<init>(r5)
                kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 r5 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r1.$transform
                r7 = 0
                r5.<init>(r6, r7)
                kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r7 = 1
                r1.label = r7
                java.lang.Object r2 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r2, r3, r4, r5, r6)
                if (r2 != r0) goto L46
                return r0
            L46:
                r0 = r1
            L47:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flowArray
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1
                kotlinx.coroutines.flow.Flow<T>[] r3 = r6.$flowArray
                r2.<init>(r3)
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                kotlin.jvm.internal.Intrinsics.needClassReification()
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r6.$transform
                r5 = 0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r0, r1, r2, r3, r4)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$nullArrayFactory() {
            kotlin.jvm.functions.Function0 r0 = nullArrayFactory$FlowKt__ZipKt()
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r5, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            r0 = 0
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = r1
            r4 = 0
            kotlinx.coroutines.flow.Flow[] r4 = new kotlinx.coroutines.flow.Flow[r4]
            java.lang.Object[] r1 = r3.toArray(r4)
            kotlinx.coroutines.flow.Flow[] r1 = (kotlinx.coroutines.flow.Flow[]) r1
            r2 = 0
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3
            r3.<init>(r1, r6)
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            return r3
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowCombine(r1, r2, r3)
            return r0
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7) {
            r0 = 3
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 0
            r2 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1
            r3.<init>(r0, r7)
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            return r3
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlinx.coroutines.flow.Flow<? extends T4> r7, kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r0 = 4
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r7
            r1 = 0
            r2 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2
            r3.<init>(r0, r8)
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            return r3
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlinx.coroutines.flow.Flow<? extends T4> r7, kotlinx.coroutines.flow.Flow<? extends T5> r8, kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r9) {
            r0 = 5
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r7
            r1 = 4
            r0[r1] = r8
            r1 = 0
            r2 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 r3 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3
            r3.<init>(r0, r9)
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            return r3
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T>[] r3, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2
            r2.<init>(r3, r4)
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            return r2
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r5, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            r0 = 0
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = r1
            r4 = 0
            kotlinx.coroutines.flow.Flow[] r4 = new kotlinx.coroutines.flow.Flow[r4]
            java.lang.Object[] r1 = r3.toArray(r4)
            kotlinx.coroutines.flow.Flow[] r1 = (kotlinx.coroutines.flow.Flow[]) r1
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7
            r3 = 0
            r2.<init>(r1, r6, r3)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            r0 = 2
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2
            r3 = 0
            r2.<init>(r0, r3, r6)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7) {
            r0 = 3
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3
            r3 = 0
            r2.<init>(r0, r3, r7)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlinx.coroutines.flow.Flow<? extends T4> r7, kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8) {
            r0 = 4
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r7
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4
            r3 = 0
            r2.<init>(r0, r3, r8)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlinx.coroutines.flow.Flow<? extends T3> r6, kotlinx.coroutines.flow.Flow<? extends T4> r7, kotlinx.coroutines.flow.Flow<? extends T5> r8, kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9) {
            r0 = 5
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r7
            r1 = 4
            r0[r1] = r8
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5
            r3 = 0
            r2.<init>(r0, r3, r9)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T>[] r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6
            r2 = 0
            r1.<init>(r3, r4, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.flow(r1)
            return r1
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransformUnsafe$FlowKt__ZipKt(kotlinx.coroutines.flow.Flow<? extends T>[] r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1
            r2 = 0
            r1.<init>(r3, r4, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.flow(r1)
            return r1
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineUnsafe$FlowKt__ZipKt(kotlinx.coroutines.flow.Flow<? extends T>[] r3, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1
            r2.<init>(r3, r4)
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            return r2
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombine(kotlinx.coroutines.flow.Flow<? extends T1> r2, kotlinx.coroutines.flow.Flow<? extends T2> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            r1.<init>(r2, r3, r4)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombineTransform(kotlinx.coroutines.flow.Flow<? extends T1> r4, kotlinx.coroutines.flow.Flow<? extends T2> r5, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            r0 = 2
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r5
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1
            r3 = 0
            r2.<init>(r0, r3, r6)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r2)
            return r2
    }

    private static final <T> kotlin.jvm.functions.Function0<T[]> nullArrayFactory$FlowKt__ZipKt() {
            kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1 r0 = kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1.INSTANCE
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            return r0
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zip(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.CombineKt.zipImpl(r1, r2, r3)
            return r0
    }
}
