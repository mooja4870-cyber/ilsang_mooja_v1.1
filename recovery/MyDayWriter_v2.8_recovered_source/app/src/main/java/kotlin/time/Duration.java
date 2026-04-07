package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    public static final kotlin.time.Duration.Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* JADX INFO: compiled from: Duration.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1535getDaysUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1536getDaysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1537getDaysUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1538getDaysUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1539getDaysUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1540getDaysUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1541getHoursUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1542getHoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1543getHoursUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1544getHoursUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1545getHoursUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1546getHoursUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1547getMicrosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1548getMicrosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1549getMicrosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1550getMicrosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1551getMicrosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1552getMicrosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1553getMillisecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1554getMillisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1555getMillisecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1556getMillisecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1557getMillisecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1558getMillisecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1559getMinutesUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1560getMinutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1561getMinutesUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1562getMinutesUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1563getMinutesUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1564getMinutesUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1565getNanosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1566getNanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1567getNanosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1568getNanosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1569getNanosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1570getNanosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1571getSecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1572getSecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1573getSecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1574getSecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1575getSecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1576getSecondsUwyO8pc$annotations(long r0) {
                return
        }

        public final double convert(double r3, kotlin.time.DurationUnit r5, kotlin.time.DurationUnit r6) {
                r2 = this;
                java.lang.String r0 = "sourceUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "targetUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r3, r5, r6)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1577daysUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1578daysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1579daysUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1580getINFINITEUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getINFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1581getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getNEG_INFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1582getZEROUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getZERO$cp()
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1583hoursUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1584hoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1585hoursUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1586microsecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1587microsecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1588microsecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1589millisecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1590millisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1591millisecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1592minutesUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1593minutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1594minutesUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1595nanosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1596nanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1597nanosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1598parseUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid duration string format: '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = "'."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1599parseIsoStringUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid ISO duration string format: '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = "'."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1600parseIsoStringOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r0 = kotlin.time.Duration.m1477boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L13
            L10:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L13:
                return r0
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1601parseOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r0 = kotlin.time.Duration.m1477boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L13
            L10:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L13:
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1602secondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1603secondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1604secondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }
    }

    static {
            kotlin.time.Duration$Companion r0 = new kotlin.time.Duration$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Duration.Companion = r0
            r0 = 0
            long r0 = m1479constructorimpl(r0)
            kotlin.time.Duration.ZERO = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.INFINITE = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.NEG_INFINITE = r0
            return
    }

    private /* synthetic */ Duration(long r1) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            return
    }

    public static final /* synthetic */ long access$getINFINITE$cp() {
            long r0 = kotlin.time.Duration.INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getNEG_INFINITE$cp() {
            long r0 = kotlin.time.Duration.NEG_INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getZERO$cp() {
            long r0 = kotlin.time.Duration.ZERO
            return r0
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1475addValuesMixedRangesUwyO8pc(long r8, long r10, long r12) {
            long r0 = kotlin.time.DurationKt.access$nanosToMillis(r12)
            long r2 = r10 + r0
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 0
            if (r4 > 0) goto L1a
            r6 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L1a
            r5 = 1
        L1a:
            if (r5 == 0) goto L2c
            long r4 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r4 = r12 - r4
            long r6 = kotlin.time.DurationKt.access$millisToNanos(r2)
            long r6 = r6 + r4
            long r4 = kotlin.time.DurationKt.access$durationOfNanos(r6)
            goto L3e
        L2c:
            r4 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r4 = kotlin.ranges.RangesKt.coerceIn(r2, r4, r6)
            long r4 = kotlin.time.DurationKt.access$durationOfMillis(r4)
        L3e:
            return r4
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1476appendFractionalimpl(long r12, java.lang.StringBuilder r14, int r15, int r16, int r17, java.lang.String r18, boolean r19) {
            r14.append(r15)
            if (r16 == 0) goto L5a
            r0 = 46
            r14.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r16)
            r1 = 48
            r2 = r17
            java.lang.String r0 = kotlin.text.StringsKt.padStart(r0, r2, r1)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            int r5 = r3.length()
            r6 = -1
            int r5 = r5 + r6
            r7 = 1
            r8 = 0
            if (r5 < 0) goto L36
        L24:
            r9 = r5
            int r5 = r5 + r6
            char r10 = r3.charAt(r9)
            r11 = 0
            if (r10 == r1) goto L2f
            r10 = r7
            goto L30
        L2f:
            r10 = r8
        L30:
            if (r10 == 0) goto L34
            r6 = r9
            goto L37
        L34:
            if (r5 >= 0) goto L24
        L36:
        L37:
            int r6 = r6 + r7
            java.lang.String r1 = "append(...)"
            r3 = 3
            if (r19 != 0) goto L4b
            if (r6 >= r3) goto L4b
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.StringBuilder r3 = r14.append(r3, r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L5c
        L4b:
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r5 = r6 + 2
            int r5 = r5 / r3
            int r5 = r5 * r3
            java.lang.StringBuilder r3 = r14.append(r4, r8, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            goto L5c
        L5a:
            r2 = r17
        L5c:
            r0 = r18
            r14.append(r0)
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m1477boximpl(long r1) {
            kotlin.time.Duration r0 = new kotlin.time.Duration
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1478compareToLRDsOJo(long r5, long r7) {
            long r0 = r5 ^ r7
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L21
            int r2 = (int) r0
            r2 = r2 & 1
            if (r2 != 0) goto Le
            goto L21
        Le:
            r2 = 0
            int r3 = (int) r5
            r2 = r3 & 1
            r3 = 0
            int r4 = (int) r7
            r3 = r4 & 1
            int r2 = r2 - r3
            boolean r3 = m1512isNegativeimpl(r5)
            if (r3 == 0) goto L1f
            int r3 = -r2
            goto L20
        L1f:
            r3 = r2
        L20:
            return r3
        L21:
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            return r2
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1479constructorimpl(long r7) {
            boolean r0 = kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()
            if (r0 == 0) goto Lb4
            boolean r0 = m1510isInNanosimpl(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L47
            long r3 = m1506getValueimpl(r7)
            r5 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L25
            r5 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L2a
            goto Lb4
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m1506getValueimpl(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ns is out of nanoseconds range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            long r3 = m1506getValueimpl(r7)
            r5 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L5c
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5c
            r0 = r1
            goto L5d
        L5c:
            r0 = r2
        L5d:
            if (r0 == 0) goto L97
            long r3 = m1506getValueimpl(r7)
            r5 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L76
            r5 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L76
            goto L77
        L76:
            r1 = r2
        L77:
            if (r1 != 0) goto L7a
            goto Lb4
        L7a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m1506getValueimpl(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ms is denormalized"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L97:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m1506getValueimpl(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ms is out of milliseconds range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb4:
            return r7
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1480divLRDsOJo(long r5, long r7) {
            kotlin.time.DurationUnit r0 = m1504getStorageUnitimpl(r5)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            kotlin.time.DurationUnit r1 = m1504getStorageUnitimpl(r7)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r0, r1)
            kotlin.time.DurationUnit r0 = (kotlin.time.DurationUnit) r0
            double r1 = m1522toDoubleimpl(r5, r0)
            double r3 = m1522toDoubleimpl(r7, r0)
            double r1 = r1 / r3
            return r1
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1481divUwyO8pc(long r6, double r8) {
            int r0 = kotlin.math.MathKt.roundToInt(r8)
            double r1 = (double) r0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L15
            if (r0 == 0) goto L15
            long r1 = m1482divUwyO8pc(r6, r0)
            return r1
        L15:
            kotlin.time.DurationUnit r1 = m1504getStorageUnitimpl(r6)
            double r2 = m1522toDoubleimpl(r6, r1)
            double r2 = r2 / r8
            long r4 = kotlin.time.DurationKt.toDuration(r2, r1)
            return r4
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1482divUwyO8pc(long r6, int r8) {
            if (r8 != 0) goto L1d
        L3:
            boolean r0 = m1513isPositiveimpl(r6)
            if (r0 == 0) goto Lc
            long r0 = kotlin.time.Duration.INFINITE
            goto L14
        Lc:
            boolean r0 = m1512isNegativeimpl(r6)
            if (r0 == 0) goto L15
            long r0 = kotlin.time.Duration.NEG_INFINITE
        L14:
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Dividing zero duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1d:
            boolean r0 = m1510isInNanosimpl(r6)
            if (r0 == 0) goto L2e
            long r0 = m1506getValueimpl(r6)
            long r2 = (long) r8
            long r0 = r0 / r2
            long r0 = kotlin.time.DurationKt.access$durationOfNanos(r0)
            return r0
        L2e:
            boolean r0 = m1511isInfiniteimpl(r6)
            if (r0 == 0) goto L3d
            int r0 = kotlin.math.MathKt.getSign(r8)
            long r0 = m1517timesUwyO8pc(r6, r0)
            return r0
        L3d:
            long r0 = m1506getValueimpl(r6)
            long r2 = (long) r8
            long r0 = r0 / r2
            r2 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L57
            r4 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L57
            r3 = 1
        L57:
            if (r3 == 0) goto L70
            long r2 = m1506getValueimpl(r6)
            long r4 = (long) r8
            long r4 = r4 * r0
            long r2 = r2 - r4
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r2)
            long r4 = (long) r8
            long r2 = r2 / r4
            long r4 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r4 = r4 + r2
            long r4 = kotlin.time.DurationKt.access$durationOfNanos(r4)
            return r4
        L70:
            long r2 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            return r2
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1483equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.time.Duration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r6
            kotlin.time.Duration r0 = (kotlin.time.Duration) r0
            long r2 = r0.m1534unboximpl()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1484equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1485getAbsoluteValueUwyO8pc(long r2) {
            boolean r0 = m1512isNegativeimpl(r2)
            if (r0 == 0) goto Lb
            long r0 = m1532unaryMinusUwyO8pc(r2)
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1486getHoursComponentimpl(long r4) {
            boolean r0 = m1511isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m1495getInWholeHoursimpl(r4)
            r2 = 24
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInDays$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final /* synthetic */ double m1487getInDaysimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInHours$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final /* synthetic */ double m1488getInHoursimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMicroseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m1489getInMicrosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMilliseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m1490getInMillisecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMinutes$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final /* synthetic */ double m1491getInMinutesimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInNanoseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m1492getInNanosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInSeconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m1493getInSecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            double r0 = m1522toDoubleimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1494getInWholeDaysimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = m1525toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1495getInWholeHoursimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = m1525toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1496getInWholeMicrosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = m1525toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1497getInWholeMillisecondsimpl(long r2) {
            boolean r0 = m1509isInMillisimpl(r2)
            if (r0 == 0) goto L11
            boolean r0 = m1508isFiniteimpl(r2)
            if (r0 == 0) goto L11
            long r0 = m1506getValueimpl(r2)
            goto L17
        L11:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = m1525toLongimpl(r2, r0)
        L17:
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1498getInWholeMinutesimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = m1525toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1499getInWholeNanosecondsimpl(long r4) {
            long r0 = m1506getValueimpl(r4)
            boolean r2 = m1510isInNanosimpl(r4)
            if (r2 == 0) goto Ld
            r2 = r0
            goto L2c
        Ld:
            r2 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L2c
        L1c:
            r2 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = -9223372036854775808
            goto L2c
        L28:
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r0)
        L2c:
            return r2
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1500getInWholeSecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = m1525toLongimpl(r2, r0)
            return r0
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1501getMinutesComponentimpl(long r4) {
            boolean r0 = m1511isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m1498getInWholeMinutesimpl(r4)
            r2 = 60
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1502getNanosecondsComponentimpl(long r4) {
            boolean r0 = m1511isInfiniteimpl(r4)
            if (r0 == 0) goto L9
            r0 = 0
            goto L27
        L9:
            boolean r0 = m1509isInMillisimpl(r4)
            if (r0 == 0) goto L1d
            long r0 = m1506getValueimpl(r4)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 % r2
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
            int r0 = (int) r0
            goto L27
        L1d:
            long r0 = m1506getValueimpl(r4)
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L27:
            return r0
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1503getSecondsComponentimpl(long r4) {
            boolean r0 = m1511isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m1500getInWholeSecondsimpl(r4)
            r2 = 60
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m1504getStorageUnitimpl(long r1) {
            boolean r0 = m1510isInNanosimpl(r1)
            if (r0 == 0) goto L9
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto Lb
        L9:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1505getUnitDiscriminatorimpl(long r2) {
            r0 = 0
            int r1 = (int) r2
            r1 = r1 & 1
            return r1
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m1506getValueimpl(long r2) {
            r0 = 1
            long r0 = r2 >> r0
            return r0
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1507hashCodeimpl(long r1) {
            int r0 = java.lang.Long.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1508isFiniteimpl(long r1) {
            boolean r0 = m1511isInfiniteimpl(r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1509isInMillisimpl(long r3) {
            r0 = 0
            int r1 = (int) r3
            r2 = 1
            r0 = r1 & 1
            if (r0 != r2) goto L8
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1510isInNanosimpl(long r3) {
            r0 = 0
            int r1 = (int) r3
            r2 = 1
            r0 = r1 & 1
            if (r0 != 0) goto L8
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1511isInfiniteimpl(long r2) {
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lf
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1512isNegativeimpl(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1513isPositiveimpl(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1514minusLRDsOJo(long r2, long r4) {
            long r0 = m1532unaryMinusUwyO8pc(r4)
            long r0 = m1515plusLRDsOJo(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1515plusLRDsOJo(long r7, long r9) {
            boolean r0 = m1511isInfiniteimpl(r7)
            if (r0 == 0) goto L1f
            boolean r0 = m1508isFiniteimpl(r9)
            if (r0 != 0) goto L1e
            long r0 = r7 ^ r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinite durations of different signs yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1e:
            return r7
        L1f:
            boolean r0 = m1511isInfiniteimpl(r9)
            if (r0 == 0) goto L26
            return r9
        L26:
            r0 = 0
            int r1 = (int) r7
            r0 = r1 & 1
            r1 = 0
            int r2 = (int) r9
            r1 = r2 & 1
            if (r0 != r1) goto L4d
            long r0 = m1506getValueimpl(r7)
            long r2 = m1506getValueimpl(r9)
            long r0 = r0 + r2
            boolean r2 = m1510isInNanosimpl(r7)
            if (r2 == 0) goto L47
            long r2 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r0)
            r0 = r7
            goto L70
        L47:
            long r2 = kotlin.time.DurationKt.access$durationOfMillisNormalized(r0)
            r0 = r7
            goto L70
        L4d:
            boolean r0 = m1509isInMillisimpl(r7)
            if (r0 == 0) goto L63
            long r3 = m1506getValueimpl(r7)
            long r5 = m1506getValueimpl(r9)
            r1 = r7
            long r7 = m1475addValuesMixedRangesUwyO8pc(r1, r3, r5)
            r0 = r1
            r2 = r7
            goto L70
        L63:
            r0 = r7
            long r2 = m1506getValueimpl(r9)
            long r4 = m1506getValueimpl(r0)
            long r2 = m1475addValuesMixedRangesUwyO8pc(r0, r2, r4)
        L70:
            return r2
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1516timesUwyO8pc(long r6, double r8) {
            int r0 = kotlin.math.MathKt.roundToInt(r8)
            double r1 = (double) r0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L13
            long r1 = m1517timesUwyO8pc(r6, r0)
            return r1
        L13:
            kotlin.time.DurationUnit r1 = m1504getStorageUnitimpl(r6)
            double r2 = m1522toDoubleimpl(r6, r1)
            double r2 = r2 * r8
            long r4 = kotlin.time.DurationKt.toDuration(r2, r1)
            return r4
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1517timesUwyO8pc(long r18, int r20) {
            r0 = r20
            boolean r1 = m1511isInfiniteimpl(r18)
            if (r1 == 0) goto L1d
        L9:
            if (r0 == 0) goto L15
            if (r0 <= 0) goto L10
            r1 = r18
            goto L14
        L10:
            long r1 = m1532unaryMinusUwyO8pc(r18)
        L14:
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Multiplying infinite duration by zero yields an undefined result."
            r1.<init>(r2)
            throw r1
        L1d:
            if (r0 != 0) goto L22
            long r1 = kotlin.time.Duration.ZERO
            return r1
        L22:
            long r1 = m1506getValueimpl(r18)
            long r3 = (long) r0
            long r3 = r3 * r1
            boolean r5 = m1510isInNanosimpl(r18)
            if (r5 == 0) goto Lac
            r10 = -2147483647(0xffffffff80000001, double:NaN)
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r10 = 0
            if (r5 > 0) goto L40
            r11 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r5 >= 0) goto L40
            r10 = 1
        L40:
            if (r10 == 0) goto L4a
            long r5 = kotlin.time.DurationKt.access$durationOfNanos(r3)
            r16 = r1
            goto Ldf
        L4a:
            long r10 = (long) r0
            long r10 = r3 / r10
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 != 0) goto L59
            long r5 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r3)
            r16 = r1
            goto Ldf
        L59:
            long r10 = kotlin.time.DurationKt.access$nanosToMillis(r1)
            long r12 = kotlin.time.DurationKt.access$millisToNanos(r10)
            long r12 = r1 - r12
            long r14 = (long) r0
            long r14 = r14 * r10
            long r6 = (long) r0
            long r6 = r6 * r12
            long r5 = kotlin.time.DurationKt.access$nanosToMillis(r6)
            long r5 = r5 + r14
            long r8 = (long) r0
            long r7 = r14 / r8
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L98
            long r7 = r5 ^ r14
            r16 = 0
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 < 0) goto L98
            kotlin.ranges.LongRange r7 = new kotlin.ranges.LongRange
            r16 = r1
            r1 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r7.<init>(r1, r8)
            kotlin.ranges.ClosedRange r7 = (kotlin.ranges.ClosedRange) r7
            long r1 = kotlin.ranges.RangesKt.coerceIn(r5, r7)
            long r1 = kotlin.time.DurationKt.access$durationOfMillis(r1)
            r5 = r1
            goto Ldf
        L98:
            r16 = r1
            int r1 = kotlin.math.MathKt.getSign(r16)
            int r2 = kotlin.math.MathKt.getSign(r0)
            int r1 = r1 * r2
            if (r1 <= 0) goto La9
            long r1 = kotlin.time.Duration.INFINITE
            r5 = r1
            goto Ldf
        La9:
            long r5 = kotlin.time.Duration.NEG_INFINITE
            goto Ldf
        Lac:
            r16 = r1
            long r1 = (long) r0
            long r1 = r3 / r1
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto Lcf
            kotlin.ranges.LongRange r1 = new kotlin.ranges.LongRange
            r5 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r1.<init>(r5, r8)
            kotlin.ranges.ClosedRange r1 = (kotlin.ranges.ClosedRange) r1
            long r1 = kotlin.ranges.RangesKt.coerceIn(r3, r1)
            long r5 = kotlin.time.DurationKt.access$durationOfMillis(r1)
            goto Ldf
        Lcf:
            int r1 = kotlin.math.MathKt.getSign(r16)
            int r2 = kotlin.math.MathKt.getSign(r0)
            int r1 = r1 * r2
            if (r1 <= 0) goto Ldd
            long r5 = kotlin.time.Duration.INFINITE
            goto Ldf
        Ldd:
            long r5 = kotlin.time.Duration.NEG_INFINITE
        Ldf:
            return r5
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1518toComponentsimpl(long r3, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            long r1 = m1500getInWholeSecondsimpl(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m1502getNanosecondsComponentimpl(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r5.invoke(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1519toComponentsimpl(long r4, kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r6) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            long r1 = m1498getInWholeMinutesimpl(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m1503getSecondsComponentimpl(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m1502getNanosecondsComponentimpl(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r6.invoke(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1520toComponentsimpl(long r5, kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r7) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            long r1 = m1495getInWholeHoursimpl(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m1501getMinutesComponentimpl(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m1503getSecondsComponentimpl(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = m1502getNanosecondsComponentimpl(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r7.invoke(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1521toComponentsimpl(long r9, kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r11) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            long r1 = m1494getInWholeDaysimpl(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            int r1 = m1486getHoursComponentimpl(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = m1501getMinutesComponentimpl(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            int r1 = m1503getSecondsComponentimpl(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            int r1 = m1502getNanosecondsComponentimpl(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r3 = r11
            java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8)
            return r11
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1522toDoubleimpl(long r3, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L25
        Lf:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L25
        L18:
            long r0 = m1506getValueimpl(r3)
            double r0 = (double) r0
            kotlin.time.DurationUnit r2 = m1504getStorageUnitimpl(r3)
            double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r5)
        L25:
            return r0
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1523toIntimpl(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = m1525toLongimpl(r7, r9)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            int r0 = (int) r0
            return r0
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m1524toIsoStringimpl(long r22) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r0
            r9 = 0
            boolean r1 = m1512isNegativeimpl(r22)
            if (r1 == 0) goto L12
            r1 = 45
            r3.append(r1)
        L12:
            java.lang.String r1 = "PT"
            r3.append(r1)
            long r10 = m1485getAbsoluteValueUwyO8pc(r22)
            r12 = 0
            long r1 = m1495getInWholeHoursimpl(r10)
            int r13 = m1501getMinutesComponentimpl(r10)
            int r4 = m1503getSecondsComponentimpl(r10)
            int r5 = m1502getNanosecondsComponentimpl(r10)
            r14 = r1
            r16 = 0
            boolean r6 = m1511isInfiniteimpl(r22)
            if (r6 == 0) goto L3c
            r1 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L3c:
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L46
            r6 = r7
            goto L47
        L46:
            r6 = r8
        L47:
            r17 = r6
            if (r4 != 0) goto L50
            if (r5 == 0) goto L4e
            goto L50
        L4e:
            r6 = r8
            goto L51
        L50:
            r6 = r7
        L51:
            r18 = r6
            if (r13 != 0) goto L5b
            if (r18 == 0) goto L5a
            if (r17 == 0) goto L5a
            goto L5b
        L5a:
            r7 = r8
        L5b:
            r19 = r7
            if (r17 == 0) goto L68
            java.lang.StringBuilder r6 = r3.append(r1)
            r7 = 72
            r6.append(r7)
        L68:
            if (r19 == 0) goto L73
            java.lang.StringBuilder r6 = r3.append(r13)
            r7 = 77
            r6.append(r7)
        L73:
            if (r18 != 0) goto L7d
            if (r17 != 0) goto L7a
            if (r19 != 0) goto L7a
            goto L7d
        L7a:
            r20 = r1
            goto L89
        L7d:
            java.lang.String r7 = "S"
            r8 = 1
            r6 = 9
            r20 = r1
            r1 = r22
            m1476appendFractionalimpl(r1, r3, r4, r5, r6, r7, r8)
        L89:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1525toLongimpl(long r3, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L27
        L12:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = -9223372036854775808
            goto L27
        L1b:
            long r0 = m1506getValueimpl(r3)
            kotlin.time.DurationUnit r2 = m1504getStorageUnitimpl(r3)
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r5)
        L27:
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m1526toLongMillisecondsimpl(long r2) {
            long r0 = m1497getInWholeMillisecondsimpl(r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m1527toLongNanosecondsimpl(long r2) {
            long r0 = m1499getInWholeNanosecondsimpl(r2)
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1528toStringimpl(long r27) {
            r0 = 0
            int r2 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            java.lang.String r0 = "0s"
            goto L16c
        Lb:
            long r2 = kotlin.time.Duration.INFINITE
            int r2 = (r27 > r2 ? 1 : (r27 == r2 ? 0 : -1))
            if (r2 != 0) goto L15
            java.lang.String r0 = "Infinity"
            goto L16c
        L15:
            long r2 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r27 > r2 ? 1 : (r27 == r2 ? 0 : -1))
            if (r2 != 0) goto L1f
            java.lang.String r0 = "-Infinity"
            goto L16c
        L1f:
            boolean r2 = m1512isNegativeimpl(r27)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = r3
            r12 = 0
            if (r2 == 0) goto L31
            r4 = 45
            r6.append(r4)
        L31:
            long r13 = m1485getAbsoluteValueUwyO8pc(r27)
            r15 = 0
            long r4 = m1494getInWholeDaysimpl(r13)
            int r7 = m1486getHoursComponentimpl(r13)
            int r8 = m1501getMinutesComponentimpl(r13)
            int r16 = m1503getSecondsComponentimpl(r13)
            int r9 = m1502getNanosecondsComponentimpl(r13)
            r17 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L54
            r0 = 1
            goto L55
        L54:
            r0 = r1
        L55:
            if (r7 == 0) goto L59
            r11 = 1
            goto L5a
        L59:
            r11 = r1
        L5a:
            r18 = r11
            if (r8 == 0) goto L60
            r11 = 1
            goto L61
        L60:
            r11 = r1
        L61:
            r19 = r11
            if (r16 != 0) goto L67
            if (r9 == 0) goto L68
        L67:
            r1 = 1
        L68:
            r11 = 0
            if (r0 == 0) goto L79
            java.lang.StringBuilder r10 = r6.append(r4)
            r21 = r0
            r0 = 100
            r10.append(r0)
            int r11 = r11 + 1
            goto L7b
        L79:
            r21 = r0
        L7b:
            r0 = 32
            if (r18 != 0) goto L85
            if (r21 == 0) goto L96
            if (r19 != 0) goto L85
            if (r1 == 0) goto L96
        L85:
            int r10 = r11 + 1
            if (r11 <= 0) goto L8c
            r6.append(r0)
        L8c:
            java.lang.StringBuilder r11 = r6.append(r7)
            r0 = 104(0x68, float:1.46E-43)
            r11.append(r0)
            r11 = r10
        L96:
            if (r19 != 0) goto L9e
            if (r1 == 0) goto Lb1
            if (r18 != 0) goto L9e
            if (r21 == 0) goto Lb1
        L9e:
            int r0 = r11 + 1
            if (r11 <= 0) goto La7
            r10 = 32
            r6.append(r10)
        La7:
            java.lang.StringBuilder r10 = r6.append(r8)
            r11 = 109(0x6d, float:1.53E-43)
            r10.append(r11)
            r11 = r0
        Lb1:
            if (r1 == 0) goto L145
            int r0 = r11 + 1
            if (r11 <= 0) goto Lbc
            r10 = 32
            r6.append(r10)
        Lbc:
            if (r16 != 0) goto L129
            if (r21 != 0) goto L129
            if (r18 != 0) goto L129
            if (r19 == 0) goto Ld3
            r25 = r0
            r26 = r1
            r22 = r4
            r20 = r7
            r24 = r8
            r0 = r9
            r1 = 1
            goto L135
        Ld3:
            r10 = 1000000(0xf4240, float:1.401298E-39)
            if (r9 < r10) goto Lfd
            r11 = r7
            int r7 = r9 / r10
            int r10 = r9 % r10
            r22 = r8
            r8 = r10
            java.lang.String r10 = "ms"
            r23 = r11
            r11 = 0
            r24 = r9
            r9 = 6
            r25 = r0
            r26 = r1
            r20 = r23
            r0 = r24
            r1 = 1
            r24 = r22
            r22 = r4
            r4 = r27
            m1476appendFractionalimpl(r4, r6, r7, r8, r9, r10, r11)
            r7 = r16
            goto L142
        Lfd:
            r25 = r0
            r26 = r1
            r22 = r4
            r20 = r7
            r24 = r8
            r0 = r9
            r1 = 1
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r4) goto L11d
            int r7 = r0 / 1000
            int r8 = r0 % 1000
            java.lang.String r10 = "us"
            r11 = 0
            r9 = 3
            r4 = r27
            m1476appendFractionalimpl(r4, r6, r7, r8, r9, r10, r11)
            r7 = r16
            goto L142
        L11d:
            java.lang.StringBuilder r4 = r6.append(r0)
            java.lang.String r5 = "ns"
            r4.append(r5)
            r7 = r16
            goto L142
        L129:
            r25 = r0
            r26 = r1
            r22 = r4
            r20 = r7
            r24 = r8
            r0 = r9
            r1 = 1
        L135:
            java.lang.String r10 = "s"
            r11 = 0
            r9 = 9
            r4 = r27
            r8 = r0
            r7 = r16
            m1476appendFractionalimpl(r4, r6, r7, r8, r9, r10, r11)
        L142:
            r11 = r25
            goto L151
        L145:
            r26 = r1
            r22 = r4
            r20 = r7
            r24 = r8
            r0 = r9
            r7 = r16
            r1 = 1
        L151:
            if (r2 == 0) goto L160
            if (r11 <= r1) goto L160
            r4 = 40
            java.lang.StringBuilder r1 = r6.insert(r1, r4)
            r4 = 41
            r1.append(r4)
        L160:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L16c:
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m1529toStringimpl(long r4, kotlin.time.DurationUnit r6, int r7) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            if (r7 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L3b
            double r0 = m1522toDoubleimpl(r4, r6)
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L1b
            java.lang.String r2 = java.lang.String.valueOf(r0)
            return r2
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 12
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r7, r3)
            java.lang.String r3 = kotlin.time.DurationJvmKt.formatToExactDecimals(r0, r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = kotlin.time.DurationUnitKt.shortName(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L3b:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "decimals must be not negative, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m1530toStringimpl$default(long r0, kotlin.time.DurationUnit r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m1529toStringimpl(r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1531truncateToUwyO8pc$kotlin_stdlib(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = m1504getStorageUnitimpl(r7)
            r1 = r0
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r9.compareTo(r1)
            if (r1 <= 0) goto L2e
            boolean r1 = m1511isInfiniteimpl(r7)
            if (r1 == 0) goto L19
            goto L2e
        L19:
            r1 = 1
            long r1 = kotlin.time.DurationUnitKt.convertDurationUnit(r1, r9, r0)
            long r3 = m1506getValueimpl(r7)
            long r5 = m1506getValueimpl(r7)
            long r5 = r5 % r1
            long r3 = r3 - r5
            long r5 = kotlin.time.DurationKt.toDuration(r3, r0)
            return r5
        L2e:
            return r7
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1532unaryMinusUwyO8pc(long r4) {
            long r0 = m1506getValueimpl(r4)
            long r0 = -r0
            r2 = 0
            int r3 = (int) r4
            r2 = r3 & 1
            long r0 = kotlin.time.DurationKt.access$durationOf(r0, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration r3) {
            r2 = this;
            r0 = r3
            kotlin.time.Duration r0 = (kotlin.time.Duration) r0
            long r0 = r0.m1534unboximpl()
            int r0 = r2.m1533compareToLRDsOJo(r0)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1533compareToLRDsOJo(long r3) {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m1478compareToLRDsOJo(r0, r3)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.rawValue
            boolean r0 = m1483equalsimpl(r0, r3)
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m1507hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.rawValue
            java.lang.String r0 = m1528toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1534unboximpl() {
            r2 = this;
            long r0 = r2.rawValue
            return r0
    }
}
