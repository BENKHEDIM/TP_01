import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacci {

    @Test
    void ItShouldThrowsAnExceptionIfNIsNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> Fibonacci.fibonacci(-1));
    }

    @Test
    void ItShouldReturn0IfNIsEquTo0(){
        Assertions.assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void ItShouldReturn1IfNIsEquTo1(){
        Assertions.assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void ItShouldCalculateTheRightFibonocciNumberForTheGivenN(){
        Assertions.assertEquals(5, Fibonacci.fibonacci(5));
    }

}
