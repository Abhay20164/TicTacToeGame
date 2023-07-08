package pkg2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gamepanel implements ActionListener {
    JFrame jf; //Declaring jf as instance
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9; //Declaring all the buuton refernce variable as instance
    int count = 0; //Declaring and Intialized count
    String str = ""; // Declaring and Intialized string
    Color color1; // Declaring and Intialized

    String player; // Declaring

    boolean win = false; // Declaring and Intialized

    int i;  // Declaring and Intialized
    String player1, player2;

    Gamepanel(String player1, String player2) {
        this.player1 = player1;  // Intializing  player1 prsent in the current class
        this.player2 = player2;   // Intializing  player2 prsent in the current class

    }

    void openGamepanel() {



        jf = new JFrame(); //Creating Frame
        jf.setTitle(player1 + " "+"Turns");
        jf.setSize(500, 500); //Setting size of the frame
        jf.setDefaultCloseOperation(3); //Closing the frame
        GridLayout gg = new GridLayout(3, 3); //Creating 3x3 grid
        jf.setLayout(gg); // Setting 3x3 Grid on Layout

        jb1 = new JButton(); //Creating button
        jf.add(jb1); //Adding button on Frame
        jb1.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;

        jb2 = new JButton(); //Creating button
        jf.add(jb2); //Adding button
        jb2.addActionListener(this);//registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;


        jb3 = new JButton(); //creating the button
        jf.add(jb3); //Adding buttons
        jb3.addActionListener(this);  //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;

        jb4 = new JButton(); //creating the button
        jf.add(jb4);  //Adding buttons
        jb4.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;

        jb5 = new JButton(); //creating the button
        jf.add(jb5);  //Adding buttons
        jb5.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;

        jb6 = new JButton();  //creating the button
        jf.add(jb6);  //Adding buttons
        jb6.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;

        jb7 = new JButton();  //creating the button
        jf.add(jb7);  //Adding buttons
        jb7.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;


        jb8 = new JButton();  //creating the button
        jf.add(jb8);  //Adding buttons
        jb8.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;


        jb9 = new JButton(); //creating the button
        jf.add(jb9); //Adding buttons
        jb9.addActionListener(this); //registering the button with event(action performer)
        // Test is inheriting the ActionListener so we have passs the refernce;


        jf.setVisible(true); // Making the frame visible


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count = 1 + count; // Incrementing the move count

        if (count % 2 == 0) {
            str = "0";  // Setting the symbol for the current player
            color1 = Color.yellow;  // Set the color of the current player
            jf.setTitle(player1 +" "+ "Turns");  // Display the current player turn on the screen

        } else {
            str = "X"; // Setting the symbol for the current player
            color1 = Color.green; // Set the color of the current player
            jf.setTitle(player2 +" "+"Turns");  // Display the current player turn on the screen

        }
    /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb1) {
            jb1.setText(str); //set the text X,0
            Font f = new Font("Arial", 1, 50); //set the  size of the font
            jb1.setFont(f); //set the font
            jb1.setEnabled(false);// After pressing the button the value which will appear will not change
            jb1.setBackground(color1); //set the background of the button

        }
        /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb2) {

            jb2.setText(str); //set the text X,0
            Font f2 = new Font("Arial", 1, 50); //set the  size of the font
            jb2.setFont(f2); //set the font
            jb2.setEnabled(false);// After pressing the button the value which will appear will not change
            jb2.setBackground(color1);// set the background

        }
        /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb3) {
            jb3.setText(str);//set the text X,0
            Font f3 = new Font("Arial", 1, 50);//set the  size of the font
            jb3.setFont(f3); //set the font
            jb3.setEnabled(false);// After pressing the button the value which will appear will not change
            jb3.setBackground(color1);// set the background

        }
      /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb4) {
            jb4.setText(str);
            Font f4 = new Font("Arial", 1, 50);//set the  size of the font
            jb4.setFont(f4);//set the font
            jb4.setEnabled(false);// After pressing the button the value which will appear will not change
            jb4.setBackground(color1);// set the background

        }
        /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb5) {
            jb5.setText(str); //set the text X,0
            Font f5 = new Font("Arial", 1, 50);//set the  size of the font
            jb5.setFont(f5);//set the font
            jb5.setEnabled(false);// After pressing the button the value which will appear will not change
            jb5.setBackground(color1);// set the background


        }
      /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb6) {
            jb6.setText(str); //set the text X,0
            Font f6 = new Font("Arial", 1, 50);//set the  size of the font
            jb6.setFont(f6);//set the font
            jb6.setEnabled(false);// After pressing the button the value which will appear will not change
            jb6.setBackground(color1);// set the background


        }
      /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb7) {
            jb7.setText(str); //set the text X,0
            Font f7 = new Font("Arial", 1, 50);//set the  size of the font
            jb7.setFont(f7);//set the font
            jb7.setEnabled(false);// After pressing the button the value which will appear will not change
            jb7.setBackground(color1);// set the background


        }

        /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb8) {
            jb8.setText(str); //set the text X,0
            Font f8 = new Font("Arial", 1, 50);//set the  size of the font
            jb8.setFont(f8);//set the font
            jb8.setEnabled(false);// After pressing the button the value which will appear will not change
            jb8.setBackground(color1);// set the background


        }
     /*Giving reference to the object that the event came from
      Setting the text, font, and disabling the clicked button
     */
        if (e.getSource() == jb9) {
            jb9.setText(str); //set the text X,0
            Font f9 = new Font("Arial", 1, 50);//set the  size of the font
            jb9.setFont(f9);//set the font
            jb9.setEnabled(false);// After pressing the button the value which will appear will not change as button is disabled
            jb9.setBackground(color1); // set the background


        }
        winingPossiblity(); // Checking for winning possibilities , calling the method if somebody wins then "win " will become true else false
        whoWins(); // Display the name of wining person

    }

    void winingPossiblity() {
        //horizontal winning possibilities
        if (jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb3.getText() != "") {
            win = true;
        } else if (jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb6.getText() != "") {
            win = true;
        } else if (jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb9.getText() != "") {
            win = true;
        }
        //vertical winning possibilities
        else if (jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb7.getText() != "") {
            win = true;
        } else if (jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb8.getText() != "") {
            win = true;
        } else if (jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb9.getText() != "") {
            win = true;
        }
        //diagonal winning possibilities
        else if (jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb9.getText() != "") {
            win = true;
        } else if (jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb7.getText() != "") {
            win = true;
        }
        //game draw
        else {
            win = false;

        }
    }

    void whoWins() {
        // Condition 1 : If someboddy win, win  is equal to true
        if (win == true) {

            // checking who has the last turn of the game becuase that will be the winner and what he has choosen X or 0
            if (str.equals("0")) {
                player = player2;
                /*If the player2 has the last turn of the game (0 is asssign to the player 2)and won the game and
                 storing name of that player name in " player" variable to display the name on the screen**/
            } else {
                player = player1;
                /* If the player1 has the last turn of the game(X is assign to the player1) and won the game and
                 storing name of that player name in " player" variable to display the name on the screen
                 */
            }
            jf.setTitle(player + "Turns");
             // Setting the name of the player with turn  for next game who won the game

            JOptionPane.showMessageDialog(jf, player + "  " + "\t Wins"); // showing the output on frame

            restartGame(); // If person wants to play again


        }
        // Condition2 : Match Draw
        else if (win == false && count == 9) {


            JOptionPane.showMessageDialog(jf,   "  " + "\t Match Draw");  // showing the output on frame
            restartGame();  // If person wants to play again
        }


    }

    void restartGame() {
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to restart the game?"); // Asking the user using confirm dialog method
                                                                                     // which will give automatically three opion yes no cancel

       //IF yes the resetting everything
        if (i == 0) {

            jb1.setText("");
            jb2.setText("");
            jb3.setText(""); // Turning all buttons to empty
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");

            btnSetEnabling(true); // enable button to work again


            jb1.setBackground(null);    // settig all buttions color to default
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);

          if (player.equals(player1)){
              player1 = player;  // In next match who has won the last match his/her name show on top of the frame to turn first as h/she won the last game
                                 // Storing name of the player who won the last match in player 1
            }
          else {
              player= player1; // Swaping name of the player who loose
              player1=player2;
              player2=player;

          }
            count = 0; // Resstiing count
            win = false; // Retting win
        } else if (i == 1) {
            System.exit(0); //  if user click on exit button

        } else {
             /*jb1.setEnabled(false);
             jb2.setEnabled(false);
             jb3.setEnabled(false);
             jb4.setEnabled(false);
             jb5.setEnabled(false);
             jb6.setEnabled(false);
             jb7.setEnabled(false);
             jb8.setEnabled(false);
             jb9.setEnabled(false); **/
            btnSetEnabling(false);    // If user clicks on cancel all buttons become disabled


        }

    }

    void btnSetEnabling(boolean b) {
        jb1.setEnabled(b);
        jb2.setEnabled(b);      // Method disabling and enabling the button when user clicks on the show confirm dialogbox
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }




}






