package arrays;

public class Office {



    static int getMax(int office[]){
        int max = office[0];//����� max - ����� ������� �  �����������, ��� �� ������������

        for(var i = 1;i < office.length;i++){
            if(max < office[i]){
                max = office[i];
            }
        }
        return max;
    }

    /**
     *
     * @param address - ����� �����
     * @param cout - ���������� �����������
     * @return ������ ������� �����������
     */
    static int[] createOffice(String address,int cout){
        System.out.println(address);
        int office[] = new int[cout];
        for (var i = 0;i < office.length;i++){
            office[i] = (int) (Math.random() * 150000 + 50000);
            System.out.println("��������� �" + (i + 1) + " ����� ����� " + office[i]);
        }
        System.out.println("---------------------------------------");
        return office;
    }

    public static void main(String[] args) {
        int office1[] = createOffice("���� �� ����������",(int)(Math.random() * 20 + 10));
        int office2[] = createOffice("���� �� �������������",(int)(Math.random() * 20 + 10));
        int office3[] = createOffice("���� �� �������",(int)(Math.random() * 20 + 10));

        System.out.println(Math.max(Math.max(getMax(office1),getMax(office2)),getMax(office3)));
    }
}
