import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStackPush {

    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack();
    }
    @Test
    void pushShouldAddElemnetAtTheTopOfTheStack(){
        stack.push(4);
        Assertions.assertEquals(1, stack.size());
        Assertions.assertEquals(4, stack.peek());
    }

    @Test
    void pushShouldExpendArrayIfStackIsFull(){
        for (int i=0; i<10; i++){
            stack.push(i);
        }
        stack.push(10);
        Assertions.assertEquals(11, stack.size());
        Assertions.assertEquals(10, stack.peek());
    }

}
