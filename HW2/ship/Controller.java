package main.HW2.ship;

import main.HW2.ship.base.FixSpeed;
import main.HW2.ship.base.Police;
import main.HW2.ship.base.Ship;
import main.HW2.ship.base.WeightMeter;
/*
  3 задание считаю некоректным т.к. нет разделения скорости по грузовым или по легким поездам так же неизвестен допустимый вес для грузовых суден */
public class Controller
{
	public static Double lightBoatMaxWeight = 10000.0; //макс. вес легкого судна
    public static Integer lightBoatMaxHeight = 5000; // макс. допустимая высота судна в см*
    public static Integer stationMaxHeight = 10000; // макс. высота контр. пункта

    public static Integer lightBoatPrice = 100; // RUB
    public static Integer cargoBoatPrice = 250; // грузовое судно, плата за проезд
    public static Integer AdditionalPrice = 200; // если вес превышает допустимый

    public static Integer maxAcessSpeed = 50; // km/h
    public static Integer speedFineStep = 20; // km/h
    public static Integer finePerGrade = 500; // RUB
    public static Integer dangerSpeed = 70; // km/h

    public static void main(String[] args)
    {
        for(Integer i = 0; i < 10; i++)
        {
            Ship ship = FixSpeed.getNextShip();
            System.out.println(ship);
            System.out.println("Скорость: " + FixSpeed.getShipSpeed(ship) + " км/ч");



            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
            Boolean policeCalled = false;
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                String shipNumber = ship.getNumber();
                if(shipNumber.equals(criminalNumber)) {
                    Police.call("судно нарушителя с номером " + shipNumber);
                    blockWay("Немедленно остановитесь!");
                    break;
                }
            }
            if(Police.wasCalled()) {
                continue;
            }
            /**
             * Пропускаем спец. суда
             */
            if(ship.isSpecial()) {
                openWay();
                continue;
            }
            /**
             * Проверяем высоту и массу судна, вычисляем стоимость проезда
             */
            Integer shipHeight = ship.getHeight();
            Integer price = 0;
            if(shipHeight > stationMaxHeight)
            {
                blockWay("высота вашего судна превышает высоту пропускного пункта!");
                continue;
            }
            else if(shipHeight > lightBoatMaxHeight)
            {
                Double weight = WeightMeter.getWeight(ship);
                //Грузовое судно
                if(weight > lightBoatMaxWeight)
                {
                    price = lightBoatPrice;
                    if(ship.hasVehicle()) {
                        price = price + AdditionalPrice;
                    }
                }
                //Пассажирское судно
                else {
                    price =lightBoatPrice ;
                }
            }
            else {
                price = cargoBoatPrice;
            }

            /**
             * Проверка скорости судна и выставление штрафа
             */
            Integer shipSpeed = FixSpeed.getShipSpeed(ship);
            if(shipSpeed > dangerSpeed)
            {
                Police.call("cкорость судна - " + shipSpeed + " км/ч, номер - " + ship.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            else if(shipSpeed > maxAcessSpeed)
            {
                Integer overSpeed = shipSpeed - maxAcessSpeed;
                Integer totalFine = finePerGrade * (1 + overSpeed / speedFineStep);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine;
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

    }

    /**
     * Сбрасываение якоря
     */
    public static void openWay()
    {
        System.out.println("Сбрасывается якорь... Счастливого пути!");
    }

    public static void blockWay(String reason)
    {
        System.out.println("Движение невозможно: " + reason);
    }
}