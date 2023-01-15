package hwJava_07_12_2022;

import java.util.UUID;

public class Player {
    private UUID playerId;

    private String name;
    private int age;
    private League league;
    private int score = 0;

    public Player(UUID playerId, String name, int age, League league) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.league = league;
    }

    public Player(UUID playerId, String name, int age) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public League getLeague() {
        return league;
    }
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLeague(League league) {
        this.league = league;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void addScore (int d) {
        score = score + d;
    }
}
