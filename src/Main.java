public class Main {

    public static void main(String[] args) {

        //задание 2
        byte b = -109;
        short s = 13666;
        int a = 158;
        long l = 249584L;
        float f = 13.31f;
        double d = -24.432;
        char ch = '\u2235';
        boolean val = true;

    }

    //задание 3
    public static double calculate(int a, int b, int c, int d) {
        if (d == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            return a * (b + (1.0 * c / d));
        }
        return 0;
    }

    //задание 4
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //задание 5
    public static void positiveOrNegative(int number) {
        String word = (number >= 0) ? "positive" : "negative";
        System.out.println(number + " is " + word + " number");
    }

    //задание 6
    public static boolean isNegative(int num) {
        return num < 0;
    }

    //задание 7
    public static void printHelloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //задание 8
    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "-й год - високосный");
        } else {
            System.out.println(year + "-й год не является високосным");
        }
    }

}
