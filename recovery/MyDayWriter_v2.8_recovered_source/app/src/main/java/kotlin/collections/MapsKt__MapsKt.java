package kotlin.collections;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010(\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aX\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032%\b\u0001\u0010\u0006\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\u001a1\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\f\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\rj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a_\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0014j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0016\u001a!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a!\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011¢\u0006\u0002\u0010\u0018\u001a*\u0010\u001a\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a*\u0010\u001d\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\n¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001e\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\"\u001a1\u0010#\u001a\u00020\u001f\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b *\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\"\u001a7\u0010$\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\t\b\u0001\u0010\u0003¢\u0006\u0002\b *\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010%\u001a\u0002H\u0003H\u0087\b¢\u0006\u0002\u0010\"\u001aV\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aJ\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aV\u0010)\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aq\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aq\u0010.\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aJ\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001a;\u00100\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u00101\u001aP\u00102\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0002\u00105\u001aC\u00106\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0080\bø\u0001\u0000¢\u0006\u0002\u00105\u001aC\u00107\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000304H\u0086\bø\u0001\u0000¢\u0006\u0002\u00105\u001a1\u00108\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u00101\u001aL\u00109\u001a\u0002H:\"\u0014\b\u0000\u0010+*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001*\u0002H:\"\u0004\b\u0001\u0010:*\u0002H+2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H:04H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010;\u001a'\u0010<\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b\u001a:\u0010=\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a9\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b0?\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a<\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030A0@\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\bH\u0087\n¢\u0006\u0002\bB\u001a\\\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010E\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H:\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a\\\u0010F\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H:0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000\u001aw\u0010G\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010:\"\u0018\b\u0003\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H:0\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+2\u001e\u0010D\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001b\u0012\u0004\u0012\u0002H:0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010-\u001a@\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0087\u0002¢\u0006\u0002\u0010I\u001aH\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\u0002¢\u0006\u0002\u0010K\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\u0002\u001aA\u0010H\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\u0002\u001a2\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010O\u001a:\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u000e\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010H\u0087\n¢\u0006\u0002\u0010P\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020LH\u0087\n\u001a3\u0010N\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0087\n\u001a0\u0010Q\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u001a3\u0010R\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u001aT\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0086\u0002¢\u0006\u0002\u0010T\u001aG\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0086\u0002\u001aI\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010V\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001aM\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0086\u0002\u001aJ\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010H\u0087\n¢\u0006\u0002\u0010X\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110LH\u0087\n\u001a=\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001aC\u0010W\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110MH\u0087\n\u001aG\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010X\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001a@\u0010Y\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001a;\u0010Z\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b \"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u00101\u001a:\u0010[\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010!\u001a\u0002H\u00022\u0006\u0010%\u001a\u0002H\u0003H\u0087\n¢\u0006\u0002\u0010\\\u001a;\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u0010¢\u0006\u0002\u0010\u0018\u001aQ\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110\u00102\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010^\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110L2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010_\u001a2\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aM\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010,\u001a\u0002H+H\u0007¢\u0006\u0002\u0010`\u001a4\u0010]\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M\u001aO\u0010]\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010+*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00110M2\u0006\u0010,\u001a\u0002H+¢\u0006\u0002\u0010a\u001a2\u0010b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a1\u0010c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u001bH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"buildMap", "", "K", "V", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "emptyMap", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "contains", "", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "filter", "predicate", "filterKeys", "filterNot", "filterNotTo", "M", "destination", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "ifEmpty", "R", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "iterator", "", "", "", "mutableIterator", "mapKeys", "transform", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "Lkotlin/sequences/Sequence;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "map", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapsKt extends kotlin.collections.MapsKt__MapsJVMKt {
    public MapsKt__MapsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final <K, V> java.util.Map<K, V> buildMap(int r1, kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder(r1)
            r2.invoke(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            return r0
    }

    private static final <K, V> java.util.Map<K, V> buildMap(kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r1.invoke(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            return r0
    }

    private static final <K, V> K component1(java.util.Map.Entry<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.getKey()
            return r0
    }

    private static final <K, V> V component2(java.util.Map.Entry<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.getValue()
            return r0
    }

    private static final <K, V> boolean contains(java.util.Map<? extends K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.containsKey(r2)
            return r0
    }

    private static final <K> boolean containsKey(java.util.Map<? extends K, ?> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.containsKey(r2)
            return r0
    }

    private static final <K, V> boolean containsValue(java.util.Map<K, ? extends V> r1, V r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.containsValue(r2)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> emptyMap() {
            kotlin.collections.EmptyMap r0 = kotlin.collections.EmptyMap.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> java.util.Map<K, V> filter(java.util.Map<? extends K, ? extends V> r8, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r2 = r8
            r3 = 0
            java.util.Set r4 = r2.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r9.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L1c
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r7 = r5.getValue()
            r1.put(r6, r7)
            goto L1c
        L40:
            return r1
    }

    public static final <K, V> java.util.Map<K, V> filterKeys(java.util.Map<? extends K, ? extends V> r6, kotlin.jvm.functions.Function1<? super K, java.lang.Boolean> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r5 = r3.getValue()
            r1.put(r4, r5)
            goto L18
        L40:
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    public static final <K, V> java.util.Map<K, V> filterNot(java.util.Map<? extends K, ? extends V> r8, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r2 = r8
            r3 = 0
            java.util.Set r4 = r2.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r9.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L1c
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r7 = r5.getValue()
            r1.put(r6, r7)
            goto L1c
        L40:
            return r1
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M filterNotTo(java.util.Map<? extends K, ? extends V> r5, M r6, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r7.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L18
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r4 = r2.getValue()
            r6.put(r3, r4)
            goto L18
        L3c:
            return r6
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M filterTo(java.util.Map<? extends K, ? extends V> r5, M r6, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r7.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r4 = r2.getValue()
            r6.put(r3, r4)
            goto L18
        L3c:
            return r6
    }

    public static final <K, V> java.util.Map<K, V> filterValues(java.util.Map<? extends K, ? extends V> r6, kotlin.jvm.functions.Function1<? super V, java.lang.Boolean> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r5 = r3.getValue()
            r1.put(r4, r5)
            goto L18
        L40:
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    private static final <K, V> V get(java.util.Map<? extends K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.get(r2)
            return r0
    }

    private static final <K, V> V getOrElse(java.util.Map<K, ? extends V> r1, K r2, kotlin.jvm.functions.Function0<? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L15
            java.lang.Object r0 = r3.invoke()
        L15:
            return r0
    }

    public static final <K, V> V getOrElseNullable(java.util.Map<K, ? extends V> r3, K r4, kotlin.jvm.functions.Function0<? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.lang.Object r1 = r3.get(r4)
            if (r1 != 0) goto L1c
            boolean r2 = r3.containsKey(r4)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = r5.invoke()
            return r2
        L1c:
            return r1
    }

    public static final <K, V> V getOrPut(java.util.Map<K, V> r3, K r4, kotlin.jvm.functions.Function0<? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.lang.Object r1 = r3.get(r4)
            if (r1 != 0) goto L1a
            java.lang.Object r2 = r5.invoke()
            r3.put(r4, r2)
            goto L1b
        L1a:
            r2 = r1
        L1b:
            return r2
    }

    public static final <K, V> V getValue(java.util.Map<K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = kotlin.collections.MapsKt.getOrImplicitDefaultNullable(r1, r2)
            return r0
    }

    private static final <K, V> java.util.HashMap<K, V> hashMapOf() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public static final <K, V> java.util.HashMap<K, V> hashMapOf(kotlin.Pair<? extends K, ? extends V>... r4) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r4.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r4)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.util.Map r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r2.invoke()
            goto L12
        L11:
            r0 = r1
        L12:
            return r0
    }

    private static final <K, V> boolean isNotEmpty(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    private static final <K, V> boolean isNullOrEmpty(java.util.Map<? extends K, ? extends V> r1) {
            if (r1 == 0) goto Lc
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            return r0
    }

    private static final <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> iterator(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    private static final <K, V> java.util.LinkedHashMap<K, V> linkedMapOf() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
    }

    public static final <K, V> java.util.LinkedHashMap<K, V> linkedMapOf(kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2, r0)
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            return r0
    }

    public static final <K, V, R> java.util.Map<R, V> mapKeys(java.util.Map<? extends K, ? extends V> r11, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r11.size()
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r1.<init>(r2)
            java.util.Map r1 = (java.util.Map) r1
            r2 = r11
            r3 = 0
            java.util.Set r4 = r2.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L27:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L41
            java.lang.Object r7 = r6.next()
            java.lang.Object r8 = r12.invoke(r7)
            r9 = r7
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            r10 = 0
            java.lang.Object r9 = r9.getValue()
            r1.put(r8, r9)
            goto L27
        L41:
            return r1
    }

    public static final <K, V, R, M extends java.util.Map<? super R, ? super V>> M mapKeysTo(java.util.Map<? extends K, ? extends V> r8, M r9, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            java.util.Set r1 = r8.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r3.next()
            java.lang.Object r5 = r10.invoke(r4)
            r6 = r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = 0
            java.lang.Object r6 = r6.getValue()
            r9.put(r5, r6)
            goto L1b
        L35:
            return r9
    }

    private static final <K, V> java.util.Map<K, V> mapOf() {
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            return r0
    }

    public static final <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 <= 0) goto L19
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2, r0)
            goto L1d
        L19:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L1d:
            return r0
    }

    public static final <K, V, R> java.util.Map<K, R> mapValues(java.util.Map<? extends K, ? extends V> r10, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r10.size()
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r1.<init>(r2)
            java.util.Map r1 = (java.util.Map) r1
            r2 = r10
            r3 = 0
            java.util.Set r4 = r2.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L27:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L41
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r9 = 0
            java.lang.Object r8 = r8.getKey()
            java.lang.Object r9 = r11.invoke(r7)
            r1.put(r8, r9)
            goto L27
        L41:
            return r1
    }

    public static final <K, V, R, M extends java.util.Map<? super K, ? super R>> M mapValuesTo(java.util.Map<? extends K, ? extends V> r7, M r8, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            java.util.Set r1 = r7.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r6 = 0
            java.lang.Object r5 = r5.getKey()
            java.lang.Object r6 = r9.invoke(r4)
            r8.put(r5, r6)
            goto L1b
        L35:
            return r8
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> r4, java.lang.Iterable<? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r4)
            r1 = r0
            r2 = 0
            java.util.Set r3 = r1.keySet()
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.collections.CollectionsKt.removeAll(r3, r5)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> r3, K r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r3)
            r1 = r0
            r2 = 0
            r1.remove(r4)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> r4, kotlin.sequences.Sequence<? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r4)
            r1 = r0
            r2 = 0
            java.util.Set r3 = r1.keySet()
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.collections.CollectionsKt.removeAll(r3, r5)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> minus(java.util.Map<? extends K, ? extends V> r4, K[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r4)
            r1 = r0
            r2 = 0
            java.util.Set r3 = r1.keySet()
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.collections.CollectionsKt.removeAll(r3, r5)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    private static final <K, V> void minusAssign(java.util.Map<K, V> r1, java.lang.Iterable<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set r0 = r1.keySet()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.collections.CollectionsKt.removeAll(r0, r2)
            return
    }

    private static final <K, V> void minusAssign(java.util.Map<K, V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.remove(r2)
            return
    }

    private static final <K, V> void minusAssign(java.util.Map<K, V> r1, kotlin.sequences.Sequence<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set r0 = r1.keySet()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.collections.CollectionsKt.removeAll(r0, r2)
            return
    }

    private static final <K, V> void minusAssign(java.util.Map<K, V> r1, K[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set r0 = r1.keySet()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.collections.CollectionsKt.removeAll(r0, r2)
            return
    }

    private static final <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> mutableIterator(java.util.Map<K, V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    private static final <K, V> java.util.Map<K, V> mutableMapOf() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> java.util.Map<K, V> mutableMapOf(kotlin.Pair<? extends K, ? extends V>... r4) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r4)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> java.util.Map<K, V> optimizeReadOnlyMap(java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.size()
            switch(r0) {
                case 0: goto L13;
                case 1: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = r1
            goto L17
        Le:
            java.util.Map r0 = kotlin.collections.MapsKt.toSingletonMap(r1)
            goto L17
        L13:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L17:
            return r0
    }

    private static final <K, V> java.util.Map<K, V> orEmpty(java.util.Map<K, ? extends V> r1) {
            if (r1 != 0) goto L7
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> r4, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r5)
            goto L24
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r5)
            java.util.Map r0 = (java.util.Map) r0
        L24:
            return r0
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> r3, java.util.Map<? extends K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            r1 = r0
            r2 = 0
            r1.putAll(r4)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> r5, kotlin.Pair<? extends K, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r6)
            goto L29
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r5)
            r1 = r0
            r2 = 0
            java.lang.Object r3 = r6.getFirst()
            java.lang.Object r4 = r6.getSecond()
            r1.put(r3, r4)
            java.util.Map r0 = (java.util.Map) r0
        L29:
            return r0
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> r4, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r5)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> plus(java.util.Map<? extends K, ? extends V> r4, kotlin.Pair<? extends K, ? extends V>[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r5)
            goto L24
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r5)
            java.util.Map r0 = (java.util.Map) r0
        L24:
            return r0
    }

    private static final <K, V> void plusAssign(java.util.Map<? super K, ? super V> r1, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.MapsKt.putAll(r1, r2)
            return
    }

    private static final <K, V> void plusAssign(java.util.Map<? super K, ? super V> r1, java.util.Map<K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.putAll(r2)
            return
    }

    private static final <K, V> void plusAssign(java.util.Map<? super K, ? super V> r2, kotlin.Pair<? extends K, ? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = r3.getFirst()
            java.lang.Object r1 = r3.getSecond()
            r2.put(r0, r1)
            return
    }

    private static final <K, V> void plusAssign(java.util.Map<? super K, ? super V> r1, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.MapsKt.putAll(r1, r2)
            return
    }

    private static final <K, V> void plusAssign(java.util.Map<? super K, ? super V> r1, kotlin.Pair<? extends K, ? extends V>[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.MapsKt.putAll(r1, r2)
            return
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> r3, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Iterator r0 = r4.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            java.lang.Object r1 = r1.component2()
            r3.put(r2, r1)
            goto Le
        L26:
            return
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> r3, kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Iterator r0 = r4.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            java.lang.Object r1 = r1.component2()
            r3.put(r2, r1)
            goto Le
        L26:
            return
    }

    public static final <K, V> void putAll(java.util.Map<? super K, ? super V> r4, kotlin.Pair<? extends K, ? extends V>[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1e
            r2 = r5[r1]
            java.lang.Object r3 = r2.component1()
            java.lang.Object r2 = r2.component2()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L1e:
            return
    }

    private static final <K, V> V remove(java.util.Map<? extends K, V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Map r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r1)
            java.lang.Object r0 = r0.remove(r2)
            return r0
    }

    private static final <K, V> void set(java.util.Map<K, V> r1, K r2, V r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.put(r2, r3)
            return
    }

    public static final <K, V> java.util.Map<K, V> toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L4b
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L2a;
                default: goto L13;
            }
        L13:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2, r0)
            goto L4a
        L2a:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L37
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            goto L3f
        L37:
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
        L3f:
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            goto L4a
        L46:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L4a:
            return r0
        L4b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r2, M r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            r1 = 0
            kotlin.collections.MapsKt.putAll(r0, r2)
            return r3
    }

    public static final <K, V> java.util.Map<K, V> toMap(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.size()
            switch(r0) {
                case 0: goto L16;
                case 1: goto L11;
                default: goto Lc;
            }
        Lc:
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r1)
            goto L1a
        L11:
            java.util.Map r0 = kotlin.collections.MapsKt.toSingletonMap(r1)
            goto L1a
        L16:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L1a:
            return r0
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(java.util.Map<? extends K, ? extends V> r2, M r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            r1 = 0
            r0.putAll(r2)
            return r3
    }

    public static final <K, V> java.util.Map<K, V> toMap(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r1, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.optimizeReadOnlyMap(r0)
            return r0
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> r2, M r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            r1 = 0
            kotlin.collections.MapsKt.putAll(r0, r2)
            return r3
    }

    public static final <K, V> java.util.Map<K, V> toMap(kotlin.Pair<? extends K, ? extends V>[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            switch(r0) {
                case 0: goto L22;
                case 1: goto L1a;
                default: goto L9;
            }
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2, r0)
            goto L26
        L1a:
            r0 = 0
            r0 = r2[r0]
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            goto L26
        L22:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L26:
            return r0
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M toMap(kotlin.Pair<? extends K, ? extends V>[] r2, M r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            r1 = 0
            kotlin.collections.MapsKt.putAll(r0, r2)
            return r3
    }

    public static final <K, V> java.util.Map<K, V> toMutableMap(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    private static final <K, V> kotlin.Pair<K, V> toPair(java.util.Map.Entry<? extends K, ? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r2 = r3.getValue()
            r0.<init>(r1, r2)
            return r0
    }
}
