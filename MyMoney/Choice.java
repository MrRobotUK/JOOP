package Shoop.MyMoney;


import Shoop.MilkProductes.Kefir;
import Shoop.MilkProductes.KefirBifidobact;
import Shoop.MilkProductes.Milk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Choice {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Money money = new Money();
    Milk milk = new Milk("Молоко", 19.30, 2.7, 95);
    Kefir kefir = new Kefir("Кефир", 17.20, 3.4, 321);
    KefirBifidobact kefirBifidobact = new KefirBifidobact("Кефир с Бефидобактериями", 17.20, 3.4, 321);


    public void spend() throws IOException {

        money.printCountMoney();
        choiceTypeProduct();
        choiceTypeMilkProduct();
        choiceMilk();
    }


    public void choiceTypeProduct() { //ВЫБОР ПРОДУКТА
        System.out.println("Выберите тип:");
        System.out.println("1. Молочные продукты");
        System.out.println("2. Фрукты");
    }

    public void choiceTypeMilkProduct() throws IOException { // ВЫБОР МОЛОЧНЫХ ПРОДУКТОВ
        int choiceProduct = Integer.parseInt(reader.readLine());
        switch (choiceProduct) {
            case 1:
                System.out.println("1. " + milk.getName());
                System.out.println("2. " + kefir.getName());
                System.out.println("3. " + kefirBifidobact.getName());
                break;
        }
    }

    public void choiceMilk() throws IOException { //
        int choiceMilk = Integer.parseInt(reader.readLine());
        switch (choiceMilk) {
            case 1:
                milk.printResultProduct();
                milk.spendWhat();
                resultSpend();
                break;
            case 2:

                kefir.printResultProduct();
                kefir.spendWhat();
                resultSpend();
                break;
            case 3:

                kefirBifidobact.printResultProduct();
                kefirBifidobact.spendWhat();
                resultSpend();
                break;
        }
    }

    public void resultSpend() throws IOException { // ПЛАТЕЖ
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        switch (choice) {
            case 1:
                int resultSpendMilk = (int) (money.getMoney() - milk.getSpice());
                money.setMoney(resultSpendMilk);
                money.printCountMoney();
                finishQuestion();
                break;
            case 2:
                int resultSpendKefir = (int) (money.getMoney() - kefir.getSpice());
                money.setMoney(resultSpendKefir);
                money.printCountMoney();
                finishQuestion();
                break;
            case 3:
                int resultSpendKefirBefidobact = (int) (money.getMoney() - kefirBifidobact.getSpice());
                money.setMoney(resultSpendKefirBefidobact);
                money.printCountMoney();
                finishQuestion();
                break;
        }
    }

    public void finishQuestion() throws IOException { // ПРЕДЛОЖЕНИЕ ПРОДОЛЖИТЬ ПОКУПКУ
        System.out.println("Что нибудь еще?");
        System.out.println("1. Да, давайте");
        System.out.println("2. Нет, не нужно.");
        int choice = Integer.parseInt(reader.readLine());
        switch (choice) {
            case 1:
                System.out.println();
                if (money.getMoney() < 0) {
                    money.noMoney();
                    break;
                }
                else spend();
            case 2:
                break;
        }
    }

}




