package bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day2_LoopsTest {
    private static final double FLOATING_POINT_ACCURACY = 0.001;
    private static final double SQRT_ACCURACY = 1E-8;
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
        assertEquals("******", obj.drawLine(6));
        assertEquals("*******", obj.drawLine(7));
        assertEquals("********", obj.drawLine(8));
        assertEquals("*********", obj.drawLine(9));
        assertEquals("**********", obj.drawLine(10));
        assertEquals("************************", obj.drawLine(24));
    }

    @Test
    public void drawDoubleLineTest() {
        assertEquals("", obj.drawDoubleLine(-1));
        assertEquals("", obj.drawDoubleLine(0));
        assertEquals("**", obj.drawDoubleLine(1));
        assertEquals("****", obj.drawDoubleLine(2));
        assertEquals("******", obj.drawDoubleLine(3));
        assertEquals("********", obj.drawDoubleLine(4));
        assertEquals("**********", obj.drawDoubleLine(5));
        assertEquals("************************", obj.drawDoubleLine(12));
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

    @Test
    public void getMultiplesOfFiveSequenceTest() {
        assertEquals("", obj.getMultiplesOfFiveSequence(-1));
        assertEquals("", obj.getMultiplesOfFiveSequence(0));
        assertEquals("", obj.getMultiplesOfFiveSequence(-16));
        assertEquals("5", obj.getMultiplesOfFiveSequence(5));
        assertEquals("5,10", obj.getMultiplesOfFiveSequence(10));
        assertEquals("5,10,15,20,25,30,35", obj.getMultiplesOfFiveSequence(35));
        assertEquals("5,10,15,20,25,30,35", obj.getMultiplesOfFiveSequence(36));
        assertEquals("5,10,15,20,25,30,35", obj.getMultiplesOfFiveSequence(37));
        assertEquals("5,10,15,20,25,30,35", obj.getMultiplesOfFiveSequence(38));
        assertEquals("5,10,15,20,25,30,35", obj.getMultiplesOfFiveSequence(39));
        assertEquals("5,10,15,20,25,30,35,40,45,50", obj.getMultiplesOfFiveSequence(53));
    }

    @Test
    public void factorialTest() {
        assertEquals(1, obj.factorial(0));
        assertEquals(1, obj.factorial(1));
        assertEquals(2, obj.factorial(2));
        assertEquals(6, obj.factorial(3));
        assertEquals(24, obj.factorial(4));
        assertEquals(120, obj.factorial(5));
        assertEquals(720, obj.factorial(6));
        assertEquals(5040, obj.factorial(7));
        assertEquals(40320, obj.factorial(8));
        assertEquals(362880, obj.factorial(9));
        assertEquals(3628800, obj.factorial(10));
        assertEquals(39916800, obj.factorial(11));
        assertEquals(479001600, obj.factorial(12));
        assertEquals(6227020800L, obj.factorial(13));
        assertEquals(87178291200L, obj.factorial(14));
        assertEquals(1307674368000L, obj.factorial(15));
        assertEquals(20922789888000L, obj.factorial(16));
        assertEquals(355687428096000L, obj.factorial(17));
        assertEquals(6402373705728000L, obj.factorial(18));
        assertEquals(121645100408832000L, obj.factorial(19));
        assertEquals(2432902008176640000L, obj.factorial(20));
    }

    @Test
    public void digitalReductionTest() {
        for (int i = 0; i <= 9; i++) {
            assertEquals(i, obj.digitalReduction(i));
        }
        assertEquals(6, obj.digitalReduction(12345));
        assertEquals(1, obj.digitalReduction(2147483647));
        assertEquals(9, obj.digitalReduction(9999999));
    }

    @Test
    public void drawSquare() {
        assertEquals("", obj.drawSquare(0));
        assertEquals("*\n", obj.drawSquare(1));
        assertEquals("**\n**\n", obj.drawSquare(2));
        assertEquals("***\n* *\n***\n", obj.drawSquare(3));
        assertEquals("****\n*  *\n*  *\n****\n", obj.drawSquare(4));
        assertEquals("*****\n*   *\n*   *\n*   *\n*****\n", obj.drawSquare(5));
        String sixResult = "" +
                "******\n" +
                "*    *\n" +
                "*    *\n" +
                "*    *\n" +
                "*    *\n" +
                "******\n";
        assertEquals(sixResult, obj.drawSquare(6));

        String tenResult = "" +
                "**********\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "*        *\n" +
                "**********\n";
        assertEquals(tenResult, obj.drawSquare(10));
    }

    @Test
    public void newtonSqrtTest() {
        for (int i = 0; i <= 10000; i++) {
            assertEquals(Math.sqrt(i), obj.newtonSqrt(i), SQRT_ACCURACY);
            double num = (double) i + 1 / 3.0;
            assertEquals(Math.sqrt(num), obj.newtonSqrt(num), SQRT_ACCURACY);
            num = (double) i + 2 / 3.0;
            assertEquals(Math.sqrt(num), obj.newtonSqrt(num), SQRT_ACCURACY);
        }

    }
}