package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public final class DocumentsContractCompat {
    private static final java.lang.String PATH_TREE = "tree";

    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;

        private DocumentCompat() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class DocumentsContractApi21Impl {
        private DocumentsContractApi21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.net.Uri buildChildDocumentsUri(java.lang.String r1, java.lang.String r2) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUri(r1, r2)
                return r0
        }

        static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri r1, java.lang.String r2) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r1, r2)
                return r0
        }

        static android.net.Uri buildDocumentUriUsingTree(android.net.Uri r1, java.lang.String r2) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r2)
                return r0
        }

        public static android.net.Uri buildTreeDocumentUri(java.lang.String r1, java.lang.String r2) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildTreeDocumentUri(r1, r2)
                return r0
        }

        static android.net.Uri createDocument(android.content.ContentResolver r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r1, r2, r3, r4)
                return r0
        }

        static java.lang.String getTreeDocumentId(android.net.Uri r1) {
                java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r1)
                return r0
        }

        static android.net.Uri renameDocument(android.content.ContentResolver r1, android.net.Uri r2, java.lang.String r3) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.renameDocument(r1, r2, r3)
                return r0
        }
    }

    private static class DocumentsContractApi24Impl {
        private DocumentsContractApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isTreeUri(android.net.Uri r1) {
                boolean r0 = android.provider.DocumentsContract.isTreeUri(r1)
                return r0
        }

        static boolean removeDocument(android.content.ContentResolver r1, android.net.Uri r2, android.net.Uri r3) throws java.io.FileNotFoundException {
                boolean r0 = android.provider.DocumentsContract.removeDocument(r1, r2, r3)
                return r0
        }
    }

    private DocumentsContractCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.net.Uri buildChildDocumentsUri(java.lang.String r1, java.lang.String r2) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUri(r1, r2)
            return r0
    }

    public static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri r1, java.lang.String r2) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUriUsingTree(r1, r2)
            return r0
    }

    public static android.net.Uri buildDocumentUri(java.lang.String r1, java.lang.String r2) {
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUri(r1, r2)
            return r0
    }

    public static android.net.Uri buildDocumentUriUsingTree(android.net.Uri r1, java.lang.String r2) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildDocumentUriUsingTree(r1, r2)
            return r0
    }

    public static android.net.Uri buildTreeDocumentUri(java.lang.String r1, java.lang.String r2) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildTreeDocumentUri(r1, r2)
            return r0
    }

    public static android.net.Uri createDocument(android.content.ContentResolver r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4) throws java.io.FileNotFoundException {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.createDocument(r1, r2, r3, r4)
            return r0
    }

    public static java.lang.String getDocumentId(android.net.Uri r1) {
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r1)
            return r0
    }

    public static java.lang.String getTreeDocumentId(android.net.Uri r1) {
            java.lang.String r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.getTreeDocumentId(r1)
            return r0
    }

    public static boolean isDocumentUri(android.content.Context r1, android.net.Uri r2) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r1, r2)
            return r0
    }

    public static boolean isTreeUri(android.net.Uri r1) {
            boolean r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.isTreeUri(r1)
            return r0
    }

    public static boolean removeDocument(android.content.ContentResolver r1, android.net.Uri r2, android.net.Uri r3) throws java.io.FileNotFoundException {
            boolean r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.removeDocument(r1, r2, r3)
            return r0
    }

    public static android.net.Uri renameDocument(android.content.ContentResolver r1, android.net.Uri r2, java.lang.String r3) throws java.io.FileNotFoundException {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.renameDocument(r1, r2, r3)
            return r0
    }
}
