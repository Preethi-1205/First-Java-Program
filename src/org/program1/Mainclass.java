package org.program1;
import java.util.Scanner;
public class Mainclass {
		String girl;
		String boy;
		int length;
		public Mainclass(String girl, String boy) {
			this.girl = girl;
			this.boy = boy;
		}
		public Mainclass(int length) {
			this.length = length;
		}
		public void CountComLetter() {
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
			FindLength();
			Flamesmethod();
		}
		void FindLength() {
			int lengthgirl = girl.length();
			int lengthboy = boy.length();
			length = lengthgirl + lengthboy;
		}
	     void Flamesmethod() {
			String strf = "FLAMES";
			int lengthone = strf.length();
			int lengthfinal = lengthone - 2;
			for (int i = 0; i <= lengthfinal; i++) {
				int firstlength = length % lengthone;
				if (firstlength == 0) {
					String str1 = removeCharAt(strf, lengthone - 1);
					strf = str1;
					int lengthsecond = str1.length();
					lengthone = lengthsecond;
				} else {
					String str1 = removeCharAt(strf, firstlength - 1);
					strf = str1;
					int lengthsecond = str1.length();
					lengthone = lengthsecond;
				}
			switch (strf) {
			case "F":
				System.out.println("Friend");
				break;
			case "L":
				System.out.println("Love");
				break;
			case "A":
				System.out.println("Affection");
				break;
			case "M":
				System.out.println("Marriage");
				break;
			case "E":
				System.out.println("Enemies");
				break;
			case "S":
				System.out.println("Sister");
				break;
			}
			}
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the girl name:");
			String girl = s.next();
			System.out.println("Enter the boy name:");
			String boy = s.next();
			Mainclass sc = new Mainclass(girl, boy);
			sc.CountComLetter();
		}
		public static String removeCharAt1(String str, int i) {
			return str.substring(0, i) + str.substring(i + 1);
		}
		public static String removeCharAt(String str, int i) {
			return str.substring(i + 1) + str.substring(0, i);
		}
	}