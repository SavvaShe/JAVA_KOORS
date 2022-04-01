package my.test;

public class DzSumma {
    public static void main(String[] args) {
        int n=0;
        for (int i=1;i<100;i++){
            if (i>0) {
                if (i <= 50) {
                    if (i % 2 != 0) {
                        n += i;
                    }
                }
            }
        }
        System.out.println("Сумма нечетных чисел равна " + n);
    }
}
