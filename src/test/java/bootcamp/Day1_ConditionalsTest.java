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
    public void findHypotenuseTest() {
        assertEquals(5, obj.findHypotenuse(3, 4), FLOATING_POINT_ACCURACY);
        assertEquals(9.43398, obj.findHypotenuse(5, 8), FLOATING_POINT_ACCURACY);
        assertEquals(0, obj.findHypotenuse(-5, 8), FLOATING_POINT_ACCURACY);
        assertEquals(0, obj.findHypotenuse(5, -8), FLOATING_POINT_ACCURACY);
        assertEquals(11.1803, obj.findHypotenuse(5, 10), FLOATING_POINT_ACCURACY);
        assertEquals(25, obj.findHypotenuse(20, 15), FLOATING_POINT_ACCURACY);
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
    public void returnLetterGradeTest() {
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
    public void getCardTest() {
        assertEquals("A\u2660", obj.getCard(1, 1));
        assertEquals("2\u2660", obj.getCard(1, 2));
        assertEquals("3\u2660", obj.getCard(1, 3));
        assertEquals("4\u2660", obj.getCard(1, 4));
        assertEquals("5\u2660", obj.getCard(1, 5));
        assertEquals("6\u2660", obj.getCard(1, 6));
        assertEquals("7\u2660", obj.getCard(1, 7));
        assertEquals("8\u2660", obj.getCard(1, 8));
        assertEquals("9\u2660", obj.getCard(1, 9));
        assertEquals("T\u2660", obj.getCard(1, 10));
        assertEquals("J\u2660", obj.getCard(1, 11));
        assertEquals("Q\u2660", obj.getCard(1, 12));
        assertEquals("K\u2660", obj.getCard(1, 13));

        assertEquals("A\u2661", obj.getCard(2, 1));
        assertEquals("2\u2661", obj.getCard(2, 2));
        assertEquals("3\u2661", obj.getCard(2, 3));
        assertEquals("4\u2661", obj.getCard(2, 4));
        assertEquals("5\u2661", obj.getCard(2, 5));
        assertEquals("6\u2661", obj.getCard(2, 6));
        assertEquals("7\u2661", obj.getCard(2, 7));
        assertEquals("8\u2661", obj.getCard(2, 8));
        assertEquals("9\u2661", obj.getCard(2, 9));
        assertEquals("T\u2661", obj.getCard(2, 10));
        assertEquals("J\u2661", obj.getCard(2, 11));
        assertEquals("Q\u2661", obj.getCard(2, 12));
        assertEquals("K\u2661", obj.getCard(2, 13));

        assertEquals("A\u2662", obj.getCard(3, 1));
        assertEquals("2\u2662", obj.getCard(3, 2));
        assertEquals("3\u2662", obj.getCard(3, 3));
        assertEquals("4\u2662", obj.getCard(3, 4));
        assertEquals("5\u2662", obj.getCard(3, 5));
        assertEquals("6\u2662", obj.getCard(3, 6));
        assertEquals("7\u2662", obj.getCard(3, 7));
        assertEquals("8\u2662", obj.getCard(3, 8));
        assertEquals("9\u2662", obj.getCard(3, 9));
        assertEquals("T\u2662", obj.getCard(3, 10));
        assertEquals("J\u2662", obj.getCard(3, 11));
        assertEquals("Q\u2662", obj.getCard(3, 12));
        assertEquals("K\u2662", obj.getCard(3, 13));


        assertEquals("A\u2663", obj.getCard(4, 1));
        assertEquals("2\u2663", obj.getCard(4, 2));
        assertEquals("3\u2663", obj.getCard(4, 3));
        assertEquals("4\u2663", obj.getCard(4, 4));
        assertEquals("5\u2663", obj.getCard(4, 5));
        assertEquals("6\u2663", obj.getCard(4, 6));
        assertEquals("7\u2663", obj.getCard(4, 7));
        assertEquals("8\u2663", obj.getCard(4, 8));
        assertEquals("9\u2663", obj.getCard(4, 9));
        assertEquals("T\u2663", obj.getCard(4, 10));
        assertEquals("J\u2663", obj.getCard(4, 11));
        assertEquals("Q\u2663", obj.getCard(4, 12));
        assertEquals("K\u2663", obj.getCard(4, 13));

        assertEquals("XX", obj.getCard(-1, 4));
        assertEquals("XX", obj.getCard(5, 4));
        assertEquals("XX", obj.getCard(4, 0));
        assertEquals("XX", obj.getCard(4, 14));
    }

    @Test
    public void csvMeTest() {
        assertEquals("a,b,c", obj.csvMe("a", "b", "c"));
        assertEquals("super,boss,cool", obj.csvMe("super", "boss", "cool"));
    }

    @Test
    public void isDivisibleByTest() {
        assertEquals(true, obj.isDivisibleBy(4, 1));
        assertEquals(true, obj.isDivisibleBy(4, 2));
        assertEquals(false, obj.isDivisibleBy(4, 3));
        assertEquals(true, obj.isDivisibleBy(50, 10));
        assertEquals(false, obj.isDivisibleBy(50, 9));
    }

    @Test
    public void encryptCharacterTest() {
        assertEquals('F', obj.encryptCharacter('A', 5));
        assertEquals('B', obj.encryptCharacter('X', 4));
        assertEquals('b', obj.encryptCharacter('x', 4));
        assertEquals('n', obj.encryptCharacter('e', 9));
        assertEquals('A', obj.encryptCharacter('Z', 1));
        assertEquals('Y', obj.encryptCharacter('A', 50));
        assertEquals('T', obj.encryptCharacter('X', -4));
        assertEquals('Z', obj.encryptCharacter('A', -1));
        assertEquals('Z', obj.encryptCharacter('A', -27));
        assertEquals('T', obj.encryptCharacter('X', -30));

        assertEquals('D', obj.encryptCharacter('A', 3));
        assertEquals('E', obj.encryptCharacter('B', 3));
        assertEquals('F', obj.encryptCharacter('C', 3));
        assertEquals('G', obj.encryptCharacter('D', 3));
        assertEquals('H', obj.encryptCharacter('E', 3));
        assertEquals('I', obj.encryptCharacter('F', 3));
        assertEquals('J', obj.encryptCharacter('G', 3));
        assertEquals('K', obj.encryptCharacter('H', 3));
        assertEquals('L', obj.encryptCharacter('I', 3));
        assertEquals('M', obj.encryptCharacter('J', 3));
        assertEquals('N', obj.encryptCharacter('K', 3));
        assertEquals('O', obj.encryptCharacter('L', 3));
        assertEquals('P', obj.encryptCharacter('M', 3));
        assertEquals('Q', obj.encryptCharacter('N', 3));
        assertEquals('R', obj.encryptCharacter('O', 3));
        assertEquals('S', obj.encryptCharacter('P', 3));
        assertEquals('T', obj.encryptCharacter('Q', 3));
        assertEquals('U', obj.encryptCharacter('R', 3));
        assertEquals('V', obj.encryptCharacter('S', 3));
        assertEquals('W', obj.encryptCharacter('T', 3));
        assertEquals('X', obj.encryptCharacter('U', 3));
        assertEquals('Y', obj.encryptCharacter('V', 3));
        assertEquals('Z', obj.encryptCharacter('W', 3));
        assertEquals('A', obj.encryptCharacter('X', 3));
        assertEquals('B', obj.encryptCharacter('Y', 3));
        assertEquals('C', obj.encryptCharacter('Z', 3));

        assertEquals('d', obj.encryptCharacter('a', 3));
        assertEquals('e', obj.encryptCharacter('b', 3));
        assertEquals('f', obj.encryptCharacter('c', 3));
        assertEquals('g', obj.encryptCharacter('d', 3));
        assertEquals('h', obj.encryptCharacter('e', 3));
        assertEquals('i', obj.encryptCharacter('f', 3));
        assertEquals('j', obj.encryptCharacter('g', 3));
        assertEquals('k', obj.encryptCharacter('h', 3));
        assertEquals('l', obj.encryptCharacter('i', 3));
        assertEquals('m', obj.encryptCharacter('j', 3));
        assertEquals('n', obj.encryptCharacter('k', 3));
        assertEquals('o', obj.encryptCharacter('l', 3));
        assertEquals('p', obj.encryptCharacter('m', 3));
        assertEquals('q', obj.encryptCharacter('n', 3));
        assertEquals('r', obj.encryptCharacter('o', 3));
        assertEquals('s', obj.encryptCharacter('p', 3));
        assertEquals('t', obj.encryptCharacter('q', 3));
        assertEquals('u', obj.encryptCharacter('r', 3));
        assertEquals('v', obj.encryptCharacter('s', 3));
        assertEquals('w', obj.encryptCharacter('t', 3));
        assertEquals('x', obj.encryptCharacter('u', 3));
        assertEquals('y', obj.encryptCharacter('v', 3));
        assertEquals('z', obj.encryptCharacter('w', 3));
        assertEquals('a', obj.encryptCharacter('x', 3));
        assertEquals('b', obj.encryptCharacter('y', 3));
        assertEquals('c', obj.encryptCharacter('z', 3));
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
        assertEquals("BROWN", obj.convertToColor(50));
    }

    @Test
    public void horseRaceTest() {
        assertEquals("Horse A", obj.horseRace(10, 4, 2, 9));
        assertEquals("Horse B", obj.horseRace(10, 11, 2, 9));
        assertEquals("Horse C", obj.horseRace(10, 4, 12, 9));
        assertEquals("Horse D", obj.horseRace(10, 4, 2, 15));
        assertEquals("Horse A", obj.horseRace(10, 4, 4, 4));
        assertEquals("Horse B", obj.horseRace(4, 10, 4, 4));
        assertEquals("Horse C", obj.horseRace(4, 4, 10, 4));
        assertEquals("Horse D", obj.horseRace(4, 4, 4, 10));
        assertEquals("TIE", obj.horseRace(10, 4, 10, 4));
        assertEquals("TIE", obj.horseRace(10, 4, 5, 10));
        assertEquals("TIE", obj.horseRace(10, 10, 2, 6));
        assertEquals("TIE", obj.horseRace(10, 11, 11, 4));
        assertEquals("TIE", obj.horseRace(10, 11, 6, 11));
        assertEquals("TIE", obj.horseRace(10, 11, 12, 12));
    }


}