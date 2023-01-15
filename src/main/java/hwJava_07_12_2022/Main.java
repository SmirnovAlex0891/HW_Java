package hwJava_07_12_2022;

public class Main {


    public static void main(String[] args) {
        //Generator generator = new Generator();
        Game game = new Game();
        Generator.makePlayers();
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.Junior));
    }
}
