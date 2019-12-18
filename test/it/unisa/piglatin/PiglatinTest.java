package it.unisa.piglatin;

import static org.junit.Assert.*;


import org.junit.Test;

public class PiglatinTest {

	@Test
	public void testPhrase() throws Exception {
		Piglatin piglatin = new Piglatin("a yellow bird");
		String phrase = piglatin.getPhrase();
		assertEquals("a yellow bird" , phrase);
	}

	@Test
	public void testWare() throws Exception {
		Piglatin piglatin = new Piglatin("yellow");
		String phrase = piglatin.getPhrase();
		assertEquals("yellow" , phrase);
	}

	@Test(expected=InvalidPhraseException.class)
	public void testPhraseWithDoubleSpaces() throws Exception {
		Piglatin piglatin = new Piglatin("a  yellow bird");

	}

	@Test(expected=InvalidPhraseException.class)
	public void testPhraseWithSpaceAtBeginning() throws Exception {
		Piglatin piglatin = new Piglatin(" a yellow bird");

	}

	@Test(expected=InvalidPhraseException.class)
	public void testPhraseWithSpaceAtTheEnd() throws Exception {
		Piglatin piglatin = new Piglatin("a yellow bird ");

	}

	@Test(expected=InvalidPhraseException.class)
	public void testPhraseWithInvalidCharacted() throws Exception {
		Piglatin piglatin = new Piglatin("a, yellow bird");

	}

	@Test
	public void testTranslateWordStartingWithA() throws Exception {
		Piglatin piglatin = new Piglatin("apple");
		String translation = piglatin.translate();
		assertEquals("appleay" , translation);	

	}

	@Test
	public void testTranslateWordStartingWithU() throws Exception {
		Piglatin piglatin = new Piglatin("umbrella");
		String translation = piglatin.translate();
		assertEquals("umbrellaay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithI() throws Exception {
		Piglatin piglatin = new Piglatin("ivy");
		String translation = piglatin.translate();
		assertEquals("ivyay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithE() throws Exception {
		Piglatin piglatin = new Piglatin("envy");
		String translation = piglatin.translate();
		assertEquals("envyay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithO() throws Exception {
		Piglatin piglatin = new Piglatin("only");
		String translation = piglatin.translate();
		assertEquals("onlyay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithB() throws Exception {
		Piglatin piglatin = new Piglatin("bird");
		String translation = piglatin.translate();
		assertEquals("irdbay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithC() throws Exception {
		Piglatin piglatin = new Piglatin("car");
		String translation = piglatin.translate();
		assertEquals("arcay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithG() throws Exception {
		Piglatin piglatin = new Piglatin("goopy");
		String translation = piglatin.translate();
		assertEquals("oopygay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithZ() throws Exception {
		Piglatin piglatin = new Piglatin("zorro");
		String translation = piglatin.translate();
		assertEquals("orrozay" , translation);

	}

	@Test
	public void testTranslateWordStartingWithY() throws Exception {
		Piglatin piglatin = new Piglatin("yellow");
		String translation = piglatin.translate();
		assertEquals("ellowyay" , translation);

	}

	@Test
	public void testTranslatePhrase() throws Exception {
		Piglatin piglatin = new Piglatin("a yellow bird");
		String translation = piglatin.translate();
		assertEquals("aay ellowyay irdbay" , translation);

	}

	@Test
	public void testTranslteWordStartingWithCH() throws Exception {
		Piglatin piglatin = new Piglatin("chair");
		String translation = piglatin.translate();
		assertEquals("airchay" , translation);

	}

	@Test 
	public void testTranslteWordStartingWithTH() throws Exception {
		Piglatin piglatin = new Piglatin("thanks");
		String translation = piglatin.translate();
		assertEquals("anksthay" , translation);

	}

	@Test 
	public void testTranslteWordStartingWithTHR() throws Exception {
		Piglatin piglatin = new Piglatin("three");
		String translation = piglatin.translate();
		assertEquals("eethray" , translation);

	}

	@Test 
	public void testTranslteWordStartingWithSCH() throws Exception {
		Piglatin piglatin = new Piglatin("school");
		String translation = piglatin.translate();
		assertEquals("oolschay" , translation);

	}

	@Test 
	public void testTranslteWordStartingWithXR() throws Exception {
		Piglatin piglatin = new Piglatin("xray");
		String translation = piglatin.translate();
		assertEquals("xrayay" , translation);

	}

	@Test
	public void testUppercaseOutputStartingWithVawel() throws Exception{
		Piglatin piglatin = new Piglatin("APPLE");
		String translation = piglatin.translate();
		assertEquals("APPLEAY" , translation);

	}

	@Test
	public void testUppercaseOutputStartingWithConsonant() throws Exception{
		Piglatin piglatin = new Piglatin("BIRD");
		String translation = piglatin.translate();
		assertEquals("IRDBAY" , translation);

	}

	@Test
	public void testTranslateUppercaseWordStartingWithTHR() throws Exception {
		Piglatin piglatin = new Piglatin("THREE");
		String translation = piglatin.translate();
		assertEquals("EETHRAY" , translation);

	}

	@Test
	public void testTranslateUppercasePhrase() throws Exception {
		Piglatin piglatin = new Piglatin("A YELLOW BIRD");
		String translation = piglatin.translate();
		assertEquals("AAY ELLOWYAY IRDBAY" , translation);

	}

	@Test
	public void testFirstLetterShouldBeUppercaseConsonantCase() throws Exception{
		Piglatin piglatin = new Piglatin("Bird");
		String translation = piglatin.translate();
		assertEquals("Irdbay" , translation);

	}

	@Test
	public void testFirstLetterShouldBeUppercaseVawelCase() throws Exception{
		Piglatin piglatin = new Piglatin("Apple");
		String translation = piglatin.translate();
		assertEquals("Appleay" , translation);

	}

	@Test
	public void testFirstLetterShouldBeUppercaseClusterCase() throws Exception{
		Piglatin piglatin = new Piglatin("Thread");
		String translation = piglatin.translate();
		assertEquals("Eadthray" , translation);

	}

	@Test(expected=InvalidPhraseException.class)
	public void testWordWithUppercaseCharactedAtTheMiddle() throws Exception {
		Piglatin piglatin = new Piglatin("biRd");
		String translation = piglatin.translate();

	}

	@Test(expected=InvalidPhraseException.class)
	public void testWordWithUppercaseCharacterAtTheEnd() throws Exception {
		Piglatin piglatin = new Piglatin("BirD");
		String translation = piglatin.translate();

	}

}
