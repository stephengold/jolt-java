// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor JPC_PhysicsSystem_GetActiveBodyIDs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetActiveBodyIDs$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetActiveBodyIDs",
        constants$30.JPC_PhysicsSystem_GetActiveBodyIDs$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodiesUnsafe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodiesUnsafe$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodiesUnsafe",
        constants$30.JPC_PhysicsSystem_GetBodiesUnsafe$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_LockRead$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_LockRead$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_LockRead",
        constants$30.JPC_BodyLockInterface_LockRead$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_UnlockRead$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_UnlockRead$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_UnlockRead",
        constants$30.JPC_BodyLockInterface_UnlockRead$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_LockWrite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_LockWrite$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_LockWrite",
        constants$30.JPC_BodyLockInterface_LockWrite$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_UnlockWrite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_UnlockWrite$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_UnlockWrite",
        constants$30.JPC_BodyLockInterface_UnlockWrite$FUNC
    );
}


