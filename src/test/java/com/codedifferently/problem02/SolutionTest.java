package com.codedifferently.problem02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void howManyLettersDoYouSeeTest01(){
        Solution solution = new Solution();
        String word = "aabbbcc";
        String expected = "a:2 b:3 c:2";
        String actual = solution.howManyLettersDoYouSee(word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void howManyLettersDoYouSeeTest02(){
        Solution solution = new Solution();
        String words = "abcdefaabbccdd";
        String expected = "a:3 b:3 c:3 d:1 e:1 f:1";
        String actual = solution.howManyLettersDoYouSee(words);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void howManyLettersDoYouSeeTest03(){
        Solution solution = new Solution();
        String words = "xyzzyxxxzzp";
        String expected = "p:1 x:4 y:2 z:4";
        String actual = solution.howManyLettersDoYouSee(words);
        Assertions.assertEquals(expected, actual);
    }
}
