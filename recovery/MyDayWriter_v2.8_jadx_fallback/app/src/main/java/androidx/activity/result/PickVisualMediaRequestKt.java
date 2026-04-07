package androidx.activity.result;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u0007\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001aB\u0010\u0000\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "maxItems", "", "isOrderedSelection", "", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "accentColor", "", "mediaCapabilitiesForTranscoding", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PickVisualMediaRequestKt {
    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(long r1, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r3, int r4, boolean r5, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r6) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defaultTab"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r3)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMaxItems(r4)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setOrderedSelection(r5)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setDefaultTab(r6)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setAccentColor(r1)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r1, long r2, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r4, int r5, boolean r6, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r7) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "defaultTab"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r4)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMaxItems(r5)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setOrderedSelection(r6)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setDefaultTab(r7)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setAccentColor(r2)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaCapabilitiesForTranscoding(r1)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r1, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2, int r3, boolean r4, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r5) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "defaultTab"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r2)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMaxItems(r3)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setOrderedSelection(r4)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setDefaultTab(r5)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaCapabilitiesForTranscoding(r1)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r1)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1, int r2) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r1)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMaxItems(r2)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1, int r2, boolean r3, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r4) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultTab"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMediaType(r1)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setMaxItems(r2)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setOrderedSelection(r3)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = r0.setDefaultTab(r4)
            androidx.activity.result.PickVisualMediaRequest r0 = r0.build()
            return r0
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(long r6, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r8, int r9, boolean r10, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r11, int r12, java.lang.Object r13) {
            r13 = r12 & 2
            if (r13 == 0) goto La
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r8 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r8 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r8
            r2 = r8
            goto Lb
        La:
            r2 = r8
        Lb:
            r8 = r12 & 4
            if (r8 == 0) goto L17
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r8 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r9 = r8.getMaxItems$activity_release()
            r3 = r9
            goto L18
        L17:
            r3 = r9
        L18:
            r8 = r12 & 8
            if (r8 == 0) goto L1f
            r10 = 0
            r4 = r10
            goto L20
        L1f:
            r4 = r10
        L20:
            r8 = r12 & 16
            if (r8 == 0) goto L2b
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r8 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
            r11 = r8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r11 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r11
            r5 = r11
            goto L2c
        L2b:
            r5 = r11
        L2c:
            r0 = r6
            androidx.activity.result.PickVisualMediaRequest r6 = PickVisualMediaRequest(r0, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r7, long r8, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r10, int r11, boolean r12, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r13, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto La
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r10 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r10 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r10
            r3 = r10
            goto Lb
        La:
            r3 = r10
        Lb:
            r10 = r14 & 8
            if (r10 == 0) goto L17
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r10 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r11 = r10.getMaxItems$activity_release()
            r4 = r11
            goto L18
        L17:
            r4 = r11
        L18:
            r10 = r14 & 16
            if (r10 == 0) goto L1f
            r12 = 0
            r5 = r12
            goto L20
        L1f:
            r5 = r12
        L20:
            r10 = r14 & 32
            if (r10 == 0) goto L2b
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r10 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
            r13 = r10
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r13 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r13
            r6 = r13
            goto L2c
        L2b:
            r6 = r13
        L2c:
            r0 = r7
            r1 = r8
            androidx.activity.result.PickVisualMediaRequest r7 = PickVisualMediaRequest(r0, r1, r3, r4, r5, r6)
            return r7
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r0, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1, int r2, boolean r3, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r1 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r1 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r1
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r2 = r2.getMaxItems$activity_release()
        L12:
            r6 = r5 & 8
            if (r6 == 0) goto L17
            r3 = 0
        L17:
            r5 = r5 & 16
            if (r5 == 0) goto L1f
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r4 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r4
        L1f:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r0, int r1, int r2, java.lang.Object r3) {
            r3 = r2 & 1
            if (r3 == 0) goto L8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
        L8:
            r2 = r2 & 2
            if (r2 == 0) goto L12
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r1 = r1.getMaxItems$activity_release()
        L12:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0, r1)
            return r0
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
        L8:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0)
            return r0
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r0, int r1, boolean r2, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L12
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r1 = r1.getMaxItems$activity_release()
        L12:
            r5 = r4 & 4
            if (r5 == 0) goto L17
            r2 = 0
        L17:
            r4 = r4 & 8
            if (r4 == 0) goto L1f
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r3 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r3 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r3
        L1f:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0, r1, r2, r3)
            return r0
    }
}
