package main.HW1;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class GIBDD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer maxAccessSpeed = 30;//����. ����������� �������� ��������
		Integer speedGrade = 20;//����������� ������, ������ 20 ��/� ����� ������. �� 500�
		Integer fineGrade = 500;
		Integer dangerSpeed = 180;
        int day = Integer.parseInt(JOptionPane.showInputDialog("���� �� ������"));
		System.out.println("������� ��������");
		Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

		if(speed>dangerSpeed) {
			System.out.println("���������� ������������!");
		}
		else if(speed>maxAccessSpeed) {
            if (day>30) {
                Integer overSpeed = speed - maxAccessSpeed;//�������� ����������
                Integer k = overSpeed / speedGrade;//����������� ���������� ��������
                Integer fine = k * fineGrade;//�������� ������
                System.out.println("����� ���������� " + fine);
            }
            else{
                Integer overSpeed = speed - maxAccessSpeed;//�������� ����������
                Integer k = overSpeed / speedGrade;//����������� ���������� ��������
                Integer fine =k * fineGrade/2;//�������� ������
                System.out.println("����� ���������� " + fine);

            }	}
		else {
			System.out.println("������� ����!");
		}
	}

}
