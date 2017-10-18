package ru.sur_pavel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    @org.junit.Test
    public void testReverseMethod() throws Exception {

        Main main = new Main();
        String input = "a1bcd efg!h";
        String expected = "d1cba hgf!e";
        assertThat(main.reverseString(input), is(expected));
    }

}