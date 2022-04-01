package my.test;

public class Deposit {
    static void showProfit(int money,int years){
        int rate = years > 3 ? 20 : 10;
        for (var i = 1; i <= years;i++){
            var profit = money * rate / 100;
            money += profit;
            System.out.println("Ваша прибыль за " + i + " год = " + profit + "! Общая сумма = " + money);
        }
    }

    public static void main(String[] args) {
        showProfit(100000,5);
    }
}
