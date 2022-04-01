package methods;

public class DemoRec {

//    static void showNumber(int n){
//        System.out.println(n);
//        if(n == 0){
//            return;
//        }
//        showNumber(n - 1);
//    }
//
//    public static void main(String[] args) {
//        showNumber(5);
//    }

//    5! = 1 * 2 * 3 * 4 * 5 = 5 * 4!
//    n! = n * (n - 1)!

    static int getFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * getFact(n - 1);
    }
}

//3! = 3 * getFact(2) = 3 * 2 * 1 = 6

