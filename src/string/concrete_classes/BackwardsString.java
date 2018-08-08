package string.concrete_classes;

import string.abstract_classes.SpecialString;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String text) {
		StringBuilder textsb = new StringBuilder(text.length());
		for (int i = text.length() - 1; i > -1; i--) {
			textsb.append(text.charAt(i));
		}
		return textsb.toString();
	}

}
