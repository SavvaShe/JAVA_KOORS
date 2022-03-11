package main;

public  abstract class Product {
    String name_product;

    public Product(String name_product) {
        this.name_product = name_product;
        showInfo();
    }
    abstract int price();
    double getPayment(){
        int PAYMENT = 0;
        int fis = 100;
        int c = 50;
        int p = 0;
        switch (name_product) {
            case "Единичный":
                PAYMENT = fis;
            case "Цифровой":
                PAYMENT = c;
            case "Весовой":
                if (price()>100){
                    p = 100;
                }
                else{
                    p = 250;
                }
                PAYMENT = p;
        }
        return PAYMENT * price();
    }

    void showInfo(){
        System.out.println("Категория товара " + name_product + " стоимость товара " + getPayment());
    }
}
