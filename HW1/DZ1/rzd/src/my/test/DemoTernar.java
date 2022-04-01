package my.test;

public class DemoTernar {
    public static void main(String[] args) {
        int day = 8;
//        System.out.println(day > 0 && day < 6 ? "Будний день" : "Выходной день");
        String s = (day > 0 && day < 8) ? (day > 0 && day < 6 ? "Будний день" : "Выходной день") : "День указан некорректно";
        System.out.println(s);

    }
}
