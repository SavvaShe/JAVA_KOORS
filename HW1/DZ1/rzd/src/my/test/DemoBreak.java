package my.test;

public class DemoBreak {
    public static void main(String[] args) {
        int str = 1;//счетчик строк
        while (str <= 100){
            if(str == 6){
                break;
            }
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
