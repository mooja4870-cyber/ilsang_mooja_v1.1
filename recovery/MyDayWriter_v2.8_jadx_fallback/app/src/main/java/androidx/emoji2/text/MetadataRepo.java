package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final java.lang.String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final androidx.emoji2.text.flatbuffer.MetadataList mMetadataList;
    private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
    private final android.graphics.Typeface mTypeface;

    static class Node {
        private final android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> mChildren;
        private androidx.emoji2.text.TypefaceEmojiRasterizer mData;

        private Node() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        Node(int r2) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>(r2)
                r1.mChildren = r0
                return
        }

        androidx.emoji2.text.MetadataRepo.Node get(int r2) {
                r1 = this;
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r0 = r1.mChildren
                if (r0 != 0) goto L6
                r0 = 0
                goto Le
            L6:
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r0 = r1.mChildren
                java.lang.Object r0 = r0.get(r2)
                androidx.emoji2.text.MetadataRepo$Node r0 = (androidx.emoji2.text.MetadataRepo.Node) r0
            Le:
                return r0
        }

        final androidx.emoji2.text.TypefaceEmojiRasterizer getData() {
                r1 = this;
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r1.mData
                return r0
        }

        void put(androidx.emoji2.text.TypefaceEmojiRasterizer r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.getCodepointAt(r5)
                androidx.emoji2.text.MetadataRepo$Node r0 = r3.get(r0)
                if (r0 != 0) goto L19
                androidx.emoji2.text.MetadataRepo$Node r1 = new androidx.emoji2.text.MetadataRepo$Node
                r1.<init>()
                r0 = r1
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r1 = r3.mChildren
                int r2 = r4.getCodepointAt(r5)
                r1.put(r2, r0)
            L19:
                if (r6 <= r5) goto L21
                int r1 = r5 + 1
                r0.put(r4, r1, r6)
                goto L23
            L21:
                r0.mData = r4
            L23:
                return
        }
    }

    private MetadataRepo(android.graphics.Typeface r3, androidx.emoji2.text.flatbuffer.MetadataList r4) {
            r2 = this;
            r2.<init>()
            r2.mTypeface = r3
            r2.mMetadataList = r4
            androidx.emoji2.text.MetadataRepo$Node r0 = new androidx.emoji2.text.MetadataRepo$Node
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            r2.mRootNode = r0
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r2.mMetadataList
            int r0 = r0.listLength()
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r2.mEmojiCharArray = r0
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r2.mMetadataList
            r2.constructIndex(r0)
            return
    }

    private void constructIndex(androidx.emoji2.text.flatbuffer.MetadataList r7) {
            r6 = this;
            int r0 = r7.listLength()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            androidx.emoji2.text.TypefaceEmojiRasterizer r2 = new androidx.emoji2.text.TypefaceEmojiRasterizer
            r2.<init>(r6, r1)
            int r3 = r2.getId()
            char[] r4 = r6.mEmojiCharArray
            int r5 = r1 * 2
            java.lang.Character.toChars(r3, r4, r5)
            r6.put(r2)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public static androidx.emoji2.text.MetadataRepo create(android.content.res.AssetManager r3, java.lang.String r4) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L16
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r3, r4)     // Catch: java.lang.Throwable -> L16
            androidx.emoji2.text.MetadataRepo r1 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L16
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L16
            androidx.core.os.TraceCompat.endSection()
            return r1
        L16:
            r0 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r0
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface r2) {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.flatbuffer.MetadataList r1 = new androidx.emoji2.text.flatbuffer.MetadataList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13
            androidx.core.os.TraceCompat.endSection()
            return r0
        L13:
            r0 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r0
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface r2, java.io.InputStream r3) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r1 = androidx.emoji2.text.MetadataListReader.read(r3)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r0 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r0
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface r2, java.nio.ByteBuffer r3) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r1 = androidx.emoji2.text.MetadataListReader.read(r3)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r0 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r0
    }

    public char[] getEmojiCharArray() {
            r1 = this;
            char[] r0 = r1.mEmojiCharArray
            return r0
    }

    public androidx.emoji2.text.flatbuffer.MetadataList getMetadataList() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            return r0
    }

    int getMetadataVersion() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            int r0 = r0.version()
            return r0
    }

    androidx.emoji2.text.MetadataRepo.Node getRootNode() {
            r1 = this;
            androidx.emoji2.text.MetadataRepo$Node r0 = r1.mRootNode
            return r0
    }

    android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.mTypeface
            return r0
    }

    void put(androidx.emoji2.text.TypefaceEmojiRasterizer r5) {
            r4 = this;
            java.lang.String r0 = "emoji metadata cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r5, r0)
            int r0 = r5.getCodepointsLength()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            java.lang.String r3 = "invalid metadata codepoint length"
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            androidx.emoji2.text.MetadataRepo$Node r0 = r4.mRootNode
            int r3 = r5.getCodepointsLength()
            int r3 = r3 - r1
            r0.put(r5, r2, r3)
            return
    }
}
