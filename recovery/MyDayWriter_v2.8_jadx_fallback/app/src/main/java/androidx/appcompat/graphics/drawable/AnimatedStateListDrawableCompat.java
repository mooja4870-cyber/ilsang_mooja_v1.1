package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends androidx.appcompat.graphics.drawable.StateListDrawableCompat implements androidx.core.graphics.drawable.TintAwareDrawable {
    private static final java.lang.String ELEMENT_ITEM = "item";
    private static final java.lang.String ELEMENT_TRANSITION = "transition";
    private static final java.lang.String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String LOGTAG = null;
    private static final java.lang.String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState mState;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class AnimatableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.graphics.drawable.Animatable mA;

        AnimatableTransition(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mA = r2
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.mA
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.mA
                r0.stop()
                return
        }
    }

    static class AnimatedStateListState extends androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        androidx.collection.SparseArrayCompat<java.lang.Integer> mStateIds;
        androidx.collection.LongSparseArray<java.lang.Long> mTransitions;

        AnimatedStateListState(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState r2, androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r3, android.content.res.Resources r4) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                if (r2 == 0) goto Le
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r2.mTransitions
                r1.mTransitions = r0
                androidx.collection.SparseArrayCompat<java.lang.Integer> r0 = r2.mStateIds
                r1.mStateIds = r0
                goto L1c
            Le:
                androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
                r0.<init>()
                r1.mTransitions = r0
                androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
                r0.<init>()
                r1.mStateIds = r0
            L1c:
                return
        }

        private static long generateTransitionKey(int r4, int r5) {
                long r0 = (long) r4
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r5
                long r0 = r0 | r2
                return r0
        }

        int addStateSet(int[] r4, android.graphics.drawable.Drawable r5, int r6) {
                r3 = this;
                int r0 = super.addStateSet(r4, r5)
                androidx.collection.SparseArrayCompat<java.lang.Integer> r1 = r3.mStateIds
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r1.put(r0, r2)
                return r0
        }

        int addTransition(int r17, int r18, android.graphics.drawable.Drawable r19, boolean r20) {
                r16 = this;
                r0 = r16
                r1 = r19
                int r2 = super.addChild(r1)
                long r3 = generateTransitionKey(r17, r18)
                r5 = 0
                if (r20 == 0) goto L15
                r5 = 8589934592(0x200000000, double:4.243991582E-314)
            L15:
                androidx.collection.LongSparseArray<java.lang.Long> r7 = r0.mTransitions
                long r8 = (long) r2
                long r8 = r8 | r5
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r7.append(r3, r8)
                if (r20 == 0) goto L3c
                r7 = r17
                r8 = r18
                long r9 = generateTransitionKey(r8, r7)
                androidx.collection.LongSparseArray<java.lang.Long> r11 = r0.mTransitions
                long r12 = (long) r2
                r14 = 4294967296(0x100000000, double:2.121995791E-314)
                long r12 = r12 | r14
                long r12 = r12 | r5
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r11.append(r9, r12)
                goto L40
            L3c:
                r7 = r17
                r8 = r18
            L40:
                return r2
        }

        int getKeyframeIdAt(int r3) {
                r2 = this;
                r0 = 0
                if (r3 >= 0) goto L4
                goto L14
            L4:
                androidx.collection.SparseArrayCompat<java.lang.Integer> r1 = r2.mStateIds
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r1.get(r3, r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
            L14:
                return r0
        }

        int indexOfKeyframe(int[] r3) {
                r2 = this;
                int r0 = super.indexOfStateSet(r3)
                if (r0 < 0) goto L7
                return r0
            L7:
                int[] r1 = android.util.StateSet.WILD_CARD
                int r1 = super.indexOfStateSet(r1)
                return r1
        }

        int indexOfTransition(int r6, int r7) {
                r5 = this;
                long r0 = generateTransitionKey(r6, r7)
                androidx.collection.LongSparseArray<java.lang.Long> r2 = r5.mTransitions
                r3 = -1
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r2 = r2.get(r0, r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                int r2 = (int) r2
                return r2
        }

        boolean isTransitionReversed(int r7, int r8) {
                r6 = this;
                long r0 = generateTransitionKey(r7, r8)
                androidx.collection.LongSparseArray<java.lang.Long> r2 = r6.mTransitions
                r3 = -1
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r2 = r2.get(r0, r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                r4 = 4294967296(0x100000000, double:2.121995791E-314)
                long r2 = r2 & r4
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                return r2
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void mutate() {
                r1 = this;
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r1.mTransitions
                androidx.collection.LongSparseArray r0 = r0.clone()
                r1.mTransitions = r0
                androidx.collection.SparseArrayCompat<java.lang.Integer> r0 = r1.mStateIds
                androidx.collection.SparseArrayCompat r0 = r0.clone()
                r1.mStateIds = r0
                return
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
                r0.<init>(r1, r2)
                return r0
        }

        boolean transitionHasReversibleFlag(int r7, int r8) {
                r6 = this;
                long r0 = generateTransitionKey(r7, r8)
                androidx.collection.LongSparseArray<java.lang.Long> r2 = r6.mTransitions
                r3 = -1
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r2 = r2.get(r0, r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                r4 = 8589934592(0x200000000, double:4.243991582E-314)
                long r2 = r2 & r4
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                return r2
        }
    }

    private static class AnimatedVectorDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat mAvd;

        AnimatedVectorDrawableTransition(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mAvd = r2
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r1.mAvd
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r1.mAvd
                r0.stop()
                return
        }
    }

    private static class AnimationDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.animation.ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable r8, boolean r9, boolean r10) {
                r7 = this;
                r0 = 0
                r7.<init>(r0)
                int r0 = r8.getNumberOfFrames()
                r1 = 0
                if (r9 == 0) goto Le
                int r2 = r0 + (-1)
                goto Lf
            Le:
                r2 = r1
            Lf:
                if (r9 == 0) goto L12
                goto L14
            L12:
                int r1 = r0 + (-1)
            L14:
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$FrameInterpolator r3 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$FrameInterpolator
                r3.<init>(r8, r9)
                int[] r4 = new int[]{r2, r1}
                java.lang.String r5 = "currentIndex"
                android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r8, r5, r4)
                r5 = 1
                r4.setAutoCancel(r5)
                int r5 = r3.getTotalDuration()
                long r5 = (long) r5
                r4.setDuration(r5)
                r4.setInterpolator(r3)
                r7.mHasReversibleFlag = r10
                r7.mAnim = r4
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
                r1 = this;
                boolean r0 = r1.mHasReversibleFlag
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.reverse()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.cancel()
                return
        }
    }

    private static class FrameInterpolator implements android.animation.TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        FrameInterpolator(android.graphics.drawable.AnimationDrawable r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.updateFrames(r1, r2)
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r9) {
                r8 = this;
                int r0 = r8.mTotalDuration
                float r0 = (float) r0
                float r0 = r0 * r9
                r1 = 1056964608(0x3f000000, float:0.5)
                float r0 = r0 + r1
                int r0 = (int) r0
                int r1 = r8.mFrames
                int[] r2 = r8.mFrameTimes
                r3 = r0
                r4 = 0
            Le:
                if (r4 >= r1) goto L1a
                r5 = r2[r4]
                if (r3 < r5) goto L1a
                r5 = r2[r4]
                int r3 = r3 - r5
                int r4 = r4 + 1
                goto Le
            L1a:
                if (r4 >= r1) goto L22
                float r5 = (float) r3
                int r6 = r8.mTotalDuration
                float r6 = (float) r6
                float r5 = r5 / r6
                goto L23
            L22:
                r5 = 0
            L23:
                float r6 = (float) r4
                float r7 = (float) r1
                float r6 = r6 / r7
                float r6 = r6 + r5
                return r6
        }

        int getTotalDuration() {
                r1 = this;
                int r0 = r1.mTotalDuration
                return r0
        }

        int updateFrames(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                int r0 = r6.getNumberOfFrames()
                r5.mFrames = r0
                int[] r1 = r5.mFrameTimes
                if (r1 == 0) goto Lf
                int[] r1 = r5.mFrameTimes
                int r1 = r1.length
                if (r1 >= r0) goto L13
            Lf:
                int[] r1 = new int[r0]
                r5.mFrameTimes = r1
            L13:
                int[] r1 = r5.mFrameTimes
                r2 = 0
                r3 = 0
            L17:
                if (r3 >= r0) goto L2b
                if (r7 == 0) goto L20
                int r4 = r0 - r3
                int r4 = r4 + (-1)
                goto L21
            L20:
                r4 = r3
            L21:
                int r4 = r6.getDuration(r4)
                r1[r3] = r4
                int r2 = r2 + r4
                int r3 = r3 + 1
                goto L17
            L2b:
                r5.mTotalDuration = r2
                return r2
        }
    }

    private static abstract class Transition {
        private Transition() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Transition(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean canReverse() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void reverse() {
                r0 = this;
                return
        }

        public abstract void start();

        public abstract void stop();
    }

    static {
            java.lang.Class<androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat> r0 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.class
            java.lang.String r0 = r0.getSimpleName()
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.LOGTAG = r0
            return
    }

    public AnimatedStateListDrawableCompat() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    AnimatedStateListDrawableCompat(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState r3, android.content.res.Resources r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r0 = -1
            r2.mTransitionToIndex = r0
            r2.mTransitionFromIndex = r0
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState
            r0.<init>(r3, r2, r4)
            r2.setConstantState(r0)
            int[] r1 = r2.getState()
            r2.onStateChange(r1)
            r2.jumpToCurrentState()
            return
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat create(android.content.Context r7, int r8, android.content.res.Resources.Theme r9) {
            java.lang.String r0 = "parser error"
            android.content.res.Resources r1 = r7.getResources()     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            android.content.res.XmlResourceParser r2 = r1.getXml(r8)     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
        Le:
            int r4 = r2.next()     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            r5 = r4
            r6 = 2
            if (r4 == r6) goto L1a
            r4 = 1
            if (r5 == r4) goto L1a
            goto Le
        L1a:
            if (r5 != r6) goto L21
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = createFromXmlInner(r7, r1, r2, r3, r9)     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            return r0
        L21:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            java.lang.String r6 = "No start tag found"
            r4.<init>(r6)     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
            throw r4     // Catch: java.io.IOException -> L29 org.xmlpull.v1.XmlPullParserException -> L30
        L29:
            r1 = move-exception
            java.lang.String r2 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.LOGTAG
            android.util.Log.e(r2, r0, r1)
            goto L37
        L30:
            r1 = move-exception
            java.lang.String r2 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.LOGTAG
            android.util.Log.e(r2, r0, r1)
        L37:
            r0 = 0
            return r0
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat createFromXmlInner(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "animated-selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r1 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
            r1.<init>()
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.inflate(r3, r4, r5, r6, r7)
            return r2
        L1b:
            r3 = r8
            r4 = r9
            r5 = r10
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r5.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = ": invalid animated-selector tag "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private void inflateChildElements(android.content.Context r7, android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = this;
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r9.next()
            r3 = r2
            if (r2 == r1) goto L3e
            int r2 = r9.getDepth()
            r4 = r2
            if (r2 >= r0) goto L17
            r2 = 3
            if (r3 == r2) goto L3e
        L17:
            r2 = 2
            if (r3 == r2) goto L1b
            goto L6
        L1b:
            if (r4 <= r0) goto L1e
            goto L6
        L1e:
            java.lang.String r2 = r9.getName()
            java.lang.String r5 = "item"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L2e
            r6.parseItem(r7, r8, r9, r10, r11)
            goto L6
        L2e:
            java.lang.String r2 = r9.getName()
            java.lang.String r5 = "transition"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L6
            r6.parseTransition(r7, r8, r9, r10, r11)
            goto L6
        L3e:
            return
    }

    private void init() {
            r1 = this;
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    private int parseItem(android.content.Context r11, android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r10 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r12, r15, r14, r0)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            r2 = 0
            int r3 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_drawable
            r4 = -1
            int r3 = r0.getResourceId(r3, r4)
            if (r3 <= 0) goto L1f
            androidx.appcompat.widget.ResourceManagerInternal r4 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r11, r3)
        L1f:
            r0.recycle()
            int[] r4 = r10.extractStateSet(r14)
            java.lang.String r5 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r2 != 0) goto L68
        L2a:
            int r6 = r13.next()
            r7 = r6
            r8 = 4
            if (r6 != r8) goto L33
            goto L2a
        L33:
            r6 = 2
            if (r7 != r6) goto L4d
            java.lang.String r6 = r13.getName()
            java.lang.String r8 = "vector"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r2 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r12, r13, r14, r15)
            goto L68
        L47:
            android.graphics.drawable.Drawable r2 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r12, r13, r14, r15)
            goto L68
        L4d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r13.getPositionDescription()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r5 = r8.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L68:
            if (r2 == 0) goto L71
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r5 = r10.mState
            int r5 = r5.addStateSet(r4, r2, r1)
            return r5
        L71:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r13.getPositionDescription()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private int parseTransition(android.content.Context r16, android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r15 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition
            r1 = r17
            r2 = r19
            r3 = r20
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r1, r3, r2, r0)
            int r4 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_fromId
            r5 = -1
            int r4 = r0.getResourceId(r4, r5)
            int r6 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_toId
            int r6 = r0.getResourceId(r6, r5)
            r7 = 0
            int r8 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_drawable
            int r8 = r0.getResourceId(r8, r5)
            if (r8 <= 0) goto L2d
            androidx.appcompat.widget.ResourceManagerInternal r9 = androidx.appcompat.widget.ResourceManagerInternal.get()
            r10 = r16
            android.graphics.drawable.Drawable r7 = r9.getDrawable(r10, r8)
            goto L2f
        L2d:
            r10 = r16
        L2f:
            int r9 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_reversible
            r11 = 0
            boolean r9 = r0.getBoolean(r9, r11)
            r0.recycle()
            java.lang.String r11 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r7 != 0) goto L7b
        L3d:
            int r12 = r18.next()
            r13 = r12
            r14 = 4
            if (r12 != r14) goto L46
            goto L3d
        L46:
            r12 = 2
            if (r13 != r12) goto L60
            java.lang.String r12 = r18.getName()
            java.lang.String r14 = "animated-vector"
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L5a
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r7 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r16, r17, r18, r19, r20)
            goto L7b
        L5a:
            android.graphics.drawable.Drawable r7 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r17, r18, r19, r20)
            goto L7b
        L60:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = r18.getPositionDescription()
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r5.<init>(r11)
            throw r5
        L7b:
            if (r7 == 0) goto La5
            if (r4 == r5) goto L88
            if (r6 == r5) goto L88
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r5 = r15.mState
            int r5 = r5.addTransition(r4, r6, r7, r9)
            return r5
        L88:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r18.getPositionDescription()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r5.<init>(r11)
            throw r5
        La5:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r18.getPositionDescription()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r5.<init>(r11)
            throw r5
    }

    private boolean selectTransition(int r13) {
            r12 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r0 = r12.mTransition
            r1 = 1
            if (r0 == 0) goto L24
            int r2 = r12.mTransitionToIndex
            if (r13 != r2) goto La
            return r1
        La:
            int r2 = r12.mTransitionFromIndex
            if (r13 != r2) goto L1e
            boolean r2 = r0.canReverse()
            if (r2 == 0) goto L1e
            r0.reverse()
            int r2 = r12.mTransitionFromIndex
            r12.mTransitionToIndex = r2
            r12.mTransitionFromIndex = r13
            return r1
        L1e:
            int r2 = r12.mTransitionToIndex
            r0.stop()
            goto L28
        L24:
            int r2 = r12.getCurrentIndex()
        L28:
            r3 = 0
            r12.mTransition = r3
            r3 = -1
            r12.mTransitionFromIndex = r3
            r12.mTransitionToIndex = r3
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r3 = r12.mState
            int r4 = r3.getKeyframeIdAt(r2)
            int r5 = r3.getKeyframeIdAt(r13)
            r6 = 0
            if (r5 == 0) goto L89
            if (r4 != 0) goto L40
            goto L89
        L40:
            int r7 = r3.indexOfTransition(r4, r5)
            if (r7 >= 0) goto L47
            return r6
        L47:
            boolean r8 = r3.transitionHasReversibleFlag(r4, r5)
            r12.selectDrawable(r7)
            android.graphics.drawable.Drawable r9 = r12.getCurrent()
            boolean r10 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r10 == 0) goto L63
            boolean r6 = r3.isTransitionReversed(r4, r5)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimationDrawableTransition r10 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimationDrawableTransition
            r11 = r9
            android.graphics.drawable.AnimationDrawable r11 = (android.graphics.drawable.AnimationDrawable) r11
            r10.<init>(r11, r6, r8)
            goto L7e
        L63:
            boolean r10 = r9 instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            if (r10 == 0) goto L71
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition r6 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition
            r10 = r9
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r10 = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) r10
            r6.<init>(r10)
            r10 = r6
            goto L7e
        L71:
            boolean r10 = r9 instanceof android.graphics.drawable.Animatable
            if (r10 == 0) goto L88
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatableTransition r6 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatableTransition
            r10 = r9
            android.graphics.drawable.Animatable r10 = (android.graphics.drawable.Animatable) r10
            r6.<init>(r10)
            r10 = r6
        L7e:
            r10.start()
            r12.mTransition = r10
            r12.mTransitionFromIndex = r2
            r12.mTransitionToIndex = r13
            return r1
        L88:
            return r6
        L89:
            return r6
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray r4) {
            r3 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r3.mState
            int r1 = r0.mChangingConfigurations
            int r2 = androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(r4)
            r1 = r1 | r2
            r0.mChangingConfigurations = r1
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r2 = r0.mVariablePadding
            boolean r1 = r4.getBoolean(r1, r2)
            r0.setVariablePadding(r1)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_constantSize
            boolean r2 = r0.mConstantSize
            boolean r1 = r4.getBoolean(r1, r2)
            r0.setConstantSize(r1)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r2 = r0.mEnterFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.setEnterFadeDuration(r1)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r2 = r0.mExitFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.setExitFadeDuration(r1)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_dither
            boolean r2 = r0.mDither
            boolean r1 = r4.getBoolean(r1, r2)
            r3.setDither(r1)
            return
    }

    public void addState(int[] r2, android.graphics.drawable.Drawable r3, int r4) {
            r1 = this;
            androidx.core.util.ObjectsCompat.requireNonNull(r3)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.addStateSet(r2, r3, r4)
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int r2, int r3, T r4, boolean r5) {
            r1 = this;
            androidx.core.util.ObjectsCompat.requireNonNull(r4)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.addTransition(r2, r3, r4, r5)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void clearMutated() {
            r1 = this;
            super.clearMutated()
            r0 = 0
            r1.mMutated = r0
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState cloneConstantState() {
            r3 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r1 = r3.mState
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* bridge */ /* synthetic */ androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.cloneConstantState()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* bridge */ /* synthetic */ androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.cloneConstantState()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(android.content.Context r4, android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r5, r8, r7, r0)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_visible
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.updateStateFromTypedArray(r0)
            r3.updateDensity(r5)
            r0.recycle()
            r3.inflateChildElements(r4, r5, r6, r7, r8)
            r3.init()
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r0 = r1.mTransition
            if (r0 == 0) goto L19
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r0 = r1.mTransition
            r0.stop()
            r0 = 0
            r1.mTransition = r0
            int r0 = r1.mTransitionToIndex
            r1.selectDrawable(r0)
            r0 = -1
            r1.mTransitionToIndex = r0
            r1.mTransitionFromIndex = r0
        L19:
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.mMutated
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L12
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.mutate()
            r0 = 1
            r1.mMutated = r0
        L12:
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r5) {
            r4 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r4.mState
            int r0 = r0.indexOfKeyframe(r5)
            int r1 = r4.getCurrentIndex()
            if (r0 == r1) goto L1a
            boolean r1 = r4.selectTransition(r0)
            if (r1 != 0) goto L18
            boolean r1 = r4.selectDrawable(r0)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            android.graphics.drawable.Drawable r2 = r4.getCurrent()
            if (r2 == 0) goto L26
            boolean r3 = r2.setState(r5)
            r1 = r1 | r3
        L26:
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r2) {
            r1 = this;
            super.setConstantState(r2)
            boolean r0 = r2 instanceof androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = (androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) r0
            r1.mState = r0
        Lc:
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r1 = r2.mTransition
            if (r1 == 0) goto L17
            if (r0 != 0) goto Lc
            if (r4 == 0) goto L17
        Lc:
            if (r3 == 0) goto L14
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r1 = r2.mTransition
            r1.start()
            goto L17
        L14:
            r2.jumpToCurrentState()
        L17:
            return r0
    }
}
