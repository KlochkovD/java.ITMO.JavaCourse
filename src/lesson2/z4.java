package lesson2;

import java.util.Scanner;
public class z4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.print("Результат: "+sum(a, b, c,true));
        System.out.print("\n");
    }

    public static boolean sum(int p, int q, int r, boolean abc)
    {
        if(abc)
            return (r > q);
        return (q > p && r > q);
    }
}