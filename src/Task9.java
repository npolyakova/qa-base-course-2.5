public class Task9 {

    //Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30.
    // Оформить этот фрагмент в виде:
    //- оператора цикла с предусловием;
    //- оператора цикла с постусловием.

    public static void main(String[] args) {
        int number = 10;

        do {
            System.out.println(number);
            number++;
        }
        while (number < 30);

//        while(number < 30) {
//            System.out.println(number);
//            number++;
//        }
    }
}
