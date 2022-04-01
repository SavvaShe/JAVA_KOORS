public class Chess {
    public static void main(String[] args) {
        char mas[] = {'A','B','C','D','E','F','G','H'};
        for(var i = 8;i > 0;i--){
            for(var item : mas){
                System.out.print(item + "" + i + "\t");
            }
            System.out.println();
        }
    }
}
