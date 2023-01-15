package hwJava_07_12_2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class PlayerManager {
    private List<Player> allPlayers;
    static PlayerManager pm = null;

    public static PlayerManager getInstance() {
        if (pm == null)
            pm = new PlayerManager();
        return pm;
    }


    private PlayerManager() {
        allPlayers = new ArrayList<Player>();
    }

    public boolean addPlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player.getPlayerId().equals(player1.getPlayerId()))
                return false;
        }
        if (assignLeague(player))
            allPlayers.add(player);
        return true;
    }

    public boolean assignLeague(Player player) {
        boolean res = true;
        if (player.getAge() >= 15 && player.getAge() <= 20)
            player.setLeague(League.Junior);
        else if (player.getAge() >= 21 && player.getAge() <= 30)
            player.setLeague(League.Average);
        else if (player.getAge() >= 31 && player.getAge() <= 60)
            player.setLeague(League.Older);
        else res = false;
        return res;
    }

    public List<Player> getPlayersByLeague(League league) {
        List<Player> playerList = new LinkedList<>();
        for (Player player : allPlayers) {
            if (player.getLeague().equals(league))
                playerList.add(player);
        }
        return playerList;
    }
}
