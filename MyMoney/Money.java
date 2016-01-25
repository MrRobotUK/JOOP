package Shoop.MyMoney;



public class Money{


    private int money = (int) (Math.random() * 100);

    public double getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }



    public void printCountMoney() {
        System.out.println("Ваш Баланс: " + getMoney());
        noMoney();
    }

    public void noMoney() {
        if (getMoney() < 0) {
            System.out.println();
            System.out.println("Недостаточно денег");
            System.out.println();
        }

    }
}
