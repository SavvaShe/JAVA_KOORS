package task_1;

public class Main {
    public static void main(String[] args) {
        Car finalcar = new Bild().createBuilder("серый", "Volvo", 70);
        finalcar.on();
        System.out.println(finalcar);
    }
}
