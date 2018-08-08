package string.concrete_classes;

import string.abstract_classes.SpecialString;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String text) {
		StringBuilder textsb = new StringBuilder(text.length());
		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0) {
				textsb.append(Character.toLowerCase(text.charAt(i)));
			} else {
				textsb.append(Character.toUpperCase(text.charAt(i)));
			}
		}
		return textsb.toString();
	}

}
