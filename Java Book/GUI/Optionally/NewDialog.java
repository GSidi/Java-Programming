package JavaBook.GUI_JAVA;
import javax.swing.JOptionPane;

public class NewDialog {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("What is your name");
        String message = String.format("Welcome, %s, to JAVA programming", name);

        JOptionPane.showMessageDialog(null, message);

    }
    
}
