// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$16 {

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
    static final FunctionDescriptor fcvt_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fcvt_r$MH = RuntimeHelper.downcallHandle(
        "fcvt_r",
        constants$16.fcvt_r$FUNC
    );
    static final FunctionDescriptor mblen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mblen$MH = RuntimeHelper.downcallHandle(
        "mblen",
        constants$16.mblen$FUNC
    );
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        "mbtowc",
        constants$16.mbtowc$FUNC
    );
}


