package by.epam.javatraining.veronikakhlopava.model.logic;

import by.epam.javatraining.veronikakhlopava.model.data.Vector;

public class VectorWorker {

    public static double findMax(Vector vector){

        double max = vector.getElement(0);
        for (int i = 1; i < vector.sizeOfArray(); i++){
            if (Double.compare(max, vector.getElement(i)) < 0){
                max = vector.getElement(i);
            }
        }
     return max;
    }

    public static double findMin(Vector vector){

        double min = vector.getElement(0);
        for (int i = 1; i < vector.sizeOfArray(); i++){
            if (Double.compare(min, vector.getElement(i)) > 0){
                min = vector.getElement(i);
            }
        }
        return min;
    }

    public static double findAverage(Vector vector){
        double sum = 0.0;
        for(int i = 0; i < vector.sizeOfArray(); i++){
            sum += vector.getElement(i);
        }
        return (sum / vector.sizeOfArray());

    }

    public static double findGeometricMean(Vector vector){
        double product = 0.0;
        for(int i = 0; i < vector.sizeOfArray(); i++)
        {
            product *= vector.getElement(i);
        }
        return Math.pow(product, 1.0/vector.sizeOfArray());
    }


    public static boolean isSortedAscending(Vector vector){
        for(int i = 0; i < vector.sizeOfArray() - 1; i++){
            if(vector.getElement(i) > vector.getElement(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static int isLocalMinimum(Vector vector){
        int index = 0;
        int indexOfMinimum = -1;
        if( vector.getElement(index) < vector.getElement(index + 1)){
            indexOfMinimum = index;
        } else

        for(int i = 1; i + 1 < vector.sizeOfArray(); i++){
            if ( vector.getElement(i) < vector.getElement(i - 1) && vector.getElement(i) > vector.getElement(i + 1)){
                indexOfMinimum = i;
            }
        }

        if (vector.getElement(vector.sizeOfArray() - 1) < vector.getElement(vector.sizeOfArray() - 2) ){
            indexOfMinimum = vector.sizeOfArray();
        }
        return indexOfMinimum;
    }

    public static int linearSearch (Vector vector, double element){
        for(int i = 0; i < vector.sizeOfArray(); i++){
            if(Double.compare(vector.getElement(i), element) == 0){
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(Vector vector, double element){
        if(isSortedAscending(vector)){
            int indexOfFirstElement = 0;
            int indexOfLastElement = vector.sizeOfArray() - 1;
            int indexOfAverage = (indexOfFirstElement + indexOfLastElement)/2;

            if(vector.getElement(indexOfAverage) == element){
                return indexOfAverage;
            } else
                if (element > vector.getElement(indexOfAverage)){
                    for (int i = indexOfAverage; i < vector.sizeOfArray(); i++){
                        if (element == vector.getElement(i)){
                            return i;
                        }
                    }
                } else {
                    for (int i = indexOfAverage; i < vector.sizeOfArray(); i--){
                        if (element == vector.getElement(i)){
                            return i;
                }
        }
    }
}
        return -1;
    }

    public static void reverse(Vector vector){

        for(int firstElement = 0, lastElement = (vector.sizeOfArray() - 1); firstElement != (vector.sizeOfArray()/2);
        firstElement++, lastElement--){
            double temp = vector.getElement(firstElement);
            vector.setElement(vector.getElement(lastElement), firstElement);
            vector.setElement(temp, lastElement);
        }

    }

    public static void bubbleSort(Vector vector){

        for (int i = 0; i < (vector.sizeOfArray()-1); i++){
            if (vector.getElement(i) > vector.getElement(i + 1) ){
                double temp = vector.getElement(i);
                vector.setElement(vector.getElement(i + 1), i);
                vector.setElement(temp, i + 1);
            }
        }
    }

    public static void insertionSort(Vector vector){

        for(int i  = 1; i < vector.sizeOfArray(); i++){
            for(int j = i; vector.getElement(j - 1) > vector.getElement(j); j--){
                double temp = vector.getElement(j);
                vector.setElement(vector.getElement(j + 1), j);
                vector.setElement(temp, j + 1);


            }
        }
    }

    public static void selectionSort(Vector vector){

        for(int i  = 0; i < (vector.sizeOfArray()-1); i++){
            double min = findMin(vector);
            int indexOfMin = 0;
            if(vector.getElement(i) == min){
                indexOfMin = i;
            }
            vector.setElement(vector.getElement(i), indexOfMin);
            vector.setElement(min, i);
        }
    }


}
