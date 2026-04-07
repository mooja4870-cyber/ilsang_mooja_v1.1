package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class ExtensionSchema<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
    ExtensionSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int extensionNumber(java.util.Map.Entry<?, ?> r1);

    abstract java.lang.Object findExtensionByNumber(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2, int r3);

    abstract com.google.crypto.tink.shaded.protobuf.FieldSet<T> getExtensions(java.lang.Object r1);

    abstract com.google.crypto.tink.shaded.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object r1);

    abstract boolean hasExtensions(com.google.crypto.tink.shaded.protobuf.MessageLite r1);

    abstract void makeImmutable(java.lang.Object r1);

    abstract <UT, UB> UB parseExtension(java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.Reader r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4, com.google.crypto.tink.shaded.protobuf.FieldSet<T> r5, UB r6, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r7) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(com.google.crypto.tink.shaded.protobuf.Reader r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3, com.google.crypto.tink.shaded.protobuf.FieldSet<T> r4) throws java.io.IOException;

    abstract void parseMessageSetItem(com.google.crypto.tink.shaded.protobuf.ByteString r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3, com.google.crypto.tink.shaded.protobuf.FieldSet<T> r4) throws java.io.IOException;

    abstract void serializeExtension(com.google.crypto.tink.shaded.protobuf.Writer r1, java.util.Map.Entry<?, ?> r2) throws java.io.IOException;

    abstract void setExtensions(java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.FieldSet<T> r2);
}
