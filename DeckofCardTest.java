package deckcardtest;
/******
 * 
 * @author ANAND
 * purpose: prints the cards in order
 * 
 */
public class DeckofCardTest {

	public static void main(String[] args) {
		DeckofCards myDeckofCards = new DeckofCards();
		myDeckofCards.shuffle(); //placing the cards in Random order

		//print 52 cards in the order which the deal
		for (int i = 0; i < 9; i++)
		{
			System.out.printf("%-20s%-20s%-20s%-20s\n",
					myDeckofCards.dealCard(), myDeckofCards.dealCard(),
					myDeckofCards.dealCard(), myDeckofCards.dealCard());

		}
	}
}
