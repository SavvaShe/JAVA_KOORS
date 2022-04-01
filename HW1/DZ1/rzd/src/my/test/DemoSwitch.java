package my.test;

import javax.swing.JOptionPane;

public class DemoSwitch {
    public static void main(String[] args) {
        String svetophor = JOptionPane.showInputDialog("Какой горит цвет (red,green,yellow)");
        switch (svetophor){
            case "red":
                System.out.println("Стоп");
                break;
            case "green":
                System.out.println("Вперед");
                break;
            case "yellow":
                System.out.println("Внимание");
                break;
            default:
                System.out.println("Поломка светофора");
        }
//        JOptionPane.showMessageDialog(null,"Тестовое сообщение");
    }

}
