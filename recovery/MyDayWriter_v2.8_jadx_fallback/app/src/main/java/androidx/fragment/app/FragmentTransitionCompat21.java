package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentTransitionCompat21 extends androidx.fragment.app.FragmentTransitionImpl {






    FragmentTransitionCompat21() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean hasSimpleTarget(android.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetTypes()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = r2
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.addTarget(r3)
        L8:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(java.lang.Object r6, java.util.ArrayList<android.view.View> r7) {
            r5 = this;
            r0 = r6
            android.transition.Transition r0 = (android.transition.Transition) r0
            if (r0 != 0) goto L6
            return
        L6:
            boolean r1 = r0 instanceof android.transition.TransitionSet
            if (r1 == 0) goto L1f
            r1 = r0
            android.transition.TransitionSet r1 = (android.transition.TransitionSet) r1
            int r2 = r1.getTransitionCount()
            r3 = 0
        L12:
            if (r3 >= r2) goto L1e
            android.transition.Transition r4 = r1.getTransitionAt(r3)
            r5.addTargets(r4, r7)
            int r3 = r3 + 1
            goto L12
        L1e:
            goto L42
        L1f:
            boolean r1 = hasSimpleTarget(r0)
            if (r1 != 0) goto L42
            java.util.List r1 = r0.getTargets()
            boolean r2 = isNullOrEmpty(r1)
            if (r2 == 0) goto L43
            int r2 = r7.size()
            r3 = 0
        L34:
            if (r3 >= r2) goto L43
            java.lang.Object r4 = r7.get(r3)
            android.view.View r4 = (android.view.View) r4
            r0.addTarget(r4)
            int r3 = r3 + 1
            goto L34
        L42:
        L43:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(android.view.ViewGroup r2, java.lang.Object r3) {
            r1 = this;
            r0 = r3
            android.transition.Transition r0 = (android.transition.Transition) r0
            android.transition.TransitionManager.beginDelayedTransition(r2, r0)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.transition.Transition
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object cloneTransition(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = r3
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r0 = r1.clone()
        La:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean isSeekingSupported() {
            r2 = this;
            r0 = 4
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."
            android.util.Log.i(r0, r1)
        Le:
            r0 = 0
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean isSeekingSupported(java.lang.Object r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Predictive back not available for framework transition "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L25:
            r0 = 0
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsInSequence(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            r0 = 0
            r1 = r7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r2 = r8
            android.transition.Transition r2 = (android.transition.Transition) r2
            r3 = r9
            android.transition.Transition r3 = (android.transition.Transition) r3
            if (r1 == 0) goto L21
            if (r2 == 0) goto L21
            android.transition.TransitionSet r4 = new android.transition.TransitionSet
            r4.<init>()
            android.transition.TransitionSet r4 = r4.addTransition(r1)
            android.transition.TransitionSet r4 = r4.addTransition(r2)
            r5 = 1
            android.transition.TransitionSet r0 = r4.setOrdering(r5)
            goto L28
        L21:
            if (r1 == 0) goto L25
            r0 = r1
            goto L28
        L25:
            if (r2 == 0) goto L28
            r0 = r2
        L28:
            if (r3 == 0) goto L38
            android.transition.TransitionSet r4 = new android.transition.TransitionSet
            r4.<init>()
            if (r0 == 0) goto L34
            r4.addTransition(r0)
        L34:
            r4.addTransition(r3)
            return r4
        L38:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsTogether(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r3 == 0) goto Ld
            r1 = r3
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
        Ld:
            if (r4 == 0) goto L15
            r1 = r4
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
        L15:
            if (r5 == 0) goto L1d
            r1 = r5
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
        L1d:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = r2
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.removeTarget(r3)
        L8:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(java.lang.Object r6, java.util.ArrayList<android.view.View> r7, java.util.ArrayList<android.view.View> r8) {
            r5 = this;
            r0 = r6
            android.transition.Transition r0 = (android.transition.Transition) r0
            boolean r1 = r0 instanceof android.transition.TransitionSet
            if (r1 == 0) goto L1c
            r1 = r0
            android.transition.TransitionSet r1 = (android.transition.TransitionSet) r1
            int r2 = r1.getTransitionCount()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1b
            android.transition.Transition r4 = r1.getTransitionAt(r3)
            r5.replaceTargets(r4, r7, r8)
            int r3 = r3 + 1
            goto Lf
        L1b:
            goto L63
        L1c:
            boolean r1 = hasSimpleTarget(r0)
            if (r1 != 0) goto L63
            java.util.List r1 = r0.getTargets()
            if (r1 == 0) goto L64
            int r2 = r1.size()
            int r3 = r7.size()
            if (r2 != r3) goto L64
            boolean r2 = r1.containsAll(r7)
            if (r2 == 0) goto L64
            if (r8 != 0) goto L3c
            r2 = 0
            goto L40
        L3c:
            int r2 = r8.size()
        L40:
            r3 = 0
        L41:
            if (r3 >= r2) goto L4f
            java.lang.Object r4 = r8.get(r3)
            android.view.View r4 = (android.view.View) r4
            r0.addTarget(r4)
            int r3 = r3 + 1
            goto L41
        L4f:
            int r3 = r7.size()
            int r3 = r3 + (-1)
        L55:
            if (r3 < 0) goto L64
            java.lang.Object r4 = r7.get(r3)
            android.view.View r4 = (android.view.View) r4
            r0.removeTarget(r4)
            int r3 = r3 + (-1)
            goto L55
        L63:
        L64:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(java.lang.Object r3, android.view.View r4, java.util.ArrayList<android.view.View> r5) {
            r2 = this;
            r0 = r3
            android.transition.Transition r0 = (android.transition.Transition) r0
            androidx.fragment.app.FragmentTransitionCompat21$2 r1 = new androidx.fragment.app.FragmentTransitionCompat21$2
            r1.<init>(r2, r4, r5)
            r0.addListener(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(java.lang.Object r10, java.lang.Object r11, java.util.ArrayList<android.view.View> r12, java.lang.Object r13, java.util.ArrayList<android.view.View> r14, java.lang.Object r15, java.util.ArrayList<android.view.View> r16) {
            r9 = this;
            r0 = r10
            android.transition.Transition r0 = (android.transition.Transition) r0
            androidx.fragment.app.FragmentTransitionCompat21$3 r1 = new androidx.fragment.app.FragmentTransitionCompat21$3
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object r3, android.graphics.Rect r4) {
            r2 = this;
            if (r3 == 0) goto Ld
            r0 = r3
            android.transition.Transition r0 = (android.transition.Transition) r0
            androidx.fragment.app.FragmentTransitionCompat21$5 r1 = new androidx.fragment.app.FragmentTransitionCompat21$5
            r1.<init>(r2, r4)
            r0.setEpicenterCallback(r1)
        Ld:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object r4, android.view.View r5) {
            r3 = this;
            if (r5 == 0) goto L15
            r0 = r4
            android.transition.Transition r0 = (android.transition.Transition) r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsOnScreen(r5, r1)
            androidx.fragment.app.FragmentTransitionCompat21$1 r2 = new androidx.fragment.app.FragmentTransitionCompat21$1
            r2.<init>(r3, r1)
            r0.setEpicenterCallback(r2)
        L15:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment r3, java.lang.Object r4, androidx.core.os.CancellationSignal r5, java.lang.Runnable r6) {
            r2 = this;
            r0 = r4
            android.transition.Transition r0 = (android.transition.Transition) r0
            androidx.fragment.app.FragmentTransitionCompat21$4 r1 = new androidx.fragment.app.FragmentTransitionCompat21$4
            r1.<init>(r2, r6)
            r0.addListener(r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(java.lang.Object r6, android.view.View r7, java.util.ArrayList<android.view.View> r8) {
            r5 = this;
            r0 = r6
            android.transition.TransitionSet r0 = (android.transition.TransitionSet) r0
            java.util.List r1 = r0.getTargets()
            r1.clear()
            int r2 = r8.size()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1d
            java.lang.Object r4 = r8.get(r3)
            android.view.View r4 = (android.view.View) r4
            bfsAddViewChildren(r1, r4)
            int r3 = r3 + 1
            goto Lf
        L1d:
            r1.add(r7)
            r8.add(r7)
            r5.addTargets(r0, r8)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(java.lang.Object r3, java.util.ArrayList<android.view.View> r4, java.util.ArrayList<android.view.View> r5) {
            r2 = this;
            r0 = r3
            android.transition.TransitionSet r0 = (android.transition.TransitionSet) r0
            if (r0 == 0) goto L16
            java.util.List r1 = r0.getTargets()
            r1.clear()
            java.util.List r1 = r0.getTargets()
            r1.addAll(r5)
            r2.replaceTargets(r0, r4, r5)
        L16:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object wrapTransitionInSet(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            r1 = r3
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
            return r0
    }
}
