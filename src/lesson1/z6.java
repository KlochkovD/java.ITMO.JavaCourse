package lesson1;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        System.out.println("b=" + b);
        if ((b % 2 == 0) && (b > 100)) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println(b + " четное");
        } else {
            System.out.println(b + " нечетное");
        }

    }
}
