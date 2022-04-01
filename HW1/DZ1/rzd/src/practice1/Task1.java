package practice1;
//Дано трехзначное число. Найти число десятков, число единиц и произведение цифр
public class Task1 {
    public static void main(String[] args) {
        int x = 723;
        int x1 = x / 100;
        int x2 = x % 100 / 10;
        int x3 = x % 10;
        System.out.println(x1 + " " + x2 + " " + x3);
    }
}
