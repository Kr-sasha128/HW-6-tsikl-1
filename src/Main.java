public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Инерация цикла " + i);
        }
        for (int o = 2020; o <= 2070; o = o + 4) {
            System.out.println("Весокосный год " + o);
        }
        int salary = 65535;
        int total = 0;
        for (int l = 0; l < 12; l++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println("Задача 1⬇");
        for (int q = 1; q <= 10; q++) {
            System.out.println(q);
        }
        System.out.println("Задача 2⬇");
        for (int q = 10; q > 0; q--) {
            System.out.println(q);
        }
        System.out.println("Задача 3⬇");
        for (int q = 0; q < 17; q = q + 2) {
            System.out.println(q);
        }
        System.out.println("Задача 4⬇");
        for (int q = 10; q >= -10; q--) {
            System.out.println(q);
        }
       System.out.println("Задача 5⬇");
        for (int q = 1904; q <= 2098; q = q + 4) {
            System.out.println(q + " Год является високосным");
        }
       System.out.println("Задача 6⬇");
        for (int q = 7; q <= 98; q = q + 7) {
            System.out.println(q);
        }
        System.out.println("Задача 7⬇");
        for (int q = 1; q <= 512; q = q * 2) {
            System.out.println(q);
        }
        System.out.println("Задача 8  + 9⬇");
        int nakopleniya = 29000;
        int totalTwo = 0;
        for (int q = 1; q <= 12; q++) {
            totalTwo = totalTwo + totalTwo / 100;
            totalTwo = totalTwo + nakopleniya;
            System.out.println("Месяц " + q + " сумма накоплений равна " + totalTwo + " рублей");
        }
        System.out.println("Задача 10⬇");
        int number = 2;
        int totalNumber;
        for (int q = 1; q <= 10; q++) {
           totalNumber = number * q;
            System.out.println(number + " * " + q + " = " + totalNumber);
        }
    }
}