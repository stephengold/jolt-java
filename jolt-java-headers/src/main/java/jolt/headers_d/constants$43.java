// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor JPC_BoxShapeSettings_GetHalfExtent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShapeSettings_GetHalfExtent$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShapeSettings_GetHalfExtent",
        constants$43.JPC_BoxShapeSettings_GetHalfExtent$FUNC
    );
    static final FunctionDescriptor JPC_BoxShapeSettings_SetHalfExtent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShapeSettings_SetHalfExtent$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShapeSettings_SetHalfExtent",
        constants$43.JPC_BoxShapeSettings_SetHalfExtent$FUNC
    );
    static final FunctionDescriptor JPC_BoxShapeSettings_GetConvexRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShapeSettings_GetConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShapeSettings_GetConvexRadius",
        constants$43.JPC_BoxShapeSettings_GetConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_BoxShapeSettings_SetConvexRadius$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_BoxShapeSettings_SetConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShapeSettings_SetConvexRadius",
        constants$43.JPC_BoxShapeSettings_SetConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_SphereShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SphereShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_SphereShapeSettings_Create",
        constants$43.JPC_SphereShapeSettings_Create$FUNC
    );
    static final FunctionDescriptor JPC_SphereShapeSettings_GetRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SphereShapeSettings_GetRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_SphereShapeSettings_GetRadius",
        constants$43.JPC_SphereShapeSettings_GetRadius$FUNC
    );
}


