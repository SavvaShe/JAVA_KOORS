package task_1;
public class Car {
    boolean isStart = false;//свойство запуска двигателя авто
    Body body;//корпус
    Engine engine;//Двигатель


    public Car(Body body,  Engine engine) {
        this.body = body;
        this.engine = engine;

    }

    void on(){
        isStart = true;
    }

    void off(){
        isStart = false;
    }

    @Override
    public String toString() {
        String info = "Автомобиль цвета " + body.getColor() + ", марки " + body.getMark();
        StringBuilder builder = new StringBuilder(info);
        if (isStart) {
            builder.append("\nСостояние двигателя: активен").
                    append("\nДвигатель мощностью: ").append(Engine.getPower() + " лошадиных сил");
        } else {
            builder.append("\nСостояние двигателя: выключен");
        }
        return builder.toString();
    }
}

