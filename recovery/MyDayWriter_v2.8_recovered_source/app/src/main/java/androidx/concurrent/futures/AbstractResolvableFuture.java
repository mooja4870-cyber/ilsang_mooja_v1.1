package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper ATOMIC_HELPER = null;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final java.util.logging.Logger log = null;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiters;

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AtomicHelper(androidx.concurrent.futures.AbstractResolvableFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Listener r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3);

        abstract boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, java.lang.Object r2, java.lang.Object r3);

        abstract boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3);

        abstract void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2);

        abstract void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2);
    }

    private static final class Cancellation {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_CANCELLED = null;
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_INTERRUPTED = null;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
                r1 = 0
                if (r0 == 0) goto La
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r1
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                goto L1a
            La:
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r0
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
            L1a:
                return
        }

        Cancellation(boolean r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    private static final class Failure {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Failure FALLBACK_INSTANCE = null;
        final java.lang.Throwable exception;


        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
                androidx.concurrent.futures.AbstractResolvableFuture$Failure$1 r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure$1
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        Failure(java.lang.Throwable r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.checkNotNull(r2)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.exception = r0
                return
        }
    }

    private static final class Listener {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Listener TOMBSTONE = null;
        final java.util.concurrent.Executor executor;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener next;
        final java.lang.Runnable task;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
                r1 = 0
                r0.<init>(r1, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE = r0
                return
        }

        Listener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.executor = r2
                return
        }
    }

    private static final class SafeAtomicHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.waiterThreadUpdater = r2
                r1.waiterNextUpdater = r3
                r1.waitersUpdater = r4
                r1.listenersUpdater = r5
                r1.valueUpdater = r6
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Listener> r0 = r1.listenersUpdater
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r0 = r1.valueUpdater
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r1.waitersUpdater
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final androidx.concurrent.futures.AbstractResolvableFuture<V> owner;

        SetFuture(androidx.concurrent.futures.AbstractResolvableFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<V> r0 = r3.owner
                java.lang.Object r0 = r0.value
                if (r0 == r3) goto L7
                return
            L7:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(r0)
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                androidx.concurrent.futures.AbstractResolvableFuture<V> r2 = r3.owner
                boolean r1 = r1.casValue(r2, r3, r0)
                if (r1 == 0) goto L1c
                androidx.concurrent.futures.AbstractResolvableFuture<V> r1 = r3.owner
                androidx.concurrent.futures.AbstractResolvableFuture.complete(r1)
            L1c:
                return
        }
    }

    private static final class SynchronizedHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r2.listeners     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.listeners = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 1
                return r0
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 0
                return r0
            Ld:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2.value     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.value = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 1
                return r0
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 0
                return r0
            Ld:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r2.waiters     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.waiters = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 1
                return r0
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r0 = 0
                return r0
            Ld:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    private static final class Waiter {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Waiter TOMBSTONE = null;
        volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter next;
        volatile java.lang.Thread thread;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE = r0
                return
        }

        Waiter() {
                r2 = this;
                r2.<init>()
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.putThread(r2, r1)
                return
        }

        Waiter(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void setNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2) {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                r0.putNext(r1, r2)
                return
        }

        void unpark() {
                r2 = this;
                java.lang.Thread r0 = r2.thread
                if (r0 == 0) goto La
                r1 = 0
                r2.thread = r1
                java.util.concurrent.locks.LockSupport.unpark(r0)
            La:
                return
        }
    }

    static {
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES = r0
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            androidx.concurrent.futures.AbstractResolvableFuture.log = r1
            r1 = 0
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper r2 = new androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r3 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r5 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r4 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r5 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r6 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r5 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r6 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Listener> r6 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.class
            java.lang.String r7 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r6, r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.String r8 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r7, r8)     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r0 = move-exception
            r1 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper r2 = new androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper
            r2.<init>()
        L55:
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER = r2
            java.lang.Class<java.util.concurrent.locks.LockSupport> r0 = java.util.concurrent.locks.LockSupport.class
            if (r1 == 0) goto L64
            java.util.logging.Logger r3 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE
            java.lang.String r5 = "SafeAtomicHelper is broken!"
            r3.log(r4, r5, r1)
        L64:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.concurrent.futures.AbstractResolvableFuture.NULL = r0
            return
    }

    protected AbstractResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addDoneString(java.lang.StringBuilder r5) {
            r4 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r4)     // Catch: java.lang.RuntimeException -> L19 java.util.concurrent.CancellationException -> L2e java.util.concurrent.ExecutionException -> L35
            java.lang.String r2 = "SUCCESS, result=["
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.RuntimeException -> L19 java.util.concurrent.CancellationException -> L2e java.util.concurrent.ExecutionException -> L35
            java.lang.String r3 = r4.userObjectToString(r1)     // Catch: java.lang.RuntimeException -> L19 java.util.concurrent.CancellationException -> L2e java.util.concurrent.ExecutionException -> L35
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.RuntimeException -> L19 java.util.concurrent.CancellationException -> L2e java.util.concurrent.ExecutionException -> L35
            r2.append(r0)     // Catch: java.lang.RuntimeException -> L19 java.util.concurrent.CancellationException -> L2e java.util.concurrent.ExecutionException -> L35
            goto L48
        L19:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.Class r2 = r0.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " thrown from get()]"
            r1.append(r2)
            goto L48
        L2e:
            r0 = move-exception
            java.lang.String r1 = "CANCELLED"
            r5.append(r1)
            goto L47
        L35:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.Throwable r3 = r1.getCause()
            java.lang.StringBuilder r2 = r2.append(r3)
            r2.append(r0)
        L47:
        L48:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    static <T> T checkNotNull(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    private androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners(androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
            r3 = this;
        L1:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r3, r0, r2)
            if (r1 == 0) goto L1
            r1 = r4
        Le:
            if (r0 == 0) goto L17
            r2 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r0.next
            r2.next = r1
            r1 = r2
            goto Le
        L17:
            return r1
    }

    static void complete(androidx.concurrent.futures.AbstractResolvableFuture<?> r6) {
            r0 = 0
        L1:
            r6.releaseWaiters()
            r6.afterDone()
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r6.clearListeners(r0)
            r6 = 0
        Lc:
            if (r0 == 0) goto L36
            r1 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r0.next
            java.lang.Runnable r2 = r1.task
            boolean r3 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r3 == 0) goto L30
            r3 = r2
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r3 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r3
            androidx.concurrent.futures.AbstractResolvableFuture<V> r6 = r3.owner
            java.lang.Object r4 = r6.value
            if (r4 != r3) goto L2f
            com.google.common.util.concurrent.ListenableFuture<? extends V> r4 = r3.future
            java.lang.Object r4 = getFutureValue(r4)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r5 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r5 = r5.casValue(r6, r3, r4)
            if (r5 == 0) goto L2f
            goto L1
        L2f:
            goto L35
        L30:
            java.util.concurrent.Executor r3 = r1.executor
            executeListener(r2, r3)
        L35:
            goto Lc
        L36:
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            goto L29
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " with executor "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3, r0)
        L29:
            return
    }

    private V getDoneValue(java.lang.Object r3) throws java.util.concurrent.ExecutionException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r0 != 0) goto L1b
            boolean r0 = r3 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Failure
            if (r0 != 0) goto L10
            java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
            if (r3 != r0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            return r0
        L10:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            r1 = r3
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = (androidx.concurrent.futures.AbstractResolvableFuture.Failure) r1
            java.lang.Throwable r1 = r1.exception
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = r3
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            java.lang.Throwable r0 = r0.cause
            java.lang.String r1 = "Task was cancelled."
            java.util.concurrent.CancellationException r0 = cancellationExceptionWithCause(r1, r0)
            throw r0
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r6) {
            boolean r0 = r6 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r6
            androidx.concurrent.futures.AbstractResolvableFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture) r0
            java.lang.Object r0 = r0.value
            boolean r2 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r2 == 0) goto L24
            r2 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r2
            boolean r3 = r2.wasInterrupted
            if (r3 == 0) goto L24
            java.lang.Throwable r3 = r2.cause
            if (r3 == 0) goto L21
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.lang.Throwable r4 = r2.cause
            r3.<init>(r1, r4)
            goto L23
        L21:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L23:
            r0 = r3
        L24:
            return r0
        L25:
            boolean r0 = r6.isCancelled()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            r2 = r2 ^ 1
            r2 = r2 & r0
            if (r2 == 0) goto L33
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r1 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
            return r1
        L33:
            java.lang.Object r2 = getUninterruptibly(r6)     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> L45 java.util.concurrent.ExecutionException -> L6c
            if (r2 != 0) goto L3c
            java.lang.Object r1 = androidx.concurrent.futures.AbstractResolvableFuture.NULL     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> L45 java.util.concurrent.ExecutionException -> L6c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            return r1
        L3e:
            r1 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r2 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            r2.<init>(r1)
            return r2
        L45:
            r2 = move-exception
            if (r0 != 0) goto L66
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r2)
            r1.<init>(r3)
            return r1
        L66:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            r3.<init>(r1, r2)
            return r3
        L6c:
            r1 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r2 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.Throwable r3 = r1.getCause()
            r2.<init>(r3)
            return r2
    }

    static <V> V getUninterruptibly(java.util.concurrent.Future<V> r3) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r3.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L19:
            throw r1
        L1a:
            r1 = move-exception
            r0 = 1
            goto L1
    }

    private void releaseWaiters() {
            r3 = this;
        L1:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r3.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            boolean r1 = r1.casWaiters(r3, r0, r2)
            if (r1 == 0) goto L1
            r1 = r0
        Le:
            if (r1 == 0) goto L16
            r1.unpark()
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r1 = r1.next
            goto Le
        L16:
            return
    }

    private void removeWaiter(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            r0 = 0
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r1 = r4.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r1 != r2) goto Lb
            return
        Lb:
            if (r1 == 0) goto L29
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = r1.next
            java.lang.Thread r3 = r1.thread
            if (r3 == 0) goto L15
            r0 = r1
            goto L27
        L15:
            if (r0 == 0) goto L1e
            r0.next = r2
            java.lang.Thread r3 = r0.thread
            if (r3 != 0) goto L27
            goto L3
        L1e:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r3 = r3.casWaiters(r4, r1, r2)
            if (r3 != 0) goto L27
            goto L3
        L27:
            r1 = r2
            goto Lb
        L29:
            return
    }

    private java.lang.String userObjectToString(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L5
            java.lang.String r0 = "this future"
            return r0
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            checkNotNull(r4)
            checkNotNull(r5)
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L22
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
            r1.<init>(r4, r5)
        L11:
            r1.next = r0
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r2 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r2 = r2.casListeners(r3, r0, r1)
            if (r2 == 0) goto L1c
            return
        L1c:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L11
        L22:
            executeListener(r4, r5)
            return
    }

    protected void afterDone() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r11) {
            r10 = this;
            java.lang.Object r0 = r10.value
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L9
            r4 = r2
            goto La
        L9:
            r4 = r3
        La:
            boolean r5 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r4 = r4 | r5
            if (r4 == 0) goto L64
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            if (r4 == 0) goto L20
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r4 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "Future.cancel() was called."
            r5.<init>(r6)
            r4.<init>(r11, r5)
            goto L27
        L20:
            if (r11 == 0) goto L25
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r4 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L27
        L25:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r4 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L27:
            r5 = r10
        L29:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r5, r0, r4)
            if (r6 == 0) goto L5d
            r1 = 1
            if (r11 == 0) goto L37
            r5.interruptTask()
        L37:
            complete(r5)
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r6 == 0) goto L64
            r6 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r6 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r6
            com.google.common.util.concurrent.ListenableFuture<? extends V> r6 = r6.future
            boolean r7 = r6 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            if (r7 == 0) goto L59
            r7 = r6
            androidx.concurrent.futures.AbstractResolvableFuture r7 = (androidx.concurrent.futures.AbstractResolvableFuture) r7
            java.lang.Object r0 = r7.value
            if (r0 != 0) goto L50
            r8 = r2
            goto L51
        L50:
            r8 = r3
        L51:
            boolean r9 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r8 = r8 | r9
            if (r8 == 0) goto L58
            r5 = r7
            goto L29
        L58:
            goto L5c
        L59:
            r6.cancel(r11)
        L5c:
            goto L64
        L5d:
            java.lang.Object r0 = r5.value
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r6 != 0) goto L29
        L64:
            return r1
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r7 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r1 = r7.getDoneValue(r0)
            return r1
        L1a:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = r7.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r4 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r3 == r4) goto L5a
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r4 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r4.<init>()
        L25:
            r4.setNext(r3)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r5 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r5 = r5.casWaiters(r7, r3, r4)
            if (r5 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r7)
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L4b
            java.lang.Object r0 = r7.value
            if (r0 == 0) goto L3f
            r5 = r2
            goto L40
        L3f:
            r5 = r1
        L40:
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r6 = r6 ^ r2
            r5 = r5 & r6
            if (r5 == 0) goto L30
            java.lang.Object r1 = r7.getDoneValue(r0)
            return r1
        L4b:
            r7.removeWaiter(r4)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L54:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = r7.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r5 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r3 != r5) goto L25
        L5a:
            java.lang.Object r1 = r7.value
            java.lang.Object r1 = r7.getDoneValue(r1)
            return r1
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r28, java.util.concurrent.TimeUnit r30) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r30
            long r4 = r3.toNanos(r1)
            r6 = r4
            boolean r8 = java.lang.Thread.interrupted()
            if (r8 != 0) goto L1e5
            java.lang.Object r8 = r0.value
            r10 = 1
            if (r8 == 0) goto L18
            r11 = r10
            goto L19
        L18:
            r11 = 0
        L19:
            boolean r12 = r8 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r12 = r12 ^ r10
            r11 = r11 & r12
            if (r11 == 0) goto L24
            java.lang.Object r9 = r0.getDoneValue(r8)
            return r9
        L24:
            r11 = 0
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 <= 0) goto L30
            long r13 = java.lang.System.nanoTime()
            long r13 = r13 + r6
            goto L31
        L30:
            r13 = r11
        L31:
            r15 = 1000(0x3e8, double:4.94E-321)
            int r17 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r17 < 0) goto L96
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r9 = r0.waiters
            r18 = r10
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r10 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r9 == r10) goto L8f
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r10 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r10.<init>()
        L44:
            r10.setNext(r9)
            r19 = r11
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r11 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r11 = r11.casWaiters(r0, r9, r10)
            if (r11 == 0) goto L85
        L51:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r6)
            boolean r11 = java.lang.Thread.interrupted()
            if (r11 != 0) goto L7c
            java.lang.Object r8 = r0.value
            if (r8 == 0) goto L61
            r11 = r18
            goto L62
        L61:
            r11 = 0
        L62:
            boolean r12 = r8 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r12 = r12 ^ 1
            r11 = r11 & r12
            if (r11 == 0) goto L6e
            java.lang.Object r11 = r0.getDoneValue(r8)
            return r11
        L6e:
            long r11 = java.lang.System.nanoTime()
            long r6 = r13 - r11
            int r11 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r11 >= 0) goto L51
            r0.removeWaiter(r10)
            goto L9a
        L7c:
            r0.removeWaiter(r10)
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L85:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r9 = r0.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r11 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r9 != r11) goto L8c
            goto L8f
        L8c:
            r11 = r19
            goto L44
        L8f:
            java.lang.Object r10 = r0.value
            java.lang.Object r10 = r0.getDoneValue(r10)
            return r10
        L96:
            r18 = r10
            r19 = r11
        L9a:
            int r9 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r9 <= 0) goto Lc5
            java.lang.Object r8 = r0.value
            if (r8 == 0) goto La5
            r9 = r18
            goto La6
        La5:
            r9 = 0
        La6:
            boolean r10 = r8 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r10 = r10 ^ 1
            r9 = r9 & r10
            if (r9 == 0) goto Lb2
            java.lang.Object r9 = r0.getDoneValue(r8)
            return r9
        Lb2:
            boolean r9 = java.lang.Thread.interrupted()
            if (r9 != 0) goto Lbf
            long r9 = java.lang.System.nanoTime()
            long r6 = r13 - r9
            goto L9a
        Lbf:
            java.lang.InterruptedException r9 = new java.lang.InterruptedException
            r9.<init>()
            throw r9
        Lc5:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = r3.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Waited "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r12 = " "
            java.lang.StringBuilder r11 = r11.append(r12)
            r21 = r15
            java.lang.String r15 = r3.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r15.toLowerCase(r0)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r0 = r0.toString()
            long r15 = r6 + r21
            int r11 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r11 >= 0) goto L1a8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r15 = " (plus "
            java.lang.StringBuilder r11 = r11.append(r15)
            java.lang.String r0 = r11.toString()
            long r1 = -r6
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            r15 = r4
            long r4 = r3.convert(r1, r11)
            long r23 = r3.toNanos(r4)
            r25 = r1
            long r1 = r25 - r23
            int r11 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r11 == 0) goto L131
            int r11 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r11 <= 0) goto L12e
            goto L131
        L12e:
            r17 = 0
            goto L133
        L131:
            r17 = r18
        L133:
            int r11 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r11 <= 0) goto L17b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r10)
            java.lang.String r0 = r11.toString()
            if (r17 == 0) goto L168
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            r18 = r0
            java.lang.String r0 = ","
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r0 = r0.toString()
            goto L16a
        L168:
            r18 = r0
        L16a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r0 = r11.toString()
        L17b:
            if (r17 == 0) goto L194
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r12 = " nanoseconds "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r0 = r11.toString()
        L194:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r12 = "delay)"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r0 = r11.toString()
            goto L1a9
        L1a8:
            r15 = r4
        L1a9:
            boolean r1 = r27.isDone()
            if (r1 == 0) goto L1c8
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = " but future completed as timeout expired"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1c8:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1e5:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    protected void interruptTask() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            return r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r4 = this;
            java.lang.Object r0 = r4.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r3 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r1 = r1 ^ r3
            r1 = r1 & r2
            return r1
    }

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            boolean r1 = r2.isCancelled()
            r0 = r0 & r1
            if (r0 == 0) goto L13
            boolean r0 = r2.wasInterrupted()
            r3.cancel(r0)
        L13:
            return
    }

    protected java.lang.String pendingToString() {
            r4 = this;
            java.lang.Object r0 = r4.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setFuture=["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r2 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r2
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r2.future
            java.lang.String r2 = r4.userObjectToString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L29:
            boolean r1 = r4 instanceof java.util.concurrent.ScheduledFuture
            if (r1 == 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remaining delay=["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r2.getDelay(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ms]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L50:
            r1 = 0
            return r1
    }

    protected boolean set(V r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
            goto L6
        L5:
            r0 = r4
        L6:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r2 = 0
            boolean r1 = r1.casValue(r3, r2, r0)
            if (r1 == 0) goto L14
            complete(r3)
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    protected boolean setException(java.lang.Throwable r4) {
            r3 = this;
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.Object r1 = checkNotNull(r4)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.<init>(r1)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r2 = 0
            boolean r1 = r1.casValue(r3, r2, r0)
            if (r1 == 0) goto L19
            complete(r3)
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r7) {
            r6 = this;
            checkNotNull(r7)
            java.lang.Object r0 = r6.value
            r1 = 0
            if (r0 != 0) goto L47
            boolean r2 = r7.isDone()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            java.lang.Object r2 = getFutureValue(r7)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r5 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r4 = r5.casValue(r6, r4, r2)
            if (r4 == 0) goto L20
            complete(r6)
            return r3
        L20:
            return r1
        L21:
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r2 = new androidx.concurrent.futures.AbstractResolvableFuture$SetFuture
            r2.<init>(r6, r7)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r5 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r4 = r5.casValue(r6, r4, r2)
            if (r4 == 0) goto L45
            androidx.concurrent.futures.DirectExecutor r1 = androidx.concurrent.futures.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r7.addListener(r2, r1)     // Catch: java.lang.Throwable -> L34
            goto L44
        L34:
            r1 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r4 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r4 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r5 = androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE
            r4 = r5
        L3f:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r5 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r5.casValue(r6, r2, r4)
        L44:
            return r3
        L45:
            java.lang.Object r0 = r6.value
        L47:
            boolean r2 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r2 == 0) goto L53
            r2 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r2
            boolean r2 = r2.wasInterrupted
            r7.cancel(r2)
        L53:
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[status="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L21
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L6e
        L21:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L2b
            r5.addDoneString(r0)
            goto L6e
        L2b:
            java.lang.String r1 = r5.pendingToString()     // Catch: java.lang.RuntimeException -> L30
            goto L49
        L30:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Class r4 = r1.getClass()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1 = r3
        L49:
            if (r1 == 0) goto L5f
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L5f
            java.lang.String r3 = "PENDING, info=["
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            r3.append(r2)
            goto L6e
        L5f:
            boolean r3 = r5.isDone()
            if (r3 == 0) goto L69
            r5.addDoneString(r0)
            goto L6e
        L69:
            java.lang.String r3 = "PENDING"
            r0.append(r3)
        L6e:
            java.lang.StringBuilder r1 = r0.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    protected final boolean wasInterrupted() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r1 == 0) goto Lf
            r1 = r0
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r1 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r1
            boolean r1 = r1.wasInterrupted
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }
}
