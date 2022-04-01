package my.test;

public class DzTelefon {
    public static void main(String[] args) {
        int zvonok=100;
        int day = 6;
        String s = (day > 0 && day < 8) ? (day > 0 && day < 6 ? "Áóäíèé äåíü" : "Âûõîäíîé äåíü") : "Äåíü óêàçàí íåêîğğåêòíî";
        switch (s){
            case "Áóäíèé äåíü":
                System.out.println("Âàøà ñòîèìîñòü çà çâîíîê ñîñòàâèëà "+ zvonok);
                break;
            case "Âûõîäíîé äåíü":
               zvonok-= zvonok * 0.2;
                System.out.println("Âàøà ñòîèìîñòü çà çâîíîê ñ ó÷åòîì ñêèäêè ñîñòàâèëà "+ zvonok);
                break;
            default:
            System.out.println("Äåíü óêàçàí íåêîğğåêòíî");

        }

    }
}
