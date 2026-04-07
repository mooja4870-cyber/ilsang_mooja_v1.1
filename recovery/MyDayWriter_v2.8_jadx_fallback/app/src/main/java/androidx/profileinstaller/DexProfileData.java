package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class DexProfileData {
    final java.lang.String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final java.lang.String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final java.util.TreeMap<java.lang.Integer, java.lang.Integer> methods;
    final int numMethodIds;

    DexProfileData(java.lang.String r1, java.lang.String r2, long r3, long r5, int r7, int r8, int r9, int[] r10, java.util.TreeMap<java.lang.Integer, java.lang.Integer> r11) {
            r0 = this;
            r0.<init>()
            r0.apkName = r1
            r0.dexName = r2
            r0.dexChecksum = r3
            r0.mTypeIdCount = r5
            r0.classSetSize = r7
            r0.hotMethodRegionSize = r8
            r0.numMethodIds = r9
            r0.classes = r10
            r0.methods = r11
            return
    }
}
