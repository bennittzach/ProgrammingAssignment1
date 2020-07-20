import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		
		//Prints my info
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Zachary Bennitt");
		System.out.println("Programming Assignment 1");
		System.out.println(" ");
		
		//Create random key variables for user inputs
		Random rand = new Random();
		int key = 10;
		int random_key = rand.nextInt(key);
		
		//Integer to store user inputs
		int [] user_data = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		System.out.print("1st number: ");
		user_data[0] = scan.nextInt();
		if (user_data[0] < 0 || user_data[0] > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("2nd number: ");
		user_data[1] = scan.nextInt();
		if (user_data[1] < 0 || user_data[1] > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("3rd number: ");
		user_data[2] = scan.nextInt();
		if (user_data[2] < 0 || user_data[2] > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("4th number: ");
		user_data[3] = scan.nextInt();
		if (user_data[3] < 0 || user_data[3] > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.print("5th number: ");
		user_data[4] = scan.nextInt();
		if (user_data[4] < 0 || user_data[4] > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println(" ");
		
		//Final check to see if user input incorrect numbers
		int sum = sum = 0;
		for (int x = 0; x < 5; x++) {
			if (user_data[x] < 0 || user_data[x] > 19) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
			sum = sum + user_data[x];
		}
		
		System.out.println("Total = " + sum);
		System.out.println("Your random key is " + random_key);
		
		//Caesar Code
		if (sum < 10) {
			int y = (sum + random_key) % 10;
			y = key * 10 + y;
			System.out.println("Encoded number: " + y);
		} else {
			int y = sum / 10;
			int z = sum % 10;
			y = (random_key + y) % 10;
			z = (random_key + z) % 10;
			y = y * 10 + z;
			System.out.println("Encoded number: " + y);
		}
		
	}

}
