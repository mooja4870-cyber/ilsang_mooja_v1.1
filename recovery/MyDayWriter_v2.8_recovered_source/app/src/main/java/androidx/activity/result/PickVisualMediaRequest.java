package androidx.activity.result;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0016@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001e@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0004\u001a\u0004\u0018\u00010$@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "<init>", "()V", "value", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "", "maxItems", "getMaxItems", "()I", "setMaxItems$activity_release", "(I)V", "", "isOrderedSelection", "()Z", "setOrderedSelection$activity_release", "(Z)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "getDefaultTab", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "setDefaultTab$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V", "isCustomAccentColorApplied", "setCustomAccentColorApplied$activity_release", "", "accentColor", "getAccentColor", "()J", "setAccentColor$activity_release", "(J)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "mediaCapabilitiesForTranscoding", "getMediaCapabilitiesForTranscoding", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "setMediaCapabilitiesForTranscoding$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;)V", "Builder", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PickVisualMediaRequest {
    private long accentColor;
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;
    private int maxItems;
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

    /* JADX INFO: compiled from: PickVisualMediaRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0007J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "<init>", "()V", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "maxItems", "", "isOrderedSelection", "", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "isCustomAccentColorApplied", "accentColor", "", "mediaCapabilitiesForTranscoding", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "setMediaType", "setMaxItems", "setOrderedSelection", "setDefaultTab", "setAccentColor", "setMediaCapabilitiesForTranscoding", "mediaCapabilities", "build", "Landroidx/activity/result/PickVisualMediaRequest;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private long accentColor;
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab;
        private boolean isCustomAccentColorApplied;
        private boolean isOrderedSelection;
        private int maxItems;
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
                r1.mediaType = r0
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
                int r0 = r0.getMaxItems$activity_release()
                r1.maxItems = r0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r0
                r1.defaultTab = r0
                return
        }

        public final androidx.activity.result.PickVisualMediaRequest build() {
                r5 = this;
                androidx.activity.result.PickVisualMediaRequest r0 = new androidx.activity.result.PickVisualMediaRequest
                r0.<init>()
                r1 = r0
                r2 = 0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r3 = r5.mediaType
                r1.setMediaType$activity_release(r3)
                int r3 = r5.maxItems
                r1.setMaxItems$activity_release(r3)
                boolean r3 = r5.isOrderedSelection
                r1.setOrderedSelection$activity_release(r3)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r3 = r5.defaultTab
                r1.setDefaultTab$activity_release(r3)
                boolean r3 = r5.isCustomAccentColorApplied
                r1.setCustomAccentColorApplied$activity_release(r3)
                long r3 = r5.accentColor
                r1.setAccentColor$activity_release(r3)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities r3 = r5.mediaCapabilitiesForTranscoding
                r1.setMediaCapabilitiesForTranscoding$activity_release(r3)
                return r0
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setAccentColor(long r2) {
                r1 = this;
                r1.accentColor = r2
                r0 = 1
                r1.isCustomAccentColorApplied = r0
                return r1
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setDefaultTab(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r2) {
                r1 = this;
                java.lang.String r0 = "defaultTab"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.defaultTab = r2
                return r1
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMaxItems(int r1) {
                r0 = this;
                r0.maxItems = r1
                return r0
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaCapabilitiesForTranscoding(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r1) {
                r0 = this;
                r0.mediaCapabilitiesForTranscoding = r1
                return r0
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaType(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.mediaType = r2
                return r1
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setOrderedSelection(boolean r1) {
                r0 = this;
                r0.isOrderedSelection = r1
                return r0
        }
    }

    public PickVisualMediaRequest() {
            r1 = this;
            r1.<init>()
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType) r0
            r1.mediaType = r0
            androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
            int r0 = r0.getMaxItems$activity_release()
            r1.maxItems = r0
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab) r0
            r1.defaultTab = r0
            return
    }

    public final long getAccentColor() {
            r2 = this;
            long r0 = r2.accentColor
            return r0
    }

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r0 = r1.defaultTab
            return r0
    }

    public final int getMaxItems() {
            r1 = this;
            int r0 = r1.maxItems
            return r0
    }

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities getMediaCapabilitiesForTranscoding() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities r0 = r1.mediaCapabilitiesForTranscoding
            return r0
    }

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = r1.mediaType
            return r0
    }

    public final boolean isCustomAccentColorApplied() {
            r1 = this;
            boolean r0 = r1.isCustomAccentColorApplied
            return r0
    }

    public final boolean isOrderedSelection() {
            r1 = this;
            boolean r0 = r1.isOrderedSelection
            return r0
    }

    public final void setAccentColor$activity_release(long r1) {
            r0 = this;
            r0.accentColor = r1
            return
    }

    public final void setCustomAccentColorApplied$activity_release(boolean r1) {
            r0 = this;
            r0.isCustomAccentColorApplied = r1
            return
    }

    public final void setDefaultTab$activity_release(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.defaultTab = r2
            return
    }

    public final void setMaxItems$activity_release(int r1) {
            r0 = this;
            r0.maxItems = r1
            return
    }

    public final void setMediaCapabilitiesForTranscoding$activity_release(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities r1) {
            r0 = this;
            r0.mediaCapabilitiesForTranscoding = r1
            return
    }

    public final void setMediaType$activity_release(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.mediaType = r2
            return
    }

    public final void setOrderedSelection$activity_release(boolean r1) {
            r0 = this;
            r0.isOrderedSelection = r1
            return
    }
}
