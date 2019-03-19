package by.epam.javatraining.veronikakhlopava.view;

import by.epam.javatraining.veronikakhlopava.model.data.Vector;

public class Output {

    public static void showVector(Vector vector){

        System.out.println("\n");
        for (int i = 0; i < vector.sizeOfArray(); i++){


            System.out.print(vector.getElement(i) + " ");
        }
    }


    public static void showResult(Double result){

        System.out.println("\n");
        System.out.println(result);
    }

    public void showResult(int result){

        System.out.println(result);
    }


}
