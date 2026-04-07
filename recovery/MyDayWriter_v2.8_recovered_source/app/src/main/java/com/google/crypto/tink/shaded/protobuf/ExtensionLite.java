package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExtensionLite<ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> {
    public ExtensionLite() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract Type getDefaultValue();

    public abstract com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType();

    public abstract com.google.crypto.tink.shaded.protobuf.MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
            r1 = this;
            r0 = 1
            return r0
    }

    public abstract boolean isRepeated();
}
