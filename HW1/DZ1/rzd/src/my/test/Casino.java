package my.test;

import javax.swing.*;

public class Casino {
    public static void main(String[] args) {
        int money = Integer.parseInt(JOptionPane.showInputDialog("Введите сумму"));
        if(money < 1000){
            JOptionPane.showMessageDialog(null,"Для начала игры сумма должна быть от 1000");
        }else {
            int rate = Integer.parseInt(JOptionPane.showInputDialog("Введите ставку"));
            while (rate > money){
                rate = Integer.parseInt(JOptionPane.showInputDialog("Вы ввели некорректную ставку, попробуйте снова"));
            }
           JOptionPane.showMessageDialog(null,"Игра началась!");
           int number = (int) (Math.random() * 9+1);
           int numberTry = 3;
           while(numberTry > 0){
               int n = Integer.parseInt(JOptionPane.showInputDialog("Попытка №" + (4 - numberTry)));
               if(n == number){
                   money += rate;
                   JOptionPane.showMessageDialog(null,"Вы выиграли! Ваша сумма стала = " + money);
                   break;
               }
               if(numberTry == 1){
                   money -= rate;
                   System.out.println("Вы проиграли! Было загадано " + number + "\nВаша сумма " + money);
               }
                numberTry--;
           }
        }

    }
}
