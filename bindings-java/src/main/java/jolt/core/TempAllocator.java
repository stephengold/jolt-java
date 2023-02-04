package jolt.core;

import jolt.JoltNative;
import jolt.jni.JniBindDelete;
import jolt.jni.JniInclude;
import jolt.jni.JniType;

@JniInclude("<Jolt/Core/TempAllocator.h>")
@JniType("TempAllocator")
public class TempAllocator extends JoltNative {
    protected TempAllocator(long address) { super(address); }
    public static TempAllocator ref(long address) { return address == 0 ? null : new TempAllocator(address); }

    @Override
    public void delete() {
        if (address == 0L) throw new IllegalStateException(NATIVE_OBJECT_DELETED);
        _delete(address);
        address = 0;
    }
    @JniBindDelete
    private static native void _delete(long _a);

    protected TempAllocator() {}
}
