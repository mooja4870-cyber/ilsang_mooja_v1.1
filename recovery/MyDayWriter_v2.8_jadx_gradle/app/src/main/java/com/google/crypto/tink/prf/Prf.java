package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public interface Prf {
    byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException;
}
