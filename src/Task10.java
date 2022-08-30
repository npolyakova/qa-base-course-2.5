public class Task10 {

    //Дано натуральное число.
    //1) Определить его максимальную цифру
    //2) Определить его минимальную цифру

    public static void main(String[] args) {
        int number = 893478;
        int max = 0;
        int min = 9;

        do {
            int digit = number % 10; //8 //9
            number = number / 10; //89347 //8934

            if (digit > max) {
                max = digit;
                if (max == 9) {
                    break;
                }
            }

//            if (digit < min) {
//                min = digit;
//                if (min == 0) {
//                    continue;
//                }
//            }
        }
        while (number > 0);

        System.out.println("Max = " + max);

    }
}
