package hwJava_07_12_2022;

import com.github.javafaker.Faker;

import java.util.Random;
import java.util.UUID;

public class Generator {

    public static void makePlayers() {
        Random rnd = new Random();
        Faker faker = new Faker();

        for (int i = 1; i < 26; i++) {
            PlayerManager.getInstance().addPlayer(new Player(UUID.randomUUID(), faker.name().lastName(), rnd.nextInt(60)));        }
    }
}
