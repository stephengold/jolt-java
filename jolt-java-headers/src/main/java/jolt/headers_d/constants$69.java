// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$69 {

    static final FunctionDescriptor JPC_Body_SetIsSensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle JPC_Body_SetIsSensor$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetIsSensor",
        constants$69.JPC_Body_SetIsSensor$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsSensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsSensor$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsSensor",
        constants$69.JPC_Body_IsSensor$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetMotionType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetMotionType$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetMotionType",
        constants$69.JPC_Body_GetMotionType$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetMotionType$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_Body_SetMotionType$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetMotionType",
        constants$69.JPC_Body_SetMotionType$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetBroadPhaseLayer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetBroadPhaseLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetBroadPhaseLayer",
        constants$69.JPC_Body_GetBroadPhaseLayer$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetObjectLayer$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetObjectLayer",
        constants$69.JPC_Body_GetObjectLayer$FUNC
    );
}


