package JavaEx.Control_Flow2;

public class Switch {

    public static void main(String[] args) {
        
        int expression = 1;

        switch(expression){

            case 1:
                System.out.println("Case 1");
            
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }

        int number = 99;
        String size;

        switch(number){
            case 1:
                size = "Small";
                break;
            case 2:
                size = "Med";
                break;
            case 3:
                size = "Large";
                break;
            case 99:
                size = "XL";
                break;
            default :
                size = "Unknown";
                break;

        }

        System.out.println("Size: " + size);

    }
    
}
