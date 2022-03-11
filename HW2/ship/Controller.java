package main.HW2.ship;

import main.HW2.ship.base.FixSpeed;
import main.HW2.ship.base.Police;
import main.HW2.ship.base.Ship;
import main.HW2.ship.base.WeightMeter;
/*
  3 ������� ������ ����������� �.�. ��� ���������� �������� �� �������� ��� �� ������ ������� ��� �� ���������� ���������� ��� ��� �������� ����� */
public class Controller
{
	public static Double lightBoatMaxWeight = 10000.0; //����. ��� ������� �����
    public static Integer lightBoatMaxHeight = 5000; // ����. ���������� ������ ����� � ��*
    public static Integer stationMaxHeight = 10000; // ����. ������ �����. ������

    public static Integer lightBoatPrice = 100; // RUB
    public static Integer cargoBoatPrice = 250; // �������� �����, ����� �� ������
    public static Integer AdditionalPrice = 200; // ���� ��� ��������� ����������

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
            System.out.println("��������: " + FixSpeed.getShipSpeed(ship) + " ��/�");



            /**
             * �������� �� ������� ������ � ������ ������� �����������
             */
            Boolean policeCalled = false;
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                String shipNumber = ship.getNumber();
                if(shipNumber.equals(criminalNumber)) {
                    Police.call("����� ���������� � ������� " + shipNumber);
                    blockWay("���������� ������������!");
                    break;
                }
            }
            if(Police.wasCalled()) {
                continue;
            }
            /**
             * ���������� ����. ����
             */
            if(ship.isSpecial()) {
                openWay();
                continue;
            }
            /**
             * ��������� ������ � ����� �����, ��������� ��������� �������
             */
            Integer shipHeight = ship.getHeight();
            Integer price = 0;
            if(shipHeight > stationMaxHeight)
            {
                blockWay("������ ������ ����� ��������� ������ ����������� ������!");
                continue;
            }
            else if(shipHeight > lightBoatMaxHeight)
            {
                Double weight = WeightMeter.getWeight(ship);
                //�������� �����
                if(weight > lightBoatMaxWeight)
                {
                    price = lightBoatPrice;
                    if(ship.hasVehicle()) {
                        price = price + AdditionalPrice;
                    }
                }
                //������������ �����
                else {
                    price =lightBoatPrice ;
                }
            }
            else {
                price = cargoBoatPrice;
            }

            /**
             * �������� �������� ����� � ����������� ������
             */
            Integer shipSpeed = FixSpeed.getShipSpeed(ship);
            if(shipSpeed > dangerSpeed)
            {
                Police.call("c������� ����� - " + shipSpeed + " ��/�, ����� - " + ship.getNumber());
                blockWay("�� ����������� ��������� ��������. �������� �������!");
                continue;
            }
            else if(shipSpeed > maxAcessSpeed)
            {
                Integer overSpeed = shipSpeed - maxAcessSpeed;
                Integer totalFine = finePerGrade * (1 + overSpeed / speedFineStep);
                System.out.println("�� ��������� ��������! �����: " + totalFine + " ���.");
                price = price + totalFine;
            }

            /**
             * ����������� ����� � ������
             */
            System.out.println("����� ����� � ������: " + price + " ���.");
        }

    }

    /**
     * ������������ �����
     */
    public static void openWay()
    {
        System.out.println("������������ �����... ����������� ����!");
    }

    public static void blockWay(String reason)
    {
        System.out.println("�������� ����������: " + reason);
    }
}