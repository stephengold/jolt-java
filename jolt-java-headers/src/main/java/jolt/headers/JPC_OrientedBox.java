// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_OrientedBox {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_FLOAT$LAYOUT).withName("orientation"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("half_extent"),
        MemoryLayout.paddingLayout(416)
    ).withName("JPC_OrientedBox");
    public static MemoryLayout $LAYOUT() {
        return JPC_OrientedBox.$struct$LAYOUT;
    }
    public static MemorySegment orientation$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static MemorySegment half_extent$slice(MemorySegment seg) {
        return seg.asSlice(64, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


