package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class PluginResult {
    public static final int MESSAGE_TYPE_ARRAYBUFFER = 6;
    public static final int MESSAGE_TYPE_BINARYSTRING = 7;
    public static final int MESSAGE_TYPE_BOOLEAN = 4;
    public static final int MESSAGE_TYPE_JSON = 2;
    public static final int MESSAGE_TYPE_MULTIPART = 8;
    public static final int MESSAGE_TYPE_NULL = 5;
    public static final int MESSAGE_TYPE_NUMBER = 3;
    public static final int MESSAGE_TYPE_STRING = 1;
    public static java.lang.String[] StatusMessages;
    private java.lang.String encodedMessage;
    private boolean keepCallback;
    private final int messageType;
    private java.util.List<org.apache.cordova.PluginResult> multipartMessages;
    private final int status;
    private java.lang.String strMessage;

    public enum Status extends java.lang.Enum<org.apache.cordova.PluginResult.Status> {
        private static final /* synthetic */ org.apache.cordova.PluginResult.Status[] $VALUES = null;
        public static final org.apache.cordova.PluginResult.Status CLASS_NOT_FOUND_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status ERROR = null;
        public static final org.apache.cordova.PluginResult.Status ILLEGAL_ACCESS_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status INSTANTIATION_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status INVALID_ACTION = null;
        public static final org.apache.cordova.PluginResult.Status IO_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status JSON_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status MALFORMED_URL_EXCEPTION = null;
        public static final org.apache.cordova.PluginResult.Status NO_RESULT = null;
        public static final org.apache.cordova.PluginResult.Status OK = null;

        private static /* synthetic */ org.apache.cordova.PluginResult.Status[] $values() {
                org.apache.cordova.PluginResult$Status r0 = org.apache.cordova.PluginResult.Status.NO_RESULT
                org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
                org.apache.cordova.PluginResult$Status r2 = org.apache.cordova.PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION
                org.apache.cordova.PluginResult$Status r3 = org.apache.cordova.PluginResult.Status.ILLEGAL_ACCESS_EXCEPTION
                org.apache.cordova.PluginResult$Status r4 = org.apache.cordova.PluginResult.Status.INSTANTIATION_EXCEPTION
                org.apache.cordova.PluginResult$Status r5 = org.apache.cordova.PluginResult.Status.MALFORMED_URL_EXCEPTION
                org.apache.cordova.PluginResult$Status r6 = org.apache.cordova.PluginResult.Status.IO_EXCEPTION
                org.apache.cordova.PluginResult$Status r7 = org.apache.cordova.PluginResult.Status.INVALID_ACTION
                org.apache.cordova.PluginResult$Status r8 = org.apache.cordova.PluginResult.Status.JSON_EXCEPTION
                org.apache.cordova.PluginResult$Status r9 = org.apache.cordova.PluginResult.Status.ERROR
                org.apache.cordova.PluginResult$Status[] r0 = new org.apache.cordova.PluginResult.Status[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
                return r0
        }

        static {
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "NO_RESULT"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.NO_RESULT = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "OK"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.OK = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "CLASS_NOT_FOUND_EXCEPTION"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "ILLEGAL_ACCESS_EXCEPTION"
                r2 = 3
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.ILLEGAL_ACCESS_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "INSTANTIATION_EXCEPTION"
                r2 = 4
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.INSTANTIATION_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "MALFORMED_URL_EXCEPTION"
                r2 = 5
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.MALFORMED_URL_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "IO_EXCEPTION"
                r2 = 6
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.IO_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "INVALID_ACTION"
                r2 = 7
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.INVALID_ACTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "JSON_EXCEPTION"
                r2 = 8
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.JSON_EXCEPTION = r0
                org.apache.cordova.PluginResult$Status r0 = new org.apache.cordova.PluginResult$Status
                java.lang.String r1 = "ERROR"
                r2 = 9
                r0.<init>(r1, r2)
                org.apache.cordova.PluginResult.Status.ERROR = r0
                org.apache.cordova.PluginResult$Status[] r0 = $values()
                org.apache.cordova.PluginResult.Status.$VALUES = r0
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.cordova.PluginResult.Status valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.cordova.PluginResult$Status> r0 = org.apache.cordova.PluginResult.Status.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.apache.cordova.PluginResult$Status r0 = (org.apache.cordova.PluginResult.Status) r0
                return r0
        }

        public static org.apache.cordova.PluginResult.Status[] values() {
                org.apache.cordova.PluginResult$Status[] r0 = org.apache.cordova.PluginResult.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.cordova.PluginResult$Status[] r0 = (org.apache.cordova.PluginResult.Status[]) r0
                return r0
        }
    }

    static {
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "No result"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "OK"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "Class not found"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "Illegal access"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "Instantiation error"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "Malformed url"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "IO error"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "Invalid action"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "JSON error"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "Error"
            r0[r1] = r2
            org.apache.cordova.PluginResult.StatusMessages = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r3) {
            r2 = this;
            java.lang.String[] r0 = org.apache.cordova.PluginResult.StatusMessages
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r2.<init>(r3, r0)
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.keepCallback = r0
            int r0 = r3.ordinal()
            r2.status = r0
            r0 = 3
            r2.messageType = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.encodedMessage = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.keepCallback = r0
            int r0 = r3.ordinal()
            r2.status = r0
            r0 = 3
            r2.messageType = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.encodedMessage = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            if (r3 != 0) goto L10
            r0 = 5
            goto L11
        L10:
            r0 = 1
        L11:
            r1.messageType = r0
            r1.strMessage = r3
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, java.util.List<org.apache.cordova.PluginResult> r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            r0 = 8
            r1.messageType = r0
            r1.multipartMessages = r3
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, org.json.JSONArray r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            r0 = 2
            r1.messageType = r0
            java.lang.String r0 = r3.toString()
            r1.encodedMessage = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, org.json.JSONObject r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            r0 = 2
            r1.messageType = r0
            java.lang.String r0 = r3.toString()
            r1.encodedMessage = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            r0 = 4
            r1.messageType = r0
            java.lang.String r0 = java.lang.Boolean.toString(r3)
            r1.encodedMessage = r0
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PluginResult(org.apache.cordova.PluginResult.Status r2, byte[] r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepCallback = r0
            int r0 = r2.ordinal()
            r1.status = r0
            if (r4 == 0) goto L10
            r0 = 7
            goto L11
        L10:
            r0 = 6
        L11:
            r1.messageType = r0
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r0)
            r1.encodedMessage = r0
            return
    }

    @java.lang.Deprecated
    public java.lang.String getJSONString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"status\":"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.status
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",\"message\":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",\"keepCallback\":"
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.keepCallback
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean getKeepCallback() {
            r1 = this;
            boolean r0 = r1.keepCallback
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.encodedMessage
            if (r0 != 0) goto Lc
            java.lang.String r0 = r1.strMessage
            java.lang.String r0 = org.json.JSONObject.quote(r0)
            r1.encodedMessage = r0
        Lc:
            java.lang.String r0 = r1.encodedMessage
            return r0
    }

    public int getMessageType() {
            r1 = this;
            int r0 = r1.messageType
            return r0
    }

    public org.apache.cordova.PluginResult getMultipartMessage(int r2) {
            r1 = this;
            java.util.List<org.apache.cordova.PluginResult> r0 = r1.multipartMessages
            java.lang.Object r0 = r0.get(r2)
            org.apache.cordova.PluginResult r0 = (org.apache.cordova.PluginResult) r0
            return r0
    }

    public int getMultipartMessagesSize() {
            r1 = this;
            java.util.List<org.apache.cordova.PluginResult> r0 = r1.multipartMessages
            int r0 = r0.size()
            return r0
    }

    public int getStatus() {
            r1 = this;
            int r0 = r1.status
            return r0
    }

    public java.lang.String getStrMessage() {
            r1 = this;
            java.lang.String r0 = r1.strMessage
            return r0
    }

    public void setKeepCallback(boolean r1) {
            r0 = this;
            r0.keepCallback = r1
            return
    }

    @java.lang.Deprecated
    public java.lang.String toCallbackString(java.lang.String r3) {
            r2 = this;
            int r0 = r2.status
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.NO_RESULT
            int r1 = r1.ordinal()
            if (r0 != r1) goto L10
            boolean r0 = r2.keepCallback
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            int r0 = r2.status
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            int r1 = r1.ordinal()
            if (r0 == r1) goto L2a
            int r0 = r2.status
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.NO_RESULT
            int r1 = r1.ordinal()
            if (r0 != r1) goto L25
            goto L2a
        L25:
            java.lang.String r0 = r2.toErrorCallbackString(r3)
            return r0
        L2a:
            java.lang.String r0 = r2.toSuccessCallbackString(r3)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String toErrorCallbackString(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cordova.callbackError('"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "', "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getJSONString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ");"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String toSuccessCallbackString(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cordova.callbackSuccess('"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "',"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getJSONString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ");"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
