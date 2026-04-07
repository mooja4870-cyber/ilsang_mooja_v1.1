package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\bH¦\u0002J\b\u0010\t\u001a\u00020\u0004H&J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH¦\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "compareTo", "", "other", "equals", "", "", "hashCode", "minus", "Lkotlin/time/Duration;", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComparableTimeMark extends kotlin.time.TimeMark, java.lang.Comparable<kotlin.time.ComparableTimeMark> {

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int compareTo(kotlin.time.ComparableTimeMark r4, kotlin.time.ComparableTimeMark r5) {
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                long r0 = r4.mo1471minusUwyO8pc(r5)
                kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
                long r2 = r2.m1582getZEROUwyO8pc()
                int r0 = kotlin.time.Duration.m1478compareToLRDsOJo(r0, r2)
                return r0
        }

        public static boolean hasNotPassedNow(kotlin.time.ComparableTimeMark r1) {
                r0 = r1
                kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
                boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(r0)
                return r0
        }

        public static boolean hasPassedNow(kotlin.time.ComparableTimeMark r1) {
                r0 = r1
                kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
                boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasPassedNow(r0)
                return r0
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.ComparableTimeMark m1474minusLRDsOJo(kotlin.time.ComparableTimeMark r2, long r3) {
                long r0 = kotlin.time.Duration.m1532unaryMinusUwyO8pc(r3)
                kotlin.time.ComparableTimeMark r0 = r2.mo1472plusLRDsOJo(r0)
                return r0
        }
    }

    int compareTo(kotlin.time.ComparableTimeMark r1);

    boolean equals(java.lang.Object r1);

    int hashCode();

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo1470minusLRDsOJo(long r1);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo1471minusUwyO8pc(kotlin.time.ComparableTimeMark r1);

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    kotlin.time.ComparableTimeMark mo1472plusLRDsOJo(long r1);
}
