public class StartUp {

    public static void main(String[] args){
        ErrorWriterSingleton errorWriterSingleton = ErrorWriterSingleton.getInstance("StartUp");
        ClassA.main(args);
        ClassB.main(args);
    }
    
}
