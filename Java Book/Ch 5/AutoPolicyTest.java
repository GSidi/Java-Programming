package JavaBook.Κεφ5;

public class AutoPolicyTest {
    
    public static void main(String[] args) {
        
        //dhmiourgei antikeimeno autopolicy
        AutoPolicy policy1 = new AutoPolicy(111123, "Fiat Punto", "NJ");
        AutoPolicy policy2 = new AutoPolicy(11112123, "Fiat Panda", "ME");

        //emfanizei an kathe asfalisthrio einai se politeia pou uposthrizei apozhmiwsh
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s; State: %s  %s a no fault state %n%n", policy.getAccountNumber()
        ,policy.getMakeAndModel(), policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
    }

}
