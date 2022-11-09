package testsNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test1 {


    @Test(priority = 1)
    public void myFirstTest(){
        Collection<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");

        Assert.assertEquals(5,daysOfWeek.size());
    }
    @Test(priority = 0)
    public void mySecondTest(){
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(27);
        myNumbers.add(22);
        myNumbers.add(33);

        Object[] object = myNumbers.toArray();

        Assert.assertTrue( myNumbers.contains(33));
        Assert.assertEquals(4,object.length);

    }
}
