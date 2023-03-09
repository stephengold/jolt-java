package jolt.physics.constraint;

import jolt.DestroyableJoltNative;
import jolt.geometry.AABox;
import jolt.math.FMat44;
import jolt.math.FVec3;
import jolt.physics.body.MutableBody;
import jolt.physics.collision.PhysicsMaterial;

import javax.annotation.Nullable;
import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;

import static jolt.headers.JoltPhysicsC.*;

public final class ConeConstraint extends TwoBodyConstraint {
    //region Jolt-Pointer
    private ConeConstraint(MemoryAddress handle) {
        super(handle);
    }

    public static ConeConstraint at(MemoryAddress addr) {
        return addr == MemoryAddress.NULL ? null : new ConeConstraint(addr);
    }
    //endregion Jolt-Pointer

    public void setHalfConeAngle(float halfConeAngle) {
        JPC_ConeConstraint_SetHalfConeAngle(handle, halfConeAngle);
    }

    public float getCosHalfConeAngle() {
        return JPC_ConeConstraint_GetCosHalfConeAngle(handle);
    }

    public void getTotalLambdaPosition(FVec3 out) {
        JPC_ConeConstraint_GetTotalLambdaPosition(handle, out);
    }

    public float getTotalLambdaRotation() {
        return JPC_ConeConstraint_GetTotalLambdaRotation(handle);
    }
}
