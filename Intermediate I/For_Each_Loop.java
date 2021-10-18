package JavaEx.Control_Flow2;

public class For_Each_Loop {

    public static void main(String[] args) {
        
        //array of numbers
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;

        //for each loop
        for(int number : numbers){
            System.out.println(number);
        }

        //for each loop easy addition
        for(int num : numbers){
            sum += num;
        }

        System.out.println("Sum = " + sum);



    }
    
}
