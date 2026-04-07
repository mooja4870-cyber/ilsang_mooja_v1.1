package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public enum PermissionState extends java.lang.Enum<com.getcapacitor.PermissionState> {
    private static final /* synthetic */ com.getcapacitor.PermissionState[] $VALUES = null;
    public static final com.getcapacitor.PermissionState DENIED = null;
    public static final com.getcapacitor.PermissionState GRANTED = null;
    public static final com.getcapacitor.PermissionState PROMPT = null;
    public static final com.getcapacitor.PermissionState PROMPT_WITH_RATIONALE = null;
    private java.lang.String state;

    private static /* synthetic */ com.getcapacitor.PermissionState[] $values() {
            com.getcapacitor.PermissionState r0 = com.getcapacitor.PermissionState.GRANTED
            com.getcapacitor.PermissionState r1 = com.getcapacitor.PermissionState.DENIED
            com.getcapacitor.PermissionState r2 = com.getcapacitor.PermissionState.PROMPT
            com.getcapacitor.PermissionState r3 = com.getcapacitor.PermissionState.PROMPT_WITH_RATIONALE
            com.getcapacitor.PermissionState[] r0 = new com.getcapacitor.PermissionState[]{r0, r1, r2, r3}
            return r0
    }

    static {
            com.getcapacitor.PermissionState r0 = new com.getcapacitor.PermissionState
            r1 = 0
            java.lang.String r2 = "granted"
            java.lang.String r3 = "GRANTED"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.PermissionState.GRANTED = r0
            com.getcapacitor.PermissionState r0 = new com.getcapacitor.PermissionState
            r1 = 1
            java.lang.String r2 = "denied"
            java.lang.String r3 = "DENIED"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.PermissionState.DENIED = r0
            com.getcapacitor.PermissionState r0 = new com.getcapacitor.PermissionState
            r1 = 2
            java.lang.String r2 = "prompt"
            java.lang.String r3 = "PROMPT"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.PermissionState.PROMPT = r0
            com.getcapacitor.PermissionState r0 = new com.getcapacitor.PermissionState
            r1 = 3
            java.lang.String r2 = "prompt-with-rationale"
            java.lang.String r3 = "PROMPT_WITH_RATIONALE"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.PermissionState.PROMPT_WITH_RATIONALE = r0
            com.getcapacitor.PermissionState[] r0 = $values()
            com.getcapacitor.PermissionState.$VALUES = r0
            return
    }

    PermissionState(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.state = r3
            return
    }

    public static com.getcapacitor.PermissionState byState(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toUpperCase(r0)
            r1 = 45
            r2 = 95
            java.lang.String r3 = r0.replace(r1, r2)
            com.getcapacitor.PermissionState r0 = valueOf(r3)
            return r0
    }

    public static com.getcapacitor.PermissionState valueOf(java.lang.String r1) {
            java.lang.Class<com.getcapacitor.PermissionState> r0 = com.getcapacitor.PermissionState.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.getcapacitor.PermissionState r0 = (com.getcapacitor.PermissionState) r0
            return r0
    }

    public static com.getcapacitor.PermissionState[] values() {
            com.getcapacitor.PermissionState[] r0 = com.getcapacitor.PermissionState.$VALUES
            java.lang.Object r0 = r0.clone()
            com.getcapacitor.PermissionState[] r0 = (com.getcapacitor.PermissionState[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }
}
