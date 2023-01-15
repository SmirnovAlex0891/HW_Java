package hwJava_07_12_2022;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game {
    public void makeGame(List<Player> players) {
        for (int i = 0; i < players.size()-1; i++) {
            Player player1 = players.get(i);
            for (int j = i + 1; j < players.size(); j++) {
                Player player2 = players.get(j);
                resultGame(player1, player2);
            }
        }
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getScore() - o1.getScore();
            }
        });
        printPlayers(players);
    }
    public void resultGame(Player p1, Player p2) {
        if (Math.random() > 0.5)
            p2.addScore(1);
        else p1.addScore(1);
    }
    public static void printPlayers(List<Player> playersList) {

        for (Player pl : playersList) {
            System.out.println(String.format("Player name: %s, year: %d, score: %d, league: %s",
                    pl.getName(), pl.getAge(), pl.getScore(), pl.getLeague()));
        }

    }
}
