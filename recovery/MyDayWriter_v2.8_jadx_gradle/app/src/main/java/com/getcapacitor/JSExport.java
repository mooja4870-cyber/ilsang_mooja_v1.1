package com.getcapacitor;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class JSExport {
    private static String CATCHALL_OPTIONS_PARAM = "_options";
    private static String CALLBACK_PARAM = "_callback";

    public static String getGlobalJS(Context context, boolean loggingEnabled, boolean isDebug) {
        return "window.Capacitor = { DEBUG: " + isDebug + ", isLoggingEnabled: " + loggingEnabled + ", Plugins: {} };";
    }

    public static String getMiscFileJS(ArrayList<String> paths, Context context) {
        List<String> lines = new ArrayList<>();
        for (String path : paths) {
            try {
                String fileContent = FileUtils.readFileFromAssets(context.getAssets(), "public/" + path);
                lines.add(fileContent);
            } catch (IOException e) {
                Logger.error("Unable to read public/" + path);
            }
        }
        return TextUtils.join("\n", lines);
    }

    public static String getCordovaJS(Context context) {
        try {
            String fileContent = FileUtils.readFileFromAssets(context.getAssets(), "public/cordova.js");
            return fileContent;
        } catch (IOException e) {
            Logger.error("Unable to read public/cordova.js file, Cordova plugins will not work");
            return "";
        }
    }

    public static String getCordovaPluginsFileJS(Context context) {
        try {
            String fileContent = FileUtils.readFileFromAssets(context.getAssets(), "public/cordova_plugins.js");
            return fileContent;
        } catch (IOException e) {
            Logger.error("Unable to read public/cordova_plugins.js file, Cordova plugins will not work");
            return "";
        }
    }

    public static String getPluginJS(Collection<PluginHandle> plugins) {
        List<String> lines = new ArrayList<>();
        JSONArray pluginArray = new JSONArray();
        lines.add("// Begin: Capacitor Plugin JS");
        for (PluginHandle plugin : plugins) {
            lines.add("(function(w) {\nvar a = (w.Capacitor = w.Capacitor || {});\nvar p = (a.Plugins = a.Plugins || {});\nvar t = (p['" + plugin.getId() + "'] = {});\nt.addListener = function(eventName, callback) {\n  return w.Capacitor.addListener('" + plugin.getId() + "', eventName, callback);\n}");
            Collection<PluginMethodHandle> methods = plugin.getMethods();
            for (PluginMethodHandle method : methods) {
                if (!method.getName().equals("addListener") && !method.getName().equals("removeListener")) {
                    lines.add(generateMethodJS(plugin, method));
                }
            }
            lines.add("})(window);\n");
            pluginArray.put(createPluginHeader(plugin));
        }
        return TextUtils.join("\n", lines) + "\nwindow.Capacitor.PluginHeaders = " + pluginArray.toString() + ";";
    }

    public static String getCordovaPluginJS(Context context) {
        return getFilesContent(context, "public/plugins");
    }

    public static String getFilesContent(Context context, String path) {
        String[] content;
        StringBuilder builder = new StringBuilder();
        try {
            content = context.getAssets().list(path);
        } catch (IOException e) {
            Logger.warn("Unable to read file at path " + path);
        }
        if (content.length > 0) {
            for (String file : content) {
                if (!file.endsWith(".map")) {
                    builder.append(getFilesContent(context, path + "/" + file));
                }
            }
            return builder.toString();
        }
        return FileUtils.readFileFromAssets(context.getAssets(), path);
    }

    private static JSONObject createPluginHeader(PluginHandle plugin) {
        JSONObject pluginObj = new JSONObject();
        Collection<PluginMethodHandle> methods = plugin.getMethods();
        try {
            String id = plugin.getId();
            JSONArray methodArray = new JSONArray();
            pluginObj.put("name", id);
            for (PluginMethodHandle method : methods) {
                methodArray.put(createPluginMethodHeader(method));
            }
            pluginObj.put("methods", methodArray);
        } catch (JSONException e) {
        }
        return pluginObj;
    }

    private static JSONObject createPluginMethodHeader(PluginMethodHandle method) {
        JSONObject methodObj = new JSONObject();
        try {
            methodObj.put("name", method.getName());
            if (!method.getReturnType().equals(PluginMethod.RETURN_NONE)) {
                methodObj.put("rtype", method.getReturnType());
            }
        } catch (JSONException e) {
        }
        return methodObj;
    }

    public static String getBridgeJS(Context context) throws JSExportException {
        return getFilesContent(context, "native-bridge.js");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String generateMethodJS(com.getcapacitor.PluginHandle r9, com.getcapacitor.PluginMethodHandle r10) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.JSExport.generateMethodJS(com.getcapacitor.PluginHandle, com.getcapacitor.PluginMethodHandle):java.lang.String");
    }
}
