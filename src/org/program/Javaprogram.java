package org.program;
public class Javaprogram{
	String str = "FLAMES";
	int length=11;
	int lengthone = str.length();
	int lengthfinal = lengthone - 2;
	for (int i = 0; i <= lengthfinal; i++) {
		int firstlength = length % lengthone;
		if (firstlength == 0) {
			String str1 = removeCharAt1(str, lengthone - 1);
			str = str1;
			int lengthsecond = str1.length();
			lengthone = lengthsecond;
		} else {
			String str1 = removeCharAt1(str, firstlength - 1);
			str = str1;
			int lengthsecond = str1.length();
			lengthone = lengthsecond;
		}
	}
	System.out.println(str);
	switch (str) {
	case "F":
		System.out.println("is Friend to ");
		break;
	case "L":
		System.out.println(" is Love to ");
		break;
	case "A":
		System.out.println(" is Affection to ");
		break;
	case "M":
		System.out.println(" is Marriage to ");
		break;
	case "E":
		System.out.println(" is Enemies to ");
		break;
	case "S":
		System.out.println(" is Sister to ");
		break;
	}
}
public static String removeCharAt1(String str, int i) {
	return str.substring(i + 1) + str.substring(0, i);
}
}
