// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor JPC_PhysicsSystem_SetBodyActivationListener$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_SetBodyActivationListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_SetBodyActivationListener",
        constants$27.JPC_PhysicsSystem_SetBodyActivationListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodyActivationListener$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodyActivationListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodyActivationListener",
        constants$27.JPC_PhysicsSystem_GetBodyActivationListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_SetContactListener$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_SetContactListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_SetContactListener",
        constants$27.JPC_PhysicsSystem_SetContactListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetContactListener$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetContactListener$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetContactListener",
        constants$27.JPC_PhysicsSystem_GetContactListener$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetNumBodies$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNumBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNumBodies",
        constants$27.JPC_PhysicsSystem_GetNumBodies$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetNumActiveBodies$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNumActiveBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNumActiveBodies",
        constants$27.JPC_PhysicsSystem_GetNumActiveBodies$FUNC
    );
}


