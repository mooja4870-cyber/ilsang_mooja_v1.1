package androidx.webkit.internal;

import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
class MimeUtil {
    MimeUtil() {
    }

    public static String getMimeFromFileName(String fileName) {
        if (fileName == null) {
            return null;
        }
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        if (mimeType != null) {
            return mimeType;
        }
        return guessHardcodedMime(fileName);
    }

    private static String guessHardcodedMime(String fileName) {
        int finalFullStop = fileName.lastIndexOf(46);
        if (finalFullStop == -1) {
            return null;
        }
        String extension = fileName.substring(finalFullStop + 1).toLowerCase();
        switch (extension) {
        }
        return null;
    }
}
