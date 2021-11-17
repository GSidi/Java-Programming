public class SumOfOddNumbers {
    
    public static void main(String[] args) {
        
        int sum = 0;

        for(int i = 0; i < 16; i++){
            if(i%2 == 1){
                sum = i + sum; 
                System.out.printf("i is %d\n", i);
                System.out.printf("sum is %d\n", sum);
            }else{
                continue;
            }
        }

        System.out.printf("The usm of odd numbers up to 15 is : %d",sum);
    }
}
