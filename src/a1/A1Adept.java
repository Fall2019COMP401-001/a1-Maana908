package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
 
		// Your code follows here.
		int numOfItems = scan.nextInt();

		String[] shopItems = new String[numOfItems];
		double[] prices = new double[numOfItems];
		
		
		for (int i = 0; i < numOfItems; i++) {
			shopItems[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int numOfCust = scan.nextInt();
		double[] totals = new double[numOfCust];
		String[] custName = new String[numOfCust];
		
		for (int i = 0; i < numOfCust; i++) {
			custName[i] = scan.next() + " " + scan.next();
			int bought = scan.nextInt();
			double custTotal = 0.00;
			for (int k = 0; k < bought; k++) {
				custTotal += scan.nextInt() * findPrice(scan.next(), shopItems, prices);
			}
			totals[i] = custTotal;
		}
		scan.close();
		
		double biggestBuy = biggest(totals);
		double smallestBuy = smallest(totals);
		double averagePrice = average(totals);
		String bigPerson = findBigName(custName, totals);
		String smallPerson = findSmallName(custName, totals);
		
		String bigDouble = String.format("%.2f", biggestBuy);
		String smallDouble = String.format("%.2f", smallestBuy);
		String avgDouble = String.format("%.2f", averagePrice);
		
		
		System.out.println("Biggest: " + bigPerson + " (" + bigDouble + ")");
		System.out.println("Smallest: " + smallPerson + " (" + smallDouble + ")");
		System.out.println("Average: " + avgDouble);

	}
	
	public static double findPrice (String item, String[] itemNames, double[] itemPrices) {
		for (int i = 0; i < itemNames.length; i++) {
			if (itemNames[i].equals(item)) {
				return itemPrices[i];
			}
		}
		return 0.0;
	}
	
	public static double biggest (double[] totals) {
		double biggest = 0.0;
		for (int i = 0; i < totals.length; i++) {
			if (biggest < totals[i]) {
				biggest = totals[i];
			}
		}
		return biggest;
	}
	
	public static double smallest (double[] totals) {
		double smallest = 0.0;
		for (int i = 0; i < totals.length; i++) {
			if (smallest > totals[i]) {
				smallest = totals[i];
			}
		}
		return smallest;
	}
	
	public static double average (double[] totals) {
		double sum = 0.0;
		for (int i = 0; i < totals.length; i++) {
			sum += totals[i];
		}
		return sum / (totals.length);
	}
	
	public static String findBigName (String[] names, double[] totals) {
		double biggest = 0.0;
		int bigIndex = 0;
		for (int i = 0; i < totals.length; i++) {
			if (biggest < totals[i]) {
				biggest = totals[i];
				bigIndex = i;
			}
		}
		return names[bigIndex];
	}
	
	public static String findSmallName (String[] names, double[] totals) {
		double smallest = 0.0;
		int smallIndex = 0;
		for (int i = 0; i < totals.length; i++) {
			if (smallest > totals[i]) {
				smallest = totals[i];
				smallIndex = i;
			}
		}
		return names[smallIndex];
	}
	
}
