package hwJawa_18_01_2023;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.ToString;
import net.andreinc.mockneat.MockNeat;
import net.andreinc.mockneat.types.enums.CreditCardType;

import java.time.LocalDate;
import java.util.Random;

@Getter

public class CardData {
    LocalDate localDate = LocalDate.now();
    private final String cardNumber;
    private final String fullName;
    private final int cvv;
    private final String year = String.valueOf(localDate.getYear() + 5);
    private final String mouth = String.valueOf(localDate.getMonthValue());



    public CardData() {
        Faker faker = new Faker();
        Random random = new Random();
        MockNeat mockNeat = MockNeat.threadLocal();

        this.fullName = faker.name().fullName();
        this.cvv = random.nextInt(100, 999);
        this.cardNumber = mockNeat.creditCards().type(CreditCardType.VISA_16).get();
    }
    public String toString() {
        return "Name" + this.fullName + "Number" + this.cardNumber + "CVV" + this.cvv + "Date" + this.mouth + "/" + this.year;
    }
}
