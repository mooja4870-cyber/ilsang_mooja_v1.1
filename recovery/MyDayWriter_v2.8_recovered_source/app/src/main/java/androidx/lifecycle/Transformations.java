package androidx.lifecycle;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001aB\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00070\u0006H\u0007\u001a8\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\tH\u0007\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\u0010\u0005\u001a \u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u00070\u0006H\u0007\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\tH\u0007¨\u0006\f"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "mapFunction", "Landroidx/arch/core/util/Function;", "switchMap", "switchMapFunction", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Transformations {






    public static final <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(androidx.lifecycle.LiveData<X> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            r2 = 1
            r1.element = r2
            boolean r2 = r4.isInitialized()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r4.getValue()
            r0.setValue(r2)
            r2 = 0
            r1.element = r2
        L22:
            androidx.lifecycle.Transformations$distinctUntilChanged$1 r2 = new androidx.lifecycle.Transformations$distinctUntilChanged$1
            r2.<init>(r0, r1)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r3 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r3.<init>(r2)
            androidx.lifecycle.Observer r3 = (androidx.lifecycle.Observer) r3
            r0.addSource(r4, r3)
            r2 = r0
            androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.lifecycle.LiveData map(androidx.lifecycle.LiveData r3, androidx.arch.core.util.Function r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "mapFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$2 r1 = new androidx.lifecycle.Transformations$map$2
            r1.<init>(r0, r4)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r2 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            androidx.lifecycle.Observer r2 = (androidx.lifecycle.Observer) r2
            r0.addSource(r3, r2)
            r1 = r0
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            return r1
    }

    public static final <X, Y> androidx.lifecycle.LiveData<Y> map(androidx.lifecycle.LiveData<X> r3, kotlin.jvm.functions.Function1<X, Y> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$map$1 r1 = new androidx.lifecycle.Transformations$map$1
            r1.<init>(r0, r4)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r2 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            androidx.lifecycle.Observer r2 = (androidx.lifecycle.Observer) r2
            r0.addSource(r3, r2)
            r1 = r0
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.lifecycle.LiveData switchMap(androidx.lifecycle.LiveData r2, androidx.arch.core.util.Function r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "switchMapFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$2 r1 = new androidx.lifecycle.Transformations$switchMap$2
            r1.<init>(r3, r0)
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            r0.addSource(r2, r1)
            r1 = r0
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            return r1
    }

    public static final <X, Y> androidx.lifecycle.LiveData<Y> switchMap(androidx.lifecycle.LiveData<X> r2, kotlin.jvm.functions.Function1<X, androidx.lifecycle.LiveData<Y>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$switchMap$1 r1 = new androidx.lifecycle.Transformations$switchMap$1
            r1.<init>(r3, r0)
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            r0.addSource(r2, r1)
            r1 = r0
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            return r1
    }
}
