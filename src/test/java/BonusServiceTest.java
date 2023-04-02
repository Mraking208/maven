import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.BonusService;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    public void shouldCalculateForRegisteredAndUnderLimit() {

        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateForRegisteredAndOverLimit() {

        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateForNotRegisteredAndUnderLimit() {

        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateForNotRegisteredAndOverLimit() {

        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }
}
