package org.program;

import java.util.Scanner;

public class Case{
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Key:");
			int key = sc.nextInt();
			switch (key) {
			case 1:
			break;
			case 2:
			System.out.println(percentage+"%");
				break;
			case 3:
				System.out.println("EXIT");
				System.exit(0);
			case 4:
				System.out.println("TRY AGAIN");
			break;
			}
	