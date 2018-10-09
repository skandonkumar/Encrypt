import java.util.Scanner;

public class E_encrypt {
	public static void main(String args[]) {
		
		Scanner input  = new Scanner(System.in);
		while(input.hasNextLine()) {
			String inputstring = input.nextLine();
			String outputString = encrypt(inputstring);
			System.out.println(outputString);
			
		}		
	}
	
	public static String encrypt(String inputArray) {
		String vowelslower = "aeiouy";
		String consonantslower = "bcdfghjklmnpqrstvwxz";
		String vowelsupper = "AEIOUY";
		String consonantsupper = "BCDFGHJKLMNPQRSTVWXZ";
		String output = "";
		
		for(int i=0;i<inputArray.length();i++) {
			char charinput = inputArray.charAt(i);
			int vowellowerindex = vowelslower.indexOf(charinput);
			int consonantlowerindex = consonantslower.indexOf(charinput);
			int vowelsupperindex = vowelsupper.indexOf(charinput);
			int consonantsupperindex = consonantsupper.indexOf(charinput);
			
			
			if(vowellowerindex != -1) {
				vowellowerindex ++;
				
				 if(vowellowerindex == vowelslower.length()) {
					 vowellowerindex=0;
				 }
				 output += vowelslower.charAt(vowellowerindex);
			}
			else if(consonantlowerindex != -1) {
				consonantlowerindex ++;
				
				 if(consonantlowerindex == consonantslower.length()) {
					 consonantlowerindex=0;
				 }
				 output += consonantslower.charAt(consonantlowerindex);
			}
			else if(vowelsupperindex != -1){
				vowelsupperindex ++;
				
				if(vowelsupperindex == vowelsupper.length()) {
					vowelsupperindex=0;
				}
				output += vowelsupper.charAt(vowelsupperindex);
			}
			else if(consonantsupperindex != -1) {
				consonantsupperindex ++;
				
				if(consonantsupperindex == consonantsupper.length()) {
					consonantsupperindex=0;
				}
				output += consonantsupper.charAt(consonantsupperindex);
			}
			else {
				output += charinput;
			}
			
		}
		return output;
	}	
}	