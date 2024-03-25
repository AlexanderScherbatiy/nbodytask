package nbodytask.math;

public class Vector3D implements VectorND {

    final double x;

    final double y;

    final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getDimenstion() {
        return 3;
    }

    @Override
    public double getValue(int index) {
        switch (index) {
            case 0:
                return x;
            case 1:
                return y;
            case 2:
                return z;
            default:
                throw new VectorNDException("index: %d, size: %d", index, getDimenstion());
        }
    }

    @Override
    public String toString() {
        return String.format("Vector { dim: 3, values: [%f, %f, %f] }", x, y, z);
    }
}
