public class CoffeeStore {

    private Coffee createCoffee(CoffeeType typeOfCoffee){
        Coffee coffee;

        switch(typeOfCoffee){
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case FLAT_WHITE:
                coffee = new FlatWhite();
                break;
            case MOCHA:
                coffee = new Mocha();
                break;
            default:
                coffee = new Americano();
                break;
        }
        return coffee;
    }

    public Coffee orderCoffee(CoffeeType typeOfCoffee){
        Coffee coffee;
        coffee = createCoffee(typeOfCoffee);

        coffee.prepare();
        coffee.getCoffeeCup();
        coffee.pourCoffee();
        coffee.serve();

        return coffee;
    }

    public static void main(String[] args){
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);
        coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);
    
    }

}
