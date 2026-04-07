package androidx.activity.result.contract;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0015"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "<init>", "()V", "StartActivityForResult", "StartIntentSenderForResult", "RequestMultiplePermissions", "RequestPermission", "TakePicturePreview", "TakePicture", "TakeVideo", "CaptureVideo", "PickContact", "GetContent", "GetMultipleContents", "OpenDocument", "OpenMultipleDocuments", "OpenDocumentTree", "CreateDocument", "PickVisualMedia", "PickMultipleVisualMedia", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityResultContracts {

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017J\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class CaptureVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public CaptureVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, android.net.Uri r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
                r0.<init>(r1)
                java.lang.String r1 = "output"
                r2 = r5
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.lang.Boolean r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0017J \u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "mimeType", "<init>", "(Ljava/lang/String;)V", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class CreateDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        private final java.lang.String mimeType;

        @kotlin.Deprecated(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @kotlin.ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
                r1 = this;
                java.lang.String r0 = "*/*"
                r1.<init>(r0)
                return
        }

        public CreateDocument(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mimeType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mimeType = r2
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.CREATE_DOCUMENT"
                r0.<init>(r1)
                java.lang.String r1 = r2.mimeType
                android.content.Intent r0 = r0.setType(r1)
                java.lang.String r1 = "android.intent.extra.TITLE"
                android.content.Intent r0 = r0.putExtra(r1, r4)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L14
                android.net.Uri r0 = r1.getData()
            L14:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017J \u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class GetContent extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        public GetContent() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.GET_CONTENT"
                r0.<init>(r1)
                java.lang.String r1 = "android.intent.category.OPENABLE"
                android.content.Intent r0 = r0.addCategory(r1)
                android.content.Intent r0 = r0.setType(r4)
                java.lang.String r1 = "setType(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L14
                android.net.Uri r0 = r1.getData()
            L14:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00132\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0017J$\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class GetMultipleContents extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {
        public static final androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion Companion = null;

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "<init>", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public final java.util.List<android.net.Uri> getClipDataUris$activity_release(android.content.Intent r6) {
                    r5 = this;
                    java.lang.String r0 = "<this>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                    r0.<init>()
                    android.net.Uri r1 = r6.getData()
                    if (r1 == 0) goto L14
                    r2 = 0
                    r0.add(r1)
                L14:
                    android.content.ClipData r1 = r6.getClipData()
                    if (r1 != 0) goto L25
                    boolean r2 = r0.isEmpty()
                    if (r2 == 0) goto L25
                    java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
                    return r2
                L25:
                    if (r1 == 0) goto L3e
                    r2 = 0
                    int r3 = r1.getItemCount()
                L2c:
                    if (r2 >= r3) goto L3e
                    android.content.ClipData$Item r4 = r1.getItemAt(r2)
                    android.net.Uri r4 = r4.getUri()
                    if (r4 == 0) goto L3b
                    r0.add(r4)
                L3b:
                    int r2 = r2 + 1
                    goto L2c
                L3e:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r3 = r0
                    java.util.Collection r3 = (java.util.Collection) r3
                    r2.<init>(r3)
                    java.util.List r2 = (java.util.List) r2
                    return r2
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion = r0
                return
        }

        public GetMultipleContents() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.GET_CONTENT"
                r0.<init>(r1)
                java.lang.String r1 = "android.intent.category.OPENABLE"
                android.content.Intent r0 = r0.addCategory(r1)
                android.content.Intent r0 = r0.setType(r5)
                java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
                r2 = 1
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.util.List r0 = r1.parseResult2(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                if (r2 == 0) goto Lc
                r0 = r5
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L17
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r0 = r1.getClipDataUris$activity_release(r0)
                if (r0 != 0) goto L1b
            L17:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L1b:
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class OpenDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        public OpenDocument() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.String[] r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r0.<init>(r1)
                java.lang.String r1 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r0 = r0.putExtra(r1, r4)
                java.lang.String r1 = "*/*"
                android.content.Intent r0 = r0.setType(r1)
                java.lang.String r1 = "setType(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L14
                android.net.Uri r0 = r1.getData()
            L14:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class OpenDocumentTree extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        public OpenDocumentTree() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, android.net.Uri r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT_TREE"
                r0.<init>(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L1c
                if (r5 == 0) goto L1c
                java.lang.String r1 = "android.provider.extra.INITIAL_URI"
                r2 = r5
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                r0.putExtra(r1, r2)
            L1c:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L14
                android.net.Uri r0 = r1.getData()
            L14:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class OpenMultipleDocuments extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        public OpenMultipleDocuments() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, java.lang.String[] r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r0.<init>(r1)
                java.lang.String r1 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r0 = r0.putExtra(r1, r5)
                java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
                r2 = 1
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "*/*"
                android.content.Intent r0 = r0.setType(r1)
                java.lang.String r1 = "setType(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.util.List r0 = r1.parseResult2(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                if (r2 == 0) goto Lc
                r0 = r5
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L17
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r0 = r1.getClipDataUris$activity_release(r0)
                if (r0 != 0) goto L1b
            L17:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L1b:
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PickContact extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        public PickContact() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.Void r3) {
                r1 = this;
                r0 = r3
                java.lang.Void r0 = (java.lang.Void) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.Void r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.PICK"
                r0.<init>(r1)
                java.lang.String r1 = "vnd.android.cursor.dir/contact"
                android.content.Intent r0 = r0.setType(r1)
                java.lang.String r1 = "setType(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L14
                android.net.Uri r0 = r1.getData()
            L14:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00142\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017J)\u0010\u000f\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "maxItems", "", "<init>", "(I)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "intent", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class PickMultipleVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> {
        public static final androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion Companion = null;
        private final int maxItems;

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "<init>", "()V", "getMaxItems", "", "getMaxItems$activity_release", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public final int getMaxItems$activity_release() {
                    r1 = this;
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                    boolean r0 = r0.isSystemPickerAvailable$activity_release()
                    if (r0 == 0) goto Ld
                    int r0 = android.provider.MediaStore.getPickImagesMaxLimit()
                    goto L10
                Ld:
                    r0 = 2147483647(0x7fffffff, float:NaN)
                L10:
                    return r0
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion = r0
                return
        }

        public PickMultipleVisualMedia() {
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r1)
                return
        }

        public PickMultipleVisualMedia(int r3) {
                r2 = this;
                r2.<init>()
                r2.maxItems = r3
                int r0 = r2.maxItems
                r1 = 1
                if (r0 <= r1) goto Lc
                goto Ld
            Lc:
                r1 = 0
            Ld:
                if (r1 == 0) goto L11
            L10:
                return
            L11:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Max items must be higher than 1"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public /* synthetic */ PickMultipleVisualMedia(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto La
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
                int r1 = r1.getMaxItems$activity_release()
            La:
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r10, androidx.activity.result.PickVisualMediaRequest r11) {
                r9 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L97
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r3 = "android.provider.action.PICK_IMAGES"
                r0.<init>(r3)
                r3 = r0
                r4 = 0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r5 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r6 = r11.getMediaType()
                java.lang.String r5 = r5.getVisualMimeType$activity_release(r6)
                r3.setType(r5)
                int r5 = r9.maxItems
                int r6 = r11.getMaxItems()
                int r5 = java.lang.Math.min(r5, r6)
                if (r5 <= r2) goto L3d
                int r6 = android.provider.MediaStore.getPickImagesMaxLimit()
                if (r5 > r6) goto L3d
                r1 = r2
            L3d:
                if (r1 == 0) goto L88
                java.lang.String r1 = "android.provider.extra.PICK_IMAGES_MAX"
                r3.putExtra(r1, r5)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r1 = r11.getDefaultTab()
                int r1 = r1.getValue()
                java.lang.String r2 = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB"
                r3.putExtra(r2, r1)
                java.lang.String r1 = "android.provider.extra.PICK_IMAGES_IN_ORDER"
                boolean r2 = r11.isOrderedSelection()
                r3.putExtra(r1, r2)
                boolean r1 = r11.isCustomAccentColorApplied()
                if (r1 == 0) goto L69
                java.lang.String r1 = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR"
                long r6 = r11.getAccentColor()
                r3.putExtra(r1, r6)
            L69:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                if (r1 < r2) goto L85
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities r1 = r11.getMediaCapabilitiesForTranscoding()
                if (r1 == 0) goto L85
                r2 = 0
                android.media.ApplicationMediaCapabilities r6 = r1.toApplicationMediaCapabilities$activity_release()
                android.os.Parcelable r6 = (android.os.Parcelable) r6
                java.lang.String r7 = "android.provider.extra.MEDIA_CAPABILITIES"
                r3.putExtra(r7, r6)
            L85:
                goto L156
            L88:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L97:
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemFallbackPickerAvailable$activity_release(r10)
                if (r0 == 0) goto L11e
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r0 = r0.getSystemFallbackPicker$activity_release(r10)
                if (r0 == 0) goto L112
                android.content.pm.ActivityInfo r0 = r0.activityInfo
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r4 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r3.<init>(r4)
                r4 = r3
                r5 = 0
                android.content.pm.ApplicationInfo r6 = r0.applicationInfo
                java.lang.String r6 = r6.packageName
                java.lang.String r7 = r0.name
                r4.setClassName(r6, r7)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r6 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r7 = r11.getMediaType()
                java.lang.String r6 = r6.getVisualMimeType$activity_release(r7)
                r4.setType(r6)
                int r6 = r9.maxItems
                int r7 = r11.getMaxItems()
                int r6 = java.lang.Math.min(r6, r7)
                if (r6 <= r2) goto Ld5
                r1 = r2
            Ld5:
                if (r1 == 0) goto L104
                java.lang.String r1 = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX"
                r4.putExtra(r1, r6)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r1 = r11.getDefaultTab()
                int r1 = r1.getValue()
                java.lang.String r2 = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB"
                r4.putExtra(r2, r1)
                java.lang.String r1 = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER"
                boolean r2 = r11.isOrderedSelection()
                r4.putExtra(r1, r2)
                boolean r1 = r11.isCustomAccentColorApplied()
                if (r1 == 0) goto L101
                java.lang.String r1 = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR"
                long r7 = r11.getAccentColor()
                r4.putExtra(r1, r7)
            L101:
                r0 = r3
                goto L156
            L104:
                r1 = 0
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Max items must be greater than 1"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L112:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Required value was null."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L11e:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r3 = "android.intent.action.OPEN_DOCUMENT"
                r0.<init>(r3)
                r3 = r0
                r4 = 0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r5 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r6 = r11.getMediaType()
                java.lang.String r5 = r5.getVisualMimeType$activity_release(r6)
                r3.setType(r5)
                java.lang.String r5 = "android.intent.extra.ALLOW_MULTIPLE"
                r3.putExtra(r5, r2)
                java.lang.String r5 = r3.getType()
                if (r5 != 0) goto L154
                java.lang.String r5 = "*/*"
                r3.setType(r5)
                r5 = 2
                java.lang.String[] r5 = new java.lang.String[r5]
                java.lang.String r6 = "image/*"
                r5[r1] = r6
                java.lang.String r1 = "video/*"
                r5[r2] = r1
                java.lang.String r1 = "android.intent.extra.MIME_TYPES"
                r3.putExtra(r1, r5)
            L154:
            L156:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                r0 = r3
                androidx.activity.result.PickVisualMediaRequest r0 = (androidx.activity.result.PickVisualMediaRequest) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                r0 = r3
                androidx.activity.result.PickVisualMediaRequest r0 = (androidx.activity.result.PickVisualMediaRequest) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.util.List r0 = r1.parseResult2(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                if (r2 == 0) goto Lc
                r0 = r5
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L17
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r0 = r1.getClipDataUris$activity_release(r0)
                if (r0 != 0) goto L1b
            L17:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L1b:
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 \u00112\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017J \u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "VisualMediaType", "ImageOnly", "VideoOnly", "ImageAndVideo", "SingleMimeType", "MediaCapabilities", "DefaultTab", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class PickVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, android.net.Uri> {
        public static final java.lang.String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion Companion = null;
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final java.lang.String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final java.lang.String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\r\u0010\u0015\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003¨\u0006 "}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;", "", "<init>", "()V", "isPhotoPickerAvailable", "", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "", "getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB$annotations", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER$annotations", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR$annotations", "context", "Landroid/content/Context;", "isSystemPickerAvailable", "isSystemPickerAvailable$activity_release", "isSystemFallbackPickerAvailable", "isSystemFallbackPickerAvailable$activity_release", "getSystemFallbackPicker", "Landroid/content/pm/ResolveInfo;", "getSystemFallbackPicker$activity_release", "getVisualMimeType", "input", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getVisualMimeType$activity_release", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
                    return
            }

            @kotlin.jvm.JvmStatic
            public final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(android.content.Context r4) {
                    r3 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    android.content.pm.PackageManager r0 = r4.getPackageManager()
                    android.content.Intent r1 = new android.content.Intent
                    java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
                    r1.<init>(r2)
                    r2 = 1114112(0x110000, float:1.561203E-39)
                    android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r2)
                    return r0
            }

            public final java.lang.String getVisualMimeType$activity_release(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                    r1 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly
                    if (r0 == 0) goto Ld
                    java.lang.String r0 = "image/*"
                    goto L25
                Ld:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly
                    if (r0 == 0) goto L14
                    java.lang.String r0 = "video/*"
                    goto L25
                L14:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType
                    if (r0 == 0) goto L20
                    r0 = r2
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$SingleMimeType r0 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType) r0
                    java.lang.String r0 = r0.getMimeType()
                    goto L25
                L20:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo
                    if (r0 == 0) goto L26
                    r0 = 0
                L25:
                    return r0
                L26:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
            }

            @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable() {
                    r1 = this;
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable(android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    if (r0 != 0) goto L14
                    boolean r0 = r1.isSystemFallbackPickerAvailable$activity_release(r2)
                    if (r0 == 0) goto L12
                    goto L14
                L12:
                    r0 = 0
                    goto L15
                L14:
                    r0 = 1
                L15:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemFallbackPickerAvailable$activity_release(android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    android.content.pm.ResolveInfo r0 = r1.getSystemFallbackPicker$activity_release(r2)
                    if (r0 == 0) goto Ld
                    r0 = 1
                    goto Le
                Ld:
                    r0 = 0
                Le:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemPickerAvailable$activity_release() {
                    r4 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 33
                    r2 = 1
                    if (r0 < r1) goto L8
                    goto L1a
                L8:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 0
                    r3 = 30
                    if (r0 < r3) goto L19
                    int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r3)
                    r3 = 2
                    if (r0 < r3) goto L17
                    goto L1a
                L17:
                    r2 = r1
                    goto L1a
                L19:
                    r2 = r1
                L1a:
                    return r2
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "", "<init>", "()V", "value", "", "getValue", "()I", "PhotosTab", "AlbumsTab", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class DefaultTab {

            /* JADX INFO: compiled from: ActivityResultContracts.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$AlbumsTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "<init>", "()V", "value", "", "getValue", "()I", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AlbumsTab extends androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab {
                public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab INSTANCE = null;
                private static final int value = 0;

                static {
                        androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$AlbumsTab r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$AlbumsTab
                        r0.<init>()
                        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab.INSTANCE = r0
                        return
                }

                private AlbumsTab() {
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                        r1 = this;
                        int r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab.value
                        return r0
                }
            }

            /* JADX INFO: compiled from: ActivityResultContracts.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "<init>", "()V", "value", "", "getValue", "()I", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class PhotosTab extends androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab {
                public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab INSTANCE = null;
                private static final int value = 0;

                static {
                        androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab
                        r0.<init>()
                        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE = r0
                        r0 = 1
                        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.value = r0
                        return
                }

                private PhotosTab() {
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                        r1 = this;
                        int r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.value
                        return r0
                }
            }

            private DefaultTab() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ DefaultTab(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract int getValue();
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ImageAndVideo implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE = r0
                    return
            }

            private ImageAndVideo() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ImageOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE = r0
                    return
            }

            private ImageOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eR0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "", "<init>", "()V", "value", "", "", "supportedHdrTypes", "getSupportedHdrTypes", "()Ljava/util/Set;", "setSupportedHdrTypes$activity_release", "(Ljava/util/Set;)V", "toApplicationMediaCapabilities", "Landroid/media/ApplicationMediaCapabilities;", "toApplicationMediaCapabilities$activity_release", "Companion", "Builder", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MediaCapabilities {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities.Companion Companion = null;
            public static final int TYPE_DOLBY_VISION = 3;
            public static final int TYPE_HDR10 = 1;
            public static final int TYPE_HDR10_PLUS = 2;
            public static final int TYPE_HLG10 = 0;
            private java.util.Set<java.lang.Integer> supportedHdrTypes;

            /* JADX INFO: compiled from: ActivityResultContracts.kt */
            @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities$Builder;", "", "<init>", "()V", "supportedHdrTypes", "", "", "addSupportedHdrType", "hdrType", "build", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Builder {
                private java.util.Set<java.lang.Integer> supportedHdrTypes;

                public Builder() {
                        r1 = this;
                        r1.<init>()
                        java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                        r0.<init>()
                        java.util.Set r0 = (java.util.Set) r0
                        r1.supportedHdrTypes = r0
                        return
                }

                public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities.Builder addSupportedHdrType(int r3) {
                        r2 = this;
                        java.util.Set<java.lang.Integer> r0 = r2.supportedHdrTypes
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                        r0.add(r1)
                        return r2
                }

                public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities build() {
                        r4 = this;
                        androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities
                        r0.<init>()
                        r1 = r0
                        r2 = 0
                        java.util.Set<java.lang.Integer> r3 = r4.supportedHdrTypes
                        r1.setSupportedHdrTypes$activity_release(r3)
                        return r0
                }
            }

            /* JADX INFO: compiled from: ActivityResultContracts.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities$Companion;", "", "<init>", "()V", "TYPE_HLG10", "", "TYPE_HDR10", "TYPE_HDR10_PLUS", "TYPE_DOLBY_VISION", "HdrType", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {

                /* JADX INFO: compiled from: ActivityResultContracts.kt */
                @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
                @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities$Companion$HdrType;", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
                @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
                @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
                public @interface HdrType {
                }

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
            }

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities$Companion
                    r1 = 0
                    r0.<init>(r1)
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities.Companion = r0
                    return
            }

            public MediaCapabilities() {
                    r1 = this;
                    r1.<init>()
                    java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
                    r1.supportedHdrTypes = r0
                    return
            }

            public final java.util.Set<java.lang.Integer> getSupportedHdrTypes() {
                    r1 = this;
                    java.util.Set<java.lang.Integer> r0 = r1.supportedHdrTypes
                    return r0
            }

            public final void setSupportedHdrTypes$activity_release(java.util.Set<java.lang.Integer> r2) {
                    r1 = this;
                    java.lang.String r0 = "<set-?>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.supportedHdrTypes = r2
                    return
            }

            public final android.media.ApplicationMediaCapabilities toApplicationMediaCapabilities$activity_release() {
                    r10 = this;
                    android.media.ApplicationMediaCapabilities$Builder r0 = new android.media.ApplicationMediaCapabilities$Builder
                    r0.<init>()
                    r1 = r0
                    r2 = 0
                    java.lang.String r3 = "video/hevc"
                    r1.addSupportedVideoMimeType(r3)
                    java.util.Set<java.lang.Integer> r3 = r10.supportedHdrTypes
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    r4 = 0
                    java.util.Iterator r5 = r3.iterator()
                L15:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L45
                    java.lang.Object r6 = r5.next()
                    r7 = r6
                    java.lang.Number r7 = (java.lang.Number) r7
                    int r7 = r7.intValue()
                    r8 = 0
                    switch(r7) {
                        case 0: goto L3d;
                        case 1: goto L37;
                        case 2: goto L31;
                        case 3: goto L2b;
                        default: goto L2a;
                    }
                L2a:
                    goto L42
                L2b:
                    java.lang.String r9 = "android.media.feature.hdr.dolby_vision"
                    r1.addSupportedHdrType(r9)
                    goto L42
                L31:
                    java.lang.String r9 = "android.media.feature.hdr.hdr10_plus"
                    r1.addSupportedHdrType(r9)
                    goto L42
                L37:
                    java.lang.String r9 = "android.media.feature.hdr.hdr10"
                    r1.addSupportedHdrType(r9)
                    goto L42
                L3d:
                    java.lang.String r9 = "android.media.feature.hdr.hlg"
                    r1.addSupportedHdrType(r9)
                L42:
                    goto L15
                L45:
                    android.media.ApplicationMediaCapabilities r0 = r0.build()
                    java.lang.String r1 = "build(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    return r0
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mimeType", "", "<init>", "(Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SingleMimeType implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            private final java.lang.String mimeType;

            public SingleMimeType(java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "mimeType"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.<init>()
                    r1.mimeType = r2
                    return
            }

            public final java.lang.String getMimeType() {
                    r1 = this;
                    java.lang.String r0 = r1.mimeType
                    return r0
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VideoOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE = r0
                    return
            }

            private VideoOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface VisualMediaType {
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion = r0
                return
        }

        public PickVisualMedia() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r0 = r0.getSystemFallbackPicker$activity_release(r1)
                return r0
        }

        @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isPhotoPickerAvailable()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isPhotoPickerAvailable(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isSystemFallbackPickerAvailable$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemFallbackPickerAvailable$activity_release(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isSystemPickerAvailable$activity_release() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r8, androidx.activity.result.PickVisualMediaRequest r9) {
                r7 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                if (r0 == 0) goto L63
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.provider.action.PICK_IMAGES"
                r0.<init>(r1)
                r1 = r0
                r2 = 0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r3 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r9.getMediaType()
                java.lang.String r3 = r3.getVisualMimeType$activity_release(r4)
                r1.setType(r3)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r3 = r9.getDefaultTab()
                int r3 = r3.getValue()
                java.lang.String r4 = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB"
                r1.putExtra(r4, r3)
                boolean r3 = r9.isCustomAccentColorApplied()
                if (r3 == 0) goto L44
                java.lang.String r3 = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR"
                long r4 = r9.getAccentColor()
                r1.putExtra(r3, r4)
            L44:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 33
                if (r3 < r4) goto L60
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$MediaCapabilities r3 = r9.getMediaCapabilitiesForTranscoding()
                if (r3 == 0) goto L60
                r4 = 0
                android.media.ApplicationMediaCapabilities r5 = r3.toApplicationMediaCapabilities$activity_release()
                android.os.Parcelable r5 = (android.os.Parcelable) r5
                java.lang.String r6 = "android.provider.extra.MEDIA_CAPABILITIES"
                r1.putExtra(r6, r5)
            L60:
                goto Lf4
            L63:
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemFallbackPickerAvailable$activity_release(r8)
                if (r0 == 0) goto Lbf
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r0 = r0.getSystemFallbackPicker$activity_release(r8)
                if (r0 == 0) goto Lb3
                android.content.pm.ActivityInfo r0 = r0.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r1.<init>(r2)
                r2 = r1
                r3 = 0
                android.content.pm.ApplicationInfo r4 = r0.applicationInfo
                java.lang.String r4 = r4.packageName
                java.lang.String r5 = r0.name
                r2.setClassName(r4, r5)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r9.getMediaType()
                java.lang.String r4 = r4.getVisualMimeType$activity_release(r5)
                r2.setType(r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$DefaultTab r4 = r9.getDefaultTab()
                int r4 = r4.getValue()
                java.lang.String r5 = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB"
                r2.putExtra(r5, r4)
                boolean r4 = r9.isCustomAccentColorApplied()
                if (r4 == 0) goto Lb0
                java.lang.String r4 = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR"
                long r5 = r9.getAccentColor()
                r2.putExtra(r4, r5)
            Lb0:
                r0 = r1
                goto Lf4
            Lb3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Required value was null."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Lbf:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r0.<init>(r1)
                r1 = r0
                r2 = 0
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r3 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r9.getMediaType()
                java.lang.String r3 = r3.getVisualMimeType$activity_release(r4)
                r1.setType(r3)
                java.lang.String r3 = r1.getType()
                if (r3 != 0) goto Lf2
                java.lang.String r3 = "*/*"
                r1.setType(r3)
                r3 = 2
                java.lang.String[] r3 = new java.lang.String[r3]
                r4 = 0
                java.lang.String r5 = "image/*"
                r3[r4] = r5
                r4 = 1
                java.lang.String r5 = "video/*"
                r3[r4] = r5
                java.lang.String r4 = "android.intent.extra.MIME_TYPES"
                r1.putExtra(r4, r3)
            Lf2:
            Lf4:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                r0 = r3
                androidx.activity.result.PickVisualMediaRequest r0 = (androidx.activity.result.PickVisualMediaRequest) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                r0 = r3
                androidx.activity.result.PickVisualMediaRequest r0 = (androidx.activity.result.PickVisualMediaRequest) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L9
                r2 = 1
                goto La
            L9:
                r2 = 0
            La:
                r0 = 0
                if (r2 == 0) goto Lf
                r1 = r5
                goto L10
            Lf:
                r1 = r0
            L10:
                if (r1 == 0) goto L28
            L14:
                r0 = 0
                android.net.Uri r2 = r1.getData()
                if (r2 != 0) goto L27
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r1)
                java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                android.net.Uri r2 = (android.net.Uri) r2
            L27:
                r0 = r2
            L28:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.net.Uri r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\u000eJ7\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestMultiplePermissions extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion Companion = null;
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "<init>", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public final android.content.Intent createIntent$activity_release(java.lang.String[] r3) {
                    r2 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                    r0.<init>(r1)
                    java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
                    android.content.Intent r0 = r0.putExtra(r1, r3)
                    java.lang.String r1 = "putExtra(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    return r0
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion = r0
                return
        }

        public RequestMultiplePermissions() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                android.content.Intent r0 = r0.createIntent$activity_release(r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                r0 = r3
                java.lang.String[] r0 = (java.lang.String[]) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult2(android.content.Context r17, java.lang.String[] r18) {
                r16 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L15
                r2 = r4
                goto L16
            L15:
                r2 = r3
            L16:
                if (r2 == 0) goto L22
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r2 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
                r2.<init>(r3)
                return r2
            L22:
                r2 = r18
                r5 = 0
                int r6 = r2.length
                r7 = r3
            L27:
                if (r7 >= r6) goto L3e
                r8 = r2[r7]
                r9 = r8
                r10 = 0
                int r11 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r9)
                if (r11 != 0) goto L35
                r11 = r4
                goto L36
            L35:
                r11 = r3
            L36:
                if (r11 != 0) goto L3b
                r2 = r3
                goto L3f
            L3b:
                int r7 = r7 + 1
                goto L27
            L3e:
                r2 = r4
            L3f:
                if (r2 == 0) goto L7f
                r5 = r18
                r6 = 0
                int r7 = r5.length
                int r7 = kotlin.collections.MapsKt.mapCapacity(r7)
                r8 = 16
                int r7 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r8)
                java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                r8.<init>(r7)
                java.util.Map r8 = (java.util.Map) r8
                r9 = r5
                r10 = 0
                int r11 = r9.length
            L5b:
                if (r3 >= r11) goto L77
                r12 = r9[r3]
                r13 = r12
                r14 = 0
                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
                kotlin.Pair r13 = kotlin.TuplesKt.to(r13, r15)
                java.lang.Object r14 = r13.getFirst()
                java.lang.Object r13 = r13.getSecond()
                r8.put(r14, r13)
                int r3 = r3 + 1
                goto L5b
            L77:
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r3 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r3.<init>(r8)
                goto L80
            L7f:
                r3 = 0
            L80:
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.util.Map r0 = r1.parseResult2(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public java.util.Map<java.lang.String, java.lang.Boolean> parseResult2(int r17, android.content.Intent r18) {
                r16 = this;
                r0 = r18
                r1 = -1
                r2 = r17
                if (r2 == r1) goto Lc
                java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
                return r1
            Lc:
                if (r0 != 0) goto L13
                java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
                return r1
            L13:
                java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r1 = r0.getStringArrayExtra(r1)
                java.lang.String r3 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r3 = r0.getIntArrayExtra(r3)
                if (r3 == 0) goto L62
                if (r1 != 0) goto L24
                goto L62
            L24:
                r4 = r3
                r5 = 0
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = r4.length
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                r7 = r4
                r8 = 0
                int r9 = r7.length
                r10 = 0
                r11 = r10
            L33:
                if (r11 >= r9) goto L48
                r12 = r7[r11]
                r13 = r12
                r14 = 0
                if (r13 != 0) goto L3d
                r15 = 1
                goto L3e
            L3d:
                r15 = r10
            L3e:
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r15)
                r6.add(r13)
                int r11 = r11 + 1
                goto L33
            L48:
                java.util.List r6 = (java.util.List) r6
                java.util.List r4 = kotlin.collections.ArraysKt.filterNotNull(r1)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                r5 = r6
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.List r4 = kotlin.collections.CollectionsKt.zip(r4, r5)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Map r4 = kotlin.collections.MapsKt.toMap(r4)
                return r4
            L62:
                java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
                return r4
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestPermission extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        public RequestPermission() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = 0
                r1[r2] = r5
                android.content.Intent r0 = r0.createIntent$activity_release(r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r5)
                r1 = 1
                if (r0 != 0) goto L13
                r0 = r1
                goto L14
            L13:
                r0 = 0
            L14:
                if (r0 == 0) goto L21
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r2 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2.<init>(r1)
                goto L22
            L21:
                r2 = 0
            L22:
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public java.lang.Boolean parseResult(int r11, android.content.Intent r12) {
                r10 = this;
                r0 = 0
                if (r12 == 0) goto L31
                r1 = -1
                if (r11 == r1) goto L7
                goto L31
            L7:
                java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r1 = r12.getIntArrayExtra(r1)
                if (r1 == 0) goto L2c
                r2 = r1
                r3 = 0
                int r4 = r2.length
                r5 = r0
            L14:
                r6 = 1
                if (r5 >= r4) goto L27
                r7 = r2[r5]
                r8 = r7
                r9 = 0
                if (r8 != 0) goto L1f
                r8 = r6
                goto L20
            L1f:
                r8 = r0
            L20:
                if (r8 == 0) goto L24
                r2 = r6
                goto L28
            L24:
                int r5 = r5 + 1
                goto L14
            L27:
                r2 = r0
            L28:
                if (r2 != r6) goto L2c
                r0 = r6
            L2c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L31:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.lang.Boolean r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartActivityForResult extends androidx.activity.result.contract.ActivityResultContract<android.content.Intent, androidx.activity.result.ActivityResult> {
        public static final androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion Companion = null;
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "<init>", "()V", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion = r0
                return
        }

        public StartActivityForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                r0 = r3
                android.content.Intent r0 = (android.content.Intent) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartIntentSenderForResult extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion Companion = null;
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "<init>", "()V", "ACTION_INTENT_SENDER_REQUEST", "", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion = r0
                return
        }

        public StartIntentSenderForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, androidx.activity.result.IntentSenderRequest r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r0.<init>(r1)
                java.lang.String r1 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r2 = r5
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, androidx.activity.result.IntentSenderRequest r3) {
                r1 = this;
                r0 = r3
                androidx.activity.result.IntentSenderRequest r0 = (androidx.activity.result.IntentSenderRequest) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017J\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class TakePicture extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public TakePicture() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, android.net.Uri r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
                r0.<init>(r1)
                java.lang.String r1 = "output"
                r2 = r5
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                java.lang.Boolean r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class TakePicturePreview extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        public TakePicturePreview() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, java.lang.Void r3) {
                r1 = this;
                r0 = r3
                java.lang.Void r0 = (java.lang.Void) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.Void r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r2, java.lang.Void r3) {
                r1 = this;
                r0 = r3
                java.lang.Void r0 = (java.lang.Void) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r2, java.lang.Void r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L18
                java.lang.String r0 = "data"
                android.os.Parcelable r0 = r1.getParcelableExtra(r0)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            L18:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017J \u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.Deprecated(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class TakeVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        public TakeVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, android.net.Uri r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
                r0.<init>(r1)
                java.lang.String r1 = "output"
                r2 = r5
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "putExtra(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                android.content.Intent r0 = r1.createIntent2(r2, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r0 = r3
                android.net.Uri r0 = (android.net.Uri) r0
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r0 = r1.getSynchronousResult2(r2, r0)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = r5
                r1 = 0
                r2 = -1
                if (r4 != r2) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                r0 = 0
                if (r2 == 0) goto Ld
                r1 = r5
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L18
                java.lang.String r0 = "data"
                android.os.Parcelable r0 = r1.getParcelableExtra(r0)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            L18:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.parseResult(r2, r3)
                return r0
        }
    }

    private ActivityResultContracts() {
            r0 = this;
            r0.<init>()
            return
    }
}
