public class ErrorWriterSingleton  extends ErrorWriter{
 
    private static ErrorWriterSingleton uniqueInstance = null;

    private ErrorWriterSingleton(String name){
        super(name);
    };

    public static ErrorWriterSingleton getInstance(String name){
        if (uniqueInstance == null){
            uniqueInstance = new ErrorWriterSingleton(name);
        }
        return uniqueInstance;
    }

    public static void main(String[] args){
        ClassA.main(args);
        ClassB.main(args);
    }

}
