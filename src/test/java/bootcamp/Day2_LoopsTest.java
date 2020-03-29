package bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day2_LoopsTest {
    private static final double FLOATING_POINT_ACCURACY = 0.001;
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

    @Test
    public void getSequenceToZTest() {
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", obj.getSequenceToZ('A'));
        assertEquals("abcdefghijklmnopqrstuvwxyz", obj.getSequenceToZ('a'));
        assertEquals("MNOPQRSTUVWXYZ", obj.getSequenceToZ('M'));
        assertEquals("mnopqrstuvwxyz", obj.getSequenceToZ('m'));
        assertEquals("STUVWXYZ", obj.getSequenceToZ('S'));
        assertEquals("stuvwxyz", obj.getSequenceToZ('s'));
        assertEquals("WXYZ", obj.getSequenceToZ('W'));
        assertEquals("wxyz", obj.getSequenceToZ('w'));
        assertEquals("Z", obj.getSequenceToZ('Z'));
        assertEquals("z", obj.getSequenceToZ('z'));
    }

    @Test
    public void expTest() {
        assertEquals(1, obj.exp(0, 0), FLOATING_POINT_ACCURACY);
        assertEquals(0, obj.exp(0, 1), FLOATING_POINT_ACCURACY);
        assertEquals(32, obj.exp(2, 5), FLOATING_POINT_ACCURACY);
        assertEquals(1 / 32.0, obj.exp(2, -5), FLOATING_POINT_ACCURACY);
        assertEquals(3.235232809088698E12, obj.exp(17.8234, 10), FLOATING_POINT_ACCURACY);
        assertEquals(3.0909677e-13, obj.exp(17.8234, -10), FLOATING_POINT_ACCURACY);
        assertEquals(2.8984101575670307E150, obj.exp(3482034.2343, 23), FLOATING_POINT_ACCURACY);
        assertEquals(3.450167e-151, obj.exp(3482034.2343, -23), FLOATING_POINT_ACCURACY);
    }
}