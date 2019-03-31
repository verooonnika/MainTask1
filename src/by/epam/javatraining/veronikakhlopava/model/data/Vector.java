package by.epam.javatraining.veronikakhlopava.model.data;

import java.io.DataInputStream;
import java.util.Arrays;

public class Vector {

    private static final int DEFAULT_LENGTH_OF_VECTOR = 0;
    private double[] array;

    public Vector() {

        array = new double[DEFAULT_LENGTH_OF_VECTOR];
    }

    public Vector(final int size) {

        array = new double[size];
    }

    public double getElement(int index) {
        return array[index];
    }

    public void setElement(double newElement, int index) {
        array[index] = newElement;
    }

    public int sizeOfArray() {
        return array.length;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
