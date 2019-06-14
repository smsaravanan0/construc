package org.cons;

public class Stringsp {

	public static void main(String[] args) {
		String as="SaraVaN@4095";
		int Ucount=0;
		int Lcount=0;
		int Dcount=0;
		int Spcount=0;
		for (int i = 0; i < as.length(); i++) {
			char dfg = as.charAt(i);
			if(Character.isUpperCase(dfg)) {
				Ucount++;
			}
			else if(Character.isDigit(dfg)) {
				Dcount++;
			}
			else if(Character.isLowerCase(dfg)) {
				Lcount++;
			}
			else {
				Spcount++;
			}
		}
		System.out.println("Uppercase"+Ucount);
		System.out.println("Lowercase"+Lcount);
		System.out.println("Special char"+Spcount);
		System.out.println("digit"+Dcount);
		
	

	}

}
