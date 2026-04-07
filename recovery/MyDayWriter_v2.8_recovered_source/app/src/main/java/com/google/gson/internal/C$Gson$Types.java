package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C$Gson$Types {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type r2) {
                r1 = this;
                r1.<init>()
                java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r2)
                r1.componentType = r0
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Lf
                r0 = r2
                java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
                boolean r0 = com.google.gson.internal.C$Gson$Types.equals(r1, r0)
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.componentType
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "[]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                if (r0 == 0) goto L28
                r0 = r6
                java.lang.Class r0 = (java.lang.Class) r0
                int r1 = r0.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L1f
                java.lang.Class r1 = r0.getEnclosingClass()
                if (r1 != 0) goto L1d
                goto L1f
            L1d:
                r1 = r2
                goto L20
            L1f:
                r1 = r3
            L20:
                if (r5 != 0) goto L24
                if (r1 == 0) goto L25
            L24:
                r2 = r3
            L25:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r2)
            L28:
                if (r5 != 0) goto L2c
                r0 = 0
                goto L30
            L2c:
                java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r5)
            L30:
                r4.ownerType = r0
                java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r6)
                r4.rawType = r0
                java.lang.Object r0 = r7.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                r4.typeArguments = r0
                r0 = 0
                java.lang.reflect.Type[] r1 = r4.typeArguments
                int r1 = r1.length
            L44:
                if (r0 >= r1) goto L63
                java.lang.reflect.Type[] r2 = r4.typeArguments
                r2 = r2[r0]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
                java.lang.reflect.Type[] r2 = r4.typeArguments
                r2 = r2[r0]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r2)
                java.lang.reflect.Type[] r2 = r4.typeArguments
                java.lang.reflect.Type[] r3 = r4.typeArguments
                r3 = r3[r0]
                java.lang.reflect.Type r3 = com.google.gson.internal.C$Gson$Types.canonicalize(r3)
                r2[r0] = r3
                int r0 = r0 + 1
                goto L44
            L63:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Lf
                r0 = r2
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                boolean r0 = com.google.gson.internal.C$Gson$Types.equals(r1, r0)
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.typeArguments
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.ownerType
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.rawType
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.typeArguments
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.rawType
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.ownerType
                int r1 = com.google.gson.internal.C$Gson$Types.hashCodeOrZero(r1)
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.reflect.Type[] r0 = r5.typeArguments
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r1 = r5.rawType
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                return r1
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0 + 1
                int r2 = r2 * 30
                r1.<init>(r2)
                java.lang.reflect.Type r2 = r5.rawType
                java.lang.String r2 = com.google.gson.internal.C$Gson$Types.typeToString(r2)
                java.lang.StringBuilder r2 = r1.append(r2)
                java.lang.String r3 = "<"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.reflect.Type[] r3 = r5.typeArguments
                r4 = 0
                r3 = r3[r4]
                java.lang.String r3 = com.google.gson.internal.C$Gson$Types.typeToString(r3)
                r2.append(r3)
                r2 = 1
            L32:
                if (r2 >= r0) goto L48
                java.lang.String r3 = ", "
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.reflect.Type[] r4 = r5.typeArguments
                r4 = r4[r2]
                java.lang.String r4 = com.google.gson.internal.C$Gson$Types.typeToString(r4)
                r3.append(r4)
                int r2 = r2 + 1
                goto L32
            L48:
                java.lang.String r2 = ">"
                java.lang.StringBuilder r2 = r1.append(r2)
                java.lang.String r2 = r2.toString()
                return r2
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] r5, java.lang.reflect.Type[] r6) {
                r4 = this;
                r4.<init>()
                int r0 = r6.length
                r1 = 0
                r2 = 1
                if (r0 > r2) goto La
                r0 = r2
                goto Lb
            La:
                r0 = r1
            Lb:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
                int r0 = r5.length
                if (r0 != r2) goto L13
                r0 = r2
                goto L14
            L13:
                r0 = r1
            L14:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
                int r0 = r6.length
                if (r0 != r2) goto L3c
                r0 = r6[r1]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r0)
                r0 = r6[r1]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r0)
                r0 = r5[r1]
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                if (r0 != r3) goto L2b
                goto L2c
            L2b:
                r2 = r1
            L2c:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r2)
                r0 = r6[r1]
                java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r0)
                r4.lowerBound = r0
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r4.upperBound = r0
                goto L51
            L3c:
                r0 = r5[r1]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r0)
                r0 = r5[r1]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r0)
                r0 = 0
                r4.lowerBound = r0
                r0 = r5[r1]
                java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r0)
                r4.upperBound = r0
            L51:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Lf
                r0 = r2
                java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
                boolean r0 = com.google.gson.internal.C$Gson$Types.equals(r1, r0)
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.lowerBound
                if (r0 == 0) goto Ld
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                r1 = 0
                java.lang.reflect.Type r2 = r3.lowerBound
                r0[r1] = r2
                goto Lf
            Ld:
                java.lang.reflect.Type[] r0 = com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY
            Lf:
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                r1 = 0
                java.lang.reflect.Type r2 = r3.upperBound
                r0[r1] = r2
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto Ld
                java.lang.reflect.Type r0 = r2.lowerBound
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Le
            Ld:
                r0 = 1
            Le:
                java.lang.reflect.Type r1 = r2.upperBound
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto L1e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? super "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.reflect.Type r1 = r2.lowerBound
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1e:
                java.lang.reflect.Type r0 = r2.upperBound
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L27
                java.lang.String r0 = "?"
                return r0
            L27:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? extends "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.reflect.Type r1 = r2.upperBound
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY = r0
            return
    }

    private C$Gson$Types() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type r1) {
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L1f
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L1b
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r1 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.Class r2 = r0.getComponentType()
            java.lang.reflect.Type r2 = canonicalize(r2)
            r1.<init>(r2)
            goto L1c
        L1b:
            r1 = r0
        L1c:
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            return r1
        L1f:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L38
            r0 = r5
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r1 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            java.lang.reflect.Type r2 = r0.getOwnerType()
            java.lang.reflect.Type r3 = r0.getRawType()
            java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()
            r1.<init>(r2, r3, r4)
            return r1
        L38:
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L49
            r0 = r5
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r1 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.reflect.Type r2 = r0.getGenericComponentType()
            r1.<init>(r2)
            return r1
        L49:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L5e
            r0 = r5
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r1 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r2 = r0.getUpperBounds()
            java.lang.reflect.Type[] r3 = r0.getLowerBounds()
            r1.<init>(r2, r3)
            return r1
        L5e:
            return r5
    }

    static void checkNotPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L10
            r0 = r1
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            return
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> r2) {
            java.lang.reflect.GenericDeclaration r0 = r2.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto Lc
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    static boolean equal(java.lang.Object r1, java.lang.Object r2) {
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static boolean equals(java.lang.reflect.Type r6, java.lang.reflect.Type r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r0 = r6.equals(r7)
            return r0
        Ld:
            boolean r1 = r6 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L4a
            boolean r1 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            r1 = r6
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = r7
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r4 = r1.getOwnerType()
            java.lang.reflect.Type r5 = r3.getOwnerType()
            boolean r4 = equal(r4, r5)
            if (r4 == 0) goto L48
            java.lang.reflect.Type r4 = r1.getRawType()
            java.lang.reflect.Type r5 = r3.getRawType()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L48
            java.lang.reflect.Type[] r4 = r1.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r3.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L48
            goto L49
        L48:
            r0 = r2
        L49:
            return r0
        L4a:
            boolean r1 = r6 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L66
            boolean r0 = r7 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L53
            return r2
        L53:
            r0 = r6
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            r1 = r7
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r2 = r0.getGenericComponentType()
            java.lang.reflect.Type r3 = r1.getGenericComponentType()
            boolean r2 = equals(r2, r3)
            return r2
        L66:
            boolean r1 = r6 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L94
            boolean r1 = r7 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6f
            return r2
        L6f:
            r1 = r6
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            r3 = r7
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r4 = r1.getUpperBounds()
            java.lang.reflect.Type[] r5 = r3.getUpperBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L92
            java.lang.reflect.Type[] r4 = r1.getLowerBounds()
            java.lang.reflect.Type[] r5 = r3.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L92
            goto L93
        L92:
            r0 = r2
        L93:
            return r0
        L94:
            boolean r1 = r6 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lbe
            boolean r1 = r7 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L9d
            return r2
        L9d:
            r1 = r6
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            r3 = r7
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.GenericDeclaration r4 = r1.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r5 = r3.getGenericDeclaration()
            if (r4 != r5) goto Lbc
            java.lang.String r4 = r1.getName()
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lbc
            goto Lbd
        Lbc:
            r0 = r2
        Lbd:
            return r0
        Lbe:
            return r2
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Lc
            r0 = r1
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            goto L13
        Lc:
            r0 = r1
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = r0.getComponentType()
        L13:
            return r0
    }

    public static java.lang.reflect.Type getCollectionElementType(java.lang.reflect.Type r3, java.lang.Class<?> r4) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Type r0 = getSupertype(r3, r4, r0)
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r0
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = r1[r2]
        L14:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L22
            r1 = r0
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            return r1
        L22:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
    }

    static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type r5, java.lang.Class<?> r6, java.lang.Class<?> r7) {
            if (r7 != r6) goto L3
            return r5
        L3:
            boolean r0 = r7.isInterface()
            if (r0 == 0) goto L34
            java.lang.Class[] r0 = r6.getInterfaces()
            r1 = 0
            int r2 = r0.length
        Lf:
            if (r1 >= r2) goto L34
            r3 = r0[r1]
            if (r3 != r7) goto L1c
            java.lang.reflect.Type[] r3 = r6.getGenericInterfaces()
            r3 = r3[r1]
            return r3
        L1c:
            r3 = r0[r1]
            boolean r3 = r7.isAssignableFrom(r3)
            if (r3 == 0) goto L31
            java.lang.reflect.Type[] r3 = r6.getGenericInterfaces()
            r3 = r3[r1]
            r4 = r0[r1]
            java.lang.reflect.Type r3 = getGenericSupertype(r3, r4, r7)
            return r3
        L31:
            int r1 = r1 + 1
            goto Lf
        L34:
            boolean r0 = r6.isInterface()
            if (r0 != 0) goto L5a
        L3a:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r6 == r0) goto L5a
            java.lang.Class r0 = r6.getSuperclass()
            if (r0 != r7) goto L49
            java.lang.reflect.Type r1 = r6.getGenericSuperclass()
            return r1
        L49:
            boolean r1 = r7.isAssignableFrom(r0)
            if (r1 == 0) goto L58
            java.lang.reflect.Type r1 = r6.getGenericSuperclass()
            java.lang.reflect.Type r1 = getGenericSupertype(r1, r0, r7)
            return r1
        L58:
            r6 = r0
            goto L3a
        L5a:
            return r7
    }

    public static java.lang.reflect.Type[] getMapKeyAndValueTypes(java.lang.reflect.Type r5, java.lang.Class<?> r6) {
            java.lang.Class<java.util.Properties> r0 = java.util.Properties.class
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 != r0) goto L12
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            return r0
        L12:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.reflect.Type r0 = getSupertype(r5, r6, r0)
            boolean r4 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L24
            r1 = r0
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r2 = r1.getActualTypeArguments()
            return r2
        L24:
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r2] = r4
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3[r1] = r2
            return r3
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L8
            r0 = r4
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        L8:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1c
            r0 = r4
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            boolean r2 = r1 instanceof java.lang.Class
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r2)
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        L1c:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L35
            r0 = r4
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            java.lang.Class r2 = getRawType(r0)
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            java.lang.Class r1 = r1.getClass()
            return r1
        L35:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L3c
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
        L3c:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L4e
            r0 = r4
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            r0 = r0[r1]
            java.lang.Class r0 = getRawType(r0)
            return r0
        L4e:
            if (r4 != 0) goto L53
            java.lang.String r0 = "null"
            goto L5b
        L53:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
        L5b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = "> is of type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.Class<?> r4) {
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Le
            r0 = r2
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            r1 = 0
            r2 = r0[r1]
        Le:
            boolean r0 = r4.isAssignableFrom(r3)
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            java.lang.reflect.Type r0 = getGenericSupertype(r2, r3, r4)
            java.lang.reflect.Type r0 = resolve(r2, r3, r0)
            return r0
    }

    static int hashCodeOrZero(java.lang.Object r1) {
            if (r1 == 0) goto L7
            int r0 = r1.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static int indexOf(java.lang.Object[] r3, java.lang.Object r4) {
            r0 = 0
            int r1 = r3.length
        L2:
            if (r0 >= r1) goto L10
            r2 = r3[r0]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L2
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.lang.reflect.Type... r3) {
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r0 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r0 = resolve(r1, r2, r3, r0)
            return r0
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r10, java.lang.Class<?> r11, java.lang.reflect.Type r12, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r13) {
            r0 = 0
        L1:
            boolean r1 = r12 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L29
            r1 = r12
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r13.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L18
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 != r3) goto L16
            r3 = r12
            goto L17
        L16:
            r3 = r2
        L17:
            return r3
        L18:
            java.lang.Class r3 = java.lang.Void.TYPE
            r13.put(r1, r3)
            if (r0 != 0) goto L20
            r0 = r1
        L20:
            java.lang.reflect.Type r12 = resolveTypeVariable(r10, r11, r1)
            if (r12 != r1) goto L28
            goto Lee
        L28:
            goto L1
        L29:
            boolean r1 = r12 instanceof java.lang.Class
            if (r1 == 0) goto L50
            r1 = r12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L50
            r1 = r12
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r2 = r1.getComponentType()
            java.lang.reflect.Type r3 = resolve(r10, r11, r2, r13)
            boolean r4 = equal(r2, r3)
            if (r4 == 0) goto L49
            r4 = r1
            goto L4d
        L49:
            java.lang.reflect.GenericArrayType r4 = arrayOf(r3)
        L4d:
            r12 = r4
            goto Lee
        L50:
            boolean r1 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L6e
            r1 = r12
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r2 = r1.getGenericComponentType()
            java.lang.reflect.Type r3 = resolve(r10, r11, r2, r13)
            boolean r4 = equal(r2, r3)
            if (r4 == 0) goto L67
            r4 = r1
            goto L6b
        L67:
            java.lang.reflect.GenericArrayType r4 = arrayOf(r3)
        L6b:
            r12 = r4
            goto Lee
        L6e:
            boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r1 == 0) goto Lb6
            r1 = r12
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r3 = r1.getOwnerType()
            java.lang.reflect.Type r4 = resolve(r10, r11, r3, r13)
            boolean r5 = equal(r4, r3)
            r2 = r2 ^ r5
            java.lang.reflect.Type[] r5 = r1.getActualTypeArguments()
            r6 = 0
            int r7 = r5.length
        L89:
            if (r6 >= r7) goto La8
            r8 = r5[r6]
            java.lang.reflect.Type r8 = resolve(r10, r11, r8, r13)
            r9 = r5[r6]
            boolean r9 = equal(r8, r9)
            if (r9 != 0) goto La5
            if (r2 != 0) goto La3
            java.lang.Object r9 = r5.clone()
            r5 = r9
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r2 = 1
        La3:
            r5[r6] = r8
        La5:
            int r6 = r6 + 1
            goto L89
        La8:
            if (r2 == 0) goto Lb3
            java.lang.reflect.Type r6 = r1.getRawType()
            java.lang.reflect.ParameterizedType r6 = newParameterizedTypeWithOwner(r4, r6, r5)
            goto Lb4
        Lb3:
            r6 = r1
        Lb4:
            r12 = r6
            goto Lee
        Lb6:
            boolean r1 = r12 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Lee
            r1 = r12
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r3 = r1.getLowerBounds()
            java.lang.reflect.Type[] r4 = r1.getUpperBounds()
            int r5 = r3.length
            r6 = 0
            if (r5 != r2) goto Ld9
            r2 = r3[r6]
            java.lang.reflect.Type r2 = resolve(r10, r11, r2, r13)
            r5 = r3[r6]
            if (r2 == r5) goto Ld8
            java.lang.reflect.WildcardType r12 = supertypeOf(r2)
            goto Lee
        Ld8:
            goto Leb
        Ld9:
            int r5 = r4.length
            if (r5 != r2) goto Leb
            r2 = r4[r6]
            java.lang.reflect.Type r2 = resolve(r10, r11, r2, r13)
            r5 = r4[r6]
            if (r2 == r5) goto Lec
            java.lang.reflect.WildcardType r12 = subtypeOf(r2)
            goto Lee
        Leb:
        Lec:
            r12 = r1
        Lee:
            if (r0 == 0) goto Lf3
            r13.put(r0, r12)
        Lf3:
            return r12
    }

    static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type r4, java.lang.Class<?> r5, java.lang.reflect.TypeVariable<?> r6) {
            java.lang.Class r0 = declaringClassOf(r6)
            if (r0 != 0) goto L7
            return r6
        L7:
            java.lang.reflect.Type r1 = getGenericSupertype(r4, r5, r0)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L21
            java.lang.reflect.TypeVariable[] r2 = r0.getTypeParameters()
            int r2 = indexOf(r2, r6)
            r3 = r1
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r3 = r3[r2]
            return r3
        L21:
            return r6
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lc
            r0 = r3
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            goto L12
        Lc:
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            r0[r1] = r3
        L12:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r1 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r2 = com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY
            r1.<init>(r0, r2)
            return r1
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = r5
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            goto L12
        Le:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r5
        L12:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r3 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r1] = r4
            r3.<init>(r2, r0)
            return r3
    }

    public static java.lang.String typeToString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lc
            r0 = r1
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            goto L10
        Lc:
            java.lang.String r0 = r1.toString()
        L10:
            return r0
    }
}
