package by.epam.javatraining.veronikakhlopava.controller;


import by.epam.javatraining.veronikakhlopava.model.data.Vector;
import by.epam.javatraining.veronikakhlopava.model.logic.VectorWorker;
import by.epam.javatraining.veronikakhlopava.view.Output;

public class Main {

    public static void main(String[] args) {

        Vector vector = new Vector(5);
        vector.initilize(vector, 1,2,3,4,5);
        Output.showVector(vector);

        Vector vector2 = new Vector(5);
        vector2.addElement(15);
        Output.showVector(vector2);

        Vector vectorRandom  = new Vector(6);
        vectorRandom.fill();
        Output.showVector(vectorRandom);

        Output.showResult(VectorWorker.findMin(vector)) ;





    }



}
