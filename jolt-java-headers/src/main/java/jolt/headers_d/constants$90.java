// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$90 {

    static final FunctionDescriptor JPC_PointConstraint_GetLocalSpacePoint1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PointConstraint_GetLocalSpacePoint1$MH = RuntimeHelper.downcallHandle(
        "JPC_PointConstraint_GetLocalSpacePoint1",
        constants$90.JPC_PointConstraint_GetLocalSpacePoint1$FUNC
    );
    static final FunctionDescriptor JPC_PointConstraint_GetLocalSpacePoint2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PointConstraint_GetLocalSpacePoint2$MH = RuntimeHelper.downcallHandle(
        "JPC_PointConstraint_GetLocalSpacePoint2",
        constants$90.JPC_PointConstraint_GetLocalSpacePoint2$FUNC
    );
    static final FunctionDescriptor JPC_PointConstraint_GetTotalLambdaPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PointConstraint_GetTotalLambdaPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_PointConstraint_GetTotalLambdaPosition",
        constants$90.JPC_PointConstraint_GetTotalLambdaPosition$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_GetCurrentAngle$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetCurrentAngle$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetCurrentAngle",
        constants$90.JPC_HingeConstraint_GetCurrentAngle$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_SetMaxFrictionTorque$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_SetMaxFrictionTorque$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_SetMaxFrictionTorque",
        constants$90.JPC_HingeConstraint_SetMaxFrictionTorque$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraint_GetMaxFrictionTorque$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraint_GetMaxFrictionTorque$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraint_GetMaxFrictionTorque",
        constants$90.JPC_HingeConstraint_GetMaxFrictionTorque$FUNC
    );
}


