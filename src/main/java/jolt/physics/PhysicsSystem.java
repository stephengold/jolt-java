package jolt.physics;

import jolt.AddressedJoltNative;
import jolt.DestroyableJoltNative;
import jolt.JoltNative;
import jolt.core.JobSystem;
import jolt.core.TempAllocator;
import jolt.physics.body.BodyActivationListener;
import jolt.physics.body.BodyInterface;
import jolt.physics.collision.ContactListener;
import jolt.physics.collision.ObjectLayerPairFilter;
import jolt.physics.collision.broadphase.BroadPhaseLayerInterface;
import jolt.physics.collision.broadphase.ObjectVsBroadPhaseLayerFilter;

import javax.annotation.Nullable;

import java.lang.foreign.MemoryAddress;

import static jolt.headers.JoltPhysicsC.*;

public final class PhysicsSystem extends DestroyableJoltNative {
    public static PhysicsSystem at(MemoryAddress address) {
        return address.address() == MemoryAddress.NULL ? null : new PhysicsSystem(address);
    }

    public static PhysicsSystem create(
            int maxBodies,
            int numBodyMutexes,
            int maxBodyPairs,
            int maxContactConstraints,
            BroadPhaseLayerInterface broadPhaseLayerInterface,
            ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter,
            ObjectLayerPairFilter objectLayerPairFilter
    ) {
        var address = JPC_PhysicsSystem_Create(
                maxBodies,
                numBodyMutexes,
                maxBodyPairs,
                maxContactConstraints,
                broadPhaseLayerInterface.address(),
                objectVsBroadPhaseLayerFilter.address(),
                objectLayerPairFilter.address()
        );
        return new PhysicsSystem(address);
    }

    private PhysicsSystem(MemoryAddress address) {
        super(address);
    }

    @Override
    protected void destroyInternal() {
        JPC_PhysicsSystem_Destroy(address);
    }

    public @Nullable BodyActivationListener getBodyActivationListener() {
        return BodyActivationListener.at(JPC_PhysicsSystem_GetBodyActivationListener(address));
    }

    public void setBodyActivationListener(@Nullable BodyActivationListener listener) {
        JPC_PhysicsSystem_SetBodyActivationListener(address, JoltNative.addr(listener));
    }

    public @Nullable ContactListener getContactListener() {
        return ContactListener.at(JPC_PhysicsSystem_GetContactListener(address));
    }

    public void setContactListener(@Nullable ContactListener listener) {
        JPC_PhysicsSystem_SetContactListener(address, JoltNative.addr(listener));
    }

    public BodyInterface getBodyInterface() {
        return BodyInterface.at(JPC_PhysicsSystem_GetBodyInterface(address));
    }

    public void optimizeBroadPhase() {
        JPC_PhysicsSystem_OptimizeBroadPhase(address);
    }

    public void update(
            float deltaTime,
            int collisionSteps,
            int integrationSubSteps,
            TempAllocator tempAllocator,
            JobSystem jobSystem
    ) {
        JPC_PhysicsSystem_Update(address,
                deltaTime,
                collisionSteps,
                integrationSubSteps,
                tempAllocator.address(),
                jobSystem.address()
        );
    }
}
