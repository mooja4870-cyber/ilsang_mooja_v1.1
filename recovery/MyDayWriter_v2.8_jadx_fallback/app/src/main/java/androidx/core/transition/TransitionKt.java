package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\t\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\n\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001aÆ\u0001\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0013"}, d2 = {"doOnEnd", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "addListener", "onEnd", "onStart", "onCancel", "onResume", "onPause", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TransitionKt {






    public static final android.transition.Transition.TransitionListener addListener(android.transition.Transition r7, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r8, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r9, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r10, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r12) {
            r0 = 0
            androidx.core.transition.TransitionKt$addListener$listener$1 r1 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r2 = r8
            r6 = r9
            r5 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r1
            android.transition.Transition$TransitionListener r8 = (android.transition.Transition.TransitionListener) r8
            r7.addListener(r8)
            r8 = r1
            android.transition.Transition$TransitionListener r8 = (android.transition.Transition.TransitionListener) r8
            return r8
    }

    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L9
            androidx.core.transition.TransitionKt$addListener$1 r8 = androidx.core.transition.TransitionKt.AnonymousClass1.INSTANCE
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L9:
            r8 = r7 & 2
            if (r8 == 0) goto L14
            androidx.core.transition.TransitionKt$addListener$2 r8 = androidx.core.transition.TransitionKt.AnonymousClass2.INSTANCE
            r3 = r8
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r8 = r3
            goto L15
        L14:
            r8 = r3
        L15:
            r3 = r7 & 4
            if (r3 == 0) goto L1e
            androidx.core.transition.TransitionKt$addListener$3 r3 = androidx.core.transition.TransitionKt.AnonymousClass3.INSTANCE
            r4 = r3
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
        L1e:
            r3 = r7 & 8
            if (r3 == 0) goto L27
            androidx.core.transition.TransitionKt$addListener$4 r3 = androidx.core.transition.TransitionKt.AnonymousClass4.INSTANCE
            r5 = r3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
        L27:
            r3 = r7 & 16
            if (r3 == 0) goto L30
            androidx.core.transition.TransitionKt$addListener$5 r3 = androidx.core.transition.TransitionKt.AnonymousClass5.INSTANCE
            r6 = r3
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
        L30:
            r0 = 0
            androidx.core.transition.TransitionKt$addListener$listener$1 r3 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r7 = r4
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = r3
            android.transition.Transition$TransitionListener r2 = (android.transition.Transition.TransitionListener) r2
            r1.addListener(r2)
            r2 = r3
            android.transition.Transition$TransitionListener r2 = (android.transition.Transition.TransitionListener) r2
            return r2
    }

    public static final android.transition.Transition.TransitionListener doOnCancel(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnEnd(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnPause(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnResume(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnStart(android.transition.Transition r5, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1 r3 = new androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            r3.<init>(r6)
            r4 = r3
            android.transition.Transition$TransitionListener r4 = (android.transition.Transition.TransitionListener) r4
            r1.addListener(r4)
            r1 = r3
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            return r1
    }
}
