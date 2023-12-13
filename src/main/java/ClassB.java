public class ClassB implements Runnable{

    @Override
    public void run() {
        ErrorWriter errorWriter = ErrorWriter.getInstance("ClassB");
        System.out.println(errorWriter);
        ErrorWriterSynchronized errorWriterSynchronized = ErrorWriterSynchronized.getInstance("ClassB");
        System.out.println(errorWriterSynchronized);
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ClassB());
        thread.start();
    }
    
}