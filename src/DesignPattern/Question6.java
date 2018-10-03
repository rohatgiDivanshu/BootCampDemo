package DesignPattern;

interface Pizza {
    int getPrice();
}

class PlainPizza implements Pizza {

    @Override
    public int getPrice() {
        return 50;
    }
}

abstract class ToppingDecorator implements Pizza {
    Pizza toppingPizza;

    public ToppingDecorator(Pizza toppingPizza) {
        this.toppingPizza = toppingPizza;
    }
}

class CheeseToppings extends ToppingDecorator {

    public CheeseToppings(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        return this.toppingPizza.getPrice() + 100;
    }
}

class ChickenToppings extends ToppingDecorator {

    public ChickenToppings(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        return this.toppingPizza.getPrice() + 120;
    }
}

class MushroomsToppings extends ToppingDecorator {

    public MushroomsToppings(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        return this.toppingPizza.getPrice() + 125;
    }
}

public class Question6 {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Plain Pizza Rs." + pizza.getPrice());

        pizza = new CheeseToppings(pizza);
        System.out.println("Pizza with Cheese Toppings Rs." + pizza.getPrice());

        pizza = new ChickenToppings(pizza);
        System.out.println("Pizza with Cheese and Chicken Toppings Rs." + pizza.getPrice());

        pizza = new MushroomsToppings(pizza);
        System.out.println("Pizza with Cheese, Chicken and Mushroom Toppings Rs." + pizza.getPrice());
    }

}
