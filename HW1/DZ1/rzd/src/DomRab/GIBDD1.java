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
		Integer maxAccessSpeed = 30;//макс. разрешенная скорость движения
		Integer speedGrade = 20;//коэффициент штрафа, каждые 20 км/ч штраф увелич. на 500р
		Integer fineGrade = 500;
		Integer dangerSpeed = 180;
        Integer day = (int)(Math.random()*60);
        //Integer day=31;
//
		System.out.println("введите скорость");
		Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
//
		if(speed>dangerSpeed) {
			System.out.println("Немедленно остановитесь!");
		}
		else if(speed>maxAccessSpeed) {
			Integer overSpeed = speed - maxAccessSpeed;//скорость превышения
			Integer k = overSpeed/speedGrade;//коэффициент превышения скорости
			Integer fine = k * fineGrade;//величина штрафа
            if (day<=30) {
                fine = fineGrade / 2;
                System.out.println("Штраф составляет " + fine);
            }else
            System.out.println("Штраф составляет "+fine);
		} else {
			System.out.println("Доброго пути!");
		}
	}

}
