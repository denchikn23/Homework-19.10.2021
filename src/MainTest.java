import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test // Имеется ввиду, что отрицательная скорость - движение в противоположном направлении относительно выбранного.
    public void shouldWorkIfIsNotGreenLightAndNegativeSpeed() {
        int speed = -1;
        boolean actual = Main.isOut(speed);

        Assertions.assertTrue(actual);
    }

    @Test // Имеется ввиду, что отрицательная скорость - движение в противоположном направлении относительно выбранного.
    public void shouldWorkIfIsGreenLightAndNegativeSpeed() {
        int speed = -1;
        boolean actual = Main.isOut(speed);

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldWorkIfIsGreenLightAndSpeedIsZero() {
        int speed = 0;
        boolean actual = Main.isOut(speed);

        Assertions.assertFalse(actual);
    }
}
