package org.example.exceptionHandling;

public class ExceptionHandlingExample {

    public static void main(String[] args)  {

      //  checkprefixpostfixOperation();
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        example.tryCatchWithFinally();
        example.tryfinally();
        System.out.println( example.tryCatchWithFinallyWithReturn());

        try {
            example.trywithThrowsWithChecked();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        example.trywithThrowsWithRunTimeExeption();


    }

    private static void checkprefixpostfixOperation() {
        int i = 0;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }

    void  tryfinally() {


        try {
            System.out.println("1");
        } finally {
            // this will always execute
            System.out.println("2");
        }
    }


    void  tryCatchWithFinally() {
        try {
            System.out.println("3");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("4");
        } finally {
            System.out.println("5");
            // this will always execute
        }
    }

    int  tryCatchWithFinallyWithReturn() {
        System.out.println("------------------------------");
        try {
           return 1;

        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
            // this will always execute
        }
    }
    // Exception :
    // Runtime exception:Unchecked Exceptoin/ any class which type of RUntimeExeption or its subclass
    // Compiled time exception /// checked exection  //  any class which type Exceptoin of subclass of Exception

    void  trywithThrowsWithChecked() throws Exception{

         throw new Exception();

    }

    void  trywithThrowsWithRunTimeExeption() {

        throw new RuntimeException();

    }


}
