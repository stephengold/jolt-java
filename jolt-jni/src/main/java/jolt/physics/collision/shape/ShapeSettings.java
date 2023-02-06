package jolt.physics.collision.shape;

import jolt.jni.JniBindDelete;
import jolt.jni.JniInclude;
import jolt.jni.JniBindSelf;
import jolt.jni.JniType;

@JniInclude("<Jolt/Physics/Collision/Shape/Shape.h>")
@JniType("ShapeSettings")
public class ShapeSettings extends ConvexShape {
    protected ShapeSettings(long address) { super(address); }
    public static ShapeSettings ref(long address) { return address == 0 ? null : new ShapeSettings(address); }

    @Override
    public void delete() {
        if (address == 0L) throw new IllegalStateException(NATIVE_OBJECT_DELETED);
        _delete(address);
        address = 0;
    }
    @JniBindDelete
    private static native void _delete(long _a);

    protected ShapeSettings() {}

    public Shape create() { return Shape.ref(_create(address)); }
    @JniBindSelf("""
            ShapeSettings::ShapeResult result = self->Create();
            if (result.HasError()) {
                env->ThrowNew(runtimeException, result.GetError().c_str());
                return (jlong) nullptr;
            }
            return (jlong) result.Get().GetPtr();""")
    private static native long _create(long _a);
}