package Anagram;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void mainShouldReturnReversedTextWhenInputIsText() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(new ByteArrayInputStream("Test string".getBytes()));
		System.setOut(new PrintStream(outContent));
		Main.main(null);
		assertEquals("Input text to be reversed: Reversed text: tseT gnirts", outContent.toString());
	}

}
