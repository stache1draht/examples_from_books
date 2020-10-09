import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
    JLabel jlbl;

    ButtonDemo() {
        JFrame jfrm=new JFrame("A button example");

        //
        jfrm.getContentPane().setLayout(new FlowLayout());

        //setting the frame's size
        jfrm.setSize(300, 100);

        //terminating the program after the window is closed
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating two buttons
        JButton jbFirst=new JButton("First");
        JButton jbSecond=new JButton("Second");

        //connecting action event handlers with buttons
        jbFirst.addActionListener(this);
        jbSecond.addActionListener(this);

        //adding two buttons to the contents panel
        jfrm.getContentPane().add(jbFirst);
        jfrm.getContentPane().add(jbSecond);

        //creating a text label
        jlbl=new JLabel("Press a button");

        //adding the label to the contents panel
        jfrm.getContentPane().add(jlbl);

        //setting the frame visible
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("First")) {
            jlbl.setText("First button was pressed");
        }

        else
            jlbl.setText("Second button was pressed");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                    new ButtonDemo();
            }
        });
    }
}
