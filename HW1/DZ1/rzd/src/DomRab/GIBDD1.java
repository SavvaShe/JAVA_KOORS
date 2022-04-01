package DomRab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//
//
public class GIBDD1 {
//
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer maxAccessSpeed = 30;//����. ����������� �������� ��������
		Integer speedGrade = 20;//����������� ������, ������ 20 ��/� ����� ������. �� 500�
		Integer fineGrade = 500;
		Integer dangerSpeed = 180;
        Integer day = (int)(Math.random()*60);
        //Integer day=31;
//
		System.out.println("������� ��������");
		Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
//
		if(speed>dangerSpeed) {
			System.out.println("���������� ������������!");
		}
		else if(speed>maxAccessSpeed) {
			Integer overSpeed = speed - maxAccessSpeed;//�������� ����������
			Integer k = overSpeed/speedGrade;//����������� ���������� ��������
			Integer fine = k * fineGrade;//�������� ������
            if (day<=30) {
                fine = fineGrade / 2;
                System.out.println("����� ���������� " + fine);
            }else
            System.out.println("����� ���������� "+fine);
		} else {
			System.out.println("������� ����!");
		}
	}

}
