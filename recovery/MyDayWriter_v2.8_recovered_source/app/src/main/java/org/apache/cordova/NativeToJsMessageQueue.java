package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class NativeToJsMessageQueue {
    private static int COMBINED_RESPONSE_CUTOFF = 0;
    static final boolean DISABLE_EXEC_CHAINING = false;
    private static final boolean FORCE_ENCODE_USING_EVAL = false;
    private static final java.lang.String LOG_TAG = "JsMessageQueue";
    private org.apache.cordova.NativeToJsMessageQueue.BridgeMode activeBridgeMode;
    private java.util.ArrayList<org.apache.cordova.NativeToJsMessageQueue.BridgeMode> bridgeModes;
    private boolean paused;
    private final java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue.JsMessage> queue;

    public static abstract class BridgeMode {
        public BridgeMode() {
                r0 = this;
                r0.<init>()
                return
        }

        public void notifyOfFlush(org.apache.cordova.NativeToJsMessageQueue r1, boolean r2) {
                r0 = this;
                return
        }

        public abstract void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r1);

        public void reset() {
                r0 = this;
                return
        }
    }

    public static class EvalBridgeMode extends org.apache.cordova.NativeToJsMessageQueue.BridgeMode {
        private final org.apache.cordova.CordovaInterface cordova;
        private final org.apache.cordova.CordovaWebViewEngine engine;


        /* JADX INFO: renamed from: -$$Nest$fgetengine, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.apache.cordova.CordovaWebViewEngine m1738$$Nest$fgetengine(org.apache.cordova.NativeToJsMessageQueue.EvalBridgeMode r0) {
                org.apache.cordova.CordovaWebViewEngine r0 = r0.engine
                return r0
        }

        public EvalBridgeMode(org.apache.cordova.CordovaWebViewEngine r1, org.apache.cordova.CordovaInterface r2) {
                r0 = this;
                r0.<init>()
                r0.engine = r1
                r0.cordova = r2
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r3) {
                r2 = this;
                org.apache.cordova.CordovaInterface r0 = r2.cordova
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode$1 r1 = new org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode$1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    private static class JsMessage {
        final java.lang.String jsPayloadOrCallbackId;
        final org.apache.cordova.PluginResult pluginResult;

        JsMessage(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto Lb
                r1.jsPayloadOrCallbackId = r2
                r0 = 0
                r1.pluginResult = r0
                return
            Lb:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>()
                throw r0
        }

        JsMessage(org.apache.cordova.PluginResult r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                if (r3 == 0) goto Lc
                if (r2 == 0) goto Lc
                r1.jsPayloadOrCallbackId = r3
                r1.pluginResult = r2
                return
            Lc:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>()
                throw r0
        }

        static int calculateEncodedLengthHelper(org.apache.cordova.PluginResult r5) {
                int r0 = r5.getMessageType()
                r1 = 1
                switch(r0) {
                    case 1: goto L50;
                    case 2: goto L8;
                    case 3: goto L46;
                    case 4: goto L45;
                    case 5: goto L45;
                    case 6: goto L3b;
                    case 7: goto L31;
                    case 8: goto L11;
                    default: goto L8;
                }
            L8:
                java.lang.String r0 = r5.getMessage()
                int r0 = r0.length()
                return r0
            L11:
                r0 = 1
                r1 = 0
            L13:
                int r2 = r5.getMultipartMessagesSize()
                if (r1 >= r2) goto L30
                org.apache.cordova.PluginResult r2 = r5.getMultipartMessage(r1)
                int r2 = calculateEncodedLengthHelper(r2)
                java.lang.String r3 = java.lang.String.valueOf(r2)
                int r3 = r3.length()
                int r4 = r3 + 1
                int r4 = r4 + r2
                int r0 = r0 + r4
                int r1 = r1 + 1
                goto L13
            L30:
                return r0
            L31:
                java.lang.String r0 = r5.getMessage()
                int r0 = r0.length()
                int r0 = r0 + r1
                return r0
            L3b:
                java.lang.String r0 = r5.getMessage()
                int r0 = r0.length()
                int r0 = r0 + r1
                return r0
            L45:
                return r1
            L46:
                java.lang.String r0 = r5.getMessage()
                int r0 = r0.length()
                int r0 = r0 + r1
                return r0
            L50:
                java.lang.String r0 = r5.getStrMessage()
                int r0 = r0.length()
                int r0 = r0 + r1
                return r0
        }

        static void encodeAsMessageHelper(java.lang.StringBuilder r3, org.apache.cordova.PluginResult r4) {
                int r0 = r4.getMessageType()
                switch(r0) {
                    case 1: goto L72;
                    case 2: goto L7;
                    case 3: goto L64;
                    case 4: goto L57;
                    case 5: goto L51;
                    case 6: goto L44;
                    case 7: goto L37;
                    case 8: goto L10;
                    default: goto L7;
                }
            L7:
                java.lang.String r0 = r4.getMessage()
                r3.append(r0)
                goto L7f
            L10:
                r0 = 77
                r3.append(r0)
                r0 = 0
            L16:
                int r1 = r4.getMultipartMessagesSize()
                if (r0 >= r1) goto L36
                org.apache.cordova.PluginResult r1 = r4.getMultipartMessage(r0)
                int r2 = calculateEncodedLengthHelper(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r3.append(r2)
                r2 = 32
                r3.append(r2)
                encodeAsMessageHelper(r3, r1)
                int r0 = r0 + 1
                goto L16
            L36:
                goto L7f
            L37:
                r0 = 83
                r3.append(r0)
                java.lang.String r0 = r4.getMessage()
                r3.append(r0)
                goto L7f
            L44:
                r0 = 65
                r3.append(r0)
                java.lang.String r0 = r4.getMessage()
                r3.append(r0)
                goto L7f
            L51:
                r0 = 78
                r3.append(r0)
                goto L7f
            L57:
                java.lang.String r0 = r4.getMessage()
                r1 = 0
                char r0 = r0.charAt(r1)
                r3.append(r0)
                goto L7f
            L64:
                r0 = 110(0x6e, float:1.54E-43)
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.String r1 = r4.getMessage()
                r0.append(r1)
                goto L7f
            L72:
                r0 = 115(0x73, float:1.61E-43)
                r3.append(r0)
                java.lang.String r0 = r4.getStrMessage()
                r3.append(r0)
            L7f:
                return
        }

        void buildJsMessage(java.lang.StringBuilder r6) {
                r5 = this;
                org.apache.cordova.PluginResult r0 = r5.pluginResult
                int r0 = r0.getMessageType()
                java.lang.String r1 = "')"
                switch(r0) {
                    case 5: goto L63;
                    case 6: goto L4f;
                    case 7: goto L3b;
                    case 8: goto L15;
                    default: goto Lb;
                }
            Lb:
                org.apache.cordova.PluginResult r0 = r5.pluginResult
                java.lang.String r0 = r0.getMessage()
                r6.append(r0)
                goto L69
            L15:
                org.apache.cordova.PluginResult r0 = r5.pluginResult
                int r0 = r0.getMultipartMessagesSize()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L3a
                org.apache.cordova.PluginResult r2 = r5.pluginResult
                org.apache.cordova.PluginResult r2 = r2.getMultipartMessage(r1)
                org.apache.cordova.NativeToJsMessageQueue$JsMessage r3 = new org.apache.cordova.NativeToJsMessageQueue$JsMessage
                java.lang.String r4 = r5.jsPayloadOrCallbackId
                r3.<init>(r2, r4)
                r3.buildJsMessage(r6)
                int r4 = r0 + (-1)
                if (r1 >= r4) goto L37
                java.lang.String r4 = ","
                r6.append(r4)
            L37:
                int r1 = r1 + 1
                goto L1c
            L3a:
                goto L69
            L3b:
                java.lang.String r0 = "atob('"
                java.lang.StringBuilder r0 = r6.append(r0)
                org.apache.cordova.PluginResult r2 = r5.pluginResult
                java.lang.String r2 = r2.getMessage()
                java.lang.StringBuilder r0 = r0.append(r2)
                r0.append(r1)
                goto L69
            L4f:
                java.lang.String r0 = "cordova.require('cordova/base64').toArrayBuffer('"
                java.lang.StringBuilder r0 = r6.append(r0)
                org.apache.cordova.PluginResult r2 = r5.pluginResult
                java.lang.String r2 = r2.getMessage()
                java.lang.StringBuilder r0 = r0.append(r2)
                r0.append(r1)
                goto L69
            L63:
                java.lang.String r0 = "null"
                r6.append(r0)
            L69:
                return
        }

        int calculateEncodedLength() {
                r3 = this;
                org.apache.cordova.PluginResult r0 = r3.pluginResult
                if (r0 != 0) goto Ld
                java.lang.String r0 = r3.jsPayloadOrCallbackId
                int r0 = r0.length()
                int r0 = r0 + 1
                return r0
            Ld:
                org.apache.cordova.PluginResult r0 = r3.pluginResult
                int r0 = r0.getStatus()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r0 = r0.length()
                int r1 = r0 + 2
                int r1 = r1 + 1
                java.lang.String r2 = r3.jsPayloadOrCallbackId
                int r2 = r2.length()
                int r1 = r1 + r2
                int r1 = r1 + 1
                org.apache.cordova.PluginResult r2 = r3.pluginResult
                int r2 = calculateEncodedLengthHelper(r2)
                int r2 = r2 + r1
                return r2
        }

        void encodeAsJsMessage(java.lang.StringBuilder r5) {
                r4 = this;
                org.apache.cordova.PluginResult r0 = r4.pluginResult
                if (r0 != 0) goto La
                java.lang.String r0 = r4.jsPayloadOrCallbackId
                r5.append(r0)
                goto L61
            La:
                org.apache.cordova.PluginResult r0 = r4.pluginResult
                int r0 = r0.getStatus()
                org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
                int r1 = r1.ordinal()
                if (r0 == r1) goto L23
                org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.NO_RESULT
                int r1 = r1.ordinal()
                if (r0 != r1) goto L21
                goto L23
            L21:
                r1 = 0
                goto L24
            L23:
                r1 = 1
            L24:
                java.lang.String r2 = "cordova.callbackFromNative('"
                java.lang.StringBuilder r2 = r5.append(r2)
                java.lang.String r3 = r4.jsPayloadOrCallbackId
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "',"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r3 = ","
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r3 = ",["
                r2.append(r3)
                r4.buildJsMessage(r5)
                java.lang.String r2 = "],"
                java.lang.StringBuilder r2 = r5.append(r2)
                org.apache.cordova.PluginResult r3 = r4.pluginResult
                boolean r3 = r3.getKeepCallback()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ");"
                r2.append(r3)
            L61:
                return
        }

        void encodeAsMessage(java.lang.StringBuilder r8) {
                r7 = this;
                org.apache.cordova.PluginResult r0 = r7.pluginResult
                if (r0 != 0) goto L10
                r0 = 74
                java.lang.StringBuilder r0 = r8.append(r0)
                java.lang.String r1 = r7.jsPayloadOrCallbackId
                r0.append(r1)
                return
            L10:
                org.apache.cordova.PluginResult r0 = r7.pluginResult
                int r0 = r0.getStatus()
                org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.NO_RESULT
                int r1 = r1.ordinal()
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L22
                r1 = r2
                goto L23
            L22:
                r1 = r3
            L23:
                org.apache.cordova.PluginResult$Status r4 = org.apache.cordova.PluginResult.Status.OK
                int r4 = r4.ordinal()
                if (r0 != r4) goto L2c
                goto L2d
            L2c:
                r2 = r3
            L2d:
                org.apache.cordova.PluginResult r3 = r7.pluginResult
                boolean r3 = r3.getKeepCallback()
                if (r1 != 0) goto L3b
                if (r2 == 0) goto L38
                goto L3b
            L38:
                r4 = 70
                goto L3d
            L3b:
                r4 = 83
            L3d:
                java.lang.StringBuilder r4 = r8.append(r4)
                if (r3 == 0) goto L46
                r5 = 49
                goto L48
            L46:
                r5 = 48
            L48:
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r0)
                r5 = 32
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r6 = r7.jsPayloadOrCallbackId
                java.lang.StringBuilder r4 = r4.append(r6)
                r4.append(r5)
                org.apache.cordova.PluginResult r4 = r7.pluginResult
                encodeAsMessageHelper(r8, r4)
                return
        }
    }

    public static class LoadUrlBridgeMode extends org.apache.cordova.NativeToJsMessageQueue.BridgeMode {
        private final org.apache.cordova.CordovaInterface cordova;
        private final org.apache.cordova.CordovaWebViewEngine engine;


        /* JADX INFO: renamed from: -$$Nest$fgetengine, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.apache.cordova.CordovaWebViewEngine m1739$$Nest$fgetengine(org.apache.cordova.NativeToJsMessageQueue.LoadUrlBridgeMode r0) {
                org.apache.cordova.CordovaWebViewEngine r0 = r0.engine
                return r0
        }

        public LoadUrlBridgeMode(org.apache.cordova.CordovaWebViewEngine r1, org.apache.cordova.CordovaInterface r2) {
                r0 = this;
                r0.<init>()
                r0.engine = r1
                r0.cordova = r2
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r3) {
                r2 = this;
                org.apache.cordova.CordovaInterface r0 = r2.cordova
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode$1 r1 = new org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode$1
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    public static class NoOpBridgeMode extends org.apache.cordova.NativeToJsMessageQueue.BridgeMode {
        public NoOpBridgeMode() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r1) {
                r0 = this;
                return
        }
    }

    public static class OnlineEventsBridgeMode extends org.apache.cordova.NativeToJsMessageQueue.BridgeMode {
        private final org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode.OnlineEventsBridgeModeDelegate delegate;
        private boolean ignoreNextFlush;
        private boolean online;



        public interface OnlineEventsBridgeModeDelegate {
            void runOnUiThread(java.lang.Runnable r1);

            void setNetworkAvailable(boolean r1);
        }

        /* JADX INFO: renamed from: -$$Nest$fgetdelegate, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode.OnlineEventsBridgeModeDelegate m1740$$Nest$fgetdelegate(org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode r0) {
                org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$OnlineEventsBridgeModeDelegate r0 = r0.delegate
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetonline, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m1741$$Nest$fgetonline(org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode r0) {
                boolean r0 = r0.online
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fputignoreNextFlush, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m1742$$Nest$fputignoreNextFlush(org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode r0, boolean r1) {
                r0.ignoreNextFlush = r1
                return
        }

        /* JADX INFO: renamed from: -$$Nest$fputonline, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m1743$$Nest$fputonline(org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode r0, boolean r1) {
                r0.online = r1
                return
        }

        public OnlineEventsBridgeMode(org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode.OnlineEventsBridgeModeDelegate r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void notifyOfFlush(org.apache.cordova.NativeToJsMessageQueue r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto Lc
                boolean r0 = r1.ignoreNextFlush
                if (r0 != 0) goto Lc
                boolean r0 = r1.online
                r0 = r0 ^ 1
                r1.online = r0
            Lc:
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r3) {
                r2 = this;
                org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$OnlineEventsBridgeModeDelegate r0 = r2.delegate
                org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$2 r1 = new org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$2
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void reset() {
                r2 = this;
                org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$OnlineEventsBridgeModeDelegate r0 = r2.delegate
                org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$1 r1 = new org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode$1
                r1.<init>(r2)
                r0.runOnUiThread(r1)
                return
        }
    }

    static {
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            org.apache.cordova.NativeToJsMessageQueue.COMBINED_RESPONSE_CUTOFF = r0
            return
    }

    public NativeToJsMessageQueue() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.queue = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.bridgeModes = r0
            return
    }

    private int calculatePackedMessageLength(org.apache.cordova.NativeToJsMessageQueue.JsMessage r4) {
            r3 = this;
            int r0 = r4.calculateEncodedLength()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r2 = r1.length()
            int r2 = r2 + r0
            int r2 = r2 + 1
            return r2
    }

    private void enqueueMessage(org.apache.cordova.NativeToJsMessageQueue.JsMessage r3) {
            r2 = this;
            monitor-enter(r2)
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r2.activeBridgeMode     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto Le
            java.lang.String r0 = "JsMessageQueue"
            java.lang.String r1 = "Dropping Native->JS message due to disabled bridge"
            org.apache.cordova.LOG.d(r0, r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        Le:
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r2.queue     // Catch: java.lang.Throwable -> L1e
            r0.add(r3)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2.paused     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r2.activeBridgeMode     // Catch: java.lang.Throwable -> L1e
            r0.onNativeToJsMessageAvailable(r2)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    private void packMessage(org.apache.cordova.NativeToJsMessageQueue.JsMessage r4, java.lang.StringBuilder r5) {
            r3 = this;
            int r0 = r4.calculateEncodedLength()
            java.lang.StringBuilder r1 = r5.append(r0)
            r2 = 32
            r1.append(r2)
            r4.encodeAsMessage(r5)
            return
    }

    public void addBridgeMode(org.apache.cordova.NativeToJsMessageQueue.BridgeMode r2) {
            r1 = this;
            java.util.ArrayList<org.apache.cordova.NativeToJsMessageQueue$BridgeMode> r0 = r1.bridgeModes
            r0.add(r2)
            return
    }

    public void addJavaScript(java.lang.String r2) {
            r1 = this;
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r0 = new org.apache.cordova.NativeToJsMessageQueue$JsMessage
            r0.<init>(r2)
            r1.enqueueMessage(r0)
            return
    }

    public void addPluginResult(org.apache.cordova.PluginResult r4, java.lang.String r5) {
            r3 = this;
            if (r5 != 0) goto Lf
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r1 = "JsMessageQueue"
            java.lang.String r2 = "Got plugin result with no callbackId"
            org.apache.cordova.LOG.e(r1, r2, r0)
            return
        Lf:
            int r0 = r4.getStatus()
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.NO_RESULT
            int r1 = r1.ordinal()
            if (r0 != r1) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            boolean r1 = r4.getKeepCallback()
            if (r0 == 0) goto L27
            if (r1 == 0) goto L27
            return
        L27:
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r2 = new org.apache.cordova.NativeToJsMessageQueue$JsMessage
            r2.<init>(r4, r5)
            r3.enqueueMessage(r2)
            return
    }

    public boolean isBridgeEnabled() {
            r1 = this;
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r1.activeBridgeMode
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r1.queue
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.lang.String popAndEncode(boolean r8) {
            r7 = this;
            monitor-enter(r7)
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r7.activeBridgeMode     // Catch: java.lang.Throwable -> L6a
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            return r1
        L8:
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r7.activeBridgeMode     // Catch: java.lang.Throwable -> L6a
            r0.notifyOfFlush(r7, r8)     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r7.queue     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L17
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            return r1
        L17:
            r0 = 0
            r1 = 0
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r2 = r7.queue     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6a
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r3 = (org.apache.cordova.NativeToJsMessageQueue.JsMessage) r3     // Catch: java.lang.Throwable -> L6a
            int r4 = r7.calculatePackedMessageLength(r3)     // Catch: java.lang.Throwable -> L6a
            if (r1 <= 0) goto L3c
            int r5 = org.apache.cordova.NativeToJsMessageQueue.COMBINED_RESPONSE_CUTOFF     // Catch: java.lang.Throwable -> L6a
            if (r5 <= 0) goto L3c
            int r5 = r0 + r4
            int r6 = org.apache.cordova.NativeToJsMessageQueue.COMBINED_RESPONSE_CUTOFF     // Catch: java.lang.Throwable -> L6a
            if (r5 <= r6) goto L3c
            goto L41
        L3c:
            int r0 = r0 + r4
            int r1 = r1 + 1
            goto L1f
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            r3 = 0
        L47:
            if (r3 >= r1) goto L57
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r4 = r7.queue     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r4 = r4.removeFirst()     // Catch: java.lang.Throwable -> L6a
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r4 = (org.apache.cordova.NativeToJsMessageQueue.JsMessage) r4     // Catch: java.lang.Throwable -> L6a
            r7.packMessage(r4, r2)     // Catch: java.lang.Throwable -> L6a
            int r3 = r3 + 1
            goto L47
        L57:
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r3 = r7.queue     // Catch: java.lang.Throwable -> L6a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L64
            r3 = 42
            r2.append(r3)     // Catch: java.lang.Throwable -> L6a
        L64:
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            return r3
        L6a:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6a
            throw r0
    }

    public java.lang.String popAndEncodeAsJs() {
            r10 = this;
            monitor-enter(r10)
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r10.queue     // Catch: java.lang.Throwable -> L90
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto Lc
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L90
            r1 = 0
            return r1
        Lc:
            r1 = 0
            r2 = 0
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r3 = r10.queue     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L90
        L14:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L90
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r4 = (org.apache.cordova.NativeToJsMessageQueue.JsMessage) r4     // Catch: java.lang.Throwable -> L90
            int r5 = r4.calculateEncodedLength()     // Catch: java.lang.Throwable -> L90
            int r5 = r5 + 50
            if (r2 <= 0) goto L33
            int r6 = org.apache.cordova.NativeToJsMessageQueue.COMBINED_RESPONSE_CUTOFF     // Catch: java.lang.Throwable -> L90
            if (r6 <= 0) goto L33
            int r6 = r1 + r5
            int r7 = org.apache.cordova.NativeToJsMessageQueue.COMBINED_RESPONSE_CUTOFF     // Catch: java.lang.Throwable -> L90
            if (r6 <= r7) goto L33
            goto L38
        L33:
            int r1 = r1 + r5
            int r2 = r2 + 1
            goto L14
        L38:
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r3 = r10.queue     // Catch: java.lang.Throwable -> L90
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L90
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L44
            r3 = r5
            goto L45
        L44:
            r3 = r4
        L45:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L4b
            r7 = r4
            goto L4d
        L4b:
            r7 = 100
        L4d:
            int r7 = r7 + r1
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L90
            r7 = 0
        L52:
            if (r7 >= r2) goto L76
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r8 = r10.queue     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.removeFirst()     // Catch: java.lang.Throwable -> L90
            org.apache.cordova.NativeToJsMessageQueue$JsMessage r8 = (org.apache.cordova.NativeToJsMessageQueue.JsMessage) r8     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L66
            int r9 = r7 + 1
            if (r9 != r2) goto L66
            r8.encodeAsJsMessage(r6)     // Catch: java.lang.Throwable -> L90
            goto L73
        L66:
            java.lang.String r9 = "try{"
            r6.append(r9)     // Catch: java.lang.Throwable -> L90
            r8.encodeAsJsMessage(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r9 = "}finally{"
            r6.append(r9)     // Catch: java.lang.Throwable -> L90
        L73:
            int r7 = r7 + 1
            goto L52
        L76:
            if (r3 != 0) goto L7d
            java.lang.String r7 = "window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);"
            r6.append(r7)     // Catch: java.lang.Throwable -> L90
        L7d:
            if (r3 == 0) goto L80
            r4 = r5
        L80:
            if (r4 >= r2) goto L8a
            r5 = 125(0x7d, float:1.75E-43)
            r6.append(r5)     // Catch: java.lang.Throwable -> L90
            int r4 = r4 + 1
            goto L80
        L8a:
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L90
            return r4
        L90:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L90
            throw r0
    }

    public void reset() {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r1.queue     // Catch: java.lang.Throwable -> Lc
            r0.clear()     // Catch: java.lang.Throwable -> Lc
            r0 = -1
            r1.setBridgeMode(r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void setBridgeMode(int r5) {
            r4 = this;
            r0 = -1
            if (r5 < r0) goto L5d
            java.util.ArrayList<org.apache.cordova.NativeToJsMessageQueue$BridgeMode> r0 = r4.bridgeModes
            int r0 = r0.size()
            if (r5 < r0) goto Lc
            goto L5d
        Lc:
            if (r5 >= 0) goto L10
            r0 = 0
            goto L18
        L10:
            java.util.ArrayList<org.apache.cordova.NativeToJsMessageQueue$BridgeMode> r0 = r4.bridgeModes
            java.lang.Object r0 = r0.get(r5)
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = (org.apache.cordova.NativeToJsMessageQueue.BridgeMode) r0
        L18:
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r1 = r4.activeBridgeMode
            if (r0 == r1) goto L75
            java.lang.String r1 = "JsMessageQueue"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Set native->JS mode to "
            java.lang.StringBuilder r2 = r2.append(r3)
            if (r0 != 0) goto L2e
            java.lang.String r3 = "null"
            goto L36
        L2e:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L36:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            org.apache.cordova.LOG.d(r1, r2)
            monitor-enter(r4)
            r4.activeBridgeMode = r0     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L58
            r0.reset()     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r4.paused     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L58
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r1 = r4.queue     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L58
            r0.onNativeToJsMessageAvailable(r4)     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            goto L75
        L5a:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
            throw r1
        L5d:
            java.lang.String r0 = "JsMessageQueue"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid NativeToJsBridgeMode: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
        L75:
            return
    }

    public void setPaused(boolean r4) {
            r3 = this;
            boolean r0 = r3.paused
            if (r0 == 0) goto L12
            if (r4 == 0) goto L12
            java.lang.String r0 = "JsMessageQueue"
            java.lang.String r1 = "nested call to setPaused detected."
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            org.apache.cordova.LOG.e(r0, r1, r2)
        L12:
            r3.paused = r4
            if (r4 != 0) goto L2d
            monitor-enter(r3)
            java.util.LinkedList<org.apache.cordova.NativeToJsMessageQueue$JsMessage> r0 = r3.queue     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L28
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r3.activeBridgeMode     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L28
            org.apache.cordova.NativeToJsMessageQueue$BridgeMode r0 = r3.activeBridgeMode     // Catch: java.lang.Throwable -> L2a
            r0.onNativeToJsMessageAvailable(r3)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2d:
            return
    }
}
