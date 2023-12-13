public class StartUp {

    public static void main(String[] args){
        ErrorWriter errorWriter = ErrorWriter.getInstance("StartUp");
        ClassA.main(args);
        ClassB.main(args);
    }
    
}
