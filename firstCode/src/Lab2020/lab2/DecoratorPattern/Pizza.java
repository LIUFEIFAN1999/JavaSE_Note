package Lab2020.lab2.DecoratorPattern;

//Component
public abstract class Pizza
{
    // it is an abstract pizza
    String description = "Unknown Pizza";
    // describe all the ingredients of the Pizza
    public String getDescription()
    { return description; }
    // return price of the pizza, including the base and toppings
    public abstract int getCost();
}

//Concrete Component
//蔬菜类饼体
class VegPizza extends Pizza{
    // it is an VegPizza
    String description = "VegPizza";
    // describe all the ingredients of the Pizza
    public String getDescription()
    { return description; }
    // return price of the pizza, including the base and toppings
    public int getCost(){
        return 50;
    }
}
//非蔬菜类饼体
class NonVegPizza extends Pizza{
    // it is an NonVegPizza
    String description = "NonVegPizza";
    // describe all the ingredients of the Pizza
    public String getDescription()
    { return description; }
    // return price of the pizza, including the base and toppings
    public int getCost(){
        return 100;
    }
}

//Decorator
//配料类
abstract class SubstanceDecorator{
    private Pizza pizza;

    public SubstanceDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription()
    { return pizza.getDescription(); }
}

//Concrete Component
//鸡肉配料
class ChickenDecorator extends SubstanceDecorator{
    private Pizza pizza;
    public ChickenDecorator(Pizza pizza){
        super(pizza);
        this.pizza = pizza;
    }
    public String getDescription()
    { return "Chicken "+pizza.getDescription(); }
}

//奶酪配料
class CheeseDecorator extends  SubstanceDecorator{
    private Pizza pizza;

    public CheeseDecorator(Pizza pizza){
        super(pizza);
        this.pizza = pizza;
    }
    public String getDescription()
    { return "Cheese "+pizza.getDescription(); }
}
