// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor JPC_Body_SetFriction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_SetFriction$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetFriction",
        constants$56.JPC_Body_SetFriction$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetRestitution$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetRestitution$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetRestitution",
        constants$56.JPC_Body_GetRestitution$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetRestitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_SetRestitution$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetRestitution",
        constants$56.JPC_Body_SetRestitution$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetLinearVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetLinearVelocity",
        constants$56.JPC_Body_GetLinearVelocity$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetLinearVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_SetLinearVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetLinearVelocity",
        constants$56.JPC_Body_SetLinearVelocity$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetLinearVelocityClamped$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_SetLinearVelocityClamped$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetLinearVelocityClamped",
        constants$56.JPC_Body_SetLinearVelocityClamped$FUNC
    );
}


