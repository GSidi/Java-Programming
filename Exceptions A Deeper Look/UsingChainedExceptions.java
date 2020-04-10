
package usingchainedexceptions;

public class UsingChainedExceptions {


    public static void main(String[] args) {
       
        try{
            method1();
        }catch(Exception exception){
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
        }
    }
    
    public static void method1() throws Exception{
        
        try{
            method2();
        }catch(Exception exception){
            throw new Exception("Exception thrown in method 1", exception);
        }
        
    }
    
    public static void method2() throws Exception{
        
        try{
            method3();
        }catch(Exception exception){
            throw new Exception("Exception thrown in method 2", exception);
        }
        
    }
    
    public static void method3() throws Exception{

            throw new Exception("Exception thrown in method 1");
    }
        
}

