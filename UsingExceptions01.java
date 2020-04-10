
package usingexceptions01;


public class UsingExceptions01 {

    
    public static void main(String[] args) {
        
        try{
            throwException();
        }catch(Exception exception){//εξαίρεση προκαλούμενη απο την throwException
            System.err.println("Exception handled in main method");
        }
        
        doesNotThrowException();
        
    }
    
    public static void throwException() throws Exception{
        
        try{
            System.out.println("Method throw exception");//προκαλεί μια exception και την συλλαμβάνει αμέσως
            throw new Exception();
        }catch(Exception exception){
            System.err.println("exception handled in throwException method");//σύλληψη εξαίρεσης που προκλήθηκε στο μπλόκ try 
            throw exception;
        }finally{//ετελείται ανεξάρτητα απο το τι συνέβη στο try catch
            System.err.println("Finally executed in throwException");
        }

    }
    
    public static void doesNotThrowException(){
    
        try{//δεν προκαλεί εξέραιση
            System.out.println("Method doeNotThrowException");
        }catch(Exception exception){//δεν εκτελείται 
            System.err.println(exception);
        }finally{
            System.err.println("Finally executed in doesNotThrowException");
        }
        
        System.out.println("F=End of method doesNotThrowException");
    }
    
    
}
