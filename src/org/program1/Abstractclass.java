package org.program1;
import java.util.Scanner;
public abstract class Abstractclass {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the symbols:");
			String key = sc.next();
			int a =6,b=5;
			switch (key) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "%":
				System.out.println(a % b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
			case "^":
				System.out.println(a ^ b);
				break;
			case ">>":
				System.out.println(a >> b);
				break;
			case "<<":
				System.out.println(a << b);
				break;
			case "#":
				System.out.println("EXIT");
				System.exit(0);
			case "$":
				System.out.println("TRY AGAIN");
				break;
			}
		}
	}
}