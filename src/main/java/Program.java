public class Program {
    // Comments can be written using "//" to precede the comments.

    /* Alternative way to do comments */

    /*
       Here is a
       multi-line
       comment
     */

    /**
     * Writing comments like this allows you to utilize JavaDocs
     * JavaDocs can be used to create HTML based documentation
     * @param args
     */
    public static void main(String[] args) {
        // Day 2 Material
        // abc
        // cdf
        //Primitive variables
        boolean isFull = false;
        byte number = (byte) 257; // [0 - 255]  256 = 1 0000 0001b
        char ch = 'a';                       // Usually Strings are used.
        short shortInteger = Short.MAX_VALUE;
        int maxInteger = Integer.MAX_VALUE;  //Popular
        long maxLong = Long.MAX_VALUE;        //Popular Database IDs, anything big
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;  // Popular

        for (char c = ch; c <= 'z'; c++) {
            System.out.print(c);
        }

        System.out.println("\nShort: " + shortInteger);
        System.out.println("\nMax Integer: " + maxInteger);
        System.out.println(maxLong);
        System.out.println(maxFloat);
        System.out.println(maxDouble);  // Comment

        //Reference variables
        Boolean b = Boolean.parseBoolean("TrUe");
        Byte minByte = Byte.MIN_VALUE;
        Character character = Character.forDigit(2, 2);
        Character dVariable = 'd';
        Character bigDVariable = Character.toUpperCase(dVariable);
        Integer max = Integer.max(45, maxInteger);
        Double stringValue = Double.parseDouble("234.234");

        System.out.println("Boolean b = " + b);
        System.out.println(minByte);
        System.out.println("character: " + character);
        System.out.println(bigDVariable + ":" +  dVariable);
        System.out.println(max);
        System.out.println(stringValue + 50);
        System.out.println("Hello World");  // You can even put comments after a command.

        usingCharacter();
    }

    public static void usingCharacter(){
        Character ch = 'A';
        //This displays 'a'
        System.out.println(Character.toLowerCase(ch));

        //This displays 'A'
        System.out.println(ch);

        //Returns the int value that the specified character represents.
        int code = ch;

        //This displays A = 65
        System.out.println(ch + " = " + code);

        //Add 5 to code and convert it to char
        ch = (char) (code + 5);

        //This displays F
        System.out.println(ch);
    }
}
