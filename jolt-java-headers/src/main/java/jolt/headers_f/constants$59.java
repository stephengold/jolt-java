// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$59 {

    static final FunctionDescriptor JPC_Shape_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetMaterial",
        constants$59.JPC_Shape_GetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSurfaceNormal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSurfaceNormal$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSurfaceNormal",
        constants$59.JPC_Shape_GetSurfaceNormal$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSupportingFace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSupportingFace$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSupportingFace",
        constants$59.JPC_Shape_GetSupportingFace$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubShapeUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubShapeUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubShapeUserData",
        constants$59.JPC_Shape_GetSubShapeUserData$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubShapeTransformedShape$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("shape_position_com"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("shape_rotation"),
        Constants$root.C_POINTER$LAYOUT.withName("shape"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("shape_scale"),
        Constants$root.C_INT$LAYOUT.withName("body_id"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("id"),
            Constants$root.C_INT$LAYOUT.withName("current_bit")
        ).withName("sub_shape_id_creator")
    ).withName("JPC_TransformedShape"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubShapeTransformedShape$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubShapeTransformedShape",
        constants$59.JPC_Shape_GetSubShapeTransformedShape$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubmergedVolume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubmergedVolume$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubmergedVolume",
        constants$59.JPC_Shape_GetSubmergedVolume$FUNC
    );
}


