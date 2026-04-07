package kotlin.uuid;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\tH\u0080\b\u001a\r\u0010\n\u001a\u00020\u000b*\u00020\u0001H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\u000bH\u0087\b¨\u0006\r"}, d2 = {"secureRandomUuid", "Lkotlin/uuid/Uuid;", "getUuid", "Ljava/nio/ByteBuffer;", "index", "", "putUuid", "uuid", "reverseBytes", "", "toJavaUuid", "Ljava/util/UUID;", "toKotlinUuid", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidJVMKt {
    public UuidKt__UuidJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final kotlin.uuid.Uuid getUuid(java.nio.ByteBuffer r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.position()
            int r0 = r0 + 15
            int r1 = r7.limit()
            if (r0 >= r1) goto L3a
            long r0 = r7.getLong()
            long r2 = r7.getLong()
            java.nio.ByteOrder r4 = r7.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L33
            r4 = r0
            r6 = 0
            long r4 = java.lang.Long.reverseBytes(r4)
            r0 = r4
            r4 = r2
            r6 = 0
            long r4 = java.lang.Long.reverseBytes(r4)
            r2 = r4
        L33:
            kotlin.uuid.Uuid$Companion r4 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r4 = r4.fromLongs(r0, r2)
            return r4
        L3a:
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r0.<init>()
            throw r0
    }

    public static final kotlin.uuid.Uuid getUuid(java.nio.ByteBuffer r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 < 0) goto L67
            int r0 = r8 + 15
            int r1 = r7.limit()
            if (r0 >= r1) goto L3a
            long r0 = r7.getLong(r8)
            int r2 = r8 + 8
            long r2 = r7.getLong(r2)
            java.nio.ByteOrder r4 = r7.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L33
            r4 = r0
            r6 = 0
            long r4 = java.lang.Long.reverseBytes(r4)
            r0 = r4
            r4 = r2
            r6 = 0
            long r4 = java.lang.Long.reverseBytes(r4)
            r2 = r4
        L33:
            kotlin.uuid.Uuid$Companion r4 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r4 = r4.fromLongs(r0, r2)
            return r4
        L3a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not enough bytes to read a uuid at index: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = ", with limit: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.limit()
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 32
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L67:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative index: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.nio.ByteBuffer putUuid(java.nio.ByteBuffer r9, int r10, kotlin.uuid.Uuid r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            long r0 = r11.getMostSignificantBits()
            long r2 = r11.getLeastSignificantBits()
            r4 = 0
            if (r10 < 0) goto L7c
            int r5 = r10 + 15
            int r6 = r9.limit()
            if (r5 >= r6) goto L4f
            java.nio.ByteOrder r5 = r9.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L33
            r9.putLong(r10, r0)
            int r5 = r10 + 8
            java.nio.ByteBuffer r5 = r9.putLong(r5, r2)
            goto L48
        L33:
            r5 = r0
            r7 = 0
            long r5 = java.lang.Long.reverseBytes(r5)
            r9.putLong(r10, r5)
            int r5 = r10 + 8
            r6 = r2
            r8 = 0
            long r6 = java.lang.Long.reverseBytes(r6)
            java.nio.ByteBuffer r5 = r9.putLong(r5, r6)
        L48:
            java.lang.String r0 = "toLongs(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        L4f:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not enough capacity to write a uuid at index: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r7 = ", with limit: "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r9.limit()
            java.lang.StringBuilder r6 = r6.append(r7)
            r7 = 32
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Negative index: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static final java.nio.ByteBuffer putUuid(java.nio.ByteBuffer r8, kotlin.uuid.Uuid r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r9.getMostSignificantBits()
            long r2 = r9.getLeastSignificantBits()
            r4 = 0
            int r5 = r8.position()
            int r5 = r5 + 15
            int r6 = r8.limit()
            if (r5 >= r6) goto L4d
            java.nio.ByteOrder r5 = r8.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L33
            r8.putLong(r0)
            java.nio.ByteBuffer r5 = r8.putLong(r2)
            goto L46
        L33:
            r5 = r0
            r7 = 0
            long r5 = java.lang.Long.reverseBytes(r5)
            r8.putLong(r5)
            r5 = r2
            r7 = 0
            long r5 = java.lang.Long.reverseBytes(r5)
            java.nio.ByteBuffer r5 = r8.putLong(r5)
        L46:
            java.lang.String r0 = "toLongs(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        L4d:
            java.nio.BufferOverflowException r5 = new java.nio.BufferOverflowException
            r5.<init>()
            throw r5
    }

    public static final long reverseBytes(long r3) {
            r0 = 0
            long r1 = java.lang.Long.reverseBytes(r3)
            return r1
    }

    public static final kotlin.uuid.Uuid secureRandomUuid() {
            r0 = 16
            byte[] r0 = new byte[r0]
            kotlin.uuid.SecureRandomHolder r1 = kotlin.uuid.SecureRandomHolder.INSTANCE
            java.security.SecureRandom r1 = r1.getInstance()
            r1.nextBytes(r0)
            kotlin.uuid.Uuid r1 = kotlin.uuid.UuidKt.uuidFromRandomBytes(r0)
            return r1
    }

    public static final java.util.UUID toJavaUuid(kotlin.uuid.Uuid r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            long r1 = r7.getMostSignificantBits()
            long r3 = r7.getLeastSignificantBits()
            r5 = 0
            java.util.UUID r6 = new java.util.UUID
            r6.<init>(r1, r3)
            return r6
    }

    public static final kotlin.uuid.Uuid toKotlinUuid(java.util.UUID r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            kotlin.uuid.Uuid$Companion r1 = kotlin.uuid.Uuid.Companion
            long r2 = r6.getMostSignificantBits()
            long r4 = r6.getLeastSignificantBits()
            kotlin.uuid.Uuid r1 = r1.fromLongs(r2, r4)
            return r1
    }
}
