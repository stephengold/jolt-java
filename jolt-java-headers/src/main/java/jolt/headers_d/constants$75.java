// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$75 {

    static final FunctionDescriptor JPC_Body_GetWorldTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldTransform",
        constants$75.JPC_Body_GetWorldTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetCenterOfMassPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetCenterOfMassPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetCenterOfMassPosition",
        constants$75.JPC_Body_GetCenterOfMassPosition$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetCenterOfMassTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetCenterOfMassTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetCenterOfMassTransform",
        constants$75.JPC_Body_GetCenterOfMassTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetInverseCenterOfMassTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetInverseCenterOfMassTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetInverseCenterOfMassTransform",
        constants$75.JPC_Body_GetInverseCenterOfMassTransform$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetWorldSpaceBounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldSpaceBounds$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldSpaceBounds",
        constants$75.JPC_Body_GetWorldSpaceBounds$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetMotionProperties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetMotionProperties$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetMotionProperties",
        constants$75.JPC_Body_GetMotionProperties$FUNC
    );
}


