// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_BodyCreationSettings {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("position"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("rotation"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("linear_velocity"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("angular_velocity"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("user_data"),
        Constants$root.C_SHORT$LAYOUT.withName("object_layer"),
        MemoryLayout.paddingLayout(48),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("filter"),
            Constants$root.C_INT$LAYOUT.withName("group_id"),
            Constants$root.C_INT$LAYOUT.withName("sub_group_id")
        ).withName("collision_group"),
        Constants$root.C_CHAR$LAYOUT.withName("motion_type"),
        Constants$root.C_BOOL$LAYOUT.withName("allow_dynamic_or_kinematic"),
        Constants$root.C_BOOL$LAYOUT.withName("is_sensor"),
        Constants$root.C_CHAR$LAYOUT.withName("motion_quality"),
        Constants$root.C_BOOL$LAYOUT.withName("allow_sleeping"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_FLOAT$LAYOUT.withName("friction"),
        Constants$root.C_FLOAT$LAYOUT.withName("restitution"),
        Constants$root.C_FLOAT$LAYOUT.withName("linear_damping"),
        Constants$root.C_FLOAT$LAYOUT.withName("angular_damping"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_linear_velocity"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_angular_velocity"),
        Constants$root.C_FLOAT$LAYOUT.withName("gravity_factor"),
        Constants$root.C_CHAR$LAYOUT.withName("override_mass_properties"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_FLOAT$LAYOUT.withName("inertia_multiplier"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("mass"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(16, Constants$root.C_FLOAT$LAYOUT).withName("inertia")
        ).withName("mass_properties_override"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved"),
        Constants$root.C_POINTER$LAYOUT.withName("shape")
    ).withName("JPC_BodyCreationSettings");
    public static MemoryLayout $LAYOUT() {
        return JPC_BodyCreationSettings.$struct$LAYOUT;
    }
    public static MemorySegment position$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment rotation$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment linear_velocity$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment angular_velocity$slice(MemorySegment seg) {
        return seg.asSlice(48, 16);
    }
    static final VarHandle user_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data"));
    public static VarHandle user_data$VH() {
        return JPC_BodyCreationSettings.user_data$VH;
    }
    public static long user_data$get(MemorySegment seg) {
        return (long)JPC_BodyCreationSettings.user_data$VH.get(seg);
    }
    public static void user_data$set( MemorySegment seg, long x) {
        JPC_BodyCreationSettings.user_data$VH.set(seg, x);
    }
    public static long user_data$get(MemorySegment seg, long index) {
        return (long)JPC_BodyCreationSettings.user_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, long x) {
        JPC_BodyCreationSettings.user_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle object_layer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("object_layer"));
    public static VarHandle object_layer$VH() {
        return JPC_BodyCreationSettings.object_layer$VH;
    }
    public static short object_layer$get(MemorySegment seg) {
        return (short)JPC_BodyCreationSettings.object_layer$VH.get(seg);
    }
    public static void object_layer$set( MemorySegment seg, short x) {
        JPC_BodyCreationSettings.object_layer$VH.set(seg, x);
    }
    public static short object_layer$get(MemorySegment seg, long index) {
        return (short)JPC_BodyCreationSettings.object_layer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void object_layer$set(MemorySegment seg, long index, short x) {
        JPC_BodyCreationSettings.object_layer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment collision_group$slice(MemorySegment seg) {
        return seg.asSlice(80, 16);
    }
    static final VarHandle motion_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("motion_type"));
    public static VarHandle motion_type$VH() {
        return JPC_BodyCreationSettings.motion_type$VH;
    }
    public static byte motion_type$get(MemorySegment seg) {
        return (byte)JPC_BodyCreationSettings.motion_type$VH.get(seg);
    }
    public static void motion_type$set( MemorySegment seg, byte x) {
        JPC_BodyCreationSettings.motion_type$VH.set(seg, x);
    }
    public static byte motion_type$get(MemorySegment seg, long index) {
        return (byte)JPC_BodyCreationSettings.motion_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void motion_type$set(MemorySegment seg, long index, byte x) {
        JPC_BodyCreationSettings.motion_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle allow_dynamic_or_kinematic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("allow_dynamic_or_kinematic"));
    public static VarHandle allow_dynamic_or_kinematic$VH() {
        return JPC_BodyCreationSettings.allow_dynamic_or_kinematic$VH;
    }
    public static boolean allow_dynamic_or_kinematic$get(MemorySegment seg) {
        return (boolean)JPC_BodyCreationSettings.allow_dynamic_or_kinematic$VH.get(seg);
    }
    public static void allow_dynamic_or_kinematic$set( MemorySegment seg, boolean x) {
        JPC_BodyCreationSettings.allow_dynamic_or_kinematic$VH.set(seg, x);
    }
    public static boolean allow_dynamic_or_kinematic$get(MemorySegment seg, long index) {
        return (boolean)JPC_BodyCreationSettings.allow_dynamic_or_kinematic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void allow_dynamic_or_kinematic$set(MemorySegment seg, long index, boolean x) {
        JPC_BodyCreationSettings.allow_dynamic_or_kinematic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle is_sensor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_sensor"));
    public static VarHandle is_sensor$VH() {
        return JPC_BodyCreationSettings.is_sensor$VH;
    }
    public static boolean is_sensor$get(MemorySegment seg) {
        return (boolean)JPC_BodyCreationSettings.is_sensor$VH.get(seg);
    }
    public static void is_sensor$set( MemorySegment seg, boolean x) {
        JPC_BodyCreationSettings.is_sensor$VH.set(seg, x);
    }
    public static boolean is_sensor$get(MemorySegment seg, long index) {
        return (boolean)JPC_BodyCreationSettings.is_sensor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_sensor$set(MemorySegment seg, long index, boolean x) {
        JPC_BodyCreationSettings.is_sensor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle motion_quality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("motion_quality"));
    public static VarHandle motion_quality$VH() {
        return JPC_BodyCreationSettings.motion_quality$VH;
    }
    public static byte motion_quality$get(MemorySegment seg) {
        return (byte)JPC_BodyCreationSettings.motion_quality$VH.get(seg);
    }
    public static void motion_quality$set( MemorySegment seg, byte x) {
        JPC_BodyCreationSettings.motion_quality$VH.set(seg, x);
    }
    public static byte motion_quality$get(MemorySegment seg, long index) {
        return (byte)JPC_BodyCreationSettings.motion_quality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void motion_quality$set(MemorySegment seg, long index, byte x) {
        JPC_BodyCreationSettings.motion_quality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle allow_sleeping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("allow_sleeping"));
    public static VarHandle allow_sleeping$VH() {
        return JPC_BodyCreationSettings.allow_sleeping$VH;
    }
    public static boolean allow_sleeping$get(MemorySegment seg) {
        return (boolean)JPC_BodyCreationSettings.allow_sleeping$VH.get(seg);
    }
    public static void allow_sleeping$set( MemorySegment seg, boolean x) {
        JPC_BodyCreationSettings.allow_sleeping$VH.set(seg, x);
    }
    public static boolean allow_sleeping$get(MemorySegment seg, long index) {
        return (boolean)JPC_BodyCreationSettings.allow_sleeping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void allow_sleeping$set(MemorySegment seg, long index, boolean x) {
        JPC_BodyCreationSettings.allow_sleeping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle friction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("friction"));
    public static VarHandle friction$VH() {
        return JPC_BodyCreationSettings.friction$VH;
    }
    public static float friction$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.friction$VH.get(seg);
    }
    public static void friction$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.friction$VH.set(seg, x);
    }
    public static float friction$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.friction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void friction$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.friction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle restitution$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("restitution"));
    public static VarHandle restitution$VH() {
        return JPC_BodyCreationSettings.restitution$VH;
    }
    public static float restitution$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.restitution$VH.get(seg);
    }
    public static void restitution$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.restitution$VH.set(seg, x);
    }
    public static float restitution$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.restitution$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void restitution$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.restitution$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle linear_damping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("linear_damping"));
    public static VarHandle linear_damping$VH() {
        return JPC_BodyCreationSettings.linear_damping$VH;
    }
    public static float linear_damping$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.linear_damping$VH.get(seg);
    }
    public static void linear_damping$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.linear_damping$VH.set(seg, x);
    }
    public static float linear_damping$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.linear_damping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void linear_damping$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.linear_damping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle angular_damping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("angular_damping"));
    public static VarHandle angular_damping$VH() {
        return JPC_BodyCreationSettings.angular_damping$VH;
    }
    public static float angular_damping$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.angular_damping$VH.get(seg);
    }
    public static void angular_damping$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.angular_damping$VH.set(seg, x);
    }
    public static float angular_damping$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.angular_damping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void angular_damping$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.angular_damping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_linear_velocity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_linear_velocity"));
    public static VarHandle max_linear_velocity$VH() {
        return JPC_BodyCreationSettings.max_linear_velocity$VH;
    }
    public static float max_linear_velocity$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.max_linear_velocity$VH.get(seg);
    }
    public static void max_linear_velocity$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.max_linear_velocity$VH.set(seg, x);
    }
    public static float max_linear_velocity$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.max_linear_velocity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_linear_velocity$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.max_linear_velocity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_angular_velocity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_angular_velocity"));
    public static VarHandle max_angular_velocity$VH() {
        return JPC_BodyCreationSettings.max_angular_velocity$VH;
    }
    public static float max_angular_velocity$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.max_angular_velocity$VH.get(seg);
    }
    public static void max_angular_velocity$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.max_angular_velocity$VH.set(seg, x);
    }
    public static float max_angular_velocity$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.max_angular_velocity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_angular_velocity$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.max_angular_velocity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gravity_factor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gravity_factor"));
    public static VarHandle gravity_factor$VH() {
        return JPC_BodyCreationSettings.gravity_factor$VH;
    }
    public static float gravity_factor$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.gravity_factor$VH.get(seg);
    }
    public static void gravity_factor$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.gravity_factor$VH.set(seg, x);
    }
    public static float gravity_factor$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.gravity_factor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gravity_factor$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.gravity_factor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_mass_properties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("override_mass_properties"));
    public static VarHandle override_mass_properties$VH() {
        return JPC_BodyCreationSettings.override_mass_properties$VH;
    }
    public static byte override_mass_properties$get(MemorySegment seg) {
        return (byte)JPC_BodyCreationSettings.override_mass_properties$VH.get(seg);
    }
    public static void override_mass_properties$set( MemorySegment seg, byte x) {
        JPC_BodyCreationSettings.override_mass_properties$VH.set(seg, x);
    }
    public static byte override_mass_properties$get(MemorySegment seg, long index) {
        return (byte)JPC_BodyCreationSettings.override_mass_properties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_mass_properties$set(MemorySegment seg, long index, byte x) {
        JPC_BodyCreationSettings.override_mass_properties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle inertia_multiplier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("inertia_multiplier"));
    public static VarHandle inertia_multiplier$VH() {
        return JPC_BodyCreationSettings.inertia_multiplier$VH;
    }
    public static float inertia_multiplier$get(MemorySegment seg) {
        return (float)JPC_BodyCreationSettings.inertia_multiplier$VH.get(seg);
    }
    public static void inertia_multiplier$set( MemorySegment seg, float x) {
        JPC_BodyCreationSettings.inertia_multiplier$VH.set(seg, x);
    }
    public static float inertia_multiplier$get(MemorySegment seg, long index) {
        return (float)JPC_BodyCreationSettings.inertia_multiplier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void inertia_multiplier$set(MemorySegment seg, long index, float x) {
        JPC_BodyCreationSettings.inertia_multiplier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mass_properties_override$slice(MemorySegment seg) {
        return seg.asSlice(144, 80);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return JPC_BodyCreationSettings.reserved$VH;
    }
    public static MemoryAddress reserved$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BodyCreationSettings.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyCreationSettings.reserved$VH.set(seg, x);
    }
    public static MemoryAddress reserved$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BodyCreationSettings.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyCreationSettings.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle shape$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("shape"));
    public static VarHandle shape$VH() {
        return JPC_BodyCreationSettings.shape$VH;
    }
    public static MemoryAddress shape$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_BodyCreationSettings.shape$VH.get(seg);
    }
    public static void shape$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyCreationSettings.shape$VH.set(seg, x);
    }
    public static MemoryAddress shape$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_BodyCreationSettings.shape$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void shape$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyCreationSettings.shape$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


