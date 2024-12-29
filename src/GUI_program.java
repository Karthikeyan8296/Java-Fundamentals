import javax.swing.JOptionPane;

public class GUI_program {
    static void popup(){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        //Converting the integer to string//
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years olds");
    }
}
