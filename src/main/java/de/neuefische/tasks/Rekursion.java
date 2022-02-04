package de.neuefische.tasks;

public class Rekursion {

    public int calculateSum(int value){
        if(value < 1) {
            return 0;
        }
        return calculateSum(value - 1) + value;
    }





}
