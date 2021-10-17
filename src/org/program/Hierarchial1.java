package org.program;
import java.util.Scanner;
public class Hierarchial1 {
			String girl;
			String boy;
			String str2;
			int count,add;
			public Hierarchial1(String girl, String boy) {
				this.girl = girl;
				this.boy = boy;
			}
			public Hierarchial1(String strl2) {
				this.str2=str2;
			}
			public Hierarchial1(int count,int add) {
				this.add=add;
				this.count=count;
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
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the girl name:");
				String girl = s.next();
				System.out.println("Enter the boy name:");
				String boy = s.next();
				Hierarchial1 sc = new Hierarchial1(girl, boy);
				sc.AddNamesValue();
			}

		}
