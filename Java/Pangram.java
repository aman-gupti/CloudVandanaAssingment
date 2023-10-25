package test;
import java.util.Scanner;
public class Pangram {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

		        boolean[] alphabet = new boolean[26];
		        int count = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (c >= 'a' && c <= 'z') {
		                int index = c - 'a';
		                if (!alphabet[index]) {
		                    alphabet[index] = true;
		                    count++;
		                }
		            }
		            if (count == 26) {
		                break; 
		            }
		        }
		        if (count == 26) {
		            System.out.println("Pangram.");
		        } else {
		            System.out.println("Not a Pangram.");
		        }
		    }
}
