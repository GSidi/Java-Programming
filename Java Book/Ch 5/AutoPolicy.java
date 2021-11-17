package JavaBook.Κεφ5;

public class AutoPolicy {
    
    private int accountNumber;
    private String makeAndModel;
    private String state;

    //consructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    //orizei to account name
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    //epistrefei to account number
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel(){
        return makeAndModel;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    //methodos kathgorhma pou epistrefei an h politeia uposthrizei thn apozhmiwsh
    public boolean isNoFaultState(){

        boolean noFaultState;

        //prosdiorizei an h politeia uposthrizei thn apozhmiwsh
        switch(getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }



}
