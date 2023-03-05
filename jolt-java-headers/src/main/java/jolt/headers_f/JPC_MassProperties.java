// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_MassProperties {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("mass"),
        MemoryLayout.paddingLayout(480),
        MemoryLayout.sequenceLayout(16, Constants$root.C_FLOAT$LAYOUT).withName("inertia")
    ).withName("JPC_MassProperties");
    public static MemoryLayout $LAYOUT() {
        return JPC_MassProperties.$struct$LAYOUT;
    }
    static final VarHandle mass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mass"));
    public static VarHandle mass$VH() {
        return JPC_MassProperties.mass$VH;
    }
    public static float mass$get(MemorySegment seg) {
        return (float)JPC_MassProperties.mass$VH.get(seg);
    }
    public static void mass$set( MemorySegment seg, float x) {
        JPC_MassProperties.mass$VH.set(seg, x);
    }
    public static float mass$get(MemorySegment seg, long index) {
        return (float)JPC_MassProperties.mass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mass$set(MemorySegment seg, long index, float x) {
        JPC_MassProperties.mass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment inertia$slice(MemorySegment seg) {
        return seg.asSlice(64, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


