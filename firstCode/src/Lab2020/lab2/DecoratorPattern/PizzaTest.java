package Lab2020.lab2.DecoratorPattern;

public class PizzaTest {
    public static void main(String[] args) {
        VegPizza vegPizza = new VegPizza();
        SubstanceDecorator pizza = new ChickenDecorator(vegPizza);
        System.out.println(pizza.getDescription());
    }
}
