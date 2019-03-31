package by.epam.javatraining.veronikakhlopava.controller;


import by.epam.javatraining.veronikakhlopava.model.data.Vector;
import by.epam.javatraining.veronikakhlopava.model.logic.VectorWorker;
import by.epam.javatraining.veronikakhlopava.util.Initializer;
import by.epam.javatraining.veronikakhlopava.view.Output;

public class Main {

    public static void main(String[] args) {

        Initializer init = new Initializer();

        Output.show(Initializer.createRandomVector(5));
        Output.show(VectorWorker.findMin(Initializer.createRandomVector(5)));


    }


}
