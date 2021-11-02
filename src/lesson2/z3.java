package lesson2;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.print("Результат: "+sum(a, b, c));
        System.out.print("\n");
    }

    public static boolean sum(int p, int q, int r)
    {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }
}