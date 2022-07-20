package ru.netology.bonus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//

public class    BonusServiceTest {

    @ParameterizedTest
    //@CsvSource(
    // value={
    //  "'registered user, bonus under limit',150, 5000, true",
    // "'registered user, bonus over limit',50, 5000, false"
    // })
    @CsvFileSource(resources = "/data.csv")
    public void testRegisteredUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        int actual = service.calcBonus(amount, isRegistered);

        Assertions.assertEquals(expected, actual);

    }

}