package JavaEx.Control_Flow2;

public class DiplayText {

    public static void main(String[] args) {
        
        int n = 5;

        for(int i=1; i<=n; i++){
            System.out.println("Java is not funny");
            System.out.println(i);
        }

        //programm to find summ from 1 to 1000 realy easy 
        int sum =0;
        int j=1000;

        for(int x = j; j>= 1; --j ){
            sum +=1;
        }

        System.out.println("Sum = " + sum);

    }
    
}
