// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_GJKClosestPoint {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("y"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("p"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("q"),
        Constants$root.C_INT$LAYOUT.withName("num_points"),
        MemoryLayout.paddingLayout(96)
    ).withName("JPC_GJKClosestPoint");
    public static MemoryLayout $LAYOUT() {
        return JPC_GJKClosestPoint.$struct$LAYOUT;
    }
    public static MemorySegment y$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment p$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment q$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    static final VarHandle num_points$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_points"));
    public static VarHandle num_points$VH() {
        return JPC_GJKClosestPoint.num_points$VH;
    }
    public static int num_points$get(MemorySegment seg) {
        return (int)JPC_GJKClosestPoint.num_points$VH.get(seg);
    }
    public static void num_points$set( MemorySegment seg, int x) {
        JPC_GJKClosestPoint.num_points$VH.set(seg, x);
    }
    public static int num_points$get(MemorySegment seg, long index) {
        return (int)JPC_GJKClosestPoint.num_points$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_points$set(MemorySegment seg, long index, int x) {
        JPC_GJKClosestPoint.num_points$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


