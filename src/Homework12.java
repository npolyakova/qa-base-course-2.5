public class Homework12 {

    //1. Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".
    //2. Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".
    public static void main(String[] args) {
        tenStarLine();
        anyStarLine(20);
    }

    public static void tenStarLine() {
        System.out.println("**********");
    }

    public static void anyStarLine(int count) {
        if(count>1) {
            count--;
            anyStarLine(count);
        }

        System.out.print("*");
    }
}
