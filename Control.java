import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener {

    private int i,j;//Vas nous permettre de nous deplacer dans un tableau qui representera la "grille" de jeu
    private Bordure piece;


    public Control(Bordure pcs)
    {
        this.piece = pcs;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            i++;
            System.out.println("DROITE"+i);
            piece.setxP(35);

            piece.repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            i--;
            System.out.println("GAUCHE"+i);
            piece.setxPG(35);

            piece.repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            System.out.println("ESPACE");
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            j++;
            System.out.println("BAS"+j);
            piece.setyP(35);
            piece.repaint();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
