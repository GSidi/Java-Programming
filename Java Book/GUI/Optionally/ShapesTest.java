package JavaBook.GUI_JAVA;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

    public static void main(String[] args) {
        //lh4h epiloghs tou xrhsth 
        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");

        //metatroph eisodou se int
        int choice = Integer.parseInt(input);

        //dhmiourgeia tou panel me thn eisodo tou xrhsth
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();//dhmiourgeia enos neou JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);

    }
    
}
