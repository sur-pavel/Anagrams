package ru.sur_pavel;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    private Anagram anagram = new Anagram();

    @Test
    public void testReverseMethod()  {
        String input = "a1bcd efg!h";
        String expected = "d1cba hgf!e";
        assertThat(anagram.reverseString(input), is(expected));
    }

    @Test
    public void testEscapedChars() {
        String input = "a1^bcd efg!h";
        String expected = "d1^cba hgf!e";
        assertThat(anagram.reverseString(input), is(expected));
    }
}