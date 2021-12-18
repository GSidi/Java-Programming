package JavaBook.Κεφ7;
import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {
        //dhmiourgeia mia neas arraylist apo string me arxikh xwritikothta 10 stoixeiwn
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"yellow");//eisagwgh timhs ston deikth 0

        //kefalida
        System.out.print("Display list contents with counter controlled loop: ");

        //emfanish twn xrwmatwn ths listas
        for(int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }

        //emfanish twn xrwmatwn xrhsimopoiontas beltiwmenh protash for sthn methodo display
        display(items,"\nDisplay list of contents with enhanced for statement: ");

        items.add("green");
        items.add("crimson");
        items.add("yellow");
        display(items,"\nList with two new elements: ");

        items.remove("yellow");
        items.add("evenos");
        display(items,"\nRemove first instance of yellow: ");

        items.remove(1);//afairei to stoixeio sthn deikth 1
        display(items,"\nRemove second list element: ");

        //elegxei ean mia timh einai sto list
        System.out.printf("\n\"red\" is %s in the list %n", items.contains("red") ? "":"not   ");

        //emfanizei ton arithmo twn stoixeiwn sto List
        System.out.printf("Size: %s%n", items.size());

    }

    public static void display(ArrayList<String> items, String header){
        System.out.print(header);// emfanizei thn kefalida

        //emfanizei kathe stoixeio items
        for(String item: items){
            System.out.printf("  %s", item);
        }

    }
}
