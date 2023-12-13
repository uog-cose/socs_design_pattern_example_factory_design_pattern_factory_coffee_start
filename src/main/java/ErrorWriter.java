public class ErrorWriter{

    private static ErrorWriter uniqueInstance = null;
    private String name;
    private long timestamp;

    private ErrorWriter(String name){
        this.name = name;
        this.timestamp = System.nanoTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException iExp){
            
        }
    };

    public static ErrorWriter getInstance(String name){
        if (uniqueInstance == null){
            uniqueInstance = new ErrorWriter(name);
        }
        return uniqueInstance;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "ErrorWriter with " + name + " created at " + timestamp;
    }

    public static void main(String[] args){
        ClassA.main(args);
        ClassB.main(args);
    }

}