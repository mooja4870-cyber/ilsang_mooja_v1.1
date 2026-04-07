package com.google.crypto.tink.tinkkey;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@java.lang.Deprecated
public interface TinkKey {
    com.google.crypto.tink.KeyTemplate getKeyTemplate();

    boolean hasSecret();
}
