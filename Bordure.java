import javax.swing.*;
import java.awt.*;

public class Bordure extends JComponent {

    //Coordonné des pieces  du tétris
    private int xP = 155;
    private int yP = 30;

    private int grilleJeu[][] = new int[20][20];

    @Override
    protected void paintComponent(Graphics pinceau) {

        Graphics secondPinceau = pinceau.create();


       /*Zone de dessin*/
        //Zone de jeu
        secondPinceau.setColor(Color.blue);
        secondPinceau.fillRect(15,25,350,700);


        //Zone de score + zone du temps
        int x = 400;
        int y = 40;
        String[] text = {"Time","Score"};
        //Je stocke les chaine de caractere "Temps" et "Score" pour les afficher avec la boucle
        Font font = new Font("police",Font.BOLD,24);
        secondPinceau.setFont(font);
        for (int i = 0; i <= 1;++i){
            secondPinceau.setColor(Color.RED);
            secondPinceau.drawString(text[i],x,y);
            y+=5;//Pour que le texte ne soit pas écrasé avec les rectangles
            secondPinceau.setColor(Color.blue);
            secondPinceau.fillRect(x,y,75,50);
            y += 75;
        }


            /*Piece*/
            secondPinceau.setColor(Color.YELLOW);
            secondPinceau.fillRect(this.xP,this.yP,35,35);
            /*A completer plus tard*/

        //On crée la grille de jeu

        for (int jG = 0; jG <= 18;jG++)
        {

            for (int iG = 0; iG <= 9;iG++)
            {
                this.grilleJeu[jG][iG] = 0;
                System.out.print(this.grilleJeu[jG][iG]);
            }
            System.out.println(" ");

        }



    }




    public int getxP() {
        return xP;
    }

    public int getyP() {
        return yP;
    }

    public void setxP(int xP) {
        this.xP += xP;
    }
    public void setxPG(int xP) {
        this.xP -= xP;
    }

    public void setyP(int yP) {
        this.yP += yP;
    }
}
