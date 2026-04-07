package androidx.core.content.res;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FontResourcesParserCompat$$ExternalSyntheticAutoCloseableDispatcher0 {
    public static /* synthetic */ void m(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto La
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            r1.close()
            return
        La:
            boolean r0 = r1 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L14
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticAutoCloseableForwarder1.m(r1)
            return
        L14:
            boolean r0 = r1 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L1e
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r1.recycle()
            return
        L1e:
            boolean r0 = r1 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L28
            android.media.MediaMetadataRetriever r1 = (android.media.MediaMetadataRetriever) r1
            r1.release()
            return
        L28:
            boolean r0 = r1 instanceof android.media.MediaDrm
            if (r0 == 0) goto L32
            android.media.MediaDrm r1 = (android.media.MediaDrm) r1
            r1.release()
            return
        L32:
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticThrowIAE2.m(r1)
            return
    }
}
