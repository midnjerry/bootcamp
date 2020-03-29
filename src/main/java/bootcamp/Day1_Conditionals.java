package bootcamp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Day1_Conditionals {


    /**
     * Validates input object
     *
     * @param obj
     * @return false if obj is null otherwise true
     */
    public boolean isNotNull(Object obj) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Returns hypotenuse for given triangle using
     * Pythagorean Theorem.  c^2 = a^2 + b^2.
     *
     * If sideA or sideB is negative, result returned should be 0.
     *
     * @param sideA length of sideA
     * @param sideB length of sideB
     * @return c  (Use Math.sqrt() to get square root of number)
     */
    public double findHypotenuse(double sideA, double sideB){
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Converts temperature from Fahrenheit to Celcius
     * <p>
     * Based on formula:
     * C = (F - 32) * 5/9
     *
     * @param degreesInFahrenheit degrees in Fahrenheit
     * @return degrees in Celsius
     */
    public double convertToCelsius(double degreesInFahrenheit) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Converts numerical grade to Letter grade
     * if grade >= 90 return A
     * if grade >= 80 and < 90 return B
     * if grade >= 70 and < 80 return C
     * if grade >= 60 and < 70 return D
     * if grade < 60 return F
     *
     * @param grade numerical grade to convert
     * @return letter grade
     */

    public char returnLetterGrade(double grade) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Returns 2-character code that
     * represents the card from input.
     *
     * @param suit number from 1 - 4
     *             1 = Spade character = \u2660
     *             2 = Heart character = \u2661
     *             3 = Diamond character = \u2662
     *             4 = Club character = \u2663
     * @param card number from 1 - 13 representing Ace (1) to King (13)
     *             Ace = A
     *             2-9 = 2-9 respectively
     *             10 = T
     *             11 = J
     *             12 = Q
     *             13 = K
     * @return 2-character code representing card.
     * Example:
     * suit = 4, card = 10 returns "T♣"
     */
    public String getCard(int suit, int card) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Return single string with values separated by commas.
     *
     * @param a string input
     * @param b string input
     * @param c string input
     * @return single string as a,b,c
     */
    public String csvMe(String a, String b, String c) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * @param dividend
     * @param divisor
     * @return true if dividend / divisor is evenly divisible, otherwise return false
     */
    public boolean isDivisibleBy(long dividend, long divisor) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * You are creating a Caesar cipher to encrypt text.
     * The character is replaced by a letter some fixed number of positions
     * down the alphabet.  Letters that go past z roll around.
     *
     * Algorithm should be case-sensitive!
     * Only expect characters [A-Z, a-z] as input
     *
     * @param ch Character to encrypt
     * @param x The number of positions to move forward, can be negative and can be > 26
     * @return encrypted character.
     * Example ch = 'A', x = 5 returns 'F'
     * Example ch = 'X', x = 4 returns 'B'
     * Example ch = 'x', x = 4 returns 'b'
     */
    public char encryptCharacter(char ch, int x) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Convert the integer 'num' to a color based on the follow chart:
     * x     |  color
     * -------------
     * 0     |  BLACK
     * 1     |  RED
     * 2     |  BLUE
     * 3     |  PURPLE
     * 4     |  YELLOW
     * 5     |  ORANGE
     * 6     |  GREEN
     * 15    |  WHITE
     * <p>
     * negative number |  INVALID
     * everything else BROWN
     *
     * @param num integer input
     * @return color
     */
    public String convertToColor(int num) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

    /**
     * Determine which horse has travelled the farthest.
     * <p>
     * Input is a number representing the number of miles
     * travelled by each horse.
     * <p>
     * Determine which input has the highest value and
     * return the name of the horse.
     * <p>
     * if horse a wins, return "Horse A"
     * if horse b wins, return "Horse B"
     * if horse c wins, return "Horse C"
     * if horse d wins, return "Horse D"
     * if there is a tie, return "TIE"
     *
     * @param a distance horse A has travelled
     * @param b distance horse B has travelled
     * @param c distance horse C has travelled
     * @param d distance horse D has travelled
     * @return winner
     */
    public String horseRace(int a, int b, int c, int d) {
        // Erase this line and write code here.
        throw new NotImplementedException();
    }

}
