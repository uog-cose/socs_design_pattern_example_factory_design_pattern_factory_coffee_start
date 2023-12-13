public class ErrorWriterSynchronized {
    private static ErrorWriterSynchronized uniqueInstance = null;
    private String name;
    private long timestamp;

    private ErrorWriterSynchronized(String name){
        this.name = name;
        this.timestamp = System.nanoTime();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException iExp){
            
        }
    };

    public static synchronized ErrorWriterSynchronized getInstance(String name){
        if (uniqueInstance == null){
            uniqueInstance = new ErrorWriterSynchronized(name);
        }
        return uniqueInstance;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "ErrorWriterSynchronized with " + name + " created at " + timestamp;
    }

    public static void main(String[] args){
        ClassA.main(args);
        ClassB.main(args);
    }

}
