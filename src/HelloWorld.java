import javax.swing.*;

public class HelloWorld extends JFrame{
    private JLabel hlw;

    public HelloWorld(){
        setContentPane(hlw);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
