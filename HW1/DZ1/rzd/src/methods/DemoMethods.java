package methods;

public class DemoMethods {
    static int calc(int a,int b){
        if(isEven(a) && isEven(b))
            return a + b;
        return a * b;
//        Оператор return присваивает методу значение и немедленно завершает работу метода
    }

    static boolean isEven(int n){
        return n % 2 == 0;
//        if(n % 2 == 0){
//            return true;
//        }
//        return false;
    }

    public static void main(String[] args) {
        int res = 2 * calc(3,4);
        System.out.println(res);
    }
}
