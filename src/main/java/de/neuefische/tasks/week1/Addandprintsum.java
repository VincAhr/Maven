package de.neuefische.tasks.week1;

public class Addandprintsum {

    public static void main(String[] args) {
        System.out.println("Summe: " +  printSum(add(7, 17)) + "\n");
//       printSum(7, 17);

        //    contain("wort");
    }

    public static int add(int number1, int number2) {

        return number1 + number2;
    }

    public static int printSum(int sum) {
//        System.out.println("Summe: " + sum + "\n");
        return sum;
    }

    public static void printSum(int number1, int number2) {
        System.out.println("Summe: " + add(number1, number2));
    }

    public static void contain(String word) {


//        String word = "Wie lang ist die Zeichenkette";
//
//        System.out.println(word);
//        System.out.println(word.length());
//        System.out.println("Beinhaltet die Zeichenkette das Wort fancy " + word.contains("fancy"));

    }
}
