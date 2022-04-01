package DomRab;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
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
