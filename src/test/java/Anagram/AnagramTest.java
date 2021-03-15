package Anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void getReversedTextShouldReturnLowerCaseLettersWhenInputIsLowerCaseLetters() {
        Anagram anagram = new Anagram();
        assertEquals("cba", anagram.getReversedText("abc"));
    }

    @Test
    void getReversedTextShouldReturnReversedWordsWhenInputIsSeveralWords() {
        Anagram anagram = new Anagram();
        assertEquals("dDs$$a31 cbA !ksf!", anagram.getReversedText("asD$$d31 Abc !fsk!"));
    }

    @Test
    void getReversedTextShouldReturnReversedWordWhenInputIsLettersSymbols() {
        Anagram anagram = new Anagram();
        assertEquals("AAa$$s31Dd", anagram.getReversedText("dDs$$a31AA"));
    }

    @Test
    void getReversedTextShouldReturnSpacesWhenInputIsSpaces() {
        Anagram anagram = new Anagram();
        assertEquals("     ", anagram.getReversedText("     "));
    }

    @Test
    void getReversedTextShouldReturnSpaceWhenInputIsSpace() {
        Anagram anagram = new Anagram();
        assertEquals(" ", anagram.getReversedText(" "));
    }

    @Test
    void getReversedTextShouldReturnLetterWhenInputIsLetter() {
        Anagram anagram = new Anagram();
        assertEquals("a", anagram.getReversedText("a"));
    }

    @Test
    void getReversedTextShouldReturnSameLettersWhenInputIsSameLetters() {
        Anagram anagram = new Anagram();
        assertEquals("aaaaaa", anagram.getReversedText("aaaaaa"));
    }

    @Test
    void getReversedTextShouldReturnDifferentCaseLettersWhenInputIsDifferentCaseLetters() {
        Anagram anagram = new Anagram();
        assertEquals("aaAaaaAa", anagram.getReversedText("aAaaaAaa"));
    }

    @Test
    void getReversedTextShouldReturnSymbolsWhenInputIsSymbols() {
        Anagram anagram = new Anagram();
        assertEquals("1$%^&!", anagram.getReversedText("1$%^&!"));
    }

    @Test
    void getReversedTextShouldReturnExceptionWhenInputIsNull() {
        Anagram anagram = new Anagram();
        assertThrows(IllegalArgumentException.class, () -> anagram.getReversedText(null));
    }

    @Test
    void getReversedTextShouldReturnExceptionWhenInputIsEmpty() {
        Anagram anagram = new Anagram();
        assertThrows(IllegalArgumentException.class, () -> anagram.getReversedText(""));
    }

}
