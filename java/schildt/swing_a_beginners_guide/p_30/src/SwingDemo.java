import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        //creating the top level container
        JFrame jfrm=new JFrame("A simple swing program");

        //setting the frame's initial dimensions
        jfrm.setSize(275, 100);

        //closing the program after the user closes the application window
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a label
        JLabel jlbl=new JLabel("Swing powers the modern Java GUI");

        //adding the label to the contents panel
        jfrm.getContentPane().add(jlbl);

        //showing the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
