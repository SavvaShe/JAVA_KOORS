package arrays;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int a[] = {12,43,54,67};
        int b[] = new int[a.length];
        b = Arrays.copyOf(a,a.length);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
