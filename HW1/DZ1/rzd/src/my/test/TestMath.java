package my.test;

public class TestMath {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(9));
//        int x = (int) Math.sqrt(9);//sqrt - корень квадратный
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.round(4.464));

//        Нахождение рандомных чисел
//        int x = (int)(Math.random()); //[0,1)

//        Получаем значение от 1 до 10: [1,10)
//        int x = (int)(Math.random() * 10);
//        System.out.println(x);

//        Получить года выпуска автомобилей. Есть 3 авто, вывести года выпуска в порядке возрастания

        int year1 = (int)(Math.random() * (2023 - 2012) + 2012),
            year2 = (int)(Math.random() * (2023 - 2012) + 2012),
            year3 = (int)(Math.random() * (2023 - 2012) + 2012);

//        System.out.printf("%d, %d, %d",year1,year2,year3);
        int max = Math.max(Math.max(year1,year2),year3);
        int min = Math.min(Math.min(year1,year2),year3);
//        int middle = Math.min(Math.max(year1,year2),year3);

        int middle = year1 + year2 + year3 - max - min;

        System.out.println(min + " " + middle + " " + max);
    }
}
