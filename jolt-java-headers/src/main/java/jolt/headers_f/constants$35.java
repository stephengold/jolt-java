// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor JPC_CylinderShape_GetHalfHeight$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CylinderShape_GetHalfHeight$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShape_GetHalfHeight",
        constants$35.JPC_CylinderShape_GetHalfHeight$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShape_GetRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CylinderShape_GetRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShape_GetRadius",
        constants$35.JPC_CylinderShape_GetRadius$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_AddRef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_AddRef$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_AddRef",
        constants$35.JPC_ShapeSettings_AddRef$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_Release",
        constants$35.JPC_ShapeSettings_Release$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_GetRefCount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_GetRefCount$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_GetRefCount",
        constants$35.JPC_ShapeSettings_GetRefCount$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_CreateShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_CreateShape$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_CreateShape",
        constants$35.JPC_ShapeSettings_CreateShape$FUNC
    );
}

