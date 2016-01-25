package Shoop.MilkProductes;


public class KefirBifidobact extends MilkProduct {



    public KefirBifidobact(String name, double spice, double percentageOfFat, int number) {
        super(name, spice, percentageOfFat, number);
    }

    @Override
    public void printResultProduct() {
        super.printResultProduct();

        System.out.println("Бефидобактерии: присутствуют");
    }
}
