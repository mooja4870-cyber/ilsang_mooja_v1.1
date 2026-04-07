package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class BridgeWebChromeClient extends android.webkit.WebChromeClient {
    private androidx.activity.result.ActivityResultLauncher activityLauncher;
    private com.getcapacitor.BridgeWebChromeClient.ActivityResultListener activityListener;
    private com.getcapacitor.Bridge bridge;
    private androidx.activity.result.ActivityResultLauncher permissionLauncher;
    private com.getcapacitor.BridgeWebChromeClient.PermissionListener permissionListener;

    private interface ActivityResultListener {
        void onActivityResult(androidx.activity.result.ActivityResult r1);
    }

    private interface PermissionListener {
        void onPermissionSelect(java.lang.Boolean r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$1rYvFa--8-RTTjKwt3c-0WeZc10, reason: not valid java name */
    public static /* synthetic */ void m104$r8$lambda$1rYvFa8RTTjKwt3c0WeZc10(com.getcapacitor.BridgeWebChromeClient r0, java.util.Map r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q6BWBORnwFhTFdGhfzydsAfabJw(com.getcapacitor.BridgeWebChromeClient r0, android.webkit.ValueCallback r1, android.webkit.WebChromeClient.FileChooserParams r2, boolean r3, java.lang.Boolean r4) {
            r0.lambda$onShowFileChooser$12(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$_JktA1AQpQiYcwzUd4_DsO5PViI(com.getcapacitor.BridgeWebChromeClient r0, android.webkit.GeolocationPermissions.Callback r1, java.lang.String r2, java.lang.Boolean r3) {
            r0.lambda$onGeolocationPermissionsShowPrompt$11(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$smnIFAY7gjbYK3CAZ2kUDI3xHnI(com.getcapacitor.BridgeWebChromeClient r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$1(r1)
            return
    }

    public BridgeWebChromeClient(com.getcapacitor.Bridge r4) {
            r3 = this;
            r3.<init>()
            r3.bridge = r4
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda5 r0 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda5
            r0.<init>(r3)
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r1 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r1 = r4.registerForActivityResult(r1, r0)
            r3.permissionLauncher = r1
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r1 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r1.<init>()
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda6 r2 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda6
            r2.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r1 = r4.registerForActivityResult(r1, r2)
            r3.activityLauncher = r1
            return
    }

    private java.io.File createImageFile(android.app.Activity r5) throws java.io.IOException {
            r4 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMdd_HHmmss"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JPEG_"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "_"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r2 = r5.getExternalFilesDir(r2)
            java.lang.String r3 = ".jpg"
            java.io.File r3 = java.io.File.createTempFile(r1, r3, r2)
            return r3
    }

    private android.net.Uri createImageFileUri() throws java.io.IOException {
            r4 = this;
            com.getcapacitor.Bridge r0 = r4.bridge
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            java.io.File r1 = r4.createImageFile(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.getcapacitor.Bridge r3 = r4.bridge
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = r3.getPackageName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".fileprovider"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = androidx.core.content.FileProvider.getUriForFile(r0, r2, r1)
            return r2
    }

    private java.lang.String[] getValidTypes(java.lang.String[] r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            int r2 = r9.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L3a
            r4 = r9[r3]
            java.lang.String r5 = "."
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L2c
            r5 = 1
            java.lang.String r5 = r4.substring(r5)
            java.lang.String r6 = r1.getMimeTypeFromExtension(r5)
            if (r6 == 0) goto L36
            boolean r7 = r0.contains(r6)
            if (r7 != 0) goto L36
            r0.add(r6)
            goto L36
        L2c:
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L36
            r0.add(r4)
            goto L37
        L36:
        L37:
            int r3 = r3 + 1
            goto Lb
        L3a:
            java.lang.Object[] r2 = r0.toArray()
            int r3 = r2.length
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3, r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
    }

    private boolean isMediaCaptureSupported() {
            r5 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "android.permission.CAMERA"
            r1[r2] = r3
            com.getcapacitor.Bridge r4 = r5.bridge
            android.content.Context r4 = r4.getContext()
            boolean r4 = com.getcapacitor.util.PermissionHelper.hasPermissions(r4, r1)
            if (r4 != 0) goto L23
            com.getcapacitor.Bridge r4 = r5.bridge
            android.content.Context r4 = r4.getContext()
            boolean r3 = com.getcapacitor.util.PermissionHelper.hasDefinedPermission(r4, r3)
            if (r3 != 0) goto L21
            goto L23
        L21:
            r0 = r2
            goto L24
        L23:
        L24:
            return r0
    }

    private /* synthetic */ void lambda$new$0(java.util.Map r5) {
            r4 = this;
            com.getcapacitor.BridgeWebChromeClient$PermissionListener r0 = r4.permissionListener
            if (r0 == 0) goto L30
            r0 = 1
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L26
            r0 = 0
        L26:
            goto Ld
        L27:
            com.getcapacitor.BridgeWebChromeClient$PermissionListener r1 = r4.permissionListener
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.onPermissionSelect(r2)
        L30:
            return
    }

    private /* synthetic */ void lambda$new$1(androidx.activity.result.ActivityResult r2) {
            r1 = this;
            com.getcapacitor.BridgeWebChromeClient$ActivityResultListener r0 = r1.activityListener
            if (r0 == 0) goto L9
            com.getcapacitor.BridgeWebChromeClient$ActivityResultListener r0 = r1.activityListener
            r0.onActivityResult(r2)
        L9:
            return
    }

    private /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$11(android.webkit.GeolocationPermissions.Callback r6, java.lang.String r7, java.lang.Boolean r8) {
            r5 = this;
            boolean r0 = r8.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            r6.invoke(r7, r1, r2)
            goto L2b
        Lc:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            r0[r2] = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L28
            com.getcapacitor.Bridge r3 = r5.bridge
            android.content.Context r3 = r3.getContext()
            boolean r3 = com.getcapacitor.util.PermissionHelper.hasPermissions(r3, r0)
            if (r3 == 0) goto L28
            r6.invoke(r7, r1, r2)
            goto L2b
        L28:
            r6.invoke(r7, r2, r2)
        L2b:
            return
    }

    static /* synthetic */ void lambda$onJsAlert$3(android.webkit.JsResult r0, android.content.DialogInterface r1, int r2) {
            r1.dismiss()
            r0.confirm()
            return
    }

    static /* synthetic */ void lambda$onJsAlert$4(android.webkit.JsResult r0, android.content.DialogInterface r1) {
            r1.dismiss()
            r0.cancel()
            return
    }

    static /* synthetic */ void lambda$onJsConfirm$5(android.webkit.JsResult r0, android.content.DialogInterface r1, int r2) {
            r1.dismiss()
            r0.confirm()
            return
    }

    static /* synthetic */ void lambda$onJsConfirm$6(android.webkit.JsResult r0, android.content.DialogInterface r1, int r2) {
            r1.dismiss()
            r0.cancel()
            return
    }

    static /* synthetic */ void lambda$onJsConfirm$7(android.webkit.JsResult r0, android.content.DialogInterface r1) {
            r1.dismiss()
            r0.cancel()
            return
    }

    static /* synthetic */ void lambda$onJsPrompt$10(android.webkit.JsPromptResult r0, android.content.DialogInterface r1) {
            r1.dismiss()
            r0.cancel()
            return
    }

    static /* synthetic */ void lambda$onJsPrompt$8(android.widget.EditText r1, android.webkit.JsPromptResult r2, android.content.DialogInterface r3, int r4) {
            r3.dismiss()
            android.text.Editable r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r2.confirm(r0)
            return
    }

    static /* synthetic */ void lambda$onJsPrompt$9(android.webkit.JsPromptResult r0, android.content.DialogInterface r1, int r2) {
            r1.dismiss()
            r0.cancel()
            return
    }

    static /* synthetic */ void lambda$onPermissionRequest$2(android.webkit.PermissionRequest r1, java.lang.Boolean r2) {
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto Le
            java.lang.String[] r0 = r1.getResources()
            r1.grant(r0)
            goto L11
        Le:
            r1.deny()
        L11:
            return
    }

    private /* synthetic */ void lambda$onShowFileChooser$12(android.webkit.ValueCallback r4, android.webkit.WebChromeClient.FileChooserParams r5, boolean r6, java.lang.Boolean r7) {
            r3 = this;
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto La
            r3.showMediaCaptureOrFilePicker(r4, r5, r6)
            goto L1f
        La:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "FileChooser"
            r0[r1] = r2
            java.lang.String r0 = com.getcapacitor.Logger.tags(r0)
            java.lang.String r1 = "Camera permission not granted"
            com.getcapacitor.Logger.warn(r0, r1)
            r0 = 0
            r4.onReceiveValue(r0)
        L1f:
            return
    }

    static /* synthetic */ void lambda$showFilePicker$15(android.webkit.ValueCallback r5, androidx.activity.result.ActivityResult r6) {
            android.content.Intent r0 = r6.getData()
            int r1 = r6.getResultCode()
            r2 = -1
            if (r1 != r2) goto L30
            android.content.ClipData r1 = r0.getClipData()
            if (r1 == 0) goto L30
            android.content.ClipData r1 = r0.getClipData()
            int r1 = r1.getItemCount()
            android.net.Uri[] r2 = new android.net.Uri[r1]
            r3 = 0
        L1c:
            if (r3 >= r1) goto L2f
            android.content.ClipData r4 = r0.getClipData()
            android.content.ClipData$Item r4 = r4.getItemAt(r3)
            android.net.Uri r4 = r4.getUri()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L1c
        L2f:
            goto L38
        L30:
            int r1 = r6.getResultCode()
            android.net.Uri[] r2 = android.webkit.WebChromeClient.FileChooserParams.parseResult(r1, r0)
        L38:
            r5.onReceiveValue(r2)
            return
    }

    static /* synthetic */ void lambda$showImageCapturePicker$13(android.net.Uri r3, android.webkit.ValueCallback r4, androidx.activity.result.ActivityResult r5) {
            r0 = 0
            int r1 = r5.getResultCode()
            r2 = -1
            if (r1 != r2) goto Lf
            r1 = 1
            android.net.Uri[] r1 = new android.net.Uri[r1]
            r2 = 0
            r1[r2] = r3
            r0 = r1
        Lf:
            r4.onReceiveValue(r0)
            return
    }

    static /* synthetic */ void lambda$showVideoCapturePicker$14(android.webkit.ValueCallback r4, androidx.activity.result.ActivityResult r5) {
            r0 = 0
            int r1 = r5.getResultCode()
            r2 = -1
            if (r1 != r2) goto L17
            r1 = 1
            android.net.Uri[] r1 = new android.net.Uri[r1]
            android.content.Intent r2 = r5.getData()
            android.net.Uri r2 = r2.getData()
            r3 = 0
            r1[r3] = r2
            r0 = r1
        L17:
            r4.onReceiveValue(r0)
            return
    }

    private void showFilePicker(android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6) {
            r4 = this;
            android.content.Intent r0 = r6.createIntent()
            int r1 = r6.getMode()
            r2 = 1
            if (r1 != r2) goto L10
            java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r1, r2)
        L10:
            java.lang.String[] r1 = r6.getAcceptTypes()
            int r1 = r1.length
            java.lang.String r3 = "."
            if (r1 > r2) goto L23
            java.lang.String r1 = r0.getType()
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L40
        L23:
            java.lang.String[] r1 = r6.getAcceptTypes()
            java.lang.String[] r1 = r4.getValidTypes(r1)
            java.lang.String r2 = "android.intent.extra.MIME_TYPES"
            r0.putExtra(r2, r1)
            java.lang.String r2 = r0.getType()
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L40
            r2 = 0
            r2 = r1[r2]
            r0.setType(r2)
        L40:
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda15 r1 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda15     // Catch: android.content.ActivityNotFoundException -> L4d
            r1.<init>(r5)     // Catch: android.content.ActivityNotFoundException -> L4d
            r4.activityListener = r1     // Catch: android.content.ActivityNotFoundException -> L4d
            androidx.activity.result.ActivityResultLauncher r1 = r4.activityLauncher     // Catch: android.content.ActivityNotFoundException -> L4d
            r1.launch(r0)     // Catch: android.content.ActivityNotFoundException -> L4d
            goto L52
        L4d:
            r1 = move-exception
            r2 = 0
            r5.onReceiveValue(r2)
        L52:
            return
    }

    private boolean showImageCapturePicker(android.webkit.ValueCallback<android.net.Uri[]> r6) {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)
            com.getcapacitor.Bridge r1 = r5.bridge
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            r2 = 0
            if (r1 != 0) goto L19
            return r2
        L19:
            android.net.Uri r1 = r5.createImageFileUri()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "output"
            r0.putExtra(r2, r1)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda7 r2 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda7
            r2.<init>(r1, r6)
            r5.activityListener = r2
            androidx.activity.result.ActivityResultLauncher r2 = r5.activityLauncher
            r2.launch(r0)
            r2 = 1
            return r2
        L31:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to create temporary media capture file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r1.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.error(r3)
            return r2
    }

    private void showMediaCaptureOrFilePicker(android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6, boolean r7) {
            r4 = this;
            if (r7 == 0) goto L7
            boolean r0 = r4.showVideoCapturePicker(r5)
            goto Lb
        L7:
            boolean r0 = r4.showImageCapturePicker(r5)
        Lb:
            if (r0 != 0) goto L21
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "FileChooser"
            r1[r2] = r3
            java.lang.String r1 = com.getcapacitor.Logger.tags(r1)
            java.lang.String r2 = "Media capture intent could not be launched. Falling back to default file picker."
            com.getcapacitor.Logger.warn(r1, r2)
            r4.showFilePicker(r5, r6)
        L21:
            return
    }

    private boolean showVideoCapturePicker(android.webkit.ValueCallback<android.net.Uri[]> r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
            r0.<init>(r1)
            com.getcapacitor.Bridge r1 = r2.bridge
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            if (r1 != 0) goto L19
            r1 = 0
            return r1
        L19:
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda0 r1 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r2.activityListener = r1
            androidx.activity.result.ActivityResultLauncher r1 = r2.activityLauncher
            r1.launch(r0)
            r1 = 1
            return r1
    }

    public boolean isValidMsg(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "%cresult %c"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "%cnative %c"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "console.groupEnd"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r6) {
            r5 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "Console"
            r1[r2] = r3
            java.lang.String r1 = com.getcapacitor.Logger.tags(r1)
            java.lang.String r2 = r6.message()
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.message()
            boolean r2 = r5.isValidMsg(r2)
            if (r2 == 0) goto L67
        L1d:
            java.lang.String r2 = r6.sourceId()
            int r3 = r6.lineNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r6.message()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "File: %s - Line %d - Msg: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.webkit.ConsoleMessage$MessageLevel r3 = r6.messageLevel()
            java.lang.String r3 = r3.name()
            java.lang.String r4 = "ERROR"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L4c
            r4 = 0
            com.getcapacitor.Logger.error(r1, r2, r4)
            goto L67
        L4c:
            java.lang.String r4 = "WARNING"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L58
            com.getcapacitor.Logger.warn(r1, r2)
            goto L67
        L58:
            java.lang.String r4 = "TIP"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L64
            com.getcapacitor.Logger.debug(r1, r2)
            goto L67
        L64:
            com.getcapacitor.Logger.info(r1, r2)
        L67:
            return r0
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(java.lang.String r5, android.webkit.GeolocationPermissions.Callback r6) {
            r4 = this;
            super.onGeolocationPermissionsShowPrompt(r5, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onGeolocationPermissionsShowPrompt: DOING IT HERE FOR ORIGIN: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Logger.debug(r0)
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            r3 = 1
            r0[r3] = r1
            com.getcapacitor.Bridge r1 = r4.bridge
            android.content.Context r1 = r1.getContext()
            boolean r1 = com.getcapacitor.util.PermissionHelper.hasPermissions(r1, r0)
            if (r1 != 0) goto L3f
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda4 r1 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda4
            r1.<init>(r4, r6, r5)
            r4.permissionListener = r1
            androidx.activity.result.ActivityResultLauncher r1 = r4.permissionLauncher
            r1.launch(r0)
            goto L47
        L3f:
            r6.invoke(r5, r3, r2)
            java.lang.String r1 = "onGeolocationPermissionsShowPrompt: has required permission"
            com.getcapacitor.Logger.debug(r1)
        L47:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
            r0 = this;
            super.onHideCustomView()
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView r6, java.lang.String r7, java.lang.String r8, android.webkit.JsResult r9) {
            r5 = this;
            com.getcapacitor.Bridge r0 = r5.bridge
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            boolean r0 = r0.isFinishing()
            r1 = 1
            if (r0 == 0) goto Le
            return r1
        Le:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            android.app.AlertDialog$Builder r2 = r0.setMessage(r8)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda1 r3 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda1
            r3.<init>(r9)
            java.lang.String r4 = "OK"
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r4, r3)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda2 r3 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda2
            r3.<init>(r9)
            r2.setOnCancelListener(r3)
            android.app.AlertDialog r2 = r0.create()
            r2.show()
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView r6, java.lang.String r7, java.lang.String r8, android.webkit.JsResult r9) {
            r5 = this;
            com.getcapacitor.Bridge r0 = r5.bridge
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            boolean r0 = r0.isFinishing()
            r1 = 1
            if (r0 == 0) goto Le
            return r1
        Le:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            android.app.AlertDialog$Builder r2 = r0.setMessage(r8)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda12 r3 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda12
            r3.<init>(r9)
            java.lang.String r4 = "OK"
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r4, r3)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda13 r3 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda13
            r3.<init>(r9)
            java.lang.String r4 = "Cancel"
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r4, r3)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda14 r3 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda14
            r3.<init>(r9)
            r2.setOnCancelListener(r3)
            android.app.AlertDialog r2 = r0.create()
            r2.show()
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.webkit.JsPromptResult r11) {
            r6 = this;
            com.getcapacitor.Bridge r0 = r6.bridge
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            boolean r0 = r0.isFinishing()
            r1 = 1
            if (r0 == 0) goto Le
            return r1
        Le:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r7.getContext()
            r0.<init>(r2)
            android.widget.EditText r2 = new android.widget.EditText
            android.content.Context r3 = r7.getContext()
            r2.<init>(r3)
            android.app.AlertDialog$Builder r3 = r0.setMessage(r9)
            android.app.AlertDialog$Builder r3 = r3.setView(r2)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda8 r4 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda8
            r4.<init>(r2, r11)
            java.lang.String r5 = "OK"
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r5, r4)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda9 r4 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda9
            r4.<init>(r11)
            java.lang.String r5 = "Cancel"
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r5, r4)
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda10 r4 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda10
            r4.<init>(r11)
            r3.setOnCancelListener(r4)
            android.app.AlertDialog r3 = r0.create()
            r3.show()
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(android.webkit.PermissionRequest r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = r4.getResources()
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "android.webkit.resource.VIDEO_CAPTURE"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1a
            java.lang.String r1 = "android.permission.CAMERA"
            r0.add(r1)
        L1a:
            java.lang.String[] r1 = r4.getResources()
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "android.webkit.resource.AUDIO_CAPTURE"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L34
            java.lang.String r1 = "android.permission.MODIFY_AUDIO_SETTINGS"
            r0.add(r1)
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            r0.add(r1)
        L34:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L50
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r0.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda11 r2 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda11
            r2.<init>(r4)
            r3.permissionListener = r2
            androidx.activity.result.ActivityResultLauncher r2 = r3.permissionLauncher
            r2.launch(r1)
            goto L57
        L50:
            java.lang.String[] r1 = r4.getResources()
            r4.grant(r1)
        L57:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View r1, android.webkit.WebChromeClient.CustomViewCallback r2) {
            r0 = this;
            r2.onCustomViewHidden()
            super.onShowCustomView(r1, r2)
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView r9, android.webkit.ValueCallback<android.net.Uri[]> r10, android.webkit.WebChromeClient.FileChooserParams r11) {
            r8 = this;
            java.lang.String[] r0 = r11.getAcceptTypes()
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r1 = r11.isCaptureEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            java.lang.String r4 = "image/*"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            if (r1 == 0) goto L27
            java.lang.String r5 = "video/*"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L27
            r5 = r3
            goto L28
        L27:
            r5 = r2
        L28:
            if (r4 != 0) goto L31
            if (r5 == 0) goto L2d
            goto L31
        L2d:
            r8.showFilePicker(r10, r11)
            goto L4e
        L31:
            boolean r6 = r8.isMediaCaptureSupported()
            if (r6 == 0) goto L3b
            r8.showMediaCaptureOrFilePicker(r10, r11, r5)
            goto L4e
        L3b:
            com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda3 r6 = new com.getcapacitor.BridgeWebChromeClient$$ExternalSyntheticLambda3
            r6.<init>(r8, r10, r11, r5)
            r8.permissionListener = r6
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r7 = "android.permission.CAMERA"
            r6[r2] = r7
            androidx.activity.result.ActivityResultLauncher r2 = r8.permissionLauncher
            r2.launch(r6)
        L4e:
            return r3
    }
}
