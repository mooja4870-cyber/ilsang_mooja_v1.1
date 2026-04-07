package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginHandle {
    private final com.getcapacitor.Bridge bridge;
    private com.getcapacitor.Plugin instance;
    private com.getcapacitor.NativePlugin legacyPluginAnnotation;
    private com.getcapacitor.annotation.CapacitorPlugin pluginAnnotation;
    private final java.lang.Class<? extends com.getcapacitor.Plugin> pluginClass;
    private final java.lang.String pluginId;
    private final java.util.Map<java.lang.String, com.getcapacitor.PluginMethodHandle> pluginMethods;

    public PluginHandle(com.getcapacitor.Bridge r2, com.getcapacitor.Plugin r3) throws com.getcapacitor.InvalidPluginException {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            r1.<init>(r0, r2)
            r1.loadInstance(r3)
            return
    }

    public PluginHandle(com.getcapacitor.Bridge r1, java.lang.Class<? extends com.getcapacitor.Plugin> r2) throws com.getcapacitor.InvalidPluginException, com.getcapacitor.PluginLoadException {
            r0 = this;
            r0.<init>(r2, r1)
            r0.load()
            return
    }

    private PluginHandle(java.lang.Class<? extends com.getcapacitor.Plugin> r6, com.getcapacitor.Bridge r7) throws com.getcapacitor.InvalidPluginException {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.pluginMethods = r0
            r5.bridge = r7
            r5.pluginClass = r6
            java.lang.Class<? extends com.getcapacitor.Plugin> r0 = r5.pluginClass
            java.lang.Class<com.getcapacitor.annotation.CapacitorPlugin> r1 = com.getcapacitor.annotation.CapacitorPlugin.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.getcapacitor.annotation.CapacitorPlugin r0 = (com.getcapacitor.annotation.CapacitorPlugin) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L63
            java.lang.Class<? extends com.getcapacitor.Plugin> r2 = r5.pluginClass
            java.lang.Class<com.getcapacitor.NativePlugin> r3 = com.getcapacitor.NativePlugin.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r3)
            com.getcapacitor.NativePlugin r2 = (com.getcapacitor.NativePlugin) r2
            if (r2 == 0) goto L44
            java.lang.String r3 = r2.name()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L39
            java.lang.String r1 = r2.name()
            r5.pluginId = r1
            goto L41
        L39:
            java.lang.Class<? extends com.getcapacitor.Plugin> r1 = r5.pluginClass
            java.lang.String r1 = r1.getSimpleName()
            r5.pluginId = r1
        L41:
            r5.legacyPluginAnnotation = r2
            goto L7e
        L44:
            com.getcapacitor.InvalidPluginException r1 = new com.getcapacitor.InvalidPluginException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No @CapacitorPlugin annotation found for plugin "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Class<? extends com.getcapacitor.Plugin> r4 = r5.pluginClass
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L63:
            java.lang.String r2 = r0.name()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L74
            java.lang.String r1 = r0.name()
            r5.pluginId = r1
            goto L7c
        L74:
            java.lang.Class<? extends com.getcapacitor.Plugin> r1 = r5.pluginClass
            java.lang.String r1 = r1.getSimpleName()
            r5.pluginId = r1
        L7c:
            r5.pluginAnnotation = r0
        L7e:
            r5.indexMethods(r6)
            return
    }

    private void indexMethods(java.lang.Class<? extends com.getcapacitor.Plugin> r9) {
            r8 = this;
            java.lang.Class<? extends com.getcapacitor.Plugin> r0 = r8.pluginClass
            java.lang.reflect.Method[] r0 = r0.getMethods()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L28
            r3 = r0[r2]
            java.lang.Class<com.getcapacitor.PluginMethod> r4 = com.getcapacitor.PluginMethod.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            com.getcapacitor.PluginMethod r4 = (com.getcapacitor.PluginMethod) r4
            if (r4 != 0) goto L17
            goto L25
        L17:
            com.getcapacitor.PluginMethodHandle r5 = new com.getcapacitor.PluginMethodHandle
            r5.<init>(r3, r4)
            java.util.Map<java.lang.String, com.getcapacitor.PluginMethodHandle> r6 = r8.pluginMethods
            java.lang.String r7 = r3.getName()
            r6.put(r7, r5)
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            return
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.pluginId
            return r0
    }

    public com.getcapacitor.Plugin getInstance() {
            r1 = this;
            com.getcapacitor.Plugin r0 = r1.instance
            return r0
    }

    public com.getcapacitor.NativePlugin getLegacyPluginAnnotation() {
            r1 = this;
            com.getcapacitor.NativePlugin r0 = r1.legacyPluginAnnotation
            return r0
    }

    public java.util.Collection<com.getcapacitor.PluginMethodHandle> getMethods() {
            r1 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginMethodHandle> r0 = r1.pluginMethods
            java.util.Collection r0 = r0.values()
            return r0
    }

    public com.getcapacitor.annotation.CapacitorPlugin getPluginAnnotation() {
            r1 = this;
            com.getcapacitor.annotation.CapacitorPlugin r0 = r1.pluginAnnotation
            return r0
    }

    public java.lang.Class<? extends com.getcapacitor.Plugin> getPluginClass() {
            r1 = this;
            java.lang.Class<? extends com.getcapacitor.Plugin> r0 = r1.pluginClass
            return r0
    }

    public void invoke(java.lang.String r5, com.getcapacitor.PluginCall r6) throws com.getcapacitor.PluginLoadException, com.getcapacitor.InvalidPluginMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r4 = this;
            com.getcapacitor.Plugin r0 = r4.instance
            if (r0 != 0) goto L7
            r4.load()
        L7:
            java.util.Map<java.lang.String, com.getcapacitor.PluginMethodHandle> r0 = r4.pluginMethods
            java.lang.Object r0 = r0.get(r5)
            com.getcapacitor.PluginMethodHandle r0 = (com.getcapacitor.PluginMethodHandle) r0
            if (r0 == 0) goto L1f
            java.lang.reflect.Method r1 = r0.getMethod()
            com.getcapacitor.Plugin r2 = r4.instance
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            r1.invoke(r2, r3)
            return
        L1f:
            com.getcapacitor.InvalidPluginMethodException r1 = new com.getcapacitor.InvalidPluginMethodException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No method "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " found for plugin "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class<? extends com.getcapacitor.Plugin> r3 = r4.pluginClass
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public com.getcapacitor.Plugin load() throws com.getcapacitor.PluginLoadException {
            r3 = this;
            com.getcapacitor.Plugin r0 = r3.instance
            if (r0 == 0) goto L7
            com.getcapacitor.Plugin r0 = r3.instance
            return r0
        L7:
            java.lang.Class<? extends com.getcapacitor.Plugin> r0 = r3.pluginClass     // Catch: java.lang.Exception -> L21
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L21
            com.getcapacitor.Plugin r0 = (com.getcapacitor.Plugin) r0     // Catch: java.lang.Exception -> L21
            r3.instance = r0     // Catch: java.lang.Exception -> L21
            com.getcapacitor.Plugin r0 = r3.instance     // Catch: java.lang.Exception -> L21
            com.getcapacitor.Plugin r0 = r3.loadInstance(r0)     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r0 = move-exception
            com.getcapacitor.PluginLoadException r1 = new com.getcapacitor.PluginLoadException
            java.lang.String r2 = "Unable to load plugin instance. Ensure plugin is publicly accessible"
            r1.<init>(r2)
            throw r1
    }

    public com.getcapacitor.Plugin loadInstance(com.getcapacitor.Plugin r3) {
            r2 = this;
            r2.instance = r3
            com.getcapacitor.Plugin r0 = r2.instance
            r0.setPluginHandle(r2)
            com.getcapacitor.Plugin r0 = r2.instance
            com.getcapacitor.Bridge r1 = r2.bridge
            r0.setBridge(r1)
            com.getcapacitor.Plugin r0 = r2.instance
            r0.load()
            com.getcapacitor.Plugin r0 = r2.instance
            r0.initializeActivityLaunchers()
            com.getcapacitor.Plugin r0 = r2.instance
            return r0
    }
}
