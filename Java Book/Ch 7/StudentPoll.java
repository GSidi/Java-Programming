package JavaBook.Κεφ7;

public class StudentPoll {
    
    public static void main(String[] args) {
        //pinakas apokrisewn dhmoskopishs spoudastwn
        int[] responses = {1,2,3,4,3,2,2,6,7,9,9,7,9,0,6,5,4,3,2,0,4,6,7,8,9,7,6,4,3,2,2,3,4,5,6,7,8};
        int[] frequency = new int[8];

        //gia kathe apokrish, epilegei to stoixeio apokrishs kai xrhsimopoiei auth thn timh
        //ws deikth suxnothtas gia na prosdiorisei poio stoixei ua au3hthei
        for(int asnwer = 0; asnwer< responses.length; asnwer++){
            try{
                ++frequency[responses[asnwer]];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);//kalei thn methodo toString
                System.out.printf("Responses[%d] = %d%n%n", asnwer,responses[asnwer]);
            }
        }

        System.out.printf(" %s%10s%n", "Rating", "Frequency");

        for(int rating = 1 ; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
