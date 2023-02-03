package jolt.core;

import jolt.jni.JniBind;

public final class JobSystemThreadPool extends JobSystem {
    private JobSystemThreadPool(long address) { super(address); }
    public static JobSystemThreadPool ref(long address) { return address == 0 ? null : new JobSystemThreadPool(address); }

    public JobSystemThreadPool(int maxJobs, int maxBarriers, int numThreads) {
        address = _ctor(maxJobs, maxBarriers, numThreads);
    }
    @JniBind("return (jlong) new JobSystemThreadPool(maxJobs, maxBarriers, numThreads);")
    private static native long _ctor(int maxJobs, int maxBarriers, int numThreads);
}
