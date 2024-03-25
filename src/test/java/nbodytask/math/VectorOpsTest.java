package nbodytask.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static nbodytask.math.TestUtils.DELTA;

class VectorOpsTest {


    @Test
    void sumVectors3D() {

        Vector3D v1 = new Vector3D(1.1, 2.2, 3.3);
        Vector3D v2 = new Vector3D(4.4, 5.5, 6.6);

        VectorND sum = BaseVectorOps.INSTANCE.sum(v1, v2);

        assertEquals(3, sum.getDimenstion());
        assertEquals(5.5, sum.getValue(0));
        assertEquals(7.7, sum.getValue(1));
        assertEquals(9.9, sum.getValue(2), DELTA);
    }
}