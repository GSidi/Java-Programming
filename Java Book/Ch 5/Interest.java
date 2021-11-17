package JavaBook.Κεφ5;

public class Interest {
    
    public static void main(String[] args) {
        
        double amount;//poso katatheshs sto telos kathe etous
        double principal = 1000.0;// arxiko poso prin ton toko
        double rate = 0.05;// epitokio

        //Emfanizei tis epikefalides
        System.out.printf("%s%20s%n", "Year", "Amount of Deposit");

        for(int year = 1; year <= 10; year++){
            //upologizei to neo poso gia to sugkekrimeno etos
            amount  = principal *Math.pow(1.0+ rate, year);
            //emfanizei to etos kai to poso
            System.out.printf("%4d%,20.2f%n", year,amount);
        }


    }

}
