// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$23 {

    static final FunctionDescriptor JPC_CollisionGroup_CanCollide$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollisionGroup_CanCollide$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionGroup_CanCollide",
        constants$23.JPC_CollisionGroup_CanCollide$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSettings_SetDefault$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSettings_SetDefault$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSettings_SetDefault",
        constants$23.JPC_PhysicsSettings_SetDefault$FUNC
    );
    static final FunctionDescriptor JPC_BroadPhaseCastResult_SetDefault$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BroadPhaseCastResult_SetDefault$MH = RuntimeHelper.downcallHandle(
        "JPC_BroadPhaseCastResult_SetDefault",
        constants$23.JPC_BroadPhaseCastResult_SetDefault$FUNC
    );
    static final FunctionDescriptor JPC_RayCastResult_SetDefault$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_RayCastResult_SetDefault$MH = RuntimeHelper.downcallHandle(
        "JPC_RayCastResult_SetDefault",
        constants$23.JPC_RayCastResult_SetDefault$FUNC
    );
    static final FunctionDescriptor JPC_CollideShapeResult_GetEarlyOutFraction$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollideShapeResult_GetEarlyOutFraction$MH = RuntimeHelper.downcallHandle(
        "JPC_CollideShapeResult_GetEarlyOutFraction",
        constants$23.JPC_CollideShapeResult_GetEarlyOutFraction$FUNC
    );
    static final FunctionDescriptor JPC_CollideShapeResult_Reversed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollideShapeResult_Reversed$MH = RuntimeHelper.downcallHandle(
        "JPC_CollideShapeResult_Reversed",
        constants$23.JPC_CollideShapeResult_Reversed$FUNC
    );
}


