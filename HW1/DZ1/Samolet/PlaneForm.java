package Samolet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaneForm {
    List<Plane> plan = new ArrayList<>();
    BufferedReader nazsamoleta;
    BufferedReader nomerSamoleta;
    BufferedReader useransver;
    int nam = 0;
    String naz;
    int nom;
    public PlaneForm () throws IOException {
        for (; ; ) {
            int count;
            nazsamoleta = new BufferedReader(new InputStreamReader(System.in));
            useransver = new BufferedReader(new InputStreamReader(System.in));
            nomerSamoleta = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Чтобы добавить самолет ввудите ADD, чтобы распечатать номера самолетов введите exitAll, чтобы удалить самолеты которые выезжают введите exitLast, чтобы выйти введиете EXIT");
            String userAnsver = useransver.readLine();
            switch (userAnsver) {
                case "ADD":
                    while (nam < 5) {
                        System.out.println("Введите название самолета ");
                        naz = nazsamoleta.readLine();
                        System.out.println("Введите номер самолета ");
                        nom = Integer.parseInt(nomerSamoleta.readLine());
                        Collections.addAll(plan,
                                new Plane(naz, nom));
                        nam++;
                    }
                    System.out.println("Нет свободных Мест");
                    break;
                case "exitAll":
                    for (Plane item : plan) {
                        System.out.println(item);
                    }
                    break;
                case "exitLast":
                    int c = 0;
                    nam--;
                    for (int i = 0; i <= nam; nam--) {
                        String deleteCity = String.valueOf(plan.remove(nam));
                        System.out.println(deleteCity + " был удален!");
                    }
                    nam = c;
                    break;
                case "EXIT":
                    return;
                default:
            }
        }
    }
    public static void main(String[] args) throws IOException {
        PlaneForm office = new PlaneForm();
    }
}
