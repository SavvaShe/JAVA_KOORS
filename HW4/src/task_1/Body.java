package task_1;
public class Body {
    private String color;//Цвет корпуса
    private String mark;//Марка авто

    public Body(String color, String mark) {
        this.color = color;
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }//Получения цвета

    public String getMark() {
        return mark;
    }// Получения марки авто
}
