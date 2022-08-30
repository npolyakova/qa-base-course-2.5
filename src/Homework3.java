import java.util.Scanner;

public class Homework3 {

    //Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
    // (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны первого треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p1 = 0;
        int p2 = 0;
        double s1 = 0;
        double s2 = 0;

        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            p1 = findP(a, b, c);
            System.out.println("P = " + p1);
            s1 = findS(p1, a, b, c);
            System.out.println("S = " + s1);
        }
        else {
            System.out.println("Не треугольник");
            //закончить программу
        }

        System.out.println("Введите стороны второго треугольника");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x + y > z) && (y + z > x) && (z + x > y)) {
            p2 = findP(x, y, z);
            s2 = findS(p2, x, y, z);
            System.out.println("S = " + s2);
        }
        else {
            System.out.println("Не треугольник");
            //закончить программу
        }

        System.out.println("Сумма периметров = " + (p1 + p2));
        System.out.println("Сумма площадей = " + (s1 + s2));
    }

    public static int findP(int a, int b, int c) {
        return a+b+c;
    }

    public static double findS(int p, int a, int b, int c) {
        double pp = p/2.0;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }
}
