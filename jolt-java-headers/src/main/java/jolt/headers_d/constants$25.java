// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$25 {

    static final FunctionDescriptor JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector",
        constants$25.JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetPointVelocityCOM$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetPointVelocityCOM$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetPointVelocityCOM",
        constants$25.JPC_MotionProperties_GetPointVelocityCOM$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetMaxLinearVelocity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetMaxLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetMaxLinearVelocity",
        constants$25.JPC_MotionProperties_GetMaxLinearVelocity$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetMaxLinearVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetMaxLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetMaxLinearVelocity",
        constants$25.JPC_MotionProperties_SetMaxLinearVelocity$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetMaxAngularVelocity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetMaxAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetMaxAngularVelocity",
        constants$25.JPC_MotionProperties_GetMaxAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetMaxAngularVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetMaxAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetMaxAngularVelocity",
        constants$25.JPC_MotionProperties_SetMaxAngularVelocity$FUNC
    );
}


