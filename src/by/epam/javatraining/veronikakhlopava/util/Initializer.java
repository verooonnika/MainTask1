package by.epam.javatraining.veronikakhlopava.util;

import by.epam.javatraining.veronikakhlopava.model.data.Vector;

import java.util.Arrays;
import java.util.Random;

public class Initializer {


    public static Vector createDefaultVector(int length) {
        if (length >= 0) {
            return new Vector(length);
        } else {
            throw new IllegalArgumentException("Illegal size");
        }
    }

    public static Vector createRandomVector() {
        Random random = new Random();
        Vector vector = createDefaultVector(random.nextInt(10));
        for (int i = 0; i < vector.sizeOfArray(); i++) {
            vector.setElement(random.nextDouble() * 100, i);
        }
        return vector;
    }

    public static Vector createRandomVector(int length) {
        Random random = new Random();
        Vector vector = createDefaultVector(length);
        for (int i = 0; i < vector.sizeOfArray(); i++) {
            vector.setElement(random.nextDouble() * 100, i);
        }
        return vector;
    }

    public Vector addElement(Vector vector, double element) {

        vector.setArray(Arrays.copyOf(vector.getArray(), vector.getArray().length + 1));
        vector.getArray()[vector.sizeOfArray() - 1] = element;
        return vector;
    }

    public void initilize(Vector vector, final double... value) {
        for (int i = 0; i < vector.sizeOfArray(); i++) {
            vector.setElement(value[i], i);
        }
    }
}
