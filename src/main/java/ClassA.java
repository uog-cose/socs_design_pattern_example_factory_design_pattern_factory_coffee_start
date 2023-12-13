public class ClassA implements Runnable{

    @Override
    public void run() {
        ErrorWriter errorWriter = ErrorWriter.getInstance("ClassA");
        System.out.println(errorWriter);
        ErrorWriterSynchronized errorWriterSynchronized = ErrorWriterSynchronized.getInstance("ClassA");
        System.out.println(errorWriterSynchronized);
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ClassA());
        thread.start();
    }
    
}
