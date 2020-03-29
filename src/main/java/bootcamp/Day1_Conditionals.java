package bootcamp;

public class Day1_Conditionals {
    /**
     * You need to check if an object is null before you can use it.
     * You decide to write a method that checks for this.
     *
     * Return true if obj is not null.
     * Return false if obj is null.
     *
     */
    public boolean isNotNull(Object obj) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * You are helping an engineer with a real-time calculator
     * that takes measurements.  The sensors are buggy so sometimes
     * the measurements returned are negative.
     *
     * He wants you to find the hypotenuse based on two measurements
     * sideA and sideB given to you.
     *
     * The hypotenuse can be found by taking the square root of the
     * following sum: sideA² + sideB²
     *
     * If sideA or sideB is negative, you should return 0.
     *
     * @param sideA length of sideA
     * @param sideB length of sideB
     * @return c  (Use Math.sqrt() to get square root of number)
     */
    public double findHypotenuse(double sideA, double sideB) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Your chemist friend is tired of googling temperature conversions.
     * She wants you to convert Fahrenheit to Celsius using the
     * following formula:
     *
     * C = (F - 32) * 5/9
     *
     * @param degreesInFahrenheit degrees in Fahrenheit
     * @return degrees in Celsius
     */
    public double convertToCelsius(double degreesInFahrenheit) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Implement the method to convert a numerical grade to Letter grade
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
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Your gambling buddy can't get enough of black jack.  He
     * wants you to program that game inside his new IOT toaster.
     *
     * Because of display limitations, you can only represent a
     * card with 2 characters.
     *
     * Implement a method that returns a 2-character code for
     * the suit number and card number provided.  For example,
     * a 3 of Clubs should look like 3♣;
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
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * You need to create a TPS report for your boss.  To do this
     * you have to create a CSV file.
     *
     * Implement a method that returns a single string with values
     * separated by commas.
     *
     * @param a string input
     * @param b string input
     * @param c string input
     * @return single string as a,b,c
     */
    public String csvMe(String a, String b, String c) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Return true if a / b is evenly divisible
     * Otherwise return false
     *
     * @param a the dividend
     * @param b the divisor
     * @return true if a / b is evenly divisible, otherwise return false
     */
    public boolean isDivisibleBy(long a, long b) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * You are creating a Caesar cipher to encrypt text.
     * In this cipher, a character is replaced by a letter some
     * fixed number of positions down the alphabet.
     * Letters that go past z roll around and start from a again.
     *
     * Example ch = 'A', x = 5 returns 'F'
     * Example ch = 'X', x = 4 returns 'B'
     * Example ch = 'x', x = 4 returns 'b'
     *
     * This algorithm should be case-sensitive!
     *
     * @param ch Character to encrypt, it is safe to assume you
     *           will only get letters [A-Z, a-z].
     * @param x  The number of positions to move forward,
     *           can be negative and can be > 26
     * @return encrypted character.
     */
    public char encryptCharacter(char ch, int x) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
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
        throw new RuntimeException("Method Not Implemented");
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
        throw new RuntimeException("Method Not Implemented");
    }
}