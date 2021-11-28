package JavaBook.Κεφ6;

public class VariableScope {
    
    //pedio prospelasimo se oles tis methodous auths ths klashs
    private static int x = 1;

    public static void main(String[] args) {
        
        int x = 5;

        System.out.printf("Local x in main is %d%n", x);

        useLocalVariable();//exei topikh x
        useField();//xrhsimopoiei to pedio x ths klashs scope
        useLocalVariable();
        useField();

        System.out.printf("%nLocal x in main is %d%n",x);
    }

    //dhmiourgei kai arxikoiei thn topikh metablith x se kathe klash
    public static void useLocalVariable(){

        int x = 25;//arxikopoieitai kathe fora po kaleitai h useLocalVariable

        System.out.printf("%nLocal x on entering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("Local x before exiting method useLocalVariable is %d%n", x);

    }

    //tropopoiei to paidio x ths klashs scope se kathe klhsh
    public static void useField(){

        System.out.printf("%nLocal x on entering method useField is %d%n", x);
        x *= 10;
        System.out.printf("Local x before exiting method useField is %d%n", x);

    }

}
