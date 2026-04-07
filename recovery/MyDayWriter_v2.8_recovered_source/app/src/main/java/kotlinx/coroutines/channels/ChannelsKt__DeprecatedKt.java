package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aC\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\u00122\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\n\u0012\u0004\u0012\u0002H\u00110\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a2\u0010\u0016\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\u00060\u0001H\u0087H¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a\u001e\u0010\u001a\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aW\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001a0\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001aQ\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a&\u0010*\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010+\u001a\u00020\u001bH\u0087@¢\u0006\u0002\u0010,\u001a(\u0010-\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010+\u001a\u00020\u001bH\u0087@¢\u0006\u0002\u0010,\u001aQ\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001af\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 27\u0010)\u001a3\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0007¢\u0006\u0002\u00101\u001aQ\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a$\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001a>\u00104\u001a\u0002H5\"\b\b\u0000\u0010\u000e*\u00020$\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e06*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0087@¢\u0006\u0002\u00108\u001a<\u00104\u001a\u0002H5\"\b\b\u0000\u0010\u000e*\u00020$\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e09*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0087@¢\u0006\u0002\u0010:\u001a\u001e\u0010;\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a \u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a]\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\n0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a&\u0010?\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010@\u001a\u0002H\u000eH\u0087@¢\u0006\u0002\u0010A\u001a\u001e\u0010B\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a&\u0010C\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010@\u001a\u0002H\u000eH\u0087@¢\u0006\u0002\u0010A\u001a \u0010D\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aW\u0010E\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001al\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 27\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0001¢\u0006\u0002\u00101\u001ar\u0010G\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0011*\u00020$*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 29\u0010>\u001a5\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0007¢\u0006\u0002\u00101\u001a]\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0011*\u00020$*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2$\u0010>\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a<\u0010I\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Kj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`LH\u0087@¢\u0006\u0002\u0010M\u001a<\u0010N\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Kj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`LH\u0087@¢\u0006\u0002\u0010M\u001a\u001e\u0010O\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a$\u0010P\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a\u001e\u0010Q\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a \u0010R\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a0\u0010S\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001aQ\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a6\u0010U\u001a\u0002H5\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e09*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0081@¢\u0006\u0002\u0010:\u001a8\u0010V\u001a\u0002H5\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e06*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0081@¢\u0006\u0002\u00108\u001a<\u0010W\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0X\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010Y*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0Z0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aR\u0010W\u001a\u0002H[\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010Y\"\u0018\b\u0002\u0010[*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u001e\u0012\u0006\b\u0000\u0012\u0002HY0\\*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0Z0\n2\u0006\u00107\u001a\u0002H[H\u0081@¢\u0006\u0002\u0010]\u001a$\u0010^\u001a\b\u0012\u0004\u0012\u0002H\u000e0_\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a$\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u000e0a\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@¢\u0006\u0002\u0010\u000f\u001a$\u0010b\u001a\b\u0012\u0004\u0012\u0002H\u000e0c\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a.\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001a?\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00110Z0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002H\u00110\nH\u0087\u0004\u001az\u0010f\u001a\b\u0012\u0004\u0012\u0002HY0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010Y*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002H\u00110\n2\b\b\u0002\u0010\u001f\u001a\u00020 26\u0010>\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(h\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(i\u0012\u0004\u0012\u0002HY0\"H\u0001¨\u0006j"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", "E", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consume", "R", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", "index", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", "V", "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {434}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.any(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    static final class C00731<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C00731(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00731> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(r0, r0, r1)
                return r0
        }
    }



    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C00761<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C00761(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00761> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.count(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C00771<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C00771(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00771> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(E r3, kotlin.coroutines.Continuation<? super E> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00771) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            L10:
                kotlin.ResultKt.throwOnFailure(r3)
                r0 = r2
                java.lang.Object r1 = r0.L$0
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, 420}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C00781<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> $selector;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        C00781(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00781> r4) {
                r1 = this;
                r1.$this_distinctBy = r2
                r1.$selector = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_distinctBy
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r2 = r3.$selector
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00781) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L57;
                    case 1: goto L40;
                    case 2: goto L25;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                java.lang.Object r2 = r1.L$3
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto Ld5
            L25:
                r1 = r10
                java.lang.Object r2 = r1.L$3
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto Lb1
            L40:
                r1 = r10
                java.lang.Object r2 = r1.L$2
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$1
                java.util.HashSet r3 = (java.util.HashSet) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L8b
            L57:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r9 = r4
                r4 = r2
                r2 = r9
            L6d:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r4
                r1.L$1 = r3
                r1.L$2 = r2
                r6 = 0
                r1.L$3 = r6
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r2.hasNext(r5)
                if (r5 != r0) goto L83
                return r0
            L83:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r9
            L8b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Le6
                java.lang.Object r11 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r6 = r2.$selector
                r2.L$0 = r5
                r2.L$1 = r4
                r2.L$2 = r3
                r2.L$3 = r11
                r7 = 2
                r2.label = r7
                java.lang.Object r6 = r6.invoke(r11, r2)
                if (r6 != r1) goto Lab
                return r1
            Lab:
                r9 = r3
                r3 = r11
                r11 = r6
                r6 = r5
                r5 = r4
                r4 = r9
            Lb1:
                boolean r7 = r5.contains(r11)
                if (r7 != 0) goto Ldf
                r7 = r2
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r2.L$0 = r6
                r2.L$1 = r5
                r2.L$2 = r4
                r2.L$3 = r11
                r8 = 3
                r2.label = r8
                java.lang.Object r3 = r6.send(r3, r7)
                if (r3 != r1) goto Lcd
                return r1
            Lcd:
                r3 = r2
                r2 = r11
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                r5 = r6
            Ld5:
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                r6.add(r2)
                r2 = r3
                r3 = r4
                r4 = r5
                goto L6d
            Ldf:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r4
                r3 = r5
                r4 = r6
                goto L6d
            Le6:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {194, 199, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    static final class C00791<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_drop;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C00791(int r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00791> r4) {
                r1 = this;
                r1.$n = r2
                r1.$this_drop = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
                int r1 = r3.$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r3.$this_drop
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00791) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                switch(r1) {
                    case 0: goto L48;
                    case 1: goto L33;
                    case 2: goto L20;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L12:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                goto Ldf
            L20:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto Lbd
            L33:
                r1 = r8
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r9)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L83
            L48:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                int r4 = r1.$n
                if (r4 < 0) goto L56
                r4 = r2
                goto L57
            L56:
                r4 = 0
            L57:
                int r5 = r1.$n
                if (r4 == 0) goto Le3
                int r4 = r1.$n
                if (r4 <= 0) goto L9f
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r7 = r5
                r5 = r3
                r3 = r4
                r4 = r7
            L69:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r5
                r1.L$1 = r4
                r1.I$0 = r3
                r1.label = r2
                java.lang.Object r6 = r4.hasNext(r6)
                if (r6 != r0) goto L7b
                return r0
            L7b:
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L83:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9b
                r5.next()
                int r9 = r4 + (-1)
                if (r9 != 0) goto L93
                goto L9b
            L93:
                r4 = r3
                r3 = r9
                r9 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L69
            L9b:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r6
            L9f:
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r1.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()
            La5:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 2
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto Lb6
                return r0
            Lb6:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r7
            Lbd:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Le0
                java.lang.Object r9 = r3.next()
                r5 = r2
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r2.L$0 = r4
                r2.L$1 = r3
                r6 = 3
                r2.label = r6
                java.lang.Object r9 = r4.send(r9, r5)
                if (r9 != r1) goto Lda
                return r1
            Lda:
                r9 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
            Ldf:
                goto La5
            Le0:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            Le3:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Requested element count "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = " is less than zero."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r0 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, 212, 213, 217, 218}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    static final class C00801<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_dropWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C00801(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00801> r4) {
                r1 = this;
                r1.$this_dropWhile = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_dropWhile
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00801) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                switch(r1) {
                    case 0: goto L68;
                    case 1: goto L56;
                    case 2: goto L41;
                    case 3: goto L37;
                    case 4: goto L25;
                    case 5: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L12:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r2
                goto L113
            L25:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto Lf5
            L37:
                r1 = r9
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
                goto Ld0
            L41:
                r1 = r9
                java.lang.Object r3 = r1.L$2
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto Lb1
            L56:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L8f
            L68:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L76:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r3
                r1.L$1 = r4
                r1.L$2 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L89
                return r0
            L89:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r3
                r3 = r1
                r1 = r8
            L8f:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Ldb
                java.lang.Object r10 = r4.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r3.$predicate
                r3.L$0 = r5
                r3.L$1 = r4
                r3.L$2 = r10
                r7 = 2
                r3.label = r7
                java.lang.Object r6 = r6.invoke(r10, r3)
                if (r6 != r1) goto Lad
                return r1
            Lad:
                r8 = r4
                r4 = r10
                r10 = r6
                r6 = r8
            Lb1:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto Ld5
                r10 = r3
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r3.L$0 = r5
                r3.L$1 = r2
                r3.L$2 = r2
                r2 = 3
                r3.label = r2
                java.lang.Object r10 = r5.send(r4, r10)
                if (r10 != r1) goto Lcc
                return r1
            Lcc:
                r10 = r0
                r0 = r1
                r1 = r3
                r2 = r5
            Ld0:
                r3 = r1
                r5 = r2
                r1 = r0
                r0 = r10
                goto Ldb
            Ld5:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
                goto L76
            Ldb:
                kotlinx.coroutines.channels.ReceiveChannel<E> r10 = r3.$this_dropWhile
                kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
            Le1:
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3.L$0 = r5
                r3.L$1 = r10
                r4 = 4
                r3.label = r4
                java.lang.Object r2 = r10.hasNext(r2)
                if (r2 != r1) goto Lf2
                return r1
            Lf2:
                r8 = r2
                r2 = r10
                r10 = r8
            Lf5:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L114
                java.lang.Object r10 = r2.next()
                r4 = r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r3.L$0 = r5
                r3.L$1 = r2
                r6 = 5
                r3.label = r6
                java.lang.Object r10 = r5.send(r10, r4)
                if (r10 != r1) goto L112
                return r1
            L112:
                r10 = r2
            L113:
                goto Le1
            L114:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {68}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C00811<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C00811(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00811> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                r0 = 0
                r1 = r3
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.elementAt(r2, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C00821<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C00821(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00821> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                r0 = 0
                r1 = r3
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.elementAtOrNull(r2, r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C00831<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filter;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C00831(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00831> r4) {
                r1 = this;
                r1.$this_filter = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_filter
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00831) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 0
                switch(r1) {
                    case 0: goto L48;
                    case 1: goto L36;
                    case 2: goto L20;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L12:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lb6
            L20:
                r1 = r9
                java.lang.Object r3 = r1.L$2
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L96
            L36:
                r1 = r9
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L73
            L48:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r8 = r4
                r4 = r3
                r3 = r8
            L59:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r4
                r1.L$1 = r3
                r1.L$2 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r3.hasNext(r5)
                if (r5 != r0) goto L6c
                return r0
            L6c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L73:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lbd
                java.lang.Object r10 = r4.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r3.$predicate
                r3.L$0 = r5
                r3.L$1 = r4
                r3.L$2 = r10
                r7 = 2
                r3.label = r7
                java.lang.Object r6 = r6.invoke(r10, r3)
                if (r6 != r1) goto L91
                return r1
            L91:
                r8 = r4
                r4 = r10
                r10 = r6
                r6 = r5
                r5 = r8
            L96:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lb7
                r10 = r3
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r2
                r7 = 3
                r3.label = r7
                java.lang.Object r10 = r6.send(r4, r10)
                if (r10 != r1) goto Lb1
                return r1
            Lb1:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
            Lb6:
                goto L59
            Lb7:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r4 = r6
                goto L59
            Lbd:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {241, 242, 242}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    static final class C00841<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filterIndexed;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C00841(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00841> r4) {
                r1 = this;
                r1.$this_filterIndexed = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_filterIndexed
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00841) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 0
                switch(r1) {
                    case 0: goto L4d;
                    case 1: goto L38;
                    case 2: goto L22;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L12:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                goto Lc9
            L22:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$2
                java.lang.Object r5 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto La6
            L38:
                r1 = r11
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L7d
            L4d:
                kotlin.ResultKt.throwOnFailure(r12)
                r1 = r11
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                r4 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r10 = r5
                r5 = r3
                r3 = r4
                r4 = r10
            L60:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r5
                r1.L$1 = r4
                r1.L$2 = r2
                r1.I$0 = r3
                r7 = 1
                r1.label = r7
                java.lang.Object r6 = r4.hasNext(r6)
                if (r6 != r0) goto L75
                return r0
            L75:
                r10 = r0
                r0 = r12
                r12 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L7d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Ld1
                java.lang.Object r12 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r7 = r3.$predicate
                int r8 = r4 + 1
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r12
                r3.I$0 = r8
                r9 = 2
                r3.label = r9
                java.lang.Object r4 = r7.invoke(r4, r12, r3)
                if (r4 != r1) goto La3
                return r1
            La3:
                r10 = r4
                r4 = r12
                r12 = r10
            La6:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lca
                r12 = r3
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r3.L$0 = r6
                r3.L$1 = r5
                r3.L$2 = r2
                r3.I$0 = r8
                r7 = 3
                r3.label = r7
                java.lang.Object r12 = r6.send(r4, r12)
                if (r12 != r1) goto Lc3
                return r1
            Lc3:
                r12 = r0
                r0 = r1
                r1 = r3
                r4 = r5
                r5 = r6
                r3 = r8
            Lc9:
                goto L60
            Lca:
                r12 = r0
                r0 = r1
                r1 = r3
                r4 = r5
                r5 = r6
                r3 = r8
                goto L60
            Ld1:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    static final class C00851<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C00851(kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00851> r3) {
                r1 = this;
                r1.$predicate = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r1 = r2.$predicate
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(E r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00851) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L12:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r0
                r0 = r6
                goto L2c
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                java.lang.Object r3 = r1.L$0
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r1.$predicate
                r1.label = r2
                java.lang.Object r3 = r4.invoke(r3, r1)
                if (r3 != r0) goto L2a
                return r0
            L2a:
                r0 = r6
                r6 = r3
            L2c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r6 = r6 ^ r2
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C00861<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C00861(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00861> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(E r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00861) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L10:
                kotlin.ResultKt.throwOnFailure(r4)
                r0 = r3
                java.lang.Object r1 = r0.L$0
                if (r1 == 0) goto L1a
                r2 = 1
                goto L1b
            L1a:
                r2 = 0
            L1b:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C00871<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C00871(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00871> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, 272}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNullTo(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {95}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C00881<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C00881(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00881> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.first(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C00891<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C00891(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00891> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.firstOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class C00901<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_flatMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C00901(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00901> r4) {
                r1 = this;
                r1.$this_flatMap = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_flatMap
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00901) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                switch(r1) {
                    case 0: goto L44;
                    case 1: goto L32;
                    case 2: goto L1f;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L11:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                goto La4
            L1f:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r10
                goto L89
            L32:
                r1 = r9
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r10
                goto L6d
            L44:
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r9
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r3 = r1.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
                r8 = r3
                r3 = r2
                r2 = r8
            L55:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto L66
                return r0
            L66:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L6d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto La5
                java.lang.Object r10 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r5 = r2.$transform
                r2.L$0 = r4
                r2.L$1 = r3
                r6 = 2
                r2.label = r6
                java.lang.Object r10 = r5.invoke(r10, r2)
                if (r10 != r1) goto L89
                return r1
            L89:
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                r5 = r4
                kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
                r6 = r2
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2.L$0 = r4
                r2.L$1 = r3
                r7 = 3
                r2.label = r7
                java.lang.Object r10 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r10, r5, r6)
                if (r10 != r1) goto L9f
                return r1
            L9f:
                r10 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
            La4:
                goto L55
            La5:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {517}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class C00911<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C00911(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00911> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.indexOf(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {127, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C00921<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C00921(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00921> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.last(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {517}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C00931<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        C00931(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00931> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.lastIndexOf(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {153, 156}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C00941<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C00941(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00941> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.lastOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {517, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class C00951<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_map;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;

        C00951(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00951> r4) {
                r1 = this;
                r1.$this_map = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00951) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r17
                int r2 = r1.label
                switch(r2) {
                    case 0: goto L8a;
                    case 1: goto L62;
                    case 2: goto L37;
                    case 3: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L13:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                r9 = 0
                java.lang.Object r10 = r2.L$2
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                java.lang.Object r11 = r2.L$1
                kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                java.lang.Object r12 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L87
                r16 = r8
                r8 = r4
                r4 = r12
                r12 = r16
                goto L106
            L37:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$4
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                java.lang.Object r9 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
                r10 = 0
                java.lang.Object r11 = r2.L$2
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$1
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L5d
                r14 = r13
                r13 = r7
                r7 = r4
                r4 = r3
                goto Le8
            L5d:
                r0 = move-exception
                r9 = r10
                r10 = r11
                goto L11e
            L62:
                r2 = r17
                r3 = r18
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.Object r7 = r2.L$3
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                r9 = 0
                java.lang.Object r8 = r2.L$2
                r10 = r8
                kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
                java.lang.Object r8 = r2.L$1
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                java.lang.Object r11 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L87
                r12 = r9
                r9 = r8
                r8 = r11
                r11 = r10
                r10 = r12
                r12 = r7
                r7 = r4
                r4 = r3
                goto Lc2
            L87:
                r0 = move-exception
                goto L11e
            L8a:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r17
                r3 = r18
                java.lang.Object r4 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r2.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
                r7 = 0
                r10 = r5
                r5 = 0
                r9 = 0
                r8 = r10
                r11 = 0
                kotlinx.coroutines.channels.ChannelIterator r12 = r8.iterator()     // Catch: java.lang.Throwable -> L11c
                r8 = r6
                r6 = r11
            La7:
                r2.L$0 = r4     // Catch: java.lang.Throwable -> L11c
                r2.L$1 = r8     // Catch: java.lang.Throwable -> L11c
                r2.L$2 = r10     // Catch: java.lang.Throwable -> L11c
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L11c
                r11 = 1
                r2.label = r11     // Catch: java.lang.Throwable -> L11c
                java.lang.Object r11 = r12.hasNext(r2)     // Catch: java.lang.Throwable -> L11c
                if (r11 != r0) goto Lb9
                return r0
            Lb9:
                r16 = r4
                r4 = r3
                r3 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r16
            Lc2:
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L116
                boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L116
                if (r3 == 0) goto L10a
                java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L116
                r13 = 0
                r2.L$0 = r8     // Catch: java.lang.Throwable -> L116
                r2.L$1 = r9     // Catch: java.lang.Throwable -> L116
                r2.L$2 = r11     // Catch: java.lang.Throwable -> L116
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L116
                r2.L$4 = r8     // Catch: java.lang.Throwable -> L116
                r14 = 2
                r2.label = r14     // Catch: java.lang.Throwable -> L116
                java.lang.Object r14 = r9.invoke(r3, r2)     // Catch: java.lang.Throwable -> L116
                if (r14 != r0) goto Le3
                return r0
            Le3:
                r3 = r12
                r12 = r9
                r9 = r3
                r3 = r14
                r14 = r8
            Le8:
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L116
                r2.L$1 = r12     // Catch: java.lang.Throwable -> L116
                r2.L$2 = r11     // Catch: java.lang.Throwable -> L116
                r2.L$3 = r9     // Catch: java.lang.Throwable -> L116
                r15 = 0
                r2.L$4 = r15     // Catch: java.lang.Throwable -> L116
                r15 = 3
                r2.label = r15     // Catch: java.lang.Throwable -> L116
                java.lang.Object r3 = r8.send(r3, r2)     // Catch: java.lang.Throwable -> L116
                if (r3 != r0) goto Lfd
                return r0
            Lfd:
                r3 = r12
                r12 = r9
                r9 = r10
                r10 = r11
                r11 = r3
                r3 = r4
                r8 = r7
                r7 = r13
                r4 = r14
            L106:
                r7 = r8
                r8 = r11
                goto La7
            L10a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L116
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r10)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L116:
                r0 = move-exception
                r3 = r4
                r4 = r7
                r9 = r10
                r10 = r11
                goto L11e
            L11c:
                r0 = move-exception
                r4 = r7
            L11e:
                r6 = r0
                throw r0     // Catch: java.lang.Throwable -> L121
            L121:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r6)
                throw r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class C00961<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C00961(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00961> r4) {
                r1 = this;
                r1.$this_mapIndexed = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_mapIndexed
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00961) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L51;
                    case 1: goto L3d;
                    case 2: goto L25;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r9 = r3
                r3 = r2
                r2 = r4
                r4 = r9
                goto Lbe
            L25:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$2
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto La3
            L3d:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L7a
            L51:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                r3 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L60:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r1.L$1 = r4
                r1.I$0 = r3
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L73
                return r0
            L73:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r2
                r2 = r1
                r1 = r9
            L7a:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbf
                java.lang.Object r11 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
                int r7 = r3 + 1
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
                r2.L$0 = r4
                r2.L$1 = r5
                r2.L$2 = r4
                r2.I$0 = r7
                r8 = 2
                r2.label = r8
                java.lang.Object r11 = r6.invoke(r3, r11, r2)
                if (r11 != r1) goto La0
                return r1
            La0:
                r3 = r4
                r4 = r5
                r5 = r3
            La3:
                r6 = r2
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2.L$0 = r5
                r2.L$1 = r4
                r8 = 0
                r2.L$2 = r8
                r2.I$0 = r7
                r8 = 3
                r2.label = r8
                java.lang.Object r11 = r3.send(r11, r6)
                if (r11 != r1) goto Lb9
                return r1
            Lb9:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r5
                r3 = r7
            Lbe:
                goto L60
            Lbf:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C00971<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C00971(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00971> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.maxWith(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C00981<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C00981(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00981> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.minWith(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class C00991<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C00991(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00991> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.none(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C01001<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_requireNoNulls;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C01001(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01001> r3) {
                r1 = this;
                r1.$this_requireNoNulls = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$this_requireNoNulls
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(E r3, kotlin.coroutines.Continuation<? super E> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01001) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L10:
                kotlin.ResultKt.throwOnFailure(r6)
                r0 = r5
                java.lang.Object r1 = r0.L$0
                if (r1 == 0) goto L19
                return r1
            L19:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "null element found in "
                java.lang.StringBuilder r3 = r3.append(r4)
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r0.$this_requireNoNulls
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = 46
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {166, 169}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C01011<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C01011(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01011> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.single(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, 182}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C01021<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C01021(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01021> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.singleOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C01031<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_take;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C01031(int r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01031> r4) {
                r1 = this;
                r1.$n = r2
                r1.$this_take = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
                int r1 = r3.$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r3.$this_take
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01031) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                switch(r1) {
                    case 0: goto L37;
                    case 1: goto L22;
                    case 2: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L12:
                r1 = r10
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L96
            L22:
                r1 = r10
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L71
            L37:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                int r4 = r1.$n
                if (r4 != 0) goto L46
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L46:
                int r4 = r1.$n
                if (r4 < 0) goto L4c
                r4 = r2
                goto L4d
            L4c:
                r4 = 0
            L4d:
                int r5 = r1.$n
                if (r4 == 0) goto La5
                int r4 = r1.$n
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r1.$this_take
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            L59:
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r3
                r1.L$1 = r5
                r1.I$0 = r4
                r1.label = r2
                java.lang.Object r6 = r5.hasNext(r6)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r3
                r3 = r1
                r1 = r9
            L71:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La2
                java.lang.Object r11 = r5.next()
                r7 = r3
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r3.L$0 = r6
                r3.L$1 = r5
                r3.I$0 = r4
                r8 = 2
                r3.label = r8
                java.lang.Object r11 = r6.send(r11, r7)
                if (r11 != r1) goto L90
                return r1
            L90:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                r5 = r6
            L96:
                int r3 = r3 + (-1)
                if (r3 != 0) goto L9d
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9d:
                r9 = r4
                r4 = r3
                r3 = r5
                r5 = r9
                goto L59
            La2:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            La5:
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Requested element count "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = " is less than zero."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r0 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C01041<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_takeWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C01041(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01041> r4) {
                r1 = this;
                r1.$this_takeWhile = r2
                r1.$predicate = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r3.$this_takeWhile
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$predicate
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01041) r0
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
                    case 0: goto L47;
                    case 1: goto L35;
                    case 2: goto L1f;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                goto Lb7
            L1f:
                r1 = r8
                java.lang.Object r2 = r1.L$2
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto L93
            L35:
                r1 = r8
                java.lang.Object r2 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r9
                goto L70
            L47:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r3 = r1.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
                r7 = r3
                r3 = r2
                r2 = r7
            L58:
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r3
                r1.L$1 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r4 = r2.hasNext(r4)
                if (r4 != r0) goto L69
                return r0
            L69:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r7
            L70:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb8
                java.lang.Object r9 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r5 = r2.$predicate
                r2.L$0 = r4
                r2.L$1 = r3
                r2.L$2 = r9
                r6 = 2
                r2.label = r6
                java.lang.Object r5 = r5.invoke(r9, r2)
                if (r5 != r1) goto L8e
                return r1
            L8e:
                r7 = r3
                r3 = r9
                r9 = r5
                r5 = r4
                r4 = r7
            L93:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L9e
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L9e:
                r9 = r2
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r2.L$0 = r5
                r2.L$1 = r4
                r6 = 0
                r2.L$2 = r6
                r6 = 3
                r2.label = r6
                java.lang.Object r9 = r5.send(r3, r9)
                if (r9 != r1) goto Lb2
                return r1
            Lb2:
                r9 = r0
                r0 = r1
                r1 = r2
                r2 = r4
                r3 = r5
            Lb7:
                goto L58
            Lb8:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C01051<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C01051(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01051> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C01061<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C01061(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01061> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2<K, V, M extends java.util.Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMap(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C01071<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_withIndex;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        C01071(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01071> r3) {
                r1 = this;
                r1.$this_withIndex = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$this_withIndex
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01071) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L3a;
                    case 1: goto L25;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r9 = r3
                r3 = r2
                r2 = r4
                r4 = r9
                goto L8d
            L25:
                r1 = r10
                int r2 = r1.I$0
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L62
            L3a:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                r3 = 0
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r1.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            L49:
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r1.L$1 = r4
                r1.I$0 = r3
                r6 = 1
                r1.label = r6
                java.lang.Object r5 = r4.hasNext(r5)
                if (r5 != r0) goto L5c
                return r0
            L5c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r2
                r2 = r1
                r1 = r9
            L62:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L8e
                java.lang.Object r11 = r4.next()
                kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue
                int r7 = r3 + 1
                r6.<init>(r3, r11)
                r3 = r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r2.L$0 = r5
                r2.L$1 = r4
                r2.I$0 = r7
                r8 = 2
                r2.label = r8
                java.lang.Object r11 = r5.send(r6, r3)
                if (r11 != r1) goto L88
                return r1
            L88:
                r11 = r0
                r0 = r1
                r1 = r2
                r2 = r5
                r3 = r7
            L8d:
                goto L49
            L8e:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }


    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {517, 499, 501}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    static final class C01092<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        C01092(kotlinx.coroutines.channels.ReceiveChannel<? extends R> r2, kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01092> r5) {
                r1 = this;
                r1.$other = r2
                r1.$this_zip = r3
                r1.$transform = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
                kotlinx.coroutines.channels.ReceiveChannel<R> r1 = r4.$other
                kotlinx.coroutines.channels.ReceiveChannel<E> r2 = r4.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r3 = r4.$transform
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super V> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01092) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                r17 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r17
                int r2 = r1.label
                r3 = 0
                switch(r2) {
                    case 0: goto L94;
                    case 1: goto L66;
                    case 2: goto L36;
                    case 3: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L14:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.Object r9 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
                r10 = 0
                java.lang.Object r11 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$2
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$1
                kotlinx.coroutines.channels.ChannelIterator r13 = (kotlinx.coroutines.channels.ChannelIterator) r13
                java.lang.Object r14 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L91
                goto L13d
            L36:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.Object r9 = r2.L$5
                java.lang.Object r10 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r10 = (kotlinx.coroutines.channels.ChannelIterator) r10
                java.lang.Object r11 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                java.lang.Object r12 = r2.L$2
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r13 = r2.L$1
                kotlinx.coroutines.channels.ChannelIterator r13 = (kotlinx.coroutines.channels.ChannelIterator) r13
                java.lang.Object r14 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L62
                r15 = r11
                r11 = r3
                r3 = r12
                r12 = r15
                r15 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                goto L10a
            L62:
                r0 = move-exception
                r10 = r3
                goto L171
            L66:
                r2 = r17
                r4 = r18
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r8 = r2.L$4
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                r10 = 0
                java.lang.Object r9 = r2.L$3
                kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
                r11 = r9
                java.lang.Object r9 = r2.L$2
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                java.lang.Object r12 = r2.L$1
                kotlinx.coroutines.channels.ChannelIterator r12 = (kotlinx.coroutines.channels.ChannelIterator) r12
                java.lang.Object r13 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L91
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                goto Le0
            L91:
                r0 = move-exception
                goto L171
            L94:
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r17
                r4 = r18
                java.lang.Object r5 = r2.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlinx.coroutines.channels.ReceiveChannel<R> r6 = r2.$other
                kotlinx.coroutines.channels.ChannelIterator r6 = r6.iterator()
                kotlinx.coroutines.channels.ReceiveChannel<E> r7 = r2.$this_zip
                kotlin.jvm.functions.Function2<E, R, V> r8 = r2.$transform
                r9 = 0
                r11 = r7
                r7 = 0
                r10 = 0
                r12 = r11
                r13 = 0
                kotlinx.coroutines.channels.ChannelIterator r14 = r12.iterator()     // Catch: java.lang.Throwable -> L16e
                r12 = r6
                r6 = r7
                r7 = r13
                r13 = r5
                r5 = r9
                r9 = r8
                r8 = r14
            Lbc:
                r2.L$0 = r13     // Catch: java.lang.Throwable -> L91
                r2.L$1 = r12     // Catch: java.lang.Throwable -> L91
                r2.L$2 = r9     // Catch: java.lang.Throwable -> L91
                r2.L$3 = r11     // Catch: java.lang.Throwable -> L91
                r2.L$4 = r8     // Catch: java.lang.Throwable -> L91
                r2.L$5 = r3     // Catch: java.lang.Throwable -> L91
                r14 = 1
                r2.label = r14     // Catch: java.lang.Throwable -> L91
                java.lang.Object r14 = r8.hasNext(r2)     // Catch: java.lang.Throwable -> L91
                if (r14 != r0) goto Ld2
                return r0
            Ld2:
                r16 = r5
                r5 = r4
                r4 = r14
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r16
            Le0:
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L167
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L167
                if (r4 == 0) goto L15b
                java.lang.Object r4 = r9.next()     // Catch: java.lang.Throwable -> L167
                r15 = 0
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L167
                r2.L$1 = r13     // Catch: java.lang.Throwable -> L167
                r2.L$2 = r10     // Catch: java.lang.Throwable -> L167
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L167
                r2.L$4 = r9     // Catch: java.lang.Throwable -> L167
                r2.L$5 = r4     // Catch: java.lang.Throwable -> L167
                r3 = 2
                r2.label = r3     // Catch: java.lang.Throwable -> L167
                java.lang.Object r3 = r13.hasNext(r2)     // Catch: java.lang.Throwable -> L167
                if (r3 != r0) goto L103
                return r0
            L103:
                r16 = r4
                r4 = r3
                r3 = r10
                r10 = r9
                r9 = r16
            L10a:
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L154
                boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L154
                if (r4 == 0) goto L142
                java.lang.Object r4 = r13.next()     // Catch: java.lang.Throwable -> L167
                java.lang.Object r1 = r3.invoke(r9, r4)     // Catch: java.lang.Throwable -> L167
                r2.L$0 = r14     // Catch: java.lang.Throwable -> L167
                r2.L$1 = r13     // Catch: java.lang.Throwable -> L167
                r2.L$2 = r3     // Catch: java.lang.Throwable -> L167
                r2.L$3 = r12     // Catch: java.lang.Throwable -> L167
                r2.L$4 = r10     // Catch: java.lang.Throwable -> L167
                r18 = r3
                r3 = 0
                r2.L$5 = r3     // Catch: java.lang.Throwable -> L167
                r3 = 3
                r2.label = r3     // Catch: java.lang.Throwable -> L167
                java.lang.Object r1 = r14.send(r1, r2)     // Catch: java.lang.Throwable -> L167
                if (r1 != r0) goto L133
                return r0
            L133:
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r9 = r10
                r10 = r11
                r11 = r12
                r8 = r15
                r12 = r18
            L13d:
                r8 = r9
                r9 = r12
                r12 = r13
                r13 = r14
                goto L14f
            L142:
                r18 = r3
                r9 = r18
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
            L14f:
                r1 = r17
                r3 = 0
                goto Lbc
            L154:
                r0 = move-exception
                r10 = r11
                r4 = r5
                r5 = r6
                r6 = r7
                r11 = r12
                goto L171
            L15b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L167
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r12, r11)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L167:
                r0 = move-exception
                r4 = r5
                r5 = r6
                r6 = r7
                r10 = r11
                r11 = r12
                goto L171
            L16e:
                r0 = move-exception
                r6 = r7
                r5 = r9
            L171:
                r1 = r0
                throw r0     // Catch: java.lang.Throwable -> L174
            L174:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r1)
                throw r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3a;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2c:
            r8 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            r3 = 0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L38
            r6 = r9
            goto L54
        L38:
            r1 = move-exception
            goto L59
        L3a:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = 0
            r3 = 0
            r4 = r2
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L58
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L58
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L58
            if (r6 != r1) goto L54
            return r1
        L54:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            return r6
        L58:
            r1 = move-exception
        L59:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> r5, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r6) {
            r0 = 0
            kotlinx.coroutines.channels.ReceiveChannel r1 = r5.openSubscription()
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L10
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r3, r2, r3)
            return r4
        L10:
            r4 = move-exception
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r3, r2, r3)
            throw r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00731
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            r10 = 0
            r11 = 0
            r2 = 0
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L48
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            goto L79
        L48:
            r1 = move-exception
            goto La5
        L4b:
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = 0
            r5 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = r10.openSubscription()
            r10 = r6
            r7 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r10.iterator()     // Catch: java.lang.Throwable -> La2
            r10 = r2
            r2 = r7
            r7 = r11
            r11 = r5
            r5 = r8
        L61:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L48
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r8 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r8 != r1) goto L70
            return r1
        L70:
            r9 = r0
            r0 = r12
            r12 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r9
        L79:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9b
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r12 == 0) goto L90
            java.lang.Object r12 = r6.next()     // Catch: java.lang.Throwable -> L9b
            r8.invoke(r12)     // Catch: java.lang.Throwable -> L9b
            r12 = r0
            r0 = r1
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L61
        L90:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9b
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r4, r3, r4)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L9b:
            r12 = move-exception
            r6 = r1
            r1 = r12
            r12 = r0
            r0 = r6
            r6 = r7
            goto La5
        La2:
            r1 = move-exception
            r10 = r2
            r11 = r5
        La5:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r6, r4, r3, r4)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.BroadcastChannel<E> r10, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r0 = 0
            r1 = r10
            r2 = 0
            kotlinx.coroutines.channels.ReceiveChannel r3 = r1.openSubscription()
            r4 = 1
            r5 = 0
            r6 = r3
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6     // Catch: java.lang.Throwable -> L31
            r7 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L31
        L12:
            java.lang.Object r9 = r8.hasNext(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L26
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L31
            r11.invoke(r9)     // Catch: java.lang.Throwable -> L31
            goto L12
        L26:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r3, r5, r4, r5)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L31:
            r6 = move-exception
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r3, r5, r4, r5)
            throw r6
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(kotlinx.coroutines.channels.ReceiveChannel<?> r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(kotlinx.coroutines.channels.ReceiveChannel<?>... r1) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r13, kotlin.coroutines.Continuation r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00761
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L4d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2d:
            r13 = 0
            r2 = 0
            r4 = 0
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            r6 = 0
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L4a
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r14
            goto L82
        L4a:
            r1 = move-exception
            goto Lba
        L4d:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            r4 = 0
            r7 = r13
            r13 = 0
            r6 = 0
            r5 = r7
            r8 = 0
            kotlinx.coroutines.channels.ChannelIterator r9 = r5.iterator()     // Catch: java.lang.Throwable -> Lb7
            r5 = r2
            r2 = r13
            r13 = r4
            r4 = r8
            r8 = r5
            r5 = r9
        L68:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L4a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L4a
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r9 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L4a
            if (r9 != r1) goto L77
            return r1
        L77:
            r12 = r0
            r0 = r14
            r14 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r12
        L82:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> Lae
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> Lae
            if (r14 == 0) goto L9e
            java.lang.Object r14 = r6.next()     // Catch: java.lang.Throwable -> Lae
            r10 = 0
            int r11 = r9.element     // Catch: java.lang.Throwable -> Lae
            int r11 = r11 + r3
            r9.element = r11     // Catch: java.lang.Throwable -> Lae
            r14 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            goto L68
        L9e:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lae
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r13 = r9.element
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r13)
            return r13
        Lae:
            r14 = move-exception
            r2 = r1
            r1 = r14
            r14 = r0
            r0 = r2
            r2 = r4
            r6 = r7
            r7 = r8
            goto Lba
        Lb7:
            r1 = move-exception
            r2 = r13
            r13 = r4
        Lba:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinct(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.distinctBy$default(r3, r1, r0, r2, r1)
            return r0
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.distinctBy(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.CoroutineContext r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1
            r2 = 0
            r0.<init>(r10, r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r11 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.drop(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.dropWhile(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r12, int r13, kotlin.coroutines.Continuation r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00811
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            switch(r2) {
                case 0: goto L4e;
                case 1: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            r12 = 0
            r13 = 0
            int r2 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            r8 = 0
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L4b
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            r0 = r14
            goto L80
        L4b:
            r13 = move-exception
            goto Le2
        L4e:
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r12
            r12 = 0
            r8 = 0
            r2 = r7
            r5 = 0
            if (r13 < 0) goto Lc7
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> Lc5
            r2 = r5
            r5 = r13
            r13 = r2
            r2 = r6
            r6 = r9
        L64:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lc5
            r0.L$1 = r6     // Catch: java.lang.Throwable -> Lc5
            r0.I$0 = r5     // Catch: java.lang.Throwable -> Lc5
            r0.I$1 = r2     // Catch: java.lang.Throwable -> Lc5
            r9 = 1
            r0.label = r9     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r9 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r9 != r1) goto L76
            return r1
        L76:
            r11 = r0
            r0 = r14
            r14 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r1
            r1 = r11
        L80:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> Lbf
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto L9e
            java.lang.Object r14 = r7.next()     // Catch: java.lang.Throwable -> Lbf
            int r10 = r5 + 1
            if (r6 != r5) goto L95
        L91:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
            return r14
        L95:
            r14 = r0
            r0 = r1
            r1 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r2 = r10
            goto L64
        L9e:
            r7 = r8
            r8 = r9
            java.lang.IndexOutOfBoundsException r14 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            r14.<init>(r2)     // Catch: java.lang.Throwable -> Lbb
            throw r14     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r13 = move-exception
            r14 = r0
            r0 = r1
            goto Le2
        Lbf:
            r13 = move-exception
            r7 = r8
            r8 = r9
            r14 = r0
            r0 = r1
            goto Le2
        Lc5:
            r13 = move-exception
            goto Le2
        Lc7:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r2.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = r2.append(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc5
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc5
            throw r1     // Catch: java.lang.Throwable -> Lc5
        Le2:
            r1 = r13
            throw r13     // Catch: java.lang.Throwable -> Le5
        Le5:
            r13 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r13
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r11, int r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00821
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L4a;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            r11 = 0
            r12 = 0
            int r2 = r0.I$1
            int r4 = r0.I$0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L47
            r8 = r5
            r7 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L82
        L47:
            r11 = move-exception
            goto Lb1
        L4a:
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = 0
            r4 = r11
            r5 = 0
            if (r12 >= 0) goto L5b
        L57:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r3)
            return r3
        L5b:
            r6 = r11
            r11 = r3
            r7 = 0
            kotlinx.coroutines.channels.ChannelIterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> Lad
            r4 = r11
            r11 = r5
            r5 = r12
            r12 = r2
            r2 = r7
        L67:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Laa
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Laa
            r0.I$0 = r5     // Catch: java.lang.Throwable -> Laa
            r0.I$1 = r2     // Catch: java.lang.Throwable -> Laa
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r7 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> Laa
            if (r7 != r1) goto L79
            return r1
        L79:
            r10 = r0
            r0 = r13
            r13 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r10
        L82:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> La4
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> La4
            if (r13 == 0) goto L9f
            java.lang.Object r13 = r8.next()     // Catch: java.lang.Throwable -> La4
            int r9 = r4 + 1
            if (r6 != r4) goto L97
        L93:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            return r13
        L97:
            r4 = r5
            r13 = r0
            r0 = r1
            r1 = r2
            r5 = r6
            r6 = r7
            r2 = r9
            goto L67
        L9f:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r5)
            return r3
        La4:
            r11 = move-exception
            r6 = r7
            r3 = r5
            r13 = r0
            r0 = r1
            goto Lb1
        Laa:
            r11 = move-exception
            r3 = r4
            goto Lb1
        Lad:
            r12 = move-exception
            r3 = r11
            r11 = r12
            r12 = r2
        Lb1:
            r1 = r11
            throw r11     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r11 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            throw r11
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function3 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel r2, kotlin.coroutines.CoroutineContext r3, kotlin.jvm.functions.Function2 r4) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter(r2, r3, r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNot(r0, r1, r2)
            return r0
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filter$default(r3, r1, r0, r2, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r10, java.util.Collection r11, kotlin.coroutines.Continuation r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00871
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2c:
            r10 = 0
            r11 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            goto L7b
        L48:
            r1 = move-exception
            goto Lac
        L4b:
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = 0
            r5 = r10
            r10 = 0
            r4 = 0
            r3 = r5
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> La9
            r3 = r11
            r11 = r10
            r10 = r2
            r2 = r6
            r6 = r3
            r3 = r7
        L61:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r9 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r9
        L7b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> La1
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> La1
            if (r12 == 0) goto L97
            java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> La1
            r8 = 0
            if (r12 == 0) goto L8d
            r7.add(r12)     // Catch: java.lang.Throwable -> La1
        L8d:
            r12 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        L97:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La1
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        La1:
            r12 = move-exception
            r4 = r1
            r1 = r12
            r12 = r0
            r0 = r4
            r4 = r5
            r5 = r6
            goto Lac
        La9:
            r1 = move-exception
            r11 = r10
            r10 = r2
        Lac:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r11, kotlinx.coroutines.channels.SendChannel r12, kotlin.coroutines.Continuation r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L5f;
                case 1: goto L42;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2c:
            r11 = 0
            r12 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            r5 = 0
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L5c
            goto Laf
        L42:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r5 = 0
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            r6 = r4
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r4 = (kotlinx.coroutines.channels.SendChannel) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L5c
            r7 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L8a
        L5c:
            r1 = move-exception
            goto Ld6
        L5f:
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = 0
            r6 = r11
            r11 = 0
            r5 = 0
            r3 = r6
            r4 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> Ld3
            r10 = r13
            r13 = r11
            r11 = r2
            r2 = r1
            r1 = r0
            r0 = r10
        L75:
            r1.L$0 = r12     // Catch: java.lang.Throwable -> Lcc
            r1.L$1 = r6     // Catch: java.lang.Throwable -> Lcc
            r1.L$2 = r7     // Catch: java.lang.Throwable -> Lcc
            r3 = 1
            r1.label = r3     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r3 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> Lcc
            if (r3 != r2) goto L85
            return r2
        L85:
            r10 = r7
            r7 = r12
            r12 = r13
            r13 = r3
            r3 = r10
        L8a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lc6
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r13 == 0) goto Lbc
            java.lang.Object r13 = r3.next()     // Catch: java.lang.Throwable -> Lc6
            r8 = 0
            if (r13 == 0) goto Lb8
            r1.L$0 = r7     // Catch: java.lang.Throwable -> Lc6
            r1.L$1 = r6     // Catch: java.lang.Throwable -> Lc6
            r1.L$2 = r3     // Catch: java.lang.Throwable -> Lc6
            r9 = 2
            r1.label = r9     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r9 = r7.send(r13, r1)     // Catch: java.lang.Throwable -> Lc6
            if (r9 != r2) goto La9
            return r2
        La9:
            r13 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r3
            r3 = r8
        Laf:
            r10 = r13
            r13 = r12
            r12 = r7
            r7 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            goto Lbb
        Lb8:
            r13 = r12
            r12 = r7
            r7 = r3
        Lbb:
            goto L75
        Lbc:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc6
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        Lc6:
            r13 = move-exception
            r10 = r1
            r1 = r13
            r13 = r0
            r0 = r10
            goto Ld6
        Lcc:
            r12 = move-exception
            r10 = r1
            r1 = r12
            r12 = r13
            r13 = r0
            r0 = r10
            goto Ld6
        Ld3:
            r1 = move-exception
            r12 = r11
            r11 = r2
        Ld6:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00881
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00881) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3e;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3c
            r6 = r8
            goto L5c
        L3c:
            r1 = move-exception
            goto L75
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            r3 = r7
            r7 = 0
            r4 = 0
            r2 = r3
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L74
            r2 = r6
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L74
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L74
            r6 = 1
            r0.label = r6     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L74
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r1 = r5
        L5c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r6.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L3c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r5
        L6c:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        L74:
            r1 = move-exception
        L75:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00891
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L40;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3e
            r5 = r9
            r7 = r2
            r2 = r3
            goto L5d
        L3e:
            r1 = move-exception
        L3f:
            goto L74
        L40:
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = r8
            r8 = 0
            r2 = 0
            r5 = r4
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L72
            r5 = 1
            r0.label = r5     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L72
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r1 = r6
        L5d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L6f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto L6a
        L66:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r2)
            return r3
        L6a:
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> L6f
            goto L66
        L6f:
            r1 = move-exception
            r3 = r2
            goto L3f
        L72:
            r1 = move-exception
            r3 = r2
        L74:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> L77
        L77:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.flatMap(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r17, java.lang.Object r18, kotlin.coroutines.Continuation r19) {
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00911
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00911) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r1.<init>(r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L51;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r1.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$0
            r11 = 0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L4e
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto L8e
        L4e:
            r0 = move-exception
            goto Le5
        L51:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r17
            r5 = r18
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            r7 = 0
            r8 = r3
            r3 = 0
            r11 = 0
            r9 = r8
            r10 = 0
            kotlinx.coroutines.channels.ChannelIterator r12 = r9.iterator()     // Catch: java.lang.Throwable -> Le2
            r9 = r6
            r6 = r10
            r10 = r5
            r5 = r3
            r3 = r7
            r7 = r12
        L70:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Le0
            r1.L$1 = r9     // Catch: java.lang.Throwable -> Le0
            r1.L$2 = r8     // Catch: java.lang.Throwable -> Le0
            r1.L$3 = r7     // Catch: java.lang.Throwable -> Le0
            r1.label = r4     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r12 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> Le0
            if (r12 != r0) goto L81
            return r0
        L81:
            r16 = r3
            r3 = r2
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r16
        L8e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Ld9
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Ld9
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Ld9
            r13 = r2
            r14 = 0
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r13)     // Catch: java.lang.Throwable -> Ld9
            if (r15 == 0) goto Lac
            int r0 = r10.element     // Catch: java.lang.Throwable -> Ld9
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Throwable -> Ld9
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r12)
            return r0
        Lac:
            int r2 = r10.element     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2 + r4
            r10.element = r2     // Catch: java.lang.Throwable -> Lbc
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            goto L70
        Lbc:
            r0 = move-exception
            r2 = r3
            r3 = r5
            r5 = r6
            r8 = r9
            r11 = r12
            goto Le5
        Lc3:
            r8 = r9
            r11 = r12
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld4
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r11)
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        Ld4:
            r0 = move-exception
            r2 = r3
            r3 = r5
            r5 = r6
            goto Le5
        Ld9:
            r0 = move-exception
            r8 = r9
            r11 = r12
            r2 = r3
            r3 = r5
            r5 = r6
            goto Le5
        Le0:
            r0 = move-exception
            goto Le5
        Le2:
            r0 = move-exception
            r5 = r3
            r3 = r7
        Le5:
            r4 = r0
            throw r0     // Catch: java.lang.Throwable -> Le8
        Le8:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00921
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L5c;
                case 1: goto L49;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            r9 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            r6 = 0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L46
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            goto La1
        L46:
            r1 = move-exception
            goto Lcd
        L49:
            r9 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r6 = 0
            java.lang.Object r4 = r0.L$0
            r5 = r4
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> Lcc
            r4 = r3
            r3 = r2
            r2 = r10
            goto L78
        L5c:
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r9
            r9 = 0
            r6 = 0
            r2 = r5
            r3 = 0
            kotlinx.coroutines.channels.ChannelIterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> Lcc
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lcc
            r0.L$1 = r4     // Catch: java.lang.Throwable -> Lcc
            r2 = 1
            r0.label = r2     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r2 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> Lcc
            if (r2 != r1) goto L78
            return r1
        L78:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lcc
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> Lcc
            r8 = r3
            r3 = r2
            r2 = r8
        L87:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lcc
            r0.L$1 = r4     // Catch: java.lang.Throwable -> Lcc
            r0.L$2 = r3     // Catch: java.lang.Throwable -> Lcc
            r7 = 2
            r0.label = r7     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r7 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> Lcc
            if (r7 != r1) goto L97
            return r1
        L97:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lbc
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lbc
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> Lbc
            r4 = r3
            r3 = r10
            r10 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L87
        Lb7:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r7)
            return r4
        Lbc:
            r10 = move-exception
            r5 = r6
            r6 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
            goto Lcd
        Lc4:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "ReceiveChannel is empty."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcc
            throw r1     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r1 = move-exception
        Lcd:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r17, java.lang.Object r18, kotlin.coroutines.Continuation r19) {
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00931
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00931) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r1.<init>(r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L56;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            r8 = 0
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r12 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L53
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto La0
        L53:
            r0 = move-exception
            goto Le3
        L56:
            kotlin.ResultKt.throwOnFailure(r2)
            r3 = r17
            r5 = r18
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            r7 = -1
            r6.element = r7
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            r8 = 0
            r9 = r3
            r3 = 0
            r10 = 0
            r11 = r9
            r12 = 0
            kotlinx.coroutines.channels.ChannelIterator r13 = r11.iterator()     // Catch: java.lang.Throwable -> Ldf
            r11 = r6
            r6 = r12
            r12 = r5
            r5 = r3
            r3 = r8
            r8 = r10
            r10 = r7
            r7 = r13
        L7f:
            r1.L$0 = r12     // Catch: java.lang.Throwable -> L53
            r1.L$1 = r11     // Catch: java.lang.Throwable -> L53
            r1.L$2 = r10     // Catch: java.lang.Throwable -> L53
            r1.L$3 = r9     // Catch: java.lang.Throwable -> L53
            r1.L$4 = r7     // Catch: java.lang.Throwable -> L53
            r1.label = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r13 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> L53
            if (r13 != r0) goto L92
            return r0
        L92:
            r16 = r3
            r3 = r2
            r2 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r16
        La0:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Ld8
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Ld8
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Ld8
            r14 = 0
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            if (r15 == 0) goto Lb7
            int r2 = r11.element     // Catch: java.lang.Throwable -> Ld8
            r12.element = r2     // Catch: java.lang.Throwable -> Ld8
        Lb7:
            int r2 = r11.element     // Catch: java.lang.Throwable -> Ld8
            int r2 = r2 + r4
            r11.element = r2     // Catch: java.lang.Throwable -> Ld8
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            goto L7f
        Lc8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld8
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r9)
            int r0 = r12.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        Ld8:
            r0 = move-exception
            r2 = r3
            r3 = r5
            r5 = r6
            r8 = r9
            r9 = r10
            goto Le3
        Ldf:
            r0 = move-exception
            r5 = r3
            r3 = r8
            r8 = r10
        Le3:
            r4 = r0
            throw r0     // Catch: java.lang.Throwable -> Le6
        Le6:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00941
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L5e;
                case 1: goto L48;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            r9 = 0
            r2 = 0
            java.lang.Object r4 = r0.L$2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L46
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            goto Lab
        L46:
            r9 = move-exception
            goto L5c
        L48:
            r2 = 0
            r9 = 0
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5a
            r7 = r10
            r6 = r5
            r5 = r9
            r9 = r3
            goto L7b
        L5a:
            r9 = move-exception
            r6 = r5
        L5c:
            goto Ld6
        L5e:
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r9
            r2 = 0
            r9 = 0
            r4 = r6
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Ld3
            r4 = r7
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Ld3
            r0.L$1 = r4     // Catch: java.lang.Throwable -> Ld3
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r7 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r7 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lcf
            if (r7 != 0) goto L88
        L84:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            return r3
        L88:
            r3 = r9
            java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> Lcd
            r8 = r4
            r4 = r9
            r9 = r5
            r5 = r8
        L91:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Lcd
            r0.L$1 = r5     // Catch: java.lang.Throwable -> Lcd
            r0.L$2 = r4     // Catch: java.lang.Throwable -> Lcd
            r7 = 2
            r0.label = r7     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r7 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r7 != r1) goto La1
            return r1
        La1:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        Lab:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lc6
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            if (r10 == 0) goto Lc1
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> Lc6
            r5 = r4
            r4 = r10
            r10 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            goto L91
        Lc1:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r5
        Lc6:
            r9 = move-exception
            r6 = r7
            r10 = r0
            r0 = r1
            r2 = r3
            r3 = r4
            goto Ld6
        Lcd:
            r9 = move-exception
            goto Ld6
        Lcf:
            r1 = move-exception
            r3 = r9
            r9 = r1
            goto L5c
        Ld3:
            r1 = move-exception
            r3 = r9
            r9 = r1
        Ld6:
            r1 = r9
            throw r9     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            throw r9
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r0, r1, r2)
            return r0
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function3 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexed(r1, r2, r3)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapIndexedNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map(r1, r2, r3)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.filterNotNull(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.mapNotNull(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r10, java.util.Comparator r11, kotlin.coroutines.Continuation r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00971
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L68;
                case 1: goto L4d;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            r10 = 0
            r11 = 0
            java.lang.Object r2 = r0.L$3
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L4a
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            goto Lb9
        L4a:
            r10 = move-exception
            goto Lf2
        L4d:
            r11 = 0
            r10 = 0
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r0.L$0
            java.util.Comparator r5 = (java.util.Comparator) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L64
            r7 = r2
            r2 = r3
            r6 = r5
            r5 = r4
            r4 = r12
            goto L8b
        L64:
            r10 = move-exception
            r5 = r4
            goto Lf2
        L68:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r11
            r11 = 0
            r2 = 0
            r4 = r10
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Lee
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lee
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Lee
            r0.L$2 = r7     // Catch: java.lang.Throwable -> Lee
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> Lee
            if (r4 != r1) goto L87
            return r1
        L87:
            r9 = r5
            r5 = r10
            r10 = r6
            r6 = r9
        L8b:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> Leb
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Leb
            if (r4 != 0) goto L97
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            return r3
        L97:
            r3 = r2
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> Le9
            r4 = r7
        L9d:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Le9
            r0.L$1 = r5     // Catch: java.lang.Throwable -> Le9
            r0.L$2 = r4     // Catch: java.lang.Throwable -> Le9
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Le9
            r7 = 2
            r0.label = r7     // Catch: java.lang.Throwable -> Le9
            java.lang.Object r7 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> Le9
            if (r7 != r1) goto Laf
            return r1
        Laf:
            r9 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r9
        Lb9:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Le3
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto Lde
            java.lang.Object r12 = r5.next()     // Catch: java.lang.Throwable -> Le3
            int r8 = r7.compare(r3, r12)     // Catch: java.lang.Throwable -> Le3
            if (r8 >= 0) goto Ld5
            r3 = r4
            r4 = r2
            r2 = r12
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L9d
        Ld5:
            r12 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L9d
        Lde:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        Le3:
            r10 = move-exception
            r5 = r6
            r3 = r4
            r12 = r0
            r0 = r1
            goto Lf2
        Le9:
            r10 = move-exception
            goto Lf2
        Leb:
            r10 = move-exception
            r3 = r2
            goto Lf2
        Lee:
            r1 = move-exception
            r5 = r10
            r10 = r1
            r3 = r2
        Lf2:
            r1 = r10
            throw r10     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r10
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r10, java.util.Comparator r11, kotlin.coroutines.Continuation r12) {
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00981
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L68;
                case 1: goto L4d;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            r10 = 0
            r11 = 0
            java.lang.Object r2 = r0.L$3
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            java.util.Comparator r6 = (java.util.Comparator) r6
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L4a
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            goto Lb9
        L4a:
            r10 = move-exception
            goto Lf2
        L4d:
            r11 = 0
            r10 = 0
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r0.L$0
            java.util.Comparator r5 = (java.util.Comparator) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L64
            r7 = r2
            r2 = r3
            r6 = r5
            r5 = r4
            r4 = r12
            goto L8b
        L64:
            r10 = move-exception
            r5 = r4
            goto Lf2
        L68:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r11
            r11 = 0
            r2 = 0
            r4 = r10
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Lee
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lee
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Lee
            r0.L$2 = r7     // Catch: java.lang.Throwable -> Lee
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> Lee
            if (r4 != r1) goto L87
            return r1
        L87:
            r9 = r5
            r5 = r10
            r10 = r6
            r6 = r9
        L8b:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> Leb
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Leb
            if (r4 != 0) goto L97
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            return r3
        L97:
            r3 = r2
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> Le9
            r4 = r7
        L9d:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Le9
            r0.L$1 = r5     // Catch: java.lang.Throwable -> Le9
            r0.L$2 = r4     // Catch: java.lang.Throwable -> Le9
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Le9
            r7 = 2
            r0.label = r7     // Catch: java.lang.Throwable -> Le9
            java.lang.Object r7 = r4.hasNext(r0)     // Catch: java.lang.Throwable -> Le9
            if (r7 != r1) goto Laf
            return r1
        Laf:
            r9 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r9
        Lb9:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Le3
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto Lde
            java.lang.Object r12 = r5.next()     // Catch: java.lang.Throwable -> Le3
            int r8 = r7.compare(r3, r12)     // Catch: java.lang.Throwable -> Le3
            if (r8 <= 0) goto Ld5
            r3 = r4
            r4 = r2
            r2 = r12
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L9d
        Ld5:
            r12 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L9d
        Lde:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        Le3:
            r10 = move-exception
            r5 = r6
            r3 = r4
            r12 = r0
            r0 = r1
            goto Lf2
        Le9:
            r10 = move-exception
            goto Lf2
        Leb:
            r10 = move-exception
            r3 = r2
            goto Lf2
        Lee:
            r1 = move-exception
            r5 = r10
            r10 = r1
            r3 = r2
        Lf2:
            r1 = r10
            throw r10     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r10
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r8, kotlin.coroutines.Continuation r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00991
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L39
            r7 = r9
            goto L55
        L39:
            r1 = move-exception
            goto L68
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            r8 = 0
            r4 = 0
            r5 = r2
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L67
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L67
            r0.label = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L67
            if (r7 != r1) goto L54
            return r1
        L54:
            r1 = r6
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L39
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Throwable -> L39
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r4)
            return r3
        L67:
            r1 = move-exception
        L68:
            r3 = r1
            throw r1     // Catch: java.lang.Throwable -> L6b
        L6b:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel r3) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 1
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.map$default(r3, r1, r0, r2, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01011
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L51;
                case 1: goto L3d;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            r9 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            r4 = 0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3a
            r7 = r10
            goto L8e
        L3a:
            r1 = move-exception
            goto Lac
        L3d:
            r9 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L4e
            r6 = r3
            r3 = r10
            goto L71
        L4e:
            r1 = move-exception
            r3 = r5
            goto Lac
        L51:
            kotlin.ResultKt.throwOnFailure(r10)
            r3 = r9
            r9 = 0
            r4 = 0
            r2 = r3
            r5 = 0
            kotlinx.coroutines.channels.ChannelIterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> Lab
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Lab
            r0.L$1 = r6     // Catch: java.lang.Throwable -> Lab
            r2 = 1
            r0.label = r2     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> Lab
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r8 = r3
            r3 = r2
            r2 = r5
            r5 = r8
        L71:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto La3
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4e
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L4e
            r7 = 2
            r0.label = r7     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L4e
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r1 = r2
            r2 = r3
            r3 = r5
        L8e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto L9b
        L97:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r2
        L9b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "ReceiveChannel has more than one element."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r5     // Catch: java.lang.Throwable -> L3a
        La3:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "ReceiveChannel is empty."
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        Lab:
            r1 = move-exception
        Lac:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r10, kotlin.coroutines.Continuation r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01021
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01021) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L5b;
                case 1: goto L3f;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            r10 = 0
            r1 = 0
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L3c
            r8 = r11
            r5 = r3
            goto L9f
        L3c:
            r10 = move-exception
            goto Lc3
        L3f:
            r10 = 0
            r2 = 0
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L54
            r6 = r2
            r2 = r10
            r10 = r6
            r7 = r4
            r6 = r5
            r5 = r11
            r4 = r3
            goto L7c
        L54:
            r1 = move-exception
            r4 = r5
            r9 = r1
            r1 = r10
            r10 = r9
            goto Lc3
        L5b:
            kotlin.ResultKt.throwOnFailure(r11)
            r4 = r10
            r10 = 0
            r2 = 0
            r5 = r4
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> Lbe
            r0.L$0 = r4     // Catch: java.lang.Throwable -> Lbe
            r0.L$1 = r7     // Catch: java.lang.Throwable -> Lbe
            r5 = 1
            r0.label = r5     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r5 != r1) goto L77
            return r1
        L77:
            r9 = r2
            r2 = r10
            r10 = r6
            r6 = r4
            r4 = r9
        L7c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r5 != 0) goto L89
        L85:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r3
        L89:
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Throwable -> Lb4
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Lb4
            r0.L$1 = r5     // Catch: java.lang.Throwable -> Lb4
            r8 = 2
            r0.label = r8     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r8 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r8 != r1) goto L9b
            return r1
        L9b:
            r1 = r2
            r2 = r5
            r5 = r4
            r4 = r6
        L9f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = r8.booleanValue()     // Catch: java.lang.Throwable -> Lb1
            if (r6 == 0) goto Lac
        La8:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r3
        Lac:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r2
        Lb1:
            r10 = move-exception
            r3 = r5
            goto Lc3
        Lb4:
            r10 = move-exception
            r1 = r2
            r3 = r4
            r4 = r6
            goto Lc3
        Lb9:
            r10 = move-exception
            r3 = r4
            r1 = r2
            r4 = r6
            goto Lc3
        Lbe:
            r1 = move-exception
            r3 = r1
            r1 = r10
            r10 = r3
            r3 = r2
        Lc3:
            r2 = r10
            throw r10     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r2)
            throw r10
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.CoroutineContext r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1
            r2 = 0
            r0.<init>(r10, r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r11 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.take(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10, kotlin.jvm.functions.Function2 r11) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1
            r2 = 0
            r0.<init>(r9, r11, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.takeWhile(r0, r1, r2)
            return r0
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.coroutines.Continuation<? super C> r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01051
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L67;
                case 1: goto L4a;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2c:
            r11 = 0
            r12 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            r5 = 0
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L64
            r10 = r13
            r13 = r12
            r12 = r7
            r7 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            goto Lb3
        L4a:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r5 = 0
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            r6 = r4
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r4 = (kotlinx.coroutines.channels.SendChannel) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L64
            r7 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L92
        L64:
            r1 = move-exception
            goto Lcf
        L67:
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = 0
            r6 = r11
            r11 = 0
            r5 = 0
            r3 = r6
            r4 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> Lcc
            r10 = r13
            r13 = r11
            r11 = r2
            r2 = r1
            r1 = r0
            r0 = r10
        L7d:
            r1.L$0 = r12     // Catch: java.lang.Throwable -> Lc5
            r1.L$1 = r6     // Catch: java.lang.Throwable -> Lc5
            r1.L$2 = r7     // Catch: java.lang.Throwable -> Lc5
            r3 = 1
            r1.label = r3     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r7.hasNext(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r3 != r2) goto L8d
            return r2
        L8d:
            r10 = r7
            r7 = r12
            r12 = r13
            r13 = r3
            r3 = r10
        L92:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lbf
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Lbf
            if (r13 == 0) goto Lb5
            java.lang.Object r13 = r3.next()     // Catch: java.lang.Throwable -> Lbf
            r8 = 0
            r1.L$0 = r7     // Catch: java.lang.Throwable -> Lbf
            r1.L$1 = r6     // Catch: java.lang.Throwable -> Lbf
            r1.L$2 = r3     // Catch: java.lang.Throwable -> Lbf
            r9 = 2
            r1.label = r9     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r9 = r7.send(r13, r1)     // Catch: java.lang.Throwable -> Lbf
            if (r9 != r2) goto Laf
            return r2
        Laf:
            r13 = r12
            r12 = r7
            r7 = r3
            r3 = r8
        Lb3:
            goto L7d
        Lb5:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        Lbf:
            r13 = move-exception
            r10 = r1
            r1 = r13
            r13 = r0
            r0 = r10
            goto Lcf
        Lc5:
            r12 = move-exception
            r10 = r1
            r1 = r12
            r12 = r13
            r13 = r0
            r0 = r10
            goto Lcf
        Lcc:
            r1 = move-exception
            r12 = r11
            r11 = r2
        Lcf:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r2)
            throw r1
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, C r12, kotlin.coroutines.Continuation<? super C> r13) {
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01061
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2c:
            r11 = 0
            r12 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L7b
        L48:
            r1 = move-exception
            goto Lab
        L4b:
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = 0
            r5 = r11
            r11 = 0
            r4 = 0
            r3 = r5
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> La8
            r3 = r12
            r12 = r11
            r11 = r2
            r2 = r6
            r6 = r3
            r3 = r7
        L61:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r10 = r0
            r0 = r13
            r13 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r10
        L7b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> La0
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> La0
            if (r13 == 0) goto L96
            java.lang.Object r13 = r4.next()     // Catch: java.lang.Throwable -> La0
            r8 = r13
            r9 = 0
            r7.add(r8)     // Catch: java.lang.Throwable -> La0
            r13 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        L96:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        La0:
            r13 = move-exception
            r4 = r1
            r1 = r13
            r13 = r0
            r0 = r4
            r4 = r5
            r5 = r6
            goto Lab
        La8:
            r1 = move-exception
            r12 = r11
            r11 = r2
        Lab:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r13, M r14, kotlin.coroutines.Continuation<? super M> r15) {
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L14
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2c:
            r13 = 0
            r14 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            r4 = 0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L48
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r15
            goto L7b
        L48:
            r1 = move-exception
            goto Lb5
        L4b:
            kotlin.ResultKt.throwOnFailure(r15)
            r2 = 0
            r5 = r13
            r13 = 0
            r4 = 0
            r3 = r5
            r6 = 0
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> Lb2
            r3 = r14
            r14 = r13
            r13 = r2
            r2 = r6
            r6 = r3
            r3 = r7
        L61:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L48
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L48
            r7 = 1
            r0.label = r7     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r3.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r7 != r1) goto L71
            return r1
        L71:
            r12 = r0
            r0 = r15
            r15 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r12
        L7b:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> Laa
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> Laa
            if (r15 == 0) goto La0
            java.lang.Object r15 = r4.next()     // Catch: java.lang.Throwable -> Laa
            r8 = r15
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> Laa
            r9 = 0
            java.lang.Object r10 = r8.getFirst()     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r8.getSecond()     // Catch: java.lang.Throwable -> Laa
            r7.put(r10, r11)     // Catch: java.lang.Throwable -> Laa
            r15 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto L61
        La0:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Laa
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r7
        Laa:
            r15 = move-exception
            r4 = r1
            r1 = r15
            r15 = r0
            r0 = r4
            r4 = r5
            r5 = r6
            goto Lb5
        Lb2:
            r1 = move-exception
            r14 = r13
            r13 = r2
        Lb5:
            r2 = r1
            throw r1     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r1 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMap(r1, r0, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r0
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super java.util.Set<E>> r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toCollection(r1, r0, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toMutableSet(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel r9, kotlin.coroutines.CoroutineContext r10) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumes(r9)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1
            r2 = 0
            r0.<init>(r9, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.withIndex(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.ReceiveChannel r8) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01081.INSTANCE
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.channels.ChannelsKt.zip$default(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r9, kotlinx.coroutines.channels.ReceiveChannel<? extends R> r10, kotlin.coroutines.CoroutineContext r11, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r12) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            r0 = 2
            kotlinx.coroutines.channels.ReceiveChannel[] r0 = new kotlinx.coroutines.channels.ReceiveChannel[r0]
            r2 = 0
            r0[r2] = r9
            r2 = 1
            r0[r2] = r10
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.channels.ChannelsKt.consumesAll(r0)
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2
            r2 = 0
            r0.<init>(r10, r9, r12, r2)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r11
            kotlinx.coroutines.channels.ReceiveChannel r11 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto La
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        La:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt.zip(r0, r1, r2, r3)
            return r0
    }
}
