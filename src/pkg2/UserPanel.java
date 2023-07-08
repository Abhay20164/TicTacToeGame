package pkg2;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextField;

/**
 *
 *
 */
public class UserPanel implements ActionListener {
    JFrame jf; // JFrame object to create a window
    JLabel jl1, jl2; // JLabel objects to display text
    JTextField jt1, jt2; // JTextField objects to input text
    JButton jb; // JButton object to trigger an action

    UserPanel() {
        jf = new JFrame("TicTacToe Game "); // Creating a JFrame with a title
        jf.setSize(600, 500); // Setting the size of the JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation
        jf.setLayout(null); // Setting the layout to null

        jl1 = new JLabel("Enter Player One:(X) "); // Creating a JLabel with text
        jl1.setBounds(50, 50, 120, 30); // Setting the position and size of the label
        jf.add(jl1); // Adding the label to the JFrame

        jt1 = new JTextField(); // Creating a JTextField
        jt1.setBounds(200, 50, 250, 40); // Setting the position and size of the text field
        jf.add(jt1); // Adding the text field to the JFrame

        jl2 = new JLabel("Enter Player Two:(0) "); // Creating a JLabel with text
        jl2.setBounds(50, 150, 120, 30); // Setting the position and size of the label
        jf.add(jl2); // Adding the label to the JFrame

        jt2 = new JTextField(); // Creating a JTextField
        jt2.setBounds(200, 140, 250, 40); // Setting the position and size of the text field
        jf.add(jt2); // Adding the text field to the JFrame

        jb = new JButton("Start Game"); // Creating a JButton with text
        jb.setBounds(200, 280, 150, 50); // Setting the position and size of the button
        jb.addActionListener(this); // Adding an ActionListener to the button
        jf.add(jb); // Adding the button to the JFrame

        jf.setVisible(true); // Setting the JFrame visibility to true
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb) { // Checking if the button was clicked
            String player1 = jt1.getText(); // Getting the text from the first text field
            String player2 = jt2.getText(); // Getting the text from the second text field

            Gamepanel gp = new Gamepanel(player1, player2); // Creating a Gamepanel object with player names
            gp.openGamepanel(); // Opening the game panel
            jf.setVisible(false); // Setting the JFrame visibility to false
        }
    }

}
