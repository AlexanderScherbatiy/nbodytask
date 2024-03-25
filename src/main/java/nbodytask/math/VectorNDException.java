package nbodytask.math;

public class VectorNDException extends RuntimeException {

    public VectorNDException(String format, Object... args) {
        super(String.format(format, args));
    }
}
