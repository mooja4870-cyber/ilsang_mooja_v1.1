package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final java.lang.String TAG = "ACTVAutoSizeHelper";
    private static final android.graphics.RectF TEMP_RECTF = null;
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> sTextViewMethodByNameCache;
    private float mAutoSizeMaxTextSizeInPx;
    private float mAutoSizeMinTextSizeInPx;
    private float mAutoSizeStepGranularityInPx;
    private int[] mAutoSizeTextSizesInPx;
    private int mAutoSizeTextType;
    private final android.content.Context mContext;
    private boolean mHasPresetAutoSizeValues;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl mImpl;
    private boolean mNeedsAutoSizeText;
    private android.text.TextPaint mTempTextPaint;
    private final android.widget.TextView mTextView;

    private static final class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.text.StaticLayout createStaticLayoutForMeasuring(java.lang.CharSequence r4, android.text.Layout.Alignment r5, int r6, int r7, android.widget.TextView r8, android.text.TextPaint r9, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl r10) {
                int r0 = r4.length()
                r1 = 0
                android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r4, r1, r0, r9, r6)
                android.text.StaticLayout$Builder r1 = r0.setAlignment(r5)
                float r2 = r8.getLineSpacingExtra()
                float r3 = r8.getLineSpacingMultiplier()
                android.text.StaticLayout$Builder r1 = r1.setLineSpacing(r2, r3)
                boolean r2 = r8.getIncludeFontPadding()
                android.text.StaticLayout$Builder r1 = r1.setIncludePad(r2)
                int r2 = r8.getBreakStrategy()
                android.text.StaticLayout$Builder r1 = r1.setBreakStrategy(r2)
                int r2 = r8.getHyphenationFrequency()
                android.text.StaticLayout$Builder r1 = r1.setHyphenationFrequency(r2)
                r2 = -1
                if (r7 != r2) goto L39
                r2 = 2147483647(0x7fffffff, float:NaN)
                goto L3a
            L39:
                r2 = r7
            L3a:
                r1.setMaxLines(r2)
                r10.computeAndSetTextDirection(r0, r8)     // Catch: java.lang.ClassCastException -> L41
                goto L49
            L41:
                r1 = move-exception
                java.lang.String r2 = "ACTVAutoSizeHelper"
                java.lang.String r3 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
                android.util.Log.w(r2, r3)
            L49:
                android.text.StaticLayout r1 = r0.build()
                return r1
        }
    }

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void computeAndSetTextDirection(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                return
        }

        boolean isHorizontallyScrollable(android.widget.TextView r3) {
                r2 = this;
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.Object r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r3, r1, r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }
    }

    private static class Impl23 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl {
        Impl23() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
                r2 = this;
                android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.String r1 = "getTextDirectionHeuristic"
                java.lang.Object r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r4, r1, r0)
                android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0
                r3.setTextDirection(r0)
                return
        }
    }

    private static class Impl29 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23 {
        Impl29() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder r2, android.widget.TextView r3) {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r3.getTextDirectionHeuristic()
                r2.setTextDirection(r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean isHorizontallyScrollable(android.widget.TextView r2) {
                r1 = this;
                boolean r0 = r2.isHorizontallyScrollable()
                return r0
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache = r0
            return
    }

    AppCompatTextViewAutoSizeHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAutoSizeTextType = r0
            r2.mNeedsAutoSizeText = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeStepGranularityInPx = r1
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mHasPresetAutoSizeValues = r0
            r2.mTextView = r3
            android.widget.TextView r0 = r2.mTextView
            android.content.Context r0 = r0.getContext()
            r2.mContext = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L2e
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29 r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29
            r0.<init>()
            r2.mImpl = r0
            goto L36
        L2e:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23 r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23
            r0.<init>()
            r2.mImpl = r0
        L36:
            return
    }

    private int[] cleanupAutoSizePresetSizes(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L4
            return r7
        L4:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L27
            r3 = r7[r2]
            if (r3 <= 0) goto L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r4 = java.util.Collections.binarySearch(r1, r4)
            if (r4 >= 0) goto L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.add(r4)
        L24:
            int r2 = r2 + 1
            goto Ld
        L27:
            int r2 = r1.size()
            if (r0 != r2) goto L2e
            return r7
        L2e:
            int r2 = r1.size()
            int[] r3 = new int[r2]
            r4 = 0
        L35:
            if (r4 >= r2) goto L46
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L35
        L46:
            return r3
    }

    private void clearAutoSizeConfiguration() {
            r2 = this;
            r0 = 0
            r2.mAutoSizeTextType = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            r2.mAutoSizeStepGranularityInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mNeedsAutoSizeText = r0
            return
    }

    private int findLargestTextSizeWhichFits(android.graphics.RectF r7) {
            r6 = this;
            int[] r0 = r6.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 == 0) goto L27
            r1 = 0
            int r2 = r1 + 1
            int r3 = r0 + (-1)
        La:
            if (r2 > r3) goto L22
            int r4 = r2 + r3
            int r4 = r4 / 2
            int[] r5 = r6.mAutoSizeTextSizesInPx
            r5 = r5[r4]
            boolean r5 = r6.suggestedSizeFitsInSpace(r5, r7)
            if (r5 == 0) goto L1e
            r1 = r2
            int r2 = r4 + 1
            goto La
        L1e:
            int r3 = r4 + (-1)
            r1 = r3
            goto La
        L22:
            int[] r4 = r6.mAutoSizeTextSizesInPx
            r4 = r4[r1]
            return r4
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            throw r1
    }

    private static java.lang.reflect.Method getTextViewMethod(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L20
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L1f
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L20
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L20
            r0 = r1
            if (r0 == 0) goto L1f
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L20
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L20
            r1.put(r3, r0)     // Catch: java.lang.Exception -> L20
        L1f:
            return r0
        L20:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to retrieve TextView#"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "() method"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ACTVAutoSizeHelper"
            android.util.Log.w(r2, r1, r0)
            r1 = 0
            return r1
    }

    static <T> T invokeAndReturnWithDefault(java.lang.Object r6, java.lang.String r7, T r8) {
            r0 = 0
            r1 = 0
            java.lang.reflect.Method r2 = getTextViewMethod(r7)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            java.lang.Object r3 = r2.invoke(r6, r3)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            r0 = r3
            if (r0 != 0) goto L3c
            if (r1 == 0) goto L3c
        L12:
            r0 = r8
            goto L3c
        L14:
            r2 = move-exception
            goto L3d
        L16:
            r2 = move-exception
            r1 = 1
            java.lang.String r3 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "Failed to invoke TextView#"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "() method"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L3c
            if (r1 == 0) goto L3c
            goto L12
        L3c:
            return r0
        L3d:
            if (r0 != 0) goto L42
            if (r1 == 0) goto L42
            r0 = r8
        L42:
            throw r2
    }

    private void setRawTextSize(float r6) {
            r5 = this;
            android.widget.TextView r0 = r5.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.TextView r0 = r5.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r6)
            android.widget.TextView r0 = r5.mTextView
            boolean r0 = r0.isInLayout()
            android.widget.TextView r1 = r5.mTextView
            android.text.Layout r1 = r1.getLayout()
            if (r1 == 0) goto L54
            r1 = 0
            r5.mNeedsAutoSizeText = r1
            java.lang.String r2 = "nullLayouts"
            java.lang.String r3 = "nullLayouts"
            java.lang.reflect.Method r3 = getTextViewMethod(r3)     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L39
            android.widget.TextView r4 = r5.mTextView     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3a
            r3.invoke(r4, r1)     // Catch: java.lang.Exception -> L3a
        L39:
            goto L42
        L3a:
            r1 = move-exception
            java.lang.String r3 = "ACTVAutoSizeHelper"
            java.lang.String r4 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r3, r4, r1)
        L42:
            if (r0 != 0) goto L4a
            android.widget.TextView r1 = r5.mTextView
            r1.requestLayout()
            goto L4f
        L4a:
            android.widget.TextView r1 = r5.mTextView
            r1.forceLayout()
        L4f:
            android.widget.TextView r1 = r5.mTextView
            r1.invalidate()
        L54:
            return
    }

    private boolean setupAutoSizeText() {
            r7 = this;
            boolean r0 = r7.supportsAutoSizeText()
            if (r0 == 0) goto L41
            int r0 = r7.mAutoSizeTextType
            r1 = 1
            if (r0 != r1) goto L41
            boolean r0 = r7.mHasPresetAutoSizeValues
            if (r0 == 0) goto L14
            int[] r0 = r7.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 != 0) goto L3e
        L14:
            float r0 = r7.mAutoSizeMaxTextSizeInPx
            float r2 = r7.mAutoSizeMinTextSizeInPx
            float r0 = r0 - r2
            float r2 = r7.mAutoSizeStepGranularityInPx
            float r0 = r0 / r2
            double r2 = (double) r0
            double r2 = java.lang.Math.floor(r2)
            int r0 = (int) r2
            int r0 = r0 + r1
            int[] r2 = new int[r0]
            r3 = 0
        L26:
            if (r3 >= r0) goto L38
            float r4 = r7.mAutoSizeMinTextSizeInPx
            float r5 = (float) r3
            float r6 = r7.mAutoSizeStepGranularityInPx
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L26
        L38:
            int[] r3 = r7.cleanupAutoSizePresetSizes(r2)
            r7.mAutoSizeTextSizesInPx = r3
        L3e:
            r7.mNeedsAutoSizeText = r1
            goto L44
        L41:
            r0 = 0
            r7.mNeedsAutoSizeText = r0
        L44:
            boolean r0 = r7.mNeedsAutoSizeText
            return r0
    }

    private void setupAutoSizeUniformPresetSizes(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L1e
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L15:
            int[] r2 = r4.cleanupAutoSizePresetSizes(r1)
            r4.mAutoSizeTextSizesInPx = r2
            r4.setupAutoSizeUniformPresetSizesConfiguration()
        L1e:
            return
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
            r4 = this;
            int[] r0 = r4.mAutoSizeTextSizesInPx
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = r1
        La:
            r4.mHasPresetAutoSizeValues = r3
            boolean r3 = r4.mHasPresetAutoSizeValues
            if (r3 == 0) goto L26
            r4.mAutoSizeTextType = r2
            int[] r2 = r4.mAutoSizeTextSizesInPx
            r1 = r2[r1]
            float r1 = (float) r1
            r4.mAutoSizeMinTextSizeInPx = r1
            int[] r1 = r4.mAutoSizeTextSizesInPx
            int r2 = r0 + (-1)
            r1 = r1[r2]
            float r1 = (float) r1
            r4.mAutoSizeMaxTextSizeInPx = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mAutoSizeStepGranularityInPx = r1
        L26:
            boolean r1 = r4.mHasPresetAutoSizeValues
            return r1
    }

    private boolean suggestedSizeFitsInSpace(int r10, android.graphics.RectF r11) {
            r9 = this;
            android.widget.TextView r0 = r9.mTextView
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r9.mTextView
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L17
            android.widget.TextView r2 = r9.mTextView
            java.lang.CharSequence r2 = r1.getTransformation(r0, r2)
            if (r2 == 0) goto L17
            r0 = r2
        L17:
            android.widget.TextView r2 = r9.mTextView
            int r2 = r2.getMaxLines()
            r9.initTempTextPaint(r10)
            android.widget.TextView r3 = r9.mTextView
            java.lang.String r4 = "getLayoutAlignment"
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.Object r3 = invokeAndReturnWithDefault(r3, r4, r5)
            android.text.Layout$Alignment r3 = (android.text.Layout.Alignment) r3
            float r4 = r11.right
            int r4 = java.lang.Math.round(r4)
            android.text.StaticLayout r4 = r9.createLayout(r0, r3, r4, r2)
            r5 = -1
            r6 = 0
            r7 = 1
            if (r2 == r5) goto L51
            int r5 = r4.getLineCount()
            if (r5 > r2) goto L50
            int r5 = r4.getLineCount()
            int r5 = r5 - r7
            int r5 = r4.getLineEnd(r5)
            int r8 = r0.length()
            if (r5 == r8) goto L51
        L50:
            return r6
        L51:
            int r5 = r4.getHeight()
            float r5 = (float) r5
            float r8 = r11.bottom
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L5d
            return r6
        L5d:
            return r7
    }

    private boolean supportsAutoSizeText() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            boolean r0 = r0 instanceof androidx.appcompat.widget.AppCompatEditText
            r0 = r0 ^ 1
            return r0
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float r5, float r6, float r7) throws java.lang.IllegalArgumentException {
            r4 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String r2 = "px) is less or equal to (0px)"
            if (r1 <= 0) goto L62
            int r1 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r1 <= 0) goto L39
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            r4.mAutoSizeTextType = r0
            r4.mAutoSizeMinTextSizeInPx = r5
            r4.mAutoSizeMaxTextSizeInPx = r6
            r4.mAutoSizeStepGranularityInPx = r7
            r0 = 0
            r4.mHasPresetAutoSizeValues = r0
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "The auto-size step granularity ("
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Maximum auto-size text size ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = "px) is less or equal to minimum auto-size text size ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = "px)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Minimum auto-size text size ("
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void autoSizeText() {
            r6 = this;
            boolean r0 = r6.isAutoSizeEnabled()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r6.mNeedsAutoSizeText
            if (r0 == 0) goto L85
            android.widget.TextView r0 = r6.mTextView
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L84
            android.widget.TextView r0 = r6.mTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L1c
            goto L84
        L1c:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r0 = r6.mImpl
            android.widget.TextView r1 = r6.mTextView
            boolean r0 = r0.isHorizontallyScrollable(r1)
            if (r0 == 0) goto L29
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L3d
        L29:
            android.widget.TextView r1 = r6.mTextView
            int r1 = r1.getMeasuredWidth()
            android.widget.TextView r2 = r6.mTextView
            int r2 = r2.getTotalPaddingLeft()
            int r1 = r1 - r2
            android.widget.TextView r2 = r6.mTextView
            int r2 = r2.getTotalPaddingRight()
            int r1 = r1 - r2
        L3d:
            android.widget.TextView r2 = r6.mTextView
            int r2 = r2.getHeight()
            android.widget.TextView r3 = r6.mTextView
            int r3 = r3.getCompoundPaddingBottom()
            int r2 = r2 - r3
            android.widget.TextView r3 = r6.mTextView
            int r3 = r3.getCompoundPaddingTop()
            int r2 = r2 - r3
            if (r1 <= 0) goto L83
            if (r2 > 0) goto L57
            goto L83
        L57:
            android.graphics.RectF r3 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF
            monitor-enter(r3)
            android.graphics.RectF r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF     // Catch: java.lang.Throwable -> L80
            r4.setEmpty()     // Catch: java.lang.Throwable -> L80
            android.graphics.RectF r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF     // Catch: java.lang.Throwable -> L80
            float r5 = (float) r1     // Catch: java.lang.Throwable -> L80
            r4.right = r5     // Catch: java.lang.Throwable -> L80
            android.graphics.RectF r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF     // Catch: java.lang.Throwable -> L80
            float r5 = (float) r2     // Catch: java.lang.Throwable -> L80
            r4.bottom = r5     // Catch: java.lang.Throwable -> L80
            android.graphics.RectF r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF     // Catch: java.lang.Throwable -> L80
            int r4 = r6.findLargestTextSizeWhichFits(r4)     // Catch: java.lang.Throwable -> L80
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L80
            android.widget.TextView r5 = r6.mTextView     // Catch: java.lang.Throwable -> L80
            float r5 = r5.getTextSize()     // Catch: java.lang.Throwable -> L80
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L7e
            r5 = 0
            r6.setTextSizeInternal(r5, r4)     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            return
        L84:
            return
        L85:
            r0 = 1
            r6.mNeedsAutoSizeText = r0
            return
    }

    android.text.StaticLayout createLayout(java.lang.CharSequence r8, android.text.Layout.Alignment r9, int r10, int r11) {
            r7 = this;
            android.widget.TextView r4 = r7.mTextView
            android.text.TextPaint r5 = r7.mTempTextPaint
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r6 = r7.mImpl
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            android.text.StaticLayout r8 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl.createStaticLayoutForMeasuring(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMaxTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMinTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            float r0 = r1.mAutoSizeStepGranularityInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            int[] r0 = r1.mAutoSizeTextSizesInPx
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            int r0 = r1.mAutoSizeTextType
            return r0
    }

    void initTempTextPaint(int r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.mTempTextPaint
            if (r0 != 0) goto Lc
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.mTempTextPaint = r0
            goto L11
        Lc:
            android.text.TextPaint r0 = r2.mTempTextPaint
            r0.reset()
        L11:
            android.text.TextPaint r0 = r2.mTempTextPaint
            android.widget.TextView r1 = r2.mTextView
            android.text.TextPaint r1 = r1.getPaint()
            r0.set(r1)
            android.text.TextPaint r0 = r2.mTempTextPaint
            float r1 = (float) r3
            r0.setTextSize(r1)
            return
    }

    boolean isAutoSizeEnabled() {
            r1 = this;
            boolean r0 = r1.supportsAutoSizeText()
            if (r0 == 0) goto Lc
            int r0 = r1.mAutoSizeTextType
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r14, int r15) {
            r13 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.content.Context r3 = r13.mContext
            int[] r4 = androidx.appcompat.R.styleable.AppCompatTextView
            r5 = 0
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r14, r4, r15, r5)
            android.widget.TextView r6 = r13.mTextView
            android.widget.TextView r3 = r13.mTextView
            android.content.Context r7 = r3.getContext()
            int[] r8 = androidx.appcompat.R.styleable.AppCompatTextView
            r12 = 0
            r9 = r14
            r11 = r15
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r6, r7, r8, r9, r10, r11, r12)
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            boolean r14 = r10.hasValue(r14)
            if (r14 == 0) goto L2f
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            int r14 = r10.getInt(r14, r5)
            r13.mAutoSizeTextType = r14
        L2f:
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r14 = r10.hasValue(r14)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r14 == 0) goto L3f
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            float r2 = r10.getDimension(r14, r15)
        L3f:
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r14 = r10.hasValue(r14)
            if (r14 == 0) goto L4d
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            float r0 = r10.getDimension(r14, r15)
        L4d:
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r14 = r10.hasValue(r14)
            if (r14 == 0) goto L5b
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            float r1 = r10.getDimension(r14, r15)
        L5b:
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            boolean r14 = r10.hasValue(r14)
            if (r14 == 0) goto L79
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            int r14 = r10.getResourceId(r14, r5)
            if (r14 <= 0) goto L79
            android.content.res.Resources r3 = r10.getResources()
            android.content.res.TypedArray r3 = r3.obtainTypedArray(r14)
            r13.setupAutoSizeUniformPresetSizes(r3)
            r3.recycle()
        L79:
            r10.recycle()
            boolean r14 = r13.supportsAutoSizeText()
            if (r14 == 0) goto Lb7
            int r14 = r13.mAutoSizeTextType
            r3 = 1
            if (r14 != r3) goto Lb9
            boolean r14 = r13.mHasPresetAutoSizeValues
            if (r14 != 0) goto Lb3
            android.content.Context r14 = r13.mContext
            android.content.res.Resources r14 = r14.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r4 = 2
            if (r3 != 0) goto La0
            r3 = 1094713344(0x41400000, float:12.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r3, r14)
        La0:
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto Laa
            r3 = 1121976320(0x42e00000, float:112.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r3, r14)
        Laa:
            int r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r15 != 0) goto Lb0
            r2 = 1065353216(0x3f800000, float:1.0)
        Lb0:
            r13.validateAndSetAutoSizeTextTypeUniformConfiguration(r0, r1, r2)
        Lb3:
            r13.setupAutoSizeText()
            goto Lb9
        Lb7:
            r13.mAutoSizeTextType = r5
        Lb9:
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r6, int r7, int r8, int r9) throws java.lang.IllegalArgumentException {
            r5 = this;
            boolean r0 = r5.supportsAutoSizeText()
            if (r0 == 0) goto L2b
            android.content.Context r0 = r5.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = (float) r6
            float r1 = android.util.TypedValue.applyDimension(r9, r1, r0)
            float r2 = (float) r7
            float r2 = android.util.TypedValue.applyDimension(r9, r2, r0)
            float r3 = (float) r8
            float r3 = android.util.TypedValue.applyDimension(r9, r3, r0)
            r5.validateAndSetAutoSizeTextTypeUniformConfiguration(r1, r2, r3)
            boolean r4 = r5.setupAutoSizeText()
            if (r4 == 0) goto L2b
            r5.autoSizeText()
        L2b:
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r6, int r7) throws java.lang.IllegalArgumentException {
            r5 = this;
            boolean r0 = r5.supportsAutoSizeText()
            if (r0 == 0) goto L65
            int r0 = r6.length
            if (r0 <= 0) goto L59
            int[] r1 = new int[r0]
            if (r7 != 0) goto L12
            int[] r1 = java.util.Arrays.copyOf(r6, r0)
            goto L2f
        L12:
            android.content.Context r2 = r5.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 0
        L1d:
            if (r3 >= r0) goto L2f
            r4 = r6[r3]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r2)
            int r4 = java.lang.Math.round(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L1d
        L2f:
            int[] r2 = r5.cleanupAutoSizePresetSizes(r1)
            r5.mAutoSizeTextSizesInPx = r2
            boolean r2 = r5.setupAutoSizeUniformPresetSizesConfiguration()
            if (r2 == 0) goto L3c
            goto L5c
        L3c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "None of the preset sizes is valid: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = java.util.Arrays.toString(r6)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L59:
            r1 = 0
            r5.mHasPresetAutoSizeValues = r1
        L5c:
            boolean r1 = r5.setupAutoSizeText()
            if (r1 == 0) goto L65
            r5.autoSizeText()
        L65:
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r5) {
            r4 = this;
            boolean r0 = r4.supportsAutoSizeText()
            if (r0 == 0) goto L4c
            switch(r5) {
                case 0: goto L48;
                case 1: goto L22;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown auto-size text type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            android.content.Context r0 = r4.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 2
            float r1 = android.util.TypedValue.applyDimension(r2, r1, r0)
            r3 = 1121976320(0x42e00000, float:112.0)
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.validateAndSetAutoSizeTextTypeUniformConfiguration(r1, r2, r3)
            boolean r3 = r4.setupAutoSizeText()
            if (r3 == 0) goto L4c
            r4.autoSizeText()
            goto L4c
        L48:
            r4.clearAutoSizeConfiguration()
        L4c:
            return
    }

    void setTextSizeInternal(int r3, float r4) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Lf
        L9:
            android.content.Context r0 = r2.mContext
            android.content.res.Resources r0 = r0.getResources()
        Lf:
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r3, r4, r1)
            r2.setRawTextSize(r1)
            return
    }
}
