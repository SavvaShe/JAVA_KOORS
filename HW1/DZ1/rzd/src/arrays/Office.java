package arrays;

public class Office {



    static int getMax(int office[]){
        int max = office[0];//Пусть max - оклад первого и  предположим, что он максимальный

        for(var i = 1;i < office.length;i++){
            if(max < office[i]){
                max = office[i];
            }
        }
        return max;
    }

    /**
     *
     * @param address - адрес офиса
     * @param cout - количество сотрудников
     * @return массив зарплат сотрудников
     */
    static int[] createOffice(String address,int cout){
        System.out.println(address);
        int office[] = new int[cout];
        for (var i = 0;i < office.length;i++){
            office[i] = (int) (Math.random() * 150000 + 50000);
            System.out.println("Сотрудник №" + (i + 1) + " имеет оклад " + office[i]);
        }
        System.out.println("---------------------------------------");
        return office;
    }

    public static void main(String[] args) {
        int office1[] = createOffice("Офис на Московской",(int)(Math.random() * 20 + 10));
        int office2[] = createOffice("Офис на Чернышевского",(int)(Math.random() * 20 + 10));
        int office3[] = createOffice("Офис на Осипова",(int)(Math.random() * 20 + 10));

        System.out.println(Math.max(Math.max(getMax(office1),getMax(office2)),getMax(office3)));
    }
}
