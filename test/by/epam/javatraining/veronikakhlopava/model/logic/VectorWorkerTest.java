package by.epam.javatraining.veronikakhlopava.model.logic;

import by.epam.javatraining.veronikakhlopava.model.data.Vector;
import by.epam.javatraining.veronikakhlopava.util.Initializer;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorWorkerTest {
    Initializer init = new Initializer();

    @Test
    public void findMax() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        double expected = 5;
        assertEquals(expected, VectorWorker.findMax(vector),0.01);
    }

    @Test
    public void findMin() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        double expected = 1;
        assertEquals(expected, VectorWorker.findMin(vector),0.01);
    }

    @Test
    public void findAverage() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        double expected = 2;
        assertEquals(expected, VectorWorker.findAverage(vector),0.01);
    }

    @Test
    public void isSortedAscending() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        boolean expected = true;
        assertEquals(expected, VectorWorker.isSortedAscending(vector));
    }

    @Test
    public void isLocalMinimum() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        int expected = 1;
        assertEquals(expected, VectorWorker.isLocalMinimum(vector));
    }

    @Test
    public void linearSearch() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        int expected = 4;
        assertEquals(expected, VectorWorker.linearSearch(vector, 4));
    }

    @Test
    public void binarySearch() {
        Vector vector = new Vector(5);
        init.initilize(vector, 1,2,3,4,5);
        int expected = 4;
        assertEquals(expected, VectorWorker.binarySearch(vector, 4));
    }

    @Test
    public void bubbleSort() {
        Vector vector = new Vector(5);
    }

    @Test
    public void insertionSort() {
        Vector vector = new Vector(5);
    }

    @Test
    public void selectionSort() {
        Vector vector = new Vector(5);
    }
}