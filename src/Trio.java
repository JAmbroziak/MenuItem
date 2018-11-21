public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    private double price;
    private String name;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
        this.price = getPrice();
        this.name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }

    public double getPrice() {
        double sandwichPrice = this.sandwich.getPrice();
        double saladPrice = this.salad.getPrice();
        double drinkPrice = this.drink.getPrice();
        if(sandwichPrice > saladPrice){
            if(saladPrice > drinkPrice){
                return sandwichPrice + saladPrice;
            } else {
                return sandwichPrice + drinkPrice;
            }
        }
        if(sandwichPrice < saladPrice){
            if(sandwichPrice < drinkPrice){
                return saladPrice + drinkPrice;
            }
        }
        return saladPrice + sandwichPrice;
    }

    public String getName() {
        return this.name;
    }
}