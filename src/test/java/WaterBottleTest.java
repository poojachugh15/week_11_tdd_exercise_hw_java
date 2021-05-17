import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void Volume(){
        assertEquals(100, waterbottle.Volume());
    }

    @Test
    public void Drink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.Volume());
    }
    @Test
    public void Empty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void Fill(){
        waterbottle.fill();
        assertEquals(100, waterbottle.Volume());
    }

}
