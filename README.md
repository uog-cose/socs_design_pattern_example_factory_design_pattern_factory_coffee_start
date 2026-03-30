# factorycoffee
## Create file /src/main/java/CoffeeFactory.java
## Create class CoffeeFactory
- Declare class as `public interface CoffeeFactory{`

- Create method createCoffee
	- `    public Coffee createCoffee(CoffeeType coffeeType);`
## Create file /src/main/java/CoffeeFactoryConditional.java
## Create class CoffeeFactoryConditional
- Declare class as `public class CoffeeFactoryConditional implements CoffeeFactory {`

- Create method createCoffee
	- `    public Coffee createCoffee(CoffeeType typeOfCoffee) {`
	- `        Coffee coffee;`
	- `        switch(typeOfCoffee){`
	- `            case AMERICANO:`
	- `                coffee = new Americano();`
	- `                break;`
	- `            case CAPPUCCINO:`
	- `                coffee = new Cappuccino();`
	- `                break;`
	- `            case ESPRESSO:`
	- `                coffee = new Espresso();`
	- `                break;`
	- `            case FLAT_WHITE:`
	- `                coffee = new FlatWhite();`
	- `                break;`
	- `            case MOCHA:`
	- `                coffee = new Mocha();`
	- `                break;`
	- `            default:`
	- `                coffee = new Americano();`
	- `                break;`
	- `        }`
	- `        return coffee;`
	- `    }`
- Create method main
	- `    public static void main(String[] args){`
	- `        CoffeeFactoryConditional coffeeFactory = new CoffeeFactoryConditional();`
	- `        CoffeeStore coffeeStore = new CoffeeStore();`
	- `        coffeeStore.setCoffeeFactory(coffeeFactory);`
	- `        Coffee coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);`
	- `        coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);`
	- `    }`
## Amend file /src/main/java/CoffeeStore.java
	- Added `    private CoffeeFactory coffeeFactory = new CoffeeFactoryConditional();`
- Create method CoffeeStore
	- `    public CoffeeStore(){`
	- `    }`
- Create method setCoffeeFactory
	- `    public void setCoffeeFactory(CoffeeFactory coffeeFactory){`
	- `        this.coffeeFactory = coffeeFactory;`
	- `    }`
- Remove method createCoffee
- Amend method orderCoffee
	- Added `        coffee = coffeeFactory.createCoffee(typeOfCoffee);`
	- remove `        coffee = createCoffee(typeOfCoffee);`
## Create file /src/main/java/CoffeeFactoryLookUp.java
## Create class CoffeeFactoryLookUp
- Declare class as `public class CoffeeFactoryLookUp implements CoffeeFactory {`
- Declare variables :
	- `    HashMap<CoffeeType, Coffee> coffeeLookup = new HashMap<CoffeeType, Coffee>();`

- Create method CoffeeFactoryLookUp
	- `    public CoffeeFactoryLookUp(){`
	- `        coffeeLookup.put(CoffeeType.AMERICANO, new Americano());`
	- `        coffeeLookup.put(CoffeeType.CAPPUCCINO, new Cappuccino());`
	- `        coffeeLookup.put(CoffeeType.ESPRESSO, new Espresso());`
	- `        coffeeLookup.put(CoffeeType.FLAT_WHITE, new FlatWhite());`
	- `        coffeeLookup.put(CoffeeType.MOCHA, new Mocha());`
	- `    }`
- Create method createCoffee
	- `    public Coffee createCoffee(CoffeeType typeOfCoffee) {`
	- `        return coffeeLookup.get(typeOfCoffee);`
	- `    }`
- Create method getCoffeeTypes
	- `    public Set<CoffeeType> getCoffeeTypes(){`
	- `        return coffeeLookup.keySet();`
	- `    }`
- Create method main
	- `    public static void main(String[] args){`
	- `        CoffeeFactoryLookUp coffeeFactoryLookUp = new CoffeeFactoryLookUp();`
	- `        CoffeeStore coffeeStore = new CoffeeStore();`
	- `        coffeeStore.setCoffeeFactory(coffeeFactoryLookUp);`
	- `        Coffee coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);`
	- `        coffee = coffeeStore.orderCoffee(CoffeeType.MOCHA);`
	- `    }`
