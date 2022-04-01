package StringsAndChars;

public class DemoChar {
    public static void main(String[] args) {
//        char c = 0x2605;
//        System.out.println(c);

//        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
//        String helloString = new String(helloArray,3,2);
//        System.out.println(helloString);

//        var s = "Привет, ";
//        s += "мир";
//        s += "!!!";
//
//        System.out.println(s);

//        StringBuilder builder = new StringBuilder();
//        builder.append("Привет, ").append(" мир").append("!!!");
//        String s = builder.toString();
//
//        System.out.println(s);
//        System.out.println(s.charAt(0));


//        var s = "Привет всем";
//
//        System.out.println(s.lastIndexOf("в"));

//        var s = "sdf skjhksadfh ksadh ksdh fksdhf ksdf";
//        char mas[] = s.toCharArray();
//        int spaceCount = 0;
//        for(var item : mas){
//            if(item == ' '){
//                spaceCount++;
//            }
//        }
//
//        System.out.println("Слов в предложении: " + (spaceCount + 1));

//        var p = "праздник";
//        char mas[] = p.toCharArray();
//        String newStr = "";
//        for(var i = 0;i < mas.length;i++){
//            if(i == 0){
//                mas[0] = Character.toUpperCase(mas[0]);
//            }
//            newStr += (i == mas.length - 1) ?  mas[i] + "!" : mas[i] + "_";
//        }
//        System.out.println(newStr);


//        char x = 's';
//        String s = Character.toString(x);
//        int x = 10;
//        String s = Integer.toString(s);

        String fio = "Иванов Иван Иванович";
        System.out.println(fio.split(" ")[1] + ", привет!");




    }
}
