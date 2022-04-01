package my.test;

public class DemoContinue {
    public static void main(String[] args) {
        int str = 1;
//        if(true)
//            str++;


        while (str <= 100){
            if(str == 6){
                break;
            }
            int st = 1;
            while (st <= 10){
                if(st == 5){
                    st++;
                    continue;
                }
                int x = str * st;
                System.out.print(x + "\t");
                st++;
            }
            System.out.println();
            str++;
        }
    }
}
