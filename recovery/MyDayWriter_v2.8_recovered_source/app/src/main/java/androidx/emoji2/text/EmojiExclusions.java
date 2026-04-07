package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class EmojiExclusions {

    private static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Set<int[]> getExclusions() {
                java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions()
                return r0
        }
    }

    private static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Set<int[]> getExclusions() {
                java.lang.String r0 = "android.text.EmojiConsistency"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = "getEmojiConsistencySet"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L39
                java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L39
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L39
                r3 = 0
                java.lang.Object r2 = r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> L39
                if (r2 != 0) goto L1d
                java.util.Set r3 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L39
                return r3
            L1d:
                r3 = r2
                java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Throwable -> L39
                java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L39
            L24:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L39
                if (r5 == 0) goto L38
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L39
                boolean r6 = r5 instanceof int[]     // Catch: java.lang.Throwable -> L39
                if (r6 != 0) goto L37
                java.util.Set r4 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L39
                return r4
            L37:
                goto L24
            L38:
                return r3
            L39:
                r0 = move-exception
                java.util.Set r1 = java.util.Collections.emptySet()
                return r1
        }
    }

    private EmojiExclusions() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.Set<int[]> getEmojiExclusions() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Api34.getExclusions()
            return r0
        Lb:
            java.util.Set r0 = androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions()
            return r0
    }
}
