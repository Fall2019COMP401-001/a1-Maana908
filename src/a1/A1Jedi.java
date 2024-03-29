package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numOfItems = scan.nextInt();
		String[] shopItems = new String[numOfItems];
		double[] prices = new double[numOfItems];
		
		for (int i = 0; i < numOfItems; i++) {
			shopItems[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int numOfCust = scan.nextInt();
		String[] custName = new String[numOfCust];
		int numOfItem = 0;
		String nameOfItem = "";
		int[] numOfBought = new int[numOfItems];
		int[] numOfBuyers = new int[numOfItems];
		
		for (int i = 0; i < numOfCust; i++) {
			custName[i] = scan.next() + " " + scan.next();
			int totalBought = scan.nextInt();
			int alreadyCounted[] = new int[numOfItems];
			for (int k = 0; k < totalBought; k++) {
				int numinCart = scan.nextInt();
				nameOfItem = scan.next();
				for (int s = 0; s < shopItems.length; s++) {
					if (nameOfItem.equals(shopItems[s])) {
						numOfBought[s] += numinCart;
						alreadyCounted[s] += 1;
						if (alreadyCounted[s] == 1) {
							numOfBuyers[s] += 1;
						}
					}
				}
			}
			
		}
		scan.close();
		for (int m = 0; m < numOfItems; m++) {
			if (numOfBought[m] == 0) {
				System.out.println("No customers bought " + shopItems[m]);
			} else {
				System.out.println (numOfBuyers[m] + " customers bought " + numOfBought[m] + " " + shopItems[m]);
			}
		}
		
	}
}
