package nbodytask.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static nbodytask.math.TestUtils.DELTA;

class Vector3DTest {

    @Test
    void getDimenstion_return3() {
        assertEquals(3, new Vector3D(1, 2, 3).getDimenstion());
    }

    @Test
    void getValue_returnValues() {
        Vector3D v = new Vector3D(1.1, 2.2, 3.3);
        assertEquals(1.1, v.getValue(0), DELTA);
        assertEquals(2.2, v.getValue(1), DELTA);
        assertEquals(3.3, v.getValue(2), DELTA);
    }

    @Test
    void getValue_throwsException() {
        assertThrows(VectorNDException.class, () -> new Vector3D(1, 2, 3).getValue(3));
    }
}