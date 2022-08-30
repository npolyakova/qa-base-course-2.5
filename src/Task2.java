public class Task2 {
    //Напечатать числа следующим образом:
    //10 10.4
    //11 11.4
    //...
    //25 25.4

    public static void main(String[] args) {
        for (int i = 10; i < 26; i++) {
            System.out.print(i + " " + i + ".4");
            System.out.println();
        }
    }
}
