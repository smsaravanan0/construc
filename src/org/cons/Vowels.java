package org.cons;

public class Vowels {

	public static void main(String[] args) {
		String name = "bhuvanesh";
		String vowels = "";
		String consonant = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				vowels = vowels +ch;
			} else {
				consonant=consonant+ch;
			}

		}
		System.out.println(vowels);
		System.out.println(consonant);

	}
	}

