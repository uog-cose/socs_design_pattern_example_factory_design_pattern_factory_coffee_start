public class ClassB implements Runnable{

    WriterFactory writerFactory = new WriterFactory();

    @Override
    public void run() {
        ErrorWriter errorWriter = null;
        for (Writer writer : Writer.values()){
            errorWriter = writerFactory.getWriter(getClass().getName(), writer);
            System.out.println(errorWriter);
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ClassB());
        thread.start();
    }
    
}