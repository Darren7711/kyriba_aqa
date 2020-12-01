public class aqa {
    public static void main(String[]qwe){
       System.out.println("Hello world");
       int a = 1;
       boolean b = true;
       long c = 3215466;
       double d = 1.15646;
       float e = 1.1f;
       String g = "dssfs";

        double j = 5.73;
        a = (int) j;
        System.out.println(a);

        //переменные
        double param1 = 2;
        double param2 = 5;
        double sum = param1 / param2;
        System.out.println(sum);

        int increment = 0;
        increment++;
        System.out.println(increment);
        increment--;
        System.out.println(increment);

        //условные операторы
        int number = 0;
        if (number < 0) {
            System.out.println("Отрицательный");
        }
        if (number > 0) {
            System.out.println("Положительный");
        }
        if (number == 0) {
            System.out.println("0");
        }

        if (number < 0) {
            System.out.println("Отрицательный");
        } else {
            System.out.println("Не отрицательный");
        }

        int num = 42;
        if (num > 0){
            num++;
        } else if (num < 0){
            num = num -2;
        } else {
            num = 10;
        }
        System.out.println(num);
        }
    }
