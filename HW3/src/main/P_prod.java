package main;

public class P_prod extends Product{
    public P_prod(String name_product) {
        super(name_product);
    }

    @Override
    int price() {
        return 12;
    }
}
