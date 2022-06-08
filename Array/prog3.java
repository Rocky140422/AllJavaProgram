package Array;

import java.util.Arrays;

public class prog3 {

	public static void main(String[] args) {
		String name[] = new String[5];
		name[0]="Harry";
		name[1]="Andy";
		name[2]="Ron";
		name[3]="John";
		name[4]="Bob";
		for(int i=0;i<=name.length-1;i++)//printing all names without using braces
			System.out.println(name[i]);//it will be applicable for single statement
		System.out.println("Printing");
		System.out.println("*******************");
		//Reverse Array
		for(int j=name.length-1;j>=0;j--)
			System.out.println(name[j]);
		System.out.println("*******************");
		//Sorting of array alphabetically(A-Z)
		Arrays.sort(name);
		for(int x=0;x<=name.length-1;x++)
			System.out.println(name[x]);
		System.out.println("*******************");
		//Sorting of array alphabetically(Z-A)
		for(int z=name.length-1;z>=0;z--)
			System.out.println(name[z]);
	}
}
