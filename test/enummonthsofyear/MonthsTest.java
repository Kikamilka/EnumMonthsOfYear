package enummonthsofyear;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonthsTest {
    
    public MonthsTest() {
    }

    @Test
    public void testGetDays() {
        System.out.println("getDays");
        Months curMonth = Months.DECEMBER;
        int result = curMonth.getDays();
        assertEquals(31, result);
        
        curMonth = Months.FEBRUARY;
        result = curMonth.getDays();
        assertEquals(28, result);        
    }

    @Test
    public void testNext() {
        System.out.println("next");
        Months curMonth = Months.DECEMBER;
        Months nextMonth = Months.JANUARY;
        Months result = curMonth.next();
        assertEquals(nextMonth, result);
        
        curMonth = Months.MARCH;
        nextMonth = Months.APRIL;
        result = curMonth.next();
        assertEquals(nextMonth, result);
    }
    
}
