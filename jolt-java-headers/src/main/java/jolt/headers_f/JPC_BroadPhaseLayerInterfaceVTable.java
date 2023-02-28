// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_BroadPhaseLayerInterfaceVTable {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__unused0"),
        Constants$root.C_POINTER$LAYOUT.withName("__unused1"),
        Constants$root.C_POINTER$LAYOUT.withName("GetNumBroadPhaseLayers"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBroadPhaseLayer")
    ).withName("JPC_BroadPhaseLayerInterfaceVTable");
    public static MemoryLayout $LAYOUT() {
        return JPC_BroadPhaseLayerInterfaceVTable.$struct$LAYOUT;
    }
    static final VarHandle __unused0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__unused0"));
    public static VarHandle __unused0$VH() {
        return JPC_BroadPhaseLayerInterfaceVTable.__unused0$VH;
    }
    public static MemoryAddress __unused0$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.__unused0$VH.get(seg);
    }
    public static void __unused0$set( MemorySegment seg, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.__unused0$VH.set(seg, x);
    }
    public static MemoryAddress __unused0$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.__unused0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused0$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.__unused0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __unused1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__unused1"));
    public static VarHandle __unused1$VH() {
        return JPC_BroadPhaseLayerInterfaceVTable.__unused1$VH;
    }
    public static MemoryAddress __unused1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.__unused1$VH.get(seg);
    }
    public static void __unused1$set( MemorySegment seg, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.__unused1$VH.set(seg, x);
    }
    public static MemoryAddress __unused1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.__unused1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused1$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.__unused1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor GetNumBroadPhaseLayers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumBroadPhaseLayers$MH = RuntimeHelper.downcallHandle(
        JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$FUNC
    );
    public interface GetNumBroadPhaseLayers {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(GetNumBroadPhaseLayers fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetNumBroadPhaseLayers.class, fi, JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$FUNC, session);
        }
        static GetNumBroadPhaseLayers ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetNumBroadPhaseLayers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetNumBroadPhaseLayers"));
    public static VarHandle GetNumBroadPhaseLayers$VH() {
        return JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$VH;
    }
    public static MemoryAddress GetNumBroadPhaseLayers$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$VH.get(seg);
    }
    public static void GetNumBroadPhaseLayers$set( MemorySegment seg, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$VH.set(seg, x);
    }
    public static MemoryAddress GetNumBroadPhaseLayers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetNumBroadPhaseLayers$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.GetNumBroadPhaseLayers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetNumBroadPhaseLayers GetNumBroadPhaseLayers (MemorySegment segment, MemorySession session) {
        return GetNumBroadPhaseLayers.ofAddress(GetNumBroadPhaseLayers$get(segment), session);
    }
    static final FunctionDescriptor GetBroadPhaseLayer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetBroadPhaseLayer$MH = RuntimeHelper.downcallHandle(
        JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$FUNC
    );
    public interface GetBroadPhaseLayer {

        byte apply(java.lang.foreign.MemoryAddress _x0, short _x1);
        static MemorySegment allocate(GetBroadPhaseLayer fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBroadPhaseLayer.class, fi, JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$FUNC, session);
        }
        static GetBroadPhaseLayer ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, short __x1) -> {
                try {
                    return (byte)JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBroadPhaseLayer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBroadPhaseLayer"));
    public static VarHandle GetBroadPhaseLayer$VH() {
        return JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$VH;
    }
    public static MemoryAddress GetBroadPhaseLayer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$VH.get(seg);
    }
    public static void GetBroadPhaseLayer$set( MemorySegment seg, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$VH.set(seg, x);
    }
    public static MemoryAddress GetBroadPhaseLayer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBroadPhaseLayer$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BroadPhaseLayerInterfaceVTable.GetBroadPhaseLayer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBroadPhaseLayer GetBroadPhaseLayer (MemorySegment segment, MemorySession session) {
        return GetBroadPhaseLayer.ofAddress(GetBroadPhaseLayer$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


