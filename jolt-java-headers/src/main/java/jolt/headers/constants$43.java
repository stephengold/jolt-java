// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor JPC_ShapeSettings_CreateShape$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("result"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("error")
    ).withName("JPC_ShapeResult"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_CreateShape$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_CreateShape",
        constants$43.JPC_ShapeSettings_CreateShape$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_GetUserData",
        constants$43.JPC_ShapeSettings_GetUserData$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_SetUserData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_SetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_SetUserData",
        constants$43.JPC_ShapeSettings_SetUserData$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShape_GetSupportFunction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShape_GetSupportFunction$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShape_GetSupportFunction",
        constants$43.JPC_ConvexShape_GetSupportFunction$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_GetMaterial",
        constants$43.JPC_ConvexShapeSettings_GetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_SetMaterial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_SetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_SetMaterial",
        constants$43.JPC_ConvexShapeSettings_SetMaterial$FUNC
    );
}


