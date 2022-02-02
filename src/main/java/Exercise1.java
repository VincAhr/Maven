public class Exercise1 {

    public static void main(String[] args) {
        printSum(add(7, 17));
        contain("wort");
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static void printSum(int sum) {
        System.out.println("Summe: " + sum + "\n");
    }


    public static void contain(String word) {

        word = "Wie lang ist die Zeichenkette";

        System.out.println(word);
        System.out.println(word.length());
        System.out.println("Beinhaltet die Zeichenkette das Wort fancy " + word.contains("fancy"));

    }

}
