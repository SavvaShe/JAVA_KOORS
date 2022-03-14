package task_1;

public class Bild {


        /**
         * Строим корпус фонарика
         * @param color - цвет авто
         * @param mark- марка авто
         * @return
         */
        Body buildBody(String color,String mark){
            return new Body(color,mark);
        }

        /**
         * Вставляем двигатель в авто
         * @param power - мощность
         * @return
         */
        Engine buildEng(int power){
            return new Engine(power);
        }


        Car createBuilder(String color,String mark,int power){
            Body body = buildBody(color, mark);
            Engine lamp = buildEng(power);

            return new Car(body,lamp);
        }

    }


