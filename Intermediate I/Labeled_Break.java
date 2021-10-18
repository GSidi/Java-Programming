package JavaEx.Control_Flow3;

public class Labeled_Break {

    public static void main(String[] args) {

        first:
            for(int i = 0; i < 5; i++){

            second:
                for(int j = 0; j<3; j++){
                    System.out.println("i = " + i + "; j = " +j);
             
                    // the break statement breaks the first for loop
                    if ( i == 2)
                        //break first;
                        break second;
                }
            }

    }
    
}
