// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor JPC_BodyInterface_AddBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBody",
        constants$65.JPC_BodyInterface_AddBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_RemoveBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_RemoveBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_RemoveBody",
        constants$65.JPC_BodyInterface_RemoveBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_IsAdded$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_IsAdded$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_IsAdded",
        constants$65.JPC_BodyInterface_IsAdded$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_CreateAndAddBody$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateAndAddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateAndAddBody",
        constants$65.JPC_BodyInterface_CreateAndAddBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBodiesPrepare$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBodiesPrepare$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBodiesPrepare",
        constants$65.JPC_BodyInterface_AddBodiesPrepare$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBodiesFinalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBodiesFinalize$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBodiesFinalize",
        constants$65.JPC_BodyInterface_AddBodiesFinalize$FUNC
    );
}


