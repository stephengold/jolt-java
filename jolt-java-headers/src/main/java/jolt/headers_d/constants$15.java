// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$15 {

    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
        "labs",
        constants$15.labs$FUNC
    );
    static final FunctionDescriptor llabs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle llabs$MH = RuntimeHelper.downcallHandle(
        "llabs",
        constants$15.llabs$FUNC
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("quot"),
        Constants$root.C_INT$LAYOUT.withName("rem")
    ),
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        "div",
        constants$15.div$FUNC
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$15.ldiv$FUNC
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
        constants$15.lldiv$FUNC
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
        "ecvt",
        constants$15.ecvt$FUNC
    );
}


