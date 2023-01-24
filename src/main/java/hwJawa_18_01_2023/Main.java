package hwJawa_18_01_2023;

public class Main {
    public static void main(String[] args) {
        CardData cardDataUser1 = new CardData();
        CardData cardDataUser2 = new CardData();
        CardData cardDataUser3 = new CardData();
        CardData cardDataUser4 = new CardData();


        WriteCardToFile writeCardToFile = new WriteCardToFile();
        writeCardToFile.writeCard(cardDataUser1.toString(), "card.txt", false);
        writeCardToFile.writeCard(cardDataUser2.toString(), "card.txt", true);
        writeCardToFile.writeCard(cardDataUser3.toString(), "card.txt", true);
        writeCardToFile.writeCard(cardDataUser4.toString(), "card.txt", true);

        ReadCardFromFile readCard = new ReadCardFromFile();
        ParsFile parsFile = new ParsFile();
        for (String str : readCard.dataCards("card.txt")) {
            parsFile.parser(str);

        }
    }
}
