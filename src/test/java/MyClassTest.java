package test.java;

import main.java.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void testSomething(){
        Calculator calculator = new Calculator();
        int result = calculator.sum(3,2);
        assertEquals(4,result,"2+3 should equal 5");

    }

    @BeforeEach
    public void setup(){

    }

    @AfterEach
    public void tearDown(){

    }

}