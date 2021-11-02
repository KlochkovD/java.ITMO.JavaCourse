package lesson2;

import java.util.Arrays;

public class z5 {
    public static void main(String[] args)
    {
        int[] array = {3, -3, 7, 4, 5, 4, 3};

        System.out.println(Arrays.toString(array));
        System.out.println((array[0] == 3 || array[array.length-1] !=0));
    }
}