package org.program;
import java.util.Scanner;
public class Corejava {
	String girl;
	String boy;
	int length;
	String str2;
	int count,add;
	public Corejava(String girl, String boy) {
		this.girl = girl;
		this.boy = boy;
	}
	public Corejava(int length) {
		this.length = length;
	}
	public Corejava(String strl2) {
		this.str2=str2;
	}
	public Corejava(int count,int add) {
		this.add=add;
		this.count=count;
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
	public static String removeCharAt1(String str, int i) {
		return str.substring(0, i) + str.substring(i + 1);
	}
	public static String removeCharAt(String str, int i) {
		return str.substring(i + 1) + str.substring(0, i);
	}
	public void AddNamesValue(){
		String str = girl+"loves"+boy;
		for (int k = 0; k  < str.length(); k++) {
			char ch = str.charAt(k);
			count++;
		}
	    for (int j = 0; j < str.length(); j++) {
	        add += str.charAt(j) - 'a' + 1;
	    }
	    FindLovepercentage();
	}
	void FindLovepercentage() {
		int add2=0;
		 str2 = Integer.toString(add);
		for (int l = 0; l < str2.length()-1; l++) {
			int[] numbers = new int[str2.length()];
			for (int i = 0; i < str2.length(); i++) {
			    numbers[i] = str2.charAt(i) - '0';
			}
			int number=numbers[0]+numbers[2];
			int number1=numbers[1];
			String s1 = Integer.toString(number);
			String s2 = Integer.toString(number1);
			 String merge = s1.concat(s2);
			str2=merge;
			add2=Integer.valueOf(str2);
		    }
			int percentage= add2+count;
			System.out.println(percentage+"%");
			}
	public void FindLove() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Key:");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				CountComLetter();
			break;
			case 2:
				AddNamesValue();
				break;
			case 3:
				System.out.println("EXIT");
				System.exit(0);
			case 4:
				System.out.println("TRY AGAIN");
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
		Corejava sc = new Corejava(girl, boy);
		sc.FindLove();
	}
}