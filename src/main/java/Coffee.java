import java.util.ArrayList;

abstract public class Coffee {

    protected CoffeeType name;
    private int milkAmount;
    private int waterAmount;
    private int coffeeAmount;
    private int cupType;
    protected long timeStamp;

    public Coffee(){
        this.timeStamp = System.nanoTime();
    }

    public CoffeeType getName(){
        return name;
    }

    private ArrayList<Integer> getIngredients(){
        ArrayList<Integer> listOfIngredients = new ArrayList<Integer>();
        listOfIngredients.add(milkAmount);
        listOfIngredients.add(waterAmount);
        listOfIngredients.add(coffeeAmount);
        return listOfIngredients;
    }

    public void prepare(){
        ArrayList<Integer> ingredients = getIngredients();
        System.out.println("Prepare coffee " + toString());
    }

    public Cup getCoffeeCup() {
        Cup cup = new Cup(cupType);
        System.out.println("Get coffee cup " + toString());
        return cup;
    }

    public void pourCoffee(){
        System.out.println("Pour coffee " + toString());
    }

    public void serve(){
        System.out.println("Server coffee " + toString());
    }

    public String toString(){
        return name + " " + timeStamp;
    }
}
