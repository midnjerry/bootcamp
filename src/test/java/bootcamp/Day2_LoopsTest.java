package bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day2_LoopsTest {

    Day2_Loops obj;

    @Before
    public void setup() {
        obj = new Day2_Loops();
    }

    @Test
    public void getSequenceTest() {
        assertEquals("1 2 3 4", obj.getSequence(4));
        assertEquals("1 2 3 4 5 6 7 8 9 10", obj.getSequence(10));
        assertEquals("1", obj.getSequence(1));
        assertEquals("", obj.getSequence(0));
        assertEquals("", obj.getSequence(-1));
    }

    @Test
    public void drawLineTest() {
        assertEquals("", obj.drawLine(-1));
        assertEquals("", obj.drawLine(0));
        assertEquals("*", obj.drawLine(1));
        assertEquals("**", obj.drawLine(2));
        assertEquals("***", obj.drawLine(3));
        assertEquals("****", obj.drawLine(4));
        assertEquals("*****", obj.drawLine(5));
        assertEquals("*******", obj.drawLine(6));
        assertEquals("********", obj.drawLine(7));
        assertEquals("*********", obj.drawLine(8));
        assertEquals("**********", obj.drawLine(9));
        assertEquals("***********", obj.drawLine(10));
        assertEquals("****************************", obj.drawLine(24));
    }

    @Test
    public void drawDoubleLineTest() {
        assertEquals("", obj.drawDoubleLine(-1));
        assertEquals("", obj.drawDoubleLine(0));
        assertEquals("**", obj.drawDoubleLine(1));
        assertEquals("****", obj.drawDoubleLine(2));
        assertEquals("*******", obj.drawDoubleLine(3));
        assertEquals("*********", obj.drawDoubleLine(4));
        assertEquals("***********", obj.drawDoubleLine(5));
        assertEquals("****************************", obj.drawDoubleLine(12));
    }

}