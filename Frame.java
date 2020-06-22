import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

public Frame(){


    this.setSize(500, 800);
    this.setLocation(0, 0);
    this.setTitle("Tetris !");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.DARK_GRAY);





    Bordure Ath = new Bordure();
    this.add(Ath);





    this.addKeyListener(new Control(Ath));







    JPanel buttn = new JPanel();
    buttn.setBackground(Color.RED);
    this.add(buttn,BorderLayout.SOUTH);
    buttn.setFocusable(false);


    JButton Start = new JButton("Start");
    buttn.add(Start, BorderLayout.SOUTH);

    this.setVisible(true);

}

}
