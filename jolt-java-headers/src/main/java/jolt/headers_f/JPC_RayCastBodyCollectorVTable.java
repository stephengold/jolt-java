// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_RayCastBodyCollectorVTable {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__unused0"),
        Constants$root.C_POINTER$LAYOUT.withName("__unused1"),
        Constants$root.C_POINTER$LAYOUT.withName("Reset"),
        Constants$root.C_POINTER$LAYOUT.withName("OnBody"),
        Constants$root.C_POINTER$LAYOUT.withName("AddHit")
    ).withName("JPC_RayCastBodyCollectorVTable");
    public static MemoryLayout $LAYOUT() {
        return JPC_RayCastBodyCollectorVTable.$struct$LAYOUT;
    }
    static final VarHandle __unused0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__unused0"));
    public static VarHandle __unused0$VH() {
        return JPC_RayCastBodyCollectorVTable.__unused0$VH;
    }
    public static MemoryAddress __unused0$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.__unused0$VH.get(seg);
    }
    public static void __unused0$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.__unused0$VH.set(seg, x);
    }
    public static MemoryAddress __unused0$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.__unused0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused0$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.__unused0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __unused1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__unused1"));
    public static VarHandle __unused1$VH() {
        return JPC_RayCastBodyCollectorVTable.__unused1$VH;
    }
    public static MemoryAddress __unused1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.__unused1$VH.get(seg);
    }
    public static void __unused1$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.__unused1$VH.set(seg, x);
    }
    public static MemoryAddress __unused1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.__unused1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused1$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.__unused1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Reset$MH = RuntimeHelper.downcallHandle(
        JPC_RayCastBodyCollectorVTable.Reset$FUNC
    );
    public interface Reset {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Reset fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Reset.class, fi, JPC_RayCastBodyCollectorVTable.Reset$FUNC, session);
        }
        static Reset ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    JPC_RayCastBodyCollectorVTable.Reset$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reset"));
    public static VarHandle Reset$VH() {
        return JPC_RayCastBodyCollectorVTable.Reset$VH;
    }
    public static MemoryAddress Reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.Reset$VH.get(seg);
    }
    public static void Reset$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.Reset$VH.set(seg, x);
    }
    public static MemoryAddress Reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset (MemorySegment segment, MemorySession session) {
        return Reset.ofAddress(Reset$get(segment), session);
    }
    static final FunctionDescriptor OnBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnBody$MH = RuntimeHelper.downcallHandle(
        JPC_RayCastBodyCollectorVTable.OnBody$FUNC
    );
    public interface OnBody {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(OnBody fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnBody.class, fi, JPC_RayCastBodyCollectorVTable.OnBody$FUNC, session);
        }
        static OnBody ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    JPC_RayCastBodyCollectorVTable.OnBody$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnBody$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnBody"));
    public static VarHandle OnBody$VH() {
        return JPC_RayCastBodyCollectorVTable.OnBody$VH;
    }
    public static MemoryAddress OnBody$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.OnBody$VH.get(seg);
    }
    public static void OnBody$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.OnBody$VH.set(seg, x);
    }
    public static MemoryAddress OnBody$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.OnBody$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnBody$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.OnBody$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnBody OnBody (MemorySegment segment, MemorySession session) {
        return OnBody.ofAddress(OnBody$get(segment), session);
    }
    static final FunctionDescriptor AddHit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddHit$MH = RuntimeHelper.downcallHandle(
        JPC_RayCastBodyCollectorVTable.AddHit$FUNC
    );
    public interface AddHit {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(AddHit fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddHit.class, fi, JPC_RayCastBodyCollectorVTable.AddHit$FUNC, session);
        }
        static AddHit ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    JPC_RayCastBodyCollectorVTable.AddHit$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddHit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddHit"));
    public static VarHandle AddHit$VH() {
        return JPC_RayCastBodyCollectorVTable.AddHit$VH;
    }
    public static MemoryAddress AddHit$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.AddHit$VH.get(seg);
    }
    public static void AddHit$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.AddHit$VH.set(seg, x);
    }
    public static MemoryAddress AddHit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollectorVTable.AddHit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddHit$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollectorVTable.AddHit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddHit AddHit (MemorySegment segment, MemorySession session) {
        return AddHit.ofAddress(AddHit$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


