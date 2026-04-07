package kotlin.io.path;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\r\u00102\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u00103\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a.\u0010;\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010=\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010>\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a\u0015\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0087\b\u001a-\u0010@\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010<\u001a6\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010C\u001a\u000200*\u00020\u0002H\u0087\b\u001a\r\u0010D\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001H\u0087\n\u001a&\u0010G\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010J\u001a\u0002HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a4\u0010N\u001a\u0004\u0018\u0001HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a\r\u0010O\u001a\u00020P*\u00020\u0002H\u0087\b\u001a\r\u0010Q\u001a\u00020R*\u00020\u0002H\u0087\b\u001a.\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002000.H\u0087\bø\u0001\u0000\u001a0\u0010V\u001a\u0004\u0018\u00010W*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010Y\u001a&\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010\\\u001a(\u0010]\u001a\u0004\u0018\u00010^*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010_\u001a,\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010c\u001a&\u0010d\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\r\u0010e\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010f\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010g\u001a\u00020:*\u00020\u0002H\u0087\b\u001a&\u0010h\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\u0015\u0010i\u001a\u00020:*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\b\u001a\r\u0010j\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010k\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020m*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0007\u001a.\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a&\u0010o\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010p\u001a\u0002Hq\"\n\b\u0000\u0010q\u0018\u0001*\u00020r*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010s\u001a<\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010W0t*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010u\u001a\r\u0010v\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010x\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\b\u0010{\u001a\u0004\u0018\u00010W2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010|\u001a\u0015\u0010}\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020[H\u0087\b\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020^H\u0087\b\u001a\u001b\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\f\u0010{\u001a\b\u0012\u0004\u0012\u00020b0aH\u0087\b\u001a\u000f\u0010\u0080\u0001\u001a\u00020\u0002*\u00030\u0081\u0001H\u0087\b\u001aF\u0010\u0082\u0001\u001a\u0003H\u0083\u0001\"\u0005\b\u0000\u0010\u0083\u0001*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u001b\u0010\u0084\u0001\u001a\u0016\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001\u0012\u0005\u0012\u0003H\u0083\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0086\u0001\u001a3\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020,2\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:H\u0007\u001aJ\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a0\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001*\u00020\u00022\u0014\u00106\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008d\u00010\u001a\"\u00030\u008d\u0001H\u0007¢\u0006\u0003\u0010\u008e\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "fileVisitor", "Ljava/nio/file/FileVisitor;", "builderAction", "Lkotlin/Function1;", "Lkotlin/io/path/FileVisitorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createParentDirectories", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitFileTree", "visitor", "maxDepth", "", "followLinks", "walk", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathUtilsKt extends kotlin.io.path.PathsKt__PathRecursiveFunctionsKt {
    public PathsKt__PathUtilsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.nio.file.Path Path(java.lang.String r2) {
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r2, r0)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path Path(java.lang.String r2, java.lang.String... r3) {
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "subpaths"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.nio.file.Path r0 = java.nio.file.Paths.get(r2, r0)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path absolute(java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = r2.toAbsolutePath()
            java.lang.String r1 = "toAbsolutePath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String absolutePathString(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.file.Path r0 = r1.toAbsolutePath()
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path r3, java.nio.file.Path r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L15
            r1 = 1
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r1]
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r1[r0] = r2
            goto L17
        L15:
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]
        L17:
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.copy(r3, r4, r0)
            java.lang.String r2 = "copy(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.CopyOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.copy(r2, r3, r0)
            java.lang.String r1 = "copy(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path copyTo$default(java.nio.file.Path r1, java.nio.file.Path r2, boolean r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r4 = 0
            if (r3 == 0) goto L1a
            r5 = 1
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r5]
            java.nio.file.StandardCopyOption r0 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r5[r4] = r0
            goto L1c
        L1a:
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r4]
        L1c:
            int r4 = r5.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r4 = java.nio.file.Files.copy(r1, r2, r4)
            java.lang.String r0 = "copy(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            return r4
    }

    private static final java.nio.file.Path createDirectories(java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createDirectories(r2, r0)
            java.lang.String r1 = "createDirectories(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path createDirectory(java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createDirectory(r2, r0)
            java.lang.String r1 = "createDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path createFile(java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createFile(r2, r0)
            java.lang.String r1 = "createFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path createLinkPointingTo(java.nio.file.Path r2, java.nio.file.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = java.nio.file.Files.createLink(r2, r3)
            java.lang.String r1 = "createLink(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.nio.file.Path createParentDirectories(java.nio.file.Path r6, java.nio.file.attribute.FileAttribute<?>... r7) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            java.nio.file.Path r2 = r0.getParent()
            if (r2 == 0) goto L4b
            r3 = 0
            java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[r3]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = java.nio.file.Files.isDirectory(r2, r4)
            if (r4 != 0) goto L4b
        L22:
            int r4 = r7.length     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r4)     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            int r5 = r4.length     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.nio.file.Path r4 = java.nio.file.Files.createDirectories(r2, r4)     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            java.lang.String r5 = "createDirectories(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.nio.file.FileAlreadyExistsException -> L3a
            goto L4b
        L3a:
            r4 = move-exception
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r3]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = java.nio.file.Files.isDirectory(r2, r3)
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            throw r4
        L4b:
            return r6
    }

    private static final java.nio.file.Path createSymbolicLinkPointingTo(java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createSymbolicLink(r2, r3, r0)
            java.lang.String r1 = "createSymbolicLink(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path createTempDirectory(java.lang.String r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r2, r0)
            java.lang.String r1 = "createTempDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.nio.file.Path createTempDirectory(java.nio.file.Path r2, java.lang.String r3, java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "createTempDirectory(...)"
            if (r2 == 0) goto L18
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempDirectory(r2, r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L26
        L18:
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempDirectory(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        L26:
            return r1
    }

    static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.lang.String r0, java.nio.file.attribute.FileAttribute[] r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r0 = 0
        L5:
            java.lang.String r2 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r1.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r2 = java.nio.file.Files.createTempDirectory(r0, r2)
            java.lang.String r3 = "createTempDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.nio.file.Path r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.createTempDirectory(r0, r1, r2)
            return r0
    }

    private static final java.nio.file.Path createTempFile(java.lang.String r2, java.lang.String r3, java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r2, r3, r0)
            java.lang.String r1 = "createTempFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.nio.file.Path createTempFile(java.nio.file.Path r2, java.lang.String r3, java.lang.String r4, java.nio.file.attribute.FileAttribute<?>... r5) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "createTempFile(...)"
            if (r2 == 0) goto L18
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r2, r3, r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto L26
        L18:
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r3, r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
        L26:
            return r1
    }

    static /* synthetic */ java.nio.file.Path createTempFile$default(java.lang.String r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            r1 = 0
        La:
            java.lang.String r3 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            int r3 = r2.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r3 = java.nio.file.Files.createTempFile(r0, r1, r3)
            java.lang.String r4 = "createTempFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }

    public static /* synthetic */ java.nio.file.Path createTempFile$default(java.nio.file.Path r1, java.lang.String r2, java.lang.String r3, java.nio.file.attribute.FileAttribute[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            java.nio.file.Path r1 = kotlin.io.path.PathsKt.createTempFile(r1, r2, r3, r4)
            return r1
    }

    private static final void deleteExisting(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.file.Files.delete(r1)
            return
    }

    private static final boolean deleteIfExists(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.deleteIfExists(r1)
            return r0
    }

    private static final java.nio.file.Path div(java.nio.file.Path r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = r2.resolve(r3)
            java.lang.String r1 = "resolve(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path div(java.nio.file.Path r2, java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = r2.resolve(r3)
            java.lang.String r1 = "resolve(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final boolean exists(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.exists(r1, r0)
            return r0
    }

    public static final java.lang.Void fileAttributeViewNotAvailable(java.nio.file.Path r3, java.lang.Class<?> r4) {
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "attributeViewClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The desired attribute view type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not available for the file "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesView(java.nio.file.Path r4, java.nio.file.LinkOption... r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 4
            java.lang.String r1 = "V"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.nio.file.attribute.FileAttributeView> r2 = java.nio.file.attribute.FileAttributeView.class
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            int r3 = r5.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.nio.file.attribute.FileAttributeView r2 = java.nio.file.Files.getFileAttributeView(r4, r2, r3)
            if (r2 == 0) goto L26
            r0 = r2
            java.nio.file.attribute.FileAttributeView r0 = (java.nio.file.attribute.FileAttributeView) r0
            return r2
        L26:
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.nio.file.attribute.FileAttributeView> r0 = java.nio.file.attribute.FileAttributeView.class
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            kotlin.io.path.PathsKt.fileAttributeViewNotAvailable(r4, r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesViewOrNull(java.nio.file.Path r2, java.nio.file.LinkOption... r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 4
            java.lang.String r1 = "V"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.nio.file.attribute.FileAttributeView> r0 = java.nio.file.attribute.FileAttributeView.class
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            java.nio.file.attribute.FileAttributeView r0 = java.nio.file.Files.getFileAttributeView(r2, r0, r1)
            return r0
    }

    private static final long fileSize(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = java.nio.file.Files.size(r2)
            return r0
    }

    private static final java.nio.file.FileStore fileStore(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.FileStore r0 = java.nio.file.Files.getFileStore(r2)
            java.lang.String r1 = "getFileStore(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.nio.file.FileVisitor<java.nio.file.Path> fileVisitor(kotlin.jvm.functions.Function1<? super kotlin.io.path.FileVisitorBuilder, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.path.FileVisitorBuilderImpl r0 = new kotlin.io.path.FileVisitorBuilderImpl
            r0.<init>()
            r1.invoke(r0)
            java.nio.file.FileVisitor r0 = r0.build()
            return r0
    }

    private static final void forEachDirectoryEntry(java.nio.file.Path r9, java.lang.String r10, kotlin.jvm.functions.Function1<? super java.nio.file.Path, kotlin.Unit> r11) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r9, r10)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            r2 = 1
            r3 = r0
            java.nio.file.DirectoryStream r3 = (java.nio.file.DirectoryStream) r3     // Catch: java.lang.Throwable -> L49
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L49
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L49
            r6 = 0
            java.util.Iterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L49
        L26:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L34
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L49
            r11.invoke(r8)     // Catch: java.lang.Throwable -> L49
            goto L26
        L34:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L49
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 == 0) goto L43
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            goto L48
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
            return
        L49:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L4b
        L4b:
            r4 = move-exception
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            goto L5d
        L5a:
            kotlin.io.CloseableKt.closeFinally(r0, r3)
        L5d:
            throw r4
    }

    static /* synthetic */ void forEachDirectoryEntry$default(java.nio.file.Path r7, java.lang.String r8, kotlin.jvm.functions.Function1 r9, int r10, java.lang.Object r11) throws java.io.IOException {
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L6
            java.lang.String r8 = "*"
        L6:
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)
            java.lang.String r10 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            java.lang.String r10 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            java.nio.file.DirectoryStream r10 = java.nio.file.Files.newDirectoryStream(r7, r8)
            java.io.Closeable r10 = (java.io.Closeable) r10
            r0 = 0
            r1 = r10
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4e
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L4e
        L2b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L39
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L4e
            r9.invoke(r6)     // Catch: java.lang.Throwable -> L4e
            goto L2b
        L39:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4e
            boolean r11 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r11, r11, r0)
            if (r11 == 0) goto L48
            r11 = 0
            kotlin.io.CloseableKt.closeFinally(r10, r11)
            goto L4d
        L48:
            if (r10 == 0) goto L4d
            r10.close()
        L4d:
            return
        L4e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L50
        L50:
            r2 = move-exception
            boolean r11 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r11, r11, r0)
            if (r11 != 0) goto L5f
            if (r10 == 0) goto L62
            r10.close()     // Catch: java.lang.Throwable -> L5d
            goto L62
        L5d:
            r10 = move-exception
            goto L62
        L5f:
            kotlin.io.CloseableKt.closeFinally(r10, r1)
        L62:
            throw r2
    }

    private static final java.lang.Object getAttribute(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.lang.Object r0 = java.nio.file.Files.getAttribute(r1, r2, r0)
            return r0
    }

    public static final java.lang.String getExtension(java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = r3.getFileName()
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L1d
            r2 = 46
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast(r0, r2, r1)
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            return r1
    }

    public static /* synthetic */ void getExtension$annotations(java.nio.file.Path r0) {
            return
    }

    private static final java.lang.String getInvariantSeparatorsPath(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = kotlin.io.path.PathsKt.getInvariantSeparatorsPathString(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(java.nio.file.Path r0) {
            return
    }

    public static final java.lang.String getInvariantSeparatorsPathString(java.nio.file.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.nio.file.FileSystem r0 = r7.getFileSystem()
            java.lang.String r2 = r0.getSeparator()
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L26
            java.lang.String r1 = r7.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r5 = 4
            r6 = 0
            java.lang.String r3 = "/"
            r4 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            goto L2a
        L26:
            java.lang.String r0 = r7.toString()
        L2a:
            return r0
    }

    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(java.nio.file.Path r0) {
            return
    }

    private static final java.nio.file.attribute.FileTime getLastModifiedTime(java.nio.file.Path r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.nio.file.attribute.FileTime r0 = java.nio.file.Files.getLastModifiedTime(r2, r0)
            java.lang.String r1 = "getLastModifiedTime(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String getName(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.file.Path r0 = r1.getFileName()
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.toString()
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L15
            java.lang.String r0 = ""
        L15:
            return r0
    }

    public static /* synthetic */ void getName$annotations(java.nio.file.Path r0) {
            return
    }

    public static final java.lang.String getNameWithoutExtension(java.nio.file.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.Path r0 = r4.getFileName()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L1b
            java.lang.String r1 = "."
            r2 = 2
            r3 = 0
            java.lang.String r0 = kotlin.text.StringsKt.substringBeforeLast$default(r0, r1, r3, r2, r3)
            if (r0 != 0) goto L1d
        L1b:
            java.lang.String r0 = ""
        L1d:
            return r0
    }

    public static /* synthetic */ void getNameWithoutExtension$annotations(java.nio.file.Path r0) {
            return
    }

    private static final java.nio.file.attribute.UserPrincipal getOwner(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.nio.file.attribute.UserPrincipal r0 = java.nio.file.Files.getOwner(r1, r0)
            return r0
    }

    private static final java.lang.String getPathString(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static /* synthetic */ void getPathString$annotations(java.nio.file.Path r0) {
            return
    }

    private static final java.util.Set<java.nio.file.attribute.PosixFilePermission> getPosixFilePermissions(java.nio.file.Path r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.util.Set r0 = java.nio.file.Files.getPosixFilePermissions(r2, r0)
            java.lang.String r1 = "getPosixFilePermissions(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final boolean isDirectory(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r1, r0)
            return r0
    }

    private static final boolean isExecutable(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.isExecutable(r1)
            return r0
    }

    private static final boolean isHidden(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.isHidden(r1)
            return r0
    }

    private static final boolean isReadable(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.isReadable(r1)
            return r0
    }

    private static final boolean isRegularFile(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isRegularFile(r1, r0)
            return r0
    }

    private static final boolean isSameFileAs(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = java.nio.file.Files.isSameFile(r1, r2)
            return r0
    }

    private static final boolean isSymbolicLink(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.isSymbolicLink(r1)
            return r0
    }

    private static final boolean isWritable(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = java.nio.file.Files.isWritable(r1)
            return r0
    }

    public static final java.util.List<java.nio.file.Path> listDirectoryEntries(java.nio.file.Path r4, java.lang.String r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r4, r5)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch: java.lang.Throwable -> L23
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L23
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L23
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)     // Catch: java.lang.Throwable -> L23
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r3
        L23:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L25
        L25:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static /* synthetic */ java.util.List listDirectoryEntries$default(java.nio.file.Path r0, java.lang.String r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.util.List r0 = kotlin.io.path.PathsKt.listDirectoryEntries(r0, r1)
            return r0
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path r3, java.nio.file.Path r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L15
            r1 = 1
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r1]
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r1[r0] = r2
            goto L17
        L15:
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]
        L17:
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.move(r3, r4, r0)
            java.lang.String r2 = "move(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.CopyOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.move(r2, r3, r0)
            java.lang.String r1 = "move(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path moveTo$default(java.nio.file.Path r1, java.nio.file.Path r2, boolean r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r4 = 0
            if (r3 == 0) goto L1a
            r5 = 1
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r5]
            java.nio.file.StandardCopyOption r0 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r5[r4] = r0
            goto L1c
        L1a:
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r4]
        L1c:
            int r4 = r5.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r4 = java.nio.file.Files.move(r1, r2, r4)
            java.lang.String r0 = "move(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            return r4
    }

    private static final boolean notExists(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.notExists(r1, r0)
            return r0
    }

    private static final /* synthetic */ <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 4
            java.lang.String r1 = "A"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r2, r0, r1)
            java.lang.String r1 = "readAttributes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r0
            java.nio.file.attribute.BasicFileAttributes r1 = (java.nio.file.attribute.BasicFileAttributes) r1
            return r0
    }

    private static final java.util.Map<java.lang.String, java.lang.Object> readAttributes(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.util.Map r0 = java.nio.file.Files.readAttributes(r2, r3, r0)
            java.lang.String r1 = "readAttributes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path readSymbolicLink(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = java.nio.file.Files.readSymbolicLink(r2)
            java.lang.String r1 = "readSymbolicLink(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.nio.file.Path relativeTo(java.nio.file.Path r4, java.nio.file.Path r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.io.path.PathRelativizer r0 = kotlin.io.path.PathRelativizer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L12
            java.nio.file.Path r0 = r0.tryRelativeTo(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L12
            return r0
        L12:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\nthis path: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = "\nbase path: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            throw r1
    }

    public static final java.nio.file.Path relativeToOrNull(java.nio.file.Path r2, java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.io.path.PathRelativizer r0 = kotlin.io.path.PathRelativizer.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L12
            java.nio.file.Path r0 = r0.tryRelativeTo(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L12
            goto L15
        L12:
            r0 = move-exception
            r1 = 0
            r0 = r1
        L15:
            return r0
    }

    public static final java.nio.file.Path relativeToOrSelf(java.nio.file.Path r1, java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.relativeToOrNull(r1, r2)
            if (r0 != 0) goto L11
            r0 = r1
        L11:
            return r0
    }

    private static final java.nio.file.Path setAttribute(java.nio.file.Path r2, java.lang.String r3, java.lang.Object r4, java.nio.file.LinkOption... r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.setAttribute(r2, r3, r4, r0)
            java.lang.String r1 = "setAttribute(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path setLastModifiedTime(java.nio.file.Path r2, java.nio.file.attribute.FileTime r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = java.nio.file.Files.setLastModifiedTime(r2, r3)
            java.lang.String r1 = "setLastModifiedTime(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path setOwner(java.nio.file.Path r2, java.nio.file.attribute.UserPrincipal r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = java.nio.file.Files.setOwner(r2, r3)
            java.lang.String r1 = "setOwner(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path setPosixFilePermissions(java.nio.file.Path r2, java.util.Set<? extends java.nio.file.attribute.PosixFilePermission> r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = java.nio.file.Files.setPosixFilePermissions(r2, r3)
            java.lang.String r1 = "setPosixFilePermissions(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path toPath(java.net.URI r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = java.nio.file.Paths.get(r2)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final <T> T useDirectoryEntries(java.nio.file.Path r6, java.lang.String r7, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<? extends java.nio.file.Path>, ? extends T> r8) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r6, r7)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            r2 = 1
            r3 = r0
            java.nio.file.DirectoryStream r3 = (java.nio.file.DirectoryStream) r3     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L3a
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L3a
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r8.invoke(r5)     // Catch: java.lang.Throwable -> L3a
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 == 0) goto L34
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            goto L39
        L34:
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r5
        L3a:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 != 0) goto L4b
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.lang.Throwable -> L49
            goto L4e
        L49:
            r0 = move-exception
            goto L4e
        L4b:
            kotlin.io.CloseableKt.closeFinally(r0, r3)
        L4e:
            throw r4
    }

    static /* synthetic */ java.lang.Object useDirectoryEntries$default(java.nio.file.Path r4, java.lang.String r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) throws java.io.IOException {
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L6
            java.lang.String r5 = "*"
        L6:
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            java.lang.String r7 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.nio.file.DirectoryStream r7 = java.nio.file.Files.newDirectoryStream(r4, r5)
            java.io.Closeable r7 = (java.io.Closeable) r7
            r0 = 0
            r1 = r7
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L3f
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L3f
            kotlin.sequences.Sequence r3 = kotlin.collections.CollectionsKt.asSequence(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = r6.invoke(r3)     // Catch: java.lang.Throwable -> L3f
            boolean r8 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r8, r8, r0)
            if (r8 == 0) goto L39
            r8 = 0
            kotlin.io.CloseableKt.closeFinally(r7, r8)
            goto L3e
        L39:
            if (r7 == 0) goto L3e
            r7.close()
        L3e:
            return r3
        L3f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r2 = move-exception
            boolean r8 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r8, r8, r0)
            if (r8 != 0) goto L50
            if (r7 == 0) goto L53
            r7.close()     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r7 = move-exception
            goto L53
        L50:
            kotlin.io.CloseableKt.closeFinally(r7, r1)
        L53:
            throw r2
    }

    public static final void visitFileTree(java.nio.file.Path r1, int r2, boolean r3, kotlin.jvm.functions.Function1<? super kotlin.io.path.FileVisitorBuilder, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.FileVisitor r0 = kotlin.io.path.PathsKt.fileVisitor(r4)
            kotlin.io.path.PathsKt.visitFileTree(r1, r0, r2, r3)
            return
    }

    public static final void visitFileTree(java.nio.file.Path r1, java.nio.file.FileVisitor<java.nio.file.Path> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r4 == 0) goto L13
            java.nio.file.FileVisitOption r0 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            goto L17
        L13:
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
        L17:
            java.nio.file.Files.walkFileTree(r1, r0, r3, r2)
            return
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path r0, int r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L7
            r1 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r2 = 0
        Lc:
            kotlin.io.path.PathsKt.visitFileTree(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path r0, java.nio.file.FileVisitor r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            r3 = 0
        Lc:
            kotlin.io.path.PathsKt.visitFileTree(r0, r1, r2, r3)
            return
    }

    public static final kotlin.sequences.Sequence<java.nio.file.Path> walk(java.nio.file.Path r1, kotlin.io.path.PathWalkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.io.path.PathTreeWalk r0 = new kotlin.io.path.PathTreeWalk
            r0.<init>(r1, r2)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }
}
