package LogicalProgram;

public class reverseSentence {
	public static void main(String[]args){
		String sentence = "Engineer Automation an am I";
		String[] split=sentence.split(" ");
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
		System.out.println();
		System.out.println("**********************");
		String sentence1 = "reenignE noitamotuA na ma I";
		char ch;
		String sentenceRev = "";
		for(int j=sentence1.length()-1;j>=0;j--)
		{
			ch=sentence1.charAt(j);
			sentenceRev=sentenceRev+ch;
		}
		System.out.println(sentenceRev);
	}
}
