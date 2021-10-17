package org.program;
import java.util.Scanner;
public class Inheritance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the girl name:");
		String girl = s.next();
		System.out.println("Enter the boy name");
		String boy = s.next();
		int length = 0;
		for (int i = 0; i < girl.length(); i++) {
			for (int j = 0; j < boy.length(); j++) {
				if (girl.charAt(i) == boy.charAt(j)) {
					String strgirl = removeCharAt1(girl, i);
					System.out.println(strgirl);
					String strboy = removeCharAt1(boy, j);
					System.out.println(strboy);
					girl = strgirl;
					boy = strboy;
					i--;
					j--;
					break;
				}
			}
		}
		int lengthgirl = girl.length();
		int lengthboy = boy.length();
		length = lengthgirl + lengthboy;
		System.out.println(length);
		String str = "FLAMES";
		int lengthone = str.length();
		int lengthfinal = lengthone - 2;
		for (int i = 0; i <= lengthfinal; i++) {
			int firstlength = length % lengthone;
			if (firstlength == 0) {
				String str1 = removeCharAt(str, lengthone - 1);
				str = str1;
				int lengthsecond = str1.length();
				lengthone = lengthsecond;
			} else {
				String str1 = removeCharAt(str, firstlength - 1);
				str = str1;
				int lengthsecond = str1.length();
				lengthone = lengthsecond;
			}
		}
		System.out.println(str);
		switch (str) {
		case "F":
			System.out.println(girl + "is Friend to " + boy);
			break;
		case "L":
			System.out.println(girl + " is Love to " + boy);
			break;
		case "A":
			System.out.println(girl + " is Affection to " + boy);
			break;
		case "M":
			System.out.println(girl + " is Marriage to " + boy);
			break;
		case "E":
			System.out.println(girl + " is Enemies to " + boy);
			break;
		case "S":
			System.out.println(girl + " is Sister to " + boy);
			break;
		}
	}

	public static String removeCharAt(String str, int i) {
		return str.substring(i + 1) + str.substring(0, i);
	}

	public static String removeCharAt1(String str, int i) {
		return str.substring(0, i) + str.substring(i + 1);
	}
}
