package my.test;

import javax.swing.*;

public class TableCalc {
    public static void main(String[] args) {
        int countError = 0;
        for(var i = 0;i < 3;i++){
            int n1 = (int) (Math.random() * 10);
            int n2 = (int) (Math.random() * 10);
            int res = n1 * n2;

            int answer = Integer.parseInt(JOptionPane.showInputDialog(n1  + " * " + n2 + " = ?" ));
            if(answer != res){
                countError++;
            }
        }

        switch (countError){
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null,"OK!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error!");
        }

    }
}
