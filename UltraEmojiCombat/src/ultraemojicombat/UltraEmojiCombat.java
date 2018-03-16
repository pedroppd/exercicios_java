/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Everson
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Lutador l[] = new Lutador[6]; 
              l[0] = new Lutador("pretty boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
              l[1] = new Lutador("puttyScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 6);
              l[2] = new Lutador("snapshadow", "EUA", 35, 1.65f, 80.6f, 12, 2, 1);
              l[3]= new Lutador("dead code", "australia", 28, 1.93f, 81.6f, 13, 0, 2);
              l[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
              l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
            Luta uec01= new Luta();
            uec01.marcarluta(l[0], l[1]);
            uec01.lutar();
            System.out.println("====================================");
            l[0].status();
            l[1].status();
              
    }
    
}
