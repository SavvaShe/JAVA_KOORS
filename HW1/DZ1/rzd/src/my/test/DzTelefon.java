package my.test;

public class DzTelefon {
    public static void main(String[] args) {
        int zvonok=100;
        int day = 6;
        String s = (day > 0 && day < 8) ? (day > 0 && day < 6 ? "������ ����" : "�������� ����") : "���� ������ �����������";
        switch (s){
            case "������ ����":
                System.out.println("���� ��������� �� ������ ��������� "+ zvonok);
                break;
            case "�������� ����":
               zvonok-= zvonok * 0.2;
                System.out.println("���� ��������� �� ������ � ������ ������ ��������� "+ zvonok);
                break;
            default:
            System.out.println("���� ������ �����������");

        }

    }
}
