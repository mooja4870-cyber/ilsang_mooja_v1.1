package androidx.activity;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u0000 À\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\n¼\u0001½\u0001¾\u0001¿\u0001À\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010\u0016J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0010\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020AH\u0015J\b\u0010D\u001a\u0004\u0018\u00010EJ\n\u0010F\u001a\u0004\u0018\u00010EH\u0017J\u0012\u0010J\u001a\u00020?2\b\b\u0001\u0010K\u001a\u00020\u0015H\u0016J\u0012\u0010J\u001a\u00020?2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u001c\u0010J\u001a\u00020?2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u001c\u0010P\u001a\u00020?2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010Q\u001a\u00020?H\u0017J\n\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u000e\u0010T\u001a\u00020?2\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u00020?2\u0006\u0010U\u001a\u00020VJ\"\u0010X\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010Z\u001a\u00020[H\u0016J\u0018\u0010\\\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020[H\u0016J\u0018\u0010]\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010`\u001a\u00020?2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010a\u001a\u00020?2\u0006\u0010b\u001a\u00020cH\u0016J\u0018\u0010a\u001a\u00020?2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u0003H\u0016J \u0010a\u001a\u00020?2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00032\u0006\u0010e\u001a\u00020fH\u0017J\u0010\u0010g\u001a\u00020?2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010h\u001a\u00020?H\u0016J\b\u0010p\u001a\u00020?H\u0002J\b\u0010z\u001a\u00020?H\u0017J\u0012\u0010\u0081\u0001\u001a\u00020?2\u0007\u0010\u0082\u0001\u001a\u00020|H\u0003J\u001b\u0010\u0087\u0001\u001a\u00020?2\u0007\u0010\u0088\u0001\u001a\u0002042\u0007\u0010\u0089\u0001\u001a\u00020\u0015H\u0017J&\u0010\u0087\u0001\u001a\u00020?2\u0007\u0010\u0088\u0001\u001a\u0002042\u0007\u0010\u0089\u0001\u001a\u00020\u00152\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010AH\u0017JB\u0010\u008b\u0001\u001a\u00020?2\b\u0010\u0088\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u00152\t\u0010\u008d\u0001\u001a\u0004\u0018\u0001042\u0007\u0010\u008e\u0001\u001a\u00020\u00152\u0007\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020\u0015H\u0017JM\u0010\u008b\u0001\u001a\u00020?2\b\u0010\u0088\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u00152\t\u0010\u008d\u0001\u001a\u0004\u0018\u0001042\u0007\u0010\u008e\u0001\u001a\u00020\u00152\u0007\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020\u00152\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010AH\u0017J&\u0010\u0091\u0001\u001a\u00020?2\u0007\u0010\u0089\u0001\u001a\u00020\u00152\u0007\u0010\u0092\u0001\u001a\u00020\u00152\t\u0010\u0093\u0001\u001a\u0004\u0018\u000104H\u0015J3\u0010\u0094\u0001\u001a\u00020?2\u0007\u0010\u0089\u0001\u001a\u00020\u00152\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0017¢\u0006\u0003\u0010\u009a\u0001JO\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010\u009c\u0001\"\u0005\b\u0000\u0010\u009d\u0001\"\u0005\b\u0001\u0010\u009e\u00012\u0016\u0010\u009f\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u009d\u0001\u0012\u0005\u0012\u0003H\u009e\u00010 \u00012\u0007\u0010¡\u0001\u001a\u00020+2\u000f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009e\u00010£\u0001JF\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010\u009c\u0001\"\u0005\b\u0000\u0010\u009d\u0001\"\u0005\b\u0001\u0010\u009e\u00012\u0016\u0010\u009f\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u009d\u0001\u0012\u0005\u0012\u0003H\u009e\u00010 \u00012\u000f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009e\u00010£\u0001J\u0012\u0010¤\u0001\u001a\u00020?2\u0007\u0010¥\u0001\u001a\u000201H\u0017J\u0015\u0010¦\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020100J\u0015\u0010§\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020100J\u0012\u0010¨\u0001\u001a\u00020?2\u0007\u0010©\u0001\u001a\u00020\u0015H\u0017J\u0015\u0010ª\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001500J\u0015\u0010«\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001500J\u0012\u0010¬\u0001\u001a\u00020?2\u0007\u0010\u0088\u0001\u001a\u000204H\u0015J\u0015\u0010\u00ad\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020400J\u0015\u0010®\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020400J\u0012\u0010¯\u0001\u001a\u00020?2\u0007\u0010°\u0001\u001a\u00020<H\u0017J\u001b\u0010¯\u0001\u001a\u00020?2\u0007\u0010°\u0001\u001a\u00020<2\u0007\u0010¥\u0001\u001a\u000201H\u0017J\u0015\u0010±\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020600J\u0015\u0010²\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020600J\u0012\u0010³\u0001\u001a\u00020?2\u0007\u0010´\u0001\u001a\u00020<H\u0017J\u001b\u0010³\u0001\u001a\u00020?2\u0007\u0010´\u0001\u001a\u00020<2\u0007\u0010¥\u0001\u001a\u000201H\u0017J\u0015\u0010µ\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020800J\u0015\u0010¶\u0001\u001a\u00020?2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020800J\t\u0010·\u0001\u001a\u00020?H\u0015J\u000f\u0010¸\u0001\u001a\u00020?2\u0006\u0010U\u001a\u00020:J\u000f\u0010¹\u0001\u001a\u00020?2\u0006\u0010U\u001a\u00020:J\t\u0010º\u0001\u001a\u00020?H\u0016J\t\u0010»\u0001\u001a\u00020!H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0013R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0012\u0010\u0014\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0015000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010G\u001a\u0004\u0018\u00010E8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010i\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001b\u0010q\u001a\u00020r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bu\u0010'\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020w8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\"\u0010{\u001a\u00020|8FX\u0086\u0084\u0002¢\u0006\u0013\n\u0005\b\u0080\u0001\u0010'\u0012\u0004\b}\u0010\u0013\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0083\u0001\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006Á\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "contentLayoutId", "", "(I)V", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "fullyDrawnReporter", "Landroidx/activity/FullyDrawnReporter;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/core/util/Consumer;", "Landroid/content/res/Configuration;", "onTrimMemoryListeners", "onNewIntentListeners", "Landroid/content/Intent;", "onMultiWindowModeChangedListeners", "Landroidx/core/app/MultiWindowModeChangedInfo;", "onPictureInPictureModeChangedListeners", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "onUserLeaveHintListeners", "Ljava/lang/Runnable;", "dispatchingOnMultiWindowModeChanged", "", "dispatchingOnPictureInPictureModeChanged", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onRetainNonConfigurationInstance", "", "onRetainCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "getLastCustomNonConfigurationInstance", "()Ljava/lang/Object;", "setContentView", "layoutResID", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "addContentView", "initializeViewTreeOwners", "peekAvailableContext", "Landroid/content/Context;", "addOnContextAvailableListener", "listener", "Landroidx/activity/contextaware/OnContextAvailableListener;", "removeOnContextAvailableListener", "onPreparePanel", "featureId", "menu", "Landroid/view/Menu;", "onCreatePanelMenu", "onMenuItemSelected", "item", "Landroid/view/MenuItem;", "onPanelClosed", "addMenuProvider", "provider", "Landroidx/core/view/MenuProvider;", "owner", "state", "Landroidx/lifecycle/Lifecycle$State;", "removeMenuProvider", "invalidateMenu", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "viewModelStore", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "ensureViewModelStore", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "onBackPressed", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher$delegate", "addObserverForBackInvoker", "dispatcher", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "startActivityForResult", "intent", "requestCode", "options", "startIntentSenderForResult", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "onActivityResult", "resultCode", "data", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "registerForActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "registry", "callback", "Landroidx/activity/result/ActivityResultCallback;", "onConfigurationChanged", "newConfig", "addOnConfigurationChangedListener", "removeOnConfigurationChangedListener", "onTrimMemory", "level", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "addOnNewIntentListener", "removeOnNewIntentListener", "onMultiWindowModeChanged", "isInMultiWindowMode", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "addOnUserLeaveHintListener", "removeOnUserLeaveHintListener", "reportFullyDrawn", "createFullyDrawnExecutor", "NonConfigurationInstances", "Api33Impl", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.ContextAware, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.activity.result.ActivityResultCaller, androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnNewIntentProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.core.app.OnUserLeaveHintProvider, androidx.core.view.MenuHost, androidx.activity.FullyDrawnReporterOwner {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final androidx.activity.ComponentActivity.Companion Companion = null;
    private androidx.lifecycle.ViewModelStore _viewModelStore;
    private final androidx.activity.result.ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final androidx.activity.contextaware.ContextAwareHelper contextAwareHelper;
    private final kotlin.Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final kotlin.Lazy fullyDrawnReporter$delegate;
    private final androidx.core.view.MenuHostHelper menuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger nextLocalRequestCode;
    private final kotlin.Lazy onBackPressedDispatcher$delegate;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> onConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> onNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> onTrimMemoryListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<java.lang.Runnable> onUserLeaveHintListeners;
    private final androidx.activity.ComponentActivity.ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final androidx.savedstate.SavedStateRegistryController savedStateRegistryController;


    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/ComponentActivity$Api33Impl;", "", "<init>", "()V", "getOnBackInvokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "activity", "Landroid/app/Activity;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Api33Impl {
        public static final androidx.activity.ComponentActivity.Api33Impl INSTANCE = null;

        static {
                androidx.activity.ComponentActivity$Api33Impl r0 = new androidx.activity.ComponentActivity$Api33Impl
                r0.<init>()
                androidx.activity.ComponentActivity.Api33Impl.INSTANCE = r0
                return
        }

        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.window.OnBackInvokedDispatcher r0 = r3.getOnBackInvokedDispatcher()
                java.lang.String r1 = "getOnBackInvokedDispatcher(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "<init>", "()V", "ACTIVITY_RESULT_TAG", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "<init>", "()V", "custom", "getCustom", "()Ljava/lang/Object;", "setCustom", "(Ljava/lang/Object;)V", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NonConfigurationInstances {
        private java.lang.Object custom;
        private androidx.lifecycle.ViewModelStore viewModelStore;

        public NonConfigurationInstances() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Object getCustom() {
                r1 = this;
                java.lang.Object r0 = r1.custom
                return r0
        }

        public final androidx.lifecycle.ViewModelStore getViewModelStore() {
                r1 = this;
                androidx.lifecycle.ViewModelStore r0 = r1.viewModelStore
                return r0
        }

        public final void setCustom(java.lang.Object r1) {
                r0 = this;
                r0.custom = r1
                return
        }

        public final void setViewModelStore(androidx.lifecycle.ViewModelStore r1) {
                r0 = this;
                r0.viewModelStore = r1
                return
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "viewCreated", "", "view", "Landroid/view/View;", "activityDestroyed", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface ReportFullyDrawnExecutor extends java.util.concurrent.Executor {
        void activityDestroyed();

        void viewCreated(android.view.View r1);
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "endWatchTimeMillis", "", "getEndWatchTimeMillis", "()J", "currentRunnable", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "(Ljava/lang/Runnable;)V", "onDrawScheduled", "", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "viewCreated", "", "view", "Landroid/view/View;", "activityDestroyed", "execute", "runnable", "onDraw", "run", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class ReportFullyDrawnExecutorImpl implements androidx.activity.ComponentActivity.ReportFullyDrawnExecutor, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {
        private java.lang.Runnable currentRunnable;
        private final long endWatchTimeMillis;
        private boolean onDrawScheduled;
        final /* synthetic */ androidx.activity.ComponentActivity this$0;

        public static /* synthetic */ void $r8$lambda$0sNsUdVD3QenIrnQ9NJ_gPQ5x8k(androidx.activity.ComponentActivity.ReportFullyDrawnExecutorImpl r0) {
                execute$lambda$0(r0)
                return
        }

        public ReportFullyDrawnExecutorImpl(androidx.activity.ComponentActivity r5) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                long r0 = android.os.SystemClock.uptimeMillis()
                r2 = 10000(0x2710, float:1.4013E-41)
                long r2 = (long) r2
                long r0 = r0 + r2
                r4.endWatchTimeMillis = r0
                return
        }

        private static final void execute$lambda$0(androidx.activity.ComponentActivity.ReportFullyDrawnExecutorImpl r1) {
                java.lang.Runnable r0 = r1.currentRunnable
                if (r0 == 0) goto Lf
                java.lang.Runnable r0 = r1.currentRunnable
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r0.run()
                r0 = 0
                r1.currentRunnable = r0
            Lf:
                return
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
                r2 = this;
                androidx.activity.ComponentActivity r0 = r2.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r1 = r2
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.removeCallbacks(r1)
                androidx.activity.ComponentActivity r0 = r2.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r1 = r2
                android.view.ViewTreeObserver$OnDrawListener r1 = (android.view.ViewTreeObserver.OnDrawListener) r1
                r0.removeOnDrawListener(r1)
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.String r0 = "runnable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.currentRunnable = r4
                androidx.activity.ComponentActivity r0 = r3.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                java.lang.String r1 = "getDecorView(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r1 = r3.onDrawScheduled
                if (r1 == 0) goto L30
                android.os.Looper r1 = android.os.Looper.myLooper()
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 == 0) goto L2c
                r0.invalidate()
                goto L38
            L2c:
                r0.postInvalidate()
                goto L38
            L30:
                androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl$$ExternalSyntheticLambda0
                r1.<init>(r3)
                r0.postOnAnimation(r1)
            L38:
                return
        }

        public final java.lang.Runnable getCurrentRunnable() {
                r1 = this;
                java.lang.Runnable r0 = r1.currentRunnable
                return r0
        }

        public final long getEndWatchTimeMillis() {
                r2 = this;
                long r0 = r2.endWatchTimeMillis
                return r0
        }

        public final boolean getOnDrawScheduled() {
                r1 = this;
                boolean r0 = r1.onDrawScheduled
                return r0
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
                r6 = this;
                java.lang.Runnable r0 = r6.currentRunnable
                r1 = 0
                if (r0 == 0) goto L2a
                r0.run()
                r2 = 0
                r6.currentRunnable = r2
                androidx.activity.ComponentActivity r2 = r6.this$0
                androidx.activity.FullyDrawnReporter r2 = r2.getFullyDrawnReporter()
                boolean r2 = r2.isFullyDrawnReported()
                if (r2 == 0) goto L46
                r6.onDrawScheduled = r1
                androidx.activity.ComponentActivity r1 = r6.this$0
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                r2 = r6
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r1.post(r2)
                goto L46
            L2a:
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r6.endWatchTimeMillis
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L46
                r6.onDrawScheduled = r1
                androidx.activity.ComponentActivity r1 = r6.this$0
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                r2 = r6
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r1.post(r2)
            L46:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.activity.ComponentActivity r0 = r2.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r1 = r2
                android.view.ViewTreeObserver$OnDrawListener r1 = (android.view.ViewTreeObserver.OnDrawListener) r1
                r0.removeOnDrawListener(r1)
                return
        }

        public final void setCurrentRunnable(java.lang.Runnable r1) {
                r0 = this;
                r0.currentRunnable = r1
                return
        }

        public final void setOnDrawScheduled(boolean r1) {
                r0 = this;
                r0.onDrawScheduled = r1
                return
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(android.view.View r3) {
                r2 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r2.onDrawScheduled
                if (r0 != 0) goto L16
                r0 = 1
                r2.onDrawScheduled = r0
                android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
                r1 = r2
                android.view.ViewTreeObserver$OnDrawListener r1 = (android.view.ViewTreeObserver.OnDrawListener) r1
                r0.addOnDrawListener(r1)
            L16:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-9gONAMAcMKCHBmrRleazUz2WLI, reason: not valid java name */
    public static /* synthetic */ void m0$r8$lambda$9gONAMAcMKCHBmrRleazUz2WLI(androidx.activity.ComponentActivity r0, androidx.activity.OnBackPressedDispatcher r1) {
            onBackPressedDispatcher_delegate$lambda$13$lambda$12$lambda$11(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$IjsTv-gzWowHxumAVg4jfZUVGU4, reason: not valid java name */
    public static /* synthetic */ androidx.lifecycle.SavedStateViewModelFactory m1$r8$lambda$IjsTvgzWowHxumAVg4jfZUVGU4(androidx.activity.ComponentActivity r0) {
            androidx.lifecycle.SavedStateViewModelFactory r0 = defaultViewModelProviderFactory_delegate$lambda$9(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$R76D6h54dhbfusbS25JkaRW7pZ4(androidx.activity.ComponentActivity r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            _init_$lambda$4(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$R9RSxTPLJR-EKDc1pALe8tHeelI, reason: not valid java name */
    public static /* synthetic */ androidx.activity.OnBackPressedDispatcher m2$r8$lambda$R9RSxTPLJREKDc1pALe8tHeelI(androidx.activity.ComponentActivity r0) {
            androidx.activity.OnBackPressedDispatcher r0 = onBackPressedDispatcher_delegate$lambda$13(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$SwVrxZ3v6Cyi_K3ZzW2JnQ9Thac(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.ComponentActivity r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            addObserverForBackInvoker$lambda$14(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$WYr-Zaqt6Fd7kh9NtH0W9iWEzvo, reason: not valid java name */
    public static /* synthetic */ android.os.Bundle m3$r8$lambda$WYrZaqt6Fd7kh9NtH0W9iWEzvo(androidx.activity.ComponentActivity r0) {
            android.os.Bundle r0 = _init_$lambda$6(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$cI7dwLT0wnPzJ9a3oRpjgUF1USM(androidx.activity.ComponentActivity r0) {
            menuHostHelper$lambda$0(r0)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$e9QdE72kUTc0-WNx4MKpQUJH7JQ, reason: not valid java name */
    public static /* synthetic */ void m4$r8$lambda$e9QdE72kUTc0WNx4MKpQUJH7JQ(androidx.activity.ComponentActivity r0) {
            onBackPressedDispatcher_delegate$lambda$13$lambda$10(r0)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$mIj_XpK7TLergTVkx-POzbPfkfE, reason: not valid java name */
    public static /* synthetic */ void m5$r8$lambda$mIj_XpK7TLergTVkxPOzbPfkfE(androidx.activity.ComponentActivity r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            _init_$lambda$5(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$pMahjfYtKGoM-c7xL0d3lDZhZjM, reason: not valid java name */
    public static /* synthetic */ androidx.activity.FullyDrawnReporter m6$r8$lambda$pMahjfYtKGoMc7xL0d3lDZhZjM(androidx.activity.ComponentActivity r0) {
            androidx.activity.FullyDrawnReporter r0 = fullyDrawnReporter_delegate$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$rJkFuXcXNDbdyqJXDHYDBSwRM5c(androidx.activity.ComponentActivity r0, android.content.Context r1) {
            _init_$lambda$7(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$wTLxkHoIRWy34nH1AvP-56AZcZM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m7$r8$lambda$wTLxkHoIRWy34nH1AvP56AZcZM(androidx.activity.ComponentActivity r0) {
            kotlin.Unit r0 = fullyDrawnReporter_delegate$lambda$2$lambda$1(r0)
            return r0
    }

    static {
            androidx.activity.ComponentActivity$Companion r0 = new androidx.activity.ComponentActivity$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.ComponentActivity.Companion = r0
            return
    }

    public ComponentActivity() {
            r3 = this;
            r3.<init>()
            androidx.activity.contextaware.ContextAwareHelper r0 = new androidx.activity.contextaware.ContextAwareHelper
            r0.<init>()
            r3.contextAwareHelper = r0
            androidx.core.view.MenuHostHelper r0 = new androidx.core.view.MenuHostHelper
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.<init>(r1)
            r3.menuHostHelper = r0
            androidx.savedstate.SavedStateRegistryController$Companion r0 = androidx.savedstate.SavedStateRegistryController.Companion
            r1 = r3
            androidx.savedstate.SavedStateRegistryOwner r1 = (androidx.savedstate.SavedStateRegistryOwner) r1
            androidx.savedstate.SavedStateRegistryController r0 = r0.create(r1)
            r3.savedStateRegistryController = r0
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r3.createFullyDrawnExecutor()
            r3.reportFullyDrawnExecutor = r0
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda3 r0 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            r0.<init>(r3)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r3.fullyDrawnReporter$delegate = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r3.nextLocalRequestCode = r0
            androidx.activity.ComponentActivity$activityResultRegistry$1 r0 = new androidx.activity.ComponentActivity$activityResultRegistry$1
            r0.<init>(r3)
            androidx.activity.result.ActivityResultRegistry r0 = (androidx.activity.result.ActivityResultRegistry) r0
            r3.activityResultRegistry = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onConfigurationChangedListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onTrimMemoryListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onNewIntentListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onMultiWindowModeChangedListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onPictureInPictureModeChangedListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.onUserLeaveHintListeners = r0
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            if (r0 == 0) goto Ld9
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda4 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda4
            r1.<init>(r3)
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.addObserver(r1)
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda5 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda5
            r1.<init>(r3)
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.addObserver(r1)
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$4 r1 = new androidx.activity.ComponentActivity$4
            r1.<init>(r3)
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistryController r0 = r3.savedStateRegistryController
            r0.performAttach()
            r0 = r3
            androidx.savedstate.SavedStateRegistryOwner r0 = (androidx.savedstate.SavedStateRegistryOwner) r0
            androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(r0)
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda6 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda6
            r1.<init>(r3)
            java.lang.String r2 = "android:support:activity-result"
            r0.registerSavedStateProvider(r2, r1)
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda7 r0 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda7
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda8 r0 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda8
            r0.<init>(r3)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r3.defaultViewModelProviderFactory$delegate = r0
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda9 r0 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda9
            r0.<init>(r3)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r3.onBackPressedDispatcher$delegate = r0
            return
        Ld9:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public ComponentActivity(int r1) {
            r0 = this;
            r0.<init>()
            r0.contentLayoutId = r1
            return
    }

    private static final void _init_$lambda$4(androidx.activity.ComponentActivity r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1d
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L1d
            android.view.View r2 = r2.peekDecorView()
            if (r2 == 0) goto L1d
            r2.cancelPendingInputEvents()
        L1d:
            return
    }

    private static final void _init_$lambda$5(androidx.activity.ComponentActivity r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r2) goto L25
            androidx.activity.contextaware.ContextAwareHelper r2 = r1.contextAwareHelper
            r2.clearAvailableContext()
            boolean r2 = r1.isChangingConfigurations()
            if (r2 != 0) goto L20
            androidx.lifecycle.ViewModelStore r2 = r1.getViewModelStore()
            r2.clear()
        L20:
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r2 = r1.reportFullyDrawnExecutor
            r2.activityDestroyed()
        L25:
            return
    }

    private static final android.os.Bundle _init_$lambda$6(androidx.activity.ComponentActivity r2) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.activity.result.ActivityResultRegistry r1 = r2.activityResultRegistry
            r1.onSaveInstanceState(r0)
            return r0
    }

    private static final void _init_$lambda$7(androidx.activity.ComponentActivity r2, android.content.Context r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            java.lang.String r1 = "android:support:activity-result"
            android.os.Bundle r0 = r0.consumeRestoredStateForKey(r1)
            if (r0 == 0) goto L17
            androidx.activity.result.ActivityResultRegistry r1 = r2.activityResultRegistry
            r1.onRestoreInstanceState(r0)
        L17:
            return
    }

    public static final /* synthetic */ void access$ensureViewModelStore(androidx.activity.ComponentActivity r0) {
            r0.ensureViewModelStore()
            return
    }

    private final void addObserverForBackInvoker(androidx.activity.OnBackPressedDispatcher r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda1 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
            r1.<init>(r3, r2)
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.addObserver(r1)
            return
    }

    private static final void addObserverForBackInvoker$lambda$14(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.ComponentActivity r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r3 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r4 != r3) goto L1b
        Lf:
            androidx.activity.ComponentActivity$Api33Impl r3 = androidx.activity.ComponentActivity.Api33Impl.INSTANCE
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            android.window.OnBackInvokedDispatcher r3 = r3.getOnBackInvokedDispatcher(r0)
            r1.setOnBackInvokedDispatcher(r3)
        L1b:
            return
    }

    private final androidx.activity.ComponentActivity.ReportFullyDrawnExecutor createFullyDrawnExecutor() {
            r1 = this;
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl r0 = new androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl
            r0.<init>(r1)
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = (androidx.activity.ComponentActivity.ReportFullyDrawnExecutor) r0
            return r0
    }

    private static final androidx.lifecycle.SavedStateViewModelFactory defaultViewModelProviderFactory_delegate$lambda$9(androidx.activity.ComponentActivity r4) {
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.app.Application r1 = r4.getApplication()
            r2 = r4
            androidx.savedstate.SavedStateRegistryOwner r2 = (androidx.savedstate.SavedStateRegistryOwner) r2
            android.content.Intent r3 = r4.getIntent()
            if (r3 == 0) goto L18
            android.content.Intent r3 = r4.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            goto L19
        L18:
            r3 = 0
        L19:
            r0.<init>(r1, r2, r3)
            return r0
    }

    private final void ensureViewModelStore() {
            r2 = this;
            androidx.lifecycle.ViewModelStore r0 = r2._viewModelStore
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto L12
            androidx.lifecycle.ViewModelStore r1 = r0.getViewModelStore()
            r2._viewModelStore = r1
        L12:
            androidx.lifecycle.ViewModelStore r1 = r2._viewModelStore
            if (r1 != 0) goto L1d
            androidx.lifecycle.ViewModelStore r1 = new androidx.lifecycle.ViewModelStore
            r1.<init>()
            r2._viewModelStore = r1
        L1d:
            return
    }

    private static final androidx.activity.FullyDrawnReporter fullyDrawnReporter_delegate$lambda$2(androidx.activity.ComponentActivity r3) {
            androidx.activity.FullyDrawnReporter r0 = new androidx.activity.FullyDrawnReporter
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r1 = r3.reportFullyDrawnExecutor
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda2 r2 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    private static final kotlin.Unit fullyDrawnReporter_delegate$lambda$2$lambda$1(androidx.activity.ComponentActivity r1) {
            r1.reportFullyDrawn()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
            return
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
            return
    }

    private static final void menuHostHelper$lambda$0(androidx.activity.ComponentActivity r0) {
            r0.invalidateMenu()
            return
    }

    private static final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher_delegate$lambda$13(androidx.activity.ComponentActivity r5) {
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda10 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda10
            r1.<init>(r5)
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L35
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L32
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda11 r4 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda11
            r4.<init>(r5, r1)
            r3.post(r4)
            goto L35
        L32:
            r5.addObserverForBackInvoker(r1)
        L35:
            return r0
    }

    private static final void onBackPressedDispatcher_delegate$lambda$13$lambda$10(androidx.activity.ComponentActivity r3) {
            super.onBackPressed()     // Catch: java.lang.NullPointerException -> L5 java.lang.IllegalStateException -> L16
            goto L23
        L5:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L15
            goto L23
        L15:
            throw r0
        L16:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L24
        L23:
            return
        L24:
            throw r0
    }

    private static final void onBackPressedDispatcher_delegate$lambda$13$lambda$12$lambda$11(androidx.activity.ComponentActivity r0, androidx.activity.OnBackPressedDispatcher r1) {
            r0.addObserverForBackInvoker(r1)
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r3.reportFullyDrawnExecutor
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.viewCreated(r1)
            super.addContentView(r4, r5)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.addMenuProvider(r2)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.addMenuProvider(r2, r3)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.addMenuProvider(r2, r3, r4)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.onConfigurationChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.contextAwareHelper
            r0.addOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.onMultiWindowModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.onNewIntentListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.onPictureInPictureModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.onTrimMemoryListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Runnable> r0 = r1.onUserLeaveHintListeners
            r0.add(r2)
            return
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.activityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r4 = this;
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto L16
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            android.app.Application r3 = r4.getApplication()
            r0.set(r1, r3)
        L16:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r0.set(r1, r4)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r0.set(r1, r4)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L2a
            android.os.Bundle r2 = r1.getExtras()
        L2a:
            if (r2 == 0) goto L31
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r1 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            r0.set(r1, r2)
        L31:
            r1 = r0
            androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
            return r1
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r1 = this;
            kotlin.Lazy r0 = r1.defaultViewModelProviderFactory$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            return r0
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public androidx.activity.FullyDrawnReporter getFullyDrawnReporter() {
            r1 = this;
            kotlin.Lazy r0 = r1.fullyDrawnReporter$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.activity.FullyDrawnReporter r0 = (androidx.activity.FullyDrawnReporter) r0
            return r0
    }

    @kotlin.Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r2 = this;
            java.lang.Object r0 = r2.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto Ld
            java.lang.Object r1 = r0.getCustom()
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.Lifecycle r0 = super.getLifecycle()
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            kotlin.Lazy r0 = r1.onBackPressedDispatcher$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.savedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lf
            r2.ensureViewModelStore()
            androidx.lifecycle.ViewModelStore r0 = r2._viewModelStore
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        Lf:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void initializeViewTreeOwners() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.lifecycle.ViewModelStoreOwner r2 = (androidx.lifecycle.ViewModelStoreOwner) r2
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.savedstate.SavedStateRegistryOwner r2 = (androidx.savedstate.SavedStateRegistryOwner) r2
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.activity.OnBackPressedDispatcherOwner r2 = (androidx.activity.OnBackPressedDispatcherOwner) r2
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r3
            androidx.activity.FullyDrawnReporterOwner r1 = (androidx.activity.FullyDrawnReporterOwner) r1
            androidx.activity.ViewTreeFullyDrawnReporterOwner.set(r0, r1)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.activityResultRegistry
            boolean r0 = r0.dispatchResult(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.getOnBackPressedDispatcher()
            r0.onBackPressed()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.String r0 = "newConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r2.onConfigurationChangedListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L13
        L23:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r2.savedStateRegistryController
            r0.performRestore(r3)
            androidx.activity.contextaware.ContextAwareHelper r0 = r2.contextAwareHelper
            r1 = r2
            android.content.Context r1 = (android.content.Context) r1
            r0.dispatchOnContextAvailable(r1)
            super.onCreate(r3)
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            r0.injectIfNeededIn(r1)
            int r0 = r2.contentLayoutId
            if (r0 == 0) goto L21
            int r0 = r2.contentLayoutId
            r2.setContentView(r0)
        L21:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, android.view.Menu r4) {
            r2 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r3 != 0) goto L13
            super.onCreatePanelMenu(r3, r4)
            androidx.core.view.MenuHostHelper r0 = r2.menuHostHelper
            android.view.MenuInflater r1 = r2.getMenuInflater()
            r0.onCreateMenu(r4, r1)
        L13:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            if (r2 != 0) goto L16
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            boolean r0 = r0.onMenuItemSelected(r3)
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.dispatchingOnMultiWindowModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.onMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto L10
        L25:
            return
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            java.lang.String r0 = "newConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            r3.dispatchingOnMultiWindowModeChanged = r0
            r0 = 0
            super.onMultiWindowModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L31
            r3.dispatchingOnMultiWindowModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.onMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto L1b
        L30:
            return
        L31:
            r1 = move-exception
            r3.dispatchingOnMultiWindowModeChanged = r0
            throw r1
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r2.onNewIntentListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L13
        L23:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.onMenuClosed(r3)
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.dispatchingOnPictureInPictureModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.onPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto L10
        L25:
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            java.lang.String r0 = "newConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            r3.dispatchingOnPictureInPictureModeChanged = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L31
            r3.dispatchingOnPictureInPictureModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.onPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto L1b
        L30:
            return
        L31:
            r1 = move-exception
            r3.dispatchingOnPictureInPictureModeChanged = r0
            throw r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r2 != 0) goto Lf
            super.onPreparePanel(r2, r3, r4)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.onPrepareMenu(r4)
        Lf:
            r0 = 1
            return r0
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "grantResults"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.activity.result.ActivityResultRegistry r0 = r3.activityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.dispatchResult(r4, r2, r1)
            if (r0 != 0) goto L2b
        L28:
            super.onRequestPermissionsResult(r4, r5, r6)
        L2b:
            return
    }

    @kotlin.Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            androidx.lifecycle.ViewModelStore r1 = r3._viewModelStore
            if (r1 != 0) goto L14
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r2
            if (r2 == 0) goto L14
            androidx.lifecycle.ViewModelStore r1 = r2.getViewModelStore()
        L14:
            if (r1 != 0) goto L1a
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = new androidx.activity.ComponentActivity$NonConfigurationInstances
            r2.<init>()
            r2.setCustom(r0)
            r2.setViewModelStore(r1)
            return r2
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            boolean r0 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r0 == 0) goto L1d
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.lifecycle.LifecycleRegistry r0 = (androidx.lifecycle.LifecycleRegistry) r0
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
        L1d:
            super.onSaveInstanceState(r3)
            androidx.savedstate.SavedStateRegistryController r0 = r2.savedStateRegistryController
            r0.performSave(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r3.onTrimMemoryListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.accept(r2)
            goto Le
        L22:
            return
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
            r2 = this;
            super.onUserLeaveHint()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Runnable> r0 = r2.onUserLeaveHintListeners
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto Le
        L1e:
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public android.content.Context peekAvailableContext() {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.contextAwareHelper
            android.content.Context r0 = r0.peekAvailableContext()
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.activity.result.ActivityResultRegistry r0 = r1.activityResultRegistry
            androidx.activity.result.ActivityResultLauncher r0 = r1.registerForActivityResult(r2, r0, r3)
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r3, androidx.activity.result.ActivityResultRegistry r4, androidx.activity.result.ActivityResultCallback<O> r5) {
            r2 = this;
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activity_rq#"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.nextLocalRequestCode
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r2
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.activity.result.ActivityResultLauncher r0 = r4.register(r0, r1, r3, r5)
            return r0
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.MenuHostHelper r0 = r1.menuHostHelper
            r0.removeMenuProvider(r2)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.onConfigurationChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.contextAwareHelper
            r0.removeOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.onMultiWindowModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.onNewIntentListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.onPictureInPictureModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.onTrimMemoryListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Runnable> r0 = r1.onUserLeaveHintListeners
            r0.remove(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Lc
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1c
        Lc:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L1c
            androidx.activity.FullyDrawnReporter r0 = r1.getFullyDrawnReporter()     // Catch: java.lang.Throwable -> L1c
            r0.fullyDrawnReported()     // Catch: java.lang.Throwable -> L1c
            androidx.tracing.Trace.endSection()
            return
        L1c:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r4) {
            r3 = this;
            r3.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r3.reportFullyDrawnExecutor
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.viewCreated(r1)
            super.setContentView(r4)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r4) {
            r3 = this;
            r3.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r3.reportFullyDrawnExecutor
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.viewCreated(r1)
            super.setContentView(r4)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r3.reportFullyDrawnExecutor
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.viewCreated(r1)
            super.setContentView(r4, r5)
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            super.startActivityForResult(r2, r3)
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            super.startActivityForResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.app.Activity
    @kotlin.Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7, android.os.Bundle r8) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            super.startIntentSenderForResult(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
