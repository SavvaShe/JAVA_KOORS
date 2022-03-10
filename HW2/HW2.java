package main.HW2;

import java.util.*;

public class HW2 {


    //1-2
    private  static  void mas(){

        int sumst=0;
        for(int i = 0;i < 5;i++){
            int sumstr = 0;
            for(int j = 0;j < 5;j++){
                int sumstr1=0;
                System.out.print((i * j) + "\t");
                sumstr1 += (i*j);

                sumstr += sumstr1;
            }

            System.out.println("Сумма строки = "+sumstr);
            System.out.println("Сумма строки = "+sumstr);
            System.out.println();


        }


    }
    //3


        public static  void main(String[] args)
        {        mas();


//            int[] numbers = new int[15];
//            for(int i = 0;i < numbers.length;i++){
//                numbers[i] = (int)(Math.random()*100);
//                System.out.println(numbers[i]);
//
//            }
//            System.out.println("___________________________________");
//            int[] uniqueNumbers = Arrays.stream(numbers).distinct().toArray();
//            for (int i : uniqueNumbers)
//            {
//                System.out.println(i);
//            }
        }


}
