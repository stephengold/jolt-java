package jolt.core;

import io.github.aecsocket.jniglue.JniBind;
import io.github.aecsocket.jniglue.JniTypeMapping;
import jolt.JoltNativeImpl;
import io.github.aecsocket.jniglue.JniBindDelete;
import io.github.aecsocket.jniglue.JniInclude;

import javax.annotation.Nullable;

@JniInclude("<Jolt/Core/Factory.h>")
@JniTypeMapping("Factory")
public final class RTTIFactory extends JoltNativeImpl {
    private RTTIFactory(long address) { this.address = address; }
    public static RTTIFactory ref(long address) { return address == 0 ? null : new RTTIFactory(address); }

    @Override protected void deleteInternal() { _delete(address); }
    @JniBindDelete private static native void _delete(long _a);

    public RTTIFactory() { address = _ctor(); }
    @JniBind("return (jlong) new Factory();")
    private static native long _ctor();

    public static @Nullable RTTIFactory getInstance() { return ref(_getInstance()); }
    @JniBind("return (jlong) Factory::sInstance;")
    private static native long _getInstance();

    public static void setInstance(@Nullable RTTIFactory value) { _setInstance(ptr(value)); }
    @JniBind("Factory::sInstance = (Factory*) value;")
    private static native void _setInstance(long value);
}
