package oop;

public class Car {
    String title;
    int price;

    Car(String title,int price){
        this.title = title;
        this.price = price;
    }


    void showInfo(){
        System.out.println("Автомобиль " + title + " стоит " + price);
    }
}
