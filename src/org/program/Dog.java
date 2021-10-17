package org.program;
import java.util.Scanner;
public class Dog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the girl name:");
		String girl = sc.next();
		System.out.println("Enter the boy name");
		String boy = sc.next();
		String girl1 = new String(girl);
		String boy1 = new String(boy);
		int length = 0;
		for (int i = 0; i < girl.length(); i++) {
		for (int j = 0; j < boy.length(); j++) {
		if (girl.charAt(i) == boy.charAt(j)) {
		String strgirl = removeCharAt1(girl, i);
		String strboy = removeCharAt1(boy, j);
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
		switch (str) {
		case "F":
		System.out.println(girl1 + "is Friend to " + boy1);
		break;
		case "L":
		System.out.println(girl1 + " is Love to " + boy1);
		break;
		case "A":
		System.out.println(girl1 + " is Affection to " + boy1);
		break;
		case "M":
		System.out.println(girl1 + " is Marriage to " + boy1);
		break;
		case "E":
		System.out.println(girl1 + " is Enemies to " + boy1);
		break;
		case "S":
		System.out.println(girl1 + " is Sister to " + boy1);
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
	
