import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void subtraction(){
        assertEquals(2, SkillDemo.subtract(4, 2));
    }
}