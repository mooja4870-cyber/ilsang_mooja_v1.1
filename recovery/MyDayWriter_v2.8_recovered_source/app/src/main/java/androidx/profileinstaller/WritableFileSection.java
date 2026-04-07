package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final androidx.profileinstaller.FileSectionType mType;

    WritableFileSection(androidx.profileinstaller.FileSectionType r1, int r2, byte[] r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mType = r1
            r0.mExpectedInflateSize = r2
            r0.mContents = r3
            r0.mNeedsCompression = r4
            return
    }
}
