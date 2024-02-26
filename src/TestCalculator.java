import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestCalculator {

    @Test
    public void TestAddition() {
        int a = 10;
        int b = 5;
        int result = new Calculator().add(a, b);
        Assertions.assertEquals(15, result);
    }

}
