// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$67 {

    static final FunctionDescriptor JPC_BodyInterface_IsActive$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_IsActive$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_IsActive",
        constants$67.JPC_BodyInterface_IsActive$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetShape",
        constants$67.JPC_BodyInterface_GetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetShape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetShape",
        constants$67.JPC_BodyInterface_SetShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_NotifyShapeChanged$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_NotifyShapeChanged$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_NotifyShapeChanged",
        constants$67.JPC_BodyInterface_NotifyShapeChanged$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetObjectLayer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetObjectLayer",
        constants$67.JPC_BodyInterface_SetObjectLayer$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetObjectLayer$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetObjectLayer",
        constants$67.JPC_BodyInterface_GetObjectLayer$FUNC
    );
}


