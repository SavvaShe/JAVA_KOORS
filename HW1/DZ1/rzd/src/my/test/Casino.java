package my.test;

import javax.swing.*;

public class Casino {
    public static void main(String[] args) {
        int money = Integer.parseInt(JOptionPane.showInputDialog("������� �����"));
        if(money < 1000){
            JOptionPane.showMessageDialog(null,"��� ������ ���� ����� ������ ���� �� 1000");
        }else {
            int rate = Integer.parseInt(JOptionPane.showInputDialog("������� ������"));
            while (rate > money){
                rate = Integer.parseInt(JOptionPane.showInputDialog("�� ����� ������������ ������, ���������� �����"));
            }
           JOptionPane.showMessageDialog(null,"���� ��������!");
           int number = (int) (Math.random() * 9+1);
           int numberTry = 3;
           while(numberTry > 0){
               int n = Integer.parseInt(JOptionPane.showInputDialog("������� �" + (4 - numberTry)));
               if(n == number){
                   money += rate;
                   JOptionPane.showMessageDialog(null,"�� ��������! ���� ����� ����� = " + money);
                   break;
               }
               if(numberTry == 1){
                   money -= rate;
                   System.out.println("�� ���������! ���� �������� " + number + "\n���� ����� " + money);
               }
                numberTry--;
           }
        }

    }
}
