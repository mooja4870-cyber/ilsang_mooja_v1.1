package androidx.core.graphics;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0087\u0002\u001a\r\u0010\u0000\u001a\u00020\t*\u00020\tH\u0086\n\u001a\r\u0010\u0003\u001a\u00020\t*\u00020\tH\u0086\n\u001a\r\u0010\u0004\u001a\u00020\t*\u00020\tH\u0086\n\u001a\r\u0010\u0005\u001a\u00020\t*\u00020\tH\u0086\n\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\tH\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\tH\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0017H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0017H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0017H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0017H\u0087\n\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0017H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\t*\u00020\u0017H\u0087\b\u001a\u0015\u0010\"\u001a\u00020\u0017*\u00020\t2\u0006\u0010\u001e\u001a\u00020#H\u0087\f\u001a\u0015\u0010\"\u001a\u00020\u0017*\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\f\u001a\u0015\u0010\"\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001e\u001a\u00020#H\u0087\f\u001a\u0015\u0010\"\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\f\u001a\u0015\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001e\u001a\u00020#H\u0087\f\u001a\u0015\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\f\u001a\r\u0010\u0019\u001a\u00020\t*\u00020$H\u0087\b\"\u0016\u0010\b\u001a\u00020\t*\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\t*\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\t*\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0016\u0010\u0010\u001a\u00020\t*\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\"\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\t8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0018\"\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018\"\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0018\"\u0016\u0010\u0010\u001a\u00020\u0001*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018\"\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018\"\u0016\u0010\u001a\u001a\u00020\u001b*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u001b*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c\"\u0016\u0010\u001e\u001a\u00020\u001f*\u00020\u00178Ç\u0002¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"component1", "", "Landroid/graphics/Color;", "component2", "component3", "component4", "plus", "c", "alpha", "", "getAlpha", "(I)I", "red", "getRed", "green", "getGreen", "blue", "getBlue", "luminance", "getLuminance", "(I)F", "toColor", "toColorLong", "", "(J)F", "toColorInt", "isSrgb", "", "(J)Z", "isWideGamut", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "convertTo", "Landroid/graphics/ColorSpace$Named;", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorKt {
    public static final float component1(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.red(r2)
            return r1
    }

    public static final float component1(android.graphics.Color r2) {
            r0 = 0
            r1 = 0
            float r1 = r2.getComponent(r1)
            return r1
    }

    public static final int component1(int r2) {
            r0 = 0
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final float component2(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.green(r2)
            return r1
    }

    public static final float component2(android.graphics.Color r2) {
            r0 = 0
            r1 = 1
            float r1 = r2.getComponent(r1)
            return r1
    }

    public static final int component2(int r2) {
            r0 = 0
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final float component3(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.blue(r2)
            return r1
    }

    public static final float component3(android.graphics.Color r2) {
            r0 = 0
            r1 = 2
            float r1 = r2.getComponent(r1)
            return r1
    }

    public static final int component3(int r2) {
            r0 = 0
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final float component4(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.alpha(r2)
            return r1
    }

    public static final float component4(android.graphics.Color r2) {
            r0 = 0
            r1 = 3
            float r1 = r2.getComponent(r1)
            return r1
    }

    public static final int component4(int r2) {
            r0 = 0
            r1 = r2 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final long convertTo(int r3, android.graphics.ColorSpace.Named r4) {
            r0 = 0
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r4)
            long r1 = android.graphics.Color.convert(r3, r1)
            return r1
    }

    public static final long convertTo(int r3, android.graphics.ColorSpace r4) {
            r0 = 0
            long r1 = android.graphics.Color.convert(r3, r4)
            return r1
    }

    public static final long convertTo(long r3, android.graphics.ColorSpace.Named r5) {
            r0 = 0
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r5)
            long r1 = android.graphics.Color.convert(r3, r1)
            return r1
    }

    public static final long convertTo(long r3, android.graphics.ColorSpace r5) {
            r0 = 0
            long r1 = android.graphics.Color.convert(r3, r5)
            return r1
    }

    public static final android.graphics.Color convertTo(android.graphics.Color r2, android.graphics.ColorSpace.Named r3) {
            r0 = 0
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r3)
            android.graphics.Color r1 = r2.convert(r1)
            return r1
    }

    public static final android.graphics.Color convertTo(android.graphics.Color r2, android.graphics.ColorSpace r3) {
            r0 = 0
            android.graphics.Color r1 = r2.convert(r3)
            return r1
    }

    public static final float getAlpha(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.alpha(r2)
            return r1
    }

    public static final int getAlpha(int r2) {
            r0 = 0
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final float getBlue(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.blue(r2)
            return r1
    }

    public static final int getBlue(int r2) {
            r0 = 0
            r1 = r2 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final android.graphics.ColorSpace getColorSpace(long r2) {
            r0 = 0
            android.graphics.ColorSpace r1 = android.graphics.Color.colorSpace(r2)
            return r1
    }

    public static final float getGreen(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.green(r2)
            return r1
    }

    public static final int getGreen(int r2) {
            r0 = 0
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final float getLuminance(int r2) {
            r0 = 0
            float r1 = android.graphics.Color.luminance(r2)
            return r1
    }

    public static final float getLuminance(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.luminance(r2)
            return r1
    }

    public static final float getRed(long r2) {
            r0 = 0
            float r1 = android.graphics.Color.red(r2)
            return r1
    }

    public static final int getRed(int r2) {
            r0 = 0
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public static final boolean isSrgb(long r2) {
            r0 = 0
            boolean r1 = android.graphics.Color.isSrgb(r2)
            return r1
    }

    public static final boolean isWideGamut(long r2) {
            r0 = 0
            boolean r1 = android.graphics.Color.isWideGamut(r2)
            return r1
    }

    public static final android.graphics.Color plus(android.graphics.Color r1, android.graphics.Color r2) {
            android.graphics.Color r0 = androidx.core.graphics.ColorUtils.compositeColors(r2, r1)
            return r0
    }

    public static final android.graphics.Color toColor(int r2) {
            r0 = 0
            android.graphics.Color r1 = android.graphics.Color.valueOf(r2)
            return r1
    }

    public static final android.graphics.Color toColor(long r2) {
            r0 = 0
            android.graphics.Color r1 = android.graphics.Color.valueOf(r2)
            return r1
    }

    public static final int toColorInt(long r2) {
            r0 = 0
            int r1 = android.graphics.Color.toArgb(r2)
            return r1
    }

    public static final int toColorInt(java.lang.String r2) {
            r0 = 0
            int r1 = android.graphics.Color.parseColor(r2)
            return r1
    }

    public static final long toColorLong(int r3) {
            r0 = 0
            long r1 = android.graphics.Color.pack(r3)
            return r1
    }
}
