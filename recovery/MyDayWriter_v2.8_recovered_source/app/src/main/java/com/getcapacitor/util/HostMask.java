package com.getcapacitor.util;

/* JADX INFO: loaded from: classes2.dex */
public interface HostMask {

    public static class Any implements com.getcapacitor.util.HostMask {
        private final java.util.List<? extends com.getcapacitor.util.HostMask> masks;

        Any(java.util.List<? extends com.getcapacitor.util.HostMask> r1) {
                r0 = this;
                r0.<init>()
                r0.masks = r1
                return
        }

        static com.getcapacitor.util.HostMask.Any parse(java.lang.String... r5) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r5.length
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r5[r2]
                com.getcapacitor.util.HostMask$Simple r4 = com.getcapacitor.util.HostMask.Simple.parse(r3)
                r0.add(r4)
                int r2 = r2 + 1
                goto L7
            L15:
                com.getcapacitor.util.HostMask$Any r1 = new com.getcapacitor.util.HostMask$Any
                r1.<init>(r0)
                return r1
        }

        @Override // com.getcapacitor.util.HostMask
        public boolean matches(java.lang.String r4) {
                r3 = this;
                java.util.List<? extends com.getcapacitor.util.HostMask> r0 = r3.masks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                com.getcapacitor.util.HostMask r1 = (com.getcapacitor.util.HostMask) r1
                boolean r2 = r1.matches(r4)
                if (r2 == 0) goto L1a
                r0 = 1
                return r0
            L1a:
                goto L6
            L1b:
                r0 = 0
                return r0
        }
    }

    public static class Nothing implements com.getcapacitor.util.HostMask {
        public Nothing() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.getcapacitor.util.HostMask
        public boolean matches(java.lang.String r2) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class Parser {
        private static com.getcapacitor.util.HostMask NOTHING;

        static {
                com.getcapacitor.util.HostMask$Nothing r0 = new com.getcapacitor.util.HostMask$Nothing
                r0.<init>()
                com.getcapacitor.util.HostMask.Parser.NOTHING = r0
                return
        }

        public Parser() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.getcapacitor.util.HostMask parse(java.lang.String r1) {
                if (r1 != 0) goto L5
                com.getcapacitor.util.HostMask r0 = com.getcapacitor.util.HostMask.Parser.NOTHING
                goto L9
            L5:
                com.getcapacitor.util.HostMask$Simple r0 = com.getcapacitor.util.HostMask.Simple.parse(r1)
            L9:
                return r0
        }

        public static com.getcapacitor.util.HostMask parse(java.lang.String[] r1) {
                if (r1 != 0) goto L5
                com.getcapacitor.util.HostMask r0 = com.getcapacitor.util.HostMask.Parser.NOTHING
                goto L9
            L5:
                com.getcapacitor.util.HostMask$Any r0 = com.getcapacitor.util.HostMask.Any.parse(r1)
            L9:
                return r0
        }
    }

    public static class Simple implements com.getcapacitor.util.HostMask {
        private final java.util.List<java.lang.String> maskParts;

        private Simple(java.util.List<java.lang.String> r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L8
                r2.maskParts = r3
                return
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Mask parts can not be null"
                r0.<init>(r1)
                throw r0
        }

        static com.getcapacitor.util.HostMask.Simple parse(java.lang.String r2) {
                java.util.List r0 = com.getcapacitor.util.HostMask.Util.splitAndReverse(r2)
                com.getcapacitor.util.HostMask$Simple r1 = new com.getcapacitor.util.HostMask$Simple
                r1.<init>(r0)
                return r1
        }

        @Override // com.getcapacitor.util.HostMask
        public boolean matches(java.lang.String r11) {
                r10 = this;
                r0 = 0
                if (r11 != 0) goto L4
                return r0
            L4:
                java.util.List r1 = com.getcapacitor.util.HostMask.Util.splitAndReverse(r11)
                int r2 = r1.size()
                java.util.List<java.lang.String> r3 = r10.maskParts
                int r3 = r3.size()
                r4 = 1
                if (r3 <= r4) goto L18
                if (r2 == r3) goto L18
                return r0
            L18:
                int r5 = java.lang.Math.min(r2, r3)
                r6 = 0
            L1d:
                if (r6 >= r5) goto L37
                java.util.List<java.lang.String> r7 = r10.maskParts
                java.lang.Object r7 = r7.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r1.get(r6)
                java.lang.String r8 = (java.lang.String) r8
                boolean r9 = com.getcapacitor.util.HostMask.Util.matches(r7, r8)
                if (r9 != 0) goto L34
                return r0
            L34:
                int r6 = r6 + 1
                goto L1d
            L37:
                return r4
        }
    }

    public static class Util {
        public Util() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean matches(java.lang.String r2, java.lang.String r3) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                java.lang.String r1 = "*"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto Le
                r0 = 1
                return r0
            Le:
                if (r3 != 0) goto L11
                return r0
            L11:
                java.lang.String r0 = r2.toUpperCase()
                java.lang.String r1 = r3.toUpperCase()
                boolean r0 = r0.equals(r1)
                return r0
        }

        static java.util.List<java.lang.String> splitAndReverse(java.lang.String r2) {
                if (r2 == 0) goto L10
                java.lang.String r0 = "\\."
                java.lang.String[] r0 = r2.split(r0)
                java.util.List r0 = java.util.Arrays.asList(r0)
                java.util.Collections.reverse(r0)
                return r0
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can not split null argument"
                r0.<init>(r1)
                throw r0
        }
    }

    boolean matches(java.lang.String r1);
}
