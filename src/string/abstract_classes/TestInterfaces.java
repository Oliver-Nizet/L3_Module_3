package string.abstract_classes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import string.concrete_classes.BackwardsString;
import string.concrete_classes.MixedCapsString;

public class TestInterfaces {

	@Test
	public void testBackwardsString() {
		SpecialString bs = new BackwardsString("This is a test");
		System.out.println(bs);
		assertEquals("tset a si sihT", bs.toString());
	}

	@Test
	public void testMixedCapsString() {
		SpecialString mcs = new MixedCapsString("This is also a test");
		System.out.println(mcs);
		assertEquals("tHiS Is aLsO A TeSt", mcs.toString());
	}

}
