public class Task3 {

    //Напечатать таблицу умножения на 7:
    //1 х 7 = 7
    //2 х 7 = 14
    //...
    //9 х 7 = 63

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x 7 = %d\n", i, i*7);
        }
    }
}
