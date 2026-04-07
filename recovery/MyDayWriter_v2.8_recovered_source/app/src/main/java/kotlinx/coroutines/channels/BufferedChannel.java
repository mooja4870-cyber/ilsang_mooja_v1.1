package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b$\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004à\u0001á\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\u001f\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0003\u0010\u0095\u0001J\u001f\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001J>\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ/\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u0019\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u001c\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0082\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J8\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J\u001e\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J'\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J'\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÈ\u0001\u0010Æ\u0001J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010Ê\u0001\u001a\u00020\u0010H\u0002J(\u0010Ë\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010Ê\u0001\u001a\u00020\u0010H\u0002J5\u0010Ì\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Í\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Î\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Ï\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Ð\u0001JK\u0010Ñ\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Ï\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Ð\u0001J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ó\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ô\u0001\u001a\u00020\u00072\u0007\u0010Ó\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Õ\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÖ\u0001J$\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ú\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Û\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ü\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Þ\u0001J#\u0010ß\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006â\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", "", "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", "", "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", "", "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", "index", "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "r", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", "i", "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", "value", "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BufferedChannel<E> implements kotlinx.coroutines.channels.Channel<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _closeCause$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater bufferEnd$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater closeHandler$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater receiveSegment$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater receivers$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater sendSegment$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u0006H\u0096B¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "receiveResult", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", "index", "", "r", "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class BufferedChannelIterator implements kotlinx.coroutines.channels.ChannelIterator<E>, kotlinx.coroutines.Waiter {
        private kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> continuation;
        private java.lang.Object receiveResult;
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> this$0;

        public BufferedChannelIterator(kotlinx.coroutines.channels.BufferedChannel r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_RECEIVE_RESULT$p()
                r1.receiveResult = r0
                return
        }

        public static final /* synthetic */ java.lang.Object access$hasNextOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, long r4, kotlin.coroutines.Continuation r6) {
                java.lang.Object r0 = r1.hasNextOnNoWaiterSuspend(r2, r3, r4, r6)
                return r0
        }

        public static final /* synthetic */ void access$onClosedHasNextNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator r0) {
                r0.onClosedHasNextNoWaiterSuspend()
                return
        }

        public static final /* synthetic */ void access$setContinuation$p(kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator r0, kotlinx.coroutines.CancellableContinuationImpl r1) {
                r0.continuation = r1
                return
        }

        public static final /* synthetic */ void access$setReceiveResult$p(kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator r0, java.lang.Object r1) {
                r0.receiveResult = r1
                return
        }

        private final java.lang.Object hasNextOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r26, int r27, long r28, kotlin.coroutines.Continuation<? super java.lang.Boolean> r30) {
                r25 = this;
                r1 = r25
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1.this$0
                r2 = 0
                r3 = r30
                r4 = 0
                kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
                kotlinx.coroutines.CancellableContinuationImpl r5 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r5)
                r6 = r5
                r7 = 0
                access$setContinuation$p(r1, r6)     // Catch: java.lang.Throwable -> L172
                r8 = r0
                r14 = 0
                r13 = r1
                kotlinx.coroutines.Waiter r13 = (kotlinx.coroutines.Waiter) r13     // Catch: java.lang.Throwable -> L172
                r9 = r26
                r10 = r27
                r11 = r28
                java.lang.Object r13 = kotlinx.coroutines.channels.BufferedChannel.access$updateCellReceive(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L172
                r15 = r13
                kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L172
                if (r15 != r9) goto L4a
                r0 = r1
                kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L3f
                r9 = r26
                r10 = r27
                kotlinx.coroutines.channels.BufferedChannel.access$prepareReceiverForSuspension(r8, r0, r9, r10)     // Catch: java.lang.Throwable -> L3d
                r21 = r2
                r22 = r3
                goto L15e
            L3d:
                r0 = move-exception
                goto L44
            L3f:
                r0 = move-exception
                r9 = r26
                r10 = r27
            L44:
                r21 = r2
                r22 = r3
                goto L177
            L4a:
                r9 = r26
                r10 = r27
                kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L172
                r16 = 1
                if (r15 != r11) goto L137
                long r17 = r8.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L172
                int r11 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
                if (r11 >= 0) goto L61
                r9.cleanPrev()     // Catch: java.lang.Throwable -> L3d
            L61:
                r17 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.channels.BufferedChannel.access$getReceiveSegment$volatile$FU()     // Catch: java.lang.Throwable -> L172
                java.lang.Object r11 = r11.get(r8)     // Catch: java.lang.Throwable -> L172
                kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11     // Catch: java.lang.Throwable -> L172
            L70:
                boolean r13 = r8.isClosedForReceive()     // Catch: java.lang.Throwable -> L172
                if (r13 == 0) goto L81
                r0 = 0
                access$onClosedHasNextNoWaiterSuspend(r1)     // Catch: java.lang.Throwable -> L3d
                r21 = r2
                r22 = r3
                goto L15e
            L81:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = kotlinx.coroutines.channels.BufferedChannel.access$getReceivers$volatile$FU()     // Catch: java.lang.Throwable -> L172
                long r18 = r13.getAndIncrement(r8)     // Catch: java.lang.Throwable -> L172
                int r13 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L172
                long r12 = (long) r13     // Catch: java.lang.Throwable -> L172
                long r12 = r18 / r12
                r21 = r2
                int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L133
                r22 = r3
                long r2 = (long) r2
                long r2 = r18 % r2
                int r2 = (int) r2     // Catch: java.lang.Throwable -> L170
                r23 = r2
                long r2 = r11.id     // Catch: java.lang.Throwable -> L170
                int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r2 == 0) goto Lac
                kotlinx.coroutines.channels.ChannelSegment r2 = kotlinx.coroutines.channels.BufferedChannel.access$findSegmentReceive(r8, r12, r11)     // Catch: java.lang.Throwable -> L170
                if (r2 != 0) goto Lab
                r2 = r21
                r3 = r22
                goto L70
            Lab:
                r11 = r2
            Lac:
                r2 = r12
                r13 = r1
                kotlinx.coroutines.Waiter r13 = (kotlinx.coroutines.Waiter) r13     // Catch: java.lang.Throwable -> L170
                r9 = r11
                r11 = r18
                r10 = r23
                r18 = r2
                r2 = 0
                java.lang.Object r3 = kotlinx.coroutines.channels.BufferedChannel.access$updateCellReceive(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L170
                kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L170
                if (r3 != r13) goto Ld9
                r0 = r1
                kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L170
                boolean r0 = r0 instanceof kotlinx.coroutines.Waiter     // Catch: java.lang.Throwable -> L170
                if (r0 == 0) goto Lce
                r0 = r1
                kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L170
                goto Lcf
            Lce:
                r0 = r2
            Lcf:
                if (r0 == 0) goto Ld4
                kotlinx.coroutines.channels.BufferedChannel.access$prepareReceiverForSuspension(r8, r0, r9, r10)     // Catch: java.lang.Throwable -> L170
            Ld4:
                r0 = 0
                r24 = r3
                goto L121
            Ld9:
                kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L170
                if (r3 != r13) goto Lf5
                long r23 = r8.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L170
                int r13 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
                if (r13 >= 0) goto Lea
                r9.cleanPrev()     // Catch: java.lang.Throwable -> L170
            Lea:
                r10 = r27
                r11 = r9
                r2 = r21
                r3 = r22
                r9 = r26
                goto L70
            Lf5:
                kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()     // Catch: java.lang.Throwable -> L170
                if (r3 == r13) goto L124
                r9.cleanPrev()     // Catch: java.lang.Throwable -> L170
                r13 = r3
                r20 = 0
                access$setReceiveResult$p(r1, r13)     // Catch: java.lang.Throwable -> L170
                access$setContinuation$p(r1, r2)     // Catch: java.lang.Throwable -> L170
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r16)     // Catch: java.lang.Throwable -> L170
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement     // Catch: java.lang.Throwable -> L170
                if (r0 == 0) goto L11a
                r24 = r3
                kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> L170
                kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r13, r3)     // Catch: java.lang.Throwable -> L170
                goto L11d
            L11a:
                r24 = r3
                r0 = 0
            L11d:
                r6.resume(r2, r0)     // Catch: java.lang.Throwable -> L170
            L121:
                goto L15e
            L124:
                r24 = r3
                r0 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L170
                java.lang.String r3 = "unexpected"
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L170
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L170
                throw r2     // Catch: java.lang.Throwable -> L170
            L133:
                r0 = move-exception
                r22 = r3
                goto L177
            L137:
                r21 = r2
                r22 = r3
                r26.cleanPrev()     // Catch: java.lang.Throwable -> L170
                r2 = r15
                r3 = 0
                access$setReceiveResult$p(r1, r2)     // Catch: java.lang.Throwable -> L170
                r9 = 0
                access$setContinuation$p(r1, r9)     // Catch: java.lang.Throwable -> L170
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r16)     // Catch: java.lang.Throwable -> L170
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement     // Catch: java.lang.Throwable -> L170
                if (r0 == 0) goto L158
                kotlin.coroutines.CoroutineContext r9 = r6.getContext()     // Catch: java.lang.Throwable -> L170
                kotlin.jvm.functions.Function1 r12 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r2, r9)     // Catch: java.lang.Throwable -> L170
                goto L159
            L158:
                r12 = r9
            L159:
                r6.resume(r10, r12)     // Catch: java.lang.Throwable -> L170
            L15e:
                java.lang.Object r0 = r5.getResult()
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r2) goto L16e
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r30)
            L16e:
                return r0
            L170:
                r0 = move-exception
                goto L177
            L172:
                r0 = move-exception
                r21 = r2
                r22 = r3
            L177:
                r5.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
                throw r0
        }

        private final boolean onClosedHasNext() {
                r2 = this;
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
                r2.receiveResult = r0
                kotlinx.coroutines.channels.BufferedChannel<E> r0 = r2.this$0
                java.lang.Throwable r0 = r0.getCloseCause()
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r0)
                throw r1
        }

        private final void onClosedHasNextNoWaiterSuspend() {
                r5 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r5.continuation
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r5.continuation = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
                r5.receiveResult = r1
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r5.this$0
                java.lang.Throwable r1 = r1.getCloseCause()
                if (r1 != 0) goto L28
                r2 = r0
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                kotlin.Result$Companion r3 = kotlin.Result.Companion
                r3 = 0
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
                r2.resumeWith(r3)
                goto L52
            L28:
                r2 = r0
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
                if (r4 == 0) goto L44
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                boolean r4 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
                if (r4 != 0) goto L3a
                goto L44
            L3a:
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
                java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r4)
                goto L45
            L44:
                r4 = r1
            L45:
                kotlin.Result$Companion r3 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.ResultKt.createFailure(r4)
                java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
                r2.resumeWith(r3)
            L52:
                return
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> r21) {
                r20 = this;
                r0 = r20
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r0.this$0
                r2 = r1
                r7 = 0
                r8 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.access$getReceiveSegment$volatile$FU()
                java.lang.Object r1 = r1.get(r2)
                kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            L12:
                boolean r3 = r2.isClosedForReceive()
                if (r3 == 0) goto L24
                r3 = 0
                boolean r3 = r0.onClosedHasNext()
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                goto L8f
            L24:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.access$getReceivers$volatile$FU()
                long r3 = r3.getAndIncrement(r2)
                int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
                long r5 = (long) r5
                long r9 = r3 / r5
                int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
                long r5 = (long) r5
                long r5 = r3 % r5
                int r5 = (int) r5
                long r11 = r1.id
                int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r6 == 0) goto L45
                kotlinx.coroutines.channels.ChannelSegment r6 = kotlinx.coroutines.channels.BufferedChannel.access$findSegmentReceive(r2, r9, r1)
                if (r6 != 0) goto L44
                goto L12
            L44:
                r1 = r6
            L45:
                r18 = r3
                r4 = r5
                r5 = r18
                r3 = r1
                java.lang.Object r11 = kotlinx.coroutines.channels.BufferedChannel.access$updateCellReceive(r2, r3, r4, r5, r7)
                r15 = r4
                r13 = r5
                r12 = r7
                r7 = r2
                r6 = r3
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
                if (r11 == r1) goto L90
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
                if (r11 != r1) goto L6f
                long r1 = r7.getSendersCounter$kotlinx_coroutines_core()
                int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r1 >= 0) goto L6b
                r6.cleanPrev()
            L6b:
                r1 = r6
                r2 = r7
                r7 = r12
                goto L12
            L6f:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
                if (r11 != r1) goto L81
                r1 = r6
                r2 = r15
                r3 = r13
                r16 = 0
                r5 = r21
                java.lang.Object r17 = r0.hasNextOnNoWaiterSuspend(r1, r2, r3, r5)
                return r17
            L81:
                r6.cleanPrev()
                r1 = r11
                r2 = 0
                r0.receiveResult = r1
                r1 = 1
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            L8f:
                return r3
            L90:
                r1 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "unreachable"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r1.continuation
                if (r0 == 0) goto L7
                r0.invokeOnCancellation(r2, r3)
            L7:
                return
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
                r3 = this;
                java.lang.Object r0 = r3.receiveResult
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_RECEIVE_RESULT$p()
                if (r0 == r1) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r1 == 0) goto L25
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_RECEIVE_RESULT$p()
                r3.receiveResult = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
                if (r0 == r1) goto L1a
                return r0
            L1a:
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r3.this$0
                java.lang.Throwable r1 = kotlinx.coroutines.channels.BufferedChannel.access$getReceiveException(r1)
                java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r1)
                throw r1
            L25:
                r1 = 0
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "`hasNext()` has not been invoked"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation r2) {
                r1 = this;
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r1, r2)
                return r0
        }

        public final boolean tryResumeHasNext(E r6) {
                r5 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r5.continuation
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r5.continuation = r1
                r5.receiveResult = r6
                r2 = r0
                kotlinx.coroutines.CancellableContinuation r2 = (kotlinx.coroutines.CancellableContinuation) r2
                r3 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                kotlinx.coroutines.channels.BufferedChannel<E> r4 = r5.this$0
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r4.onUndeliveredElement
                if (r4 == 0) goto L20
                kotlin.coroutines.CoroutineContext r1 = r0.getContext()
                kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r4, r6, r1)
            L20:
                boolean r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r2, r3, r1)
                return r1
        }

        public final void tryResumeHasNextOnClosedChannel() {
                r5 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r5.continuation
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r5.continuation = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
                r5.receiveResult = r1
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r5.this$0
                java.lang.Throwable r1 = r1.getCloseCause()
                if (r1 != 0) goto L28
                r2 = r0
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                kotlin.Result$Companion r3 = kotlin.Result.Companion
                r3 = 0
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
                r2.resumeWith(r3)
                goto L52
            L28:
                r2 = r0
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
                if (r4 == 0) goto L44
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                boolean r4 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
                if (r4 != 0) goto L3a
                goto L44
            L3a:
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
                java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r4)
                goto L45
            L44:
                r4 = r1
            L45:
                kotlin.Result$Companion r3 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.ResultKt.createFailure(r4)
                java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
                r2.resumeWith(r3)
            L52:
                return
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SendBroadcast implements kotlinx.coroutines.Waiter {
        private final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> $$delegate_0;
        private final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;

        public SendBroadcast(kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> r2) {
                r1 = this;
                r1.<init>()
                r1.cont = r2
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
                r0 = r2
                kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
                r1.$$delegate_0 = r0
                return
        }

        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getCont() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r1.cont
                return r0
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> r0 = r1.$$delegate_0
                r0.invokeOnCancellation(r2, r3)
                return
        }
    }



    static {
            java.lang.String r0 = "sendersAndCloseStatus$volatile"
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r1 = kotlinx.coroutines.channels.BufferedChannel.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$volatile$FU = r0
            java.lang.String r0 = "receivers$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.receivers$volatile$FU = r0
            java.lang.String r0 = "bufferEnd$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.bufferEnd$volatile$FU = r0
            java.lang.String r0 = "completedExpandBuffersAndPauseFlag$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "sendSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.sendSegment$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "receiveSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.receiveSegment$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "bufferEndSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_closeCause$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel._closeCause$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "closeHandler$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.closeHandler$volatile$FU = r0
            return
    }

    public BufferedChannel(int r9, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r10) {
            r8 = this;
            r8.<init>()
            r8.capacity = r9
            r8.onUndeliveredElement = r10
            int r0 = r8.capacity
            if (r0 < 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L5a
        L12:
            int r0 = r8.capacity
            long r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$initialBufferEnd(r0)
            r8.bufferEnd$volatile = r0
            long r0 = r8.getBufferEndCounter()
            r8.completedExpandBuffersAndPauseFlag$volatile = r0
            kotlinx.coroutines.channels.ChannelSegment r2 = new kotlinx.coroutines.channels.ChannelSegment
            r5 = 0
            r7 = 3
            r3 = 0
            r6 = r8
            r2.<init>(r3, r5, r6, r7)
            r6.sendSegment$volatile = r2
            r6.receiveSegment$volatile = r2
            boolean r0 = r8.isRendezvousOrUnlimited()
            if (r0 == 0) goto L3f
            kotlinx.coroutines.channels.ChannelSegment r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            goto L40
        L3f:
            r0 = r2
        L40:
            r6.bufferEndSegment$volatile = r0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r6.onUndeliveredElement
            if (r0 == 0) goto L50
            r1 = 0
            kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 r2 = new kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            r2.<init>(r8)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            goto L51
        L50:
            r2 = 0
        L51:
            r6.onUndeliveredElementReceiveCancellationConstructor = r2
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_CLOSE_CAUSE$p()
            r6._closeCause$volatile = r0
            return
        L5a:
            r6 = r8
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid channel capacity: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.capacity
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", should be >=0"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public /* synthetic */ BufferedChannel(int r1, kotlin.jvm.functions.Function1 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$findSegmentReceive(kotlinx.coroutines.channels.BufferedChannel r1, long r2, kotlinx.coroutines.channels.ChannelSegment r4) {
            kotlinx.coroutines.channels.ChannelSegment r0 = r1.findSegmentReceive(r2, r4)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend(kotlinx.coroutines.channels.BufferedChannel r1, long r2, kotlinx.coroutines.channels.ChannelSegment r4) {
            kotlinx.coroutines.channels.ChannelSegment r0 = r1.findSegmentSend(r2, r4)
            return r0
    }

    public static final /* synthetic */ java.lang.Throwable access$getReceiveException(kotlinx.coroutines.channels.BufferedChannel r1) {
            java.lang.Throwable r0 = r1.getReceiveException()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getReceiveSegment$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getReceiveSegment$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getReceivers$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getReceivers$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getSendSegment$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getSendSegment$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getSendersAndCloseStatus$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            return r0
    }

    public static final /* synthetic */ boolean access$isClosedForSend0(kotlinx.coroutines.channels.BufferedChannel r1, long r2) {
            boolean r0 = r1.isClosedForSend0(r2)
            return r0
    }

    public static final /* synthetic */ void access$onClosedReceiveCatchingOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.CancellableContinuation r1) {
            r0.onClosedReceiveCatchingOnNoWaiterSuspend(r1)
            return
    }

    public static final /* synthetic */ void access$onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.CancellableContinuation r1) {
            r0.onClosedReceiveOnNoWaiterSuspend(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$onClosedSend(kotlinx.coroutines.channels.BufferedChannel r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.onClosedSend(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$onClosedSendOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r0, java.lang.Object r1, kotlinx.coroutines.CancellableContinuation r2) {
            r0.onClosedSendOnNoWaiterSuspend(r1, r2)
            return
    }

    public static final /* synthetic */ void access$prepareReceiverForSuspension(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.Waiter r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3) {
            r0.prepareReceiverForSuspension(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$prepareSenderForSuspension(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.Waiter r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3) {
            r0.prepareSenderForSuspension(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectReceive(kotlinx.coroutines.channels.BufferedChannel r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.processResultSelectReceive(r2, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectReceiveCatching(kotlinx.coroutines.channels.BufferedChannel r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.processResultSelectReceiveCatching(r2, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectReceiveOrNull(kotlinx.coroutines.channels.BufferedChannel r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.processResultSelectReceiveOrNull(r2, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectSend(kotlinx.coroutines.channels.BufferedChannel r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.processResultSelectSend(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: access$receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public static final /* synthetic */ java.lang.Object m1657access$receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.BufferedChannel r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, long r4, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = r1.m1659receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, long r4, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = r1.receiveOnNoWaiterSuspend(r2, r3, r4, r6)
            return r0
    }

    public static final /* synthetic */ void access$registerSelectForReceive(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2) {
            r0.registerSelectForReceive(r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object access$sendOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, java.lang.Object r4, long r5, kotlin.coroutines.Continuation r7) {
            java.lang.Object r0 = r1.sendOnNoWaiterSuspend(r2, r3, r4, r5, r7)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$updateCellReceive(kotlinx.coroutines.channels.BufferedChannel r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, long r4, java.lang.Object r6) {
            java.lang.Object r0 = r1.updateCellReceive(r2, r3, r4, r6)
            return r0
    }

    public static final /* synthetic */ int access$updateCellSend(kotlinx.coroutines.channels.BufferedChannel r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3, java.lang.Object r4, long r5, java.lang.Object r7, boolean r8) {
            int r0 = r1.updateCellSend(r2, r3, r4, r5, r7, r8)
            return r0
    }

    private final boolean bufferOrRendezvousSend(long r5) {
            r4 = this;
            long r0 = r4.getBufferEndCounter()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            long r0 = r4.getReceiversCounter$kotlinx_coroutines_core()
            int r2 = r4.capacity
            long r2 = (long) r2
            long r0 = r0 + r2
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    private final void cancelSuspendedReceiveRequests(kotlinx.coroutines.channels.ChannelSegment<E> r10, long r11) {
            r9 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m1703constructorimpl$default(r0, r1, r0)
            r2 = r10
        L7:
            r3 = -1
            if (r2 == 0) goto L75
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r1
        Ld:
            if (r3 >= r4) goto L6d
            long r5 = r2.id
            int r7 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r7
            long r5 = r5 * r7
            long r7 = (long) r4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L75
        L1b:
        L1c:
            java.lang.Object r5 = r2.getState$kotlinx_coroutines_core(r4)
            if (r5 == 0) goto L5c
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r5 != r6) goto L2a
            goto L5c
        L2a:
            boolean r6 = r5 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r6 == 0) goto L45
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r6 = r2.casState$kotlinx_coroutines_core(r4, r5, r6)
            if (r6 == 0) goto L1b
            r6 = r5
            kotlinx.coroutines.channels.WaiterEB r6 = (kotlinx.coroutines.channels.WaiterEB) r6
            kotlinx.coroutines.Waiter r6 = r6.waiter
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m1708plusFjFbRPM(r0, r6)
            r2.onCancelledRequest(r4, r1)
            goto L6a
        L45:
            boolean r6 = r5 instanceof kotlinx.coroutines.Waiter
            if (r6 == 0) goto L5b
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r6 = r2.casState$kotlinx_coroutines_core(r4, r5, r6)
            if (r6 == 0) goto L1b
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m1708plusFjFbRPM(r0, r5)
            r2.onCancelledRequest(r4, r1)
            goto L6a
        L5b:
            goto L6a
        L5c:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r6 = r2.casState$kotlinx_coroutines_core(r4, r5, r6)
            if (r6 == 0) goto L1b
            r2.onSlotCleaned()
        L6a:
            int r4 = r4 + (-1)
            goto Ld
        L6d:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r2.getPrev()
            r2 = r3
            kotlinx.coroutines.channels.ChannelSegment r2 = (kotlinx.coroutines.channels.ChannelSegment) r2
            goto L7
        L75:
            r4 = 0
            if (r0 == 0) goto La3
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 != 0) goto L85
            r1 = r0
            kotlinx.coroutines.Waiter r1 = (kotlinx.coroutines.Waiter) r1
            r3 = 0
            r9.resumeReceiverOnClosedChannel(r1)
            goto La2
        L85:
            java.lang.String r5 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r5)
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            int r6 = r6 - r1
        L92:
            if (r3 >= r6) goto La2
            java.lang.Object r1 = r5.get(r6)
            kotlinx.coroutines.Waiter r1 = (kotlinx.coroutines.Waiter) r1
            r7 = 0
            r9.resumeReceiverOnClosedChannel(r1)
            int r6 = r6 + (-1)
            goto L92
        La2:
        La3:
            return
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList() {
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getBufferEndSegment$volatile$FU()
            java.lang.Object r0 = r1.get(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            r2 = 0
            long r3 = r1.id
            r5 = r0
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            long r5 = r5.id
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L20
            r0 = r1
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            r2 = 0
            long r3 = r1.id
            r5 = r0
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            long r5 = r5.id
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L37
            r0 = r1
        L37:
            r1 = r0
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.close(r1)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            return r1
    }

    private final void completeCancel(long r2) {
            r1 = this;
            kotlinx.coroutines.channels.ChannelSegment r0 = r1.completeClose(r2)
            r1.removeUnprocessedElements(r0)
            return
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> completeClose(long r6) {
            r5 = this;
            kotlinx.coroutines.channels.ChannelSegment r0 = r5.closeLinkedList()
            boolean r1 = r5.isConflatedDropOldest()
            if (r1 == 0) goto L17
            long r1 = r5.markAllEmptyCellsAsClosed(r0)
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L17
            r5.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(r1)
        L17:
            r5.cancelSuspendedReceiveRequests(r0, r6)
            return r0
    }

    private final void completeCloseOrCancel() {
            r0 = this;
            r0.isClosedForSend()
            return
    }

    private final void expandBuffer() {
            r15 = this;
            boolean r0 = r15.isRendezvousOrUnlimited()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getBufferEndSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r15)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            r4 = r0
        L12:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getBufferEnd$volatile$FU()
            long r5 = r0.getAndIncrement(r15)
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r0 = (long) r0
            long r2 = r5 / r0
            long r7 = r15.getSendersCounter$kotlinx_coroutines_core()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r9 = 0
            r10 = 1
            r11 = 0
            if (r0 > 0) goto L3e
            long r0 = r4.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3a
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r4.getNext()
            if (r0 == 0) goto L3a
            r15.moveSegmentBufferEndToSpecifiedOrLast(r2, r4)
        L3a:
            incCompletedExpandBufferAttempts$default(r15, r11, r10, r9)
            return
        L3e:
            long r0 = r4.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4e
            r1 = r15
            kotlinx.coroutines.channels.ChannelSegment r0 = r1.findSegmentBufferEnd(r2, r4, r5)
            if (r0 != 0) goto L4c
            goto L12
        L4c:
            r4 = r0
            goto L4f
        L4e:
            r1 = r15
        L4f:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r13 = (long) r0
            long r13 = r5 % r13
            int r0 = (int) r13
            boolean r13 = r15.updateCellExpandBuffer(r4, r0, r5)
            if (r13 == 0) goto L5f
            incCompletedExpandBufferAttempts$default(r15, r11, r10, r9)
            return
        L5f:
            incCompletedExpandBufferAttempts$default(r15, r11, r10, r9)
            goto L12
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd(long r18, kotlinx.coroutines.channels.ChannelSegment<E> r20, long r21) {
            r17 = this;
            r1 = r17
            r6 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getBufferEndSegment$volatile$FU()
            kotlin.reflect.KFunction r2 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
        Le:
            r3 = r20
            kotlinx.coroutines.internal.Segment r3 = (kotlinx.coroutines.internal.Segment) r3
            java.lang.Object r3 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r3, r6, r2)
            boolean r4 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r3)
            r5 = 0
            r8 = 1
            if (r4 != 0) goto L59
            kotlinx.coroutines.internal.Segment r4 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r3)
        L22:
            java.lang.Object r9 = r0.get(r1)
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            r10 = 0
            long r11 = r9.id
            long r13 = r4.id
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L33
            r4 = r8
            goto L4b
        L33:
            boolean r11 = r4.tryIncPointers$kotlinx_coroutines_core()
            if (r11 != 0) goto L3b
            r4 = r5
            goto L4b
        L3b:
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r9, r4)
            if (r11 == 0) goto L4e
            boolean r11 = r9.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L4a
            r9.remove()
        L4a:
            r4 = r8
        L4b:
            if (r4 == 0) goto Le
            goto L59
        L4e:
            boolean r11 = r4.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L57
            r4.remove()
        L57:
            goto L22
        L59:
            r9 = r3
            r10 = 0
            boolean r0 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r9)
            r11 = 0
            r13 = 0
            if (r0 == 0) goto L70
            r1.completeCloseOrCancel()
            r17.moveSegmentBufferEndToSpecifiedOrLast(r18, r20)
            incCompletedExpandBufferAttempts$default(r1, r11, r8, r13)
            r16 = r9
            goto Lbf
        L70:
            kotlinx.coroutines.internal.Segment r0 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r9)
            r14 = r0
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
            long r2 = r14.id
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto La4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getBufferEnd$volatile$FU()
            r2 = 1
            long r2 = r21 + r2
            long r4 = r14.id
            int r15 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r16 = r9
            long r8 = (long) r15
            long r4 = r4 * r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L9f
            long r2 = r14.id
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r4 = (long) r0
            long r2 = r2 * r4
            long r2 = r2 - r21
            r1.incCompletedExpandBufferAttempts(r2)
            goto La3
        L9f:
            r0 = 1
            incCompletedExpandBufferAttempts$default(r1, r11, r0, r13)
        La3:
            goto Lbf
        La4:
            r0 = r8
            r16 = r9
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto Lbe
            r2 = 0
            long r3 = r14.id
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto Lb5
            r5 = r0
        Lb5:
            if (r5 == 0) goto Lb8
            goto Lbe
        Lb8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        Lbe:
            r13 = r14
        Lbf:
            return r13
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive(long r17, kotlinx.coroutines.channels.ChannelSegment<E> r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getReceiveSegment$volatile$FU()
            kotlin.reflect.KFunction r5 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
        L10:
            r6 = r3
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            java.lang.Object r6 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r6, r1, r5)
            boolean r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r6)
            r9 = 1
            if (r7 != 0) goto L59
            kotlinx.coroutines.internal.Segment r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r6)
        L22:
            java.lang.Object r10 = r4.get(r0)
            kotlinx.coroutines.internal.Segment r10 = (kotlinx.coroutines.internal.Segment) r10
            r11 = 0
            long r12 = r10.id
            long r14 = r7.id
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 < 0) goto L33
            r7 = r9
            goto L4b
        L33:
            boolean r12 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r12 != 0) goto L3b
            r7 = 0
            goto L4b
        L3b:
            boolean r12 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r0, r10, r7)
            if (r12 == 0) goto L4e
            boolean r12 = r10.decPointers$kotlinx_coroutines_core()
            if (r12 == 0) goto L4a
            r10.remove()
        L4a:
            r7 = r9
        L4b:
            if (r7 == 0) goto L10
            goto L59
        L4e:
            boolean r12 = r7.decPointers$kotlinx_coroutines_core()
            if (r12 == 0) goto L57
            r7.remove()
        L57:
            goto L22
        L59:
            r4 = 0
            boolean r5 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r6)
            if (r5 == 0) goto L78
            r0.completeCloseOrCancel()
            long r8 = r3.id
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r10 = (long) r5
            long r8 = r8 * r10
            long r10 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L75
            r3.cleanPrev()
        L75:
            r7 = 0
            goto L10f
        L78:
            kotlinx.coroutines.internal.Segment r5 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r6)
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            boolean r10 = r0.isRendezvousOrUnlimited()
            if (r10 != 0) goto Ld3
            long r10 = r0.getBufferEndCounter()
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r12 = (long) r12
            long r10 = r10 / r12
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 > 0) goto Ld3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = getBufferEndSegment$volatile$FU()
        L94:
            java.lang.Object r11 = r10.get(r0)
            kotlinx.coroutines.internal.Segment r11 = (kotlinx.coroutines.internal.Segment) r11
            r12 = 0
            long r13 = r11.id
            r15 = r5
            kotlinx.coroutines.internal.Segment r15 = (kotlinx.coroutines.internal.Segment) r15
            long r7 = r15.id
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 >= 0) goto Ld3
            r7 = r5
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            boolean r7 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto Ld3
            r7 = r5
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            boolean r7 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r10, r0, r11, r7)
            if (r7 == 0) goto Lc2
            boolean r7 = r11.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto Lc1
            r11.remove()
        Lc1:
            goto Ld3
        Lc2:
            r7 = r5
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            boolean r7 = r7.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto Ld1
            r7 = r5
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            r7.remove()
        Ld1:
            goto L94
        Ld3:
            long r7 = r5.id
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto Lf5
            long r7 = r5.id
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r9 = (long) r9
            long r7 = r7 * r9
            r0.updateReceiversCounterIfLower(r7)
            long r7 = r5.id
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r9 = (long) r9
            long r7 = r7 * r9
            long r9 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lf3
            r5.cleanPrev()
        Lf3:
            r7 = 0
            goto L10f
        Lf5:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L10e
            r7 = 0
            long r10 = r5.id
            int r8 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r8 != 0) goto L104
            r8 = r9
            goto L105
        L104:
            r8 = 0
        L105:
            if (r8 == 0) goto L108
            goto L10e
        L108:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L10e:
            r7 = r5
        L10f:
            return r7
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend(long r13, kotlinx.coroutines.channels.ChannelSegment<E> r15) {
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getSendSegment$volatile$FU()
            kotlin.reflect.KFunction r1 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        La:
            r2 = r15
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            java.lang.Object r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r2, r13, r1)
            boolean r3 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L54
            kotlinx.coroutines.internal.Segment r3 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r2)
        L1d:
            java.lang.Object r6 = r0.get(r12)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            r7 = 0
            long r8 = r6.id
            long r10 = r3.id
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L2e
            r3 = r5
            goto L46
        L2e:
            boolean r8 = r3.tryIncPointers$kotlinx_coroutines_core()
            if (r8 != 0) goto L36
            r3 = r4
            goto L46
        L36:
            boolean r8 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r12, r6, r3)
            if (r8 == 0) goto L49
            boolean r8 = r6.decPointers$kotlinx_coroutines_core()
            if (r8 == 0) goto L45
            r6.remove()
        L45:
            r3 = r5
        L46:
            if (r3 == 0) goto La
            goto L54
        L49:
            boolean r8 = r3.decPointers$kotlinx_coroutines_core()
            if (r8 == 0) goto L52
            r3.remove()
        L52:
            goto L1d
        L54:
            r0 = 0
            boolean r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r2)
            r3 = 0
            if (r1 == 0) goto L72
            r12.completeCloseOrCancel()
            long r4 = r15.id
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r1
            long r4 = r4 * r6
            long r6 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L71
            r15.cleanPrev()
        L71:
            goto Lb1
        L72:
            kotlinx.coroutines.internal.Segment r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r2)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            long r6 = r1.id
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 <= 0) goto L99
            long r4 = r1.id
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r6
            long r4 = r4 * r6
            r12.updateSendersCounterIfLower(r4)
            long r4 = r1.id
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L98
            r1.cleanPrev()
        L98:
            goto Lb1
        L99:
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto Lb0
            r3 = 0
            long r6 = r1.id
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto La7
            r4 = r5
        La7:
            if (r4 == 0) goto Laa
            goto Lb0
        Laa:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        Lb0:
            r3 = r1
        Lb1:
            return r3
    }

    private final /* synthetic */ java.lang.Object getAndUpdate$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r4.get(r3)
            java.lang.Object r1 = r5.invoke(r0)
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r1)
            if (r1 == 0) goto L0
            return r0
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
            r2 = this;
            long r0 = r2.bufferEnd$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getBufferEnd$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEnd$volatile$FU
            return r0
    }

    private final long getBufferEndCounter() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getBufferEnd$volatile$FU()
            long r0 = r0.get(r2)
            return r0
    }

    private final /* synthetic */ java.lang.Object getBufferEndSegment$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.bufferEndSegment$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getBufferEndSegment$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object getCloseHandler$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.closeHandler$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getCloseHandler$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.closeHandler$volatile$FU
            return r0
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
            r2 = this;
            long r0 = r2.completedExpandBuffersAndPauseFlag$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getCompletedExpandBuffersAndPauseFlag$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$volatile$FU
            return r0
    }

    public static /* synthetic */ void getOnReceive$annotations() {
            return
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
            return
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
            return
    }

    public static /* synthetic */ void getOnSend$annotations() {
            return
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
            return
    }

    private final java.lang.Throwable getReceiveException() {
            r2 = this;
            java.lang.Throwable r0 = r2.getCloseCause()
            if (r0 != 0) goto Lf
            kotlinx.coroutines.channels.ClosedReceiveChannelException r0 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        Lf:
            return r0
    }

    private final /* synthetic */ java.lang.Object getReceiveSegment$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.receiveSegment$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$volatile$FU
            return r0
    }

    private final /* synthetic */ long getReceivers$volatile() {
            r2 = this;
            long r0 = r2.receivers$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getReceivers$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receivers$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object getSendSegment$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.sendSegment$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getSendSegment$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendSegment$volatile$FU
            return r0
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
            r2 = this;
            long r0 = r2.sendersAndCloseStatus$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getSendersAndCloseStatus$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_closeCause$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._closeCause$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_closeCause$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel._closeCause$volatile$FU
            return r0
    }

    private final void incCompletedExpandBufferAttempts(long r19) {
            r18 = this;
            r0 = r18
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            r2 = r19
            long r4 = r1.addAndGet(r0, r2)
            r1 = 0
            r6 = r4
            r8 = 0
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r11 = r6 & r9
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r12 = 1
            r15 = 0
            if (r11 == 0) goto L1d
            r6 = r12
            goto L1e
        L1d:
            r6 = r15
        L1e:
            if (r6 == 0) goto L34
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            long r6 = r6.get(r0)
            r8 = 0
            long r16 = r6 & r9
            int r11 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r11 == 0) goto L31
            r6 = r12
            goto L32
        L31:
            r6 = r15
        L32:
            if (r6 != 0) goto L20
        L34:
        L36:
            return
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(kotlinx.coroutines.channels.BufferedChannel r0, long r1, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 1
        L8:
            r0.incCompletedExpandBufferAttempts(r1)
            return
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"
            r0.<init>(r1)
            throw r0
    }

    private final void invokeCloseHandler() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCloseHandler$volatile$FU()
            r1 = r6
        L6:
            java.lang.Object r2 = r0.get(r6)
            r3 = r2
            r4 = 0
            if (r3 != 0) goto L13
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()
            goto L17
        L13:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()
        L17:
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r6, r2, r5)
            if (r3 == 0) goto L6
        L1f:
            if (r2 != 0) goto L22
            return
        L22:
            r0 = 1
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, r0)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0 = r2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Throwable r1 = r6.getCloseCause()
            r0.invoke(r1)
            return
    }

    private final boolean isCellNonEmpty(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, long r9) {
            r6 = this;
        L1:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            r1 = 0
            if (r0 == 0) goto L4b
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r2) goto L11
            goto L4b
        L11:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r3 = 1
            if (r0 != r2) goto L17
            return r3
        L17:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r2) goto L1e
            return r1
        L1e:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r2) goto L25
            return r1
        L25:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r0 != r2) goto L2c
            return r1
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r2) goto L33
            return r1
        L33:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r0 != r2) goto L3a
            return r3
        L3a:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r0 != r2) goto L41
            return r1
        L41:
            long r4 = r6.getReceiversCounter$kotlinx_coroutines_core()
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L4a
            r1 = r3
        L4a:
            return r1
        L4b:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r2 = r7.casState$kotlinx_coroutines_core(r8, r0, r2)
            if (r2 == 0) goto L1
            r6.expandBuffer()
            return r1
    }

    private final boolean isClosed(long r9, boolean r11) {
            r8 = this;
            r0 = r9
            r2 = 0
            r3 = 60
            long r4 = r0 >> r3
            int r0 = (int) r4
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L4d;
                case 2: goto L3b;
                case 3: goto L33;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected close status: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            r4 = 0
            long r5 = r1 >> r3
            int r1 = (int) r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L33:
            r5 = r9
            r0 = 0
            long r0 = r5 & r1
            r8.completeCancel(r0)
            goto L50
        L3b:
            r6 = r9
            r0 = 0
            long r0 = r6 & r1
            r8.completeClose(r0)
            if (r11 == 0) goto L50
            boolean r0 = r8.hasElements$kotlinx_coroutines_core()
            if (r0 != 0) goto L4b
            goto L50
        L4b:
            r4 = r5
            goto L50
        L4d:
            r4 = r5
            goto L50
        L4f:
            r4 = r5
        L50:
            return r4
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
            return
    }

    private final boolean isClosedForReceive0(long r2) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.isClosed(r2, r0)
            return r0
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
            return
    }

    private final boolean isClosedForSend0(long r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.isClosed(r2, r0)
            return r0
    }

    public static /* synthetic */ void isEmpty$annotations() {
            return
    }

    private final boolean isRendezvousOrUnlimited() {
            r5 = this;
            long r0 = r5.getBufferEndCounter()
            r2 = 0
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L17
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L15
            goto L17
        L15:
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            return r3
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicLongFieldUpdater r4, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r5) {
            r2 = this;
        L0:
            long r0 = r4.get(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> r9) {
            r8 = this;
            r0 = r9
        L1:
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r1 = r1 + (-1)
        L6:
            r2 = -1
            r4 = -1
            if (r4 >= r1) goto L42
            long r4 = r0.id
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r1
            long r4 = r4 + r6
            long r6 = r8.getReceiversCounter$kotlinx_coroutines_core()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L1c
            return r2
        L1c:
            java.lang.Object r2 = r0.getState$kotlinx_coroutines_core(r1)
            if (r2 == 0) goto L31
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r2 != r3) goto L2b
            goto L31
        L2b:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r2 != r3) goto L30
            return r4
        L30:
            goto L3f
        L31:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r3 = r0.casState$kotlinx_coroutines_core(r1, r2, r3)
            if (r3 == 0) goto L1c
            r0.onSlotCleaned()
        L3f:
            int r1 = r1 + (-1)
            goto L6
        L42:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            if (r1 != 0) goto L4b
            return r2
        L4b:
            r0 = r1
            goto L1
    }

    private final void markCancellationStarted() {
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            r6 = r12
        L5:
            long r2 = r0.get(r12)
            r4 = r2
            r1 = 0
            r7 = r4
            r9 = 0
            r10 = 60
            long r10 = r7 >> r10
            int r7 = (int) r10
            if (r7 != 0) goto L2a
            r7 = r4
            r9 = 0
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r10
            r9 = 1
            long r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r7, r9)
            r1 = r12
            r4 = r7
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L5
            return
        L2a:
            return
    }

    private final void markCancelled() {
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            r6 = r12
        L5:
            long r2 = r0.get(r12)
            r4 = r2
            r1 = 0
            r7 = r4
            r9 = 0
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r10
            r9 = 3
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r7, r9)
            r1 = r12
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L5
            return
    }

    private final void markClosed() {
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            r6 = r12
        L5:
            long r2 = r0.get(r12)
            r4 = r2
            r1 = 0
            r7 = r4
            r9 = 0
            r10 = 60
            long r10 = r7 >> r10
            int r7 = (int) r10
            r8 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            switch(r7) {
                case 0: goto L25;
                case 1: goto L1b;
                default: goto L1a;
            }
        L1a:
            return
        L1b:
            r10 = r4
            r7 = 0
            long r7 = r10 & r8
            r9 = 3
            long r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r7, r9)
            goto L2e
        L25:
            r10 = r4
            r7 = 0
            long r7 = r10 & r8
            r9 = 2
            long r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r7, r9)
        L2e:
            r1 = r12
            r4 = r7
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L5
            return
    }

    private final void moveSegmentBufferEndToSpecifiedOrLast(long r9, kotlinx.coroutines.channels.ChannelSegment<E> r11) {
            r8 = this;
            r0 = r11
        L1:
            long r1 = r0.id
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L12
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            if (r1 != 0) goto L10
            goto L12
        L10:
            r0 = r1
            goto L1
        L12:
        L13:
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L24
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            if (r1 != 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto L13
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getBufferEndSegment$volatile$FU()
        L28:
            java.lang.Object r2 = r1.get(r8)
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            r3 = 0
            long r4 = r2.id
            r6 = r0
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r6 = r6.id
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 < 0) goto L3c
            goto L5a
        L3c:
            r4 = r0
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            boolean r4 = r4.tryIncPointers$kotlinx_coroutines_core()
            if (r4 != 0) goto L47
            r5 = 0
            goto L5a
        L47:
            r4 = r0
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r8, r2, r4)
            if (r4 == 0) goto L5d
            boolean r4 = r2.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L59
            r2.remove()
        L59:
        L5a:
            if (r5 == 0) goto L12
            return
        L5d:
            r4 = r0
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            boolean r4 = r4.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L6c
            r4 = r0
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            r4.remove()
        L6c:
            goto L28
    }

    private final void onClosedReceiveCatchingOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r4) {
            r3 = this;
            r0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r2 = r3.getCloseCause()
            java.lang.Object r1 = r1.m1680closedJP2dKIU(r2)
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }

    private final void onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super E> r3) {
            r2 = this;
            r0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Throwable r1 = r2.getReceiveException()
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }

    private final void onClosedSelectOnReceive(kotlinx.coroutines.selects.SelectInstance<?> r2) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            r2.selectInRegistrationPhase(r0)
            return
    }

    private final void onClosedSelectOnSend(E r3, kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r2 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r2.onUndeliveredElement
            if (r0 == 0) goto Lb
            kotlin.coroutines.CoroutineContext r1 = r4.getContext()
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r3, r1)
        Lb:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            r4.selectInRegistrationPhase(r0)
            return
    }

    private final java.lang.Object onClosedSend(E r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            r13 = this;
            r0 = 0
            r1 = r15
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r6 = r13.onUndeliveredElement
            if (r6 == 0) goto L58
            r7 = 2
            r8 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r6 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r6, r14, r8, r7, r8)
            if (r6 == 0) goto L58
            r7 = 0
            r8 = r6
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Throwable r9 = r13.getSendException()
            kotlin.ExceptionsKt.addSuppressed(r8, r9)
            r8 = r4
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r9 = 0
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            r10 = 0
            boolean r11 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r11 == 0) goto L48
            boolean r11 = r8 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r11 != 0) goto L3d
            goto L48
        L3d:
            r11 = r6
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r12 = r8
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r12 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r12
            java.lang.Throwable r11 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r11, r12)
            goto L4b
        L48:
            r11 = r6
            java.lang.Throwable r11 = (java.lang.Throwable) r11
        L4b:
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r10 = kotlin.Result.m153constructorimpl(r10)
            r8.resumeWith(r10)
            goto L84
        L58:
            r6 = r4
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Throwable r7 = r13.getSendException()
            r8 = 0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            r9 = 0
            boolean r10 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r10 == 0) goto L76
            boolean r10 = r6 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r10 != 0) goto L6e
            goto L76
        L6e:
            r10 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r10 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r10
            java.lang.Throwable r10 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r7, r10)
            goto L77
        L76:
            r10 = r7
        L77:
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r9 = kotlin.Result.m153constructorimpl(r9)
            r6.resumeWith(r9)
        L84:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L92
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r15)
        L92:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L99
            return r1
        L99:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final void onClosedSendOnNoWaiterSuspend(E r5, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r6) {
            r4 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r4.onUndeliveredElement
            if (r0 == 0) goto Lb
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r5, r1)
        Lb:
            r0 = r6
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            java.lang.Throwable r1 = r4.getSendException()
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 == 0) goto L2b
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            boolean r3 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto L21
            goto L2b
        L21:
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r3)
            r1 = r3
        L2b:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }

    private final void prepareReceiverForSuspension(kotlinx.coroutines.Waiter r2, kotlinx.coroutines.channels.ChannelSegment<E> r3, int r4) {
            r1 = this;
            r1.onReceiveEnqueued()
            r0 = r3
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            r2.invokeOnCancellation(r0, r4)
            return
    }

    private final void prepareSenderForSuspension(kotlinx.coroutines.Waiter r3, kotlinx.coroutines.channels.ChannelSegment<E> r4, int r5) {
            r2 = this;
            r0 = r4
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r1 = r1 + r5
            r3.invokeOnCancellation(r0, r1)
            return
    }

    private final java.lang.Object processResultSelectReceive(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r3 == r0) goto L7
            return r3
        L7:
            java.lang.Throwable r0 = r1.getReceiveException()
            throw r0
    }

    private final java.lang.Object processResultSelectReceiveCatching(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r4 != r0) goto L11
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r2.getCloseCause()
            java.lang.Object r0 = r0.m1680closedJP2dKIU(r1)
            goto L17
        L11:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m1682successJP2dKIU(r4)
        L17:
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r0)
            return r0
    }

    private final java.lang.Object processResultSelectReceiveOrNull(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r3 != r0) goto L13
            java.lang.Throwable r0 = r1.getCloseCause()
            if (r0 != 0) goto Le
            r0 = 0
            goto L14
        Le:
            java.lang.Throwable r0 = r1.getReceiveException()
            throw r0
        L13:
            r0 = r3
        L14:
            return r0
    }

    private final java.lang.Object processResultSelectSend(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r3 == r0) goto L7
            return r1
        L7:
            java.lang.Throwable r0 = r1.getSendException()
            throw r0
    }

    static /* synthetic */ <E> java.lang.Object receive$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r17, kotlin.coroutines.Continuation<? super E> r18) {
            r0 = r17
            r5 = 0
            r6 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L10:
            boolean r2 = r0.isClosedForReceive()
            if (r2 != 0) goto L7f
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r3 = r2.getAndIncrement(r0)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r2
            long r7 = r3 / r7
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r9 = (long) r2
            long r9 = r3 % r9
            int r2 = (int) r9
            long r9 = r1.id
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L38
            kotlinx.coroutines.channels.ChannelSegment r9 = access$findSegmentReceive(r0, r7, r1)
            if (r9 != 0) goto L37
            goto L10
        L37:
            r1 = r9
        L38:
            java.lang.Object r9 = access$updateCellReceive(r0, r1, r2, r3, r5)
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r9 == r10) goto L71
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r9 != r10) goto L55
            long r10 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 >= 0) goto L54
            r1.cleanPrev()
        L54:
            goto L10
        L55:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r9 != r10) goto L6b
            r10 = r1
            r13 = r2
            r14 = r3
            r12 = r10
            r10 = 0
            r11 = r17
            r16 = r18
            java.lang.Object r10 = r11.receiveOnNoWaiterSuspend(r12, r13, r14, r16)
            return r10
        L6b:
            r1.cleanPrev()
            r10 = r9
            r11 = 0
            return r10
        L71:
            r10 = 0
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "unexpected"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L7f:
            r2 = 0
            java.lang.Throwable r3 = r17.getReceiveException()
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
    }

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    static /* synthetic */ <E> java.lang.Object m1658receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r13, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
        L19:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L3b;
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
            r0 = 0
            kotlin.ResultKt.throwOnFailure(r14)
            r1 = r14
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m1679unboximpl()
            goto Lb7
        L3b:
            kotlin.ResultKt.throwOnFailure(r14)
            r1 = r13
            r7 = r1
            r12 = 0
            r13 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r2 = r2.get(r7)
            kotlinx.coroutines.channels.ChannelSegment r2 = (kotlinx.coroutines.channels.ChannelSegment) r2
        L4c:
            boolean r3 = r7.isClosedForReceive()
            if (r3 == 0) goto L60
            r0 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r3 = r1.getCloseCause()
            java.lang.Object r0 = r2.m1680closedJP2dKIU(r3)
            goto Lc8
        L60:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getReceivers$volatile$FU()
            long r4 = r3.getAndIncrement(r7)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r3
            long r8 = r4 / r8
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r10 = (long) r3
            long r10 = r4 % r10
            int r3 = (int) r10
            long r10 = r2.id
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L83
            kotlinx.coroutines.channels.ChannelSegment r10 = access$findSegmentReceive(r7, r8, r2)
            if (r10 != 0) goto L80
            goto L4c
        L80:
            r2 = r10
            r8 = r2
            goto L84
        L83:
            r8 = r2
        L84:
            r9 = r3
            r10 = r4
            java.lang.Object r2 = access$updateCellReceive(r7, r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r2 == r9) goto Lc9
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r2 != r9) goto La4
            long r2 = r7.getSendersCounter$kotlinx_coroutines_core()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto La2
            r8.cleanPrev()
        La2:
            r2 = r8
            goto L4c
        La4:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r2 != r7) goto Lba
            r2 = r8
            r7 = 0
            r8 = 1
            r6.label = r8
            java.lang.Object r1 = r1.m1659receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            if (r1 != r0) goto Lb6
            return r0
        Lb6:
            r0 = r7
        Lb7:
            r0 = r1
            goto Lc6
        Lba:
            r8.cleanPrev()
            r0 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r1.m1682successJP2dKIU(r2)
            r0 = r1
        Lc6:
        Lc8:
            return r0
        Lc9:
            r0 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    private final java.lang.Object m1659receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> r25, int r26, long r27, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r29) {
            r24 = this;
            r0 = r29
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            if (r1 == 0) goto L18
            r1 = r0
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            r2 = r24
            goto L1f
        L18:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            r2 = r24
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L49;
                case 1: goto L34;
                default: goto L2a;
            }
        L2a:
            r29 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            r0 = 0
            long r4 = r1.J$0
            int r4 = r1.I$0
            java.lang.Object r4 = r1.L$1
            kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
            java.lang.Object r4 = r1.L$0
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4
            kotlin.ResultKt.throwOnFailure(r3)
            r29 = r1
            r1 = r3
            goto L1ab
        L49:
            kotlin.ResultKt.throwOnFailure(r3)
            r4 = r24
            r7 = r26
            r6 = r25
            r8 = r27
            r11 = 0
            r1.L$0 = r4
            r1.L$1 = r6
            r1.I$0 = r7
            r1.J$0 = r8
            r5 = 1
            r1.label = r5
            r5 = r1
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r12 = 0
            kotlin.coroutines.Continuation r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.CancellableContinuationImpl r13 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r10)
            r14 = r13
            r15 = 0
            kotlinx.coroutines.channels.ReceiveCatching r5 = new kotlinx.coroutines.channels.ReceiveCatching     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r10 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r10)     // Catch: java.lang.Throwable -> L1b5
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L1b5
            r16 = r5
            r17 = r4
            r23 = 0
            r10 = r16
            kotlinx.coroutines.Waiter r10 = (kotlinx.coroutines.Waiter) r10     // Catch: java.lang.Throwable -> L1b5
            r5 = r17
            java.lang.Object r10 = access$updateCellReceive(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L1b5
            r29 = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L1b3
            if (r10 != r1) goto L9b
            r1 = r16
            kotlinx.coroutines.Waiter r1 = (kotlinx.coroutines.Waiter) r1     // Catch: java.lang.Throwable -> L1b3
            access$prepareReceiverForSuspension(r5, r1, r6, r7)     // Catch: java.lang.Throwable -> L1b3
            goto L193
        L9b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L1b3
            if (r10 != r1) goto L170
            long r17 = r5.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L1b3
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 >= 0) goto Lac
            r6.cleanPrev()     // Catch: java.lang.Throwable -> L1b3
        Lac:
            r1 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = access$getReceiveSegment$volatile$FU()     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L1b3
            kotlinx.coroutines.channels.ChannelSegment r6 = (kotlinx.coroutines.channels.ChannelSegment) r6     // Catch: java.lang.Throwable -> L1b3
        Lba:
            boolean r8 = r5.isClosedForReceive()     // Catch: java.lang.Throwable -> L1b3
            if (r8 == 0) goto Lca
            r5 = 0
            r6 = r14
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6     // Catch: java.lang.Throwable -> L1b3
            access$onClosedReceiveCatchingOnNoWaiterSuspend(r4, r6)     // Catch: java.lang.Throwable -> L1b3
            goto L193
        Lca:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = access$getReceivers$volatile$FU()     // Catch: java.lang.Throwable -> L1b3
            long r20 = r8.getAndIncrement(r5)     // Catch: java.lang.Throwable -> L1b3
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L1b3
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L1b3
            long r8 = r20 / r8
            int r10 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L1b3
            r26 = r8
            long r7 = (long) r10     // Catch: java.lang.Throwable -> L1b3
            long r7 = r20 % r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L1b3
            long r8 = r6.id     // Catch: java.lang.Throwable -> L1b3
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 == 0) goto Lf2
            r8 = r26
            kotlinx.coroutines.channels.ChannelSegment r10 = access$findSegmentReceive(r5, r8, r6)     // Catch: java.lang.Throwable -> L1b3
            if (r10 != 0) goto Lee
            goto Lba
        Lee:
            r6 = r10
            r18 = r6
            goto Lf6
        Lf2:
            r8 = r26
            r18 = r6
        Lf6:
            r22 = r16
            kotlinx.coroutines.Waiter r22 = (kotlinx.coroutines.Waiter) r22     // Catch: java.lang.Throwable -> L1b3
            r17 = r5
            r19 = r7
            java.lang.Object r5 = access$updateCellReceive(r17, r18, r19, r20, r22)     // Catch: java.lang.Throwable -> L1b3
            r7 = r17
            r6 = r18
            r8 = r19
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L1b3
            if (r5 != r9) goto L126
            r4 = r16
            kotlinx.coroutines.Waiter r4 = (kotlinx.coroutines.Waiter) r4     // Catch: java.lang.Throwable -> L1b3
            boolean r4 = r4 instanceof kotlinx.coroutines.Waiter     // Catch: java.lang.Throwable -> L1b3
            if (r4 == 0) goto L11c
            r4 = r16
            kotlinx.coroutines.Waiter r4 = (kotlinx.coroutines.Waiter) r4     // Catch: java.lang.Throwable -> L1b3
            goto L11d
        L11c:
            r4 = 0
        L11d:
            if (r4 == 0) goto L123
            access$prepareReceiverForSuspension(r7, r4, r6, r8)     // Catch: java.lang.Throwable -> L1b3
        L123:
            r4 = 0
            goto L160
        L126:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L1b3
            if (r5 != r9) goto L139
            long r8 = r7.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L1b3
            int r5 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r5 >= 0) goto L137
            r6.cleanPrev()     // Catch: java.lang.Throwable -> L1b3
        L137:
            r5 = r7
            goto Lba
        L139:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()     // Catch: java.lang.Throwable -> L1b3
            if (r5 == r7) goto L163
            r6.cleanPrev()     // Catch: java.lang.Throwable -> L1b3
            r6 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r7 = kotlinx.coroutines.channels.ChannelResult.Companion     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r7 = r7.m1682successJP2dKIU(r5)     // Catch: java.lang.Throwable -> L1b3
            kotlinx.coroutines.channels.ChannelResult r7 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r7)     // Catch: java.lang.Throwable -> L1b3
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r8 = r4.onUndeliveredElement     // Catch: java.lang.Throwable -> L1b3
            if (r8 == 0) goto L15b
            kotlin.coroutines.CoroutineContext r9 = r14.getContext()     // Catch: java.lang.Throwable -> L1b3
            kotlin.jvm.functions.Function1 r8 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r8, r5, r9)     // Catch: java.lang.Throwable -> L1b3
            goto L15c
        L15b:
            r8 = 0
        L15c:
            r14.resume(r7, r8)     // Catch: java.lang.Throwable -> L1b3
        L160:
            goto L193
        L163:
            r0 = 0
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b3
            java.lang.String r5 = "unexpected"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1b3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1b3
            throw r4     // Catch: java.lang.Throwable -> L1b3
        L170:
            r7 = r5
            r6.cleanPrev()     // Catch: java.lang.Throwable -> L1b3
            r1 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r5 = r5.m1682successJP2dKIU(r10)     // Catch: java.lang.Throwable -> L1b3
            kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r5)     // Catch: java.lang.Throwable -> L1b3
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r6 = r4.onUndeliveredElement     // Catch: java.lang.Throwable -> L1b3
            if (r6 == 0) goto L18d
            kotlin.coroutines.CoroutineContext r7 = r14.getContext()     // Catch: java.lang.Throwable -> L1b3
            kotlin.jvm.functions.Function1 r7 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r6, r10, r7)     // Catch: java.lang.Throwable -> L1b3
            goto L18e
        L18d:
            r7 = 0
        L18e:
            r14.resume(r5, r7)     // Catch: java.lang.Throwable -> L1b3
        L193:
            java.lang.Object r1 = r13.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r4) goto L1a7
            r4 = r29
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L1a7:
            if (r1 != r0) goto L1aa
            return r0
        L1aa:
            r0 = r11
        L1ab:
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r0 = r1.m1679unboximpl()
            return r0
        L1b3:
            r0 = move-exception
            goto L1b8
        L1b5:
            r0 = move-exception
            r29 = r1
        L1b8:
            r13.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r0
    }

    private final <R> R receiveImpl(java.lang.Object r15, kotlin.jvm.functions.Function1<? super E, ? extends R> r16, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> r17, kotlin.jvm.functions.Function0<? extends R> r18, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> r19) {
            r14 = this;
            r6 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        Lb:
            boolean r2 = r14.isClosedForReceive()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r18.invoke()
            return r2
        L17:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r3 = r2.getAndIncrement(r14)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r2
            long r7 = r3 / r7
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r9 = (long) r2
            long r9 = r3 % r9
            int r2 = (int) r9
            long r9 = r1.id
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L38
            kotlinx.coroutines.channels.ChannelSegment r5 = access$findSegmentReceive(r14, r7, r1)
            if (r5 != 0) goto L37
            goto Lb
        L37:
            r1 = r5
        L38:
            r0 = r14
            r5 = r15
            java.lang.Object r9 = access$updateCellReceive(r0, r1, r2, r3, r5)
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r9 != r10) goto L67
            boolean r10 = r15 instanceof kotlinx.coroutines.Waiter
            if (r10 == 0) goto L4d
            r10 = r15
            kotlinx.coroutines.Waiter r10 = (kotlinx.coroutines.Waiter) r10
            goto L4e
        L4d:
            r10 = 0
        L4e:
            if (r10 == 0) goto L53
            access$prepareReceiverForSuspension(r14, r10, r1, r2)
        L53:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r12 = r17
            java.lang.Object r10 = r12.invoke(r1, r10, r11)
            r13 = r19
            r11 = r10
            r10 = r16
            goto L9e
        L67:
            r12 = r17
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r9 != r10) goto L7b
            long r10 = r14.getSendersCounter$kotlinx_coroutines_core()
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 >= 0) goto L7a
            r1.cleanPrev()
        L7a:
            goto Lb
        L7b:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r9 != r10) goto L93
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r13 = r19
            java.lang.Object r10 = r13.invoke(r1, r10, r11)
            r11 = r10
            r10 = r16
            goto L9e
        L93:
            r13 = r19
            r1.cleanPrev()
            r10 = r16
            java.lang.Object r11 = r10.invoke(r9)
        L9e:
            return r11
    }

    static /* synthetic */ java.lang.Object receiveImpl$default(kotlinx.coroutines.channels.BufferedChannel r14, java.lang.Object r15, kotlin.jvm.functions.Function1 r16, kotlin.jvm.functions.Function3 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function3 r19, int r20, java.lang.Object r21) {
            if (r21 != 0) goto La7
            r1 = r20 & 16
            if (r1 == 0) goto Lc
            kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1 r1 = kotlinx.coroutines.channels.BufferedChannel.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            r6 = r1
            goto Le
        Lc:
            r6 = r19
        Le:
            r7 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L19:
            boolean r2 = r14.isClosedForReceive()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r18.invoke()
            return r2
        L25:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r3 = r2.getAndIncrement(r14)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r2
            long r8 = r3 / r8
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r10 = (long) r2
            long r10 = r3 % r10
            int r2 = (int) r10
            long r10 = r1.id
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L46
            kotlinx.coroutines.channels.ChannelSegment r5 = access$findSegmentReceive(r14, r8, r1)
            if (r5 != 0) goto L45
            goto L19
        L45:
            r1 = r5
        L46:
            r0 = r14
            r5 = r15
            java.lang.Object r10 = access$updateCellReceive(r0, r1, r2, r3, r5)
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r10 != r11) goto L73
            boolean r11 = r15 instanceof kotlinx.coroutines.Waiter
            if (r11 == 0) goto L5b
            r11 = r15
            kotlinx.coroutines.Waiter r11 = (kotlinx.coroutines.Waiter) r11
            goto L5c
        L5b:
            r11 = 0
        L5c:
            if (r11 == 0) goto L61
            access$prepareReceiverForSuspension(r14, r11, r1, r2)
        L61:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r13 = r17
            java.lang.Object r11 = r13.invoke(r1, r11, r12)
            r12 = r11
            r11 = r16
            goto La6
        L73:
            r13 = r17
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r10 != r11) goto L87
            long r11 = r14.getSendersCounter$kotlinx_coroutines_core()
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 >= 0) goto L86
            r1.cleanPrev()
        L86:
            goto L19
        L87:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r10 != r11) goto L9d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            java.lang.Object r11 = r6.invoke(r1, r11, r12)
            r12 = r11
            r11 = r16
            goto La6
        L9d:
            r1.cleanPrev()
            r11 = r16
            java.lang.Object r12 = r11.invoke(r10)
        La6:
            return r12
        La7:
            r11 = r16
            r13 = r17
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: receiveImpl"
            r1.<init>(r2)
            throw r1
    }

    private final void receiveImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> r19, int r20, long r21, kotlinx.coroutines.Waiter r23, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25) {
            r18 = this;
            r0 = r18
            r5 = r23
            r6 = r24
            r7 = 0
            java.lang.Object r8 = access$updateCellReceive(r18, r19, r20, r21, r23)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r8 != r1) goto L1b
            r9 = r19
            r10 = r20
            access$prepareReceiverForSuspension(r0, r5, r9, r10)
            goto Lbb
        L1b:
            r9 = r19
            r10 = r20
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r8 != r1) goto Lb5
            long r1 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 >= 0) goto L30
            r9.cleanPrev()
        L30:
            r11 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L3e:
            boolean r2 = r0.isClosedForReceive()
            if (r2 == 0) goto L49
            r25.invoke()
            goto La5
        L49:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r3 = r2.getAndIncrement(r0)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r12 = (long) r2
            long r12 = r3 / r12
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r14 = (long) r2
            long r14 = r3 % r14
            int r2 = (int) r14
            long r14 = r1.id
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 == 0) goto L6a
            kotlinx.coroutines.channels.ChannelSegment r14 = access$findSegmentReceive(r0, r12, r1)
            if (r14 != 0) goto L69
            goto L3e
        L69:
            r1 = r14
        L6a:
            java.lang.Object r14 = access$updateCellReceive(r0, r1, r2, r3, r5)
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r14 != r15) goto L86
            boolean r15 = r5 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L7b
            r15 = r5
            goto L7c
        L7b:
            r15 = 0
        L7c:
            if (r15 == 0) goto L81
            access$prepareReceiverForSuspension(r0, r15, r1, r2)
        L81:
            r15 = 0
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            goto La4
        L86:
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r14 != r15) goto L98
            long r15 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r15 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r15 >= 0) goto L97
            r1.cleanPrev()
        L97:
            goto L3e
        L98:
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r14 == r15) goto La6
            r1.cleanPrev()
            r6.invoke(r14)
        La4:
        La5:
            goto Lbb
        La6:
            r15 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r16 = "unexpected"
            r17 = r1
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        Lb5:
            r9.cleanPrev()
            r6.invoke(r8)
        Lbb:
            return
    }

    private final java.lang.Object receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r25, int r26, long r27, kotlin.coroutines.Continuation<? super E> r29) {
            r24 = this;
            r1 = r24
            r2 = 0
            r3 = r29
            r4 = 0
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            kotlinx.coroutines.CancellableContinuationImpl r5 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r0 = r5
            r6 = 0
            r7 = r24
            r13 = 0
            r12 = r0
            kotlinx.coroutines.Waiter r12 = (kotlinx.coroutines.Waiter) r12     // Catch: java.lang.Throwable -> L179
            r8 = r25
            r9 = r26
            r10 = r27
            java.lang.Object r12 = access$updateCellReceive(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L16e
            r14 = r12
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L179
            if (r14 != r8) goto L4e
            r8 = r0
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8     // Catch: java.lang.Throwable -> L3f
            r15 = r25
            r9 = r26
            access$prepareReceiverForSuspension(r7, r8, r15, r9)     // Catch: java.lang.Throwable -> L3d
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            goto L158
        L3d:
            r0 = move-exception
            goto L44
        L3f:
            r0 = move-exception
            r15 = r25
            r9 = r26
        L44:
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            goto L184
        L4e:
            r15 = r25
            r9 = r26
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L16c
            r16 = 0
            if (r14 != r8) goto L138
            long r10 = r7.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L16c
            int r8 = (r27 > r10 ? 1 : (r27 == r10 ? 0 : -1))
            if (r8 >= 0) goto L65
            r15.cleanPrev()     // Catch: java.lang.Throwable -> L3d
        L65:
            r17 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = access$getReceiveSegment$volatile$FU()     // Catch: java.lang.Throwable -> L16c
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L16c
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8     // Catch: java.lang.Throwable -> L16c
        L74:
            boolean r10 = r7.isClosedForReceive()     // Catch: java.lang.Throwable -> L16c
            if (r10 == 0) goto L8c
            r10 = 0
            r11 = r0
            kotlinx.coroutines.CancellableContinuation r11 = (kotlinx.coroutines.CancellableContinuation) r11     // Catch: java.lang.Throwable -> L3d
            access$onClosedReceiveOnNoWaiterSuspend(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            goto L158
        L8c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = access$getReceivers$volatile$FU()     // Catch: java.lang.Throwable -> L16c
            long r10 = r10.getAndIncrement(r7)     // Catch: java.lang.Throwable -> L16c
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L16c
            r18 = r2
            r19 = r3
            long r2 = (long) r12
            long r2 = r10 / r2
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L132
            r20 = r4
            r21 = r5
            long r4 = (long) r12
            long r4 = r10 % r4
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L16a
            r12 = r4
            long r4 = r8.id     // Catch: java.lang.Throwable -> L16a
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto Lbe
            kotlinx.coroutines.channels.ChannelSegment r4 = access$findSegmentReceive(r7, r2, r8)     // Catch: java.lang.Throwable -> L16a
            if (r4 != 0) goto Lbd
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            goto L74
        Lbd:
            r8 = r4
        Lbe:
            r9 = r12
            r12 = r0
            kotlinx.coroutines.Waiter r12 = (kotlinx.coroutines.Waiter) r12     // Catch: java.lang.Throwable -> L16a
            java.lang.Object r4 = access$updateCellReceive(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L16a
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> L16a
            if (r4 != r5) goto Le4
            r5 = r0
            kotlinx.coroutines.Waiter r5 = (kotlinx.coroutines.Waiter) r5     // Catch: java.lang.Throwable -> L16a
            boolean r5 = r5 instanceof kotlinx.coroutines.Waiter     // Catch: java.lang.Throwable -> L16a
            if (r5 == 0) goto Ld8
            r16 = r0
            kotlinx.coroutines.Waiter r16 = (kotlinx.coroutines.Waiter) r16     // Catch: java.lang.Throwable -> L16a
        Ld8:
            r5 = r16
            if (r5 == 0) goto Ldf
            access$prepareReceiverForSuspension(r7, r5, r8, r9)     // Catch: java.lang.Throwable -> L16a
        Ldf:
            r5 = 0
            r22 = r2
            goto L120
        Le4:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> L16a
            if (r4 != r5) goto L101
            long r22 = r7.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L16a
            int r5 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r5 >= 0) goto Lf5
            r8.cleanPrev()     // Catch: java.lang.Throwable -> L16a
        Lf5:
            r9 = r26
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            goto L74
        L101:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()     // Catch: java.lang.Throwable -> L16a
            if (r4 == r5) goto L123
            r8.cleanPrev()     // Catch: java.lang.Throwable -> L16a
            r5 = r4
            r12 = 0
            r22 = r2
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r1.onUndeliveredElement     // Catch: java.lang.Throwable -> L16a
            if (r2 == 0) goto L11a
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()     // Catch: java.lang.Throwable -> L16a
            kotlin.jvm.functions.Function1 r16 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r2, r5, r3)     // Catch: java.lang.Throwable -> L16a
        L11a:
            r2 = r16
            r0.resume(r5, r2)     // Catch: java.lang.Throwable -> L16a
        L120:
            goto L158
        L123:
            r22 = r2
            r2 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "unexpected"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L16a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L16a
            throw r3     // Catch: java.lang.Throwable -> L16a
        L132:
            r0 = move-exception
            r20 = r4
            r21 = r5
            goto L184
        L138:
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r15.cleanPrev()     // Catch: java.lang.Throwable -> L16a
            r2 = r14
            r3 = 0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r1.onUndeliveredElement     // Catch: java.lang.Throwable -> L16a
            if (r4 == 0) goto L151
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()     // Catch: java.lang.Throwable -> L16a
            kotlin.jvm.functions.Function1 r16 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r4, r2, r5)     // Catch: java.lang.Throwable -> L16a
        L151:
            r4 = r16
            r0.resume(r2, r4)     // Catch: java.lang.Throwable -> L16a
        L158:
            java.lang.Object r0 = r21.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L168
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r29)
        L168:
            return r0
        L16a:
            r0 = move-exception
            goto L184
        L16c:
            r0 = move-exception
            goto L17c
        L16e:
            r0 = move-exception
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r15 = r8
            goto L184
        L179:
            r0 = move-exception
            r15 = r25
        L17c:
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
        L184:
            r21.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r0
    }

    private final void registerSelectForReceive(kotlinx.coroutines.selects.SelectInstance<?> r13, java.lang.Object r14) {
            r12 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        Le:
            boolean r2 = r12.isClosedForReceive()
            if (r2 == 0) goto L1d
            r2 = 0
            r12.onClosedSelectOnReceive(r13)
            r3 = r12
            r8 = r13
            goto L83
        L1d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r6 = r2.getAndIncrement(r12)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r9 = r6 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r6 % r2
            int r5 = (int) r2
            long r2 = r1.id
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L40
            kotlinx.coroutines.channels.ChannelSegment r2 = access$findSegmentReceive(r12, r9, r1)
            if (r2 != 0) goto L3d
            goto Le
        L3d:
            r1 = r2
            r4 = r1
            goto L41
        L40:
            r4 = r1
        L41:
            r3 = r12
            r8 = r13
            java.lang.Object r13 = access$updateCellReceive(r3, r4, r5, r6, r8)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r13 != r1) goto L5f
            boolean r1 = r8 instanceof kotlinx.coroutines.Waiter
            if (r1 == 0) goto L56
            r1 = r8
            kotlinx.coroutines.Waiter r1 = (kotlinx.coroutines.Waiter) r1
            goto L57
        L56:
            r1 = 0
        L57:
            if (r1 == 0) goto L5c
            access$prepareReceiverForSuspension(r12, r1, r4, r5)
        L5c:
            r1 = 0
            goto L81
        L5f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r13 != r1) goto L73
            long r1 = r12.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L70
            r4.cleanPrev()
        L70:
            r1 = r4
            r13 = r8
            goto Le
        L73:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r13 == r1) goto L84
            r4.cleanPrev()
            r1 = r13
            r2 = 0
            r8.selectInRegistrationPhase(r1)
        L81:
        L83:
            return
        L84:
            r1 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r11 = "unexpected"
            java.lang.String r11 = r11.toString()
            r2.<init>(r11)
            throw r2
    }

    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r13) {
            r12 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r12.onUndeliveredElement
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m1703constructorimpl$default(r2, r3, r2)
            r4 = r13
        La:
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r5 = r5 - r3
        Le:
            r6 = -1
            if (r6 >= r5) goto Lba
            long r7 = r4.id
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r9 = (long) r9
            long r7 = r7 * r9
            long r9 = (long) r5
            long r7 = r7 + r9
        L19:
            java.lang.Object r9 = r4.getState$kotlinx_coroutines_core(r5)
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r9 == r10) goto Lc2
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r9 != r10) goto L4d
            long r10 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 < 0) goto Lc2
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r10 = r4.casState$kotlinx_coroutines_core(r5, r9, r10)
            if (r10 == 0) goto L19
            if (r0 == 0) goto L45
            java.lang.Object r6 = r4.getElement$kotlinx_coroutines_core(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r6, r1)
        L45:
            r4.cleanElement$kotlinx_coroutines_core(r5)
            r4.onSlotCleaned()
            goto Lb6
        L4d:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r9 == r10) goto La8
            if (r9 != 0) goto L56
            goto La8
        L56:
            boolean r10 = r9 instanceof kotlinx.coroutines.Waiter
            if (r10 != 0) goto L73
            boolean r10 = r9 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r10 == 0) goto L5f
            goto L73
        L5f:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r9 == r10) goto Lc2
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r9 != r10) goto L6c
            goto Lc2
        L6c:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r9 == r10) goto L19
            goto Lb6
        L73:
            long r10 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 < 0) goto Lc2
            boolean r10 = r9 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r10 == 0) goto L85
            r10 = r9
            kotlinx.coroutines.channels.WaiterEB r10 = (kotlinx.coroutines.channels.WaiterEB) r10
            kotlinx.coroutines.Waiter r10 = r10.waiter
            goto L88
        L85:
            r10 = r9
            kotlinx.coroutines.Waiter r10 = (kotlinx.coroutines.Waiter) r10
        L88:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r11 = r4.casState$kotlinx_coroutines_core(r5, r9, r11)
            if (r11 == 0) goto L19
            if (r0 == 0) goto L9d
            java.lang.Object r6 = r4.getElement$kotlinx_coroutines_core(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r6, r1)
        L9d:
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m1708plusFjFbRPM(r2, r10)
            r4.cleanElement$kotlinx_coroutines_core(r5)
            r4.onSlotCleaned()
            goto Lb6
        La8:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r10 = r4.casState$kotlinx_coroutines_core(r5, r9, r10)
            if (r10 == 0) goto L19
            r4.onSlotCleaned()
        Lb6:
            int r5 = r5 + (-1)
            goto Le
        Lba:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r4.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            if (r5 != 0) goto Lf6
        Lc2:
            r5 = 0
            if (r2 == 0) goto Lf0
            boolean r7 = r2 instanceof java.util.ArrayList
            if (r7 != 0) goto Ld2
            r3 = r2
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r6 = 0
            r12.resumeSenderOnCancelledChannel(r3)
            goto Lef
        Ld2:
            java.lang.String r7 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r7)
            r7 = r2
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r8 = r7.size()
            int r8 = r8 - r3
        Ldf:
            if (r6 >= r8) goto Lef
            java.lang.Object r3 = r7.get(r8)
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r9 = 0
            r12.resumeSenderOnCancelledChannel(r3)
            int r8 = r8 + (-1)
            goto Ldf
        Lef:
        Lf0:
            if (r1 != 0) goto Lf3
            return
        Lf3:
            r3 = r1
            r5 = 0
            throw r3
        Lf6:
            r4 = r5
            goto La
    }

    private final void resumeReceiverOnClosedChannel(kotlinx.coroutines.Waiter r2) {
            r1 = this;
            r0 = 1
            r1.resumeWaiterOnClosedChannel(r2, r0)
            return
    }

    private final void resumeSenderOnCancelledChannel(kotlinx.coroutines.Waiter r2) {
            r1 = this;
            r0 = 0
            r1.resumeWaiterOnClosedChannel(r2, r0)
            return
    }

    private final void resumeWaiterOnClosedChannel(kotlinx.coroutines.Waiter r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r0 == 0) goto L1d
            r0 = r4
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r0 = (kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) r0
            kotlinx.coroutines.CancellableContinuation r0 = r0.getCont()
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            goto L79
        L1d:
            boolean r0 = r4 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L3d
            r0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            if (r5 == 0) goto L2d
            java.lang.Throwable r1 = r3.getReceiveException()
            goto L31
        L2d:
            java.lang.Throwable r1 = r3.getSendException()
        L31:
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            goto L79
        L3d:
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r0 == 0) goto L60
            r0 = r4
            kotlinx.coroutines.channels.ReceiveCatching r0 = (kotlinx.coroutines.channels.ReceiveCatching) r0
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r0 = r0.cont
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r2 = r3.getCloseCause()
            java.lang.Object r1 = r1.m1680closedJP2dKIU(r2)
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            goto L79
        L60:
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator
            if (r0 == 0) goto L6b
            r0 = r4
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r0 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r0
            r0.tryResumeHasNextOnClosedChannel()
            goto L79
        L6b:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto L7a
            r0 = r4
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            r0.trySelect(r3, r1)
        L79:
            return
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected waiter: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ <E> java.lang.Object send$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r21, E r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
            r0 = 0
            r7 = r0
            r1 = r21
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = access$getSendSegment$volatile$FU()
            java.lang.Object r2 = r2.get(r1)
            kotlinx.coroutines.channels.ChannelSegment r2 = (kotlinx.coroutines.channels.ChannelSegment) r2
        L11:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getSendersAndCloseStatus$volatile$FU()
            long r9 = r3.getAndIncrement(r1)
            r3 = r9
            r5 = 0
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r3 & r11
            boolean r8 = access$isClosedForSend0(r1, r9)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r3 = (long) r3
            long r11 = r5 / r3
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r3 = (long) r3
            long r3 = r5 % r3
            int r3 = (int) r3
            long r13 = r2.id
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L51
            kotlinx.coroutines.channels.ChannelSegment r4 = access$findSegmentSend(r1, r11, r2)
            if (r4 != 0) goto L50
            if (r8 == 0) goto L4f
            r4 = 0
            java.lang.Object r13 = r21.onClosedSend(r22, r23)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r13 != r14) goto L4c
            return r13
        L4c:
            goto Lcc
        L4f:
            goto L11
        L50:
            r2 = r4
        L51:
            r4 = r22
            int r13 = access$updateCellSend(r1, r2, r3, r4, r5, r7, r8)
            switch(r13) {
                case 0: goto Lc4;
                case 1: goto Lbf;
                case 2: goto L99;
                case 3: goto L7e;
                case 4: goto L65;
                case 5: goto L5e;
                default: goto L5a;
            }
        L5a:
            r20 = r0
            goto Lcf
        L5e:
            r2.cleanPrev()
            r20 = r0
            goto Lcf
        L65:
            long r13 = r1.getReceiversCounter$kotlinx_coroutines_core()
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r4 >= 0) goto L70
            r2.cleanPrev()
        L70:
            r4 = 0
            java.lang.Object r13 = r21.onClosedSend(r22, r23)
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r13 != r14) goto L7c
            return r13
        L7c:
            goto Lcc
        L7e:
            r4 = r2
            r15 = r3
            r14 = r4
            r17 = r5
            r16 = r22
            r4 = 0
            r13 = r21
            r19 = r23
            r20 = r0
            java.lang.Object r0 = r13.sendOnNoWaiterSuspend(r14, r15, r16, r17, r19)
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r13) goto L97
            return r0
        L97:
            goto Lcc
        L99:
            r20 = r0
            if (r8 == 0) goto Lae
            r2.onSlotCleaned()
            r0 = 0
            java.lang.Object r4 = r21.onClosedSend(r22, r23)
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r13) goto Lac
            return r4
        Lac:
            goto Lcc
        Lae:
            r0 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 != 0) goto Lb7
            goto Lcc
        Lb7:
            r4 = 0
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        Lbf:
            r20 = r0
            r0 = 0
            goto Lcc
        Lc4:
            r20 = r0
            r2.cleanPrev()
            r0 = 0
        Lcc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lcf:
            r0 = r20
            goto L11
    }

    static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r24, E r25, kotlin.coroutines.Continuation<? super java.lang.Boolean> r26) {
            r0 = r24
            r8 = 0
            r9 = r26
            r10 = 0
            kotlinx.coroutines.CancellableContinuationImpl r1 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r9)
            r11 = 1
            r1.<init>(r2, r11)
            r12 = r1
            r12.initCancellability()
            r13 = r12
            kotlinx.coroutines.CancellableContinuation r13 = (kotlinx.coroutines.CancellableContinuation) r13
            r14 = 0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r0.onUndeliveredElement
            r15 = 0
            if (r1 != 0) goto L1f
            r1 = r11
            goto L20
        L1f:
            r1 = r15
        L20:
            if (r1 == 0) goto L126
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r6 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r6.<init>(r13)
            r16 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L36:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r2 = r2.getAndIncrement(r0)
            r4 = r2
            r7 = 0
            r17 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r17
            boolean r7 = access$isClosedForSend0(r0, r2)
            r17 = r11
            int r11 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r18 = r2
            long r2 = (long) r11
            long r2 = r4 / r2
            int r11 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r20 = r4
            long r4 = (long) r11
            long r4 = r20 % r4
            int r4 = (int) r4
            r11 = r4
            long r4 = r1.id
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L83
            kotlinx.coroutines.channels.ChannelSegment r4 = access$findSegmentSend(r0, r2, r1)
            if (r4 != 0) goto L82
            if (r7 == 0) goto L7f
            r4 = 0
            r5 = r13
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            kotlin.Result$Companion r17 = kotlin.Result.Companion
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r15)
            java.lang.Object r15 = kotlin.Result.m153constructorimpl(r15)
            r5.resumeWith(r15)
            goto L111
        L7f:
            r11 = r17
            goto L36
        L82:
            r1 = r4
        L83:
            r4 = r20
            r20 = r2
            r2 = r11
            r3 = r25
            int r11 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r11) {
                case 0: goto Lfc;
                case 1: goto Lea;
                case 2: goto Lc2;
                case 3: goto Lb5;
                case 4: goto L98;
                case 5: goto L93;
                default: goto L91;
            }
        L91:
            goto L122
        L93:
            r1.cleanPrev()
            goto L122
        L98:
            long r22 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r3 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r3 >= 0) goto La3
            r1.cleanPrev()
        La3:
            r3 = 0
            r11 = r13
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            kotlin.Result$Companion r17 = kotlin.Result.Companion
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r15)
            java.lang.Object r15 = kotlin.Result.m153constructorimpl(r15)
            r11.resumeWith(r15)
            goto L111
        Lb5:
            r3 = 0
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r11.<init>(r15)
            throw r11
        Lc2:
            if (r7 == 0) goto Ld9
            r1.onSlotCleaned()
            r3 = 0
            r11 = r13
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            kotlin.Result$Companion r17 = kotlin.Result.Companion
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r15)
            java.lang.Object r15 = kotlin.Result.m153constructorimpl(r15)
            r11.resumeWith(r15)
            goto L111
        Ld9:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto Le1
            r3 = r6
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto Le2
        Le1:
            r3 = 0
        Le2:
            if (r3 == 0) goto Le7
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        Le7:
            r3 = 0
            goto L111
        Lea:
            r3 = 0
            r11 = r13
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            kotlin.Result$Companion r15 = kotlin.Result.Companion
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r17)
            java.lang.Object r15 = kotlin.Result.m153constructorimpl(r15)
            r11.resumeWith(r15)
            goto L111
        Lfc:
            r1.cleanPrev()
            r3 = 0
            r11 = r13
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            kotlin.Result$Companion r15 = kotlin.Result.Companion
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r17)
            java.lang.Object r15 = kotlin.Result.m153constructorimpl(r15)
            r11.resumeWith(r15)
        L111:
            java.lang.Object r1 = r12.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L120
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r26)
        L120:
            return r1
        L122:
            r11 = r17
            goto L36
        L126:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final <R> R sendImpl(E r17, java.lang.Object r18, kotlin.jvm.functions.Function0<? extends R> r19, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? extends R> r20, kotlin.jvm.functions.Function0<? extends R> r21, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super E, ? super java.lang.Long, ? extends R> r22) {
            r16 = this;
            r0 = r16
            r8 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        Ld:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r9 = r2.getAndIncrement(r0)
            r2 = r9
            r4 = 0
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r2 & r5
            boolean r7 = access$isClosedForSend0(r0, r9)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r11 = r4 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r13 = r1.id
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 == 0) goto L43
            kotlinx.coroutines.channels.ChannelSegment r3 = access$findSegmentSend(r0, r11, r1)
            if (r3 != 0) goto L42
            if (r7 == 0) goto L41
            java.lang.Object r3 = r21.invoke()
            return r3
        L41:
            goto Ld
        L42:
            r1 = r3
        L43:
            r3 = r17
            r6 = r18
            int r13 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r13) {
                case 0: goto Lb2;
                case 1: goto La7;
                case 2: goto L80;
                case 3: goto L6f;
                case 4: goto L5f;
                case 5: goto L55;
                default: goto L4e;
            }
        L4e:
            r14 = r17
            r13 = r20
            r15 = r22
            goto Ld
        L55:
            r1.cleanPrev()
            r14 = r17
            r13 = r20
            r15 = r22
            goto Ld
        L5f:
            long r13 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L6a
            r1.cleanPrev()
        L6a:
            java.lang.Object r3 = r21.invoke()
            return r3
        L6f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r14 = r17
            r15 = r22
            java.lang.Object r3 = r15.invoke(r1, r3, r14, r13)
            return r3
        L80:
            r14 = r17
            r15 = r22
            if (r7 == 0) goto L8e
            r1.onSlotCleaned()
            java.lang.Object r3 = r21.invoke()
            return r3
        L8e:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L96
            r3 = r6
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto L97
        L96:
            r3 = 0
        L97:
            if (r3 == 0) goto L9c
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        L9c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r13 = r20
            java.lang.Object r3 = r13.invoke(r1, r3)
            return r3
        La7:
            r14 = r17
            r13 = r20
            r15 = r22
            java.lang.Object r3 = r19.invoke()
            return r3
        Lb2:
            r14 = r17
            r13 = r20
            r15 = r22
            r1.cleanPrev()
            java.lang.Object r3 = r19.invoke()
            return r3
    }

    static /* synthetic */ java.lang.Object sendImpl$default(kotlinx.coroutines.channels.BufferedChannel r16, java.lang.Object r17, java.lang.Object r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function2 r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function4 r22, int r23, java.lang.Object r24) {
            r0 = r16
            if (r24 != 0) goto Lc2
            r1 = r23 & 32
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.BufferedChannel$sendImpl$1 r1 = kotlinx.coroutines.channels.BufferedChannel.C00711.INSTANCE
            kotlin.jvm.functions.Function4 r1 = (kotlin.jvm.functions.Function4) r1
            r8 = r1
            goto L10
        Le:
            r8 = r22
        L10:
            r9 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L1b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r10 = r2.getAndIncrement(r0)
            r2 = r10
            r4 = 0
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r2 & r5
            boolean r7 = access$isClosedForSend0(r0, r10)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r12 = r4 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r14 = r1.id
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 == 0) goto L51
            kotlinx.coroutines.channels.ChannelSegment r3 = access$findSegmentSend(r0, r12, r1)
            if (r3 != 0) goto L50
            if (r7 == 0) goto L4f
            java.lang.Object r3 = r21.invoke()
            return r3
        L4f:
            goto L1b
        L50:
            r1 = r3
        L51:
            r3 = r17
            r6 = r18
            int r14 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r14) {
                case 0: goto Lb6;
                case 1: goto Lad;
                case 2: goto L88;
                case 3: goto L79;
                case 4: goto L69;
                case 5: goto L61;
                default: goto L5c;
            }
        L5c:
            r15 = r17
            r14 = r20
            goto L1b
        L61:
            r1.cleanPrev()
            r15 = r17
            r14 = r20
            goto L1b
        L69:
            long r14 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 >= 0) goto L74
            r1.cleanPrev()
        L74:
            java.lang.Object r3 = r21.invoke()
            return r3
        L79:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r15 = r17
            java.lang.Object r3 = r8.invoke(r1, r3, r15, r14)
            return r3
        L88:
            r15 = r17
            if (r7 == 0) goto L94
            r1.onSlotCleaned()
            java.lang.Object r3 = r21.invoke()
            return r3
        L94:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L9c
            r3 = r6
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto L9d
        L9c:
            r3 = 0
        L9d:
            if (r3 == 0) goto La2
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        La2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r14 = r20
            java.lang.Object r3 = r14.invoke(r1, r3)
            return r3
        Lad:
            r15 = r17
            r14 = r20
            java.lang.Object r3 = r19.invoke()
            return r3
        Lb6:
            r15 = r17
            r14 = r20
            r1.cleanPrev()
            java.lang.Object r3 = r19.invoke()
            return r3
        Lc2:
            r15 = r17
            r6 = r18
            r14 = r20
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: sendImpl"
            r1.<init>(r2)
            throw r1
    }

    private final void sendImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> r18, int r19, E r20, long r21, kotlinx.coroutines.Waiter r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25) {
            r17 = this;
            r8 = 0
            r7 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r23
            int r7 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            java.lang.String r9 = "unexpected"
            switch(r7) {
                case 0: goto Lfa;
                case 1: goto Lf0;
                case 2: goto Le6;
                case 3: goto L17;
                case 4: goto Ld1;
                case 5: goto L27;
                default: goto L17;
            }
        L17:
            r1 = r18
            r2 = r19
            r6 = r23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r9.toString()
            r3.<init>(r4)
            throw r3
        L27:
            r18.cleanPrev()
            r10 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L38:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r11 = r2.getAndIncrement(r0)
            r2 = r11
            r4 = 0
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r2 & r5
            boolean r7 = access$isClosedForSend0(r0, r11)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r13 = r4 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            r6 = r2
            long r2 = r1.id
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L72
            kotlinx.coroutines.channels.ChannelSegment r2 = access$findSegmentSend(r0, r13, r1)
            if (r2 != 0) goto L71
            if (r7 == 0) goto L70
            java.lang.Object r2 = r25.invoke()
            r6 = r23
            goto Lca
        L70:
            goto L38
        L71:
            r1 = r2
        L72:
            r3 = r20
            r2 = r6
            r6 = r23
            int r15 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r15) {
                case 0: goto Lc2;
                case 1: goto Lbc;
                case 2: goto L9f;
                case 3: goto L94;
                case 4: goto L83;
                case 5: goto L7f;
                default: goto L7e;
            }
        L7e:
            goto L38
        L7f:
            r1.cleanPrev()
            goto L38
        L83:
            long r15 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r1.cleanPrev()
        L8e:
            java.lang.Object r3 = r25.invoke()
            r2 = r3
            goto Lca
        L94:
            r3 = 0
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r15.<init>(r9)
            throw r15
        L9f:
            if (r7 == 0) goto Laa
            r1.onSlotCleaned()
            java.lang.Object r3 = r25.invoke()
            r2 = r3
            goto Lca
        Laa:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto Lb0
            r3 = r6
            goto Lb1
        Lb0:
            r3 = 0
        Lb1:
            if (r3 == 0) goto Lb6
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        Lb6:
            r3 = 0
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            r2 = r3
            goto Lca
        Lbc:
            java.lang.Object r3 = r24.invoke()
            r2 = r3
            goto Lca
        Lc2:
            r1.cleanPrev()
            java.lang.Object r3 = r24.invoke()
            r2 = r3
        Lca:
            kotlin.Unit r2 = (kotlin.Unit) r2
            r1 = r18
            r2 = r19
            goto L106
        Ld1:
            r6 = r23
            long r1 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lde
            r18.cleanPrev()
        Lde:
            r25.invoke()
            r1 = r18
            r2 = r19
            goto L106
        Le6:
            r6 = r23
            r1 = r18
            r2 = r19
            access$prepareSenderForSuspension(r0, r6, r1, r2)
            goto L106
        Lf0:
            r1 = r18
            r2 = r19
            r6 = r23
            r24.invoke()
            goto L106
        Lfa:
            r1 = r18
            r2 = r19
            r6 = r23
            r1.cleanPrev()
            r24.invoke()
        L106:
            return
    }

    private final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r28, int r29, E r30, long r31, kotlin.coroutines.Continuation<? super kotlin.Unit> r33) {
            r27 = this;
            r1 = r27
            r10 = 0
            r11 = r33
            r12 = 0
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r11)
            kotlinx.coroutines.CancellableContinuationImpl r13 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r0 = r13
            r14 = 0
            r2 = r27
            r15 = 0
            r8 = r0
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8     // Catch: java.lang.Throwable -> L1b4
            r9 = 0
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            int r8 = access$updateCellSend(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L1b2
            java.lang.String r16 = "unexpected"
            switch(r8) {
                case 0: goto L175;
                case 1: goto L15e;
                case 2: goto L14a;
                case 3: goto L29;
                case 4: goto L130;
                case 5: goto L33;
                default: goto L29;
            }
        L29:
            r3 = r28
            r4 = r29
            r18 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b2
            goto L1aa
        L33:
            r28.cleanPrev()     // Catch: java.lang.Throwable -> L158
            r17 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getSendSegment$volatile$FU()     // Catch: java.lang.Throwable -> L158
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L158
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3     // Catch: java.lang.Throwable -> L158
        L45:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = access$getSendersAndCloseStatus$volatile$FU()     // Catch: java.lang.Throwable -> L158
            long r6 = r4.getAndIncrement(r2)     // Catch: java.lang.Throwable -> L158
            r8 = r6
            r4 = 0
            r18 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r8 = r8 & r18
            boolean r4 = access$isClosedForSend0(r2, r6)     // Catch: java.lang.Throwable -> L158
            r18 = r0
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L158
            r19 = r6
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L158
            long r6 = r8 / r6
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> L158
            r21 = r8
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L158
            long r8 = r21 % r8
            int r0 = (int) r8     // Catch: java.lang.Throwable -> L158
            long r8 = r3.id     // Catch: java.lang.Throwable -> L158
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L8c
            kotlinx.coroutines.channels.ChannelSegment r8 = access$findSegmentSend(r2, r6, r3)     // Catch: java.lang.Throwable -> L158
            if (r8 != 0) goto L8b
            if (r4 == 0) goto L88
            r8 = 0
            r9 = r18
            kotlinx.coroutines.CancellableContinuation r9 = (kotlinx.coroutines.CancellableContinuation) r9     // Catch: java.lang.Throwable -> L158
            access$onClosedSendOnNoWaiterSuspend(r1, r5, r9)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        L88:
            r0 = r18
            goto L45
        L8b:
            r3 = r8
        L8c:
            r8 = r18
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8     // Catch: java.lang.Throwable -> L158
            r25 = r21
            r21 = r6
            r6 = r25
            r9 = r4
            r4 = r0
            int r0 = access$updateCellSend(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L158
            switch(r0) {
                case 0: goto L112;
                case 1: goto Lfa;
                case 2: goto Lcc;
                case 3: goto Lbf;
                case 4: goto La6;
                case 5: goto La1;
                default: goto L9f;
            }     // Catch: java.lang.Throwable -> L158
        L9f:
            goto L12c
        La1:
            r3.cleanPrev()     // Catch: java.lang.Throwable -> L158
            goto L12c
        La6:
            long r23 = r2.getReceiversCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L158
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            r3.cleanPrev()     // Catch: java.lang.Throwable -> L158
        Lb1:
            r0 = 0
            r8 = r18
            kotlinx.coroutines.CancellableContinuation r8 = (kotlinx.coroutines.CancellableContinuation) r8     // Catch: java.lang.Throwable -> L158
            access$onClosedSendOnNoWaiterSuspend(r1, r5, r8)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        Lbf:
            r0 = 0
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L158
            r23 = r0
            java.lang.String r0 = r16.toString()     // Catch: java.lang.Throwable -> L158
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L158
            throw r8     // Catch: java.lang.Throwable -> L158
        Lcc:
            if (r9 == 0) goto Ldf
            r3.onSlotCleaned()     // Catch: java.lang.Throwable -> L158
            r0 = 0
            r8 = r18
            kotlinx.coroutines.CancellableContinuation r8 = (kotlinx.coroutines.CancellableContinuation) r8     // Catch: java.lang.Throwable -> L158
            access$onClosedSendOnNoWaiterSuspend(r1, r5, r8)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        Ldf:
            r0 = r18
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L158
            boolean r0 = r0 instanceof kotlinx.coroutines.Waiter     // Catch: java.lang.Throwable -> L158
            if (r0 == 0) goto Lec
            r0 = r18
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L158
            goto Led
        Lec:
            r0 = 0
        Led:
            if (r0 == 0) goto Lf2
            access$prepareSenderForSuspension(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L158
        Lf2:
            r0 = 0
            r3 = r28
            r4 = r29
            goto L18f
        Lfa:
            r0 = 0
            r8 = r18
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.lang.Throwable -> L158
            kotlin.Result$Companion r16 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L158
            kotlin.Unit r16 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L158
            r23 = r0
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r16)     // Catch: java.lang.Throwable -> L158
            r8.resumeWith(r0)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        L112:
            r3.cleanPrev()     // Catch: java.lang.Throwable -> L158
            r0 = 0
            r8 = r18
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.lang.Throwable -> L158
            kotlin.Result$Companion r16 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L158
            kotlin.Unit r16 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L158
            r23 = r0
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r16)     // Catch: java.lang.Throwable -> L158
            r8.resumeWith(r0)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        L12c:
            r0 = r18
            goto L45
        L130:
            r18 = r0
            long r3 = r2.getReceiversCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L158
            int r0 = (r31 > r3 ? 1 : (r31 == r3 ? 0 : -1))
            if (r0 >= 0) goto L13d
            r28.cleanPrev()     // Catch: java.lang.Throwable -> L158
        L13d:
            r0 = 0
            r3 = r18
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3     // Catch: java.lang.Throwable -> L158
            access$onClosedSendOnNoWaiterSuspend(r1, r5, r3)     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            goto L18f
        L14a:
            r18 = r0
            r0 = r18
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0     // Catch: java.lang.Throwable -> L158
            r3 = r28
            r4 = r29
            access$prepareSenderForSuspension(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L1b2
            goto L18f
        L158:
            r0 = move-exception
            r3 = r28
            r4 = r29
            goto L1bb
        L15e:
            r3 = r28
            r4 = r29
            r18 = r0
            r0 = 0
            r6 = r18
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L1b2
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b2
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1b2
            java.lang.Object r7 = kotlin.Result.m153constructorimpl(r7)     // Catch: java.lang.Throwable -> L1b2
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L1b2
            goto L18f
        L175:
            r3 = r28
            r4 = r29
            r18 = r0
            r3.cleanPrev()     // Catch: java.lang.Throwable -> L1b2
            r0 = 0
            r6 = r18
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L1b2
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b2
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1b2
            java.lang.Object r7 = kotlin.Result.m153constructorimpl(r7)     // Catch: java.lang.Throwable -> L1b2
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L1b2
        L18f:
            java.lang.Object r0 = r13.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L19f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r33)
        L19f:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L1a6
            return r0
        L1a6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1aa:
            java.lang.String r6 = r16.toString()     // Catch: java.lang.Throwable -> L1b2
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1b2
            throw r0     // Catch: java.lang.Throwable -> L1b2
        L1b2:
            r0 = move-exception
            goto L1bb
        L1b4:
            r0 = move-exception
            r3 = r28
            r4 = r29
            r5 = r30
        L1bb:
            r13.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r0
    }

    private final /* synthetic */ void setBufferEnd$volatile(long r1) {
            r0 = this;
            r0.bufferEnd$volatile = r1
            return
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(java.lang.Object r1) {
            r0 = this;
            r0.bufferEndSegment$volatile = r1
            return
    }

    private final /* synthetic */ void setCloseHandler$volatile(java.lang.Object r1) {
            r0 = this;
            r0.closeHandler$volatile = r1
            return
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long r1) {
            r0 = this;
            r0.completedExpandBuffersAndPauseFlag$volatile = r1
            return
    }

    private final /* synthetic */ void setReceiveSegment$volatile(java.lang.Object r1) {
            r0 = this;
            r0.receiveSegment$volatile = r1
            return
    }

    private final /* synthetic */ void setReceivers$volatile(long r1) {
            r0 = this;
            r0.receivers$volatile = r1
            return
    }

    private final /* synthetic */ void setSendSegment$volatile(java.lang.Object r1) {
            r0 = this;
            r0.sendSegment$volatile = r1
            return
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long r1) {
            r0 = this;
            r0.sendersAndCloseStatus$volatile = r1
            return
    }

    private final /* synthetic */ void set_closeCause$volatile(java.lang.Object r1) {
            r0 = this;
            r0._closeCause$volatile = r1
            return
    }

    private final boolean shouldSendSuspend(long r6) {
            r5 = this;
            boolean r0 = r5.isClosedForSend0(r6)
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r6
            r2 = 0
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r3
            boolean r0 = r5.bufferOrRendezvousSend(r0)
            r0 = r0 ^ 1
            return r0
    }

    private final boolean tryResumeReceiver(java.lang.Object r5, E r6) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto Ld
            r0 = r5
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            boolean r0 = r0.trySelect(r4, r6)
            goto L77
        Ld:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveCatching
            r1 = 0
            if (r0 == 0) goto L41
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.channels.ReceiveCatching r0 = (kotlinx.coroutines.channels.ReceiveCatching) r0
            r0 = r5
            kotlinx.coroutines.channels.ReceiveCatching r0 = (kotlinx.coroutines.channels.ReceiveCatching) r0
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r0 = r0.cont
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r2 = r2.m1682successJP2dKIU(r6)
            kotlinx.coroutines.channels.ChannelResult r2 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r2)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r4.onUndeliveredElement
            if (r3 == 0) goto L3c
            r1 = r5
            kotlinx.coroutines.channels.ReceiveCatching r1 = (kotlinx.coroutines.channels.ReceiveCatching) r1
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r1 = r1.cont
            kotlin.coroutines.CoroutineContext r1 = r1.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r3, r6, r1)
        L3c:
            boolean r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r0, r2, r1)
            goto L77
        L41:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator
            if (r0 == 0) goto L55
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r0 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r0
            r0 = r5
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r0 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r0
            boolean r0 = r0.tryResumeHasNext(r6)
            goto L77
        L55:
            boolean r0 = r5 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L78
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r4.onUndeliveredElement
            if (r2 == 0) goto L73
            r1 = r5
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlin.coroutines.CoroutineContext r1 = r1.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r2, r6, r1)
        L73:
            boolean r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r0, r6, r1)
        L77:
            return r0
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected receiver type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryResumeSender(java.lang.Object r5, kotlinx.coroutines.channels.ChannelSegment<E> r6, int r7) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.CancellableContinuation
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L19
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            boolean r0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(r0, r3, r2, r1, r2)
            goto L51
        L19:
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectInstance
            r3 = 1
            if (r0 == 0) goto L3e
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.selects.SelectImplementation r0 = (kotlinx.coroutines.selects.SelectImplementation) r0
            r0 = r5
            kotlinx.coroutines.selects.SelectImplementation r0 = (kotlinx.coroutines.selects.SelectImplementation) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = r0.trySelectDetailed(r4, r1)
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            if (r0 != r1) goto L36
            r6.cleanElement$kotlinx_coroutines_core(r7)
        L36:
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            if (r0 != r1) goto L3c
            r0 = r3
            goto L51
        L3c:
            r0 = 0
            goto L51
        L3e:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r0 == 0) goto L52
            r0 = r5
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r0 = (kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) r0
            kotlinx.coroutines.CancellableContinuation r0 = r0.getCont()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(r0, r3, r2, r1, r2)
        L51:
            return r0
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected waiter: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final /* synthetic */ void update$atomicfu(java.lang.Object r7, java.util.concurrent.atomic.AtomicLongFieldUpdater r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9) {
            r6 = this;
        L0:
            long r2 = r8.get(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r1 = r7
            r0 = r8
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            if (r7 == 0) goto L1b
            return
        L1b:
            r8 = r0
            r7 = r1
            goto L0
    }

    private final boolean updateCellExpandBuffer(kotlinx.coroutines.channels.ChannelSegment<E> r4, int r5, long r6) {
            r3 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core(r5)
            boolean r1 = r0 instanceof kotlinx.coroutines.Waiter
            if (r1 == 0) goto L38
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getReceivers$volatile$FU()
            long r1 = r1.get(r3)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 < 0) goto L38
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r1 = r4.casState$kotlinx_coroutines_core(r5, r0, r1)
            if (r1 == 0) goto L38
            boolean r1 = r3.tryResumeSender(r0, r4, r5)
            if (r1 == 0) goto L2b
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r4.setState$kotlinx_coroutines_core(r5, r1)
            r1 = 1
            goto L37
        L2b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r4.setState$kotlinx_coroutines_core(r5, r1)
            r1 = 0
            r4.onCancelledRequest(r5, r1)
        L37:
            return r1
        L38:
            boolean r1 = r3.updateCellExpandBufferSlow(r4, r5, r6)
            return r1
    }

    private final boolean updateCellExpandBufferSlow(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, long r9) {
            r6 = this;
        L1:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.Waiter
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getReceivers$volatile$FU()
            long r4 = r1.get(r6)
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L28
            kotlinx.coroutines.channels.WaiterEB r1 = new kotlinx.coroutines.channels.WaiterEB
            r2 = r0
            kotlinx.coroutines.Waiter r2 = (kotlinx.coroutines.Waiter) r2
            r1.<init>(r2)
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            return r3
        L28:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            boolean r1 = r6.tryResumeSender(r0, r7, r8)
            if (r1 == 0) goto L3f
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r7.setState$kotlinx_coroutines_core(r8, r1)
            r2 = r3
            goto L4a
        L3f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r7.setState$kotlinx_coroutines_core(r8, r1)
            r7.onCancelledRequest(r8, r2)
        L4a:
            return r2
        L4b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r1) goto L52
            return r2
        L52:
            if (r0 != 0) goto L5f
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            return r3
        L5f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L64
            return r3
        L64:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 == r1) goto La3
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r0 == r1) goto La3
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r0 != r1) goto L77
            goto La3
        L77:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r1) goto L7e
            return r3
        L7e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r0 != r1) goto L86
            goto L1
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected cell state: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        La3:
            return r3
    }

    private final java.lang.Object updateCellReceive(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, long r9, java.lang.Object r11) {
            r6 = this;
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            if (r0 != 0) goto L30
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.get(r6)
            r3 = 0
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r4
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 < 0) goto L46
            if (r11 != 0) goto L22
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            return r3
        L22:
            boolean r3 = r7.casState$kotlinx_coroutines_core(r8, r0, r11)
            if (r3 == 0) goto L46
            r6.expandBuffer()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            return r3
        L30:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L46
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L46
            r6.expandBuffer()
            java.lang.Object r1 = r7.retrieveElement$kotlinx_coroutines_core(r8)
            return r1
        L46:
            java.lang.Object r1 = r6.updateCellReceiveSlow(r7, r8, r9, r11)
            return r1
    }

    private final java.lang.Object updateCellReceiveSlow(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, long r9, java.lang.Object r11) {
            r6 = this;
        L1:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            if (r0 == 0) goto L92
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r1) goto L11
            goto L92
        L11:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L27
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            r6.expandBuffer()
            java.lang.Object r1 = r7.retrieveElement$kotlinx_coroutines_core(r8)
            return r1
        L27:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r1) goto L32
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r1
        L32:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r1) goto L3d
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r1
        L3d:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r1) goto L4b
            r6.expandBuffer()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r1
        L4b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r0 == r1) goto L1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            boolean r2 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r2 == 0) goto L67
            r2 = r0
            kotlinx.coroutines.channels.WaiterEB r2 = (kotlinx.coroutines.channels.WaiterEB) r2
            kotlinx.coroutines.Waiter r2 = r2.waiter
            goto L68
        L67:
            r2 = r0
        L68:
            boolean r3 = r6.tryResumeSender(r2, r7, r8)
            if (r3 == 0) goto L7d
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r7.setState$kotlinx_coroutines_core(r8, r3)
            r6.expandBuffer()
            java.lang.Object r3 = r7.retrieveElement$kotlinx_coroutines_core(r8)
            goto L91
        L7d:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r7.setState$kotlinx_coroutines_core(r8, r3)
            r3 = 0
            r7.onCancelledRequest(r8, r3)
            if (r1 == 0) goto L8d
            r6.expandBuffer()
        L8d:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
        L91:
            return r3
        L92:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.get(r6)
            r3 = 0
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r4
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lb8
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r3 = r7.casState$kotlinx_coroutines_core(r8, r0, r3)
            if (r3 == 0) goto L1
            r6.expandBuffer()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r3
        Lb8:
            if (r11 != 0) goto Lbf
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            return r3
        Lbf:
            boolean r3 = r7.casState$kotlinx_coroutines_core(r8, r0, r11)
            if (r3 == 0) goto L1
            r6.expandBuffer()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            return r3
    }

    private final int updateCellSend(kotlinx.coroutines.channels.ChannelSegment<E> r6, int r7, E r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
            r6.storeElement$kotlinx_coroutines_core(r7, r8)
            if (r12 == 0) goto L11
            int r0 = r5.updateCellSendSlow(r6, r7, r8, r9, r11, r12)
            r1 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            return r0
        L11:
            r1 = r12
            r12 = r11
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            r2 = 1
            if (r0 != 0) goto L3c
            boolean r3 = r5.bufferOrRendezvousSend(r10)
            r4 = 0
            if (r3 == 0) goto L30
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r3 = r7.casState$kotlinx_coroutines_core(r8, r4, r3)
            if (r3 == 0) goto L68
            return r2
        L30:
            if (r12 != 0) goto L34
            r2 = 3
            return r2
        L34:
            boolean r2 = r7.casState$kotlinx_coroutines_core(r8, r4, r12)
            if (r2 == 0) goto L68
            r2 = 2
            return r2
        L3c:
            boolean r3 = r0 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L68
            r7.cleanElement$kotlinx_coroutines_core(r8)
            boolean r3 = r5.tryResumeReceiver(r0, r9)
            if (r3 == 0) goto L55
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r7.setState$kotlinx_coroutines_core(r8, r2)
            r5.onReceiveDequeued()
            r2 = 0
            goto L67
        L55:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            java.lang.Object r3 = r7.getAndSetState$kotlinx_coroutines_core(r8, r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r3 == r4) goto L66
            r7.onCancelledRequest(r8, r2)
        L66:
            r2 = 5
        L67:
            return r2
        L68:
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r11 = r12
            r12 = r1
            int r1 = r5.updateCellSendSlow(r6, r7, r8, r9, r11, r12)
            return r1
    }

    private final int updateCellSendSlow(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, E r9, long r10, java.lang.Object r12, boolean r13) {
            r6 = this;
        L1:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L3b
            boolean r4 = r6.bufferOrRendezvousSend(r10)
            r5 = 0
            if (r4 == 0) goto L1e
            if (r13 != 0) goto L1e
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r5, r1)
            if (r1 == 0) goto L1
            return r3
        L1e:
            if (r13 == 0) goto L2f
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            boolean r3 = r7.casState$kotlinx_coroutines_core(r8, r5, r3)
            if (r3 == 0) goto L1
            r7.onCancelledRequest(r8, r2)
            return r1
        L2f:
            if (r12 != 0) goto L33
            r1 = 3
            return r1
        L33:
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r5, r12)
            if (r1 == 0) goto L1
            r1 = 2
            return r1
        L3b:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r4) goto L4a
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L1
            return r3
        L4a:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            r5 = 5
            if (r0 != r4) goto L55
            r7.cleanElement$kotlinx_coroutines_core(r8)
            return r5
        L55:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r4) goto L5f
            r7.cleanElement$kotlinx_coroutines_core(r8)
            return r5
        L5f:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r4) goto L6c
            r7.cleanElement$kotlinx_coroutines_core(r8)
            r6.completeCloseOrCancel()
            return r1
        L6c:
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L88
            r1 = 0
            boolean r4 = r0 instanceof kotlinx.coroutines.Waiter
            if (r4 != 0) goto L7e
            boolean r4 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r4 == 0) goto L7c
            goto L7e
        L7c:
            r1 = r2
            goto L7f
        L7e:
            r1 = r3
        L7f:
            if (r1 == 0) goto L82
            goto L88
        L82:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L88:
            r7.cleanElement$kotlinx_coroutines_core(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r1 == 0) goto L95
            r1 = r0
            kotlinx.coroutines.channels.WaiterEB r1 = (kotlinx.coroutines.channels.WaiterEB) r1
            kotlinx.coroutines.Waiter r1 = r1.waiter
            goto L96
        L95:
            r1 = r0
        L96:
            boolean r4 = r6.tryResumeReceiver(r1, r9)
            if (r4 == 0) goto La7
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r7.setState$kotlinx_coroutines_core(r8, r3)
            r6.onReceiveDequeued()
            goto Lb9
        La7:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            java.lang.Object r2 = r7.getAndSetState$kotlinx_coroutines_core(r8, r2)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r2 == r4) goto Lb8
            r7.onCancelledRequest(r8, r3)
        Lb8:
            r2 = r5
        Lb9:
            return r2
    }

    private final void updateReceiversCounterIfLower(long r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getReceivers$volatile$FU()
            r1 = r9
        L5:
            long r4 = r0.get(r9)
            r8 = 0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getReceivers$volatile$FU()
            r3 = r9
            r6 = r10
            boolean r10 = r2.compareAndSet(r3, r4, r6)
            if (r10 == 0) goto L1c
            return
        L1c:
            r10 = r6
            goto L5
    }

    private final void updateSendersCounterIfLower(long r14) {
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            r1 = r13
        L5:
            long r4 = r0.get(r13)
            r8 = 0
            r2 = r4
            r6 = 0
            r9 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r9
            r9 = r2
            int r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r2 < 0) goto L18
            return
        L18:
            r2 = r4
            r6 = 0
            r7 = 60
            long r11 = r2 >> r7
            int r2 = (int) r11
            long r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r9, r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getSendersAndCloseStatus$volatile$FU()
            r3 = r13
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L2f
            return
        L2f:
            goto L5
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
            r1 = this;
            r0 = 0
            r1.cancelImpl$kotlinx_coroutines_core(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(java.util.concurrent.CancellationException r2) {
            r1 = this;
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.cancelImpl$kotlinx_coroutines_core(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelImpl$kotlinx_coroutines_core(r2)
            return r0
    }

    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Channel was cancelled"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto Ld
        Lc:
            r0 = r3
        Ld:
            r1 = 1
            boolean r0 = r2.closeOrCancelImpl(r0, r1)
            return r0
    }

    public final void checkSegmentStructureInvariants() {
            r12 = this;
            boolean r0 = r12.isRendezvousOrUnlimited()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getBufferEndSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            if (r0 != r3) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L1c
            goto L5c
        L1c:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L3b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getReceiveSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            long r3 = r0.id
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getBufferEndSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            long r5 = r0.id
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L59
            r0 = r2
            goto L5a
        L59:
            r0 = r1
        L5a:
            if (r0 == 0) goto L266
        L5c:
            r0 = 3
            kotlinx.coroutines.channels.ChannelSegment[] r0 = new kotlinx.coroutines.channels.ChannelSegment[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getReceiveSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r12)
            r0[r1] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getSendSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r12)
            r0[r2] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getBufferEndSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r12)
            r4 = 2
            r0[r4] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r0
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L93:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r7.next()
            r9 = r8
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9
            r10 = 0
            kotlinx.coroutines.channels.ChannelSegment r11 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            if (r9 == r11) goto La9
            r9 = r2
            goto Laa
        La9:
            r9 = r1
        Laa:
            if (r9 == 0) goto L93
            r4.add(r8)
            goto L93
        Lb0:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = 0
            java.util.Iterator r3 = r4.iterator()
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L260
            java.lang.Object r5 = r3.next()
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto Lcd
            goto Lec
        Lcd:
            r6 = r5
            kotlinx.coroutines.channels.ChannelSegment r6 = (kotlinx.coroutines.channels.ChannelSegment) r6
            r7 = 0
            long r6 = r6.id
        Ld4:
            java.lang.Object r8 = r3.next()
            r9 = r8
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9
            r10 = 0
            long r9 = r9.id
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 <= 0) goto Le5
            r5 = r8
            r6 = r9
        Le5:
            boolean r8 = r3.hasNext()
            if (r8 != 0) goto Ld4
        Lec:
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r5.getPrev()
            if (r0 != 0) goto Lf7
            r0 = r2
            goto Lf8
        Lf7:
            r0 = r1
        Lf8:
            if (r0 == 0) goto L241
            r0 = r5
        Lfb:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r0.getNext()
            if (r3 == 0) goto L240
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r0.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r3.getPrev()
            if (r3 == 0) goto L122
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r0.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r3.getPrev()
            if (r3 != r0) goto L120
            goto L122
        L120:
            r3 = r1
            goto L123
        L122:
            r3 = r2
        L123:
            if (r3 == 0) goto L221
            r3 = 0
            r4 = 0
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
        L129:
            if (r4 >= r6) goto L1ce
            java.lang.Object r7 = r0.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r8 != 0) goto L1ca
            boolean r8 = r7 instanceof kotlinx.coroutines.Waiter
            if (r8 != 0) goto L1ca
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r8 == 0) goto L147
            r8 = r2
            goto L14f
        L147:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
        L14f:
            if (r8 == 0) goto L153
            r8 = r2
            goto L15b
        L153:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
        L15b:
            java.lang.String r9 = "Check failed."
            if (r8 == 0) goto L177
            java.lang.Object r8 = r0.getElement$kotlinx_coroutines_core(r4)
            if (r8 != 0) goto L167
            r8 = r2
            goto L168
        L167:
            r8 = r1
        L168:
            if (r8 == 0) goto L16d
            int r3 = r3 + 1
            goto L1ca
        L16d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.toString()
            r1.<init>(r2)
            throw r1
        L177:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r8 == 0) goto L183
            r8 = r2
            goto L18b
        L183:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
        L18b:
            if (r8 == 0) goto L1a3
            java.lang.Object r8 = r0.getElement$kotlinx_coroutines_core(r4)
            if (r8 != 0) goto L195
            r8 = r2
            goto L196
        L195:
            r8 = r1
        L196:
            if (r8 == 0) goto L199
            goto L1ca
        L199:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.toString()
            r1.<init>(r2)
            throw r1
        L1a3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Unexpected segment cell state: "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r6 = ".\nChannel state: "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1ca:
            int r4 = r4 + 1
            goto L129
        L1ce:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            if (r3 != r4) goto L215
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getReceiveSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r12)
            if (r0 == r4) goto L1f3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getSendSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r12)
            if (r0 == r4) goto L1f3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getBufferEndSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r12)
            if (r0 != r4) goto L1f1
            goto L1f3
        L1f1:
            r4 = r1
            goto L1f4
        L1f3:
            r4 = r2
        L1f4:
            if (r4 == 0) goto L1f7
            goto L215
        L1f7:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Logically removed segment is reachable.\nChannel state: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L215:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = r0.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r4
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            goto Lfb
        L221:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The `segment.next.prev === segment` invariant is violated.\nChannel state: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L240:
            return
        L241:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L260:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L266:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bufferEndSegment should not have lower id than receiveSegment.\nChannel state: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.closeOrCancelImpl(r2, r0)
            return r0
    }

    protected boolean closeOrCancelImpl(java.lang.Throwable r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L5
            r3.markCancellationStarted()
        L5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_closeCause$volatile$FU()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_CLOSE_CAUSE$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r4)
            if (r5 == 0) goto L17
            r3.markCancelled()
            goto L1a
        L17:
            r3.markClosed()
        L1a:
            r3.completeCloseOrCancel()
            r1 = r0
            r2 = 0
            r3.onClosedIdempotent()
            if (r1 == 0) goto L27
            r3.invokeCloseHandler()
        L27:
            return r0
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long r12) {
            r11 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r0 = r11.isConflatedDropOldest()
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getReceiveSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r11)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L1e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getReceivers$volatile$FU()
            long r4 = r1.get(r11)
            int r1 = r11.capacity
            long r1 = (long) r1
            long r1 = r1 + r4
            long r6 = r11.getBufferEndCounter()
            long r1 = java.lang.Math.max(r1, r6)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 >= 0) goto L37
            return
        L37:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getReceivers$volatile$FU()
            r6 = 1
            long r6 = r6 + r4
            r3 = r11
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            r2 = r3
            if (r1 == 0) goto L1e
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r1
            long r8 = r4 / r6
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r1
            long r6 = r4 % r6
            int r1 = (int) r6
            long r6 = r0.id
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L60
            kotlinx.coroutines.channels.ChannelSegment r3 = r11.findSegmentReceive(r8, r0)
            if (r3 != 0) goto L5e
            goto L1e
        L5e:
            r0 = r3
            goto L61
        L60:
            r3 = r0
        L61:
            r7 = 0
            r5 = r4
            r4 = r1
            java.lang.Object r0 = r2.updateCellReceive(r3, r4, r5, r7)
            r4 = r5
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r0 != r6) goto L7b
            long r6 = r11.getSendersCounter$kotlinx_coroutines_core()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L8d
            r3.cleanPrev()
            goto L8d
        L7b:
            r3.cleanPrev()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r6 = r2.onUndeliveredElement
            if (r6 == 0) goto L8d
            r7 = 2
            r10 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r6 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r6, r0, r10, r7, r10)
            if (r6 != 0) goto L8b
            goto L8d
        L8b:
            r7 = 0
            throw r6
        L8d:
            r0 = r3
            goto L1e
    }

    protected final java.lang.Throwable getCloseCause() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_closeCause$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
            r5 = this;
            kotlinx.coroutines.selects.SelectClause1Impl r0 = new kotlinx.coroutines.selects.SelectClause1Impl
            kotlinx.coroutines.channels.BufferedChannel$onReceive$1 r1 = kotlinx.coroutines.channels.BufferedChannel$onReceive$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$onReceive$2 r3 = kotlinx.coroutines.channels.BufferedChannel$onReceive$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r3 = r5.onUndeliveredElementReceiveCancellationConstructor
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
            r5 = this;
            kotlinx.coroutines.selects.SelectClause1Impl r0 = new kotlinx.coroutines.selects.SelectClause1Impl
            kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1 r1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2 r3 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r3 = r5.onUndeliveredElementReceiveCancellationConstructor
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
            r5 = this;
            kotlinx.coroutines.selects.SelectClause1Impl r0 = new kotlinx.coroutines.selects.SelectClause1Impl
            kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1 r1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 r3 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r3 = r5.onUndeliveredElementReceiveCancellationConstructor
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.BufferedChannel<E>> getOnSend() {
            r7 = this;
            kotlinx.coroutines.selects.SelectClause2Impl r0 = new kotlinx.coroutines.selects.SelectClause2Impl
            kotlinx.coroutines.channels.BufferedChannel$onSend$1 r1 = kotlinx.coroutines.channels.BufferedChannel$onSend$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.channels.BufferedChannel$onSend$2 r3 = kotlinx.coroutines.channels.BufferedChannel$onSend$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            r3 = r2
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r5 = 8
            r6 = 0
            r4 = 0
            r2 = r1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getReceivers$volatile$FU()
            long r0 = r0.get(r2)
            return r0
    }

    protected final java.lang.Throwable getSendException() {
            r2 = this;
            java.lang.Throwable r0 = r2.getCloseCause()
            if (r0 != 0) goto Lf
            kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        Lf:
            return r0
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
            r5 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r5)
            r2 = 0
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r3
            return r0
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
            r12 = this;
        L1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getReceiveSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            long r3 = r12.getReceiversCounter$kotlinx_coroutines_core()
            long r7 = r12.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r2 = 0
            if (r1 > 0) goto L19
            return r2
        L19:
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r1
            long r9 = r3 / r5
            long r5 = r0.id
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L3c
            kotlinx.coroutines.channels.ChannelSegment r1 = r12.findSegmentReceive(r9, r0)
            if (r1 != 0) goto L3b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r12)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            long r5 = r1.id
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 >= 0) goto L1
            return r2
        L3b:
            r0 = r1
        L3c:
            r0.cleanPrev()
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r1
            long r1 = r3 % r1
            int r11 = (int) r1
            boolean r1 = r12.isCellNonEmpty(r0, r11, r3)
            if (r1 == 0) goto L4d
            r1 = 1
            return r1
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getReceivers$volatile$FU()
            r5 = 1
            long r5 = r5 + r3
            r2 = r12
            r1.compareAndSet(r2, r3, r5)
            goto L1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCloseHandler$volatile$FU()
            r1 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r7, r1, r8)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCloseHandler$volatile$FU()
            r1 = r7
        L11:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()
            if (r2 != r4) goto L39
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getCloseHandler$volatile$FU()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r5, r6)
            if (r4 == 0) goto L37
            java.lang.Throwable r4 = r7.getCloseCause()
            r8.invoke(r4)
            return
        L37:
            goto L11
        L39:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()
            if (r2 != r4) goto L4b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Another handler was already registered and successfully invoked"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Another handler is already registered: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r2)
            boolean r0 = r2.isClosedForReceive0(r0)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r2)
            boolean r0 = r2.isClosedForSend0(r0)
            return r0
    }

    protected boolean isConflatedDropOldest() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r2 = this;
            boolean r0 = r2.isClosedForReceive()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.hasElements$kotlinx_coroutines_core()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = r2.isClosedForReceive()
            r0 = r0 ^ 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r0 = new kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator
            r0.<init>(r1)
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.offer(r1, r2)
            return r0
    }

    protected void onClosedIdempotent() {
            r0 = this;
            return
    }

    protected void onReceiveDequeued() {
            r0 = this;
            return
    }

    protected void onReceiveEnqueued() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.poll(r1)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> r2) {
            r1 = this;
            java.lang.Object r0 = receive$suspendImpl(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo1660receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r2) {
            r1 = this;
            java.lang.Object r0 = m1658receiveCatchingJP2dKIU$suspendImpl(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> r2) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(r1, r2)
            return r0
    }

    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            r6 = r19
            r8 = r20
            r3 = r20
            r9 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r10 = r2.getAndIncrement(r0)
            r4 = r10
            r2 = 0
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r12
            boolean r7 = access$isClosedForSend0(r0, r10)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r12 = (long) r2
            long r12 = r4 / r12
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r14 = (long) r2
            long r14 = r4 % r14
            int r2 = (int) r14
            long r14 = r1.id
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 == 0) goto L4b
            kotlinx.coroutines.channels.ChannelSegment r14 = access$findSegmentSend(r0, r12, r1)
            if (r14 != 0) goto L4a
            if (r7 == 0) goto L49
            r14 = 0
            r0.onClosedSelectOnSend(r8, r6)
            goto Lac
        L49:
            goto L15
        L4a:
            r1 = r14
        L4b:
            int r14 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r14) {
                case 0: goto La0;
                case 1: goto L97;
                case 2: goto L7a;
                case 3: goto L6b;
                case 4: goto L5b;
                case 5: goto L55;
                default: goto L52;
            }
        L52:
            r17 = r3
            goto Lad
        L55:
            r1.cleanPrev()
            r17 = r3
            goto Lad
        L5b:
            long r14 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 >= 0) goto L66
            r1.cleanPrev()
        L66:
            r14 = 0
            r0.onClosedSelectOnSend(r8, r6)
            goto Lac
        L6b:
            r14 = 0
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r16 = "unexpected"
            r17 = r3
            java.lang.String r3 = r16.toString()
            r15.<init>(r3)
            throw r15
        L7a:
            r17 = r3
            if (r7 == 0) goto L86
            r1.onSlotCleaned()
            r3 = 0
            r0.onClosedSelectOnSend(r8, r6)
            goto Lac
        L86:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L8e
            r3 = r6
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto L8f
        L8e:
            r3 = 0
        L8f:
            if (r3 == 0) goto L94
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        L94:
            r3 = 0
            goto Lac
        L97:
            r17 = r3
            r3 = 0
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            r6.selectInRegistrationPhase(r14)
            goto Lac
        La0:
            r17 = r3
            r1.cleanPrev()
            r3 = 0
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            r6.selectInRegistrationPhase(r14)
        Lac:
            return
        Lad:
            r3 = r17
            goto L15
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = send$suspendImpl(r1, r2, r3)
            return r0
    }

    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
            r1 = this;
            java.lang.Object r0 = sendBroadcast$suspendImpl(r1, r2, r3)
            return r0
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r2)
            boolean r0 = r2.shouldSendSuspend(r0)
            return r0
    }

    public java.lang.String toString() {
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getSendersAndCloseStatus$volatile$FU()
            long r2 = r2.get(r0)
            r4 = 0
            r5 = 60
            long r5 = r2 >> r5
            int r2 = (int) r5
            switch(r2) {
                case 2: goto L1f;
                case 3: goto L19;
                default: goto L18;
            }
        L18:
            goto L24
        L19:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L24
        L1f:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L24:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "capacity="
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.capacity
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 44
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            r2 = 3
            kotlinx.coroutines.channels.ChannelSegment[] r2 = new kotlinx.coroutines.channels.ChannelSegment[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getReceiveSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r0)
            r5 = 0
            r2[r5] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getSendSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r0)
            r6 = 1
            r2[r6] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getBufferEndSegment$volatile$FU()
            java.lang.Object r4 = r4.get(r0)
            r7 = 2
            r2[r7] = r4
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r2
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        L80:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r10.next()
            r12 = r11
            kotlinx.coroutines.channels.ChannelSegment r12 = (kotlinx.coroutines.channels.ChannelSegment) r12
            r13 = 0
            kotlinx.coroutines.channels.ChannelSegment r14 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            if (r12 == r14) goto L96
            r12 = r6
            goto L97
        L96:
            r12 = r5
        L97:
            if (r12 == 0) goto L80
            r7.add(r11)
            goto L80
        L9d:
            r5 = r7
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r2 = 0
            java.util.Iterator r4 = r5.iterator()
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L278
            java.lang.Object r7 = r4.next()
            boolean r8 = r4.hasNext()
            if (r8 != 0) goto Lbb
            goto Lda
        Lbb:
            r8 = r7
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            r9 = 0
            long r8 = r8.id
        Lc2:
            java.lang.Object r10 = r4.next()
            r11 = r10
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11
            r12 = 0
            long r11 = r11.id
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto Ld3
            r7 = r10
            r8 = r11
        Ld3:
            boolean r10 = r4.hasNext()
            if (r10 != 0) goto L272
        Lda:
            kotlinx.coroutines.channels.ChannelSegment r7 = (kotlinx.coroutines.channels.ChannelSegment) r7
            r10 = r7
            long r11 = r0.getReceiversCounter$kotlinx_coroutines_core()
            long r13 = r0.getSendersCounter$kotlinx_coroutines_core()
            r2 = r10
        Le6:
            r4 = 0
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
        Lea:
            if (r4 >= r5) goto L23b
            long r7 = r2.id
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r15 = r6
            r16 = r7
            long r6 = (long) r9
            long r7 = r16 * r6
            r9 = r5
            long r5 = (long) r4
            long r7 = r7 + r5
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 < 0) goto L106
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 >= 0) goto L102
            goto L106
        L102:
            r16 = r15
            goto L245
        L106:
            java.lang.Object r5 = r2.getState$kotlinx_coroutines_core(r4)
            java.lang.Object r6 = r2.getElement$kotlinx_coroutines_core(r4)
            r16 = r15
            boolean r15 = r5 instanceof kotlinx.coroutines.CancellableContinuation
            if (r15 == 0) goto L132
        L116:
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 >= 0) goto L122
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 < 0) goto L122
            java.lang.String r15 = "receive"
            goto L1f0
        L122:
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 >= 0) goto L12e
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 < 0) goto L12e
            java.lang.String r15 = "send"
            goto L1f0
        L12e:
            java.lang.String r15 = "cont"
            goto L1f0
        L132:
            boolean r15 = r5 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r15 == 0) goto L153
        L137:
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 >= 0) goto L143
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 < 0) goto L143
            java.lang.String r15 = "onReceive"
            goto L1f0
        L143:
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 >= 0) goto L14f
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 < 0) goto L14f
            java.lang.String r15 = "onSend"
            goto L1f0
        L14f:
            java.lang.String r15 = "select"
            goto L1f0
        L153:
            boolean r15 = r5 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r15 == 0) goto L15b
            java.lang.String r15 = "receiveCatching"
            goto L1f0
        L15b:
            boolean r15 = r5 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r15 == 0) goto L163
            java.lang.String r15 = "sendBroadcast"
            goto L1f0
        L163:
            boolean r15 = r5 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r15 == 0) goto L182
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r3 = "EB("
            java.lang.StringBuilder r3 = r15.append(r3)
            java.lang.StringBuilder r3 = r3.append(r5)
            r15 = 41
            java.lang.StringBuilder r3 = r3.append(r15)
            java.lang.String r15 = r3.toString()
            goto L1f0
        L182:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L18f
            r3 = r16
            goto L197
        L18f:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L197:
            if (r3 == 0) goto L19c
            java.lang.String r15 = "resuming_sender"
            goto L1f0
        L19c:
            if (r5 != 0) goto L1a1
            r3 = r16
            goto L1a9
        L1a1:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1a9:
            if (r3 == 0) goto L1ae
            r3 = r16
            goto L1b6
        L1ae:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1b6:
            if (r3 == 0) goto L1bb
            r3 = r16
            goto L1c3
        L1bb:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1c3:
            if (r3 == 0) goto L1c8
            r3 = r16
            goto L1d0
        L1c8:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1d0:
            if (r3 == 0) goto L1d5
            r3 = r16
            goto L1dd
        L1d5:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1dd:
            if (r3 == 0) goto L1e2
            r3 = r16
            goto L1ea
        L1e2:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
        L1ea:
            if (r3 != 0) goto L230
            java.lang.String r15 = r5.toString()
        L1f0:
            if (r6 == 0) goto L21a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r0 = 40
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r15)
            r3 = 44
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r3 = "),"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            goto L230
        L21a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r15)
            r3 = 44
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
        L230:
            int r4 = r4 + 1
            r3 = 44
            r0 = r18
            r5 = r9
            r6 = r16
            goto Lea
        L23b:
            r16 = r6
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto L269
        L245:
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = kotlin.text.StringsKt.last(r0)
            r3 = 44
            if (r0 != r3) goto L25f
            int r0 = r1.length()
            int r0 = r0 + (-1)
            java.lang.StringBuilder r0 = r1.deleteCharAt(r0)
            java.lang.String r3 = "deleteCharAt(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
        L25f:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L269:
            r3 = 44
            r2 = r0
            r0 = r18
            r6 = r16
            goto Le6
        L272:
            r16 = r6
            r0 = r18
            goto Lc2
        L278:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final java.lang.String toStringDebug$kotlinx_coroutines_core() {
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "S="
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r15.getSendersCounter$kotlinx_coroutines_core()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ",R="
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r15.getReceiversCounter$kotlinx_coroutines_core()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ",B="
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r15.getBufferEndCounter()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ",B'="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            long r2 = r2.get(r15)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ",C="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getSendersAndCloseStatus$volatile$FU()
            long r2 = r2.get(r15)
            r4 = 0
            r5 = 60
            long r6 = r2 >> r5
            int r2 = (int) r6
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 44
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getSendersAndCloseStatus$volatile$FU()
            long r3 = r1.get(r15)
            r1 = 0
            long r5 = r3 >> r5
            int r1 = (int) r5
            switch(r1) {
                case 1: goto L87;
                case 2: goto L81;
                case 3: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L8c
        L7b:
            java.lang.String r1 = "CANCELLED,"
            r0.append(r1)
            goto L8c
        L81:
            java.lang.String r1 = "CLOSED,"
            r0.append(r1)
            goto L8c
        L87:
            java.lang.String r1 = "CANCELLATION_STARTED,"
            r0.append(r1)
        L8c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "SEND_SEGM="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getSendSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = ",RCV_SEGM="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getReceiveSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            boolean r1 = r15.isRendezvousOrUnlimited()
            if (r1 != 0) goto Lec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ",EB_SEGM="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getBufferEndSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        Lec:
            java.lang.String r1 = "  "
            r0.append(r1)
            r1 = 3
            kotlinx.coroutines.channels.ChannelSegment[] r1 = new kotlinx.coroutines.channels.ChannelSegment[r1]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getReceiveSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            r4 = 0
            r1[r4] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getSendSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            r5 = 1
            r1[r5] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getBufferEndSegment$volatile$FU()
            java.lang.Object r3 = r3.get(r15)
            r6 = 2
            r1[r6] = r3
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r1
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L12a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L147
            java.lang.Object r10 = r9.next()
            r11 = r10
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11
            r12 = 0
            kotlinx.coroutines.channels.ChannelSegment r13 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            if (r11 == r13) goto L140
            r11 = r5
            goto L141
        L140:
            r11 = r4
        L141:
            if (r11 == 0) goto L12a
            r6.add(r10)
            goto L12a
        L147:
            r5 = r6
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r1 = 0
            java.util.Iterator r3 = r5.iterator()
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L28f
            java.lang.Object r6 = r3.next()
            boolean r7 = r3.hasNext()
            if (r7 != 0) goto L165
            goto L184
        L165:
            r7 = r6
            kotlinx.coroutines.channels.ChannelSegment r7 = (kotlinx.coroutines.channels.ChannelSegment) r7
            r8 = 0
            long r7 = r7.id
        L16c:
            java.lang.Object r9 = r3.next()
            r10 = r9
            kotlinx.coroutines.channels.ChannelSegment r10 = (kotlinx.coroutines.channels.ChannelSegment) r10
            r11 = 0
            long r10 = r10.id
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 <= 0) goto L17d
            r6 = r9
            r7 = r10
        L17d:
            boolean r9 = r3.hasNext()
            if (r9 != 0) goto L16c
        L184:
            kotlinx.coroutines.channels.ChannelSegment r6 = (kotlinx.coroutines.channels.ChannelSegment) r6
            r9 = r6
            r1 = 0
            r1 = r9
        L189:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = "=["
            java.lang.StringBuilder r3 = r3.append(r5)
            boolean r5 = r1.isRemoved()
            if (r5 == 0) goto L1a6
            java.lang.String r5 = "*"
            goto L1a8
        L1a6:
            java.lang.String r5 = ""
        L1a8:
            java.lang.StringBuilder r3 = r3.append(r5)
            long r5 = r1.id
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = ",prev="
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r1.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            r6 = 0
            if (r5 == 0) goto L1c6
            java.lang.String r5 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r5)
            goto L1c7
        L1c6:
            r5 = r6
        L1c7:
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r5 = r4
        L1d9:
            if (r5 >= r3) goto L257
            r7 = r5
            r8 = 0
            java.lang.Object r10 = r1.getState$kotlinx_coroutines_core(r7)
            java.lang.Object r11 = r1.getElement$kotlinx_coroutines_core(r7)
            boolean r12 = r10 instanceof kotlinx.coroutines.CancellableContinuation
            if (r12 == 0) goto L1ed
            java.lang.String r12 = "cont"
            goto L224
        L1ed:
            boolean r12 = r10 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r12 == 0) goto L1f4
            java.lang.String r12 = "select"
            goto L224
        L1f4:
            boolean r12 = r10 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r12 == 0) goto L1fb
            java.lang.String r12 = "receiveCatching"
            goto L224
        L1fb:
            boolean r12 = r10 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r12 == 0) goto L202
            java.lang.String r12 = "send(broadcast)"
            goto L224
        L202:
            boolean r12 = r10 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r12 == 0) goto L220
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "EB("
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r12 = r12.append(r10)
            r13 = 41
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L224
        L220:
            java.lang.String r12 = java.lang.String.valueOf(r10)
        L224:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 91
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r7)
            java.lang.String r14 = "]=("
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r12)
            java.lang.StringBuilder r13 = r13.append(r2)
            java.lang.StringBuilder r13 = r13.append(r11)
            java.lang.String r14 = "),"
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r0.append(r13)
            int r5 = r5 + 1
            goto L1d9
        L257:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "next="
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r1.getNext()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            if (r5 == 0) goto L26e
            java.lang.String r6 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r5)
        L26e:
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r5 = "]  "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = r1.getNext()
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            if (r3 != 0) goto L28c
            java.lang.String r2 = r0.toString()
            return r2
        L28c:
            r1 = r3
            goto L189
        L28f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public java.lang.Object mo1661tryReceivePtdJZtk() {
            r22 = this;
            r0 = r22
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getReceivers$volatile$FU()
            long r6 = r1.get(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getSendersAndCloseStatus$volatile$FU()
            long r8 = r1.get(r0)
            boolean r1 = r0.isClosedForReceive0(r8)
            if (r1 == 0) goto L23
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r2 = r0.getCloseCause()
            java.lang.Object r1 = r1.m1680closedJP2dKIU(r2)
            return r1
        L23:
            r1 = r8
            r3 = 0
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r4
            r10 = r1
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 < 0) goto L37
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r1.m1681failurePtdJZtk()
            return r1
        L37:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            r12 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L49:
            boolean r2 = r0.isClosedForReceive()
            if (r2 == 0) goto L5d
            r2 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r4 = r0.getCloseCause()
            java.lang.Object r2 = r3.m1680closedJP2dKIU(r4)
            goto Le0
        L5d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$volatile$FU()
            long r3 = r2.getAndIncrement(r0)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r13 = (long) r2
            long r13 = r3 / r13
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r15 = r3
            long r2 = (long) r2
            long r3 = r15 % r2
            int r2 = (int) r3
            long r3 = r1.id
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L7f
            kotlinx.coroutines.channels.ChannelSegment r3 = access$findSegmentReceive(r0, r13, r1)
            if (r3 != 0) goto L7e
            goto L49
        L7e:
            r1 = r3
        L7f:
            r3 = r15
            java.lang.Object r15 = access$updateCellReceive(r0, r1, r2, r3, r5)
            r16 = r3
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r15 != r3) goto Lb3
            boolean r3 = r5 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L95
            r3 = r5
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto L96
        L95:
            r3 = 0
        L96:
            if (r3 == 0) goto L9b
            access$prepareReceiverForSuspension(r0, r3, r1, r2)
        L9b:
            r3 = r1
            r18 = r16
            r4 = 0
            r20 = r1
            r21 = r2
            r1 = r18
            r0.waitExpandBufferCompletion$kotlinx_coroutines_core(r1)
            r3.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r18 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r18.m1681failurePtdJZtk()
            r2 = r1
            goto Lde
        Lb3:
            r20 = r1
            r21 = r2
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r15 != r1) goto Lcc
            long r1 = r0.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lc8
            r20.cleanPrev()
        Lc8:
            r1 = r20
            goto L49
        Lcc:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r15 == r1) goto Le1
            r20.cleanPrev()
            r1 = r15
            r2 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r3 = r3.m1682successJP2dKIU(r1)
            r2 = r3
        Lde:
        Le0:
            return r2
        Le1:
            r1 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "unexpected"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1656trySendJP2dKIU(E r16) {
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r15)
            boolean r0 = r15.shouldSendSuspend(r0)
            if (r0 == 0) goto L15
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m1681failurePtdJZtk()
            return r0
        L15:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r7 = r0
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L27:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r9 = r2.getAndIncrement(r15)
            r2 = r9
            r4 = 0
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r5 & r2
            boolean r8 = access$isClosedForSend0(r15, r9)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r11 = r5 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r5 % r2
            int r3 = (int) r2
            long r13 = r1.id
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 == 0) goto L65
            kotlinx.coroutines.channels.ChannelSegment r2 = access$findSegmentSend(r15, r11, r1)
            if (r2 != 0) goto L63
            if (r8 == 0) goto L62
            r2 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r13 = r15.getSendException()
            java.lang.Object r2 = r4.m1680closedJP2dKIU(r13)
            goto Le1
        L62:
            goto L27
        L63:
            r1 = r2
            goto L66
        L65:
            r2 = r1
        L66:
            r1 = r15
            r4 = r16
            int r13 = access$updateCellSend(r1, r2, r3, r4, r5, r7, r8)
            switch(r13) {
                case 0: goto Ld4;
                case 1: goto Lc9;
                case 2: goto L9c;
                case 3: goto L8f;
                case 4: goto L77;
                case 5: goto L72;
                default: goto L70;
            }
        L70:
            goto Le2
        L72:
            r2.cleanPrev()
            goto Le2
        L77:
            long r13 = r15.getReceiversCounter$kotlinx_coroutines_core()
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r4 >= 0) goto L82
            r2.cleanPrev()
        L82:
            r4 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r14 = r15.getSendException()
            java.lang.Object r4 = r13.m1680closedJP2dKIU(r14)
            r2 = r4
            goto Le1
        L8f:
            r4 = 0
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L9c:
            if (r8 == 0) goto Lae
            r2.onSlotCleaned()
            r4 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r14 = r15.getSendException()
            java.lang.Object r4 = r13.m1680closedJP2dKIU(r14)
            r2 = r4
            goto Le1
        Lae:
            boolean r4 = r7 instanceof kotlinx.coroutines.Waiter
            if (r4 == 0) goto Lb6
            r4 = r7
            kotlinx.coroutines.Waiter r4 = (kotlinx.coroutines.Waiter) r4
            goto Lb7
        Lb6:
            r4 = 0
        Lb7:
            if (r4 == 0) goto Lbc
            access$prepareSenderForSuspension(r15, r4, r2, r3)
        Lbc:
            r4 = r2
            r13 = 0
            r4.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r4 = r14.m1681failurePtdJZtk()
            r2 = r4
            goto Le1
        Lc9:
            r4 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r13.m1682successJP2dKIU(r14)
            r2 = r4
            goto Le1
        Ld4:
            r2.cleanPrev()
            r4 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r13.m1682successJP2dKIU(r14)
            r2 = r4
        Le1:
            return r2
        Le2:
            r1 = r2
            goto L27
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final java.lang.Object m1662trySendDropOldestJP2dKIU(E r20) {
            r19 = this;
            r0 = r19
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r8 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L12:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getSendersAndCloseStatus$volatile$FU()
            long r9 = r2.getAndIncrement(r0)
            r2 = r9
            r4 = 0
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r2 & r11
            boolean r7 = access$isClosedForSend0(r0, r9)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r11 = r4 / r2
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r13 = r1.id
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 == 0) goto L4f
            kotlinx.coroutines.channels.ChannelSegment r3 = access$findSegmentSend(r0, r11, r1)
            if (r3 != 0) goto L4e
            if (r7 == 0) goto L4d
            r3 = 0
        L42:
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r14 = r0.getSendException()
            java.lang.Object r13 = r13.m1680closedJP2dKIU(r14)
            return r13
        L4d:
            goto L12
        L4e:
            r1 = r3
        L4f:
            r3 = r20
            int r13 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            switch(r13) {
                case 0: goto Lbf;
                case 1: goto Lb2;
                case 2: goto L7d;
                case 3: goto L70;
                case 4: goto L63;
                case 5: goto L5d;
                default: goto L58;
            }
        L58:
            r15 = r1
            r16 = r2
            goto Lc7
        L5d:
            r1.cleanPrev()
            r15 = r1
            goto Lc7
        L63:
            long r13 = r0.getReceiversCounter$kotlinx_coroutines_core()
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L6e
            r1.cleanPrev()
        L6e:
            r3 = 0
            goto L42
        L70:
            r3 = 0
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L7d:
            if (r7 == 0) goto L84
            r1.onSlotCleaned()
            r3 = 0
            goto L42
        L84:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto L8c
            r3 = r6
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            goto L8d
        L8c:
            r3 = 0
        L8d:
            if (r3 == 0) goto L92
            access$prepareSenderForSuspension(r0, r3, r1, r2)
        L92:
            r3 = r1
            r13 = r2
            r14 = 0
            r15 = r1
            r16 = r2
            long r1 = r3.id
            r17 = r1
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r1
            long r1 = r1 * r17
            r17 = r1
            long r1 = (long) r13
            long r1 = r17 + r1
            r0.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(r1)
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.m1682successJP2dKIU(r2)
            return r1
        Lb2:
            r15 = r1
            r16 = r2
            r1 = 0
        Lb6:
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.m1682successJP2dKIU(r3)
            return r2
        Lbf:
            r15 = r1
            r16 = r2
            r15.cleanPrev()
            r1 = 0
            goto Lb6
        Lc7:
            r1 = r15
            goto L12
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long r24) {
            r23 = this;
            r1 = r23
            boolean r0 = r1.isRendezvousOrUnlimited()
            if (r0 == 0) goto L9
            return
        L9:
            long r2 = r1.getBufferEndCounter()
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 <= 0) goto Lce
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p()
            r6 = 0
            r2 = r6
        L17:
            r7 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r2 >= r0) goto L40
            r3 = r2
            r4 = 0
            long r9 = r1.getBufferEndCounter()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            long r11 = r5.get(r1)
            r5 = 0
            long r7 = r7 & r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 != 0) goto L3c
            long r11 = r1.getBufferEndCounter()
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L3c
            return
        L3c:
            int r2 = r2 + 1
            goto L17
        L40:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            r9 = r23
        L46:
            long r2 = r0.get(r1)
            r4 = r2
            r10 = 0
            r11 = r4
            r13 = 0
            long r11 = r11 & r7
            r13 = 1
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r11, r13)
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto Lc8
        L5a:
        L5b:
            long r9 = r1.getBufferEndCounter()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            long r11 = r0.get(r1)
            r2 = r11
            r0 = 0
            long r2 = r2 & r7
            r14 = r2
            r2 = r11
            r0 = 0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r4 & r2
            r16 = 0
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L78
            r0 = r13
            goto L79
        L78:
            r0 = r6
        L79:
            r16 = r0
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 != 0) goto Lab
            long r2 = r1.getBufferEndCounter()
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto Lab
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            r17 = r23
        L8d:
            long r2 = r0.get(r1)
            r4 = r2
            r13 = 0
            r18 = r4
            r20 = 0
            r21 = r7
            long r7 = r18 & r21
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r7, r6)
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto La6
            return
        La6:
            r1 = r23
            r7 = r21
            goto L8d
        Lab:
            r21 = r7
            if (r16 != 0) goto Lc2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getCompletedExpandBuffersAndPauseFlag$volatile$FU()
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r14, r13)
            r1 = r23
            r2 = r11
            r0.compareAndSet(r1, r2, r4)
            r7 = r21
            goto L5a
        Lc2:
            r2 = r11
            r1 = r23
            r7 = r21
            goto L5a
        Lc8:
            r21 = r7
            r1 = r23
            goto L46
        Lce:
            r1 = r23
            goto L9
    }
}
