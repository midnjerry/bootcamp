package bootcamp;

import java.util.Arrays;
import java.util.Collections;

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
        return obj != null;
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
        if (sideA < 0 || sideB < 0) {
            return 0;
        }

        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
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
        return (degreesInFahrenheit - 32) * (5.0 / 9.0);
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
        if (grade >= 90.0) {
            return 'A';
        } else if (grade >= 80.0 && grade < 90) {
            return 'B';
        } else if (grade >= 70.0 && grade < 80) {
            return 'C';
        } else if (grade >= 60.0 && grade < 70) {
            return 'D';
        }
        return 'F';
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
        if ((suit < 1 || suit > 4) || (card < 1 || card > 13)) {
            return "XX";
        }
        String cardVal = "";
        switch (card) {
            case 1:
                cardVal += "A";
                break;
            case 2:
                cardVal += "2";
                break;
            case 3:
                cardVal += "3";
                break;
            case 4:
                cardVal += "4";
                break;
            case 5:
                cardVal += "5";
                break;
            case 6:
                cardVal += "6";
                break;
            case 7:
                cardVal += "7";
                break;
            case 8:
                cardVal += "8";
                break;
            case 9:
                cardVal += "9";
                break;
            case 10:
                cardVal += "T";
                break;
            case 11:
                cardVal += "J";
                break;
            case 12:
                cardVal += "Q";
                break;
            case 13:
                cardVal += "K";
                break;
            default: cardVal += "X";
        }
        switch(suit) {
            case 1:
                cardVal += "\u2660";
                break;
            case 2:
                cardVal += "\u2661";
                break;
            case 3:
                cardVal += "\u2662";
                break;
            case 4:
                cardVal += "\u2663";
                break;
            default: cardVal += "X";
        }
        return cardVal;
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
        if (a == null || b == null || c == null) {
            return "";
        }
        return a + "," + b + "," + c;
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
        return a % b == 0;
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
        int minChar = 0, maxChar = 0, calc = 0;

        if ('a' <= ch && ch <= 'z') {
            minChar = 'a';
            maxChar = 'z';
        } else if ('A' <= ch && ch <= 'Z') {
            minChar = 'A';
            maxChar = 'Z';
        }

        int offset = x;
        if (x > 26) {
            while (offset > 26) {
                offset -= 26;
            }
            calc = ch + offset;
        }
        if (x < -26) {
            while (offset < -26) {
                offset += 26;
            }
            calc = ch + offset;
        } else {
            calc = ch + x;
        }

        if (calc < minChar) {
            System.out.println("calc is less " + offset);
            return (char)(calc+26);
        } else if (calc > maxChar) {
            System.out.println("calc is greater" + offset);
            return (char)(calc-26);
        }

        return (char)calc;
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
        if (num < 0) {
            return "INVALID";
        }
        switch(num) {
            case 0: return "BLACK";
            case 1: return "RED";
            case 2: return "BLUE";
            case 3: return "PURPLE";
            case 4: return "YELLOW";
            case 5: return "ORANGE";
            case 6: return "GREEN";
            case 15: return "WHITE";
            default: return "BROWN";
        }
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
        var horses = Arrays.asList(a, b, c, d);
        int winningDistance = Collections.max(Arrays.asList(a, b, c, d));
        int tiesForLead = Collections.frequency(horses, winningDistance);

        if (tiesForLead > 1) {
            return "TIE";
        }

        var winningHorse = horses.indexOf(winningDistance);
        switch(winningHorse) {
            case 0: return "Horse A";
            case 1: return "Horse B";
            case 2: return "Horse C";
            case 3: return "Horse D";
            default: return "TIE";
        }
    }
}