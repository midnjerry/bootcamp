package bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day1_ConditionalsTest {

    private static final double FLOATING_POINT_ACCURACY = 0.001;
    public Day1_Conditionals obj;

    @Before
    public void setup() {
        obj = new Day1_Conditionals();
    }

    @Test
    public void isNotNullTest() {
        assertEquals(true, obj.isNotNull(1));
        assertEquals(true, obj.isNotNull(new Object()));
        assertEquals(false, obj.isNotNull(null));
    }

    @Test
    public void convertToCelsiusTest() {
        assertEquals(7.2222222, obj.convertToCelsius(45.0), FLOATING_POINT_ACCURACY);
        assertEquals(0, obj.convertToCelsius(32.0), FLOATING_POINT_ACCURACY);
        assertEquals(37.777778, obj.convertToCelsius(100), FLOATING_POINT_ACCURACY);
        assertEquals(40, obj.convertToCelsius(104), FLOATING_POINT_ACCURACY);
        assertEquals(30, obj.convertToCelsius(86), FLOATING_POINT_ACCURACY);
        assertEquals(25, obj.convertToCelsius(77), FLOATING_POINT_ACCURACY);
        assertEquals(20, obj.convertToCelsius(68), FLOATING_POINT_ACCURACY);
    }

    @Test
    public void returnLetterGrade() {
        assertEquals('A', obj.returnLetterGrade(110));
        assertEquals('A', obj.returnLetterGrade(100));
        assertEquals('A', obj.returnLetterGrade(95));
        assertEquals('A', obj.returnLetterGrade(90));
        assertEquals('B', obj.returnLetterGrade(85));
        assertEquals('B', obj.returnLetterGrade(80));
        assertEquals('C', obj.returnLetterGrade(75));
        assertEquals('C', obj.returnLetterGrade(70));
        assertEquals('D', obj.returnLetterGrade(65));
        assertEquals('D', obj.returnLetterGrade(60));
        assertEquals('F', obj.returnLetterGrade(59.99));
        assertEquals('F', obj.returnLetterGrade(50));
        assertEquals('F', obj.returnLetterGrade(0));
    }



    @Test
    public void convertToColor_returnsAppropriateColorForEachNumber() {
        assertEquals("INVALID", obj.convertToColor(-4));
        assertEquals("BLACK", obj.convertToColor(0));
        assertEquals("RED", obj.convertToColor(1));
        assertEquals("BLUE", obj.convertToColor(2));
        assertEquals("PURPLE", obj.convertToColor(3));
        assertEquals("YELLOW", obj.convertToColor(4));
        assertEquals("ORANGE", obj.convertToColor(5));
        assertEquals("GREEN", obj.convertToColor(6));
        assertEquals("BROWN", obj.convertToColor(7));
        assertEquals("BROWN", obj.convertToColor(8));
        assertEquals("BROWN", obj.convertToColor(9));
        assertEquals("BROWN", obj.convertToColor(10));
        assertEquals("BROWN", obj.convertToColor(11));
        assertEquals("BROWN", obj.convertToColor(12));
        assertEquals("BROWN", obj.convertToColor(13));
        assertEquals("BROWN", obj.convertToColor(14));
        assertEquals("WHITE", obj.convertToColor(15));
        assertEquals("WHITE", obj.convertToColor(50));
    }

    @Test
    public void horseRaceTest() {
        assertEquals("Horse A", obj.horseRace(10, 4, 2, 9));
        assertEquals("Horse B", obj.horseRace(10, 11, 2, 9));
        assertEquals("Horse C", obj.horseRace(10, 4, 12, 9));
        assertEquals("Horse D", obj.horseRace(10, 4, 2, 15));
        assertEquals("Horse A", obj.horseRace(10, 4, 4, 4));
        assertEquals("TIE", obj.horseRace(10, 4, 10, 4));
        assertEquals("TIE", obj.horseRace(10, 4, 5, 10));
        assertEquals("TIE", obj.horseRace(10, 10, 2, 6));
        assertEquals("TIE", obj.horseRace(10, 11, 11, 4));
        assertEquals("TIE", obj.horseRace(10, 11, 6, 11));
        assertEquals("TIE", obj.horseRace(10, 11, 12, 12));
    }


}