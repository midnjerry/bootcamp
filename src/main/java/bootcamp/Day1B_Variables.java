package bootcamp;

public class Day1B_Variables {

    /**
     * You're making a proof of concept and have created the
     * following text menu which the user sees:
     * <p>
     * -----------------------------------------------
     * | You are in a dungeon, what do you want to do?
     * -----------------------------------------------
     * |  [T] Search for Treasure
     * |  [I] Look in your Inventory
     * |  [H] Search for Traps
     * |  [F] Enter door in Front
     * |  [R] Turn Right
     * |  [L] Turn Left
     * ------------------------------------------------
     * Since this is just a proof of concept you only
     * want to return a String when you select an option.
     * <p>
     * Based on the letter chosen, you should return
     * the following text:
     * <p>
     * 'T' or 't': return "You search for treasure!"
     * 'I' or 'i': return "You look in your inventory."
     * 'H' or 'h': return "You search for traps!"
     * 'F' or 'f': return "You enter door in front."
     * 'R' or 'r': return "You turn right."
     * 'L' or 'l': return "You turn left."
     *
     * @param choice Key pressed by user - returned as char.
     */
    public String selectOption(char choice) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Mesmerized by a bubble screen saver, you're inspired to
     * write your own!  Unlike the Windows version, you want
     * to make the bubbles be of different sizes.
     * <p>
     * Write the collision algorithm for two bubbles.
     * Return true if the bubbles overlap
     * Return false if they don't.
     *
     * @param x1 x-coordinate of center of Bubble 1
     * @param y1 y-coordinate of center of Bubble 1
     * @param r1 radius of Bubble 1
     * @param x2 x-coordinate of center of Bubble 2
     * @param y2 y-coordinate of center of Bubble 2
     * @param r2 radius of Bubble 2
     * @return true if overlap, false if they don't
     * <p>
     * Hint: You can use the Distance Formula to find
     * distance (d) between two points.
     * <p>
     * d² = (x2-x1)² + (y2-y1)²
     */
    public boolean isCollision(int x1, int y1, int r1, int x2, int y2, int r2) {
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * Now you're writing a method that generates the menu as a String
     * for display.  Since the dungeon has different room layouts,
     * you're creating a method with boolean inputs that turn on or
     * turn off different options of the menu.
     *
     * For instance, if left, front, and right
     * are all TRUE, then you return the following:
     * -----------------------------------------------
     * | You are in a dungeon, what do you want to do?
     * -----------------------------------------------
     * |  [T] Search for Treasure
     * |  [I] Look in your Inventory
     * |  [H] Search for Traps
     * |  [F] Enter door in Front
     * |  [R] Turn Right
     * |  [L] Turn Left
     * ------------------------------------------------
     *
     * If left, front, and right are all FALSE, then you return
     * the following:
     * -----------------------------------------------
     * | You are in a dungeon, what do you want to do?
     * -----------------------------------------------
     * |  [T] Search for Treasure
     * |  [I] Look in your Inventory
     * |  [H] Search for Traps
     * ------------------------------------------------
     *
     * Which option is true, make sure to include that line in
     * your String output
     *
     * @param left input that specifies if player can turn left
     * @param front input that specifies if door in front of player
     * @param right input that specifies if player can turn right
     * @return
     */
    public String createMenu(boolean left, boolean front, boolean right){
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }


    public final static double BUY_EXCHANGE_FEE = 5.99;
    public final static double SELL_EXCHANGE_FEE = 4.99;
    /**
     * You created a high-speed trading bot that searches for arbitrage
     * opportunities between Exchange A and Exchange B.  You own hundreds of
     * shares of stock TGIF at both Exchange A and at Exchange B.  You also
     * have substantial cash balances at both Exchanges.
     *
     * Because of market fluctuations, there are brief moments when it's profitable
     * to buy TGIF shares at Exchange A and instantaneously sell the same amount
     * of TGIF shares at Exchange B.
     *
     * The fee to purchase from Exchange A is $BUY_EXCHANGE_FEE
     * The fee to sell at Exchange B is $SELL_EXCHANGE_FEE
     *
     * Your method will return the number of shares to purchase from Exchange A
     *
     * Here are the requirements:
     * 1.) You must be able to sell an equal amount of shares at Exchange B
     * 2.) With fees, you should be able to purchase and sell for a profit.
     * 3.) Your total cost of purchase must be less than or equal to budget.
     * 4.) The purchase fee is ADDED to the cost of purchasing shares
     * 5.) The selling fee is SUBTRACTED from the gross sale of the shares
     * 6.) At a minimum, you must make $.10 in profit per trade.
     *
     * @param budget Max amount of money allocated to make a trade.
     * @param buyPrice The current asking price of TGIF at Exchange A
     * @param buyQty The number of shares available for purchase at Exchange A
     * @param sellPrice The current bidding price of TGIF at Exchange B
     * @param sellQty The number of shares someone is willing to buy at Exchange B
     * @return Return number of shares to purchase.
     *
     */
    public int getBuyAmount(float budget, float buyPrice, int buyQty, float sellPrice, int sellQty){
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }

    /**
     * You decide to make your own version of Hot N Cold for you nephew.
     * Implement a method that accepts the coordinates of Player 1 (x, y)
     * and the coordinates of a Treasure (tX, tY) and then provides
     * a String response.
     *
     * Let d be the distance between (x, y) and (tX, tY).
     *
     * if d <= 1.0 return "FIRE!!!"
     * if d <= 2.0 return "HOT!!!"
     * if d <= 5.0 return "WARMER!!"
     * if d <= 8.0 return "WARM!"
     * if d <= 11.0 return "COLD!"
     * if d <= 15 return "FREEZING!"
     *
     * @param x x-coordinate of Player 1
     * @param y y-coordiante of Player 1
     * @param tX x-coordinate of Treasure
     * @param tY y-coordinate of Treasure
     * @return Game Response based on distance
     */
    public String getProximityResponse(double x, double y, double tX, double tY){
        // Erase this line and write code here.
        throw new RuntimeException("Method Not Implemented");
    }
}
