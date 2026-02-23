# Singleton error writer

## Task One
- Create `ErrorWriterMultiple.java`
- Class `extends ErrorWriter`
- Add public contructor to set name - `public ErrorWriterMultiple(String Name){``super(name);``}`
- Add main method `public static void main(String[] args){`
    `ClassA.main(args);`
    `ClassB.main(args);`
`}`
- Amend `Writer.java` add `MULTIPLE`
- Amend `ErrorFactory.java` has switch `case MULTIPLE -> errorWriter = new ErrorWriterMultiple(name);`
## Task Two
- Create `ErrorWriterSingleton.java`
- Class `extends ErrorWriter`
- Add unique instance - `private static ErrorWriterSingleton uniqueInstance = null;`
- Add public contructor to set name - `private ErrorWriterSingleton(String Name){``super(name);``sleep(1);``}`
- Add get instance - `public static ErrorWriterSingleton getInstance(String name){`
        `if (uniqueInstance == null){`
            `uniqueInstance = new ErrorWriterSingleton(name);`
        `}`
        `return uniqueInstance;`
    `}`
- Add main method `public static void main(String[] args){`
    `ClassA.main(args);`
    `ClassB.main(args);`
`}`
- Amend `Writer.java` add `SINGLETON`
- Amend `ErrorFactory.java` has switch `case SINGLETON-> errorWriter = new ErrorWriterSingleton(name);
## Task Three
- Create `ErrorWriterSingletonSynchronized.java`
- Class `extends ErrorWriter`
- Add unique instance - `private static ErrorWriterSingletonSynchronized uniqueInstance = null;`
- Add public contructor to set name - `private ErrorWriterSingletonSynchronized(String Name){``setUp(name);``sleep(1);``}`
- Add get instance - `public static synchronized ErrorWriterSingletonSynchronized getInstance(String name){`
        `if (uniqueInstance == null){`
            `uniqueInstance = new ErrorWriterSingleton(name);`
        `}`
        `return uniqueInstance;`
    `}`
- Add main method `public static void main(String[] args){`
    `ClassA.main(args);`
    `ClassB.main(args);`
`}`
- Amend `Writer.java` add `SYNCHRONIZED`
- Amend `ErrorFactory.java` has switch `case SYNCHRONIZED-> errorWriter = new ErrorWriterSingletonSynchronized(name);
