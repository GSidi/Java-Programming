package JavaEx.OOP;

public class Constructors {

    String languages;

    // constructor accepting single value
    Constructors(String lang) {
      languages = lang;
      System.out.println(languages + " Programming Language");
    }
  
    public static void main(String[] args) {
  
      // call constructor by passing a single value
      Constructors obj1 = new Constructors("Java");
      Constructors obj2 = new Constructors("Python");
      Constructors obj3 = new Constructors("C");
    }
    
}
