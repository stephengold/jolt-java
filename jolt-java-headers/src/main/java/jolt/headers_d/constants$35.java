// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor JPC_BodyLockInterface_UnlockRead$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_UnlockRead$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_UnlockRead",
        constants$35.JPC_BodyLockInterface_UnlockRead$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_LockWrite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_LockWrite$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_LockWrite",
        constants$35.JPC_BodyLockInterface_LockWrite$FUNC
    );
    static final FunctionDescriptor JPC_BodyLockInterface_UnlockWrite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyLockInterface_UnlockWrite$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyLockInterface_UnlockWrite",
        constants$35.JPC_BodyLockInterface_UnlockWrite$FUNC
    );
    static final FunctionDescriptor JPC_CollisionCollector_Reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollisionCollector_Reset$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionCollector_Reset",
        constants$35.JPC_CollisionCollector_Reset$FUNC
    );
    static final FunctionDescriptor JPC_CollisionCollector_UpdateEarlyOutFraction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CollisionCollector_UpdateEarlyOutFraction$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionCollector_UpdateEarlyOutFraction",
        constants$35.JPC_CollisionCollector_UpdateEarlyOutFraction$FUNC
    );
    static final FunctionDescriptor JPC_CollisionCollector_ResetEarlyOutFraction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CollisionCollector_ResetEarlyOutFraction$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionCollector_ResetEarlyOutFraction",
        constants$35.JPC_CollisionCollector_ResetEarlyOutFraction$FUNC
    );
}


