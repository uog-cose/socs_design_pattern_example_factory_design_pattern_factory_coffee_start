public class ErrorWriterSynchronized extends ErrorWriter{
    private static ErrorWriterSynchronized uniqueInstance = null;

    private ErrorWriterSynchronized(String name){
        super(name);
    };

    public static synchronized ErrorWriterSynchronized getInstance(String name){
        if (uniqueInstance == null){
            uniqueInstance = new ErrorWriterSynchronized(name);
        }
        return uniqueInstance;
    }

    public static void main(String[] args){
        ClassA.main(args);
        ClassB.main(args);
    }

}
