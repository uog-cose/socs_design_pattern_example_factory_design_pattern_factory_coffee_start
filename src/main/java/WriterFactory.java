public class WriterFactory {

    public ErrorWriter getWriter(String name, Writer writer){
        ErrorWriter errorWriter = null;
        switch(writer){
            //case MULTIPLE -> 
            //    errorWriter = new ErrorWriterMultiple(name);
            //case SINGLETON -> 
            //    errorWriter = ErrorWriterSingleton.getInstance(name);
            //case SYNCHRONIZED -> 
            //    errorWriter = ErrorWriterSynchronized.getInstance(name);
        }
        return errorWriter;
    }
    
}
