package task_2;

public class t_2 {
    public static void main(String[] args) {
     int[] a = new int[10];
    int[] b = new int[10];
    for(int i = 0;i< a.length;i++){
        a[i] = (int)(Math.random()*10 + 1);
        for(int j = 0;j< b.length;j++){
            b[j] = (int)(Math.random()*10 + 1);
            try {
                System.out.println( a[i] +" / " + b[j] + " Результат: " + a[i]/b[j]);
                continue;
            }catch (ArithmeticException e){
                //e.getMessage() - получение информации об ошибке
                System.out.println(a[i] +" / " + b[j] + " Результат: " + "На 0 делить нельзя!");
                break;
            }
        }
    }
    }
}
