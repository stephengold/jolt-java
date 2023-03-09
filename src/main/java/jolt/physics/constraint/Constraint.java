package jolt.physics.constraint;

import jolt.DestroyableJoltNative;
import jolt.geometry.AABox;
import jolt.math.FMat44;
import jolt.math.FVec3;
import jolt.physics.collision.PhysicsMaterial;

import javax.annotation.Nullable;
import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;

import static jolt.headers.JoltPhysicsC.*;

public sealed class Constraint extends DestroyableJoltNative
        permits TwoBodyConstraint, VehicleConstraint {
    //region Jolt-Pointer-Protected
    protected Constraint(MemoryAddress handle) {
        super(handle);
    }

    public static Constraint at(MemoryAddress addr) {
        return addr == MemoryAddress.NULL ? null : new Constraint(addr);
    }
    //endregion Jolt-Pointer-Protected

    @Override
    protected void destroyInternal() {
        JPC_Constraint_Release(handle);
    }

    public ConstraintType getType() {
        return ConstraintType.values()[JPC_Constraint_GetType(handle)];
    }

    public ConstraintSubType getSubType() {
        return ConstraintSubType.values()[JPC_Constraint_GetSubType(handle)];
    }

    public void setNumVelocityStepsOverride(int numVelocityStepsOverride) {
        JPC_Constraint_SetNumVelocityStepsOverride(handle, numVelocityStepsOverride);
    }

    public int getNumVelocityStepsOverride() {
        return JPC_Constraint_GetNumVelocityStepsOverride(handle);
    }

    public void setNumPositionStepsOverride(int numPositionStepsOverride) {
        JPC_Constraint_SetNumPositionStepsOverride(handle, numPositionStepsOverride);
    }

    public int getNumPositionStepsOverride() {
        return JPC_Constraint_GetNumPositionStepsOverride(handle);
    }

    public void setEnabled(boolean enabled) {
        JPC_Constraint_SetEnabled(handle, enabled);
    }

    public boolean getEnabled() {
        return JPC_Constraint_GetEnabled(handle);
    }
}
