// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor JPC_Shape_GetRefCount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetRefCount$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetRefCount",
        constants$46.JPC_Shape_GetRefCount$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetType$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetType",
        constants$46.JPC_Shape_GetType$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubType$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubType",
        constants$46.JPC_Shape_GetSubType$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetUserData",
        constants$46.JPC_Shape_GetUserData$FUNC
    );
    static final FunctionDescriptor JPC_Shape_SetUserData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle JPC_Shape_SetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_SetUserData",
        constants$46.JPC_Shape_SetUserData$FUNC
    );
    static final FunctionDescriptor JPC_Shape_MustBeStatic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_MustBeStatic$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_MustBeStatic",
        constants$46.JPC_Shape_MustBeStatic$FUNC
    );
}

