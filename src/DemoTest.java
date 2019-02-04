import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
    private Demo demo = new Demo();
    @Test
    public void addTest(){
        Assert.assertEquals(5.0, demo.add(2, 3));
    }
    @Test
    public void subTest(){
        Assert.assertEquals(2.0, demo.substract(4, 2));
    }
    @Test
    public void multTest(){
        Assert.assertEquals(9.0, demo.mult(3, 3));
    }
    @Test
    public void divTest(){
        Assert.assertEquals(1.0, demo.divide(4, 4));
    }
    @Test
    public void div0Test(){
        Assert.assertEquals(Double.NaN, demo.divide(4, 0));
    }
}

