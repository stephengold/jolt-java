// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$92 {

    static final FunctionDescriptor JPC_HingeConstraint_GetTargetAngle$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetTargetAngle$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetTargetAngle",
        constants$92.JPC_HingeConstraint_GetTargetAngle$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_SetLimits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_SetLimits$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_SetLimits",
        constants$92.JPC_HingeConstraint_SetLimits$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_GetLimitsMin$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetLimitsMin$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetLimitsMin",
        constants$92.JPC_HingeConstraint_GetLimitsMin$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_GetLimitsMax$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetLimitsMax$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetLimitsMax",
        constants$92.JPC_HingeConstraint_GetLimitsMax$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_HasLimits$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_HasLimits$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_HasLimits",
        constants$92.JPC_HingeConstraint_HasLimits$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_GetTotalLambdaPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetTotalLambdaPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetTotalLambdaPosition",
        constants$92.JPC_HingeConstraint_GetTotalLambdaPosition$FUNC
    );
}

