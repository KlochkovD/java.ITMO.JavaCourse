package lesson2;

import java.util.Arrays;

public class z6 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Массив");
        System.out.println(Arrays.toString(array));
        int a = 1;
        int b = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                System.out.println("содержит в себе число: " + a);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == b) {
                System.out.println("содержит в себе число: " + b);
            }

        }
    }
}