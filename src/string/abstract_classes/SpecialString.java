package string.abstract_classes;

import string.interfaces.TextFunkifier;

public abstract class SpecialString implements TextFunkifier {
	protected String s;

	public SpecialString(String s) {
		this.s = funkifyText(s);
	}

	public String toString() {
		return s;
	}
}
