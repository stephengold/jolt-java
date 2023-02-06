package jolt.core;

import jolt.jni.JniBind;
import jolt.jni.JniBindDelete;
import jolt.jni.JniInclude;
import jolt.jni.JniType;

@JniInclude("<Jolt/Core/JobSystemThreadPool.h>")
@JniType("JobSystemThreadPool")
/**
 * Implementation of a JobSystem using a thread pool
 * <p>
 * Note that this is considered an example implementation. It is expected that when you integrate
 * the physics engine into your own project that you'll provide your own implementation of the
 * JobSystem built on top of whatever job system your project uses.
 */
public final class JobSystemThreadPool extends JobSystem {
    private JobSystemThreadPool(long address) { super(address); }
    public static JobSystemThreadPool ref(long address) { return address == 0 ? null : new JobSystemThreadPool(address); }

    @Override
    public void delete() {
        if (address == 0L) throw new IllegalStateException(NATIVE_OBJECT_DELETED);
        _delete(address);
        address = 0;
    }
    @JniBindDelete
    private static native void _delete(long _a);

    /**
     * Creates a thread pool.
     * @param maxJobs Max number of jobs that can be allocated at any time.
     * @param maxBarriers Max number of barriers that can be allocated at any time.
     * @param numThreads Number of threads to start (the number of concurrent jobs is 1 more because the main thread will also run jobs while waiting for a barrier to complete). Use -1 to autodetect the amount of CPUs.
     */
    public JobSystemThreadPool(int maxJobs, int maxBarriers, int numThreads) {
        address = _ctor(maxJobs, maxBarriers, numThreads);
    }
    @JniBind("return (jlong) new JobSystemThreadPool(maxJobs, maxBarriers, numThreads);")
    private static native long _ctor(int maxJobs, int maxBarriers, int numThreads);
}