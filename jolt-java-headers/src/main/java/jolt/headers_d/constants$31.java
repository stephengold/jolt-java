// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$31 {

    static final FunctionDescriptor JPC_NarrowPhaseQuery_CastRay$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_NarrowPhaseQuery_CastRay$MH = RuntimeHelper.downcallHandle(
        "JPC_NarrowPhaseQuery_CastRay",
        constants$31.JPC_NarrowPhaseQuery_CastRay$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_AddRef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_AddRef$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_AddRef",
        constants$31.JPC_ShapeSettings_AddRef$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_Release",
        constants$31.JPC_ShapeSettings_Release$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_GetRefCount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_GetRefCount$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_GetRefCount",
        constants$31.JPC_ShapeSettings_GetRefCount$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_CreateShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_CreateShape$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_CreateShape",
        constants$31.JPC_ShapeSettings_CreateShape$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_GetUserData",
        constants$31.JPC_ShapeSettings_GetUserData$FUNC
    );
}


