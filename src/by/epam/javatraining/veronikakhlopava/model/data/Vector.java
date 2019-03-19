package by.epam.javatraining.veronikakhlopava.model.data;

import java.util.Arrays;
import java.util.Random;

public class Vector {

    private double [] array;

    public Vector(){

        array = new double[0];
    }

    public Vector ( final int size) {

        array = new double[size];
    }

    public void addElement ( double element)
    {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;

    }

    public double getElement(int index){
        return array[index];
    }

    public void setElement (double newElement, int index){
        array[index] = newElement;
    }

    public void fill(){

        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble() * (200 - 100);
        }

    }

    public int sizeOfArray(){

        return array.length;
    }


    public void initilize(Vector vector, final double... value){
        for(int i = 0; i < vector.sizeOfArray(); i++ ){
            vector.setElement(value[i], i );
        }
    }

    public double[] getArray() {
        return array;
    }

}
