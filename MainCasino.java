package Roulette;

/*import javafx.application.Application;
import javafx.stage.Stage;
*/
import java.util.ArrayList;

public class MainCasino {

    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<Players>();
        Players player1 = new Players("Man", 100);
        Players player2 = new Players("Woman", 100);
        players.add(player1);
        players.add(player2);
        Roulette roulette = new Roulette(players);
        player1.setBet(2,10);
        player2.setBet(39, 10);
        try {
            for (int i = 0; i < 10; i++) {
                roulette.spinTheWheel();
                System.out.println(roulette.checkWin() +" Won!");
            }
            System.out.println(player1);
            System.out.println(player2);
        }catch (Exception e ) {
            System.out.println(e);
        }
    }

}
