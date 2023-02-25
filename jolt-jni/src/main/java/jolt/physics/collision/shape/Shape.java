package jolt.physics.collision.shape;

import jolt.JoltNative;
import jolt.geometry.AABox;
import jolt.math.JtMat44f;
import jolt.math.JtQuat;
import jolt.math.JtVec3f;
import jolt.physics.body.MassProperties;
import jolt.physics.collision.PhysicsMaterial;
import jolt.physics.collision.TransformedShape;

public sealed interface Shape extends JoltNative permits CompoundShape, ConvexShape, ShapeImpl {
    static Shape ref(long address) { return address == 0 ? null : new ShapeImpl(address); }

    ShapeType getType();

    ShapeSubType getSubType();

    long getUserData();

    void setUserData(long userData);

    boolean mustBeStatic();

    JtVec3f getCenterOfMass(JtVec3f out);
    default JtVec3f getCenterOfMass() { return getCenterOfMass(new JtVec3f()); }

    AABox getLocalBounds(AABox out);
    default AABox getLocalBounds() { return getLocalBounds(new AABox()); }

    int getSubShapeIdBitsRecursive();

    AABox getWorldSpaceBounds(JtMat44f centerOfMassTransform, JtVec3f scale, AABox out);
    default AABox getWorldSpaceBounds(JtMat44f centerOfMassTransform, JtVec3f scale) { return getWorldSpaceBounds(centerOfMassTransform, scale, new AABox()); }

    float getInnerRadius();

    MassProperties getMassProperties(MassProperties out);
    default MassProperties getMassProperties() { return getMassProperties(new MassProperties()); }

    PhysicsMaterial getMaterial(int subShapeId);

    JtVec3f getSurfaceNormal(int subShapeId, JtVec3f localSurfacePosition, JtVec3f out);
    default JtVec3f getSurfaceNormal(int subShapeId, JtVec3f localSurfacePosition) { return getSurfaceNormal(subShapeId, localSurfacePosition, new JtVec3f()); }

    // TODO getSupportingFace

    long getSubShapeUserData(int subShapeId);

    TransformedShape getSubShapeTransformedShape(int subShapeId, JtVec3f positionCOM, JtQuat rotation, JtVec3f scale);

    // TODO getSubmergedVolume

    // TODO castRay

    // TODO scaleShape

    float getVolume();

    boolean isValidScale(JtVec3f scale);
}
