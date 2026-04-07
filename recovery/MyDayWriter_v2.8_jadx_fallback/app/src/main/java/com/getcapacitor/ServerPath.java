package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class ServerPath {
    private final java.lang.String path;
    private final com.getcapacitor.ServerPath.PathType type;

    public enum PathType extends java.lang.Enum<com.getcapacitor.ServerPath.PathType> {
        private static final /* synthetic */ com.getcapacitor.ServerPath.PathType[] $VALUES = null;
        public static final com.getcapacitor.ServerPath.PathType ASSET_PATH = null;
        public static final com.getcapacitor.ServerPath.PathType BASE_PATH = null;

        private static /* synthetic */ com.getcapacitor.ServerPath.PathType[] $values() {
                com.getcapacitor.ServerPath$PathType r0 = com.getcapacitor.ServerPath.PathType.BASE_PATH
                com.getcapacitor.ServerPath$PathType r1 = com.getcapacitor.ServerPath.PathType.ASSET_PATH
                com.getcapacitor.ServerPath$PathType[] r0 = new com.getcapacitor.ServerPath.PathType[]{r0, r1}
                return r0
        }

        static {
                com.getcapacitor.ServerPath$PathType r0 = new com.getcapacitor.ServerPath$PathType
                java.lang.String r1 = "BASE_PATH"
                r2 = 0
                r0.<init>(r1, r2)
                com.getcapacitor.ServerPath.PathType.BASE_PATH = r0
                com.getcapacitor.ServerPath$PathType r0 = new com.getcapacitor.ServerPath$PathType
                java.lang.String r1 = "ASSET_PATH"
                r2 = 1
                r0.<init>(r1, r2)
                com.getcapacitor.ServerPath.PathType.ASSET_PATH = r0
                com.getcapacitor.ServerPath$PathType[] r0 = $values()
                com.getcapacitor.ServerPath.PathType.$VALUES = r0
                return
        }

        PathType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.getcapacitor.ServerPath.PathType valueOf(java.lang.String r1) {
                java.lang.Class<com.getcapacitor.ServerPath$PathType> r0 = com.getcapacitor.ServerPath.PathType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.getcapacitor.ServerPath$PathType r0 = (com.getcapacitor.ServerPath.PathType) r0
                return r0
        }

        public static com.getcapacitor.ServerPath.PathType[] values() {
                com.getcapacitor.ServerPath$PathType[] r0 = com.getcapacitor.ServerPath.PathType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.getcapacitor.ServerPath$PathType[] r0 = (com.getcapacitor.ServerPath.PathType[]) r0
                return r0
        }
    }

    public ServerPath(com.getcapacitor.ServerPath.PathType r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.path = r2
            return
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public com.getcapacitor.ServerPath.PathType getType() {
            r1 = this;
            com.getcapacitor.ServerPath$PathType r0 = r1.type
            return r0
    }
}
