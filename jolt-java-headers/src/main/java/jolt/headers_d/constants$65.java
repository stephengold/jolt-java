// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor JPC_BodyInterface_AddImpulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddImpulse",
        constants$65.JPC_BodyInterface_AddImpulse$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddImpulseAtPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddImpulseAtPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddImpulseAtPosition",
        constants$65.JPC_BodyInterface_AddImpulseAtPosition$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddAngularImpulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddAngularImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddAngularImpulse",
        constants$65.JPC_BodyInterface_AddAngularImpulse$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetMotionType$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetMotionType$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetMotionType",
        constants$65.JPC_BodyInterface_SetMotionType$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetMotionType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetMotionType$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetMotionType",
        constants$65.JPC_BodyInterface_GetMotionType$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetMotionQuality$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetMotionQuality$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetMotionQuality",
        constants$65.JPC_BodyInterface_SetMotionQuality$FUNC
    );
}


