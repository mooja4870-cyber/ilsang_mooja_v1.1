package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;
    private final int id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.caseField = r2
            r0.valueField = r3
            return
    }

    public java.lang.reflect.Field getCaseField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.caseField
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.reflect.Field getValueField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.valueField
            return r0
    }
}
