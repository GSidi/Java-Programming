package JavaEx.Control_Flow2;

public class Counters {
    
    public static void main(String[] args) {
        
        int counter =1;
        //while loop
        while(counter <=10 ){

            System.out.printf("%d ",counter);
            ++counter;
        }

        System.out.println();
        //for loop
        for (int i = 1; i<=10 ; i++){
            System.out.printf("%d ",i);
        }

        System.out.println();

        // do while 

        int j = 1;
        do{
            System.out.printf("%d ",j);
            ++j;
        }while(j <=10);

        System.out.println();


    }

}
