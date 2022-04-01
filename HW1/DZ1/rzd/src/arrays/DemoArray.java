package arrays;

public class DemoArray {
    public static void main(String[] args) {
//        int arr[] = new int[10];
//        for (var i = 0;i < arr.length;i++){
//            arr[i] = (int) (Math.random() * 10);
//        }
//        int s = 0;
//        for(var item : arr){
//            System.out.print(item + "\t");
//            s += item;
//        }
//        System.out.println("\nСумма элементов массива = " + s);

//        Заполнить массив значениями 10 20 30...100
        int arr[] = new int[10];
        for(var i = 0;i < arr.length;i++){
            arr[i] = (i + 1) * 10;
            System.out.println(arr[i]);
        }
//        Индекс последнего элемента массива на 1 меньше длины массива
        System.out.println(arr[arr.length - 1]);

    }
}
