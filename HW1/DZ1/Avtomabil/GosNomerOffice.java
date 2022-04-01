package Avtomabil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GosNomerOffice {
    ArrayList<GosNomer> Gosnomer;
    BufferedReader reader;
    String seria;
    String gosnomer;
public GosNomerOffice(int count) throws IOException {
    Gosnomer=new ArrayList<GosNomer>();
    reader=new BufferedReader(new InputStreamReader(System.in));
    int num=0;
    generatorSeria();
    String fio;
    String number;
    String regionn;
    String seriaUser = "";
    System.out.println("Если регион номер заполняем вручную, то введите 'h', а иначе нажмите Enter");
    String anregion = reader.readLine();
    System.out.println("Если номер номер заполняем вручную, то введите 'h', а иначе нажмите Enter");
    String answet = reader.readLine();
    while (num < count){
        if (anregion.equalsIgnoreCase("h")){
            do{
                System.out.println("Введите регион Госномера");
                seriaUser= reader.readLine();
            }while (seriaUser.length() != 3 || !isDigit(seriaUser));
            regionn=seriaUser;
        }else {
            regionn=getRandomNumber(3);
        }
        if (answet.equalsIgnoreCase("h")) {
           do{ System.out.println("Введите номер Госномера");
            seriaUser = reader.readLine();
        }while (seriaUser.length() != 3 || !isDigit(seriaUser));
        number = seriaUser;
        }else {
            number= getRandomNumber(3);
        }
        if(isDublicate(number,seria)){
            continue;
        }else{
            System.out.println("Введите владельца госномера");
            fio = reader.readLine();
            gosnomer= String.valueOf(seria.charAt(0))+number+
                    String.valueOf(seria.charAt(1))+String.valueOf(seria.charAt(2))+regionn;
            GosNomer gosnomer1=new GosNomer(gosnomer,number,regionn,fio);
            Gosnomer.add(gosnomer1);

            num++;
        }
    }
    System.out.println("Были созданы паспорта:");
    show();
}
    boolean isDublicate(String seria,String number){
        for (GosNomer gosnomer1 : Gosnomer){
            if(gosnomer1.GetNomer().equalsIgnoreCase(number) && gosnomer1.getGosnomer().equalsIgnoreCase(seria)){
                return true;
            }
        }
        return false;
    }
    void show(){
        for(GosNomer gosnomer1 : Gosnomer){
            System.out.println(gosnomer1);
        }
    }
public void generatorSeria() throws IOException {
    System.out.println("Если серию госномера заполняем вручную, то введите 'h', иначе нажмите Enter");
    String answer = reader.readLine();//получаем ответ из консоли
    if(answer.equalsIgnoreCase("h")){
        String seriaUser = "";
        do {
            System.out.println("Введите серию госномера");
            seriaUser = reader.readLine();
        }while (seriaUser.length() != 3 ||!PROV(seriaUser));
        seria = seriaUser;
    }else{
        seria = getRondomBykv(3);
    }
}
    static boolean PROV(String s){
        char mas[] = s.toCharArray();
        for (char item:mas) {
            String str=new String(String.valueOf(item));
            if (!str.matches("[А-Я]")) {
                return false;
            }
        }
        return true;
    }
public static String getRondomBykv(int count){
           String mas[] = {"Й","Ц","У","К","Е",
                   "Н","Г","Ш","Щ","З","Х","Ъ","Ф",
                   "Ы","В","А","П","Р","О","Л","Д",
                   "Ж","Э","Я","Ч","С","М","И","Т","Ь","Б","Ю"};
        StringBuilder builder = new StringBuilder();
        for(var j = 0;j < 3;j++) {
           builder.append(mas[(int) (Math.random() * mas.length)]);
       }
    return  builder.toString();
}
    public static String getRandomNumber(int count){
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < count;i++){
            int x = (int) (Math.random() * 10);
            builder.append(Integer.toString(x));
        }
        return builder.toString();
    }
    boolean isDigit(String s){
        char mas[] = s.toCharArray();
        for (char item : mas){
            if(!Character.isDigit(item)){
                return false;
            }
        }
        return true;
    }
    void Poisk() throws IOException {
        System.out.println("Введите Госномер");
        String str = reader.readLine();
        for (GosNomer gosnomer2: Gosnomer){
          if (gosnomer2.getGosnomer().equalsIgnoreCase(str)){
              System.out.println("Владелец Госномера: " + gosnomer2.getFIO());
              return;
          }
        }
        System.out.println("Госномер не найден!");
    }
    public static void main(String[] args) throws IOException {
        GosNomerOffice office =new GosNomerOffice(3);
        office.Poisk();
    }
}

