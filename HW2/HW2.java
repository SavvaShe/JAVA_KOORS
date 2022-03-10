package main.HW2;

import java.util.*;

public class HW2 {


    //1-2
//    private  static  void mas(){
//        int sumstr=0;
//        int sumst=0;
//        for(int i = 0;i < 5;i++){
//            for(int j = 0;j < 5;j++){
//                System.out.println("Сумма строки = "+sumstr);
//                System.out.print((i * j) + "\t");
//                sumstr += j;
//
//            }
//            sumst += i;
//
//            System.out.println();
//            System.out.println("Сумма строки = "+sumst);
//        }
//
//
//    }
    //3
    private  static void massR(){

//        String[] sA = {"слова", "которые", "не", "просто", "слова", "а", "массив", "слов"};
//        String[] sB = new String[sA.length];
//        HashMap<String, String> shMap  = new HashMap<String, String>();
//
//        for (int i = 0; i < sA.length; i++) shMap.put(sA[i], "");
//        int j=0;
//        for (int i = 0; i < sA.length; i++) {
//            if( shMap.get(sA[i]).equals("")) {
//                shMap.put(sA[i], sA[i]);
//                sB[j++] = sA[i];
//            }
//        }
//        System.out.println(sA[i] + " ");
//        System.out.println(sB[i] + " ");

    }

        public static  void main(String[] args)
        {//        mas();


            int[] numbers = new int[15];
            for(int i = 0;i < numbers.length;i++){
                numbers[i] = (int)(Math.random()*100);
                System.out.println(numbers[i]);

            }
            System.out.println("___________________________________");
            int[] uniqueNumbers = Arrays.stream(numbers).distinct().toArray();
            for (int i : uniqueNumbers)
            {
                System.out.println(i);
            }
        }


}
