package main.HW1;

import javax.swing.*;

public class HW1 {
        //1
    private static void phone(int day, int time){
         int price = 10;
         double sum;
        switch (day){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            sum = time*price;
            System.out.println(sum);
            break;
        case 6:
        case 7:
            sum = (int)time*price*0.2;
            System.out.println(sum);
            break;
        }
    }
    //2
       private static void sw_2() {
           int num = (int) (Math.random() * 5);
           switch (num) {
               case 0:
                   System.out.println("0-5");
                   break;
               case 1:
                   System.out.println("1-5");
                   break;
               case 2:
                   System.out.println("2-5");
                   break;
               case 3:
                   System.out.println("3-5");
                   break;
               case 4:
                   System.out.println("4-5");
                   break;
               case 5:
                   System.out.println("5");
                   break;
           }
           System.out.println("Ваше число " +num);
       }
    //4
    private static void nech(){
        int sum=0;
    for(int i=1;i<50;i++){
        if(i%2==1){
            sum+=i;
        }
    }
        System.out.println(sum);
    }
   // 5
    private static void prost(){

        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }
    }
    public static void main(String[] args){
        int time = Integer.parseInt(JOptionPane.showInputDialog("Продолжительность разговора"));
        int day = Integer.parseInt(JOptionPane.showInputDialog("День недели по порядку(1-7)"));
    phone(day,time);
 nech();
prost();
 sw_2();
    }
}
