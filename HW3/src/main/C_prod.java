package main;

public class C_prod extends Product  {

    public C_prod(String name_product) {
        super(name_product);
    }

    @Override
    int price() {
        return 1123;
    }
}
