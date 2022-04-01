package arrays;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
//        int matrix[][] = {
//                {1,2,3},
//                {5,4,5,7},
//                {4,2,1,3,4,6}
//        };
//
//        for(var i = 0;i < matrix.length;i++){
//            for(var j = 0;j < matrix[i].length;j++){
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
          // int a=0;
           //int c=0;
        //  for(var j = 0;j < 5;j++){
             //         int n=0;
                //System.out.print((i * j) + "\t");
             //   a+=(i*j);
               // n+=(i*j);
                  //    System.out.println("сумма по столбцам= " + n);
                 //     c+=n;

           // System.out.println("сумма по столбцу=" +c);
           // System.out.println("сумма по строкам= " + a);
                //      System.out.println();
                      int[][] matrix=new int[5][5];
                      for(var i = 0;i <5;i++){
                      for(var j = 0;j < 5;j++){
                      matrix[i][j]=i*j;
        }
        }
        for (var f=0;f<5;f++){
            int a=0;
              for (var k=0;k<5;k++) {
              a += matrix[f][k];
            System.out.print(matrix[f][k] + "\t");
                       }
                       System.out.println("строка= " + a);
//            System.out.println("столбец= " + c );
            System.out.println();
        }

        for (int b=0;b < 5;b++){
            int c = 0;
            for (int l=0;l < 5;l++){
                c += matrix[l][b];
            }
            System.out.println("столбец= "+ c);
        }
        System.out.println();

        //Копирование без дубля
        int matrix1[]=new int[10];
        for (int i=0;i<matrix1.length;i++){
            matrix1[i]=(int)(Math.random()*30);
            System.out.print(matrix1[i]+"\t");
        }
        System.out.println();
        int [] matrix2= Arrays.stream(matrix1).distinct().toArray();//Arrays.stream уберает дубли из массива.
        for (int i :matrix2){
            System.out.print(i+"\t");
        }
    }
}
