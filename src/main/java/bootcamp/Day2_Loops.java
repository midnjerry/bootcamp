package bootcamp;

public class Day2_Loops {
    /**
     * Given X print 1 to X as string with spaces in between.  So 4 ->  "1 2 3 4 "   EC "1 2 3 4"
     */
    public String getSequence(int x) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Given a number X, Draw a horizontal line of "*" of length X.
     *
     * @param x
     * @return string with x number of '*'
     */
    public String drawLine(int x) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Given a number X, Draw a horizontal line of "*" of length 2 * X
     *
     * @param x
     * @return string with 2x number of '*'
     */
    public String drawDoubleLine(int x) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Return a string of letters that starts
     * with given ch and ends with z.  Must be case sensitive.
     * <p>
     * Example: ch = 'm' return "mnopqrstuvwxyz"
     * Example: ch = 'S' return "STUVWXYZ"
     *
     * @param ch letter to begin string with.
     * @return sequence of letters starting from letter ending with z.
     */
    public String getSequenceToZ(char ch) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Without using Math library make a method that implements
     * an exponent function.
     * <p>
     * Example: x = 2.1, y = 5 return 2.1 * 2.1 * 2.1 * 2.1 * 2.1
     * Example: x = 2.1, y = 0 return 1
     * Example: x = 2.1, y = -2 return 1 / (2.1 * 2.1)
     *
     * @param base base
     * @param exp  exponent
     * @return x^y
     */
    public double exp(double base, int exp) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Return a string of multiples of 5 beginning from 5 to num
     * separated by ","
     * <p>
     * Example: num = 20, return "5,10,15,20"
     * Example: num = -1, return ""
     * Example: num = 0, return ""
     * Example: num = 53, return "5,10,15,20,25,30,35,40,45,50"
     *
     * @param num
     * @return string of numbers from 1 to num separated by ","
     */
    public String getMultiplesOfFiveSequence(int num) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Return the factorial of given num
     * The factorial of a num is the product of the
     * sequence of numbers from 1 to num.
     * <p>
     * Example: num = 5, return 120
     * <p>
     * Explanation 120 = 1 * 2 * 3 * 4 * 5
     * <p>
     * Note: The factorial of 0 = 1
     *
     * @param num safely assume (0 <= num <= 20)
     * @return num!
     * <p>
     * Just for fun, when you finish algorithm try to pass in 21
     * and print result
     */
    public long factorial(int num) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Take input num and continually sum all digits until
     * 1 digit is reached.
     * <p>
     * Example: num = 12345, return 6
     * Explanation: 1+2+3+4+5 = 15,  1+5 = 6
     *
     * @param num Number to reduce (safely assume provided num >= 0)
     * @return single digit answer
     */
    public int digitalReduction(int num) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Draw an outline of a square, num x num
     * with sides composed of '*'
     * <p>
     * Example: num = 0, Output = ""
     * Example: num = 1, Output = "*\n"
     * Example: num = 2, Output = "**\n**\n"
     * Example: num = 5, Output = "*****\n*   *\n*   *\n*   *\n*****\n"
     * <p>
     * Hint you should include ' ' for spacing
     *
     * @param num safely assume num <= 40
     */
    public String drawSquare(int num) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    public final static double SQRT_ACCURACY = 1E-8;

    /**
     * Isaac Newton discovered an excellent method
     * to approximate the square root of a number.  By
     * repeating the process, the result would get
     * closer and closer to the actual result.
     * <p>
     * The formula for this is:
     * SQRT(num) ~= (num/A) + A)/2 where A = best guess of SQRT(num)
     * <p>
     * Implement a method that repeats this process until it
     * gets accuracy of SQRT_ACCURACY.
     * <p>
     * Example: SQRT(121), returns ~11.00000000000000...
     * <p>
     * Explanation: Internally you choose A to be 12;
     * ((121/12) + 12)/2 = 11.04166666666667‬, this is the new A
     * ((121/11.04166666666667‬) + 11.04166666666667‬)/2 = 11.0000786163522‬
     * ((121/11.0000786163522‬) + 11.0000786163522‬)/2 = 11.00000000028093‬
     * ((121/11.00000000028093‬) + 11.00000000028093‬)/2 = 11.00000000000000
     *
     * @param num input number
     * @return return approximate square root of num accurate to SQRT_ACCURACY
     */
    public double newtonSqrt(double num) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }
}
