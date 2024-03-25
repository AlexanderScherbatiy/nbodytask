package sample;

import nbodytask.math.Vector3D;
import nbodytask.math.VectorND;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello, NBodyTask!%n");
        VectorND v = new Vector3D(1.1, 2.2, 3.3);
        System.out.printf("%s%n", v);
    }
}