// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$103 {

    static final FunctionDescriptor JPC_SixDOFConstraint_GetMotorSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_GetMotorSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_GetMotorSettings",
        constants$103.JPC_SixDOFConstraint_GetMotorSettings$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraint_SetMotorState$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_SetMotorState$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_SetMotorState",
        constants$103.JPC_SixDOFConstraint_SetMotorState$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraint_GetMotorState$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_GetMotorState$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_GetMotorState",
        constants$103.JPC_SixDOFConstraint_GetMotorState$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraint_GetTargetVelocityCS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_GetTargetVelocityCS$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_GetTargetVelocityCS",
        constants$103.JPC_SixDOFConstraint_GetTargetVelocityCS$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraint_SetTargetVelocityCS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_SetTargetVelocityCS$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_SetTargetVelocityCS",
        constants$103.JPC_SixDOFConstraint_SetTargetVelocityCS$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraint_SetTargetAngularVelocityCS$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraint_SetTargetAngularVelocityCS$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraint_SetTargetAngularVelocityCS",
        constants$103.JPC_SixDOFConstraint_SetTargetAngularVelocityCS$FUNC
    );
}


