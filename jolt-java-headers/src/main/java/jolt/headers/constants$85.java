// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$85 {

    static final FunctionDescriptor JPC_BodyID_GetIndex$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyID_GetIndex$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyID_GetIndex",
        constants$85.JPC_BodyID_GetIndex$FUNC
    );
    static final FunctionDescriptor JPC_BodyID_GetSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyID_GetSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyID_GetSequenceNumber",
        constants$85.JPC_BodyID_GetSequenceNumber$FUNC
    );
    static final FunctionDescriptor JPC_BodyID_IsInvalid$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyID_IsInvalid$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyID_IsInvalid",
        constants$85.JPC_BodyID_IsInvalid$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_Release",
        constants$85.JPC_Constraint_Release$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_GetType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_GetType$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_GetType",
        constants$85.JPC_Constraint_GetType$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_GetSubType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_GetSubType$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_GetSubType",
        constants$85.JPC_Constraint_GetSubType$FUNC
    );
}


