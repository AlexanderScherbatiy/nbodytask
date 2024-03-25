package nbodytask.math;

import java.util.Arrays;

public class ArrayVectorND implements VectorND {

    final double[] values;

    public ArrayVectorND(double... values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    @Override
    public int getDimenstion() {
        return values.length;
    }

    @Override
    public double getValue(int index) {
        return values[index];
    }
}
