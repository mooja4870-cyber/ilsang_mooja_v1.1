package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class Plugin {
    private static final java.lang.String BUNDLE_PERSISTED_OPTIONS_JSON_KEY = "_json";
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<android.content.Intent>> activityLaunchers;
    protected com.getcapacitor.Bridge bridge;
    private final java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> eventListeners;
    protected com.getcapacitor.PluginHandle handle;
    private java.lang.String lastPluginCallId;
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<java.lang.String[]>> permissionLaunchers;
    private final java.util.Map<java.lang.String, java.util.List<com.getcapacitor.JSObject>> retainedEventArguments;

    @java.lang.Deprecated
    protected com.getcapacitor.PluginCall savedLastCall;

    /* JADX INFO: renamed from: $r8$lambda$7dmJ1HQ3Jrtmh-tOCDedcONSntE, reason: not valid java name */
    public static /* synthetic */ void m127$r8$lambda$7dmJ1HQ3JrtmhtOCDedcONSntE(com.getcapacitor.Plugin r0, java.lang.reflect.Method r1, androidx.activity.result.ActivityResult r2) {
            r0.lambda$initializeActivityLaunchers$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$MIUdFOWJqxyaYOIiq89xIboPNcM(com.getcapacitor.Plugin r0, java.lang.reflect.Method r1, java.util.Map r2) {
            r0.lambda$initializeActivityLaunchers$1(r1, r2)
            return
    }

    public Plugin() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.activityLaunchers = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.permissionLaunchers = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.eventListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.retainedEventArguments = r0
            return
    }

    private void addEventListener(java.lang.String r3, com.getcapacitor.PluginCall r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r2.eventListeners
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L15
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            goto L15
        L11:
            r0.add(r4)
            goto L26
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r1 = r2.eventListeners
            r1.put(r3, r0)
            r0.add(r4)
            r2.sendRetainedArgumentsForEvent(r3)
        L26:
            return
    }

    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> getActivityLauncherOrReject(com.getcapacitor.PluginCall r5, java.lang.String r6) {
            r4 = this;
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<android.content.Intent>> r0 = r4.activityLaunchers
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultLauncher r0 = (androidx.activity.result.ActivityResultLauncher) r0
            if (r0 != 0) goto L1e
            java.lang.String r1 = "There is no ActivityCallback method registered for the name: %s. Please define a callback method annotated with @ActivityCallback that receives arguments: (PluginCall, ActivityResult)"
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            com.getcapacitor.Logger.error(r1)
            r5.reject(r1)
            r2 = 0
            return r2
        L1e:
            return r0
    }

    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> getPermissionLauncherOrReject(com.getcapacitor.PluginCall r5, java.lang.String r6) {
            r4 = this;
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<java.lang.String[]>> r0 = r4.permissionLaunchers
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultLauncher r0 = (androidx.activity.result.ActivityResultLauncher) r0
            if (r0 != 0) goto L1e
            java.lang.String r1 = "There is no PermissionCallback method registered for the name: %s. Please define a callback method annotated with @PermissionCallback that receives arguments: (PluginCall)"
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            com.getcapacitor.Logger.error(r1)
            r5.reject(r1)
            r2 = 0
            return r2
        L1e:
            return r0
    }

    private java.lang.String[] getPermissionStringsForAliases(java.lang.String[] r10) {
            r9 = this;
            com.getcapacitor.PluginHandle r0 = r9.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.getcapacitor.annotation.Permission[] r2 = r0.permissions()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L12:
            if (r5 >= r3) goto L32
            r6 = r2[r5]
            java.util.List r7 = java.util.Arrays.asList(r10)
            java.lang.String r8 = r6.alias()
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L2f
            java.lang.String[] r7 = r6.strings()
            java.util.List r7 = java.util.Arrays.asList(r7)
            r1.addAll(r7)
        L2f:
            int r5 = r5 + 1
            goto L12
        L32:
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r2 = r1.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    private void handleLegacyPermission(com.getcapacitor.PluginCall r4) {
            r3 = this;
            com.getcapacitor.PluginHandle r0 = r3.handle
            com.getcapacitor.NativePlugin r0 = r0.getLegacyPluginAnnotation()
            java.lang.String[] r1 = r0.permissions()
            int r2 = r1.length
            if (r2 <= 0) goto L18
            r3.saveCall(r4)
            int r2 = r0.permissionRequestCode()
            r3.pluginRequestPermissions(r1, r2)
            goto L1b
        L18:
            r4.resolve()
        L1b:
            return
    }

    private /* synthetic */ void lambda$initializeActivityLaunchers$0(java.lang.reflect.Method r1, androidx.activity.result.ActivityResult r2) {
            r0 = this;
            r0.triggerActivityCallback(r1, r2)
            return
    }

    private /* synthetic */ void lambda$initializeActivityLaunchers$1(java.lang.reflect.Method r1, java.util.Map r2) {
            r0 = this;
            r0.triggerPermissionCallback(r1, r2)
            return
    }

    private void permissionActivityResult(com.getcapacitor.PluginCall r3, java.lang.String[] r4, java.lang.String r5) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher r0 = r2.getPermissionLauncherOrReject(r3, r5)
            if (r0 != 0) goto L7
            return
        L7:
            com.getcapacitor.Bridge r1 = r2.bridge
            r1.savePermissionCall(r3)
            r0.launch(r4)
            return
    }

    private void removeEventListener(java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r1.eventListeners
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r0.remove(r3)
            return
    }

    private void sendRetainedArgumentsForEvent(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.JSObject>> r0 = r3.retainedEventArguments
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.JSObject>> r1 = r3.retainedEventArguments
            r1.remove(r4)
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            com.getcapacitor.JSObject r2 = (com.getcapacitor.JSObject) r2
            r3.notifyListeners(r4, r2)
            goto L14
        L24:
            return
    }

    private void triggerActivityCallback(java.lang.reflect.Method r3, androidx.activity.result.ActivityResult r4) {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            java.lang.String r1 = r2.lastPluginCallId
            com.getcapacitor.PluginCall r0 = r0.getSavedCall(r1)
            if (r0 != 0) goto L10
            com.getcapacitor.Bridge r1 = r2.bridge
            com.getcapacitor.PluginCall r0 = r1.getPluginCallForLastActivity()
        L10:
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r3.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            goto L22
        L1c:
            r1 = move-exception
            goto L1f
        L1e:
            r1 = move-exception
        L1f:
            r1.printStackTrace()
        L22:
            return
    }

    private void triggerPermissionCallback(java.lang.reflect.Method r3, java.util.Map<java.lang.String, java.lang.Boolean> r4) {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            com.getcapacitor.PluginHandle r1 = r2.handle
            java.lang.String r1 = r1.getId()
            com.getcapacitor.PluginCall r0 = r0.getPermissionCall(r1)
            com.getcapacitor.Bridge r1 = r2.bridge
            boolean r1 = r1.validatePermissions(r2, r0, r4)
            if (r1 == 0) goto L26
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r3.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            goto L26
        L20:
            r1 = move-exception
            goto L23
        L22:
            r1 = move-exception
        L23:
            r1.printStackTrace()
        L26:
            return
    }

    @com.getcapacitor.PluginMethod(returnType = "none")
    public void addListener(com.getcapacitor.PluginCall r3) {
            r2 = this;
            java.lang.String r0 = "eventName"
            java.lang.String r0 = r3.getString(r0)
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.setKeepAlive(r1)
            r2.addEventListener(r0, r3)
            return
    }

    @com.getcapacitor.PluginMethod
    @com.getcapacitor.annotation.PermissionCallback
    public void checkPermissions(com.getcapacitor.PluginCall r7) {
            r6 = this;
            java.util.Map r0 = r6.getPermissionStates()
            int r1 = r0.size()
            if (r1 != 0) goto Le
            r7.resolve()
            goto L38
        Le:
            com.getcapacitor.JSObject r1 = new com.getcapacitor.JSObject
            r1.<init>()
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.getValue()
            r1.put(r4, r5)
            goto L1b
        L35:
            r7.resolve(r1)
        L38:
            return
    }

    public void execute(java.lang.Runnable r2) {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.execute(r2)
            return
    }

    @java.lang.Deprecated
    public void freeSavedCall() {
            r2 = this;
            com.getcapacitor.PluginCall r0 = r2.savedLastCall
            com.getcapacitor.Bridge r1 = r2.bridge
            r0.release(r1)
            r0 = 0
            r2.savedLastCall = r0
            return
    }

    public androidx.appcompat.app.AppCompatActivity getActivity() {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public com.getcapacitor.Bridge getBridge() {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            return r0
    }

    public com.getcapacitor.PluginConfig getConfig() {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            com.getcapacitor.CapConfig r0 = r0.getConfig()
            com.getcapacitor.PluginHandle r1 = r2.handle
            java.lang.String r1 = r1.getId()
            com.getcapacitor.PluginConfig r0 = r0.getPluginConfiguration(r1)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getConfigValue(java.lang.String r3) {
            r2 = this;
            com.getcapacitor.PluginConfig r0 = r2.getConfig()     // Catch: org.json.JSONException -> Ld
            org.json.JSONObject r1 = r0.getConfigJSON()     // Catch: org.json.JSONException -> Ld
            java.lang.Object r1 = r1.get(r3)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    public android.content.Context getContext() {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            android.content.Context r0 = r0.getContext()
            return r0
    }

    protected java.lang.String getLogTag() {
            r3 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r2 = 0
            r0[r2] = r1
            java.lang.String r0 = com.getcapacitor.Logger.tags(r0)
            return r0
    }

    protected java.lang.String getLogTag(java.lang.String... r2) {
            r1 = this;
            java.lang.String r0 = com.getcapacitor.Logger.tags(r2)
            return r0
    }

    public com.getcapacitor.PermissionState getPermissionState(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.getPermissionStates()
            java.lang.Object r0 = r0.get(r2)
            com.getcapacitor.PermissionState r0 = (com.getcapacitor.PermissionState) r0
            return r0
    }

    public java.util.Map<java.lang.String, com.getcapacitor.PermissionState> getPermissionStates() {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            java.util.Map r0 = r0.getPermissionStates(r1)
            return r0
    }

    public com.getcapacitor.PluginHandle getPluginHandle() {
            r1 = this;
            com.getcapacitor.PluginHandle r0 = r1.handle
            return r0
    }

    @java.lang.Deprecated
    public com.getcapacitor.PluginCall getSavedCall() {
            r1 = this;
            com.getcapacitor.PluginCall r0 = r1.savedLastCall
            return r0
    }

    @java.lang.Deprecated
    protected void handleOnActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    protected void handleOnConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    protected void handleOnDestroy() {
            r0 = this;
            return
    }

    protected void handleOnNewIntent(android.content.Intent r1) {
            r0 = this;
            return
    }

    protected void handleOnPause() {
            r0 = this;
            return
    }

    protected void handleOnRestart() {
            r0 = this;
            return
    }

    protected void handleOnResume() {
            r0 = this;
            return
    }

    protected void handleOnStart() {
            r0 = this;
            return
    }

    protected void handleOnStop() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    protected void handleRequestPermissionsResult(int r8, java.lang.String[] r9, int[] r10) {
            r7 = this;
            boolean r0 = r7.hasDefinedPermissions(r9)
            if (r0 != 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Missing the following permissions in AndroidManifest.xml:\n"
            r0.append(r1)
            android.content.Context r1 = r7.getContext()
            java.lang.String[] r1 = com.getcapacitor.util.PermissionHelper.getUndefinedPermissions(r1, r9)
            int r2 = r1.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L37
            r4 = r1[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r6 = "\n"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            int r3 = r3 + 1
            goto L1a
        L37:
            com.getcapacitor.PluginCall r2 = r7.savedLastCall
            java.lang.String r3 = r0.toString()
            r2.reject(r3)
            r2 = 0
            r7.savedLastCall = r2
        L43:
            return
    }

    @java.lang.Deprecated
    public boolean hasDefinedPermissions(java.lang.String[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            android.content.Context r4 = r5.getContext()
            boolean r4 = com.getcapacitor.util.PermissionHelper.hasDefinedPermission(r4, r3)
            if (r4 != 0) goto L12
            return r1
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean hasDefinedRequiredPermissions() {
            r11 = this;
            com.getcapacitor.PluginHandle r0 = r11.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            if (r0 != 0) goto L17
            com.getcapacitor.PluginHandle r1 = r11.handle
            com.getcapacitor.NativePlugin r1 = r1.getLegacyPluginAnnotation()
            java.lang.String[] r2 = r1.permissions()
            boolean r2 = r11.hasDefinedPermissions(r2)
            return r2
        L17:
            com.getcapacitor.annotation.Permission[] r1 = r0.permissions()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L1e:
            if (r4 >= r2) goto L3d
            r5 = r1[r4]
            java.lang.String[] r6 = r5.strings()
            int r7 = r6.length
            r8 = r3
        L28:
            if (r8 >= r7) goto L3a
            r9 = r6[r8]
            android.content.Context r10 = r11.getContext()
            boolean r10 = com.getcapacitor.util.PermissionHelper.hasDefinedPermission(r10, r9)
            if (r10 != 0) goto L37
            return r3
        L37:
            int r8 = r8 + 1
            goto L28
        L3a:
            int r4 = r4 + 1
            goto L1e
        L3d:
            r1 = 1
            return r1
    }

    protected boolean hasListeners(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r2.eventListeners
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @java.lang.Deprecated
    public boolean hasPermission(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r0 = androidx.core.app.ActivityCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @java.lang.Deprecated
    public boolean hasRequiredPermissions() {
            r12 = this;
            com.getcapacitor.PluginHandle r0 = r12.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L29
            com.getcapacitor.PluginHandle r3 = r12.handle
            com.getcapacitor.NativePlugin r3 = r3.getLegacyPluginAnnotation()
            java.lang.String[] r4 = r3.permissions()
            int r5 = r4.length
            r6 = r2
        L16:
            if (r6 >= r5) goto L28
            r7 = r4[r6]
            android.content.Context r8 = r12.getContext()
            int r8 = androidx.core.app.ActivityCompat.checkSelfPermission(r8, r7)
            if (r8 == 0) goto L25
            return r2
        L25:
            int r6 = r6 + 1
            goto L16
        L28:
            return r1
        L29:
            com.getcapacitor.annotation.Permission[] r3 = r0.permissions()
            int r4 = r3.length
            r5 = r2
        L2f:
            if (r5 >= r4) goto L4e
            r6 = r3[r5]
            java.lang.String[] r7 = r6.strings()
            int r8 = r7.length
            r9 = r2
        L39:
            if (r9 >= r8) goto L4b
            r10 = r7[r9]
            android.content.Context r11 = r12.getContext()
            int r11 = androidx.core.app.ActivityCompat.checkSelfPermission(r11, r10)
            if (r11 == 0) goto L48
            return r2
        L48:
            int r9 = r9 + 1
            goto L39
        L4b:
            int r5 = r5 + 1
            goto L2f
        L4e:
            return r1
    }

    void initializeActivityLaunchers() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
        L9:
            java.lang.String r2 = r1.getName()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L29
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            java.lang.Class r1 = r1.getSuperclass()
            goto L9
        L29:
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class<com.getcapacitor.annotation.ActivityCallback> r3 = com.getcapacitor.annotation.ActivityCallback.class
            boolean r3 = r2.isAnnotationPresent(r3)
            if (r3 == 0) goto L5b
            com.getcapacitor.Bridge r3 = r6.bridge
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r4 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r4.<init>()
            com.getcapacitor.Plugin$$ExternalSyntheticLambda0 r5 = new com.getcapacitor.Plugin$$ExternalSyntheticLambda0
            r5.<init>(r6, r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.registerForActivityResult(r4, r5)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<android.content.Intent>> r4 = r6.activityLaunchers
            java.lang.String r5 = r2.getName()
            r4.put(r5, r3)
            goto L7d
        L5b:
            java.lang.Class<com.getcapacitor.annotation.PermissionCallback> r3 = com.getcapacitor.annotation.PermissionCallback.class
            boolean r3 = r2.isAnnotationPresent(r3)
            if (r3 == 0) goto L7d
            com.getcapacitor.Bridge r3 = r6.bridge
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r4 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r4.<init>()
            com.getcapacitor.Plugin$$ExternalSyntheticLambda1 r5 = new com.getcapacitor.Plugin$$ExternalSyntheticLambda1
            r5.<init>(r6, r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.registerForActivityResult(r4, r5)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultLauncher<java.lang.String[]>> r4 = r6.permissionLaunchers
            java.lang.String r5 = r2.getName()
            r4.put(r5, r3)
            goto L7e
        L7d:
        L7e:
            goto L2d
        L7f:
            return
    }

    public boolean isPermissionDeclared(java.lang.String r10) {
            r9 = this;
            com.getcapacitor.PluginHandle r0 = r9.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            r1 = 0
            if (r0 == 0) goto L3f
            com.getcapacitor.annotation.Permission[] r2 = r0.permissions()
            int r3 = r2.length
            r4 = r1
        Lf:
            if (r4 >= r3) goto L3f
            r5 = r2[r4]
            java.lang.String r6 = r5.alias()
            boolean r6 = r10.equalsIgnoreCase(r6)
            if (r6 == 0) goto L3c
            r2 = 1
            java.lang.String[] r3 = r5.strings()
            int r4 = r3.length
            r6 = r1
        L24:
            if (r6 >= r4) goto L3b
            r7 = r3[r6]
            if (r2 == 0) goto L36
            android.content.Context r8 = r9.getContext()
            boolean r8 = com.getcapacitor.util.PermissionHelper.hasDefinedPermission(r8, r7)
            if (r8 == 0) goto L36
            r8 = 1
            goto L37
        L36:
            r8 = r1
        L37:
            r2 = r8
            int r6 = r6 + 1
            goto L24
        L3b:
            return r2
        L3c:
            int r4 = r4 + 1
            goto Lf
        L3f:
            java.lang.String r2 = "isPermissionDeclared: No alias defined for %s or missing @CapacitorPlugin annotation."
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.getcapacitor.Logger.error(r2)
            return r1
    }

    public void load() {
            r0 = this;
            return
    }

    protected void notifyListeners(java.lang.String r2, com.getcapacitor.JSObject r3) {
            r1 = this;
            r0 = 0
            r1.notifyListeners(r2, r3, r0)
            return
    }

    protected void notifyListeners(java.lang.String r5, com.getcapacitor.JSObject r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = r4.getLogTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Notifying listeners for event "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.verbose(r0, r1)
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r4.eventListeners
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L45
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            goto L45
        L2b:
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            com.getcapacitor.PluginCall r3 = (com.getcapacitor.PluginCall) r3
            r3.resolve(r6)
            goto L34
        L44:
            return
        L45:
            java.lang.String r1 = r4.getLogTag()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No listeners found for event "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.debug(r1, r2)
            if (r7 == 0) goto L79
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.JSObject>> r1 = r4.retainedEventArguments
            java.lang.Object r1 = r1.get(r5)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L71
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = r2
        L71:
            r1.add(r6)
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.JSObject>> r2 = r4.retainedEventArguments
            r2.put(r5, r1)
        L79:
            return
    }

    @java.lang.Deprecated
    public void pluginRequestAllPermissions() {
            r4 = this;
            com.getcapacitor.PluginHandle r0 = r4.handle
            com.getcapacitor.NativePlugin r0 = r0.getLegacyPluginAnnotation()
            androidx.appcompat.app.AppCompatActivity r1 = r4.getActivity()
            java.lang.String[] r2 = r0.permissions()
            int r3 = r0.permissionRequestCode()
            androidx.core.app.ActivityCompat.requestPermissions(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void pluginRequestPermission(java.lang.String r4, int r5) {
            r3 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            androidx.core.app.ActivityCompat.requestPermissions(r0, r1, r5)
            return
    }

    @java.lang.Deprecated
    public void pluginRequestPermissions(java.lang.String[] r2, int r3) {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
            androidx.core.app.ActivityCompat.requestPermissions(r0, r2, r3)
            return
    }

    public void removeAllListeners() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r1.eventListeners
            r0.clear()
            return
    }

    @com.getcapacitor.PluginMethod(returnType = "promise")
    public void removeAllListeners(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.getcapacitor.PluginCall>> r0 = r1.eventListeners
            r0.clear()
            r2.resolve()
            return
    }

    @com.getcapacitor.PluginMethod(returnType = "none")
    public void removeListener(com.getcapacitor.PluginCall r5) {
            r4 = this;
            java.lang.String r0 = "eventName"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "callbackId"
            java.lang.String r1 = r5.getString(r1)
            com.getcapacitor.Bridge r2 = r4.bridge
            com.getcapacitor.PluginCall r2 = r2.getSavedCall(r1)
            if (r2 == 0) goto L1c
            r4.removeEventListener(r0, r2)
            com.getcapacitor.Bridge r3 = r4.bridge
            r3.releaseCall(r2)
        L1c:
            return
    }

    protected void requestAllPermissions(com.getcapacitor.PluginCall r9, java.lang.String r10) {
            r8 = this;
            com.getcapacitor.PluginHandle r0 = r8.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            if (r0 == 0) goto L31
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.getcapacitor.annotation.Permission[] r2 = r0.permissions()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L14:
            if (r5 >= r3) goto L26
            r6 = r2[r5]
            java.lang.String[] r7 = r6.strings()
            java.util.List r7 = java.util.Arrays.asList(r7)
            r1.addAll(r7)
            int r5 = r5 + 1
            goto L14
        L26:
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r2 = r1.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r8.permissionActivityResult(r9, r2, r10)
        L31:
            return
    }

    protected void requestPermissionForAlias(java.lang.String r3, com.getcapacitor.PluginCall r4, java.lang.String r5) {
            r2 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r2.requestPermissionForAliases(r0, r4, r5)
            return
    }

    protected void requestPermissionForAliases(java.lang.String[] r3, com.getcapacitor.PluginCall r4, java.lang.String r5) {
            r2 = this;
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.lang.String r0 = "No permission alias was provided"
            com.getcapacitor.Logger.error(r0)
            return
        L9:
            java.lang.String[] r0 = r2.getPermissionStringsForAliases(r3)
            int r1 = r0.length
            if (r1 <= 0) goto L13
            r2.permissionActivityResult(r4, r0, r5)
        L13:
            return
    }

    @com.getcapacitor.PluginMethod
    public void requestPermissions(com.getcapacitor.PluginCall r14) {
            r13 = this;
            com.getcapacitor.PluginHandle r0 = r13.handle
            com.getcapacitor.annotation.CapacitorPlugin r0 = r0.getPluginAnnotation()
            if (r0 != 0) goto Ld
            r13.handleLegacyPermission(r14)
            goto Le8
        Ld:
            r1 = 0
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r3 = "permissions"
            com.getcapacitor.JSArray r3 = r14.getArray(r3)
            r4 = 0
            if (r3 == 0) goto L23
            java.util.List r5 = r3.toList()     // Catch: org.json.JSONException -> L22
            r4 = r5
            goto L23
        L22:
            r5 = move-exception
        L23:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L66
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L32
            goto L66
        L32:
            com.getcapacitor.annotation.Permission[] r7 = r0.permissions()
            int r8 = r7.length
            r9 = r6
        L38:
            if (r9 >= r8) goto L50
            r10 = r7[r9]
            java.lang.String r11 = r10.alias()
            boolean r11 = r4.contains(r11)
            if (r11 == 0) goto L4d
            java.lang.String r11 = r10.alias()
            r5.add(r11)
        L4d:
            int r9 = r9 + 1
            goto L38
        L50:
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L5c
            java.lang.String r6 = "No valid permission alias was requested of this plugin."
            r14.reject(r6)
            goto Lb1
        L5c:
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r5.toArray(r6)
            r1 = r6
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto Lb1
        L66:
            com.getcapacitor.annotation.Permission[] r7 = r0.permissions()
            int r8 = r7.length
            r9 = r6
        L6c:
            if (r9 >= r8) goto La8
            r10 = r7[r9]
            java.lang.String[] r11 = r10.strings()
            int r11 = r11.length
            if (r11 == 0) goto L94
            java.lang.String[] r11 = r10.strings()
            int r11 = r11.length
            r12 = 1
            if (r11 != r12) goto L8c
            java.lang.String[] r11 = r10.strings()
            r11 = r11[r6]
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L8c
            goto L94
        L8c:
            java.lang.String r11 = r10.alias()
            r5.add(r11)
            goto La5
        L94:
            java.lang.String r11 = r10.alias()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto La5
            java.lang.String r11 = r10.alias()
            r2.add(r11)
        La5:
            int r9 = r9 + 1
            goto L6c
        La8:
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r5.toArray(r6)
            r1 = r6
            java.lang.String[] r1 = (java.lang.String[]) r1
        Lb1:
            if (r1 == 0) goto Lbc
            int r6 = r1.length
            if (r6 <= 0) goto Lbc
            java.lang.String r6 = "checkPermissions"
            r13.requestPermissionForAliases(r1, r14, r6)
            goto Le8
        Lbc:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto Le5
            com.getcapacitor.JSObject r6 = new com.getcapacitor.JSObject
            r6.<init>()
            java.util.Iterator r7 = r2.iterator()
        Lcb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Le1
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            com.getcapacitor.PermissionState r9 = com.getcapacitor.PermissionState.GRANTED
            java.lang.String r9 = r9.toString()
            r6.put(r8, r9)
            goto Lcb
        Le1:
            r14.resolve(r6)
            goto Le8
        Le5:
            r14.resolve()
        Le8:
            return
    }

    protected void restoreState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void saveCall(com.getcapacitor.PluginCall r1) {
            r0 = this;
            r0.savedLastCall = r1
            return
    }

    protected android.os.Bundle saveInstanceState() {
            r5 = this;
            com.getcapacitor.Bridge r0 = r5.bridge
            java.lang.String r1 = r5.lastPluginCallId
            com.getcapacitor.PluginCall r0 = r0.getSavedCall(r1)
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.getcapacitor.JSObject r2 = r0.getData()
            if (r2 == 0) goto L20
            java.lang.String r3 = "_json"
            java.lang.String r4 = r2.toString()
            r1.putString(r3, r4)
        L20:
            return r1
    }

    public void setBridge(com.getcapacitor.Bridge r1) {
            r0 = this;
            r0.bridge = r1
            return
    }

    public void setPluginHandle(com.getcapacitor.PluginHandle r1) {
            r0 = this;
            r0.handle = r1
            return
    }

    public java.lang.Boolean shouldOverrideLoad(android.net.Uri r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    protected void startActivityForResult(com.getcapacitor.PluginCall r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.startActivityForPluginWithResult(r2, r3, r4)
            return
    }

    public void startActivityForResult(com.getcapacitor.PluginCall r3, android.content.Intent r4, java.lang.String r5) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher r0 = r2.getActivityLauncherOrReject(r3, r5)
            if (r0 != 0) goto L7
            return
        L7:
            com.getcapacitor.Bridge r1 = r2.bridge
            r1.setPluginCallForLastActivity(r3)
            java.lang.String r1 = r3.getCallbackId()
            r2.lastPluginCallId = r1
            com.getcapacitor.Bridge r1 = r2.bridge
            r1.saveCall(r3)
            r0.launch(r4)
            return
    }
}
