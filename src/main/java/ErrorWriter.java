public class ErrorWriter{

    protected String name;
    protected long timestamp;

    public ErrorWriter(String name){
        this.name = name;
        this.timestamp = System.nanoTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException iExp){
            
        }
    };

    public String getName(){
        return name;
    }

    public String toString(){
        return getClass().getName() + " with " + name + " created at " + timestamp;
    }

    public static void main(String[] args){
        ClassA.main(args);
        ClassB.main(args);
    }

}