// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor JPC_BodyCreationSettings_GetShapeSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_GetShapeSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_GetShapeSettings",
        constants$21.JPC_BodyCreationSettings_GetShapeSettings$FUNC
    );
    static final FunctionDescriptor JPC_BodyCreationSettings_SetShapeSettings$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_SetShapeSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_SetShapeSettings",
        constants$21.JPC_BodyCreationSettings_SetShapeSettings$FUNC
    );
    static final FunctionDescriptor JPC_BodyCreationSettings_ConvertShapeSettings$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("result"),
        Constants$root.C_POINTER$LAYOUT.withName("error")
    ).withName("JPC_ShapeResult"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_ConvertShapeSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_ConvertShapeSettings",
        constants$21.JPC_BodyCreationSettings_ConvertShapeSettings$FUNC
    );
    static final FunctionDescriptor JPC_BodyCreationSettings_GetShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_GetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_GetShape",
        constants$21.JPC_BodyCreationSettings_GetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyCreationSettings_SetShape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_SetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_SetShape",
        constants$21.JPC_BodyCreationSettings_SetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyCreationSettings_HasMassProperties$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyCreationSettings_HasMassProperties$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyCreationSettings_HasMassProperties",
        constants$21.JPC_BodyCreationSettings_HasMassProperties$FUNC
    );
}


