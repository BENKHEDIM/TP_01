import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestStackPop {

    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack();
    }

    @Test
    void popShouldRemoveTheElementOnTheTopOfTheStack(){

        stack.push(4);
        int sizeBeforePop = stack.size();
        int result = stack.pop();
        Assertions.assertEquals(sizeBeforePop-1, stack.size());
        Assertions.assertEquals(4, result);

    }

    @Test
    void popShouldThrowAnExceptionIfTheStackIsEmpty(){

        Assertions.assertThrows(IllegalStateException.class, () -> stack.pop());

    }

}
