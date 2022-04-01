package my.test;

public class DemoWhile {
    public static void main(String[] args) {
//        Счетчик цикла - это переменная, от которой зависит количество повторений тела цикла
//        int i = 1;
//        while (i <= 10){
//            System.out.println("Элемент №" + i);
//            i++;
//        }

        int str = 1;//счетчик строк
        while (str <= 100){
            int st = 1;
            while (st <= 10){
                int x = str * st;
                System.out.print(x + "\t");
                st++;
            }
            System.out.println();
            str++;
        }
    }
}
