import leetcode.easy.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EasyProblemsTest {

    @Test
    public void stock1() {
        int[] prices = {2,1,2,1,0,1,2};
        int expected = 2;
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();


        assertEquals(expected, stock.maxProfitOn(prices));
    }

    @Test
    public void stock2() {
        int[] prices = {3,2,6,5,0,3};
        int expected = 4;
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();


        assertEquals(expected, stock.maxProfitOn(prices));
    }

    @Test
    public void GuessNumber() {
        GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(1702766719);

        int expected = 1702766719;

        assertEquals(expected, guess.guessNumber(2126753390));
    }
}