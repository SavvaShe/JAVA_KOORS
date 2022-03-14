package task_3;

import java.util.Arrays;
import java.util.Scanner;

public class t_3 {

    public static void main(String[] args) {

        int[] a = new  int[6];
        Scanner in = new Scanner(System.in);
        for ( int i = 0; i< a.length;i++) {
            System.out.print("Введите " + (i+1) + "-й элемент массива:");
            a[i]= in.nextInt();
            System.out.println( a[i] + " - ");

        }
        System.out.println(Arrays.toString(a));
        for (int i = 0, j = a.length; i < j / 2; i++) {

            int tmp = a[j - i - 1];
             a[j - i - 1] =a[i] ;
            a[i] = tmp;


        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }

        System.out.println(Arrays.toString(a));
    }
}

