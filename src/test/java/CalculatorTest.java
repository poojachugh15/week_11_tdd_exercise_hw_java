import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(5, 2, 20.50, 10.20);
    }

    @Test
    public void Add(){
        assertEquals(7, calculator.Add());
    }

    @Test
    public void Subtract(){
        assertEquals(3, calculator.Subtract());
    }

    @Test
    public void Multiply(){
        assertEquals(10, calculator.Multiply());
    }

    @Test
    public void Divide(){
        assertEquals(2.00, calculator.Divide(),  0.1);

    }


}

