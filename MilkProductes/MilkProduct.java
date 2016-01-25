package Shoop.MilkProductes;

import Shoop.Interfeses.iProduct;

public abstract class MilkProduct implements iProduct {

    private String name;
    private double spice;
    private double percentageOfFat;
    private int number;


    public MilkProduct(String name, double spice, double percentageOfFat, int number) {
        this.name = name;
        this.spice = spice;
        this.percentageOfFat = percentageOfFat;
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public double getSpice() {
        return spice;
    }

    @Override
    public int getNumber() {
        return number;
    }

    protected  double getPercentageOfFat(){
        return percentageOfFat;
    }

    @Override
    public void printResultProduct() {
        System.out.println();
        System.out.println("Продукт: " + getName());
        System.out.println("Цена: " + getSpice() + " грн");
        System.out.println("Процент жирности: " + getPercentageOfFat() + "%");
        System.out.println("Количество: " + getNumber() + " л.");
    }

        public void spendWhat() {
        System.out.println("Хотите купить?:");
        System.out.println("1. Да");
        System.out.println("2. Нет");

    }

}
