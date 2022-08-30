import java.util.Scanner;

public class Task7 {

    //Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    //- сумму всех чисел последовательности;
    //- количество всех чисел последовательности

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;

        do {
            number = sc.nextInt();
            sum = sum + number;
            count++;
        }
        while (number != 0);

        sc.close();
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
    }
}
