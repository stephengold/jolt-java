// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$16 {

    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$16.ldiv$FUNC
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$16.lldiv$FUNC
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
        "ecvt",
        constants$16.ecvt$FUNC
    );
    static final FunctionDescriptor fcvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fcvt$MH = RuntimeHelper.downcallHandle(
        "fcvt",
        constants$16.fcvt$FUNC
    );
    static final FunctionDescriptor gcvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gcvt$MH = RuntimeHelper.downcallHandle(
        "gcvt",
        constants$16.gcvt$FUNC
    );
    static final FunctionDescriptor ecvt_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ecvt_r$MH = RuntimeHelper.downcallHandle(
        "ecvt_r",
        constants$16.ecvt_r$FUNC
    );
}


