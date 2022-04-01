package oop;

public class Loader {
    public static void main(String[] args) {
        //При создании объекта класса вызывается конструктор класса, т.е. метод с именем класса
        Car car = new Car("UAZ",1000);
        Car car2 = new Car("VAZ",900);
        Car car3 = new Car("GAZ",1200);

        Car cars[] = {car,car2,car3};

        for (var item : cars){
            if(item.title.equalsIgnoreCase("VAZ")){
                var bonus = new Bonus();
                bonus.setDiscaunt(item);
            }
            item.showInfo();
        }
    }
}
