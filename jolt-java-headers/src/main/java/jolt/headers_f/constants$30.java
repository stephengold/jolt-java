// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor JPC_JobSystem_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_JobSystem_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_JobSystem_Destroy",
        constants$30.JPC_JobSystem_Destroy$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_Create",
        constants$30.JPC_PhysicsSystem_Create$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_Destroy",
        constants$30.JPC_PhysicsSystem_Destroy$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_SetBodyActivationListener$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_SetBodyActivationListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_SetBodyActivationListener",
        constants$30.JPC_PhysicsSystem_SetBodyActivationListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodyActivationListener$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodyActivationListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodyActivationListener",
        constants$30.JPC_PhysicsSystem_GetBodyActivationListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_SetContactListener$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_SetContactListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_SetContactListener",
        constants$30.JPC_PhysicsSystem_SetContactListener$FUNC
    );
}


