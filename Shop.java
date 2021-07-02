import java.util.Scanner;
import java.lang.Math;

/**
 * Program Description
 * @autor Kutlahmetov Iskander
 * */

class Main {
	public static void main(String[] args) {
        final String[] products = {"juice", "water", "cookie"};
        final int[] prices = {50, 15, 25};
        short[] amounts = {0, 0, 0};

        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("Products:");
        	for(byte i = 0; i < products.length; i++)
        		System.out.println("" + (i + 1) + ")" + products[i] + "; Price: " + prices[i] + "$");
        	System.out.print("Enter the product number or 0 to calculate the total: ");
        	int n = sc.nextInt();
        	if(n > 0)
        	{
        		System.out.print("Enter the quantity of goods: ");
        		amounts[n - 1] += Math.abs(sc.nextInt());
        	}
        	else if(n == 0) {
        		int sum = 0;
        		for(byte i = 0; i < products.length; i++) {
        			sum += prices[i] * amounts[i];
        			System.out.println("" + (i + 1) + ")" + products[i] + " x " + amounts[i] + " = " + prices[i] + "$ x " + amounts[i] + " = " +
        				prices[i] * amounts[i] + "$");
        		}
        		System.out.println("TOTAL: " + sum + "$");
        		System.out.print("Try again (y/n)? ");
        		String s;
        		while(true) {
        			s = sc.next().toLowerCase();
        			if(s.equals("yes") || s.equals("y"))
        			{
        				for(byte i = 0; i < amounts.length; i++)
        					amounts[i] = 0;
        				break;
        			}
        			if(s.equals("no") || s.equals("n"))
        			{
        				System.out.println("Ok. Bye.");
        				System.exit(0);
        			}
        			else
        				System.out.println("Inccorect answer. Try again");
        		}

        	}
        	else
	        	System.out.println("Bad number. Try again");
        }
	}
}
