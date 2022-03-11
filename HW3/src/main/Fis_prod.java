package main;

public class Fis_prod extends Product {
    // штучный товар
    public Fis_prod(String name_product) {
        super(name_product);
    }

    @Override
    int price() {
        String pr;
        return 1300;
    }
}
