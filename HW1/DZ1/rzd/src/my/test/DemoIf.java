package my.test;

import javax.swing.*;

public class DemoIf {
    public static void main(String[] args) {
        int price = Integer.parseInt(JOptionPane.showInputDialog("¬ведите стоимость покупки"));
        if (price > 500 && price < 1000) {
            price -= price * 15 / 100;
        } else if (price >= 1000) {
            price -= price * 25 / 100;
        } else {
            System.out.println("—кидки не будет!");
        }
        System.out.println(price);

       // int a = 9;
       // if(a >= 10){
       //     if(a < 20){
       //         a++;
       //         if(true){
        //            a = 1;
        //        }else{
         //           a = 2;
          //          if(a > 5){
           //             a++;
            //        }
             //   }
              //  a++;
           // }
        //}else{
         //   a++;
       // }
        //System.out.println(a++);


    }
}//2
