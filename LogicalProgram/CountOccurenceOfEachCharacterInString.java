package LogicalProgram;

import java.util.HashMap;

public class CountOccurenceOfEachCharacterInString {

	public static void main(String[] args) {
		String s = "Vishwas mahajan";
		char ar[]=s.toCharArray();
		int count =0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ar.length;i++){
			count=0;
			for(int j=0;j<ar.length;j++){
				if(ar[i]==ar[j]){
					count++;
				}
			}
			map.put(ar[i], count);
		}
		System.out.println(map);

	}

}
