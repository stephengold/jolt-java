package jolt.physics;

import jolt.jni.*;
import jolt.JoltNative;
import jolt.physics.body.BodyActivationListener;
import jolt.physics.body.BodyInterface;
import jolt.physics.collision.ContactListener;
import jolt.physics.collision.ObjectLayerPairFilter;
import jolt.physics.collision.broadphase.BroadPhaseLayerInterface;
import jolt.physics.collision.broadphase.ObjectVsBroadPhaseLayerFilter;

import javax.annotation.Nullable;

@JniInclude("<Jolt/Physics/PhysicsSystem.h>")
@JniType("PhysicsSystem")
public final class PhysicsSystem extends JoltNative {
    private PhysicsSystem(long address) { super(address); }
    public static PhysicsSystem ref(long address) { return address == 0 ? null : new PhysicsSystem(address); }

    public PhysicsSystem(
            int maxBodies,
            int numBodyMutexes,
            int maxBodyPairs,
            int maxContactConstraints,
            BroadPhaseLayerInterface broadPhaseLayerInterface,
            ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter,
            ObjectLayerPairFilter objectLayerPairFilter
    ) {
        address = _ctor(
                maxBodies, numBodyMutexes, maxBodyPairs, maxContactConstraints,
                broadPhaseLayerInterface.getAddress(),
                objectVsBroadPhaseLayerFilter.getAddress(),
                objectLayerPairFilter.getAddress()
        );
    }
    @JniBind("""
            PhysicsSystem* self = new PhysicsSystem();
            self->Init(
                maxBodies, numBodyMutexes, maxBodyPairs, maxContactConstraints,
                *((BroadPhaseLayerInterface*) broadPhaseLayerInterface),
                *((ObjectVsBroadPhaseLayerFilter*) objectVsBroadPhaseLayerFilter),
                *((ObjectLayerPairFilter*) objectLayerPairFilter)
            );
            return (long) self;""")
    private static native long _ctor(
            int maxBodies,
            int numBodyMutexes,
            int maxBodyPairs,
            int maxContactConstraints,
            long broadPhaseLayerInterface,
            long objectVsBroadPhaseLayerFilter,
            long objectLayerPairFilter
    );

    public BodyInterface getBodyInterface() { return BodyInterface.ref(_getBodyInterface(address)); }
    @JniSelfBind("return (long) &self->GetBodyInterface();")
    private static native long _getBodyInterface(long address);

    public BodyInterface getBodyInterfaceNoLock() { return BodyInterface.ref(_getBodyInterfaceNoLock(address)); }
    @JniSelfBind("return (long) &self->GetBodyInterfaceNoLock();")
    private static native long _getBodyInterfaceNoLock(long address);

    public @Nullable BodyActivationListener getBodyActivationListener() { return BodyActivationListener.ref(_getBodyActivationListener(address)); }
    @JniSelfBind("return (long) self->GetBodyActivationListener();")
    private static native long _getBodyActivationListener(long address);

    public void setBodyActivationListener(@Nullable BodyActivationListener value) { _setBodyActivationListener(address, value == null ? 0 : value.getAddress()); }
    @JniSelfBind("self->SetBodyActivationListener((BodyActivationListener*) value);")
    private static native void _setBodyActivationListener(long address, long value);

    public @Nullable ContactListener getContactListener() { return ContactListener.ref(_getContactListener(address)); }
    @JniSelfBind("return (long) self->GetContactListener();")
    private static native long _getContactListener(long address);

    public void setContactListener(@Nullable ContactListener value) { _setContactListener(address, value == null ? 0 : value.getAddress()); }
    @JniSelfBind("self->SetContactListener((ContactListener*) address);")
    private static native void _setContactListener(long address, long value);
}