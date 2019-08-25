package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int numOfCustomers = scan.nextInt();
		
		for (int i = 0; i < numOfCustomers; i++) {
			String firstName = scan.next();
			String firstInitial = firstName.charAt(0) + ".";
			String lastName = scan.next();
			int totalCartItems = scan.nextInt();
			double totalPrice = 0.00;
			String priceDouble = String.format("%.2f", totalPrice);
			for (int j = 0; j < totalCartItems; j++) {
				double itemTotalPrice = 0.00;
				int numOfItems = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				for (int k = 0; k < numOfItems; k++) {
					itemTotalPrice += itemPrice;
				}
				totalPrice += itemTotalPrice;
			}
			System.out.println(firstInitial + " " + lastName  + ": " + priceDouble);
		}
		scan.close();
	}
}
