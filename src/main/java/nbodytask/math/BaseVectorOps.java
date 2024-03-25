package nbodytask.math;

public class BaseVectorOps implements VectorOps {

    public static BaseVectorOps INSTANCE = new BaseVectorOps();

    @Override
    public VectorND sum(VectorND v1, VectorND v2) {

        checkDimensions(v1, v2);

        if (v1 instanceof Vector3D) {
            Vector3D v = (Vector3D) v1;
            return new Vector3D(
                    v.x + v2.getValue(0),
                    v.y + v2.getValue(1),
                    v.z + v2.getValue(2));
        }

        throw new UnsupportedOperationException("The first vector is not Vector3D");
    }

    public void checkDimensions(VectorND v1, VectorND v2) {
        if (v1.getDimenstion() != v2.getDimenstion()) {
            throw new VectorNDException("Dimension %d does not equal to %d", v1.getDimenstion(), v2.getDimenstion());
        }
    }
}
